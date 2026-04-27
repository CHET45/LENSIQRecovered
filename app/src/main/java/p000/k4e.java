package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class k4e extends v27<k4e, C8195b> implements l4e {
    public static final int CALLER_IP_FIELD_NUMBER = 1;
    public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
    private static final k4e DEFAULT_INSTANCE;
    private static volatile uhc<k4e> PARSER;
    private String callerIp_ = "";
    private String callerSuppliedUserAgent_ = "";

    /* JADX INFO: renamed from: k4e$a */
    public static /* synthetic */ class C8194a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52580a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f52580a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52580a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52580a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52580a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52580a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52580a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52580a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: k4e$b */
    public static final class C8195b extends v27.AbstractC13823b<k4e, C8195b> implements l4e {
        public /* synthetic */ C8195b(C8194a c8194a) {
            this();
        }

        public C8195b clearCallerIp() {
            m23743e();
            ((k4e) this.f89756b).clearCallerIp();
            return this;
        }

        public C8195b clearCallerSuppliedUserAgent() {
            m23743e();
            ((k4e) this.f89756b).clearCallerSuppliedUserAgent();
            return this;
        }

        @Override // p000.l4e
        public String getCallerIp() {
            return ((k4e) this.f89756b).getCallerIp();
        }

        @Override // p000.l4e
        public vj1 getCallerIpBytes() {
            return ((k4e) this.f89756b).getCallerIpBytes();
        }

        @Override // p000.l4e
        public String getCallerSuppliedUserAgent() {
            return ((k4e) this.f89756b).getCallerSuppliedUserAgent();
        }

        @Override // p000.l4e
        public vj1 getCallerSuppliedUserAgentBytes() {
            return ((k4e) this.f89756b).getCallerSuppliedUserAgentBytes();
        }

        public C8195b setCallerIp(String str) {
            m23743e();
            ((k4e) this.f89756b).setCallerIp(str);
            return this;
        }

        public C8195b setCallerIpBytes(vj1 vj1Var) {
            m23743e();
            ((k4e) this.f89756b).setCallerIpBytes(vj1Var);
            return this;
        }

        public C8195b setCallerSuppliedUserAgent(String str) {
            m23743e();
            ((k4e) this.f89756b).setCallerSuppliedUserAgent(str);
            return this;
        }

        public C8195b setCallerSuppliedUserAgentBytes(vj1 vj1Var) {
            m23743e();
            ((k4e) this.f89756b).setCallerSuppliedUserAgentBytes(vj1Var);
            return this;
        }

        private C8195b() {
            super(k4e.DEFAULT_INSTANCE);
        }
    }

    static {
        k4e k4eVar = new k4e();
        DEFAULT_INSTANCE = k4eVar;
        v27.m23715h0(k4e.class, k4eVar);
    }

    private k4e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallerIp() {
        this.callerIp_ = getDefaultInstance().getCallerIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallerSuppliedUserAgent() {
        this.callerSuppliedUserAgent_ = getDefaultInstance().getCallerSuppliedUserAgent();
    }

    public static k4e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8195b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static k4e parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (k4e) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static k4e parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (k4e) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<k4e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallerIp(String str) {
        str.getClass();
        this.callerIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallerIpBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.callerIp_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallerSuppliedUserAgent(String str) {
        str.getClass();
        this.callerSuppliedUserAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallerSuppliedUserAgentBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.callerSuppliedUserAgent_ = vj1Var.toStringUtf8();
    }

    @Override // p000.l4e
    public String getCallerIp() {
        return this.callerIp_;
    }

    @Override // p000.l4e
    public vj1 getCallerIpBytes() {
        return vj1.copyFromUtf8(this.callerIp_);
    }

    @Override // p000.l4e
    public String getCallerSuppliedUserAgent() {
        return this.callerSuppliedUserAgent_;
    }

    @Override // p000.l4e
    public vj1 getCallerSuppliedUserAgentBytes() {
        return vj1.copyFromUtf8(this.callerSuppliedUserAgent_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8194a c8194a = null;
        switch (C8194a.f52580a[enumC13830i.ordinal()]) {
            case 1:
                return new k4e();
            case 2:
                return new C8195b(c8194a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"callerIp_", "callerSuppliedUserAgent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<k4e> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (k4e.class) {
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

    public static C8195b newBuilder(k4e k4eVar) {
        return DEFAULT_INSTANCE.m23739o(k4eVar);
    }

    public static k4e parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (k4e) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static k4e parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (k4e) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static k4e parseFrom(vj1 vj1Var) throws ce8 {
        return (k4e) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static k4e parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (k4e) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static k4e parseFrom(byte[] bArr) throws ce8 {
        return (k4e) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static k4e parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (k4e) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static k4e parseFrom(InputStream inputStream) throws IOException {
        return (k4e) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static k4e parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (k4e) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static k4e parseFrom(f72 f72Var) throws IOException {
        return (k4e) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static k4e parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (k4e) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
