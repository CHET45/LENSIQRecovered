package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class gk1 extends v27<gk1, C6349b> implements hk1 {
    private static final gk1 DEFAULT_INSTANCE;
    private static volatile uhc<gk1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private vj1 value_ = vj1.f91344e;

    /* JADX INFO: renamed from: gk1$a */
    public static /* synthetic */ class C6348a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39980a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f39980a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39980a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39980a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39980a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39980a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39980a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39980a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: gk1$b */
    public static final class C6349b extends v27.AbstractC13823b<gk1, C6349b> implements hk1 {
        public /* synthetic */ C6349b(C6348a c6348a) {
            this();
        }

        public C6349b clearValue() {
            m23743e();
            ((gk1) this.f89756b).clearValue();
            return this;
        }

        @Override // p000.hk1
        public vj1 getValue() {
            return ((gk1) this.f89756b).getValue();
        }

        public C6349b setValue(vj1 value) {
            m23743e();
            ((gk1) this.f89756b).setValue(value);
            return this;
        }

        private C6349b() {
            super(gk1.DEFAULT_INSTANCE);
        }
    }

    static {
        gk1 gk1Var = new gk1();
        DEFAULT_INSTANCE = gk1Var;
        v27.m23715h0(gk1.class, gk1Var);
    }

    private gk1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static gk1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6349b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    /* JADX INFO: renamed from: of */
    public static gk1 m11716of(vj1 value) {
        return newBuilder().setValue(value).build();
    }

    public static gk1 parseDelimitedFrom(InputStream input) throws IOException {
        return (gk1) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static gk1 parseFrom(ByteBuffer data) throws ce8 {
        return (gk1) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<gk1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(vj1 value) {
        value.getClass();
        this.value_ = value;
    }

    @Override // p000.hk1
    public vj1 getValue() {
        return this.value_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C6348a c6348a = null;
        switch (C6348a.f39980a[method.ordinal()]) {
            case 1:
                return new gk1();
            case 2:
                return new C6349b(c6348a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<gk1> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (gk1.class) {
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

    public static C6349b newBuilder(gk1 prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static gk1 parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (gk1) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static gk1 parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (gk1) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static gk1 parseFrom(vj1 data) throws ce8 {
        return (gk1) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static gk1 parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (gk1) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static gk1 parseFrom(byte[] data) throws ce8 {
        return (gk1) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static gk1 parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (gk1) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static gk1 parseFrom(InputStream input) throws IOException {
        return (gk1) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static gk1 parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (gk1) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static gk1 parseFrom(f72 input) throws IOException {
        return (gk1) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static gk1 parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (gk1) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
