package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.mag;
import p000.u27;
import p000.x99;

/* JADX INFO: loaded from: classes3.dex */
public final class a2i extends u27<a2i, C0025b> implements q2i {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final a2i DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile vhc<a2i> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    /* JADX INFO: renamed from: a2i$a */
    public static /* synthetic */ class C0024a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f227a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f227a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f227a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f227a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f227a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f227a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f227a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f227a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: a2i$b */
    public static final class C0025b extends u27.AbstractC13324b<a2i, C0025b> implements q2i {
        public /* synthetic */ C0025b(C0024a c0024a) {
            this();
        }

        public C0025b clearBoolValue() {
            m23058e();
            ((a2i) this.f86607b).clearBoolValue();
            return this;
        }

        public C0025b clearKind() {
            m23058e();
            ((a2i) this.f86607b).clearKind();
            return this;
        }

        public C0025b clearListValue() {
            m23058e();
            ((a2i) this.f86607b).clearListValue();
            return this;
        }

        public C0025b clearNullValue() {
            m23058e();
            ((a2i) this.f86607b).clearNullValue();
            return this;
        }

        public C0025b clearNumberValue() {
            m23058e();
            ((a2i) this.f86607b).clearNumberValue();
            return this;
        }

        public C0025b clearStringValue() {
            m23058e();
            ((a2i) this.f86607b).clearStringValue();
            return this;
        }

        public C0025b clearStructValue() {
            m23058e();
            ((a2i) this.f86607b).clearStructValue();
            return this;
        }

        @Override // p000.q2i
        public boolean getBoolValue() {
            return ((a2i) this.f86607b).getBoolValue();
        }

        @Override // p000.q2i
        public EnumC0026c getKindCase() {
            return ((a2i) this.f86607b).getKindCase();
        }

        @Override // p000.q2i
        public x99 getListValue() {
            return ((a2i) this.f86607b).getListValue();
        }

        @Override // p000.q2i
        public aib getNullValue() {
            return ((a2i) this.f86607b).getNullValue();
        }

        @Override // p000.q2i
        public int getNullValueValue() {
            return ((a2i) this.f86607b).getNullValueValue();
        }

        @Override // p000.q2i
        public double getNumberValue() {
            return ((a2i) this.f86607b).getNumberValue();
        }

        @Override // p000.q2i
        public String getStringValue() {
            return ((a2i) this.f86607b).getStringValue();
        }

        @Override // p000.q2i
        public wj1 getStringValueBytes() {
            return ((a2i) this.f86607b).getStringValueBytes();
        }

        @Override // p000.q2i
        public mag getStructValue() {
            return ((a2i) this.f86607b).getStructValue();
        }

        @Override // p000.q2i
        public boolean hasBoolValue() {
            return ((a2i) this.f86607b).hasBoolValue();
        }

        @Override // p000.q2i
        public boolean hasListValue() {
            return ((a2i) this.f86607b).hasListValue();
        }

        @Override // p000.q2i
        public boolean hasNullValue() {
            return ((a2i) this.f86607b).hasNullValue();
        }

        @Override // p000.q2i
        public boolean hasNumberValue() {
            return ((a2i) this.f86607b).hasNumberValue();
        }

        @Override // p000.q2i
        public boolean hasStringValue() {
            return ((a2i) this.f86607b).hasStringValue();
        }

        @Override // p000.q2i
        public boolean hasStructValue() {
            return ((a2i) this.f86607b).hasStructValue();
        }

        public C0025b mergeListValue(x99 value) {
            m23058e();
            ((a2i) this.f86607b).mergeListValue(value);
            return this;
        }

        public C0025b mergeStructValue(mag value) {
            m23058e();
            ((a2i) this.f86607b).mergeStructValue(value);
            return this;
        }

        public C0025b setBoolValue(boolean value) {
            m23058e();
            ((a2i) this.f86607b).setBoolValue(value);
            return this;
        }

        public C0025b setListValue(x99 value) {
            m23058e();
            ((a2i) this.f86607b).setListValue(value);
            return this;
        }

        public C0025b setNullValue(aib value) {
            m23058e();
            ((a2i) this.f86607b).setNullValue(value);
            return this;
        }

        public C0025b setNullValueValue(int value) {
            m23058e();
            ((a2i) this.f86607b).setNullValueValue(value);
            return this;
        }

        public C0025b setNumberValue(double value) {
            m23058e();
            ((a2i) this.f86607b).setNumberValue(value);
            return this;
        }

        public C0025b setStringValue(String value) {
            m23058e();
            ((a2i) this.f86607b).setStringValue(value);
            return this;
        }

