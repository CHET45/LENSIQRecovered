package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class lj7 extends v27<lj7, C8836b> implements mj7 {
    private static final lj7 DEFAULT_INSTANCE;
    public static final int LINKS_FIELD_NUMBER = 1;
    private static volatile uhc<lj7> PARSER;
    private w98.InterfaceC14504k<C8837c> links_ = v27.m23722x();

    /* JADX INFO: renamed from: lj7$a */
    public static /* synthetic */ class C8835a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f57732a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f57732a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57732a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57732a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57732a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57732a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57732a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57732a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: lj7$b */
    public static final class C8836b extends v27.AbstractC13823b<lj7, C8836b> implements mj7 {
        public /* synthetic */ C8836b(C8835a c8835a) {
            this();
        }

        public C8836b addAllLinks(Iterable<? extends C8837c> iterable) {
            m23743e();
            ((lj7) this.f89756b).addAllLinks(iterable);
            return this;
        }

        public C8836b addLinks(C8837c c8837c) {
            m23743e();
            ((lj7) this.f89756b).addLinks(c8837c);
            return this;
        }

        public C8836b clearLinks() {
            m23743e();
            ((lj7) this.f89756b).clearLinks();
            return this;
        }

        @Override // p000.mj7
        public C8837c getLinks(int i) {
            return ((lj7) this.f89756b).getLinks(i);
        }

        @Override // p000.mj7
        public int getLinksCount() {
            return ((lj7) this.f89756b).getLinksCount();
        }

        @Override // p000.mj7
        public List<C8837c> getLinksList() {
            return Collections.unmodifiableList(((lj7) this.f89756b).getLinksList());
        }

        public C8836b removeLinks(int i) {
            m23743e();
            ((lj7) this.f89756b).removeLinks(i);
            return this;
        }

        public C8836b setLinks(int i, C8837c c8837c) {
            m23743e();
            ((lj7) this.f89756b).setLinks(i, c8837c);
            return this;
        }

        private C8836b() {
            super(lj7.DEFAULT_INSTANCE);
        }

        public C8836b addLinks(int i, C8837c c8837c) {
            m23743e();
            ((lj7) this.f89756b).addLinks(i, c8837c);
            return this;
        }

        public C8836b setLinks(int i, C8837c.a aVar) {
            m23743e();
            ((lj7) this.f89756b).setLinks(i, aVar.build());
            return this;
        }

        public C8836b addLinks(C8837c.a aVar) {
            m23743e();
            ((lj7) this.f89756b).addLinks(aVar.build());
            return this;
        }

        public C8836b addLinks(int i, C8837c.a aVar) {
            m23743e();
            ((lj7) this.f89756b).addLinks(i, aVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: lj7$c */
    public static final class C8837c extends v27<C8837c, a> implements InterfaceC8838d {
        private static final C8837c DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 1;
        private static volatile uhc<C8837c> PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private String description_ = "";
        private String url_ = "";

        /* JADX INFO: renamed from: lj7$c$a */
        public static final class a extends v27.AbstractC13823b<C8837c, a> implements InterfaceC8838d {
            public /* synthetic */ a(C8835a c8835a) {
                this();
            }

            public a clearDescription() {
                m23743e();
                ((C8837c) this.f89756b).clearDescription();
                return this;
            }

            public a clearUrl() {
                m23743e();
                ((C8837c) this.f89756b).clearUrl();
                return this;
            }

            @Override // p000.lj7.InterfaceC8838d
            public String getDescription() {
                return ((C8837c) this.f89756b).getDescription();
            }

            @Override // p000.lj7.InterfaceC8838d
            public vj1 getDescriptionBytes() {
                return ((C8837c) this.f89756b).getDescriptionBytes();
            }

            @Override // p000.lj7.InterfaceC8838d
            public String getUrl() {
                return ((C8837c) this.f89756b).getUrl();
            }

            @Override // p000.lj7.InterfaceC8838d
            public vj1 getUrlBytes() {
                return ((C8837c) this.f89756b).getUrlBytes();
            }

            public a setDescription(String str) {
                m23743e();
                ((C8837c) this.f89756b).setDescription(str);
                return this;
            }

            public a setDescriptionBytes(vj1 vj1Var) {
                m23743e();
                ((C8837c) this.f89756b).setDescriptionBytes(vj1Var);
                return this;
            }

            public a setUrl(String str) {
                m23743e();
                ((C8837c) this.f89756b).setUrl(str);
                return this;
            }

            public a setUrlBytes(vj1 vj1Var) {
                m23743e();
                ((C8837c) this.f89756b).setUrlBytes(vj1Var);
                return this;
            }

            private a() {
                super(C8837c.DEFAULT_INSTANCE);
            }
        }

        static {
            C8837c c8837c = new C8837c();
            DEFAULT_INSTANCE = c8837c;
            v27.m23715h0(C8837c.class, c8837c);
        }

        private C8837c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static C8837c getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C8837c parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C8837c) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C8837c parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C8837c) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C8837c> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptionBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.description_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.url_ = vj1Var.toStringUtf8();
        }

        @Override // p000.lj7.InterfaceC8838d
        public String getDescription() {
            return this.description_;
        }

        @Override // p000.lj7.InterfaceC8838d
        public vj1 getDescriptionBytes() {
            return vj1.copyFromUtf8(this.description_);
        }

        @Override // p000.lj7.InterfaceC8838d
        public String getUrl() {
            return this.url_;
        }

        @Override // p000.lj7.InterfaceC8838d
        public vj1 getUrlBytes() {
            return vj1.copyFromUtf8(this.url_);
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C8835a c8835a = null;
            switch (C8835a.f57732a[enumC13830i.ordinal()]) {
                case 1:
                    return new C8837c();
                case 2:
                    return new a(c8835a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"description_", "url_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C8837c> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C8837c.class) {
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

        public static a newBuilder(C8837c c8837c) {
            return DEFAULT_INSTANCE.m23739o(c8837c);
        }

        public static C8837c parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C8837c) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C8837c parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C8837c) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C8837c parseFrom(vj1 vj1Var) throws ce8 {
            return (C8837c) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C8837c parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C8837c) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C8837c parseFrom(byte[] bArr) throws ce8 {
            return (C8837c) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C8837c parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C8837c) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C8837c parseFrom(InputStream inputStream) throws IOException {
            return (C8837c) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C8837c parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C8837c) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C8837c parseFrom(f72 f72Var) throws IOException {
            return (C8837c) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C8837c parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C8837c) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: lj7$d */
    public interface InterfaceC8838d extends rsa {
        String getDescription();

        vj1 getDescriptionBytes();

        String getUrl();

        vj1 getUrlBytes();
    }

    static {
        lj7 lj7Var = new lj7();
        DEFAULT_INSTANCE = lj7Var;
        v27.m23715h0(lj7.class, lj7Var);
    }

    private lj7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLinks(Iterable<? extends C8837c> iterable) {
        ensureLinksIsMutable();
        AbstractC1714b3.m2856b(iterable, this.links_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLinks(C8837c c8837c) {
        c8837c.getClass();
        ensureLinksIsMutable();
        this.links_.add(c8837c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinks() {
        this.links_ = v27.m23722x();
    }

    private void ensureLinksIsMutable() {
        w98.InterfaceC14504k<C8837c> interfaceC14504k = this.links_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.links_ = v27.m23698P(interfaceC14504k);
    }

    public static lj7 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8836b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static lj7 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (lj7) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static lj7 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (lj7) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<lj7> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLinks(int i) {
        ensureLinksIsMutable();
        this.links_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinks(int i, C8837c c8837c) {
        c8837c.getClass();
        ensureLinksIsMutable();
        this.links_.set(i, c8837c);
    }

    @Override // p000.mj7
    public C8837c getLinks(int i) {
        return this.links_.get(i);
    }

    @Override // p000.mj7
    public int getLinksCount() {
        return this.links_.size();
    }

    @Override // p000.mj7
    public List<C8837c> getLinksList() {
        return this.links_;
    }

    public InterfaceC8838d getLinksOrBuilder(int i) {
        return this.links_.get(i);
    }

    public List<? extends InterfaceC8838d> getLinksOrBuilderList() {
        return this.links_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8835a c8835a = null;
        switch (C8835a.f57732a[enumC13830i.ordinal()]) {
            case 1:
                return new lj7();
            case 2:
                return new C8836b(c8835a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"links_", C8837c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<lj7> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (lj7.class) {
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

    public static C8836b newBuilder(lj7 lj7Var) {
        return DEFAULT_INSTANCE.m23739o(lj7Var);
    }

    public static lj7 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (lj7) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static lj7 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (lj7) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static lj7 parseFrom(vj1 vj1Var) throws ce8 {
        return (lj7) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLinks(int i, C8837c c8837c) {
        c8837c.getClass();
        ensureLinksIsMutable();
        this.links_.add(i, c8837c);
    }

    public static lj7 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (lj7) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static lj7 parseFrom(byte[] bArr) throws ce8 {
        return (lj7) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static lj7 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (lj7) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static lj7 parseFrom(InputStream inputStream) throws IOException {
        return (lj7) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static lj7 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (lj7) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static lj7 parseFrom(f72 f72Var) throws IOException {
        return (lj7) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static lj7 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (lj7) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
