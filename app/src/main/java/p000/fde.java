package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.f2h;
import p000.nh4;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class fde extends v27<fde, C5735b> implements gde {
    private static final fde DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile uhc<fde> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    public static final int SKIPPED_RESULTS_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private nh4 document_;
    private f2h readTime_;
    private int skippedResults_;
    private vj1 transaction_ = vj1.f91344e;

    /* JADX INFO: renamed from: fde$a */
    public static /* synthetic */ class C5734a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36233a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f36233a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36233a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36233a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36233a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36233a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36233a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36233a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: fde$b */
    public static final class C5735b extends v27.AbstractC13823b<fde, C5735b> implements gde {
        public /* synthetic */ C5735b(C5734a c5734a) {
            this();
        }

        public C5735b clearDocument() {
            m23743e();
            ((fde) this.f89756b).clearDocument();
            return this;
        }

        public C5735b clearReadTime() {
            m23743e();
            ((fde) this.f89756b).clearReadTime();
            return this;
        }

        public C5735b clearSkippedResults() {
            m23743e();
            ((fde) this.f89756b).clearSkippedResults();
            return this;
        }

        public C5735b clearTransaction() {
            m23743e();
            ((fde) this.f89756b).clearTransaction();
            return this;
        }

        @Override // p000.gde
        public nh4 getDocument() {
            return ((fde) this.f89756b).getDocument();
        }

        @Override // p000.gde
        public f2h getReadTime() {
            return ((fde) this.f89756b).getReadTime();
        }

        @Override // p000.gde
        public int getSkippedResults() {
            return ((fde) this.f89756b).getSkippedResults();
        }

        @Override // p000.gde
        public vj1 getTransaction() {
            return ((fde) this.f89756b).getTransaction();
        }

        @Override // p000.gde
        public boolean hasDocument() {
            return ((fde) this.f89756b).hasDocument();
        }

        @Override // p000.gde
        public boolean hasReadTime() {
            return ((fde) this.f89756b).hasReadTime();
        }

        public C5735b mergeDocument(nh4 nh4Var) {
            m23743e();
            ((fde) this.f89756b).mergeDocument(nh4Var);
            return this;
        }

        public C5735b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((fde) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C5735b setDocument(nh4 nh4Var) {
            m23743e();
            ((fde) this.f89756b).setDocument(nh4Var);
            return this;
        }

        public C5735b setReadTime(f2h f2hVar) {
            m23743e();
            ((fde) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        public C5735b setSkippedResults(int i) {
            m23743e();
            ((fde) this.f89756b).setSkippedResults(i);
            return this;
        }

        public C5735b setTransaction(vj1 vj1Var) {
            m23743e();
            ((fde) this.f89756b).setTransaction(vj1Var);
            return this;
        }

        private C5735b() {
            super(fde.DEFAULT_INSTANCE);
        }

        public C5735b setDocument(nh4.C9874b c9874b) {
            m23743e();
            ((fde) this.f89756b).setDocument(c9874b.build());
            return this;
        }

        public C5735b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((fde) this.f89756b).setReadTime(c5567b.build());
            return this;
        }
    }

    static {
        fde fdeVar = new fde();
        DEFAULT_INSTANCE = fdeVar;
        v27.m23715h0(fde.class, fdeVar);
    }

    private fde() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        this.document_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkippedResults() {
        this.skippedResults_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        this.transaction_ = getDefaultInstance().getTransaction();
    }

    public static fde getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocument(nh4 nh4Var) {
        nh4Var.getClass();
        nh4 nh4Var2 = this.document_;
        if (nh4Var2 == null || nh4Var2 == nh4.getDefaultInstance()) {
            this.document_ = nh4Var;
        } else {
            this.document_ = nh4.newBuilder(this.document_).mergeFrom(nh4Var).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(f2h f2hVar) {
        f2hVar.getClass();
        f2h f2hVar2 = this.readTime_;
        if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
            this.readTime_ = f2hVar;
        } else {
            this.readTime_ = f2h.newBuilder(this.readTime_).mergeFrom(f2hVar).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C5735b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static fde parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (fde) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static fde parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (fde) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<fde> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(nh4 nh4Var) {
        nh4Var.getClass();
        this.document_ = nh4Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(f2h f2hVar) {
        f2hVar.getClass();
        this.readTime_ = f2hVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkippedResults(int i) {
        this.skippedResults_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(vj1 vj1Var) {
        vj1Var.getClass();
        this.transaction_ = vj1Var;
    }

    @Override // p000.gde
    public nh4 getDocument() {
        nh4 nh4Var = this.document_;
        return nh4Var == null ? nh4.getDefaultInstance() : nh4Var;
    }

    @Override // p000.gde
    public f2h getReadTime() {
        f2h f2hVar = this.readTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.gde
    public int getSkippedResults() {
        return this.skippedResults_;
    }

    @Override // p000.gde
    public vj1 getTransaction() {
        return this.transaction_;
    }

    @Override // p000.gde
    public boolean hasDocument() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.gde
    public boolean hasReadTime() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C5734a c5734a = null;
        switch (C5734a.f36233a[enumC13830i.ordinal()]) {
            case 1:
                return new fde();
            case 2:
                return new C5735b(c5734a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003ဉ\u0001\u0004\u0004", new Object[]{"bitField0_", "document_", "transaction_", "readTime_", "skippedResults_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<fde> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (fde.class) {
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

    public static C5735b newBuilder(fde fdeVar) {
        return DEFAULT_INSTANCE.m23739o(fdeVar);
    }

    public static fde parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (fde) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static fde parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (fde) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static fde parseFrom(vj1 vj1Var) throws ce8 {
        return (fde) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static fde parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (fde) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static fde parseFrom(byte[] bArr) throws ce8 {
        return (fde) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static fde parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (fde) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static fde parseFrom(InputStream inputStream) throws IOException {
        return (fde) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static fde parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (fde) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static fde parseFrom(f72 f72Var) throws IOException {
        return (fde) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static fde parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (fde) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
