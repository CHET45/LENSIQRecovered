package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class d54 extends v27<d54, C4616b> implements e54 {
    private static final d54 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<d54> PARSER;
    private String name_ = "";

    /* JADX INFO: renamed from: d54$a */
    public static /* synthetic */ class C4615a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28458a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f28458a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28458a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28458a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28458a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28458a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28458a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28458a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: d54$b */
    public static final class C4616b extends v27.AbstractC13823b<d54, C4616b> implements e54 {
        public /* synthetic */ C4616b(C4615a c4615a) {
            this();
        }

        public C4616b clearName() {
            m23743e();
            ((d54) this.f89756b).clearName();
            return this;
        }

        @Override // p000.e54
        public String getName() {
            return ((d54) this.f89756b).getName();
        }

        @Override // p000.e54
        public vj1 getNameBytes() {
            return ((d54) this.f89756b).getNameBytes();
        }

        public C4616b setName(String str) {
            m23743e();
            ((d54) this.f89756b).setName(str);
            return this;
        }

        public C4616b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((d54) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        private C4616b() {
            super(d54.DEFAULT_INSTANCE);
        }
    }

    static {
        d54 d54Var = new d54();
        DEFAULT_INSTANCE = d54Var;
        v27.m23715h0(d54.class, d54Var);
    }

    private d54() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static d54 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4616b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static d54 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (d54) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static d54 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (d54) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<d54> parser() {
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

    @Override // p000.e54
    public String getName() {
        return this.name_;
    }

    @Override // p000.e54
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C4615a c4615a = null;
        switch (C4615a.f28458a[enumC13830i.ordinal()]) {
            case 1:
                return new d54();
            case 2:
                return new C4616b(c4615a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<d54> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (d54.class) {
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

    public static C4616b newBuilder(d54 d54Var) {
        return DEFAULT_INSTANCE.m23739o(d54Var);
    }

    public static d54 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (d54) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static d54 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (d54) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static d54 parseFrom(vj1 vj1Var) throws ce8 {
        return (d54) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static d54 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (d54) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static d54 parseFrom(byte[] bArr) throws ce8 {
        return (d54) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static d54 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (d54) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static d54 parseFrom(InputStream inputStream) throws IOException {
        return (d54) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static d54 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (d54) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static d54 parseFrom(f72 f72Var) throws IOException {
        return (d54) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static d54 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (d54) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
