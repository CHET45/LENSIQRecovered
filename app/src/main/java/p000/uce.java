package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.f2h;
import p000.idh;
import p000.v27;
import p000.yag;

/* JADX INFO: loaded from: classes5.dex */
public final class uce extends v27<uce, C13498b> implements vce {
    private static final uce DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile uhc<uce> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int STRUCTURED_AGGREGATION_QUERY_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private Object consistencySelector_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private int consistencySelectorCase_ = 0;
    private String parent_ = "";

    /* JADX INFO: renamed from: uce$a */
    public static /* synthetic */ class C13497a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f87581a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f87581a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87581a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87581a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87581a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f87581a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f87581a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f87581a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: uce$b */
    public static final class C13498b extends v27.AbstractC13823b<uce, C13498b> implements vce {
        public /* synthetic */ C13498b(C13497a c13497a) {
            this();
        }

        public C13498b clearConsistencySelector() {
            m23743e();
            ((uce) this.f89756b).clearConsistencySelector();
            return this;
        }

        public C13498b clearNewTransaction() {
            m23743e();
            ((uce) this.f89756b).clearNewTransaction();
            return this;
        }

        public C13498b clearParent() {
            m23743e();
            ((uce) this.f89756b).clearParent();
            return this;
        }

        public C13498b clearQueryType() {
            m23743e();
            ((uce) this.f89756b).clearQueryType();
            return this;
        }

        public C13498b clearReadTime() {
            m23743e();
            ((uce) this.f89756b).clearReadTime();
            return this;
        }

        public C13498b clearStructuredAggregationQuery() {
            m23743e();
            ((uce) this.f89756b).clearStructuredAggregationQuery();
            return this;
        }

        public C13498b clearTransaction() {
            m23743e();
            ((uce) this.f89756b).clearTransaction();
            return this;
        }

        @Override // p000.vce
        public EnumC13499c getConsistencySelectorCase() {
            return ((uce) this.f89756b).getConsistencySelectorCase();
        }

        @Override // p000.vce
        public idh getNewTransaction() {
            return ((uce) this.f89756b).getNewTransaction();
        }

        @Override // p000.vce
        public String getParent() {
            return ((uce) this.f89756b).getParent();
        }

        @Override // p000.vce
        public vj1 getParentBytes() {
            return ((uce) this.f89756b).getParentBytes();
        }

        @Override // p000.vce
        public EnumC13500d getQueryTypeCase() {
            return ((uce) this.f89756b).getQueryTypeCase();
        }

        @Override // p000.vce
        public f2h getReadTime() {
            return ((uce) this.f89756b).getReadTime();
        }

        @Override // p000.vce
        public yag getStructuredAggregationQuery() {
            return ((uce) this.f89756b).getStructuredAggregationQuery();
        }

        @Override // p000.vce
        public vj1 getTransaction() {
            return ((uce) this.f89756b).getTransaction();
        }

        @Override // p000.vce
        public boolean hasNewTransaction() {
            return ((uce) this.f89756b).hasNewTransaction();
        }

        @Override // p000.vce
        public boolean hasReadTime() {
            return ((uce) this.f89756b).hasReadTime();
        }

        @Override // p000.vce
        public boolean hasStructuredAggregationQuery() {
            return ((uce) this.f89756b).hasStructuredAggregationQuery();
        }

        @Override // p000.vce
        public boolean hasTransaction() {
            return ((uce) this.f89756b).hasTransaction();
        }

        public C13498b mergeNewTransaction(idh idhVar) {
            m23743e();
            ((uce) this.f89756b).mergeNewTransaction(idhVar);
            return this;
        }

