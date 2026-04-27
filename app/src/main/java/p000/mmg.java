package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.abg;
import p000.f2h;
import p000.t58;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class mmg extends v27<mmg, C9416b> implements eng {
    private static final mmg DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile uhc<mmg> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private t58 expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    /* JADX INFO: renamed from: mmg$a */
    public static /* synthetic */ class C9415a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f61515a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f61515a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61515a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61515a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f61515a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f61515a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f61515a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f61515a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: mmg$b */
    public static final class C9416b extends v27.AbstractC13823b<mmg, C9416b> implements eng {
        public /* synthetic */ C9416b(C9415a c9415a) {
            this();
        }

        public C9416b clearDocuments() {
            m23743e();
            ((mmg) this.f89756b).clearDocuments();
            return this;
        }

        public C9416b clearExpectedCount() {
            m23743e();
            ((mmg) this.f89756b).clearExpectedCount();
            return this;
        }

        public C9416b clearOnce() {
            m23743e();
            ((mmg) this.f89756b).clearOnce();
            return this;
        }

        public C9416b clearQuery() {
            m23743e();
            ((mmg) this.f89756b).clearQuery();
            return this;
        }

        public C9416b clearReadTime() {
            m23743e();
            ((mmg) this.f89756b).clearReadTime();
            return this;
        }

        public C9416b clearResumeToken() {
            m23743e();
            ((mmg) this.f89756b).clearResumeToken();
            return this;
        }

        public C9416b clearResumeType() {
            m23743e();
            ((mmg) this.f89756b).clearResumeType();
            return this;
        }

        public C9416b clearTargetId() {
            m23743e();
            ((mmg) this.f89756b).clearTargetId();
            return this;
        }

        public C9416b clearTargetType() {
            m23743e();
            ((mmg) this.f89756b).clearTargetType();
            return this;
        }

        @Override // p000.eng
        public C9417c getDocuments() {
            return ((mmg) this.f89756b).getDocuments();
        }

        @Override // p000.eng
        public t58 getExpectedCount() {
            return ((mmg) this.f89756b).getExpectedCount();
        }

        @Override // p000.eng
        public boolean getOnce() {
            return ((mmg) this.f89756b).getOnce();
        }

        @Override // p000.eng
        public C9419e getQuery() {
            return ((mmg) this.f89756b).getQuery();
        }

        @Override // p000.eng
        public f2h getReadTime() {
            return ((mmg) this.f89756b).getReadTime();
        }

        @Override // p000.eng
        public vj1 getResumeToken() {
            return ((mmg) this.f89756b).getResumeToken();
        }

        @Override // p000.eng
        public EnumC9421g getResumeTypeCase() {
            return ((mmg) this.f89756b).getResumeTypeCase();
        }

        @Override // p000.eng
        public int getTargetId() {
            return ((mmg) this.f89756b).getTargetId();
        }

        @Override // p000.eng
        public EnumC9422h getTargetTypeCase() {
            return ((mmg) this.f89756b).getTargetTypeCase();
        }

        @Override // p000.eng
        public boolean hasDocuments() {
            return ((mmg) this.f89756b).hasDocuments();
        }

        @Override // p000.eng
        public boolean hasExpectedCount() {
            return ((mmg) this.f89756b).hasExpectedCount();
        }

        @Override // p000.eng
        public boolean hasQuery() {
            return ((mmg) this.f89756b).hasQuery();
        }

        @Override // p000.eng
        public boolean hasReadTime() {
            return ((mmg) this.f89756b).hasReadTime();
        }

        @Override // p000.eng
        public boolean hasResumeToken() {
            return ((mmg) this.f89756b).hasResumeToken();
        }

        public C9416b mergeDocuments(C9417c c9417c) {
            m23743e();
            ((mmg) this.f89756b).mergeDocuments(c9417c);
            return this;
        }

        public C9416b mergeExpectedCount(t58 t58Var) {
            m23743e();
            ((mmg) this.f89756b).mergeExpectedCount(t58Var);
            return this;
        }

        public C9416b mergeQuery(C9419e c9419e) {
            m23743e();
            ((mmg) this.f89756b).mergeQuery(c9419e);
            return this;
        }

        public C9416b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((mmg) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C9416b setDocuments(C9417c c9417c) {
            m23743e();
            ((mmg) this.f89756b).setDocuments(c9417c);
            return this;
        }

        public C9416b setExpectedCount(t58 t58Var) {
            m23743e();
            ((mmg) this.f89756b).setExpectedCount(t58Var);
            return this;
        }

        public C9416b setOnce(boolean z) {
            m23743e();
            ((mmg) this.f89756b).setOnce(z);
            return this;
        }

        public C9416b setQuery(C9419e c9419e) {
            m23743e();
            ((mmg) this.f89756b).setQuery(c9419e);
            return this;
        }

        public C9416b setReadTime(f2h f2hVar) {
            m23743e();
            ((mmg) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        public C9416b setResumeToken(vj1 vj1Var) {
            m23743e();
            ((mmg) this.f89756b).setResumeToken(vj1Var);
            return this;
        }

        public C9416b setTargetId(int i) {
            m23743e();
            ((mmg) this.f89756b).setTargetId(i);
            return this;
        }

        private C9416b() {
            super(mmg.DEFAULT_INSTANCE);
        }

        public C9416b setDocuments(C9417c.a aVar) {
            m23743e();
            ((mmg) this.f89756b).setDocuments(aVar.build());
            return this;
        }

        public C9416b setExpectedCount(t58.C12915b c12915b) {
            m23743e();
            ((mmg) this.f89756b).setExpectedCount(c12915b.build());
            return this;
        }

        public C9416b setQuery(C9419e.a aVar) {
            m23743e();
            ((mmg) this.f89756b).setQuery(aVar.build());
            return this;
        }

        public C9416b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((mmg) this.f89756b).setReadTime(c5567b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: mmg$c */
    public static final class C9417c extends v27<C9417c, a> implements InterfaceC9418d {
        private static final C9417c DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile uhc<C9417c> PARSER;
        private w98.InterfaceC14504k<String> documents_ = v27.m23722x();

        /* JADX INFO: renamed from: mmg$c$a */
        public static final class a extends v27.AbstractC13823b<C9417c, a> implements InterfaceC9418d {
            public /* synthetic */ a(C9415a c9415a) {
                this();
            }

            public a addAllDocuments(Iterable<String> iterable) {
                m23743e();
                ((C9417c) this.f89756b).addAllDocuments(iterable);
                return this;
            }

            public a addDocuments(String str) {
                m23743e();
                ((C9417c) this.f89756b).addDocuments(str);
                return this;
            }

            public a addDocumentsBytes(vj1 vj1Var) {
                m23743e();
                ((C9417c) this.f89756b).addDocumentsBytes(vj1Var);
                return this;
            }

            public a clearDocuments() {
                m23743e();
                ((C9417c) this.f89756b).clearDocuments();
                return this;
            }

            @Override // p000.mmg.InterfaceC9418d
            public String getDocuments(int i) {
                return ((C9417c) this.f89756b).getDocuments(i);
            }

            @Override // p000.mmg.InterfaceC9418d
            public vj1 getDocumentsBytes(int i) {
                return ((C9417c) this.f89756b).getDocumentsBytes(i);
            }

            @Override // p000.mmg.InterfaceC9418d
            public int getDocumentsCount() {
                return ((C9417c) this.f89756b).getDocumentsCount();
            }

            @Override // p000.mmg.InterfaceC9418d
            public List<String> getDocumentsList() {
                return Collections.unmodifiableList(((C9417c) this.f89756b).getDocumentsList());
            }

            public a setDocuments(int i, String str) {
                m23743e();
                ((C9417c) this.f89756b).setDocuments(i, str);
                return this;
            }

            private a() {
                super(C9417c.DEFAULT_INSTANCE);
            }
        }

        static {
            C9417c c9417c = new C9417c();
            DEFAULT_INSTANCE = c9417c;
            v27.m23715h0(C9417c.class, c9417c);
        }

        private C9417c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDocuments(Iterable<String> iterable) {
            ensureDocumentsIsMutable();
            AbstractC1714b3.m2856b(iterable, this.documents_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDocuments(String str) {
            str.getClass();
            ensureDocumentsIsMutable();
            this.documents_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDocumentsBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            ensureDocumentsIsMutable();
            this.documents_.add(vj1Var.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDocuments() {
            this.documents_ = v27.m23722x();
        }

        private void ensureDocumentsIsMutable() {
            w98.InterfaceC14504k<String> interfaceC14504k = this.documents_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.documents_ = v27.m23698P(interfaceC14504k);
        }

        public static C9417c getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C9417c parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9417c) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9417c parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9417c) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9417c> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDocuments(int i, String str) {
            str.getClass();
            ensureDocumentsIsMutable();
            this.documents_.set(i, str);
        }

        @Override // p000.mmg.InterfaceC9418d
        public String getDocuments(int i) {
            return this.documents_.get(i);
        }

        @Override // p000.mmg.InterfaceC9418d
        public vj1 getDocumentsBytes(int i) {
            return vj1.copyFromUtf8(this.documents_.get(i));
        }

        @Override // p000.mmg.InterfaceC9418d
        public int getDocumentsCount() {
            return this.documents_.size();
        }

        @Override // p000.mmg.InterfaceC9418d
        public List<String> getDocumentsList() {
            return this.documents_;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9415a c9415a = null;
            switch (C9415a.f61515a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9417c();
                case 2:
                    return new a(c9415a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9417c> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9417c.class) {
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

        public static a newBuilder(C9417c c9417c) {
            return DEFAULT_INSTANCE.m23739o(c9417c);
        }

        public static C9417c parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9417c) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9417c parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9417c) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9417c parseFrom(vj1 vj1Var) throws ce8 {
            return (C9417c) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C9417c parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9417c) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9417c parseFrom(byte[] bArr) throws ce8 {
            return (C9417c) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9417c parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9417c) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9417c parseFrom(InputStream inputStream) throws IOException {
            return (C9417c) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9417c parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9417c) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9417c parseFrom(f72 f72Var) throws IOException {
            return (C9417c) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9417c parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9417c) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: mmg$d */
    public interface InterfaceC9418d extends rsa {
        String getDocuments(int i);

        vj1 getDocumentsBytes(int i);

        int getDocumentsCount();

        List<String> getDocumentsList();
    }

    /* JADX INFO: renamed from: mmg$e */
    public static final class C9419e extends v27<C9419e, a> implements InterfaceC9420f {
        private static final C9419e DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile uhc<C9419e> PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private Object queryType_;
        private int queryTypeCase_ = 0;
        private String parent_ = "";

        /* JADX INFO: renamed from: mmg$e$a */
        public static final class a extends v27.AbstractC13823b<C9419e, a> implements InterfaceC9420f {
            public /* synthetic */ a(C9415a c9415a) {
                this();
            }

            public a clearParent() {
                m23743e();
                ((C9419e) this.f89756b).clearParent();
                return this;
            }

            public a clearQueryType() {
                m23743e();
                ((C9419e) this.f89756b).clearQueryType();
                return this;
            }

            public a clearStructuredQuery() {
                m23743e();
                ((C9419e) this.f89756b).clearStructuredQuery();
                return this;
            }

            @Override // p000.mmg.InterfaceC9420f
            public String getParent() {
                return ((C9419e) this.f89756b).getParent();
            }

            @Override // p000.mmg.InterfaceC9420f
            public vj1 getParentBytes() {
                return ((C9419e) this.f89756b).getParentBytes();
            }

            @Override // p000.mmg.InterfaceC9420f
            public b getQueryTypeCase() {
                return ((C9419e) this.f89756b).getQueryTypeCase();
            }

            @Override // p000.mmg.InterfaceC9420f
            public abg getStructuredQuery() {
                return ((C9419e) this.f89756b).getStructuredQuery();
            }

            @Override // p000.mmg.InterfaceC9420f
            public boolean hasStructuredQuery() {
                return ((C9419e) this.f89756b).hasStructuredQuery();
            }

            public a mergeStructuredQuery(abg abgVar) {
                m23743e();
                ((C9419e) this.f89756b).mergeStructuredQuery(abgVar);
                return this;
            }

            public a setParent(String str) {
                m23743e();
                ((C9419e) this.f89756b).setParent(str);
                return this;
            }

            public a setParentBytes(vj1 vj1Var) {
                m23743e();
                ((C9419e) this.f89756b).setParentBytes(vj1Var);
                return this;
            }

            public a setStructuredQuery(abg abgVar) {
                m23743e();
                ((C9419e) this.f89756b).setStructuredQuery(abgVar);
                return this;
            }

            private a() {
                super(C9419e.DEFAULT_INSTANCE);
            }

            public a setStructuredQuery(abg.C0153b c0153b) {
                m23743e();
                ((C9419e) this.f89756b).setStructuredQuery(c0153b.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: mmg$e$b */
        public enum b {
            STRUCTURED_QUERY(2),
            QUERYTYPE_NOT_SET(0);


            /* JADX INFO: renamed from: a */
            public final int f61519a;

            b(int i) {
                this.f61519a = i;
            }

            public static b forNumber(int i) {
                if (i == 0) {
                    return QUERYTYPE_NOT_SET;
                }
                if (i != 2) {
                    return null;
                }
                return STRUCTURED_QUERY;
            }

            public int getNumber() {
                return this.f61519a;
            }

            @Deprecated
            public static b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            C9419e c9419e = new C9419e();
            DEFAULT_INSTANCE = c9419e;
            v27.m23715h0(C9419e.class, c9419e);
        }

        private C9419e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParent() {
            this.parent_ = getDefaultInstance().getParent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQueryType() {
            this.queryTypeCase_ = 0;
            this.queryType_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStructuredQuery() {
            if (this.queryTypeCase_ == 2) {
                this.queryTypeCase_ = 0;
                this.queryType_ = null;
            }
        }

        public static C9419e getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStructuredQuery(abg abgVar) {
            abgVar.getClass();
            if (this.queryTypeCase_ != 2 || this.queryType_ == abg.getDefaultInstance()) {
                this.queryType_ = abgVar;
            } else {
                this.queryType_ = abg.newBuilder((abg) this.queryType_).mergeFrom(abgVar).buildPartial();
            }
            this.queryTypeCase_ = 2;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C9419e parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9419e) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9419e parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9419e) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9419e> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setStructuredQuery(abg abgVar) {
            abgVar.getClass();
            this.queryType_ = abgVar;
            this.queryTypeCase_ = 2;
        }

        @Override // p000.mmg.InterfaceC9420f
        public String getParent() {
            return this.parent_;
        }

        @Override // p000.mmg.InterfaceC9420f
        public vj1 getParentBytes() {
            return vj1.copyFromUtf8(this.parent_);
        }

        @Override // p000.mmg.InterfaceC9420f
        public b getQueryTypeCase() {
            return b.forNumber(this.queryTypeCase_);
        }

        @Override // p000.mmg.InterfaceC9420f
        public abg getStructuredQuery() {
            return this.queryTypeCase_ == 2 ? (abg) this.queryType_ : abg.getDefaultInstance();
        }

        @Override // p000.mmg.InterfaceC9420f
        public boolean hasStructuredQuery() {
            return this.queryTypeCase_ == 2;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9415a c9415a = null;
            switch (C9415a.f61515a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9419e();
                case 2:
                    return new a(c9415a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", abg.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9419e> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9419e.class) {
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

        public static a newBuilder(C9419e c9419e) {
            return DEFAULT_INSTANCE.m23739o(c9419e);
        }

        public static C9419e parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9419e) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9419e parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9419e) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9419e parseFrom(vj1 vj1Var) throws ce8 {
            return (C9419e) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C9419e parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9419e) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9419e parseFrom(byte[] bArr) throws ce8 {
            return (C9419e) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9419e parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9419e) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9419e parseFrom(InputStream inputStream) throws IOException {
            return (C9419e) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9419e parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9419e) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9419e parseFrom(f72 f72Var) throws IOException {
            return (C9419e) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9419e parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9419e) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: mmg$f */
    public interface InterfaceC9420f extends rsa {
        String getParent();

        vj1 getParentBytes();

        C9419e.b getQueryTypeCase();

        abg getStructuredQuery();

        boolean hasStructuredQuery();
    }

    /* JADX INFO: renamed from: mmg$g */
    public enum EnumC9421g {
        RESUME_TOKEN(4),
        READ_TIME(11),
        RESUMETYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f61524a;

        EnumC9421g(int i) {
            this.f61524a = i;
        }

        public static EnumC9421g forNumber(int i) {
            if (i == 0) {
                return RESUMETYPE_NOT_SET;
            }
            if (i == 4) {
                return RESUME_TOKEN;
            }
            if (i != 11) {
                return null;
            }
            return READ_TIME;
        }

        public int getNumber() {
            return this.f61524a;
        }

        @Deprecated
        public static EnumC9421g valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: renamed from: mmg$h */
    public enum EnumC9422h {
        QUERY(2),
        DOCUMENTS(3),
        TARGETTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f61529a;

        EnumC9422h(int i) {
            this.f61529a = i;
        }

        public static EnumC9422h forNumber(int i) {
            if (i == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i == 2) {
                return QUERY;
            }
            if (i != 3) {
                return null;
            }
            return DOCUMENTS;
        }

        public int getNumber() {
            return this.f61529a;
        }

        @Deprecated
        public static EnumC9422h valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        mmg mmgVar = new mmg();
        DEFAULT_INSTANCE = mmgVar;
        v27.m23715h0(mmg.class, mmgVar);
    }

    private mmg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocuments() {
        if (this.targetTypeCase_ == 3) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpectedCount() {
        this.expectedCount_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnce() {
        this.once_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        if (this.targetTypeCase_ == 2) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        if (this.resumeTypeCase_ == 11) {
            this.resumeTypeCase_ = 0;
            this.resumeType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeToken() {
        if (this.resumeTypeCase_ == 4) {
            this.resumeTypeCase_ = 0;
            this.resumeType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeType() {
        this.resumeTypeCase_ = 0;
        this.resumeType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetId() {
        this.targetId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetType() {
        this.targetTypeCase_ = 0;
        this.targetType_ = null;
    }

    public static mmg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocuments(C9417c c9417c) {
        c9417c.getClass();
        if (this.targetTypeCase_ != 3 || this.targetType_ == C9417c.getDefaultInstance()) {
            this.targetType_ = c9417c;
        } else {
            this.targetType_ = C9417c.newBuilder((C9417c) this.targetType_).mergeFrom(c9417c).buildPartial();
        }
        this.targetTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExpectedCount(t58 t58Var) {
        t58Var.getClass();
        t58 t58Var2 = this.expectedCount_;
        if (t58Var2 == null || t58Var2 == t58.getDefaultInstance()) {
            this.expectedCount_ = t58Var;
        } else {
            this.expectedCount_ = t58.newBuilder(this.expectedCount_).mergeFrom(t58Var).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuery(C9419e c9419e) {
        c9419e.getClass();
        if (this.targetTypeCase_ != 2 || this.targetType_ == C9419e.getDefaultInstance()) {
            this.targetType_ = c9419e;
        } else {
            this.targetType_ = C9419e.newBuilder((C9419e) this.targetType_).mergeFrom(c9419e).buildPartial();
        }
        this.targetTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(f2h f2hVar) {
        f2hVar.getClass();
        if (this.resumeTypeCase_ != 11 || this.resumeType_ == f2h.getDefaultInstance()) {
            this.resumeType_ = f2hVar;
        } else {
            this.resumeType_ = f2h.newBuilder((f2h) this.resumeType_).mergeFrom(f2hVar).buildPartial();
        }
        this.resumeTypeCase_ = 11;
    }

    public static C9416b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static mmg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (mmg) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static mmg parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (mmg) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<mmg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocuments(C9417c c9417c) {
        c9417c.getClass();
        this.targetType_ = c9417c;
        this.targetTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpectedCount(t58 t58Var) {
        t58Var.getClass();
        this.expectedCount_ = t58Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnce(boolean z) {
        this.once_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(C9419e c9419e) {
        c9419e.getClass();
        this.targetType_ = c9419e;
        this.targetTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(f2h f2hVar) {
        f2hVar.getClass();
        this.resumeType_ = f2hVar;
        this.resumeTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeToken(vj1 vj1Var) {
        vj1Var.getClass();
        this.resumeTypeCase_ = 4;
        this.resumeType_ = vj1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetId(int i) {
        this.targetId_ = i;
    }

    @Override // p000.eng
    public C9417c getDocuments() {
        return this.targetTypeCase_ == 3 ? (C9417c) this.targetType_ : C9417c.getDefaultInstance();
    }

    @Override // p000.eng
    public t58 getExpectedCount() {
        t58 t58Var = this.expectedCount_;
        return t58Var == null ? t58.getDefaultInstance() : t58Var;
    }

    @Override // p000.eng
    public boolean getOnce() {
        return this.once_;
    }

    @Override // p000.eng
    public C9419e getQuery() {
        return this.targetTypeCase_ == 2 ? (C9419e) this.targetType_ : C9419e.getDefaultInstance();
    }

    @Override // p000.eng
    public f2h getReadTime() {
        return this.resumeTypeCase_ == 11 ? (f2h) this.resumeType_ : f2h.getDefaultInstance();
    }

    @Override // p000.eng
    public vj1 getResumeToken() {
        return this.resumeTypeCase_ == 4 ? (vj1) this.resumeType_ : vj1.f91344e;
    }

    @Override // p000.eng
    public EnumC9421g getResumeTypeCase() {
        return EnumC9421g.forNumber(this.resumeTypeCase_);
    }

    @Override // p000.eng
    public int getTargetId() {
        return this.targetId_;
    }

    @Override // p000.eng
    public EnumC9422h getTargetTypeCase() {
        return EnumC9422h.forNumber(this.targetTypeCase_);
    }

    @Override // p000.eng
    public boolean hasDocuments() {
        return this.targetTypeCase_ == 3;
    }

    @Override // p000.eng
    public boolean hasExpectedCount() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.eng
    public boolean hasQuery() {
        return this.targetTypeCase_ == 2;
    }

    @Override // p000.eng
    public boolean hasReadTime() {
        return this.resumeTypeCase_ == 11;
    }

    @Override // p000.eng
    public boolean hasResumeToken() {
        return this.resumeTypeCase_ == 4;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C9415a c9415a = null;
        switch (C9415a.f61515a[enumC13830i.ordinal()]) {
            case 1:
                return new mmg();
            case 2:
                return new C9416b(c9415a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0001\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", C9419e.class, C9417c.class, "targetId_", "once_", f2h.class, "expectedCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<mmg> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (mmg.class) {
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

    public static C9416b newBuilder(mmg mmgVar) {
        return DEFAULT_INSTANCE.m23739o(mmgVar);
    }

    public static mmg parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (mmg) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static mmg parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (mmg) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static mmg parseFrom(vj1 vj1Var) throws ce8 {
        return (mmg) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static mmg parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (mmg) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static mmg parseFrom(byte[] bArr) throws ce8 {
        return (mmg) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static mmg parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (mmg) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static mmg parseFrom(InputStream inputStream) throws IOException {
        return (mmg) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static mmg parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (mmg) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static mmg parseFrom(f72 f72Var) throws IOException {
        return (mmg) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static mmg parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (mmg) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
