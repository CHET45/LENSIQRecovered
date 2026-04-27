package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class kk4 extends u27<kk4, C8432b> implements nk4 {
    private static final kk4 DEFAULT_INSTANCE;
    private static volatile vhc<kk4> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    /* JADX INFO: renamed from: kk4$a */
    public static /* synthetic */ class C8431a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54543a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f54543a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54543a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54543a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54543a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54543a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54543a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54543a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: kk4$b */
    public static final class C8432b extends u27.AbstractC13324b<kk4, C8432b> implements nk4 {
        public /* synthetic */ C8432b(C8431a c8431a) {
            this();
        }

        public C8432b clearValue() {
            m23058e();
            ((kk4) this.f86607b).clearValue();
            return this;
        }

        @Override // p000.nk4
        public double getValue() {
            return ((kk4) this.f86607b).getValue();
        }

        public C8432b setValue(double value) {
            m23058e();
            ((kk4) this.f86607b).setValue(value);
            return this;
        }

        private C8432b() {
            super(kk4.DEFAULT_INSTANCE);
        }
    }

    static {
        kk4 kk4Var = new kk4();
        DEFAULT_INSTANCE = kk4Var;
        u27.m23029g0(kk4.class, kk4Var);
    }

    private kk4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0.0d;
    }

    public static kk4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8432b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    /* JADX INFO: renamed from: of */
    public static kk4 m14813of(double value) {
        return newBuilder().setValue(value).build();
    }

    public static kk4 parseDelimitedFrom(InputStream input) throws IOException {
        return (kk4) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static kk4 parseFrom(ByteBuffer data) throws be8 {
        return (kk4) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<kk4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(double value) {
        this.value_ = value;
    }

    @Override // p000.nk4
    public double getValue() {
        return this.value_;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C8431a c8431a = null;
        switch (C8431a.f54543a[method.ordinal()]) {
            case 1:
                return new kk4();
            case 2:
                return new C8432b(c8431a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<kk4> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (kk4.class) {
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

    public static C8432b newBuilder(kk4 prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static kk4 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (kk4) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static kk4 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (kk4) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static kk4 parseFrom(wj1 data) throws be8 {
        return (kk4) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static kk4 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (kk4) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static kk4 parseFrom(byte[] data) throws be8 {
        return (kk4) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static kk4 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (kk4) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static kk4 parseFrom(InputStream input) throws IOException {
        return (kk4) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static kk4 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (kk4) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static kk4 parseFrom(e72 input) throws IOException {
        return (kk4) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static kk4 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (kk4) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
