package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.abg;
import p000.f2h;
import p000.idh;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class dde extends v27<dde, C4757b> implements ede {
    private static final dde DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 6;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile uhc<dde> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 5;
    private Object consistencySelector_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private int consistencySelectorCase_ = 0;
    private String parent_ = "";

    /* JADX INFO: renamed from: dde$a */
    public static /* synthetic */ class C4756a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29437a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f29437a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29437a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29437a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29437a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29437a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29437a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29437a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: dde$b */
    public static final class C4757b extends v27.AbstractC13823b<dde, C4757b> implements ede {
        public /* synthetic */ C4757b(C4756a c4756a) {
            this();
        }

        public C4757b clearConsistencySelector() {
            m23743e();
            ((dde) this.f89756b).clearConsistencySelector();
            return this;
        }

        public C4757b clearNewTransaction() {
            m23743e();
            ((dde) this.f89756b).clearNewTransaction();
            return this;
        }

        public C4757b clearParent() {
            m23743e();
            ((dde) this.f89756b).clearParent();
            return this;
        }

        public C4757b clearQueryType() {
            m23743e();
            ((dde) this.f89756b).clearQueryType();
            return this;
        }

        public C4757b clearReadTime() {
            m23743e();
            ((dde) this.f89756b).clearReadTime();
            return this;
        }

        public C4757b clearStructuredQuery() {
            m23743e();
            ((dde) this.f89756b).clearStructuredQuery();
            return this;
        }

        public C4757b clearTransaction() {
            m23743e();
            ((dde) this.f89756b).clearTransaction();
            return this;
        }

        @Override // p000.ede
        public EnumC4758c getConsistencySelectorCase() {
            return ((dde) this.f89756b).getConsistencySelectorCase();
        }

        @Override // p000.ede
        public idh getNewTransaction() {
            return ((dde) this.f89756b).getNewTransaction();
        }

        @Override // p000.ede
        public String getParent() {
            return ((dde) this.f89756b).getParent();
        }

        @Override // p000.ede
        public vj1 getParentBytes() {
            return ((dde) this.f89756b).getParentBytes();
        }

        @Override // p000.ede
        public EnumC4759d getQueryTypeCase() {
            return ((dde) this.f89756b).getQueryTypeCase();
        }

        @Override // p000.ede
        public f2h getReadTime() {
            return ((dde) this.f89756b).getReadTime();
        }

        @Override // p000.ede
        public abg getStructuredQuery() {
            return ((dde) this.f89756b).getStructuredQuery();
        }

        @Override // p000.ede
        public vj1 getTransaction() {
            return ((dde) this.f89756b).getTransaction();
        }

        @Override // p000.ede
        public boolean hasNewTransaction() {
            return ((dde) this.f89756b).hasNewTransaction();
        }

        @Override // p000.ede
        public boolean hasReadTime() {
            return ((dde) this.f89756b).hasReadTime();
        }

        @Override // p000.ede
        public boolean hasStructuredQuery() {
            return ((dde) this.f89756b).hasStructuredQuery();
        }

        @Override // p000.ede
        public boolean hasTransaction() {
            return ((dde) this.f89756b).hasTransaction();
        }

        public C4757b mergeNewTransaction(idh idhVar) {
            m23743e();
            ((dde) this.f89756b).mergeNewTransaction(idhVar);
            return this;
        }

        public C4757b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((dde) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C4757b mergeStructuredQuery(abg abgVar) {
            m23743e();
            ((dde) this.f89756b).mergeStructuredQuery(abgVar);
            return this;
        }

        public C4757b setNewTransaction(idh idhVar) {
            m23743e();
            ((dde) this.f89756b).setNewTransaction(idhVar);
            return this;
        }

        public C4757b setParent(String str) {
            m23743e();
            ((dde) this.f89756b).setParent(str);
            return this;
        }

        public C4757b setParentBytes(vj1 vj1Var) {
            m23743e();
            ((dde) this.f89756b).setParentBytes(vj1Var);
            return this;
        }

        public C4757b setReadTime(f2h f2hVar) {
            m23743e();
            ((dde) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        public C4757b setStructuredQuery(abg abgVar) {
            m23743e();
            ((dde) this.f89756b).setStructuredQuery(abgVar);
            return this;
        }

        public C4757b setTransaction(vj1 vj1Var) {
            m23743e();
            ((dde) this.f89756b).setTransaction(vj1Var);
            return this;
        }

        private C4757b() {
            super(dde.DEFAULT_INSTANCE);
        }

        public C4757b setNewTransaction(idh.C7241b c7241b) {
            m23743e();
            ((dde) this.f89756b).setNewTransaction(c7241b.build());
            return this;
        }

        public C4757b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((dde) this.f89756b).setReadTime(c5567b.build());
            return this;
        }

        public C4757b setStructuredQuery(abg.C0153b c0153b) {
            m23743e();
            ((dde) this.f89756b).setStructuredQuery(c0153b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: dde$c */
    public enum EnumC4758c {
        TRANSACTION(5),
        NEW_TRANSACTION(6),
        READ_TIME(7),
        CONSISTENCYSELECTOR_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f29443a;

        EnumC4758c(int i) {
            this.f29443a = i;
        }

        public static EnumC4758c forNumber(int i) {
            if (i == 0) {
                return CONSISTENCYSELECTOR_NOT_SET;
            }
            if (i == 5) {
                return TRANSACTION;
            }
            if (i == 6) {
                return NEW_TRANSACTION;
            }
            if (i != 7) {
                return null;
            }
            return READ_TIME;
        }

        public int getNumber() {
            return this.f29443a;
        }

        @Deprecated
        public static EnumC4758c valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: renamed from: dde$d */
    public enum EnumC4759d {
        STRUCTURED_QUERY(2),
        QUERYTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f29447a;

        EnumC4759d(int i) {
            this.f29447a = i;
        }

        public static EnumC4759d forNumber(int i) {
            if (i == 0) {
                return QUERYTYPE_NOT_SET;
            }
            if (i != 2) {
                return null;
            }
            return STRUCTURED_QUERY;
        }

        public int getNumber() {
            return this.f29447a;
        }

        @Deprecated
        public static EnumC4759d valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        dde ddeVar = new dde();
        DEFAULT_INSTANCE = ddeVar;
        v27.m23715h0(dde.class, ddeVar);
    }

    private dde() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewTransaction() {
        if (this.consistencySelectorCase_ == 6) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParent() {
        this.parent_ = getDefaultInstance().getParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryType() {
        this.queryTypeCase_ = 0;
        this.queryType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        if (this.consistencySelectorCase_ == 7) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructuredQuery() {
        if (this.queryTypeCase_ == 2) {
            this.queryTypeCase_ = 0;
            this.queryType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        if (this.consistencySelectorCase_ == 5) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    public static dde getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNewTransaction(idh idhVar) {
        idhVar.getClass();
        if (this.consistencySelectorCase_ != 6 || this.consistencySelector_ == idh.getDefaultInstance()) {
            this.consistencySelector_ = idhVar;
        } else {
            this.consistencySelector_ = idh.newBuilder((idh) this.consistencySelector_).mergeFrom(idhVar).buildPartial();
        }
        this.consistencySelectorCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(f2h f2hVar) {
        f2hVar.getClass();
        if (this.consistencySelectorCase_ != 7 || this.consistencySelector_ == f2h.getDefaultInstance()) {
            this.consistencySelector_ = f2hVar;
        } else {
            this.consistencySelector_ = f2h.newBuilder((f2h) this.consistencySelector_).mergeFrom(f2hVar).buildPartial();
        }
        this.consistencySelectorCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructuredQuery(abg abgVar) {
        abgVar.getClass();
        if (this.queryTypeCase_ != 2 || this.queryType_ == abg.getDefaultInstance()) {
            this.queryType_ = abgVar;
        } else {
            this.queryType_ = abg.newBuilder((abg) this.queryType_).mergeFrom(abgVar).buildPartial();
        }
        this.queryTypeCase_ = 2;
    }

    public static C4757b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static dde parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (dde) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static dde parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (dde) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<dde> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewTransaction(idh idhVar) {
        idhVar.getClass();
        this.consistencySelector_ = idhVar;
        this.consistencySelectorCase_ = 6;
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
        this.consistencySelectorCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructuredQuery(abg abgVar) {
        abgVar.getClass();
        this.queryType_ = abgVar;
        this.queryTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(vj1 vj1Var) {
        vj1Var.getClass();
        this.consistencySelectorCase_ = 5;
        this.consistencySelector_ = vj1Var;
    }

    @Override // p000.ede
    public EnumC4758c getConsistencySelectorCase() {
        return EnumC4758c.forNumber(this.consistencySelectorCase_);
    }

    @Override // p000.ede
    public idh getNewTransaction() {
        return this.consistencySelectorCase_ == 6 ? (idh) this.consistencySelector_ : idh.getDefaultInstance();
    }

    @Override // p000.ede
    public String getParent() {
        return this.parent_;
    }

    @Override // p000.ede
    public vj1 getParentBytes() {
        return vj1.copyFromUtf8(this.parent_);
    }

    @Override // p000.ede
    public EnumC4759d getQueryTypeCase() {
        return EnumC4759d.forNumber(this.queryTypeCase_);
    }

    @Override // p000.ede
    public f2h getReadTime() {
        return this.consistencySelectorCase_ == 7 ? (f2h) this.consistencySelector_ : f2h.getDefaultInstance();
    }

    @Override // p000.ede
    public abg getStructuredQuery() {
        return this.queryTypeCase_ == 2 ? (abg) this.queryType_ : abg.getDefaultInstance();
    }

    @Override // p000.ede
    public vj1 getTransaction() {
        return this.consistencySelectorCase_ == 5 ? (vj1) this.consistencySelector_ : vj1.f91344e;
    }

    @Override // p000.ede
    public boolean hasNewTransaction() {
        return this.consistencySelectorCase_ == 6;
    }

    @Override // p000.ede
    public boolean hasReadTime() {
        return this.consistencySelectorCase_ == 7;
    }

    @Override // p000.ede
    public boolean hasStructuredQuery() {
        return this.queryTypeCase_ == 2;
    }

    @Override // p000.ede
    public boolean hasTransaction() {
        return this.consistencySelectorCase_ == 5;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C4756a c4756a = null;
        switch (C4756a.f29437a[enumC13830i.ordinal()]) {
            case 1:
                return new dde();
            case 2:
                return new C4757b(c4756a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0005=\u0001\u0006<\u0001\u0007<\u0001", new Object[]{"queryType_", "queryTypeCase_", "consistencySelector_", "consistencySelectorCase_", "parent_", abg.class, idh.class, f2h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<dde> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (dde.class) {
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

    public static C4757b newBuilder(dde ddeVar) {
        return DEFAULT_INSTANCE.m23739o(ddeVar);
    }

    public static dde parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (dde) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static dde parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (dde) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static dde parseFrom(vj1 vj1Var) throws ce8 {
        return (dde) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static dde parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (dde) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static dde parseFrom(byte[] bArr) throws ce8 {
        return (dde) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static dde parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (dde) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static dde parseFrom(InputStream inputStream) throws IOException {
        return (dde) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static dde parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (dde) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static dde parseFrom(f72 f72Var) throws IOException {
        return (dde) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static dde parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (dde) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
