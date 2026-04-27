package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.gdb;
import p000.nh4;
import p000.nth;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class k6a extends v27<k6a, C8214b> implements l6a {
    private static final k6a DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile uhc<k6a> PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* JADX INFO: renamed from: k6a$a */
    public static /* synthetic */ class C8213a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52679a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f52679a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52679a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52679a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52679a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52679a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52679a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52679a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: k6a$b */
    public static final class C8214b extends v27.AbstractC13823b<k6a, C8214b> implements l6a {
        public /* synthetic */ C8214b(C8213a c8213a) {
            this();
        }

        public C8214b clearDocument() {
            m23743e();
            ((k6a) this.f89756b).clearDocument();
            return this;
        }

        public C8214b clearDocumentType() {
            m23743e();
            ((k6a) this.f89756b).clearDocumentType();
            return this;
        }

        public C8214b clearHasCommittedMutations() {
            m23743e();
            ((k6a) this.f89756b).clearHasCommittedMutations();
            return this;
        }

        public C8214b clearNoDocument() {
            m23743e();
            ((k6a) this.f89756b).clearNoDocument();
            return this;
        }

        public C8214b clearUnknownDocument() {
            m23743e();
            ((k6a) this.f89756b).clearUnknownDocument();
            return this;
        }

        @Override // p000.l6a
        public nh4 getDocument() {
            return ((k6a) this.f89756b).getDocument();
        }

        @Override // p000.l6a
        public EnumC8215c getDocumentTypeCase() {
            return ((k6a) this.f89756b).getDocumentTypeCase();
        }

        @Override // p000.l6a
        public boolean getHasCommittedMutations() {
            return ((k6a) this.f89756b).getHasCommittedMutations();
        }

        @Override // p000.l6a
        public gdb getNoDocument() {
            return ((k6a) this.f89756b).getNoDocument();
        }

        @Override // p000.l6a
        public nth getUnknownDocument() {
            return ((k6a) this.f89756b).getUnknownDocument();
        }

        @Override // p000.l6a
        public boolean hasDocument() {
            return ((k6a) this.f89756b).hasDocument();
        }

        @Override // p000.l6a
        public boolean hasNoDocument() {
            return ((k6a) this.f89756b).hasNoDocument();
        }

        @Override // p000.l6a
        public boolean hasUnknownDocument() {
            return ((k6a) this.f89756b).hasUnknownDocument();
        }

        public C8214b mergeDocument(nh4 nh4Var) {
            m23743e();
            ((k6a) this.f89756b).mergeDocument(nh4Var);
            return this;
        }

        public C8214b mergeNoDocument(gdb gdbVar) {
            m23743e();
            ((k6a) this.f89756b).mergeNoDocument(gdbVar);
            return this;
        }

        public C8214b mergeUnknownDocument(nth nthVar) {
            m23743e();
            ((k6a) this.f89756b).mergeUnknownDocument(nthVar);
            return this;
        }

        public C8214b setDocument(nh4 nh4Var) {
            m23743e();
            ((k6a) this.f89756b).setDocument(nh4Var);
            return this;
        }

        public C8214b setHasCommittedMutations(boolean z) {
            m23743e();
            ((k6a) this.f89756b).setHasCommittedMutations(z);
            return this;
        }

        public C8214b setNoDocument(gdb gdbVar) {
            m23743e();
            ((k6a) this.f89756b).setNoDocument(gdbVar);
            return this;
        }

        public C8214b setUnknownDocument(nth nthVar) {
            m23743e();
            ((k6a) this.f89756b).setUnknownDocument(nthVar);
            return this;
        }

        private C8214b() {
            super(k6a.DEFAULT_INSTANCE);
        }

        public C8214b setDocument(nh4.C9874b c9874b) {
            m23743e();
            ((k6a) this.f89756b).setDocument(c9874b.build());
            return this;
        }

        public C8214b setNoDocument(gdb.C6261b c6261b) {
            m23743e();
            ((k6a) this.f89756b).setNoDocument(c6261b.build());
            return this;
        }

        public C8214b setUnknownDocument(nth.C10059b c10059b) {
            m23743e();
            ((k6a) this.f89756b).setUnknownDocument(c10059b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: k6a$c */
    public enum EnumC8215c {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f52685a;

        EnumC8215c(int i) {
            this.f52685a = i;
        }

        public static EnumC8215c forNumber(int i) {
            if (i == 0) {
                return DOCUMENTTYPE_NOT_SET;
            }
            if (i == 1) {
                return NO_DOCUMENT;
            }
            if (i == 2) {
                return DOCUMENT;
            }
            if (i != 3) {
                return null;
            }
            return UNKNOWN_DOCUMENT;
        }

        public int getNumber() {
            return this.f52685a;
        }

        @Deprecated
        public static EnumC8215c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        k6a k6aVar = new k6a();
        DEFAULT_INSTANCE = k6aVar;
        v27.m23715h0(k6a.class, k6aVar);
    }

    private k6a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        if (this.documentTypeCase_ == 2) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentType() {
        this.documentTypeCase_ = 0;
        this.documentType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasCommittedMutations() {
        this.hasCommittedMutations_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoDocument() {
        if (this.documentTypeCase_ == 1) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnknownDocument() {
        if (this.documentTypeCase_ == 3) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    public static k6a getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocument(nh4 nh4Var) {
        nh4Var.getClass();
        if (this.documentTypeCase_ != 2 || this.documentType_ == nh4.getDefaultInstance()) {
            this.documentType_ = nh4Var;
        } else {
            this.documentType_ = nh4.newBuilder((nh4) this.documentType_).mergeFrom(nh4Var).buildPartial();
        }
        this.documentTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNoDocument(gdb gdbVar) {
        gdbVar.getClass();
        if (this.documentTypeCase_ != 1 || this.documentType_ == gdb.getDefaultInstance()) {
            this.documentType_ = gdbVar;
        } else {
            this.documentType_ = gdb.newBuilder((gdb) this.documentType_).mergeFrom(gdbVar).buildPartial();
        }
        this.documentTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnknownDocument(nth nthVar) {
        nthVar.getClass();
        if (this.documentTypeCase_ != 3 || this.documentType_ == nth.getDefaultInstance()) {
            this.documentType_ = nthVar;
        } else {
            this.documentType_ = nth.newBuilder((nth) this.documentType_).mergeFrom(nthVar).buildPartial();
        }
        this.documentTypeCase_ = 3;
    }

    public static C8214b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static k6a parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (k6a) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static k6a parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (k6a) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<k6a> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(nh4 nh4Var) {
        nh4Var.getClass();
        this.documentType_ = nh4Var;
        this.documentTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasCommittedMutations(boolean z) {
        this.hasCommittedMutations_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoDocument(gdb gdbVar) {
        gdbVar.getClass();
        this.documentType_ = gdbVar;
        this.documentTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnknownDocument(nth nthVar) {
        nthVar.getClass();
        this.documentType_ = nthVar;
        this.documentTypeCase_ = 3;
    }

    @Override // p000.l6a
    public nh4 getDocument() {
        return this.documentTypeCase_ == 2 ? (nh4) this.documentType_ : nh4.getDefaultInstance();
    }

    @Override // p000.l6a
    public EnumC8215c getDocumentTypeCase() {
        return EnumC8215c.forNumber(this.documentTypeCase_);
    }

    @Override // p000.l6a
    public boolean getHasCommittedMutations() {
        return this.hasCommittedMutations_;
    }

    @Override // p000.l6a
    public gdb getNoDocument() {
        return this.documentTypeCase_ == 1 ? (gdb) this.documentType_ : gdb.getDefaultInstance();
    }

    @Override // p000.l6a
    public nth getUnknownDocument() {
        return this.documentTypeCase_ == 3 ? (nth) this.documentType_ : nth.getDefaultInstance();
    }

    @Override // p000.l6a
    public boolean hasDocument() {
        return this.documentTypeCase_ == 2;
    }

    @Override // p000.l6a
    public boolean hasNoDocument() {
        return this.documentTypeCase_ == 1;
    }

    @Override // p000.l6a
    public boolean hasUnknownDocument() {
        return this.documentTypeCase_ == 3;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8213a c8213a = null;
        switch (C8213a.f52679a[enumC13830i.ordinal()]) {
            case 1:
                return new k6a();
            case 2:
                return new C8214b(c8213a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", gdb.class, nh4.class, nth.class, "hasCommittedMutations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<k6a> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (k6a.class) {
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

    public static C8214b newBuilder(k6a k6aVar) {
        return DEFAULT_INSTANCE.m23739o(k6aVar);
    }

    public static k6a parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (k6a) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static k6a parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (k6a) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static k6a parseFrom(vj1 vj1Var) throws ce8 {
        return (k6a) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static k6a parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (k6a) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static k6a parseFrom(byte[] bArr) throws ce8 {
        return (k6a) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static k6a parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (k6a) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static k6a parseFrom(InputStream inputStream) throws IOException {
        return (k6a) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static k6a parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (k6a) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static k6a parseFrom(f72 f72Var) throws IOException {
        return (k6a) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static k6a parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (k6a) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
