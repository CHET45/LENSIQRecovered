package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.tar.TarConstants;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class qz4 extends v27<qz4, C11769b> implements l05 {
    private static final qz4 DEFAULT_INSTANCE;
    private static volatile uhc<qz4> PARSER;

    /* JADX INFO: renamed from: qz4$a */
    public static /* synthetic */ class C11768a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f76359a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f76359a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76359a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f76359a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f76359a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f76359a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f76359a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f76359a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: qz4$b */
    public static final class C11769b extends v27.AbstractC13823b<qz4, C11769b> implements l05 {
        public /* synthetic */ C11769b(C11768a c11768a) {
            this();
        }

        private C11769b() {
            super(qz4.DEFAULT_INSTANCE);
        }
    }

    static {
        qz4 qz4Var = new qz4();
        DEFAULT_INSTANCE = qz4Var;
        v27.m23715h0(qz4.class, qz4Var);
    }

    private qz4() {
    }

    public static qz4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C11769b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static qz4 parseDelimitedFrom(InputStream input) throws IOException {
        return (qz4) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static qz4 parseFrom(ByteBuffer data) throws ce8 {
        return (qz4) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<qz4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C11768a c11768a = null;
        switch (C11768a.f76359a[method.ordinal()]) {
            case 1:
                return new qz4();
            case 2:
                return new C11769b(c11768a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, TarConstants.VERSION_ANT, null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<qz4> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (qz4.class) {
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

    public static C11769b newBuilder(qz4 prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static qz4 parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (qz4) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static qz4 parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (qz4) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static qz4 parseFrom(vj1 data) throws ce8 {
        return (qz4) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static qz4 parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (qz4) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static qz4 parseFrom(byte[] data) throws ce8 {
        return (qz4) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static qz4 parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (qz4) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static qz4 parseFrom(InputStream input) throws IOException {
        return (qz4) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static qz4 parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (qz4) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static qz4 parseFrom(f72 input) throws IOException {
        return (qz4) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static qz4 parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (qz4) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
