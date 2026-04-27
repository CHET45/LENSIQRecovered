package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.C15896yz;
import p000.ci0;
import p000.k4e;
import p000.li0;
import p000.m4g;
import p000.pag;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class rh0 extends v27<rh0, C12088b> implements sh0 {
    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    private static final rh0 DEFAULT_INSTANCE;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    private static volatile uhc<rh0> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private ci0 authenticationInfo_;
    private int bitField0_;
    private long numResponseItems_;
    private k4e requestMetadata_;
    private pag request_;
    private pag response_;
    private C15896yz serviceData_;
    private m4g status_;
    private String serviceName_ = "";
    private String methodName_ = "";
    private String resourceName_ = "";
    private w98.InterfaceC14504k<li0> authorizationInfo_ = v27.m23722x();

    /* JADX INFO: renamed from: rh0$a */
    public static /* synthetic */ class C12087a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78281a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f78281a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78281a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78281a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78281a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78281a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f78281a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f78281a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: rh0$b */
    public static final class C12088b extends v27.AbstractC13823b<rh0, C12088b> implements sh0 {
        public /* synthetic */ C12088b(C12087a c12087a) {
            this();
        }

        public C12088b addAllAuthorizationInfo(Iterable<? extends li0> iterable) {
            m23743e();
            ((rh0) this.f89756b).addAllAuthorizationInfo(iterable);
            return this;
        }

        public C12088b addAuthorizationInfo(li0 li0Var) {
            m23743e();
            ((rh0) this.f89756b).addAuthorizationInfo(li0Var);
            return this;
        }

        public C12088b clearAuthenticationInfo() {
            m23743e();
            ((rh0) this.f89756b).clearAuthenticationInfo();
            return this;
        }

        public C12088b clearAuthorizationInfo() {
            m23743e();
            ((rh0) this.f89756b).clearAuthorizationInfo();
            return this;
        }

        public C12088b clearMethodName() {
            m23743e();
            ((rh0) this.f89756b).clearMethodName();
            return this;
        }

        public C12088b clearNumResponseItems() {
            m23743e();
            ((rh0) this.f89756b).clearNumResponseItems();
            return this;
        }

        public C12088b clearRequest() {
            m23743e();
            ((rh0) this.f89756b).clearRequest();
            return this;
        }

        public C12088b clearRequestMetadata() {
            m23743e();
            ((rh0) this.f89756b).clearRequestMetadata();
            return this;
        }

        public C12088b clearResourceName() {
            m23743e();
            ((rh0) this.f89756b).clearResourceName();
            return this;
        }

        public C12088b clearResponse() {
            m23743e();
            ((rh0) this.f89756b).clearResponse();
            return this;
        }

        public C12088b clearServiceData() {
            m23743e();
            ((rh0) this.f89756b).clearServiceData();
            return this;
        }

        public C12088b clearServiceName() {
            m23743e();
            ((rh0) this.f89756b).clearServiceName();
            return this;
        }

        public C12088b clearStatus() {
            m23743e();
            ((rh0) this.f89756b).clearStatus();
            return this;
        }

        @Override // p000.sh0
        public ci0 getAuthenticationInfo() {
            return ((rh0) this.f89756b).getAuthenticationInfo();
        }

        @Override // p000.sh0
        public li0 getAuthorizationInfo(int i) {
            return ((rh0) this.f89756b).getAuthorizationInfo(i);
        }

        @Override // p000.sh0
        public int getAuthorizationInfoCount() {
            return ((rh0) this.f89756b).getAuthorizationInfoCount();
        }

        @Override // p000.sh0
        public List<li0> getAuthorizationInfoList() {
            return Collections.unmodifiableList(((rh0) this.f89756b).getAuthorizationInfoList());
        }

        @Override // p000.sh0
        public String getMethodName() {
            return ((rh0) this.f89756b).getMethodName();
        }

        @Override // p000.sh0
        public vj1 getMethodNameBytes() {
            return ((rh0) this.f89756b).getMethodNameBytes();
        }

        @Override // p000.sh0
        public long getNumResponseItems() {
            return ((rh0) this.f89756b).getNumResponseItems();
        }

        @Override // p000.sh0
        public pag getRequest() {
            return ((rh0) this.f89756b).getRequest();
        }

        @Override // p000.sh0
        public k4e getRequestMetadata() {
            return ((rh0) this.f89756b).getRequestMetadata();
        }

        @Override // p000.sh0
        public String getResourceName() {
            return ((rh0) this.f89756b).getResourceName();
        }

        @Override // p000.sh0
        public vj1 getResourceNameBytes() {
            return ((rh0) this.f89756b).getResourceNameBytes();
        }

        @Override // p000.sh0
        public pag getResponse() {
            return ((rh0) this.f89756b).getResponse();
        }

        @Override // p000.sh0
        public C15896yz getServiceData() {
            return ((rh0) this.f89756b).getServiceData();
        }

        @Override // p000.sh0
        public String getServiceName() {
            return ((rh0) this.f89756b).getServiceName();
        }

        @Override // p000.sh0
        public vj1 getServiceNameBytes() {
            return ((rh0) this.f89756b).getServiceNameBytes();
        }

        @Override // p000.sh0
        public m4g getStatus() {
            return ((rh0) this.f89756b).getStatus();
        }

        @Override // p000.sh0
        public boolean hasAuthenticationInfo() {
            return ((rh0) this.f89756b).hasAuthenticationInfo();
        }

        @Override // p000.sh0
        public boolean hasRequest() {
            return ((rh0) this.f89756b).hasRequest();
        }

        @Override // p000.sh0
        public boolean hasRequestMetadata() {
            return ((rh0) this.f89756b).hasRequestMetadata();
        }

        @Override // p000.sh0
        public boolean hasResponse() {
            return ((rh0) this.f89756b).hasResponse();
        }

        @Override // p000.sh0
        public boolean hasServiceData() {
            return ((rh0) this.f89756b).hasServiceData();
        }

        @Override // p000.sh0
        public boolean hasStatus() {
            return ((rh0) this.f89756b).hasStatus();
        }

        public C12088b mergeAuthenticationInfo(ci0 ci0Var) {
            m23743e();
            ((rh0) this.f89756b).mergeAuthenticationInfo(ci0Var);
            return this;
        }

        public C12088b mergeRequest(pag pagVar) {
            m23743e();
            ((rh0) this.f89756b).mergeRequest(pagVar);
            return this;
        }

        public C12088b mergeRequestMetadata(k4e k4eVar) {
            m23743e();
            ((rh0) this.f89756b).mergeRequestMetadata(k4eVar);
            return this;
        }

        public C12088b mergeResponse(pag pagVar) {
            m23743e();
            ((rh0) this.f89756b).mergeResponse(pagVar);
            return this;
        }

        public C12088b mergeServiceData(C15896yz c15896yz) {
            m23743e();
            ((rh0) this.f89756b).mergeServiceData(c15896yz);
            return this;
        }

        public C12088b mergeStatus(m4g m4gVar) {
            m23743e();
            ((rh0) this.f89756b).mergeStatus(m4gVar);
            return this;
        }

        public C12088b removeAuthorizationInfo(int i) {
            m23743e();
            ((rh0) this.f89756b).removeAuthorizationInfo(i);
            return this;
        }

        public C12088b setAuthenticationInfo(ci0 ci0Var) {
            m23743e();
            ((rh0) this.f89756b).setAuthenticationInfo(ci0Var);
            return this;
        }

        public C12088b setAuthorizationInfo(int i, li0 li0Var) {
            m23743e();
            ((rh0) this.f89756b).setAuthorizationInfo(i, li0Var);
            return this;
        }

        public C12088b setMethodName(String str) {
            m23743e();
            ((rh0) this.f89756b).setMethodName(str);
            return this;
        }

        public C12088b setMethodNameBytes(vj1 vj1Var) {
            m23743e();
            ((rh0) this.f89756b).setMethodNameBytes(vj1Var);
            return this;
        }

        public C12088b setNumResponseItems(long j) {
            m23743e();
            ((rh0) this.f89756b).setNumResponseItems(j);
            return this;
        }

        public C12088b setRequest(pag pagVar) {
            m23743e();
            ((rh0) this.f89756b).setRequest(pagVar);
            return this;
        }

        public C12088b setRequestMetadata(k4e k4eVar) {
            m23743e();
            ((rh0) this.f89756b).setRequestMetadata(k4eVar);
            return this;
        }

        public C12088b setResourceName(String str) {
            m23743e();
            ((rh0) this.f89756b).setResourceName(str);
            return this;
        }

        public C12088b setResourceNameBytes(vj1 vj1Var) {
            m23743e();
            ((rh0) this.f89756b).setResourceNameBytes(vj1Var);
            return this;
        }

        public C12088b setResponse(pag pagVar) {
            m23743e();
            ((rh0) this.f89756b).setResponse(pagVar);
            return this;
        }

        public C12088b setServiceData(C15896yz c15896yz) {
            m23743e();
            ((rh0) this.f89756b).setServiceData(c15896yz);
            return this;
        }

        public C12088b setServiceName(String str) {
            m23743e();
            ((rh0) this.f89756b).setServiceName(str);
            return this;
        }

        public C12088b setServiceNameBytes(vj1 vj1Var) {
            m23743e();
            ((rh0) this.f89756b).setServiceNameBytes(vj1Var);
            return this;
        }

        public C12088b setStatus(m4g m4gVar) {
            m23743e();
            ((rh0) this.f89756b).setStatus(m4gVar);
            return this;
        }

        private C12088b() {
            super(rh0.DEFAULT_INSTANCE);
        }

        public C12088b addAuthorizationInfo(int i, li0 li0Var) {
            m23743e();
            ((rh0) this.f89756b).addAuthorizationInfo(i, li0Var);
            return this;
        }

        public C12088b setAuthenticationInfo(ci0.C2319b c2319b) {
            m23743e();
            ((rh0) this.f89756b).setAuthenticationInfo(c2319b.build());
            return this;
        }

        public C12088b setAuthorizationInfo(int i, li0.C8822b c8822b) {
            m23743e();
            ((rh0) this.f89756b).setAuthorizationInfo(i, c8822b.build());
            return this;
        }

        public C12088b setRequest(pag.C10875b c10875b) {
            m23743e();
            ((rh0) this.f89756b).setRequest(c10875b.build());
            return this;
        }

        public C12088b setRequestMetadata(k4e.C8195b c8195b) {
            m23743e();
            ((rh0) this.f89756b).setRequestMetadata(c8195b.build());
            return this;
        }

        public C12088b setResponse(pag.C10875b c10875b) {
            m23743e();
            ((rh0) this.f89756b).setResponse(c10875b.build());
            return this;
        }

        public C12088b setServiceData(C15896yz.b bVar) {
            m23743e();
            ((rh0) this.f89756b).setServiceData(bVar.build());
            return this;
        }

        public C12088b setStatus(m4g.C9139b c9139b) {
            m23743e();
            ((rh0) this.f89756b).setStatus(c9139b.build());
            return this;
        }

        public C12088b addAuthorizationInfo(li0.C8822b c8822b) {
            m23743e();
            ((rh0) this.f89756b).addAuthorizationInfo(c8822b.build());
            return this;
        }

        public C12088b addAuthorizationInfo(int i, li0.C8822b c8822b) {
            m23743e();
            ((rh0) this.f89756b).addAuthorizationInfo(i, c8822b.build());
            return this;
        }
    }

    static {
        rh0 rh0Var = new rh0();
        DEFAULT_INSTANCE = rh0Var;
        v27.m23715h0(rh0.class, rh0Var);
    }

    private rh0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAuthorizationInfo(Iterable<? extends li0> iterable) {
        ensureAuthorizationInfoIsMutable();
        AbstractC1714b3.m2856b(iterable, this.authorizationInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAuthorizationInfo(li0 li0Var) {
        li0Var.getClass();
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(li0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthenticationInfo() {
        this.authenticationInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthorizationInfo() {
        this.authorizationInfo_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethodName() {
        this.methodName_ = getDefaultInstance().getMethodName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumResponseItems() {
        this.numResponseItems_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestMetadata() {
        this.requestMetadata_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceName() {
        this.resourceName_ = getDefaultInstance().getResourceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        this.response_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceData() {
        this.serviceData_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceName() {
        this.serviceName_ = getDefaultInstance().getServiceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureAuthorizationInfoIsMutable() {
        w98.InterfaceC14504k<li0> interfaceC14504k = this.authorizationInfo_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.authorizationInfo_ = v27.m23698P(interfaceC14504k);
    }

    public static rh0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAuthenticationInfo(ci0 ci0Var) {
        ci0Var.getClass();
        ci0 ci0Var2 = this.authenticationInfo_;
        if (ci0Var2 == null || ci0Var2 == ci0.getDefaultInstance()) {
            this.authenticationInfo_ = ci0Var;
        } else {
            this.authenticationInfo_ = ci0.newBuilder(this.authenticationInfo_).mergeFrom(ci0Var).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequest(pag pagVar) {
        pagVar.getClass();
        pag pagVar2 = this.request_;
        if (pagVar2 == null || pagVar2 == pag.getDefaultInstance()) {
            this.request_ = pagVar;
        } else {
            this.request_ = pag.newBuilder(this.request_).mergeFrom(pagVar).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequestMetadata(k4e k4eVar) {
        k4eVar.getClass();
        k4e k4eVar2 = this.requestMetadata_;
        if (k4eVar2 == null || k4eVar2 == k4e.getDefaultInstance()) {
            this.requestMetadata_ = k4eVar;
        } else {
            this.requestMetadata_ = k4e.newBuilder(this.requestMetadata_).mergeFrom(k4eVar).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResponse(pag pagVar) {
        pagVar.getClass();
        pag pagVar2 = this.response_;
        if (pagVar2 == null || pagVar2 == pag.getDefaultInstance()) {
            this.response_ = pagVar;
        } else {
            this.response_ = pag.newBuilder(this.response_).mergeFrom(pagVar).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServiceData(C15896yz c15896yz) {
        c15896yz.getClass();
        C15896yz c15896yz2 = this.serviceData_;
        if (c15896yz2 == null || c15896yz2 == C15896yz.getDefaultInstance()) {
            this.serviceData_ = c15896yz;
        } else {
            this.serviceData_ = C15896yz.newBuilder(this.serviceData_).mergeFrom(c15896yz).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(m4g m4gVar) {
        m4gVar.getClass();
        m4g m4gVar2 = this.status_;
        if (m4gVar2 == null || m4gVar2 == m4g.getDefaultInstance()) {
            this.status_ = m4gVar;
        } else {
            this.status_ = m4g.newBuilder(this.status_).mergeFrom(m4gVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C12088b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static rh0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (rh0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static rh0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (rh0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<rh0> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAuthorizationInfo(int i) {
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthenticationInfo(ci0 ci0Var) {
        ci0Var.getClass();
        this.authenticationInfo_ = ci0Var;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthorizationInfo(int i, li0 li0Var) {
        li0Var.getClass();
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.set(i, li0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethodName(String str) {
        str.getClass();
        this.methodName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethodNameBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.methodName_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumResponseItems(long j) {
        this.numResponseItems_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequest(pag pagVar) {
        pagVar.getClass();
        this.request_ = pagVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestMetadata(k4e k4eVar) {
        k4eVar.getClass();
        this.requestMetadata_ = k4eVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceName(String str) {
        str.getClass();
        this.resourceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceNameBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.resourceName_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponse(pag pagVar) {
        pagVar.getClass();
        this.response_ = pagVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceData(C15896yz c15896yz) {
        c15896yz.getClass();
        this.serviceData_ = c15896yz;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceName(String str) {
        str.getClass();
        this.serviceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceNameBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.serviceName_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(m4g m4gVar) {
        m4gVar.getClass();
        this.status_ = m4gVar;
        this.bitField0_ |= 1;
    }

    @Override // p000.sh0
    public ci0 getAuthenticationInfo() {
        ci0 ci0Var = this.authenticationInfo_;
        return ci0Var == null ? ci0.getDefaultInstance() : ci0Var;
    }

    @Override // p000.sh0
    public li0 getAuthorizationInfo(int i) {
        return this.authorizationInfo_.get(i);
    }

    @Override // p000.sh0
    public int getAuthorizationInfoCount() {
        return this.authorizationInfo_.size();
    }

    @Override // p000.sh0
    public List<li0> getAuthorizationInfoList() {
        return this.authorizationInfo_;
    }

    public mi0 getAuthorizationInfoOrBuilder(int i) {
        return this.authorizationInfo_.get(i);
    }

    public List<? extends mi0> getAuthorizationInfoOrBuilderList() {
        return this.authorizationInfo_;
    }

    @Override // p000.sh0
    public String getMethodName() {
        return this.methodName_;
    }

    @Override // p000.sh0
    public vj1 getMethodNameBytes() {
        return vj1.copyFromUtf8(this.methodName_);
    }

    @Override // p000.sh0
    public long getNumResponseItems() {
        return this.numResponseItems_;
    }

    @Override // p000.sh0
    public pag getRequest() {
        pag pagVar = this.request_;
        return pagVar == null ? pag.getDefaultInstance() : pagVar;
    }

    @Override // p000.sh0
    public k4e getRequestMetadata() {
        k4e k4eVar = this.requestMetadata_;
        return k4eVar == null ? k4e.getDefaultInstance() : k4eVar;
    }

    @Override // p000.sh0
    public String getResourceName() {
        return this.resourceName_;
    }

    @Override // p000.sh0
    public vj1 getResourceNameBytes() {
        return vj1.copyFromUtf8(this.resourceName_);
    }

    @Override // p000.sh0
    public pag getResponse() {
        pag pagVar = this.response_;
        return pagVar == null ? pag.getDefaultInstance() : pagVar;
    }

    @Override // p000.sh0
    public C15896yz getServiceData() {
        C15896yz c15896yz = this.serviceData_;
        return c15896yz == null ? C15896yz.getDefaultInstance() : c15896yz;
    }

    @Override // p000.sh0
    public String getServiceName() {
        return this.serviceName_;
    }

    @Override // p000.sh0
    public vj1 getServiceNameBytes() {
        return vj1.copyFromUtf8(this.serviceName_);
    }

    @Override // p000.sh0
    public m4g getStatus() {
        m4g m4gVar = this.status_;
        return m4gVar == null ? m4g.getDefaultInstance() : m4gVar;
    }

    @Override // p000.sh0
    public boolean hasAuthenticationInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.sh0
    public boolean hasRequest() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p000.sh0
    public boolean hasRequestMetadata() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p000.sh0
    public boolean hasResponse() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // p000.sh0
    public boolean hasServiceData() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // p000.sh0
    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C12087a c12087a = null;
        switch (C12087a.f78281a[enumC13830i.ordinal()]) {
            case 1:
                return new rh0();
            case 2:
                return new C12088b(c12087a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0002\u0011\u000b\u0000\u0001\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0007Ȉ\bȈ\t\u001b\u000bȈ\f\u0002\u000fဉ\u0005\u0010ဉ\u0003\u0011ဉ\u0004", new Object[]{"bitField0_", "status_", "authenticationInfo_", "requestMetadata_", "serviceName_", "methodName_", "authorizationInfo_", li0.class, "resourceName_", "numResponseItems_", "serviceData_", "request_", "response_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<rh0> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (rh0.class) {
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

    public static C12088b newBuilder(rh0 rh0Var) {
        return DEFAULT_INSTANCE.m23739o(rh0Var);
    }

    public static rh0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (rh0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static rh0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (rh0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static rh0 parseFrom(vj1 vj1Var) throws ce8 {
        return (rh0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAuthorizationInfo(int i, li0 li0Var) {
        li0Var.getClass();
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(i, li0Var);
    }

    public static rh0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (rh0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static rh0 parseFrom(byte[] bArr) throws ce8 {
        return (rh0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static rh0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (rh0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static rh0 parseFrom(InputStream inputStream) throws IOException {
        return (rh0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static rh0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (rh0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static rh0 parseFrom(f72 f72Var) throws IOException {
        return (rh0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static rh0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (rh0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
