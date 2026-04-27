package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class x58 extends v27<x58, C14924b> implements y58 {
    private static final x58 DEFAULT_INSTANCE;
    private static volatile uhc<x58> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* JADX INFO: renamed from: x58$a */
    public static /* synthetic */ class C14923a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f96821a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f96821a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96821a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96821a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96821a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f96821a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f96821a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f96821a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: x58$b */
    public static final class C14924b extends v27.AbstractC13823b<x58, C14924b> implements y58 {
        public /* synthetic */ C14924b(C14923a c14923a) {
            this();
        }

        public C14924b clearValue() {
            m23743e();
            ((x58) this.f89756b).clearValue();
            return this;
        }

        @Override // p000.y58
        public long getValue() {
            return ((x58) this.f89756b).getValue();
        }

        public C14924b setValue(long value) {
            m23743e();
            ((x58) this.f89756b).setValue(value);
            return this;
        }

        private C14924b() {
            super(x58.DEFAULT_INSTANCE);
        }
    }

    static {
        x58 x58Var = new x58();
        DEFAULT_INSTANCE = x58Var;
        v27.m23715h0(x58.class, x58Var);
    }

    private x58() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    public static x58 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14924b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    /* JADX INFO: renamed from: of */
    public static x58 m25014of(long value) {
        return newBuilder().setValue(value).build();
    }

    public static x58 parseDelimitedFrom(InputStream input) throws IOException {
        return (x58) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static x58 parseFrom(ByteBuffer data) throws ce8 {
        return (x58) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<x58> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long value) {
        this.value_ = value;
    }

    @Override // p000.y58
    public long getValue() {
        return this.value_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C14923a c14923a = null;
        switch (C14923a.f96821a[method.ordinal()]) {
            case 1:
                return new x58();
            case 2:
                return new C14924b(c14923a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<x58> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (x58.class) {
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

    public static C14924b newBuilder(x58 prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static x58 parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (x58) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static x58 parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (x58) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static x58 parseFrom(vj1 data) throws ce8 {
        return (x58) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static x58 parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (x58) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static x58 parseFrom(byte[] data) throws ce8 {
        return (x58) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static x58 parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (x58) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static x58 parseFrom(InputStream input) throws IOException {
        return (x58) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static x58 parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (x58) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static x58 parseFrom(f72 input) throws IOException {
        return (x58) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static x58 parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (x58) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
