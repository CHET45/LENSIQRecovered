package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class ci0 extends v27<ci0, C2319b> implements di0 {
    private static final ci0 DEFAULT_INSTANCE;
    private static volatile uhc<ci0> PARSER = null;
    public static final int PRINCIPAL_EMAIL_FIELD_NUMBER = 1;
    private String principalEmail_ = "";

    /* JADX INFO: renamed from: ci0$a */
    public static /* synthetic */ class C2318a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16603a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f16603a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16603a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16603a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16603a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16603a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16603a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16603a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: ci0$b */
    public static final class C2319b extends v27.AbstractC13823b<ci0, C2319b> implements di0 {
        public /* synthetic */ C2319b(C2318a c2318a) {
            this();
        }

        public C2319b clearPrincipalEmail() {
            m23743e();
            ((ci0) this.f89756b).clearPrincipalEmail();
            return this;
        }

        @Override // p000.di0
        public String getPrincipalEmail() {
            return ((ci0) this.f89756b).getPrincipalEmail();
        }

        @Override // p000.di0
        public vj1 getPrincipalEmailBytes() {
            return ((ci0) this.f89756b).getPrincipalEmailBytes();
        }

        public C2319b setPrincipalEmail(String str) {
            m23743e();
            ((ci0) this.f89756b).setPrincipalEmail(str);
            return this;
        }

        public C2319b setPrincipalEmailBytes(vj1 vj1Var) {
            m23743e();
            ((ci0) this.f89756b).setPrincipalEmailBytes(vj1Var);
            return this;
        }

        private C2319b() {
            super(ci0.DEFAULT_INSTANCE);
        }
    }

    static {
        ci0 ci0Var = new ci0();
        DEFAULT_INSTANCE = ci0Var;
        v27.m23715h0(ci0.class, ci0Var);
    }

    private ci0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrincipalEmail() {
        this.principalEmail_ = getDefaultInstance().getPrincipalEmail();
    }

    public static ci0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C2319b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static ci0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ci0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static ci0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (ci0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<ci0> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrincipalEmail(String str) {
        str.getClass();
        this.principalEmail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrincipalEmailBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.principalEmail_ = vj1Var.toStringUtf8();
    }

    @Override // p000.di0
    public String getPrincipalEmail() {
        return this.principalEmail_;
    }

    @Override // p000.di0
    public vj1 getPrincipalEmailBytes() {
        return vj1.copyFromUtf8(this.principalEmail_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C2318a c2318a = null;
        switch (C2318a.f16603a[enumC13830i.ordinal()]) {
            case 1:
                return new ci0();
            case 2:
                return new C2319b(c2318a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"principalEmail_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<ci0> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (ci0.class) {
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

    public static C2319b newBuilder(ci0 ci0Var) {
        return DEFAULT_INSTANCE.m23739o(ci0Var);
    }

    public static ci0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ci0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ci0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (ci0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static ci0 parseFrom(vj1 vj1Var) throws ce8 {
        return (ci0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static ci0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (ci0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static ci0 parseFrom(byte[] bArr) throws ce8 {
        return (ci0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static ci0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (ci0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static ci0 parseFrom(InputStream inputStream) throws IOException {
        return (ci0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static ci0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ci0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ci0 parseFrom(f72 f72Var) throws IOException {
        return (ci0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static ci0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (ci0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
