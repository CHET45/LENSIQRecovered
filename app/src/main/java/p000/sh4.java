package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.nh4;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class sh4 extends v27<sh4, C12579b> implements th4 {
    private static final sh4 DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile uhc<sh4> PARSER = null;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    public static final int TARGET_IDS_FIELD_NUMBER = 5;
    private int bitField0_;
    private nh4 document_;
    private int targetIdsMemoizedSerializedSize = -1;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private w98.InterfaceC14501h targetIds_ = v27.m23720v();
    private w98.InterfaceC14501h removedTargetIds_ = v27.m23720v();

    /* JADX INFO: renamed from: sh4$a */
    public static /* synthetic */ class C12578a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f81771a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f81771a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81771a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81771a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81771a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f81771a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f81771a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f81771a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: sh4$b */
    public static final class C12579b extends v27.AbstractC13823b<sh4, C12579b> implements th4 {
        public /* synthetic */ C12579b(C12578a c12578a) {
            this();
        }

        public C12579b addAllRemovedTargetIds(Iterable<? extends Integer> iterable) {
            m23743e();
            ((sh4) this.f89756b).addAllRemovedTargetIds(iterable);
            return this;
        }

        public C12579b addAllTargetIds(Iterable<? extends Integer> iterable) {
            m23743e();
            ((sh4) this.f89756b).addAllTargetIds(iterable);
            return this;
        }

        public C12579b addRemovedTargetIds(int i) {
            m23743e();
            ((sh4) this.f89756b).addRemovedTargetIds(i);
            return this;
        }

        public C12579b addTargetIds(int i) {
            m23743e();
            ((sh4) this.f89756b).addTargetIds(i);
            return this;
        }

        public C12579b clearDocument() {
            m23743e();
            ((sh4) this.f89756b).clearDocument();
            return this;
        }

        public C12579b clearRemovedTargetIds() {
            m23743e();
            ((sh4) this.f89756b).clearRemovedTargetIds();
            return this;
        }

        public C12579b clearTargetIds() {
            m23743e();
            ((sh4) this.f89756b).clearTargetIds();
            return this;
        }

        @Override // p000.th4
        public nh4 getDocument() {
            return ((sh4) this.f89756b).getDocument();
        }

        @Override // p000.th4
        public int getRemovedTargetIds(int i) {
            return ((sh4) this.f89756b).getRemovedTargetIds(i);
        }

        @Override // p000.th4
        public int getRemovedTargetIdsCount() {
            return ((sh4) this.f89756b).getRemovedTargetIdsCount();
        }

        @Override // p000.th4
        public List<Integer> getRemovedTargetIdsList() {
            return Collections.unmodifiableList(((sh4) this.f89756b).getRemovedTargetIdsList());
        }

        @Override // p000.th4
        public int getTargetIds(int i) {
            return ((sh4) this.f89756b).getTargetIds(i);
        }

        @Override // p000.th4
        public int getTargetIdsCount() {
            return ((sh4) this.f89756b).getTargetIdsCount();
        }

        @Override // p000.th4
        public List<Integer> getTargetIdsList() {
            return Collections.unmodifiableList(((sh4) this.f89756b).getTargetIdsList());
        }

        @Override // p000.th4
        public boolean hasDocument() {
            return ((sh4) this.f89756b).hasDocument();
        }

        public C12579b mergeDocument(nh4 nh4Var) {
            m23743e();
            ((sh4) this.f89756b).mergeDocument(nh4Var);
            return this;
        }

        public C12579b setDocument(nh4 nh4Var) {
            m23743e();
            ((sh4) this.f89756b).setDocument(nh4Var);
            return this;
        }

        public C12579b setRemovedTargetIds(int i, int i2) {
            m23743e();
            ((sh4) this.f89756b).setRemovedTargetIds(i, i2);
            return this;
        }

        public C12579b setTargetIds(int i, int i2) {
            m23743e();
            ((sh4) this.f89756b).setTargetIds(i, i2);
            return this;
        }

        private C12579b() {
            super(sh4.DEFAULT_INSTANCE);
        }

        public C12579b setDocument(nh4.C9874b c9874b) {
            m23743e();
            ((sh4) this.f89756b).setDocument(c9874b.build());
            return this;
        }
    }

    static {
        sh4 sh4Var = new sh4();
        DEFAULT_INSTANCE = sh4Var;
        v27.m23715h0(sh4.class, sh4Var);
    }

    private sh4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRemovedTargetIds(Iterable<? extends Integer> iterable) {
        ensureRemovedTargetIdsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.removedTargetIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTargetIds(Iterable<? extends Integer> iterable) {
        ensureTargetIdsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.targetIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRemovedTargetIds(int i) {
        ensureRemovedTargetIdsIsMutable();
        this.removedTargetIds_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTargetIds(int i) {
        ensureTargetIdsIsMutable();
        this.targetIds_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        this.document_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemovedTargetIds() {
        this.removedTargetIds_ = v27.m23720v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetIds() {
        this.targetIds_ = v27.m23720v();
    }

    private void ensureRemovedTargetIdsIsMutable() {
        w98.InterfaceC14501h interfaceC14501h = this.removedTargetIds_;
        if (interfaceC14501h.isModifiable()) {
            return;
        }
        this.removedTargetIds_ = v27.m23696N(interfaceC14501h);
    }

    private void ensureTargetIdsIsMutable() {
        w98.InterfaceC14501h interfaceC14501h = this.targetIds_;
        if (interfaceC14501h.isModifiable()) {
            return;
        }
        this.targetIds_ = v27.m23696N(interfaceC14501h);
    }

    public static sh4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocument(nh4 nh4Var) {
        nh4Var.getClass();
        nh4 nh4Var2 = this.document_;
        if (nh4Var2 == null || nh4Var2 == nh4.getDefaultInstance()) {
            this.document_ = nh4Var;
        } else {
            this.document_ = nh4.newBuilder(this.document_).mergeFrom(nh4Var).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C12579b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static sh4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (sh4) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static sh4 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (sh4) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<sh4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(nh4 nh4Var) {
        nh4Var.getClass();
        this.document_ = nh4Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemovedTargetIds(int i, int i2) {
        ensureRemovedTargetIdsIsMutable();
        this.removedTargetIds_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetIds(int i, int i2) {
        ensureTargetIdsIsMutable();
        this.targetIds_.setInt(i, i2);
    }

    @Override // p000.th4
    public nh4 getDocument() {
        nh4 nh4Var = this.document_;
        return nh4Var == null ? nh4.getDefaultInstance() : nh4Var;
    }

    @Override // p000.th4
    public int getRemovedTargetIds(int i) {
        return this.removedTargetIds_.getInt(i);
    }

    @Override // p000.th4
    public int getRemovedTargetIdsCount() {
        return this.removedTargetIds_.size();
    }

    @Override // p000.th4
    public List<Integer> getRemovedTargetIdsList() {
        return this.removedTargetIds_;
    }

    @Override // p000.th4
    public int getTargetIds(int i) {
        return this.targetIds_.getInt(i);
    }

    @Override // p000.th4
    public int getTargetIdsCount() {
        return this.targetIds_.size();
    }

    @Override // p000.th4
    public List<Integer> getTargetIdsList() {
        return this.targetIds_;
    }

    @Override // p000.th4
    public boolean hasDocument() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C12578a c12578a = null;
        switch (C12578a.f81771a[enumC13830i.ordinal()]) {
            case 1:
                return new sh4();
            case 2:
                return new C12579b(c12578a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0005'\u0006'", new Object[]{"bitField0_", "document_", "targetIds_", "removedTargetIds_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<sh4> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (sh4.class) {
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

    public static C12579b newBuilder(sh4 sh4Var) {
        return DEFAULT_INSTANCE.m23739o(sh4Var);
    }

    public static sh4 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (sh4) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static sh4 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (sh4) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static sh4 parseFrom(vj1 vj1Var) throws ce8 {
        return (sh4) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static sh4 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (sh4) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static sh4 parseFrom(byte[] bArr) throws ce8 {
        return (sh4) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static sh4 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (sh4) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static sh4 parseFrom(InputStream inputStream) throws IOException {
        return (sh4) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static sh4 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (sh4) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static sh4 parseFrom(f72 f72Var) throws IOException {
        return (sh4) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static sh4 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (sh4) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
