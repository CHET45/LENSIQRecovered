package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class na1 extends v27<na1, C9761b> implements oa1 {
    private static final na1 DEFAULT_INSTANCE;
    private static volatile uhc<na1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    /* JADX INFO: renamed from: na1$a */
    public static /* synthetic */ class C9760a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63778a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f63778a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63778a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63778a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63778a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63778a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63778a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f63778a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: na1$b */
    public static final class C9761b extends v27.AbstractC13823b<na1, C9761b> implements oa1 {
        public /* synthetic */ C9761b(C9760a c9760a) {
            this();
        }

        public C9761b clearValue() {
            m23743e();
            ((na1) this.f89756b).clearValue();
            return this;
        }

        @Override // p000.oa1
        public boolean getValue() {
            return ((na1) this.f89756b).getValue();
        }

        public C9761b setValue(boolean value) {
            m23743e();
            ((na1) this.f89756b).setValue(value);
            return this;
        }

        private C9761b() {
            super(na1.DEFAULT_INSTANCE);
        }
    }

    static {
        na1 na1Var = new na1();
        DEFAULT_INSTANCE = na1Var;
        v27.m23715h0(na1.class, na1Var);
    }

    private na1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = false;
    }

    public static na1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C9761b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    /* JADX INFO: renamed from: of */
    public static na1 m17827of(boolean value) {
        return newBuilder().setValue(value).build();
    }

    public static na1 parseDelimitedFrom(InputStream input) throws IOException {
        return (na1) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static na1 parseFrom(ByteBuffer data) throws ce8 {
        return (na1) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<na1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(boolean value) {
        this.value_ = value;
    }

    @Override // p000.oa1
    public boolean getValue() {
        return this.value_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C9760a c9760a = null;
        switch (C9760a.f63778a[method.ordinal()]) {
            case 1:
                return new na1();
            case 2:
                return new C9761b(c9760a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<na1> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (na1.class) {
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

    public static C9761b newBuilder(na1 prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static na1 parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (na1) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static na1 parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (na1) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static na1 parseFrom(vj1 data) throws ce8 {
        return (na1) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static na1 parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (na1) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static na1 parseFrom(byte[] data) throws ce8 {
        return (na1) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static na1 parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (na1) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static na1 parseFrom(InputStream input) throws IOException {
        return (na1) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static na1 parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (na1) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static na1 parseFrom(f72 input) throws IOException {
        return (na1) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static na1 parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (na1) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
