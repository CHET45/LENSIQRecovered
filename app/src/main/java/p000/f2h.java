package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class f2h extends v27<f2h, C5567b> implements k2h {
    private static final f2h DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile uhc<f2h> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* JADX INFO: renamed from: f2h$a */
    public static /* synthetic */ class C5566a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34940a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f34940a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34940a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34940a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34940a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34940a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34940a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34940a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: f2h$b */
    public static final class C5567b extends v27.AbstractC13823b<f2h, C5567b> implements k2h {
        public /* synthetic */ C5567b(C5566a c5566a) {
            this();
        }

        public C5567b clearNanos() {
            m23743e();
            ((f2h) this.f89756b).clearNanos();
            return this;
        }

        public C5567b clearSeconds() {
            m23743e();
            ((f2h) this.f89756b).clearSeconds();
            return this;
        }

        @Override // p000.k2h
        public int getNanos() {
            return ((f2h) this.f89756b).getNanos();
        }

        @Override // p000.k2h
        public long getSeconds() {
            return ((f2h) this.f89756b).getSeconds();
        }

        public C5567b setNanos(int value) {
            m23743e();
            ((f2h) this.f89756b).setNanos(value);
            return this;
        }

        public C5567b setSeconds(long value) {
            m23743e();
            ((f2h) this.f89756b).setSeconds(value);
            return this;
        }

        private C5567b() {
            super(f2h.DEFAULT_INSTANCE);
        }
    }

    static {
        f2h f2hVar = new f2h();
        DEFAULT_INSTANCE = f2hVar;
        v27.m23715h0(f2h.class, f2hVar);
    }

    private f2h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    public static f2h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5567b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static f2h parseDelimitedFrom(InputStream input) throws IOException {
        return (f2h) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static f2h parseFrom(ByteBuffer data) throws ce8 {
        return (f2h) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<f2h> parser() {
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

    @Override // p000.k2h
    public int getNanos() {
        return this.nanos_;
    }

    @Override // p000.k2h
    public long getSeconds() {
        return this.seconds_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C5566a c5566a = null;
        switch (C5566a.f34940a[method.ordinal()]) {
            case 1:
                return new f2h();
            case 2:
                return new C5567b(c5566a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<f2h> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (f2h.class) {
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

    public static C5567b newBuilder(f2h prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static f2h parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (f2h) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f2h parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (f2h) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f2h parseFrom(vj1 data) throws ce8 {
        return (f2h) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static f2h parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (f2h) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f2h parseFrom(byte[] data) throws ce8 {
        return (f2h) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static f2h parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (f2h) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static f2h parseFrom(InputStream input) throws IOException {
        return (f2h) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static f2h parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (f2h) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static f2h parseFrom(f72 input) throws IOException {
        return (f2h) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static f2h parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (f2h) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
