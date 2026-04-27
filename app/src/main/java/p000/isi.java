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
public final class isi extends v27<isi, C7589b> implements jsi {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final isi DEFAULT_INSTANCE;
    private static volatile uhc<isi> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private f2h commitTime_;
    private String streamId_ = "";
    private vj1 streamToken_ = vj1.f91344e;
    private w98.InterfaceC14504k<ksi> writeResults_ = v27.m23722x();

    /* JADX INFO: renamed from: isi$a */
    public static /* synthetic */ class C7588a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f48165a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f48165a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48165a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48165a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48165a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48165a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f48165a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f48165a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: isi$b */
    public static final class C7589b extends v27.AbstractC13823b<isi, C7589b> implements jsi {
        public /* synthetic */ C7589b(C7588a c7588a) {
            this();
        }

        public C7589b addAllWriteResults(Iterable<? extends ksi> iterable) {
            m23743e();
            ((isi) this.f89756b).addAllWriteResults(iterable);
            return this;
        }

        public C7589b addWriteResults(ksi ksiVar) {
            m23743e();
            ((isi) this.f89756b).addWriteResults(ksiVar);
            return this;
        }

        public C7589b clearCommitTime() {
            m23743e();
            ((isi) this.f89756b).clearCommitTime();
            return this;
        }

        public C7589b clearStreamId() {
            m23743e();
            ((isi) this.f89756b).clearStreamId();
            return this;
        }

        public C7589b clearStreamToken() {
            m23743e();
            ((isi) this.f89756b).clearStreamToken();
            return this;
        }

        public C7589b clearWriteResults() {
            m23743e();
            ((isi) this.f89756b).clearWriteResults();
            return this;
        }

        @Override // p000.jsi
        public f2h getCommitTime() {
            return ((isi) this.f89756b).getCommitTime();
        }

        @Override // p000.jsi
        public String getStreamId() {
            return ((isi) this.f89756b).getStreamId();
        }

        @Override // p000.jsi
        public vj1 getStreamIdBytes() {
            return ((isi) this.f89756b).getStreamIdBytes();
        }

        @Override // p000.jsi
        public vj1 getStreamToken() {
            return ((isi) this.f89756b).getStreamToken();
        }

        @Override // p000.jsi
        public ksi getWriteResults(int i) {
            return ((isi) this.f89756b).getWriteResults(i);
        }

        @Override // p000.jsi
        public int getWriteResultsCount() {
            return ((isi) this.f89756b).getWriteResultsCount();
        }

        @Override // p000.jsi
        public List<ksi> getWriteResultsList() {
            return Collections.unmodifiableList(((isi) this.f89756b).getWriteResultsList());
        }

        @Override // p000.jsi
        public boolean hasCommitTime() {
            return ((isi) this.f89756b).hasCommitTime();
        }

        public C7589b mergeCommitTime(f2h f2hVar) {
            m23743e();
            ((isi) this.f89756b).mergeCommitTime(f2hVar);
            return this;
        }

        public C7589b removeWriteResults(int i) {
            m23743e();
            ((isi) this.f89756b).removeWriteResults(i);
            return this;
        }

        public C7589b setCommitTime(f2h f2hVar) {
            m23743e();
            ((isi) this.f89756b).setCommitTime(f2hVar);
            return this;
        }

        public C7589b setStreamId(String str) {
            m23743e();
            ((isi) this.f89756b).setStreamId(str);
            return this;
        }

        public C7589b setStreamIdBytes(vj1 vj1Var) {
            m23743e();
            ((isi) this.f89756b).setStreamIdBytes(vj1Var);
            return this;
        }

        public C7589b setStreamToken(vj1 vj1Var) {
            m23743e();
            ((isi) this.f89756b).setStreamToken(vj1Var);
            return this;
        }

        public C7589b setWriteResults(int i, ksi ksiVar) {
            m23743e();
            ((isi) this.f89756b).setWriteResults(i, ksiVar);
            return this;
        }

        private C7589b() {
            super(isi.DEFAULT_INSTANCE);
        }

