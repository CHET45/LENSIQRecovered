package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class cph extends v27<cph, C4454b> implements dph {
    private static final cph DEFAULT_INSTANCE;
    private static volatile uhc<cph> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* JADX INFO: renamed from: cph$a */
    public static /* synthetic */ class C4453a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26744a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f26744a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26744a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26744a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26744a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26744a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26744a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26744a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: cph$b */
    public static final class C4454b extends v27.AbstractC13823b<cph, C4454b> implements dph {
        public /* synthetic */ C4454b(C4453a c4453a) {
            this();
        }

        public C4454b clearValue() {
            m23743e();
            ((cph) this.f89756b).clearValue();
            return this;
        }

        @Override // p000.dph
        public long getValue() {
            return ((cph) this.f89756b).getValue();
        }

        public C4454b setValue(long value) {
            m23743e();
            ((cph) this.f89756b).setValue(value);
            return this;
        }

        private C4454b() {
            super(cph.DEFAULT_INSTANCE);
        }
    }

    static {
        cph cphVar = new cph();
        DEFAULT_INSTANCE = cphVar;
        v27.m23715h0(cph.class, cphVar);
    }

    private cph() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    public static cph getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4454b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    /* JADX INFO: renamed from: of */
    public static cph m8650of(long value) {
        return newBuilder().setValue(value).build();
    }

    public static cph parseDelimitedFrom(InputStream input) throws IOException {
        return (cph) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static cph parseFrom(ByteBuffer data) throws ce8 {
        return (cph) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<cph> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long value) {
        this.value_ = value;
    }

    @Override // p000.dph
    public long getValue() {
        return this.value_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C4453a c4453a = null;
        switch (C4453a.f26744a[method.ordinal()]) {
            case 1:
                return new cph();
            case 2:
                return new C4454b(c4453a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<cph> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (cph.class) {
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

    public static C4454b newBuilder(cph prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static cph parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (cph) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static cph parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (cph) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static cph parseFrom(vj1 data) throws ce8 {
        return (cph) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static cph parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (cph) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static cph parseFrom(byte[] data) throws ce8 {
        return (cph) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static cph parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (cph) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static cph parseFrom(InputStream input) throws IOException {
        return (cph) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static cph parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (cph) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static cph parseFrom(f72 input) throws IOException {
        return (cph) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static cph parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (cph) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
