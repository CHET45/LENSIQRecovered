package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class oz2 extends v27<oz2, C10723b> implements qz2 {
    private static final oz2 DEFAULT_INSTANCE;
    public static final int ENVIRONMENT_FIELD_NUMBER = 1;
    private static volatile uhc<oz2> PARSER;
    private String environment_ = "";

    /* JADX INFO: renamed from: oz2$a */
    public static /* synthetic */ class C10722a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f69256a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f69256a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69256a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69256a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69256a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69256a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69256a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69256a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: oz2$b */
    public static final class C10723b extends v27.AbstractC13823b<oz2, C10723b> implements qz2 {
        public /* synthetic */ C10723b(C10722a c10722a) {
            this();
        }

        public C10723b clearEnvironment() {
            m23743e();
            ((oz2) this.f89756b).clearEnvironment();
            return this;
        }

        @Override // p000.qz2
        public String getEnvironment() {
            return ((oz2) this.f89756b).getEnvironment();
        }

        @Override // p000.qz2
        public vj1 getEnvironmentBytes() {
            return ((oz2) this.f89756b).getEnvironmentBytes();
        }

        public C10723b setEnvironment(String str) {
            m23743e();
            ((oz2) this.f89756b).setEnvironment(str);
            return this;
        }

        public C10723b setEnvironmentBytes(vj1 vj1Var) {
            m23743e();
            ((oz2) this.f89756b).setEnvironmentBytes(vj1Var);
            return this;
        }

        private C10723b() {
            super(oz2.DEFAULT_INSTANCE);
        }
    }

    static {
        oz2 oz2Var = new oz2();
        DEFAULT_INSTANCE = oz2Var;
        v27.m23715h0(oz2.class, oz2Var);
    }

    private oz2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnvironment() {
        this.environment_ = getDefaultInstance().getEnvironment();
    }

    public static oz2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C10723b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static oz2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (oz2) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static oz2 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (oz2) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<oz2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvironment(String str) {
        str.getClass();
        this.environment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvironmentBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.environment_ = vj1Var.toStringUtf8();
    }

    @Override // p000.qz2
    public String getEnvironment() {
        return this.environment_;
    }

    @Override // p000.qz2
    public vj1 getEnvironmentBytes() {
        return vj1.copyFromUtf8(this.environment_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C10722a c10722a = null;
        switch (C10722a.f69256a[enumC13830i.ordinal()]) {
            case 1:
                return new oz2();
            case 2:
                return new C10723b(c10722a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"environment_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<oz2> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (oz2.class) {
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

    public static C10723b newBuilder(oz2 oz2Var) {
        return DEFAULT_INSTANCE.m23739o(oz2Var);
    }

    public static oz2 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (oz2) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static oz2 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (oz2) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static oz2 parseFrom(vj1 vj1Var) throws ce8 {
        return (oz2) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static oz2 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (oz2) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static oz2 parseFrom(byte[] bArr) throws ce8 {
        return (oz2) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static oz2 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (oz2) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static oz2 parseFrom(InputStream inputStream) throws IOException {
        return (oz2) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static oz2 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (oz2) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static oz2 parseFrom(f72 f72Var) throws IOException {
        return (oz2) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static oz2 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (oz2) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
