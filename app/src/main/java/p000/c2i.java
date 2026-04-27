package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.pag;
import p000.v27;
import p000.y99;

/* JADX INFO: loaded from: classes4.dex */
public final class c2i extends v27<c2i, C2171b> implements p2i {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final c2i DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile uhc<c2i> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    /* JADX INFO: renamed from: c2i$a */
    public static /* synthetic */ class C2170a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15603a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f15603a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15603a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15603a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15603a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15603a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15603a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15603a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: c2i$b */
    public static final class C2171b extends v27.AbstractC13823b<c2i, C2171b> implements p2i {
        public /* synthetic */ C2171b(C2170a c2170a) {
            this();
        }

        public C2171b clearBoolValue() {
            m23743e();
            ((c2i) this.f89756b).clearBoolValue();
            return this;
        }

        public C2171b clearKind() {
            m23743e();
            ((c2i) this.f89756b).clearKind();
            return this;
        }

        public C2171b clearListValue() {
            m23743e();
            ((c2i) this.f89756b).clearListValue();
            return this;
        }

        public C2171b clearNullValue() {
            m23743e();
            ((c2i) this.f89756b).clearNullValue();
            return this;
        }

        public C2171b clearNumberValue() {
            m23743e();
            ((c2i) this.f89756b).clearNumberValue();
            return this;
        }

        public C2171b clearStringValue() {
            m23743e();
            ((c2i) this.f89756b).clearStringValue();
            return this;
        }

        public C2171b clearStructValue() {
            m23743e();
            ((c2i) this.f89756b).clearStructValue();
            return this;
        }

        @Override // p000.p2i
        public boolean getBoolValue() {
            return ((c2i) this.f89756b).getBoolValue();
        }

        @Override // p000.p2i
        public EnumC2172c getKindCase() {
            return ((c2i) this.f89756b).getKindCase();
        }

        @Override // p000.p2i
        public y99 getListValue() {
            return ((c2i) this.f89756b).getListValue();
        }

        @Override // p000.p2i
        public bib getNullValue() {
            return ((c2i) this.f89756b).getNullValue();
        }

        @Override // p000.p2i
        public int getNullValueValue() {
            return ((c2i) this.f89756b).getNullValueValue();
        }

        @Override // p000.p2i
        public double getNumberValue() {
            return ((c2i) this.f89756b).getNumberValue();
        }

        @Override // p000.p2i
        public String getStringValue() {
            return ((c2i) this.f89756b).getStringValue();
        }

        @Override // p000.p2i
        public vj1 getStringValueBytes() {
            return ((c2i) this.f89756b).getStringValueBytes();
        }

        @Override // p000.p2i
        public pag getStructValue() {
            return ((c2i) this.f89756b).getStructValue();
        }

        @Override // p000.p2i
        public boolean hasBoolValue() {
            return ((c2i) this.f89756b).hasBoolValue();
        }

        @Override // p000.p2i
        public boolean hasListValue() {
            return ((c2i) this.f89756b).hasListValue();
        }

        @Override // p000.p2i
        public boolean hasNullValue() {
            return ((c2i) this.f89756b).hasNullValue();
        }

        @Override // p000.p2i
        public boolean hasNumberValue() {
            return ((c2i) this.f89756b).hasNumberValue();
        }

        @Override // p000.p2i
        public boolean hasStringValue() {
            return ((c2i) this.f89756b).hasStringValue();
        }

        @Override // p000.p2i
        public boolean hasStructValue() {
            return ((c2i) this.f89756b).hasStructValue();
        }

        public C2171b mergeListValue(y99 value) {
            m23743e();
            ((c2i) this.f89756b).mergeListValue(value);
            return this;
        }

        public C2171b mergeStructValue(pag value) {
            m23743e();
            ((c2i) this.f89756b).mergeStructValue(value);
            return this;
        }

        public C2171b setBoolValue(boolean value) {
            m23743e();
            ((c2i) this.f89756b).setBoolValue(value);
            return this;
        }

        public C2171b setListValue(y99 value) {
            m23743e();
            ((c2i) this.f89756b).setListValue(value);
            return this;
        }

        public C2171b setNullValue(bib value) {
            m23743e();
            ((c2i) this.f89756b).setNullValue(value);
            return this;
        }

        public C2171b setNullValueValue(int value) {
            m23743e();
            ((c2i) this.f89756b).setNullValueValue(value);
            return this;
        }

        public C2171b setNumberValue(double value) {
            m23743e();
            ((c2i) this.f89756b).setNumberValue(value);
            return this;
        }

