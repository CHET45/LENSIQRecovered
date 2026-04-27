package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.di4;
import p000.f2h;
import p000.idh;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class ow0 extends v27<ow0, C10673b> implements pw0 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final ow0 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile uhc<ow0> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object consistencySelector_;
    private di4 mask_;
    private int consistencySelectorCase_ = 0;
    private String database_ = "";
    private w98.InterfaceC14504k<String> documents_ = v27.m23722x();

    /* JADX INFO: renamed from: ow0$a */
    public static /* synthetic */ class C10672a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68982a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f68982a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68982a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68982a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68982a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68982a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68982a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f68982a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: ow0$b */
    public static final class C10673b extends v27.AbstractC13823b<ow0, C10673b> implements pw0 {
        public /* synthetic */ C10673b(C10672a c10672a) {
            this();
        }

        public C10673b addAllDocuments(Iterable<String> iterable) {
            m23743e();
            ((ow0) this.f89756b).addAllDocuments(iterable);
            return this;
        }

        public C10673b addDocuments(String str) {
            m23743e();
            ((ow0) this.f89756b).addDocuments(str);
            return this;
        }

        public C10673b addDocumentsBytes(vj1 vj1Var) {
            m23743e();
            ((ow0) this.f89756b).addDocumentsBytes(vj1Var);
            return this;
        }

        public C10673b clearConsistencySelector() {
            m23743e();
            ((ow0) this.f89756b).clearConsistencySelector();
            return this;
        }

        public C10673b clearDatabase() {
            m23743e();
            ((ow0) this.f89756b).clearDatabase();
            return this;
        }

        public C10673b clearDocuments() {
            m23743e();
            ((ow0) this.f89756b).clearDocuments();
            return this;
        }

        public C10673b clearMask() {
            m23743e();
            ((ow0) this.f89756b).clearMask();
            return this;
        }

        public C10673b clearNewTransaction() {
            m23743e();
            ((ow0) this.f89756b).clearNewTransaction();
            return this;
        }

        public C10673b clearReadTime() {
            m23743e();
            ((ow0) this.f89756b).clearReadTime();
            return this;
        }

        public C10673b clearTransaction() {
            m23743e();
            ((ow0) this.f89756b).clearTransaction();
            return this;
        }

        @Override // p000.pw0
        public EnumC10674c getConsistencySelectorCase() {
            return ((ow0) this.f89756b).getConsistencySelectorCase();
        }

        @Override // p000.pw0
        public String getDatabase() {
            return ((ow0) this.f89756b).getDatabase();
        }

        @Override // p000.pw0
        public vj1 getDatabaseBytes() {
            return ((ow0) this.f89756b).getDatabaseBytes();
        }

        @Override // p000.pw0
        public String getDocuments(int i) {
            return ((ow0) this.f89756b).getDocuments(i);
        }

        @Override // p000.pw0
        public vj1 getDocumentsBytes(int i) {
            return ((ow0) this.f89756b).getDocumentsBytes(i);
        }

        @Override // p000.pw0
        public int getDocumentsCount() {
            return ((ow0) this.f89756b).getDocumentsCount();
        }

        @Override // p000.pw0
        public List<String> getDocumentsList() {
            return Collections.unmodifiableList(((ow0) this.f89756b).getDocumentsList());
        }

        @Override // p000.pw0
        public di4 getMask() {
            return ((ow0) this.f89756b).getMask();
        }

        @Override // p000.pw0
        public idh getNewTransaction() {
            return ((ow0) this.f89756b).getNewTransaction();
        }

        @Override // p000.pw0
        public f2h getReadTime() {
            return ((ow0) this.f89756b).getReadTime();
        }

        @Override // p000.pw0
        public vj1 getTransaction() {
            return ((ow0) this.f89756b).getTransaction();
        }

        @Override // p000.pw0
        public boolean hasMask() {
            return ((ow0) this.f89756b).hasMask();
        }

        @Override // p000.pw0
        public boolean hasNewTransaction() {
            return ((ow0) this.f89756b).hasNewTransaction();
        }

        @Override // p000.pw0
        public boolean hasReadTime() {
            return ((ow0) this.f89756b).hasReadTime();
        }

        @Override // p000.pw0
        public boolean hasTransaction() {
            return ((ow0) this.f89756b).hasTransaction();
        }

        public C10673b mergeMask(di4 di4Var) {
            m23743e();
            ((ow0) this.f89756b).mergeMask(di4Var);
            return this;
        }

        public C10673b mergeNewTransaction(idh idhVar) {
            m23743e();
            ((ow0) this.f89756b).mergeNewTransaction(idhVar);
            return this;
        }

        public C10673b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((ow0) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C10673b setDatabase(String str) {
            m23743e();
            ((ow0) this.f89756b).setDatabase(str);
            return this;
        }

        public C10673b setDatabaseBytes(vj1 vj1Var) {
            m23743e();
            ((ow0) this.f89756b).setDatabaseBytes(vj1Var);
            return this;
        }

        public C10673b setDocuments(int i, String str) {
            m23743e();
            ((ow0) this.f89756b).setDocuments(i, str);
            return this;
        }

        public C10673b setMask(di4 di4Var) {
            m23743e();
            ((ow0) this.f89756b).setMask(di4Var);
            return this;
        }

        public C10673b setNewTransaction(idh idhVar) {
            m23743e();
            ((ow0) this.f89756b).setNewTransaction(idhVar);
            return this;
        }

        public C10673b setReadTime(f2h f2hVar) {
            m23743e();
            ((ow0) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        public C10673b setTransaction(vj1 vj1Var) {
            m23743e();
            ((ow0) this.f89756b).setTransaction(vj1Var);
            return this;
        }

        private C10673b() {
            super(ow0.DEFAULT_INSTANCE);
        }

        public C10673b setMask(di4.C4792b c4792b) {
            m23743e();
            ((ow0) this.f89756b).setMask(c4792b.build());
            return this;
        }

        public C10673b setNewTransaction(idh.C7241b c7241b) {
            m23743e();
            ((ow0) this.f89756b).setNewTransaction(c7241b.build());
            return this;
        }

        public C10673b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((ow0) this.f89756b).setReadTime(c5567b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: ow0$c */
    public enum EnumC10674c {
        TRANSACTION(4),
        NEW_TRANSACTION(5),
        READ_TIME(7),
        CONSISTENCYSELECTOR_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f68988a;

        EnumC10674c(int i) {
            this.f68988a = i;
        }

        public static EnumC10674c forNumber(int i) {
            if (i == 0) {
                return CONSISTENCYSELECTOR_NOT_SET;
            }
            if (i == 7) {
                return READ_TIME;
            }
            if (i == 4) {
                return TRANSACTION;
            }
            if (i != 5) {
                return null;
            }
            return NEW_TRANSACTION;
        }

        public int getNumber() {
            return this.f68988a;
        }

        @Deprecated
        public static EnumC10674c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        ow0 ow0Var = new ow0();
        DEFAULT_INSTANCE = ow0Var;
        v27.m23715h0(ow0.class, ow0Var);
    }

    private ow0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDocuments(Iterable<String> iterable) {
        ensureDocumentsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.documents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDocuments(String str) {
        str.getClass();
        ensureDocumentsIsMutable();
        this.documents_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDocumentsBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensureDocumentsIsMutable();
        this.documents_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatabase() {
        this.database_ = getDefaultInstance().getDatabase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocuments() {
        this.documents_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMask() {
        this.mask_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewTransaction() {
        if (this.consistencySelectorCase_ == 5) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        if (this.consistencySelectorCase_ == 7) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        if (this.consistencySelectorCase_ == 4) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void ensureDocumentsIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.documents_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.documents_ = v27.m23698P(interfaceC14504k);
    }

    public static ow0 getDefaultInstance() {
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
        if (this.consistencySelectorCase_ != 7 || this.consistencySelector_ == f2h.getDefaultInstance()) {
            this.consistencySelector_ = f2hVar;
        } else {
            this.consistencySelector_ = f2h.newBuilder((f2h) this.consistencySelector_).mergeFrom(f2hVar).buildPartial();
        }
        this.consistencySelectorCase_ = 7;
    }

    public static C10673b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static ow0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ow0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static ow0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (ow0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<ow0> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabase(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabaseBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.database_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocuments(int i, String str) {
        str.getClass();
        ensureDocumentsIsMutable();
        this.documents_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMask(di4 di4Var) {
        di4Var.getClass();
        this.mask_ = di4Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewTransaction(idh idhVar) {
        idhVar.getClass();
        this.consistencySelector_ = idhVar;
        this.consistencySelectorCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(f2h f2hVar) {
        f2hVar.getClass();
        this.consistencySelector_ = f2hVar;
        this.consistencySelectorCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(vj1 vj1Var) {
        vj1Var.getClass();
        this.consistencySelectorCase_ = 4;
        this.consistencySelector_ = vj1Var;
    }

    @Override // p000.pw0
    public EnumC10674c getConsistencySelectorCase() {
        return EnumC10674c.forNumber(this.consistencySelectorCase_);
    }

    @Override // p000.pw0
    public String getDatabase() {
        return this.database_;
    }

    @Override // p000.pw0
    public vj1 getDatabaseBytes() {
        return vj1.copyFromUtf8(this.database_);
    }

    @Override // p000.pw0
    public String getDocuments(int i) {
        return this.documents_.get(i);
    }

    @Override // p000.pw0
    public vj1 getDocumentsBytes(int i) {
        return vj1.copyFromUtf8(this.documents_.get(i));
    }

    @Override // p000.pw0
    public int getDocumentsCount() {
        return this.documents_.size();
    }

    @Override // p000.pw0
    public List<String> getDocumentsList() {
        return this.documents_;
    }

    @Override // p000.pw0
    public di4 getMask() {
        di4 di4Var = this.mask_;
        return di4Var == null ? di4.getDefaultInstance() : di4Var;
    }

    @Override // p000.pw0
    public idh getNewTransaction() {
        return this.consistencySelectorCase_ == 5 ? (idh) this.consistencySelector_ : idh.getDefaultInstance();
    }

    @Override // p000.pw0
    public f2h getReadTime() {
        return this.consistencySelectorCase_ == 7 ? (f2h) this.consistencySelector_ : f2h.getDefaultInstance();
    }

    @Override // p000.pw0
    public vj1 getTransaction() {
        return this.consistencySelectorCase_ == 4 ? (vj1) this.consistencySelector_ : vj1.f91344e;
    }

    @Override // p000.pw0
    public boolean hasMask() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.pw0
    public boolean hasNewTransaction() {
        return this.consistencySelectorCase_ == 5;
    }

    @Override // p000.pw0
    public boolean hasReadTime() {
        return this.consistencySelectorCase_ == 7;
    }

    @Override // p000.pw0
    public boolean hasTransaction() {
        return this.consistencySelectorCase_ == 4;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C10672a c10672a = null;
        switch (C10672a.f68982a[enumC13830i.ordinal()]) {
            case 1:
                return new ow0();
            case 2:
                return new C10673b(c10672a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003ဉ\u0000\u0004=\u0000\u0005<\u0000\u0007<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "bitField0_", "database_", "documents_", "mask_", idh.class, f2h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<ow0> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (ow0.class) {
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

    public static C10673b newBuilder(ow0 ow0Var) {
        return DEFAULT_INSTANCE.m23739o(ow0Var);
    }

    public static ow0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ow0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ow0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (ow0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static ow0 parseFrom(vj1 vj1Var) throws ce8 {
        return (ow0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static ow0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (ow0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static ow0 parseFrom(byte[] bArr) throws ce8 {
        return (ow0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static ow0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (ow0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static ow0 parseFrom(InputStream inputStream) throws IOException {
        return (ow0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static ow0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ow0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ow0 parseFrom(f72 f72Var) throws IOException {
        return (ow0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static ow0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (ow0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
