package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class cd3 extends v27<cd3, C2278b> implements dd3 {
    private static final cd3 DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile uhc<cd3> PARSER = null;
    public static final int PATH_FIELD_NUMBER = 2;
    private String kind_ = "";
    private String path_ = "";

    /* JADX INFO: renamed from: cd3$a */
    public static /* synthetic */ class C2277a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16282a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f16282a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16282a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16282a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16282a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16282a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16282a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16282a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: cd3$b */
    public static final class C2278b extends v27.AbstractC13823b<cd3, C2278b> implements dd3 {
        public /* synthetic */ C2278b(C2277a c2277a) {
            this();
        }

        public C2278b clearKind() {
            m23743e();
            ((cd3) this.f89756b).clearKind();
            return this;
        }

        public C2278b clearPath() {
            m23743e();
            ((cd3) this.f89756b).clearPath();
            return this;
        }

        @Override // p000.dd3
        public String getKind() {
            return ((cd3) this.f89756b).getKind();
        }

        @Override // p000.dd3
        public vj1 getKindBytes() {
            return ((cd3) this.f89756b).getKindBytes();
        }

        @Override // p000.dd3
        public String getPath() {
            return ((cd3) this.f89756b).getPath();
        }

        @Override // p000.dd3
        public vj1 getPathBytes() {
            return ((cd3) this.f89756b).getPathBytes();
        }

        public C2278b setKind(String str) {
            m23743e();
            ((cd3) this.f89756b).setKind(str);
            return this;
        }

        public C2278b setKindBytes(vj1 vj1Var) {
            m23743e();
            ((cd3) this.f89756b).setKindBytes(vj1Var);
            return this;
        }

        public C2278b setPath(String str) {
            m23743e();
            ((cd3) this.f89756b).setPath(str);
            return this;
        }

        public C2278b setPathBytes(vj1 vj1Var) {
            m23743e();
            ((cd3) this.f89756b).setPathBytes(vj1Var);
            return this;
        }

        private C2278b() {
            super(cd3.DEFAULT_INSTANCE);
        }
    }

    static {
        cd3 cd3Var = new cd3();
        DEFAULT_INSTANCE = cd3Var;
        v27.m23715h0(cd3.class, cd3Var);
    }

    private cd3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = getDefaultInstance().getKind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPath() {
        this.path_ = getDefaultInstance().getPath();
    }

    public static cd3 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C2278b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static cd3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (cd3) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static cd3 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (cd3) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<cd3> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(String str) {
        str.getClass();
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.kind_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.path_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.path_ = vj1Var.toStringUtf8();
    }

    @Override // p000.dd3
    public String getKind() {
        return this.kind_;
    }

    @Override // p000.dd3
    public vj1 getKindBytes() {
        return vj1.copyFromUtf8(this.kind_);
    }

    @Override // p000.dd3
    public String getPath() {
        return this.path_;
    }

    @Override // p000.dd3
    public vj1 getPathBytes() {
        return vj1.copyFromUtf8(this.path_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C2277a c2277a = null;
        switch (C2277a.f16282a[enumC13830i.ordinal()]) {
            case 1:
                return new cd3();
            case 2:
                return new C2278b(c2277a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"kind_", "path_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<cd3> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (cd3.class) {
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

    public static C2278b newBuilder(cd3 cd3Var) {
        return DEFAULT_INSTANCE.m23739o(cd3Var);
    }

    public static cd3 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (cd3) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static cd3 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (cd3) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static cd3 parseFrom(vj1 vj1Var) throws ce8 {
        return (cd3) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static cd3 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (cd3) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static cd3 parseFrom(byte[] bArr) throws ce8 {
        return (cd3) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static cd3 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (cd3) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static cd3 parseFrom(InputStream inputStream) throws IOException {
        return (cd3) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static cd3 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (cd3) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static cd3 parseFrom(f72 f72Var) throws IOException {
        return (cd3) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static cd3 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (cd3) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
