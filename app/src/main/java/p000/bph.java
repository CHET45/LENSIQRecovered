package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class bph extends u27<bph, C1990b> implements eph {
    private static final bph DEFAULT_INSTANCE;
    private static volatile vhc<bph> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* JADX INFO: renamed from: bph$a */
    public static /* synthetic */ class C1989a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14422a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f14422a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14422a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14422a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14422a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14422a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14422a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14422a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: bph$b */
    public static final class C1990b extends u27.AbstractC13324b<bph, C1990b> implements eph {
        public /* synthetic */ C1990b(C1989a c1989a) {
            this();
        }

        public C1990b clearValue() {
            m23058e();
            ((bph) this.f86607b).clearValue();
            return this;
        }

        @Override // p000.eph
        public long getValue() {
            return ((bph) this.f86607b).getValue();
        }

        public C1990b setValue(long value) {
            m23058e();
            ((bph) this.f86607b).setValue(value);
            return this;
        }

        private C1990b() {
            super(bph.DEFAULT_INSTANCE);
        }
    }

    static {
        bph bphVar = new bph();
        DEFAULT_INSTANCE = bphVar;
        u27.m23029g0(bph.class, bphVar);
    }

    private bph() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    public static bph getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C1990b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    /* JADX INFO: renamed from: of */
    public static bph m3341of(long value) {
        return newBuilder().setValue(value).build();
    }

    public static bph parseDelimitedFrom(InputStream input) throws IOException {
        return (bph) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static bph parseFrom(ByteBuffer data) throws be8 {
        return (bph) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<bph> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long value) {
        this.value_ = value;
    }

    @Override // p000.eph
    public long getValue() {
        return this.value_;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C1989a c1989a = null;
        switch (C1989a.f14422a[method.ordinal()]) {
            case 1:
                return new bph();
            case 2:
                return new C1990b(c1989a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<bph> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (bph.class) {
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

    public static C1990b newBuilder(bph prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static bph parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (bph) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static bph parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (bph) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static bph parseFrom(wj1 data) throws be8 {
        return (bph) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static bph parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (bph) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static bph parseFrom(byte[] data) throws be8 {
        return (bph) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static bph parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (bph) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static bph parseFrom(InputStream input) throws IOException {
        return (bph) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static bph parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (bph) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static bph parseFrom(e72 input) throws IOException {
        return (bph) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static bph parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (bph) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
