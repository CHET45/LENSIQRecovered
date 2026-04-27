package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.abc;
import p000.hj4;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class ej4 extends v27<ej4, C5342b> implements fj4 {
    private static final ej4 DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_ROOT_URL_FIELD_NUMBER = 4;
    public static final int OVERVIEW_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 5;
    private static volatile uhc<ej4> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 3;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    private String summary_ = "";
    private w98.InterfaceC14504k<abc> pages_ = v27.m23722x();
    private w98.InterfaceC14504k<hj4> rules_ = v27.m23722x();
    private String documentationRootUrl_ = "";
    private String overview_ = "";

    /* JADX INFO: renamed from: ej4$a */
    public static /* synthetic */ class C5341a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33191a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f33191a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33191a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33191a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33191a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33191a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33191a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33191a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: ej4$b */
    public static final class C5342b extends v27.AbstractC13823b<ej4, C5342b> implements fj4 {
        public /* synthetic */ C5342b(C5341a c5341a) {
            this();
        }

        public C5342b addAllPages(Iterable<? extends abc> iterable) {
            m23743e();
            ((ej4) this.f89756b).addAllPages(iterable);
            return this;
        }

        public C5342b addAllRules(Iterable<? extends hj4> iterable) {
            m23743e();
            ((ej4) this.f89756b).addAllRules(iterable);
            return this;
        }

        public C5342b addPages(abc abcVar) {
            m23743e();
            ((ej4) this.f89756b).addPages(abcVar);
            return this;
        }

        public C5342b addRules(hj4 hj4Var) {
            m23743e();
            ((ej4) this.f89756b).addRules(hj4Var);
            return this;
        }

        public C5342b clearDocumentationRootUrl() {
            m23743e();
            ((ej4) this.f89756b).clearDocumentationRootUrl();
            return this;
        }

        public C5342b clearOverview() {
            m23743e();
            ((ej4) this.f89756b).clearOverview();
            return this;
        }

        public C5342b clearPages() {
            m23743e();
            ((ej4) this.f89756b).clearPages();
            return this;
        }

        public C5342b clearRules() {
            m23743e();
            ((ej4) this.f89756b).clearRules();
            return this;
        }

        public C5342b clearSummary() {
            m23743e();
            ((ej4) this.f89756b).clearSummary();
            return this;
        }

        @Override // p000.fj4
        public String getDocumentationRootUrl() {
            return ((ej4) this.f89756b).getDocumentationRootUrl();
        }

        @Override // p000.fj4
        public vj1 getDocumentationRootUrlBytes() {
            return ((ej4) this.f89756b).getDocumentationRootUrlBytes();
        }

        @Override // p000.fj4
        public String getOverview() {
            return ((ej4) this.f89756b).getOverview();
        }

        @Override // p000.fj4
        public vj1 getOverviewBytes() {
            return ((ej4) this.f89756b).getOverviewBytes();
        }

        @Override // p000.fj4
        public abc getPages(int i) {
            return ((ej4) this.f89756b).getPages(i);
        }

        @Override // p000.fj4
        public int getPagesCount() {
            return ((ej4) this.f89756b).getPagesCount();
        }

        @Override // p000.fj4
        public List<abc> getPagesList() {
            return Collections.unmodifiableList(((ej4) this.f89756b).getPagesList());
        }

        @Override // p000.fj4
        public hj4 getRules(int i) {
            return ((ej4) this.f89756b).getRules(i);
        }

        @Override // p000.fj4
        public int getRulesCount() {
            return ((ej4) this.f89756b).getRulesCount();
        }

        @Override // p000.fj4
        public List<hj4> getRulesList() {
            return Collections.unmodifiableList(((ej4) this.f89756b).getRulesList());
        }

        @Override // p000.fj4
        public String getSummary() {
            return ((ej4) this.f89756b).getSummary();
        }

        @Override // p000.fj4
        public vj1 getSummaryBytes() {
            return ((ej4) this.f89756b).getSummaryBytes();
        }

        public C5342b removePages(int i) {
            m23743e();
            ((ej4) this.f89756b).removePages(i);
            return this;
        }

        public C5342b removeRules(int i) {
            m23743e();
            ((ej4) this.f89756b).removeRules(i);
            return this;
        }

        public C5342b setDocumentationRootUrl(String str) {
            m23743e();
            ((ej4) this.f89756b).setDocumentationRootUrl(str);
            return this;
        }

        public C5342b setDocumentationRootUrlBytes(vj1 vj1Var) {
            m23743e();
            ((ej4) this.f89756b).setDocumentationRootUrlBytes(vj1Var);
            return this;
        }

        public C5342b setOverview(String str) {
            m23743e();
            ((ej4) this.f89756b).setOverview(str);
            return this;
        }

        public C5342b setOverviewBytes(vj1 vj1Var) {
            m23743e();
            ((ej4) this.f89756b).setOverviewBytes(vj1Var);
            return this;
        }

        public C5342b setPages(int i, abc abcVar) {
            m23743e();
            ((ej4) this.f89756b).setPages(i, abcVar);
            return this;
        }

        public C5342b setRules(int i, hj4 hj4Var) {
            m23743e();
            ((ej4) this.f89756b).setRules(i, hj4Var);
            return this;
        }

        public C5342b setSummary(String str) {
            m23743e();
            ((ej4) this.f89756b).setSummary(str);
            return this;
        }

        public C5342b setSummaryBytes(vj1 vj1Var) {
            m23743e();
            ((ej4) this.f89756b).setSummaryBytes(vj1Var);
            return this;
        }

        private C5342b() {
            super(ej4.DEFAULT_INSTANCE);
        }

        public C5342b addPages(int i, abc abcVar) {
            m23743e();
            ((ej4) this.f89756b).addPages(i, abcVar);
            return this;
        }

        public C5342b addRules(int i, hj4 hj4Var) {
            m23743e();
            ((ej4) this.f89756b).addRules(i, hj4Var);
            return this;
        }

        public C5342b setPages(int i, abc.C0150b c0150b) {
            m23743e();
            ((ej4) this.f89756b).setPages(i, c0150b.build());
            return this;
        }

        public C5342b setRules(int i, hj4.C6871b c6871b) {
            m23743e();
            ((ej4) this.f89756b).setRules(i, c6871b.build());
            return this;
        }

        public C5342b addPages(abc.C0150b c0150b) {
            m23743e();
            ((ej4) this.f89756b).addPages(c0150b.build());
            return this;
        }

        public C5342b addRules(hj4.C6871b c6871b) {
            m23743e();
            ((ej4) this.f89756b).addRules(c6871b.build());
            return this;
        }

        public C5342b addPages(int i, abc.C0150b c0150b) {
            m23743e();
            ((ej4) this.f89756b).addPages(i, c0150b.build());
            return this;
        }

        public C5342b addRules(int i, hj4.C6871b c6871b) {
            m23743e();
            ((ej4) this.f89756b).addRules(i, c6871b.build());
            return this;
        }
    }

    static {
        ej4 ej4Var = new ej4();
        DEFAULT_INSTANCE = ej4Var;
        v27.m23715h0(ej4.class, ej4Var);
    }

    private ej4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPages(Iterable<? extends abc> iterable) {
        ensurePagesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.pages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends hj4> iterable) {
        ensureRulesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPages(abc abcVar) {
        abcVar.getClass();
        ensurePagesIsMutable();
        this.pages_.add(abcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(hj4 hj4Var) {
        hj4Var.getClass();
        ensureRulesIsMutable();
        this.rules_.add(hj4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentationRootUrl() {
        this.documentationRootUrl_ = getDefaultInstance().getDocumentationRootUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOverview() {
        this.overview_ = getDefaultInstance().getOverview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPages() {
        this.pages_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSummary() {
        this.summary_ = getDefaultInstance().getSummary();
    }

    private void ensurePagesIsMutable() {
        w98.InterfaceC14504k<abc> interfaceC14504k = this.pages_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.pages_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureRulesIsMutable() {
        w98.InterfaceC14504k<hj4> interfaceC14504k = this.rules_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.rules_ = v27.m23698P(interfaceC14504k);
    }

    public static ej4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5342b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static ej4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ej4) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static ej4 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (ej4) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<ej4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePages(int i) {
        ensurePagesIsMutable();
        this.pages_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentationRootUrl(String str) {
        str.getClass();
        this.documentationRootUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentationRootUrlBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.documentationRootUrl_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverview(String str) {
        str.getClass();
        this.overview_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverviewBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.overview_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPages(int i, abc abcVar) {
        abcVar.getClass();
        ensurePagesIsMutable();
        this.pages_.set(i, abcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i, hj4 hj4Var) {
        hj4Var.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, hj4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSummary(String str) {
        str.getClass();
        this.summary_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSummaryBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.summary_ = vj1Var.toStringUtf8();
    }

    @Override // p000.fj4
    public String getDocumentationRootUrl() {
        return this.documentationRootUrl_;
    }

    @Override // p000.fj4
    public vj1 getDocumentationRootUrlBytes() {
        return vj1.copyFromUtf8(this.documentationRootUrl_);
    }

    @Override // p000.fj4
    public String getOverview() {
        return this.overview_;
    }

    @Override // p000.fj4
    public vj1 getOverviewBytes() {
        return vj1.copyFromUtf8(this.overview_);
    }

    @Override // p000.fj4
    public abc getPages(int i) {
        return this.pages_.get(i);
    }

    @Override // p000.fj4
    public int getPagesCount() {
        return this.pages_.size();
    }

    @Override // p000.fj4
    public List<abc> getPagesList() {
        return this.pages_;
    }

    public cbc getPagesOrBuilder(int i) {
        return this.pages_.get(i);
    }

    public List<? extends cbc> getPagesOrBuilderList() {
        return this.pages_;
    }

    @Override // p000.fj4
    public hj4 getRules(int i) {
        return this.rules_.get(i);
    }

    @Override // p000.fj4
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // p000.fj4
    public List<hj4> getRulesList() {
        return this.rules_;
    }

    public ij4 getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public List<? extends ij4> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override // p000.fj4
    public String getSummary() {
        return this.summary_;
    }

    @Override // p000.fj4
    public vj1 getSummaryBytes() {
        return vj1.copyFromUtf8(this.summary_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C5341a c5341a = null;
        switch (C5341a.f33191a[enumC13830i.ordinal()]) {
            case 1:
                return new ej4();
            case 2:
                return new C5342b(c5341a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005\u001b", new Object[]{"summary_", "overview_", "rules_", hj4.class, "documentationRootUrl_", "pages_", abc.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<ej4> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (ej4.class) {
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

    public static C5342b newBuilder(ej4 ej4Var) {
        return DEFAULT_INSTANCE.m23739o(ej4Var);
    }

    public static ej4 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ej4) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ej4 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (ej4) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static ej4 parseFrom(vj1 vj1Var) throws ce8 {
        return (ej4) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPages(int i, abc abcVar) {
        abcVar.getClass();
        ensurePagesIsMutable();
        this.pages_.add(i, abcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i, hj4 hj4Var) {
        hj4Var.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, hj4Var);
    }

    public static ej4 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (ej4) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static ej4 parseFrom(byte[] bArr) throws ce8 {
        return (ej4) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static ej4 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (ej4) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static ej4 parseFrom(InputStream inputStream) throws IOException {
        return (ej4) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static ej4 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ej4) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ej4 parseFrom(f72 f72Var) throws IOException {
        return (ej4) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static ej4 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (ej4) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
