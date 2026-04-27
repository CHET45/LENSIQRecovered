package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class xoh extends u27<xoh, C15237b> implements aph {
    private static final xoh DEFAULT_INSTANCE;
    private static volatile vhc<xoh> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* JADX INFO: renamed from: xoh$a */
    public static /* synthetic */ class C15236a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f98841a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f98841a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98841a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98841a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98841a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98841a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f98841a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f98841a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: xoh$b */
    public static final class C15237b extends u27.AbstractC13324b<xoh, C15237b> implements aph {
        public /* synthetic */ C15237b(C15236a c15236a) {
            this();
        }

        public C15237b clearValue() {
            m23058e();
            ((xoh) this.f86607b).clearValue();
            return this;
        }

        @Override // p000.aph
        public int getValue() {
            return ((xoh) this.f86607b).getValue();
        }

        public C15237b setValue(int value) {
            m23058e();
            ((xoh) this.f86607b).setValue(value);
            return this;
        }

        private C15237b() {
            super(xoh.DEFAULT_INSTANCE);
        }
    }

    static {
        xoh xohVar = new xoh();
        DEFAULT_INSTANCE = xohVar;
        u27.m23029g0(xoh.class, xohVar);
    }

    private xoh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static xoh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C15237b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    /* JADX INFO: renamed from: of */
    public static xoh m25365of(int value) {
        return newBuilder().setValue(value).build();
    }

    public static xoh parseDelimitedFrom(InputStream input) throws IOException {
        return (xoh) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static xoh parseFrom(ByteBuffer data) throws be8 {
        return (xoh) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<xoh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int value) {
        this.value_ = value;
    }

    @Override // p000.aph
    public int getValue() {
        return this.value_;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C15236a c15236a = null;
        switch (C15236a.f98841a[method.ordinal()]) {
            case 1:
                return new xoh();
            case 2:
                return new C15237b(c15236a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<xoh> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (xoh.class) {
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

    public static C15237b newBuilder(xoh prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static xoh parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (xoh) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static xoh parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (xoh) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static xoh parseFrom(wj1 data) throws be8 {
        return (xoh) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static xoh parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (xoh) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static xoh parseFrom(byte[] data) throws be8 {
        return (xoh) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static xoh parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (xoh) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static xoh parseFrom(InputStream input) throws IOException {
        return (xoh) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static xoh parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (xoh) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static xoh parseFrom(e72 input) throws IOException {
        return (xoh) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static xoh parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (xoh) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
