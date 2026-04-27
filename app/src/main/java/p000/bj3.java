package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class bj3 extends v27<bj3, C1919b> implements fj3 {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final bj3 DEFAULT_INSTANCE;
    public static final int MONTH_FIELD_NUMBER = 2;
    private static volatile uhc<bj3> PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int month_;
    private int year_;

    /* JADX INFO: renamed from: bj3$a */
    public static /* synthetic */ class C1918a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13855a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f13855a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13855a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13855a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13855a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13855a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13855a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13855a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: bj3$b */
    public static final class C1919b extends v27.AbstractC13823b<bj3, C1919b> implements fj3 {
        public /* synthetic */ C1919b(C1918a c1918a) {
            this();
        }

        public C1919b clearDay() {
            m23743e();
            ((bj3) this.f89756b).clearDay();
            return this;
        }

        public C1919b clearMonth() {
            m23743e();
            ((bj3) this.f89756b).clearMonth();
            return this;
        }

        public C1919b clearYear() {
            m23743e();
            ((bj3) this.f89756b).clearYear();
            return this;
        }

        @Override // p000.fj3
        public int getDay() {
            return ((bj3) this.f89756b).getDay();
        }

        @Override // p000.fj3
        public int getMonth() {
            return ((bj3) this.f89756b).getMonth();
        }

        @Override // p000.fj3
        public int getYear() {
            return ((bj3) this.f89756b).getYear();
        }

        public C1919b setDay(int i) {
            m23743e();
            ((bj3) this.f89756b).setDay(i);
            return this;
        }

        public C1919b setMonth(int i) {
            m23743e();
            ((bj3) this.f89756b).setMonth(i);
            return this;
        }

        public C1919b setYear(int i) {
            m23743e();
            ((bj3) this.f89756b).setYear(i);
            return this;
        }

        private C1919b() {
            super(bj3.DEFAULT_INSTANCE);
        }
    }

    static {
        bj3 bj3Var = new bj3();
        DEFAULT_INSTANCE = bj3Var;
        v27.m23715h0(bj3.class, bj3Var);
    }

    private bj3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDay() {
        this.day_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonth() {
        this.month_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearYear() {
        this.year_ = 0;
    }

    public static bj3 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C1919b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static bj3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (bj3) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static bj3 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (bj3) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<bj3> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDay(int i) {
        this.day_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonth(int i) {
        this.month_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYear(int i) {
        this.year_ = i;
    }

    @Override // p000.fj3
    public int getDay() {
        return this.day_;
    }

    @Override // p000.fj3
    public int getMonth() {
        return this.month_;
    }

    @Override // p000.fj3
    public int getYear() {
        return this.year_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C1918a c1918a = null;
        switch (C1918a.f13855a[enumC13830i.ordinal()]) {
            case 1:
                return new bj3();
            case 2:
                return new C1919b(c1918a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"year_", "month_", "day_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<bj3> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (bj3.class) {
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

    public static C1919b newBuilder(bj3 bj3Var) {
        return DEFAULT_INSTANCE.m23739o(bj3Var);
    }

    public static bj3 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (bj3) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static bj3 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (bj3) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static bj3 parseFrom(vj1 vj1Var) throws ce8 {
        return (bj3) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static bj3 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (bj3) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static bj3 parseFrom(byte[] bArr) throws ce8 {
        return (bj3) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static bj3 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (bj3) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static bj3 parseFrom(InputStream inputStream) throws IOException {
        return (bj3) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static bj3 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (bj3) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static bj3 parseFrom(f72 f72Var) throws IOException {
        return (bj3) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static bj3 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (bj3) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
