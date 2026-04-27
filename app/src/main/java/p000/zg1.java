package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.f2h;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class zg1 extends v27<zg1, C16119b> implements bh1 {
    public static final int CREATE_TIME_FIELD_NUMBER = 2;
    private static final zg1 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile uhc<zg1> PARSER = null;
    public static final int TOTAL_BYTES_FIELD_NUMBER = 5;
    public static final int TOTAL_DOCUMENTS_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private f2h createTime_;
    private String id_ = "";
    private long totalBytes_;
    private int totalDocuments_;
    private int version_;

    /* JADX INFO: renamed from: zg1$a */
    public static /* synthetic */ class C16118a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105036a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f105036a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105036a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105036a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105036a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f105036a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f105036a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f105036a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: zg1$b */
    public static final class C16119b extends v27.AbstractC13823b<zg1, C16119b> implements bh1 {
        public /* synthetic */ C16119b(C16118a c16118a) {
            this();
        }

        public C16119b clearCreateTime() {
            m23743e();
            ((zg1) this.f89756b).clearCreateTime();
            return this;
        }

        public C16119b clearId() {
            m23743e();
            ((zg1) this.f89756b).clearId();
            return this;
        }

        public C16119b clearTotalBytes() {
            m23743e();
            ((zg1) this.f89756b).clearTotalBytes();
            return this;
        }

        public C16119b clearTotalDocuments() {
            m23743e();
            ((zg1) this.f89756b).clearTotalDocuments();
            return this;
        }

        public C16119b clearVersion() {
            m23743e();
            ((zg1) this.f89756b).clearVersion();
            return this;
        }

        @Override // p000.bh1
        public f2h getCreateTime() {
            return ((zg1) this.f89756b).getCreateTime();
        }

        @Override // p000.bh1
        public String getId() {
            return ((zg1) this.f89756b).getId();
        }

        @Override // p000.bh1
        public vj1 getIdBytes() {
            return ((zg1) this.f89756b).getIdBytes();
        }

        @Override // p000.bh1
        public long getTotalBytes() {
            return ((zg1) this.f89756b).getTotalBytes();
        }

        @Override // p000.bh1
        public int getTotalDocuments() {
            return ((zg1) this.f89756b).getTotalDocuments();
        }

        @Override // p000.bh1
        public int getVersion() {
            return ((zg1) this.f89756b).getVersion();
        }

        @Override // p000.bh1
        public boolean hasCreateTime() {
            return ((zg1) this.f89756b).hasCreateTime();
        }

        public C16119b mergeCreateTime(f2h f2hVar) {
            m23743e();
            ((zg1) this.f89756b).mergeCreateTime(f2hVar);
            return this;
        }

        public C16119b setCreateTime(f2h f2hVar) {
            m23743e();
            ((zg1) this.f89756b).setCreateTime(f2hVar);
            return this;
        }

        public C16119b setId(String str) {
            m23743e();
            ((zg1) this.f89756b).setId(str);
            return this;
        }

        public C16119b setIdBytes(vj1 vj1Var) {
            m23743e();
            ((zg1) this.f89756b).setIdBytes(vj1Var);
            return this;
        }

        public C16119b setTotalBytes(long j) {
            m23743e();
            ((zg1) this.f89756b).setTotalBytes(j);
            return this;
        }

        public C16119b setTotalDocuments(int i) {
            m23743e();
            ((zg1) this.f89756b).setTotalDocuments(i);
            return this;
        }

        public C16119b setVersion(int i) {
            m23743e();
            ((zg1) this.f89756b).setVersion(i);
            return this;
        }

        private C16119b() {
            super(zg1.DEFAULT_INSTANCE);
        }

        public C16119b setCreateTime(f2h.C5567b c5567b) {
            m23743e();
            ((zg1) this.f89756b).setCreateTime(c5567b.build());
            return this;
        }
    }

    static {
        zg1 zg1Var = new zg1();
        DEFAULT_INSTANCE = zg1Var;
        v27.m23715h0(zg1.class, zg1Var);
    }

    private zg1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateTime() {
        this.createTime_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalBytes() {
        this.totalBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalDocuments() {
        this.totalDocuments_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static zg1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreateTime(f2h f2hVar) {
        f2hVar.getClass();
        f2h f2hVar2 = this.createTime_;
        if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
            this.createTime_ = f2hVar;
        } else {
            this.createTime_ = f2h.newBuilder(this.createTime_).mergeFrom(f2hVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C16119b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static zg1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (zg1) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static zg1 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (zg1) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<zg1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateTime(f2h f2hVar) {
        f2hVar.getClass();
        this.createTime_ = f2hVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.id_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalBytes(long j) {
        this.totalBytes_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalDocuments(int i) {
        this.totalDocuments_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    @Override // p000.bh1
    public f2h getCreateTime() {
        f2h f2hVar = this.createTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.bh1
    public String getId() {
        return this.id_;
    }

    @Override // p000.bh1
    public vj1 getIdBytes() {
        return vj1.copyFromUtf8(this.id_);
    }

    @Override // p000.bh1
    public long getTotalBytes() {
        return this.totalBytes_;
    }

    @Override // p000.bh1
    public int getTotalDocuments() {
        return this.totalDocuments_;
    }

    @Override // p000.bh1
    public int getVersion() {
        return this.version_;
    }

    @Override // p000.bh1
    public boolean hasCreateTime() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C16118a c16118a = null;
        switch (C16118a.f105036a[enumC13830i.ordinal()]) {
            case 1:
                return new zg1();
            case 2:
                return new C16119b(c16118a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u000b\u0004\u000b\u0005\u0003", new Object[]{"bitField0_", "id_", "createTime_", "version_", "totalDocuments_", "totalBytes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<zg1> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (zg1.class) {
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

    public static C16119b newBuilder(zg1 zg1Var) {
        return DEFAULT_INSTANCE.m23739o(zg1Var);
    }

    public static zg1 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (zg1) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static zg1 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (zg1) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static zg1 parseFrom(vj1 vj1Var) throws ce8 {
        return (zg1) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static zg1 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (zg1) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static zg1 parseFrom(byte[] bArr) throws ce8 {
        return (zg1) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static zg1 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (zg1) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static zg1 parseFrom(InputStream inputStream) throws IOException {
        return (zg1) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static zg1 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (zg1) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static zg1 parseFrom(f72 f72Var) throws IOException {
        return (zg1) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static zg1 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (zg1) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
