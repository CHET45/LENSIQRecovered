package p000;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
@uw7
public final class rua<ReqT, RespT> {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ boolean f79646k = false;

    /* JADX INFO: renamed from: a */
    public final EnumC12303d f79647a;

    /* JADX INFO: renamed from: b */
    public final String f79648b;

    /* JADX INFO: renamed from: c */
    @eib
    public final String f79649c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC12302c<ReqT> f79650d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC12302c<RespT> f79651e;

    /* JADX INFO: renamed from: f */
    @eib
    public final Object f79652f;

    /* JADX INFO: renamed from: g */
    public final boolean f79653g;

    /* JADX INFO: renamed from: h */
    public final boolean f79654h;

    /* JADX INFO: renamed from: i */
    public final boolean f79655i;

    /* JADX INFO: renamed from: j */
    public final AtomicReferenceArray<Object> f79656j;

    /* JADX INFO: renamed from: rua$b */
    public static final class C12301b<ReqT, RespT> {

        /* JADX INFO: renamed from: a */
        public InterfaceC12302c<ReqT> f79657a;

        /* JADX INFO: renamed from: b */
        public InterfaceC12302c<RespT> f79658b;

        /* JADX INFO: renamed from: c */
        public EnumC12303d f79659c;

        /* JADX INFO: renamed from: d */
        public String f79660d;

        /* JADX INFO: renamed from: e */
        public boolean f79661e;

        /* JADX INFO: renamed from: f */
        public boolean f79662f;

        /* JADX INFO: renamed from: g */
        public Object f79663g;

        /* JADX INFO: renamed from: h */
        public boolean f79664h;

        @dy1
        public rua<ReqT, RespT> build() {
            return new rua<>(this.f79659c, this.f79660d, this.f79657a, this.f79658b, this.f79663g, this.f79661e, this.f79662f, this.f79664h);
        }

        public C12301b<ReqT, RespT> setFullMethodName(String str) {
            this.f79660d = str;
            return this;
        }

        public C12301b<ReqT, RespT> setIdempotent(boolean z) {
            this.f79661e = z;
            if (!z) {
                this.f79662f = false;
            }
            return this;
        }

        public C12301b<ReqT, RespT> setRequestMarshaller(InterfaceC12302c<ReqT> interfaceC12302c) {
            this.f79657a = interfaceC12302c;
            return this;
        }

        public C12301b<ReqT, RespT> setResponseMarshaller(InterfaceC12302c<RespT> interfaceC12302c) {
            this.f79658b = interfaceC12302c;
            return this;
        }

        public C12301b<ReqT, RespT> setSafe(boolean z) {
            this.f79662f = z;
            if (z) {
                this.f79661e = true;
            }
            return this;
        }

        public C12301b<ReqT, RespT> setSampledToLocalTracing(boolean z) {
            this.f79664h = z;
            return this;
        }

        public C12301b<ReqT, RespT> setSchemaDescriptor(@eib Object obj) {
            this.f79663g = obj;
            return this;
        }

        public C12301b<ReqT, RespT> setType(EnumC12303d enumC12303d) {
            this.f79659c = enumC12303d;
            return this;
        }

        private C12301b() {
        }
    }

    /* JADX INFO: renamed from: rua$c */
    public interface InterfaceC12302c<T> {
        T parse(InputStream inputStream);

        InputStream stream(T t);
    }

    /* JADX INFO: renamed from: rua$d */
    public enum EnumC12303d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        public final boolean clientSendsOneMessage() {
            return this == UNARY || this == SERVER_STREAMING;
        }

