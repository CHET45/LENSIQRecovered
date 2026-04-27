package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.C12108rj;
import p000.f2h;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class wce extends v27<wce, C14551b> implements xce {
    private static final wce DEFAULT_INSTANCE;
    private static volatile uhc<wce> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private f2h readTime_;
    private C12108rj result_;
    private vj1 transaction_ = vj1.f91344e;

    /* JADX INFO: renamed from: wce$a */
    public static /* synthetic */ class C14550a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93951a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f93951a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93951a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93951a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93951a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93951a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93951a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93951a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: wce$b */
    public static final class C14551b extends v27.AbstractC13823b<wce, C14551b> implements xce {
        public /* synthetic */ C14551b(C14550a c14550a) {
            this();
        }

        public C14551b clearReadTime() {
            m23743e();
            ((wce) this.f89756b).clearReadTime();
            return this;
        }

        public C14551b clearResult() {
            m23743e();
            ((wce) this.f89756b).clearResult();
            return this;
        }

        public C14551b clearTransaction() {
            m23743e();
            ((wce) this.f89756b).clearTransaction();
            return this;
        }

        @Override // p000.xce
        public f2h getReadTime() {
            return ((wce) this.f89756b).getReadTime();
        }

        @Override // p000.xce
        public C12108rj getResult() {
            return ((wce) this.f89756b).getResult();
        }

        @Override // p000.xce
        public vj1 getTransaction() {
            return ((wce) this.f89756b).getTransaction();
        }

        @Override // p000.xce
        public boolean hasReadTime() {
            return ((wce) this.f89756b).hasReadTime();
        }

        @Override // p000.xce
        public boolean hasResult() {
            return ((wce) this.f89756b).hasResult();
        }

        public C14551b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((wce) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C14551b mergeResult(C12108rj c12108rj) {
            m23743e();
            ((wce) this.f89756b).mergeResult(c12108rj);
            return this;
        }

        public C14551b setReadTime(f2h f2hVar) {
            m23743e();
            ((wce) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        public C14551b setResult(C12108rj c12108rj) {
            m23743e();
            ((wce) this.f89756b).setResult(c12108rj);
            return this;
        }

        public C14551b setTransaction(vj1 vj1Var) {
            m23743e();
            ((wce) this.f89756b).setTransaction(vj1Var);
            return this;
        }

        private C14551b() {
            super(wce.DEFAULT_INSTANCE);
        }

        public C14551b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((wce) this.f89756b).setReadTime(c5567b.build());
            return this;
        }

        public C14551b setResult(C12108rj.c cVar) {
            m23743e();
            ((wce) this.f89756b).setResult(cVar.build());
            return this;
        }
    }

    static {
        wce wceVar = new wce();
        DEFAULT_INSTANCE = wceVar;
        v27.m23715h0(wce.class, wceVar);
    }

    private wce() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.result_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        this.transaction_ = getDefaultInstance().getTransaction();
    }

    public static wce getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResult(C12108rj c12108rj) {
        c12108rj.getClass();
        C12108rj c12108rj2 = this.result_;
        if (c12108rj2 == null || c12108rj2 == C12108rj.getDefaultInstance()) {
            this.result_ = c12108rj;
        } else {
            this.result_ = C12108rj.newBuilder(this.result_).mergeFrom(c12108rj).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C14551b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static wce parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (wce) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static wce parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (wce) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<wce> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(f2h f2hVar) {
        f2hVar.getClass();
        this.readTime_ = f2hVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(C12108rj c12108rj) {
        c12108rj.getClass();
        this.result_ = c12108rj;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(vj1 vj1Var) {
        vj1Var.getClass();
        this.transaction_ = vj1Var;
    }

    @Override // p000.xce
    public f2h getReadTime() {
        f2h f2hVar = this.readTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.xce
    public C12108rj getResult() {
        C12108rj c12108rj = this.result_;
        return c12108rj == null ? C12108rj.getDefaultInstance() : c12108rj;
    }

    @Override // p000.xce
    public vj1 getTransaction() {
        return this.transaction_;
    }

    @Override // p000.xce
    public boolean hasReadTime() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.xce
    public boolean hasResult() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C14550a c14550a = null;
        switch (C14550a.f93951a[enumC13830i.ordinal()]) {
            case 1:
                return new wce();
            case 2:
                return new C14551b(c14550a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003ဉ\u0001", new Object[]{"bitField0_", "result_", "transaction_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<wce> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (wce.class) {
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

    public static C14551b newBuilder(wce wceVar) {
        return DEFAULT_INSTANCE.m23739o(wceVar);
    }

    public static wce parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (wce) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static wce parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (wce) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static wce parseFrom(vj1 vj1Var) throws ce8 {
        return (wce) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static wce parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (wce) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static wce parseFrom(byte[] bArr) throws ce8 {
        return (wce) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static wce parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (wce) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static wce parseFrom(InputStream inputStream) throws IOException {
        return (wce) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static wce parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (wce) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static wce parseFrom(f72 f72Var) throws IOException {
        return (wce) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static wce parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (wce) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
