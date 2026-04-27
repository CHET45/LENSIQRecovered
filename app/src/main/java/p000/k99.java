package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class k99 extends v27<k99, C8256b> implements l99 {
    private static final k99 DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile uhc<k99> PARSER;
    private int pageSize_;
    private String name_ = "";
    private String filter_ = "";
    private String pageToken_ = "";

    /* JADX INFO: renamed from: k99$a */
    public static /* synthetic */ class C8255a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f53370a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f53370a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53370a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53370a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53370a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53370a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53370a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53370a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: k99$b */
    public static final class C8256b extends v27.AbstractC13823b<k99, C8256b> implements l99 {
        public /* synthetic */ C8256b(C8255a c8255a) {
            this();
        }

        public C8256b clearFilter() {
            m23743e();
            ((k99) this.f89756b).clearFilter();
            return this;
        }

        public C8256b clearName() {
            m23743e();
            ((k99) this.f89756b).clearName();
            return this;
        }

        public C8256b clearPageSize() {
            m23743e();
            ((k99) this.f89756b).clearPageSize();
            return this;
        }

        public C8256b clearPageToken() {
            m23743e();
            ((k99) this.f89756b).clearPageToken();
            return this;
        }

        @Override // p000.l99
        public String getFilter() {
            return ((k99) this.f89756b).getFilter();
        }

        @Override // p000.l99
        public vj1 getFilterBytes() {
            return ((k99) this.f89756b).getFilterBytes();
        }

        @Override // p000.l99
        public String getName() {
            return ((k99) this.f89756b).getName();
        }

        @Override // p000.l99
        public vj1 getNameBytes() {
            return ((k99) this.f89756b).getNameBytes();
        }

        @Override // p000.l99
        public int getPageSize() {
            return ((k99) this.f89756b).getPageSize();
        }

        @Override // p000.l99
        public String getPageToken() {
            return ((k99) this.f89756b).getPageToken();
        }

        @Override // p000.l99
        public vj1 getPageTokenBytes() {
            return ((k99) this.f89756b).getPageTokenBytes();
        }

        public C8256b setFilter(String str) {
            m23743e();
            ((k99) this.f89756b).setFilter(str);
            return this;
        }

        public C8256b setFilterBytes(vj1 vj1Var) {
            m23743e();
            ((k99) this.f89756b).setFilterBytes(vj1Var);
            return this;
        }

        public C8256b setName(String str) {
            m23743e();
            ((k99) this.f89756b).setName(str);
            return this;
        }

        public C8256b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((k99) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C8256b setPageSize(int i) {
            m23743e();
            ((k99) this.f89756b).setPageSize(i);
            return this;
        }

        public C8256b setPageToken(String str) {
            m23743e();
            ((k99) this.f89756b).setPageToken(str);
            return this;
        }

        public C8256b setPageTokenBytes(vj1 vj1Var) {
            m23743e();
            ((k99) this.f89756b).setPageTokenBytes(vj1Var);
            return this;
        }

        private C8256b() {
            super(k99.DEFAULT_INSTANCE);
        }
    }

    static {
        k99 k99Var = new k99();
        DEFAULT_INSTANCE = k99Var;
        v27.m23715h0(k99.class, k99Var);
    }

    private k99() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilter() {
        this.filter_ = getDefaultInstance().getFilter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageSize() {
        this.pageSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageToken() {
        this.pageToken_ = getDefaultInstance().getPageToken();
    }

    public static k99 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8256b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static k99 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (k99) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static k99 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (k99) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<k99> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilter(String str) {
        str.getClass();
        this.filter_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilterBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.filter_ = vj1Var.toStringUtf8();
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

    @Override // p000.l99
    public String getFilter() {
        return this.filter_;
    }

    @Override // p000.l99
    public vj1 getFilterBytes() {
        return vj1.copyFromUtf8(this.filter_);
    }

    @Override // p000.l99
    public String getName() {
        return this.name_;
    }

    @Override // p000.l99
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.l99
    public int getPageSize() {
        return this.pageSize_;
    }

    @Override // p000.l99
    public String getPageToken() {
        return this.pageToken_;
    }

    @Override // p000.l99
    public vj1 getPageTokenBytes() {
        return vj1.copyFromUtf8(this.pageToken_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8255a c8255a = null;
        switch (C8255a.f53370a[enumC13830i.ordinal()]) {
            case 1:
                return new k99();
            case 2:
                return new C8256b(c8255a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ", new Object[]{"filter_", "pageSize_", "pageToken_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<k99> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (k99.class) {
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

    public static C8256b newBuilder(k99 k99Var) {
        return DEFAULT_INSTANCE.m23739o(k99Var);
    }

    public static k99 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (k99) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static k99 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (k99) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static k99 parseFrom(vj1 vj1Var) throws ce8 {
        return (k99) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static k99 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (k99) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static k99 parseFrom(byte[] bArr) throws ce8 {
        return (k99) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static k99 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (k99) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static k99 parseFrom(InputStream inputStream) throws IOException {
        return (k99) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static k99 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (k99) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static k99 parseFrom(f72 f72Var) throws IOException {
        return (k99) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static k99 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (k99) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