        public C0025b setStringValueBytes(wj1 value) {
            m23058e();
            ((a2i) this.f86607b).setStringValueBytes(value);
            return this;
        }

        public C0025b setStructValue(mag value) {
            m23058e();
            ((a2i) this.f86607b).setStructValue(value);
            return this;
        }

        private C0025b() {
            super(a2i.DEFAULT_INSTANCE);
        }

        public C0025b setListValue(x99.C15005b builderForValue) {
            m23058e();
            ((a2i) this.f86607b).setListValue(builderForValue.build());
            return this;
        }

        public C0025b setStructValue(mag.C9241b builderForValue) {
            m23058e();
            ((a2i) this.f86607b).setStructValue(builderForValue.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: a2i$c */
    public enum EnumC0026c {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f236a;

        EnumC0026c(int value) {
            this.f236a = value;
        }

        public static EnumC0026c forNumber(int value) {
            switch (value) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.f236a;
        }

        @Deprecated
        public static EnumC0026c valueOf(int value) {
            return forNumber(value);
        }
    }

    static {
        a2i a2iVar = new a2i();
        DEFAULT_INSTANCE = a2iVar;
        u27.m23029g0(a2i.class, a2iVar);
    }

    private a2i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static a2i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListValue(x99 value) {
        value.getClass();
        if (this.kindCase_ != 6 || this.kind_ == x99.getDefaultInstance()) {
            this.kind_ = value;
        } else {
            this.kind_ = x99.newBuilder((x99) this.kind_).mergeFrom(value).buildPartial();
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructValue(mag value) {
        value.getClass();
        if (this.kindCase_ != 5 || this.kind_ == mag.getDefaultInstance()) {
            this.kind_ = value;
        } else {
            this.kind_ = mag.newBuilder((mag) this.kind_).mergeFrom(value).buildPartial();
        }
        this.kindCase_ = 5;
    }

    public static C0025b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static a2i parseDelimitedFrom(InputStream input) throws IOException {
        return (a2i) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static a2i parseFrom(ByteBuffer data) throws be8 {
        return (a2i) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<a2i> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean value) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListValue(x99 value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValue(aib value) {
        this.kind_ = Integer.valueOf(value.getNumber());
        this.kindCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValueValue(int value) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberValue(double value) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String value) {
        value.getClass();
        this.kindCase_ = 3;
        this.kind_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        this.kind_ = value.toStringUtf8();
        this.kindCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructValue(mag value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 5;
    }

    @Override // p000.q2i
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // p000.q2i
    public EnumC0026c getKindCase() {
        return EnumC0026c.forNumber(this.kindCase_);
    }

    @Override // p000.q2i
    public x99 getListValue() {
        return this.kindCase_ == 6 ? (x99) this.kind_ : x99.getDefaultInstance();
    }

    @Override // p000.q2i
    public aib getNullValue() {
        if (this.kindCase_ != 1) {
            return aib.NULL_VALUE;
        }
        aib aibVarForNumber = aib.forNumber(((Integer) this.kind_).intValue());
        return aibVarForNumber == null ? aib.UNRECOGNIZED : aibVarForNumber;
    }

    @Override // p000.q2i
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // p000.q2i
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // p000.q2i
    public String getStringValue() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    @Override // p000.q2i
    public wj1 getStringValueBytes() {
        return wj1.copyFromUtf8(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    @Override // p000.q2i
    public mag getStructValue() {
        return this.kindCase_ == 5 ? (mag) this.kind_ : mag.getDefaultInstance();
    }

    @Override // p000.q2i
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // p000.q2i
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // p000.q2i
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // p000.q2i
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // p000.q2i
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // p000.q2i
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C0024a c0024a = null;
        switch (C0024a.f227a[method.ordinal()]) {
            case 1:
                return new a2i();
            case 2:
                return new C0025b(c0024a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", mag.class, x99.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<a2i> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (a2i.class) {
                        try {
                            c13325c = PARSER;
                            if (c13325c == null) {
                                c13325c = new u27.C13325c<>(DEFAULT_INSTANCE);
                                PARSER = c13325c;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return c13325c;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static C0025b newBuilder(a2i prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static a2i parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (a2i) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static a2i parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (a2i) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static a2i parseFrom(wj1 data) throws be8 {
        return (a2i) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static a2i parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (a2i) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static a2i parseFrom(byte[] data) throws be8 {
        return (a2i) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static a2i parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (a2i) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static a2i parseFrom(InputStream input) throws IOException {
        return (a2i) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static a2i parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (a2i) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static a2i parseFrom(e72 input) throws IOException {
        return (a2i) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static a2i parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (a2i) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
