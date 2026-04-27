package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.jo8;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class wh0 extends v27<wh0, C14600b> implements xh0 {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    private static final wh0 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile uhc<wh0> PARSER;
    private String id_ = "";
    private String issuer_ = "";
    private String jwksUri_ = "";
    private String audiences_ = "";
    private String authorizationUrl_ = "";
    private w98.InterfaceC14504k<jo8> jwtLocations_ = v27.m23722x();

    /* JADX INFO: renamed from: wh0$a */
    public static /* synthetic */ class C14599a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94244a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f94244a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94244a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94244a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94244a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94244a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94244a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f94244a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: wh0$b */
    public static final class C14600b extends v27.AbstractC13823b<wh0, C14600b> implements xh0 {
        public /* synthetic */ C14600b(C14599a c14599a) {
            this();
        }

        public C14600b addAllJwtLocations(Iterable<? extends jo8> iterable) {
            m23743e();
            ((wh0) this.f89756b).addAllJwtLocations(iterable);
            return this;
        }

        public C14600b addJwtLocations(jo8 jo8Var) {
            m23743e();
            ((wh0) this.f89756b).addJwtLocations(jo8Var);
            return this;
        }

        public C14600b clearAudiences() {
            m23743e();
            ((wh0) this.f89756b).clearAudiences();
            return this;
        }

        public C14600b clearAuthorizationUrl() {
            m23743e();
            ((wh0) this.f89756b).clearAuthorizationUrl();
            return this;
        }

        public C14600b clearId() {
            m23743e();
            ((wh0) this.f89756b).clearId();
            return this;
        }

        public C14600b clearIssuer() {
            m23743e();
            ((wh0) this.f89756b).clearIssuer();
            return this;
        }

        public C14600b clearJwksUri() {
            m23743e();
            ((wh0) this.f89756b).clearJwksUri();
            return this;
        }

        public C14600b clearJwtLocations() {
            m23743e();
            ((wh0) this.f89756b).clearJwtLocations();
            return this;
        }

        @Override // p000.xh0
        public String getAudiences() {
            return ((wh0) this.f89756b).getAudiences();
        }

        @Override // p000.xh0
        public vj1 getAudiencesBytes() {
            return ((wh0) this.f89756b).getAudiencesBytes();
        }

        @Override // p000.xh0
        public String getAuthorizationUrl() {
            return ((wh0) this.f89756b).getAuthorizationUrl();
        }

        @Override // p000.xh0
        public vj1 getAuthorizationUrlBytes() {
            return ((wh0) this.f89756b).getAuthorizationUrlBytes();
        }

        @Override // p000.xh0
        public String getId() {
            return ((wh0) this.f89756b).getId();
        }

        @Override // p000.xh0
        public vj1 getIdBytes() {
            return ((wh0) this.f89756b).getIdBytes();
        }

        @Override // p000.xh0
        public String getIssuer() {
            return ((wh0) this.f89756b).getIssuer();
        }

        @Override // p000.xh0
        public vj1 getIssuerBytes() {
            return ((wh0) this.f89756b).getIssuerBytes();
        }

        @Override // p000.xh0
        public String getJwksUri() {
            return ((wh0) this.f89756b).getJwksUri();
        }

        @Override // p000.xh0
        public vj1 getJwksUriBytes() {
            return ((wh0) this.f89756b).getJwksUriBytes();
        }

        @Override // p000.xh0
        public jo8 getJwtLocations(int i) {
            return ((wh0) this.f89756b).getJwtLocations(i);
        }

        @Override // p000.xh0
        public int getJwtLocationsCount() {
            return ((wh0) this.f89756b).getJwtLocationsCount();
        }

        @Override // p000.xh0
        public List<jo8> getJwtLocationsList() {
            return Collections.unmodifiableList(((wh0) this.f89756b).getJwtLocationsList());
        }

        public C14600b removeJwtLocations(int i) {
            m23743e();
            ((wh0) this.f89756b).removeJwtLocations(i);
            return this;
        }

        public C14600b setAudiences(String str) {
            m23743e();
            ((wh0) this.f89756b).setAudiences(str);
            return this;
        }

        public C14600b setAudiencesBytes(vj1 vj1Var) {
            m23743e();
            ((wh0) this.f89756b).setAudiencesBytes(vj1Var);
            return this;
        }

        public C14600b setAuthorizationUrl(String str) {
            m23743e();
            ((wh0) this.f89756b).setAuthorizationUrl(str);
            return this;
        }

        public C14600b setAuthorizationUrlBytes(vj1 vj1Var) {
            m23743e();
            ((wh0) this.f89756b).setAuthorizationUrlBytes(vj1Var);
            return this;
        }

        public C14600b setId(String str) {
            m23743e();
            ((wh0) this.f89756b).setId(str);
            return this;
        }

        public C14600b setIdBytes(vj1 vj1Var) {
            m23743e();
            ((wh0) this.f89756b).setIdBytes(vj1Var);
            return this;
        }

        public C14600b setIssuer(String str) {
            m23743e();
            ((wh0) this.f89756b).setIssuer(str);
            return this;
        }

        public C14600b setIssuerBytes(vj1 vj1Var) {
            m23743e();
            ((wh0) this.f89756b).setIssuerBytes(vj1Var);
            return this;
        }

        public C14600b setJwksUri(String str) {
            m23743e();
            ((wh0) this.f89756b).setJwksUri(str);
            return this;
        }

        public C14600b setJwksUriBytes(vj1 vj1Var) {
            m23743e();
            ((wh0) this.f89756b).setJwksUriBytes(vj1Var);
            return this;
        }

        public C14600b setJwtLocations(int i, jo8 jo8Var) {
            m23743e();
            ((wh0) this.f89756b).setJwtLocations(i, jo8Var);
            return this;
        }

        private C14600b() {
            super(wh0.DEFAULT_INSTANCE);
        }

        public C14600b addJwtLocations(int i, jo8 jo8Var) {
            m23743e();
            ((wh0) this.f89756b).addJwtLocations(i, jo8Var);
            return this;
        }

        public C14600b setJwtLocations(int i, jo8.C7992b c7992b) {
            m23743e();
            ((wh0) this.f89756b).setJwtLocations(i, c7992b.build());
            return this;
        }

        public C14600b addJwtLocations(jo8.C7992b c7992b) {
            m23743e();
            ((wh0) this.f89756b).addJwtLocations(c7992b.build());
            return this;
        }

        public C14600b addJwtLocations(int i, jo8.C7992b c7992b) {
            m23743e();
            ((wh0) this.f89756b).addJwtLocations(i, c7992b.build());
            return this;
        }
    }

    static {
        wh0 wh0Var = new wh0();
        DEFAULT_INSTANCE = wh0Var;
        v27.m23715h0(wh0.class, wh0Var);
    }

    private wh0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllJwtLocations(Iterable<? extends jo8> iterable) {
        ensureJwtLocationsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.jwtLocations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJwtLocations(jo8 jo8Var) {
        jo8Var.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(jo8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudiences() {
        this.audiences_ = getDefaultInstance().getAudiences();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthorizationUrl() {
        this.authorizationUrl_ = getDefaultInstance().getAuthorizationUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIssuer() {
        this.issuer_ = getDefaultInstance().getIssuer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJwksUri() {
        this.jwksUri_ = getDefaultInstance().getJwksUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJwtLocations() {
        this.jwtLocations_ = v27.m23722x();
    }

    private void ensureJwtLocationsIsMutable() {
        w98.InterfaceC14504k<jo8> interfaceC14504k = this.jwtLocations_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.jwtLocations_ = v27.m23698P(interfaceC14504k);
    }

    public static wh0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14600b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static wh0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (wh0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static wh0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (wh0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<wh0> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeJwtLocations(int i) {
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.remove(i);
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
    public void setAuthorizationUrl(String str) {
        str.getClass();
        this.authorizationUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthorizationUrlBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.authorizationUrl_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.id_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIssuer(String str) {
        str.getClass();
        this.issuer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIssuerBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.issuer_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwksUri(String str) {
        str.getClass();
        this.jwksUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwksUriBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.jwksUri_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwtLocations(int i, jo8 jo8Var) {
        jo8Var.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.set(i, jo8Var);
    }

    @Override // p000.xh0
    public String getAudiences() {
        return this.audiences_;
    }

    @Override // p000.xh0
    public vj1 getAudiencesBytes() {
        return vj1.copyFromUtf8(this.audiences_);
    }

    @Override // p000.xh0
    public String getAuthorizationUrl() {
        return this.authorizationUrl_;
    }

    @Override // p000.xh0
    public vj1 getAuthorizationUrlBytes() {
        return vj1.copyFromUtf8(this.authorizationUrl_);
    }

    @Override // p000.xh0
    public String getId() {
        return this.id_;
    }

    @Override // p000.xh0
    public vj1 getIdBytes() {
        return vj1.copyFromUtf8(this.id_);
    }

    @Override // p000.xh0
    public String getIssuer() {
        return this.issuer_;
    }

    @Override // p000.xh0
    public vj1 getIssuerBytes() {
        return vj1.copyFromUtf8(this.issuer_);
    }

    @Override // p000.xh0
    public String getJwksUri() {
        return this.jwksUri_;
    }

    @Override // p000.xh0
    public vj1 getJwksUriBytes() {
        return vj1.copyFromUtf8(this.jwksUri_);
    }

    @Override // p000.xh0
    public jo8 getJwtLocations(int i) {
        return this.jwtLocations_.get(i);
    }

    @Override // p000.xh0
    public int getJwtLocationsCount() {
        return this.jwtLocations_.size();
    }

    @Override // p000.xh0
    public List<jo8> getJwtLocationsList() {
        return this.jwtLocations_;
    }

    public ko8 getJwtLocationsOrBuilder(int i) {
        return this.jwtLocations_.get(i);
    }

    public List<? extends ko8> getJwtLocationsOrBuilderList() {
        return this.jwtLocations_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C14599a c14599a = null;
        switch (C14599a.f94244a[enumC13830i.ordinal()]) {
            case 1:
                return new wh0();
            case 2:
                return new C14600b(c14599a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"id_", "issuer_", "jwksUri_", "audiences_", "authorizationUrl_", "jwtLocations_", jo8.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<wh0> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (wh0.class) {
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

    public static C14600b newBuilder(wh0 wh0Var) {
        return DEFAULT_INSTANCE.m23739o(wh0Var);
    }

    public static wh0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (wh0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static wh0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (wh0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static wh0 parseFrom(vj1 vj1Var) throws ce8 {
        return (wh0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJwtLocations(int i, jo8 jo8Var) {
        jo8Var.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(i, jo8Var);
    }

    public static wh0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (wh0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static wh0 parseFrom(byte[] bArr) throws ce8 {
        return (wh0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static wh0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (wh0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static wh0 parseFrom(InputStream inputStream) throws IOException {
        return (wh0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static wh0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (wh0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static wh0 parseFrom(f72 f72Var) throws IOException {
        return (wh0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static wh0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (wh0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
