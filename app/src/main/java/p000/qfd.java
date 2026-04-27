package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;
import p000.zfd;

/* JADX INFO: loaded from: classes5.dex */
public final class qfd extends v27<qfd, C11468b> implements rfd {
    private static final qfd DEFAULT_INSTANCE;
    private static volatile uhc<qfd> PARSER = null;
    public static final int PROPERTIES_FIELD_NUMBER = 1;
    private w98.InterfaceC14504k<zfd> properties_ = v27.m23722x();

    /* JADX INFO: renamed from: qfd$a */
    public static /* synthetic */ class C11467a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f74312a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f74312a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74312a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74312a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74312a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74312a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74312a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74312a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: qfd$b */
    public static final class C11468b extends v27.AbstractC13823b<qfd, C11468b> implements rfd {
        public /* synthetic */ C11468b(C11467a c11467a) {
            this();
        }

        public C11468b addAllProperties(Iterable<? extends zfd> iterable) {
            m23743e();
            ((qfd) this.f89756b).addAllProperties(iterable);
            return this;
        }

        public C11468b addProperties(zfd zfdVar) {
            m23743e();
            ((qfd) this.f89756b).addProperties(zfdVar);
            return this;
        }

        public C11468b clearProperties() {
            m23743e();
            ((qfd) this.f89756b).clearProperties();
            return this;
        }

        @Override // p000.rfd
        public zfd getProperties(int i) {
            return ((qfd) this.f89756b).getProperties(i);
        }

        @Override // p000.rfd
        public int getPropertiesCount() {
            return ((qfd) this.f89756b).getPropertiesCount();
        }

        @Override // p000.rfd
        public List<zfd> getPropertiesList() {
            return Collections.unmodifiableList(((qfd) this.f89756b).getPropertiesList());
        }

        public C11468b removeProperties(int i) {
            m23743e();
            ((qfd) this.f89756b).removeProperties(i);
            return this;
        }

        public C11468b setProperties(int i, zfd zfdVar) {
            m23743e();
            ((qfd) this.f89756b).setProperties(i, zfdVar);
            return this;
        }

        private C11468b() {
            super(qfd.DEFAULT_INSTANCE);
        }

        public C11468b addProperties(int i, zfd zfdVar) {
            m23743e();
            ((qfd) this.f89756b).addProperties(i, zfdVar);
            return this;
        }

        public C11468b setProperties(int i, zfd.C16115b c16115b) {
            m23743e();
            ((qfd) this.f89756b).setProperties(i, c16115b.build());
            return this;
        }

        public C11468b addProperties(zfd.C16115b c16115b) {
            m23743e();
            ((qfd) this.f89756b).addProperties(c16115b.build());
            return this;
        }

        public C11468b addProperties(int i, zfd.C16115b c16115b) {
            m23743e();
            ((qfd) this.f89756b).addProperties(i, c16115b.build());
            return this;
        }
    }

    static {
        qfd qfdVar = new qfd();
        DEFAULT_INSTANCE = qfdVar;
        v27.m23715h0(qfd.class, qfdVar);
    }

    private qfd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProperties(Iterable<? extends zfd> iterable) {
        ensurePropertiesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.properties_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProperties(zfd zfdVar) {
        zfdVar.getClass();
        ensurePropertiesIsMutable();
        this.properties_.add(zfdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProperties() {
        this.properties_ = v27.m23722x();
    }

    private void ensurePropertiesIsMutable() {
        w98.InterfaceC14504k<zfd> interfaceC14504k = this.properties_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.properties_ = v27.m23698P(interfaceC14504k);
    }

    public static qfd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C11468b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static qfd parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (qfd) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static qfd parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (qfd) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<qfd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProperties(int i) {
        ensurePropertiesIsMutable();
        this.properties_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProperties(int i, zfd zfdVar) {
        zfdVar.getClass();
        ensurePropertiesIsMutable();
        this.properties_.set(i, zfdVar);
    }

    @Override // p000.rfd
    public zfd getProperties(int i) {
        return this.properties_.get(i);
    }

    @Override // p000.rfd
    public int getPropertiesCount() {
        return this.properties_.size();
    }

    @Override // p000.rfd
    public List<zfd> getPropertiesList() {
        return this.properties_;
    }

    public jgd getPropertiesOrBuilder(int i) {
        return this.properties_.get(i);
    }

    public List<? extends jgd> getPropertiesOrBuilderList() {
        return this.properties_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C11467a c11467a = null;
        switch (C11467a.f74312a[enumC13830i.ordinal()]) {
            case 1:
                return new qfd();
            case 2:
                return new C11468b(c11467a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"properties_", zfd.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<qfd> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (qfd.class) {
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

    public static C11468b newBuilder(qfd qfdVar) {
        return DEFAULT_INSTANCE.m23739o(qfdVar);
    }

    public static qfd parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (qfd) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static qfd parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (qfd) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static qfd parseFrom(vj1 vj1Var) throws ce8 {
        return (qfd) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProperties(int i, zfd zfdVar) {
        zfdVar.getClass();
        ensurePropertiesIsMutable();
        this.properties_.add(i, zfdVar);
    }

    public static qfd parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (qfd) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static qfd parseFrom(byte[] bArr) throws ce8 {
        return (qfd) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static qfd parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (qfd) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static qfd parseFrom(InputStream inputStream) throws IOException {
        return (qfd) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static qfd parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (qfd) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static qfd parseFrom(f72 f72Var) throws IOException {
        return (qfd) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static qfd parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (qfd) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
