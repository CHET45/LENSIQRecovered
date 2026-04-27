package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class du6 extends v27<du6, C4950b> implements eu6 {
    private static final du6 DEFAULT_INSTANCE;
    public static final int DENOMINATOR_FIELD_NUMBER = 2;
    public static final int NUMERATOR_FIELD_NUMBER = 1;
    private static volatile uhc<du6> PARSER;
    private long denominator_;
    private long numerator_;

    /* JADX INFO: renamed from: du6$a */
    public static /* synthetic */ class C4949a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30880a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f30880a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30880a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30880a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30880a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30880a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30880a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30880a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: du6$b */
    public static final class C4950b extends v27.AbstractC13823b<du6, C4950b> implements eu6 {
        public /* synthetic */ C4950b(C4949a c4949a) {
            this();
        }

        public C4950b clearDenominator() {
            m23743e();
            ((du6) this.f89756b).clearDenominator();
            return this;
        }

        public C4950b clearNumerator() {
            m23743e();
            ((du6) this.f89756b).clearNumerator();
            return this;
        }

        @Override // p000.eu6
        public long getDenominator() {
            return ((du6) this.f89756b).getDenominator();
        }

        @Override // p000.eu6
        public long getNumerator() {
            return ((du6) this.f89756b).getNumerator();
        }

        public C4950b setDenominator(long j) {
            m23743e();
            ((du6) this.f89756b).setDenominator(j);
            return this;
        }

        public C4950b setNumerator(long j) {
            m23743e();
            ((du6) this.f89756b).setNumerator(j);
            return this;
        }

        private C4950b() {
            super(du6.DEFAULT_INSTANCE);
        }
    }

    static {
        du6 du6Var = new du6();
        DEFAULT_INSTANCE = du6Var;
        v27.m23715h0(du6.class, du6Var);
    }

    private du6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDenominator() {
        this.denominator_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumerator() {
        this.numerator_ = 0L;
    }

    public static du6 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4950b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static du6 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (du6) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static du6 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (du6) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<du6> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDenominator(long j) {
        this.denominator_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumerator(long j) {
        this.numerator_ = j;
    }

    @Override // p000.eu6
    public long getDenominator() {
        return this.denominator_;
    }

    @Override // p000.eu6
    public long getNumerator() {
        return this.numerator_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C4949a c4949a = null;
        switch (C4949a.f30880a[enumC13830i.ordinal()]) {
            case 1:
                return new du6();
            case 2:
                return new C4950b(c4949a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"numerator_", "denominator_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<du6> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (du6.class) {
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

    public static C4950b newBuilder(du6 du6Var) {
        return DEFAULT_INSTANCE.m23739o(du6Var);
    }

    public static du6 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (du6) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static du6 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (du6) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static du6 parseFrom(vj1 vj1Var) throws ce8 {
        return (du6) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static du6 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (du6) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static du6 parseFrom(byte[] bArr) throws ce8 {
        return (du6) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static du6 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (du6) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static du6 parseFrom(InputStream inputStream) throws IOException {
        return (du6) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static du6 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (du6) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static du6 parseFrom(f72 f72Var) throws IOException {
        return (du6) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static du6 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (du6) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
