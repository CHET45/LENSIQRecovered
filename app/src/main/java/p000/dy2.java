package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class dy2 extends v27<dy2, C5001b> implements ey2 {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    private static final dy2 DEFAULT_INSTANCE;
    private static volatile uhc<dy2> PARSER = null;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private w98.InterfaceC14504k<String> requested_ = v27.m23722x();
    private w98.InterfaceC14504k<String> provided_ = v27.m23722x();
    private w98.InterfaceC14504k<String> allowedRequestExtensions_ = v27.m23722x();
    private w98.InterfaceC14504k<String> allowedResponseExtensions_ = v27.m23722x();

    /* JADX INFO: renamed from: dy2$a */
    public static /* synthetic */ class C5000a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31267a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f31267a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31267a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31267a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31267a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31267a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31267a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31267a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: dy2$b */
    public static final class C5001b extends v27.AbstractC13823b<dy2, C5001b> implements ey2 {
        public /* synthetic */ C5001b(C5000a c5000a) {
            this();
        }

        public C5001b addAllAllowedRequestExtensions(Iterable<String> iterable) {
            m23743e();
            ((dy2) this.f89756b).addAllAllowedRequestExtensions(iterable);
            return this;
        }

        public C5001b addAllAllowedResponseExtensions(Iterable<String> iterable) {
            m23743e();
            ((dy2) this.f89756b).addAllAllowedResponseExtensions(iterable);
            return this;
        }

        public C5001b addAllProvided(Iterable<String> iterable) {
            m23743e();
            ((dy2) this.f89756b).addAllProvided(iterable);
            return this;
        }

        public C5001b addAllRequested(Iterable<String> iterable) {
            m23743e();
            ((dy2) this.f89756b).addAllRequested(iterable);
            return this;
        }

        public C5001b addAllowedRequestExtensions(String str) {
            m23743e();
            ((dy2) this.f89756b).addAllowedRequestExtensions(str);
            return this;
        }

        public C5001b addAllowedRequestExtensionsBytes(vj1 vj1Var) {
            m23743e();
            ((dy2) this.f89756b).addAllowedRequestExtensionsBytes(vj1Var);
            return this;
        }

        public C5001b addAllowedResponseExtensions(String str) {
            m23743e();
            ((dy2) this.f89756b).addAllowedResponseExtensions(str);
            return this;
        }

        public C5001b addAllowedResponseExtensionsBytes(vj1 vj1Var) {
            m23743e();
            ((dy2) this.f89756b).addAllowedResponseExtensionsBytes(vj1Var);
            return this;
        }

        public C5001b addProvided(String str) {
            m23743e();
            ((dy2) this.f89756b).addProvided(str);
            return this;
        }

        public C5001b addProvidedBytes(vj1 vj1Var) {
            m23743e();
            ((dy2) this.f89756b).addProvidedBytes(vj1Var);
            return this;
        }

        public C5001b addRequested(String str) {
            m23743e();
            ((dy2) this.f89756b).addRequested(str);
            return this;
        }

        public C5001b addRequestedBytes(vj1 vj1Var) {
            m23743e();
            ((dy2) this.f89756b).addRequestedBytes(vj1Var);
            return this;
        }

        public C5001b clearAllowedRequestExtensions() {
            m23743e();
            ((dy2) this.f89756b).clearAllowedRequestExtensions();
            return this;
        }

        public C5001b clearAllowedResponseExtensions() {
            m23743e();
            ((dy2) this.f89756b).clearAllowedResponseExtensions();
            return this;
        }

        public C5001b clearProvided() {
            m23743e();
            ((dy2) this.f89756b).clearProvided();
            return this;
        }

        public C5001b clearRequested() {
            m23743e();
            ((dy2) this.f89756b).clearRequested();
            return this;
        }

        public C5001b clearSelector() {
            m23743e();
            ((dy2) this.f89756b).clearSelector();
            return this;
        }

        @Override // p000.ey2
        public String getAllowedRequestExtensions(int i) {
            return ((dy2) this.f89756b).getAllowedRequestExtensions(i);
        }

        @Override // p000.ey2
        public vj1 getAllowedRequestExtensionsBytes(int i) {
            return ((dy2) this.f89756b).getAllowedRequestExtensionsBytes(i);
        }

        @Override // p000.ey2
        public int getAllowedRequestExtensionsCount() {
            return ((dy2) this.f89756b).getAllowedRequestExtensionsCount();
        }

        @Override // p000.ey2
        public List<String> getAllowedRequestExtensionsList() {
            return Collections.unmodifiableList(((dy2) this.f89756b).getAllowedRequestExtensionsList());
        }

        @Override // p000.ey2
        public String getAllowedResponseExtensions(int i) {
            return ((dy2) this.f89756b).getAllowedResponseExtensions(i);
        }

        @Override // p000.ey2
        public vj1 getAllowedResponseExtensionsBytes(int i) {
            return ((dy2) this.f89756b).getAllowedResponseExtensionsBytes(i);
        }

        @Override // p000.ey2
        public int getAllowedResponseExtensionsCount() {
            return ((dy2) this.f89756b).getAllowedResponseExtensionsCount();
        }

        @Override // p000.ey2
        public List<String> getAllowedResponseExtensionsList() {
            return Collections.unmodifiableList(((dy2) this.f89756b).getAllowedResponseExtensionsList());
        }

        @Override // p000.ey2
        public String getProvided(int i) {
            return ((dy2) this.f89756b).getProvided(i);
        }

        @Override // p000.ey2
        public vj1 getProvidedBytes(int i) {
            return ((dy2) this.f89756b).getProvidedBytes(i);
        }

        @Override // p000.ey2
        public int getProvidedCount() {
            return ((dy2) this.f89756b).getProvidedCount();
        }

        @Override // p000.ey2
        public List<String> getProvidedList() {
            return Collections.unmodifiableList(((dy2) this.f89756b).getProvidedList());
        }

        @Override // p000.ey2
        public String getRequested(int i) {
            return ((dy2) this.f89756b).getRequested(i);
        }

        @Override // p000.ey2
        public vj1 getRequestedBytes(int i) {
            return ((dy2) this.f89756b).getRequestedBytes(i);
        }

        @Override // p000.ey2
        public int getRequestedCount() {
            return ((dy2) this.f89756b).getRequestedCount();
        }

        @Override // p000.ey2
        public List<String> getRequestedList() {
            return Collections.unmodifiableList(((dy2) this.f89756b).getRequestedList());
        }

        @Override // p000.ey2
        public String getSelector() {
            return ((dy2) this.f89756b).getSelector();
        }

        @Override // p000.ey2
        public vj1 getSelectorBytes() {
            return ((dy2) this.f89756b).getSelectorBytes();
        }

        public C5001b setAllowedRequestExtensions(int i, String str) {
            m23743e();
            ((dy2) this.f89756b).setAllowedRequestExtensions(i, str);
            return this;
        }

        public C5001b setAllowedResponseExtensions(int i, String str) {
            m23743e();
            ((dy2) this.f89756b).setAllowedResponseExtensions(i, str);
            return this;
        }

        public C5001b setProvided(int i, String str) {
            m23743e();
            ((dy2) this.f89756b).setProvided(i, str);
            return this;
        }

        public C5001b setRequested(int i, String str) {
            m23743e();
            ((dy2) this.f89756b).setRequested(i, str);
            return this;
        }

        public C5001b setSelector(String str) {
            m23743e();
            ((dy2) this.f89756b).setSelector(str);
            return this;
        }

        public C5001b setSelectorBytes(vj1 vj1Var) {
            m23743e();
            ((dy2) this.f89756b).setSelectorBytes(vj1Var);
            return this;
        }

        private C5001b() {
            super(dy2.DEFAULT_INSTANCE);
        }
    }

    static {
        dy2 dy2Var = new dy2();
        DEFAULT_INSTANCE = dy2Var;
        v27.m23715h0(dy2.class, dy2Var);
    }

    private dy2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowedRequestExtensions(Iterable<String> iterable) {
        ensureAllowedRequestExtensionsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.allowedRequestExtensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowedResponseExtensions(Iterable<String> iterable) {
        ensureAllowedResponseExtensionsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.allowedResponseExtensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProvided(Iterable<String> iterable) {
        ensureProvidedIsMutable();
        AbstractC1714b3.m2856b(iterable, this.provided_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequested(Iterable<String> iterable) {
        ensureRequestedIsMutable();
        AbstractC1714b3.m2856b(iterable, this.requested_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedRequestExtensions(String str) {
        str.getClass();
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedRequestExtensionsBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedResponseExtensions(String str) {
        str.getClass();
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedResponseExtensionsBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvided(String str) {
        str.getClass();
        ensureProvidedIsMutable();
        this.provided_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvidedBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensureProvidedIsMutable();
        this.provided_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequested(String str) {
        str.getClass();
        ensureRequestedIsMutable();
        this.requested_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequestedBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensureRequestedIsMutable();
        this.requested_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedRequestExtensions() {
        this.allowedRequestExtensions_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedResponseExtensions() {
        this.allowedResponseExtensions_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvided() {
        this.provided_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequested() {
        this.requested_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureAllowedRequestExtensionsIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.allowedRequestExtensions_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.allowedRequestExtensions_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureAllowedResponseExtensionsIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.allowedResponseExtensions_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.allowedResponseExtensions_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureProvidedIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.provided_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.provided_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureRequestedIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.requested_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.requested_ = v27.m23698P(interfaceC14504k);
    }

    public static dy2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5001b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static dy2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (dy2) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static dy2 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (dy2) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<dy2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedRequestExtensions(int i, String str) {
        str.getClass();
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedResponseExtensions(int i, String str) {
        str.getClass();
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvided(int i, String str) {
        str.getClass();
        ensureProvidedIsMutable();
        this.provided_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequested(int i, String str) {
        str.getClass();
        ensureRequestedIsMutable();
        this.requested_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.selector_ = vj1Var.toStringUtf8();
    }

    @Override // p000.ey2
    public String getAllowedRequestExtensions(int i) {
        return this.allowedRequestExtensions_.get(i);
    }

    @Override // p000.ey2
    public vj1 getAllowedRequestExtensionsBytes(int i) {
        return vj1.copyFromUtf8(this.allowedRequestExtensions_.get(i));
    }

    @Override // p000.ey2
    public int getAllowedRequestExtensionsCount() {
        return this.allowedRequestExtensions_.size();
    }

    @Override // p000.ey2
    public List<String> getAllowedRequestExtensionsList() {
        return this.allowedRequestExtensions_;
    }

    @Override // p000.ey2
    public String getAllowedResponseExtensions(int i) {
        return this.allowedResponseExtensions_.get(i);
    }

    @Override // p000.ey2
    public vj1 getAllowedResponseExtensionsBytes(int i) {
        return vj1.copyFromUtf8(this.allowedResponseExtensions_.get(i));
    }

    @Override // p000.ey2
    public int getAllowedResponseExtensionsCount() {
        return this.allowedResponseExtensions_.size();
    }

    @Override // p000.ey2
    public List<String> getAllowedResponseExtensionsList() {
        return this.allowedResponseExtensions_;
    }

    @Override // p000.ey2
    public String getProvided(int i) {
        return this.provided_.get(i);
    }

    @Override // p000.ey2
    public vj1 getProvidedBytes(int i) {
        return vj1.copyFromUtf8(this.provided_.get(i));
    }

    @Override // p000.ey2
    public int getProvidedCount() {
        return this.provided_.size();
    }

    @Override // p000.ey2
    public List<String> getProvidedList() {
        return this.provided_;
    }

    @Override // p000.ey2
    public String getRequested(int i) {
        return this.requested_.get(i);
    }

    @Override // p000.ey2
    public vj1 getRequestedBytes(int i) {
        return vj1.copyFromUtf8(this.requested_.get(i));
    }

    @Override // p000.ey2
    public int getRequestedCount() {
        return this.requested_.size();
    }

    @Override // p000.ey2
    public List<String> getRequestedList() {
        return this.requested_;
    }

    @Override // p000.ey2
    public String getSelector() {
        return this.selector_;
    }

    @Override // p000.ey2
    public vj1 getSelectorBytes() {
        return vj1.copyFromUtf8(this.selector_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C5000a c5000a = null;
        switch (C5000a.f31267a[enumC13830i.ordinal()]) {
            case 1:
                return new dy2();
            case 2:
                return new C5001b(c5000a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0004\u0000\u0001Ȉ\u0002Ț\u0003Ț\u0004Ț\u0005Ț", new Object[]{"selector_", "requested_", "provided_", "allowedRequestExtensions_", "allowedResponseExtensions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<dy2> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (dy2.class) {
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

    public static C5001b newBuilder(dy2 dy2Var) {
        return DEFAULT_INSTANCE.m23739o(dy2Var);
    }

    public static dy2 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (dy2) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static dy2 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (dy2) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static dy2 parseFrom(vj1 vj1Var) throws ce8 {
        return (dy2) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static dy2 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (dy2) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static dy2 parseFrom(byte[] bArr) throws ce8 {
        return (dy2) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static dy2 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (dy2) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static dy2 parseFrom(InputStream inputStream) throws IOException {
        return (dy2) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static dy2 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (dy2) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static dy2 parseFrom(f72 f72Var) throws IOException {
        return (dy2) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static dy2 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (dy2) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
