package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class kjb extends v27<kjb, C8398b> implements ljb {
    public static final int CANONICAL_SCOPES_FIELD_NUMBER = 1;
    private static final kjb DEFAULT_INSTANCE;
    private static volatile uhc<kjb> PARSER;
    private String canonicalScopes_ = "";

    /* JADX INFO: renamed from: kjb$a */
    public static /* synthetic */ class C8397a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54297a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f54297a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54297a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54297a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54297a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54297a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54297a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54297a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: kjb$b */
    public static final class C8398b extends v27.AbstractC13823b<kjb, C8398b> implements ljb {
        public /* synthetic */ C8398b(C8397a c8397a) {
            this();
        }

        public C8398b clearCanonicalScopes() {
            m23743e();
            ((kjb) this.f89756b).clearCanonicalScopes();
            return this;
        }

        @Override // p000.ljb
        public String getCanonicalScopes() {
            return ((kjb) this.f89756b).getCanonicalScopes();
        }

        @Override // p000.ljb
        public vj1 getCanonicalScopesBytes() {
            return ((kjb) this.f89756b).getCanonicalScopesBytes();
        }

        public C8398b setCanonicalScopes(String str) {
            m23743e();
            ((kjb) this.f89756b).setCanonicalScopes(str);
            return this;
        }

        public C8398b setCanonicalScopesBytes(vj1 vj1Var) {
            m23743e();
            ((kjb) this.f89756b).setCanonicalScopesBytes(vj1Var);
            return this;
        }

        private C8398b() {
            super(kjb.DEFAULT_INSTANCE);
        }
    }

    static {
        kjb kjbVar = new kjb();
        DEFAULT_INSTANCE = kjbVar;
        v27.m23715h0(kjb.class, kjbVar);
    }

    private kjb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanonicalScopes() {
        this.canonicalScopes_ = getDefaultInstance().getCanonicalScopes();
    }

    public static kjb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8398b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static kjb parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (kjb) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static kjb parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (kjb) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<kjb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanonicalScopes(String str) {
        str.getClass();
        this.canonicalScopes_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanonicalScopesBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.canonicalScopes_ = vj1Var.toStringUtf8();
    }

    @Override // p000.ljb
    public String getCanonicalScopes() {
        return this.canonicalScopes_;
    }

    @Override // p000.ljb
    public vj1 getCanonicalScopesBytes() {
        return vj1.copyFromUtf8(this.canonicalScopes_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8397a c8397a = null;
        switch (C8397a.f54297a[enumC13830i.ordinal()]) {
            case 1:
                return new kjb();
            case 2:
                return new C8398b(c8397a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"canonicalScopes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<kjb> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (kjb.class) {
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

    public static C8398b newBuilder(kjb kjbVar) {
        return DEFAULT_INSTANCE.m23739o(kjbVar);
    }

    public static kjb parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (kjb) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static kjb parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (kjb) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static kjb parseFrom(vj1 vj1Var) throws ce8 {
        return (kjb) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static kjb parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (kjb) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static kjb parseFrom(byte[] bArr) throws ce8 {
        return (kjb) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static kjb parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (kjb) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static kjb parseFrom(InputStream inputStream) throws IOException {
        return (kjb) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static kjb parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (kjb) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static kjb parseFrom(f72 f72Var) throws IOException {
        return (kjb) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static kjb parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (kjb) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
