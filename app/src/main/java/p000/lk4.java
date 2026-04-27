package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class lk4 extends v27<lk4, C8864b> implements mk4 {
    private static final lk4 DEFAULT_INSTANCE;
    private static volatile uhc<lk4> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    /* JADX INFO: renamed from: lk4$a */
    public static /* synthetic */ class C8863a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f57978a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f57978a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57978a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57978a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57978a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57978a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57978a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57978a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: lk4$b */
    public static final class C8864b extends v27.AbstractC13823b<lk4, C8864b> implements mk4 {
        public /* synthetic */ C8864b(C8863a c8863a) {
            this();
        }

        public C8864b clearValue() {
            m23743e();
            ((lk4) this.f89756b).clearValue();
            return this;
        }

        @Override // p000.mk4
        public double getValue() {
            return ((lk4) this.f89756b).getValue();
        }

        public C8864b setValue(double value) {
            m23743e();
            ((lk4) this.f89756b).setValue(value);
            return this;
        }

        private C8864b() {
            super(lk4.DEFAULT_INSTANCE);
        }
    }

    static {
        lk4 lk4Var = new lk4();
        DEFAULT_INSTANCE = lk4Var;
        v27.m23715h0(lk4.class, lk4Var);
    }

    private lk4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0.0d;
    }

    public static lk4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8864b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    /* JADX INFO: renamed from: of */
    public static lk4 m16196of(double value) {
        return newBuilder().setValue(value).build();
    }

    public static lk4 parseDelimitedFrom(InputStream input) throws IOException {
        return (lk4) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static lk4 parseFrom(ByteBuffer data) throws ce8 {
        return (lk4) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<lk4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(double value) {
        this.value_ = value;
    }

    @Override // p000.mk4
    public double getValue() {
        return this.value_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C8863a c8863a = null;
        switch (C8863a.f57978a[method.ordinal()]) {
            case 1:
                return new lk4();
            case 2:
                return new C8864b(c8863a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<lk4> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (lk4.class) {
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

    public static C8864b newBuilder(lk4 prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static lk4 parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (lk4) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static lk4 parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (lk4) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static lk4 parseFrom(vj1 data) throws ce8 {
        return (lk4) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static lk4 parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (lk4) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static lk4 parseFrom(byte[] data) throws ce8 {
        return (lk4) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static lk4 parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (lk4) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static lk4 parseFrom(InputStream input) throws IOException {
        return (lk4) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static lk4 parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (lk4) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static lk4 parseFrom(f72 input) throws IOException {
        return (lk4) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static lk4 parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (lk4) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
