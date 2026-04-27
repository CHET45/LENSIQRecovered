package p000;

import com.blankj.utilcode.util.C2478k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes3.dex */
@zx1
@ovh
public final class jhc {

    /* JADX INFO: renamed from: d */
    public static final int f50567d = 1114112;

    /* JADX INFO: renamed from: e */
    public static final char[] f50568e = {'\r', '\n'};

    /* JADX INFO: renamed from: f */
    public static final char[] f50569f = {'\n'};

    /* JADX INFO: renamed from: g */
    public static final dy7<Charset> f50570g = dy7.m9580of(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a */
    public byte[] f50571a;

    /* JADX INFO: renamed from: b */
    public int f50572b;

    /* JADX INFO: renamed from: c */
    public int f50573c;

    public jhc() {
        this.f50571a = t0i.f83321f;
    }

    private static int decodeUtf8CodeUnit(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return rd8.fromBytes((byte) 0, hvh.checkedCast(((i & 7) << 2) | ((i2 & 48) >> 4)), hvh.checkedCast(((((byte) i2) & 15) << 4) | ((b & BuiltinOptions.LogicalOrOptions) >> 2)), hvh.checkedCast(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    private int findNextLineTerminator(Charset charset) {
        int i;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.f50572b;
        while (true) {
            int i3 = this.f50573c;
            if (i2 >= i3 - (i - 1)) {
                return i3;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && t0i.isLinebreak(this.f50571a[i2])) {
                return i2;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.f50571a;
                if (bArr[i2] == 0 && t0i.isLinebreak(bArr[i2 + 1])) {
                    return i2;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.f50571a;
                if (bArr2[i2 + 1] == 0 && t0i.isLinebreak(bArr2[i2])) {
                    return i2;
                }
            }
            i2 += i;
        }
    }

    private static int getSmallestCodeUnitSize(Charset charset) {
        v80.checkArgument(f50570g.contains(charset), "Unsupported charset: " + charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private static boolean isUtf8ContinuationByte(byte b) {
        return (b & k95.f53214o7) == 128;
    }

    private int peekCodePointAndSize(Charset charset) {
        int codePoint;
        int iDecodeUtf8CodeUnit;
        v80.checkArgument(f50570g.contains(charset), "Unsupported charset: " + charset);
        if (bytesLeft() < getSmallestCodeUnitSize(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f50572b + ", limit=" + this.f50573c);
        }
        byte b = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b2 = this.f50571a[this.f50572b];
            if ((b2 & 128) != 0) {
                return 0;
            }
            codePoint = hvh.toInt(b2);
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte bPeekUtf8CodeUnitSize = peekUtf8CodeUnitSize();
            if (bPeekUtf8CodeUnitSize == 1) {
                iDecodeUtf8CodeUnit = hvh.toInt(this.f50571a[this.f50572b]);
            } else if (bPeekUtf8CodeUnitSize == 2) {
                byte[] bArr = this.f50571a;
                int i = this.f50572b;
                iDecodeUtf8CodeUnit = decodeUtf8CodeUnit(0, 0, bArr[i], bArr[i + 1]);
            } else if (bPeekUtf8CodeUnitSize == 3) {
                byte[] bArr2 = this.f50571a;
                int i2 = this.f50572b;
                iDecodeUtf8CodeUnit = decodeUtf8CodeUnit(0, bArr2[i2] & 15, bArr2[i2 + 1], bArr2[i2 + 2]);
            } else {
                if (bPeekUtf8CodeUnitSize != 4) {
                    return 0;
                }
                byte[] bArr3 = this.f50571a;
                int i3 = this.f50572b;
                iDecodeUtf8CodeUnit = decodeUtf8CodeUnit(bArr3[i3], bArr3[i3 + 1], bArr3[i3 + 2], bArr3[i3 + 3]);
            }
            b = bPeekUtf8CodeUnitSize;
            codePoint = iDecodeUtf8CodeUnit;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cPeekChar = peekChar(byteOrder, 0);
            if (!Character.isHighSurrogate(cPeekChar) || bytesLeft() < 4) {
                codePoint = cPeekChar;
                b = 2;
            } else {
                codePoint = Character.toCodePoint(cPeekChar, peekChar(byteOrder, 2));
                b = 4;
            }
        }
        return (codePoint << 8) | b;
    }

    private byte peekUtf8CodeUnitSize() {
        byte b = this.f50571a[this.f50572b];
        if ((b & 128) == 0) {
            return (byte) 1;
        }
        if ((b & 224) == 192 && bytesLeft() >= 2 && isUtf8ContinuationByte(this.f50571a[this.f50572b + 1])) {
            return (byte) 2;
        }
        if ((this.f50571a[this.f50572b] & 240) == 224 && bytesLeft() >= 3 && isUtf8ContinuationByte(this.f50571a[this.f50572b + 1]) && isUtf8ContinuationByte(this.f50571a[this.f50572b + 2])) {
            return (byte) 3;
        }
        return ((this.f50571a[this.f50572b] & C2478k.f17681i) == 240 && bytesLeft() >= 4 && isUtf8ContinuationByte(this.f50571a[this.f50572b + 1]) && isUtf8ContinuationByte(this.f50571a[this.f50572b + 2]) && isUtf8ContinuationByte(this.f50571a[this.f50572b + 3])) ? (byte) 4 : (byte) 0;
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int iPeekCodePointAndSize;
        if (bytesLeft() < getSmallestCodeUnitSize(charset) || (iPeekCodePointAndSize = peekCodePointAndSize(charset)) == 0) {
            return (char) 0;
        }
        int iCheckedCast = jvh.checkedCast(iPeekCodePointAndSize >>> 8);
        if (Character.isSupplementaryCodePoint(iCheckedCast)) {
            return (char) 0;
        }
        char cCheckedCast = rw1.checkedCast(iCheckedCast);
        if (!rw1.contains(cArr, cCheckedCast)) {
            return (char) 0;
        }
        this.f50572b += rd8.checkedCast(iPeekCodePointAndSize & 255);
        return cCheckedCast;
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, f50568e) == '\r') {
            readCharacterIfInList(charset, f50569f);
        }
    }

    public int bytesLeft() {
        return Math.max(this.f50573c - this.f50572b, 0);
    }

    public int capacity() {
        return this.f50571a.length;
    }

    public void ensureCapacity(int i) {
        if (i > capacity()) {
            this.f50571a = Arrays.copyOf(this.f50571a, i);
        }
    }

    public byte[] getData() {
        return this.f50571a;
    }

    public int getPosition() {
        return this.f50572b;
    }

    public int limit() {
        return this.f50573c;
    }

    public char peekChar() {
        return peekChar(ByteOrder.BIG_ENDIAN, 0);
    }

    public int peekCodePoint(Charset charset) {
        return peekCodePointAndSize(charset) != 0 ? rd8.checkedCast(r3 >>> 8) : f50567d;
    }

    public int peekUnsignedByte() {
        return this.f50571a[this.f50572b] & 255;
    }

    public void readBytes(hhc hhcVar, int i) {
        readBytes(hhcVar.f43646a, 0, i);
        hhcVar.setPosition(0);
    }

    @hib
    public String readDelimiterTerminatedString(char c) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.f50572b;
        while (i < this.f50573c && this.f50571a[i] != c) {
            i++;
        }
        byte[] bArr = this.f50571a;
        int i2 = this.f50572b;
        String strFromUtf8Bytes = t0i.fromUtf8Bytes(bArr, i2, i - i2);
        this.f50572b = i;
        if (i < this.f50573c) {
            this.f50572b = i + 1;
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
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f50572b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f50572b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f50572b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public int readInt24() {
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i + 2;
        this.f50572b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f50572b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    @hib
    public String readLine() {
        return readLine(StandardCharsets.UTF_8);
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f50572b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f50572b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f50572b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f50572b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f50572b = i + 3;
        return ((bArr[i4] & 255) << 16) | i5;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f50572b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f50572b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.f50572b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.f50572b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.f50572b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.f50572b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f50572b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        int i3 = bArr[i] & 255;
        this.f50572b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f50572b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f50572b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f50572b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f50572b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f50572b = i + 3;
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
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        int i3 = bArr[i] & 255;
        this.f50572b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public long readLong() {
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.f50572b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.f50572b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.f50572b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.f50572b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.f50572b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.f50572b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f50572b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    public String readNullTerminatedString(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f50572b;
        int i3 = (i2 + i) - 1;
        String strFromUtf8Bytes = t0i.fromUtf8Bytes(this.f50571a, i2, (i3 >= this.f50573c || this.f50571a[i3] != 0) ? i : i - 1);
        this.f50572b += i;
        return strFromUtf8Bytes;
    }

    public short readShort() {
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f50572b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public String readString(int i) {
        return readString(i, StandardCharsets.UTF_8);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        this.f50572b = i + 1;
        return bArr[i] & 255;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f50572b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.f50572b = i + 4;
        return i4;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.f50572b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.f50572b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f50572b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.f50572b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f50572b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public int readUnsignedIntToInt() {
        int i = readInt();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Top bit not zero: " + i);
    }

    public int readUnsignedLeb128ToInt() {
        return rd8.checkedCast(readUnsignedLeb128ToLong());
    }

    public long readUnsignedLeb128ToLong() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.f50572b == this.f50573c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long unsignedByte = readUnsignedByte();
            j |= (127 & unsignedByte) << (i * 7);
            if ((unsignedByte & 128) == 0) {
                break;
            }
        }
        return j;
    }

    public long readUnsignedLongToLong() {
        long j = readLong();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException("Top bit not zero: " + j);
    }

    public int readUnsignedShort() {
        byte[] bArr = this.f50571a;
        int i = this.f50572b;
        int i2 = i + 1;
        this.f50572b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f50572b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public long readUtf8EncodedLong() {
        int i;
        int i2;
        long j = this.f50571a[this.f50572b];
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
            byte b = this.f50571a[this.f50572b + i];
            if ((b & k95.f53214o7) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.f50572b += i2;
        return j;
    }

    @hib
    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.f50571a;
            int i = this.f50572b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f50572b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.f50571a;
        int i2 = this.f50572b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f50572b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f50572b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void reset(int i) {
        reset(capacity() < i ? new byte[i] : this.f50571a, i);
    }

    public void setLimit(int i) {
        v80.checkArgument(i >= 0 && i <= this.f50571a.length);
        this.f50573c = i;
    }

    public void setPosition(int i) {
        v80.checkArgument(i >= 0 && i <= this.f50573c);
        this.f50572b = i;
    }

    public void skipBytes(int i) {
        setPosition(this.f50572b + i);
    }

    public void skipLeb128() {
        while ((readUnsignedByte() & 128) != 0) {
        }
    }

    @Deprecated
    public char peekChar(Charset charset) {
        v80.checkArgument(f50570g.contains(charset), "Unsupported charset: " + charset);
        if (bytesLeft() == 0) {
            return (char) 0;
        }
        if (charset.equals(StandardCharsets.US_ASCII)) {
            return (char) peekUnsignedByte();
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            if ((this.f50571a[this.f50572b] & 128) == 0) {
                return (char) peekUnsignedByte();
            }
            return (char) 0;
        }
        if (bytesLeft() < 2) {
            return (char) 0;
        }
        return peekChar(charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN, 0);
    }

    @hib
    public String readLine(Charset charset) {
        v80.checkArgument(f50570g.contains(charset), "Unsupported charset: " + charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            readUtfCharsetFromBom();
        }
        String string = readString(findNextLineTerminator(charset) - this.f50572b, charset);
        if (this.f50572b == this.f50573c) {
            return string;
        }
        skipLineTerminator(charset);
        return string;
    }

    public String readString(int i, Charset charset) {
        String str = new String(this.f50571a, this.f50572b, i, charset);
        this.f50572b += i;
        return str;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public jhc(int i) {
        this.f50571a = new byte[i];
        this.f50573c = i;
    }

    public void readBytes(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f50571a, this.f50572b, bArr, i, i2);
        this.f50572b += i2;
    }

    public void reset(byte[] bArr, int i) {
        this.f50571a = bArr;
        this.f50573c = i;
        this.f50572b = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.f50571a, this.f50572b, i);
        this.f50572b += i;
    }

    public jhc(byte[] bArr) {
        this.f50571a = bArr;
        this.f50573c = bArr.length;
    }

    @hib
    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public jhc(byte[] bArr, int i) {
        this.f50571a = bArr;
        this.f50573c = i;
    }

    private char peekChar(ByteOrder byteOrder, int i) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f50571a;
            int i2 = this.f50572b;
            return rw1.fromBytes(bArr[i2 + i], bArr[i2 + i + 1]);
        }
        byte[] bArr2 = this.f50571a;
        int i3 = this.f50572b;
        return rw1.fromBytes(bArr2[i3 + i + 1], bArr2[i3 + i]);
    }
}
