package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p000.qsa;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f72 {

    /* JADX INFO: renamed from: f */
    public static final int f35550f = 4096;

    /* JADX INFO: renamed from: g */
    public static final int f35551g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h */
    public static volatile int f35552h = 100;

    /* JADX INFO: renamed from: a */
    public int f35553a;

    /* JADX INFO: renamed from: b */
    public int f35554b;

    /* JADX INFO: renamed from: c */
    public int f35555c;

    /* JADX INFO: renamed from: d */
    public h72 f35556d;

    /* JADX INFO: renamed from: e */
    public boolean f35557e;

    /* JADX INFO: renamed from: f72$b */
    public static final class C5654b extends f72 {

        /* JADX INFO: renamed from: i */
        public final byte[] f35558i;

        /* JADX INFO: renamed from: j */
        public final boolean f35559j;

        /* JADX INFO: renamed from: k */
        public int f35560k;

        /* JADX INFO: renamed from: l */
        public int f35561l;

        /* JADX INFO: renamed from: m */
        public int f35562m;

        /* JADX INFO: renamed from: n */
        public int f35563n;

        /* JADX INFO: renamed from: o */
        public int f35564o;

        /* JADX INFO: renamed from: p */
        public boolean f35565p;

        /* JADX INFO: renamed from: q */
        public int f35566q;

        private void recomputeBufferSizeAfterLimit() {
            int i = this.f35560k + this.f35561l;
            this.f35560k = i;
            int i2 = i - this.f35563n;
            int i3 = this.f35566q;
            if (i2 <= i3) {
                this.f35561l = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f35561l = i4;
            this.f35560k = i - i4;
        }

        private void skipRawVarint() throws IOException {
            if (this.f35560k - this.f35562m >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f35558i;
                int i2 = this.f35562m;
                this.f35562m = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw ce8.m3923f();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw ce8.m3923f();
        }

        @Override // p000.f72
        public void checkLastTagWas(final int value) throws ce8 {
            if (this.f35564o != value) {
                throw ce8.m3919b();
            }
        }

        @Override // p000.f72
        public void enableAliasing(boolean enabled) {
            this.f35565p = enabled;
        }

        @Override // p000.f72
        /* JADX INFO: renamed from: f */
        public long mo10687f() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw ce8.m3923f();
        }

        @Override // p000.f72
        public int getBytesUntilLimit() {
            int i = this.f35566q;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // p000.f72
        public int getLastTag() {
            return this.f35564o;
        }

        @Override // p000.f72
        public int getTotalBytesRead() {
            return this.f35562m - this.f35563n;
        }

        @Override // p000.f72
        public boolean isAtEnd() throws IOException {
            return this.f35562m == this.f35560k;
        }

        @Override // p000.f72
        public void popLimit(final int oldLimit) {
            this.f35566q = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // p000.f72
        public int pushLimit(int byteLimit) throws ce8 {
            if (byteLimit < 0) {
                throw ce8.m3924g();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw ce8.m3925h();
            }
            int i = this.f35566q;
            if (totalBytesRead > i) {
                throw ce8.m3928l();
            }
            this.f35566q = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i;
        }

        @Override // p000.f72
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // p000.f72
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // p000.f72
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.f35560k;
                int i2 = this.f35562m;
                if (rawVarint32 <= i - i2) {
                    ByteBuffer byteBufferWrap = (this.f35559j || !this.f35565p) ? ByteBuffer.wrap(Arrays.copyOfRange(this.f35558i, i2, i2 + rawVarint32)) : ByteBuffer.wrap(this.f35558i, i2, rawVarint32).slice();
                    this.f35562m += rawVarint32;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32 == 0) {
                return w98.f93678f;
            }
            if (rawVarint32 < 0) {
                throw ce8.m3924g();
            }
            throw ce8.m3928l();
        }

        @Override // p000.f72
        public vj1 readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.f35560k;
                int i2 = this.f35562m;
                if (rawVarint32 <= i - i2) {
                    vj1 vj1VarM24019n = (this.f35559j && this.f35565p) ? vj1.m24019n(this.f35558i, i2, rawVarint32) : vj1.copyFrom(this.f35558i, i2, rawVarint32);
                    this.f35562m += rawVarint32;
                    return vj1VarM24019n;
                }
            }
            return rawVarint32 == 0 ? vj1.f91344e : vj1.m24018m(readRawBytes(rawVarint32));
        }

        @Override // p000.f72
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // p000.f72
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.f72
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.f72
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.f72
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // p000.f72
        public void readGroup(final int fieldNumber, final qsa.InterfaceC11668a builder, final zi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f35553a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(hpi.m12536a(fieldNumber, 4));
            this.f35553a--;
        }

        @Override // p000.f72
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.f72
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.f72
        public void readMessage(final qsa.InterfaceC11668a builder, final zi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f35553a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f35553a--;
            if (getBytesUntilLimit() != 0) {
                throw ce8.m3928l();
            }
            popLimit(iPushLimit);
        }

        @Override // p000.f72
        public byte readRawByte() throws IOException {
            int i = this.f35562m;
            if (i == this.f35560k) {
                throw ce8.m3928l();
            }
            byte[] bArr = this.f35558i;
            this.f35562m = i + 1;
            return bArr[i];
        }

        @Override // p000.f72
        public byte[] readRawBytes(final int length) throws IOException {
            if (length > 0) {
                int i = this.f35560k;
                int i2 = this.f35562m;
                if (length <= i - i2) {
                    int i3 = length + i2;
                    this.f35562m = i3;
                    return Arrays.copyOfRange(this.f35558i, i2, i3);
                }
            }
            if (length > 0) {
                throw ce8.m3928l();
            }
            if (length == 0) {
                return w98.f93677e;
            }
            throw ce8.m3924g();
        }

        @Override // p000.f72
        public int readRawLittleEndian32() throws IOException {
            int i = this.f35562m;
            if (this.f35560k - i < 4) {
                throw ce8.m3928l();
            }
            byte[] bArr = this.f35558i;
            this.f35562m = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // p000.f72
        public long readRawLittleEndian64() throws IOException {
            int i = this.f35562m;
            if (this.f35560k - i < 8) {
                throw ce8.m3928l();
            }
            byte[] bArr = this.f35558i;
            this.f35562m = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        @Override // p000.f72
        public int readRawVarint32() throws IOException {
            int i;
            int i2 = this.f35562m;
            int i3 = this.f35560k;
            if (i3 != i2) {
                byte[] bArr = this.f35558i;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f35562m = i4;
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
                    this.f35562m = i5;
                    return i;
                }
            }
            return (int) mo10687f();
        }

        @Override // p000.f72
        public long readRawVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f35562m;
            int i2 = this.f35560k;
            if (i2 != i) {
                byte[] bArr = this.f35558i;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f35562m = i3;
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
                    this.f35562m = i4;
                    return j;
                }
            }
            return mo10687f();
        }

        @Override // p000.f72
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.f72
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.f72
        public int readSInt32() throws IOException {
            return f72.decodeZigZag32(readRawVarint32());
        }

        @Override // p000.f72
        public long readSInt64() throws IOException {
            return f72.decodeZigZag64(readRawVarint64());
        }

        @Override // p000.f72
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.f35560k;
                int i2 = this.f35562m;
                if (rawVarint32 <= i - i2) {
                    String str = new String(this.f35558i, i2, rawVarint32, w98.f93674b);
                    this.f35562m += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw ce8.m3924g();
            }
            throw ce8.m3928l();
        }

        @Override // p000.f72
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.f35560k;
                int i2 = this.f35562m;
                if (rawVarint32 <= i - i2) {
                    String strM19868h = pzh.m19868h(this.f35558i, i2, rawVarint32);
                    this.f35562m += rawVarint32;
                    return strM19868h;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw ce8.m3924g();
            }
            throw ce8.m3928l();
        }

        @Override // p000.f72
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.f35564o = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f35564o = rawVarint32;
            if (hpi.getTagFieldNumber(rawVarint32) != 0) {
                return this.f35564o;
            }
            throw ce8.m3920c();
        }

        @Override // p000.f72
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.f72
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.f72
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final qsa.InterfaceC11668a builder) throws IOException {
            readGroup(fieldNumber, builder, zi5.getEmptyRegistry());
        }

        @Override // p000.f72
        public void resetSizeCounter() {
            this.f35563n = this.f35562m;
        }

        @Override // p000.f72
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = hpi.getTagWireType(tag);
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
                checkLastTagWas(hpi.m12536a(hpi.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw ce8.m3922e();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // p000.f72
        public void skipRawBytes(final int length) throws IOException {
            if (length >= 0) {
                int i = this.f35560k;
                int i2 = this.f35562m;
                if (length <= i - i2) {
                    this.f35562m = i2 + length;
                    return;
                }
            }
            if (length >= 0) {
                throw ce8.m3928l();
            }
            throw ce8.m3924g();
        }

        private C5654b(final byte[] buffer, final int offset, final int len, boolean immutable) {
            super();
            this.f35566q = Integer.MAX_VALUE;
            this.f35558i = buffer;
            this.f35560k = len + offset;
            this.f35562m = offset;
            this.f35563n = offset;
            this.f35559j = immutable;
        }

        @Override // p000.f72
        public <T extends qsa> T readGroup(final int fieldNumber, final uhc<T> parser, final zi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f35553a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(hpi.m12536a(fieldNumber, 4));
            this.f35553a--;
            return partialFrom;
        }

        @Override // p000.f72
        public boolean skipField(final int tag, final j72 output) throws IOException {
            int tagWireType = hpi.getTagWireType(tag);
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
                vj1 bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iM12536a = hpi.m12536a(hpi.getTagFieldNumber(tag), 4);
                checkLastTagWas(iM12536a);
                output.writeUInt32NoTag(iM12536a);
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
            throw ce8.m3922e();
        }

        @Override // p000.f72
        public <T extends qsa> T readMessage(final uhc<T> parser, final zi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f35553a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f35553a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw ce8.m3928l();
        }
    }

    /* JADX INFO: renamed from: f72$c */
    public static final class C5655c extends f72 {

        /* JADX INFO: renamed from: i */
        public final Iterable<ByteBuffer> f35567i;

        /* JADX INFO: renamed from: j */
        public final Iterator<ByteBuffer> f35568j;

        /* JADX INFO: renamed from: k */
        public ByteBuffer f35569k;

        /* JADX INFO: renamed from: l */
        public final boolean f35570l;

        /* JADX INFO: renamed from: m */
        public boolean f35571m;

        /* JADX INFO: renamed from: n */
        public int f35572n;

        /* JADX INFO: renamed from: o */
        public int f35573o;

        /* JADX INFO: renamed from: p */
        public int f35574p;

        /* JADX INFO: renamed from: q */
        public int f35575q;

        /* JADX INFO: renamed from: r */
        public int f35576r;

        /* JADX INFO: renamed from: s */
        public int f35577s;

        /* JADX INFO: renamed from: t */
        public long f35578t;

        /* JADX INFO: renamed from: u */
        public long f35579u;

        /* JADX INFO: renamed from: v */
        public long f35580v;

        /* JADX INFO: renamed from: w */
        public long f35581w;

        private long currentRemaining() {
            return this.f35581w - this.f35578t;
        }

        private void getNextByteBuffer() throws ce8 {
            if (!this.f35568j.hasNext()) {
                throw ce8.m3928l();
            }
            tryGetNextByteBuffer();
        }

        private void readRawBytesTo(byte[] bytes, int offset, final int length) throws IOException {
            if (length < 0 || length > remaining()) {
                if (length > 0) {
                    throw ce8.m3928l();
                }
                if (length != 0) {
                    throw ce8.m3924g();
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
                dvh.m9481m(this.f35578t, bytes, (length - i) + offset, j);
                i -= iMin;
                this.f35578t += j;
            }
        }

        private void recomputeBufferSizeAfterLimit() {
            int i = this.f35572n + this.f35573o;
            this.f35572n = i;
            int i2 = i - this.f35577s;
            int i3 = this.f35574p;
            if (i2 <= i3) {
                this.f35573o = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f35573o = i4;
            this.f35572n = i - i4;
        }

        private int remaining() {
            return (int) ((((long) (this.f35572n - this.f35576r)) - this.f35578t) + this.f35579u);
        }

        private void skipRawVarint() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw ce8.m3923f();
        }

        private ByteBuffer slice(int begin, int end) throws IOException {
            int iPosition = this.f35569k.position();
            int iLimit = this.f35569k.limit();
            ByteBuffer byteBuffer = this.f35569k;
            try {
                try {
                    byteBuffer.position(begin);
                    byteBuffer.limit(end);
                    return this.f35569k.slice();
                } catch (IllegalArgumentException unused) {
                    throw ce8.m3928l();
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        private void tryGetNextByteBuffer() {
            ByteBuffer next = this.f35568j.next();
            this.f35569k = next;
            this.f35576r += (int) (this.f35578t - this.f35579u);
            long jPosition = next.position();
            this.f35578t = jPosition;
            this.f35579u = jPosition;
            this.f35581w = this.f35569k.limit();
            long jM9479k = dvh.m9479k(this.f35569k);
            this.f35580v = jM9479k;
            this.f35578t += jM9479k;
            this.f35579u += jM9479k;
            this.f35581w += jM9479k;
        }

        @Override // p000.f72
        public void checkLastTagWas(final int value) throws ce8 {
            if (this.f35575q != value) {
                throw ce8.m3919b();
            }
        }

        @Override // p000.f72
        public void enableAliasing(boolean enabled) {
            this.f35571m = enabled;
        }

        @Override // p000.f72
        /* JADX INFO: renamed from: f */
        public long mo10687f() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw ce8.m3923f();
        }

        @Override // p000.f72
        public int getBytesUntilLimit() {
            int i = this.f35574p;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // p000.f72
        public int getLastTag() {
            return this.f35575q;
        }

        @Override // p000.f72
        public int getTotalBytesRead() {
            return (int) ((((long) (this.f35576r - this.f35577s)) + this.f35578t) - this.f35579u);
        }

        @Override // p000.f72
        public boolean isAtEnd() throws IOException {
            return (((long) this.f35576r) + this.f35578t) - this.f35579u == ((long) this.f35572n);
        }

        @Override // p000.f72
        public void popLimit(final int oldLimit) {
            this.f35574p = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // p000.f72
        public int pushLimit(int byteLimit) throws ce8 {
            if (byteLimit < 0) {
                throw ce8.m3924g();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            int i = this.f35574p;
            if (totalBytesRead > i) {
                throw ce8.m3928l();
            }
            this.f35574p = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i;
        }

        @Override // p000.f72
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // p000.f72
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // p000.f72
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                if (j <= currentRemaining()) {
                    if (this.f35570l || !this.f35571m) {
                        byte[] bArr = new byte[rawVarint32];
                        dvh.m9481m(this.f35578t, bArr, 0L, j);
                        this.f35578t += j;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j2 = this.f35578t + j;
                    this.f35578t = j2;
                    long j3 = this.f35580v;
                    return slice((int) ((j2 - j3) - j), (int) (j2 - j3));
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteBuffer.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return w98.f93678f;
            }
            if (rawVarint32 < 0) {
                throw ce8.m3924g();
            }
            throw ce8.m3928l();
        }

        @Override // p000.f72
        public vj1 readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                long j2 = this.f35581w;
                long j3 = this.f35578t;
                if (j <= j2 - j3) {
                    if (this.f35570l && this.f35571m) {
                        int i = (int) (j3 - this.f35580v);
                        vj1 vj1VarM24017l = vj1.m24017l(slice(i, rawVarint32 + i));
                        this.f35578t += j;
                        return vj1VarM24017l;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    dvh.m9481m(j3, bArr, 0L, j);
                    this.f35578t += j;
                    return vj1.m24018m(bArr);
                }
            }
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return vj1.f91344e;
                }
                if (rawVarint32 < 0) {
                    throw ce8.m3924g();
                }
                throw ce8.m3928l();
            }
            if (!this.f35570l || !this.f35571m) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return vj1.m24018m(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (rawVarint32 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(rawVarint32, (int) currentRemaining());
                int i2 = (int) (this.f35578t - this.f35580v);
                arrayList.add(vj1.m24017l(slice(i2, i2 + iMin)));
                rawVarint32 -= iMin;
                this.f35578t += (long) iMin;
            }
            return vj1.copyFrom(arrayList);
        }

        @Override // p000.f72
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // p000.f72
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.f72
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.f72
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.f72
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // p000.f72
        public void readGroup(final int fieldNumber, final qsa.InterfaceC11668a builder, final zi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f35553a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(hpi.m12536a(fieldNumber, 4));
            this.f35553a--;
        }

        @Override // p000.f72
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.f72
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.f72
        public void readMessage(final qsa.InterfaceC11668a builder, final zi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f35553a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f35553a--;
            if (getBytesUntilLimit() != 0) {
                throw ce8.m3928l();
            }
            popLimit(iPushLimit);
        }

        @Override // p000.f72
        public byte readRawByte() throws IOException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j = this.f35578t;
            this.f35578t = 1 + j;
            return dvh.m9487s(j);
        }

        @Override // p000.f72
        public byte[] readRawBytes(final int length) throws IOException {
            if (length >= 0) {
                long j = length;
                if (j <= currentRemaining()) {
                    byte[] bArr = new byte[length];
                    dvh.m9481m(this.f35578t, bArr, 0L, j);
                    this.f35578t += j;
                    return bArr;
                }
            }
            if (length >= 0 && length <= remaining()) {
                byte[] bArr2 = new byte[length];
                readRawBytesTo(bArr2, 0, length);
                return bArr2;
            }
            if (length > 0) {
                throw ce8.m3928l();
            }
            if (length == 0) {
                return w98.f93677e;
            }
            throw ce8.m3924g();
        }

        @Override // p000.f72
        public int readRawLittleEndian32() throws IOException {
            if (currentRemaining() < 4) {
                return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
            }
            long j = this.f35578t;
            this.f35578t = 4 + j;
            return ((dvh.m9487s(j + 3) & 255) << 24) | (dvh.m9487s(j) & 255) | ((dvh.m9487s(1 + j) & 255) << 8) | ((dvh.m9487s(2 + j) & 255) << 16);
        }

        @Override // p000.f72
        public long readRawLittleEndian64() throws IOException {
            long rawByte;
            byte rawByte2;
            if (currentRemaining() >= 8) {
                long j = this.f35578t;
                this.f35578t = 8 + j;
                rawByte = (((long) dvh.m9487s(j)) & 255) | ((((long) dvh.m9487s(1 + j)) & 255) << 8) | ((((long) dvh.m9487s(2 + j)) & 255) << 16) | ((((long) dvh.m9487s(3 + j)) & 255) << 24) | ((((long) dvh.m9487s(4 + j)) & 255) << 32) | ((((long) dvh.m9487s(5 + j)) & 255) << 40) | ((((long) dvh.m9487s(6 + j)) & 255) << 48);
                rawByte2 = dvh.m9487s(j + 7);
            } else {
                rawByte = (((long) readRawByte()) & 255) | ((((long) readRawByte()) & 255) << 8) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48);
                rawByte2 = readRawByte();
            }
            return ((((long) rawByte2) & 255) << 56) | rawByte;
        }

        @Override // p000.f72
        public int readRawVarint32() throws IOException {
            int i;
            long j = this.f35578t;
            if (this.f35581w != j) {
                long j2 = j + 1;
                byte bM9487s = dvh.m9487s(j);
                if (bM9487s >= 0) {
                    this.f35578t++;
                    return bM9487s;
                }
                if (this.f35581w - this.f35578t >= 10) {
                    long j3 = 2 + j;
                    int iM9487s = (dvh.m9487s(j2) << 7) ^ bM9487s;
                    if (iM9487s < 0) {
                        i = iM9487s ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int iM9487s2 = (dvh.m9487s(j3) << 14) ^ iM9487s;
                        if (iM9487s2 >= 0) {
                            i = iM9487s2 ^ 16256;
                        } else {
                            long j5 = 4 + j;
                            int iM9487s3 = iM9487s2 ^ (dvh.m9487s(j4) << 21);
                            if (iM9487s3 < 0) {
                                i = (-2080896) ^ iM9487s3;
                            } else {
                                j4 = 5 + j;
                                byte bM9487s2 = dvh.m9487s(j5);
                                int i2 = (iM9487s3 ^ (bM9487s2 << 28)) ^ 266354560;
                                if (bM9487s2 < 0) {
                                    j5 = 6 + j;
                                    if (dvh.m9487s(j4) < 0) {
                                        j4 = 7 + j;
                                        if (dvh.m9487s(j5) < 0) {
                                            j5 = 8 + j;
                                            if (dvh.m9487s(j4) < 0) {
                                                j4 = 9 + j;
                                                if (dvh.m9487s(j5) < 0) {
                                                    long j6 = j + 10;
                                                    if (dvh.m9487s(j4) >= 0) {
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
                    this.f35578t = j3;
                    return i;
                }
            }
            return (int) mo10687f();
        }

        @Override // p000.f72
        public long readRawVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            long j4 = this.f35578t;
            if (this.f35581w != j4) {
                long j5 = j4 + 1;
                byte bM9487s = dvh.m9487s(j4);
                if (bM9487s >= 0) {
                    this.f35578t++;
                    return bM9487s;
                }
                if (this.f35581w - this.f35578t >= 10) {
                    long j6 = 2 + j4;
                    int iM9487s = (dvh.m9487s(j5) << 7) ^ bM9487s;
                    if (iM9487s < 0) {
                        j = iM9487s ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int iM9487s2 = (dvh.m9487s(j6) << 14) ^ iM9487s;
                        if (iM9487s2 >= 0) {
                            j = iM9487s2 ^ 16256;
                            j6 = j7;
                        } else {
                            long j8 = 4 + j4;
                            int iM9487s3 = iM9487s2 ^ (dvh.m9487s(j7) << 21);
                            if (iM9487s3 < 0) {
                                j = (-2080896) ^ iM9487s3;
                                j6 = j8;
                            } else {
                                long j9 = 5 + j4;
                                long jM9487s = (((long) dvh.m9487s(j8)) << 28) ^ ((long) iM9487s3);
                                if (jM9487s >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j10 = 6 + j4;
                                    long jM9487s2 = jM9487s ^ (((long) dvh.m9487s(j9)) << 35);
                                    if (jM9487s2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j9 = 7 + j4;
                                        jM9487s = jM9487s2 ^ (((long) dvh.m9487s(j10)) << 42);
                                        if (jM9487s >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j10 = 8 + j4;
                                            jM9487s2 = jM9487s ^ (((long) dvh.m9487s(j9)) << 49);
                                            if (jM9487s2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j9 = 9 + j4;
                                                long jM9487s3 = (jM9487s2 ^ (((long) dvh.m9487s(j10)) << 56)) ^ 71499008037633920L;
                                                if (jM9487s3 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (dvh.m9487s(j9) >= 0) {
                                                        j = jM9487s3;
                                                        j6 = j11;
                                                    }
                                                } else {
                                                    j = jM9487s3;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jM9487s2;
                                    j6 = j10;
                                }
                                j = j3 ^ jM9487s;
                                j6 = j9;
                            }
                        }
                    }
                    this.f35578t = j6;
                    return j;
                }
            }
            return mo10687f();
        }

        @Override // p000.f72
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.f72
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.f72
        public int readSInt32() throws IOException {
            return f72.decodeZigZag32(readRawVarint32());
        }

        @Override // p000.f72
        public long readSInt64() throws IOException {
            return f72.decodeZigZag64(readRawVarint64());
        }

        @Override // p000.f72
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                long j2 = this.f35581w;
                long j3 = this.f35578t;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[rawVarint32];
                    dvh.m9481m(j3, bArr, 0L, j);
                    String str = new String(bArr, w98.f93674b);
                    this.f35578t += j;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return new String(bArr2, w98.f93674b);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw ce8.m3924g();
            }
            throw ce8.m3928l();
        }

        @Override // p000.f72
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j = rawVarint32;
                long j2 = this.f35581w;
                long j3 = this.f35578t;
                if (j <= j2 - j3) {
                    String strM19867g = pzh.m19867g(this.f35569k, (int) (j3 - this.f35579u), rawVarint32);
                    this.f35578t += j;
                    return strM19867g;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= remaining()) {
                byte[] bArr = new byte[rawVarint32];
                readRawBytesTo(bArr, 0, rawVarint32);
                return pzh.m19868h(bArr, 0, rawVarint32);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw ce8.m3924g();
            }
            throw ce8.m3928l();
        }

        @Override // p000.f72
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.f35575q = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f35575q = rawVarint32;
            if (hpi.getTagFieldNumber(rawVarint32) != 0) {
                return this.f35575q;
            }
            throw ce8.m3920c();
        }

        @Override // p000.f72
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.f72
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.f72
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final qsa.InterfaceC11668a builder) throws IOException {
            readGroup(fieldNumber, builder, zi5.getEmptyRegistry());
        }

        @Override // p000.f72
        public void resetSizeCounter() {
            this.f35577s = (int) ((((long) this.f35576r) + this.f35578t) - this.f35579u);
        }

        @Override // p000.f72
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = hpi.getTagWireType(tag);
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
                checkLastTagWas(hpi.m12536a(hpi.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw ce8.m3922e();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // p000.f72
        public void skipRawBytes(final int length) throws IOException {
            if (length < 0 || length > (((long) (this.f35572n - this.f35576r)) - this.f35578t) + this.f35579u) {
                if (length >= 0) {
                    throw ce8.m3928l();
                }
                throw ce8.m3924g();
            }
            while (length > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(length, (int) currentRemaining());
                length -= iMin;
                this.f35578t += (long) iMin;
            }
        }

        private C5655c(Iterable<ByteBuffer> inputBufs, int size, boolean immutableFlag) {
            super();
            this.f35574p = Integer.MAX_VALUE;
            this.f35572n = size;
            this.f35567i = inputBufs;
            this.f35568j = inputBufs.iterator();
            this.f35570l = immutableFlag;
            this.f35576r = 0;
            this.f35577s = 0;
            if (size != 0) {
                tryGetNextByteBuffer();
                return;
            }
            this.f35569k = w98.f93678f;
            this.f35578t = 0L;
            this.f35579u = 0L;
            this.f35581w = 0L;
            this.f35580v = 0L;
        }

        @Override // p000.f72
        public <T extends qsa> T readGroup(final int fieldNumber, final uhc<T> parser, final zi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f35553a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(hpi.m12536a(fieldNumber, 4));
            this.f35553a--;
            return partialFrom;
        }

        @Override // p000.f72
        public boolean skipField(final int tag, final j72 output) throws IOException {
            int tagWireType = hpi.getTagWireType(tag);
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
                vj1 bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iM12536a = hpi.m12536a(hpi.getTagFieldNumber(tag), 4);
                checkLastTagWas(iM12536a);
                output.writeUInt32NoTag(iM12536a);
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
            throw ce8.m3922e();
        }

        @Override // p000.f72
        public <T extends qsa> T readMessage(final uhc<T> parser, final zi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f35553a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f35553a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw ce8.m3928l();
        }
    }

    /* JADX INFO: renamed from: f72$d */
    public static final class C5656d extends f72 {

        /* JADX INFO: renamed from: i */
        public final InputStream f35582i;

        /* JADX INFO: renamed from: j */
        public final byte[] f35583j;

        /* JADX INFO: renamed from: k */
        public int f35584k;

        /* JADX INFO: renamed from: l */
        public int f35585l;

        /* JADX INFO: renamed from: m */
        public int f35586m;

        /* JADX INFO: renamed from: n */
        public int f35587n;

        /* JADX INFO: renamed from: o */
        public int f35588o;

        /* JADX INFO: renamed from: p */
        public int f35589p;

        /* JADX INFO: renamed from: q */
        public a f35590q;

        /* JADX INFO: renamed from: f72$d$a */
        public interface a {
            void onRefill();
        }

        /* JADX INFO: renamed from: f72$d$b */
        public class b implements a {

            /* JADX INFO: renamed from: a */
            public int f35591a;

            /* JADX INFO: renamed from: b */
            public ByteArrayOutputStream f35592b;

            private b() {
                this.f35591a = C5656d.this.f35586m;
            }

            /* JADX INFO: renamed from: a */
            public ByteBuffer m10692a() {
                ByteArrayOutputStream byteArrayOutputStream = this.f35592b;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(C5656d.this.f35583j, this.f35591a, C5656d.this.f35586m - this.f35591a);
                }
                byteArrayOutputStream.write(C5656d.this.f35583j, this.f35591a, C5656d.this.f35586m);
                return ByteBuffer.wrap(this.f35592b.toByteArray());
            }

            @Override // p000.f72.C5656d.a
            public void onRefill() {
                if (this.f35592b == null) {
                    this.f35592b = new ByteArrayOutputStream();
                }
                this.f35592b.write(C5656d.this.f35583j, this.f35591a, C5656d.this.f35586m - this.f35591a);
                this.f35591a = 0;
            }
        }

        private static int available(InputStream input) throws IOException {
            try {
                return input.available();
            } catch (ce8 e) {
                e.m3930j();
                throw e;
            }
        }

        private static int read(InputStream input, byte[] data, int offset, int length) throws IOException {
            try {
                return input.read(data, offset, length);
            } catch (ce8 e) {
                e.m3930j();
                throw e;
            }
        }

        private vj1 readBytesSlowPath(final int size) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(size);
            if (rawBytesSlowPathOneChunk != null) {
                return vj1.copyFrom(rawBytesSlowPathOneChunk);
            }
            int i = this.f35586m;
            int i2 = this.f35584k;
            int length = i2 - i;
            this.f35588o += i2;
            this.f35586m = 0;
            this.f35584k = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(size - length);
            byte[] bArr = new byte[size];
            System.arraycopy(this.f35583j, i, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return vj1.m24018m(bArr);
        }

        private byte[] readRawBytesSlowPath(final int size, boolean ensureNoLeakedReferences) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(size);
            if (rawBytesSlowPathOneChunk != null) {
                return ensureNoLeakedReferences ? (byte[]) rawBytesSlowPathOneChunk.clone() : rawBytesSlowPathOneChunk;
            }
            int i = this.f35586m;
            int i2 = this.f35584k;
            int length = i2 - i;
            this.f35588o += i2;
            this.f35586m = 0;
            this.f35584k = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(size - length);
            byte[] bArr = new byte[size];
            System.arraycopy(this.f35583j, i, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(final int size) throws IOException {
            if (size == 0) {
                return w98.f93677e;
            }
            if (size < 0) {
                throw ce8.m3924g();
            }
            int i = this.f35588o;
            int i2 = this.f35586m;
            int i3 = i + i2 + size;
            if (i3 - this.f35555c > 0) {
                throw ce8.m3927k();
            }
            int i4 = this.f35589p;
            if (i3 > i4) {
                skipRawBytes((i4 - i) - i2);
                throw ce8.m3928l();
            }
            int i5 = this.f35584k - i2;
            int i6 = size - i5;
            if (i6 >= 4096 && i6 > available(this.f35582i)) {
                return null;
            }
            byte[] bArr = new byte[size];
            System.arraycopy(this.f35583j, this.f35586m, bArr, 0, i5);
            this.f35588o += this.f35584k;
            this.f35586m = 0;
            this.f35584k = 0;
            while (i5 < size) {
                int i7 = read(this.f35582i, bArr, i5, size - i5);
                if (i7 == -1) {
                    throw ce8.m3928l();
                }
                this.f35588o += i7;
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
                    int i2 = this.f35582i.read(bArr, i, iMin - i);
                    if (i2 == -1) {
                        throw ce8.m3928l();
                    }
                    this.f35588o += i2;
                    i += i2;
                }
                sizeLeft -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i = this.f35584k + this.f35585l;
            this.f35584k = i;
            int i2 = this.f35588o + i;
            int i3 = this.f35589p;
            if (i2 <= i3) {
                this.f35585l = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f35585l = i4;
            this.f35584k = i - i4;
        }

        private void refillBuffer(int n) throws IOException {
            if (tryRefillBuffer(n)) {
                return;
            }
            if (n <= (this.f35555c - this.f35588o) - this.f35586m) {
                throw ce8.m3928l();
            }
            throw ce8.m3927k();
        }

        private static long skip(InputStream input, long length) throws IOException {
            try {
                return input.skip(length);
            } catch (ce8 e) {
                e.m3930j();
                throw e;
            }
        }

        private void skipRawBytesSlowPath(final int size) throws IOException {
            if (size < 0) {
                throw ce8.m3924g();
            }
            int i = this.f35588o;
            int i2 = this.f35586m;
            int i3 = i + i2 + size;
            int i4 = this.f35589p;
            if (i3 > i4) {
                skipRawBytes((i4 - i) - i2);
                throw ce8.m3928l();
            }
            int i5 = 0;
            if (this.f35590q == null) {
                this.f35588o = i + i2;
                int i6 = this.f35584k - i2;
                this.f35584k = 0;
                this.f35586m = 0;
                i5 = i6;
                while (i5 < size) {
                    try {
                        long j = size - i5;
                        long jSkip = skip(this.f35582i, j);
                        if (jSkip < 0 || jSkip > j) {
                            throw new IllegalStateException(this.f35582i.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i5 += (int) jSkip;
                        }
                    } finally {
                        this.f35588o += i5;
                        recomputeBufferSizeAfterLimit();
                    }
                }
            }
            if (i5 >= size) {
                return;
            }
            int i7 = this.f35584k;
            int i8 = i7 - this.f35586m;
            this.f35586m = i7;
            refillBuffer(1);
            while (true) {
                int i9 = size - i8;
                int i10 = this.f35584k;
                if (i9 <= i10) {
                    this.f35586m = i9;
                    return;
                } else {
                    i8 += i10;
                    this.f35586m = i10;
                    refillBuffer(1);
                }
            }
        }

        private void skipRawVarint() throws IOException {
            if (this.f35584k - this.f35586m >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f35583j;
                int i2 = this.f35586m;
                this.f35586m = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw ce8.m3923f();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw ce8.m3923f();
        }

        private boolean tryRefillBuffer(int n) throws IOException {
            int i = this.f35586m;
            if (i + n <= this.f35584k) {
                throw new IllegalStateException("refillBuffer() called when " + n + " bytes were already available in buffer");
            }
            int i2 = this.f35555c;
            int i3 = this.f35588o;
            if (n > (i2 - i3) - i || i3 + i + n > this.f35589p) {
                return false;
            }
            a aVar = this.f35590q;
            if (aVar != null) {
                aVar.onRefill();
            }
            int i4 = this.f35586m;
            if (i4 > 0) {
                int i5 = this.f35584k;
                if (i5 > i4) {
                    byte[] bArr = this.f35583j;
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.f35588o += i4;
                this.f35584k -= i4;
                this.f35586m = 0;
            }
            InputStream inputStream = this.f35582i;
            byte[] bArr2 = this.f35583j;
            int i6 = this.f35584k;
            int i7 = read(inputStream, bArr2, i6, Math.min(bArr2.length - i6, (this.f35555c - this.f35588o) - i6));
            if (i7 == 0 || i7 < -1 || i7 > this.f35583j.length) {
                throw new IllegalStateException(this.f35582i.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
            }
            if (i7 <= 0) {
                return false;
            }
            this.f35584k += i7;
            recomputeBufferSizeAfterLimit();
            if (this.f35584k >= n) {
                return true;
            }
            return tryRefillBuffer(n);
        }

        @Override // p000.f72
        public void checkLastTagWas(final int value) throws ce8 {
            if (this.f35587n != value) {
                throw ce8.m3919b();
            }
        }

        @Override // p000.f72
        public void enableAliasing(boolean enabled) {
        }

        @Override // p000.f72
        /* JADX INFO: renamed from: f */
        public long mo10687f() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw ce8.m3923f();
        }

        @Override // p000.f72
        public int getBytesUntilLimit() {
            int i = this.f35589p;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.f35588o + this.f35586m);
        }

        @Override // p000.f72
        public int getLastTag() {
            return this.f35587n;
        }

        @Override // p000.f72
        public int getTotalBytesRead() {
            return this.f35588o + this.f35586m;
        }

        @Override // p000.f72
        public boolean isAtEnd() throws IOException {
            return this.f35586m == this.f35584k && !tryRefillBuffer(1);
        }

        @Override // p000.f72
        public void popLimit(final int oldLimit) {
            this.f35589p = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // p000.f72
        public int pushLimit(int byteLimit) throws ce8 {
            if (byteLimit < 0) {
                throw ce8.m3924g();
            }
            int i = byteLimit + this.f35588o + this.f35586m;
            int i2 = this.f35589p;
            if (i > i2) {
                throw ce8.m3928l();
            }
            this.f35589p = i;
            recomputeBufferSizeAfterLimit();
            return i2;
        }

        @Override // p000.f72
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // p000.f72
        public byte[] readByteArray() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.f35584k;
            int i2 = this.f35586m;
            if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
                if (rawVarint32 >= 0) {
                    return readRawBytesSlowPath(rawVarint32, false);
                }
                throw ce8.m3924g();
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f35583j, i2, i2 + rawVarint32);
            this.f35586m += rawVarint32;
            return bArrCopyOfRange;
        }

        @Override // p000.f72
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.f35584k;
            int i2 = this.f35586m;
            if (rawVarint32 <= i - i2 && rawVarint32 > 0) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f35583j, i2, i2 + rawVarint32));
                this.f35586m += rawVarint32;
                return byteBufferWrap;
            }
            if (rawVarint32 == 0) {
                return w98.f93678f;
            }
            if (rawVarint32 >= 0) {
                return ByteBuffer.wrap(readRawBytesSlowPath(rawVarint32, true));
            }
            throw ce8.m3924g();
        }

        @Override // p000.f72
        public vj1 readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i = this.f35584k;
            int i2 = this.f35586m;
            if (rawVarint32 <= i - i2 && rawVarint32 > 0) {
                vj1 vj1VarCopyFrom = vj1.copyFrom(this.f35583j, i2, rawVarint32);
                this.f35586m += rawVarint32;
                return vj1VarCopyFrom;
            }
            if (rawVarint32 == 0) {
                return vj1.f91344e;
            }
            if (rawVarint32 >= 0) {
                return readBytesSlowPath(rawVarint32);
            }
            throw ce8.m3924g();
        }

        @Override // p000.f72
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // p000.f72
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.f72
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.f72
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.f72
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // p000.f72
        public void readGroup(final int fieldNumber, final qsa.InterfaceC11668a builder, final zi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f35553a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(hpi.m12536a(fieldNumber, 4));
            this.f35553a--;
        }

        @Override // p000.f72
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.f72
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.f72
        public void readMessage(final qsa.InterfaceC11668a builder, final zi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f35553a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f35553a--;
            if (getBytesUntilLimit() != 0) {
                throw ce8.m3928l();
            }
            popLimit(iPushLimit);
        }

        @Override // p000.f72
        public byte readRawByte() throws IOException {
            if (this.f35586m == this.f35584k) {
                refillBuffer(1);
            }
            byte[] bArr = this.f35583j;
            int i = this.f35586m;
            this.f35586m = i + 1;
            return bArr[i];
        }

        @Override // p000.f72
        public byte[] readRawBytes(final int size) throws IOException {
            int i = this.f35586m;
            if (size > this.f35584k - i || size <= 0) {
                return readRawBytesSlowPath(size, false);
            }
            int i2 = size + i;
            this.f35586m = i2;
            return Arrays.copyOfRange(this.f35583j, i, i2);
        }

        @Override // p000.f72
        public int readRawLittleEndian32() throws IOException {
            int i = this.f35586m;
            if (this.f35584k - i < 4) {
                refillBuffer(4);
                i = this.f35586m;
            }
            byte[] bArr = this.f35583j;
            this.f35586m = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // p000.f72
        public long readRawLittleEndian64() throws IOException {
            int i = this.f35586m;
            if (this.f35584k - i < 8) {
                refillBuffer(8);
                i = this.f35586m;
            }
            byte[] bArr = this.f35583j;
            this.f35586m = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        @Override // p000.f72
        public int readRawVarint32() throws IOException {
            int i;
            int i2 = this.f35586m;
            int i3 = this.f35584k;
            if (i3 != i2) {
                byte[] bArr = this.f35583j;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f35586m = i4;
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
                    this.f35586m = i5;
                    return i;
                }
            }
            return (int) mo10687f();
        }

        @Override // p000.f72
        public long readRawVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f35586m;
            int i2 = this.f35584k;
            if (i2 != i) {
                byte[] bArr = this.f35583j;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f35586m = i3;
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
                    this.f35586m = i4;
                    return j;
                }
            }
            return mo10687f();
        }

        @Override // p000.f72
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.f72
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.f72
        public int readSInt32() throws IOException {
            return f72.decodeZigZag32(readRawVarint32());
        }

        @Override // p000.f72
        public long readSInt64() throws IOException {
            return f72.decodeZigZag64(readRawVarint64());
        }

        @Override // p000.f72
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i = this.f35584k;
                int i2 = this.f35586m;
                if (rawVarint32 <= i - i2) {
                    String str = new String(this.f35583j, i2, rawVarint32, w98.f93674b);
                    this.f35586m += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw ce8.m3924g();
            }
            if (rawVarint32 > this.f35584k) {
                return new String(readRawBytesSlowPath(rawVarint32, false), w98.f93674b);
            }
            refillBuffer(rawVarint32);
            String str2 = new String(this.f35583j, this.f35586m, rawVarint32, w98.f93674b);
            this.f35586m += rawVarint32;
            return str2;
        }

        @Override // p000.f72
        public String readStringRequireUtf8() throws IOException {
            byte[] rawBytesSlowPath;
            int rawVarint32 = readRawVarint32();
            int i = this.f35586m;
            int i2 = this.f35584k;
            if (rawVarint32 <= i2 - i && rawVarint32 > 0) {
                rawBytesSlowPath = this.f35583j;
                this.f35586m = i + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw ce8.m3924g();
                }
                i = 0;
                if (rawVarint32 <= i2) {
                    refillBuffer(rawVarint32);
                    rawBytesSlowPath = this.f35583j;
                    this.f35586m = rawVarint32;
                } else {
                    rawBytesSlowPath = readRawBytesSlowPath(rawVarint32, false);
                }
            }
            return pzh.m19868h(rawBytesSlowPath, i, rawVarint32);
        }

        @Override // p000.f72
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.f35587n = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f35587n = rawVarint32;
            if (hpi.getTagFieldNumber(rawVarint32) != 0) {
                return this.f35587n;
            }
            throw ce8.m3920c();
        }

        @Override // p000.f72
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.f72
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.f72
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final qsa.InterfaceC11668a builder) throws IOException {
            readGroup(fieldNumber, builder, zi5.getEmptyRegistry());
        }

        @Override // p000.f72
        public void resetSizeCounter() {
            this.f35588o = -this.f35586m;
        }

        @Override // p000.f72
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = hpi.getTagWireType(tag);
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
                checkLastTagWas(hpi.m12536a(hpi.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw ce8.m3922e();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // p000.f72
        public void skipRawBytes(final int size) throws IOException {
            int i = this.f35584k;
            int i2 = this.f35586m;
            if (size > i - i2 || size < 0) {
                skipRawBytesSlowPath(size);
            } else {
                this.f35586m = i2 + size;
            }
        }

        private C5656d(final InputStream input, int bufferSize) {
            super();
            this.f35589p = Integer.MAX_VALUE;
            this.f35590q = null;
            w98.m24433b(input, "input");
            this.f35582i = input;
            this.f35583j = new byte[bufferSize];
            this.f35584k = 0;
            this.f35586m = 0;
            this.f35588o = 0;
        }

        @Override // p000.f72
        public <T extends qsa> T readGroup(final int fieldNumber, final uhc<T> parser, final zi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f35553a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(hpi.m12536a(fieldNumber, 4));
            this.f35553a--;
            return partialFrom;
        }

        @Override // p000.f72
        public boolean skipField(final int tag, final j72 output) throws IOException {
            int tagWireType = hpi.getTagWireType(tag);
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
                vj1 bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iM12536a = hpi.m12536a(hpi.getTagFieldNumber(tag), 4);
                checkLastTagWas(iM12536a);
                output.writeUInt32NoTag(iM12536a);
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
            throw ce8.m3922e();
        }

        @Override // p000.f72
        public <T extends qsa> T readMessage(final uhc<T> parser, final zi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f35553a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f35553a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw ce8.m3928l();
        }
    }

    /* JADX INFO: renamed from: f72$e */
    public static final class C5657e extends f72 {

        /* JADX INFO: renamed from: i */
        public final ByteBuffer f35594i;

        /* JADX INFO: renamed from: j */
        public final boolean f35595j;

        /* JADX INFO: renamed from: k */
        public final long f35596k;

        /* JADX INFO: renamed from: l */
        public long f35597l;

        /* JADX INFO: renamed from: m */
        public long f35598m;

        /* JADX INFO: renamed from: n */
        public long f35599n;

        /* JADX INFO: renamed from: o */
        public int f35600o;

        /* JADX INFO: renamed from: p */
        public int f35601p;

        /* JADX INFO: renamed from: q */
        public boolean f35602q;

        /* JADX INFO: renamed from: r */
        public int f35603r;

        private int bufferPos(long pos) {
            return (int) (pos - this.f35596k);
        }

        /* JADX INFO: renamed from: i */
        public static boolean m10693i() {
            return dvh.m9448K();
        }

        private void recomputeBufferSizeAfterLimit() {
            long j = this.f35597l + ((long) this.f35600o);
            this.f35597l = j;
            int i = (int) (j - this.f35599n);
            int i2 = this.f35603r;
            if (i <= i2) {
                this.f35600o = 0;
                return;
            }
            int i3 = i - i2;
            this.f35600o = i3;
            this.f35597l = j - ((long) i3);
        }

        private int remaining() {
            return (int) (this.f35597l - this.f35598m);
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
                long j = this.f35598m;
                this.f35598m = 1 + j;
                if (dvh.m9487s(j) >= 0) {
                    return;
                }
            }
            throw ce8.m3923f();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw ce8.m3923f();
        }

        private ByteBuffer slice(long begin, long end) throws IOException {
            int iPosition = this.f35594i.position();
            int iLimit = this.f35594i.limit();
            ByteBuffer byteBuffer = this.f35594i;
            try {
                try {
                    byteBuffer.position(bufferPos(begin));
                    byteBuffer.limit(bufferPos(end));
                    return this.f35594i.slice();
                } catch (IllegalArgumentException e) {
                    ce8 ce8VarM3928l = ce8.m3928l();
                    ce8VarM3928l.initCause(e);
                    throw ce8VarM3928l;
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        @Override // p000.f72
        public void checkLastTagWas(final int value) throws ce8 {
            if (this.f35601p != value) {
                throw ce8.m3919b();
            }
        }

        @Override // p000.f72
        public void enableAliasing(boolean enabled) {
            this.f35602q = enabled;
        }

        @Override // p000.f72
        /* JADX INFO: renamed from: f */
        public long mo10687f() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte rawByte = readRawByte();
                j |= ((long) (rawByte & 127)) << i;
                if ((rawByte & 128) == 0) {
                    return j;
                }
            }
            throw ce8.m3923f();
        }

        @Override // p000.f72
        public int getBytesUntilLimit() {
            int i = this.f35603r;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // p000.f72
        public int getLastTag() {
            return this.f35601p;
        }

        @Override // p000.f72
        public int getTotalBytesRead() {
            return (int) (this.f35598m - this.f35599n);
        }

        @Override // p000.f72
        public boolean isAtEnd() throws IOException {
            return this.f35598m == this.f35597l;
        }

        @Override // p000.f72
        public void popLimit(final int oldLimit) {
            this.f35603r = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // p000.f72
        public int pushLimit(int byteLimit) throws ce8 {
            if (byteLimit < 0) {
                throw ce8.m3924g();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            int i = this.f35603r;
            if (totalBytesRead > i) {
                throw ce8.m3928l();
            }
            this.f35603r = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i;
        }

        @Override // p000.f72
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // p000.f72
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // p000.f72
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return w98.f93678f;
                }
                if (rawVarint32 < 0) {
                    throw ce8.m3924g();
                }
                throw ce8.m3928l();
            }
            if (this.f35595j || !this.f35602q) {
                byte[] bArr = new byte[rawVarint32];
                long j = rawVarint32;
                dvh.m9481m(this.f35598m, bArr, 0L, j);
                this.f35598m += j;
                return ByteBuffer.wrap(bArr);
            }
            long j2 = this.f35598m;
            long j3 = rawVarint32;
            ByteBuffer byteBufferSlice = slice(j2, j2 + j3);
            this.f35598m += j3;
            return byteBufferSlice;
        }

        @Override // p000.f72
        public vj1 readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return vj1.f91344e;
                }
                if (rawVarint32 < 0) {
                    throw ce8.m3924g();
                }
                throw ce8.m3928l();
            }
            if (this.f35595j && this.f35602q) {
                long j = this.f35598m;
                long j2 = rawVarint32;
                ByteBuffer byteBufferSlice = slice(j, j + j2);
                this.f35598m += j2;
                return vj1.m24017l(byteBufferSlice);
            }
            byte[] bArr = new byte[rawVarint32];
            long j3 = rawVarint32;
            dvh.m9481m(this.f35598m, bArr, 0L, j3);
            this.f35598m += j3;
            return vj1.m24018m(bArr);
        }

        @Override // p000.f72
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // p000.f72
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.f72
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.f72
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.f72
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // p000.f72
        public void readGroup(final int fieldNumber, final qsa.InterfaceC11668a builder, final zi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f35553a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(hpi.m12536a(fieldNumber, 4));
            this.f35553a--;
        }

        @Override // p000.f72
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.f72
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.f72
        public void readMessage(final qsa.InterfaceC11668a builder, final zi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f35553a++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f35553a--;
            if (getBytesUntilLimit() != 0) {
                throw ce8.m3928l();
            }
            popLimit(iPushLimit);
        }

        @Override // p000.f72
        public byte readRawByte() throws IOException {
            long j = this.f35598m;
            if (j == this.f35597l) {
                throw ce8.m3928l();
            }
            this.f35598m = 1 + j;
            return dvh.m9487s(j);
        }

        @Override // p000.f72
        public byte[] readRawBytes(final int length) throws IOException {
            if (length < 0 || length > remaining()) {
                if (length > 0) {
                    throw ce8.m3928l();
                }
                if (length == 0) {
                    return w98.f93677e;
                }
                throw ce8.m3924g();
            }
            byte[] bArr = new byte[length];
            long j = this.f35598m;
            long j2 = length;
            slice(j, j + j2).get(bArr);
            this.f35598m += j2;
            return bArr;
        }

        @Override // p000.f72
        public int readRawLittleEndian32() throws IOException {
            long j = this.f35598m;
            if (this.f35597l - j < 4) {
                throw ce8.m3928l();
            }
            this.f35598m = 4 + j;
            return ((dvh.m9487s(j + 3) & 255) << 24) | (dvh.m9487s(j) & 255) | ((dvh.m9487s(1 + j) & 255) << 8) | ((dvh.m9487s(2 + j) & 255) << 16);
        }

        @Override // p000.f72
        public long readRawLittleEndian64() throws IOException {
            long j = this.f35598m;
            if (this.f35597l - j < 8) {
                throw ce8.m3928l();
            }
            this.f35598m = 8 + j;
            return ((((long) dvh.m9487s(j + 7)) & 255) << 56) | (((long) dvh.m9487s(j)) & 255) | ((((long) dvh.m9487s(1 + j)) & 255) << 8) | ((((long) dvh.m9487s(2 + j)) & 255) << 16) | ((((long) dvh.m9487s(3 + j)) & 255) << 24) | ((((long) dvh.m9487s(4 + j)) & 255) << 32) | ((((long) dvh.m9487s(5 + j)) & 255) << 40) | ((((long) dvh.m9487s(6 + j)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (p000.dvh.m9487s(r3) < 0) goto L34;
         */
        @Override // p000.f72
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int readRawVarint32() throws java.io.IOException {
            /*
                r9 = this;
                long r0 = r9.f35598m
                long r2 = r9.f35597l
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = p000.dvh.m9487s(r0)
                if (r4 < 0) goto L16
                r9.f35598m = r2
                return r4
            L16:
                long r5 = r9.f35597l
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = p000.dvh.m9487s(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = p000.dvh.m9487s(r5)
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
                byte r3 = p000.dvh.m9487s(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = p000.dvh.m9487s(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = p000.dvh.m9487s(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = p000.dvh.m9487s(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = p000.dvh.m9487s(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = p000.dvh.m9487s(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = p000.dvh.m9487s(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.mo10687f()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f35598m = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.f72.C5657e.readRawVarint32():int");
        }

        @Override // p000.f72
        public long readRawVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.f35598m;
            if (this.f35597l != j4) {
                long j5 = 1 + j4;
                byte bM9487s = dvh.m9487s(j4);
                if (bM9487s >= 0) {
                    this.f35598m = j5;
                    return bM9487s;
                }
                if (this.f35597l - j5 >= 9) {
                    long j6 = 2 + j4;
                    int iM9487s = (dvh.m9487s(j5) << 7) ^ bM9487s;
                    if (iM9487s >= 0) {
                        long j7 = 3 + j4;
                        int iM9487s2 = iM9487s ^ (dvh.m9487s(j6) << 14);
                        if (iM9487s2 >= 0) {
                            j = iM9487s2 ^ 16256;
                            j6 = j7;
                        } else {
                            j6 = 4 + j4;
                            int iM9487s3 = iM9487s2 ^ (dvh.m9487s(j7) << 21);
                            if (iM9487s3 < 0) {
                                i = (-2080896) ^ iM9487s3;
                            } else {
                                long j8 = 5 + j4;
                                long jM9487s = ((long) iM9487s3) ^ (((long) dvh.m9487s(j6)) << 28);
                                if (jM9487s >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = 6 + j4;
                                    long jM9487s2 = jM9487s ^ (((long) dvh.m9487s(j8)) << 35);
                                    if (jM9487s2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j8 = 7 + j4;
                                        jM9487s = jM9487s2 ^ (((long) dvh.m9487s(j9)) << 42);
                                        if (jM9487s >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j4;
                                            jM9487s2 = jM9487s ^ (((long) dvh.m9487s(j8)) << 49);
                                            if (jM9487s2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j10 = j4 + 9;
                                                long jM9487s3 = (jM9487s2 ^ (((long) dvh.m9487s(j9)) << 56)) ^ 71499008037633920L;
                                                if (jM9487s3 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (dvh.m9487s(j10) >= 0) {
                                                        j6 = j11;
                                                        j = jM9487s3;
                                                    }
                                                } else {
                                                    j = jM9487s3;
                                                    j6 = j10;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jM9487s2;
                                    j6 = j9;
                                }
                                j = j3 ^ jM9487s;
                                j6 = j8;
                            }
                        }
                        this.f35598m = j6;
                        return j;
                    }
                    i = iM9487s ^ (-128);
                    j = i;
                    this.f35598m = j6;
                    return j;
                }
            }
            return mo10687f();
        }

        @Override // p000.f72
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // p000.f72
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // p000.f72
        public int readSInt32() throws IOException {
            return f72.decodeZigZag32(readRawVarint32());
        }

        @Override // p000.f72
        public long readSInt64() throws IOException {
            return f72.decodeZigZag64(readRawVarint64());
        }

        @Override // p000.f72
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw ce8.m3924g();
                }
                throw ce8.m3928l();
            }
            byte[] bArr = new byte[rawVarint32];
            long j = rawVarint32;
            dvh.m9481m(this.f35598m, bArr, 0L, j);
            String str = new String(bArr, w98.f93674b);
            this.f35598m += j;
            return str;
        }

        @Override // p000.f72
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                String strM19867g = pzh.m19867g(this.f35594i, bufferPos(this.f35598m), rawVarint32);
                this.f35598m += (long) rawVarint32;
                return strM19867g;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw ce8.m3924g();
            }
            throw ce8.m3928l();
        }

        @Override // p000.f72
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.f35601p = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f35601p = rawVarint32;
            if (hpi.getTagFieldNumber(rawVarint32) != 0) {
                return this.f35601p;
            }
            throw ce8.m3920c();
        }

        @Override // p000.f72
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // p000.f72
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // p000.f72
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final qsa.InterfaceC11668a builder) throws IOException {
            readGroup(fieldNumber, builder, zi5.getEmptyRegistry());
        }

        @Override // p000.f72
        public void resetSizeCounter() {
            this.f35599n = this.f35598m;
        }

        @Override // p000.f72
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = hpi.getTagWireType(tag);
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
                checkLastTagWas(hpi.m12536a(hpi.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw ce8.m3922e();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // p000.f72
        public void skipRawBytes(final int length) throws IOException {
            if (length >= 0 && length <= remaining()) {
                this.f35598m += (long) length;
            } else {
                if (length >= 0) {
                    throw ce8.m3928l();
                }
                throw ce8.m3924g();
            }
        }

        private C5657e(ByteBuffer buffer, boolean immutable) {
            super();
            this.f35603r = Integer.MAX_VALUE;
            this.f35594i = buffer;
            long jM9479k = dvh.m9479k(buffer);
            this.f35596k = jM9479k;
            this.f35597l = ((long) buffer.limit()) + jM9479k;
            long jPosition = jM9479k + ((long) buffer.position());
            this.f35598m = jPosition;
            this.f35599n = jPosition;
            this.f35595j = immutable;
        }

        @Override // p000.f72
        public <T extends qsa> T readGroup(final int fieldNumber, final uhc<T> parser, final zi5 extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.f35553a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(hpi.m12536a(fieldNumber, 4));
            this.f35553a--;
            return partialFrom;
        }

        @Override // p000.f72
        public boolean skipField(final int tag, final j72 output) throws IOException {
            int tagWireType = hpi.getTagWireType(tag);
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
                vj1 bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iM12536a = hpi.m12536a(hpi.getTagFieldNumber(tag), 4);
                checkLastTagWas(iM12536a);
                output.writeUInt32NoTag(iM12536a);
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
            throw ce8.m3922e();
        }

        @Override // p000.f72
        public <T extends qsa> T readMessage(final uhc<T> parser, final zi5 extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.f35553a++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.f35553a--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw ce8.m3928l();
        }
    }

    /* JADX INFO: renamed from: b */
    public static f72 m10682b(final Iterable<ByteBuffer> bufs, final boolean bufferIsImmutable) {
        int i = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : bufs) {
            iRemaining += byteBuffer.remaining();
            i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
        }
        return i == 2 ? new C5655c(bufs, iRemaining, bufferIsImmutable) : newInstance(new tg8(bufs));
    }

    /* JADX INFO: renamed from: c */
    public static f72 m10683c(ByteBuffer buf, boolean bufferIsImmutable) {
        if (buf.hasArray()) {
            return m10684d(buf.array(), buf.arrayOffset() + buf.position(), buf.remaining(), bufferIsImmutable);
        }
        if (buf.isDirect() && C5657e.m10693i()) {
            return new C5657e(buf, bufferIsImmutable);
        }
        int iRemaining = buf.remaining();
        byte[] bArr = new byte[iRemaining];
        buf.duplicate().get(bArr);
        return m10684d(bArr, 0, iRemaining, true);
    }

    /* JADX INFO: renamed from: d */
    public static f72 m10684d(final byte[] buf, final int off, final int len, final boolean bufferIsImmutable) {
        C5654b c5654b = new C5654b(buf, off, len, bufferIsImmutable);
        try {
            c5654b.pushLimit(len);
            return c5654b;
        } catch (ce8 e) {
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
    public static int m10685e(final InputStream input) throws IOException {
        int i = input.read();
        if (i != -1) {
            return readRawVarint32(i, input);
        }
        throw ce8.m3928l();
    }

    public static f72 newInstance(final InputStream input) {
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
                throw ce8.m3928l();
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
                throw ce8.m3928l();
            }
            if ((i4 & 128) == 0) {
                return i;
            }
            i2 += 7;
        }
        throw ce8.m3923f();
    }

    /* JADX INFO: renamed from: a */
    public final void m10686a() {
        this.f35557e = true;
    }

    public abstract void checkLastTagWas(final int value) throws ce8;

    public void checkRecursionLimit() throws ce8 {
        if (this.f35553a >= this.f35554b) {
            throw ce8.m3926i();
        }
    }

    public abstract void enableAliasing(boolean enabled);

    /* JADX INFO: renamed from: f */
    public abstract long mo10687f() throws IOException;

    /* JADX INFO: renamed from: g */
    public final boolean m10688g() {
        return this.f35557e;
    }

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    /* JADX INFO: renamed from: h */
    public final void m10689h() {
        this.f35557e = false;
    }

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(final int oldLimit);

    public abstract int pushLimit(int byteLimit) throws ce8;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract vj1 readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends qsa> T readGroup(final int fieldNumber, final uhc<T> parser, final zi5 extensionRegistry) throws IOException;

    public abstract void readGroup(final int fieldNumber, final qsa.InterfaceC11668a builder, final zi5 extensionRegistry) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends qsa> T readMessage(final uhc<T> parser, final zi5 extensionRegistry) throws IOException;

    public abstract void readMessage(final qsa.InterfaceC11668a builder, final zi5 extensionRegistry) throws IOException;

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
    public abstract void readUnknownGroup(final int fieldNumber, final qsa.InterfaceC11668a builder) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(final int limit) {
        if (limit >= 0) {
            int i = this.f35554b;
            this.f35554b = limit;
            return i;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + limit);
    }

    public final int setSizeLimit(final int limit) {
        if (limit >= 0) {
            int i = this.f35555c;
            this.f35555c = limit;
            return i;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + limit);
    }

    public abstract boolean skipField(final int tag) throws IOException;

    @Deprecated
    public abstract boolean skipField(final int tag, final j72 output) throws IOException;

    public void skipMessage() throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.f35553a++;
            this.f35553a--;
        } while (skipField(tag));
    }

    public abstract void skipRawBytes(final int size) throws IOException;

    private f72() {
        this.f35554b = f35552h;
        this.f35555c = Integer.MAX_VALUE;
        this.f35557e = false;
    }

    public static f72 newInstance(final InputStream input, int bufferSize) {
        if (bufferSize > 0) {
            return input == null ? newInstance(w98.f93677e) : new C5656d(input, bufferSize);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static f72 newInstance(final Iterable<ByteBuffer> input) {
        if (!C5657e.m10693i()) {
            return newInstance(new tg8(input));
        }
        return m10682b(input, false);
    }

    public void skipMessage(j72 output) throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.f35553a++;
            this.f35553a--;
        } while (skipField(tag, output));
    }

    public static f72 newInstance(final byte[] buf) {
        return newInstance(buf, 0, buf.length);
    }

    public static f72 newInstance(final byte[] buf, final int off, final int len) {
        return m10684d(buf, off, len, false);
    }

    public static f72 newInstance(ByteBuffer buf) {
        return m10683c(buf, false);
    }
}
