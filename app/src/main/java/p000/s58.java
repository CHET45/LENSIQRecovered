package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class s58 extends u27<s58, C12449b> implements v58 {
    private static final s58 DEFAULT_INSTANCE;
    private static volatile vhc<s58> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* JADX INFO: renamed from: s58$a */
    public static /* synthetic */ class C12448a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f80716a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f80716a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80716a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80716a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f80716a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f80716a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f80716a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f80716a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s58$b */
    public static final class C12449b extends u27.AbstractC13324b<s58, C12449b> implements v58 {
        public /* synthetic */ C12449b(C12448a c12448a) {
            this();
        }

        public C12449b clearValue() {
            m23058e();
            ((s58) this.f86607b).clearValue();
            return this;
        }

        @Override // p000.v58
        public int getValue() {
            return ((s58) this.f86607b).getValue();
        }

        public C12449b setValue(int value) {
            m23058e();
            ((s58) this.f86607b).setValue(value);
            return this;
        }

        private C12449b() {
            super(s58.DEFAULT_INSTANCE);
        }
    }

    static {
        s58 s58Var = new s58();
        DEFAULT_INSTANCE = s58Var;
        u27.m23029g0(s58.class, s58Var);
    }

    private s58() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static s58 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12449b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    /* JADX INFO: renamed from: of */
    public static s58 m21743of(int value) {
        return newBuilder().setValue(value).build();
    }

    public static s58 parseDelimitedFrom(InputStream input) throws IOException {
        return (s58) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static s58 parseFrom(ByteBuffer data) throws be8 {
        return (s58) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<s58> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int value) {
        this.value_ = value;
    }

    @Override // p000.v58
    public int getValue() {
        return this.value_;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C12448a c12448a = null;
        switch (C12448a.f80716a[method.ordinal()]) {
            case 1:
                return new s58();
            case 2:
                return new C12449b(c12448a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<s58> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (s58.class) {
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

    public static C12449b newBuilder(s58 prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static s58 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (s58) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static s58 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (s58) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static s58 parseFrom(wj1 data) throws be8 {
        return (s58) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static s58 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (s58) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static s58 parseFrom(byte[] data) throws be8 {
        return (s58) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static s58 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (s58) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static s58 parseFrom(InputStream input) throws IOException {
        return (s58) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static s58 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (s58) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static s58 parseFrom(e72 input) throws IOException {
        return (s58) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static s58 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (s58) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
