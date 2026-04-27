package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class at4 extends v27<at4, C1602b> implements gt4 {
    private static final at4 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile uhc<at4> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* JADX INFO: renamed from: at4$a */
    public static /* synthetic */ class C1601a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11828a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f11828a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11828a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11828a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11828a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11828a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11828a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11828a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: at4$b */
    public static final class C1602b extends v27.AbstractC13823b<at4, C1602b> implements gt4 {
        public /* synthetic */ C1602b(C1601a c1601a) {
            this();
        }

        public C1602b clearNanos() {
            m23743e();
            ((at4) this.f89756b).clearNanos();
            return this;
        }

        public C1602b clearSeconds() {
            m23743e();
            ((at4) this.f89756b).clearSeconds();
            return this;
        }

        @Override // p000.gt4
        public int getNanos() {
            return ((at4) this.f89756b).getNanos();
        }

        @Override // p000.gt4
        public long getSeconds() {
            return ((at4) this.f89756b).getSeconds();
        }

        public C1602b setNanos(int value) {
            m23743e();
            ((at4) this.f89756b).setNanos(value);
            return this;
        }

        public C1602b setSeconds(long value) {
            m23743e();
            ((at4) this.f89756b).setSeconds(value);
            return this;
        }

        private C1602b() {
            super(at4.DEFAULT_INSTANCE);
        }
    }

    static {
        at4 at4Var = new at4();
        DEFAULT_INSTANCE = at4Var;
        v27.m23715h0(at4.class, at4Var);
    }

    private at4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    public static at4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C1602b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static at4 parseDelimitedFrom(InputStream input) throws IOException {
        return (at4) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static at4 parseFrom(ByteBuffer data) throws ce8 {
        return (at4) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<at4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int value) {
        this.nanos_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(long value) {
        this.seconds_ = value;
    }

    @Override // p000.gt4
    public int getNanos() {
        return this.nanos_;
    }

    @Override // p000.gt4
    public long getSeconds() {
        return this.seconds_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C1601a c1601a = null;
        switch (C1601a.f11828a[method.ordinal()]) {
            case 1:
                return new at4();
            case 2:
                return new C1602b(c1601a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<at4> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (at4.class) {
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

    public static C1602b newBuilder(at4 prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static at4 parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (at4) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static at4 parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (at4) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static at4 parseFrom(vj1 data) throws ce8 {
        return (at4) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static at4 parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (at4) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static at4 parseFrom(byte[] data) throws ce8 {
        return (at4) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static at4 parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (at4) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static at4 parseFrom(InputStream input) throws IOException {
        return (at4) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static at4 parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (at4) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static at4 parseFrom(f72 input) throws IOException {
        return (at4) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static at4 parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (at4) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
