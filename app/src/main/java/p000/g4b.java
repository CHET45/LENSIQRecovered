package p000;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@tw7
public final class g4b extends AbstractC11839r1 implements Serializable {

    /* JADX INFO: renamed from: C */
    public static final int f38707C = 461845907;

    /* JADX INFO: renamed from: c */
    public static final lh7 f38708c = new g4b(0, false);

    /* JADX INFO: renamed from: d */
    public static final lh7 f38709d = new g4b(0, true);

    /* JADX INFO: renamed from: e */
    public static final lh7 f38710e = new g4b(xh7.f97830a, true);

    /* JADX INFO: renamed from: f */
    public static final int f38711f = 4;

    /* JADX INFO: renamed from: m */
    public static final int f38712m = -862048943;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final int f38713a;

    /* JADX INFO: renamed from: b */
    public final boolean f38714b;

    /* JADX INFO: renamed from: g4b$a */
    public static final class C6123a extends AbstractC12390s1 {

        /* JADX INFO: renamed from: a */
        public int f38715a;

        /* JADX INFO: renamed from: b */
        public long f38716b;

        /* JADX INFO: renamed from: c */
        public int f38717c;

        /* JADX INFO: renamed from: d */
        public int f38718d = 0;

        /* JADX INFO: renamed from: e */
        public boolean f38719e = false;

        public C6123a(int seed) {
            this.f38715a = seed;
        }

        private void update(int nBytes, long update) {
            long j = this.f38716b;
            int i = this.f38717c;
            long j2 = ((update & 4294967295L) << i) | j;
            this.f38716b = j2;
            int i2 = i + (nBytes * 8);
            this.f38717c = i2;
            this.f38718d += nBytes;
            if (i2 >= 32) {
                this.f38715a = g4b.mixH1(this.f38715a, g4b.mixK1((int) j2));
                this.f38716b >>>= 32;
                this.f38717c -= 32;
            }
        }

        @Override // p000.wh7
        public jh7 hash() {
            v7d.checkState(!this.f38719e);
            this.f38719e = true;
            int iMixK1 = this.f38715a ^ g4b.mixK1((int) this.f38716b);
            this.f38715a = iMixK1;
            return g4b.fmix(iMixK1, this.f38718d);
        }

        @Override // p000.wh7, p000.obd
        @op1
        public wh7 putByte(byte b) {
            update(1, b & 255);
            return this;
        }

        @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
        @op1
        public wh7 putChar(char c) {
            update(2, c);
            return this;
        }

        @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
        @op1
        public wh7 putInt(int i) {
            update(4, i);
            return this;
        }

        @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
        @op1
        public wh7 putLong(long l) {
            update(4, (int) l);
            update(4, l >>> 32);
            return this;
        }

        @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
        @op1
        public wh7 putString(CharSequence input, Charset charset) {
            if (!yw1.f103176c.equals(charset)) {
                return super.putString(input, charset);
            }
            int length = input.length();
            int i = 0;
            while (true) {
                int i2 = i + 4;
                if (i2 > length) {
                    break;
                }
                char cCharAt = input.charAt(i);
                char cCharAt2 = input.charAt(i + 1);
                char cCharAt3 = input.charAt(i + 2);
                char cCharAt4 = input.charAt(i + 3);
                if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                    break;
                }
                update(4, (cCharAt2 << '\b') | cCharAt | (cCharAt3 << j15.f49329c) | (cCharAt4 << 24));
                i = i2;
            }
            while (i < length) {
                char cCharAt5 = input.charAt(i);
                if (cCharAt5 < 128) {
                    update(1, cCharAt5);
                } else if (cCharAt5 < 2048) {
                    update(2, g4b.charToTwoUtf8Bytes(cCharAt5));
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    update(3, g4b.charToThreeUtf8Bytes(cCharAt5));
                } else {
                    int iCodePointAt = Character.codePointAt(input, i);
                    if (iCodePointAt == cCharAt5) {
                        putBytes(input.subSequence(i, length).toString().getBytes(charset));
                        return this;
                    }
                    i++;
                    update(4, g4b.codePointToFourUtf8Bytes(iCodePointAt));
                }
                i++;
            }
            return this;
        }

        @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
        @op1
        public wh7 putBytes(byte[] bytes, int off, int len) {
            v7d.checkPositionIndexes(off, off + len, bytes.length);
            int i = 0;
            while (true) {
                int i2 = i + 4;
                if (i2 > len) {
                    break;
                }
                update(4, g4b.getIntLittleEndian(bytes, i + off));
                i = i2;
            }
            while (i < len) {
                putByte(bytes[off + i]);
                i++;
            }
            return this;
        }

