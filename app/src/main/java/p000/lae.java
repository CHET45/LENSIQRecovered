package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class lae extends v27<lae, C8746b> implements mae {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final lae DEFAULT_INSTANCE;
    private static volatile uhc<lae> PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private String database_ = "";
    private vj1 transaction_ = vj1.f91344e;

    /* JADX INFO: renamed from: lae$a */
    public static /* synthetic */ class C8745a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56991a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f56991a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56991a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56991a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56991a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56991a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56991a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56991a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: lae$b */
    public static final class C8746b extends v27.AbstractC13823b<lae, C8746b> implements mae {
        public /* synthetic */ C8746b(C8745a c8745a) {
            this();
        }

        public C8746b clearDatabase() {
            m23743e();
            ((lae) this.f89756b).clearDatabase();
            return this;
        }

        public C8746b clearTransaction() {
            m23743e();
            ((lae) this.f89756b).clearTransaction();
            return this;
        }

        @Override // p000.mae
        public String getDatabase() {
            return ((lae) this.f89756b).getDatabase();
        }

        @Override // p000.mae
        public vj1 getDatabaseBytes() {
            return ((lae) this.f89756b).getDatabaseBytes();
        }

        @Override // p000.mae
        public vj1 getTransaction() {
            return ((lae) this.f89756b).getTransaction();
        }

        public C8746b setDatabase(String str) {
            m23743e();
            ((lae) this.f89756b).setDatabase(str);
            return this;
        }

        public C8746b setDatabaseBytes(vj1 vj1Var) {
            m23743e();
            ((lae) this.f89756b).setDatabaseBytes(vj1Var);
            return this;
        }

        public C8746b setTransaction(vj1 vj1Var) {
            m23743e();
            ((lae) this.f89756b).setTransaction(vj1Var);
            return this;
        }

        private C8746b() {
            super(lae.DEFAULT_INSTANCE);
        }
    }

    static {
        lae laeVar = new lae();
        DEFAULT_INSTANCE = laeVar;
        v27.m23715h0(lae.class, laeVar);
    }

    private lae() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatabase() {
        this.database_ = getDefaultInstance().getDatabase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        this.transaction_ = getDefaultInstance().getTransaction();
    }

    public static lae getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8746b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static lae parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (lae) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static lae parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (lae) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<lae> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabase(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabaseBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.database_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(vj1 vj1Var) {
        vj1Var.getClass();
        this.transaction_ = vj1Var;
    }

    @Override // p000.mae
    public String getDatabase() {
        return this.database_;
    }

    @Override // p000.mae
    public vj1 getDatabaseBytes() {
        return vj1.copyFromUtf8(this.database_);
    }

    @Override // p000.mae
    public vj1 getTransaction() {
        return this.transaction_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8745a c8745a = null;
        switch (C8745a.f56991a[enumC13830i.ordinal()]) {
            case 1:
                return new lae();
            case 2:
                return new C8746b(c8745a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"database_", "transaction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<lae> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (lae.class) {
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

    public static C8746b newBuilder(lae laeVar) {
        return DEFAULT_INSTANCE.m23739o(laeVar);
    }

    public static lae parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (lae) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static lae parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (lae) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static lae parseFrom(vj1 vj1Var) throws ce8 {
        return (lae) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static lae parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (lae) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static lae parseFrom(byte[] bArr) throws ce8 {
        return (lae) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static lae parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (lae) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static lae parseFrom(InputStream inputStream) throws IOException {
        return (lae) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static lae parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (lae) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static lae parseFrom(f72 f72Var) throws IOException {
        return (lae) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static lae parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (lae) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
