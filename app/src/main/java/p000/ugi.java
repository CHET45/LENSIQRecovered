package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.at4;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class ugi extends v27<ugi, C13539b> implements vgi {
    private static final ugi DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<ugi> PARSER = null;
    public static final int TIMEOUT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private at4 timeout_;

    /* JADX INFO: renamed from: ugi$a */
    public static /* synthetic */ class C13538a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f87992a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f87992a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87992a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87992a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87992a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f87992a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f87992a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f87992a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: ugi$b */
    public static final class C13539b extends v27.AbstractC13823b<ugi, C13539b> implements vgi {
        public /* synthetic */ C13539b(C13538a c13538a) {
            this();
        }

        public C13539b clearName() {
            m23743e();
            ((ugi) this.f89756b).clearName();
            return this;
        }

        public C13539b clearTimeout() {
            m23743e();
            ((ugi) this.f89756b).clearTimeout();
            return this;
        }

        @Override // p000.vgi
        public String getName() {
            return ((ugi) this.f89756b).getName();
        }

        @Override // p000.vgi
        public vj1 getNameBytes() {
            return ((ugi) this.f89756b).getNameBytes();
        }

        @Override // p000.vgi
        public at4 getTimeout() {
            return ((ugi) this.f89756b).getTimeout();
        }

        @Override // p000.vgi
        public boolean hasTimeout() {
            return ((ugi) this.f89756b).hasTimeout();
        }

        public C13539b mergeTimeout(at4 at4Var) {
            m23743e();
            ((ugi) this.f89756b).mergeTimeout(at4Var);
            return this;
        }

        public C13539b setName(String str) {
            m23743e();
            ((ugi) this.f89756b).setName(str);
            return this;
        }

        public C13539b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((ugi) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C13539b setTimeout(at4 at4Var) {
            m23743e();
            ((ugi) this.f89756b).setTimeout(at4Var);
            return this;
        }

        private C13539b() {
            super(ugi.DEFAULT_INSTANCE);
        }

        public C13539b setTimeout(at4.C1602b c1602b) {
            m23743e();
            ((ugi) this.f89756b).setTimeout(c1602b.build());
            return this;
        }
    }

    static {
        ugi ugiVar = new ugi();
        DEFAULT_INSTANCE = ugiVar;
        v27.m23715h0(ugi.class, ugiVar);
    }

    private ugi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeout() {
        this.timeout_ = null;
        this.bitField0_ &= -2;
    }

    public static ugi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeout(at4 at4Var) {
        at4Var.getClass();
        at4 at4Var2 = this.timeout_;
        if (at4Var2 == null || at4Var2 == at4.getDefaultInstance()) {
            this.timeout_ = at4Var;
        } else {
            this.timeout_ = at4.newBuilder(this.timeout_).mergeFrom(at4Var).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C13539b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static ugi parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ugi) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static ugi parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (ugi) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<ugi> parser() {
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
    public void setTimeout(at4 at4Var) {
        at4Var.getClass();
        this.timeout_ = at4Var;
        this.bitField0_ |= 1;
    }

    @Override // p000.vgi
    public String getName() {
        return this.name_;
    }

    @Override // p000.vgi
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.vgi
    public at4 getTimeout() {
        at4 at4Var = this.timeout_;
        return at4Var == null ? at4.getDefaultInstance() : at4Var;
    }

    @Override // p000.vgi
    public boolean hasTimeout() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C13538a c13538a = null;
        switch (C13538a.f87992a[enumC13830i.ordinal()]) {
            case 1:
                return new ugi();
            case 2:
                return new C13539b(c13538a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "timeout_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<ugi> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (ugi.class) {
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

    public static C13539b newBuilder(ugi ugiVar) {
        return DEFAULT_INSTANCE.m23739o(ugiVar);
    }

    public static ugi parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ugi) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ugi parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (ugi) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static ugi parseFrom(vj1 vj1Var) throws ce8 {
        return (ugi) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static ugi parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (ugi) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static ugi parseFrom(byte[] bArr) throws ce8 {
        return (ugi) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static ugi parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (ugi) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static ugi parseFrom(InputStream inputStream) throws IOException {
        return (ugi) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static ugi parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ugi) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ugi parseFrom(f72 f72Var) throws IOException {
        return (ugi) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static ugi parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (ugi) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
