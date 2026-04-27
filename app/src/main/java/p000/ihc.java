package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ihc {

    /* JADX INFO: renamed from: d */
    public static final char[] f47037d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f47038e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final dy7<Charset> f47039f = dy7.m9580of(yw1.f103174a, yw1.f103176c, yw1.f103179f, yw1.f103177d, yw1.f103178e);

    /* JADX INFO: renamed from: a */
    public byte[] f47040a;

    /* JADX INFO: renamed from: b */
    public int f47041b;

    /* JADX INFO: renamed from: c */
    public int f47042c;

    public ihc() {
        this.f47040a = x0i.f95983f;
    }

    private int findNextLineTerminator(Charset charset) {
        int i;
        if (charset.equals(yw1.f103176c) || charset.equals(yw1.f103174a)) {
            i = 1;
        } else {
            if (!charset.equals(yw1.f103179f) && !charset.equals(yw1.f103178e) && !charset.equals(yw1.f103177d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.f47041b;
        while (true) {
            int i3 = this.f47042c;
            if (i2 >= i3 - (i - 1)) {
                return i3;
            }
            if ((charset.equals(yw1.f103176c) || charset.equals(yw1.f103174a)) && x0i.isLinebreak(this.f47040a[i2])) {
                return i2;
            }
            if (charset.equals(yw1.f103179f) || charset.equals(yw1.f103177d)) {
                byte[] bArr = this.f47040a;
                if (bArr[i2] == 0 && x0i.isLinebreak(bArr[i2 + 1])) {
                    return i2;
                }
            }
            if (charset.equals(yw1.f103178e)) {
                byte[] bArr2 = this.f47040a;
                if (bArr2[i2 + 1] == 0 && x0i.isLinebreak(bArr2[i2])) {
                    return i2;
                }
            }
            i2 += i;
        }
    }

    private int peekCharacterAndSize(Charset charset) {
        byte bCheckedCast;
        char cFromBytes;
        int i = 1;
        if ((charset.equals(yw1.f103176c) || charset.equals(yw1.f103174a)) && bytesLeft() >= 1) {
            bCheckedCast = (byte) rw1.checkedCast(hvh.toInt(this.f47040a[this.f47041b]));
        } else {
            if ((charset.equals(yw1.f103179f) || charset.equals(yw1.f103177d)) && bytesLeft() >= 2) {
                byte[] bArr = this.f47040a;
                int i2 = this.f47041b;
                cFromBytes = rw1.fromBytes(bArr[i2], bArr[i2 + 1]);
            } else {
                if (!charset.equals(yw1.f103178e) || bytesLeft() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f47040a;
                int i3 = this.f47041b;
                cFromBytes = rw1.fromBytes(bArr2[i3 + 1], bArr2[i3]);
            }
            bCheckedCast = (byte) cFromBytes;
            i = 2;
        }
        return (rw1.checkedCast(bCheckedCast) << j15.f49329c) + i;
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int iPeekCharacterAndSize = peekCharacterAndSize(charset);
        if (iPeekCharacterAndSize == 0) {
            return (char) 0;
        }
        char c = (char) (iPeekCharacterAndSize >> 16);
        if (!rw1.contains(cArr, c)) {
            return (char) 0;
        }
        this.f47041b += iPeekCharacterAndSize & 65535;
        return c;
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, f47037d) == '\r') {
            readCharacterIfInList(charset, f47038e);
        }
    }

    public int bytesLeft() {
        return this.f47042c - this.f47041b;
    }

    public int capacity() {
        return this.f47040a.length;
    }

    public void ensureCapacity(int i) {
        if (i > capacity()) {
            this.f47040a = Arrays.copyOf(this.f47040a, i);
        }
    }

    public byte[] getData() {
        return this.f47040a;
    }

    public int getPosition() {
        return this.f47041b;
    }

    public int limit() {
        return this.f47042c;
    }

    public char peekChar() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int peekUnsignedByte() {
        return this.f47040a[this.f47041b] & 255;
    }

    public void readBytes(ghc ghcVar, int i) {
        readBytes(ghcVar.f39834a, 0, i);
        ghcVar.setPosition(0);
    }

    @hib
    public String readDelimiterTerminatedString(char c) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.f47041b;
        while (i < this.f47042c && this.f47040a[i] != c) {
            i++;
        }
        byte[] bArr = this.f47040a;
        int i2 = this.f47041b;
        String strFromUtf8Bytes = x0i.fromUtf8Bytes(bArr, i2, i - i2);
        this.f47041b = i;
        if (i < this.f47042c) {
            this.f47041b = i + 1;
        }
        return strFromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f47041b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f47041b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f47041b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public int readInt24() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i + 2;
        this.f47041b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f47041b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    @hib
    public String readLine() {
        return readLine(yw1.f103176c);
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f47041b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f47041b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f47041b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f47041b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f47041b = i + 3;
        return ((bArr[i4] & 255) << 16) | i5;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f47041b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f47041b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.f47041b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.f47041b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.f47041b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.f47041b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f47041b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        int i3 = bArr[i] & 255;
        this.f47041b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f47041b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f47041b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f47041b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f47041b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f47041b = i + 3;
        return ((bArr[i4] & 255) << 16) | i5;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        throw new IllegalStateException("Top bit not zero: " + littleEndianInt);
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        int i3 = bArr[i] & 255;
        this.f47041b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public long readLong() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.f47041b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.f47041b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.f47041b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.f47041b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.f47041b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.f47041b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f47041b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    public String readNullTerminatedString(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f47041b;
        int i3 = (i2 + i) - 1;
        String strFromUtf8Bytes = x0i.fromUtf8Bytes(this.f47040a, i2, (i3 >= this.f47042c || this.f47040a[i3] != 0) ? i : i - 1);
        this.f47041b += i;
        return strFromUtf8Bytes;
    }

    public short readShort() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f47041b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public String readString(int i) {
        return readString(i, yw1.f103176c);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        this.f47041b = i + 1;
        return bArr[i] & 255;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f47041b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.f47041b = i + 4;
        return i4;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.f47041b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.f47041b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f47041b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.f47041b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f47041b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public int readUnsignedIntToInt() {
        int i = readInt();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Top bit not zero: " + i);
    }

    public long readUnsignedLongToLong() {
        long j = readLong();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException("Top bit not zero: " + j);
    }

    public int readUnsignedShort() {
        byte[] bArr = this.f47040a;
        int i = this.f47041b;
        int i2 = i + 1;
        this.f47041b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f47041b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public long readUtf8EncodedLong() {
        int i;
        int i2;
        long j = this.f47040a[this.f47041b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            byte b = this.f47040a[this.f47041b + i];
            if ((b & k95.f53214o7) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.f47041b += i2;
        return j;
    }

    @hib
    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.f47040a;
            int i = this.f47041b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f47041b = i + 3;
                return yw1.f103176c;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.f47040a;
        int i2 = this.f47041b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f47041b = i2 + 2;
            return yw1.f103177d;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f47041b = i2 + 2;
        return yw1.f103178e;
    }

    public void reset(int i) {
        reset(capacity() < i ? new byte[i] : this.f47040a, i);
    }

    public void setLimit(int i) {
        u80.checkArgument(i >= 0 && i <= this.f47040a.length);
        this.f47042c = i;
    }

    public void setPosition(int i) {
        u80.checkArgument(i >= 0 && i <= this.f47042c);
        this.f47041b = i;
    }

    public void skipBytes(int i) {
        setPosition(this.f47041b + i);
    }

    public char peekChar(Charset charset) {
        u80.checkArgument(f47039f.contains(charset), "Unsupported charset: " + charset);
        return (char) (peekCharacterAndSize(charset) >> 16);
    }

    @hib
    public String readLine(Charset charset) {
        u80.checkArgument(f47039f.contains(charset), "Unsupported charset: " + charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(yw1.f103174a)) {
            readUtfCharsetFromBom();
        }
        String string = readString(findNextLineTerminator(charset) - this.f47041b, charset);
        if (this.f47041b == this.f47042c) {
            return string;
        }
        skipLineTerminator(charset);
        return string;
    }

    public String readString(int i, Charset charset) {
        String str = new String(this.f47040a, this.f47041b, i, charset);
        this.f47041b += i;
        return str;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public ihc(int i) {
        this.f47040a = new byte[i];
        this.f47042c = i;
    }

    public void readBytes(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f47040a, this.f47041b, bArr, i, i2);
        this.f47041b += i2;
    }

    public void reset(byte[] bArr, int i) {
        this.f47040a = bArr;
        this.f47042c = i;
        this.f47041b = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.f47040a, this.f47041b, i);
        this.f47041b += i;
    }

    public ihc(byte[] bArr) {
        this.f47040a = bArr;
        this.f47042c = bArr.length;
    }

    @hib
    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public ihc(byte[] bArr, int i) {
        this.f47040a = bArr;
        this.f47042c = i;
    }
}