        public C13498b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((uce) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C13498b mergeStructuredAggregationQuery(yag yagVar) {
            m23743e();
            ((uce) this.f89756b).mergeStructuredAggregationQuery(yagVar);
            return this;
        }

        public C13498b setNewTransaction(idh idhVar) {
            m23743e();
            ((uce) this.f89756b).setNewTransaction(idhVar);
            return this;
        }

        public C13498b setParent(String str) {
            m23743e();
            ((uce) this.f89756b).setParent(str);
            return this;
        }

        public C13498b setParentBytes(vj1 vj1Var) {
            m23743e();
            ((uce) this.f89756b).setParentBytes(vj1Var);
            return this;
        }

        public C13498b setReadTime(f2h f2hVar) {
            m23743e();
            ((uce) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        public C13498b setStructuredAggregationQuery(yag yagVar) {
            m23743e();
            ((uce) this.f89756b).setStructuredAggregationQuery(yagVar);
            return this;
        }

        public C13498b setTransaction(vj1 vj1Var) {
            m23743e();
            ((uce) this.f89756b).setTransaction(vj1Var);
            return this;
        }

        private C13498b() {
            super(uce.DEFAULT_INSTANCE);
        }

        public C13498b setNewTransaction(idh.C7241b c7241b) {
            m23743e();
            ((uce) this.f89756b).setNewTransaction(c7241b.build());
            return this;
        }

        public C13498b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((uce) this.f89756b).setReadTime(c5567b.build());
            return this;
        }

        public C13498b setStructuredAggregationQuery(yag.C15596d c15596d) {
            m23743e();
            ((uce) this.f89756b).setStructuredAggregationQuery(c15596d.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: uce$c */
    public enum EnumC13499c {
        TRANSACTION(4),
        NEW_TRANSACTION(5),
        READ_TIME(6),
        CONSISTENCYSELECTOR_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f87587a;

        EnumC13499c(int i) {
            this.f87587a = i;
        }

        public static EnumC13499c forNumber(int i) {
            if (i == 0) {
                return CONSISTENCYSELECTOR_NOT_SET;
            }
            if (i == 4) {
                return TRANSACTION;
            }
            if (i == 5) {
                return NEW_TRANSACTION;
            }
            if (i != 6) {
                return null;
            }
            return READ_TIME;
        }

        public int getNumber() {
            return this.f87587a;
        }

        @Deprecated
        public static EnumC13499c valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: renamed from: uce$d */
    public enum EnumC13500d {
        STRUCTURED_AGGREGATION_QUERY(2),
        QUERYTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f87591a;

        EnumC13500d(int i) {
            this.f87591a = i;
        }

        public static EnumC13500d forNumber(int i) {
            if (i == 0) {
                return QUERYTYPE_NOT_SET;
            }
            if (i != 2) {
                return null;
            }
            return STRUCTURED_AGGREGATION_QUERY;
        }

        public int getNumber() {
            return this.f87591a;
        }

        @Deprecated
        public static EnumC13500d valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        uce uceVar = new uce();
        DEFAULT_INSTANCE = uceVar;
        v27.m23715h0(uce.class, uceVar);
    }

    private uce() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewTransaction() {
        if (this.consistencySelectorCase_ == 5) {
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
        if (this.consistencySelectorCase_ == 6) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructuredAggregationQuery() {
        if (this.queryTypeCase_ == 2) {
            this.queryTypeCase_ = 0;
            this.queryType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        if (this.consistencySelectorCase_ == 4) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    public static uce getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNewTransaction(idh idhVar) {
        idhVar.getClass();
        if (this.consistencySelectorCase_ != 5 || this.consistencySelector_ == idh.getDefaultInstance()) {
            this.consistencySelector_ = idhVar;
        } else {
            this.consistencySelector_ = idh.newBuilder((idh) this.consistencySelector_).mergeFrom(idhVar).buildPartial();
        }
        this.consistencySelectorCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(f2h f2hVar) {
        f2hVar.getClass();
        if (this.consistencySelectorCase_ != 6 || this.consistencySelector_ == f2h.getDefaultInstance()) {
            this.consistencySelector_ = f2hVar;
        } else {
            this.consistencySelector_ = f2h.newBuilder((f2h) this.consistencySelector_).mergeFrom(f2hVar).buildPartial();
        }
        this.consistencySelectorCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructuredAggregationQuery(yag yagVar) {
        yagVar.getClass();
        if (this.queryTypeCase_ != 2 || this.queryType_ == yag.getDefaultInstance()) {
            this.queryType_ = yagVar;
        } else {
            this.queryType_ = yag.newBuilder((yag) this.queryType_).mergeFrom(yagVar).buildPartial();
        }
        this.queryTypeCase_ = 2;
    }

    public static C13498b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static uce parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (uce) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static uce parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (uce) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<uce> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewTransaction(idh idhVar) {
        idhVar.getClass();
        this.consistencySelector_ = idhVar;
        this.consistencySelectorCase_ = 5;
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
        this.consistencySelectorCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructuredAggregationQuery(yag yagVar) {
        yagVar.getClass();
        this.queryType_ = yagVar;
        this.queryTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(vj1 vj1Var) {
        vj1Var.getClass();
        this.consistencySelectorCase_ = 4;
        this.consistencySelector_ = vj1Var;
    }

    @Override // p000.vce
    public EnumC13499c getConsistencySelectorCase() {
        return EnumC13499c.forNumber(this.consistencySelectorCase_);
    }

    @Override // p000.vce
    public idh getNewTransaction() {
        return this.consistencySelectorCase_ == 5 ? (idh) this.consistencySelector_ : idh.getDefaultInstance();
    }

    @Override // p000.vce
    public String getParent() {
        return this.parent_;
    }

    @Override // p000.vce
    public vj1 getParentBytes() {
        return vj1.copyFromUtf8(this.parent_);
    }

    @Override // p000.vce
    public EnumC13500d getQueryTypeCase() {
        return EnumC13500d.forNumber(this.queryTypeCase_);
    }

    @Override // p000.vce
    public f2h getReadTime() {
        return this.consistencySelectorCase_ == 6 ? (f2h) this.consistencySelector_ : f2h.getDefaultInstance();
    }

    @Override // p000.vce
    public yag getStructuredAggregationQuery() {
        return this.queryTypeCase_ == 2 ? (yag) this.queryType_ : yag.getDefaultInstance();
    }

    @Override // p000.vce
    public vj1 getTransaction() {
        return this.consistencySelectorCase_ == 4 ? (vj1) this.consistencySelector_ : vj1.f91344e;
    }

    @Override // p000.vce
    public boolean hasNewTransaction() {
        return this.consistencySelectorCase_ == 5;
    }

    @Override // p000.vce
    public boolean hasReadTime() {
        return this.consistencySelectorCase_ == 6;
    }

    @Override // p000.vce
    public boolean hasStructuredAggregationQuery() {
        return this.queryTypeCase_ == 2;
    }

    @Override // p000.vce
    public boolean hasTransaction() {
        return this.consistencySelectorCase_ == 4;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C13497a c13497a = null;
        switch (C13497a.f87581a[enumC13830i.ordinal()]) {
            case 1:
                return new uce();
            case 2:
                return new C13498b(c13497a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0004=\u0001\u0005<\u0001\u0006<\u0001", new Object[]{"queryType_", "queryTypeCase_", "consistencySelector_", "consistencySelectorCase_", "parent_", yag.class, idh.class, f2h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<uce> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (uce.class) {
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

    public static C13498b newBuilder(uce uceVar) {
        return DEFAULT_INSTANCE.m23739o(uceVar);
    }

    public static uce parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (uce) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static uce parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (uce) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static uce parseFrom(vj1 vj1Var) throws ce8 {
        return (uce) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static uce parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (uce) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static uce parseFrom(byte[] bArr) throws ce8 {
        return (uce) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static uce parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (uce) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static uce parseFrom(InputStream inputStream) throws IOException {
        return (uce) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static uce parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (uce) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static uce parseFrom(f72 f72Var) throws IOException {
        return (uce) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static uce parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (uce) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
