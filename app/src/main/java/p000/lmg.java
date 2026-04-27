package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.f2h;
import p000.mmg;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class lmg extends v27<lmg, C8903b> implements fng {
    private static final lmg DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile uhc<lmg> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private f2h lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private f2h snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private vj1 resumeToken_ = vj1.f91344e;

    /* JADX INFO: renamed from: lmg$a */
    public static /* synthetic */ class C8902a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58270a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f58270a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58270a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58270a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58270a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58270a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58270a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58270a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: lmg$b */
    public static final class C8903b extends v27.AbstractC13823b<lmg, C8903b> implements fng {
        public /* synthetic */ C8903b(C8902a c8902a) {
            this();
        }

        public C8903b clearDocuments() {
            m23743e();
            ((lmg) this.f89756b).clearDocuments();
            return this;
        }

        public C8903b clearLastLimboFreeSnapshotVersion() {
            m23743e();
            ((lmg) this.f89756b).clearLastLimboFreeSnapshotVersion();
            return this;
        }

        public C8903b clearLastListenSequenceNumber() {
            m23743e();
            ((lmg) this.f89756b).clearLastListenSequenceNumber();
            return this;
        }

        public C8903b clearQuery() {
            m23743e();
            ((lmg) this.f89756b).clearQuery();
            return this;
        }

        public C8903b clearResumeToken() {
            m23743e();
            ((lmg) this.f89756b).clearResumeToken();
            return this;
        }

        public C8903b clearSnapshotVersion() {
            m23743e();
            ((lmg) this.f89756b).clearSnapshotVersion();
            return this;
        }

        public C8903b clearTargetId() {
            m23743e();
            ((lmg) this.f89756b).clearTargetId();
            return this;
        }

        public C8903b clearTargetType() {
            m23743e();
            ((lmg) this.f89756b).clearTargetType();
            return this;
        }

        @Override // p000.fng
        public mmg.C9417c getDocuments() {
            return ((lmg) this.f89756b).getDocuments();
        }

        @Override // p000.fng
        public f2h getLastLimboFreeSnapshotVersion() {
            return ((lmg) this.f89756b).getLastLimboFreeSnapshotVersion();
        }

        @Override // p000.fng
        public long getLastListenSequenceNumber() {
            return ((lmg) this.f89756b).getLastListenSequenceNumber();
        }

        @Override // p000.fng
        public mmg.C9419e getQuery() {
            return ((lmg) this.f89756b).getQuery();
        }

        @Override // p000.fng
        public vj1 getResumeToken() {
            return ((lmg) this.f89756b).getResumeToken();
        }

        @Override // p000.fng
        public f2h getSnapshotVersion() {
            return ((lmg) this.f89756b).getSnapshotVersion();
        }

        @Override // p000.fng
        public int getTargetId() {
            return ((lmg) this.f89756b).getTargetId();
        }

        @Override // p000.fng
        public EnumC8904c getTargetTypeCase() {
            return ((lmg) this.f89756b).getTargetTypeCase();
        }

        @Override // p000.fng
        public boolean hasDocuments() {
            return ((lmg) this.f89756b).hasDocuments();
        }

        @Override // p000.fng
        public boolean hasLastLimboFreeSnapshotVersion() {
            return ((lmg) this.f89756b).hasLastLimboFreeSnapshotVersion();
        }

        @Override // p000.fng
        public boolean hasQuery() {
            return ((lmg) this.f89756b).hasQuery();
        }

        @Override // p000.fng
        public boolean hasSnapshotVersion() {
            return ((lmg) this.f89756b).hasSnapshotVersion();
        }

        public C8903b mergeDocuments(mmg.C9417c c9417c) {
            m23743e();
            ((lmg) this.f89756b).mergeDocuments(c9417c);
            return this;
        }

        public C8903b mergeLastLimboFreeSnapshotVersion(f2h f2hVar) {
            m23743e();
            ((lmg) this.f89756b).mergeLastLimboFreeSnapshotVersion(f2hVar);
            return this;
        }

        public C8903b mergeQuery(mmg.C9419e c9419e) {
            m23743e();
            ((lmg) this.f89756b).mergeQuery(c9419e);
            return this;
        }

        public C8903b mergeSnapshotVersion(f2h f2hVar) {
            m23743e();
            ((lmg) this.f89756b).mergeSnapshotVersion(f2hVar);
            return this;
        }

        public C8903b setDocuments(mmg.C9417c c9417c) {
            m23743e();
            ((lmg) this.f89756b).setDocuments(c9417c);
            return this;
        }

        public C8903b setLastLimboFreeSnapshotVersion(f2h f2hVar) {
            m23743e();
            ((lmg) this.f89756b).setLastLimboFreeSnapshotVersion(f2hVar);
            return this;
        }

        public C8903b setLastListenSequenceNumber(long j) {
            m23743e();
            ((lmg) this.f89756b).setLastListenSequenceNumber(j);
            return this;
        }

        public C8903b setQuery(mmg.C9419e c9419e) {
            m23743e();
            ((lmg) this.f89756b).setQuery(c9419e);
            return this;
        }

        public C8903b setResumeToken(vj1 vj1Var) {
            m23743e();
            ((lmg) this.f89756b).setResumeToken(vj1Var);
            return this;
        }

        public C8903b setSnapshotVersion(f2h f2hVar) {
            m23743e();
            ((lmg) this.f89756b).setSnapshotVersion(f2hVar);
            return this;
        }

        public C8903b setTargetId(int i) {
            m23743e();
            ((lmg) this.f89756b).setTargetId(i);
            return this;
        }

        private C8903b() {
            super(lmg.DEFAULT_INSTANCE);
        }

        public C8903b setDocuments(mmg.C9417c.a aVar) {
            m23743e();
            ((lmg) this.f89756b).setDocuments(aVar.build());
            return this;
        }

        public C8903b setLastLimboFreeSnapshotVersion(f2h.C5567b c5567b) {
            m23743e();
            ((lmg) this.f89756b).setLastLimboFreeSnapshotVersion(c5567b.build());
            return this;
        }

        public C8903b setQuery(mmg.C9419e.a aVar) {
            m23743e();
            ((lmg) this.f89756b).setQuery(aVar.build());
            return this;
        }

        public C8903b setSnapshotVersion(f2h.C5567b c5567b) {
            m23743e();
            ((lmg) this.f89756b).setSnapshotVersion(c5567b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: lmg$c */
    public enum EnumC8904c {
        QUERY(5),
        DOCUMENTS(6),
        TARGETTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f58275a;

        EnumC8904c(int i) {
            this.f58275a = i;
        }

        public static EnumC8904c forNumber(int i) {
            if (i == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i == 5) {
                return QUERY;
            }
            if (i != 6) {
                return null;
            }
            return DOCUMENTS;
        }

        public int getNumber() {
            return this.f58275a;
        }

        @Deprecated
        public static EnumC8904c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        lmg lmgVar = new lmg();
        DEFAULT_INSTANCE = lmgVar;
        v27.m23715h0(lmg.class, lmgVar);
    }

    private lmg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocuments() {
        if (this.targetTypeCase_ == 6) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastLimboFreeSnapshotVersion() {
        this.lastLimboFreeSnapshotVersion_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastListenSequenceNumber() {
        this.lastListenSequenceNumber_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        if (this.targetTypeCase_ == 5) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeToken() {
        this.resumeToken_ = getDefaultInstance().getResumeToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSnapshotVersion() {
        this.snapshotVersion_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetId() {
        this.targetId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetType() {
        this.targetTypeCase_ = 0;
        this.targetType_ = null;
    }

    public static lmg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocuments(mmg.C9417c c9417c) {
        c9417c.getClass();
        if (this.targetTypeCase_ != 6 || this.targetType_ == mmg.C9417c.getDefaultInstance()) {
            this.targetType_ = c9417c;
        } else {
            this.targetType_ = mmg.C9417c.newBuilder((mmg.C9417c) this.targetType_).mergeFrom(c9417c).buildPartial();
        }
        this.targetTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastLimboFreeSnapshotVersion(f2h f2hVar) {
        f2hVar.getClass();
        f2h f2hVar2 = this.lastLimboFreeSnapshotVersion_;
        if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
            this.lastLimboFreeSnapshotVersion_ = f2hVar;
        } else {
            this.lastLimboFreeSnapshotVersion_ = f2h.newBuilder(this.lastLimboFreeSnapshotVersion_).mergeFrom(f2hVar).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuery(mmg.C9419e c9419e) {
        c9419e.getClass();
        if (this.targetTypeCase_ != 5 || this.targetType_ == mmg.C9419e.getDefaultInstance()) {
            this.targetType_ = c9419e;
        } else {
            this.targetType_ = mmg.C9419e.newBuilder((mmg.C9419e) this.targetType_).mergeFrom(c9419e).buildPartial();
        }
        this.targetTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSnapshotVersion(f2h f2hVar) {
        f2hVar.getClass();
        f2h f2hVar2 = this.snapshotVersion_;
        if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
            this.snapshotVersion_ = f2hVar;
        } else {
            this.snapshotVersion_ = f2h.newBuilder(this.snapshotVersion_).mergeFrom(f2hVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C8903b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static lmg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (lmg) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static lmg parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (lmg) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<lmg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocuments(mmg.C9417c c9417c) {
        c9417c.getClass();
        this.targetType_ = c9417c;
        this.targetTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastLimboFreeSnapshotVersion(f2h f2hVar) {
        f2hVar.getClass();
        this.lastLimboFreeSnapshotVersion_ = f2hVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastListenSequenceNumber(long j) {
        this.lastListenSequenceNumber_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(mmg.C9419e c9419e) {
        c9419e.getClass();
        this.targetType_ = c9419e;
        this.targetTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeToken(vj1 vj1Var) {
        vj1Var.getClass();
        this.resumeToken_ = vj1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnapshotVersion(f2h f2hVar) {
        f2hVar.getClass();
        this.snapshotVersion_ = f2hVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetId(int i) {
        this.targetId_ = i;
    }

    @Override // p000.fng
    public mmg.C9417c getDocuments() {
        return this.targetTypeCase_ == 6 ? (mmg.C9417c) this.targetType_ : mmg.C9417c.getDefaultInstance();
    }

    @Override // p000.fng
    public f2h getLastLimboFreeSnapshotVersion() {
        f2h f2hVar = this.lastLimboFreeSnapshotVersion_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.fng
    public long getLastListenSequenceNumber() {
        return this.lastListenSequenceNumber_;
    }

    @Override // p000.fng
    public mmg.C9419e getQuery() {
        return this.targetTypeCase_ == 5 ? (mmg.C9419e) this.targetType_ : mmg.C9419e.getDefaultInstance();
    }

    @Override // p000.fng
    public vj1 getResumeToken() {
        return this.resumeToken_;
    }

    @Override // p000.fng
    public f2h getSnapshotVersion() {
        f2h f2hVar = this.snapshotVersion_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.fng
    public int getTargetId() {
        return this.targetId_;
    }

    @Override // p000.fng
    public EnumC8904c getTargetTypeCase() {
        return EnumC8904c.forNumber(this.targetTypeCase_);
    }

    @Override // p000.fng
    public boolean hasDocuments() {
        return this.targetTypeCase_ == 6;
    }

    @Override // p000.fng
    public boolean hasLastLimboFreeSnapshotVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.fng
    public boolean hasQuery() {
        return this.targetTypeCase_ == 5;
    }

    @Override // p000.fng
    public boolean hasSnapshotVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8902a c8902a = null;
        switch (C8902a.f58270a[enumC13830i.ordinal()]) {
            case 1:
                return new lmg();
            case 2:
                return new C8903b(c8902a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007ဉ\u0001", new Object[]{"targetType_", "targetTypeCase_", "bitField0_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", mmg.C9419e.class, mmg.C9417c.class, "lastLimboFreeSnapshotVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<lmg> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (lmg.class) {
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

    public static C8903b newBuilder(lmg lmgVar) {
        return DEFAULT_INSTANCE.m23739o(lmgVar);
    }

    public static lmg parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (lmg) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static lmg parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (lmg) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static lmg parseFrom(vj1 vj1Var) throws ce8 {
        return (lmg) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static lmg parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (lmg) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static lmg parseFrom(byte[] bArr) throws ce8 {
        return (lmg) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static lmg parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (lmg) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static lmg parseFrom(InputStream inputStream) throws IOException {
        return (lmg) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static lmg parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (lmg) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static lmg parseFrom(f72 f72Var) throws IOException {
        return (lmg) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static lmg parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (lmg) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
