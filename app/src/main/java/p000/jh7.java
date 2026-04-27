package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@xx4
public abstract class jh7 {

    /* JADX INFO: renamed from: a */
    public static final char[] f50561a = tj7.f85043a.toCharArray();

    /* JADX INFO: renamed from: jh7$a */
    public static final class C7900a extends jh7 implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b */
        public final byte[] f50562b;

        public C7900a(byte[] bytes) {
            this.f50562b = (byte[]) v7d.checkNotNull(bytes);
        }

        @Override // p000.jh7
        /* JADX INFO: renamed from: a */
        public boolean mo14082a(jh7 that) {
            if (this.f50562b.length != that.mo14083c().length) {
                return false;
            }
            boolean z = true;
            int i = 0;
            while (true) {
                byte[] bArr = this.f50562b;
                if (i >= bArr.length) {
                    return z;
                }
                z &= bArr[i] == that.mo14083c()[i];
                i++;
            }
        }

        @Override // p000.jh7
        public byte[] asBytes() {
            return (byte[]) this.f50562b.clone();
        }

        @Override // p000.jh7
        public int asInt() {
            byte[] bArr = this.f50562b;
            v7d.checkState(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.f50562b;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // p000.jh7
        public long asLong() {
            byte[] bArr = this.f50562b;
            v7d.checkState(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return padToLong();
        }

        @Override // p000.jh7
        public int bits() {
            return this.f50562b.length * 8;
        }

        @Override // p000.jh7
        /* JADX INFO: renamed from: c */
        public byte[] mo14083c() {
            return this.f50562b;
        }

        @Override // p000.jh7
        /* JADX INFO: renamed from: d */
        public void mo14084d(byte[] dest, int offset, int maxLength) {
            System.arraycopy(this.f50562b, 0, dest, offset, maxLength);
        }

        @Override // p000.jh7
        public long padToLong() {
            long j = this.f50562b[0] & 255;
            for (int i = 1; i < Math.min(this.f50562b.length, 8); i++) {
                j |= (((long) this.f50562b[i]) & 255) << (i * 8);
            }
            return j;
        }
    }

    /* JADX INFO: renamed from: jh7$b */
    public static final class C7901b extends jh7 implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b */
        public final int f50563b;

        public C7901b(int hash) {
            this.f50563b = hash;
        }

        @Override // p000.jh7
        /* JADX INFO: renamed from: a */
        public boolean mo14082a(jh7 that) {
            return this.f50563b == that.asInt();
        }

        @Override // p000.jh7
        public byte[] asBytes() {
            int i = this.f50563b;
            return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
        }

        @Override // p000.jh7
        public int asInt() {
            return this.f50563b;
        }

        @Override // p000.jh7
        public long asLong() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // p000.jh7
        public int bits() {
            return 32;
        }

        @Override // p000.jh7
        /* JADX INFO: renamed from: d */
        public void mo14084d(byte[] dest, int offset, int maxLength) {
            for (int i = 0; i < maxLength; i++) {
                dest[offset + i] = (byte) (this.f50563b >> (i * 8));
            }
        }

        @Override // p000.jh7
        public long padToLong() {
            return jvh.toLong(this.f50563b);
        }
    }

    /* JADX INFO: renamed from: jh7$c */
    public static final class C7902c extends jh7 implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b */
        public final long f50564b;

        public C7902c(long hash) {
            this.f50564b = hash;
        }

        @Override // p000.jh7
        /* JADX INFO: renamed from: a */
        public boolean mo14082a(jh7 that) {
            return this.f50564b == that.asLong();
        }

        @Override // p000.jh7
        public byte[] asBytes() {
            return new byte[]{(byte) this.f50564b, (byte) (r0 >> 8), (byte) (r0 >> 16), (byte) (r0 >> 24), (byte) (r0 >> 32), (byte) (r0 >> 40), (byte) (r0 >> 48), (byte) (r0 >> 56)};
        }

        @Override // p000.jh7
        public int asInt() {
            return (int) this.f50564b;
        }

        @Override // p000.jh7
        public long asLong() {
            return this.f50564b;
        }

        @Override // p000.jh7
        public int bits() {
            return 64;
        }

        @Override // p000.jh7
        /* JADX INFO: renamed from: d */
        public void mo14084d(byte[] dest, int offset, int maxLength) {
            for (int i = 0; i < maxLength; i++) {
                dest[offset + i] = (byte) (this.f50564b >> (i * 8));
            }
        }

        @Override // p000.jh7
        public long padToLong() {
            return this.f50564b;
        }
    }

    /* JADX INFO: renamed from: b */
    public static jh7 m14081b(byte[] bytes) {
        return new C7900a(bytes);
    }

    private static int decode(char ch) {
        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        }
        if (ch >= 'a' && ch <= 'f') {
            return ch - 'W';
        }
        throw new IllegalArgumentException("Illegal hexadecimal character: " + ch);
    }

    public static jh7 fromBytes(byte[] bytes) {
        v7d.checkArgument(bytes.length >= 1, "A HashCode must contain at least 1 byte.");
        return m14081b((byte[]) bytes.clone());
    }

    public static jh7 fromInt(int hash) {
        return new C7901b(hash);
    }

    public static jh7 fromLong(long hash) {
        return new C7902c(hash);
    }

    public static jh7 fromString(String string) {
        v7d.checkArgument(string.length() >= 2, "input string (%s) must have at least 2 characters", string);
        v7d.checkArgument(string.length() % 2 == 0, "input string (%s) must have an even number of characters", string);
        byte[] bArr = new byte[string.length() / 2];
        for (int i = 0; i < string.length(); i += 2) {
            bArr[i / 2] = (byte) ((decode(string.charAt(i)) << 4) + decode(string.charAt(i + 1)));
        }
        return m14081b(bArr);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo14082a(jh7 that);

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    public abstract int bits();

    /* JADX INFO: renamed from: c */
    public byte[] mo14083c() {
        return asBytes();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo14084d(byte[] dest, int offset, int maxLength);

    public final boolean equals(@wx1 Object object) {
        if (!(object instanceof jh7)) {
            return false;
        }
        jh7 jh7Var = (jh7) object;
        return bits() == jh7Var.bits() && mo14082a(jh7Var);
    }

    public final int hashCode() {
        if (bits() >= 32) {
            return asInt();
        }
        byte[] bArrMo14083c = mo14083c();
        int i = bArrMo14083c[0] & 255;
        for (int i2 = 1; i2 < bArrMo14083c.length; i2++) {
            i |= (bArrMo14083c[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public abstract long padToLong();

    public final String toString() {
        byte[] bArrMo14083c = mo14083c();
        StringBuilder sb = new StringBuilder(bArrMo14083c.length * 2);
        for (byte b : bArrMo14083c) {
            char[] cArr = f50561a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    @op1
    public int writeBytesTo(byte[] dest, int offset, int maxLength) {
        int iMin = rd8.min(maxLength, bits() / 8);
        v7d.checkPositionIndexes(offset, offset + iMin, dest.length);
        mo14084d(dest, offset, iMin);
        return iMin;
    }
}
