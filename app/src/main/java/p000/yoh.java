package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class yoh extends v27<yoh, C15752b> implements zoh {
    private static final yoh DEFAULT_INSTANCE;
    private static volatile uhc<yoh> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* JADX INFO: renamed from: yoh$a */
    public static /* synthetic */ class C15751a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f102457a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f102457a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102457a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102457a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f102457a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f102457a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f102457a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f102457a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: yoh$b */
    public static final class C15752b extends v27.AbstractC13823b<yoh, C15752b> implements zoh {
        public /* synthetic */ C15752b(C15751a c15751a) {
            this();
        }

        public C15752b clearValue() {
            m23743e();
            ((yoh) this.f89756b).clearValue();
            return this;
        }

        @Override // p000.zoh
        public int getValue() {
            return ((yoh) this.f89756b).getValue();
        }

        public C15752b setValue(int value) {
            m23743e();
            ((yoh) this.f89756b).setValue(value);
            return this;
        }

        private C15752b() {
            super(yoh.DEFAULT_INSTANCE);
        }
    }

    static {
        yoh yohVar = new yoh();
        DEFAULT_INSTANCE = yohVar;
        v27.m23715h0(yoh.class, yohVar);
    }

    private yoh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static yoh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C15752b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    /* JADX INFO: renamed from: of */
    public static yoh m26269of(int value) {
        return newBuilder().setValue(value).build();
    }

    public static yoh parseDelimitedFrom(InputStream input) throws IOException {
        return (yoh) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static yoh parseFrom(ByteBuffer data) throws ce8 {
        return (yoh) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<yoh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int value) {
        this.value_ = value;
    }

    @Override // p000.zoh
    public int getValue() {
        return this.value_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C15751a c15751a = null;
        switch (C15751a.f102457a[method.ordinal()]) {
            case 1:
                return new yoh();
            case 2:
                return new C15752b(c15751a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<yoh> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (yoh.class) {
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

    public static C15752b newBuilder(yoh prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static yoh parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (yoh) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static yoh parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (yoh) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static yoh parseFrom(vj1 data) throws ce8 {
        return (yoh) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static yoh parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (yoh) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static yoh parseFrom(byte[] data) throws ce8 {
        return (yoh) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static yoh parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (yoh) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static yoh parseFrom(InputStream input) throws IOException {
        return (yoh) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static yoh parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (yoh) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static yoh parseFrom(f72 input) throws IOException {
        return (yoh) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static yoh parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (yoh) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
