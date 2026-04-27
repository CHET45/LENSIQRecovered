package p000;

import java.io.IOException;
import java.util.List;
import p000.gpi;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class g72 implements ird {

    /* JADX INFO: renamed from: g */
    public static final int f38932g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f38933h = 7;

    /* JADX INFO: renamed from: i */
    public static final int f38934i = 0;

    /* JADX INFO: renamed from: c */
    public final e72 f38935c;

    /* JADX INFO: renamed from: d */
    public int f38936d;

    /* JADX INFO: renamed from: e */
    public int f38937e;

    /* JADX INFO: renamed from: f */
    public int f38938f = 0;

    /* JADX INFO: renamed from: g72$a */
    public static /* synthetic */ class C6154a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38939a;

        static {
            int[] iArr = new int[gpi.EnumC6460b.values().length];
            f38939a = iArr;
            try {
                iArr[gpi.EnumC6460b.f40750H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40755Q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40762c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40758Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40749F.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40748C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40763d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40766m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40764e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40754N.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40759Z.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40753M1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40756V1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40760Z1.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40751L.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40757X.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f38939a[gpi.EnumC6460b.f40765f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private g72(e72 input) {
        e72 e72Var = (e72) v98.m23882b(input, "input");
        this.f38935c = e72Var;
        e72Var.f31986d = this;
    }

    public static g72 forCodedInput(e72 input) {
        g72 g72Var = input.f31986d;
        return g72Var != null ? g72Var : new g72(input);
    }

    private <T> void mergeGroupFieldInternal(T target, upe<T> schema, yi5 extensionRegistry) throws IOException {
        int i = this.f38937e;
        this.f38937e = gpi.m11819a(gpi.getTagFieldNumber(this.f38936d), 4);
        try {
            schema.mergeFrom(target, this, extensionRegistry);
            if (this.f38936d == this.f38937e) {
            } else {
                throw be8.m3081h();
            }
        } finally {
            this.f38937e = i;
        }
    }

    private <T> void mergeMessageFieldInternal(T target, upe<T> schema, yi5 extensionRegistry) throws IOException {
        int uInt32 = this.f38935c.readUInt32();
        e72 e72Var = this.f38935c;
        if (e72Var.f31983a >= e72Var.f31984b) {
            throw be8.m3082i();
        }
        int iPushLimit = e72Var.pushLimit(uInt32);
        this.f38935c.f31983a++;
        schema.mergeFrom(target, this, extensionRegistry);
        this.f38935c.checkLastTagWas(0);
        r5.f31983a--;
        this.f38935c.popLimit(iPushLimit);
    }

    private Object readField(gpi.EnumC6460b fieldType, Class<?> messageType, yi5 extensionRegistry) throws IOException {
        switch (C6154a.f38939a[fieldType.ordinal()]) {
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
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private void requirePosition(int expectedPosition) throws IOException {
        if (this.f38935c.getTotalBytesRead() != expectedPosition) {
            throw be8.m3084l();
        }
    }

    private void requireWireType(int requiredWireType) throws IOException {
        if (gpi.getTagWireType(this.f38936d) != requiredWireType) {
            throw be8.m3078e();
        }
    }

    private void verifyPackedFixed32Length(int bytes) throws IOException {
        if ((bytes & 3) != 0) {
            throw be8.m3081h();
        }
    }

    private void verifyPackedFixed64Length(int bytes) throws IOException {
        if ((bytes & 7) != 0) {
            throw be8.m3081h();
        }
    }

    @Override // p000.ird
    public int getFieldNumber() throws IOException {
        int i = this.f38938f;
        if (i != 0) {
            this.f38936d = i;
            this.f38938f = 0;
        } else {
            this.f38936d = this.f38935c.readTag();
        }
        int i2 = this.f38936d;
        if (i2 == 0 || i2 == this.f38937e) {
            return Integer.MAX_VALUE;
        }
        return gpi.getTagFieldNumber(i2);
    }

    @Override // p000.ird
    public int getTag() {
        return this.f38936d;
    }

    @Override // p000.ird
    public <T> void mergeGroupField(T target, upe<T> schema, yi5 extensionRegistry) throws IOException {
        requireWireType(3);
        mergeGroupFieldInternal(target, schema, extensionRegistry);
    }

    @Override // p000.ird
    public <T> void mergeMessageField(T target, upe<T> schema, yi5 extensionRegistry) throws IOException {
        requireWireType(2);
        mergeMessageFieldInternal(target, schema, extensionRegistry);
    }

    @Override // p000.ird
    public boolean readBool() throws IOException {
        requireWireType(0);
        return this.f38935c.readBool();
    }

    @Override // p000.ird
    public void readBoolList(List<Boolean> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof sa1)) {
            int tagWireType = gpi.getTagWireType(this.f38936d);
            if (tagWireType == 0) {
                do {
                    target.add(Boolean.valueOf(this.f38935c.readBool()));
                    if (this.f38935c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f38935c.readTag();
                    }
                } while (tag == this.f38936d);
                this.f38938f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw be8.m3078e();
            }
            int totalBytesRead = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
            do {
                target.add(Boolean.valueOf(this.f38935c.readBool()));
            } while (this.f38935c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        sa1 sa1Var = (sa1) target;
        int tagWireType2 = gpi.getTagWireType(this.f38936d);
        if (tagWireType2 == 0) {
            do {
                sa1Var.addBoolean(this.f38935c.readBool());
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f38935c.readTag();
                }
            } while (tag2 == this.f38936d);
            this.f38938f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw be8.m3078e();
        }
        int totalBytesRead2 = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
        do {
            sa1Var.addBoolean(this.f38935c.readBool());
        } while (this.f38935c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // p000.ird
    public wj1 readBytes() throws IOException {
        requireWireType(2);
        return this.f38935c.readBytes();
    }

    @Override // p000.ird
    public void readBytesList(List<wj1> target) throws IOException {
        int tag;
        if (gpi.getTagWireType(this.f38936d) != 2) {
            throw be8.m3078e();
        }
        do {
            target.add(readBytes());
            if (this.f38935c.isAtEnd()) {
                return;
            } else {
                tag = this.f38935c.readTag();
            }
        } while (tag == this.f38936d);
        this.f38938f = tag;
    }

    @Override // p000.ird
    public double readDouble() throws IOException {
        requireWireType(1);
        return this.f38935c.readDouble();
    }

    @Override // p000.ird
    public void readDoubleList(List<Double> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof vj4)) {
            int tagWireType = gpi.getTagWireType(this.f38936d);
            if (tagWireType == 1) {
                do {
                    target.add(Double.valueOf(this.f38935c.readDouble()));
                    if (this.f38935c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f38935c.readTag();
                    }
                } while (tag == this.f38936d);
                this.f38938f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw be8.m3078e();
            }
            int uInt32 = this.f38935c.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.f38935c.getTotalBytesRead() + uInt32;
            do {
                target.add(Double.valueOf(this.f38935c.readDouble()));
            } while (this.f38935c.getTotalBytesRead() < totalBytesRead);
            return;
        }
        vj4 vj4Var = (vj4) target;
        int tagWireType2 = gpi.getTagWireType(this.f38936d);
        if (tagWireType2 == 1) {
            do {
                vj4Var.addDouble(this.f38935c.readDouble());
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f38935c.readTag();
                }
            } while (tag2 == this.f38936d);
            this.f38938f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw be8.m3078e();
        }
        int uInt322 = this.f38935c.readUInt32();
        verifyPackedFixed64Length(uInt322);
        int totalBytesRead2 = this.f38935c.getTotalBytesRead() + uInt322;
        do {
            vj4Var.addDouble(this.f38935c.readDouble());
        } while (this.f38935c.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // p000.ird
    public int readEnum() throws IOException {
        requireWireType(0);
        return this.f38935c.readEnum();
    }

    @Override // p000.ird
    public void readEnumList(List<Integer> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof c68)) {
            int tagWireType = gpi.getTagWireType(this.f38936d);
            if (tagWireType == 0) {
                do {
                    target.add(Integer.valueOf(this.f38935c.readEnum()));
                    if (this.f38935c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f38935c.readTag();
                    }
                } while (tag == this.f38936d);
                this.f38938f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw be8.m3078e();
            }
            int totalBytesRead = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
            do {
                target.add(Integer.valueOf(this.f38935c.readEnum()));
            } while (this.f38935c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        c68 c68Var = (c68) target;
        int tagWireType2 = gpi.getTagWireType(this.f38936d);
        if (tagWireType2 == 0) {
            do {
                c68Var.addInt(this.f38935c.readEnum());
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f38935c.readTag();
                }
            } while (tag2 == this.f38936d);
            this.f38938f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw be8.m3078e();
        }
        int totalBytesRead2 = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
        do {
            c68Var.addInt(this.f38935c.readEnum());
        } while (this.f38935c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // p000.ird
    public int readFixed32() throws IOException {
        requireWireType(5);
        return this.f38935c.readFixed32();
    }

    @Override // p000.ird
    public void readFixed32List(List<Integer> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof c68)) {
            int tagWireType = gpi.getTagWireType(this.f38936d);
            if (tagWireType == 2) {
                int uInt32 = this.f38935c.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.f38935c.getTotalBytesRead() + uInt32;
                do {
                    target.add(Integer.valueOf(this.f38935c.readFixed32()));
                } while (this.f38935c.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw be8.m3078e();
            }
            do {
                target.add(Integer.valueOf(this.f38935c.readFixed32()));
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag = this.f38935c.readTag();
                }
            } while (tag == this.f38936d);
            this.f38938f = tag;
            return;
        }
        c68 c68Var = (c68) target;
        int tagWireType2 = gpi.getTagWireType(this.f38936d);
        if (tagWireType2 == 2) {
            int uInt322 = this.f38935c.readUInt32();
            verifyPackedFixed32Length(uInt322);
            int totalBytesRead2 = this.f38935c.getTotalBytesRead() + uInt322;
            do {
                c68Var.addInt(this.f38935c.readFixed32());
            } while (this.f38935c.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw be8.m3078e();
        }
        do {
            c68Var.addInt(this.f38935c.readFixed32());
            if (this.f38935c.isAtEnd()) {
                return;
            } else {
                tag2 = this.f38935c.readTag();
            }
        } while (tag2 == this.f38936d);
        this.f38938f = tag2;
    }

    @Override // p000.ird
    public long readFixed64() throws IOException {
        requireWireType(1);
        return this.f38935c.readFixed64();
    }

    @Override // p000.ird
    public void readFixed64List(List<Long> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof sk9)) {
            int tagWireType = gpi.getTagWireType(this.f38936d);
            if (tagWireType == 1) {
                do {
                    target.add(Long.valueOf(this.f38935c.readFixed64()));
                    if (this.f38935c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f38935c.readTag();
                    }
                } while (tag == this.f38936d);
                this.f38938f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw be8.m3078e();
            }
            int uInt32 = this.f38935c.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.f38935c.getTotalBytesRead() + uInt32;
            do {
                target.add(Long.valueOf(this.f38935c.readFixed64()));
            } while (this.f38935c.getTotalBytesRead() < totalBytesRead);
            return;
        }
        sk9 sk9Var = (sk9) target;
        int tagWireType2 = gpi.getTagWireType(this.f38936d);
        if (tagWireType2 == 1) {
            do {
                sk9Var.addLong(this.f38935c.readFixed64());
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f38935c.readTag();
                }
            } while (tag2 == this.f38936d);
            this.f38938f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw be8.m3078e();
        }
        int uInt322 = this.f38935c.readUInt32();
        verifyPackedFixed64Length(uInt322);
        int totalBytesRead2 = this.f38935c.getTotalBytesRead() + uInt322;
        do {
            sk9Var.addLong(this.f38935c.readFixed64());
        } while (this.f38935c.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // p000.ird
    public float readFloat() throws IOException {
        requireWireType(5);
        return this.f38935c.readFloat();
    }

    @Override // p000.ird
    public void readFloatList(List<Float> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof b46)) {
            int tagWireType = gpi.getTagWireType(this.f38936d);
            if (tagWireType == 2) {
                int uInt32 = this.f38935c.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.f38935c.getTotalBytesRead() + uInt32;
                do {
                    target.add(Float.valueOf(this.f38935c.readFloat()));
                } while (this.f38935c.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw be8.m3078e();
            }
            do {
                target.add(Float.valueOf(this.f38935c.readFloat()));
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag = this.f38935c.readTag();
                }
            } while (tag == this.f38936d);
            this.f38938f = tag;
            return;
        }
        b46 b46Var = (b46) target;
        int tagWireType2 = gpi.getTagWireType(this.f38936d);
        if (tagWireType2 == 2) {
            int uInt322 = this.f38935c.readUInt32();
            verifyPackedFixed32Length(uInt322);
            int totalBytesRead2 = this.f38935c.getTotalBytesRead() + uInt322;
            do {
                b46Var.addFloat(this.f38935c.readFloat());
            } while (this.f38935c.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw be8.m3078e();
        }
        do {
            b46Var.addFloat(this.f38935c.readFloat());
            if (this.f38935c.isAtEnd()) {
                return;
            } else {
                tag2 = this.f38935c.readTag();
            }
        } while (tag2 == this.f38936d);
        this.f38938f = tag2;
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
        return this.f38935c.readInt32();
    }

    @Override // p000.ird
    public void readInt32List(List<Integer> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof c68)) {
            int tagWireType = gpi.getTagWireType(this.f38936d);
            if (tagWireType == 0) {
                do {
                    target.add(Integer.valueOf(this.f38935c.readInt32()));
                    if (this.f38935c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f38935c.readTag();
                    }
                } while (tag == this.f38936d);
                this.f38938f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw be8.m3078e();
            }
            int totalBytesRead = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
            do {
                target.add(Integer.valueOf(this.f38935c.readInt32()));
            } while (this.f38935c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        c68 c68Var = (c68) target;
        int tagWireType2 = gpi.getTagWireType(this.f38936d);
        if (tagWireType2 == 0) {
            do {
                c68Var.addInt(this.f38935c.readInt32());
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f38935c.readTag();
                }
            } while (tag2 == this.f38936d);
            this.f38938f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw be8.m3078e();
        }
        int totalBytesRead2 = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
        do {
            c68Var.addInt(this.f38935c.readInt32());
        } while (this.f38935c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // p000.ird
    public long readInt64() throws IOException {
        requireWireType(0);
        return this.f38935c.readInt64();
    }

    @Override // p000.ird
    public void readInt64List(List<Long> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof sk9)) {
            int tagWireType = gpi.getTagWireType(this.f38936d);
            if (tagWireType == 0) {
                do {
                    target.add(Long.valueOf(this.f38935c.readInt64()));
                    if (this.f38935c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f38935c.readTag();
                    }
                } while (tag == this.f38936d);
                this.f38938f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw be8.m3078e();
            }
            int totalBytesRead = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
            do {
                target.add(Long.valueOf(this.f38935c.readInt64()));
            } while (this.f38935c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        sk9 sk9Var = (sk9) target;
        int tagWireType2 = gpi.getTagWireType(this.f38936d);
        if (tagWireType2 == 0) {
            do {
                sk9Var.addLong(this.f38935c.readInt64());
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f38935c.readTag();
                }
            } while (tag2 == this.f38936d);
            this.f38938f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw be8.m3078e();
        }
        int totalBytesRead2 = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
        do {
            sk9Var.addLong(this.f38935c.readInt64());
        } while (this.f38935c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f38935c.popLimit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ird
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void readMap(java.util.Map<K, V> r8, p000.ns9.C10042b<K, V> r9, p000.yi5 r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.requireWireType(r0)
            e72 r1 = r7.f38935c
            int r1 = r1.readUInt32()
            e72 r2 = r7.f38935c
            int r1 = r2.pushLimit(r1)
            K r2 = r9.f65507b
            V r3 = r9.f65509d
        L14:
            int r4 = r7.getFieldNumber()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            e72 r5 = r7.f38935c     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L3a p000.be8.C1862a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            be8 r4 = new be8     // Catch: java.lang.Throwable -> L3a p000.be8.C1862a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a p000.be8.C1862a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a p000.be8.C1862a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            gpi$b r4 = r9.f65508c     // Catch: java.lang.Throwable -> L3a p000.be8.C1862a -> L51
            V r5 = r9.f65509d     // Catch: java.lang.Throwable -> L3a p000.be8.C1862a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a p000.be8.C1862a -> L51
            java.lang.Object r3 = r7.readField(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a p000.be8.C1862a -> L51
            goto L14
        L49:
            gpi$b r4 = r9.f65506a     // Catch: java.lang.Throwable -> L3a p000.be8.C1862a -> L51
            r5 = 0
            java.lang.Object r2 = r7.readField(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a p000.be8.C1862a -> L51
            goto L14
        L51:
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            be8 r8 = new be8     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            e72 r8 = r7.f38935c
            r8.popLimit(r1)
            return
        L67:
            e72 r9 = r7.f38935c
            r9.popLimit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g72.readMap(java.util.Map, ns9$b, yi5):void");
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
        return this.f38935c.readSFixed32();
    }

    @Override // p000.ird
    public void readSFixed32List(List<Integer> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof c68)) {
            int tagWireType = gpi.getTagWireType(this.f38936d);
            if (tagWireType == 2) {
                int uInt32 = this.f38935c.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.f38935c.getTotalBytesRead() + uInt32;
                do {
                    target.add(Integer.valueOf(this.f38935c.readSFixed32()));
                } while (this.f38935c.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw be8.m3078e();
            }
            do {
                target.add(Integer.valueOf(this.f38935c.readSFixed32()));
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag = this.f38935c.readTag();
                }
            } while (tag == this.f38936d);
            this.f38938f = tag;
            return;
        }
        c68 c68Var = (c68) target;
        int tagWireType2 = gpi.getTagWireType(this.f38936d);
        if (tagWireType2 == 2) {
            int uInt322 = this.f38935c.readUInt32();
            verifyPackedFixed32Length(uInt322);
            int totalBytesRead2 = this.f38935c.getTotalBytesRead() + uInt322;
            do {
                c68Var.addInt(this.f38935c.readSFixed32());
            } while (this.f38935c.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw be8.m3078e();
        }
        do {
            c68Var.addInt(this.f38935c.readSFixed32());
            if (this.f38935c.isAtEnd()) {
                return;
            } else {
                tag2 = this.f38935c.readTag();
            }
        } while (tag2 == this.f38936d);
        this.f38938f = tag2;
    }

    @Override // p000.ird
    public long readSFixed64() throws IOException {
        requireWireType(1);
        return this.f38935c.readSFixed64();
    }

    @Override // p000.ird
    public void readSFixed64List(List<Long> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof sk9)) {
            int tagWireType = gpi.getTagWireType(this.f38936d);
            if (tagWireType == 1) {
                do {
                    target.add(Long.valueOf(this.f38935c.readSFixed64()));
                    if (this.f38935c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f38935c.readTag();
                    }
                } while (tag == this.f38936d);
                this.f38938f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw be8.m3078e();
            }
            int uInt32 = this.f38935c.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.f38935c.getTotalBytesRead() + uInt32;
            do {
                target.add(Long.valueOf(this.f38935c.readSFixed64()));
            } while (this.f38935c.getTotalBytesRead() < totalBytesRead);
            return;
        }
        sk9 sk9Var = (sk9) target;
        int tagWireType2 = gpi.getTagWireType(this.f38936d);
        if (tagWireType2 == 1) {
            do {
                sk9Var.addLong(this.f38935c.readSFixed64());
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f38935c.readTag();
                }
            } while (tag2 == this.f38936d);
            this.f38938f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw be8.m3078e();
        }
        int uInt322 = this.f38935c.readUInt32();
        verifyPackedFixed64Length(uInt322);
        int totalBytesRead2 = this.f38935c.getTotalBytesRead() + uInt322;
        do {
            sk9Var.addLong(this.f38935c.readSFixed64());
        } while (this.f38935c.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // p000.ird
    public int readSInt32() throws IOException {
        requireWireType(0);
        return this.f38935c.readSInt32();
    }

    @Override // p000.ird
    public void readSInt32List(List<Integer> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof c68)) {
            int tagWireType = gpi.getTagWireType(this.f38936d);
            if (tagWireType == 0) {
                do {
                    target.add(Integer.valueOf(this.f38935c.readSInt32()));
                    if (this.f38935c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f38935c.readTag();
                    }
                } while (tag == this.f38936d);
                this.f38938f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw be8.m3078e();
            }
            int totalBytesRead = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
            do {
                target.add(Integer.valueOf(this.f38935c.readSInt32()));
            } while (this.f38935c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        c68 c68Var = (c68) target;
        int tagWireType2 = gpi.getTagWireType(this.f38936d);
        if (tagWireType2 == 0) {
            do {
                c68Var.addInt(this.f38935c.readSInt32());
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f38935c.readTag();
                }
            } while (tag2 == this.f38936d);
            this.f38938f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw be8.m3078e();
        }
        int totalBytesRead2 = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
        do {
            c68Var.addInt(this.f38935c.readSInt32());
        } while (this.f38935c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // p000.ird
    public long readSInt64() throws IOException {
        requireWireType(0);
        return this.f38935c.readSInt64();
    }

    @Override // p000.ird
    public void readSInt64List(List<Long> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof sk9)) {
            int tagWireType = gpi.getTagWireType(this.f38936d);
            if (tagWireType == 0) {
                do {
                    target.add(Long.valueOf(this.f38935c.readSInt64()));
                    if (this.f38935c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f38935c.readTag();
                    }
                } while (tag == this.f38936d);
                this.f38938f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw be8.m3078e();
            }
            int totalBytesRead = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
            do {
                target.add(Long.valueOf(this.f38935c.readSInt64()));
            } while (this.f38935c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        sk9 sk9Var = (sk9) target;
        int tagWireType2 = gpi.getTagWireType(this.f38936d);
        if (tagWireType2 == 0) {
            do {
                sk9Var.addLong(this.f38935c.readSInt64());
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f38935c.readTag();
                }
            } while (tag2 == this.f38936d);
            this.f38938f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw be8.m3078e();
        }
        int totalBytesRead2 = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
        do {
            sk9Var.addLong(this.f38935c.readSInt64());
        } while (this.f38935c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // p000.ird
    public String readString() throws IOException {
        requireWireType(2);
        return this.f38935c.readString();
    }

    @Override // p000.ird
    public void readStringList(List<String> target) throws IOException {
        readStringListInternal(target, false);
    }

    public void readStringListInternal(List<String> target, boolean requireUtf8) throws IOException {
        int tag;
        int tag2;
        if (gpi.getTagWireType(this.f38936d) != 2) {
            throw be8.m3078e();
        }
        if (!(target instanceof f39) || requireUtf8) {
            do {
                target.add(requireUtf8 ? readStringRequireUtf8() : readString());
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag = this.f38935c.readTag();
                }
            } while (tag == this.f38936d);
            this.f38938f = tag;
            return;
        }
        f39 f39Var = (f39) target;
        do {
            f39Var.add(readBytes());
            if (this.f38935c.isAtEnd()) {
                return;
            } else {
                tag2 = this.f38935c.readTag();
            }
        } while (tag2 == this.f38936d);
        this.f38938f = tag2;
    }

    @Override // p000.ird
    public void readStringListRequireUtf8(List<String> target) throws IOException {
        readStringListInternal(target, true);
    }

    @Override // p000.ird
    public String readStringRequireUtf8() throws IOException {
        requireWireType(2);
        return this.f38935c.readStringRequireUtf8();
    }

    @Override // p000.ird
    public int readUInt32() throws IOException {
        requireWireType(0);
        return this.f38935c.readUInt32();
    }

    @Override // p000.ird
    public void readUInt32List(List<Integer> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof c68)) {
            int tagWireType = gpi.getTagWireType(this.f38936d);
            if (tagWireType == 0) {
                do {
                    target.add(Integer.valueOf(this.f38935c.readUInt32()));
                    if (this.f38935c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f38935c.readTag();
                    }
                } while (tag == this.f38936d);
                this.f38938f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw be8.m3078e();
            }
            int totalBytesRead = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
            do {
                target.add(Integer.valueOf(this.f38935c.readUInt32()));
            } while (this.f38935c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        c68 c68Var = (c68) target;
        int tagWireType2 = gpi.getTagWireType(this.f38936d);
        if (tagWireType2 == 0) {
            do {
                c68Var.addInt(this.f38935c.readUInt32());
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f38935c.readTag();
                }
            } while (tag2 == this.f38936d);
            this.f38938f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw be8.m3078e();
        }
        int totalBytesRead2 = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
        do {
            c68Var.addInt(this.f38935c.readUInt32());
        } while (this.f38935c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // p000.ird
    public long readUInt64() throws IOException {
        requireWireType(0);
        return this.f38935c.readUInt64();
    }

    @Override // p000.ird
    public void readUInt64List(List<Long> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof sk9)) {
            int tagWireType = gpi.getTagWireType(this.f38936d);
            if (tagWireType == 0) {
                do {
                    target.add(Long.valueOf(this.f38935c.readUInt64()));
                    if (this.f38935c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f38935c.readTag();
                    }
                } while (tag == this.f38936d);
                this.f38938f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw be8.m3078e();
            }
            int totalBytesRead = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
            do {
                target.add(Long.valueOf(this.f38935c.readUInt64()));
            } while (this.f38935c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        sk9 sk9Var = (sk9) target;
        int tagWireType2 = gpi.getTagWireType(this.f38936d);
        if (tagWireType2 == 0) {
            do {
                sk9Var.addLong(this.f38935c.readUInt64());
                if (this.f38935c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f38935c.readTag();
                }
            } while (tag2 == this.f38936d);
            this.f38938f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw be8.m3078e();
        }
        int totalBytesRead2 = this.f38935c.getTotalBytesRead() + this.f38935c.readUInt32();
        do {
            sk9Var.addLong(this.f38935c.readUInt64());
        } while (this.f38935c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // p000.ird
    public boolean shouldDiscardUnknownFields() {
        return this.f38935c.m9780g();
    }

    @Override // p000.ird
    public boolean skipField() throws IOException {
        int i;
        if (this.f38935c.isAtEnd() || (i = this.f38936d) == this.f38937e) {
            return false;
        }
        return this.f38935c.skipField(i);
    }

    private <T> T readGroup(upe<T> schema, yi5 extensionRegistry) throws IOException {
        T tNewInstance = schema.newInstance();
        mergeGroupFieldInternal(tNewInstance, schema, extensionRegistry);
        schema.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    private <T> T readMessage(upe<T> schema, yi5 extensionRegistry) throws IOException {
        T tNewInstance = schema.newInstance();
        mergeMessageFieldInternal(tNewInstance, schema, extensionRegistry);
        schema.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ird
    @Deprecated
    public <T> void readGroupList(List<T> target, upe<T> schema, yi5 extensionRegistry) throws IOException {
        int tag;
        if (gpi.getTagWireType(this.f38936d) == 3) {
            int i = this.f38936d;
            do {
                target.add(readGroup(schema, extensionRegistry));
                if (this.f38935c.isAtEnd() || this.f38938f != 0) {
                    return;
                } else {
                    tag = this.f38935c.readTag();
                }
            } while (tag == i);
            this.f38938f = tag;
            return;
        }
        throw be8.m3078e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ird
    public <T> void readMessageList(List<T> target, upe<T> schema, yi5 extensionRegistry) throws IOException {
        int tag;
        if (gpi.getTagWireType(this.f38936d) == 2) {
            int i = this.f38936d;
            do {
                target.add(readMessage(schema, extensionRegistry));
                if (this.f38935c.isAtEnd() || this.f38938f != 0) {
                    return;
                } else {
                    tag = this.f38935c.readTag();
                }
            } while (tag == i);
            this.f38938f = tag;
            return;
        }
        throw be8.m3078e();
    }
}
