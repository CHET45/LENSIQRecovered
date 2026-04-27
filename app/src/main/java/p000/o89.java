package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class o89 extends v27<o89, C10223b> implements p89 {
    private static final o89 DEFAULT_INSTANCE;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile uhc<o89> PARSER;
    private int pageSize_;
    private String parent_ = "";
    private String pageToken_ = "";

    /* JADX INFO: renamed from: o89$a */
    public static /* synthetic */ class C10222a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66658a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f66658a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66658a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66658a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66658a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66658a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66658a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66658a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: o89$b */
    public static final class C10223b extends v27.AbstractC13823b<o89, C10223b> implements p89 {
        public /* synthetic */ C10223b(C10222a c10222a) {
            this();
        }

        public C10223b clearPageSize() {
            m23743e();
            ((o89) this.f89756b).clearPageSize();
            return this;
        }

        public C10223b clearPageToken() {
            m23743e();
            ((o89) this.f89756b).clearPageToken();
            return this;
        }

        public C10223b clearParent() {
            m23743e();
            ((o89) this.f89756b).clearParent();
            return this;
        }

        @Override // p000.p89
        public int getPageSize() {
            return ((o89) this.f89756b).getPageSize();
        }

        @Override // p000.p89
        public String getPageToken() {
            return ((o89) this.f89756b).getPageToken();
        }

        @Override // p000.p89
        public vj1 getPageTokenBytes() {
            return ((o89) this.f89756b).getPageTokenBytes();
        }

        @Override // p000.p89
        public String getParent() {
            return ((o89) this.f89756b).getParent();
        }

        @Override // p000.p89
        public vj1 getParentBytes() {
            return ((o89) this.f89756b).getParentBytes();
        }

        public C10223b setPageSize(int i) {
            m23743e();
            ((o89) this.f89756b).setPageSize(i);
            return this;
        }

        public C10223b setPageToken(String str) {
            m23743e();
            ((o89) this.f89756b).setPageToken(str);
            return this;
        }

        public C10223b setPageTokenBytes(vj1 vj1Var) {
            m23743e();
            ((o89) this.f89756b).setPageTokenBytes(vj1Var);
            return this;
        }

        public C10223b setParent(String str) {
            m23743e();
            ((o89) this.f89756b).setParent(str);
            return this;
        }

        public C10223b setParentBytes(vj1 vj1Var) {
            m23743e();
            ((o89) this.f89756b).setParentBytes(vj1Var);
            return this;
        }

        private C10223b() {
            super(o89.DEFAULT_INSTANCE);
        }
    }

    static {
        o89 o89Var = new o89();
        DEFAULT_INSTANCE = o89Var;
        v27.m23715h0(o89.class, o89Var);
    }

    private o89() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageSize() {
        this.pageSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageToken() {
        this.pageToken_ = getDefaultInstance().getPageToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParent() {
        this.parent_ = getDefaultInstance().getParent();
    }

    public static o89 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C10223b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static o89 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (o89) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static o89 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (o89) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<o89> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageSize(int i) {
        this.pageSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageToken(String str) {
        str.getClass();
        this.pageToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageTokenBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.pageToken_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParent(String str) {
        str.getClass();
        this.parent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.parent_ = vj1Var.toStringUtf8();
    }

    @Override // p000.p89
    public int getPageSize() {
        return this.pageSize_;
    }

    @Override // p000.p89
    public String getPageToken() {
        return this.pageToken_;
    }

    @Override // p000.p89
    public vj1 getPageTokenBytes() {
        return vj1.copyFromUtf8(this.pageToken_);
    }

    @Override // p000.p89
    public String getParent() {
        return this.parent_;
    }

    @Override // p000.p89
    public vj1 getParentBytes() {
        return vj1.copyFromUtf8(this.parent_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C10222a c10222a = null;
        switch (C10222a.f66658a[enumC13830i.ordinal()]) {
            case 1:
                return new o89();
            case 2:
                return new C10223b(c10222a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"parent_", "pageSize_", "pageToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<o89> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (o89.class) {
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

    public static C10223b newBuilder(o89 o89Var) {
        return DEFAULT_INSTANCE.m23739o(o89Var);
    }

    public static o89 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (o89) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static o89 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (o89) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static o89 parseFrom(vj1 vj1Var) throws ce8 {
        return (o89) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static o89 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (o89) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static o89 parseFrom(byte[] bArr) throws ce8 {
        return (o89) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static o89 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (o89) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static o89 parseFrom(InputStream inputStream) throws IOException {
        return (o89) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static o89 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (o89) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static o89 parseFrom(f72 f72Var) throws IOException {
        return (o89) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static o89 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (o89) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
