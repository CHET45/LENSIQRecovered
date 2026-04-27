package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class v6e extends v27<v6e, C13890b> implements w6e {
    public static final int CHILD_TYPE_FIELD_NUMBER = 2;
    private static final v6e DEFAULT_INSTANCE;
    private static volatile uhc<v6e> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String type_ = "";
    private String childType_ = "";

    /* JADX INFO: renamed from: v6e$a */
    public static /* synthetic */ class C13889a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f90109a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f90109a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90109a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90109a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90109a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90109a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90109a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90109a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: v6e$b */
    public static final class C13890b extends v27.AbstractC13823b<v6e, C13890b> implements w6e {
        public /* synthetic */ C13890b(C13889a c13889a) {
            this();
        }

        public C13890b clearChildType() {
            m23743e();
            ((v6e) this.f89756b).clearChildType();
            return this;
        }

        public C13890b clearType() {
            m23743e();
            ((v6e) this.f89756b).clearType();
            return this;
        }

        @Override // p000.w6e
        public String getChildType() {
            return ((v6e) this.f89756b).getChildType();
        }

        @Override // p000.w6e
        public vj1 getChildTypeBytes() {
            return ((v6e) this.f89756b).getChildTypeBytes();
        }

        @Override // p000.w6e
        public String getType() {
            return ((v6e) this.f89756b).getType();
        }

        @Override // p000.w6e
        public vj1 getTypeBytes() {
            return ((v6e) this.f89756b).getTypeBytes();
        }

        public C13890b setChildType(String str) {
            m23743e();
            ((v6e) this.f89756b).setChildType(str);
            return this;
        }

        public C13890b setChildTypeBytes(vj1 vj1Var) {
            m23743e();
            ((v6e) this.f89756b).setChildTypeBytes(vj1Var);
            return this;
        }

        public C13890b setType(String str) {
            m23743e();
            ((v6e) this.f89756b).setType(str);
            return this;
        }

        public C13890b setTypeBytes(vj1 vj1Var) {
            m23743e();
            ((v6e) this.f89756b).setTypeBytes(vj1Var);
            return this;
        }

        private C13890b() {
            super(v6e.DEFAULT_INSTANCE);
        }
    }

    static {
        v6e v6eVar = new v6e();
        DEFAULT_INSTANCE = v6eVar;
        v27.m23715h0(v6e.class, v6eVar);
    }

    private v6e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildType() {
        this.childType_ = getDefaultInstance().getChildType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static v6e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13890b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static v6e parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (v6e) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static v6e parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (v6e) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<v6e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildType(String str) {
        str.getClass();
        this.childType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildTypeBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.childType_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.type_ = vj1Var.toStringUtf8();
    }

    @Override // p000.w6e
    public String getChildType() {
        return this.childType_;
    }

    @Override // p000.w6e
    public vj1 getChildTypeBytes() {
        return vj1.copyFromUtf8(this.childType_);
    }

    @Override // p000.w6e
    public String getType() {
        return this.type_;
    }

    @Override // p000.w6e
    public vj1 getTypeBytes() {
        return vj1.copyFromUtf8(this.type_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C13889a c13889a = null;
        switch (C13889a.f90109a[enumC13830i.ordinal()]) {
            case 1:
                return new v6e();
            case 2:
                return new C13890b(c13889a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"type_", "childType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<v6e> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (v6e.class) {
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

    public static C13890b newBuilder(v6e v6eVar) {
        return DEFAULT_INSTANCE.m23739o(v6eVar);
    }

    public static v6e parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (v6e) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static v6e parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (v6e) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static v6e parseFrom(vj1 vj1Var) throws ce8 {
        return (v6e) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static v6e parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (v6e) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static v6e parseFrom(byte[] bArr) throws ce8 {
        return (v6e) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static v6e parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (v6e) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static v6e parseFrom(InputStream inputStream) throws IOException {
        return (v6e) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static v6e parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (v6e) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static v6e parseFrom(f72 f72Var) throws IOException {
        return (v6e) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static v6e parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (v6e) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
