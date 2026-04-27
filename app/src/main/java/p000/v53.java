package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.di4;
import p000.nh4;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class v53 extends v27<v53, C13870b> implements w53 {
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final v53 DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 4;
    public static final int DOCUMENT_ID_FIELD_NUMBER = 3;
    public static final int MASK_FIELD_NUMBER = 5;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile uhc<v53> PARSER;
    private int bitField0_;
    private nh4 document_;
    private di4 mask_;
    private String parent_ = "";
    private String collectionId_ = "";
    private String documentId_ = "";

    /* JADX INFO: renamed from: v53$a */
    public static /* synthetic */ class C13869a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f89994a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f89994a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89994a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89994a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f89994a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f89994a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f89994a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f89994a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: v53$b */
    public static final class C13870b extends v27.AbstractC13823b<v53, C13870b> implements w53 {
        public /* synthetic */ C13870b(C13869a c13869a) {
            this();
        }

        public C13870b clearCollectionId() {
            m23743e();
            ((v53) this.f89756b).clearCollectionId();
            return this;
        }

        public C13870b clearDocument() {
            m23743e();
            ((v53) this.f89756b).clearDocument();
            return this;
        }

        public C13870b clearDocumentId() {
            m23743e();
            ((v53) this.f89756b).clearDocumentId();
            return this;
        }

        public C13870b clearMask() {
            m23743e();
            ((v53) this.f89756b).clearMask();
            return this;
        }

        public C13870b clearParent() {
            m23743e();
            ((v53) this.f89756b).clearParent();
            return this;
        }

        @Override // p000.w53
        public String getCollectionId() {
            return ((v53) this.f89756b).getCollectionId();
        }

        @Override // p000.w53
        public vj1 getCollectionIdBytes() {
            return ((v53) this.f89756b).getCollectionIdBytes();
        }

        @Override // p000.w53
        public nh4 getDocument() {
            return ((v53) this.f89756b).getDocument();
        }

        @Override // p000.w53
        public String getDocumentId() {
            return ((v53) this.f89756b).getDocumentId();
        }

        @Override // p000.w53
        public vj1 getDocumentIdBytes() {
            return ((v53) this.f89756b).getDocumentIdBytes();
        }

        @Override // p000.w53
        public di4 getMask() {
            return ((v53) this.f89756b).getMask();
        }

        @Override // p000.w53
        public String getParent() {
            return ((v53) this.f89756b).getParent();
        }

        @Override // p000.w53
        public vj1 getParentBytes() {
            return ((v53) this.f89756b).getParentBytes();
        }

        @Override // p000.w53
        public boolean hasDocument() {
            return ((v53) this.f89756b).hasDocument();
        }

        @Override // p000.w53
        public boolean hasMask() {
            return ((v53) this.f89756b).hasMask();
        }

        public C13870b mergeDocument(nh4 nh4Var) {
            m23743e();
            ((v53) this.f89756b).mergeDocument(nh4Var);
            return this;
        }

        public C13870b mergeMask(di4 di4Var) {
            m23743e();
            ((v53) this.f89756b).mergeMask(di4Var);
            return this;
        }

        public C13870b setCollectionId(String str) {
            m23743e();
            ((v53) this.f89756b).setCollectionId(str);
            return this;
        }

        public C13870b setCollectionIdBytes(vj1 vj1Var) {
            m23743e();
            ((v53) this.f89756b).setCollectionIdBytes(vj1Var);
            return this;
        }

        public C13870b setDocument(nh4 nh4Var) {
            m23743e();
            ((v53) this.f89756b).setDocument(nh4Var);
            return this;
        }

        public C13870b setDocumentId(String str) {
            m23743e();
            ((v53) this.f89756b).setDocumentId(str);
            return this;
        }

        public C13870b setDocumentIdBytes(vj1 vj1Var) {
            m23743e();
            ((v53) this.f89756b).setDocumentIdBytes(vj1Var);
            return this;
        }

        public C13870b setMask(di4 di4Var) {
            m23743e();
            ((v53) this.f89756b).setMask(di4Var);
            return this;
        }

        public C13870b setParent(String str) {
            m23743e();
            ((v53) this.f89756b).setParent(str);
            return this;
        }

        public C13870b setParentBytes(vj1 vj1Var) {
            m23743e();
            ((v53) this.f89756b).setParentBytes(vj1Var);
            return this;
        }

        private C13870b() {
            super(v53.DEFAULT_INSTANCE);
        }

        public C13870b setDocument(nh4.C9874b c9874b) {
            m23743e();
            ((v53) this.f89756b).setDocument(c9874b.build());
            return this;
        }

        public C13870b setMask(di4.C4792b c4792b) {
            m23743e();
            ((v53) this.f89756b).setMask(c4792b.build());
            return this;
        }
    }

    static {
        v53 v53Var = new v53();
        DEFAULT_INSTANCE = v53Var;
        v27.m23715h0(v53.class, v53Var);
    }

    private v53() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectionId() {
        this.collectionId_ = getDefaultInstance().getCollectionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        this.document_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentId() {
        this.documentId_ = getDefaultInstance().getDocumentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMask() {
        this.mask_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParent() {
        this.parent_ = getDefaultInstance().getParent();
    }

    public static v53 getDefaultInstance() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMask(di4 di4Var) {
        di4Var.getClass();
        di4 di4Var2 = this.mask_;
        if (di4Var2 == null || di4Var2 == di4.getDefaultInstance()) {
            this.mask_ = di4Var;
        } else {
            this.mask_ = di4.newBuilder(this.mask_).mergeFrom(di4Var).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C13870b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static v53 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (v53) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static v53 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (v53) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<v53> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionId(String str) {
        str.getClass();
        this.collectionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionIdBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.collectionId_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(nh4 nh4Var) {
        nh4Var.getClass();
        this.document_ = nh4Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentId(String str) {
        str.getClass();
        this.documentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentIdBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.documentId_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMask(di4 di4Var) {
        di4Var.getClass();
        this.mask_ = di4Var;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParent(String str) {
        str.getClass();
        this.parent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.parent_ = vj1Var.toStringUtf8();
    }

    @Override // p000.w53
    public String getCollectionId() {
        return this.collectionId_;
    }

    @Override // p000.w53
    public vj1 getCollectionIdBytes() {
        return vj1.copyFromUtf8(this.collectionId_);
    }

    @Override // p000.w53
    public nh4 getDocument() {
        nh4 nh4Var = this.document_;
        return nh4Var == null ? nh4.getDefaultInstance() : nh4Var;
    }

    @Override // p000.w53
    public String getDocumentId() {
        return this.documentId_;
    }

    @Override // p000.w53
    public vj1 getDocumentIdBytes() {
        return vj1.copyFromUtf8(this.documentId_);
    }

    @Override // p000.w53
    public di4 getMask() {
        di4 di4Var = this.mask_;
        return di4Var == null ? di4.getDefaultInstance() : di4Var;
    }

    @Override // p000.w53
    public String getParent() {
        return this.parent_;
    }

    @Override // p000.w53
    public vj1 getParentBytes() {
        return vj1.copyFromUtf8(this.parent_);
    }

    @Override // p000.w53
    public boolean hasDocument() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.w53
    public boolean hasMask() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C13869a c13869a = null;
        switch (C13869a.f89994a[enumC13830i.ordinal()]) {
            case 1:
                return new v53();
            case 2:
                return new C13870b(c13869a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "parent_", "collectionId_", "documentId_", "document_", "mask_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<v53> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (v53.class) {
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

    public static C13870b newBuilder(v53 v53Var) {
        return DEFAULT_INSTANCE.m23739o(v53Var);
    }

    public static v53 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (v53) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static v53 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (v53) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static v53 parseFrom(vj1 vj1Var) throws ce8 {
        return (v53) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static v53 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (v53) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static v53 parseFrom(byte[] bArr) throws ce8 {
        return (v53) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static v53 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (v53) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static v53 parseFrom(InputStream inputStream) throws IOException {
        return (v53) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static v53 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (v53) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static v53 parseFrom(f72 f72Var) throws IOException {
        return (v53) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static v53 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (v53) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
