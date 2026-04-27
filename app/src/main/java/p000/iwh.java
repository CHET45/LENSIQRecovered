package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.di4;
import p000.m7d;
import p000.nh4;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class iwh extends v27<iwh, C7645b> implements jwh {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final iwh DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int MASK_FIELD_NUMBER = 3;
    private static volatile uhc<iwh> PARSER = null;
    public static final int UPDATE_MASK_FIELD_NUMBER = 2;
    private int bitField0_;
    private m7d currentDocument_;
    private nh4 document_;
    private di4 mask_;
    private di4 updateMask_;

    /* JADX INFO: renamed from: iwh$a */
    public static /* synthetic */ class C7644a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f48730a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f48730a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48730a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48730a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48730a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48730a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f48730a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f48730a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: iwh$b */
    public static final class C7645b extends v27.AbstractC13823b<iwh, C7645b> implements jwh {
        public /* synthetic */ C7645b(C7644a c7644a) {
            this();
        }

        public C7645b clearCurrentDocument() {
            m23743e();
            ((iwh) this.f89756b).clearCurrentDocument();
            return this;
        }

        public C7645b clearDocument() {
            m23743e();
            ((iwh) this.f89756b).clearDocument();
            return this;
        }

        public C7645b clearMask() {
            m23743e();
            ((iwh) this.f89756b).clearMask();
            return this;
        }

        public C7645b clearUpdateMask() {
            m23743e();
            ((iwh) this.f89756b).clearUpdateMask();
            return this;
        }

        @Override // p000.jwh
        public m7d getCurrentDocument() {
            return ((iwh) this.f89756b).getCurrentDocument();
        }

        @Override // p000.jwh
        public nh4 getDocument() {
            return ((iwh) this.f89756b).getDocument();
        }

        @Override // p000.jwh
        public di4 getMask() {
            return ((iwh) this.f89756b).getMask();
        }

        @Override // p000.jwh
        public di4 getUpdateMask() {
            return ((iwh) this.f89756b).getUpdateMask();
        }

        @Override // p000.jwh
        public boolean hasCurrentDocument() {
            return ((iwh) this.f89756b).hasCurrentDocument();
        }

        @Override // p000.jwh
        public boolean hasDocument() {
            return ((iwh) this.f89756b).hasDocument();
        }

        @Override // p000.jwh
        public boolean hasMask() {
            return ((iwh) this.f89756b).hasMask();
        }

        @Override // p000.jwh
        public boolean hasUpdateMask() {
            return ((iwh) this.f89756b).hasUpdateMask();
        }

        public C7645b mergeCurrentDocument(m7d m7dVar) {
            m23743e();
            ((iwh) this.f89756b).mergeCurrentDocument(m7dVar);
            return this;
        }

        public C7645b mergeDocument(nh4 nh4Var) {
            m23743e();
            ((iwh) this.f89756b).mergeDocument(nh4Var);
            return this;
        }

        public C7645b mergeMask(di4 di4Var) {
            m23743e();
            ((iwh) this.f89756b).mergeMask(di4Var);
            return this;
        }

        public C7645b mergeUpdateMask(di4 di4Var) {
            m23743e();
            ((iwh) this.f89756b).mergeUpdateMask(di4Var);
            return this;
        }

        public C7645b setCurrentDocument(m7d m7dVar) {
            m23743e();
            ((iwh) this.f89756b).setCurrentDocument(m7dVar);
            return this;
        }

        public C7645b setDocument(nh4 nh4Var) {
            m23743e();
            ((iwh) this.f89756b).setDocument(nh4Var);
            return this;
        }

        public C7645b setMask(di4 di4Var) {
            m23743e();
            ((iwh) this.f89756b).setMask(di4Var);
            return this;
        }

        public C7645b setUpdateMask(di4 di4Var) {
            m23743e();
            ((iwh) this.f89756b).setUpdateMask(di4Var);
            return this;
        }

        private C7645b() {
            super(iwh.DEFAULT_INSTANCE);
        }

        public C7645b setCurrentDocument(m7d.C9214b c9214b) {
            m23743e();
            ((iwh) this.f89756b).setCurrentDocument(c9214b.build());
            return this;
        }

        public C7645b setDocument(nh4.C9874b c9874b) {
            m23743e();
            ((iwh) this.f89756b).setDocument(c9874b.build());
            return this;
        }

        public C7645b setMask(di4.C4792b c4792b) {
            m23743e();
            ((iwh) this.f89756b).setMask(c4792b.build());
            return this;
        }

        public C7645b setUpdateMask(di4.C4792b c4792b) {
            m23743e();
            ((iwh) this.f89756b).setUpdateMask(c4792b.build());
            return this;
        }
    }

    static {
        iwh iwhVar = new iwh();
        DEFAULT_INSTANCE = iwhVar;
        v27.m23715h0(iwh.class, iwhVar);
    }

    private iwh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentDocument() {
        this.currentDocument_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        this.document_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMask() {
        this.mask_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateMask() {
        this.updateMask_ = null;
        this.bitField0_ &= -3;
    }

    public static iwh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentDocument(m7d m7dVar) {
        m7dVar.getClass();
        m7d m7dVar2 = this.currentDocument_;
        if (m7dVar2 == null || m7dVar2 == m7d.getDefaultInstance()) {
            this.currentDocument_ = m7dVar;
        } else {
            this.currentDocument_ = m7d.newBuilder(this.currentDocument_).mergeFrom(m7dVar).buildPartial();
        }
        this.bitField0_ |= 8;
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
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateMask(di4 di4Var) {
        di4Var.getClass();
        di4 di4Var2 = this.updateMask_;
        if (di4Var2 == null || di4Var2 == di4.getDefaultInstance()) {
            this.updateMask_ = di4Var;
        } else {
            this.updateMask_ = di4.newBuilder(this.updateMask_).mergeFrom(di4Var).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C7645b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static iwh parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (iwh) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static iwh parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (iwh) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<iwh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentDocument(m7d m7dVar) {
        m7dVar.getClass();
        this.currentDocument_ = m7dVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(nh4 nh4Var) {
        nh4Var.getClass();
        this.document_ = nh4Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMask(di4 di4Var) {
        di4Var.getClass();
        this.mask_ = di4Var;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateMask(di4 di4Var) {
        di4Var.getClass();
        this.updateMask_ = di4Var;
        this.bitField0_ |= 2;
    }

    @Override // p000.jwh
    public m7d getCurrentDocument() {
        m7d m7dVar = this.currentDocument_;
        return m7dVar == null ? m7d.getDefaultInstance() : m7dVar;
    }

    @Override // p000.jwh
    public nh4 getDocument() {
        nh4 nh4Var = this.document_;
        return nh4Var == null ? nh4.getDefaultInstance() : nh4Var;
    }

    @Override // p000.jwh
    public di4 getMask() {
        di4 di4Var = this.mask_;
        return di4Var == null ? di4.getDefaultInstance() : di4Var;
    }

    @Override // p000.jwh
    public di4 getUpdateMask() {
        di4 di4Var = this.updateMask_;
        return di4Var == null ? di4.getDefaultInstance() : di4Var;
    }

    @Override // p000.jwh
    public boolean hasCurrentDocument() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p000.jwh
    public boolean hasDocument() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.jwh
    public boolean hasMask() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p000.jwh
    public boolean hasUpdateMask() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C7644a c7644a = null;
        switch (C7644a.f48730a[enumC13830i.ordinal()]) {
            case 1:
                return new iwh();
            case 2:
                return new C7645b(c7644a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "document_", "updateMask_", "mask_", "currentDocument_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<iwh> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (iwh.class) {
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

    public static C7645b newBuilder(iwh iwhVar) {
        return DEFAULT_INSTANCE.m23739o(iwhVar);
    }

    public static iwh parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (iwh) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static iwh parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (iwh) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static iwh parseFrom(vj1 vj1Var) throws ce8 {
        return (iwh) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static iwh parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (iwh) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static iwh parseFrom(byte[] bArr) throws ce8 {
        return (iwh) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static iwh parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (iwh) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static iwh parseFrom(InputStream inputStream) throws IOException {
        return (iwh) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static iwh parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (iwh) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static iwh parseFrom(f72 f72Var) throws IOException {
        return (iwh) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static iwh parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (iwh) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
