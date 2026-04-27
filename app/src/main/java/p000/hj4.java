package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class hj4 extends v27<hj4, C6871b> implements ij4 {
    private static final hj4 DEFAULT_INSTANCE;
    public static final int DEPRECATION_DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile uhc<hj4> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private String description_ = "";
    private String deprecationDescription_ = "";

    /* JADX INFO: renamed from: hj4$a */
    public static /* synthetic */ class C6870a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43802a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f43802a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43802a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43802a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43802a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43802a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43802a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43802a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: hj4$b */
    public static final class C6871b extends v27.AbstractC13823b<hj4, C6871b> implements ij4 {
        public /* synthetic */ C6871b(C6870a c6870a) {
            this();
        }

        public C6871b clearDeprecationDescription() {
            m23743e();
            ((hj4) this.f89756b).clearDeprecationDescription();
            return this;
        }

        public C6871b clearDescription() {
            m23743e();
            ((hj4) this.f89756b).clearDescription();
            return this;
        }

        public C6871b clearSelector() {
            m23743e();
            ((hj4) this.f89756b).clearSelector();
            return this;
        }

        @Override // p000.ij4
        public String getDeprecationDescription() {
            return ((hj4) this.f89756b).getDeprecationDescription();
        }

        @Override // p000.ij4
        public vj1 getDeprecationDescriptionBytes() {
            return ((hj4) this.f89756b).getDeprecationDescriptionBytes();
        }

        @Override // p000.ij4
        public String getDescription() {
            return ((hj4) this.f89756b).getDescription();
        }

        @Override // p000.ij4
        public vj1 getDescriptionBytes() {
            return ((hj4) this.f89756b).getDescriptionBytes();
        }

        @Override // p000.ij4
        public String getSelector() {
            return ((hj4) this.f89756b).getSelector();
        }

        @Override // p000.ij4
        public vj1 getSelectorBytes() {
            return ((hj4) this.f89756b).getSelectorBytes();
        }

        public C6871b setDeprecationDescription(String str) {
            m23743e();
            ((hj4) this.f89756b).setDeprecationDescription(str);
            return this;
        }

        public C6871b setDeprecationDescriptionBytes(vj1 vj1Var) {
            m23743e();
            ((hj4) this.f89756b).setDeprecationDescriptionBytes(vj1Var);
            return this;
        }

        public C6871b setDescription(String str) {
            m23743e();
            ((hj4) this.f89756b).setDescription(str);
            return this;
        }

        public C6871b setDescriptionBytes(vj1 vj1Var) {
            m23743e();
            ((hj4) this.f89756b).setDescriptionBytes(vj1Var);
            return this;
        }

        public C6871b setSelector(String str) {
            m23743e();
            ((hj4) this.f89756b).setSelector(str);
            return this;
        }

        public C6871b setSelectorBytes(vj1 vj1Var) {
            m23743e();
            ((hj4) this.f89756b).setSelectorBytes(vj1Var);
            return this;
        }

        private C6871b() {
            super(hj4.DEFAULT_INSTANCE);
        }
    }

    static {
        hj4 hj4Var = new hj4();
        DEFAULT_INSTANCE = hj4Var;
        v27.m23715h0(hj4.class, hj4Var);
    }

    private hj4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecationDescription() {
        this.deprecationDescription_ = getDefaultInstance().getDeprecationDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    public static hj4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6871b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static hj4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (hj4) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static hj4 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (hj4) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<hj4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecationDescription(String str) {
        str.getClass();
        this.deprecationDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecationDescriptionBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.deprecationDescription_ = vj1Var.toStringUtf8();
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
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.selector_ = vj1Var.toStringUtf8();
    }

    @Override // p000.ij4
    public String getDeprecationDescription() {
        return this.deprecationDescription_;
    }

    @Override // p000.ij4
    public vj1 getDeprecationDescriptionBytes() {
        return vj1.copyFromUtf8(this.deprecationDescription_);
    }

    @Override // p000.ij4
    public String getDescription() {
        return this.description_;
    }

    @Override // p000.ij4
    public vj1 getDescriptionBytes() {
        return vj1.copyFromUtf8(this.description_);
    }

    @Override // p000.ij4
    public String getSelector() {
        return this.selector_;
    }

    @Override // p000.ij4
    public vj1 getSelectorBytes() {
        return vj1.copyFromUtf8(this.selector_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C6870a c6870a = null;
        switch (C6870a.f43802a[enumC13830i.ordinal()]) {
            case 1:
                return new hj4();
            case 2:
                return new C6871b(c6870a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"selector_", "description_", "deprecationDescription_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<hj4> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (hj4.class) {
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

    public static C6871b newBuilder(hj4 hj4Var) {
        return DEFAULT_INSTANCE.m23739o(hj4Var);
    }

    public static hj4 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (hj4) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static hj4 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (hj4) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static hj4 parseFrom(vj1 vj1Var) throws ce8 {
        return (hj4) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static hj4 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (hj4) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static hj4 parseFrom(byte[] bArr) throws ce8 {
        return (hj4) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static hj4 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (hj4) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static hj4 parseFrom(InputStream inputStream) throws IOException {
        return (hj4) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static hj4 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (hj4) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static hj4 parseFrom(f72 f72Var) throws IOException {
        return (hj4) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static hj4 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (hj4) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
