package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000.f2h;
import p000.hpi;
import p000.pag;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class jc0 extends v27<jc0, C7860f> implements kc0 {
    public static final int API_FIELD_NUMBER = 6;
    private static final jc0 DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 7;
    private static volatile uhc<jc0> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 3;
    public static final int RESOURCE_FIELD_NUMBER = 5;
    public static final int RESPONSE_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private C7856b api_;
    private int bitField0_;
    private C7861g destination_;
    private C7861g origin_;
    private C7863i request_;
    private C7865k resource_;
    private C7867m response_;
    private C7861g source_;

    /* JADX INFO: renamed from: jc0$a */
    public static /* synthetic */ class C7855a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f50273a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f50273a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50273a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50273a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50273a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50273a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50273a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50273a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: jc0$b */
    public static final class C7856b extends v27<C7856b, a> implements InterfaceC7857c {
        private static final C7856b DEFAULT_INSTANCE;
        public static final int OPERATION_FIELD_NUMBER = 2;
        private static volatile uhc<C7856b> PARSER = null;
        public static final int PROTOCOL_FIELD_NUMBER = 3;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 4;
        private String service_ = "";
        private String operation_ = "";
        private String protocol_ = "";
        private String version_ = "";

        /* JADX INFO: renamed from: jc0$b$a */
        public static final class a extends v27.AbstractC13823b<C7856b, a> implements InterfaceC7857c {
            public /* synthetic */ a(C7855a c7855a) {
                this();
            }

            public a clearOperation() {
                m23743e();
                ((C7856b) this.f89756b).clearOperation();
                return this;
            }

            public a clearProtocol() {
                m23743e();
                ((C7856b) this.f89756b).clearProtocol();
                return this;
            }

            public a clearService() {
                m23743e();
                ((C7856b) this.f89756b).clearService();
                return this;
            }

            public a clearVersion() {
                m23743e();
                ((C7856b) this.f89756b).clearVersion();
                return this;
            }

            @Override // p000.jc0.InterfaceC7857c
            public String getOperation() {
                return ((C7856b) this.f89756b).getOperation();
            }

            @Override // p000.jc0.InterfaceC7857c
            public vj1 getOperationBytes() {
                return ((C7856b) this.f89756b).getOperationBytes();
            }

            @Override // p000.jc0.InterfaceC7857c
            public String getProtocol() {
                return ((C7856b) this.f89756b).getProtocol();
            }

            @Override // p000.jc0.InterfaceC7857c
            public vj1 getProtocolBytes() {
                return ((C7856b) this.f89756b).getProtocolBytes();
            }

            @Override // p000.jc0.InterfaceC7857c
            public String getService() {
                return ((C7856b) this.f89756b).getService();
            }

            @Override // p000.jc0.InterfaceC7857c
            public vj1 getServiceBytes() {
                return ((C7856b) this.f89756b).getServiceBytes();
            }

            @Override // p000.jc0.InterfaceC7857c
            public String getVersion() {
                return ((C7856b) this.f89756b).getVersion();
            }

            @Override // p000.jc0.InterfaceC7857c
            public vj1 getVersionBytes() {
                return ((C7856b) this.f89756b).getVersionBytes();
            }

            public a setOperation(String str) {
                m23743e();
                ((C7856b) this.f89756b).setOperation(str);
                return this;
            }

            public a setOperationBytes(vj1 vj1Var) {
                m23743e();
                ((C7856b) this.f89756b).setOperationBytes(vj1Var);
                return this;
            }

            public a setProtocol(String str) {
                m23743e();
                ((C7856b) this.f89756b).setProtocol(str);
                return this;
            }

            public a setProtocolBytes(vj1 vj1Var) {
                m23743e();
                ((C7856b) this.f89756b).setProtocolBytes(vj1Var);
                return this;
            }

            public a setService(String str) {
                m23743e();
                ((C7856b) this.f89756b).setService(str);
                return this;
            }

            public a setServiceBytes(vj1 vj1Var) {
                m23743e();
                ((C7856b) this.f89756b).setServiceBytes(vj1Var);
                return this;
            }

            public a setVersion(String str) {
                m23743e();
                ((C7856b) this.f89756b).setVersion(str);
                return this;
            }

            public a setVersionBytes(vj1 vj1Var) {
                m23743e();
                ((C7856b) this.f89756b).setVersionBytes(vj1Var);
                return this;
            }

            private a() {
                super(C7856b.DEFAULT_INSTANCE);
            }
        }

        static {
            C7856b c7856b = new C7856b();
            DEFAULT_INSTANCE = c7856b;
            v27.m23715h0(C7856b.class, c7856b);
        }

        private C7856b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperation() {
            this.operation_ = getDefaultInstance().getOperation();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProtocol() {
            this.protocol_ = getDefaultInstance().getProtocol();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearService() {
            this.service_ = getDefaultInstance().getService();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        public static C7856b getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C7856b parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C7856b) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C7856b parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C7856b) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C7856b> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperation(String str) {
            str.getClass();
            this.operation_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperationBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.operation_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProtocol(String str) {
            str.getClass();
            this.protocol_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProtocolBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.protocol_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setService(String str) {
            str.getClass();
            this.service_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.service_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.version_ = vj1Var.toStringUtf8();
        }

        @Override // p000.jc0.InterfaceC7857c
        public String getOperation() {
            return this.operation_;
        }

        @Override // p000.jc0.InterfaceC7857c
        public vj1 getOperationBytes() {
            return vj1.copyFromUtf8(this.operation_);
        }

        @Override // p000.jc0.InterfaceC7857c
        public String getProtocol() {
            return this.protocol_;
        }

        @Override // p000.jc0.InterfaceC7857c
        public vj1 getProtocolBytes() {
            return vj1.copyFromUtf8(this.protocol_);
        }

        @Override // p000.jc0.InterfaceC7857c
        public String getService() {
            return this.service_;
        }

        @Override // p000.jc0.InterfaceC7857c
        public vj1 getServiceBytes() {
            return vj1.copyFromUtf8(this.service_);
        }

        @Override // p000.jc0.InterfaceC7857c
        public String getVersion() {
            return this.version_;
        }

        @Override // p000.jc0.InterfaceC7857c
        public vj1 getVersionBytes() {
            return vj1.copyFromUtf8(this.version_);
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C7855a c7855a = null;
            switch (C7855a.f50273a[enumC13830i.ordinal()]) {
                case 1:
                    return new C7856b();
                case 2:
                    return new a(c7855a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"service_", "operation_", "protocol_", "version_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C7856b> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C7856b.class) {
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

        public static a newBuilder(C7856b c7856b) {
            return DEFAULT_INSTANCE.m23739o(c7856b);
        }

        public static C7856b parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7856b) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7856b parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C7856b) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C7856b parseFrom(vj1 vj1Var) throws ce8 {
            return (C7856b) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C7856b parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C7856b) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C7856b parseFrom(byte[] bArr) throws ce8 {
            return (C7856b) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C7856b parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C7856b) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C7856b parseFrom(InputStream inputStream) throws IOException {
            return (C7856b) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C7856b parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7856b) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7856b parseFrom(f72 f72Var) throws IOException {
            return (C7856b) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C7856b parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C7856b) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: jc0$c */
    public interface InterfaceC7857c extends rsa {
        String getOperation();

        vj1 getOperationBytes();

        String getProtocol();

        vj1 getProtocolBytes();

        String getService();

        vj1 getServiceBytes();

        String getVersion();

        vj1 getVersionBytes();
    }

    /* JADX INFO: renamed from: jc0$d */
    public static final class C7858d extends v27<C7858d, a> implements InterfaceC7859e {
        public static final int ACCESS_LEVELS_FIELD_NUMBER = 5;
        public static final int AUDIENCES_FIELD_NUMBER = 2;
        public static final int CLAIMS_FIELD_NUMBER = 4;
        private static final C7858d DEFAULT_INSTANCE;
        private static volatile uhc<C7858d> PARSER = null;
        public static final int PRESENTER_FIELD_NUMBER = 3;
        public static final int PRINCIPAL_FIELD_NUMBER = 1;
        private int bitField0_;
        private pag claims_;
        private String principal_ = "";
        private w98.InterfaceC14504k<String> audiences_ = v27.m23722x();
        private String presenter_ = "";
        private w98.InterfaceC14504k<String> accessLevels_ = v27.m23722x();

        /* JADX INFO: renamed from: jc0$d$a */
        public static final class a extends v27.AbstractC13823b<C7858d, a> implements InterfaceC7859e {
            public /* synthetic */ a(C7855a c7855a) {
                this();
            }

            public a addAccessLevels(String str) {
                m23743e();
                ((C7858d) this.f89756b).addAccessLevels(str);
                return this;
            }

            public a addAccessLevelsBytes(vj1 vj1Var) {
                m23743e();
                ((C7858d) this.f89756b).addAccessLevelsBytes(vj1Var);
                return this;
            }

            public a addAllAccessLevels(Iterable<String> iterable) {
                m23743e();
                ((C7858d) this.f89756b).addAllAccessLevels(iterable);
                return this;
            }

            public a addAllAudiences(Iterable<String> iterable) {
                m23743e();
                ((C7858d) this.f89756b).addAllAudiences(iterable);
                return this;
            }

            public a addAudiences(String str) {
                m23743e();
                ((C7858d) this.f89756b).addAudiences(str);
                return this;
            }

            public a addAudiencesBytes(vj1 vj1Var) {
                m23743e();
                ((C7858d) this.f89756b).addAudiencesBytes(vj1Var);
                return this;
            }

            public a clearAccessLevels() {
                m23743e();
                ((C7858d) this.f89756b).clearAccessLevels();
                return this;
            }

            public a clearAudiences() {
                m23743e();
                ((C7858d) this.f89756b).clearAudiences();
                return this;
            }

            public a clearClaims() {
                m23743e();
                ((C7858d) this.f89756b).clearClaims();
                return this;
            }

            public a clearPresenter() {
                m23743e();
                ((C7858d) this.f89756b).clearPresenter();
                return this;
            }

            public a clearPrincipal() {
                m23743e();
                ((C7858d) this.f89756b).clearPrincipal();
                return this;
            }

            @Override // p000.jc0.InterfaceC7859e
            public String getAccessLevels(int i) {
                return ((C7858d) this.f89756b).getAccessLevels(i);
            }

            @Override // p000.jc0.InterfaceC7859e
            public vj1 getAccessLevelsBytes(int i) {
                return ((C7858d) this.f89756b).getAccessLevelsBytes(i);
            }

            @Override // p000.jc0.InterfaceC7859e
            public int getAccessLevelsCount() {
                return ((C7858d) this.f89756b).getAccessLevelsCount();
            }

            @Override // p000.jc0.InterfaceC7859e
            public List<String> getAccessLevelsList() {
                return Collections.unmodifiableList(((C7858d) this.f89756b).getAccessLevelsList());
            }

            @Override // p000.jc0.InterfaceC7859e
            public String getAudiences(int i) {
                return ((C7858d) this.f89756b).getAudiences(i);
            }

            @Override // p000.jc0.InterfaceC7859e
            public vj1 getAudiencesBytes(int i) {
                return ((C7858d) this.f89756b).getAudiencesBytes(i);
            }

            @Override // p000.jc0.InterfaceC7859e
            public int getAudiencesCount() {
                return ((C7858d) this.f89756b).getAudiencesCount();
            }

            @Override // p000.jc0.InterfaceC7859e
            public List<String> getAudiencesList() {
                return Collections.unmodifiableList(((C7858d) this.f89756b).getAudiencesList());
            }

            @Override // p000.jc0.InterfaceC7859e
            public pag getClaims() {
                return ((C7858d) this.f89756b).getClaims();
            }

            @Override // p000.jc0.InterfaceC7859e
            public String getPresenter() {
                return ((C7858d) this.f89756b).getPresenter();
            }

            @Override // p000.jc0.InterfaceC7859e
            public vj1 getPresenterBytes() {
                return ((C7858d) this.f89756b).getPresenterBytes();
            }

            @Override // p000.jc0.InterfaceC7859e
            public String getPrincipal() {
                return ((C7858d) this.f89756b).getPrincipal();
            }

            @Override // p000.jc0.InterfaceC7859e
            public vj1 getPrincipalBytes() {
                return ((C7858d) this.f89756b).getPrincipalBytes();
            }

            @Override // p000.jc0.InterfaceC7859e
            public boolean hasClaims() {
                return ((C7858d) this.f89756b).hasClaims();
            }

            public a mergeClaims(pag pagVar) {
                m23743e();
                ((C7858d) this.f89756b).mergeClaims(pagVar);
                return this;
            }

            public a setAccessLevels(int i, String str) {
                m23743e();
                ((C7858d) this.f89756b).setAccessLevels(i, str);
                return this;
            }

            public a setAudiences(int i, String str) {
                m23743e();
                ((C7858d) this.f89756b).setAudiences(i, str);
                return this;
            }

            public a setClaims(pag pagVar) {
                m23743e();
                ((C7858d) this.f89756b).setClaims(pagVar);
                return this;
            }

            public a setPresenter(String str) {
                m23743e();
                ((C7858d) this.f89756b).setPresenter(str);
                return this;
            }

            public a setPresenterBytes(vj1 vj1Var) {
                m23743e();
                ((C7858d) this.f89756b).setPresenterBytes(vj1Var);
                return this;
            }

            public a setPrincipal(String str) {
                m23743e();
                ((C7858d) this.f89756b).setPrincipal(str);
                return this;
            }

            public a setPrincipalBytes(vj1 vj1Var) {
                m23743e();
                ((C7858d) this.f89756b).setPrincipalBytes(vj1Var);
                return this;
            }

            private a() {
                super(C7858d.DEFAULT_INSTANCE);
            }

            public a setClaims(pag.C10875b c10875b) {
                m23743e();
                ((C7858d) this.f89756b).setClaims(c10875b.build());
                return this;
            }
        }

        static {
            C7858d c7858d = new C7858d();
            DEFAULT_INSTANCE = c7858d;
            v27.m23715h0(C7858d.class, c7858d);
        }

        private C7858d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAccessLevels(String str) {
            str.getClass();
            ensureAccessLevelsIsMutable();
            this.accessLevels_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAccessLevelsBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            ensureAccessLevelsIsMutable();
            this.accessLevels_.add(vj1Var.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAccessLevels(Iterable<String> iterable) {
            ensureAccessLevelsIsMutable();
            AbstractC1714b3.m2856b(iterable, this.accessLevels_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAudiences(Iterable<String> iterable) {
            ensureAudiencesIsMutable();
            AbstractC1714b3.m2856b(iterable, this.audiences_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAudiences(String str) {
            str.getClass();
            ensureAudiencesIsMutable();
            this.audiences_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAudiencesBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            ensureAudiencesIsMutable();
            this.audiences_.add(vj1Var.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccessLevels() {
            this.accessLevels_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudiences() {
            this.audiences_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClaims() {
            this.claims_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPresenter() {
            this.presenter_ = getDefaultInstance().getPresenter();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrincipal() {
            this.principal_ = getDefaultInstance().getPrincipal();
        }

        private void ensureAccessLevelsIsMutable() {
            w98.InterfaceC14504k<String> interfaceC14504k = this.accessLevels_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.accessLevels_ = v27.m23698P(interfaceC14504k);
        }

        private void ensureAudiencesIsMutable() {
            w98.InterfaceC14504k<String> interfaceC14504k = this.audiences_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.audiences_ = v27.m23698P(interfaceC14504k);
        }

        public static C7858d getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClaims(pag pagVar) {
            pagVar.getClass();
            pag pagVar2 = this.claims_;
            if (pagVar2 == null || pagVar2 == pag.getDefaultInstance()) {
                this.claims_ = pagVar;
            } else {
                this.claims_ = pag.newBuilder(this.claims_).mergeFrom(pagVar).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C7858d parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C7858d) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C7858d parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C7858d) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C7858d> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessLevels(int i, String str) {
            str.getClass();
            ensureAccessLevelsIsMutable();
            this.accessLevels_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudiences(int i, String str) {
            str.getClass();
            ensureAudiencesIsMutable();
            this.audiences_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClaims(pag pagVar) {
            pagVar.getClass();
            this.claims_ = pagVar;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPresenter(String str) {
            str.getClass();
            this.presenter_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPresenterBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.presenter_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrincipal(String str) {
            str.getClass();
            this.principal_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrincipalBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.principal_ = vj1Var.toStringUtf8();
        }

        @Override // p000.jc0.InterfaceC7859e
        public String getAccessLevels(int i) {
            return this.accessLevels_.get(i);
        }

        @Override // p000.jc0.InterfaceC7859e
        public vj1 getAccessLevelsBytes(int i) {
            return vj1.copyFromUtf8(this.accessLevels_.get(i));
        }

        @Override // p000.jc0.InterfaceC7859e
        public int getAccessLevelsCount() {
            return this.accessLevels_.size();
        }

        @Override // p000.jc0.InterfaceC7859e
        public List<String> getAccessLevelsList() {
            return this.accessLevels_;
        }

        @Override // p000.jc0.InterfaceC7859e
        public String getAudiences(int i) {
            return this.audiences_.get(i);
        }

        @Override // p000.jc0.InterfaceC7859e
        public vj1 getAudiencesBytes(int i) {
            return vj1.copyFromUtf8(this.audiences_.get(i));
        }

        @Override // p000.jc0.InterfaceC7859e
        public int getAudiencesCount() {
            return this.audiences_.size();
        }

        @Override // p000.jc0.InterfaceC7859e
        public List<String> getAudiencesList() {
            return this.audiences_;
        }

        @Override // p000.jc0.InterfaceC7859e
        public pag getClaims() {
            pag pagVar = this.claims_;
            return pagVar == null ? pag.getDefaultInstance() : pagVar;
        }

        @Override // p000.jc0.InterfaceC7859e
        public String getPresenter() {
            return this.presenter_;
        }

        @Override // p000.jc0.InterfaceC7859e
        public vj1 getPresenterBytes() {
            return vj1.copyFromUtf8(this.presenter_);
        }

        @Override // p000.jc0.InterfaceC7859e
        public String getPrincipal() {
            return this.principal_;
        }

        @Override // p000.jc0.InterfaceC7859e
        public vj1 getPrincipalBytes() {
            return vj1.copyFromUtf8(this.principal_);
        }

        @Override // p000.jc0.InterfaceC7859e
        public boolean hasClaims() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C7855a c7855a = null;
            switch (C7855a.f50273a[enumC13830i.ordinal()]) {
                case 1:
                    return new C7858d();
                case 2:
                    return new a(c7855a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004ဉ\u0000\u0005Ț", new Object[]{"bitField0_", "principal_", "audiences_", "presenter_", "claims_", "accessLevels_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C7858d> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C7858d.class) {
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

        public static a newBuilder(C7858d c7858d) {
            return DEFAULT_INSTANCE.m23739o(c7858d);
        }

        public static C7858d parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7858d) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7858d parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C7858d) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C7858d parseFrom(vj1 vj1Var) throws ce8 {
            return (C7858d) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C7858d parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C7858d) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C7858d parseFrom(byte[] bArr) throws ce8 {
            return (C7858d) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C7858d parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C7858d) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C7858d parseFrom(InputStream inputStream) throws IOException {
            return (C7858d) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C7858d parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7858d) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7858d parseFrom(f72 f72Var) throws IOException {
            return (C7858d) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C7858d parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C7858d) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: jc0$e */
    public interface InterfaceC7859e extends rsa {
        String getAccessLevels(int i);

        vj1 getAccessLevelsBytes(int i);

        int getAccessLevelsCount();

        List<String> getAccessLevelsList();

        String getAudiences(int i);

        vj1 getAudiencesBytes(int i);

        int getAudiencesCount();

        List<String> getAudiencesList();

        pag getClaims();

        String getPresenter();

        vj1 getPresenterBytes();

        String getPrincipal();

        vj1 getPrincipalBytes();

        boolean hasClaims();
    }

    /* JADX INFO: renamed from: jc0$f */
    public static final class C7860f extends v27.AbstractC13823b<jc0, C7860f> implements kc0 {
        public /* synthetic */ C7860f(C7855a c7855a) {
            this();
        }

        public C7860f clearApi() {
            m23743e();
            ((jc0) this.f89756b).clearApi();
            return this;
        }

        public C7860f clearDestination() {
            m23743e();
            ((jc0) this.f89756b).clearDestination();
            return this;
        }

        public C7860f clearOrigin() {
            m23743e();
            ((jc0) this.f89756b).clearOrigin();
            return this;
        }

        public C7860f clearRequest() {
            m23743e();
            ((jc0) this.f89756b).clearRequest();
            return this;
        }

        public C7860f clearResource() {
            m23743e();
            ((jc0) this.f89756b).clearResource();
            return this;
        }

        public C7860f clearResponse() {
            m23743e();
            ((jc0) this.f89756b).clearResponse();
            return this;
        }

        public C7860f clearSource() {
            m23743e();
            ((jc0) this.f89756b).clearSource();
            return this;
        }

        @Override // p000.kc0
        public C7856b getApi() {
            return ((jc0) this.f89756b).getApi();
        }

        @Override // p000.kc0
        public C7861g getDestination() {
            return ((jc0) this.f89756b).getDestination();
        }

        @Override // p000.kc0
        public C7861g getOrigin() {
            return ((jc0) this.f89756b).getOrigin();
        }

        @Override // p000.kc0
        public C7863i getRequest() {
            return ((jc0) this.f89756b).getRequest();
        }

        @Override // p000.kc0
        public C7865k getResource() {
            return ((jc0) this.f89756b).getResource();
        }

        @Override // p000.kc0
        public C7867m getResponse() {
            return ((jc0) this.f89756b).getResponse();
        }

        @Override // p000.kc0
        public C7861g getSource() {
            return ((jc0) this.f89756b).getSource();
        }

        @Override // p000.kc0
        public boolean hasApi() {
            return ((jc0) this.f89756b).hasApi();
        }

        @Override // p000.kc0
        public boolean hasDestination() {
            return ((jc0) this.f89756b).hasDestination();
        }

        @Override // p000.kc0
        public boolean hasOrigin() {
            return ((jc0) this.f89756b).hasOrigin();
        }

        @Override // p000.kc0
        public boolean hasRequest() {
            return ((jc0) this.f89756b).hasRequest();
        }

        @Override // p000.kc0
        public boolean hasResource() {
            return ((jc0) this.f89756b).hasResource();
        }

        @Override // p000.kc0
        public boolean hasResponse() {
            return ((jc0) this.f89756b).hasResponse();
        }

        @Override // p000.kc0
        public boolean hasSource() {
            return ((jc0) this.f89756b).hasSource();
        }

        public C7860f mergeApi(C7856b c7856b) {
            m23743e();
            ((jc0) this.f89756b).mergeApi(c7856b);
            return this;
        }

        public C7860f mergeDestination(C7861g c7861g) {
            m23743e();
            ((jc0) this.f89756b).mergeDestination(c7861g);
            return this;
        }

        public C7860f mergeOrigin(C7861g c7861g) {
            m23743e();
            ((jc0) this.f89756b).mergeOrigin(c7861g);
            return this;
        }

        public C7860f mergeRequest(C7863i c7863i) {
            m23743e();
            ((jc0) this.f89756b).mergeRequest(c7863i);
            return this;
        }

        public C7860f mergeResource(C7865k c7865k) {
            m23743e();
            ((jc0) this.f89756b).mergeResource(c7865k);
            return this;
        }

        public C7860f mergeResponse(C7867m c7867m) {
            m23743e();
            ((jc0) this.f89756b).mergeResponse(c7867m);
            return this;
        }

        public C7860f mergeSource(C7861g c7861g) {
            m23743e();
            ((jc0) this.f89756b).mergeSource(c7861g);
            return this;
        }

        public C7860f setApi(C7856b c7856b) {
            m23743e();
            ((jc0) this.f89756b).setApi(c7856b);
            return this;
        }

        public C7860f setDestination(C7861g c7861g) {
            m23743e();
            ((jc0) this.f89756b).setDestination(c7861g);
            return this;
        }

        public C7860f setOrigin(C7861g c7861g) {
            m23743e();
            ((jc0) this.f89756b).setOrigin(c7861g);
            return this;
        }

        public C7860f setRequest(C7863i c7863i) {
            m23743e();
            ((jc0) this.f89756b).setRequest(c7863i);
            return this;
        }

        public C7860f setResource(C7865k c7865k) {
            m23743e();
            ((jc0) this.f89756b).setResource(c7865k);
            return this;
        }

        public C7860f setResponse(C7867m c7867m) {
            m23743e();
            ((jc0) this.f89756b).setResponse(c7867m);
            return this;
        }

        public C7860f setSource(C7861g c7861g) {
            m23743e();
            ((jc0) this.f89756b).setSource(c7861g);
            return this;
        }

        private C7860f() {
            super(jc0.DEFAULT_INSTANCE);
        }

        public C7860f setApi(C7856b.a aVar) {
            m23743e();
            ((jc0) this.f89756b).setApi(aVar.build());
            return this;
        }

        public C7860f setDestination(C7861g.a aVar) {
            m23743e();
            ((jc0) this.f89756b).setDestination(aVar.build());
            return this;
        }

        public C7860f setOrigin(C7861g.a aVar) {
            m23743e();
            ((jc0) this.f89756b).setOrigin(aVar.build());
            return this;
        }

        public C7860f setRequest(C7863i.a aVar) {
            m23743e();
            ((jc0) this.f89756b).setRequest(aVar.build());
            return this;
        }

        public C7860f setResource(C7865k.a aVar) {
            m23743e();
            ((jc0) this.f89756b).setResource(aVar.build());
            return this;
        }

        public C7860f setResponse(C7867m.a aVar) {
            m23743e();
            ((jc0) this.f89756b).setResponse(aVar.build());
            return this;
        }

        public C7860f setSource(C7861g.a aVar) {
            m23743e();
            ((jc0) this.f89756b).setSource(aVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: jc0$g */
    public static final class C7861g extends v27<C7861g, a> implements InterfaceC7862h {
        private static final C7861g DEFAULT_INSTANCE;
        public static final int IP_FIELD_NUMBER = 1;
        public static final int LABELS_FIELD_NUMBER = 6;
        private static volatile uhc<C7861g> PARSER = null;
        public static final int PORT_FIELD_NUMBER = 2;
        public static final int PRINCIPAL_FIELD_NUMBER = 7;
        public static final int REGION_CODE_FIELD_NUMBER = 8;
        private long port_;
        private ss9<String, String> labels_ = ss9.emptyMapField();
        private String ip_ = "";
        private String principal_ = "";
        private String regionCode_ = "";

        /* JADX INFO: renamed from: jc0$g$a */
        public static final class a extends v27.AbstractC13823b<C7861g, a> implements InterfaceC7862h {
            public /* synthetic */ a(C7855a c7855a) {
                this();
            }

            public a clearIp() {
                m23743e();
                ((C7861g) this.f89756b).clearIp();
                return this;
            }

            public a clearLabels() {
                m23743e();
                ((C7861g) this.f89756b).getMutableLabelsMap().clear();
                return this;
            }

            public a clearPort() {
                m23743e();
                ((C7861g) this.f89756b).clearPort();
                return this;
            }

            public a clearPrincipal() {
                m23743e();
                ((C7861g) this.f89756b).clearPrincipal();
                return this;
            }

            public a clearRegionCode() {
                m23743e();
                ((C7861g) this.f89756b).clearRegionCode();
                return this;
            }

            @Override // p000.jc0.InterfaceC7862h
            public boolean containsLabels(String str) {
                str.getClass();
                return ((C7861g) this.f89756b).getLabelsMap().containsKey(str);
            }

            @Override // p000.jc0.InterfaceC7862h
            public String getIp() {
                return ((C7861g) this.f89756b).getIp();
            }

            @Override // p000.jc0.InterfaceC7862h
            public vj1 getIpBytes() {
                return ((C7861g) this.f89756b).getIpBytes();
            }

            @Override // p000.jc0.InterfaceC7862h
            @Deprecated
            public Map<String, String> getLabels() {
                return getLabelsMap();
            }

            @Override // p000.jc0.InterfaceC7862h
            public int getLabelsCount() {
                return ((C7861g) this.f89756b).getLabelsMap().size();
            }

            @Override // p000.jc0.InterfaceC7862h
            public Map<String, String> getLabelsMap() {
                return Collections.unmodifiableMap(((C7861g) this.f89756b).getLabelsMap());
            }

            @Override // p000.jc0.InterfaceC7862h
            public String getLabelsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> labelsMap = ((C7861g) this.f89756b).getLabelsMap();
                return labelsMap.containsKey(str) ? labelsMap.get(str) : str2;
            }

            @Override // p000.jc0.InterfaceC7862h
            public String getLabelsOrThrow(String str) {
                str.getClass();
                Map<String, String> labelsMap = ((C7861g) this.f89756b).getLabelsMap();
                if (labelsMap.containsKey(str)) {
                    return labelsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // p000.jc0.InterfaceC7862h
            public long getPort() {
                return ((C7861g) this.f89756b).getPort();
            }

            @Override // p000.jc0.InterfaceC7862h
            public String getPrincipal() {
                return ((C7861g) this.f89756b).getPrincipal();
            }

            @Override // p000.jc0.InterfaceC7862h
            public vj1 getPrincipalBytes() {
                return ((C7861g) this.f89756b).getPrincipalBytes();
            }

            @Override // p000.jc0.InterfaceC7862h
            public String getRegionCode() {
                return ((C7861g) this.f89756b).getRegionCode();
            }

            @Override // p000.jc0.InterfaceC7862h
            public vj1 getRegionCodeBytes() {
                return ((C7861g) this.f89756b).getRegionCodeBytes();
            }

            public a putAllLabels(Map<String, String> map) {
                m23743e();
                ((C7861g) this.f89756b).getMutableLabelsMap().putAll(map);
                return this;
            }

            public a putLabels(String str, String str2) {
                str.getClass();
                str2.getClass();
                m23743e();
                ((C7861g) this.f89756b).getMutableLabelsMap().put(str, str2);
                return this;
            }

            public a removeLabels(String str) {
                str.getClass();
                m23743e();
                ((C7861g) this.f89756b).getMutableLabelsMap().remove(str);
                return this;
            }

            public a setIp(String str) {
                m23743e();
                ((C7861g) this.f89756b).setIp(str);
                return this;
            }

            public a setIpBytes(vj1 vj1Var) {
                m23743e();
                ((C7861g) this.f89756b).setIpBytes(vj1Var);
                return this;
            }

            public a setPort(long j) {
                m23743e();
                ((C7861g) this.f89756b).setPort(j);
                return this;
            }

            public a setPrincipal(String str) {
                m23743e();
                ((C7861g) this.f89756b).setPrincipal(str);
                return this;
            }

            public a setPrincipalBytes(vj1 vj1Var) {
                m23743e();
                ((C7861g) this.f89756b).setPrincipalBytes(vj1Var);
                return this;
            }

            public a setRegionCode(String str) {
                m23743e();
                ((C7861g) this.f89756b).setRegionCode(str);
                return this;
            }

            public a setRegionCodeBytes(vj1 vj1Var) {
                m23743e();
                ((C7861g) this.f89756b).setRegionCodeBytes(vj1Var);
                return this;
            }

            private a() {
                super(C7861g.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: jc0$g$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public static final os9<String, String> f50274a;

            static {
                hpi.EnumC6968b enumC6968b = hpi.EnumC6968b.f44485L;
                f50274a = os9.newDefaultInstance(enumC6968b, "", enumC6968b, "");
            }

            private b() {
            }
        }

        static {
            C7861g c7861g = new C7861g();
            DEFAULT_INSTANCE = c7861g;
            v27.m23715h0(C7861g.class, c7861g);
        }

        private C7861g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIp() {
            this.ip_ = getDefaultInstance().getIp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPort() {
            this.port_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrincipal() {
            this.principal_ = getDefaultInstance().getPrincipal();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRegionCode() {
            this.regionCode_ = getDefaultInstance().getRegionCode();
        }

        public static C7861g getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableLabelsMap() {
            return internalGetMutableLabels();
        }

        private ss9<String, String> internalGetLabels() {
            return this.labels_;
        }

        private ss9<String, String> internalGetMutableLabels() {
            if (!this.labels_.isMutable()) {
                this.labels_ = this.labels_.mutableCopy();
            }
            return this.labels_;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C7861g parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C7861g) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C7861g parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C7861g) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C7861g> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIp(String str) {
            str.getClass();
            this.ip_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.ip_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPort(long j) {
            this.port_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrincipal(String str) {
            str.getClass();
            this.principal_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrincipalBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.principal_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegionCode(String str) {
            str.getClass();
            this.regionCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegionCodeBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.regionCode_ = vj1Var.toStringUtf8();
        }

        @Override // p000.jc0.InterfaceC7862h
        public boolean containsLabels(String str) {
            str.getClass();
            return internalGetLabels().containsKey(str);
        }

        @Override // p000.jc0.InterfaceC7862h
        public String getIp() {
            return this.ip_;
        }

        @Override // p000.jc0.InterfaceC7862h
        public vj1 getIpBytes() {
            return vj1.copyFromUtf8(this.ip_);
        }

        @Override // p000.jc0.InterfaceC7862h
        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        @Override // p000.jc0.InterfaceC7862h
        public int getLabelsCount() {
            return internalGetLabels().size();
        }

        @Override // p000.jc0.InterfaceC7862h
        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(internalGetLabels());
        }

        @Override // p000.jc0.InterfaceC7862h
        public String getLabelsOrDefault(String str, String str2) {
            str.getClass();
            ss9<String, String> ss9VarInternalGetLabels = internalGetLabels();
            return ss9VarInternalGetLabels.containsKey(str) ? ss9VarInternalGetLabels.get(str) : str2;
        }

        @Override // p000.jc0.InterfaceC7862h
        public String getLabelsOrThrow(String str) {
            str.getClass();
            ss9<String, String> ss9VarInternalGetLabels = internalGetLabels();
            if (ss9VarInternalGetLabels.containsKey(str)) {
                return ss9VarInternalGetLabels.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // p000.jc0.InterfaceC7862h
        public long getPort() {
            return this.port_;
        }

        @Override // p000.jc0.InterfaceC7862h
        public String getPrincipal() {
            return this.principal_;
        }

        @Override // p000.jc0.InterfaceC7862h
        public vj1 getPrincipalBytes() {
            return vj1.copyFromUtf8(this.principal_);
        }

        @Override // p000.jc0.InterfaceC7862h
        public String getRegionCode() {
            return this.regionCode_;
        }

        @Override // p000.jc0.InterfaceC7862h
        public vj1 getRegionCodeBytes() {
            return vj1.copyFromUtf8(this.regionCode_);
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C7855a c7855a = null;
            switch (C7855a.f50273a[enumC13830i.ordinal()]) {
                case 1:
                    return new C7861g();
                case 2:
                    return new a(c7855a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\b\u0005\u0001\u0000\u0000\u0001Ȉ\u0002\u0002\u00062\u0007Ȉ\bȈ", new Object[]{"ip_", "port_", "labels_", b.f50274a, "principal_", "regionCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C7861g> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C7861g.class) {
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

        public static a newBuilder(C7861g c7861g) {
            return DEFAULT_INSTANCE.m23739o(c7861g);
        }

        public static C7861g parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7861g) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7861g parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C7861g) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C7861g parseFrom(vj1 vj1Var) throws ce8 {
            return (C7861g) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C7861g parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C7861g) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C7861g parseFrom(byte[] bArr) throws ce8 {
            return (C7861g) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C7861g parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C7861g) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C7861g parseFrom(InputStream inputStream) throws IOException {
            return (C7861g) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C7861g parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7861g) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7861g parseFrom(f72 f72Var) throws IOException {
            return (C7861g) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C7861g parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C7861g) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: jc0$h */
    public interface InterfaceC7862h extends rsa {
        boolean containsLabels(String str);

        String getIp();

        vj1 getIpBytes();

        @Deprecated
        Map<String, String> getLabels();

        int getLabelsCount();

        Map<String, String> getLabelsMap();

        String getLabelsOrDefault(String str, String str2);

        String getLabelsOrThrow(String str);

        long getPort();

        String getPrincipal();

        vj1 getPrincipalBytes();

        String getRegionCode();

        vj1 getRegionCodeBytes();
    }

    /* JADX INFO: renamed from: jc0$i */
    public static final class C7863i extends v27<C7863i, a> implements InterfaceC7864j {
        public static final int AUTH_FIELD_NUMBER = 13;
        private static final C7863i DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        public static final int HOST_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METHOD_FIELD_NUMBER = 2;
        private static volatile uhc<C7863i> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 4;
        public static final int PROTOCOL_FIELD_NUMBER = 11;
        public static final int QUERY_FIELD_NUMBER = 7;
        public static final int REASON_FIELD_NUMBER = 12;
        public static final int SCHEME_FIELD_NUMBER = 6;
        public static final int SIZE_FIELD_NUMBER = 10;
        public static final int TIME_FIELD_NUMBER = 9;
        private C7858d auth_;
        private int bitField0_;
        private long size_;
        private f2h time_;
        private ss9<String, String> headers_ = ss9.emptyMapField();
        private String id_ = "";
        private String method_ = "";
        private String path_ = "";
        private String host_ = "";
        private String scheme_ = "";
        private String query_ = "";
        private String protocol_ = "";
        private String reason_ = "";

        /* JADX INFO: renamed from: jc0$i$a */
        public static final class a extends v27.AbstractC13823b<C7863i, a> implements InterfaceC7864j {
            public /* synthetic */ a(C7855a c7855a) {
                this();
            }

            public a clearAuth() {
                m23743e();
                ((C7863i) this.f89756b).clearAuth();
                return this;
            }

            public a clearHeaders() {
                m23743e();
                ((C7863i) this.f89756b).getMutableHeadersMap().clear();
                return this;
            }

            public a clearHost() {
                m23743e();
                ((C7863i) this.f89756b).clearHost();
                return this;
            }

            public a clearId() {
                m23743e();
                ((C7863i) this.f89756b).clearId();
                return this;
            }

            public a clearMethod() {
                m23743e();
                ((C7863i) this.f89756b).clearMethod();
                return this;
            }

            public a clearPath() {
                m23743e();
                ((C7863i) this.f89756b).clearPath();
                return this;
            }

            public a clearProtocol() {
                m23743e();
                ((C7863i) this.f89756b).clearProtocol();
                return this;
            }

            public a clearQuery() {
                m23743e();
                ((C7863i) this.f89756b).clearQuery();
                return this;
            }

            public a clearReason() {
                m23743e();
                ((C7863i) this.f89756b).clearReason();
                return this;
            }

            public a clearScheme() {
                m23743e();
                ((C7863i) this.f89756b).clearScheme();
                return this;
            }

            public a clearSize() {
                m23743e();
                ((C7863i) this.f89756b).clearSize();
                return this;
            }

            public a clearTime() {
                m23743e();
                ((C7863i) this.f89756b).clearTime();
                return this;
            }

            @Override // p000.jc0.InterfaceC7864j
            public boolean containsHeaders(String str) {
                str.getClass();
                return ((C7863i) this.f89756b).getHeadersMap().containsKey(str);
            }

            @Override // p000.jc0.InterfaceC7864j
            public C7858d getAuth() {
                return ((C7863i) this.f89756b).getAuth();
            }

            @Override // p000.jc0.InterfaceC7864j
            @Deprecated
            public Map<String, String> getHeaders() {
                return getHeadersMap();
            }

            @Override // p000.jc0.InterfaceC7864j
            public int getHeadersCount() {
                return ((C7863i) this.f89756b).getHeadersMap().size();
            }

            @Override // p000.jc0.InterfaceC7864j
            public Map<String, String> getHeadersMap() {
                return Collections.unmodifiableMap(((C7863i) this.f89756b).getHeadersMap());
            }

            @Override // p000.jc0.InterfaceC7864j
            public String getHeadersOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> headersMap = ((C7863i) this.f89756b).getHeadersMap();
                return headersMap.containsKey(str) ? headersMap.get(str) : str2;
            }

            @Override // p000.jc0.InterfaceC7864j
            public String getHeadersOrThrow(String str) {
                str.getClass();
                Map<String, String> headersMap = ((C7863i) this.f89756b).getHeadersMap();
                if (headersMap.containsKey(str)) {
                    return headersMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // p000.jc0.InterfaceC7864j
            public String getHost() {
                return ((C7863i) this.f89756b).getHost();
            }

            @Override // p000.jc0.InterfaceC7864j
            public vj1 getHostBytes() {
                return ((C7863i) this.f89756b).getHostBytes();
            }

            @Override // p000.jc0.InterfaceC7864j
            public String getId() {
                return ((C7863i) this.f89756b).getId();
            }

            @Override // p000.jc0.InterfaceC7864j
            public vj1 getIdBytes() {
                return ((C7863i) this.f89756b).getIdBytes();
            }

            @Override // p000.jc0.InterfaceC7864j
            public String getMethod() {
                return ((C7863i) this.f89756b).getMethod();
            }

            @Override // p000.jc0.InterfaceC7864j
            public vj1 getMethodBytes() {
                return ((C7863i) this.f89756b).getMethodBytes();
            }

            @Override // p000.jc0.InterfaceC7864j
            public String getPath() {
                return ((C7863i) this.f89756b).getPath();
            }

            @Override // p000.jc0.InterfaceC7864j
            public vj1 getPathBytes() {
                return ((C7863i) this.f89756b).getPathBytes();
            }

            @Override // p000.jc0.InterfaceC7864j
            public String getProtocol() {
                return ((C7863i) this.f89756b).getProtocol();
            }

            @Override // p000.jc0.InterfaceC7864j
            public vj1 getProtocolBytes() {
                return ((C7863i) this.f89756b).getProtocolBytes();
            }

            @Override // p000.jc0.InterfaceC7864j
            public String getQuery() {
                return ((C7863i) this.f89756b).getQuery();
            }

            @Override // p000.jc0.InterfaceC7864j
            public vj1 getQueryBytes() {
                return ((C7863i) this.f89756b).getQueryBytes();
            }

            @Override // p000.jc0.InterfaceC7864j
            public String getReason() {
                return ((C7863i) this.f89756b).getReason();
            }

            @Override // p000.jc0.InterfaceC7864j
            public vj1 getReasonBytes() {
                return ((C7863i) this.f89756b).getReasonBytes();
            }

            @Override // p000.jc0.InterfaceC7864j
            public String getScheme() {
                return ((C7863i) this.f89756b).getScheme();
            }

            @Override // p000.jc0.InterfaceC7864j
            public vj1 getSchemeBytes() {
                return ((C7863i) this.f89756b).getSchemeBytes();
            }

            @Override // p000.jc0.InterfaceC7864j
            public long getSize() {
                return ((C7863i) this.f89756b).getSize();
            }

            @Override // p000.jc0.InterfaceC7864j
            public f2h getTime() {
                return ((C7863i) this.f89756b).getTime();
            }

            @Override // p000.jc0.InterfaceC7864j
            public boolean hasAuth() {
                return ((C7863i) this.f89756b).hasAuth();
            }

            @Override // p000.jc0.InterfaceC7864j
            public boolean hasTime() {
                return ((C7863i) this.f89756b).hasTime();
            }

            public a mergeAuth(C7858d c7858d) {
                m23743e();
                ((C7863i) this.f89756b).mergeAuth(c7858d);
                return this;
            }

            public a mergeTime(f2h f2hVar) {
                m23743e();
                ((C7863i) this.f89756b).mergeTime(f2hVar);
                return this;
            }

            public a putAllHeaders(Map<String, String> map) {
                m23743e();
                ((C7863i) this.f89756b).getMutableHeadersMap().putAll(map);
                return this;
            }

            public a putHeaders(String str, String str2) {
                str.getClass();
                str2.getClass();
                m23743e();
                ((C7863i) this.f89756b).getMutableHeadersMap().put(str, str2);
                return this;
            }

            public a removeHeaders(String str) {
                str.getClass();
                m23743e();
                ((C7863i) this.f89756b).getMutableHeadersMap().remove(str);
                return this;
            }

            public a setAuth(C7858d c7858d) {
                m23743e();
                ((C7863i) this.f89756b).setAuth(c7858d);
                return this;
            }

            public a setHost(String str) {
                m23743e();
                ((C7863i) this.f89756b).setHost(str);
                return this;
            }

            public a setHostBytes(vj1 vj1Var) {
                m23743e();
                ((C7863i) this.f89756b).setHostBytes(vj1Var);
                return this;
            }

            public a setId(String str) {
                m23743e();
                ((C7863i) this.f89756b).setId(str);
                return this;
            }

            public a setIdBytes(vj1 vj1Var) {
                m23743e();
                ((C7863i) this.f89756b).setIdBytes(vj1Var);
                return this;
            }

            public a setMethod(String str) {
                m23743e();
                ((C7863i) this.f89756b).setMethod(str);
                return this;
            }

            public a setMethodBytes(vj1 vj1Var) {
                m23743e();
                ((C7863i) this.f89756b).setMethodBytes(vj1Var);
                return this;
            }

            public a setPath(String str) {
                m23743e();
                ((C7863i) this.f89756b).setPath(str);
                return this;
            }

            public a setPathBytes(vj1 vj1Var) {
                m23743e();
                ((C7863i) this.f89756b).setPathBytes(vj1Var);
                return this;
            }

            public a setProtocol(String str) {
                m23743e();
                ((C7863i) this.f89756b).setProtocol(str);
                return this;
            }

            public a setProtocolBytes(vj1 vj1Var) {
                m23743e();
                ((C7863i) this.f89756b).setProtocolBytes(vj1Var);
                return this;
            }

            public a setQuery(String str) {
                m23743e();
                ((C7863i) this.f89756b).setQuery(str);
                return this;
            }

            public a setQueryBytes(vj1 vj1Var) {
                m23743e();
                ((C7863i) this.f89756b).setQueryBytes(vj1Var);
                return this;
            }

            public a setReason(String str) {
                m23743e();
                ((C7863i) this.f89756b).setReason(str);
                return this;
            }

            public a setReasonBytes(vj1 vj1Var) {
                m23743e();
                ((C7863i) this.f89756b).setReasonBytes(vj1Var);
                return this;
            }

            public a setScheme(String str) {
                m23743e();
                ((C7863i) this.f89756b).setScheme(str);
                return this;
            }

            public a setSchemeBytes(vj1 vj1Var) {
                m23743e();
                ((C7863i) this.f89756b).setSchemeBytes(vj1Var);
                return this;
            }

            public a setSize(long j) {
                m23743e();
                ((C7863i) this.f89756b).setSize(j);
                return this;
            }

            public a setTime(f2h f2hVar) {
                m23743e();
                ((C7863i) this.f89756b).setTime(f2hVar);
                return this;
            }

            private a() {
                super(C7863i.DEFAULT_INSTANCE);
            }

            public a setAuth(C7858d.a aVar) {
                m23743e();
                ((C7863i) this.f89756b).setAuth(aVar.build());
                return this;
            }

            public a setTime(f2h.C5567b c5567b) {
                m23743e();
                ((C7863i) this.f89756b).setTime(c5567b.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: jc0$i$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public static final os9<String, String> f50275a;

            static {
                hpi.EnumC6968b enumC6968b = hpi.EnumC6968b.f44485L;
                f50275a = os9.newDefaultInstance(enumC6968b, "", enumC6968b, "");
            }

            private b() {
            }
        }

        static {
            C7863i c7863i = new C7863i();
            DEFAULT_INSTANCE = c7863i;
            v27.m23715h0(C7863i.class, c7863i);
        }

        private C7863i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuth() {
            this.auth_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHost() {
            this.host_ = getDefaultInstance().getHost();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMethod() {
            this.method_ = getDefaultInstance().getMethod();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = getDefaultInstance().getPath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProtocol() {
            this.protocol_ = getDefaultInstance().getProtocol();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuery() {
            this.query_ = getDefaultInstance().getQuery();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReason() {
            this.reason_ = getDefaultInstance().getReason();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScheme() {
            this.scheme_ = getDefaultInstance().getScheme();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTime() {
            this.time_ = null;
            this.bitField0_ &= -2;
        }

        public static C7863i getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableHeadersMap() {
            return internalGetMutableHeaders();
        }

        private ss9<String, String> internalGetHeaders() {
            return this.headers_;
        }

        private ss9<String, String> internalGetMutableHeaders() {
            if (!this.headers_.isMutable()) {
                this.headers_ = this.headers_.mutableCopy();
            }
            return this.headers_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAuth(C7858d c7858d) {
            c7858d.getClass();
            C7858d c7858d2 = this.auth_;
            if (c7858d2 == null || c7858d2 == C7858d.getDefaultInstance()) {
                this.auth_ = c7858d;
            } else {
                this.auth_ = C7858d.newBuilder(this.auth_).mergeFrom(c7858d).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTime(f2h f2hVar) {
            f2hVar.getClass();
            f2h f2hVar2 = this.time_;
            if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
                this.time_ = f2hVar;
            } else {
                this.time_ = f2h.newBuilder(this.time_).mergeFrom(f2hVar).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C7863i parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C7863i) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C7863i parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C7863i) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C7863i> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuth(C7858d c7858d) {
            c7858d.getClass();
            this.auth_ = c7858d;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHost(String str) {
            str.getClass();
            this.host_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHostBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.host_ = vj1Var.toStringUtf8();
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
        public void setMethod(String str) {
            str.getClass();
            this.method_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMethodBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.method_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(String str) {
            str.getClass();
            this.path_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPathBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.path_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProtocol(String str) {
            str.getClass();
            this.protocol_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProtocolBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.protocol_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuery(String str) {
            str.getClass();
            this.query_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQueryBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.query_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(String str) {
            str.getClass();
            this.reason_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.reason_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScheme(String str) {
            str.getClass();
            this.scheme_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchemeBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.scheme_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(long j) {
            this.size_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTime(f2h f2hVar) {
            f2hVar.getClass();
            this.time_ = f2hVar;
            this.bitField0_ |= 1;
        }

        @Override // p000.jc0.InterfaceC7864j
        public boolean containsHeaders(String str) {
            str.getClass();
            return internalGetHeaders().containsKey(str);
        }

        @Override // p000.jc0.InterfaceC7864j
        public C7858d getAuth() {
            C7858d c7858d = this.auth_;
            return c7858d == null ? C7858d.getDefaultInstance() : c7858d;
        }

        @Override // p000.jc0.InterfaceC7864j
        @Deprecated
        public Map<String, String> getHeaders() {
            return getHeadersMap();
        }

        @Override // p000.jc0.InterfaceC7864j
        public int getHeadersCount() {
            return internalGetHeaders().size();
        }

        @Override // p000.jc0.InterfaceC7864j
        public Map<String, String> getHeadersMap() {
            return Collections.unmodifiableMap(internalGetHeaders());
        }

        @Override // p000.jc0.InterfaceC7864j
        public String getHeadersOrDefault(String str, String str2) {
            str.getClass();
            ss9<String, String> ss9VarInternalGetHeaders = internalGetHeaders();
            return ss9VarInternalGetHeaders.containsKey(str) ? ss9VarInternalGetHeaders.get(str) : str2;
        }

        @Override // p000.jc0.InterfaceC7864j
        public String getHeadersOrThrow(String str) {
            str.getClass();
            ss9<String, String> ss9VarInternalGetHeaders = internalGetHeaders();
            if (ss9VarInternalGetHeaders.containsKey(str)) {
                return ss9VarInternalGetHeaders.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // p000.jc0.InterfaceC7864j
        public String getHost() {
            return this.host_;
        }

        @Override // p000.jc0.InterfaceC7864j
        public vj1 getHostBytes() {
            return vj1.copyFromUtf8(this.host_);
        }

        @Override // p000.jc0.InterfaceC7864j
        public String getId() {
            return this.id_;
        }

        @Override // p000.jc0.InterfaceC7864j
        public vj1 getIdBytes() {
            return vj1.copyFromUtf8(this.id_);
        }

        @Override // p000.jc0.InterfaceC7864j
        public String getMethod() {
            return this.method_;
        }

        @Override // p000.jc0.InterfaceC7864j
        public vj1 getMethodBytes() {
            return vj1.copyFromUtf8(this.method_);
        }

        @Override // p000.jc0.InterfaceC7864j
        public String getPath() {
            return this.path_;
        }

        @Override // p000.jc0.InterfaceC7864j
        public vj1 getPathBytes() {
            return vj1.copyFromUtf8(this.path_);
        }

        @Override // p000.jc0.InterfaceC7864j
        public String getProtocol() {
            return this.protocol_;
        }

        @Override // p000.jc0.InterfaceC7864j
        public vj1 getProtocolBytes() {
            return vj1.copyFromUtf8(this.protocol_);
        }

        @Override // p000.jc0.InterfaceC7864j
        public String getQuery() {
            return this.query_;
        }

        @Override // p000.jc0.InterfaceC7864j
        public vj1 getQueryBytes() {
            return vj1.copyFromUtf8(this.query_);
        }

        @Override // p000.jc0.InterfaceC7864j
        public String getReason() {
            return this.reason_;
        }

        @Override // p000.jc0.InterfaceC7864j
        public vj1 getReasonBytes() {
            return vj1.copyFromUtf8(this.reason_);
        }

        @Override // p000.jc0.InterfaceC7864j
        public String getScheme() {
            return this.scheme_;
        }

        @Override // p000.jc0.InterfaceC7864j
        public vj1 getSchemeBytes() {
            return vj1.copyFromUtf8(this.scheme_);
        }

        @Override // p000.jc0.InterfaceC7864j
        public long getSize() {
            return this.size_;
        }

        @Override // p000.jc0.InterfaceC7864j
        public f2h getTime() {
            f2h f2hVar = this.time_;
            return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
        }

        @Override // p000.jc0.InterfaceC7864j
        public boolean hasAuth() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.jc0.InterfaceC7864j
        public boolean hasTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C7855a c7855a = null;
            switch (C7855a.f50273a[enumC13830i.ordinal()]) {
                case 1:
                    return new C7863i();
                case 2:
                    return new a(c7855a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\r\f\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\tဉ\u0000\n\u0002\u000bȈ\fȈ\rဉ\u0001", new Object[]{"bitField0_", "id_", "method_", "headers_", b.f50275a, "path_", "host_", "scheme_", "query_", "time_", "size_", "protocol_", "reason_", "auth_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C7863i> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C7863i.class) {
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

        public static a newBuilder(C7863i c7863i) {
            return DEFAULT_INSTANCE.m23739o(c7863i);
        }

        public static C7863i parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7863i) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7863i parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C7863i) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C7863i parseFrom(vj1 vj1Var) throws ce8 {
            return (C7863i) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C7863i parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C7863i) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C7863i parseFrom(byte[] bArr) throws ce8 {
            return (C7863i) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C7863i parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C7863i) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C7863i parseFrom(InputStream inputStream) throws IOException {
            return (C7863i) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C7863i parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7863i) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7863i parseFrom(f72 f72Var) throws IOException {
            return (C7863i) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C7863i parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C7863i) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: jc0$j */
    public interface InterfaceC7864j extends rsa {
        boolean containsHeaders(String str);

        C7858d getAuth();

        @Deprecated
        Map<String, String> getHeaders();

        int getHeadersCount();

        Map<String, String> getHeadersMap();

        String getHeadersOrDefault(String str, String str2);

        String getHeadersOrThrow(String str);

        String getHost();

        vj1 getHostBytes();

        String getId();

        vj1 getIdBytes();

        String getMethod();

        vj1 getMethodBytes();

        String getPath();

        vj1 getPathBytes();

        String getProtocol();

        vj1 getProtocolBytes();

        String getQuery();

        vj1 getQueryBytes();

        String getReason();

        vj1 getReasonBytes();

        String getScheme();

        vj1 getSchemeBytes();

        long getSize();

        f2h getTime();

        boolean hasAuth();

        boolean hasTime();
    }

    /* JADX INFO: renamed from: jc0$k */
    public static final class C7865k extends v27<C7865k, a> implements InterfaceC7866l {
        private static final C7865k DEFAULT_INSTANCE;
        public static final int LABELS_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile uhc<C7865k> PARSER = null;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private ss9<String, String> labels_ = ss9.emptyMapField();
        private String service_ = "";
        private String name_ = "";
        private String type_ = "";

        /* JADX INFO: renamed from: jc0$k$a */
        public static final class a extends v27.AbstractC13823b<C7865k, a> implements InterfaceC7866l {
            public /* synthetic */ a(C7855a c7855a) {
                this();
            }

            public a clearLabels() {
                m23743e();
                ((C7865k) this.f89756b).getMutableLabelsMap().clear();
                return this;
            }

            public a clearName() {
                m23743e();
                ((C7865k) this.f89756b).clearName();
                return this;
            }

            public a clearService() {
                m23743e();
                ((C7865k) this.f89756b).clearService();
                return this;
            }

            public a clearType() {
                m23743e();
                ((C7865k) this.f89756b).clearType();
                return this;
            }

            @Override // p000.jc0.InterfaceC7866l
            public boolean containsLabels(String str) {
                str.getClass();
                return ((C7865k) this.f89756b).getLabelsMap().containsKey(str);
            }

            @Override // p000.jc0.InterfaceC7866l
            @Deprecated
            public Map<String, String> getLabels() {
                return getLabelsMap();
            }

            @Override // p000.jc0.InterfaceC7866l
            public int getLabelsCount() {
                return ((C7865k) this.f89756b).getLabelsMap().size();
            }

            @Override // p000.jc0.InterfaceC7866l
            public Map<String, String> getLabelsMap() {
                return Collections.unmodifiableMap(((C7865k) this.f89756b).getLabelsMap());
            }

            @Override // p000.jc0.InterfaceC7866l
            public String getLabelsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> labelsMap = ((C7865k) this.f89756b).getLabelsMap();
                return labelsMap.containsKey(str) ? labelsMap.get(str) : str2;
            }

            @Override // p000.jc0.InterfaceC7866l
            public String getLabelsOrThrow(String str) {
                str.getClass();
                Map<String, String> labelsMap = ((C7865k) this.f89756b).getLabelsMap();
                if (labelsMap.containsKey(str)) {
                    return labelsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // p000.jc0.InterfaceC7866l
            public String getName() {
                return ((C7865k) this.f89756b).getName();
            }

            @Override // p000.jc0.InterfaceC7866l
            public vj1 getNameBytes() {
                return ((C7865k) this.f89756b).getNameBytes();
            }

            @Override // p000.jc0.InterfaceC7866l
            public String getService() {
                return ((C7865k) this.f89756b).getService();
            }

            @Override // p000.jc0.InterfaceC7866l
            public vj1 getServiceBytes() {
                return ((C7865k) this.f89756b).getServiceBytes();
            }

            @Override // p000.jc0.InterfaceC7866l
            public String getType() {
                return ((C7865k) this.f89756b).getType();
            }

            @Override // p000.jc0.InterfaceC7866l
            public vj1 getTypeBytes() {
                return ((C7865k) this.f89756b).getTypeBytes();
            }

            public a putAllLabels(Map<String, String> map) {
                m23743e();
                ((C7865k) this.f89756b).getMutableLabelsMap().putAll(map);
                return this;
            }

            public a putLabels(String str, String str2) {
                str.getClass();
                str2.getClass();
                m23743e();
                ((C7865k) this.f89756b).getMutableLabelsMap().put(str, str2);
                return this;
            }

            public a removeLabels(String str) {
                str.getClass();
                m23743e();
                ((C7865k) this.f89756b).getMutableLabelsMap().remove(str);
                return this;
            }

            public a setName(String str) {
                m23743e();
                ((C7865k) this.f89756b).setName(str);
                return this;
            }

            public a setNameBytes(vj1 vj1Var) {
                m23743e();
                ((C7865k) this.f89756b).setNameBytes(vj1Var);
                return this;
            }

            public a setService(String str) {
                m23743e();
                ((C7865k) this.f89756b).setService(str);
                return this;
            }

            public a setServiceBytes(vj1 vj1Var) {
                m23743e();
                ((C7865k) this.f89756b).setServiceBytes(vj1Var);
                return this;
            }

            public a setType(String str) {
                m23743e();
                ((C7865k) this.f89756b).setType(str);
                return this;
            }

            public a setTypeBytes(vj1 vj1Var) {
                m23743e();
                ((C7865k) this.f89756b).setTypeBytes(vj1Var);
                return this;
            }

            private a() {
                super(C7865k.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: jc0$k$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public static final os9<String, String> f50276a;

            static {
                hpi.EnumC6968b enumC6968b = hpi.EnumC6968b.f44485L;
                f50276a = os9.newDefaultInstance(enumC6968b, "", enumC6968b, "");
            }

            private b() {
            }
        }

        static {
            C7865k c7865k = new C7865k();
            DEFAULT_INSTANCE = c7865k;
            v27.m23715h0(C7865k.class, c7865k);
        }

        private C7865k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearService() {
            this.service_ = getDefaultInstance().getService();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static C7865k getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableLabelsMap() {
            return internalGetMutableLabels();
        }

        private ss9<String, String> internalGetLabels() {
            return this.labels_;
        }

        private ss9<String, String> internalGetMutableLabels() {
            if (!this.labels_.isMutable()) {
                this.labels_ = this.labels_.mutableCopy();
            }
            return this.labels_;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C7865k parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C7865k) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C7865k parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C7865k) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C7865k> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setService(String str) {
            str.getClass();
            this.service_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.service_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.type_ = vj1Var.toStringUtf8();
        }

        @Override // p000.jc0.InterfaceC7866l
        public boolean containsLabels(String str) {
            str.getClass();
            return internalGetLabels().containsKey(str);
        }

        @Override // p000.jc0.InterfaceC7866l
        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        @Override // p000.jc0.InterfaceC7866l
        public int getLabelsCount() {
            return internalGetLabels().size();
        }

        @Override // p000.jc0.InterfaceC7866l
        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(internalGetLabels());
        }

        @Override // p000.jc0.InterfaceC7866l
        public String getLabelsOrDefault(String str, String str2) {
            str.getClass();
            ss9<String, String> ss9VarInternalGetLabels = internalGetLabels();
            return ss9VarInternalGetLabels.containsKey(str) ? ss9VarInternalGetLabels.get(str) : str2;
        }

        @Override // p000.jc0.InterfaceC7866l
        public String getLabelsOrThrow(String str) {
            str.getClass();
            ss9<String, String> ss9VarInternalGetLabels = internalGetLabels();
            if (ss9VarInternalGetLabels.containsKey(str)) {
                return ss9VarInternalGetLabels.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // p000.jc0.InterfaceC7866l
        public String getName() {
            return this.name_;
        }

        @Override // p000.jc0.InterfaceC7866l
        public vj1 getNameBytes() {
            return vj1.copyFromUtf8(this.name_);
        }

        @Override // p000.jc0.InterfaceC7866l
        public String getService() {
            return this.service_;
        }

        @Override // p000.jc0.InterfaceC7866l
        public vj1 getServiceBytes() {
            return vj1.copyFromUtf8(this.service_);
        }

        @Override // p000.jc0.InterfaceC7866l
        public String getType() {
            return this.type_;
        }

        @Override // p000.jc0.InterfaceC7866l
        public vj1 getTypeBytes() {
            return vj1.copyFromUtf8(this.type_);
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C7855a c7855a = null;
            switch (C7855a.f50273a[enumC13830i.ordinal()]) {
                case 1:
                    return new C7865k();
                case 2:
                    return new a(c7855a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042", new Object[]{"service_", "name_", "type_", "labels_", b.f50276a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C7865k> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C7865k.class) {
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

        public static a newBuilder(C7865k c7865k) {
            return DEFAULT_INSTANCE.m23739o(c7865k);
        }

        public static C7865k parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7865k) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7865k parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C7865k) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C7865k parseFrom(vj1 vj1Var) throws ce8 {
            return (C7865k) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C7865k parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C7865k) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C7865k parseFrom(byte[] bArr) throws ce8 {
            return (C7865k) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C7865k parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C7865k) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C7865k parseFrom(InputStream inputStream) throws IOException {
            return (C7865k) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C7865k parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7865k) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7865k parseFrom(f72 f72Var) throws IOException {
            return (C7865k) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C7865k parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C7865k) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: jc0$l */
    public interface InterfaceC7866l extends rsa {
        boolean containsLabels(String str);

        @Deprecated
        Map<String, String> getLabels();

        int getLabelsCount();

        Map<String, String> getLabelsMap();

        String getLabelsOrDefault(String str, String str2);

        String getLabelsOrThrow(String str);

        String getName();

        vj1 getNameBytes();

        String getService();

        vj1 getServiceBytes();

        String getType();

        vj1 getTypeBytes();
    }

    /* JADX INFO: renamed from: jc0$m */
    public static final class C7867m extends v27<C7867m, a> implements InterfaceC7868n {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final C7867m DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        private static volatile uhc<C7867m> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 4;
        private int bitField0_;
        private long code_;
        private ss9<String, String> headers_ = ss9.emptyMapField();
        private long size_;
        private f2h time_;

        /* JADX INFO: renamed from: jc0$m$a */
        public static final class a extends v27.AbstractC13823b<C7867m, a> implements InterfaceC7868n {
            public /* synthetic */ a(C7855a c7855a) {
                this();
            }

            public a clearCode() {
                m23743e();
                ((C7867m) this.f89756b).clearCode();
                return this;
            }

            public a clearHeaders() {
                m23743e();
                ((C7867m) this.f89756b).getMutableHeadersMap().clear();
                return this;
            }

            public a clearSize() {
                m23743e();
                ((C7867m) this.f89756b).clearSize();
                return this;
            }

            public a clearTime() {
                m23743e();
                ((C7867m) this.f89756b).clearTime();
                return this;
            }

            @Override // p000.jc0.InterfaceC7868n
            public boolean containsHeaders(String str) {
                str.getClass();
                return ((C7867m) this.f89756b).getHeadersMap().containsKey(str);
            }

            @Override // p000.jc0.InterfaceC7868n
            public long getCode() {
                return ((C7867m) this.f89756b).getCode();
            }

            @Override // p000.jc0.InterfaceC7868n
            @Deprecated
            public Map<String, String> getHeaders() {
                return getHeadersMap();
            }

            @Override // p000.jc0.InterfaceC7868n
            public int getHeadersCount() {
                return ((C7867m) this.f89756b).getHeadersMap().size();
            }

            @Override // p000.jc0.InterfaceC7868n
            public Map<String, String> getHeadersMap() {
                return Collections.unmodifiableMap(((C7867m) this.f89756b).getHeadersMap());
            }

            @Override // p000.jc0.InterfaceC7868n
            public String getHeadersOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> headersMap = ((C7867m) this.f89756b).getHeadersMap();
                return headersMap.containsKey(str) ? headersMap.get(str) : str2;
            }

            @Override // p000.jc0.InterfaceC7868n
            public String getHeadersOrThrow(String str) {
                str.getClass();
                Map<String, String> headersMap = ((C7867m) this.f89756b).getHeadersMap();
                if (headersMap.containsKey(str)) {
                    return headersMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // p000.jc0.InterfaceC7868n
            public long getSize() {
                return ((C7867m) this.f89756b).getSize();
            }

            @Override // p000.jc0.InterfaceC7868n
            public f2h getTime() {
                return ((C7867m) this.f89756b).getTime();
            }

            @Override // p000.jc0.InterfaceC7868n
            public boolean hasTime() {
                return ((C7867m) this.f89756b).hasTime();
            }

            public a mergeTime(f2h f2hVar) {
                m23743e();
                ((C7867m) this.f89756b).mergeTime(f2hVar);
                return this;
            }

            public a putAllHeaders(Map<String, String> map) {
                m23743e();
                ((C7867m) this.f89756b).getMutableHeadersMap().putAll(map);
                return this;
            }

            public a putHeaders(String str, String str2) {
                str.getClass();
                str2.getClass();
                m23743e();
                ((C7867m) this.f89756b).getMutableHeadersMap().put(str, str2);
                return this;
            }

            public a removeHeaders(String str) {
                str.getClass();
                m23743e();
                ((C7867m) this.f89756b).getMutableHeadersMap().remove(str);
                return this;
            }

            public a setCode(long j) {
                m23743e();
                ((C7867m) this.f89756b).setCode(j);
                return this;
            }

            public a setSize(long j) {
                m23743e();
                ((C7867m) this.f89756b).setSize(j);
                return this;
            }

            public a setTime(f2h f2hVar) {
                m23743e();
                ((C7867m) this.f89756b).setTime(f2hVar);
                return this;
            }

            private a() {
                super(C7867m.DEFAULT_INSTANCE);
            }

            public a setTime(f2h.C5567b c5567b) {
                m23743e();
                ((C7867m) this.f89756b).setTime(c5567b.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: jc0$m$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public static final os9<String, String> f50277a;

            static {
                hpi.EnumC6968b enumC6968b = hpi.EnumC6968b.f44485L;
                f50277a = os9.newDefaultInstance(enumC6968b, "", enumC6968b, "");
            }

            private b() {
            }
        }

        static {
            C7867m c7867m = new C7867m();
            DEFAULT_INSTANCE = c7867m;
            v27.m23715h0(C7867m.class, c7867m);
        }

        private C7867m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTime() {
            this.time_ = null;
            this.bitField0_ &= -2;
        }

        public static C7867m getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableHeadersMap() {
            return internalGetMutableHeaders();
        }

        private ss9<String, String> internalGetHeaders() {
            return this.headers_;
        }

        private ss9<String, String> internalGetMutableHeaders() {
            if (!this.headers_.isMutable()) {
                this.headers_ = this.headers_.mutableCopy();
            }
            return this.headers_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTime(f2h f2hVar) {
            f2hVar.getClass();
            f2h f2hVar2 = this.time_;
            if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
                this.time_ = f2hVar;
            } else {
                this.time_ = f2h.newBuilder(this.time_).mergeFrom(f2hVar).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C7867m parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C7867m) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C7867m parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C7867m) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C7867m> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(long j) {
            this.code_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(long j) {
            this.size_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTime(f2h f2hVar) {
            f2hVar.getClass();
            this.time_ = f2hVar;
            this.bitField0_ |= 1;
        }

        @Override // p000.jc0.InterfaceC7868n
        public boolean containsHeaders(String str) {
            str.getClass();
            return internalGetHeaders().containsKey(str);
        }

        @Override // p000.jc0.InterfaceC7868n
        public long getCode() {
            return this.code_;
        }

        @Override // p000.jc0.InterfaceC7868n
        @Deprecated
        public Map<String, String> getHeaders() {
            return getHeadersMap();
        }

        @Override // p000.jc0.InterfaceC7868n
        public int getHeadersCount() {
            return internalGetHeaders().size();
        }

        @Override // p000.jc0.InterfaceC7868n
        public Map<String, String> getHeadersMap() {
            return Collections.unmodifiableMap(internalGetHeaders());
        }

        @Override // p000.jc0.InterfaceC7868n
        public String getHeadersOrDefault(String str, String str2) {
            str.getClass();
            ss9<String, String> ss9VarInternalGetHeaders = internalGetHeaders();
            return ss9VarInternalGetHeaders.containsKey(str) ? ss9VarInternalGetHeaders.get(str) : str2;
        }

        @Override // p000.jc0.InterfaceC7868n
        public String getHeadersOrThrow(String str) {
            str.getClass();
            ss9<String, String> ss9VarInternalGetHeaders = internalGetHeaders();
            if (ss9VarInternalGetHeaders.containsKey(str)) {
                return ss9VarInternalGetHeaders.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // p000.jc0.InterfaceC7868n
        public long getSize() {
            return this.size_;
        }

        @Override // p000.jc0.InterfaceC7868n
        public f2h getTime() {
            f2h f2hVar = this.time_;
            return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
        }

        @Override // p000.jc0.InterfaceC7868n
        public boolean hasTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C7855a c7855a = null;
            switch (C7855a.f50273a[enumC13830i.ordinal()]) {
                case 1:
                    return new C7867m();
                case 2:
                    return new a(c7855a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0002\u0002\u0002\u00032\u0004ဉ\u0000", new Object[]{"bitField0_", "code_", "size_", "headers_", b.f50277a, "time_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C7867m> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C7867m.class) {
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

        public static a newBuilder(C7867m c7867m) {
            return DEFAULT_INSTANCE.m23739o(c7867m);
        }

        public static C7867m parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7867m) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7867m parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C7867m) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C7867m parseFrom(vj1 vj1Var) throws ce8 {
            return (C7867m) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C7867m parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C7867m) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C7867m parseFrom(byte[] bArr) throws ce8 {
            return (C7867m) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C7867m parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C7867m) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C7867m parseFrom(InputStream inputStream) throws IOException {
            return (C7867m) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C7867m parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7867m) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7867m parseFrom(f72 f72Var) throws IOException {
            return (C7867m) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C7867m parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C7867m) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: jc0$n */
    public interface InterfaceC7868n extends rsa {
        boolean containsHeaders(String str);

        long getCode();

        @Deprecated
        Map<String, String> getHeaders();

        int getHeadersCount();

        Map<String, String> getHeadersMap();

        String getHeadersOrDefault(String str, String str2);

        String getHeadersOrThrow(String str);

        long getSize();

        f2h getTime();

        boolean hasTime();
    }

    static {
        jc0 jc0Var = new jc0();
        DEFAULT_INSTANCE = jc0Var;
        v27.m23715h0(jc0.class, jc0Var);
    }

    private jc0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApi() {
        this.api_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigin() {
        this.origin_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        this.response_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = null;
        this.bitField0_ &= -3;
    }

    public static jc0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApi(C7856b c7856b) {
        c7856b.getClass();
        C7856b c7856b2 = this.api_;
        if (c7856b2 == null || c7856b2 == C7856b.getDefaultInstance()) {
            this.api_ = c7856b;
        } else {
            this.api_ = C7856b.newBuilder(this.api_).mergeFrom(c7856b).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestination(C7861g c7861g) {
        c7861g.getClass();
        C7861g c7861g2 = this.destination_;
        if (c7861g2 == null || c7861g2 == C7861g.getDefaultInstance()) {
            this.destination_ = c7861g;
        } else {
            this.destination_ = C7861g.newBuilder(this.destination_).mergeFrom(c7861g).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOrigin(C7861g c7861g) {
        c7861g.getClass();
        C7861g c7861g2 = this.origin_;
        if (c7861g2 == null || c7861g2 == C7861g.getDefaultInstance()) {
            this.origin_ = c7861g;
        } else {
            this.origin_ = C7861g.newBuilder(this.origin_).mergeFrom(c7861g).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequest(C7863i c7863i) {
        c7863i.getClass();
        C7863i c7863i2 = this.request_;
        if (c7863i2 == null || c7863i2 == C7863i.getDefaultInstance()) {
            this.request_ = c7863i;
        } else {
            this.request_ = C7863i.newBuilder(this.request_).mergeFrom(c7863i).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResource(C7865k c7865k) {
        c7865k.getClass();
        C7865k c7865k2 = this.resource_;
        if (c7865k2 == null || c7865k2 == C7865k.getDefaultInstance()) {
            this.resource_ = c7865k;
        } else {
            this.resource_ = C7865k.newBuilder(this.resource_).mergeFrom(c7865k).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResponse(C7867m c7867m) {
        c7867m.getClass();
        C7867m c7867m2 = this.response_;
        if (c7867m2 == null || c7867m2 == C7867m.getDefaultInstance()) {
            this.response_ = c7867m;
        } else {
            this.response_ = C7867m.newBuilder(this.response_).mergeFrom(c7867m).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSource(C7861g c7861g) {
        c7861g.getClass();
        C7861g c7861g2 = this.source_;
        if (c7861g2 == null || c7861g2 == C7861g.getDefaultInstance()) {
            this.source_ = c7861g;
        } else {
            this.source_ = C7861g.newBuilder(this.source_).mergeFrom(c7861g).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C7860f newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static jc0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (jc0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static jc0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (jc0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<jc0> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApi(C7856b c7856b) {
        c7856b.getClass();
        this.api_ = c7856b;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(C7861g c7861g) {
        c7861g.getClass();
        this.destination_ = c7861g;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigin(C7861g c7861g) {
        c7861g.getClass();
        this.origin_ = c7861g;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequest(C7863i c7863i) {
        c7863i.getClass();
        this.request_ = c7863i;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(C7865k c7865k) {
        c7865k.getClass();
        this.resource_ = c7865k;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponse(C7867m c7867m) {
        c7867m.getClass();
        this.response_ = c7867m;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(C7861g c7861g) {
        c7861g.getClass();
        this.source_ = c7861g;
        this.bitField0_ |= 2;
    }

    @Override // p000.kc0
    public C7856b getApi() {
        C7856b c7856b = this.api_;
        return c7856b == null ? C7856b.getDefaultInstance() : c7856b;
    }

    @Override // p000.kc0
    public C7861g getDestination() {
        C7861g c7861g = this.destination_;
        return c7861g == null ? C7861g.getDefaultInstance() : c7861g;
    }

    @Override // p000.kc0
    public C7861g getOrigin() {
        C7861g c7861g = this.origin_;
        return c7861g == null ? C7861g.getDefaultInstance() : c7861g;
    }

    @Override // p000.kc0
    public C7863i getRequest() {
        C7863i c7863i = this.request_;
        return c7863i == null ? C7863i.getDefaultInstance() : c7863i;
    }

    @Override // p000.kc0
    public C7865k getResource() {
        C7865k c7865k = this.resource_;
        return c7865k == null ? C7865k.getDefaultInstance() : c7865k;
    }

    @Override // p000.kc0
    public C7867m getResponse() {
        C7867m c7867m = this.response_;
        return c7867m == null ? C7867m.getDefaultInstance() : c7867m;
    }

    @Override // p000.kc0
    public C7861g getSource() {
        C7861g c7861g = this.source_;
        return c7861g == null ? C7861g.getDefaultInstance() : c7861g;
    }

    @Override // p000.kc0
    public boolean hasApi() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // p000.kc0
    public boolean hasDestination() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p000.kc0
    public boolean hasOrigin() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.kc0
    public boolean hasRequest() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p000.kc0
    public boolean hasResource() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // p000.kc0
    public boolean hasResponse() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // p000.kc0
    public boolean hasSource() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C7855a c7855a = null;
        switch (C7855a.f50273a[enumC13830i.ordinal()]) {
            case 1:
                return new jc0();
            case 2:
                return new C7860f(c7855a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0000", new Object[]{"bitField0_", "source_", "destination_", "request_", "response_", "resource_", "api_", "origin_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<jc0> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (jc0.class) {
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

    public static C7860f newBuilder(jc0 jc0Var) {
        return DEFAULT_INSTANCE.m23739o(jc0Var);
    }

    public static jc0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (jc0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static jc0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (jc0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static jc0 parseFrom(vj1 vj1Var) throws ce8 {
        return (jc0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static jc0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (jc0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static jc0 parseFrom(byte[] bArr) throws ce8 {
        return (jc0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static jc0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (jc0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static jc0 parseFrom(InputStream inputStream) throws IOException {
        return (jc0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static jc0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (jc0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static jc0 parseFrom(f72 f72Var) throws IOException {
        return (jc0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static jc0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (jc0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
