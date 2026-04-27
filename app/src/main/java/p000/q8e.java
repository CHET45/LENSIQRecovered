package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.at4;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class q8e extends v27<q8e, C11385b> implements r8e {
    private static final q8e DEFAULT_INSTANCE;
    private static volatile uhc<q8e> PARSER = null;
    public static final int RETRY_DELAY_FIELD_NUMBER = 1;
    private int bitField0_;
    private at4 retryDelay_;

    /* JADX INFO: renamed from: q8e$a */
    public static /* synthetic */ class C11384a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f73626a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f73626a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73626a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73626a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f73626a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f73626a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f73626a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f73626a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: q8e$b */
    public static final class C11385b extends v27.AbstractC13823b<q8e, C11385b> implements r8e {
        public /* synthetic */ C11385b(C11384a c11384a) {
            this();
        }

        public C11385b clearRetryDelay() {
            m23743e();
            ((q8e) this.f89756b).clearRetryDelay();
            return this;
        }

        @Override // p000.r8e
        public at4 getRetryDelay() {
            return ((q8e) this.f89756b).getRetryDelay();
        }

        @Override // p000.r8e
        public boolean hasRetryDelay() {
            return ((q8e) this.f89756b).hasRetryDelay();
        }

        public C11385b mergeRetryDelay(at4 at4Var) {
            m23743e();
            ((q8e) this.f89756b).mergeRetryDelay(at4Var);
            return this;
        }

        public C11385b setRetryDelay(at4 at4Var) {
            m23743e();
            ((q8e) this.f89756b).setRetryDelay(at4Var);
            return this;
        }

        private C11385b() {
            super(q8e.DEFAULT_INSTANCE);
        }

        public C11385b setRetryDelay(at4.C1602b c1602b) {
            m23743e();
            ((q8e) this.f89756b).setRetryDelay(c1602b.build());
            return this;
        }
    }

    static {
        q8e q8eVar = new q8e();
        DEFAULT_INSTANCE = q8eVar;
        v27.m23715h0(q8e.class, q8eVar);
    }

    private q8e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetryDelay() {
        this.retryDelay_ = null;
        this.bitField0_ &= -2;
    }

    public static q8e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRetryDelay(at4 at4Var) {
        at4Var.getClass();
        at4 at4Var2 = this.retryDelay_;
        if (at4Var2 == null || at4Var2 == at4.getDefaultInstance()) {
            this.retryDelay_ = at4Var;
        } else {
            this.retryDelay_ = at4.newBuilder(this.retryDelay_).mergeFrom(at4Var).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C11385b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static q8e parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (q8e) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static q8e parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (q8e) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<q8e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetryDelay(at4 at4Var) {
        at4Var.getClass();
        this.retryDelay_ = at4Var;
        this.bitField0_ |= 1;
    }

    @Override // p000.r8e
    public at4 getRetryDelay() {
        at4 at4Var = this.retryDelay_;
        return at4Var == null ? at4.getDefaultInstance() : at4Var;
    }

    @Override // p000.r8e
    public boolean hasRetryDelay() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C11384a c11384a = null;
        switch (C11384a.f73626a[enumC13830i.ordinal()]) {
            case 1:
                return new q8e();
            case 2:
                return new C11385b(c11384a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "retryDelay_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<q8e> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (q8e.class) {
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

    public static C11385b newBuilder(q8e q8eVar) {
        return DEFAULT_INSTANCE.m23739o(q8eVar);
    }

    public static q8e parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (q8e) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static q8e parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (q8e) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static q8e parseFrom(vj1 vj1Var) throws ce8 {
        return (q8e) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static q8e parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (q8e) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static q8e parseFrom(byte[] bArr) throws ce8 {
        return (q8e) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static q8e parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (q8e) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static q8e parseFrom(InputStream inputStream) throws IOException {
        return (q8e) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static q8e parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (q8e) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static q8e parseFrom(f72 f72Var) throws IOException {
        return (q8e) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static q8e parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (q8e) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
