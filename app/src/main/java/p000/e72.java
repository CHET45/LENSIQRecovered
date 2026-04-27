package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p000.psa;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e72 {

    /* JADX INFO: renamed from: f */
    public static final int f31980f = 4096;

    /* JADX INFO: renamed from: g */
    public static final int f31981g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h */
    public static volatile int f31982h = 100;

    /* JADX INFO: renamed from: a */
    public int f31983a;

    /* JADX INFO: renamed from: b */
    public int f31984b;

    /* JADX INFO: renamed from: c */
    public int f31985c;

    /* JADX INFO: renamed from: d */
    public g72 f31986d;

    /* JADX INFO: renamed from: e */
    public boolean f31987e;

    /* JADX INFO: renamed from: e72$b */
    public static final class C5153b extends e72 {

        /* JADX INFO: renamed from: i */
        public final byte[] f31988i;

        /* JADX INFO: renamed from: j */
        public final boolean f31989j;

        /* JADX INFO: renamed from: k */
        public int f31990k;

        /* JADX INFO: renamed from: l */
        public int f31991l;

        /* JADX INFO: renamed from: m */
        public int f31992m;

        /* JADX INFO: renamed from: n */
        public int f31993n;

        /* JADX INFO: renamed from: o */
        public int f31994o;

        /* JADX INFO: renamed from: p */
        public boolean f31995p;

        /* JADX INFO: renamed from: q */
        public int f31996q;

        private void recomputeBufferSizeAfterLimit() {
            int i = this.f31990k + this.f31991l;
            this.f31990k = i;
            int i2 = i - this.f31993n;
            int i3 = this.f31996q;
            if (i2 <= i3) {
                this.f31991l = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f31991l = i4;
            this.f31990k = i - i4;
        }

        private void skipRawVarint() throws IOException {
            if (this.f31990k - this.f31992m >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f31988i;
                int i2 = this.f31992m;
                this.f31992m = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw be8.m3079f();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw be8.m3079f();
        }

        @Override // p000.e72
        public void checkLastTagWas(final int value) throws be8 {
            if (this.f31994o != value) {
                throw be8.m3075b();
            }
        }

        @Override // p000.e72
        public void enableAliasing(boolean enabled) {
            this.f31995p = enabled;
        }

        @Override // p000.e72
        /* JADX INFO: renamed from: f */
        public long mo9779f() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw be8.m3079f();
        }

        @Override // p000.e72
        public int getBytesUntilLimit() {
            int i = this.f31996q;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // p000.e72
        public int getLastTag() {
            return this.f31994o;
        }

        @Override // p000.e72
        public int getTotalBytesRead() {
            return this.f31992m - this.f31993n;
        }

        @Override // p000.e72
        public boolean isAtEnd() throws IOException {
            return this.f31992m == this.f31990k;
        }

        @Override // p000.e72
        public void popLimit(final int oldLimit) {
            this.f31996q = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // p000.e72
        public int pushLimit(int byteLimit) throws be8 {
            if (byteLimit < 0) {
                throw be8.m3080g();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw be8.m3081h();
            }
            int i = this.f31996q;
            if (totalBytesRead > i) {
                throw be8.m3084l();
            }
            this.f31996q = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i;
        }

        @Override // p000.e72
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // p000.e72
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // p000.e72
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.f31990k;
                int i2 = this.f31992m;
                if (rawVarint32 <= i - i2) {
                    ByteBuffer byteBufferWrap = (this.f31989j || !this.f31995p) ? ByteBuffer.wrap(Arrays.copyOfRange(this.f31988i, i2, i2 + rawVarint32)) : ByteBuffer.wrap(this.f31988i, i2, rawVarint32).slice();
                    this.f31992m += rawVarint32;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32 == 0) {
                return v98.f90384f;
            }
            if (rawVarint32 < 0) {
                throw be8.m3080g();
            }
            throw be8.m3084l();
        }

        @Override // p000.e72
        public wj1 readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.f31990k;
                int i2 = this.f31992m;
                if (rawVarint32 <= i - i2) {
                    wj1 wj1VarM24596o = (this.f31989j && this.f31995p) ? wj1.m24596o(this.f31988i, i2, rawVarint32) : wj1.copyFrom(this.f31988i, i2, rawVarint32);
                    this.f31992m += rawVarint32;
                    return wj1VarM24596o;
                }
            }
            return rawVarint32 == 0 ? wj1.f94379e : wj1.m24595n(readRawBytes(rawVarint32));
        }

        @Override // p000.e72
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // p000.e72
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.e72
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.e72
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.e72
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // p000.e72
        public void readGroup(final int fieldNumber, final psa.InterfaceC11106a builder, final yi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f31983a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(gpi.m11819a(fieldNumber, 4));
            this.f31983a--;
        }

        @Override // p000.e72
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.e72
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.e72
        public void readMessage(final psa.InterfaceC11106a builder, final yi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f31983a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f31983a--;
            if (getBytesUntilLimit() != 0) {
                throw be8.m3084l();
            }
            popLimit(iPushLimit);
        }

        @Override // p000.e72
        public byte readRawByte() throws IOException {
            int i = this.f31992m;
            if (i == this.f31990k) {
                throw be8.m3084l();
            }
            byte[] bArr = this.f31988i;
            this.f31992m = i + 1;
            return bArr[i];
        }

        @Override // p000.e72
        public byte[] readRawBytes(final int length) throws IOException {
            if (length > 0) {
                int i = this.f31990k;
                int i2 = this.f31992m;
                if (length <= i - i2) {
                    int i3 = length + i2;
                    this.f31992m = i3;
                    return Arrays.copyOfRange(this.f31988i, i2, i3);
                }
            }
            if (length > 0) {
                throw be8.m3084l();
            }
            if (length == 0) {
                return v98.f90383e;
            }
            throw be8.m3080g();
        }

        @Override // p000.e72
        public int readRawLittleEndian32() throws IOException {
            int i = this.f31992m;
            if (this.f31990k - i < 4) {
                throw be8.m3084l();
            }
            byte[] bArr = this.f31988i;
            this.f31992m = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // p000.e72
        public long readRawLittleEndian64() throws IOException {
            int i = this.f31992m;
            if (this.f31990k - i < 8) {
                throw be8.m3084l();
            }
            byte[] bArr = this.f31988i;
            this.f31992m = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        @Override // p000.e72
        public int readRawVarint32() throws IOException {
            int i;
            int i2 = this.f31992m;
            int i3 = this.f31990k;
            if (i3 != i2) {
                byte[] bArr = this.f31988i;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f31992m = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.f31992m = i5;
                    return i;
                }
            }
            return (int) mo9779f();
        }

        @Override // p000.e72
        public long readRawVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f31992m;
            int i2 = this.f31990k;
            if (i2 != i) {
                byte[] bArr = this.f31988i;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f31992m = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i10]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.f31992m = i4;
                    return j;
                }
            }
            return mo9779f();
        }

        @Override // p000.e72
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.e72
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.e72
        public int readSInt32() throws IOException {
            return e72.decodeZigZag32(readRawVarint32());
        }

        @Override // p000.e72
        public long readSInt64() throws IOException {
            return e72.decodeZigZag64(readRawVarint64());
        }

        @Override // p000.e72
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.f31990k;
                int i2 = this.f31992m;
                if (rawVarint32 <= i - i2) {
                    String str = new String(this.f31988i, i2, rawVarint32, v98.f90380b);
                    this.f31992m += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw be8.m3080g();
            }
            throw be8.m3084l();
        }

        @Override // p000.e72
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.f31990k;
                int i2 = this.f31992m;
                if (rawVarint32 <= i - i2) {
                    String strM16490h = lzh.m16490h(this.f31988i, i2, rawVarint32);
                    this.f31992m += rawVarint32;
                    return strM16490h;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw be8.m3080g();
            }
            throw be8.m3084l();
        }

        @Override // p000.e72
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.f31994o = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f31994o = rawVarint32;
            if (gpi.getTagFieldNumber(rawVarint32) != 0) {
                return this.f31994o;
            }
            throw be8.m3076c();
        }

        @Override // p000.e72
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.e72
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.e72
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final psa.InterfaceC11106a builder) throws IOException {
            readGroup(fieldNumber, builder, yi5.getEmptyRegistry());
        }

        @Override // p000.e72
        public void resetSizeCounter() {
            this.f31993n = this.f31992m;
        }

        @Override // p000.e72
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = gpi.getTagWireType(tag);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(gpi.m11819a(gpi.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw be8.m3078e();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // p000.e72
        public void skipRawBytes(final int length) throws IOException {
            if (length >= 0) {
                int i = this.f31990k;
                int i2 = this.f31992m;
                if (length <= i - i2) {
                    this.f31992m = i2 + length;
                    return;
                }
            }
            if (length >= 0) {
                throw be8.m3084l();
            }
            throw be8.m3080g();
        }

        private C5153b(final byte[] buffer, final int offset, final int len, boolean immutable) {
            super();
            this.f31996q = Integer.MAX_VALUE;
            this.f31988i = buffer;
            this.f31990k = len + offset;
            this.f31992m = offset;
            this.f31993n = offset;
            this.f31989j = immutable;
        }

        @Override // p000.e72
        public <T extends psa> T readGroup(final int fieldNumber, final vhc<T> parser, final yi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f31983a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(gpi.m11819a(fieldNumber, 4));
            this.f31983a--;
            return partialFrom;
        }

        @Override // p000.e72
        public boolean skipField(final int tag, final i72 output) throws IOException {
            int tagWireType = gpi.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                wj1 bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iM11819a = gpi.m11819a(gpi.getTagFieldNumber(tag), 4);
                checkLastTagWas(iM11819a);
                output.writeUInt32NoTag(iM11819a);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw be8.m3078e();
        }

        @Override // p000.e72
        public <T extends psa> T readMessage(final vhc<T> parser, final yi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f31983a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f31983a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw be8.m3084l();
        }
    }

    /* JADX INFO: renamed from: e72$c */
    public static final class C5154c extends e72 {

        /* JADX INFO: renamed from: i */
        public final Iterable<ByteBuffer> f31997i;

        /* JADX INFO: renamed from: j */
        public final Iterator<ByteBuffer> f31998j;

        /* JADX INFO: renamed from: k */
        public ByteBuffer f31999k;

        /* JADX INFO: renamed from: l */
        public final boolean f32000l;

        /* JADX INFO: renamed from: m */
        public boolean f32001m;

        /* JADX INFO: renamed from: n */
        public int f32002n;

        /* JADX INFO: renamed from: o */
        public int f32003o;

        /* JADX INFO: renamed from: p */
        public int f32004p;

        /* JADX INFO: renamed from: q */
        public int f32005q;

        /* JADX INFO: renamed from: r */
        public int f32006r;

        /* JADX INFO: renamed from: s */
        public int f32007s;

        /* JADX INFO: renamed from: t */
        public long f32008t;

        /* JADX INFO: renamed from: u */
        public long f32009u;

        /* JADX INFO: renamed from: v */
        public long f32010v;

        /* JADX INFO: renamed from: w */
        public long f32011w;

        private long currentRemaining() {
            return this.f32011w - this.f32008t;
        }

        private void getNextByteBuffer() throws be8 {
            if (!this.f31998j.hasNext()) {
                throw be8.m3084l();
            }
            tryGetNextByteBuffer();
        }

        private void readRawBytesTo(byte[] bytes, int offset, final int length) throws IOException {
            if (length < 0 || length > remaining()) {
                if (length > 0) {
                    throw be8.m3084l();
                }
                if (length != 0) {
                    throw be8.m3080g();
                }
                return;
            }
            int i = length;
            while (i > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i, (int) currentRemaining());
                long j = iMin;
                evh.m10290m(this.f32008t, bytes, (length - i) + offset, j);
                i -= iMin;
                this.f32008t += j;
            }
        }

        private void recomputeBufferSizeAfterLimit() {
            int i = this.f32002n + this.f32003o;
            this.f32002n = i;
            int i2 = i - this.f32007s;
            int i3 = this.f32004p;
            if (i2 <= i3) {
                this.f32003o = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f32003o = i4;
            this.f32002n = i - i4;
        }

        private int remaining() {
            return (int) ((((long) (this.f32002n - this.f32006r)) - this.f32008t) + this.f32009u);
        }

        private void skipRawVarint() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw be8.m3079f();
        }

        private ByteBuffer slice(int begin, int end) throws IOException {
            int iPosition = this.f31999k.position();
            int iLimit = this.f31999k.limit();
            ByteBuffer byteBuffer = this.f31999k;
            try {
                try {
                    byteBuffer.position(begin);
                    byteBuffer.limit(end);
                    return this.f31999k.slice();
                } catch (IllegalArgumentException unused) {
                    throw be8.m3084l();
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        private void tryGetNextByteBuffer() {
            ByteBuffer next = this.f31998j.next();
            this.f31999k = next;
            this.f32006r += (int) (this.f32008t - this.f32009u);
            long jPosition = next.position();
            this.f32008t = jPosition;
            this.f32009u = jPosition;
            this.f32011w = this.f31999k.limit();
            long jM10288k = evh.m10288k(this.f31999k);
            this.f32010v = jM10288k;
            this.f32008t += jM10288k;
            this.f32009u += jM10288k;
            this.f32011w += jM10288k;
        }

        @Override // p000.e72
        public void checkLastTagWas(final int value) throws be8 {
            if (this.f32005q != value) {
                throw be8.m3075b();
            }
        }

        @Override // p000.e72
        public void enableAliasing(boolean enabled) {
            this.f32001m = enabled;
        }

        @Override // p000.e72
        /* JADX INFO: renamed from: f */
        public long mo9779f() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw be8.m3079f();
        }

        @Override // p000.e72
        public int getBytesUntilLimit() {
            int i = this.f32004p;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // p000.e72
        public int getLastTag() {
            return this.f32005q;
        }

        @Override // p000.e72
        public int getTotalBytesRead() {
            return (int) ((((long) (this.f32006r - this.f32007s)) + this.f32008t) - this.f32009u);
        }

        @Override // p000.e72
        public boolean isAtEnd() throws IOException {
            return (((long) this.f32006r) + this.f32008t) - this.f32009u == ((long) this.f32002n);
        }

        @Override // p000.e72
        public void popLimit(final int oldLimit) {
            this.f32004p = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // p000.e72
        public int pushLimit(int byteLimit) throws be8 {
            if (byteLimit < 0) {
                throw be8.m3080g();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            int i = this.f32004p;
            if (totalBytesRead > i) {
                throw be8.m3084l();
            }
            this.f32004p = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i;
        }

        @Override // p000.e72
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // p000.e72
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // p000.e72
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                if (j <= currentRemaining()) {
                    if (this.f32000l || !this.f32001m) {
                        byte[] bArr = new byte[rawVarint32];
                        evh.m10290m(this.f32008t, bArr, 0L, j);
                        this.f32008t += j;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j2 = this.f32008t + j;
                    this.f32008t = j2;
                    long j3 = this.f32010v;
                    return slice((int) ((j2 - j3) - j), (int) (j2 - j3));
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteBuffer.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return v98.f90384f;
            }
            if (rawVarint32 < 0) {
                throw be8.m3080g();
            }
            throw be8.m3084l();
        }

        @Override // p000.e72
        public wj1 readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                long j2 = this.f32011w;
                long j3 = this.f32008t;
                if (j <= j2 - j3) {
                    if (this.f32000l && this.f32001m) {
                        int i = (int) (j3 - this.f32010v);
                        wj1 wj1VarM24594m = wj1.m24594m(slice(i, rawVarint32 + i));
                        this.f32008t += j;
                        return wj1VarM24594m;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    evh.m10290m(j3, bArr, 0L, j);
                    this.f32008t += j;
                    return wj1.m24595n(bArr);
                }
            }
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return wj1.f94379e;
                }
                if (rawVarint32 < 0) {
                    throw be8.m3080g();
                }
                throw be8.m3084l();
            }
            if (!this.f32000l || !this.f32001m) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return wj1.m24595n(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (rawVarint32 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(rawVarint32, (int) currentRemaining());
                int i2 = (int) (this.f32008t - this.f32010v);
                arrayList.add(wj1.m24594m(slice(i2, i2 + iMin)));
                rawVarint32 -= iMin;
                this.f32008t += (long) iMin;
            }
            return wj1.copyFrom(arrayList);
        }

        @Override // p000.e72
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // p000.e72
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.e72
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.e72
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.e72
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // p000.e72
        public void readGroup(final int fieldNumber, final psa.InterfaceC11106a builder, final yi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f31983a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(gpi.m11819a(fieldNumber, 4));
            this.f31983a--;
        }

        @Override // p000.e72
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.e72
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.e72
        public void readMessage(final psa.InterfaceC11106a builder, final yi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f31983a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f31983a--;
            if (getBytesUntilLimit() != 0) {
                throw be8.m3084l();
            }
            popLimit(iPushLimit);
        }

        @Override // p000.e72
        public byte readRawByte() throws IOException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j = this.f32008t;
            this.f32008t = 1 + j;
            return evh.m10296s(j);
        }

        @Override // p000.e72
        public byte[] readRawBytes(final int length) throws IOException {
            if (length >= 0) {
                long j = length;
                if (j <= currentRemaining()) {
                    byte[] bArr = new byte[length];
                    evh.m10290m(this.f32008t, bArr, 0L, j);
                    this.f32008t += j;
                    return bArr;
                }
            }
            if (length >= 0 && length <= remaining()) {
                byte[] bArr2 = new byte[length];
                readRawBytesTo(bArr2, 0, length);
                return bArr2;
            }
            if (length > 0) {
                throw be8.m3084l();
            }
            if (length == 0) {
                return v98.f90383e;
            }
            throw be8.m3080g();
        }

        @Override // p000.e72
        public int readRawLittleEndian32() throws IOException {
            if (currentRemaining() < 4) {
                return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
            }
            long j = this.f32008t;
            this.f32008t = 4 + j;
            return ((evh.m10296s(j + 3) & 255) << 24) | (evh.m10296s(j) & 255) | ((evh.m10296s(1 + j) & 255) << 8) | ((evh.m10296s(2 + j) & 255) << 16);
        }

        @Override // p000.e72
        public long readRawLittleEndian64() throws IOException {
            long rawByte;
            byte rawByte2;
            if (currentRemaining() >= 8) {
                long j = this.f32008t;
                this.f32008t = 8 + j;
                rawByte = (((long) evh.m10296s(j)) & 255) | ((((long) evh.m10296s(1 + j)) & 255) << 8) | ((((long) evh.m10296s(2 + j)) & 255) << 16) | ((((long) evh.m10296s(3 + j)) & 255) << 24) | ((((long) evh.m10296s(4 + j)) & 255) << 32) | ((((long) evh.m10296s(5 + j)) & 255) << 40) | ((((long) evh.m10296s(6 + j)) & 255) << 48);
                rawByte2 = evh.m10296s(j + 7);
            } else {
                rawByte = (((long) readRawByte()) & 255) | ((((long) readRawByte()) & 255) << 8) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48);
                rawByte2 = readRawByte();
            }
            return ((((long) rawByte2) & 255) << 56) | rawByte;
        }

        @Override // p000.e72
        public int readRawVarint32() throws IOException {
            int i;
            long j = this.f32008t;
            if (this.f32011w != j) {
                long j2 = j + 1;
                byte bM10296s = evh.m10296s(j);
                if (bM10296s >= 0) {
                    this.f32008t++;
                    return bM10296s;
                }
                if (this.f32011w - this.f32008t >= 10) {
                    long j3 = 2 + j;
                    int iM10296s = (evh.m10296s(j2) << 7) ^ bM10296s;
                    if (iM10296s < 0) {
                        i = iM10296s ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int iM10296s2 = (evh.m10296s(j3) << 14) ^ iM10296s;
                        if (iM10296s2 >= 0) {
                            i = iM10296s2 ^ 16256;
                        } else {
                            long j5 = 4 + j;
                            int iM10296s3 = iM10296s2 ^ (evh.m10296s(j4) << 21);
                            if (iM10296s3 < 0) {
                                i = (-2080896) ^ iM10296s3;
                            } else {
                                j4 = 5 + j;
                                byte bM10296s2 = evh.m10296s(j5);
                                int i2 = (iM10296s3 ^ (bM10296s2 << 28)) ^ 266354560;
                                if (bM10296s2 < 0) {
                                    j5 = 6 + j;
                                    if (evh.m10296s(j4) < 0) {
                                        j4 = 7 + j;
                                        if (evh.m10296s(j5) < 0) {
                                            j5 = 8 + j;
                                            if (evh.m10296s(j4) < 0) {
                                                j4 = 9 + j;
                                                if (evh.m10296s(j5) < 0) {
                                                    long j6 = j + 10;
                                                    if (evh.m10296s(j4) >= 0) {
                                                        i = i2;
                                                        j3 = j6;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                            j3 = j5;
                        }
                        j3 = j4;
                    }
                    this.f32008t = j3;
                    return i;
                }
            }
            return (int) mo9779f();
        }

        @Override // p000.e72
        public long readRawVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            long j4 = this.f32008t;
            if (this.f32011w != j4) {
                long j5 = j4 + 1;
                byte bM10296s = evh.m10296s(j4);
                if (bM10296s >= 0) {
                    this.f32008t++;
                    return bM10296s;
                }
                if (this.f32011w - this.f32008t >= 10) {
                    long j6 = 2 + j4;
                    int iM10296s = (evh.m10296s(j5) << 7) ^ bM10296s;
                    if (iM10296s < 0) {
                        j = iM10296s ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int iM10296s2 = (evh.m10296s(j6) << 14) ^ iM10296s;
                        if (iM10296s2 >= 0) {
                            j = iM10296s2 ^ 16256;
                            j6 = j7;
                        } else {
                            long j8 = 4 + j4;
                            int iM10296s3 = iM10296s2 ^ (evh.m10296s(j7) << 21);
                            if (iM10296s3 < 0) {
                                j = (-2080896) ^ iM10296s3;
                                j6 = j8;
                            } else {
                                long j9 = 5 + j4;
                                long jM10296s = (((long) evh.m10296s(j8)) << 28) ^ ((long) iM10296s3);
                                if (jM10296s >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j10 = 6 + j4;
                                    long jM10296s2 = jM10296s ^ (((long) evh.m10296s(j9)) << 35);
                                    if (jM10296s2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j9 = 7 + j4;
                                        jM10296s = jM10296s2 ^ (((long) evh.m10296s(j10)) << 42);
                                        if (jM10296s >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j10 = 8 + j4;
                                            jM10296s2 = jM10296s ^ (((long) evh.m10296s(j9)) << 49);
                                            if (jM10296s2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j9 = 9 + j4;
                                                long jM10296s3 = (jM10296s2 ^ (((long) evh.m10296s(j10)) << 56)) ^ 71499008037633920L;
                                                if (jM10296s3 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (evh.m10296s(j9) >= 0) {
                                                        j = jM10296s3;
                                                        j6 = j11;
                                                    }
                                                } else {
                                                    j = jM10296s3;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jM10296s2;
                                    j6 = j10;
                                }
                                j = j3 ^ jM10296s;
                                j6 = j9;
                            }
                        }
                    }
                    this.f32008t = j6;
                    return j;
                }
            }
            return mo9779f();
        }

        @Override // p000.e72
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.e72
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.e72
        public int readSInt32() throws IOException {
            return e72.decodeZigZag32(readRawVarint32());
        }

        @Override // p000.e72
        public long readSInt64() throws IOException {
            return e72.decodeZigZag64(readRawVarint64());
        }

        @Override // p000.e72
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                long j2 = this.f32011w;
                long j3 = this.f32008t;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[rawVarint32];
                    evh.m10290m(j3, bArr, 0L, j);
                    String str = new String(bArr, v98.f90380b);
                    this.f32008t += j;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return new String(bArr2, v98.f90380b);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw be8.m3080g();
            }
            throw be8.m3084l();
        }

        @Override // p000.e72
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                long j2 = this.f32011w;
                long j3 = this.f32008t;
                if (j <= j2 - j3) {
                    String strM16489g = lzh.m16489g(this.f31999k, (int) (j3 - this.f32009u), rawVarint32);
                    this.f32008t += j;
                    return strM16489g;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= remaining()) {
                byte[] bArr = new byte[rawVarint32];
                readRawBytesTo(bArr, 0, rawVarint32);
                return lzh.m16490h(bArr, 0, rawVarint32);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw be8.m3080g();
            }
            throw be8.m3084l();
        }

        @Override // p000.e72
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.f32005q = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f32005q = rawVarint32;
            if (gpi.getTagFieldNumber(rawVarint32) != 0) {
                return this.f32005q;
            }
            throw be8.m3076c();
        }

        @Override // p000.e72
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.e72
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.e72
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final psa.InterfaceC11106a builder) throws IOException {
            readGroup(fieldNumber, builder, yi5.getEmptyRegistry());
        }

        @Override // p000.e72
        public void resetSizeCounter() {
            this.f32007s = (int) ((((long) this.f32006r) + this.f32008t) - this.f32009u);
        }

        @Override // p000.e72
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = gpi.getTagWireType(tag);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(gpi.m11819a(gpi.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw be8.m3078e();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // p000.e72
        public void skipRawBytes(final int length) throws IOException {
            if (length < 0 || length > (((long) (this.f32002n - this.f32006r)) - this.f32008t) + this.f32009u) {
                if (length >= 0) {
                    throw be8.m3084l();
                }
                throw be8.m3080g();
            }
            while (length > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(length, (int) currentRemaining());
                length -= iMin;
                this.f32008t += (long) iMin;
            }
        }

        private C5154c(Iterable<ByteBuffer> inputBufs, int size, boolean immutableFlag) {
            super();
            this.f32004p = Integer.MAX_VALUE;
            this.f32002n = size;
            this.f31997i = inputBufs;
            this.f31998j = inputBufs.iterator();
            this.f32000l = immutableFlag;
            this.f32006r = 0;
            this.f32007s = 0;
            if (size != 0) {
                tryGetNextByteBuffer();
                return;
            }
            this.f31999k = v98.f90384f;
            this.f32008t = 0L;
            this.f32009u = 0L;
            this.f32011w = 0L;
            this.f32010v = 0L;
        }

        @Override // p000.e72
        public <T extends psa> T readGroup(final int fieldNumber, final vhc<T> parser, final yi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f31983a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(gpi.m11819a(fieldNumber, 4));
            this.f31983a--;
            return partialFrom;
        }

        @Override // p000.e72
        public boolean skipField(final int tag, final i72 output) throws IOException {
            int tagWireType = gpi.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                wj1 bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iM11819a = gpi.m11819a(gpi.getTagFieldNumber(tag), 4);
                checkLastTagWas(iM11819a);
                output.writeUInt32NoTag(iM11819a);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw be8.m3078e();
        }

        @Override // p000.e72
        public <T extends psa> T readMessage(final vhc<T> parser, final yi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f31983a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f31983a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw be8.m3084l();
        }
    }

    /* JADX INFO: renamed from: e72$d */
    public static final class C5155d extends e72 {

        /* JADX INFO: renamed from: i */
        public final InputStream f32012i;

        /* JADX INFO: renamed from: j */
        public final byte[] f32013j;

        /* JADX INFO: renamed from: k */
        public int f32014k;

        /* JADX INFO: renamed from: l */
        public int f32015l;

        /* JADX INFO: renamed from: m */
        public int f32016m;

        /* JADX INFO: renamed from: n */
        public int f32017n;

        /* JADX INFO: renamed from: o */
        public int f32018o;

        /* JADX INFO: renamed from: p */
        public int f32019p;

        /* JADX INFO: renamed from: q */
        public a f32020q;

        /* JADX INFO: renamed from: e72$d$a */
        public interface a {
            void onRefill();
        }

        /* JADX INFO: renamed from: e72$d$b */
        public class b implements a {

            /* JADX INFO: renamed from: a */
            public int f32021a;

            /* JADX INFO: renamed from: b */
            public ByteArrayOutputStream f32022b;

            private b() {
                this.f32021a = C5155d.this.f32016m;
            }

            /* JADX INFO: renamed from: a */
            public ByteBuffer m9784a() {
                ByteArrayOutputStream byteArrayOutputStream = this.f32022b;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(C5155d.this.f32013j, this.f32021a, C5155d.this.f32016m - this.f32021a);
                }
                byteArrayOutputStream.write(C5155d.this.f32013j, this.f32021a, C5155d.this.f32016m);
                return ByteBuffer.wrap(this.f32022b.toByteArray());
            }

            @Override // p000.e72.C5155d.a
            public void onRefill() {
                if (this.f32022b == null) {
                    this.f32022b = new ByteArrayOutputStream();
                }
                this.f32022b.write(C5155d.this.f32013j, this.f32021a, C5155d.this.f32016m - this.f32021a);
                this.f32021a = 0;
            }
        }

        private static int available(InputStream input) throws IOException {
            try {
                return input.available();
            } catch (be8 e) {
                e.m3086j();
                throw e;
            }
        }

        private static int read(InputStream input, byte[] data, int offset, int length) throws IOException {
            try {
                return input.read(data, offset, length);
            } catch (be8 e) {
                e.m3086j();
                throw e;
            }
        }

        private wj1 readBytesSlowPath(final int size) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(size);
            if (rawBytesSlowPathOneChunk != null) {
                return wj1.copyFrom(rawBytesSlowPathOneChunk);
            }
            int i = this.f32016m;
            int i2 = this.f32014k;
            int length = i2 - i;
            this.f32018o += i2;
            this.f32016m = 0;
            this.f32014k = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(size - length);
            byte[] bArr = new byte[size];
            System.arraycopy(this.f32013j, i, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return wj1.m24595n(bArr);
        }

        private byte[] readRawBytesSlowPath(final int size, boolean ensureNoLeakedReferences) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(size);
            if (rawBytesSlowPathOneChunk != null) {
                return ensureNoLeakedReferences ? (byte[]) rawBytesSlowPathOneChunk.clone() : rawBytesSlowPathOneChunk;
            }
            int i = this.f32016m;
            int i2 = this.f32014k;
            int length = i2 - i;
            this.f32018o += i2;
            this.f32016m = 0;
            this.f32014k = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(size - length);
            byte[] bArr = new byte[size];
            System.arraycopy(this.f32013j, i, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(final int size) throws IOException {
            if (size == 0) {
                return v98.f90383e;
            }
            if (size < 0) {
                throw be8.m3080g();
            }
            int i = this.f32018o;
            int i2 = this.f32016m;
            int i3 = i + i2 + size;
            if (i3 - this.f31985c > 0) {
                throw be8.m3083k();
            }
            int i4 = this.f32019p;
            if (i3 > i4) {
                skipRawBytes((i4 - i) - i2);
                throw be8.m3084l();
            }
            int i5 = this.f32014k - i2;
            int i6 = size - i5;
            if (i6 >= 4096 && i6 > available(this.f32012i)) {
                return null;
            }
            byte[] bArr = new byte[size];
            System.arraycopy(this.f32013j, this.f32016m, bArr, 0, i5);
            this.f32018o += this.f32014k;
            this.f32016m = 0;
            this.f32014k = 0;
            while (i5 < size) {
                int i7 = read(this.f32012i, bArr, i5, size - i5);
                if (i7 == -1) {
                    throw be8.m3084l();
                }
                this.f32018o += i7;
                i5 += i7;
            }
            return bArr;
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int sizeLeft) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (sizeLeft > 0) {
                int iMin = Math.min(sizeLeft, 4096);
                byte[] bArr = new byte[iMin];
                int i = 0;
                while (i < iMin) {
                    int i2 = this.f32012i.read(bArr, i, iMin - i);
                    if (i2 == -1) {
                        throw be8.m3084l();
                    }
                    this.f32018o += i2;
                    i += i2;
                }
                sizeLeft -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i = this.f32014k + this.f32015l;
            this.f32014k = i;
            int i2 = this.f32018o + i;
            int i3 = this.f32019p;
            if (i2 <= i3) {
                this.f32015l = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f32015l = i4;
            this.f32014k = i - i4;
        }

        private void refillBuffer(int n) throws IOException {
            if (tryRefillBuffer(n)) {
                return;
            }
            if (n <= (this.f31985c - this.f32018o) - this.f32016m) {
                throw be8.m3084l();
            }
            throw be8.m3083k();
        }

        private static long skip(InputStream input, long length) throws IOException {
            try {
                return input.skip(length);
            } catch (be8 e) {
                e.m3086j();
                throw e;
            }
        }

        private void skipRawBytesSlowPath(final int size) throws IOException {
            if (size < 0) {
                throw be8.m3080g();
            }
            int i = this.f32018o;
            int i2 = this.f32016m;
            int i3 = i + i2 + size;
            int i4 = this.f32019p;
            if (i3 > i4) {
                skipRawBytes((i4 - i) - i2);
                throw be8.m3084l();
            }
            int i5 = 0;
            if (this.f32020q == null) {
                this.f32018o = i + i2;
                int i6 = this.f32014k - i2;
                this.f32014k = 0;
                this.f32016m = 0;
                i5 = i6;
                while (i5 < size) {
                    try {
                        long j = size - i5;
                        long jSkip = skip(this.f32012i, j);
                        if (jSkip < 0 || jSkip > j) {
                            throw new IllegalStateException(this.f32012i.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i5 += (int) jSkip;
                        }
                    } finally {
                        this.f32018o += i5;
                        recomputeBufferSizeAfterLimit();
                    }
                }
            }
            if (i5 >= size) {
                return;
            }
            int i7 = this.f32014k;
            int i8 = i7 - this.f32016m;
            this.f32016m = i7;
            refillBuffer(1);
            while (true) {
                int i9 = size - i8;
                int i10 = this.f32014k;
                if (i9 <= i10) {
                    this.f32016m = i9;
                    return;
                } else {
                    i8 += i10;
                    this.f32016m = i10;
                    refillBuffer(1);
                }
            }
        }

        private void skipRawVarint() throws IOException {
            if (this.f32014k - this.f32016m >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f32013j;
                int i2 = this.f32016m;
                this.f32016m = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw be8.m3079f();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw be8.m3079f();
        }

        private boolean tryRefillBuffer(int n) throws IOException {
            int i = this.f32016m;
            if (i + n <= this.f32014k) {
                throw new IllegalStateException("refillBuffer() called when " + n + " bytes were already available in buffer");
            }
            int i2 = this.f31985c;
            int i3 = this.f32018o;
            if (n > (i2 - i3) - i || i3 + i + n > this.f32019p) {
                return false;
            }
            a aVar = this.f32020q;
            if (aVar != null) {
                aVar.onRefill();
            }
            int i4 = this.f32016m;
            if (i4 > 0) {
                int i5 = this.f32014k;
                if (i5 > i4) {
                    byte[] bArr = this.f32013j;
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.f32018o += i4;
                this.f32014k -= i4;
                this.f32016m = 0;
            }
            InputStream inputStream = this.f32012i;
            byte[] bArr2 = this.f32013j;
            int i6 = this.f32014k;
            int i7 = read(inputStream, bArr2, i6, Math.min(bArr2.length - i6, (this.f31985c - this.f32018o) - i6));
            if (i7 == 0 || i7 < -1 || i7 > this.f32013j.length) {
                throw new IllegalStateException(this.f32012i.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
            }
            if (i7 <= 0) {
                return false;
            }
            this.f32014k += i7;
            recomputeBufferSizeAfterLimit();
            if (this.f32014k >= n) {
                return true;
            }
            return tryRefillBuffer(n);
        }

        @Override // p000.e72
        public void checkLastTagWas(final int value) throws be8 {
            if (this.f32017n != value) {
                throw be8.m3075b();
            }
        }

        @Override // p000.e72
        public void enableAliasing(boolean enabled) {
        }

        @Override // p000.e72
        /* JADX INFO: renamed from: f */
        public long mo9779f() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw be8.m3079f();
        }

        @Override // p000.e72
        public int getBytesUntilLimit() {
            int i = this.f32019p;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.f32018o + this.f32016m);
        }

        @Override // p000.e72
        public int getLastTag() {
            return this.f32017n;
        }

        @Override // p000.e72
        public int getTotalBytesRead() {
            return this.f32018o + this.f32016m;
        }

        @Override // p000.e72
        public boolean isAtEnd() throws IOException {
            return this.f32016m == this.f32014k && !tryRefillBuffer(1);
        }

        @Override // p000.e72
        public void popLimit(final int oldLimit) {
            this.f32019p = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // p000.e72
        public int pushLimit(int byteLimit) throws be8 {
            if (byteLimit < 0) {
                throw be8.m3080g();
            }
            int i = byteLimit + this.f32018o + this.f32016m;
            if (i < 0) {
                throw be8.m3081h();
            }
            int i2 = this.f32019p;
            if (i > i2) {
                throw be8.m3084l();
            }
            this.f32019p = i;
            recomputeBufferSizeAfterLimit();
            return i2;
        }

        @Override // p000.e72
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // p000.e72
        public byte[] readByteArray() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.f32014k;
            int i2 = this.f32016m;
            if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
                if (rawVarint32 >= 0) {
                    return readRawBytesSlowPath(rawVarint32, false);
                }
                throw be8.m3080g();
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f32013j, i2, i2 + rawVarint32);
            this.f32016m += rawVarint32;
            return bArrCopyOfRange;
        }

        @Override // p000.e72
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.f32014k;
            int i2 = this.f32016m;
            if (rawVarint32 <= i - i2 && rawVarint32 > 0) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f32013j, i2, i2 + rawVarint32));
                this.f32016m += rawVarint32;
                return byteBufferWrap;
            }
            if (rawVarint32 == 0) {
                return v98.f90384f;
            }
            if (rawVarint32 >= 0) {
                return ByteBuffer.wrap(readRawBytesSlowPath(rawVarint32, true));
            }
            throw be8.m3080g();
        }

        @Override // p000.e72
        public wj1 readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.f32014k;
            int i2 = this.f32016m;
            if (rawVarint32 <= i - i2 && rawVarint32 > 0) {
                wj1 wj1VarCopyFrom = wj1.copyFrom(this.f32013j, i2, rawVarint32);
                this.f32016m += rawVarint32;
                return wj1VarCopyFrom;
            }
            if (rawVarint32 == 0) {
                return wj1.f94379e;
            }
            if (rawVarint32 >= 0) {
                return readBytesSlowPath(rawVarint32);
            }
            throw be8.m3080g();
        }

        @Override // p000.e72
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // p000.e72
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.e72
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.e72
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.e72
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // p000.e72
        public void readGroup(final int fieldNumber, final psa.InterfaceC11106a builder, final yi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f31983a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(gpi.m11819a(fieldNumber, 4));
            this.f31983a--;
        }

        @Override // p000.e72
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.e72
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.e72
        public void readMessage(final psa.InterfaceC11106a builder, final yi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f31983a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f31983a--;
            if (getBytesUntilLimit() != 0) {
                throw be8.m3084l();
            }
            popLimit(iPushLimit);
        }

        @Override // p000.e72
        public byte readRawByte() throws IOException {
            if (this.f32016m == this.f32014k) {
                refillBuffer(1);
            }
            byte[] bArr = this.f32013j;
            int i = this.f32016m;
            this.f32016m = i + 1;
            return bArr[i];
        }

        @Override // p000.e72
        public byte[] readRawBytes(final int size) throws IOException {
            int i = this.f32016m;
            if (size > this.f32014k - i || size <= 0) {
                return readRawBytesSlowPath(size, false);
            }
            int i2 = size + i;
            this.f32016m = i2;
            return Arrays.copyOfRange(this.f32013j, i, i2);
        }

        @Override // p000.e72
        public int readRawLittleEndian32() throws IOException {
            int i = this.f32016m;
            if (this.f32014k - i < 4) {
                refillBuffer(4);
                i = this.f32016m;
            }
            byte[] bArr = this.f32013j;
            this.f32016m = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // p000.e72
        public long readRawLittleEndian64() throws IOException {
            int i = this.f32016m;
            if (this.f32014k - i < 8) {
                refillBuffer(8);
                i = this.f32016m;
            }
            byte[] bArr = this.f32013j;
            this.f32016m = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        @Override // p000.e72
        public int readRawVarint32() throws IOException {
            int i;
            int i2 = this.f32016m;
            int i3 = this.f32014k;
            if (i3 != i2) {
                byte[] bArr = this.f32013j;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f32016m = i4;
                    return b2;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b2;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b3 = bArr[i9];
                                int i11 = (i10 ^ (b3 << 28)) ^ 266354560;
                                if (b3 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.f32016m = i5;
                    return i;
                }
            }
            return (int) mo9779f();
        }

        @Override // p000.e72
        public long readRawVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f32016m;
            int i2 = this.f32014k;
            if (i2 != i) {
                byte[] bArr = this.f32013j;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f32016m = i3;
                    return b2;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b2;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i10]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.f32016m = i4;
                    return j;
                }
            }
            return mo9779f();
        }

        @Override // p000.e72
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.e72
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.e72
        public int readSInt32() throws IOException {
            return e72.decodeZigZag32(readRawVarint32());
        }

        @Override // p000.e72
        public long readSInt64() throws IOException {
            return e72.decodeZigZag64(readRawVarint64());
        }

        @Override // p000.e72
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.f32014k;
                int i2 = this.f32016m;
                if (rawVarint32 <= i - i2) {
                    String str = new String(this.f32013j, i2, rawVarint32, v98.f90380b);
                    this.f32016m += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw be8.m3080g();
            }
            if (rawVarint32 > this.f32014k) {
                return new String(readRawBytesSlowPath(rawVarint32, false), v98.f90380b);
            }
            refillBuffer(rawVarint32);
            String str2 = new String(this.f32013j, this.f32016m, rawVarint32, v98.f90380b);
            this.f32016m += rawVarint32;
            return str2;
        }

        @Override // p000.e72
        public String readStringRequireUtf8() throws IOException {
            byte[] rawBytesSlowPath;
            int rawVarint32 = readRawVarint32();
            int i = this.f32016m;
            int i2 = this.f32014k;
            if (rawVarint32 <= i2 - i && rawVarint32 > 0) {
                rawBytesSlowPath = this.f32013j;
                this.f32016m = i + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw be8.m3080g();
                }
                i = 0;
                if (rawVarint32 <= i2) {
                    refillBuffer(rawVarint32);
                    rawBytesSlowPath = this.f32013j;
                    this.f32016m = rawVarint32;
                } else {
                    rawBytesSlowPath = readRawBytesSlowPath(rawVarint32, false);
                }
            }
            return lzh.m16490h(rawBytesSlowPath, i, rawVarint32);
        }

        @Override // p000.e72
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.f32017n = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f32017n = rawVarint32;
            if (gpi.getTagFieldNumber(rawVarint32) != 0) {
                return this.f32017n;
            }
            throw be8.m3076c();
        }

        @Override // p000.e72
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.e72
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.e72
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final psa.InterfaceC11106a builder) throws IOException {
            readGroup(fieldNumber, builder, yi5.getEmptyRegistry());
        }

        @Override // p000.e72
        public void resetSizeCounter() {
            this.f32018o = -this.f32016m;
        }

        @Override // p000.e72
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = gpi.getTagWireType(tag);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(gpi.m11819a(gpi.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw be8.m3078e();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // p000.e72
        public void skipRawBytes(final int size) throws IOException {
            int i = this.f32014k;
            int i2 = this.f32016m;
            if (size > i - i2 || size < 0) {
                skipRawBytesSlowPath(size);
            } else {
                this.f32016m = i2 + size;
            }
        }

        private C5155d(final InputStream input, int bufferSize) {
            super();
            this.f32019p = Integer.MAX_VALUE;
            this.f32020q = null;
            v98.m23882b(input, "input");
            this.f32012i = input;
            this.f32013j = new byte[bufferSize];
            this.f32014k = 0;
            this.f32016m = 0;
            this.f32018o = 0;
        }

        @Override // p000.e72
        public <T extends psa> T readGroup(final int fieldNumber, final vhc<T> parser, final yi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f31983a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(gpi.m11819a(fieldNumber, 4));
            this.f31983a--;
            return partialFrom;
        }

        @Override // p000.e72
        public boolean skipField(final int tag, final i72 output) throws IOException {
            int tagWireType = gpi.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                wj1 bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iM11819a = gpi.m11819a(gpi.getTagFieldNumber(tag), 4);
                checkLastTagWas(iM11819a);
                output.writeUInt32NoTag(iM11819a);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw be8.m3078e();
        }

        @Override // p000.e72
        public <T extends psa> T readMessage(final vhc<T> parser, final yi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f31983a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f31983a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw be8.m3084l();
        }
    }

    /* JADX INFO: renamed from: e72$e */
    public static final class C5156e extends e72 {

        /* JADX INFO: renamed from: i */
        public final ByteBuffer f32024i;

        /* JADX INFO: renamed from: j */
        public final boolean f32025j;

        /* JADX INFO: renamed from: k */
        public final long f32026k;

        /* JADX INFO: renamed from: l */
        public long f32027l;

        /* JADX INFO: renamed from: m */
        public long f32028m;

        /* JADX INFO: renamed from: n */
        public long f32029n;

        /* JADX INFO: renamed from: o */
        public int f32030o;

        /* JADX INFO: renamed from: p */
        public int f32031p;

        /* JADX INFO: renamed from: q */
        public boolean f32032q;

        /* JADX INFO: renamed from: r */
        public int f32033r;

        private int bufferPos(long pos) {
            return (int) (pos - this.f32026k);
        }

        /* JADX INFO: renamed from: i */
        public static boolean m9785i() {
            return evh.m10257K();
        }

        private void recomputeBufferSizeAfterLimit() {
            long j = this.f32027l + ((long) this.f32030o);
            this.f32027l = j;
            int i = (int) (j - this.f32029n);
            int i2 = this.f32033r;
            if (i <= i2) {
                this.f32030o = 0;
                return;
            }
            int i3 = i - i2;
            this.f32030o = i3;
            this.f32027l = j - ((long) i3);
        }

        private int remaining() {
            return (int) (this.f32027l - this.f32028m);
        }

        private void skipRawVarint() throws IOException {
            if (remaining() >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                long j = this.f32028m;
                this.f32028m = 1 + j;
                if (evh.m10296s(j) >= 0) {
                    return;
                }
            }
            throw be8.m3079f();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw be8.m3079f();
        }

        private ByteBuffer slice(long begin, long end) throws IOException {
            int iPosition = this.f32024i.position();
            int iLimit = this.f32024i.limit();
            ByteBuffer byteBuffer = this.f32024i;
            try {
                try {
                    byteBuffer.position(bufferPos(begin));
                    byteBuffer.limit(bufferPos(end));
                    return this.f32024i.slice();
                } catch (IllegalArgumentException e) {
                    be8 be8VarM3084l = be8.m3084l();
                    be8VarM3084l.initCause(e);
                    throw be8VarM3084l;
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        @Override // p000.e72
        public void checkLastTagWas(final int value) throws be8 {
            if (this.f32031p != value) {
                throw be8.m3075b();
            }
        }

        @Override // p000.e72
        public void enableAliasing(boolean enabled) {
            this.f32032q = enabled;
        }

        @Override // p000.e72
        /* JADX INFO: renamed from: f */
        public long mo9779f() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw be8.m3079f();
        }

        @Override // p000.e72
        public int getBytesUntilLimit() {
            int i = this.f32033r;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // p000.e72
        public int getLastTag() {
            return this.f32031p;
        }

        @Override // p000.e72
        public int getTotalBytesRead() {
            return (int) (this.f32028m - this.f32029n);
        }

        @Override // p000.e72
        public boolean isAtEnd() throws IOException {
            return this.f32028m == this.f32027l;
        }

        @Override // p000.e72
        public void popLimit(final int oldLimit) {
            this.f32033r = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // p000.e72
        public int pushLimit(int byteLimit) throws be8 {
            if (byteLimit < 0) {
                throw be8.m3080g();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            int i = this.f32033r;
            if (totalBytesRead > i) {
                throw be8.m3084l();
            }
            this.f32033r = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i;
        }

        @Override // p000.e72
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // p000.e72
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // p000.e72
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return v98.f90384f;
                }
                if (rawVarint32 < 0) {
                    throw be8.m3080g();
                }
                throw be8.m3084l();
            }
            if (this.f32025j || !this.f32032q) {
                byte[] bArr = new byte[rawVarint32];
                long j = rawVarint32;
                evh.m10290m(this.f32028m, bArr, 0L, j);
                this.f32028m += j;
                return ByteBuffer.wrap(bArr);
            }
            long j2 = this.f32028m;
            long j3 = rawVarint32;
            ByteBuffer byteBufferSlice = slice(j2, j2 + j3);
            this.f32028m += j3;
            return byteBufferSlice;
        }

        @Override // p000.e72
        public wj1 readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return wj1.f94379e;
                }
                if (rawVarint32 < 0) {
                    throw be8.m3080g();
                }
                throw be8.m3084l();
            }
            if (this.f32025j && this.f32032q) {
                long j = this.f32028m;
                long j2 = rawVarint32;
                ByteBuffer byteBufferSlice = slice(j, j + j2);
                this.f32028m += j2;
                return wj1.m24594m(byteBufferSlice);
            }
            byte[] bArr = new byte[rawVarint32];
            long j3 = rawVarint32;
            evh.m10290m(this.f32028m, bArr, 0L, j3);
            this.f32028m += j3;
            return wj1.m24595n(bArr);
        }

        @Override // p000.e72
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // p000.e72
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.e72
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.e72
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.e72
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // p000.e72
        public void readGroup(final int fieldNumber, final psa.InterfaceC11106a builder, final yi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f31983a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(gpi.m11819a(fieldNumber, 4));
            this.f31983a--;
        }

        @Override // p000.e72
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.e72
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.e72
        public void readMessage(final psa.InterfaceC11106a builder, final yi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f31983a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f31983a--;
            if (getBytesUntilLimit() != 0) {
                throw be8.m3084l();
            }
            popLimit(iPushLimit);
        }

        @Override // p000.e72
        public byte readRawByte() throws IOException {
            long j = this.f32028m;
            if (j == this.f32027l) {
                throw be8.m3084l();
            }
            this.f32028m = 1 + j;
            return evh.m10296s(j);
        }

        @Override // p000.e72
        public byte[] readRawBytes(final int length) throws IOException {
            if (length < 0 || length > remaining()) {
                if (length > 0) {
                    throw be8.m3084l();
                }
                if (length == 0) {
                    return v98.f90383e;
                }
                throw be8.m3080g();
            }
            byte[] bArr = new byte[length];
            long j = this.f32028m;
            long j2 = length;
            slice(j, j + j2).get(bArr);
            this.f32028m += j2;
            return bArr;
        }

        @Override // p000.e72
        public int readRawLittleEndian32() throws IOException {
            long j = this.f32028m;
            if (this.f32027l - j < 4) {
                throw be8.m3084l();
            }
            this.f32028m = 4 + j;
            return ((evh.m10296s(j + 3) & 255) << 24) | (evh.m10296s(j) & 255) | ((evh.m10296s(1 + j) & 255) << 8) | ((evh.m10296s(2 + j) & 255) << 16);
        }

        @Override // p000.e72
        public long readRawLittleEndian64() throws IOException {
            long j = this.f32028m;
            if (this.f32027l - j < 8) {
                throw be8.m3084l();
            }
            this.f32028m = 8 + j;
            return ((((long) evh.m10296s(j + 7)) & 255) << 56) | (((long) evh.m10296s(j)) & 255) | ((((long) evh.m10296s(1 + j)) & 255) << 8) | ((((long) evh.m10296s(2 + j)) & 255) << 16) | ((((long) evh.m10296s(3 + j)) & 255) << 24) | ((((long) evh.m10296s(4 + j)) & 255) << 32) | ((((long) evh.m10296s(5 + j)) & 255) << 40) | ((((long) evh.m10296s(6 + j)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (p000.evh.m10296s(r3) < 0) goto L34;
         */
        @Override // p000.e72
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int readRawVarint32() throws java.io.IOException {
            /*
                r9 = this;
                long r0 = r9.f32028m
                long r2 = r9.f32027l
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = p000.evh.m10296s(r0)
                if (r4 < 0) goto L16
                r9.f32028m = r2
                return r4
            L16:
                long r5 = r9.f32027l
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = p000.evh.m10296s(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = p000.evh.m10296s(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = p000.evh.m10296s(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = p000.evh.m10296s(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = p000.evh.m10296s(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = p000.evh.m10296s(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = p000.evh.m10296s(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = p000.evh.m10296s(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = p000.evh.m10296s(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.mo9779f()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f32028m = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.e72.C5156e.readRawVarint32():int");
        }

        @Override // p000.e72
        public long readRawVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.f32028m;
            if (this.f32027l != j4) {
                long j5 = 1 + j4;
                byte bM10296s = evh.m10296s(j4);
                if (bM10296s >= 0) {
                    this.f32028m = j5;
                    return bM10296s;
                }
                if (this.f32027l - j5 >= 9) {
                    long j6 = 2 + j4;
                    int iM10296s = (evh.m10296s(j5) << 7) ^ bM10296s;
                    if (iM10296s >= 0) {
                        long j7 = 3 + j4;
                        int iM10296s2 = iM10296s ^ (evh.m10296s(j6) << 14);
                        if (iM10296s2 >= 0) {
                            j = iM10296s2 ^ 16256;
                            j6 = j7;
                        } else {
                            j6 = 4 + j4;
                            int iM10296s3 = iM10296s2 ^ (evh.m10296s(j7) << 21);
                            if (iM10296s3 < 0) {
                                i = (-2080896) ^ iM10296s3;
                            } else {
                                long j8 = 5 + j4;
                                long jM10296s = ((long) iM10296s3) ^ (((long) evh.m10296s(j6)) << 28);
                                if (jM10296s >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = 6 + j4;
                                    long jM10296s2 = jM10296s ^ (((long) evh.m10296s(j8)) << 35);
                                    if (jM10296s2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j8 = 7 + j4;
                                        jM10296s = jM10296s2 ^ (((long) evh.m10296s(j9)) << 42);
                                        if (jM10296s >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j4;
                                            jM10296s2 = jM10296s ^ (((long) evh.m10296s(j8)) << 49);
                                            if (jM10296s2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j10 = j4 + 9;
                                                long jM10296s3 = (jM10296s2 ^ (((long) evh.m10296s(j9)) << 56)) ^ 71499008037633920L;
                                                if (jM10296s3 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (evh.m10296s(j10) >= 0) {
                                                        j6 = j11;
                                                        j = jM10296s3;
                                                    }
                                                } else {
                                                    j = jM10296s3;
                                                    j6 = j10;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jM10296s2;
                                    j6 = j9;
                                }
                                j = j3 ^ jM10296s;
                                j6 = j8;
                            }
                        }
                        this.f32028m = j6;
                        return j;
                    }
                    i = iM10296s ^ (-128);
                    j = i;
                    this.f32028m = j6;
                    return j;
                }
            }
            return mo9779f();
        }

        @Override // p000.e72
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.e72
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.e72
        public int readSInt32() throws IOException {
            return e72.decodeZigZag32(readRawVarint32());
        }

        @Override // p000.e72
        public long readSInt64() throws IOException {
            return e72.decodeZigZag64(readRawVarint64());
        }

        @Override // p000.e72
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw be8.m3080g();
                }
                throw be8.m3084l();
            }
            byte[] bArr = new byte[rawVarint32];
            long j = rawVarint32;
            evh.m10290m(this.f32028m, bArr, 0L, j);
            String str = new String(bArr, v98.f90380b);
            this.f32028m += j;
            return str;
        }

        @Override // p000.e72
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                String strM16489g = lzh.m16489g(this.f32024i, bufferPos(this.f32028m), rawVarint32);
                this.f32028m += (long) rawVarint32;
                return strM16489g;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw be8.m3080g();
            }
            throw be8.m3084l();
        }

        @Override // p000.e72
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.f32031p = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f32031p = rawVarint32;
            if (gpi.getTagFieldNumber(rawVarint32) != 0) {
                return this.f32031p;
            }
            throw be8.m3076c();
        }

        @Override // p000.e72
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.e72
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.e72
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final psa.InterfaceC11106a builder) throws IOException {
            readGroup(fieldNumber, builder, yi5.getEmptyRegistry());
        }

        @Override // p000.e72
        public void resetSizeCounter() {
            this.f32029n = this.f32028m;
        }

        @Override // p000.e72
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = gpi.getTagWireType(tag);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(gpi.m11819a(gpi.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw be8.m3078e();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // p000.e72
        public void skipRawBytes(final int length) throws IOException {
            if (length >= 0 && length <= remaining()) {
                this.f32028m += (long) length;
            } else {
                if (length >= 0) {
                    throw be8.m3084l();
                }
                throw be8.m3080g();
            }
        }

        private C5156e(ByteBuffer buffer, boolean immutable) {
            super();
            this.f32033r = Integer.MAX_VALUE;
            this.f32024i = buffer;
            long jM10288k = evh.m10288k(buffer);
            this.f32026k = jM10288k;
            this.f32027l = ((long) buffer.limit()) + jM10288k;
            long jPosition = jM10288k + ((long) buffer.position());
            this.f32028m = jPosition;
            this.f32029n = jPosition;
            this.f32025j = immutable;
        }

        @Override // p000.e72
        public <T extends psa> T readGroup(final int fieldNumber, final vhc<T> parser, final yi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f31983a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(gpi.m11819a(fieldNumber, 4));
            this.f31983a--;
            return partialFrom;
        }

        @Override // p000.e72
        public boolean skipField(final int tag, final i72 output) throws IOException {
            int tagWireType = gpi.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                wj1 bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iM11819a = gpi.m11819a(gpi.getTagFieldNumber(tag), 4);
                checkLastTagWas(iM11819a);
                output.writeUInt32NoTag(iM11819a);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw be8.m3078e();
        }

        @Override // p000.e72
        public <T extends psa> T readMessage(final vhc<T> parser, final yi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f31983a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f31983a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw be8.m3084l();
        }
    }

    /* JADX INFO: renamed from: b */
    public static e72 m9774b(final Iterable<ByteBuffer> bufs, final boolean bufferIsImmutable) {
        int i = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : bufs) {
            iRemaining += byteBuffer.remaining();
            i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
        }
        return i == 2 ? new C5154c(bufs, iRemaining, bufferIsImmutable) : newInstance(new ug8(bufs));
    }

    /* JADX INFO: renamed from: c */
    public static e72 m9775c(ByteBuffer buf, boolean bufferIsImmutable) {
        if (buf.hasArray()) {
            return m9776d(buf.array(), buf.arrayOffset() + buf.position(), buf.remaining(), bufferIsImmutable);
        }
        if (buf.isDirect() && C5156e.m9785i()) {
            return new C5156e(buf, bufferIsImmutable);
        }
        int iRemaining = buf.remaining();
        byte[] bArr = new byte[iRemaining];
        buf.duplicate().get(bArr);
        return m9776d(bArr, 0, iRemaining, true);
    }

    /* JADX INFO: renamed from: d */
    public static e72 m9776d(final byte[] buf, final int off, final int len, final boolean bufferIsImmutable) {
        C5153b c5153b = new C5153b(buf, off, len, bufferIsImmutable);
        try {
            c5153b.pushLimit(len);
            return c5153b;
        } catch (be8 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int decodeZigZag32(final int n) {
        return (-(n & 1)) ^ (n >>> 1);
    }

    public static long decodeZigZag64(final long n) {
        return (-(n & 1)) ^ (n >>> 1);
    }

    /* JADX INFO: renamed from: e */
    public static int m9777e(final InputStream input) throws IOException {
        int i = input.read();
        if (i != -1) {
            return readRawVarint32(i, input);
        }
        throw be8.m3084l();
    }

    public static e72 newInstance(final InputStream input) {
        return newInstance(input, 4096);
    }

    public static int readRawVarint32(final int firstByte, final InputStream input) throws IOException {
        if ((firstByte & 128) == 0) {
            return firstByte;
        }
        int i = firstByte & 127;
        int i2 = 7;
        while (i2 < 32) {
            int i3 = input.read();
            if (i3 == -1) {
                throw be8.m3084l();
            }
            i |= (i3 & 127) << i2;
            if ((i3 & 128) == 0) {
                return i;
            }
            i2 += 7;
        }
        while (i2 < 64) {
            int i4 = input.read();
            if (i4 == -1) {
                throw be8.m3084l();
            }
            if ((i4 & 128) == 0) {
                return i;
            }
            i2 += 7;
        }
        throw be8.m3079f();
    }

    /* JADX INFO: renamed from: a */
    public final void m9778a() {
        this.f31987e = true;
    }

    public abstract void checkLastTagWas(final int value) throws be8;

    public void checkRecursionLimit() throws be8 {
        if (this.f31983a >= this.f31984b) {
            throw be8.m3082i();
        }
    }

    public abstract void enableAliasing(boolean enabled);

    /* JADX INFO: renamed from: f */
    public abstract long mo9779f() throws IOException;

    /* JADX INFO: renamed from: g */
    public final boolean m9780g() {
        return this.f31987e;
    }

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    /* JADX INFO: renamed from: h */
    public final void m9781h() {
        this.f31987e = false;
    }

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(final int oldLimit);

    public abstract int pushLimit(int byteLimit) throws be8;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract wj1 readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends psa> T readGroup(final int fieldNumber, final vhc<T> parser, final yi5 extensionRegistry) throws IOException;

    public abstract void readGroup(final int fieldNumber, final psa.InterfaceC11106a builder, final yi5 extensionRegistry) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends psa> T readMessage(final vhc<T> parser, final yi5 extensionRegistry) throws IOException;

    public abstract void readMessage(final psa.InterfaceC11106a builder, final yi5 extensionRegistry) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(final int size) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(final int fieldNumber, final psa.InterfaceC11106a builder) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(final int limit) {
        if (limit >= 0) {
            int i = this.f31984b;
            this.f31984b = limit;
            return i;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + limit);
    }

    public final int setSizeLimit(final int limit) {
        if (limit >= 0) {
            int i = this.f31985c;
            this.f31985c = limit;
            return i;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + limit);
    }

    public abstract boolean skipField(final int tag) throws IOException;

    @Deprecated
    public abstract boolean skipField(final int tag, final i72 output) throws IOException;

    public void skipMessage() throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.f31983a++;
            this.f31983a--;
        } while (skipField(tag));
    }

    public abstract void skipRawBytes(final int size) throws IOException;

    private e72() {
        this.f31984b = f31982h;
        this.f31985c = Integer.MAX_VALUE;
        this.f31987e = false;
    }

    public static e72 newInstance(final InputStream input, int bufferSize) {
        if (bufferSize > 0) {
            return input == null ? newInstance(v98.f90383e) : new C5155d(input, bufferSize);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static e72 newInstance(final Iterable<ByteBuffer> input) {
        if (!C5156e.m9785i()) {
            return newInstance(new ug8(input));
        }
        return m9774b(input, false);
    }

    public void skipMessage(i72 output) throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.f31983a++;
            this.f31983a--;
        } while (skipField(tag, output));
    }

    public static e72 newInstance(final byte[] buf) {
        return newInstance(buf, 0, buf.length);
    }

    public static e72 newInstance(final byte[] buf, final int off, final int len) {
        return m9776d(buf, off, len, false);
    }

    public static e72 newInstance(ByteBuffer buf) {
        return m9775c(buf, false);
    }
}
