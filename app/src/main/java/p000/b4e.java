package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class b4e extends v27<b4e, C1738b> implements c4e {
    private static final b4e DEFAULT_INSTANCE;
    private static volatile uhc<b4e> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SERVING_DATA_FIELD_NUMBER = 2;
    private String requestId_ = "";
    private String servingData_ = "";

    /* JADX INFO: renamed from: b4e$a */
    public static /* synthetic */ class C1737a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12678a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f12678a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12678a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12678a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12678a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12678a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12678a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12678a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: b4e$b */
    public static final class C1738b extends v27.AbstractC13823b<b4e, C1738b> implements c4e {
        public /* synthetic */ C1738b(C1737a c1737a) {
            this();
        }

        public C1738b clearRequestId() {
            m23743e();
            ((b4e) this.f89756b).clearRequestId();
            return this;
        }

        public C1738b clearServingData() {
            m23743e();
            ((b4e) this.f89756b).clearServingData();
            return this;
        }

        @Override // p000.c4e
        public String getRequestId() {
            return ((b4e) this.f89756b).getRequestId();
        }

        @Override // p000.c4e
        public vj1 getRequestIdBytes() {
            return ((b4e) this.f89756b).getRequestIdBytes();
        }

        @Override // p000.c4e
        public String getServingData() {
            return ((b4e) this.f89756b).getServingData();
        }

        @Override // p000.c4e
        public vj1 getServingDataBytes() {
            return ((b4e) this.f89756b).getServingDataBytes();
        }

        public C1738b setRequestId(String str) {
            m23743e();
            ((b4e) this.f89756b).setRequestId(str);
            return this;
        }

        public C1738b setRequestIdBytes(vj1 vj1Var) {
            m23743e();
            ((b4e) this.f89756b).setRequestIdBytes(vj1Var);
            return this;
        }

        public C1738b setServingData(String str) {
            m23743e();
            ((b4e) this.f89756b).setServingData(str);
            return this;
        }

        public C1738b setServingDataBytes(vj1 vj1Var) {
            m23743e();
            ((b4e) this.f89756b).setServingDataBytes(vj1Var);
            return this;
        }

        private C1738b() {
            super(b4e.DEFAULT_INSTANCE);
        }
    }

    static {
        b4e b4eVar = new b4e();
        DEFAULT_INSTANCE = b4eVar;
        v27.m23715h0(b4e.class, b4eVar);
    }

    private b4e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServingData() {
        this.servingData_ = getDefaultInstance().getServingData();
    }

    public static b4e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C1738b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static b4e parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (b4e) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static b4e parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (b4e) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<b4e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestIdBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.requestId_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServingData(String str) {
        str.getClass();
        this.servingData_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServingDataBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.servingData_ = vj1Var.toStringUtf8();
    }

    @Override // p000.c4e
    public String getRequestId() {
        return this.requestId_;
    }

    @Override // p000.c4e
    public vj1 getRequestIdBytes() {
        return vj1.copyFromUtf8(this.requestId_);
    }

    @Override // p000.c4e
    public String getServingData() {
        return this.servingData_;
    }

    @Override // p000.c4e
    public vj1 getServingDataBytes() {
        return vj1.copyFromUtf8(this.servingData_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C1737a c1737a = null;
        switch (C1737a.f12678a[enumC13830i.ordinal()]) {
            case 1:
                return new b4e();
            case 2:
                return new C1738b(c1737a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"requestId_", "servingData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<b4e> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (b4e.class) {
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

    public static C1738b newBuilder(b4e b4eVar) {
        return DEFAULT_INSTANCE.m23739o(b4eVar);
    }

    public static b4e parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (b4e) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static b4e parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (b4e) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static b4e parseFrom(vj1 vj1Var) throws ce8 {
        return (b4e) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static b4e parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (b4e) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static b4e parseFrom(byte[] bArr) throws ce8 {
        return (b4e) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static b4e parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (b4e) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static b4e parseFrom(InputStream inputStream) throws IOException {
        return (b4e) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static b4e parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (b4e) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static b4e parseFrom(f72 f72Var) throws IOException {
        return (b4e) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static b4e parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (b4e) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
