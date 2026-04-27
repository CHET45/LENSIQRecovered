package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.f2h;
import p000.v27;
import p000.w98;
import p000.yri;

/* JADX INFO: loaded from: classes5.dex */
public final class asi extends v27<asi, C1599b> implements bsi {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final asi DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile uhc<asi> PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int batchId_;
    private int bitField0_;
    private f2h localWriteTime_;
    private w98.InterfaceC14504k<yri> writes_ = v27.m23722x();
    private w98.InterfaceC14504k<yri> baseWrites_ = v27.m23722x();

    /* JADX INFO: renamed from: asi$a */
    public static /* synthetic */ class C1598a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11811a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f11811a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11811a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11811a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11811a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11811a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11811a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11811a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: asi$b */
    public static final class C1599b extends v27.AbstractC13823b<asi, C1599b> implements bsi {
        public /* synthetic */ C1599b(C1598a c1598a) {
            this();
        }

        public C1599b addAllBaseWrites(Iterable<? extends yri> iterable) {
            m23743e();
            ((asi) this.f89756b).addAllBaseWrites(iterable);
            return this;
        }

        public C1599b addAllWrites(Iterable<? extends yri> iterable) {
            m23743e();
            ((asi) this.f89756b).addAllWrites(iterable);
            return this;
        }

        public C1599b addBaseWrites(yri yriVar) {
            m23743e();
            ((asi) this.f89756b).addBaseWrites(yriVar);
            return this;
        }

        public C1599b addWrites(yri yriVar) {
            m23743e();
            ((asi) this.f89756b).addWrites(yriVar);
            return this;
        }

        public C1599b clearBaseWrites() {
            m23743e();
            ((asi) this.f89756b).clearBaseWrites();
            return this;
        }

        public C1599b clearBatchId() {
            m23743e();
            ((asi) this.f89756b).clearBatchId();
            return this;
        }

        public C1599b clearLocalWriteTime() {
            m23743e();
            ((asi) this.f89756b).clearLocalWriteTime();
            return this;
        }

        public C1599b clearWrites() {
            m23743e();
            ((asi) this.f89756b).clearWrites();
            return this;
        }

        @Override // p000.bsi
        public yri getBaseWrites(int i) {
            return ((asi) this.f89756b).getBaseWrites(i);
        }

        @Override // p000.bsi
        public int getBaseWritesCount() {
            return ((asi) this.f89756b).getBaseWritesCount();
        }

        @Override // p000.bsi
        public List<yri> getBaseWritesList() {
            return Collections.unmodifiableList(((asi) this.f89756b).getBaseWritesList());
        }

        @Override // p000.bsi
        public int getBatchId() {
            return ((asi) this.f89756b).getBatchId();
        }

        @Override // p000.bsi
        public f2h getLocalWriteTime() {
            return ((asi) this.f89756b).getLocalWriteTime();
        }

        @Override // p000.bsi
        public yri getWrites(int i) {
            return ((asi) this.f89756b).getWrites(i);
        }

        @Override // p000.bsi
        public int getWritesCount() {
            return ((asi) this.f89756b).getWritesCount();
        }

        @Override // p000.bsi
        public List<yri> getWritesList() {
            return Collections.unmodifiableList(((asi) this.f89756b).getWritesList());
        }

        @Override // p000.bsi
        public boolean hasLocalWriteTime() {
            return ((asi) this.f89756b).hasLocalWriteTime();
        }

        public C1599b mergeLocalWriteTime(f2h f2hVar) {
            m23743e();
            ((asi) this.f89756b).mergeLocalWriteTime(f2hVar);
            return this;
        }

        public C1599b removeBaseWrites(int i) {
            m23743e();
            ((asi) this.f89756b).removeBaseWrites(i);
            return this;
        }

        public C1599b removeWrites(int i) {
            m23743e();
            ((asi) this.f89756b).removeWrites(i);
            return this;
        }

        public C1599b setBaseWrites(int i, yri yriVar) {
            m23743e();
            ((asi) this.f89756b).setBaseWrites(i, yriVar);
            return this;
        }

        public C1599b setBatchId(int i) {
            m23743e();
            ((asi) this.f89756b).setBatchId(i);
            return this;
        }

        public C1599b setLocalWriteTime(f2h f2hVar) {
            m23743e();
            ((asi) this.f89756b).setLocalWriteTime(f2hVar);
            return this;
        }

        public C1599b setWrites(int i, yri yriVar) {
            m23743e();
            ((asi) this.f89756b).setWrites(i, yriVar);
            return this;
        }

        private C1599b() {
            super(asi.DEFAULT_INSTANCE);
        }

        public C1599b addBaseWrites(int i, yri yriVar) {
            m23743e();
            ((asi) this.f89756b).addBaseWrites(i, yriVar);
            return this;
        }

        public C1599b addWrites(int i, yri yriVar) {
            m23743e();
            ((asi) this.f89756b).addWrites(i, yriVar);
            return this;
        }

        public C1599b setBaseWrites(int i, yri.C15790b c15790b) {
            m23743e();
            ((asi) this.f89756b).setBaseWrites(i, c15790b.build());
            return this;
        }

        public C1599b setLocalWriteTime(f2h.C5567b c5567b) {
            m23743e();
            ((asi) this.f89756b).setLocalWriteTime(c5567b.build());
            return this;
        }