        @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
        @op1
        public wh7 putBytes(ByteBuffer buffer) {
            ByteOrder byteOrderOrder = buffer.order();
            buffer.order(ByteOrder.LITTLE_ENDIAN);
            while (buffer.remaining() >= 4) {
                putInt(buffer.getInt());
            }
            while (buffer.hasRemaining()) {
                putByte(buffer.get());
            }
            buffer.order(byteOrderOrder);
            return this;
        }
    }

    public g4b(int seed, boolean supplementaryPlaneFix) {
        this.f38713a = seed;
        this.f38714b = supplementaryPlaneFix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToThreeUtf8Bytes(char c) {
        return ((long) (c >>> '\f')) | 224 | ((long) ((((c >>> 6) & 63) | 128) << 8)) | ((long) (((c & '?') | 128) << 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToTwoUtf8Bytes(char c) {
        return ((long) (c >>> 6)) | 192 | ((long) (((c & '?') | 128) << 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long codePointToFourUtf8Bytes(int codePoint) {
        return ((long) (codePoint >>> 18)) | 240 | ((((long) ((codePoint >>> 12) & 63)) | 128) << 8) | ((((long) ((codePoint >>> 6) & 63)) | 128) << 16) | ((((long) (codePoint & 63)) | 128) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static jh7 fmix(int h1, int length) {
        int i = h1 ^ length;
        int i2 = (i ^ (i >>> 16)) * (-2048144789);
        int i3 = (i2 ^ (i2 >>> 13)) * (-1028477387);
        return jh7.fromInt(i3 ^ (i3 >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getIntLittleEndian(byte[] input, int offset) {
        return rd8.fromBytes(input[offset + 3], input[offset + 2], input[offset + 1], input[offset]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixH1(int h1, int k1) {
        return (Integer.rotateLeft(h1 ^ k1, 13) * 5) - 430675100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixK1(int k1) {
        return Integer.rotateLeft(k1 * (-862048943), 15) * 461845907;
    }

    @Override // p000.lh7
    public int bits() {
        return 32;
    }

    public boolean equals(@wx1 Object object) {
        if (!(object instanceof g4b)) {
            return false;
        }
        g4b g4bVar = (g4b) object;
        return this.f38713a == g4bVar.f38713a && this.f38714b == g4bVar.f38714b;
    }

    @Override // p000.AbstractC11839r1, p000.lh7
    public jh7 hashBytes(byte[] input, int off, int len) {
        v7d.checkPositionIndexes(off, off + len, input.length);
        int iMixH1 = this.f38713a;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 4;
            if (i3 > len) {
                break;
            }
            iMixH1 = mixH1(iMixH1, mixK1(getIntLittleEndian(input, i2 + off)));
            i2 = i3;
        }
        int i4 = i2;
        int i5 = 0;
        while (i4 < len) {
            i ^= hvh.toInt(input[off + i4]) << i5;
            i4++;
            i5 += 8;
        }
        return fmix(mixK1(i) ^ iMixH1, len);
    }

    public int hashCode() {
        return g4b.class.hashCode() ^ this.f38713a;
    }

    @Override // p000.AbstractC11839r1, p000.lh7
    public jh7 hashInt(int input) {
        return fmix(mixH1(this.f38713a, mixK1(input)), 4);
    }

    @Override // p000.AbstractC11839r1, p000.lh7
    public jh7 hashLong(long input) {
        return fmix(mixH1(mixH1(this.f38713a, mixK1((int) input)), mixK1((int) (input >>> 32))), 8);
    }

    @Override // p000.AbstractC11839r1, p000.lh7
    public jh7 hashString(CharSequence input, Charset charset) {
        if (!yw1.f103176c.equals(charset)) {
            return hashBytes(input.toString().getBytes(charset));
        }
        int length = input.length();
        int iMixH1 = this.f38713a;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 4;
            if (i4 > length) {
                break;
            }
            char cCharAt = input.charAt(i2);
            char cCharAt2 = input.charAt(i2 + 1);
            char cCharAt3 = input.charAt(i2 + 2);
            char cCharAt4 = input.charAt(i2 + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            iMixH1 = mixH1(iMixH1, mixK1((cCharAt2 << '\b') | cCharAt | (cCharAt3 << j15.f49329c) | (cCharAt4 << 24)));
            i3 += 4;
            i2 = i4;
        }
        long jCharToThreeUtf8Bytes = 0;
        while (i2 < length) {
            char cCharAt5 = input.charAt(i2);
            if (cCharAt5 < 128) {
                jCharToThreeUtf8Bytes |= ((long) cCharAt5) << i;
                i += 8;
                i3++;
            } else if (cCharAt5 < 2048) {
                jCharToThreeUtf8Bytes |= charToTwoUtf8Bytes(cCharAt5) << i;
                i += 16;
                i3 += 2;
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                jCharToThreeUtf8Bytes |= charToThreeUtf8Bytes(cCharAt5) << i;
                i += 24;
                i3 += 3;
            } else {
                int iCodePointAt = Character.codePointAt(input, i2);
                if (iCodePointAt == cCharAt5) {
                    return hashBytes(input.toString().getBytes(charset));
                }
                i2++;
                jCharToThreeUtf8Bytes |= codePointToFourUtf8Bytes(iCodePointAt) << i;
                if (this.f38714b) {
                    i += 32;
                }
                i3 += 4;
            }
            if (i >= 32) {
                iMixH1 = mixH1(iMixH1, mixK1((int) jCharToThreeUtf8Bytes));
                jCharToThreeUtf8Bytes >>>= 32;
                i -= 32;
            }
            i2++;
        }
        return fmix(mixK1((int) jCharToThreeUtf8Bytes) ^ iMixH1, i3);
    }

    @Override // p000.AbstractC11839r1, p000.lh7
    public jh7 hashUnencodedChars(CharSequence input) {
        int iMixK1 = this.f38713a;
        for (int i = 1; i < input.length(); i += 2) {
            iMixK1 = mixH1(iMixK1, mixK1(input.charAt(i - 1) | (input.charAt(i) << j15.f49329c)));
        }
        if ((input.length() & 1) == 1) {
            iMixK1 ^= mixK1(input.charAt(input.length() - 1));
        }
        return fmix(iMixK1, input.length() * 2);
    }

    @Override // p000.lh7
    public wh7 newHasher() {
        return new C6123a(this.f38713a);
    }

    public String toString() {
        return "Hashing.murmur3_32(" + this.f38713a + c0b.f15434d;
    }
}
