package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class yvf extends v27<yvf, C15851b> implements zvf {
    private static final yvf DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile uhc<yvf> PARSER;
    private String fileName_ = "";

    /* JADX INFO: renamed from: yvf$a */
    public static /* synthetic */ class C15850a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f103159a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f103159a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103159a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103159a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f103159a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f103159a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f103159a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f103159a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: yvf$b */
    public static final class C15851b extends v27.AbstractC13823b<yvf, C15851b> implements zvf {
        public /* synthetic */ C15851b(C15850a c15850a) {
            this();
        }

        public C15851b clearFileName() {
            m23743e();
            ((yvf) this.f89756b).clearFileName();
            return this;
        }

        @Override // p000.zvf
        public String getFileName() {
            return ((yvf) this.f89756b).getFileName();
        }

        @Override // p000.zvf
        public vj1 getFileNameBytes() {
            return ((yvf) this.f89756b).getFileNameBytes();
        }

        public C15851b setFileName(String value) {
            m23743e();
            ((yvf) this.f89756b).setFileName(value);
            return this;
        }

        public C15851b setFileNameBytes(vj1 value) {
            m23743e();
            ((yvf) this.f89756b).setFileNameBytes(value);
            return this;
        }

        private C15851b() {
            super(yvf.DEFAULT_INSTANCE);
        }
    }

    static {
        yvf yvfVar = new yvf();
        DEFAULT_INSTANCE = yvfVar;
        v27.m23715h0(yvf.class, yvfVar);
    }

    private yvf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    public static yvf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C15851b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static yvf parseDelimitedFrom(InputStream input) throws IOException {
        return (yvf) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static yvf parseFrom(ByteBuffer data) throws ce8 {
        return (yvf) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<yvf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String value) {
        value.getClass();
        this.fileName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.fileName_ = value.toStringUtf8();
    }

    @Override // p000.zvf
    public String getFileName() {
        return this.fileName_;
    }

    @Override // p000.zvf
    public vj1 getFileNameBytes() {
        return vj1.copyFromUtf8(this.fileName_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C15850a c15850a = null;
        switch (C15850a.f103159a[method.ordinal()]) {
            case 1:
                return new yvf();
            case 2:
                return new C15851b(c15850a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<yvf> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (yvf.class) {
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

    public static C15851b newBuilder(yvf prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static yvf parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (yvf) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static yvf parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (yvf) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static yvf parseFrom(vj1 data) throws ce8 {
        return (yvf) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static yvf parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (yvf) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static yvf parseFrom(byte[] data) throws ce8 {
        return (yvf) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static yvf parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (yvf) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static yvf parseFrom(InputStream input) throws IOException {
        return (yvf) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static yvf parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (yvf) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static yvf parseFrom(f72 input) throws IOException {
        return (yvf) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static yvf parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (yvf) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
