package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class xvf extends u27<xvf, C15319b> implements awf {
    private static final xvf DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile vhc<xvf> PARSER;
    private String fileName_ = "";

    /* JADX INFO: renamed from: xvf$a */
    public static /* synthetic */ class C15318a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99491a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f99491a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99491a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99491a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99491a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99491a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99491a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f99491a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: xvf$b */
    public static final class C15319b extends u27.AbstractC13324b<xvf, C15319b> implements awf {
        public /* synthetic */ C15319b(C15318a c15318a) {
            this();
        }

        public C15319b clearFileName() {
            m23058e();
            ((xvf) this.f86607b).clearFileName();
            return this;
        }

        @Override // p000.awf
        public String getFileName() {
            return ((xvf) this.f86607b).getFileName();
        }

        @Override // p000.awf
        public wj1 getFileNameBytes() {
            return ((xvf) this.f86607b).getFileNameBytes();
        }

        public C15319b setFileName(String value) {
            m23058e();
            ((xvf) this.f86607b).setFileName(value);
            return this;
        }

        public C15319b setFileNameBytes(wj1 value) {
            m23058e();
            ((xvf) this.f86607b).setFileNameBytes(value);
            return this;
        }

        private C15319b() {
            super(xvf.DEFAULT_INSTANCE);
        }
    }

    static {
        xvf xvfVar = new xvf();
        DEFAULT_INSTANCE = xvfVar;
        u27.m23029g0(xvf.class, xvfVar);
    }

    private xvf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    public static xvf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C15319b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static xvf parseDelimitedFrom(InputStream input) throws IOException {
        return (xvf) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static xvf parseFrom(ByteBuffer data) throws be8 {
        return (xvf) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<xvf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String value) {
        value.getClass();
        this.fileName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        this.fileName_ = value.toStringUtf8();
    }

    @Override // p000.awf
    public String getFileName() {
        return this.fileName_;
    }

    @Override // p000.awf
    public wj1 getFileNameBytes() {
        return wj1.copyFromUtf8(this.fileName_);
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C15318a c15318a = null;
        switch (C15318a.f99491a[method.ordinal()]) {
            case 1:
                return new xvf();
            case 2:
                return new C15319b(c15318a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<xvf> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (xvf.class) {
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

    public static C15319b newBuilder(xvf prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static xvf parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (xvf) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static xvf parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (xvf) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static xvf parseFrom(wj1 data) throws be8 {
        return (xvf) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static xvf parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (xvf) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static xvf parseFrom(byte[] data) throws be8 {
        return (xvf) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static xvf parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (xvf) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static xvf parseFrom(InputStream input) throws IOException {
        return (xvf) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static xvf parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (xvf) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static xvf parseFrom(e72 input) throws IOException {
        return (xvf) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static xvf parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (xvf) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
