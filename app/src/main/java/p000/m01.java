package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class m01 extends v27<m01, C9065b> implements n01 {
    private static final m01 DEFAULT_INSTANCE;
    private static volatile uhc<m01> PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 1;
    private vj1 transaction_ = vj1.f91344e;

    /* JADX INFO: renamed from: m01$a */
    public static /* synthetic */ class C9064a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59517a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f59517a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59517a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59517a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59517a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59517a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59517a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f59517a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: m01$b */
    public static final class C9065b extends v27.AbstractC13823b<m01, C9065b> implements n01 {
        public /* synthetic */ C9065b(C9064a c9064a) {
            this();
        }

        public C9065b clearTransaction() {
            m23743e();
            ((m01) this.f89756b).clearTransaction();
            return this;
        }

        @Override // p000.n01
        public vj1 getTransaction() {
            return ((m01) this.f89756b).getTransaction();
        }

        public C9065b setTransaction(vj1 vj1Var) {
            m23743e();
            ((m01) this.f89756b).setTransaction(vj1Var);
            return this;
        }

        private C9065b() {
            super(m01.DEFAULT_INSTANCE);
        }
    }

    static {
        m01 m01Var = new m01();
        DEFAULT_INSTANCE = m01Var;
        v27.m23715h0(m01.class, m01Var);
    }

    private m01() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        this.transaction_ = getDefaultInstance().getTransaction();
    }

    public static m01 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C9065b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static m01 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (m01) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static m01 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (m01) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<m01> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(vj1 vj1Var) {
        vj1Var.getClass();
        this.transaction_ = vj1Var;
    }

    @Override // p000.n01
    public vj1 getTransaction() {
        return this.transaction_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C9064a c9064a = null;
        switch (C9064a.f59517a[enumC13830i.ordinal()]) {
            case 1:
                return new m01();
            case 2:
                return new C9065b(c9064a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"transaction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<m01> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (m01.class) {
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

    public static C9065b newBuilder(m01 m01Var) {
        return DEFAULT_INSTANCE.m23739o(m01Var);
    }

    public static m01 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (m01) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static m01 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (m01) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static m01 parseFrom(vj1 vj1Var) throws ce8 {
        return (m01) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static m01 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (m01) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static m01 parseFrom(byte[] bArr) throws ce8 {
        return (m01) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static m01 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (m01) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static m01 parseFrom(InputStream inputStream) throws IOException {
        return (m01) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static m01 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (m01) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static m01 parseFrom(f72 f72Var) throws IOException {
        return (m01) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static m01 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (m01) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
