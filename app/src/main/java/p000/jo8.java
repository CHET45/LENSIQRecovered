package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class jo8 extends v27<jo8, C7992b> implements ko8 {
    private static final jo8 DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile uhc<jo8> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private Object in_;
    private int inCase_ = 0;
    private String valuePrefix_ = "";

    /* JADX INFO: renamed from: jo8$a */
    public static /* synthetic */ class C7991a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51338a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f51338a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51338a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51338a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51338a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51338a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51338a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51338a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: jo8$b */
    public static final class C7992b extends v27.AbstractC13823b<jo8, C7992b> implements ko8 {
        public /* synthetic */ C7992b(C7991a c7991a) {
            this();
        }

        public C7992b clearHeader() {
            m23743e();
            ((jo8) this.f89756b).clearHeader();
            return this;
        }

        public C7992b clearIn() {
            m23743e();
            ((jo8) this.f89756b).clearIn();
            return this;
        }

        public C7992b clearQuery() {
            m23743e();
            ((jo8) this.f89756b).clearQuery();
            return this;
        }

        public C7992b clearValuePrefix() {
            m23743e();
            ((jo8) this.f89756b).clearValuePrefix();
            return this;
        }

        @Override // p000.ko8
        public String getHeader() {
            return ((jo8) this.f89756b).getHeader();
        }

        @Override // p000.ko8
        public vj1 getHeaderBytes() {
            return ((jo8) this.f89756b).getHeaderBytes();
        }

        @Override // p000.ko8
        public EnumC7993c getInCase() {
            return ((jo8) this.f89756b).getInCase();
        }

        @Override // p000.ko8
        public String getQuery() {
            return ((jo8) this.f89756b).getQuery();
        }

        @Override // p000.ko8
        public vj1 getQueryBytes() {
            return ((jo8) this.f89756b).getQueryBytes();
        }

        @Override // p000.ko8
        public String getValuePrefix() {
            return ((jo8) this.f89756b).getValuePrefix();
        }

        @Override // p000.ko8
        public vj1 getValuePrefixBytes() {
            return ((jo8) this.f89756b).getValuePrefixBytes();
        }

        @Override // p000.ko8
        public boolean hasHeader() {
            return ((jo8) this.f89756b).hasHeader();
        }

        @Override // p000.ko8
        public boolean hasQuery() {
            return ((jo8) this.f89756b).hasQuery();
        }

        public C7992b setHeader(String str) {
            m23743e();
            ((jo8) this.f89756b).setHeader(str);
            return this;
        }

        public C7992b setHeaderBytes(vj1 vj1Var) {
            m23743e();
            ((jo8) this.f89756b).setHeaderBytes(vj1Var);
            return this;
        }

        public C7992b setQuery(String str) {
            m23743e();
            ((jo8) this.f89756b).setQuery(str);
            return this;
        }

        public C7992b setQueryBytes(vj1 vj1Var) {
            m23743e();
            ((jo8) this.f89756b).setQueryBytes(vj1Var);
            return this;
        }

        public C7992b setValuePrefix(String str) {
            m23743e();
            ((jo8) this.f89756b).setValuePrefix(str);
            return this;
        }

        public C7992b setValuePrefixBytes(vj1 vj1Var) {
            m23743e();
            ((jo8) this.f89756b).setValuePrefixBytes(vj1Var);
            return this;
        }

        private C7992b() {
            super(jo8.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: jo8$c */
    public enum EnumC7993c {
        HEADER(1),
        QUERY(2),
        IN_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f51343a;

        EnumC7993c(int i) {
            this.f51343a = i;
        }

        public static EnumC7993c forNumber(int i) {
            if (i == 0) {
                return IN_NOT_SET;
            }
            if (i == 1) {
                return HEADER;
            }
            if (i != 2) {
                return null;
            }
            return QUERY;
        }

        public int getNumber() {
            return this.f51343a;
        }

        @Deprecated
        public static EnumC7993c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        jo8 jo8Var = new jo8();
        DEFAULT_INSTANCE = jo8Var;
        v27.m23715h0(jo8.class, jo8Var);
    }

    private jo8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeader() {
        if (this.inCase_ == 1) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIn() {
        this.inCase_ = 0;
        this.in_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        if (this.inCase_ == 2) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValuePrefix() {
        this.valuePrefix_ = getDefaultInstance().getValuePrefix();
    }

    public static jo8 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C7992b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static jo8 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (jo8) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static jo8 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (jo8) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<jo8> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeader(String str) {
        str.getClass();
        this.inCase_ = 1;
        this.in_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeaderBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.in_ = vj1Var.toStringUtf8();
        this.inCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(String str) {
        str.getClass();
        this.inCase_ = 2;
        this.in_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.in_ = vj1Var.toStringUtf8();
        this.inCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValuePrefix(String str) {
        str.getClass();
        this.valuePrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValuePrefixBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.valuePrefix_ = vj1Var.toStringUtf8();
    }

    @Override // p000.ko8
    public String getHeader() {
        return this.inCase_ == 1 ? (String) this.in_ : "";
    }

    @Override // p000.ko8
    public vj1 getHeaderBytes() {
        return vj1.copyFromUtf8(this.inCase_ == 1 ? (String) this.in_ : "");
    }

    @Override // p000.ko8
    public EnumC7993c getInCase() {
        return EnumC7993c.forNumber(this.inCase_);
    }

    @Override // p000.ko8
    public String getQuery() {
        return this.inCase_ == 2 ? (String) this.in_ : "";
    }

    @Override // p000.ko8
    public vj1 getQueryBytes() {
        return vj1.copyFromUtf8(this.inCase_ == 2 ? (String) this.in_ : "");
    }

    @Override // p000.ko8
    public String getValuePrefix() {
        return this.valuePrefix_;
    }

    @Override // p000.ko8
    public vj1 getValuePrefixBytes() {
        return vj1.copyFromUtf8(this.valuePrefix_);
    }

    @Override // p000.ko8
    public boolean hasHeader() {
        return this.inCase_ == 1;
    }

    @Override // p000.ko8
    public boolean hasQuery() {
        return this.inCase_ == 2;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C7991a c7991a = null;
        switch (C7991a.f51338a[enumC13830i.ordinal()]) {
            case 1:
                return new jo8();
            case 2:
                return new C7992b(c7991a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"in_", "inCase_", "valuePrefix_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<jo8> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (jo8.class) {
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

    public static C7992b newBuilder(jo8 jo8Var) {
        return DEFAULT_INSTANCE.m23739o(jo8Var);
    }

    public static jo8 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (jo8) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static jo8 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (jo8) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static jo8 parseFrom(vj1 vj1Var) throws ce8 {
        return (jo8) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static jo8 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (jo8) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static jo8 parseFrom(byte[] bArr) throws ce8 {
        return (jo8) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static jo8 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (jo8) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static jo8 parseFrom(InputStream inputStream) throws IOException {
        return (jo8) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static jo8 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (jo8) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static jo8 parseFrom(f72 f72Var) throws IOException {
        return (jo8) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static jo8 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (jo8) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
