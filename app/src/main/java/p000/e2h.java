package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class e2h extends u27<e2h, C5063b> implements l2h {
    private static final e2h DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile vhc<e2h> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* JADX INFO: renamed from: e2h$a */
    public static /* synthetic */ class C5062a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31613a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f31613a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31613a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31613a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31613a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31613a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31613a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31613a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: e2h$b */
    public static final class C5063b extends u27.AbstractC13324b<e2h, C5063b> implements l2h {
        public /* synthetic */ C5063b(C5062a c5062a) {
            this();
        }

        public C5063b clearNanos() {
            m23058e();
            ((e2h) this.f86607b).clearNanos();
            return this;
        }

        public C5063b clearSeconds() {
            m23058e();
            ((e2h) this.f86607b).clearSeconds();
            return this;
        }

        @Override // p000.l2h
        public int getNanos() {
            return ((e2h) this.f86607b).getNanos();
        }

        @Override // p000.l2h
        public long getSeconds() {
            return ((e2h) this.f86607b).getSeconds();
        }

        public C5063b setNanos(int value) {
            m23058e();
            ((e2h) this.f86607b).setNanos(value);
            return this;
        }

        public C5063b setSeconds(long value) {
            m23058e();
            ((e2h) this.f86607b).setSeconds(value);
            return this;
        }

        private C5063b() {
            super(e2h.DEFAULT_INSTANCE);
        }
    }

    static {
        e2h e2hVar = new e2h();
        DEFAULT_INSTANCE = e2hVar;
        u27.m23029g0(e2h.class, e2hVar);
    }

    private e2h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    public static e2h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5063b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static e2h parseDelimitedFrom(InputStream input) throws IOException {
        return (e2h) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static e2h parseFrom(ByteBuffer data) throws be8 {
        return (e2h) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<e2h> parser() {
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

    @Override // p000.l2h
    public int getNanos() {
        return this.nanos_;
    }

    @Override // p000.l2h
    public long getSeconds() {
        return this.seconds_;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C5062a c5062a = null;
        switch (C5062a.f31613a[method.ordinal()]) {
            case 1:
                return new e2h();
            case 2:
                return new C5063b(c5062a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<e2h> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (e2h.class) {
                        try {
                            c13325c = PARSER;
                            if (c13325c == null) {
                                c13325c = new u27.C13325c<>(DEFAULT_INSTANCE);
                                PARSER = c13325c;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return c13325c;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static C5063b newBuilder(e2h prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static e2h parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (e2h) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static e2h parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (e2h) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static e2h parseFrom(wj1 data) throws be8 {
        return (e2h) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static e2h parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (e2h) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static e2h parseFrom(byte[] data) throws be8 {
        return (e2h) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static e2h parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (e2h) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static e2h parseFrom(InputStream input) throws IOException {
        return (e2h) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static e2h parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (e2h) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static e2h parseFrom(e72 input) throws IOException {
        return (e2h) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static e2h parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (e2h) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
