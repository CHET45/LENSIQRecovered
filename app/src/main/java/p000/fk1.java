package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class fk1 extends u27<fk1, C5862b> implements ik1 {
    private static final fk1 DEFAULT_INSTANCE;
    private static volatile vhc<fk1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private wj1 value_ = wj1.f94379e;

    /* JADX INFO: renamed from: fk1$a */
    public static /* synthetic */ class C5861a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36893a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f36893a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36893a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36893a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36893a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36893a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36893a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36893a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: fk1$b */
    public static final class C5862b extends u27.AbstractC13324b<fk1, C5862b> implements ik1 {
        public /* synthetic */ C5862b(C5861a c5861a) {
            this();
        }

        public C5862b clearValue() {
            m23058e();
            ((fk1) this.f86607b).clearValue();
            return this;
        }

        @Override // p000.ik1
        public wj1 getValue() {
            return ((fk1) this.f86607b).getValue();
        }

        public C5862b setValue(wj1 value) {
            m23058e();
            ((fk1) this.f86607b).setValue(value);
            return this;
        }

        private C5862b() {
            super(fk1.DEFAULT_INSTANCE);
        }
    }

    static {
        fk1 fk1Var = new fk1();
        DEFAULT_INSTANCE = fk1Var;
        u27.m23029g0(fk1.class, fk1Var);
    }

    private fk1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static fk1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5862b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    /* JADX INFO: renamed from: of */
    public static fk1 m10960of(wj1 value) {
        return newBuilder().setValue(value).build();
    }

    public static fk1 parseDelimitedFrom(InputStream input) throws IOException {
        return (fk1) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static fk1 parseFrom(ByteBuffer data) throws be8 {
        return (fk1) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<fk1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(wj1 value) {
        value.getClass();
        this.value_ = value;
    }

    @Override // p000.ik1
    public wj1 getValue() {
        return this.value_;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C5861a c5861a = null;
        switch (C5861a.f36893a[method.ordinal()]) {
            case 1:
                return new fk1();
            case 2:
                return new C5862b(c5861a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<fk1> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (fk1.class) {
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

    public static C5862b newBuilder(fk1 prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static fk1 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (fk1) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static fk1 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (fk1) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static fk1 parseFrom(wj1 data) throws be8 {
        return (fk1) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static fk1 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (fk1) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static fk1 parseFrom(byte[] data) throws be8 {
        return (fk1) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static fk1 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (fk1) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static fk1 parseFrom(InputStream input) throws IOException {
        return (fk1) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static fk1 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (fk1) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static fk1 parseFrom(e72 input) throws IOException {
        return (fk1) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static fk1 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (fk1) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