        public final boolean serverSendsOneMessage() {
            return this == UNARY || this == CLIENT_STREAMING;
        }
    }

    /* JADX INFO: renamed from: rua$e */
    @lg5("https://github.com/grpc/grpc-java/issues/2222")
    public interface InterfaceC12304e<T> extends InterfaceC12305f<T> {
        @eib
        T getMessagePrototype();
    }

    /* JADX INFO: renamed from: rua$f */
    @lg5("https://github.com/grpc/grpc-java/issues/2222")
    public interface InterfaceC12305f<T> extends InterfaceC12302c<T> {
        Class<T> getMessageClass();
    }

    @Deprecated
    public static <RequestT, ResponseT> rua<RequestT, ResponseT> create(EnumC12303d enumC12303d, String str, InterfaceC12302c<RequestT> interfaceC12302c, InterfaceC12302c<ResponseT> interfaceC12302c2) {
        return new rua<>(enumC12303d, str, interfaceC12302c, interfaceC12302c2, null, false, false, false);
    }

    @lg5("https://github.com/grpc/grpc-java/issues/5635")
    @eib
    public static String extractBareMethodName(String str) {
        int iLastIndexOf = ((String) v7d.checkNotNull(str, "fullMethodName")).lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    @eib
    public static String extractFullServiceName(String str) {
        int iLastIndexOf = ((String) v7d.checkNotNull(str, "fullMethodName")).lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return null;
        }
        return str.substring(0, iLastIndexOf);
    }

    public static String generateFullMethodName(String str, String str2) {
        return ((String) v7d.checkNotNull(str, "fullServiceName")) + pj4.f71071b + ((String) v7d.checkNotNull(str2, "methodName"));
    }

    @dy1
    public static <ReqT, RespT> C12301b<ReqT, RespT> newBuilder() {
        return newBuilder(null, null);
    }

    /* JADX INFO: renamed from: a */
    public final Object m21570a(int i) {
        return this.f79656j.get(i);
    }

    /* JADX INFO: renamed from: b */
    public final void m21571b(int i, Object obj) {
        this.f79656j.lazySet(i, obj);
    }

    @lg5("https://github.com/grpc/grpc-java/issues/5635")
    @eib
    public String getBareMethodName() {
        return extractBareMethodName(this.f79648b);
    }

    public String getFullMethodName() {
        return this.f79648b;
    }

    public InterfaceC12302c<ReqT> getRequestMarshaller() {
        return this.f79650d;
    }

    public InterfaceC12302c<RespT> getResponseMarshaller() {
        return this.f79651e;
    }

    @eib
    public Object getSchemaDescriptor() {
        return this.f79652f;
    }

    @lg5("https://github.com/grpc/grpc-java/issues/5635")
    @eib
    public String getServiceName() {
        return this.f79649c;
    }

    public EnumC12303d getType() {
        return this.f79647a;
    }

    public boolean isIdempotent() {
        return this.f79653g;
    }

    public boolean isSafe() {
        return this.f79654h;
    }

    public boolean isSampledToLocalTracing() {
        return this.f79655i;
    }

    public ReqT parseRequest(InputStream inputStream) {
        return this.f79650d.parse(inputStream);
    }

    public RespT parseResponse(InputStream inputStream) {
        return this.f79651e.parse(inputStream);
    }

    public InputStream streamRequest(ReqT reqt) {
        return this.f79650d.stream(reqt);
    }

    public InputStream streamResponse(RespT respt) {
        return this.f79651e.stream(respt);
    }

    @dy1
    public C12301b<ReqT, RespT> toBuilder() {
        return (C12301b<ReqT, RespT>) toBuilder(this.f79650d, this.f79651e);
    }

    public String toString() {
        return yya.toStringHelper(this).add("fullMethodName", this.f79648b).add("type", this.f79647a).add("idempotent", this.f79653g).add("safe", this.f79654h).add("sampledToLocalTracing", this.f79655i).add("requestMarshaller", this.f79650d).add("responseMarshaller", this.f79651e).add("schemaDescriptor", this.f79652f).omitNullValues().toString();
    }

    private rua(EnumC12303d enumC12303d, String str, InterfaceC12302c<ReqT> interfaceC12302c, InterfaceC12302c<RespT> interfaceC12302c2, Object obj, boolean z, boolean z2, boolean z3) {
        this.f79656j = new AtomicReferenceArray<>(2);
        this.f79647a = (EnumC12303d) v7d.checkNotNull(enumC12303d, "type");
        this.f79648b = (String) v7d.checkNotNull(str, "fullMethodName");
        this.f79649c = extractFullServiceName(str);
        this.f79650d = (InterfaceC12302c) v7d.checkNotNull(interfaceC12302c, "requestMarshaller");
        this.f79651e = (InterfaceC12302c) v7d.checkNotNull(interfaceC12302c2, "responseMarshaller");
        this.f79652f = obj;
        this.f79653g = z;
        this.f79654h = z2;
        this.f79655i = z3;
    }

    @dy1
    public static <ReqT, RespT> C12301b<ReqT, RespT> newBuilder(InterfaceC12302c<ReqT> interfaceC12302c, InterfaceC12302c<RespT> interfaceC12302c2) {
        return new C12301b().setRequestMarshaller(interfaceC12302c).setResponseMarshaller(interfaceC12302c2);
    }

    @dy1
    public <NewReqT, NewRespT> C12301b<NewReqT, NewRespT> toBuilder(InterfaceC12302c<NewReqT> interfaceC12302c, InterfaceC12302c<NewRespT> interfaceC12302c2) {
        return newBuilder().setRequestMarshaller(interfaceC12302c).setResponseMarshaller(interfaceC12302c2).setType(this.f79647a).setFullMethodName(this.f79648b).setIdempotent(this.f79653g).setSafe(this.f79654h).setSampledToLocalTracing(this.f79655i).setSchemaDescriptor(this.f79652f);
    }
}
