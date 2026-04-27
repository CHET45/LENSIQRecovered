package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.ju8;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class uci extends v27<uci, C13502b> implements vci {
    private static final uci DEFAULT_INSTANCE;
    public static final int HIGH_FIELD_NUMBER = 2;
    public static final int LOW_FIELD_NUMBER = 1;
    private static volatile uhc<uci> PARSER;
    private int bitField0_;
    private ju8 high_;
    private ju8 low_;

    /* JADX INFO: renamed from: uci$a */
    public static /* synthetic */ class C13501a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f87599a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f87599a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87599a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87599a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87599a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f87599a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f87599a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f87599a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: uci$b */
    public static final class C13502b extends v27.AbstractC13823b<uci, C13502b> implements vci {
        public /* synthetic */ C13502b(C13501a c13501a) {
            this();
        }

        public C13502b clearHigh() {
            m23743e();
            ((uci) this.f89756b).clearHigh();
            return this;
        }

        public C13502b clearLow() {
            m23743e();
            ((uci) this.f89756b).clearLow();
            return this;
        }

        @Override // p000.vci
        public ju8 getHigh() {
            return ((uci) this.f89756b).getHigh();
        }

        @Override // p000.vci
        public ju8 getLow() {
            return ((uci) this.f89756b).getLow();
        }

        @Override // p000.vci
        public boolean hasHigh() {
            return ((uci) this.f89756b).hasHigh();
        }

        @Override // p000.vci
        public boolean hasLow() {
            return ((uci) this.f89756b).hasLow();
        }

        public C13502b mergeHigh(ju8 ju8Var) {
            m23743e();
            ((uci) this.f89756b).mergeHigh(ju8Var);
            return this;
        }

        public C13502b mergeLow(ju8 ju8Var) {
            m23743e();
            ((uci) this.f89756b).mergeLow(ju8Var);
            return this;
        }

        public C13502b setHigh(ju8 ju8Var) {
            m23743e();
            ((uci) this.f89756b).setHigh(ju8Var);
            return this;
        }

        public C13502b setLow(ju8 ju8Var) {
            m23743e();
            ((uci) this.f89756b).setLow(ju8Var);
            return this;
        }

        private C13502b() {
            super(uci.DEFAULT_INSTANCE);
        }

        public C13502b setHigh(ju8.C8095b c8095b) {
            m23743e();
            ((uci) this.f89756b).setHigh(c8095b.build());
            return this;
        }

        public C13502b setLow(ju8.C8095b c8095b) {
            m23743e();
            ((uci) this.f89756b).setLow(c8095b.build());
            return this;
        }
    }

    static {
        uci uciVar = new uci();
        DEFAULT_INSTANCE = uciVar;
        v27.m23715h0(uci.class, uciVar);
    }

    private uci() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHigh() {
        this.high_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLow() {
        this.low_ = null;
        this.bitField0_ &= -2;
    }

    public static uci getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHigh(ju8 ju8Var) {
        ju8Var.getClass();
        ju8 ju8Var2 = this.high_;
        if (ju8Var2 == null || ju8Var2 == ju8.getDefaultInstance()) {
            this.high_ = ju8Var;
        } else {
            this.high_ = ju8.newBuilder(this.high_).mergeFrom(ju8Var).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLow(ju8 ju8Var) {
        ju8Var.getClass();
        ju8 ju8Var2 = this.low_;
        if (ju8Var2 == null || ju8Var2 == ju8.getDefaultInstance()) {
            this.low_ = ju8Var;
        } else {
            this.low_ = ju8.newBuilder(this.low_).mergeFrom(ju8Var).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C13502b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static uci parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (uci) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static uci parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (uci) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<uci> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHigh(ju8 ju8Var) {
        ju8Var.getClass();
        this.high_ = ju8Var;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLow(ju8 ju8Var) {
        ju8Var.getClass();
        this.low_ = ju8Var;
        this.bitField0_ |= 1;
    }

    @Override // p000.vci
    public ju8 getHigh() {
        ju8 ju8Var = this.high_;
        return ju8Var == null ? ju8.getDefaultInstance() : ju8Var;
    }

    @Override // p000.vci
    public ju8 getLow() {
        ju8 ju8Var = this.low_;
        return ju8Var == null ? ju8.getDefaultInstance() : ju8Var;
    }

    @Override // p000.vci
    public boolean hasHigh() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.vci
    public boolean hasLow() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C13501a c13501a = null;
        switch (C13501a.f87599a[enumC13830i.ordinal()]) {
            case 1:
                return new uci();
            case 2:
                return new C13502b(c13501a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "low_", "high_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<uci> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (uci.class) {
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

    public static C13502b newBuilder(uci uciVar) {
        return DEFAULT_INSTANCE.m23739o(uciVar);
    }

    public static uci parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (uci) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static uci parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (uci) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static uci parseFrom(vj1 vj1Var) throws ce8 {
        return (uci) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static uci parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (uci) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static uci parseFrom(byte[] bArr) throws ce8 {
        return (uci) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static uci parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (uci) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static uci parseFrom(InputStream inputStream) throws IOException {
        return (uci) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static uci parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (uci) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static uci parseFrom(f72 f72Var) throws IOException {
        return (uci) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static uci parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (uci) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
