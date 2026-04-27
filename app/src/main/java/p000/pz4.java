package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.tar.TarConstants;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class pz4 extends u27<pz4, C11191b> implements m05 {
    private static final pz4 DEFAULT_INSTANCE;
    private static volatile vhc<pz4> PARSER;

    /* JADX INFO: renamed from: pz4$a */
    public static /* synthetic */ class C11190a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f72560a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f72560a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72560a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72560a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72560a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f72560a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f72560a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f72560a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: pz4$b */
    public static final class C11191b extends u27.AbstractC13324b<pz4, C11191b> implements m05 {
        public /* synthetic */ C11191b(C11190a c11190a) {
            this();
        }

        private C11191b() {
            super(pz4.DEFAULT_INSTANCE);
        }
    }

    static {
        pz4 pz4Var = new pz4();
        DEFAULT_INSTANCE = pz4Var;
        u27.m23029g0(pz4.class, pz4Var);
    }

    private pz4() {
    }

    public static pz4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C11191b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static pz4 parseDelimitedFrom(InputStream input) throws IOException {
        return (pz4) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static pz4 parseFrom(ByteBuffer data) throws be8 {
        return (pz4) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<pz4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C11190a c11190a = null;
        switch (C11190a.f72560a[method.ordinal()]) {
            case 1:
                return new pz4();
            case 2:
                return new C11191b(c11190a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, TarConstants.VERSION_ANT, null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<pz4> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (pz4.class) {
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

    public static C11191b newBuilder(pz4 prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static pz4 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (pz4) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static pz4 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (pz4) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static pz4 parseFrom(wj1 data) throws be8 {
        return (pz4) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static pz4 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (pz4) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static pz4 parseFrom(byte[] data) throws be8 {
        return (pz4) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static pz4 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (pz4) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static pz4 parseFrom(InputStream input) throws IOException {
        return (pz4) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static pz4 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (pz4) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static pz4 parseFrom(e72 input) throws IOException {
        return (pz4) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static pz4 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (pz4) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
