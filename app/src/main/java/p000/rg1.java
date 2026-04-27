package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.b9b;
import p000.mh1;
import p000.nh4;
import p000.v27;
import p000.zg1;

/* JADX INFO: loaded from: classes5.dex */
public final class rg1 extends v27<rg1, C12070b> implements tg1 {
    private static final rg1 DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 4;
    public static final int DOCUMENT_METADATA_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 1;
    public static final int NAMED_QUERY_FIELD_NUMBER = 2;
    private static volatile uhc<rg1> PARSER;
    private int elementTypeCase_ = 0;
    private Object elementType_;

    /* JADX INFO: renamed from: rg1$a */
    public static /* synthetic */ class C12069a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78186a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f78186a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78186a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78186a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78186a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78186a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f78186a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f78186a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: rg1$b */
    public static final class C12070b extends v27.AbstractC13823b<rg1, C12070b> implements tg1 {
        public /* synthetic */ C12070b(C12069a c12069a) {
            this();
        }

        public C12070b clearDocument() {
            m23743e();
            ((rg1) this.f89756b).clearDocument();
            return this;
        }

        public C12070b clearDocumentMetadata() {
            m23743e();
            ((rg1) this.f89756b).clearDocumentMetadata();
            return this;
        }

        public C12070b clearElementType() {
            m23743e();
            ((rg1) this.f89756b).clearElementType();
            return this;
        }

        public C12070b clearMetadata() {
            m23743e();
            ((rg1) this.f89756b).clearMetadata();
            return this;
        }

        public C12070b clearNamedQuery() {
            m23743e();
            ((rg1) this.f89756b).clearNamedQuery();
            return this;
        }

        @Override // p000.tg1
        public nh4 getDocument() {
            return ((rg1) this.f89756b).getDocument();
        }

        @Override // p000.tg1
        public mh1 getDocumentMetadata() {
            return ((rg1) this.f89756b).getDocumentMetadata();
        }

        @Override // p000.tg1
        public EnumC12071c getElementTypeCase() {
            return ((rg1) this.f89756b).getElementTypeCase();
        }

        @Override // p000.tg1
        public zg1 getMetadata() {
            return ((rg1) this.f89756b).getMetadata();
        }

        @Override // p000.tg1
        public b9b getNamedQuery() {
            return ((rg1) this.f89756b).getNamedQuery();
        }

        @Override // p000.tg1
        public boolean hasDocument() {
            return ((rg1) this.f89756b).hasDocument();
        }

        @Override // p000.tg1
        public boolean hasDocumentMetadata() {
            return ((rg1) this.f89756b).hasDocumentMetadata();
        }

        @Override // p000.tg1
        public boolean hasMetadata() {
            return ((rg1) this.f89756b).hasMetadata();
        }

        @Override // p000.tg1
        public boolean hasNamedQuery() {
            return ((rg1) this.f89756b).hasNamedQuery();
        }

        public C12070b mergeDocument(nh4 nh4Var) {
            m23743e();
            ((rg1) this.f89756b).mergeDocument(nh4Var);
            return this;
        }

        public C12070b mergeDocumentMetadata(mh1 mh1Var) {
            m23743e();
            ((rg1) this.f89756b).mergeDocumentMetadata(mh1Var);
            return this;
        }

        public C12070b mergeMetadata(zg1 zg1Var) {
            m23743e();
            ((rg1) this.f89756b).mergeMetadata(zg1Var);
            return this;
        }

        public C12070b mergeNamedQuery(b9b b9bVar) {
            m23743e();
            ((rg1) this.f89756b).mergeNamedQuery(b9bVar);
            return this;
        }

        public C12070b setDocument(nh4 nh4Var) {
            m23743e();
            ((rg1) this.f89756b).setDocument(nh4Var);
            return this;
        }

        public C12070b setDocumentMetadata(mh1 mh1Var) {
            m23743e();
            ((rg1) this.f89756b).setDocumentMetadata(mh1Var);
            return this;
        }

        public C12070b setMetadata(zg1 zg1Var) {
            m23743e();
            ((rg1) this.f89756b).setMetadata(zg1Var);
            return this;
        }

        public C12070b setNamedQuery(b9b b9bVar) {
            m23743e();
            ((rg1) this.f89756b).setNamedQuery(b9bVar);
            return this;
        }

        private C12070b() {
            super(rg1.DEFAULT_INSTANCE);
        }

        public C12070b setDocument(nh4.C9874b c9874b) {
            m23743e();
            ((rg1) this.f89756b).setDocument(c9874b.build());
            return this;
        }

        public C12070b setDocumentMetadata(mh1.C9352b c9352b) {
            m23743e();
            ((rg1) this.f89756b).setDocumentMetadata(c9352b.build());
            return this;
        }

        public C12070b setMetadata(zg1.C16119b c16119b) {
            m23743e();
            ((rg1) this.f89756b).setMetadata(c16119b.build());
            return this;
        }

