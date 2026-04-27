package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class i0h extends v27<i0h, C7099b> implements j0h {
    private static final i0h DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 1;
    public static final int MINUTES_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 4;
    private static volatile uhc<i0h> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 3;
    private int hours_;
    private int minutes_;
    private int nanos_;
    private int seconds_;

    /* JADX INFO: renamed from: i0h$a */
    public static /* synthetic */ class C7098a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45410a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f45410a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45410a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45410a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45410a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45410a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45410a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45410a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: i0h$b */
    public static final class C7099b extends v27.AbstractC13823b<i0h, C7099b> implements j0h {
        public /* synthetic */ C7099b(C7098a c7098a) {
            this();
        }

        public C7099b clearHours() {
            m23743e();
            ((i0h) this.f89756b).clearHours();
            return this;
        }

        public C7099b clearMinutes() {
            m23743e();
            ((i0h) this.f89756b).clearMinutes();
            return this;
        }

        public C7099b clearNanos() {
            m23743e();
            ((i0h) this.f89756b).clearNanos();
            return this;
        }

        public C7099b clearSeconds() {
            m23743e();
            ((i0h) this.f89756b).clearSeconds();
            return this;
        }

        @Override // p000.j0h
        public int getHours() {
            return ((i0h) this.f89756b).getHours();
        }

        @Override // p000.j0h
        public int getMinutes() {
            return ((i0h) this.f89756b).getMinutes();
        }

        @Override // p000.j0h
        public int getNanos() {
            return ((i0h) this.f89756b).getNanos();
        }

        @Override // p000.j0h
        public int getSeconds() {
            return ((i0h) this.f89756b).getSeconds();
        }

        public C7099b setHours(int i) {
            m23743e();
            ((i0h) this.f89756b).setHours(i);
            return this;
        }

        public C7099b setMinutes(int i) {
            m23743e();
            ((i0h) this.f89756b).setMinutes(i);
            return this;
        }

        public C7099b setNanos(int i) {
            m23743e();
            ((i0h) this.f89756b).setNanos(i);
            return this;
        }

        public C7099b setSeconds(int i) {
            m23743e();
            ((i0h) this.f89756b).setSeconds(i);
            return this;
        }

        private C7099b() {
            super(i0h.DEFAULT_INSTANCE);
        }
    }

    static {
        i0h i0hVar = new i0h();
        DEFAULT_INSTANCE = i0hVar;
        v27.m23715h0(i0h.class, i0hVar);
    }

    private i0h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHours() {
        this.hours_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinutes() {
        this.minutes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0;
    }

    public static i0h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C7099b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static i0h parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (i0h) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static i0h parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (i0h) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<i0h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHours(int i) {
        this.hours_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinutes(int i) {
        this.minutes_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int i) {
        this.nanos_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(int i) {
        this.seconds_ = i;
    }

    @Override // p000.j0h
    public int getHours() {
        return this.hours_;
    }

    @Override // p000.j0h
    public int getMinutes() {
        return this.minutes_;
    }

    @Override // p000.j0h
    public int getNanos() {
        return this.nanos_;
    }

    @Override // p000.j0h
    public int getSeconds() {
        return this.seconds_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C7098a c7098a = null;
        switch (C7098a.f45410a[enumC13830i.ordinal()]) {
            case 1:
                return new i0h();
            case 2:
                return new C7099b(c7098a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"hours_", "minutes_", "seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<i0h> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (i0h.class) {
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

    public static C7099b newBuilder(i0h i0hVar) {
        return DEFAULT_INSTANCE.m23739o(i0hVar);
    }

    public static i0h parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (i0h) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static i0h parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (i0h) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static i0h parseFrom(vj1 vj1Var) throws ce8 {
        return (i0h) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static i0h parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (i0h) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static i0h parseFrom(byte[] bArr) throws ce8 {
        return (i0h) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static i0h parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (i0h) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static i0h parseFrom(InputStream inputStream) throws IOException {
        return (i0h) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static i0h parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (i0h) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static i0h parseFrom(f72 f72Var) throws IOException {
        return (i0h) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static i0h parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (i0h) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
