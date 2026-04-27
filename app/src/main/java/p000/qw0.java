package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.f2h;
import p000.nh4;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class qw0 extends v27<qw0, C11720b> implements rw0 {
    private static final qw0 DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile uhc<qw0> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private f2h readTime_;
    private Object result_;
    private int resultCase_ = 0;
    private vj1 transaction_ = vj1.f91344e;

    /* JADX INFO: renamed from: qw0$a */
    public static /* synthetic */ class C11719a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f75961a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f75961a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75961a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75961a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f75961a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f75961a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f75961a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f75961a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: qw0$b */
    public static final class C11720b extends v27.AbstractC13823b<qw0, C11720b> implements rw0 {
        public /* synthetic */ C11720b(C11719a c11719a) {
            this();
        }

        public C11720b clearFound() {
            m23743e();
            ((qw0) this.f89756b).clearFound();
            return this;
        }

        public C11720b clearMissing() {
            m23743e();
            ((qw0) this.f89756b).clearMissing();
            return this;
        }

        public C11720b clearReadTime() {
            m23743e();
            ((qw0) this.f89756b).clearReadTime();
            return this;
        }

        public C11720b clearResult() {
            m23743e();
            ((qw0) this.f89756b).clearResult();
            return this;
        }

        public C11720b clearTransaction() {
            m23743e();
            ((qw0) this.f89756b).clearTransaction();
            return this;
        }

        @Override // p000.rw0
        public nh4 getFound() {
            return ((qw0) this.f89756b).getFound();
        }

        @Override // p000.rw0
        public String getMissing() {
            return ((qw0) this.f89756b).getMissing();
        }

        @Override // p000.rw0
        public vj1 getMissingBytes() {
            return ((qw0) this.f89756b).getMissingBytes();
        }

        @Override // p000.rw0
        public f2h getReadTime() {
            return ((qw0) this.f89756b).getReadTime();
        }

        @Override // p000.rw0
        public EnumC11721c getResultCase() {
            return ((qw0) this.f89756b).getResultCase();
        }

        @Override // p000.rw0
        public vj1 getTransaction() {
            return ((qw0) this.f89756b).getTransaction();
        }

        @Override // p000.rw0
        public boolean hasFound() {
            return ((qw0) this.f89756b).hasFound();
        }

        @Override // p000.rw0
        public boolean hasMissing() {
            return ((qw0) this.f89756b).hasMissing();
        }

        @Override // p000.rw0
        public boolean hasReadTime() {
            return ((qw0) this.f89756b).hasReadTime();
        }

        public C11720b mergeFound(nh4 nh4Var) {
            m23743e();
            ((qw0) this.f89756b).mergeFound(nh4Var);
            return this;
        }

        public C11720b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((qw0) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C11720b setFound(nh4 nh4Var) {
            m23743e();
            ((qw0) this.f89756b).setFound(nh4Var);
            return this;
        }

        public C11720b setMissing(String str) {
            m23743e();
            ((qw0) this.f89756b).setMissing(str);
            return this;
        }

        public C11720b setMissingBytes(vj1 vj1Var) {
            m23743e();
            ((qw0) this.f89756b).setMissingBytes(vj1Var);
            return this;
        }

        public C11720b setReadTime(f2h f2hVar) {
            m23743e();
            ((qw0) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        public C11720b setTransaction(vj1 vj1Var) {
            m23743e();
            ((qw0) this.f89756b).setTransaction(vj1Var);
            return this;
        }

        private C11720b() {
            super(qw0.DEFAULT_INSTANCE);
        }

        public C11720b setFound(nh4.C9874b c9874b) {
            m23743e();
            ((qw0) this.f89756b).setFound(c9874b.build());
            return this;
        }

        public C11720b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((qw0) this.f89756b).setReadTime(c5567b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: qw0$c */
    public enum EnumC11721c {
        FOUND(1),
        MISSING(2),
        RESULT_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f75966a;

        EnumC11721c(int i) {
            this.f75966a = i;
        }

        public static EnumC11721c forNumber(int i) {
            if (i == 0) {
                return RESULT_NOT_SET;
            }
            if (i == 1) {
                return FOUND;
            }
            if (i != 2) {
                return null;
            }
            return MISSING;
        }

        public int getNumber() {
            return this.f75966a;
        }

        @Deprecated
        public static EnumC11721c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        qw0 qw0Var = new qw0();
        DEFAULT_INSTANCE = qw0Var;
        v27.m23715h0(qw0.class, qw0Var);
    }

    private qw0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFound() {
        if (this.resultCase_ == 1) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMissing() {
        if (this.resultCase_ == 2) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        this.transaction_ = getDefaultInstance().getTransaction();
    }

    public static qw0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFound(nh4 nh4Var) {
        nh4Var.getClass();
        if (this.resultCase_ != 1 || this.result_ == nh4.getDefaultInstance()) {
            this.result_ = nh4Var;
        } else {
            this.result_ = nh4.newBuilder((nh4) this.result_).mergeFrom(nh4Var).buildPartial();
        }
        this.resultCase_ = 1;
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
        this.bitField0_ |= 1;
    }

    public static C11720b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static qw0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (qw0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static qw0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (qw0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<qw0> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFound(nh4 nh4Var) {
        nh4Var.getClass();
        this.result_ = nh4Var;
        this.resultCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMissing(String str) {
        str.getClass();
        this.resultCase_ = 2;
        this.result_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMissingBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.result_ = vj1Var.toStringUtf8();
        this.resultCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(f2h f2hVar) {
        f2hVar.getClass();
        this.readTime_ = f2hVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(vj1 vj1Var) {
        vj1Var.getClass();
        this.transaction_ = vj1Var;
    }

    @Override // p000.rw0
    public nh4 getFound() {
        return this.resultCase_ == 1 ? (nh4) this.result_ : nh4.getDefaultInstance();
    }

    @Override // p000.rw0
    public String getMissing() {
        return this.resultCase_ == 2 ? (String) this.result_ : "";
    }

    @Override // p000.rw0
    public vj1 getMissingBytes() {
        return vj1.copyFromUtf8(this.resultCase_ == 2 ? (String) this.result_ : "");
    }

    @Override // p000.rw0
    public f2h getReadTime() {
        f2h f2hVar = this.readTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.rw0
    public EnumC11721c getResultCase() {
        return EnumC11721c.forNumber(this.resultCase_);
    }

    @Override // p000.rw0
    public vj1 getTransaction() {
        return this.transaction_;
    }

    @Override // p000.rw0
    public boolean hasFound() {
        return this.resultCase_ == 1;
    }

    @Override // p000.rw0
    public boolean hasMissing() {
        return this.resultCase_ == 2;
    }

    @Override // p000.rw0
    public boolean hasReadTime() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C11719a c11719a = null;
        switch (C11719a.f75961a[enumC13830i.ordinal()]) {
            case 1:
                return new qw0();
            case 2:
                return new C11720b(c11719a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004ဉ\u0000", new Object[]{"result_", "resultCase_", "bitField0_", nh4.class, "transaction_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<qw0> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (qw0.class) {
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

    public static C11720b newBuilder(qw0 qw0Var) {
        return DEFAULT_INSTANCE.m23739o(qw0Var);
    }

    public static qw0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (qw0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static qw0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (qw0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static qw0 parseFrom(vj1 vj1Var) throws ce8 {
        return (qw0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static qw0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (qw0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static qw0 parseFrom(byte[] bArr) throws ce8 {
        return (qw0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static qw0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (qw0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static qw0 parseFrom(InputStream inputStream) throws IOException {
        return (qw0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static qw0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (qw0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static qw0 parseFrom(f72 f72Var) throws IOException {
        return (qw0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static qw0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (qw0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