        public C12070b setNamedQuery(b9b.C1792b c1792b) {
            m23743e();
            ((rg1) this.f89756b).setNamedQuery(c1792b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: rg1$c */
    public enum EnumC12071c {
        METADATA(1),
        NAMED_QUERY(2),
        DOCUMENT_METADATA(3),
        DOCUMENT(4),
        ELEMENTTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f78193a;

        EnumC12071c(int i) {
            this.f78193a = i;
        }

        public static EnumC12071c forNumber(int i) {
            if (i == 0) {
                return ELEMENTTYPE_NOT_SET;
            }
            if (i == 1) {
                return METADATA;
            }
            if (i == 2) {
                return NAMED_QUERY;
            }
            if (i == 3) {
                return DOCUMENT_METADATA;
            }
            if (i != 4) {
                return null;
            }
            return DOCUMENT;
        }

        public int getNumber() {
            return this.f78193a;
        }

        @Deprecated
        public static EnumC12071c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        rg1 rg1Var = new rg1();
        DEFAULT_INSTANCE = rg1Var;
        v27.m23715h0(rg1.class, rg1Var);
    }

    private rg1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        if (this.elementTypeCase_ == 4) {
            this.elementTypeCase_ = 0;
            this.elementType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentMetadata() {
        if (this.elementTypeCase_ == 3) {
            this.elementTypeCase_ = 0;
            this.elementType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElementType() {
        this.elementTypeCase_ = 0;
        this.elementType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        if (this.elementTypeCase_ == 1) {
            this.elementTypeCase_ = 0;
            this.elementType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNamedQuery() {
        if (this.elementTypeCase_ == 2) {
            this.elementTypeCase_ = 0;
            this.elementType_ = null;
        }
    }

    public static rg1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocument(nh4 nh4Var) {
        nh4Var.getClass();
        if (this.elementTypeCase_ != 4 || this.elementType_ == nh4.getDefaultInstance()) {
            this.elementType_ = nh4Var;
        } else {
            this.elementType_ = nh4.newBuilder((nh4) this.elementType_).mergeFrom(nh4Var).buildPartial();
        }
        this.elementTypeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocumentMetadata(mh1 mh1Var) {
        mh1Var.getClass();
        if (this.elementTypeCase_ != 3 || this.elementType_ == mh1.getDefaultInstance()) {
            this.elementType_ = mh1Var;
        } else {
            this.elementType_ = mh1.newBuilder((mh1) this.elementType_).mergeFrom(mh1Var).buildPartial();
        }
        this.elementTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(zg1 zg1Var) {
        zg1Var.getClass();
        if (this.elementTypeCase_ != 1 || this.elementType_ == zg1.getDefaultInstance()) {
            this.elementType_ = zg1Var;
        } else {
            this.elementType_ = zg1.newBuilder((zg1) this.elementType_).mergeFrom(zg1Var).buildPartial();
        }
        this.elementTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNamedQuery(b9b b9bVar) {
        b9bVar.getClass();
        if (this.elementTypeCase_ != 2 || this.elementType_ == b9b.getDefaultInstance()) {
            this.elementType_ = b9bVar;
        } else {
            this.elementType_ = b9b.newBuilder((b9b) this.elementType_).mergeFrom(b9bVar).buildPartial();
        }
        this.elementTypeCase_ = 2;
    }

    public static C12070b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static rg1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (rg1) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static rg1 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (rg1) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<rg1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(nh4 nh4Var) {
        nh4Var.getClass();
        this.elementType_ = nh4Var;
        this.elementTypeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentMetadata(mh1 mh1Var) {
        mh1Var.getClass();
        this.elementType_ = mh1Var;
        this.elementTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(zg1 zg1Var) {
        zg1Var.getClass();
        this.elementType_ = zg1Var;
        this.elementTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNamedQuery(b9b b9bVar) {
        b9bVar.getClass();
        this.elementType_ = b9bVar;
        this.elementTypeCase_ = 2;
    }

    @Override // p000.tg1
    public nh4 getDocument() {
        return this.elementTypeCase_ == 4 ? (nh4) this.elementType_ : nh4.getDefaultInstance();
    }

    @Override // p000.tg1
    public mh1 getDocumentMetadata() {
        return this.elementTypeCase_ == 3 ? (mh1) this.elementType_ : mh1.getDefaultInstance();
    }

    @Override // p000.tg1
    public EnumC12071c getElementTypeCase() {
        return EnumC12071c.forNumber(this.elementTypeCase_);
    }

    @Override // p000.tg1
    public zg1 getMetadata() {
        return this.elementTypeCase_ == 1 ? (zg1) this.elementType_ : zg1.getDefaultInstance();
    }

    @Override // p000.tg1
    public b9b getNamedQuery() {
        return this.elementTypeCase_ == 2 ? (b9b) this.elementType_ : b9b.getDefaultInstance();
    }

    @Override // p000.tg1
    public boolean hasDocument() {
        return this.elementTypeCase_ == 4;
    }

    @Override // p000.tg1
    public boolean hasDocumentMetadata() {
        return this.elementTypeCase_ == 3;
    }

    @Override // p000.tg1
    public boolean hasMetadata() {
        return this.elementTypeCase_ == 1;
    }

    @Override // p000.tg1
    public boolean hasNamedQuery() {
        return this.elementTypeCase_ == 2;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C12069a c12069a = null;
        switch (C12069a.f78186a[enumC13830i.ordinal()]) {
            case 1:
                return new rg1();
            case 2:
                return new C12070b(c12069a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"elementType_", "elementTypeCase_", zg1.class, b9b.class, mh1.class, nh4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<rg1> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (rg1.class) {
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

    public static C12070b newBuilder(rg1 rg1Var) {
        return DEFAULT_INSTANCE.m23739o(rg1Var);
    }

    public static rg1 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (rg1) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static rg1 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (rg1) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static rg1 parseFrom(vj1 vj1Var) throws ce8 {
        return (rg1) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static rg1 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (rg1) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static rg1 parseFrom(byte[] bArr) throws ce8 {
        return (rg1) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static rg1 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (rg1) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static rg1 parseFrom(InputStream inputStream) throws IOException {
        return (rg1) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static rg1 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (rg1) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static rg1 parseFrom(f72 f72Var) throws IOException {
        return (rg1) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static rg1 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (rg1) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
