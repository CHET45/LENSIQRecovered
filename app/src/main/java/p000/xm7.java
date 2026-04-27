package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.C15896yz;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class xm7 extends v27<xm7, C15199b> implements ym7 {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final xm7 DEFAULT_INSTANCE;
    public static final int EXTENSIONS_FIELD_NUMBER = 3;
    private static volatile uhc<xm7> PARSER;
    private String contentType_ = "";
    private vj1 data_ = vj1.f91344e;
    private w98.InterfaceC14504k<C15896yz> extensions_ = v27.m23722x();

    /* JADX INFO: renamed from: xm7$a */
    public static /* synthetic */ class C15198a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f98500a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f98500a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98500a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98500a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98500a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98500a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f98500a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f98500a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: xm7$b */
    public static final class C15199b extends v27.AbstractC13823b<xm7, C15199b> implements ym7 {
        public /* synthetic */ C15199b(C15198a c15198a) {
            this();
        }

        public C15199b addAllExtensions(Iterable<? extends C15896yz> iterable) {
            m23743e();
            ((xm7) this.f89756b).addAllExtensions(iterable);
            return this;
        }

        public C15199b addExtensions(C15896yz c15896yz) {
            m23743e();
            ((xm7) this.f89756b).addExtensions(c15896yz);
            return this;
        }

        public C15199b clearContentType() {
            m23743e();
            ((xm7) this.f89756b).clearContentType();
            return this;
        }

        public C15199b clearData() {
            m23743e();
            ((xm7) this.f89756b).clearData();
            return this;
        }

        public C15199b clearExtensions() {
            m23743e();
            ((xm7) this.f89756b).clearExtensions();
            return this;
        }

        @Override // p000.ym7
        public String getContentType() {
            return ((xm7) this.f89756b).getContentType();
        }

        @Override // p000.ym7
        public vj1 getContentTypeBytes() {
            return ((xm7) this.f89756b).getContentTypeBytes();
        }

        @Override // p000.ym7
        public vj1 getData() {
            return ((xm7) this.f89756b).getData();
        }

        @Override // p000.ym7
        public C15896yz getExtensions(int i) {
            return ((xm7) this.f89756b).getExtensions(i);
        }

        @Override // p000.ym7
        public int getExtensionsCount() {
            return ((xm7) this.f89756b).getExtensionsCount();
        }

        @Override // p000.ym7
        public List<C15896yz> getExtensionsList() {
            return Collections.unmodifiableList(((xm7) this.f89756b).getExtensionsList());
        }

        public C15199b removeExtensions(int i) {
            m23743e();
            ((xm7) this.f89756b).removeExtensions(i);
            return this;
        }

        public C15199b setContentType(String str) {
            m23743e();
            ((xm7) this.f89756b).setContentType(str);
            return this;
        }

        public C15199b setContentTypeBytes(vj1 vj1Var) {
            m23743e();
            ((xm7) this.f89756b).setContentTypeBytes(vj1Var);
            return this;
        }

        public C15199b setData(vj1 vj1Var) {
            m23743e();
            ((xm7) this.f89756b).setData(vj1Var);
            return this;
        }

        public C15199b setExtensions(int i, C15896yz c15896yz) {
            m23743e();
            ((xm7) this.f89756b).setExtensions(i, c15896yz);
            return this;
        }

        private C15199b() {
            super(xm7.DEFAULT_INSTANCE);
        }

        public C15199b addExtensions(int i, C15896yz c15896yz) {
            m23743e();
            ((xm7) this.f89756b).addExtensions(i, c15896yz);
            return this;
        }

        public C15199b setExtensions(int i, C15896yz.b bVar) {
            m23743e();
            ((xm7) this.f89756b).setExtensions(i, bVar.build());
            return this;
        }

        public C15199b addExtensions(C15896yz.b bVar) {
            m23743e();
            ((xm7) this.f89756b).addExtensions(bVar.build());
            return this;
        }

        public C15199b addExtensions(int i, C15896yz.b bVar) {
            m23743e();
            ((xm7) this.f89756b).addExtensions(i, bVar.build());
            return this;
        }
    }

    static {
        xm7 xm7Var = new xm7();
        DEFAULT_INSTANCE = xm7Var;
        v27.m23715h0(xm7.class, xm7Var);
    }

    private xm7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtensions(Iterable<? extends C15896yz> iterable) {
        ensureExtensionsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.extensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensions(C15896yz c15896yz) {
        c15896yz.getClass();
        ensureExtensionsIsMutable();
        this.extensions_.add(c15896yz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContentType() {
        this.contentType_ = getDefaultInstance().getContentType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtensions() {
        this.extensions_ = v27.m23722x();
    }

    private void ensureExtensionsIsMutable() {
        w98.InterfaceC14504k<C15896yz> interfaceC14504k = this.extensions_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.extensions_ = v27.m23698P(interfaceC14504k);
    }

    public static xm7 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C15199b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static xm7 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (xm7) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static xm7 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (xm7) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<xm7> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtensions(int i) {
        ensureExtensionsIsMutable();
        this.extensions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentType(String str) {
        str.getClass();
        this.contentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentTypeBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.contentType_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(vj1 vj1Var) {
        vj1Var.getClass();
        this.data_ = vj1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtensions(int i, C15896yz c15896yz) {
        c15896yz.getClass();
        ensureExtensionsIsMutable();
        this.extensions_.set(i, c15896yz);
    }

    @Override // p000.ym7
    public String getContentType() {
        return this.contentType_;
    }

    @Override // p000.ym7
    public vj1 getContentTypeBytes() {
        return vj1.copyFromUtf8(this.contentType_);
    }

    @Override // p000.ym7
    public vj1 getData() {
        return this.data_;
    }

    @Override // p000.ym7
    public C15896yz getExtensions(int i) {
        return this.extensions_.get(i);
    }

    @Override // p000.ym7
    public int getExtensionsCount() {
        return this.extensions_.size();
    }

    @Override // p000.ym7
    public List<C15896yz> getExtensionsList() {
        return this.extensions_;
    }

    public a00 getExtensionsOrBuilder(int i) {
        return this.extensions_.get(i);
    }

    public List<? extends a00> getExtensionsOrBuilderList() {
        return this.extensions_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C15198a c15198a = null;
        switch (C15198a.f98500a[enumC13830i.ordinal()]) {
            case 1:
                return new xm7();
            case 2:
                return new C15199b(c15198a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b", new Object[]{"contentType_", "data_", "extensions_", C15896yz.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<xm7> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (xm7.class) {
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

    public static C15199b newBuilder(xm7 xm7Var) {
        return DEFAULT_INSTANCE.m23739o(xm7Var);
    }

    public static xm7 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (xm7) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static xm7 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (xm7) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static xm7 parseFrom(vj1 vj1Var) throws ce8 {
        return (xm7) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensions(int i, C15896yz c15896yz) {
        c15896yz.getClass();
        ensureExtensionsIsMutable();
        this.extensions_.add(i, c15896yz);
    }

    public static xm7 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (xm7) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static xm7 parseFrom(byte[] bArr) throws ce8 {
        return (xm7) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static xm7 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (xm7) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static xm7 parseFrom(InputStream inputStream) throws IOException {
        return (xm7) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static xm7 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (xm7) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static xm7 parseFrom(f72 f72Var) throws IOException {
        return (xm7) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static xm7 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (xm7) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
