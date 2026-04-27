package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class g1h extends v27<g1h, C6091b> implements h1h {
    private static final g1h DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile uhc<g1h> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String id_ = "";
    private String version_ = "";

    /* JADX INFO: renamed from: g1h$a */
    public static /* synthetic */ class C6090a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38275a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f38275a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38275a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38275a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38275a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38275a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38275a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38275a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: g1h$b */
    public static final class C6091b extends v27.AbstractC13823b<g1h, C6091b> implements h1h {
        public /* synthetic */ C6091b(C6090a c6090a) {
            this();
        }

        public C6091b clearId() {
            m23743e();
            ((g1h) this.f89756b).clearId();
            return this;
        }

        public C6091b clearVersion() {
            m23743e();
            ((g1h) this.f89756b).clearVersion();
            return this;
        }

        @Override // p000.h1h
        public String getId() {
            return ((g1h) this.f89756b).getId();
        }

        @Override // p000.h1h
        public vj1 getIdBytes() {
            return ((g1h) this.f89756b).getIdBytes();
        }

        @Override // p000.h1h
        public String getVersion() {
            return ((g1h) this.f89756b).getVersion();
        }

        @Override // p000.h1h
        public vj1 getVersionBytes() {
            return ((g1h) this.f89756b).getVersionBytes();
        }

        public C6091b setId(String str) {
            m23743e();
            ((g1h) this.f89756b).setId(str);
            return this;
        }

        public C6091b setIdBytes(vj1 vj1Var) {
            m23743e();
            ((g1h) this.f89756b).setIdBytes(vj1Var);
            return this;
        }

        public C6091b setVersion(String str) {
            m23743e();
            ((g1h) this.f89756b).setVersion(str);
            return this;
        }

        public C6091b setVersionBytes(vj1 vj1Var) {
            m23743e();
            ((g1h) this.f89756b).setVersionBytes(vj1Var);
            return this;
        }

        private C6091b() {
            super(g1h.DEFAULT_INSTANCE);
        }
    }

    static {
        g1h g1hVar = new g1h();
        DEFAULT_INSTANCE = g1hVar;
        v27.m23715h0(g1h.class, g1hVar);
    }

    private g1h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    public static g1h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6091b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static g1h parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (g1h) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static g1h parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (g1h) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<g1h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.version_ = vj1Var.toStringUtf8();
    }

    @Override // p000.h1h
    public String getId() {
        return this.id_;
    }

    @Override // p000.h1h
    public vj1 getIdBytes() {
        return vj1.copyFromUtf8(this.id_);
    }

    @Override // p000.h1h
    public String getVersion() {
        return this.version_;
    }

    @Override // p000.h1h
    public vj1 getVersionBytes() {
        return vj1.copyFromUtf8(this.version_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C6090a c6090a = null;
        switch (C6090a.f38275a[enumC13830i.ordinal()]) {
            case 1:
                return new g1h();
            case 2:
                return new C6091b(c6090a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"id_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<g1h> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (g1h.class) {
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

    public static C6091b newBuilder(g1h g1hVar) {
        return DEFAULT_INSTANCE.m23739o(g1hVar);
    }

    public static g1h parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (g1h) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static g1h parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (g1h) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static g1h parseFrom(vj1 vj1Var) throws ce8 {
        return (g1h) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static g1h parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (g1h) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static g1h parseFrom(byte[] bArr) throws ce8 {
        return (g1h) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static g1h parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (g1h) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static g1h parseFrom(InputStream inputStream) throws IOException {
        return (g1h) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static g1h parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (g1h) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static g1h parseFrom(f72 f72Var) throws IOException {
        return (g1h) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static g1h parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (g1h) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