        public C7589b addWriteResults(int i, ksi ksiVar) {
            m23743e();
            ((isi) this.f89756b).addWriteResults(i, ksiVar);
            return this;
        }

        public C7589b setCommitTime(f2h.C5567b c5567b) {
            m23743e();
            ((isi) this.f89756b).setCommitTime(c5567b.build());
            return this;
        }

        public C7589b setWriteResults(int i, ksi.C8518b c8518b) {
            m23743e();
            ((isi) this.f89756b).setWriteResults(i, c8518b.build());
            return this;
        }

        public C7589b addWriteResults(ksi.C8518b c8518b) {
            m23743e();
            ((isi) this.f89756b).addWriteResults(c8518b.build());
            return this;
        }

        public C7589b addWriteResults(int i, ksi.C8518b c8518b) {
            m23743e();
            ((isi) this.f89756b).addWriteResults(i, c8518b.build());
            return this;
        }
    }

    static {
        isi isiVar = new isi();
        DEFAULT_INSTANCE = isiVar;
        v27.m23715h0(isi.class, isiVar);
    }

    private isi() {
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
    public void clearStreamId() {
        this.streamId_ = getDefaultInstance().getStreamId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamToken() {
        this.streamToken_ = getDefaultInstance().getStreamToken();
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

    public static isi getDefaultInstance() {
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

    public static C7589b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static isi parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (isi) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static isi parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (isi) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<isi> parser() {
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
    public void setStreamId(String str) {
        str.getClass();
        this.streamId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamIdBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.streamId_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamToken(vj1 vj1Var) {
        vj1Var.getClass();
        this.streamToken_ = vj1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWriteResults(int i, ksi ksiVar) {
        ksiVar.getClass();
        ensureWriteResultsIsMutable();
        this.writeResults_.set(i, ksiVar);
    }

    @Override // p000.jsi
    public f2h getCommitTime() {
        f2h f2hVar = this.commitTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.jsi
    public String getStreamId() {
        return this.streamId_;
    }

    @Override // p000.jsi
    public vj1 getStreamIdBytes() {
        return vj1.copyFromUtf8(this.streamId_);
    }

    @Override // p000.jsi
    public vj1 getStreamToken() {
        return this.streamToken_;
    }

    @Override // p000.jsi
    public ksi getWriteResults(int i) {
        return this.writeResults_.get(i);
    }

    @Override // p000.jsi
    public int getWriteResultsCount() {
        return this.writeResults_.size();
    }

    @Override // p000.jsi
    public List<ksi> getWriteResultsList() {
        return this.writeResults_;
    }

    public lsi getWriteResultsOrBuilder(int i) {
        return this.writeResults_.get(i);
    }

    public List<? extends lsi> getWriteResultsOrBuilderList() {
        return this.writeResults_;
    }

    @Override // p000.jsi
    public boolean hasCommitTime() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C7588a c7588a = null;
        switch (C7588a.f48165a[enumC13830i.ordinal()]) {
            case 1:
                return new isi();
            case 2:
                return new C7589b(c7588a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "streamId_", "streamToken_", "writeResults_", ksi.class, "commitTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<isi> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (isi.class) {
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

    public static C7589b newBuilder(isi isiVar) {
        return DEFAULT_INSTANCE.m23739o(isiVar);
    }

    public static isi parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (isi) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static isi parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (isi) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static isi parseFrom(vj1 vj1Var) throws ce8 {
        return (isi) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWriteResults(int i, ksi ksiVar) {
        ksiVar.getClass();
        ensureWriteResultsIsMutable();
        this.writeResults_.add(i, ksiVar);
    }

    public static isi parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (isi) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static isi parseFrom(byte[] bArr) throws ce8 {
        return (isi) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static isi parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (isi) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static isi parseFrom(InputStream inputStream) throws IOException {
        return (isi) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static isi parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (isi) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static isi parseFrom(f72 f72Var) throws IOException {
        return (isi) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static isi parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (isi) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
