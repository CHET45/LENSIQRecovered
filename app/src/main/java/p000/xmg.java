package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.f2h;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class xmg extends v27<xmg, C15201b> implements ymg {
    private static final xmg DEFAULT_INSTANCE;
    public static final int HIGHEST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 2;
    public static final int HIGHEST_TARGET_ID_FIELD_NUMBER = 1;
    public static final int LAST_REMOTE_SNAPSHOT_VERSION_FIELD_NUMBER = 3;
    private static volatile uhc<xmg> PARSER = null;
    public static final int TARGET_COUNT_FIELD_NUMBER = 4;
    private int bitField0_;
    private long highestListenSequenceNumber_;
    private int highestTargetId_;
    private f2h lastRemoteSnapshotVersion_;
    private int targetCount_;

    /* JADX INFO: renamed from: xmg$a */
    public static /* synthetic */ class C15200a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f98548a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f98548a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98548a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98548a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98548a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98548a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f98548a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f98548a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: xmg$b */
    public static final class C15201b extends v27.AbstractC13823b<xmg, C15201b> implements ymg {
        public /* synthetic */ C15201b(C15200a c15200a) {
            this();
        }

        public C15201b clearHighestListenSequenceNumber() {
            m23743e();
            ((xmg) this.f89756b).clearHighestListenSequenceNumber();
            return this;
        }

        public C15201b clearHighestTargetId() {
            m23743e();
            ((xmg) this.f89756b).clearHighestTargetId();
            return this;
        }

        public C15201b clearLastRemoteSnapshotVersion() {
            m23743e();
            ((xmg) this.f89756b).clearLastRemoteSnapshotVersion();
            return this;
        }

        public C15201b clearTargetCount() {
            m23743e();
            ((xmg) this.f89756b).clearTargetCount();
            return this;
        }

        @Override // p000.ymg
        public long getHighestListenSequenceNumber() {
            return ((xmg) this.f89756b).getHighestListenSequenceNumber();
        }

        @Override // p000.ymg
        public int getHighestTargetId() {
            return ((xmg) this.f89756b).getHighestTargetId();
        }

        @Override // p000.ymg
        public f2h getLastRemoteSnapshotVersion() {
            return ((xmg) this.f89756b).getLastRemoteSnapshotVersion();
        }

        @Override // p000.ymg
        public int getTargetCount() {
            return ((xmg) this.f89756b).getTargetCount();
        }

        @Override // p000.ymg
        public boolean hasLastRemoteSnapshotVersion() {
            return ((xmg) this.f89756b).hasLastRemoteSnapshotVersion();
        }

        public C15201b mergeLastRemoteSnapshotVersion(f2h f2hVar) {
            m23743e();
            ((xmg) this.f89756b).mergeLastRemoteSnapshotVersion(f2hVar);
            return this;
        }

        public C15201b setHighestListenSequenceNumber(long j) {
            m23743e();
            ((xmg) this.f89756b).setHighestListenSequenceNumber(j);
            return this;
        }

        public C15201b setHighestTargetId(int i) {
            m23743e();
            ((xmg) this.f89756b).setHighestTargetId(i);
            return this;
        }

        public C15201b setLastRemoteSnapshotVersion(f2h f2hVar) {
            m23743e();
            ((xmg) this.f89756b).setLastRemoteSnapshotVersion(f2hVar);
            return this;
        }

        public C15201b setTargetCount(int i) {
            m23743e();
            ((xmg) this.f89756b).setTargetCount(i);
            return this;
        }

        private C15201b() {
            super(xmg.DEFAULT_INSTANCE);
        }

        public C15201b setLastRemoteSnapshotVersion(f2h.C5567b c5567b) {
            m23743e();
            ((xmg) this.f89756b).setLastRemoteSnapshotVersion(c5567b.build());
            return this;
        }
    }

    static {
        xmg xmgVar = new xmg();
        DEFAULT_INSTANCE = xmgVar;
        v27.m23715h0(xmg.class, xmgVar);
    }

    private xmg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHighestListenSequenceNumber() {
        this.highestListenSequenceNumber_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHighestTargetId() {
        this.highestTargetId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastRemoteSnapshotVersion() {
        this.lastRemoteSnapshotVersion_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetCount() {
        this.targetCount_ = 0;
    }

    public static xmg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastRemoteSnapshotVersion(f2h f2hVar) {
        f2hVar.getClass();
        f2h f2hVar2 = this.lastRemoteSnapshotVersion_;
        if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
            this.lastRemoteSnapshotVersion_ = f2hVar;
        } else {
            this.lastRemoteSnapshotVersion_ = f2h.newBuilder(this.lastRemoteSnapshotVersion_).mergeFrom(f2hVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C15201b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static xmg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (xmg) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static xmg parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (xmg) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<xmg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighestListenSequenceNumber(long j) {
        this.highestListenSequenceNumber_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighestTargetId(int i) {
        this.highestTargetId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastRemoteSnapshotVersion(f2h f2hVar) {
        f2hVar.getClass();
        this.lastRemoteSnapshotVersion_ = f2hVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetCount(int i) {
        this.targetCount_ = i;
    }

    @Override // p000.ymg
    public long getHighestListenSequenceNumber() {
        return this.highestListenSequenceNumber_;
    }

    @Override // p000.ymg
    public int getHighestTargetId() {
        return this.highestTargetId_;
    }

    @Override // p000.ymg
    public f2h getLastRemoteSnapshotVersion() {
        f2h f2hVar = this.lastRemoteSnapshotVersion_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.ymg
    public int getTargetCount() {
        return this.targetCount_;
    }

    @Override // p000.ymg
    public boolean hasLastRemoteSnapshotVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C15200a c15200a = null;
        switch (C15200a.f98548a[enumC13830i.ordinal()]) {
            case 1:
                return new xmg();
            case 2:
                return new C15201b(c15200a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003ဉ\u0000\u0004\u0004", new Object[]{"bitField0_", "highestTargetId_", "highestListenSequenceNumber_", "lastRemoteSnapshotVersion_", "targetCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<xmg> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (xmg.class) {
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

    public static C15201b newBuilder(xmg xmgVar) {
        return DEFAULT_INSTANCE.m23739o(xmgVar);
    }

    public static xmg parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (xmg) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static xmg parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (xmg) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static xmg parseFrom(vj1 vj1Var) throws ce8 {
        return (xmg) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static xmg parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (xmg) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static xmg parseFrom(byte[] bArr) throws ce8 {
        return (xmg) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static xmg parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (xmg) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static xmg parseFrom(InputStream inputStream) throws IOException {
        return (xmg) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static xmg parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (xmg) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static xmg parseFrom(f72 f72Var) throws IOException {
        return (xmg) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static xmg parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (xmg) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