        public C1599b setWrites(int i, yri.C15790b c15790b) {
            m23743e();
            ((asi) this.f89756b).setWrites(i, c15790b.build());
            return this;
        }

        public C1599b addBaseWrites(yri.C15790b c15790b) {
            m23743e();
            ((asi) this.f89756b).addBaseWrites(c15790b.build());
            return this;
        }

        public C1599b addWrites(yri.C15790b c15790b) {
            m23743e();
            ((asi) this.f89756b).addWrites(c15790b.build());
            return this;
        }

        public C1599b addBaseWrites(int i, yri.C15790b c15790b) {
            m23743e();
            ((asi) this.f89756b).addBaseWrites(i, c15790b.build());
            return this;
        }

        public C1599b addWrites(int i, yri.C15790b c15790b) {
            m23743e();
            ((asi) this.f89756b).addWrites(i, c15790b.build());
            return this;
        }
    }

    static {
        asi asiVar = new asi();
        DEFAULT_INSTANCE = asiVar;
        v27.m23715h0(asi.class, asiVar);
    }

    private asi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBaseWrites(Iterable<? extends yri> iterable) {
        ensureBaseWritesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.baseWrites_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWrites(Iterable<? extends yri> iterable) {
        ensureWritesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.writes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBaseWrites(yri yriVar) {
        yriVar.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.add(yriVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrites(yri yriVar) {
        yriVar.getClass();
        ensureWritesIsMutable();
        this.writes_.add(yriVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseWrites() {
        this.baseWrites_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatchId() {
        this.batchId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocalWriteTime() {
        this.localWriteTime_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWrites() {
        this.writes_ = v27.m23722x();
    }

    private void ensureBaseWritesIsMutable() {
        w98.InterfaceC14504k<yri> interfaceC14504k = this.baseWrites_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.baseWrites_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureWritesIsMutable() {
        w98.InterfaceC14504k<yri> interfaceC14504k = this.writes_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.writes_ = v27.m23698P(interfaceC14504k);
    }

    public static asi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocalWriteTime(f2h f2hVar) {
        f2hVar.getClass();
        f2h f2hVar2 = this.localWriteTime_;
        if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
            this.localWriteTime_ = f2hVar;
        } else {
            this.localWriteTime_ = f2h.newBuilder(this.localWriteTime_).mergeFrom(f2hVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C1599b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static asi parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (asi) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static asi parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (asi) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<asi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBaseWrites(int i) {
        ensureBaseWritesIsMutable();
        this.baseWrites_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWrites(int i) {
        ensureWritesIsMutable();
        this.writes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseWrites(int i, yri yriVar) {
        yriVar.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.set(i, yriVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatchId(int i) {
        this.batchId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalWriteTime(f2h f2hVar) {
        f2hVar.getClass();
        this.localWriteTime_ = f2hVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWrites(int i, yri yriVar) {
        yriVar.getClass();
        ensureWritesIsMutable();
        this.writes_.set(i, yriVar);
    }

    @Override // p000.bsi
    public yri getBaseWrites(int i) {
        return this.baseWrites_.get(i);
    }

    @Override // p000.bsi
    public int getBaseWritesCount() {
        return this.baseWrites_.size();
    }

    @Override // p000.bsi
    public List<yri> getBaseWritesList() {
        return this.baseWrites_;
    }

    public esi getBaseWritesOrBuilder(int i) {
        return this.baseWrites_.get(i);
    }

    public List<? extends esi> getBaseWritesOrBuilderList() {
        return this.baseWrites_;
    }

    @Override // p000.bsi
    public int getBatchId() {
        return this.batchId_;
    }

    @Override // p000.bsi
    public f2h getLocalWriteTime() {
        f2h f2hVar = this.localWriteTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.bsi
    public yri getWrites(int i) {
        return this.writes_.get(i);
    }

    @Override // p000.bsi
    public int getWritesCount() {
        return this.writes_.size();
    }

    @Override // p000.bsi
    public List<yri> getWritesList() {
        return this.writes_;
    }

    public esi getWritesOrBuilder(int i) {
        return this.writes_.get(i);
    }

    public List<? extends esi> getWritesOrBuilderList() {
        return this.writes_;
    }

    @Override // p000.bsi
    public boolean hasLocalWriteTime() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C1598a c1598a = null;
        switch (C1598a.f11811a[enumC13830i.ordinal()]) {
            case 1:
                return new asi();
            case 2:
                return new C1599b(c1598a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "batchId_", "writes_", yri.class, "localWriteTime_", "baseWrites_", yri.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<asi> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (asi.class) {
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

    public static C1599b newBuilder(asi asiVar) {
        return DEFAULT_INSTANCE.m23739o(asiVar);
    }

    public static asi parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (asi) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static asi parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (asi) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static asi parseFrom(vj1 vj1Var) throws ce8 {
        return (asi) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBaseWrites(int i, yri yriVar) {
        yriVar.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.add(i, yriVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrites(int i, yri yriVar) {
        yriVar.getClass();
        ensureWritesIsMutable();
        this.writes_.add(i, yriVar);
    }

    public static asi parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (asi) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static asi parseFrom(byte[] bArr) throws ce8 {
        return (asi) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static asi parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (asi) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static asi parseFrom(InputStream inputStream) throws IOException {
        return (asi) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static asi parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (asi) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static asi parseFrom(f72 f72Var) throws IOException {
        return (asi) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static asi parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (asi) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
