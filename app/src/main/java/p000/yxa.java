package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class yxa extends v27<yxa, C15868b> implements zxa {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
    private static final yxa DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 3;
    private static volatile uhc<yxa> PARSER = null;
    public static final int UNITS_FIELD_NUMBER = 2;
    private String currencyCode_ = "";
    private int nanos_;
    private long units_;

    /* JADX INFO: renamed from: yxa$a */
    public static /* synthetic */ class C15867a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f103247a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f103247a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103247a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103247a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f103247a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f103247a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f103247a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f103247a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: yxa$b */
    public static final class C15868b extends v27.AbstractC13823b<yxa, C15868b> implements zxa {
        public /* synthetic */ C15868b(C15867a c15867a) {
            this();
        }

        public C15868b clearCurrencyCode() {
            m23743e();
            ((yxa) this.f89756b).clearCurrencyCode();
            return this;
        }

        public C15868b clearNanos() {
            m23743e();
            ((yxa) this.f89756b).clearNanos();
            return this;
        }

        public C15868b clearUnits() {
            m23743e();
            ((yxa) this.f89756b).clearUnits();
            return this;
        }

        @Override // p000.zxa
        public String getCurrencyCode() {
            return ((yxa) this.f89756b).getCurrencyCode();
        }

        @Override // p000.zxa
        public vj1 getCurrencyCodeBytes() {
            return ((yxa) this.f89756b).getCurrencyCodeBytes();
        }

        @Override // p000.zxa
        public int getNanos() {
            return ((yxa) this.f89756b).getNanos();
        }

        @Override // p000.zxa
        public long getUnits() {
            return ((yxa) this.f89756b).getUnits();
        }

        public C15868b setCurrencyCode(String str) {
            m23743e();
            ((yxa) this.f89756b).setCurrencyCode(str);
            return this;
        }

        public C15868b setCurrencyCodeBytes(vj1 vj1Var) {
            m23743e();
            ((yxa) this.f89756b).setCurrencyCodeBytes(vj1Var);
            return this;
        }

        public C15868b setNanos(int i) {
            m23743e();
            ((yxa) this.f89756b).setNanos(i);
            return this;
        }

        public C15868b setUnits(long j) {
            m23743e();
            ((yxa) this.f89756b).setUnits(j);
            return this;
        }

        private C15868b() {
            super(yxa.DEFAULT_INSTANCE);
        }
    }

    static {
        yxa yxaVar = new yxa();
        DEFAULT_INSTANCE = yxaVar;
        v27.m23715h0(yxa.class, yxaVar);
    }

    private yxa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrencyCode() {
        this.currencyCode_ = getDefaultInstance().getCurrencyCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnits() {
        this.units_ = 0L;
    }

    public static yxa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C15868b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static yxa parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (yxa) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static yxa parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (yxa) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<yxa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyCode(String str) {
        str.getClass();
        this.currencyCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyCodeBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.currencyCode_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int i) {
        this.nanos_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnits(long j) {
        this.units_ = j;
    }

    @Override // p000.zxa
    public String getCurrencyCode() {
        return this.currencyCode_;
    }

    @Override // p000.zxa
    public vj1 getCurrencyCodeBytes() {
        return vj1.copyFromUtf8(this.currencyCode_);
    }

    @Override // p000.zxa
    public int getNanos() {
        return this.nanos_;
    }

    @Override // p000.zxa
    public long getUnits() {
        return this.units_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C15867a c15867a = null;
        switch (C15867a.f103247a[enumC13830i.ordinal()]) {
            case 1:
                return new yxa();
            case 2:
                return new C15868b(c15867a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"currencyCode_", "units_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<yxa> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (yxa.class) {
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

    public static C15868b newBuilder(yxa yxaVar) {
        return DEFAULT_INSTANCE.m23739o(yxaVar);
    }

    public static yxa parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (yxa) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static yxa parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (yxa) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static yxa parseFrom(vj1 vj1Var) throws ce8 {
        return (yxa) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static yxa parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (yxa) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static yxa parseFrom(byte[] bArr) throws ce8 {
        return (yxa) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static yxa parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (yxa) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static yxa parseFrom(InputStream inputStream) throws IOException {
        return (yxa) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static yxa parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (yxa) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static yxa parseFrom(f72 f72Var) throws IOException {
        return (yxa) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static yxa parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (yxa) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
