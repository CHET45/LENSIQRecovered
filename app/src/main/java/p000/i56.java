package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class i56 extends u27<i56, C7151b> implements m56 {
    private static final i56 DEFAULT_INSTANCE;
    private static volatile vhc<i56> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    /* JADX INFO: renamed from: i56$a */
    public static /* synthetic */ class C7150a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45788a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f45788a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45788a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45788a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45788a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45788a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45788a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45788a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: i56$b */
    public static final class C7151b extends u27.AbstractC13324b<i56, C7151b> implements m56 {
        public /* synthetic */ C7151b(C7150a c7150a) {
            this();
        }

        public C7151b clearValue() {
            m23058e();
            ((i56) this.f86607b).clearValue();
            return this;
        }

        @Override // p000.m56
        public float getValue() {
            return ((i56) this.f86607b).getValue();
        }

        public C7151b setValue(float value) {
            m23058e();
            ((i56) this.f86607b).setValue(value);
            return this;
        }

        private C7151b() {
            super(i56.DEFAULT_INSTANCE);
        }
    }

    static {
        i56 i56Var = new i56();
        DEFAULT_INSTANCE = i56Var;
        u27.m23029g0(i56.class, i56Var);
    }

    private i56() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0.0f;
    }

    public static i56 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C7151b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    /* JADX INFO: renamed from: of */
    public static i56 m12797of(float value) {
        return newBuilder().setValue(value).build();
    }

    public static i56 parseDelimitedFrom(InputStream input) throws IOException {
        return (i56) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static i56 parseFrom(ByteBuffer data) throws be8 {
        return (i56) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<i56> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(float value) {
        this.value_ = value;
    }

    @Override // p000.m56
    public float getValue() {
        return this.value_;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C7150a c7150a = null;
        switch (C7150a.f45788a[method.ordinal()]) {
            case 1:
                return new i56();
            case 2:
                return new C7151b(c7150a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<i56> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (i56.class) {
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

    public static C7151b newBuilder(i56 prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static i56 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (i56) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static i56 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (i56) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static i56 parseFrom(wj1 data) throws be8 {
        return (i56) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static i56 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (i56) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static i56 parseFrom(byte[] data) throws be8 {
        return (i56) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static i56 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (i56) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static i56 parseFrom(InputStream input) throws IOException {
        return (i56) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static i56 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (i56) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static i56 parseFrom(e72 input) throws IOException {
        return (i56) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static i56 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (i56) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
