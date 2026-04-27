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
public final class w89 extends v27<w89, C14478b> implements x89 {
    private static final w89 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 1;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile uhc<w89> PARSER;
    private w98.InterfaceC14504k<nh4> documents_ = v27.m23722x();
    private String nextPageToken_ = "";

    /* JADX INFO: renamed from: w89$a */
    public static /* synthetic */ class C14477a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93614a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f93614a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93614a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93614a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93614a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93614a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93614a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93614a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: w89$b */
    public static final class C14478b extends v27.AbstractC13823b<w89, C14478b> implements x89 {
        public /* synthetic */ C14478b(C14477a c14477a) {
            this();
        }

        public C14478b addAllDocuments(Iterable<? extends nh4> iterable) {
            m23743e();
            ((w89) this.f89756b).addAllDocuments(iterable);
            return this;
        }

        public C14478b addDocuments(nh4 nh4Var) {
            m23743e();
            ((w89) this.f89756b).addDocuments(nh4Var);
            return this;
        }

        public C14478b clearDocuments() {
            m23743e();
            ((w89) this.f89756b).clearDocuments();
            return this;
        }

        public C14478b clearNextPageToken() {
            m23743e();
            ((w89) this.f89756b).clearNextPageToken();
            return this;
        }

        @Override // p000.x89
        public nh4 getDocuments(int i) {
            return ((w89) this.f89756b).getDocuments(i);
        }

        @Override // p000.x89
        public int getDocumentsCount() {
            return ((w89) this.f89756b).getDocumentsCount();
        }

        @Override // p000.x89
        public List<nh4> getDocumentsList() {
            return Collections.unmodifiableList(((w89) this.f89756b).getDocumentsList());
        }

        @Override // p000.x89
        public String getNextPageToken() {
            return ((w89) this.f89756b).getNextPageToken();
        }

        @Override // p000.x89
        public vj1 getNextPageTokenBytes() {
            return ((w89) this.f89756b).getNextPageTokenBytes();
        }

        public C14478b removeDocuments(int i) {
            m23743e();
            ((w89) this.f89756b).removeDocuments(i);
            return this;
        }

        public C14478b setDocuments(int i, nh4 nh4Var) {
            m23743e();
            ((w89) this.f89756b).setDocuments(i, nh4Var);
            return this;
        }

        public C14478b setNextPageToken(String str) {
            m23743e();
            ((w89) this.f89756b).setNextPageToken(str);
            return this;
        }

        public C14478b setNextPageTokenBytes(vj1 vj1Var) {
            m23743e();
            ((w89) this.f89756b).setNextPageTokenBytes(vj1Var);
            return this;
        }

        private C14478b() {
            super(w89.DEFAULT_INSTANCE);
        }

        public C14478b addDocuments(int i, nh4 nh4Var) {
            m23743e();
            ((w89) this.f89756b).addDocuments(i, nh4Var);
            return this;
        }

        public C14478b setDocuments(int i, nh4.C9874b c9874b) {
            m23743e();
            ((w89) this.f89756b).setDocuments(i, c9874b.build());
            return this;
        }

        public C14478b addDocuments(nh4.C9874b c9874b) {
            m23743e();
            ((w89) this.f89756b).addDocuments(c9874b.build());
            return this;
        }

        public C14478b addDocuments(int i, nh4.C9874b c9874b) {
            m23743e();
            ((w89) this.f89756b).addDocuments(i, c9874b.build());
            return this;
        }
    }

    static {
        w89 w89Var = new w89();
        DEFAULT_INSTANCE = w89Var;
        v27.m23715h0(w89.class, w89Var);
    }

    private w89() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDocuments(Iterable<? extends nh4> iterable) {
        ensureDocumentsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.documents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDocuments(nh4 nh4Var) {
        nh4Var.getClass();
        ensureDocumentsIsMutable();
        this.documents_.add(nh4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocuments() {
        this.documents_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextPageToken() {
        this.nextPageToken_ = getDefaultInstance().getNextPageToken();
    }

    private void ensureDocumentsIsMutable() {
        w98.InterfaceC14504k<nh4> interfaceC14504k = this.documents_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.documents_ = v27.m23698P(interfaceC14504k);
    }

    public static w89 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14478b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static w89 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (w89) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static w89 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (w89) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<w89> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDocuments(int i) {
        ensureDocumentsIsMutable();
        this.documents_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocuments(int i, nh4 nh4Var) {
        nh4Var.getClass();
        ensureDocumentsIsMutable();
        this.documents_.set(i, nh4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextPageToken(String str) {
        str.getClass();
        this.nextPageToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextPageTokenBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.nextPageToken_ = vj1Var.toStringUtf8();
    }

    @Override // p000.x89
    public nh4 getDocuments(int i) {
        return this.documents_.get(i);
    }

    @Override // p000.x89
    public int getDocumentsCount() {
        return this.documents_.size();
    }

    @Override // p000.x89
    public List<nh4> getDocumentsList() {
        return this.documents_;
    }

    public fi4 getDocumentsOrBuilder(int i) {
        return this.documents_.get(i);
    }

    public List<? extends fi4> getDocumentsOrBuilderList() {
        return this.documents_;
    }

    @Override // p000.x89
    public String getNextPageToken() {
        return this.nextPageToken_;
    }

    @Override // p000.x89
    public vj1 getNextPageTokenBytes() {
        return vj1.copyFromUtf8(this.nextPageToken_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C14477a c14477a = null;
        switch (C14477a.f93614a[enumC13830i.ordinal()]) {
            case 1:
                return new w89();
            case 2:
                return new C14478b(c14477a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"documents_", nh4.class, "nextPageToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<w89> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (w89.class) {
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

    public static C14478b newBuilder(w89 w89Var) {
        return DEFAULT_INSTANCE.m23739o(w89Var);
    }

    public static w89 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (w89) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static w89 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (w89) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static w89 parseFrom(vj1 vj1Var) throws ce8 {
        return (w89) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDocuments(int i, nh4 nh4Var) {
        nh4Var.getClass();
        ensureDocumentsIsMutable();
        this.documents_.add(i, nh4Var);
    }

    public static w89 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (w89) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static w89 parseFrom(byte[] bArr) throws ce8 {
        return (w89) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static w89 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (w89) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static w89 parseFrom(InputStream inputStream) throws IOException {
        return (w89) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static w89 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (w89) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static w89 parseFrom(f72 f72Var) throws IOException {
        return (w89) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static w89 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (w89) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
