package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class zs4 extends u27<zs4, C16241b> implements ht4 {
    private static final zs4 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile vhc<zs4> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* JADX INFO: renamed from: zs4$a */
    public static /* synthetic */ class C16240a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105953a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f105953a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105953a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105953a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105953a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f105953a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f105953a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f105953a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: zs4$b */
    public static final class C16241b extends u27.AbstractC13324b<zs4, C16241b> implements ht4 {
        public /* synthetic */ C16241b(C16240a c16240a) {
            this();
        }

        public C16241b clearNanos() {
            m23058e();
            ((zs4) this.f86607b).clearNanos();
            return this;
        }

        public C16241b clearSeconds() {
            m23058e();
            ((zs4) this.f86607b).clearSeconds();
            return this;
        }

        @Override // p000.ht4
        public int getNanos() {
            return ((zs4) this.f86607b).getNanos();
        }

        @Override // p000.ht4
        public long getSeconds() {
            return ((zs4) this.f86607b).getSeconds();
        }

        public C16241b setNanos(int value) {
            m23058e();
            ((zs4) this.f86607b).setNanos(value);
            return this;
        }

        public C16241b setSeconds(long value) {
            m23058e();
            ((zs4) this.f86607b).setSeconds(value);
            return this;
        }

        private C16241b() {
            super(zs4.DEFAULT_INSTANCE);
        }
    }

    static {
        zs4 zs4Var = new zs4();
        DEFAULT_INSTANCE = zs4Var;
        u27.m23029g0(zs4.class, zs4Var);
    }

    private zs4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    public static zs4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C16241b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static zs4 parseDelimitedFrom(InputStream input) throws IOException {
        return (zs4) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static zs4 parseFrom(ByteBuffer data) throws be8 {
        return (zs4) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<zs4> parser() {
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

    @Override // p000.ht4
    public int getNanos() {
        return this.nanos_;
    }

    @Override // p000.ht4
    public long getSeconds() {
        return this.seconds_;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C16240a c16240a = null;
        switch (C16240a.f105953a[method.ordinal()]) {
            case 1:
                return new zs4();
            case 2:
                return new C16241b(c16240a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<zs4> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (zs4.class) {
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

    public static C16241b newBuilder(zs4 prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static zs4 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (zs4) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static zs4 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (zs4) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static zs4 parseFrom(wj1 data) throws be8 {
        return (zs4) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static zs4 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (zs4) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static zs4 parseFrom(byte[] data) throws be8 {
        return (zs4) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static zs4 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (zs4) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static zs4 parseFrom(InputStream input) throws IOException {
        return (zs4) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static zs4 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (zs4) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static zs4 parseFrom(e72 input) throws IOException {
        return (zs4) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static zs4 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (zs4) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
