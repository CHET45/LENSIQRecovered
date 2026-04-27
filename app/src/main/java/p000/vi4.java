package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.f2h;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class vi4 extends v27<vi4, C14088b> implements wi4 {
    private static final vi4 DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile uhc<vi4> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private f2h readTime_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private String document_ = "";
    private w98.InterfaceC14501h removedTargetIds_ = v27.m23720v();

    /* JADX INFO: renamed from: vi4$a */
    public static /* synthetic */ class C14087a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f91234a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f91234a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91234a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91234a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91234a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f91234a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f91234a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f91234a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: vi4$b */
    public static final class C14088b extends v27.AbstractC13823b<vi4, C14088b> implements wi4 {
        public /* synthetic */ C14088b(C14087a c14087a) {
            this();
        }

        public C14088b addAllRemovedTargetIds(Iterable<? extends Integer> iterable) {
            m23743e();
            ((vi4) this.f89756b).addAllRemovedTargetIds(iterable);
            return this;
        }

        public C14088b addRemovedTargetIds(int i) {
            m23743e();
            ((vi4) this.f89756b).addRemovedTargetIds(i);
            return this;
        }

        public C14088b clearDocument() {
            m23743e();
            ((vi4) this.f89756b).clearDocument();
            return this;
        }

        public C14088b clearReadTime() {
            m23743e();
            ((vi4) this.f89756b).clearReadTime();
            return this;
        }

        public C14088b clearRemovedTargetIds() {
            m23743e();
            ((vi4) this.f89756b).clearRemovedTargetIds();
            return this;
        }

        @Override // p000.wi4
        public String getDocument() {
            return ((vi4) this.f89756b).getDocument();
        }

        @Override // p000.wi4
        public vj1 getDocumentBytes() {
            return ((vi4) this.f89756b).getDocumentBytes();
        }

        @Override // p000.wi4
        public f2h getReadTime() {
            return ((vi4) this.f89756b).getReadTime();
        }

        @Override // p000.wi4
        public int getRemovedTargetIds(int i) {
            return ((vi4) this.f89756b).getRemovedTargetIds(i);
        }

        @Override // p000.wi4
        public int getRemovedTargetIdsCount() {
            return ((vi4) this.f89756b).getRemovedTargetIdsCount();
        }

        @Override // p000.wi4
        public List<Integer> getRemovedTargetIdsList() {
            return Collections.unmodifiableList(((vi4) this.f89756b).getRemovedTargetIdsList());
        }

        @Override // p000.wi4
        public boolean hasReadTime() {
            return ((vi4) this.f89756b).hasReadTime();
        }

        public C14088b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((vi4) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C14088b setDocument(String str) {
            m23743e();
            ((vi4) this.f89756b).setDocument(str);
            return this;
        }

        public C14088b setDocumentBytes(vj1 vj1Var) {
            m23743e();
            ((vi4) this.f89756b).setDocumentBytes(vj1Var);
            return this;
        }

        public C14088b setReadTime(f2h f2hVar) {
            m23743e();
            ((vi4) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        public C14088b setRemovedTargetIds(int i, int i2) {
            m23743e();
            ((vi4) this.f89756b).setRemovedTargetIds(i, i2);
            return this;
        }

        private C14088b() {
            super(vi4.DEFAULT_INSTANCE);
        }

        public C14088b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((vi4) this.f89756b).setReadTime(c5567b.build());
            return this;
        }
    }

    static {
        vi4 vi4Var = new vi4();
        DEFAULT_INSTANCE = vi4Var;
        v27.m23715h0(vi4.class, vi4Var);
    }

    private vi4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRemovedTargetIds(Iterable<? extends Integer> iterable) {
        ensureRemovedTargetIdsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.removedTargetIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRemovedTargetIds(int i) {
        ensureRemovedTargetIdsIsMutable();
        this.removedTargetIds_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        this.document_ = getDefaultInstance().getDocument();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemovedTargetIds() {
        this.removedTargetIds_ = v27.m23720v();
    }

    private void ensureRemovedTargetIdsIsMutable() {
        w98.InterfaceC14501h interfaceC14501h = this.removedTargetIds_;
        if (interfaceC14501h.isModifiable()) {
            return;
        }
        this.removedTargetIds_ = v27.m23696N(interfaceC14501h);
    }

    public static vi4 getDefaultInstance() {
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
        this.bitField0_ |= 1;
    }

    public static C14088b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static vi4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (vi4) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static vi4 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (vi4) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<vi4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(String str) {
        str.getClass();
        this.document_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.document_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(f2h f2hVar) {
        f2hVar.getClass();
        this.readTime_ = f2hVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemovedTargetIds(int i, int i2) {
        ensureRemovedTargetIdsIsMutable();
        this.removedTargetIds_.setInt(i, i2);
    }

    @Override // p000.wi4
    public String getDocument() {
        return this.document_;
    }

    @Override // p000.wi4
    public vj1 getDocumentBytes() {
        return vj1.copyFromUtf8(this.document_);
    }

    @Override // p000.wi4
    public f2h getReadTime() {
        f2h f2hVar = this.readTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.wi4
    public int getRemovedTargetIds(int i) {
        return this.removedTargetIds_.getInt(i);
    }

    @Override // p000.wi4
    public int getRemovedTargetIdsCount() {
        return this.removedTargetIds_.size();
    }

    @Override // p000.wi4
    public List<Integer> getRemovedTargetIdsList() {
        return this.removedTargetIds_;
    }

    @Override // p000.wi4
    public boolean hasReadTime() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C14087a c14087a = null;
        switch (C14087a.f91234a[enumC13830i.ordinal()]) {
            case 1:
                return new vi4();
            case 2:
                return new C14088b(c14087a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0002'\u0004ဉ\u0000", new Object[]{"bitField0_", "document_", "removedTargetIds_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<vi4> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (vi4.class) {
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

    public static C14088b newBuilder(vi4 vi4Var) {
        return DEFAULT_INSTANCE.m23739o(vi4Var);
    }

    public static vi4 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (vi4) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static vi4 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (vi4) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static vi4 parseFrom(vj1 vj1Var) throws ce8 {
        return (vi4) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static vi4 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (vi4) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static vi4 parseFrom(byte[] bArr) throws ce8 {
        return (vi4) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static vi4 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (vi4) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static vi4 parseFrom(InputStream inputStream) throws IOException {
        return (vi4) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static vi4 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (vi4) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static vi4 parseFrom(f72 f72Var) throws IOException {
        return (vi4) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static vi4 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (vi4) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
