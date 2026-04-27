package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.di4;
import p000.f2h;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class u89 extends v27<u89, C13404b> implements v89 {
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final u89 DEFAULT_INSTANCE;
    public static final int MASK_FIELD_NUMBER = 7;
    public static final int ORDER_BY_FIELD_NUMBER = 6;
    public static final int PAGE_SIZE_FIELD_NUMBER = 3;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 4;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile uhc<u89> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 10;
    public static final int SHOW_MISSING_FIELD_NUMBER = 12;
    public static final int TRANSACTION_FIELD_NUMBER = 8;
    private int bitField0_;
    private Object consistencySelector_;
    private di4 mask_;
    private int pageSize_;
    private boolean showMissing_;
    private int consistencySelectorCase_ = 0;
    private String parent_ = "";
    private String collectionId_ = "";
    private String pageToken_ = "";
    private String orderBy_ = "";

    /* JADX INFO: renamed from: u89$a */
    public static /* synthetic */ class C13403a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f87060a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f87060a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87060a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87060a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87060a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f87060a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f87060a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f87060a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: u89$b */
    public static final class C13404b extends v27.AbstractC13823b<u89, C13404b> implements v89 {
        public /* synthetic */ C13404b(C13403a c13403a) {
            this();
        }

        public C13404b clearCollectionId() {
            m23743e();
            ((u89) this.f89756b).clearCollectionId();
            return this;
        }

        public C13404b clearConsistencySelector() {
            m23743e();
            ((u89) this.f89756b).clearConsistencySelector();
            return this;
        }

        public C13404b clearMask() {
            m23743e();
            ((u89) this.f89756b).clearMask();
            return this;
        }

        public C13404b clearOrderBy() {
            m23743e();
            ((u89) this.f89756b).clearOrderBy();
            return this;
        }

        public C13404b clearPageSize() {
            m23743e();
            ((u89) this.f89756b).clearPageSize();
            return this;
        }

        public C13404b clearPageToken() {
            m23743e();
            ((u89) this.f89756b).clearPageToken();
            return this;
        }

        public C13404b clearParent() {
            m23743e();
            ((u89) this.f89756b).clearParent();
            return this;
        }

        public C13404b clearReadTime() {
            m23743e();
            ((u89) this.f89756b).clearReadTime();
            return this;
        }

        public C13404b clearShowMissing() {
            m23743e();
            ((u89) this.f89756b).clearShowMissing();
            return this;
        }

        public C13404b clearTransaction() {
            m23743e();
            ((u89) this.f89756b).clearTransaction();
            return this;
        }

        @Override // p000.v89
        public String getCollectionId() {
            return ((u89) this.f89756b).getCollectionId();
        }

        @Override // p000.v89
        public vj1 getCollectionIdBytes() {
            return ((u89) this.f89756b).getCollectionIdBytes();
        }

        @Override // p000.v89
        public EnumC13405c getConsistencySelectorCase() {
            return ((u89) this.f89756b).getConsistencySelectorCase();
        }

        @Override // p000.v89
        public di4 getMask() {
            return ((u89) this.f89756b).getMask();
        }

        @Override // p000.v89
        public String getOrderBy() {
            return ((u89) this.f89756b).getOrderBy();
        }

        @Override // p000.v89
        public vj1 getOrderByBytes() {
            return ((u89) this.f89756b).getOrderByBytes();
        }

        @Override // p000.v89
        public int getPageSize() {
            return ((u89) this.f89756b).getPageSize();
        }

        @Override // p000.v89
        public String getPageToken() {
            return ((u89) this.f89756b).getPageToken();
        }

        @Override // p000.v89
        public vj1 getPageTokenBytes() {
            return ((u89) this.f89756b).getPageTokenBytes();
        }

        @Override // p000.v89
        public String getParent() {
            return ((u89) this.f89756b).getParent();
        }

        @Override // p000.v89
        public vj1 getParentBytes() {
            return ((u89) this.f89756b).getParentBytes();
        }

        @Override // p000.v89
        public f2h getReadTime() {
            return ((u89) this.f89756b).getReadTime();
        }

        @Override // p000.v89
        public boolean getShowMissing() {
            return ((u89) this.f89756b).getShowMissing();
        }

        @Override // p000.v89
        public vj1 getTransaction() {
            return ((u89) this.f89756b).getTransaction();
        }

        @Override // p000.v89
        public boolean hasMask() {
            return ((u89) this.f89756b).hasMask();
        }

        @Override // p000.v89
        public boolean hasReadTime() {
            return ((u89) this.f89756b).hasReadTime();
        }

        @Override // p000.v89
        public boolean hasTransaction() {
            return ((u89) this.f89756b).hasTransaction();
        }

        public C13404b mergeMask(di4 di4Var) {
            m23743e();
            ((u89) this.f89756b).mergeMask(di4Var);
            return this;
        }

        public C13404b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((u89) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C13404b setCollectionId(String str) {
            m23743e();
            ((u89) this.f89756b).setCollectionId(str);
            return this;
        }

        public C13404b setCollectionIdBytes(vj1 vj1Var) {
            m23743e();
            ((u89) this.f89756b).setCollectionIdBytes(vj1Var);
            return this;
        }

        public C13404b setMask(di4 di4Var) {
            m23743e();
            ((u89) this.f89756b).setMask(di4Var);
            return this;
        }

        public C13404b setOrderBy(String str) {
            m23743e();
            ((u89) this.f89756b).setOrderBy(str);
            return this;
        }

        public C13404b setOrderByBytes(vj1 vj1Var) {
            m23743e();
            ((u89) this.f89756b).setOrderByBytes(vj1Var);
            return this;
        }

        public C13404b setPageSize(int i) {
            m23743e();
            ((u89) this.f89756b).setPageSize(i);
            return this;
        }

        public C13404b setPageToken(String str) {
            m23743e();
            ((u89) this.f89756b).setPageToken(str);
            return this;
        }

        public C13404b setPageTokenBytes(vj1 vj1Var) {
            m23743e();
            ((u89) this.f89756b).setPageTokenBytes(vj1Var);
            return this;
        }

        public C13404b setParent(String str) {
            m23743e();
            ((u89) this.f89756b).setParent(str);
            return this;
        }

        public C13404b setParentBytes(vj1 vj1Var) {
            m23743e();
            ((u89) this.f89756b).setParentBytes(vj1Var);
            return this;
        }

        public C13404b setReadTime(f2h f2hVar) {
            m23743e();
            ((u89) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        public C13404b setShowMissing(boolean z) {
            m23743e();
            ((u89) this.f89756b).setShowMissing(z);
            return this;
        }

        public C13404b setTransaction(vj1 vj1Var) {
            m23743e();
            ((u89) this.f89756b).setTransaction(vj1Var);
            return this;
        }

        private C13404b() {
            super(u89.DEFAULT_INSTANCE);
        }

        public C13404b setMask(di4.C4792b c4792b) {
            m23743e();
            ((u89) this.f89756b).setMask(c4792b.build());
            return this;
        }

        public C13404b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((u89) this.f89756b).setReadTime(c5567b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: u89$c */
    public enum EnumC13405c {
        TRANSACTION(8),
        READ_TIME(10),
        CONSISTENCYSELECTOR_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f87065a;

        EnumC13405c(int i) {
            this.f87065a = i;
        }

        public static EnumC13405c forNumber(int i) {
            if (i == 0) {
                return CONSISTENCYSELECTOR_NOT_SET;
            }
            if (i == 8) {
                return TRANSACTION;
            }
            if (i != 10) {
                return null;
            }
            return READ_TIME;
        }

        public int getNumber() {
            return this.f87065a;
        }

        @Deprecated
        public static EnumC13405c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        u89 u89Var = new u89();
        DEFAULT_INSTANCE = u89Var;
        v27.m23715h0(u89.class, u89Var);
    }

    private u89() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectionId() {
        this.collectionId_ = getDefaultInstance().getCollectionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMask() {
        this.mask_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrderBy() {
        this.orderBy_ = getDefaultInstance().getOrderBy();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        if (this.consistencySelectorCase_ == 10) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowMissing() {
        this.showMissing_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        if (this.consistencySelectorCase_ == 8) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    public static u89 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMask(di4 di4Var) {
        di4Var.getClass();
        di4 di4Var2 = this.mask_;
        if (di4Var2 == null || di4Var2 == di4.getDefaultInstance()) {
            this.mask_ = di4Var;
        } else {
            this.mask_ = di4.newBuilder(this.mask_).mergeFrom(di4Var).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(f2h f2hVar) {
        f2hVar.getClass();
        if (this.consistencySelectorCase_ != 10 || this.consistencySelector_ == f2h.getDefaultInstance()) {
            this.consistencySelector_ = f2hVar;
        } else {
            this.consistencySelector_ = f2h.newBuilder((f2h) this.consistencySelector_).mergeFrom(f2hVar).buildPartial();
        }
        this.consistencySelectorCase_ = 10;
    }

    public static C13404b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static u89 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (u89) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static u89 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (u89) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<u89> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionId(String str) {
        str.getClass();
        this.collectionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionIdBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.collectionId_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMask(di4 di4Var) {
        di4Var.getClass();
        this.mask_ = di4Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderBy(String str) {
        str.getClass();
        this.orderBy_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderByBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.orderBy_ = vj1Var.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(f2h f2hVar) {
        f2hVar.getClass();
        this.consistencySelector_ = f2hVar;
        this.consistencySelectorCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowMissing(boolean z) {
        this.showMissing_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(vj1 vj1Var) {
        vj1Var.getClass();
        this.consistencySelectorCase_ = 8;
        this.consistencySelector_ = vj1Var;
    }

    @Override // p000.v89
    public String getCollectionId() {
        return this.collectionId_;
    }

    @Override // p000.v89
    public vj1 getCollectionIdBytes() {
        return vj1.copyFromUtf8(this.collectionId_);
    }

    @Override // p000.v89
    public EnumC13405c getConsistencySelectorCase() {
        return EnumC13405c.forNumber(this.consistencySelectorCase_);
    }

    @Override // p000.v89
    public di4 getMask() {
        di4 di4Var = this.mask_;
        return di4Var == null ? di4.getDefaultInstance() : di4Var;
    }

    @Override // p000.v89
    public String getOrderBy() {
        return this.orderBy_;
    }

    @Override // p000.v89
    public vj1 getOrderByBytes() {
        return vj1.copyFromUtf8(this.orderBy_);
    }

    @Override // p000.v89
    public int getPageSize() {
        return this.pageSize_;
    }

    @Override // p000.v89
    public String getPageToken() {
        return this.pageToken_;
    }

    @Override // p000.v89
    public vj1 getPageTokenBytes() {
        return vj1.copyFromUtf8(this.pageToken_);
    }

    @Override // p000.v89
    public String getParent() {
        return this.parent_;
    }

    @Override // p000.v89
    public vj1 getParentBytes() {
        return vj1.copyFromUtf8(this.parent_);
    }

    @Override // p000.v89
    public f2h getReadTime() {
        return this.consistencySelectorCase_ == 10 ? (f2h) this.consistencySelector_ : f2h.getDefaultInstance();
    }

    @Override // p000.v89
    public boolean getShowMissing() {
        return this.showMissing_;
    }

    @Override // p000.v89
    public vj1 getTransaction() {
        return this.consistencySelectorCase_ == 8 ? (vj1) this.consistencySelector_ : vj1.f91344e;
    }

    @Override // p000.v89
    public boolean hasMask() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v89
    public boolean hasReadTime() {
        return this.consistencySelectorCase_ == 10;
    }

    @Override // p000.v89
    public boolean hasTransaction() {
        return this.consistencySelectorCase_ == 8;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C13403a c13403a = null;
        switch (C13403a.f87060a[enumC13830i.ordinal()]) {
            case 1:
                return new u89();
            case 2:
                return new C13404b(c13403a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\f\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007ဉ\u0000\b=\u0000\n<\u0000\f\u0007", new Object[]{"consistencySelector_", "consistencySelectorCase_", "bitField0_", "parent_", "collectionId_", "pageSize_", "pageToken_", "orderBy_", "mask_", f2h.class, "showMissing_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<u89> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (u89.class) {
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

    public static C13404b newBuilder(u89 u89Var) {
        return DEFAULT_INSTANCE.m23739o(u89Var);
    }

    public static u89 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (u89) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static u89 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (u89) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static u89 parseFrom(vj1 vj1Var) throws ce8 {
        return (u89) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static u89 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (u89) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static u89 parseFrom(byte[] bArr) throws ce8 {
        return (u89) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static u89 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (u89) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static u89 parseFrom(InputStream inputStream) throws IOException {
        return (u89) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static u89 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (u89) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static u89 parseFrom(f72 f72Var) throws IOException {
        return (u89) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static u89 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (u89) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
