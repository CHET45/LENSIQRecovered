package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class ma1 extends u27<ma1, C9234b> implements pa1 {
    private static final ma1 DEFAULT_INSTANCE;
    private static volatile vhc<ma1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    /* JADX INFO: renamed from: ma1$a */
    public static /* synthetic */ class C9233a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60328a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f60328a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60328a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60328a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60328a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60328a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60328a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60328a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: ma1$b */
    public static final class C9234b extends u27.AbstractC13324b<ma1, C9234b> implements pa1 {
        public /* synthetic */ C9234b(C9233a c9233a) {
            this();
        }

        public C9234b clearValue() {
            m23058e();
            ((ma1) this.f86607b).clearValue();
            return this;
        }

        @Override // p000.pa1
        public boolean getValue() {
            return ((ma1) this.f86607b).getValue();
        }

        public C9234b setValue(boolean value) {
            m23058e();
            ((ma1) this.f86607b).setValue(value);
            return this;
        }

        private C9234b() {
            super(ma1.DEFAULT_INSTANCE);
        }
    }

    static {
        ma1 ma1Var = new ma1();
        DEFAULT_INSTANCE = ma1Var;
        u27.m23029g0(ma1.class, ma1Var);
    }

    private ma1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = false;
    }

    public static ma1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C9234b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    /* JADX INFO: renamed from: of */
    public static ma1 m17186of(boolean value) {
        return newBuilder().setValue(value).build();
    }

    public static ma1 parseDelimitedFrom(InputStream input) throws IOException {
        return (ma1) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static ma1 parseFrom(ByteBuffer data) throws be8 {
        return (ma1) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<ma1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(boolean value) {
        this.value_ = value;
    }

    @Override // p000.pa1
    public boolean getValue() {
        return this.value_;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C9233a c9233a = null;
        switch (C9233a.f60328a[method.ordinal()]) {
            case 1:
                return new ma1();
            case 2:
                return new C9234b(c9233a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<ma1> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (ma1.class) {
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

    public static C9234b newBuilder(ma1 prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static ma1 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (ma1) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static ma1 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (ma1) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ma1 parseFrom(wj1 data) throws be8 {
        return (ma1) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static ma1 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (ma1) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ma1 parseFrom(byte[] data) throws be8 {
        return (ma1) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static ma1 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (ma1) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ma1 parseFrom(InputStream input) throws IOException {
        return (ma1) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static ma1 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (ma1) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static ma1 parseFrom(e72 input) throws IOException {
        return (ma1) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static ma1 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (ma1) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
