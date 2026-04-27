package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.f2h;
import p000.ju8;
import p000.mt9;
import p000.o70;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class b2i extends v27<b2i, C1712b> implements o2i {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final b2i DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile uhc<b2i> PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    /* JADX INFO: renamed from: b2i$a */
    public static /* synthetic */ class C1711a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12499a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f12499a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12499a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12499a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12499a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12499a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12499a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12499a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: b2i$b */
    public static final class C1712b extends v27.AbstractC13823b<b2i, C1712b> implements o2i {
        public /* synthetic */ C1712b(C1711a c1711a) {
            this();
        }

        public C1712b clearArrayValue() {
            m23743e();
            ((b2i) this.f89756b).clearArrayValue();
            return this;
        }

        public C1712b clearBooleanValue() {
            m23743e();
            ((b2i) this.f89756b).clearBooleanValue();
            return this;
        }

        public C1712b clearBytesValue() {
            m23743e();
            ((b2i) this.f89756b).clearBytesValue();
            return this;
        }

        public C1712b clearDoubleValue() {
            m23743e();
            ((b2i) this.f89756b).clearDoubleValue();
            return this;
        }

        public C1712b clearGeoPointValue() {
            m23743e();
            ((b2i) this.f89756b).clearGeoPointValue();
            return this;
        }

        public C1712b clearIntegerValue() {
            m23743e();
            ((b2i) this.f89756b).clearIntegerValue();
            return this;
        }

        public C1712b clearMapValue() {
            m23743e();
            ((b2i) this.f89756b).clearMapValue();
            return this;
        }

        public C1712b clearNullValue() {
            m23743e();
            ((b2i) this.f89756b).clearNullValue();
            return this;
        }

        public C1712b clearReferenceValue() {
            m23743e();
            ((b2i) this.f89756b).clearReferenceValue();
            return this;
        }

        public C1712b clearStringValue() {
            m23743e();
            ((b2i) this.f89756b).clearStringValue();
            return this;
        }

        public C1712b clearTimestampValue() {
            m23743e();
            ((b2i) this.f89756b).clearTimestampValue();
            return this;
        }

        public C1712b clearValueType() {
            m23743e();
            ((b2i) this.f89756b).clearValueType();
            return this;
        }

        @Override // p000.o2i
        public o70 getArrayValue() {
            return ((b2i) this.f89756b).getArrayValue();
        }

        @Override // p000.o2i
        public boolean getBooleanValue() {
            return ((b2i) this.f89756b).getBooleanValue();
        }

        @Override // p000.o2i
        public vj1 getBytesValue() {
            return ((b2i) this.f89756b).getBytesValue();
        }

        @Override // p000.o2i
        public double getDoubleValue() {
            return ((b2i) this.f89756b).getDoubleValue();
        }

        @Override // p000.o2i
        public ju8 getGeoPointValue() {
            return ((b2i) this.f89756b).getGeoPointValue();
        }

        @Override // p000.o2i
        public long getIntegerValue() {
            return ((b2i) this.f89756b).getIntegerValue();
        }

        @Override // p000.o2i
        public mt9 getMapValue() {
            return ((b2i) this.f89756b).getMapValue();
        }

        @Override // p000.o2i
        public bib getNullValue() {
            return ((b2i) this.f89756b).getNullValue();
        }

        @Override // p000.o2i
        public int getNullValueValue() {
            return ((b2i) this.f89756b).getNullValueValue();
        }

        @Override // p000.o2i
        public String getReferenceValue() {
            return ((b2i) this.f89756b).getReferenceValue();
        }

        @Override // p000.o2i
        public vj1 getReferenceValueBytes() {
            return ((b2i) this.f89756b).getReferenceValueBytes();
        }

        @Override // p000.o2i
        public String getStringValue() {
            return ((b2i) this.f89756b).getStringValue();
        }

        @Override // p000.o2i
        public vj1 getStringValueBytes() {
            return ((b2i) this.f89756b).getStringValueBytes();
        }

        @Override // p000.o2i
        public f2h getTimestampValue() {
            return ((b2i) this.f89756b).getTimestampValue();
        }

        @Override // p000.o2i
        public EnumC1713c getValueTypeCase() {
            return ((b2i) this.f89756b).getValueTypeCase();
        }

        @Override // p000.o2i
        public boolean hasArrayValue() {
            return ((b2i) this.f89756b).hasArrayValue();
        }

        @Override // p000.o2i
        public boolean hasBooleanValue() {
            return ((b2i) this.f89756b).hasBooleanValue();
        }

        @Override // p000.o2i
        public boolean hasBytesValue() {
            return ((b2i) this.f89756b).hasBytesValue();
        }

        @Override // p000.o2i
        public boolean hasDoubleValue() {
            return ((b2i) this.f89756b).hasDoubleValue();
        }

        @Override // p000.o2i
        public boolean hasGeoPointValue() {
            return ((b2i) this.f89756b).hasGeoPointValue();
        }

        @Override // p000.o2i
        public boolean hasIntegerValue() {
            return ((b2i) this.f89756b).hasIntegerValue();
        }

        @Override // p000.o2i
        public boolean hasMapValue() {
            return ((b2i) this.f89756b).hasMapValue();
        }

        @Override // p000.o2i
        public boolean hasNullValue() {
            return ((b2i) this.f89756b).hasNullValue();
        }

        @Override // p000.o2i
        public boolean hasReferenceValue() {
            return ((b2i) this.f89756b).hasReferenceValue();
        }

        @Override // p000.o2i
        public boolean hasStringValue() {
            return ((b2i) this.f89756b).hasStringValue();
        }

        @Override // p000.o2i
        public boolean hasTimestampValue() {
            return ((b2i) this.f89756b).hasTimestampValue();
        }

        public C1712b mergeArrayValue(o70 o70Var) {
            m23743e();
            ((b2i) this.f89756b).mergeArrayValue(o70Var);
            return this;
        }

        public C1712b mergeGeoPointValue(ju8 ju8Var) {
            m23743e();
            ((b2i) this.f89756b).mergeGeoPointValue(ju8Var);
            return this;
        }

        public C1712b mergeMapValue(mt9 mt9Var) {
            m23743e();
            ((b2i) this.f89756b).mergeMapValue(mt9Var);
            return this;
        }

        public C1712b mergeTimestampValue(f2h f2hVar) {
            m23743e();
            ((b2i) this.f89756b).mergeTimestampValue(f2hVar);
            return this;
        }

        public C1712b setArrayValue(o70 o70Var) {
            m23743e();
            ((b2i) this.f89756b).setArrayValue(o70Var);
            return this;
        }

        public C1712b setBooleanValue(boolean z) {
            m23743e();
            ((b2i) this.f89756b).setBooleanValue(z);
            return this;
        }

        public C1712b setBytesValue(vj1 vj1Var) {
            m23743e();
            ((b2i) this.f89756b).setBytesValue(vj1Var);
            return this;
        }

        public C1712b setDoubleValue(double d) {
            m23743e();
            ((b2i) this.f89756b).setDoubleValue(d);
            return this;
        }

        public C1712b setGeoPointValue(ju8 ju8Var) {
            m23743e();
            ((b2i) this.f89756b).setGeoPointValue(ju8Var);
            return this;
        }

        public C1712b setIntegerValue(long j) {
            m23743e();
            ((b2i) this.f89756b).setIntegerValue(j);
            return this;
        }

        public C1712b setMapValue(mt9 mt9Var) {
            m23743e();
            ((b2i) this.f89756b).setMapValue(mt9Var);
            return this;
        }

        public C1712b setNullValue(bib bibVar) {
            m23743e();
            ((b2i) this.f89756b).setNullValue(bibVar);
            return this;
        }

        public C1712b setNullValueValue(int i) {
            m23743e();
            ((b2i) this.f89756b).setNullValueValue(i);
            return this;
        }

        public C1712b setReferenceValue(String str) {
            m23743e();
            ((b2i) this.f89756b).setReferenceValue(str);
            return this;
        }

        public C1712b setReferenceValueBytes(vj1 vj1Var) {
            m23743e();
            ((b2i) this.f89756b).setReferenceValueBytes(vj1Var);
            return this;
        }

        public C1712b setStringValue(String str) {
            m23743e();
            ((b2i) this.f89756b).setStringValue(str);
            return this;
        }

        public C1712b setStringValueBytes(vj1 vj1Var) {
            m23743e();
            ((b2i) this.f89756b).setStringValueBytes(vj1Var);
            return this;
        }

        public C1712b setTimestampValue(f2h f2hVar) {
            m23743e();
            ((b2i) this.f89756b).setTimestampValue(f2hVar);
            return this;
        }

        private C1712b() {
            super(b2i.DEFAULT_INSTANCE);
        }

        public C1712b setArrayValue(o70.C10211b c10211b) {
            m23743e();
            ((b2i) this.f89756b).setArrayValue(c10211b.build());
            return this;
        }

        public C1712b setGeoPointValue(ju8.C8095b c8095b) {
            m23743e();
            ((b2i) this.f89756b).setGeoPointValue(c8095b.build());
            return this;
        }

        public C1712b setMapValue(mt9.C9519b c9519b) {
            m23743e();
            ((b2i) this.f89756b).setMapValue(c9519b.build());
            return this;
        }

        public C1712b setTimestampValue(f2h.C5567b c5567b) {
            m23743e();
            ((b2i) this.f89756b).setTimestampValue(c5567b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: b2i$c */
    public enum EnumC1713c {
        NULL_VALUE(11),
        BOOLEAN_VALUE(1),
        INTEGER_VALUE(2),
        DOUBLE_VALUE(3),
        TIMESTAMP_VALUE(10),
        STRING_VALUE(17),
        BYTES_VALUE(18),
        REFERENCE_VALUE(5),
        GEO_POINT_VALUE(8),
        ARRAY_VALUE(9),
        MAP_VALUE(6),
        VALUETYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f12513a;

        EnumC1713c(int i) {
            this.f12513a = i;
        }

        public static EnumC1713c forNumber(int i) {
            if (i == 0) {
                return VALUETYPE_NOT_SET;
            }
            if (i == 1) {
                return BOOLEAN_VALUE;
            }
            if (i == 2) {
                return INTEGER_VALUE;
            }
            if (i == 3) {
                return DOUBLE_VALUE;
            }
            if (i == 5) {
                return REFERENCE_VALUE;
            }
            if (i == 6) {
                return MAP_VALUE;
            }
            if (i == 17) {
                return STRING_VALUE;
            }
            if (i == 18) {
                return BYTES_VALUE;
            }
            switch (i) {
                case 8:
                    return GEO_POINT_VALUE;
                case 9:
                    return ARRAY_VALUE;
                case 10:
                    return TIMESTAMP_VALUE;
                case 11:
                    return NULL_VALUE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.f12513a;
        }

        @Deprecated
        public static EnumC1713c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        b2i b2iVar = new b2i();
        DEFAULT_INSTANCE = b2iVar;
        v27.m23715h0(b2i.class, b2iVar);
    }

    private b2i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArrayValue() {
        if (this.valueTypeCase_ == 9) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBooleanValue() {
        if (this.valueTypeCase_ == 1) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytesValue() {
        if (this.valueTypeCase_ == 18) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        if (this.valueTypeCase_ == 3) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeoPointValue() {
        if (this.valueTypeCase_ == 8) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntegerValue() {
        if (this.valueTypeCase_ == 2) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapValue() {
        if (this.valueTypeCase_ == 6) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNullValue() {
        if (this.valueTypeCase_ == 11) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReferenceValue() {
        if (this.valueTypeCase_ == 5) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.valueTypeCase_ == 17) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestampValue() {
        if (this.valueTypeCase_ == 10) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueType() {
        this.valueTypeCase_ = 0;
        this.valueType_ = null;
    }

    public static b2i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArrayValue(o70 o70Var) {
        o70Var.getClass();
        if (this.valueTypeCase_ != 9 || this.valueType_ == o70.getDefaultInstance()) {
            this.valueType_ = o70Var;
        } else {
            this.valueType_ = o70.newBuilder((o70) this.valueType_).mergeFrom(o70Var).buildPartial();
        }
        this.valueTypeCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeoPointValue(ju8 ju8Var) {
        ju8Var.getClass();
        if (this.valueTypeCase_ != 8 || this.valueType_ == ju8.getDefaultInstance()) {
            this.valueType_ = ju8Var;
        } else {
            this.valueType_ = ju8.newBuilder((ju8) this.valueType_).mergeFrom(ju8Var).buildPartial();
        }
        this.valueTypeCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapValue(mt9 mt9Var) {
        mt9Var.getClass();
        if (this.valueTypeCase_ != 6 || this.valueType_ == mt9.getDefaultInstance()) {
            this.valueType_ = mt9Var;
        } else {
            this.valueType_ = mt9.newBuilder((mt9) this.valueType_).mergeFrom(mt9Var).buildPartial();
        }
        this.valueTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimestampValue(f2h f2hVar) {
        f2hVar.getClass();
        if (this.valueTypeCase_ != 10 || this.valueType_ == f2h.getDefaultInstance()) {
            this.valueType_ = f2hVar;
        } else {
            this.valueType_ = f2h.newBuilder((f2h) this.valueType_).mergeFrom(f2hVar).buildPartial();
        }
        this.valueTypeCase_ = 10;
    }

    public static C1712b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static b2i parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (b2i) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static b2i parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (b2i) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<b2i> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArrayValue(o70 o70Var) {
        o70Var.getClass();
        this.valueType_ = o70Var;
        this.valueTypeCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBooleanValue(boolean z) {
        this.valueTypeCase_ = 1;
        this.valueType_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytesValue(vj1 vj1Var) {
        vj1Var.getClass();
        this.valueTypeCase_ = 18;
        this.valueType_ = vj1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d) {
        this.valueTypeCase_ = 3;
        this.valueType_ = Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeoPointValue(ju8 ju8Var) {
        ju8Var.getClass();
        this.valueType_ = ju8Var;
        this.valueTypeCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntegerValue(long j) {
        this.valueTypeCase_ = 2;
        this.valueType_ = Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapValue(mt9 mt9Var) {
        mt9Var.getClass();
        this.valueType_ = mt9Var;
        this.valueTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValue(bib bibVar) {
        this.valueType_ = Integer.valueOf(bibVar.getNumber());
        this.valueTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValueValue(int i) {
        this.valueTypeCase_ = 11;
        this.valueType_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReferenceValue(String str) {
        str.getClass();
        this.valueTypeCase_ = 5;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReferenceValueBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.valueType_ = vj1Var.toStringUtf8();
        this.valueTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        str.getClass();
        this.valueTypeCase_ = 17;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.valueType_ = vj1Var.toStringUtf8();
        this.valueTypeCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampValue(f2h f2hVar) {
        f2hVar.getClass();
        this.valueType_ = f2hVar;
        this.valueTypeCase_ = 10;
    }

    @Override // p000.o2i
    public o70 getArrayValue() {
        return this.valueTypeCase_ == 9 ? (o70) this.valueType_ : o70.getDefaultInstance();
    }

    @Override // p000.o2i
    public boolean getBooleanValue() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    @Override // p000.o2i
    public vj1 getBytesValue() {
        return this.valueTypeCase_ == 18 ? (vj1) this.valueType_ : vj1.f91344e;
    }

    @Override // p000.o2i
    public double getDoubleValue() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    @Override // p000.o2i
    public ju8 getGeoPointValue() {
        return this.valueTypeCase_ == 8 ? (ju8) this.valueType_ : ju8.getDefaultInstance();
    }

    @Override // p000.o2i
    public long getIntegerValue() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    @Override // p000.o2i
    public mt9 getMapValue() {
        return this.valueTypeCase_ == 6 ? (mt9) this.valueType_ : mt9.getDefaultInstance();
    }

    @Override // p000.o2i
    public bib getNullValue() {
        if (this.valueTypeCase_ != 11) {
            return bib.NULL_VALUE;
        }
        bib bibVarForNumber = bib.forNumber(((Integer) this.valueType_).intValue());
        return bibVarForNumber == null ? bib.UNRECOGNIZED : bibVarForNumber;
    }

    @Override // p000.o2i
    public int getNullValueValue() {
        if (this.valueTypeCase_ == 11) {
            return ((Integer) this.valueType_).intValue();
        }
        return 0;
    }

    @Override // p000.o2i
    public String getReferenceValue() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    @Override // p000.o2i
    public vj1 getReferenceValueBytes() {
        return vj1.copyFromUtf8(this.valueTypeCase_ == 5 ? (String) this.valueType_ : "");
    }

    @Override // p000.o2i
    public String getStringValue() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    @Override // p000.o2i
    public vj1 getStringValueBytes() {
        return vj1.copyFromUtf8(this.valueTypeCase_ == 17 ? (String) this.valueType_ : "");
    }

    @Override // p000.o2i
    public f2h getTimestampValue() {
        return this.valueTypeCase_ == 10 ? (f2h) this.valueType_ : f2h.getDefaultInstance();
    }

    @Override // p000.o2i
    public EnumC1713c getValueTypeCase() {
        return EnumC1713c.forNumber(this.valueTypeCase_);
    }

    @Override // p000.o2i
    public boolean hasArrayValue() {
        return this.valueTypeCase_ == 9;
    }

    @Override // p000.o2i
    public boolean hasBooleanValue() {
        return this.valueTypeCase_ == 1;
    }

    @Override // p000.o2i
    public boolean hasBytesValue() {
        return this.valueTypeCase_ == 18;
    }

    @Override // p000.o2i
    public boolean hasDoubleValue() {
        return this.valueTypeCase_ == 3;
    }

    @Override // p000.o2i
    public boolean hasGeoPointValue() {
        return this.valueTypeCase_ == 8;
    }

    @Override // p000.o2i
    public boolean hasIntegerValue() {
        return this.valueTypeCase_ == 2;
    }

    @Override // p000.o2i
    public boolean hasMapValue() {
        return this.valueTypeCase_ == 6;
    }

    @Override // p000.o2i
    public boolean hasNullValue() {
        return this.valueTypeCase_ == 11;
    }

    @Override // p000.o2i
    public boolean hasReferenceValue() {
        return this.valueTypeCase_ == 5;
    }

    @Override // p000.o2i
    public boolean hasStringValue() {
        return this.valueTypeCase_ == 17;
    }

    @Override // p000.o2i
    public boolean hasTimestampValue() {
        return this.valueTypeCase_ == 10;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C1711a c1711a = null;
        switch (C1711a.f12499a[enumC13830i.ordinal()]) {
            case 1:
                return new b2i();
            case 2:
                return new C1712b(c1711a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", mt9.class, ju8.class, o70.class, f2h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<b2i> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (b2i.class) {
                        try {
                            c13824c = PARSER;
                            if (c13824c == null) {
                                c13824c = new v27.C13824c<>(DEFAULT_INSTANCE);
                                PARSER = c13824c;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return c13824c;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static C1712b newBuilder(b2i b2iVar) {
        return DEFAULT_INSTANCE.m23739o(b2iVar);
    }

    public static b2i parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (b2i) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static b2i parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (b2i) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static b2i parseFrom(vj1 vj1Var) throws ce8 {
        return (b2i) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static b2i parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (b2i) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static b2i parseFrom(byte[] bArr) throws ce8 {
        return (b2i) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static b2i parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (b2i) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static b2i parseFrom(InputStream inputStream) throws IOException {
        return (b2i) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static b2i parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (b2i) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static b2i parseFrom(f72 f72Var) throws IOException {
        return (b2i) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static b2i parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (b2i) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
