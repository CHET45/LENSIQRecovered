package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p000.be8;
import p000.gpi;
import p000.ns9;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public abstract class h21 implements ird {

    /* JADX INFO: renamed from: c */
    public static final int f42052c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f42053d = 7;

    /* JADX INFO: renamed from: h21$a */
    public static /* synthetic */ class C6679a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f42054a;

        static {
            int[] iArr = new int[gpi.EnumC6460b.values().length];
            f42054a = iArr;
            try {
                iArr[gpi.EnumC6460b.f40750H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40755Q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40762c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40758Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40749F.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40748C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40763d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40766m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40764e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40754N.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40759Z.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40753M1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40756V1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40760Z1.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40751L.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40757X.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f42054a[gpi.EnumC6460b.f40765f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public /* synthetic */ h21(C6679a c6679a) {
        this();
    }

    public static h21 newInstance(ByteBuffer buffer, boolean bufferIsImmutable) {
        if (buffer.hasArray()) {
            return new C6680b(buffer, bufferIsImmutable);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    public abstract int getTotalBytesRead();

    @Override // p000.ird
    public boolean shouldDiscardUnknownFields() {
        return false;
    }

    /* JADX INFO: renamed from: h21$b */
    public static final class C6680b extends h21 {

        /* JADX INFO: renamed from: e */
        public final boolean f42055e;

        /* JADX INFO: renamed from: f */
        public final byte[] f42056f;

        /* JADX INFO: renamed from: g */
        public int f42057g;

        /* JADX INFO: renamed from: h */
        public final int f42058h;

        /* JADX INFO: renamed from: i */
        public int f42059i;

        /* JADX INFO: renamed from: j */
        public int f42060j;

        /* JADX INFO: renamed from: k */
        public int f42061k;

        public C6680b(ByteBuffer bytebuf, boolean bufferIsImmutable) {
            super(null);
            this.f42055e = bufferIsImmutable;
            this.f42056f = bytebuf.array();
            int iArrayOffset = bytebuf.arrayOffset() + bytebuf.position();
            this.f42057g = iArrayOffset;
            this.f42058h = iArrayOffset;
            this.f42059i = bytebuf.arrayOffset() + bytebuf.limit();
        }

        private boolean isAtEnd() {
            return this.f42057g == this.f42059i;
        }

        private byte readByte() throws IOException {
            int i = this.f42057g;
            if (i == this.f42059i) {
                throw be8.m3084l();
            }
            byte[] bArr = this.f42056f;
            this.f42057g = i + 1;
            return bArr[i];
        }

        private Object readField(gpi.EnumC6460b fieldType, Class<?> messageType, yi5 extensionRegistry) throws IOException {
            switch (C6679a.f42054a[fieldType.ordinal()]) {
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
            int i = this.f42057g;
            byte[] bArr = this.f42056f;
            this.f42057g = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        private long readLittleEndian64() throws IOException {
            requireBytes(8);
            return readLittleEndian64_NoCheck();
        }

        private long readLittleEndian64_NoCheck() {
            int i = this.f42057g;
            byte[] bArr = this.f42056f;
            this.f42057g = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        private int readVarint32() throws IOException {
            int i;
            int i2 = this.f42057g;
            int i3 = this.f42059i;
            if (i3 == i2) {
                throw be8.m3084l();
            }
            byte[] bArr = this.f42056f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f42057g = i4;
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
                                                throw be8.m3079f();
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
            this.f42057g = i5;
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
            throw be8.m3079f();
        }

        private void requireBytes(int size) throws IOException {
            if (size < 0 || size > this.f42059i - this.f42057g) {
                throw be8.m3084l();
            }
        }

        private void requirePosition(int expectedPosition) throws IOException {
            if (this.f42057g != expectedPosition) {
                throw be8.m3084l();
            }
        }

        private void requireWireType(int requiredWireType) throws IOException {
            if (gpi.getTagWireType(this.f42060j) != requiredWireType) {
                throw be8.m3078e();
            }
        }

        private void skipBytes(final int size) throws IOException {
            requireBytes(size);
            this.f42057g += size;
        }

        private void skipGroup() throws IOException {
            int i = this.f42061k;
            this.f42061k = gpi.m11819a(gpi.getTagFieldNumber(this.f42060j), 4);
            while (getFieldNumber() != Integer.MAX_VALUE && skipField()) {
            }
            if (this.f42060j != this.f42061k) {
                throw be8.m3081h();
            }
            this.f42061k = i;
        }

        private void skipVarint() throws IOException {
            int i = this.f42059i;
            int i2 = this.f42057g;
            if (i - i2 >= 10) {
                byte[] bArr = this.f42056f;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f42057g = i4;
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
            throw be8.m3079f();
        }

        private void verifyPackedFixed32Length(int bytes) throws IOException {
            requireBytes(bytes);
            if ((bytes & 3) != 0) {
                throw be8.m3081h();
            }
        }

        private void verifyPackedFixed64Length(int bytes) throws IOException {
            requireBytes(bytes);
            if ((bytes & 7) != 0) {
                throw be8.m3081h();
            }
        }

        @Override // p000.ird
        public int getFieldNumber() throws IOException {
            if (isAtEnd()) {
                return Integer.MAX_VALUE;
            }
            int varint32 = readVarint32();
            this.f42060j = varint32;
            if (varint32 == this.f42061k) {
                return Integer.MAX_VALUE;
            }
            return gpi.getTagFieldNumber(varint32);
        }

        @Override // p000.ird
        public int getTag() {
            return this.f42060j;
        }

        @Override // p000.h21
        public int getTotalBytesRead() {
            return this.f42057g - this.f42058h;
        }

        @Override // p000.ird
        public <T> void mergeGroupField(T target, upe<T> schema, yi5 extensionRegistry) throws IOException {
            int i = this.f42061k;
            this.f42061k = gpi.m11819a(gpi.getTagFieldNumber(this.f42060j), 4);
            try {
                schema.mergeFrom(target, this, extensionRegistry);
                if (this.f42060j == this.f42061k) {
                } else {
                    throw be8.m3081h();
                }
            } finally {
                this.f42061k = i;
            }
        }

        @Override // p000.ird
        public <T> void mergeMessageField(T target, upe<T> schema, yi5 extensionRegistry) throws IOException {
            int varint32 = readVarint32();
            requireBytes(varint32);
            int i = this.f42059i;
            int i2 = this.f42057g + varint32;
            this.f42059i = i2;
            try {
                schema.mergeFrom(target, this, extensionRegistry);
                if (this.f42057g == i2) {
                } else {
                    throw be8.m3081h();
                }
            } finally {
                this.f42059i = i;
            }
        }

        @Override // p000.ird
        public boolean readBool() throws IOException {
            requireWireType(0);
            return readVarint32() != 0;
        }

        @Override // p000.ird
        public void readBoolList(List<Boolean> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof sa1)) {
                int tagWireType = gpi.getTagWireType(this.f42060j);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw be8.m3078e();
                    }
                    int varint32 = this.f42057g + readVarint32();
                    while (this.f42057g < varint32) {
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
                        i = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i;
                return;
            }
            sa1 sa1Var = (sa1) target;
            int tagWireType2 = gpi.getTagWireType(this.f42060j);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw be8.m3078e();
                }
                int varint322 = this.f42057g + readVarint32();
                while (this.f42057g < varint322) {
                    sa1Var.addBoolean(readVarint32() != 0);
                }
                requirePosition(varint322);
                return;
            }
            do {
                sa1Var.addBoolean(readBool());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f42057g;
                }
            } while (readVarint32() == this.f42060j);
            this.f42057g = i2;
        }

        @Override // p000.ird
        public wj1 readBytes() throws IOException {
            requireWireType(2);
            int varint32 = readVarint32();
            if (varint32 == 0) {
                return wj1.f94379e;
            }
            requireBytes(varint32);
            wj1 wj1VarM24596o = this.f42055e ? wj1.m24596o(this.f42056f, this.f42057g, varint32) : wj1.copyFrom(this.f42056f, this.f42057g, varint32);
            this.f42057g += varint32;
            return wj1VarM24596o;
        }

        @Override // p000.ird
        public void readBytesList(List<wj1> target) throws IOException {
            int i;
            if (gpi.getTagWireType(this.f42060j) != 2) {
                throw be8.m3078e();
            }
            do {
                target.add(readBytes());
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.f42057g;
                }
            } while (readVarint32() == this.f42060j);
            this.f42057g = i;
        }

        @Override // p000.ird
        public double readDouble() throws IOException {
            requireWireType(1);
            return Double.longBitsToDouble(readLittleEndian64());
        }

        @Override // p000.ird
        public void readDoubleList(List<Double> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof vj4)) {
                int tagWireType = gpi.getTagWireType(this.f42060j);
                if (tagWireType == 1) {
                    do {
                        target.add(Double.valueOf(readDouble()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i = this.f42057g;
                        }
                    } while (readVarint32() == this.f42060j);
                    this.f42057g = i;
                    return;
                }
                if (tagWireType != 2) {
                    throw be8.m3078e();
                }
                int varint32 = readVarint32();
                verifyPackedFixed64Length(varint32);
                int i3 = this.f42057g + varint32;
                while (this.f42057g < i3) {
                    target.add(Double.valueOf(Double.longBitsToDouble(readLittleEndian64_NoCheck())));
                }
                return;
            }
            vj4 vj4Var = (vj4) target;
            int tagWireType2 = gpi.getTagWireType(this.f42060j);
            if (tagWireType2 == 1) {
                do {
                    vj4Var.addDouble(readDouble());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i2;
                return;
            }
            if (tagWireType2 != 2) {
                throw be8.m3078e();
            }
            int varint322 = readVarint32();
            verifyPackedFixed64Length(varint322);
            int i4 = this.f42057g + varint322;
            while (this.f42057g < i4) {
                vj4Var.addDouble(Double.longBitsToDouble(readLittleEndian64_NoCheck()));
            }
        }

        @Override // p000.ird
        public int readEnum() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // p000.ird
        public void readEnumList(List<Integer> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof c68)) {
                int tagWireType = gpi.getTagWireType(this.f42060j);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw be8.m3078e();
                    }
                    int varint32 = this.f42057g + readVarint32();
                    while (this.f42057g < varint32) {
                        target.add(Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                do {
                    target.add(Integer.valueOf(readEnum()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i;
                return;
            }
            c68 c68Var = (c68) target;
            int tagWireType2 = gpi.getTagWireType(this.f42060j);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw be8.m3078e();
                }
                int varint322 = this.f42057g + readVarint32();
                while (this.f42057g < varint322) {
                    c68Var.addInt(readVarint32());
                }
                return;
            }
            do {
                c68Var.addInt(readEnum());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f42057g;
                }
            } while (readVarint32() == this.f42060j);
            this.f42057g = i2;
        }

        @Override // p000.ird
        public int readFixed32() throws IOException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // p000.ird
        public void readFixed32List(List<Integer> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof c68)) {
                int tagWireType = gpi.getTagWireType(this.f42060j);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i3 = this.f42057g + varint32;
                    while (this.f42057g < i3) {
                        target.add(Integer.valueOf(readLittleEndian32_NoCheck()));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw be8.m3078e();
                }
                do {
                    target.add(Integer.valueOf(readFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i;
                return;
            }
            c68 c68Var = (c68) target;
            int tagWireType2 = gpi.getTagWireType(this.f42060j);
            if (tagWireType2 == 2) {
                int varint322 = readVarint32();
                verifyPackedFixed32Length(varint322);
                int i4 = this.f42057g + varint322;
                while (this.f42057g < i4) {
                    c68Var.addInt(readLittleEndian32_NoCheck());
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw be8.m3078e();
            }
            do {
                c68Var.addInt(readFixed32());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f42057g;
                }
            } while (readVarint32() == this.f42060j);
            this.f42057g = i2;
        }

        @Override // p000.ird
        public long readFixed64() throws IOException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // p000.ird
        public void readFixed64List(List<Long> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof sk9)) {
                int tagWireType = gpi.getTagWireType(this.f42060j);
                if (tagWireType == 1) {
                    do {
                        target.add(Long.valueOf(readFixed64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i = this.f42057g;
                        }
                    } while (readVarint32() == this.f42060j);
                    this.f42057g = i;
                    return;
                }
                if (tagWireType != 2) {
                    throw be8.m3078e();
                }
                int varint32 = readVarint32();
                verifyPackedFixed64Length(varint32);
                int i3 = this.f42057g + varint32;
                while (this.f42057g < i3) {
                    target.add(Long.valueOf(readLittleEndian64_NoCheck()));
                }
                return;
            }
            sk9 sk9Var = (sk9) target;
            int tagWireType2 = gpi.getTagWireType(this.f42060j);
            if (tagWireType2 == 1) {
                do {
                    sk9Var.addLong(readFixed64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i2;
                return;
            }
            if (tagWireType2 != 2) {
                throw be8.m3078e();
            }
            int varint322 = readVarint32();
            verifyPackedFixed64Length(varint322);
            int i4 = this.f42057g + varint322;
            while (this.f42057g < i4) {
                sk9Var.addLong(readLittleEndian64_NoCheck());
            }
        }

        @Override // p000.ird
        public float readFloat() throws IOException {
            requireWireType(5);
            return Float.intBitsToFloat(readLittleEndian32());
        }

        @Override // p000.ird
        public void readFloatList(List<Float> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof b46)) {
                int tagWireType = gpi.getTagWireType(this.f42060j);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i3 = this.f42057g + varint32;
                    while (this.f42057g < i3) {
                        target.add(Float.valueOf(Float.intBitsToFloat(readLittleEndian32_NoCheck())));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw be8.m3078e();
                }
                do {
                    target.add(Float.valueOf(readFloat()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i;
                return;
            }
            b46 b46Var = (b46) target;
            int tagWireType2 = gpi.getTagWireType(this.f42060j);
            if (tagWireType2 == 2) {
                int varint322 = readVarint32();
                verifyPackedFixed32Length(varint322);
                int i4 = this.f42057g + varint322;
                while (this.f42057g < i4) {
                    b46Var.addFloat(Float.intBitsToFloat(readLittleEndian32_NoCheck()));
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw be8.m3078e();
            }
            do {
                b46Var.addFloat(readFloat());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f42057g;
                }
            } while (readVarint32() == this.f42060j);
            this.f42057g = i2;
        }

        @Override // p000.ird
        @Deprecated
        public <T> T readGroup(Class<T> cls, yi5 yi5Var) throws IOException {
            requireWireType(3);
            return (T) readGroup(lhd.getInstance().schemaFor((Class) cls), yi5Var);
        }

        @Override // p000.ird
        @Deprecated
        public <T> T readGroupBySchemaWithCheck(upe<T> upeVar, yi5 yi5Var) throws IOException {
            requireWireType(3);
            return (T) readGroup(upeVar, yi5Var);
        }

        @Override // p000.ird
        @Deprecated
        public <T> void readGroupList(List<T> target, Class<T> targetType, yi5 extensionRegistry) throws IOException {
            readGroupList(target, lhd.getInstance().schemaFor((Class) targetType), extensionRegistry);
        }

        @Override // p000.ird
        public int readInt32() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // p000.ird
        public void readInt32List(List<Integer> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof c68)) {
                int tagWireType = gpi.getTagWireType(this.f42060j);
                if (tagWireType == 0) {
                    do {
                        target.add(Integer.valueOf(readInt32()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i = this.f42057g;
                        }
                    } while (readVarint32() == this.f42060j);
                    this.f42057g = i;
                    return;
                }
                if (tagWireType != 2) {
                    throw be8.m3078e();
                }
                int varint32 = this.f42057g + readVarint32();
                while (this.f42057g < varint32) {
                    target.add(Integer.valueOf(readVarint32()));
                }
                requirePosition(varint32);
                return;
            }
            c68 c68Var = (c68) target;
            int tagWireType2 = gpi.getTagWireType(this.f42060j);
            if (tagWireType2 == 0) {
                do {
                    c68Var.addInt(readInt32());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i2;
                return;
            }
            if (tagWireType2 != 2) {
                throw be8.m3078e();
            }
            int varint322 = this.f42057g + readVarint32();
            while (this.f42057g < varint322) {
                c68Var.addInt(readVarint32());
            }
            requirePosition(varint322);
        }

        @Override // p000.ird
        public long readInt64() throws IOException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // p000.ird
        public void readInt64List(List<Long> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof sk9)) {
                int tagWireType = gpi.getTagWireType(this.f42060j);
                if (tagWireType == 0) {
                    do {
                        target.add(Long.valueOf(readInt64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i = this.f42057g;
                        }
                    } while (readVarint32() == this.f42060j);
                    this.f42057g = i;
                    return;
                }
                if (tagWireType != 2) {
                    throw be8.m3078e();
                }
                int varint32 = this.f42057g + readVarint32();
                while (this.f42057g < varint32) {
                    target.add(Long.valueOf(readVarint64()));
                }
                requirePosition(varint32);
                return;
            }
            sk9 sk9Var = (sk9) target;
            int tagWireType2 = gpi.getTagWireType(this.f42060j);
            if (tagWireType2 == 0) {
                do {
                    sk9Var.addLong(readInt64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i2;
                return;
            }
            if (tagWireType2 != 2) {
                throw be8.m3078e();
            }
            int varint322 = this.f42057g + readVarint32();
            while (this.f42057g < varint322) {
                sk9Var.addLong(readVarint64());
            }
            requirePosition(varint322);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ird
        public <K, V> void readMap(Map<K, V> target, ns9.C10042b<K, V> metadata, yi5 extensionRegistry) throws IOException {
            requireWireType(2);
            int varint32 = readVarint32();
            requireBytes(varint32);
            int i = this.f42059i;
            this.f42059i = this.f42057g + varint32;
            try {
                Object field = metadata.f65507b;
                Object field2 = metadata.f65509d;
                while (true) {
                    int fieldNumber = getFieldNumber();
                    if (fieldNumber == Integer.MAX_VALUE) {
                        target.put(field, field2);
                        return;
                    }
                    if (fieldNumber == 1) {
                        field = readField(metadata.f65506a, null, null);
                    } else if (fieldNumber != 2) {
                        try {
                            if (!skipField()) {
                                throw new be8("Unable to parse map entry.");
                            }
                        } catch (be8.C1862a unused) {
                            if (!skipField()) {
                                throw new be8("Unable to parse map entry.");
                            }
                        }
                    } else {
                        field2 = readField(metadata.f65508c, metadata.f65509d.getClass(), extensionRegistry);
                    }
                }
            } finally {
                this.f42059i = i;
            }
        }

        @Override // p000.ird
        public <T> T readMessage(Class<T> cls, yi5 yi5Var) throws IOException {
            requireWireType(2);
            return (T) readMessage(lhd.getInstance().schemaFor((Class) cls), yi5Var);
        }

        @Override // p000.ird
        public <T> T readMessageBySchemaWithCheck(upe<T> upeVar, yi5 yi5Var) throws IOException {
            requireWireType(2);
            return (T) readMessage(upeVar, yi5Var);
        }

        @Override // p000.ird
        public <T> void readMessageList(List<T> target, Class<T> targetType, yi5 extensionRegistry) throws IOException {
            readMessageList(target, lhd.getInstance().schemaFor((Class) targetType), extensionRegistry);
        }

        @Override // p000.ird
        public int readSFixed32() throws IOException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // p000.ird
        public void readSFixed32List(List<Integer> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof c68)) {
                int tagWireType = gpi.getTagWireType(this.f42060j);
                if (tagWireType == 2) {
                    int varint32 = readVarint32();
                    verifyPackedFixed32Length(varint32);
                    int i3 = this.f42057g + varint32;
                    while (this.f42057g < i3) {
                        target.add(Integer.valueOf(readLittleEndian32_NoCheck()));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw be8.m3078e();
                }
                do {
                    target.add(Integer.valueOf(readSFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i;
                return;
            }
            c68 c68Var = (c68) target;
            int tagWireType2 = gpi.getTagWireType(this.f42060j);
            if (tagWireType2 == 2) {
                int varint322 = readVarint32();
                verifyPackedFixed32Length(varint322);
                int i4 = this.f42057g + varint322;
                while (this.f42057g < i4) {
                    c68Var.addInt(readLittleEndian32_NoCheck());
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw be8.m3078e();
            }
            do {
                c68Var.addInt(readSFixed32());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f42057g;
                }
            } while (readVarint32() == this.f42060j);
            this.f42057g = i2;
        }

        @Override // p000.ird
        public long readSFixed64() throws IOException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // p000.ird
        public void readSFixed64List(List<Long> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof sk9)) {
                int tagWireType = gpi.getTagWireType(this.f42060j);
                if (tagWireType == 1) {
                    do {
                        target.add(Long.valueOf(readSFixed64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i = this.f42057g;
                        }
                    } while (readVarint32() == this.f42060j);
                    this.f42057g = i;
                    return;
                }
                if (tagWireType != 2) {
                    throw be8.m3078e();
                }
                int varint32 = readVarint32();
                verifyPackedFixed64Length(varint32);
                int i3 = this.f42057g + varint32;
                while (this.f42057g < i3) {
                    target.add(Long.valueOf(readLittleEndian64_NoCheck()));
                }
                return;
            }
            sk9 sk9Var = (sk9) target;
            int tagWireType2 = gpi.getTagWireType(this.f42060j);
            if (tagWireType2 == 1) {
                do {
                    sk9Var.addLong(readSFixed64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i2;
                return;
            }
            if (tagWireType2 != 2) {
                throw be8.m3078e();
            }
            int varint322 = readVarint32();
            verifyPackedFixed64Length(varint322);
            int i4 = this.f42057g + varint322;
            while (this.f42057g < i4) {
                sk9Var.addLong(readLittleEndian64_NoCheck());
            }
        }

        @Override // p000.ird
        public int readSInt32() throws IOException {
            requireWireType(0);
            return e72.decodeZigZag32(readVarint32());
        }

        @Override // p000.ird
        public void readSInt32List(List<Integer> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof c68)) {
                int tagWireType = gpi.getTagWireType(this.f42060j);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw be8.m3078e();
                    }
                    int varint32 = this.f42057g + readVarint32();
                    while (this.f42057g < varint32) {
                        target.add(Integer.valueOf(e72.decodeZigZag32(readVarint32())));
                    }
                    return;
                }
                do {
                    target.add(Integer.valueOf(readSInt32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i;
                return;
            }
            c68 c68Var = (c68) target;
            int tagWireType2 = gpi.getTagWireType(this.f42060j);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw be8.m3078e();
                }
                int varint322 = this.f42057g + readVarint32();
                while (this.f42057g < varint322) {
                    c68Var.addInt(e72.decodeZigZag32(readVarint32()));
                }
                return;
            }
            do {
                c68Var.addInt(readSInt32());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f42057g;
                }
            } while (readVarint32() == this.f42060j);
            this.f42057g = i2;
        }

        @Override // p000.ird
        public long readSInt64() throws IOException {
            requireWireType(0);
            return e72.decodeZigZag64(readVarint64());
        }

        @Override // p000.ird
        public void readSInt64List(List<Long> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof sk9)) {
                int tagWireType = gpi.getTagWireType(this.f42060j);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw be8.m3078e();
                    }
                    int varint32 = this.f42057g + readVarint32();
                    while (this.f42057g < varint32) {
                        target.add(Long.valueOf(e72.decodeZigZag64(readVarint64())));
                    }
                    return;
                }
                do {
                    target.add(Long.valueOf(readSInt64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i;
                return;
            }
            sk9 sk9Var = (sk9) target;
            int tagWireType2 = gpi.getTagWireType(this.f42060j);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw be8.m3078e();
                }
                int varint322 = this.f42057g + readVarint32();
                while (this.f42057g < varint322) {
                    sk9Var.addLong(e72.decodeZigZag64(readVarint64()));
                }
                return;
            }
            do {
                sk9Var.addLong(readSInt64());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f42057g;
                }
            } while (readVarint32() == this.f42060j);
            this.f42057g = i2;
        }

        @Override // p000.ird
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
                byte[] bArr = this.f42056f;
                int i = this.f42057g;
                if (!lzh.m16496n(bArr, i, i + varint32)) {
                    throw be8.m3077d();
                }
            }
            String str = new String(this.f42056f, this.f42057g, varint32, v98.f90380b);
            this.f42057g += varint32;
            return str;
        }

        @Override // p000.ird
        public void readStringList(List<String> target) throws IOException {
            readStringListInternal(target, false);
        }

        public void readStringListInternal(List<String> target, boolean requireUtf8) throws IOException {
            int i;
            int i2;
            if (gpi.getTagWireType(this.f42060j) != 2) {
                throw be8.m3078e();
            }
            if (!(target instanceof f39) || requireUtf8) {
                do {
                    target.add(readStringInternal(requireUtf8));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i;
                return;
            }
            f39 f39Var = (f39) target;
            do {
                f39Var.add(readBytes());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f42057g;
                }
            } while (readVarint32() == this.f42060j);
            this.f42057g = i2;
        }

        @Override // p000.ird
        public void readStringListRequireUtf8(List<String> target) throws IOException {
            readStringListInternal(target, true);
        }

        @Override // p000.ird
        public String readStringRequireUtf8() throws IOException {
            return readStringInternal(true);
        }

        @Override // p000.ird
        public int readUInt32() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // p000.ird
        public void readUInt32List(List<Integer> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof c68)) {
                int tagWireType = gpi.getTagWireType(this.f42060j);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw be8.m3078e();
                    }
                    int varint32 = this.f42057g + readVarint32();
                    while (this.f42057g < varint32) {
                        target.add(Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                do {
                    target.add(Integer.valueOf(readUInt32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i;
                return;
            }
            c68 c68Var = (c68) target;
            int tagWireType2 = gpi.getTagWireType(this.f42060j);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw be8.m3078e();
                }
                int varint322 = this.f42057g + readVarint32();
                while (this.f42057g < varint322) {
                    c68Var.addInt(readVarint32());
                }
                return;
            }
            do {
                c68Var.addInt(readUInt32());
                if (isAtEnd()) {
                    return;
                } else {
                    i2 = this.f42057g;
                }
            } while (readVarint32() == this.f42060j);
            this.f42057g = i2;
        }

        @Override // p000.ird
        public long readUInt64() throws IOException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // p000.ird
        public void readUInt64List(List<Long> target) throws IOException {
            int i;
            int i2;
            if (!(target instanceof sk9)) {
                int tagWireType = gpi.getTagWireType(this.f42060j);
                if (tagWireType == 0) {
                    do {
                        target.add(Long.valueOf(readUInt64()));
                        if (isAtEnd()) {
                            return;
                        } else {
                            i = this.f42057g;
                        }
                    } while (readVarint32() == this.f42060j);
                    this.f42057g = i;
                    return;
                }
                if (tagWireType != 2) {
                    throw be8.m3078e();
                }
                int varint32 = this.f42057g + readVarint32();
                while (this.f42057g < varint32) {
                    target.add(Long.valueOf(readVarint64()));
                }
                requirePosition(varint32);
                return;
            }
            sk9 sk9Var = (sk9) target;
            int tagWireType2 = gpi.getTagWireType(this.f42060j);
            if (tagWireType2 == 0) {
                do {
                    sk9Var.addLong(readUInt64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.f42057g;
                    }
                } while (readVarint32() == this.f42060j);
                this.f42057g = i2;
                return;
            }
            if (tagWireType2 != 2) {
                throw be8.m3078e();
            }
            int varint322 = this.f42057g + readVarint32();
            while (this.f42057g < varint322) {
                sk9Var.addLong(readVarint64());
            }
            requirePosition(varint322);
        }

        public long readVarint64() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f42057g;
            int i2 = this.f42059i;
            if (i2 == i) {
                throw be8.m3084l();
            }
            byte[] bArr = this.f42056f;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f42057g = i3;
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
                                                throw be8.m3079f();
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
            this.f42057g = i4;
            return j;
        }

        @Override // p000.ird
        public boolean skipField() throws IOException {
            int i;
            if (isAtEnd() || (i = this.f42060j) == this.f42061k) {
                return false;
            }
            int tagWireType = gpi.getTagWireType(i);
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
                throw be8.m3078e();
            }
            skipBytes(4);
            return true;
        }

        private <T> T readGroup(upe<T> schema, yi5 extensionRegistry) throws IOException {
            T tNewInstance = schema.newInstance();
            mergeGroupField(tNewInstance, schema, extensionRegistry);
            schema.makeImmutable(tNewInstance);
            return tNewInstance;
        }

        private <T> T readMessage(upe<T> schema, yi5 extensionRegistry) throws IOException {
            T tNewInstance = schema.newInstance();
            mergeMessageField(tNewInstance, schema, extensionRegistry);
            schema.makeImmutable(tNewInstance);
            return tNewInstance;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ird
        @Deprecated
        public <T> void readGroupList(List<T> target, upe<T> schema, yi5 extensionRegistry) throws IOException {
            int i;
            if (gpi.getTagWireType(this.f42060j) == 3) {
                int i2 = this.f42060j;
                do {
                    target.add(readGroup(schema, extensionRegistry));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f42057g;
                    }
                } while (readVarint32() == i2);
                this.f42057g = i;
                return;
            }
            throw be8.m3078e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ird
        public <T> void readMessageList(List<T> target, upe<T> schema, yi5 extensionRegistry) throws IOException {
            int i;
            if (gpi.getTagWireType(this.f42060j) == 2) {
                int i2 = this.f42060j;
                do {
                    target.add(readMessage(schema, extensionRegistry));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.f42057g;
                    }
                } while (readVarint32() == i2);
                this.f42057g = i;
                return;
            }
            throw be8.m3078e();
        }
    }

    private h21() {
    }
}
