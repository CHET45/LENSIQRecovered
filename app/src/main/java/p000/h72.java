package p000;

import java.io.IOException;
import java.util.List;
import p000.hpi;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class h72 implements hrd {

    /* JADX INFO: renamed from: g */
    public static final int f42689g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f42690h = 7;

    /* JADX INFO: renamed from: i */
    public static final int f42691i = 0;

    /* JADX INFO: renamed from: c */
    public final f72 f42692c;

    /* JADX INFO: renamed from: d */
    public int f42693d;

    /* JADX INFO: renamed from: e */
    public int f42694e;

    /* JADX INFO: renamed from: f */
    public int f42695f = 0;

    /* JADX INFO: renamed from: h72$a */
    public static /* synthetic */ class C6731a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f42696a;

        static {
            int[] iArr = new int[hpi.EnumC6968b.values().length];
            f42696a = iArr;
            try {
                iArr[hpi.EnumC6968b.f44484H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44489Q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44496c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44492Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44483F.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44482C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44497d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44500m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44498e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44488N.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44493Z.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44487M1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44490V1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44494Z1.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44485L.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44491X.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f42696a[hpi.EnumC6968b.f44499f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private h72(f72 input) {
        f72 f72Var = (f72) w98.m24433b(input, "input");
        this.f42692c = f72Var;
        f72Var.f35556d = this;
    }

    public static h72 forCodedInput(f72 input) {
        h72 h72Var = input.f35556d;
        return h72Var != null ? h72Var : new h72(input);
    }

    private <T> void mergeGroupFieldInternal(T target, tpe<T> schema, zi5 extensionRegistry) throws IOException {
        int i = this.f42694e;
        this.f42694e = hpi.m12536a(hpi.getTagFieldNumber(this.f42693d), 4);
        try {
            schema.mergeFrom(target, this, extensionRegistry);
            if (this.f42693d == this.f42694e) {
            } else {
                throw ce8.m3925h();
            }
        } finally {
            this.f42694e = i;
        }
    }

    private <T> void mergeMessageFieldInternal(T target, tpe<T> schema, zi5 extensionRegistry) throws IOException {
        int uInt32 = this.f42692c.readUInt32();
        f72 f72Var = this.f42692c;
        if (f72Var.f35553a >= f72Var.f35554b) {
            throw ce8.m3926i();
        }
        int iPushLimit = f72Var.pushLimit(uInt32);
        this.f42692c.f35553a++;
        schema.mergeFrom(target, this, extensionRegistry);
        this.f42692c.checkLastTagWas(0);
        r5.f35553a--;
        this.f42692c.popLimit(iPushLimit);
    }

    private Object readField(hpi.EnumC6968b fieldType, Class<?> messageType, zi5 extensionRegistry) throws IOException {
        switch (C6731a.f42696a[fieldType.ordinal()]) {
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
        if (this.f42692c.getTotalBytesRead() != expectedPosition) {
            throw ce8.m3928l();
        }
    }

    private void requireWireType(int requiredWireType) throws IOException {
        if (hpi.getTagWireType(this.f42693d) != requiredWireType) {
            throw ce8.m3922e();
        }
    }

    private void verifyPackedFixed32Length(int bytes) throws IOException {
        if ((bytes & 3) != 0) {
            throw ce8.m3925h();
        }
    }

    private void verifyPackedFixed64Length(int bytes) throws IOException {
        if ((bytes & 7) != 0) {
            throw ce8.m3925h();
        }
    }

    @Override // p000.hrd
    public int getFieldNumber() throws IOException {
        int i = this.f42695f;
        if (i != 0) {
            this.f42693d = i;
            this.f42695f = 0;
        } else {
            this.f42693d = this.f42692c.readTag();
        }
        int i2 = this.f42693d;
        if (i2 == 0 || i2 == this.f42694e) {
            return Integer.MAX_VALUE;
        }
        return hpi.getTagFieldNumber(i2);
    }

    @Override // p000.hrd
    public int getTag() {
        return this.f42693d;
    }

    @Override // p000.hrd
    public <T> void mergeGroupField(T target, tpe<T> schema, zi5 extensionRegistry) throws IOException {
        requireWireType(3);
        mergeGroupFieldInternal(target, schema, extensionRegistry);
    }

    @Override // p000.hrd
    public <T> void mergeMessageField(T target, tpe<T> schema, zi5 extensionRegistry) throws IOException {
        requireWireType(2);
        mergeMessageFieldInternal(target, schema, extensionRegistry);
    }

    @Override // p000.hrd
    public boolean readBool() throws IOException {
        requireWireType(0);
        return this.f42692c.readBool();
    }

    @Override // p000.hrd
    public void readBoolList(List<Boolean> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof ra1)) {
            int tagWireType = hpi.getTagWireType(this.f42693d);
            if (tagWireType == 0) {
                do {
                    target.add(Boolean.valueOf(this.f42692c.readBool()));
                    if (this.f42692c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f42692c.readTag();
                    }
                } while (tag == this.f42693d);
                this.f42695f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw ce8.m3922e();
            }
            int totalBytesRead = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
            do {
                target.add(Boolean.valueOf(this.f42692c.readBool()));
            } while (this.f42692c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        ra1 ra1Var = (ra1) target;
        int tagWireType2 = hpi.getTagWireType(this.f42693d);
        if (tagWireType2 == 0) {
            do {
                ra1Var.addBoolean(this.f42692c.readBool());
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f42692c.readTag();
                }
            } while (tag2 == this.f42693d);
            this.f42695f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw ce8.m3922e();
        }
        int totalBytesRead2 = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
        do {
            ra1Var.addBoolean(this.f42692c.readBool());
        } while (this.f42692c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // p000.hrd
    public vj1 readBytes() throws IOException {
        requireWireType(2);
        return this.f42692c.readBytes();
    }

    @Override // p000.hrd
    public void readBytesList(List<vj1> target) throws IOException {
        int tag;
        if (hpi.getTagWireType(this.f42693d) != 2) {
            throw ce8.m3922e();
        }
        do {
            target.add(readBytes());
            if (this.f42692c.isAtEnd()) {
                return;
            } else {
                tag = this.f42692c.readTag();
            }
        } while (tag == this.f42693d);
        this.f42695f = tag;
    }

    @Override // p000.hrd
    public double readDouble() throws IOException {
        requireWireType(1);
        return this.f42692c.readDouble();
    }

    @Override // p000.hrd
    public void readDoubleList(List<Double> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof uj4)) {
            int tagWireType = hpi.getTagWireType(this.f42693d);
            if (tagWireType == 1) {
                do {
                    target.add(Double.valueOf(this.f42692c.readDouble()));
                    if (this.f42692c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f42692c.readTag();
                    }
                } while (tag == this.f42693d);
                this.f42695f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw ce8.m3922e();
            }
            int uInt32 = this.f42692c.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.f42692c.getTotalBytesRead() + uInt32;
            do {
                target.add(Double.valueOf(this.f42692c.readDouble()));
            } while (this.f42692c.getTotalBytesRead() < totalBytesRead);
            return;
        }
        uj4 uj4Var = (uj4) target;
        int tagWireType2 = hpi.getTagWireType(this.f42693d);
        if (tagWireType2 == 1) {
            do {
                uj4Var.addDouble(this.f42692c.readDouble());
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f42692c.readTag();
                }
            } while (tag2 == this.f42693d);
            this.f42695f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw ce8.m3922e();
        }
        int uInt322 = this.f42692c.readUInt32();
        verifyPackedFixed64Length(uInt322);
        int totalBytesRead2 = this.f42692c.getTotalBytesRead() + uInt322;
        do {
            uj4Var.addDouble(this.f42692c.readDouble());
        } while (this.f42692c.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // p000.hrd
    public int readEnum() throws IOException {
        requireWireType(0);
        return this.f42692c.readEnum();
    }

    @Override // p000.hrd
    public void readEnumList(List<Integer> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof b68)) {
            int tagWireType = hpi.getTagWireType(this.f42693d);
            if (tagWireType == 0) {
                do {
                    target.add(Integer.valueOf(this.f42692c.readEnum()));
                    if (this.f42692c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f42692c.readTag();
                    }
                } while (tag == this.f42693d);
                this.f42695f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw ce8.m3922e();
            }
            int totalBytesRead = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
            do {
                target.add(Integer.valueOf(this.f42692c.readEnum()));
            } while (this.f42692c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        b68 b68Var = (b68) target;
        int tagWireType2 = hpi.getTagWireType(this.f42693d);
        if (tagWireType2 == 0) {
            do {
                b68Var.addInt(this.f42692c.readEnum());
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f42692c.readTag();
                }
            } while (tag2 == this.f42693d);
            this.f42695f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw ce8.m3922e();
        }
        int totalBytesRead2 = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
        do {
            b68Var.addInt(this.f42692c.readEnum());
        } while (this.f42692c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // p000.hrd
    public int readFixed32() throws IOException {
        requireWireType(5);
        return this.f42692c.readFixed32();
    }

    @Override // p000.hrd
    public void readFixed32List(List<Integer> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof b68)) {
            int tagWireType = hpi.getTagWireType(this.f42693d);
            if (tagWireType == 2) {
                int uInt32 = this.f42692c.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.f42692c.getTotalBytesRead() + uInt32;
                do {
                    target.add(Integer.valueOf(this.f42692c.readFixed32()));
                } while (this.f42692c.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw ce8.m3922e();
            }
            do {
                target.add(Integer.valueOf(this.f42692c.readFixed32()));
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag = this.f42692c.readTag();
                }
            } while (tag == this.f42693d);
            this.f42695f = tag;
            return;
        }
        b68 b68Var = (b68) target;
        int tagWireType2 = hpi.getTagWireType(this.f42693d);
        if (tagWireType2 == 2) {
            int uInt322 = this.f42692c.readUInt32();
            verifyPackedFixed32Length(uInt322);
            int totalBytesRead2 = this.f42692c.getTotalBytesRead() + uInt322;
            do {
                b68Var.addInt(this.f42692c.readFixed32());
            } while (this.f42692c.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw ce8.m3922e();
        }
        do {
            b68Var.addInt(this.f42692c.readFixed32());
            if (this.f42692c.isAtEnd()) {
                return;
            } else {
                tag2 = this.f42692c.readTag();
            }
        } while (tag2 == this.f42693d);
        this.f42695f = tag2;
    }

    @Override // p000.hrd
    public long readFixed64() throws IOException {
        requireWireType(1);
        return this.f42692c.readFixed64();
    }

    @Override // p000.hrd
    public void readFixed64List(List<Long> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof rk9)) {
            int tagWireType = hpi.getTagWireType(this.f42693d);
            if (tagWireType == 1) {
                do {
                    target.add(Long.valueOf(this.f42692c.readFixed64()));
                    if (this.f42692c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f42692c.readTag();
                    }
                } while (tag == this.f42693d);
                this.f42695f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw ce8.m3922e();
            }
            int uInt32 = this.f42692c.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.f42692c.getTotalBytesRead() + uInt32;
            do {
                target.add(Long.valueOf(this.f42692c.readFixed64()));
            } while (this.f42692c.getTotalBytesRead() < totalBytesRead);
            return;
        }
        rk9 rk9Var = (rk9) target;
        int tagWireType2 = hpi.getTagWireType(this.f42693d);
        if (tagWireType2 == 1) {
            do {
                rk9Var.addLong(this.f42692c.readFixed64());
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f42692c.readTag();
                }
            } while (tag2 == this.f42693d);
            this.f42695f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw ce8.m3922e();
        }
        int uInt322 = this.f42692c.readUInt32();
        verifyPackedFixed64Length(uInt322);
        int totalBytesRead2 = this.f42692c.getTotalBytesRead() + uInt322;
        do {
            rk9Var.addLong(this.f42692c.readFixed64());
        } while (this.f42692c.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // p000.hrd
    public float readFloat() throws IOException {
        requireWireType(5);
        return this.f42692c.readFloat();
    }

    @Override // p000.hrd
    public void readFloatList(List<Float> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof a46)) {
            int tagWireType = hpi.getTagWireType(this.f42693d);
            if (tagWireType == 2) {
                int uInt32 = this.f42692c.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.f42692c.getTotalBytesRead() + uInt32;
                do {
                    target.add(Float.valueOf(this.f42692c.readFloat()));
                } while (this.f42692c.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw ce8.m3922e();
            }
            do {
                target.add(Float.valueOf(this.f42692c.readFloat()));
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag = this.f42692c.readTag();
                }
            } while (tag == this.f42693d);
            this.f42695f = tag;
            return;
        }
        a46 a46Var = (a46) target;
        int tagWireType2 = hpi.getTagWireType(this.f42693d);
        if (tagWireType2 == 2) {
            int uInt322 = this.f42692c.readUInt32();
            verifyPackedFixed32Length(uInt322);
            int totalBytesRead2 = this.f42692c.getTotalBytesRead() + uInt322;
            do {
                a46Var.addFloat(this.f42692c.readFloat());
            } while (this.f42692c.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw ce8.m3922e();
        }
        do {
            a46Var.addFloat(this.f42692c.readFloat());
            if (this.f42692c.isAtEnd()) {
                return;
            } else {
                tag2 = this.f42692c.readTag();
            }
        } while (tag2 == this.f42693d);
        this.f42695f = tag2;
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
        return this.f42692c.readInt32();
    }

    @Override // p000.hrd
    public void readInt32List(List<Integer> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof b68)) {
            int tagWireType = hpi.getTagWireType(this.f42693d);
            if (tagWireType == 0) {
                do {
                    target.add(Integer.valueOf(this.f42692c.readInt32()));
                    if (this.f42692c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f42692c.readTag();
                    }
                } while (tag == this.f42693d);
                this.f42695f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw ce8.m3922e();
            }
            int totalBytesRead = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
            do {
                target.add(Integer.valueOf(this.f42692c.readInt32()));
            } while (this.f42692c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        b68 b68Var = (b68) target;
        int tagWireType2 = hpi.getTagWireType(this.f42693d);
        if (tagWireType2 == 0) {
            do {
                b68Var.addInt(this.f42692c.readInt32());
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f42692c.readTag();
                }
            } while (tag2 == this.f42693d);
            this.f42695f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw ce8.m3922e();
        }
        int totalBytesRead2 = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
        do {
            b68Var.addInt(this.f42692c.readInt32());
        } while (this.f42692c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // p000.hrd
    public long readInt64() throws IOException {
        requireWireType(0);
        return this.f42692c.readInt64();
    }

    @Override // p000.hrd
    public void readInt64List(List<Long> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof rk9)) {
            int tagWireType = hpi.getTagWireType(this.f42693d);
            if (tagWireType == 0) {
                do {
                    target.add(Long.valueOf(this.f42692c.readInt64()));
                    if (this.f42692c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f42692c.readTag();
                    }
                } while (tag == this.f42693d);
                this.f42695f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw ce8.m3922e();
            }
            int totalBytesRead = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
            do {
                target.add(Long.valueOf(this.f42692c.readInt64()));
            } while (this.f42692c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        rk9 rk9Var = (rk9) target;
        int tagWireType2 = hpi.getTagWireType(this.f42693d);
        if (tagWireType2 == 0) {
            do {
                rk9Var.addLong(this.f42692c.readInt64());
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f42692c.readTag();
                }
            } while (tag2 == this.f42693d);
            this.f42695f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw ce8.m3922e();
        }
        int totalBytesRead2 = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
        do {
            rk9Var.addLong(this.f42692c.readInt64());
        } while (this.f42692c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f42692c.popLimit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.hrd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void readMap(java.util.Map<K, V> r8, p000.os9.C10633b<K, V> r9, p000.zi5 r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.requireWireType(r0)
            f72 r1 = r7.f42692c
            int r1 = r1.readUInt32()
            f72 r2 = r7.f42692c
            int r1 = r2.pushLimit(r1)
            K r2 = r9.f68568b
            V r3 = r9.f68570d
        L14:
            int r4 = r7.getFieldNumber()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            f72 r5 = r7.f42692c     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L3a p000.ce8.C2294a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            ce8 r4 = new ce8     // Catch: java.lang.Throwable -> L3a p000.ce8.C2294a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a p000.ce8.C2294a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a p000.ce8.C2294a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            hpi$b r4 = r9.f68569c     // Catch: java.lang.Throwable -> L3a p000.ce8.C2294a -> L51
            V r5 = r9.f68570d     // Catch: java.lang.Throwable -> L3a p000.ce8.C2294a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a p000.ce8.C2294a -> L51
            java.lang.Object r3 = r7.readField(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a p000.ce8.C2294a -> L51
            goto L14
        L49:
            hpi$b r4 = r9.f68567a     // Catch: java.lang.Throwable -> L3a p000.ce8.C2294a -> L51
            r5 = 0
            java.lang.Object r2 = r7.readField(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a p000.ce8.C2294a -> L51
            goto L14
        L51:
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            ce8 r8 = new ce8     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            f72 r8 = r7.f42692c
            r8.popLimit(r1)
            return
        L67:
            f72 r9 = r7.f42692c
            r9.popLimit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h72.readMap(java.util.Map, os9$b, zi5):void");
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
        return this.f42692c.readSFixed32();
    }

    @Override // p000.hrd
    public void readSFixed32List(List<Integer> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof b68)) {
            int tagWireType = hpi.getTagWireType(this.f42693d);
            if (tagWireType == 2) {
                int uInt32 = this.f42692c.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.f42692c.getTotalBytesRead() + uInt32;
                do {
                    target.add(Integer.valueOf(this.f42692c.readSFixed32()));
                } while (this.f42692c.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw ce8.m3922e();
            }
            do {
                target.add(Integer.valueOf(this.f42692c.readSFixed32()));
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag = this.f42692c.readTag();
                }
            } while (tag == this.f42693d);
            this.f42695f = tag;
            return;
        }
        b68 b68Var = (b68) target;
        int tagWireType2 = hpi.getTagWireType(this.f42693d);
        if (tagWireType2 == 2) {
            int uInt322 = this.f42692c.readUInt32();
            verifyPackedFixed32Length(uInt322);
            int totalBytesRead2 = this.f42692c.getTotalBytesRead() + uInt322;
            do {
                b68Var.addInt(this.f42692c.readSFixed32());
            } while (this.f42692c.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw ce8.m3922e();
        }
        do {
            b68Var.addInt(this.f42692c.readSFixed32());
            if (this.f42692c.isAtEnd()) {
                return;
            } else {
                tag2 = this.f42692c.readTag();
            }
        } while (tag2 == this.f42693d);
        this.f42695f = tag2;
    }

    @Override // p000.hrd
    public long readSFixed64() throws IOException {
        requireWireType(1);
        return this.f42692c.readSFixed64();
    }

    @Override // p000.hrd
    public void readSFixed64List(List<Long> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof rk9)) {
            int tagWireType = hpi.getTagWireType(this.f42693d);
            if (tagWireType == 1) {
                do {
                    target.add(Long.valueOf(this.f42692c.readSFixed64()));
                    if (this.f42692c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f42692c.readTag();
                    }
                } while (tag == this.f42693d);
                this.f42695f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw ce8.m3922e();
            }
            int uInt32 = this.f42692c.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.f42692c.getTotalBytesRead() + uInt32;
            do {
                target.add(Long.valueOf(this.f42692c.readSFixed64()));
            } while (this.f42692c.getTotalBytesRead() < totalBytesRead);
            return;
        }
        rk9 rk9Var = (rk9) target;
        int tagWireType2 = hpi.getTagWireType(this.f42693d);
        if (tagWireType2 == 1) {
            do {
                rk9Var.addLong(this.f42692c.readSFixed64());
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f42692c.readTag();
                }
            } while (tag2 == this.f42693d);
            this.f42695f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw ce8.m3922e();
        }
        int uInt322 = this.f42692c.readUInt32();
        verifyPackedFixed64Length(uInt322);
        int totalBytesRead2 = this.f42692c.getTotalBytesRead() + uInt322;
        do {
            rk9Var.addLong(this.f42692c.readSFixed64());
        } while (this.f42692c.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // p000.hrd
    public int readSInt32() throws IOException {
        requireWireType(0);
        return this.f42692c.readSInt32();
    }

    @Override // p000.hrd
    public void readSInt32List(List<Integer> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof b68)) {
            int tagWireType = hpi.getTagWireType(this.f42693d);
            if (tagWireType == 0) {
                do {
                    target.add(Integer.valueOf(this.f42692c.readSInt32()));
                    if (this.f42692c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f42692c.readTag();
                    }
                } while (tag == this.f42693d);
                this.f42695f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw ce8.m3922e();
            }
            int totalBytesRead = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
            do {
                target.add(Integer.valueOf(this.f42692c.readSInt32()));
            } while (this.f42692c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        b68 b68Var = (b68) target;
        int tagWireType2 = hpi.getTagWireType(this.f42693d);
        if (tagWireType2 == 0) {
            do {
                b68Var.addInt(this.f42692c.readSInt32());
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f42692c.readTag();
                }
            } while (tag2 == this.f42693d);
            this.f42695f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw ce8.m3922e();
        }
        int totalBytesRead2 = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
        do {
            b68Var.addInt(this.f42692c.readSInt32());
        } while (this.f42692c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // p000.hrd
    public long readSInt64() throws IOException {
        requireWireType(0);
        return this.f42692c.readSInt64();
    }

    @Override // p000.hrd
    public void readSInt64List(List<Long> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof rk9)) {
            int tagWireType = hpi.getTagWireType(this.f42693d);
            if (tagWireType == 0) {
                do {
                    target.add(Long.valueOf(this.f42692c.readSInt64()));
                    if (this.f42692c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f42692c.readTag();
                    }
                } while (tag == this.f42693d);
                this.f42695f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw ce8.m3922e();
            }
            int totalBytesRead = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
            do {
                target.add(Long.valueOf(this.f42692c.readSInt64()));
            } while (this.f42692c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        rk9 rk9Var = (rk9) target;
        int tagWireType2 = hpi.getTagWireType(this.f42693d);
        if (tagWireType2 == 0) {
            do {
                rk9Var.addLong(this.f42692c.readSInt64());
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f42692c.readTag();
                }
            } while (tag2 == this.f42693d);
            this.f42695f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw ce8.m3922e();
        }
        int totalBytesRead2 = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
        do {
            rk9Var.addLong(this.f42692c.readSInt64());
        } while (this.f42692c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // p000.hrd
    public String readString() throws IOException {
        requireWireType(2);
        return this.f42692c.readString();
    }

    @Override // p000.hrd
    public void readStringList(List<String> target) throws IOException {
        readStringListInternal(target, false);
    }

    public void readStringListInternal(List<String> target, boolean requireUtf8) throws IOException {
        int tag;
        int tag2;
        if (hpi.getTagWireType(this.f42693d) != 2) {
            throw ce8.m3922e();
        }
        if (!(target instanceof e39) || requireUtf8) {
            do {
                target.add(requireUtf8 ? readStringRequireUtf8() : readString());
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag = this.f42692c.readTag();
                }
            } while (tag == this.f42693d);
            this.f42695f = tag;
            return;
        }
        e39 e39Var = (e39) target;
        do {
            e39Var.add(readBytes());
            if (this.f42692c.isAtEnd()) {
                return;
            } else {
                tag2 = this.f42692c.readTag();
            }
        } while (tag2 == this.f42693d);
        this.f42695f = tag2;
    }

    @Override // p000.hrd
    public void readStringListRequireUtf8(List<String> target) throws IOException {
        readStringListInternal(target, true);
    }

    @Override // p000.hrd
    public String readStringRequireUtf8() throws IOException {
        requireWireType(2);
        return this.f42692c.readStringRequireUtf8();
    }

    @Override // p000.hrd
    public int readUInt32() throws IOException {
        requireWireType(0);
        return this.f42692c.readUInt32();
    }

    @Override // p000.hrd
    public void readUInt32List(List<Integer> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof b68)) {
            int tagWireType = hpi.getTagWireType(this.f42693d);
            if (tagWireType == 0) {
                do {
                    target.add(Integer.valueOf(this.f42692c.readUInt32()));
                    if (this.f42692c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f42692c.readTag();
                    }
                } while (tag == this.f42693d);
                this.f42695f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw ce8.m3922e();
            }
            int totalBytesRead = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
            do {
                target.add(Integer.valueOf(this.f42692c.readUInt32()));
            } while (this.f42692c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        b68 b68Var = (b68) target;
        int tagWireType2 = hpi.getTagWireType(this.f42693d);
        if (tagWireType2 == 0) {
            do {
                b68Var.addInt(this.f42692c.readUInt32());
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f42692c.readTag();
                }
            } while (tag2 == this.f42693d);
            this.f42695f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw ce8.m3922e();
        }
        int totalBytesRead2 = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
        do {
            b68Var.addInt(this.f42692c.readUInt32());
        } while (this.f42692c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // p000.hrd
    public long readUInt64() throws IOException {
        requireWireType(0);
        return this.f42692c.readUInt64();
    }

    @Override // p000.hrd
    public void readUInt64List(List<Long> target) throws IOException {
        int tag;
        int tag2;
        if (!(target instanceof rk9)) {
            int tagWireType = hpi.getTagWireType(this.f42693d);
            if (tagWireType == 0) {
                do {
                    target.add(Long.valueOf(this.f42692c.readUInt64()));
                    if (this.f42692c.isAtEnd()) {
                        return;
                    } else {
                        tag = this.f42692c.readTag();
                    }
                } while (tag == this.f42693d);
                this.f42695f = tag;
                return;
            }
            if (tagWireType != 2) {
                throw ce8.m3922e();
            }
            int totalBytesRead = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
            do {
                target.add(Long.valueOf(this.f42692c.readUInt64()));
            } while (this.f42692c.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        rk9 rk9Var = (rk9) target;
        int tagWireType2 = hpi.getTagWireType(this.f42693d);
        if (tagWireType2 == 0) {
            do {
                rk9Var.addLong(this.f42692c.readUInt64());
                if (this.f42692c.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.f42692c.readTag();
                }
            } while (tag2 == this.f42693d);
            this.f42695f = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw ce8.m3922e();
        }
        int totalBytesRead2 = this.f42692c.getTotalBytesRead() + this.f42692c.readUInt32();
        do {
            rk9Var.addLong(this.f42692c.readUInt64());
        } while (this.f42692c.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // p000.hrd
    public boolean shouldDiscardUnknownFields() {
        return this.f42692c.m10688g();
    }

    @Override // p000.hrd
    public boolean skipField() throws IOException {
        int i;
        if (this.f42692c.isAtEnd() || (i = this.f42693d) == this.f42694e) {
            return false;
        }
        return this.f42692c.skipField(i);
    }

    private <T> T readGroup(tpe<T> schema, zi5 extensionRegistry) throws IOException {
        T tNewInstance = schema.newInstance();
        mergeGroupFieldInternal(tNewInstance, schema, extensionRegistry);
        schema.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    private <T> T readMessage(tpe<T> schema, zi5 extensionRegistry) throws IOException {
        T tNewInstance = schema.newInstance();
        mergeMessageFieldInternal(tNewInstance, schema, extensionRegistry);
        schema.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.hrd
    @Deprecated
    public <T> void readGroupList(List<T> target, tpe<T> schema, zi5 extensionRegistry) throws IOException {
        int tag;
        if (hpi.getTagWireType(this.f42693d) == 3) {
            int i = this.f42693d;
            do {
                target.add(readGroup(schema, extensionRegistry));
                if (this.f42692c.isAtEnd() || this.f42695f != 0) {
                    return;
                } else {
                    tag = this.f42692c.readTag();
                }
            } while (tag == i);
            this.f42695f = tag;
            return;
        }
        throw ce8.m3922e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.hrd
    public <T> void readMessageList(List<T> target, tpe<T> schema, zi5 extensionRegistry) throws IOException {
        int tag;
        if (hpi.getTagWireType(this.f42693d) == 2) {
            int i = this.f42693d;
            do {
                target.add(readMessage(schema, extensionRegistry));
                if (this.f42692c.isAtEnd() || this.f42695f != 0) {
                    return;
                } else {
                    tag = this.f42692c.readTag();
                }
            } while (tag == i);
            this.f42695f = tag;
            return;
        }
        throw ce8.m3922e();
    }
}
