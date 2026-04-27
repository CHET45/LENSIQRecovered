package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p000.ce8;
import p000.hpi;
import p000.os9;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public abstract class i21 implements hrd {

    /* JADX INFO: renamed from: c */
    public static final int f45496c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f45497d = 7;

    /* JADX INFO: renamed from: i21$a */
    public static /* synthetic */ class C7111a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45498a;

        static {
            int[] iArr = new int[hpi.EnumC6968b.values().length];
            f45498a = iArr;
            try {
                iArr[hpi.EnumC6968b.f44484H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44489Q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44496c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44492Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44483F.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44482C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44497d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44500m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44498e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44488N.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44493Z.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44487M1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44490V1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44494Z1.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44485L.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44491X.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f45498a[hpi.EnumC6968b.f44499f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public /* synthetic */ i21(C7111a c7111a) {
        this();
    }

    public static i21 newInstance(ByteBuffer buffer, boolean bufferIsImmutable) {
        if (buffer.hasArray()) {
            return new C7112b(buffer, bufferIsImmutable);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    public abstract int getTotalBytesRead();

    @Override // p000.hrd
    public boolean shouldDiscardUnknownFields() {
        return false;
    }

    /* JADX INFO: renamed from: i21$b */
    public static final class C7112b extends i21 {

        /* JADX INFO: renamed from: e */
        public final boolean f45499e;

        /* JADX INFO: renamed from: f */
        public final byte[] f45500f;

        /* JADX INFO: renamed from: g */
        public int f45501g;

        /* JADX INFO: renamed from: h */
        public final int f45502h;

        /* JADX INFO: renamed from: i */
        public int f45503i;

        /* JADX INFO: renamed from: j */
        public int f45504j;

        /* JADX INFO: renamed from: k */
        public int f45505k;

        public C7112b(ByteBuffer bytebuf, boolean bufferIsImmutable) {
            super(null);
            this.f45499e = bufferIsImmutable;
            this.f45500f = bytebuf.array();
            int iArrayOffset = bytebuf.arrayOffset() + bytebuf.position();
            this.f45501g = iArrayOffset;
            this.f45502h = iArrayOffset;
            this.f45503i = bytebuf.arrayOffset() + bytebuf.limit();
        }

        private boolean isAtEnd() {
            return this.f45501g == this.f45503i;
        }

        private byte readByte() throws IOException {
            int i = this.f45501g;
            if (i == this.f45503i) {
                throw ce8.m3928l();
            }
            byte[] bArr = this.f45500f;
            this.f45501g = i + 1;
            return bArr[i];
        }

        private Object readField(hpi.EnumC6968b fieldType, Class<?> messageType, zi5 extensionRegistry) throws IOException {
            switch (C7111a.f45498a[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(readBool());
                case 2:
                    return readBytes();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(readEnum());
                case 5:
                    return Integer.valueOf(readFixed32());
                case 6:
                    return Long.valueOf(readFixed64());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(readInt32());
                case 9:
                    return Long.valueOf(readInt64());
                case 10:
                    return readMessage(messageType, extensionRegistry);
                case 11:
                    return Integer.valueOf(readSFixed32());
                case 12:
                    return Long.valueOf(readSFixed64());
                case 13:
                    return Integer.valueOf(readSInt32());
                case 14:
                    return Long.valueOf(readSInt64());
                case 15:
                    return readStringRequireUtf8();
                case 16:
                    return Integer.valueOf(readUInt32());
                case 17:
                    return Long.valueOf(readUInt64());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private int readLittleEndian32() throws IOException {
            requireBytes(4);
            return readLittleEndian32_NoCheck();
        }

        private int readLittleEndian32_NoCheck() {
            int i = this.f45501g;
            byte[] bArr = this.f45500f;
            this.f45501g = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        private long readLittleEndian64() throws IOException {
            requireBytes(8);
            return readLittleEndian64_NoCheck();
        }

        private long readLittleEndian64_NoCheck() {
            int i = this.f45501g;
            byte[] bArr = this.f45500f;
            this.f45501g = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        private int readVarint32() throws IOException {
            int i;
            int i2 = this.f45501g;
            int i3 = this.f45503i;
            if (i3 == i2) {
                throw ce8.m3928l();
            }
            byte[] bArr = this.f45500f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f45501g = i4;
                return b;
            }
            if (i3 - i4 < 9) {
                return (int) readVarint64SlowPath();
            }
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
                                            if (bArr[i7] < 0) {
                                                throw ce8.m3923f();
                                            }
                                            i5 = i12;
                                            i = i11;
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
            this.f45501g = i5;
            return i;
        }

        private long readVarint64SlowPath() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte b = readByte();
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw ce8.m3923f();
        }

        private void requireBytes(int size) throws IOException {
            if (size < 0 || size > this.f45503i - this.f45501g) {
                throw ce8.m3928l();
            }
        }

        private void requirePosition(int expectedPosition) throws IOException {
            if (this.f45501g != expectedPosition) {
                throw ce8.m3928l();
            }
        }

        private void requireWireType(int requiredWireType) throws IOException {
            if (hpi.getTagWireType(this.f45504j) != requiredWireType) {
                throw ce8.m3922e();
            }
        }

        private void skipBytes(final int size) throws IOException {
            requireBytes(size);
            this.f45501g += size;
        }

        private void skipGroup() throws IOException {
            int i = this.f45505k;
            this.f45505k = hpi.m12536a(hpi.getTagFieldNumber(this.f45504j), 4);
            while (getFieldNumber() != Integer.MAX_VALUE && skipField()) {
            }
            if (this.f45504j != this.f45505k) {
                throw ce8.m3925h();
            }
            this.f45505k = i;
        }

        private void skipVarint() throws IOException {
            int i = this.f45503i;
            int i2 = this.f45501g;
            if (i - i2 >= 10) {
                byte[] bArr = this.f45500f;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f45501g = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            skipVarintSlowPath();
        }

        private void skipVarintSlowPath() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (readByte() >= 0) {
                    return;
                }
            }
            throw ce8.m3923f();
        }

        private void verifyPackedFixed32Length(int bytes) throws IOException {
            requireBytes(bytes);
            if ((bytes & 3) != 0) {
                throw ce8.m3925h();
            }
        }

        private void verifyPackedFixed64Length(int bytes) throws IOException {
            requireBytes(bytes);
            if ((bytes & 7) != 0) {
                throw ce8.m3925h();
            }
        }

        @Override // p000.hrd
        public int getFieldNumber() throws IOException {
            if (isAtEnd()) {
                return Integer.MAX_VALUE;
            }
            int varint32 = readVarint32();
            this.f45504j = varint32;
            if (varint32 == this.f45505k) {
                return Integer.MAX_VALUE;
            }
            return hpi.getTagFieldNumber(varint32);
        }

        @Override // p000.hrd
        public int getTag() {
            return this.f45504j;
        }

        @Override // p000.i21
        public int getTotalBytesRead() {
            return this.f45501g - this.f45502h;
        }

        @Override // p000.hrd
        public <T> void mergeGroupField(T target, tpe<T> schema, zi5 extensionRegistry) throws IOException {
            int i = this.f45505k;
            this.f45505k = hpi.m12536a(hpi.getTagFieldNumber(this.f45504j), 4);
            try {
                schema.mergeFrom(target, this, extensionRegistry);
                if (this.f45504j == this.f45505k) {
                } else {
                    throw ce8.m3925h();
                }
            } finally {
                this.f45505k = i;
            }
        }

        @Override // p000.hrd
        public <T> void mergeMessageField(T target, tpe<T> schema, zi5 extensionRegistry) throws IOException {
            int varint32 = readVarint32();
            requireBytes(varint32);
            int i = this.f45503i;
            int i2 = this.f45501g + varint32;
            this.f45503i = i2;
            try {
                schema.mergeFrom(target, this, extensionRegistry);
                if (this.f45501g == i2) {
                } else {
                    throw ce8.m3925h();
                }
            } finally {
                this.f45503i = i;
            }
        }

        @Override // p000.hrd
        public boolean readBool() throws IOException {
            requireWireType(0);
            return readVarint32() != 0;
        }

        @Override // p000.hrd
        public void readBoolList(List<Boolean> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof ra1)) {
                int tagWireType = hpi.getTagWireType(this.f45504j);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw ce8.m3922e();
                    }
                    int varint32 = this.f45501g + readVarint32();
                    while (this.f45501g < varint32) {
                        target.add(Boolean.valueOf(readVarint32() != 0));
                    }
                    requirePosition(varint32);
                    return;
                }
                do {
                    target.add(Boolean.valueOf(readBool()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i;
                return;
            }
            ra1 ra1Var = (ra1) target;
            int tagWireType2 = hpi.getTagWireType(this.f45504j);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw ce8.m3922e();
                }
                int varint322 = this.f45501g + readVarint32();
                while (this.f45501g < varint322) {
                    ra1Var.addBoolean(readVarint32() != 0);
                }
                requirePosition(varint322);
                return;
            }
            do {
                ra1Var.addBoolean(readBool());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f45501g;
                }
            } while (readVarint32() == this.f45504j);
            this.f45501g = i2;
        }

        @Override // p000.hrd
        public vj1 readBytes() throws IOException {
            requireWireType(2);
            int varint32 = readVarint32();
            if (varint32 == 0) {
                return vj1.f91344e;
            }
            requireBytes(varint32);
            vj1 vj1VarM24019n = this.f45499e ? vj1.m24019n(this.f45500f, this.f45501g, varint32) : vj1.copyFrom(this.f45500f, this.f45501g, varint32);
            this.f45501g += varint32;
            return vj1VarM24019n;
        }

        @Override // p000.hrd
        public void readBytesList(List<vj1> target) throws IOException {
            int i;
            if (hpi.getTagWireType(this.f45504j) != 2) {
                throw ce8.m3922e();
            }
            do {
                target.add(readBytes());
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.f45501g;
                }
            } while (readVarint32() == this.f45504j);
            this.f45501g = i;
        }

        @Override // p000.hrd
        public double readDouble() throws IOException {
            requireWireType(1);
            return Double.longBitsToDouble(readLittleEndian64());
        }

        @Override // p000.hrd
        public void readDoubleList(List<Double> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof uj4)) {
                int tagWireType = hpi.getTagWireType(this.f45504j);
                if (tagWireType == 1) {
                    do {
                        target.add(Double.valueOf(readDouble()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i = this.f45501g;
                        }
                    } while (readVarint32() == this.f45504j);
                    this.f45501g = i;
                    return;
                }
                if (tagWireType != 2) {
                    throw ce8.m3922e();
                }
                int varint32 = readVarint32();
                verifyPackedFixed64Length(varint32);
                int i3 = this.f45501g + varint32;
                while (this.f45501g < i3) {
                    target.add(Double.valueOf(Double.longBitsToDouble(readLittleEndian64_NoCheck())));
                }
                return;
            }
            uj4 uj4Var = (uj4) target;
            int tagWireType2 = hpi.getTagWireType(this.f45504j);
            if (tagWireType2 == 1) {
                do {
                    uj4Var.addDouble(readDouble());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i2;
                return;
            }
            if (tagWireType2 != 2) {
                throw ce8.m3922e();
            }
            int varint322 = readVarint32();
            verifyPackedFixed64Length(varint322);
            int i4 = this.f45501g + varint322;
            while (this.f45501g < i4) {
                uj4Var.addDouble(Double.longBitsToDouble(readLittleEndian64_NoCheck()));
            }
        }

        @Override // p000.hrd
        public int readEnum() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // p000.hrd
        public void readEnumList(List<Integer> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof b68)) {
                int tagWireType = hpi.getTagWireType(this.f45504j);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw ce8.m3922e();
                    }
                    int varint32 = this.f45501g + readVarint32();
                    while (this.f45501g < varint32) {
                        target.add(Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                do {
                    target.add(Integer.valueOf(readEnum()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i;
                return;
            }
            b68 b68Var = (b68) target;
            int tagWireType2 = hpi.getTagWireType(this.f45504j);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw ce8.m3922e();
                }
                int varint322 = this.f45501g + readVarint32();
                while (this.f45501g < varint322) {
                    b68Var.addInt(readVarint32());
                }
                return;
            }
            do {
                b68Var.addInt(readEnum());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f45501g;
                }
            } while (readVarint32() == this.f45504j);
            this.f45501g = i2;
        }

        @Override // p000.hrd
        public int readFixed32() throws IOException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // p000.hrd
        public void readFixed32List(List<Integer> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof b68)) {
                int tagWireType = hpi.getTagWireType(this.f45504j);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i3 = this.f45501g + varint32;
                    while (this.f45501g < i3) {
                        target.add(Integer.valueOf(readLittleEndian32_NoCheck()));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw ce8.m3922e();
                }
                do {
                    target.add(Integer.valueOf(readFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i;
                return;
            }
            b68 b68Var = (b68) target;
            int tagWireType2 = hpi.getTagWireType(this.f45504j);
            if (tagWireType2 == 2) {
                int varint322 = readVarint32();
                verifyPackedFixed32Length(varint322);
                int i4 = this.f45501g + varint322;
                while (this.f45501g < i4) {
                    b68Var.addInt(readLittleEndian32_NoCheck());
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw ce8.m3922e();
            }
            do {
                b68Var.addInt(readFixed32());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f45501g;
                }
            } while (readVarint32() == this.f45504j);
            this.f45501g = i2;
        }

        @Override // p000.hrd
        public long readFixed64() throws IOException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // p000.hrd
        public void readFixed64List(List<Long> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof rk9)) {
                int tagWireType = hpi.getTagWireType(this.f45504j);
                if (tagWireType == 1) {
                    do {
                        target.add(Long.valueOf(readFixed64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i = this.f45501g;
                        }
                    } while (readVarint32() == this.f45504j);
                    this.f45501g = i;
                    return;
                }
                if (tagWireType != 2) {
                    throw ce8.m3922e();
                }
                int varint32 = readVarint32();
                verifyPackedFixed64Length(varint32);
                int i3 = this.f45501g + varint32;
                while (this.f45501g < i3) {
                    target.add(Long.valueOf(readLittleEndian64_NoCheck()));
                }
                return;
            }
            rk9 rk9Var = (rk9) target;
            int tagWireType2 = hpi.getTagWireType(this.f45504j);
            if (tagWireType2 == 1) {
                do {
                    rk9Var.addLong(readFixed64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i2;
                return;
            }
            if (tagWireType2 != 2) {
                throw ce8.m3922e();
            }
            int varint322 = readVarint32();
            verifyPackedFixed64Length(varint322);
            int i4 = this.f45501g + varint322;
            while (this.f45501g < i4) {
                rk9Var.addLong(readLittleEndian64_NoCheck());
            }
        }

        @Override // p000.hrd
        public float readFloat() throws IOException {
            requireWireType(5);
            return Float.intBitsToFloat(readLittleEndian32());
        }

        @Override // p000.hrd
        public void readFloatList(List<Float> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof a46)) {
                int tagWireType = hpi.getTagWireType(this.f45504j);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i3 = this.f45501g + varint32;
                    while (this.f45501g < i3) {
                        target.add(Float.valueOf(Float.intBitsToFloat(readLittleEndian32_NoCheck())));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw ce8.m3922e();
                }
                do {
                    target.add(Float.valueOf(readFloat()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i;
                return;
            }
            a46 a46Var = (a46) target;
            int tagWireType2 = hpi.getTagWireType(this.f45504j);
            if (tagWireType2 == 2) {
                int varint322 = readVarint32();
                verifyPackedFixed32Length(varint322);
                int i4 = this.f45501g + varint322;
                while (this.f45501g < i4) {
                    a46Var.addFloat(Float.intBitsToFloat(readLittleEndian32_NoCheck()));
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw ce8.m3922e();
            }
            do {
                a46Var.addFloat(readFloat());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f45501g;
                }
            } while (readVarint32() == this.f45504j);
            this.f45501g = i2;
        }

        @Override // p000.hrd
        @Deprecated
        public <T> T readGroup(Class<T> cls, zi5 zi5Var) throws IOException {
            requireWireType(3);
            return (T) readGroup(khd.getInstance().schemaFor((Class) cls), zi5Var);
        }

        @Override // p000.hrd
        @Deprecated
        public <T> T readGroupBySchemaWithCheck(tpe<T> tpeVar, zi5 zi5Var) throws IOException {
            requireWireType(3);
            return (T) readGroup(tpeVar, zi5Var);
        }

        @Override // p000.hrd
        @Deprecated
        public <T> void readGroupList(List<T> target, Class<T> targetType, zi5 extensionRegistry) throws IOException {
            readGroupList(target, khd.getInstance().schemaFor((Class) targetType), extensionRegistry);
        }

        @Override // p000.hrd
        public int readInt32() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // p000.hrd
        public void readInt32List(List<Integer> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof b68)) {
                int tagWireType = hpi.getTagWireType(this.f45504j);
                if (tagWireType == 0) {
                    do {
                        target.add(Integer.valueOf(readInt32()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i = this.f45501g;
                        }
                    } while (readVarint32() == this.f45504j);
                    this.f45501g = i;
                    return;
                }
                if (tagWireType != 2) {
                    throw ce8.m3922e();
                }
                int varint32 = this.f45501g + readVarint32();
                while (this.f45501g < varint32) {
                    target.add(Integer.valueOf(readVarint32()));
                }
                requirePosition(varint32);
                return;
            }
            b68 b68Var = (b68) target;
            int tagWireType2 = hpi.getTagWireType(this.f45504j);
            if (tagWireType2 == 0) {
                do {
                    b68Var.addInt(readInt32());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i2;
                return;
            }
            if (tagWireType2 != 2) {
                throw ce8.m3922e();
            }
            int varint322 = this.f45501g + readVarint32();
            while (this.f45501g < varint322) {
                b68Var.addInt(readVarint32());
            }
            requirePosition(varint322);
        }

        @Override // p000.hrd
        public long readInt64() throws IOException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // p000.hrd
        public void readInt64List(List<Long> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof rk9)) {
                int tagWireType = hpi.getTagWireType(this.f45504j);
                if (tagWireType == 0) {
                    do {
                        target.add(Long.valueOf(readInt64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i = this.f45501g;
                        }
                    } while (readVarint32() == this.f45504j);
                    this.f45501g = i;
                    return;
                }
                if (tagWireType != 2) {
                    throw ce8.m3922e();
                }
                int varint32 = this.f45501g + readVarint32();
                while (this.f45501g < varint32) {
                    target.add(Long.valueOf(readVarint64()));
                }
                requirePosition(varint32);
                return;
            }
            rk9 rk9Var = (rk9) target;
            int tagWireType2 = hpi.getTagWireType(this.f45504j);
            if (tagWireType2 == 0) {
                do {
                    rk9Var.addLong(readInt64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i2;
                return;
            }
            if (tagWireType2 != 2) {
                throw ce8.m3922e();
            }
            int varint322 = this.f45501g + readVarint32();
            while (this.f45501g < varint322) {
                rk9Var.addLong(readVarint64());
            }
            requirePosition(varint322);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.hrd
        public <K, V> void readMap(Map<K, V> target, os9.C10633b<K, V> metadata, zi5 extensionRegistry) throws IOException {
            requireWireType(2);
            int varint32 = readVarint32();
            requireBytes(varint32);
            int i = this.f45503i;
            this.f45503i = this.f45501g + varint32;
            try {
                Object field = metadata.f68568b;
                Object field2 = metadata.f68570d;
                while (true) {
                    int fieldNumber = getFieldNumber();
                    if (fieldNumber == Integer.MAX_VALUE) {
                        target.put(field, field2);
                        return;
                    }
                    if (fieldNumber == 1) {
                        field = readField(metadata.f68567a, null, null);
                    } else if (fieldNumber != 2) {
                        try {
                            if (!skipField()) {
                                throw new ce8("Unable to parse map entry.");
                            }
                        } catch (ce8.C2294a unused) {
                            if (!skipField()) {
                                throw new ce8("Unable to parse map entry.");
                            }
                        }
                    } else {
                        field2 = readField(metadata.f68569c, metadata.f68570d.getClass(), extensionRegistry);
                    }
                }
            } finally {
                this.f45503i = i;
            }
        }

        @Override // p000.hrd
        public <T> T readMessage(Class<T> cls, zi5 zi5Var) throws IOException {
            requireWireType(2);
            return (T) readMessage(khd.getInstance().schemaFor((Class) cls), zi5Var);
        }

        @Override // p000.hrd
        public <T> T readMessageBySchemaWithCheck(tpe<T> tpeVar, zi5 zi5Var) throws IOException {
            requireWireType(2);
            return (T) readMessage(tpeVar, zi5Var);
        }

        @Override // p000.hrd
        public <T> void readMessageList(List<T> target, Class<T> targetType, zi5 extensionRegistry) throws IOException {
            readMessageList(target, khd.getInstance().schemaFor((Class) targetType), extensionRegistry);
        }

        @Override // p000.hrd
        public int readSFixed32() throws IOException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // p000.hrd
        public void readSFixed32List(List<Integer> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof b68)) {
                int tagWireType = hpi.getTagWireType(this.f45504j);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i3 = this.f45501g + varint32;
                    while (this.f45501g < i3) {
                        target.add(Integer.valueOf(readLittleEndian32_NoCheck()));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw ce8.m3922e();
                }
                do {
                    target.add(Integer.valueOf(readSFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i;
                return;
            }
            b68 b68Var = (b68) target;
            int tagWireType2 = hpi.getTagWireType(this.f45504j);
            if (tagWireType2 == 2) {
                int varint322 = readVarint32();
                verifyPackedFixed32Length(varint322);
                int i4 = this.f45501g + varint322;
                while (this.f45501g < i4) {
                    b68Var.addInt(readLittleEndian32_NoCheck());
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw ce8.m3922e();
            }
            do {
                b68Var.addInt(readSFixed32());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f45501g;
                }
            } while (readVarint32() == this.f45504j);
            this.f45501g = i2;
        }

        @Override // p000.hrd
        public long readSFixed64() throws IOException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // p000.hrd
        public void readSFixed64List(List<Long> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof rk9)) {
                int tagWireType = hpi.getTagWireType(this.f45504j);
                if (tagWireType == 1) {
                    do {
                        target.add(Long.valueOf(readSFixed64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i = this.f45501g;
                        }
                    } while (readVarint32() == this.f45504j);
                    this.f45501g = i;
                    return;
                }
                if (tagWireType != 2) {
                    throw ce8.m3922e();
                }
                int varint32 = readVarint32();
                verifyPackedFixed64Length(varint32);
                int i3 = this.f45501g + varint32;
                while (this.f45501g < i3) {
                    target.add(Long.valueOf(readLittleEndian64_NoCheck()));
                }
                return;
            }
            rk9 rk9Var = (rk9) target;
            int tagWireType2 = hpi.getTagWireType(this.f45504j);
            if (tagWireType2 == 1) {
                do {
                    rk9Var.addLong(readSFixed64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i2;
                return;
            }
            if (tagWireType2 != 2) {
                throw ce8.m3922e();
            }
            int varint322 = readVarint32();
            verifyPackedFixed64Length(varint322);
            int i4 = this.f45501g + varint322;
            while (this.f45501g < i4) {
                rk9Var.addLong(readLittleEndian64_NoCheck());
            }
        }

        @Override // p000.hrd
        public int readSInt32() throws IOException {
            requireWireType(0);
            return f72.decodeZigZag32(readVarint32());
        }

        @Override // p000.hrd
        public void readSInt32List(List<Integer> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof b68)) {
                int tagWireType = hpi.getTagWireType(this.f45504j);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw ce8.m3922e();
                    }
                    int varint32 = this.f45501g + readVarint32();
                    while (this.f45501g < varint32) {
                        target.add(Integer.valueOf(f72.decodeZigZag32(readVarint32())));
                    }
                    return;
                }
                do {
                    target.add(Integer.valueOf(readSInt32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i;
                return;
            }
            b68 b68Var = (b68) target;
            int tagWireType2 = hpi.getTagWireType(this.f45504j);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw ce8.m3922e();
                }
                int varint322 = this.f45501g + readVarint32();
                while (this.f45501g < varint322) {
                    b68Var.addInt(f72.decodeZigZag32(readVarint32()));
                }
                return;
            }
            do {
                b68Var.addInt(readSInt32());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f45501g;
                }
            } while (readVarint32() == this.f45504j);
            this.f45501g = i2;
        }

        @Override // p000.hrd
        public long readSInt64() throws IOException {
            requireWireType(0);
            return f72.decodeZigZag64(readVarint64());
        }

        @Override // p000.hrd
        public void readSInt64List(List<Long> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof rk9)) {
                int tagWireType = hpi.getTagWireType(this.f45504j);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw ce8.m3922e();
                    }
                    int varint32 = this.f45501g + readVarint32();
                    while (this.f45501g < varint32) {
                        target.add(Long.valueOf(f72.decodeZigZag64(readVarint64())));
                    }
                    return;
                }
                do {
                    target.add(Long.valueOf(readSInt64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i;
                return;
            }
            rk9 rk9Var = (rk9) target;
            int tagWireType2 = hpi.getTagWireType(this.f45504j);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw ce8.m3922e();
                }
                int varint322 = this.f45501g + readVarint32();
                while (this.f45501g < varint322) {
                    rk9Var.addLong(f72.decodeZigZag64(readVarint64()));
                }
                return;
            }
            do {
                rk9Var.addLong(readSInt64());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f45501g;
                }
            } while (readVarint32() == this.f45504j);
            this.f45501g = i2;
        }

        @Override // p000.hrd
        public String readString() throws IOException {
            return readStringInternal(false);
        }

        public String readStringInternal(boolean requireUtf8) throws IOException {
            requireWireType(2);
            int varint32 = readVarint32();
            if (varint32 == 0) {
                return "";
            }
            requireBytes(varint32);
            if (requireUtf8) {
                byte[] bArr = this.f45500f;
                int i = this.f45501g;
                if (!pzh.m19874n(bArr, i, i + varint32)) {
                    throw ce8.m3921d();
                }
            }
            String str = new String(this.f45500f, this.f45501g, varint32, w98.f93674b);
            this.f45501g += varint32;
            return str;
        }

        @Override // p000.hrd
        public void readStringList(List<String> target) throws IOException {
            readStringListInternal(target, false);
        }

        public void readStringListInternal(List<String> target, boolean requireUtf8) throws IOException {
            int i;
            int i2;
            if (hpi.getTagWireType(this.f45504j) != 2) {
                throw ce8.m3922e();
            }
            if (!(target instanceof e39) || requireUtf8) {
                do {
                    target.add(readStringInternal(requireUtf8));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i;
                return;
            }
            e39 e39Var = (e39) target;
            do {
                e39Var.add(readBytes());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f45501g;
                }
            } while (readVarint32() == this.f45504j);
            this.f45501g = i2;
        }

        @Override // p000.hrd
        public void readStringListRequireUtf8(List<String> target) throws IOException {
            readStringListInternal(target, true);
        }

        @Override // p000.hrd
        public String readStringRequireUtf8() throws IOException {
            return readStringInternal(true);
        }

        @Override // p000.hrd
        public int readUInt32() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // p000.hrd
        public void readUInt32List(List<Integer> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof b68)) {
                int tagWireType = hpi.getTagWireType(this.f45504j);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw ce8.m3922e();
                    }
                    int varint32 = this.f45501g + readVarint32();
                    while (this.f45501g < varint32) {
                        target.add(Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                do {
                    target.add(Integer.valueOf(readUInt32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i;
                return;
            }
            b68 b68Var = (b68) target;
            int tagWireType2 = hpi.getTagWireType(this.f45504j);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw ce8.m3922e();
                }
                int varint322 = this.f45501g + readVarint32();
                while (this.f45501g < varint322) {
                    b68Var.addInt(readVarint32());
                }
                return;
            }
            do {
                b68Var.addInt(readUInt32());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f45501g;
                }
            } while (readVarint32() == this.f45504j);
            this.f45501g = i2;
        }

        @Override // p000.hrd
        public long readUInt64() throws IOException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // p000.hrd
        public void readUInt64List(List<Long> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof rk9)) {
                int tagWireType = hpi.getTagWireType(this.f45504j);
                if (tagWireType == 0) {
                    do {
                        target.add(Long.valueOf(readUInt64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i = this.f45501g;
                        }
                    } while (readVarint32() == this.f45504j);
                    this.f45501g = i;
                    return;
                }
                if (tagWireType != 2) {
                    throw ce8.m3922e();
                }
                int varint32 = this.f45501g + readVarint32();
                while (this.f45501g < varint32) {
                    target.add(Long.valueOf(readVarint64()));
                }
                requirePosition(varint32);
                return;
            }
            rk9 rk9Var = (rk9) target;
            int tagWireType2 = hpi.getTagWireType(this.f45504j);
            if (tagWireType2 == 0) {
                do {
                    rk9Var.addLong(readUInt64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.f45501g;
                    }
                } while (readVarint32() == this.f45504j);
                this.f45501g = i2;
                return;
            }
            if (tagWireType2 != 2) {
                throw ce8.m3922e();
            }
            int varint322 = this.f45501g + readVarint32();
            while (this.f45501g < varint322) {
                rk9Var.addLong(readVarint64());
            }
            requirePosition(varint322);
        }

        public long readVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f45501g;
            int i2 = this.f45503i;
            if (i2 == i) {
                throw ce8.m3928l();
            }
            byte[] bArr = this.f45500f;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f45501g = i3;
                return b;
            }
            if (i2 - i3 < 9) {
                return readVarint64SlowPath();
            }
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
                                            if (bArr[i4] < 0) {
                                                throw ce8.m3923f();
                                            }
                                            i4 = i11;
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
            this.f45501g = i4;
            return j;
        }

        @Override // p000.hrd
        public boolean skipField() throws IOException {
            int i;
            if (isAtEnd() || (i = this.f45504j) == this.f45505k) {
                return false;
            }
            int tagWireType = hpi.getTagWireType(i);
            if (tagWireType == 0) {
                skipVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipBytes(readVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipGroup();
                return true;
            }
            if (tagWireType != 5) {
                throw ce8.m3922e();
            }
            skipBytes(4);
            return true;
        }

        private <T> T readGroup(tpe<T> schema, zi5 extensionRegistry) throws IOException {
            T tNewInstance = schema.newInstance();
            mergeGroupField(tNewInstance, schema, extensionRegistry);
            schema.makeImmutable(tNewInstance);
            return tNewInstance;
        }

        private <T> T readMessage(tpe<T> schema, zi5 extensionRegistry) throws IOException {
            T tNewInstance = schema.newInstance();
            mergeMessageField(tNewInstance, schema, extensionRegistry);
            schema.makeImmutable(tNewInstance);
            return tNewInstance;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.hrd
        @Deprecated
        public <T> void readGroupList(List<T> target, tpe<T> schema, zi5 extensionRegistry) throws IOException {
            int i;
            if (hpi.getTagWireType(this.f45504j) == 3) {
                int i2 = this.f45504j;
                do {
                    target.add(readGroup(schema, extensionRegistry));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f45501g;
                    }
                } while (readVarint32() == i2);
                this.f45501g = i;
                return;
            }
            throw ce8.m3922e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.hrd
        public <T> void readMessageList(List<T> target, tpe<T> schema, zi5 extensionRegistry) throws IOException {
            int i;
            if (hpi.getTagWireType(this.f45504j) == 2) {
                int i2 = this.f45504j;
                do {
                    target.add(readMessage(schema, extensionRegistry));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f45501g;
                    }
                } while (readVarint32() == i2);
                this.f45501g = i;
                return;
            }
            throw ce8.m3922e();
        }
    }

    private i21() {
    }
}
