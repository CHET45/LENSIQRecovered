package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class t58 extends v27<t58, C12915b> implements u58 {
    private static final t58 DEFAULT_INSTANCE;
    private static volatile uhc<t58> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* JADX INFO: renamed from: t58$a */
    public static /* synthetic */ class C12914a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f83743a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f83743a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83743a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83743a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83743a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83743a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f83743a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f83743a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: t58$b */
    public static final class C12915b extends v27.AbstractC13823b<t58, C12915b> implements u58 {
        public /* synthetic */ C12915b(C12914a c12914a) {
            this();
        }

        public C12915b clearValue() {
            m23743e();
            ((t58) this.f89756b).clearValue();
            return this;
        }

        @Override // p000.u58
        public int getValue() {
            return ((t58) this.f89756b).getValue();
        }

        public C12915b setValue(int value) {
            m23743e();
            ((t58) this.f89756b).setValue(value);
            return this;
        }

        private C12915b() {
            super(t58.DEFAULT_INSTANCE);
        }
    }

    static {
        t58 t58Var = new t58();
        DEFAULT_INSTANCE = t58Var;
        v27.m23715h0(t58.class, t58Var);
    }

    private t58() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static t58 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12915b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    /* JADX INFO: renamed from: of */
    public static t58 m22373of(int value) {
        return newBuilder().setValue(value).build();
    }

    public static t58 parseDelimitedFrom(InputStream input) throws IOException {
        return (t58) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static t58 parseFrom(ByteBuffer data) throws ce8 {
        return (t58) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<t58> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int value) {
        this.value_ = value;
    }

    @Override // p000.u58
    public int getValue() {
        return this.value_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C12914a c12914a = null;
        switch (C12914a.f83743a[method.ordinal()]) {
            case 1:
                return new t58();
            case 2:
                return new C12915b(c12914a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<t58> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (t58.class) {
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

    public static C12915b newBuilder(t58 prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static t58 parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (t58) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static t58 parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (t58) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static t58 parseFrom(vj1 data) throws ce8 {
        return (t58) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static t58 parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (t58) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static t58 parseFrom(byte[] data) throws ce8 {
        return (t58) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static t58 parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (t58) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static t58 parseFrom(InputStream input) throws IOException {
        return (t58) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static t58 parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (t58) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static t58 parseFrom(f72 input) throws IOException {
        return (t58) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static t58 parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (t58) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
