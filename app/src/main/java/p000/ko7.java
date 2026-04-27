package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.at4;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class ko7 extends v27<ko7, C8475b> implements mo7 {
    public static final int CACHE_FILL_BYTES_FIELD_NUMBER = 12;
    public static final int CACHE_HIT_FIELD_NUMBER = 9;
    public static final int CACHE_LOOKUP_FIELD_NUMBER = 11;
    public static final int CACHE_VALIDATED_WITH_ORIGIN_SERVER_FIELD_NUMBER = 10;
    private static final ko7 DEFAULT_INSTANCE;
    public static final int LATENCY_FIELD_NUMBER = 14;
    private static volatile uhc<ko7> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 15;
    public static final int REFERER_FIELD_NUMBER = 8;
    public static final int REMOTE_IP_FIELD_NUMBER = 7;
    public static final int REQUEST_METHOD_FIELD_NUMBER = 1;
    public static final int REQUEST_SIZE_FIELD_NUMBER = 3;
    public static final int REQUEST_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_SIZE_FIELD_NUMBER = 5;
    public static final int SERVER_IP_FIELD_NUMBER = 13;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int USER_AGENT_FIELD_NUMBER = 6;
    private int bitField0_;
    private long cacheFillBytes_;
    private boolean cacheHit_;
    private boolean cacheLookup_;
    private boolean cacheValidatedWithOriginServer_;
    private at4 latency_;
    private long requestSize_;
    private long responseSize_;
    private int status_;
    private String requestMethod_ = "";
    private String requestUrl_ = "";
    private String userAgent_ = "";
    private String remoteIp_ = "";
    private String serverIp_ = "";
    private String referer_ = "";
    private String protocol_ = "";

    /* JADX INFO: renamed from: ko7$a */
    public static /* synthetic */ class C8474a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54836a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f54836a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54836a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54836a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54836a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54836a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54836a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54836a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: ko7$b */
    public static final class C8475b extends v27.AbstractC13823b<ko7, C8475b> implements mo7 {
        public /* synthetic */ C8475b(C8474a c8474a) {
            this();
        }

        public C8475b clearCacheFillBytes() {
            m23743e();
            ((ko7) this.f89756b).clearCacheFillBytes();
            return this;
        }

        public C8475b clearCacheHit() {
            m23743e();
            ((ko7) this.f89756b).clearCacheHit();
            return this;
        }

        public C8475b clearCacheLookup() {
            m23743e();
            ((ko7) this.f89756b).clearCacheLookup();
            return this;
        }

        public C8475b clearCacheValidatedWithOriginServer() {
            m23743e();
            ((ko7) this.f89756b).clearCacheValidatedWithOriginServer();
            return this;
        }

        public C8475b clearLatency() {
            m23743e();
            ((ko7) this.f89756b).clearLatency();
            return this;
        }

        public C8475b clearProtocol() {
            m23743e();
            ((ko7) this.f89756b).clearProtocol();
            return this;
        }

        public C8475b clearReferer() {
            m23743e();
            ((ko7) this.f89756b).clearReferer();
            return this;
        }

        public C8475b clearRemoteIp() {
            m23743e();
            ((ko7) this.f89756b).clearRemoteIp();
            return this;
        }

        public C8475b clearRequestMethod() {
            m23743e();
            ((ko7) this.f89756b).clearRequestMethod();
            return this;
        }

        public C8475b clearRequestSize() {
            m23743e();
            ((ko7) this.f89756b).clearRequestSize();
            return this;
        }

        public C8475b clearRequestUrl() {
            m23743e();
            ((ko7) this.f89756b).clearRequestUrl();
            return this;
        }

        public C8475b clearResponseSize() {
            m23743e();
            ((ko7) this.f89756b).clearResponseSize();
            return this;
        }

        public C8475b clearServerIp() {
            m23743e();
            ((ko7) this.f89756b).clearServerIp();
            return this;
        }

        public C8475b clearStatus() {
            m23743e();
            ((ko7) this.f89756b).clearStatus();
            return this;
        }

        public C8475b clearUserAgent() {
            m23743e();
            ((ko7) this.f89756b).clearUserAgent();
            return this;
        }

        @Override // p000.mo7
        public long getCacheFillBytes() {
            return ((ko7) this.f89756b).getCacheFillBytes();
        }

        @Override // p000.mo7
        public boolean getCacheHit() {
            return ((ko7) this.f89756b).getCacheHit();
        }

        @Override // p000.mo7
        public boolean getCacheLookup() {
            return ((ko7) this.f89756b).getCacheLookup();
        }

        @Override // p000.mo7
        public boolean getCacheValidatedWithOriginServer() {
            return ((ko7) this.f89756b).getCacheValidatedWithOriginServer();
        }

        @Override // p000.mo7
        public at4 getLatency() {
            return ((ko7) this.f89756b).getLatency();
        }

        @Override // p000.mo7
        public String getProtocol() {
            return ((ko7) this.f89756b).getProtocol();
        }

        @Override // p000.mo7
        public vj1 getProtocolBytes() {
            return ((ko7) this.f89756b).getProtocolBytes();
        }

        @Override // p000.mo7
        public String getReferer() {
            return ((ko7) this.f89756b).getReferer();
        }

        @Override // p000.mo7
        public vj1 getRefererBytes() {
            return ((ko7) this.f89756b).getRefererBytes();
        }

        @Override // p000.mo7
        public String getRemoteIp() {
            return ((ko7) this.f89756b).getRemoteIp();
        }

        @Override // p000.mo7
        public vj1 getRemoteIpBytes() {
            return ((ko7) this.f89756b).getRemoteIpBytes();
        }

        @Override // p000.mo7
        public String getRequestMethod() {
            return ((ko7) this.f89756b).getRequestMethod();
        }

        @Override // p000.mo7
        public vj1 getRequestMethodBytes() {
            return ((ko7) this.f89756b).getRequestMethodBytes();
        }

        @Override // p000.mo7
        public long getRequestSize() {
            return ((ko7) this.f89756b).getRequestSize();
        }

        @Override // p000.mo7
        public String getRequestUrl() {
            return ((ko7) this.f89756b).getRequestUrl();
        }

        @Override // p000.mo7
        public vj1 getRequestUrlBytes() {
            return ((ko7) this.f89756b).getRequestUrlBytes();
        }

        @Override // p000.mo7
        public long getResponseSize() {
            return ((ko7) this.f89756b).getResponseSize();
        }

        @Override // p000.mo7
        public String getServerIp() {
            return ((ko7) this.f89756b).getServerIp();
        }

        @Override // p000.mo7
        public vj1 getServerIpBytes() {
            return ((ko7) this.f89756b).getServerIpBytes();
        }

        @Override // p000.mo7
        public int getStatus() {
            return ((ko7) this.f89756b).getStatus();
        }

        @Override // p000.mo7
        public String getUserAgent() {
            return ((ko7) this.f89756b).getUserAgent();
        }

        @Override // p000.mo7
        public vj1 getUserAgentBytes() {
            return ((ko7) this.f89756b).getUserAgentBytes();
        }

        @Override // p000.mo7
        public boolean hasLatency() {
            return ((ko7) this.f89756b).hasLatency();
        }

        public C8475b mergeLatency(at4 at4Var) {
            m23743e();
            ((ko7) this.f89756b).mergeLatency(at4Var);
            return this;
        }

        public C8475b setCacheFillBytes(long j) {
            m23743e();
            ((ko7) this.f89756b).setCacheFillBytes(j);
            return this;
        }

        public C8475b setCacheHit(boolean z) {
            m23743e();
            ((ko7) this.f89756b).setCacheHit(z);
            return this;
        }

        public C8475b setCacheLookup(boolean z) {
            m23743e();
            ((ko7) this.f89756b).setCacheLookup(z);
            return this;
        }

        public C8475b setCacheValidatedWithOriginServer(boolean z) {
            m23743e();
            ((ko7) this.f89756b).setCacheValidatedWithOriginServer(z);
            return this;
        }

        public C8475b setLatency(at4 at4Var) {
            m23743e();
            ((ko7) this.f89756b).setLatency(at4Var);
            return this;
        }

        public C8475b setProtocol(String str) {
            m23743e();
            ((ko7) this.f89756b).setProtocol(str);
            return this;
        }

        public C8475b setProtocolBytes(vj1 vj1Var) {
            m23743e();
            ((ko7) this.f89756b).setProtocolBytes(vj1Var);
            return this;
        }

        public C8475b setReferer(String str) {
            m23743e();
            ((ko7) this.f89756b).setReferer(str);
            return this;
        }

        public C8475b setRefererBytes(vj1 vj1Var) {
            m23743e();
            ((ko7) this.f89756b).setRefererBytes(vj1Var);
            return this;
        }

        public C8475b setRemoteIp(String str) {
            m23743e();
            ((ko7) this.f89756b).setRemoteIp(str);
            return this;
        }

        public C8475b setRemoteIpBytes(vj1 vj1Var) {
            m23743e();
            ((ko7) this.f89756b).setRemoteIpBytes(vj1Var);
            return this;
        }

        public C8475b setRequestMethod(String str) {
            m23743e();
            ((ko7) this.f89756b).setRequestMethod(str);
            return this;
        }

        public C8475b setRequestMethodBytes(vj1 vj1Var) {
            m23743e();
            ((ko7) this.f89756b).setRequestMethodBytes(vj1Var);
            return this;
        }

        public C8475b setRequestSize(long j) {
            m23743e();
            ((ko7) this.f89756b).setRequestSize(j);
            return this;
        }

        public C8475b setRequestUrl(String str) {
            m23743e();
            ((ko7) this.f89756b).setRequestUrl(str);
            return this;
        }

        public C8475b setRequestUrlBytes(vj1 vj1Var) {
            m23743e();
            ((ko7) this.f89756b).setRequestUrlBytes(vj1Var);
            return this;
        }

        public C8475b setResponseSize(long j) {
            m23743e();
            ((ko7) this.f89756b).setResponseSize(j);
            return this;
        }

        public C8475b setServerIp(String str) {
            m23743e();
            ((ko7) this.f89756b).setServerIp(str);
            return this;
        }

        public C8475b setServerIpBytes(vj1 vj1Var) {
            m23743e();
            ((ko7) this.f89756b).setServerIpBytes(vj1Var);
            return this;
        }

        public C8475b setStatus(int i) {
            m23743e();
            ((ko7) this.f89756b).setStatus(i);
            return this;
        }

        public C8475b setUserAgent(String str) {
            m23743e();
            ((ko7) this.f89756b).setUserAgent(str);
            return this;
        }

        public C8475b setUserAgentBytes(vj1 vj1Var) {
            m23743e();
            ((ko7) this.f89756b).setUserAgentBytes(vj1Var);
            return this;
        }

        private C8475b() {
            super(ko7.DEFAULT_INSTANCE);
        }

        public C8475b setLatency(at4.C1602b c1602b) {
            m23743e();
            ((ko7) this.f89756b).setLatency(c1602b.build());
            return this;
        }
    }

    static {
        ko7 ko7Var = new ko7();
        DEFAULT_INSTANCE = ko7Var;
        v27.m23715h0(ko7.class, ko7Var);
    }

    private ko7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCacheFillBytes() {
        this.cacheFillBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCacheHit() {
        this.cacheHit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCacheLookup() {
        this.cacheLookup_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCacheValidatedWithOriginServer() {
        this.cacheValidatedWithOriginServer_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatency() {
        this.latency_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = getDefaultInstance().getProtocol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReferer() {
        this.referer_ = getDefaultInstance().getReferer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoteIp() {
        this.remoteIp_ = getDefaultInstance().getRemoteIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestMethod() {
        this.requestMethod_ = getDefaultInstance().getRequestMethod();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestSize() {
        this.requestSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestUrl() {
        this.requestUrl_ = getDefaultInstance().getRequestUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseSize() {
        this.responseSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerIp() {
        this.serverIp_ = getDefaultInstance().getServerIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgent() {
        this.userAgent_ = getDefaultInstance().getUserAgent();
    }

    public static ko7 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLatency(at4 at4Var) {
        at4Var.getClass();
        at4 at4Var2 = this.latency_;
        if (at4Var2 == null || at4Var2 == at4.getDefaultInstance()) {
            this.latency_ = at4Var;
        } else {
            this.latency_ = at4.newBuilder(this.latency_).mergeFrom(at4Var).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C8475b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static ko7 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ko7) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static ko7 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (ko7) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<ko7> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCacheFillBytes(long j) {
        this.cacheFillBytes_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCacheHit(boolean z) {
        this.cacheHit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCacheLookup(boolean z) {
        this.cacheLookup_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCacheValidatedWithOriginServer(boolean z) {
        this.cacheValidatedWithOriginServer_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatency(at4 at4Var) {
        at4Var.getClass();
        this.latency_ = at4Var;
        this.bitField0_ |= 1;
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
    public void setReferer(String str) {
        str.getClass();
        this.referer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefererBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.referer_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoteIp(String str) {
        str.getClass();
        this.remoteIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoteIpBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.remoteIp_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestMethod(String str) {
        str.getClass();
        this.requestMethod_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestMethodBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.requestMethod_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestSize(long j) {
        this.requestSize_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestUrl(String str) {
        str.getClass();
        this.requestUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestUrlBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.requestUrl_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseSize(long j) {
        this.responseSize_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerIp(String str) {
        str.getClass();
        this.serverIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerIpBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.serverIp_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgent(String str) {
        str.getClass();
        this.userAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgentBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.userAgent_ = vj1Var.toStringUtf8();
    }

    @Override // p000.mo7
    public long getCacheFillBytes() {
        return this.cacheFillBytes_;
    }

    @Override // p000.mo7
    public boolean getCacheHit() {
        return this.cacheHit_;
    }

    @Override // p000.mo7
    public boolean getCacheLookup() {
        return this.cacheLookup_;
    }

    @Override // p000.mo7
    public boolean getCacheValidatedWithOriginServer() {
        return this.cacheValidatedWithOriginServer_;
    }

    @Override // p000.mo7
    public at4 getLatency() {
        at4 at4Var = this.latency_;
        return at4Var == null ? at4.getDefaultInstance() : at4Var;
    }

    @Override // p000.mo7
    public String getProtocol() {
        return this.protocol_;
    }

    @Override // p000.mo7
    public vj1 getProtocolBytes() {
        return vj1.copyFromUtf8(this.protocol_);
    }

    @Override // p000.mo7
    public String getReferer() {
        return this.referer_;
    }

    @Override // p000.mo7
    public vj1 getRefererBytes() {
        return vj1.copyFromUtf8(this.referer_);
    }

    @Override // p000.mo7
    public String getRemoteIp() {
        return this.remoteIp_;
    }

    @Override // p000.mo7
    public vj1 getRemoteIpBytes() {
        return vj1.copyFromUtf8(this.remoteIp_);
    }

    @Override // p000.mo7
    public String getRequestMethod() {
        return this.requestMethod_;
    }

    @Override // p000.mo7
    public vj1 getRequestMethodBytes() {
        return vj1.copyFromUtf8(this.requestMethod_);
    }

    @Override // p000.mo7
    public long getRequestSize() {
        return this.requestSize_;
    }

    @Override // p000.mo7
    public String getRequestUrl() {
        return this.requestUrl_;
    }

    @Override // p000.mo7
    public vj1 getRequestUrlBytes() {
        return vj1.copyFromUtf8(this.requestUrl_);
    }

    @Override // p000.mo7
    public long getResponseSize() {
        return this.responseSize_;
    }

    @Override // p000.mo7
    public String getServerIp() {
        return this.serverIp_;
    }

    @Override // p000.mo7
    public vj1 getServerIpBytes() {
        return vj1.copyFromUtf8(this.serverIp_);
    }

    @Override // p000.mo7
    public int getStatus() {
        return this.status_;
    }

    @Override // p000.mo7
    public String getUserAgent() {
        return this.userAgent_;
    }

    @Override // p000.mo7
    public vj1 getUserAgentBytes() {
        return vj1.copyFromUtf8(this.userAgent_);
    }

    @Override // p000.mo7
    public boolean hasLatency() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8474a c8474a = null;
        switch (C8474a.f54836a[enumC13830i.ordinal()]) {
            case 1:
                return new ko7();
            case 2:
                return new C8475b(c8474a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0004\u0005\u0002\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\u0007\u000b\u0007\f\u0002\rȈ\u000eဉ\u0000\u000fȈ", new Object[]{"bitField0_", "requestMethod_", "requestUrl_", "requestSize_", "status_", "responseSize_", "userAgent_", "remoteIp_", "referer_", "cacheHit_", "cacheValidatedWithOriginServer_", "cacheLookup_", "cacheFillBytes_", "serverIp_", "latency_", "protocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<ko7> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (ko7.class) {
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

    public static C8475b newBuilder(ko7 ko7Var) {
        return DEFAULT_INSTANCE.m23739o(ko7Var);
    }

    public static ko7 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ko7) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ko7 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (ko7) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static ko7 parseFrom(vj1 vj1Var) throws ce8 {
        return (ko7) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static ko7 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (ko7) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static ko7 parseFrom(byte[] bArr) throws ce8 {
        return (ko7) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static ko7 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (ko7) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static ko7 parseFrom(InputStream inputStream) throws IOException {
        return (ko7) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static ko7 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ko7) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ko7 parseFrom(f72 f72Var) throws IOException {
        return (ko7) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static ko7 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (ko7) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
