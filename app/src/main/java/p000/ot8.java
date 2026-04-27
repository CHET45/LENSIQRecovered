package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class ot8 extends v27<ot8, C10651b> implements pt8 {
    private static final ot8 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile uhc<ot8> PARSER = null;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private int valueType_;
    private String key_ = "";
    private String description_ = "";

    /* JADX INFO: renamed from: ot8$a */
    public static /* synthetic */ class C10650a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68710a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f68710a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68710a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68710a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68710a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68710a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68710a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f68710a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: ot8$b */
    public static final class C10651b extends v27.AbstractC13823b<ot8, C10651b> implements pt8 {
        public /* synthetic */ C10651b(C10650a c10650a) {
            this();
        }

        public C10651b clearDescription() {
            m23743e();
            ((ot8) this.f89756b).clearDescription();
            return this;
        }

        public C10651b clearKey() {
            m23743e();
            ((ot8) this.f89756b).clearKey();
            return this;
        }

        public C10651b clearValueType() {
            m23743e();
            ((ot8) this.f89756b).clearValueType();
            return this;
        }

        @Override // p000.pt8
        public String getDescription() {
            return ((ot8) this.f89756b).getDescription();
        }

        @Override // p000.pt8
        public vj1 getDescriptionBytes() {
            return ((ot8) this.f89756b).getDescriptionBytes();
        }

        @Override // p000.pt8
        public String getKey() {
            return ((ot8) this.f89756b).getKey();
        }

        @Override // p000.pt8
        public vj1 getKeyBytes() {
            return ((ot8) this.f89756b).getKeyBytes();
        }

        @Override // p000.pt8
        public EnumC10652c getValueType() {
            return ((ot8) this.f89756b).getValueType();
        }

        @Override // p000.pt8
        public int getValueTypeValue() {
            return ((ot8) this.f89756b).getValueTypeValue();
        }

        public C10651b setDescription(String str) {
            m23743e();
            ((ot8) this.f89756b).setDescription(str);
            return this;
        }

        public C10651b setDescriptionBytes(vj1 vj1Var) {
            m23743e();
            ((ot8) this.f89756b).setDescriptionBytes(vj1Var);
            return this;
        }

        public C10651b setKey(String str) {
            m23743e();
            ((ot8) this.f89756b).setKey(str);
            return this;
        }

        public C10651b setKeyBytes(vj1 vj1Var) {
            m23743e();
            ((ot8) this.f89756b).setKeyBytes(vj1Var);
            return this;
        }

        public C10651b setValueType(EnumC10652c enumC10652c) {
            m23743e();
            ((ot8) this.f89756b).setValueType(enumC10652c);
            return this;
        }

        public C10651b setValueTypeValue(int i) {
            m23743e();
            ((ot8) this.f89756b).setValueTypeValue(i);
            return this;
        }

        private C10651b() {
            super(ot8.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: ot8$c */
    public enum EnumC10652c implements w98.InterfaceC14497d {
        STRING(0),
        BOOL(1),
        INT64(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: C */
        public static final int f68711C = 2;

        /* JADX INFO: renamed from: F */
        public static final w98.InterfaceC14498e<EnumC10652c> f68712F = new a();

        /* JADX INFO: renamed from: f */
        public static final int f68718f = 0;

        /* JADX INFO: renamed from: m */
        public static final int f68719m = 1;

        /* JADX INFO: renamed from: a */
        public final int f68720a;

        /* JADX INFO: renamed from: ot8$c$a */
        public class a implements w98.InterfaceC14498e<EnumC10652c> {
            @Override // p000.w98.InterfaceC14498e
            public EnumC10652c findValueByNumber(int i) {
                return EnumC10652c.forNumber(i);
            }
        }

        /* JADX INFO: renamed from: ot8$c$b */
        public static final class b implements w98.InterfaceC14499f {

            /* JADX INFO: renamed from: a */
            public static final w98.InterfaceC14499f f68721a = new b();

            private b() {
            }

            @Override // p000.w98.InterfaceC14499f
            public boolean isInRange(int i) {
                return EnumC10652c.forNumber(i) != null;
            }
        }

        EnumC10652c(int i) {
            this.f68720a = i;
        }

        public static EnumC10652c forNumber(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return BOOL;
            }
            if (i != 2) {
                return null;
            }
            return INT64;
        }

        public static w98.InterfaceC14498e<EnumC10652c> internalGetValueMap() {
            return f68712F;
        }

        public static w98.InterfaceC14499f internalGetVerifier() {
            return b.f68721a;
        }

        @Override // p000.w98.InterfaceC14497d
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f68720a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC10652c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        ot8 ot8Var = new ot8();
        DEFAULT_INSTANCE = ot8Var;
        v27.m23715h0(ot8.class, ot8Var);
    }

    private ot8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueType() {
        this.valueType_ = 0;
    }

    public static ot8 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C10651b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static ot8 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ot8) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static ot8 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (ot8) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<ot8> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.description_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        str.getClass();
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.key_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueType(EnumC10652c enumC10652c) {
        this.valueType_ = enumC10652c.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueTypeValue(int i) {
        this.valueType_ = i;
    }

    @Override // p000.pt8
    public String getDescription() {
        return this.description_;
    }

    @Override // p000.pt8
    public vj1 getDescriptionBytes() {
        return vj1.copyFromUtf8(this.description_);
    }

    @Override // p000.pt8
    public String getKey() {
        return this.key_;
    }

    @Override // p000.pt8
    public vj1 getKeyBytes() {
        return vj1.copyFromUtf8(this.key_);
    }

    @Override // p000.pt8
    public EnumC10652c getValueType() {
        EnumC10652c enumC10652cForNumber = EnumC10652c.forNumber(this.valueType_);
        return enumC10652cForNumber == null ? EnumC10652c.UNRECOGNIZED : enumC10652cForNumber;
    }

    @Override // p000.pt8
    public int getValueTypeValue() {
        return this.valueType_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C10650a c10650a = null;
        switch (C10650a.f68710a[enumC13830i.ordinal()]) {
            case 1:
                return new ot8();
            case 2:
                return new C10651b(c10650a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"key_", "valueType_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<ot8> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (ot8.class) {
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

    public static C10651b newBuilder(ot8 ot8Var) {
        return DEFAULT_INSTANCE.m23739o(ot8Var);
    }

    public static ot8 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ot8) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ot8 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (ot8) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static ot8 parseFrom(vj1 vj1Var) throws ce8 {
        return (ot8) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static ot8 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (ot8) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static ot8 parseFrom(byte[] bArr) throws ce8 {
        return (ot8) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static ot8 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (ot8) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static ot8 parseFrom(InputStream inputStream) throws IOException {
        return (ot8) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static ot8 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ot8) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ot8 parseFrom(f72 f72Var) throws IOException {
        return (ot8) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static ot8 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (ot8) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
