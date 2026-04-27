package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class abc extends v27<abc, C0150b> implements cbc {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final abc DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<abc> PARSER = null;
    public static final int SUBPAGES_FIELD_NUMBER = 3;
    private String name_ = "";
    private String content_ = "";
    private w98.InterfaceC14504k<abc> subpages_ = v27.m23722x();

    /* JADX INFO: renamed from: abc$a */
    public static /* synthetic */ class C0149a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f963a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f963a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f963a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f963a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f963a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f963a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f963a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f963a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: abc$b */
    public static final class C0150b extends v27.AbstractC13823b<abc, C0150b> implements cbc {
        public /* synthetic */ C0150b(C0149a c0149a) {
            this();
        }

        public C0150b addAllSubpages(Iterable<? extends abc> iterable) {
            m23743e();
            ((abc) this.f89756b).addAllSubpages(iterable);
            return this;
        }

        public C0150b addSubpages(abc abcVar) {
            m23743e();
            ((abc) this.f89756b).addSubpages(abcVar);
            return this;
        }

        public C0150b clearContent() {
            m23743e();
            ((abc) this.f89756b).clearContent();
            return this;
        }

        public C0150b clearName() {
            m23743e();
            ((abc) this.f89756b).clearName();
            return this;
        }

        public C0150b clearSubpages() {
            m23743e();
            ((abc) this.f89756b).clearSubpages();
            return this;
        }

        @Override // p000.cbc
        public String getContent() {
            return ((abc) this.f89756b).getContent();
        }

        @Override // p000.cbc
        public vj1 getContentBytes() {
            return ((abc) this.f89756b).getContentBytes();
        }

        @Override // p000.cbc
        public String getName() {
            return ((abc) this.f89756b).getName();
        }

        @Override // p000.cbc
        public vj1 getNameBytes() {
            return ((abc) this.f89756b).getNameBytes();
        }

        @Override // p000.cbc
        public abc getSubpages(int i) {
            return ((abc) this.f89756b).getSubpages(i);
        }

        @Override // p000.cbc
        public int getSubpagesCount() {
            return ((abc) this.f89756b).getSubpagesCount();
        }

        @Override // p000.cbc
        public List<abc> getSubpagesList() {
            return Collections.unmodifiableList(((abc) this.f89756b).getSubpagesList());
        }

        public C0150b removeSubpages(int i) {
            m23743e();
            ((abc) this.f89756b).removeSubpages(i);
            return this;
        }

        public C0150b setContent(String str) {
            m23743e();
            ((abc) this.f89756b).setContent(str);
            return this;
        }

        public C0150b setContentBytes(vj1 vj1Var) {
            m23743e();
            ((abc) this.f89756b).setContentBytes(vj1Var);
            return this;
        }

        public C0150b setName(String str) {
            m23743e();
            ((abc) this.f89756b).setName(str);
            return this;
        }

        public C0150b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((abc) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C0150b setSubpages(int i, abc abcVar) {
            m23743e();
            ((abc) this.f89756b).setSubpages(i, abcVar);
            return this;
        }

        private C0150b() {
            super(abc.DEFAULT_INSTANCE);
        }

        public C0150b addSubpages(int i, abc abcVar) {
            m23743e();
            ((abc) this.f89756b).addSubpages(i, abcVar);
            return this;
        }

        public C0150b setSubpages(int i, C0150b c0150b) {
            m23743e();
            ((abc) this.f89756b).setSubpages(i, c0150b.build());
            return this;
        }

        public C0150b addSubpages(C0150b c0150b) {
            m23743e();
            ((abc) this.f89756b).addSubpages(c0150b.build());
            return this;
        }

        public C0150b addSubpages(int i, C0150b c0150b) {
            m23743e();
            ((abc) this.f89756b).addSubpages(i, c0150b.build());
            return this;
        }
    }

    static {
        abc abcVar = new abc();
        DEFAULT_INSTANCE = abcVar;
        v27.m23715h0(abc.class, abcVar);
    }

    private abc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubpages(Iterable<? extends abc> iterable) {
        ensureSubpagesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.subpages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubpages(abc abcVar) {
        abcVar.getClass();
        ensureSubpagesIsMutable();
        this.subpages_.add(abcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubpages() {
        this.subpages_ = v27.m23722x();
    }

    private void ensureSubpagesIsMutable() {
        w98.InterfaceC14504k<abc> interfaceC14504k = this.subpages_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.subpages_ = v27.m23698P(interfaceC14504k);
    }

    public static abc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0150b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static abc parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (abc) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static abc parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (abc) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<abc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubpages(int i) {
        ensureSubpagesIsMutable();
        this.subpages_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.content_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.name_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubpages(int i, abc abcVar) {
        abcVar.getClass();
        ensureSubpagesIsMutable();
        this.subpages_.set(i, abcVar);
    }

    @Override // p000.cbc
    public String getContent() {
        return this.content_;
    }

    @Override // p000.cbc
    public vj1 getContentBytes() {
        return vj1.copyFromUtf8(this.content_);
    }

    @Override // p000.cbc
    public String getName() {
        return this.name_;
    }

    @Override // p000.cbc
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.cbc
    public abc getSubpages(int i) {
        return this.subpages_.get(i);
    }

    @Override // p000.cbc
    public int getSubpagesCount() {
        return this.subpages_.size();
    }

    @Override // p000.cbc
    public List<abc> getSubpagesList() {
        return this.subpages_;
    }

    public cbc getSubpagesOrBuilder(int i) {
        return this.subpages_.get(i);
    }

    public List<? extends cbc> getSubpagesOrBuilderList() {
        return this.subpages_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C0149a c0149a = null;
        switch (C0149a.f963a[enumC13830i.ordinal()]) {
            case 1:
                return new abc();
            case 2:
                return new C0150b(c0149a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"name_", "content_", "subpages_", abc.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<abc> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (abc.class) {
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

    public static C0150b newBuilder(abc abcVar) {
        return DEFAULT_INSTANCE.m23739o(abcVar);
    }

    public static abc parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (abc) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static abc parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (abc) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static abc parseFrom(vj1 vj1Var) throws ce8 {
        return (abc) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubpages(int i, abc abcVar) {
        abcVar.getClass();
        ensureSubpagesIsMutable();
        this.subpages_.add(i, abcVar);
    }

    public static abc parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (abc) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static abc parseFrom(byte[] bArr) throws ce8 {
        return (abc) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static abc parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (abc) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static abc parseFrom(InputStream inputStream) throws IOException {
        return (abc) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static abc parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (abc) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static abc parseFrom(f72 f72Var) throws IOException {
        return (abc) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static abc parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (abc) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
