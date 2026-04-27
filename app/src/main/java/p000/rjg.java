package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class rjg extends v27<rjg, C12121b> implements sjg {
    private static final rjg DEFAULT_INSTANCE;
    public static final int HTTP_HEADER_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<rjg> PARSER = null;
    public static final int URL_QUERY_PARAMETER_FIELD_NUMBER = 3;
    private String name_ = "";
    private String httpHeader_ = "";
    private String urlQueryParameter_ = "";

    /* JADX INFO: renamed from: rjg$a */
    public static /* synthetic */ class C12120a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78484a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f78484a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78484a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78484a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78484a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78484a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f78484a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f78484a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: rjg$b */
    public static final class C12121b extends v27.AbstractC13823b<rjg, C12121b> implements sjg {
        public /* synthetic */ C12121b(C12120a c12120a) {
            this();
        }

        public C12121b clearHttpHeader() {
            m23743e();
            ((rjg) this.f89756b).clearHttpHeader();
            return this;
        }

        public C12121b clearName() {
            m23743e();
            ((rjg) this.f89756b).clearName();
            return this;
        }

        public C12121b clearUrlQueryParameter() {
            m23743e();
            ((rjg) this.f89756b).clearUrlQueryParameter();
            return this;
        }

        @Override // p000.sjg
        public String getHttpHeader() {
            return ((rjg) this.f89756b).getHttpHeader();
        }

        @Override // p000.sjg
        public vj1 getHttpHeaderBytes() {
            return ((rjg) this.f89756b).getHttpHeaderBytes();
        }

        @Override // p000.sjg
        public String getName() {
            return ((rjg) this.f89756b).getName();
        }

        @Override // p000.sjg
        public vj1 getNameBytes() {
            return ((rjg) this.f89756b).getNameBytes();
        }

        @Override // p000.sjg
        public String getUrlQueryParameter() {
            return ((rjg) this.f89756b).getUrlQueryParameter();
        }

        @Override // p000.sjg
        public vj1 getUrlQueryParameterBytes() {
            return ((rjg) this.f89756b).getUrlQueryParameterBytes();
        }

        public C12121b setHttpHeader(String str) {
            m23743e();
            ((rjg) this.f89756b).setHttpHeader(str);
            return this;
        }

        public C12121b setHttpHeaderBytes(vj1 vj1Var) {
            m23743e();
            ((rjg) this.f89756b).setHttpHeaderBytes(vj1Var);
            return this;
        }

        public C12121b setName(String str) {
            m23743e();
            ((rjg) this.f89756b).setName(str);
            return this;
        }

        public C12121b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((rjg) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C12121b setUrlQueryParameter(String str) {
            m23743e();
            ((rjg) this.f89756b).setUrlQueryParameter(str);
            return this;
        }

        public C12121b setUrlQueryParameterBytes(vj1 vj1Var) {
            m23743e();
            ((rjg) this.f89756b).setUrlQueryParameterBytes(vj1Var);
            return this;
        }

        private C12121b() {
            super(rjg.DEFAULT_INSTANCE);
        }
    }

    static {
        rjg rjgVar = new rjg();
        DEFAULT_INSTANCE = rjgVar;
        v27.m23715h0(rjg.class, rjgVar);
    }

    private rjg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpHeader() {
        this.httpHeader_ = getDefaultInstance().getHttpHeader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrlQueryParameter() {
        this.urlQueryParameter_ = getDefaultInstance().getUrlQueryParameter();
    }

    public static rjg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12121b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static rjg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (rjg) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static rjg parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (rjg) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<rjg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpHeader(String str) {
        str.getClass();
        this.httpHeader_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpHeaderBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.httpHeader_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.name_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlQueryParameter(String str) {
        str.getClass();
        this.urlQueryParameter_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlQueryParameterBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.urlQueryParameter_ = vj1Var.toStringUtf8();
    }

    @Override // p000.sjg
    public String getHttpHeader() {
        return this.httpHeader_;
    }

    @Override // p000.sjg
    public vj1 getHttpHeaderBytes() {
        return vj1.copyFromUtf8(this.httpHeader_);
    }

    @Override // p000.sjg
    public String getName() {
        return this.name_;
    }

    @Override // p000.sjg
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.sjg
    public String getUrlQueryParameter() {
        return this.urlQueryParameter_;
    }

    @Override // p000.sjg
    public vj1 getUrlQueryParameterBytes() {
        return vj1.copyFromUtf8(this.urlQueryParameter_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C12120a c12120a = null;
        switch (C12120a.f78484a[enumC13830i.ordinal()]) {
            case 1:
                return new rjg();
            case 2:
                return new C12121b(c12120a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "httpHeader_", "urlQueryParameter_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<rjg> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (rjg.class) {
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

    public static C12121b newBuilder(rjg rjgVar) {
        return DEFAULT_INSTANCE.m23739o(rjgVar);
    }

    public static rjg parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (rjg) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static rjg parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (rjg) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static rjg parseFrom(vj1 vj1Var) throws ce8 {
        return (rjg) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static rjg parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (rjg) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static rjg parseFrom(byte[] bArr) throws ce8 {
        return (rjg) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static rjg parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (rjg) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static rjg parseFrom(InputStream inputStream) throws IOException {
        return (rjg) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static rjg parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (rjg) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static rjg parseFrom(f72 f72Var) throws IOException {
        return (rjg) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static rjg parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (rjg) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