        public C2171b setStringValue(String value) {
            m23743e();
            ((c2i) this.f89756b).setStringValue(value);
            return this;
        }

        public C2171b setStringValueBytes(vj1 value) {
            m23743e();
            ((c2i) this.f89756b).setStringValueBytes(value);
            return this;
        }

        public C2171b setStructValue(pag value) {
            m23743e();
            ((c2i) this.f89756b).setStructValue(value);
            return this;
        }

        private C2171b() {
            super(c2i.DEFAULT_INSTANCE);
        }

        public C2171b setListValue(y99.C15579b builderForValue) {
            m23743e();
            ((c2i) this.f89756b).setListValue(builderForValue.build());
            return this;
        }

        public C2171b setStructValue(pag.C10875b builderForValue) {
            m23743e();
            ((c2i) this.f89756b).setStructValue(builderForValue.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: c2i$c */
    public enum EnumC2172c {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f15612a;

        EnumC2172c(int value) {
            this.f15612a = value;
        }

        public static EnumC2172c forNumber(int value) {
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
            return this.f15612a;
        }

        @Deprecated
        public static EnumC2172c valueOf(int value) {
            return forNumber(value);
        }
    }

    static {
        c2i c2iVar = new c2i();
        DEFAULT_INSTANCE = c2iVar;
        v27.m23715h0(c2i.class, c2iVar);
    }

    private c2i() {
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

    public static c2i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListValue(y99 value) {
        value.getClass();
        if (this.kindCase_ != 6 || this.kind_ == y99.getDefaultInstance()) {
            this.kind_ = value;
        } else {
            this.kind_ = y99.newBuilder((y99) this.kind_).mergeFrom(value).buildPartial();
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructValue(pag value) {
        value.getClass();
        if (this.kindCase_ != 5 || this.kind_ == pag.getDefaultInstance()) {
            this.kind_ = value;
        } else {
            this.kind_ = pag.newBuilder((pag) this.kind_).mergeFrom(value).buildPartial();
        }
        this.kindCase_ = 5;
    }

    public static C2171b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static c2i parseDelimitedFrom(InputStream input) throws IOException {
        return (c2i) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static c2i parseFrom(ByteBuffer data) throws ce8 {
        return (c2i) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<c2i> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean value) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListValue(y99 value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValue(bib value) {
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
    public void setStringValueBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.kind_ = value.toStringUtf8();
        this.kindCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructValue(pag value) {
        value.getClass();
        this.kind_ = value;
        this.kindCase_ = 5;
    }

    @Override // p000.p2i
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // p000.p2i
    public EnumC2172c getKindCase() {
        return EnumC2172c.forNumber(this.kindCase_);
    }

    @Override // p000.p2i
    public y99 getListValue() {
        return this.kindCase_ == 6 ? (y99) this.kind_ : y99.getDefaultInstance();
    }

    @Override // p000.p2i
    public bib getNullValue() {
        if (this.kindCase_ != 1) {
            return bib.NULL_VALUE;
        }
        bib bibVarForNumber = bib.forNumber(((Integer) this.kind_).intValue());
        return bibVarForNumber == null ? bib.UNRECOGNIZED : bibVarForNumber;
    }

    @Override // p000.p2i
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // p000.p2i
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // p000.p2i
    public String getStringValue() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    @Override // p000.p2i
    public vj1 getStringValueBytes() {
        return vj1.copyFromUtf8(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    @Override // p000.p2i
    public pag getStructValue() {
        return this.kindCase_ == 5 ? (pag) this.kind_ : pag.getDefaultInstance();
    }

    @Override // p000.p2i
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // p000.p2i
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // p000.p2i
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // p000.p2i
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // p000.p2i
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // p000.p2i
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C2170a c2170a = null;
        switch (C2170a.f15603a[method.ordinal()]) {
            case 1:
                return new c2i();
            case 2:
                return new C2171b(c2170a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", pag.class, y99.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<c2i> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (c2i.class) {
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

    public static C2171b newBuilder(c2i prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static c2i parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (c2i) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static c2i parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (c2i) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static c2i parseFrom(vj1 data) throws ce8 {
        return (c2i) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static c2i parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (c2i) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static c2i parseFrom(byte[] data) throws ce8 {
        return (c2i) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static c2i parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (c2i) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static c2i parseFrom(InputStream input) throws IOException {
        return (c2i) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static c2i parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (c2i) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static c2i parseFrom(f72 input) throws IOException {
        return (c2i) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static c2i parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (c2i) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
