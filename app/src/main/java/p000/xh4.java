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
public final class xh4 extends v27<xh4, C15071b> implements yh4 {
    private static final xh4 DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile uhc<xh4> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    private int bitField0_;
    private f2h readTime_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private String document_ = "";
    private w98.InterfaceC14501h removedTargetIds_ = v27.m23720v();

    /* JADX INFO: renamed from: xh4$a */
    public static /* synthetic */ class C15070a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f97821a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f97821a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f97821a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f97821a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f97821a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f97821a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f97821a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f97821a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: xh4$b */
    public static final class C15071b extends v27.AbstractC13823b<xh4, C15071b> implements yh4 {
        public /* synthetic */ C15071b(C15070a c15070a) {
            this();
        }

        public C15071b addAllRemovedTargetIds(Iterable<? extends Integer> iterable) {
            m23743e();
            ((xh4) this.f89756b).addAllRemovedTargetIds(iterable);
            return this;
        }

        public C15071b addRemovedTargetIds(int i) {
            m23743e();
            ((xh4) this.f89756b).addRemovedTargetIds(i);
            return this;
        }

        public C15071b clearDocument() {
            m23743e();
            ((xh4) this.f89756b).clearDocument();
            return this;
        }

        public C15071b clearReadTime() {
            m23743e();
            ((xh4) this.f89756b).clearReadTime();
            return this;
        }

        public C15071b clearRemovedTargetIds() {
            m23743e();
            ((xh4) this.f89756b).clearRemovedTargetIds();
            return this;
        }

        @Override // p000.yh4
        public String getDocument() {
            return ((xh4) this.f89756b).getDocument();
        }

        @Override // p000.yh4
        public vj1 getDocumentBytes() {
            return ((xh4) this.f89756b).getDocumentBytes();
        }

        @Override // p000.yh4
        public f2h getReadTime() {
            return ((xh4) this.f89756b).getReadTime();
        }

        @Override // p000.yh4
        public int getRemovedTargetIds(int i) {
            return ((xh4) this.f89756b).getRemovedTargetIds(i);
        }

        @Override // p000.yh4
        public int getRemovedTargetIdsCount() {
            return ((xh4) this.f89756b).getRemovedTargetIdsCount();
        }

        @Override // p000.yh4
        public List<Integer> getRemovedTargetIdsList() {
            return Collections.unmodifiableList(((xh4) this.f89756b).getRemovedTargetIdsList());
        }

        @Override // p000.yh4
        public boolean hasReadTime() {
            return ((xh4) this.f89756b).hasReadTime();
        }

        public C15071b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((xh4) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C15071b setDocument(String str) {
            m23743e();
            ((xh4) this.f89756b).setDocument(str);
            return this;
        }

        public C15071b setDocumentBytes(vj1 vj1Var) {
            m23743e();
            ((xh4) this.f89756b).setDocumentBytes(vj1Var);
            return this;
        }

        public C15071b setReadTime(f2h f2hVar) {
            m23743e();
            ((xh4) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        public C15071b setRemovedTargetIds(int i, int i2) {
            m23743e();
            ((xh4) this.f89756b).setRemovedTargetIds(i, i2);
            return this;
        }

        private C15071b() {
            super(xh4.DEFAULT_INSTANCE);
        }

        public C15071b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((xh4) this.f89756b).setReadTime(c5567b.build());
            return this;
        }
    }

    static {
        xh4 xh4Var = new xh4();
        DEFAULT_INSTANCE = xh4Var;
        v27.m23715h0(xh4.class, xh4Var);
    }

    private xh4() {
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

    public static xh4 getDefaultInstance() {
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

    public static C15071b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static xh4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (xh4) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static xh4 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (xh4) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<xh4> parser() {
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

    @Override // p000.yh4
    public String getDocument() {
        return this.document_;
    }

    @Override // p000.yh4
    public vj1 getDocumentBytes() {
        return vj1.copyFromUtf8(this.document_);
    }

    @Override // p000.yh4
    public f2h getReadTime() {
        f2h f2hVar = this.readTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.yh4
    public int getRemovedTargetIds(int i) {
        return this.removedTargetIds_.getInt(i);
    }

    @Override // p000.yh4
    public int getRemovedTargetIdsCount() {
        return this.removedTargetIds_.size();
    }

    @Override // p000.yh4
    public List<Integer> getRemovedTargetIdsList() {
        return this.removedTargetIds_;
    }

    @Override // p000.yh4
    public boolean hasReadTime() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C15070a c15070a = null;
        switch (C15070a.f97821a[enumC13830i.ordinal()]) {
            case 1:
                return new xh4();
            case 2:
                return new C15071b(c15070a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001Ȉ\u0004ဉ\u0000\u0006'", new Object[]{"bitField0_", "document_", "readTime_", "removedTargetIds_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<xh4> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (xh4.class) {
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

    public static C15071b newBuilder(xh4 xh4Var) {
        return DEFAULT_INSTANCE.m23739o(xh4Var);
    }

    public static xh4 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (xh4) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static xh4 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (xh4) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static xh4 parseFrom(vj1 vj1Var) throws ce8 {
        return (xh4) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static xh4 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (xh4) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static xh4 parseFrom(byte[] bArr) throws ce8 {
        return (xh4) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static xh4 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (xh4) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static xh4 parseFrom(InputStream inputStream) throws IOException {
        return (xh4) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static xh4 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (xh4) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static xh4 parseFrom(f72 f72Var) throws IOException {
        return (xh4) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static xh4 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (xh4) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
