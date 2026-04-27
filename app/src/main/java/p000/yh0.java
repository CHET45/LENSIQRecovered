package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class yh0 extends v27<yh0, C15658b> implements zh0 {
    public static final int AUDIENCES_FIELD_NUMBER = 2;
    private static final yh0 DEFAULT_INSTANCE;
    private static volatile uhc<yh0> PARSER = null;
    public static final int PROVIDER_ID_FIELD_NUMBER = 1;
    private String providerId_ = "";
    private String audiences_ = "";

    /* JADX INFO: renamed from: yh0$a */
    public static /* synthetic */ class C15657a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101463a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f101463a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101463a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f101463a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f101463a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f101463a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f101463a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f101463a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: yh0$b */
    public static final class C15658b extends v27.AbstractC13823b<yh0, C15658b> implements zh0 {
        public /* synthetic */ C15658b(C15657a c15657a) {
            this();
        }

        public C15658b clearAudiences() {
            m23743e();
            ((yh0) this.f89756b).clearAudiences();
            return this;
        }

        public C15658b clearProviderId() {
            m23743e();
            ((yh0) this.f89756b).clearProviderId();
            return this;
        }

        @Override // p000.zh0
        public String getAudiences() {
            return ((yh0) this.f89756b).getAudiences();
        }

        @Override // p000.zh0
        public vj1 getAudiencesBytes() {
            return ((yh0) this.f89756b).getAudiencesBytes();
        }

        @Override // p000.zh0
        public String getProviderId() {
            return ((yh0) this.f89756b).getProviderId();
        }

        @Override // p000.zh0
        public vj1 getProviderIdBytes() {
            return ((yh0) this.f89756b).getProviderIdBytes();
        }

        public C15658b setAudiences(String str) {
            m23743e();
            ((yh0) this.f89756b).setAudiences(str);
            return this;
        }

        public C15658b setAudiencesBytes(vj1 vj1Var) {
            m23743e();
            ((yh0) this.f89756b).setAudiencesBytes(vj1Var);
            return this;
        }

        public C15658b setProviderId(String str) {
            m23743e();
            ((yh0) this.f89756b).setProviderId(str);
            return this;
        }

        public C15658b setProviderIdBytes(vj1 vj1Var) {
            m23743e();
            ((yh0) this.f89756b).setProviderIdBytes(vj1Var);
            return this;
        }

        private C15658b() {
            super(yh0.DEFAULT_INSTANCE);
        }
    }

    static {
        yh0 yh0Var = new yh0();
        DEFAULT_INSTANCE = yh0Var;
        v27.m23715h0(yh0.class, yh0Var);
    }

    private yh0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudiences() {
        this.audiences_ = getDefaultInstance().getAudiences();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviderId() {
        this.providerId_ = getDefaultInstance().getProviderId();
    }

    public static yh0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C15658b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static yh0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (yh0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static yh0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (yh0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<yh0> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudiences(String str) {
        str.getClass();
        this.audiences_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudiencesBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.audiences_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderId(String str) {
        str.getClass();
        this.providerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderIdBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.providerId_ = vj1Var.toStringUtf8();
    }

    @Override // p000.zh0
    public String getAudiences() {
        return this.audiences_;
    }

    @Override // p000.zh0
    public vj1 getAudiencesBytes() {
        return vj1.copyFromUtf8(this.audiences_);
    }

    @Override // p000.zh0
    public String getProviderId() {
        return this.providerId_;
    }

    @Override // p000.zh0
    public vj1 getProviderIdBytes() {
        return vj1.copyFromUtf8(this.providerId_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C15657a c15657a = null;
        switch (C15657a.f101463a[enumC13830i.ordinal()]) {
            case 1:
                return new yh0();
            case 2:
                return new C15658b(c15657a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"providerId_", "audiences_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<yh0> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (yh0.class) {
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

    public static C15658b newBuilder(yh0 yh0Var) {
        return DEFAULT_INSTANCE.m23739o(yh0Var);
    }

    public static yh0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (yh0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static yh0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (yh0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static yh0 parseFrom(vj1 vj1Var) throws ce8 {
        return (yh0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static yh0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (yh0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static yh0 parseFrom(byte[] bArr) throws ce8 {
        return (yh0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static yh0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (yh0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static yh0 parseFrom(InputStream inputStream) throws IOException {
        return (yh0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static yh0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (yh0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static yh0 parseFrom(f72 f72Var) throws IOException {
        return (yh0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static yh0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (yh0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
