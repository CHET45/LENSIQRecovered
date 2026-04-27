package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class r47 extends v27<r47, C11885b> implements s47 {
    private static final r47 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<r47> PARSER;
    private String name_ = "";

    /* JADX INFO: renamed from: r47$a */
    public static /* synthetic */ class C11884a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f77012a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f77012a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77012a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77012a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77012a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f77012a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f77012a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f77012a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: r47$b */
    public static final class C11885b extends v27.AbstractC13823b<r47, C11885b> implements s47 {
        public /* synthetic */ C11885b(C11884a c11884a) {
            this();
        }

        public C11885b clearName() {
            m23743e();
            ((r47) this.f89756b).clearName();
            return this;
        }

        @Override // p000.s47
        public String getName() {
            return ((r47) this.f89756b).getName();
        }

        @Override // p000.s47
        public vj1 getNameBytes() {
            return ((r47) this.f89756b).getNameBytes();
        }

        public C11885b setName(String str) {
            m23743e();
            ((r47) this.f89756b).setName(str);
            return this;
        }

        public C11885b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((r47) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        private C11885b() {
            super(r47.DEFAULT_INSTANCE);
        }
    }

    static {
        r47 r47Var = new r47();
        DEFAULT_INSTANCE = r47Var;
        v27.m23715h0(r47.class, r47Var);
    }

    private r47() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static r47 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C11885b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static r47 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (r47) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static r47 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (r47) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<r47> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.name_ = vj1Var.toStringUtf8();
    }

    @Override // p000.s47
    public String getName() {
        return this.name_;
    }

    @Override // p000.s47
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C11884a c11884a = null;
        switch (C11884a.f77012a[enumC13830i.ordinal()]) {
            case 1:
                return new r47();
            case 2:
                return new C11885b(c11884a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<r47> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (r47.class) {
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

    public static C11885b newBuilder(r47 r47Var) {
        return DEFAULT_INSTANCE.m23739o(r47Var);
    }

    public static r47 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (r47) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static r47 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (r47) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static r47 parseFrom(vj1 vj1Var) throws ce8 {
        return (r47) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static r47 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (r47) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static r47 parseFrom(byte[] bArr) throws ce8 {
        return (r47) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static r47 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (r47) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static r47 parseFrom(InputStream inputStream) throws IOException {
        return (r47) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static r47 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (r47) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static r47 parseFrom(f72 f72Var) throws IOException {
        return (r47) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static r47 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (r47) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
