package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class o8g extends u27<o8g, C10232b> implements r8g {
    private static final o8g DEFAULT_INSTANCE;
    private static volatile vhc<o8g> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    /* JADX INFO: renamed from: o8g$a */
    public static /* synthetic */ class C10231a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66736a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f66736a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66736a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66736a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66736a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66736a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66736a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66736a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: o8g$b */
    public static final class C10232b extends u27.AbstractC13324b<o8g, C10232b> implements r8g {
        public /* synthetic */ C10232b(C10231a c10231a) {
            this();
        }

        public C10232b clearValue() {
            m23058e();
            ((o8g) this.f86607b).clearValue();
            return this;
        }

        @Override // p000.r8g
        public String getValue() {
            return ((o8g) this.f86607b).getValue();
        }

        @Override // p000.r8g
        public wj1 getValueBytes() {
            return ((o8g) this.f86607b).getValueBytes();
        }

        public C10232b setValue(String value) {
            m23058e();
            ((o8g) this.f86607b).setValue(value);
            return this;
        }

        public C10232b setValueBytes(wj1 value) {
            m23058e();
            ((o8g) this.f86607b).setValueBytes(value);
            return this;
        }

        private C10232b() {
            super(o8g.DEFAULT_INSTANCE);
        }
    }

    static {
        o8g o8gVar = new o8g();
        DEFAULT_INSTANCE = o8gVar;
        u27.m23029g0(o8g.class, o8gVar);
    }

    private o8g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static o8g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C10232b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    /* JADX INFO: renamed from: of */
    public static o8g m18425of(String value) {
        return newBuilder().setValue(value).build();
    }

    public static o8g parseDelimitedFrom(InputStream input) throws IOException {
        return (o8g) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static o8g parseFrom(ByteBuffer data) throws be8 {
        return (o8g) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<o8g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String value) {
        value.getClass();
        this.value_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        this.value_ = value.toStringUtf8();
    }

    @Override // p000.r8g
    public String getValue() {
        return this.value_;
    }

    @Override // p000.r8g
    public wj1 getValueBytes() {
        return wj1.copyFromUtf8(this.value_);
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C10231a c10231a = null;
        switch (C10231a.f66736a[method.ordinal()]) {
            case 1:
                return new o8g();
            case 2:
                return new C10232b(c10231a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<o8g> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (o8g.class) {
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

    public static C10232b newBuilder(o8g prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static o8g parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (o8g) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o8g parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (o8g) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static o8g parseFrom(wj1 data) throws be8 {
        return (o8g) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static o8g parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (o8g) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static o8g parseFrom(byte[] data) throws be8 {
        return (o8g) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static o8g parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (o8g) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static o8g parseFrom(InputStream input) throws IOException {
        return (o8g) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static o8g parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (o8g) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o8g parseFrom(e72 input) throws IOException {
        return (o8g) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static o8g parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (o8g) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
