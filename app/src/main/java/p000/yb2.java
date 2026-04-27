package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.f2h;
import p000.ksi;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class yb2 extends v27<yb2, C15600b> implements zb2 {
    public static final int COMMIT_TIME_FIELD_NUMBER = 2;
    private static final yb2 DEFAULT_INSTANCE;
    private static volatile uhc<yb2> PARSER = null;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private f2h commitTime_;
    private w98.InterfaceC14504k<ksi> writeResults_ = v27.m23722x();

    /* JADX INFO: renamed from: yb2$a */
    public static /* synthetic */ class C15599a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101029a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f101029a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101029a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f101029a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f101029a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f101029a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f101029a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f101029a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: yb2$b */
    public static final class C15600b extends v27.AbstractC13823b<yb2, C15600b> implements zb2 {
        public /* synthetic */ C15600b(C15599a c15599a) {
            this();
        }

        public C15600b addAllWriteResults(Iterable<? extends ksi> iterable) {
            m23743e();
            ((yb2) this.f89756b).addAllWriteResults(iterable);
            return this;
        }

        public C15600b addWriteResults(ksi ksiVar) {
            m23743e();
            ((yb2) this.f89756b).addWriteResults(ksiVar);
            return this;
        }

        public C15600b clearCommitTime() {
            m23743e();
            ((yb2) this.f89756b).clearCommitTime();
            return this;
        }

        public C15600b clearWriteResults() {
            m23743e();
            ((yb2) this.f89756b).clearWriteResults();
            return this;
        }

        @Override // p000.zb2
        public f2h getCommitTime() {
            return ((yb2) this.f89756b).getCommitTime();
        }

        @Override // p000.zb2
        public ksi getWriteResults(int i) {
            return ((yb2) this.f89756b).getWriteResults(i);
        }

        @Override // p000.zb2
        public int getWriteResultsCount() {
            return ((yb2) this.f89756b).getWriteResultsCount();
        }

        @Override // p000.zb2
        public List<ksi> getWriteResultsList() {
            return Collections.unmodifiableList(((yb2) this.f89756b).getWriteResultsList());
        }

        @Override // p000.zb2
        public boolean hasCommitTime() {
            return ((yb2) this.f89756b).hasCommitTime();
        }

        public C15600b mergeCommitTime(f2h f2hVar) {
            m23743e();
            ((yb2) this.f89756b).mergeCommitTime(f2hVar);
            return this;
        }

        public C15600b removeWriteResults(int i) {
            m23743e();
            ((yb2) this.f89756b).removeWriteResults(i);
            return this;
        }

        public C15600b setCommitTime(f2h f2hVar) {
            m23743e();
            ((yb2) this.f89756b).setCommitTime(f2hVar);
            return this;
        }

        public C15600b setWriteResults(int i, ksi ksiVar) {
            m23743e();
            ((yb2) this.f89756b).setWriteResults(i, ksiVar);
            return this;
        }

        private C15600b() {
            super(yb2.DEFAULT_INSTANCE);
        }

        public C15600b addWriteResults(int i, ksi ksiVar) {
            m23743e();
            ((yb2) this.f89756b).addWriteResults(i, ksiVar);
            return this;
        }

        public C15600b setCommitTime(f2h.C5567b c5567b) {
            m23743e();
            ((yb2) this.f89756b).setCommitTime(c5567b.build());
            return this;
        }

        public C15600b setWriteResults(int i, ksi.C8518b c8518b) {
            m23743e();
            ((yb2) this.f89756b).setWriteResults(i, c8518b.build());
            return this;
        }

        public C15600b addWriteResults(ksi.C8518b c8518b) {
            m23743e();
            ((yb2) this.f89756b).addWriteResults(c8518b.build());
            return this;
        }

        public C15600b addWriteResults(int i, ksi.C8518b c8518b) {
            m23743e();
            ((yb2) this.f89756b).addWriteResults(i, c8518b.build());
            return this;
        }
    }

    static {
        yb2 yb2Var = new yb2();
        DEFAULT_INSTANCE = yb2Var;
        v27.m23715h0(yb2.class, yb2Var);
    }

    private yb2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWriteResults(Iterable<? extends ksi> iterable) {
        ensureWriteResultsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.writeResults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWriteResults(ksi ksiVar) {
        ksiVar.getClass();
        ensureWriteResultsIsMutable();
        this.writeResults_.add(ksiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommitTime() {
        this.commitTime_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWriteResults() {
        this.writeResults_ = v27.m23722x();
    }

    private void ensureWriteResultsIsMutable() {
        w98.InterfaceC14504k<ksi> interfaceC14504k = this.writeResults_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.writeResults_ = v27.m23698P(interfaceC14504k);
    }

    public static yb2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCommitTime(f2h f2hVar) {
        f2hVar.getClass();
        f2h f2hVar2 = this.commitTime_;
        if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
            this.commitTime_ = f2hVar;
        } else {
            this.commitTime_ = f2h.newBuilder(this.commitTime_).mergeFrom(f2hVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C15600b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static yb2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (yb2) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static yb2 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (yb2) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<yb2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWriteResults(int i) {
        ensureWriteResultsIsMutable();
        this.writeResults_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommitTime(f2h f2hVar) {
        f2hVar.getClass();
        this.commitTime_ = f2hVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWriteResults(int i, ksi ksiVar) {
        ksiVar.getClass();
        ensureWriteResultsIsMutable();
        this.writeResults_.set(i, ksiVar);
    }

    @Override // p000.zb2
    public f2h getCommitTime() {
        f2h f2hVar = this.commitTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.zb2
    public ksi getWriteResults(int i) {
        return this.writeResults_.get(i);
    }

    @Override // p000.zb2
    public int getWriteResultsCount() {
        return this.writeResults_.size();
    }

    @Override // p000.zb2
    public List<ksi> getWriteResultsList() {
        return this.writeResults_;
    }

    public lsi getWriteResultsOrBuilder(int i) {
        return this.writeResults_.get(i);
    }

    public List<? extends lsi> getWriteResultsOrBuilderList() {
        return this.writeResults_;
    }

    @Override // p000.zb2
    public boolean hasCommitTime() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C15599a c15599a = null;
        switch (C15599a.f101029a[enumC13830i.ordinal()]) {
            case 1:
                return new yb2();
            case 2:
                return new C15600b(c15599a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "writeResults_", ksi.class, "commitTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<yb2> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (yb2.class) {
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

    public static C15600b newBuilder(yb2 yb2Var) {
        return DEFAULT_INSTANCE.m23739o(yb2Var);
    }

    public static yb2 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (yb2) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static yb2 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (yb2) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static yb2 parseFrom(vj1 vj1Var) throws ce8 {
        return (yb2) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWriteResults(int i, ksi ksiVar) {
        ksiVar.getClass();
        ensureWriteResultsIsMutable();
        this.writeResults_.add(i, ksiVar);
    }

    public static yb2 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (yb2) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static yb2 parseFrom(byte[] bArr) throws ce8 {
        return (yb2) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static yb2 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (yb2) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static yb2 parseFrom(InputStream inputStream) throws IOException {
        return (yb2) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static yb2 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (yb2) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static yb2 parseFrom(f72 f72Var) throws IOException {
        return (yb2) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static yb2 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (yb2) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
