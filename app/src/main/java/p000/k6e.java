package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class k6e extends v27<k6e, C8217b> implements l6e {
    private static final k6e DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile uhc<k6e> PARSER = null;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
    private String resourceType_ = "";
    private String resourceName_ = "";
    private String owner_ = "";
    private String description_ = "";

    /* JADX INFO: renamed from: k6e$a */
    public static /* synthetic */ class C8216a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52689a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f52689a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52689a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52689a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52689a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52689a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52689a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52689a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: k6e$b */
    public static final class C8217b extends v27.AbstractC13823b<k6e, C8217b> implements l6e {
        public /* synthetic */ C8217b(C8216a c8216a) {
            this();
        }

        public C8217b clearDescription() {
            m23743e();
            ((k6e) this.f89756b).clearDescription();
            return this;
        }

        public C8217b clearOwner() {
            m23743e();
            ((k6e) this.f89756b).clearOwner();
            return this;
        }

        public C8217b clearResourceName() {
            m23743e();
            ((k6e) this.f89756b).clearResourceName();
            return this;
        }

        public C8217b clearResourceType() {
            m23743e();
            ((k6e) this.f89756b).clearResourceType();
            return this;
        }

        @Override // p000.l6e
        public String getDescription() {
            return ((k6e) this.f89756b).getDescription();
        }

        @Override // p000.l6e
        public vj1 getDescriptionBytes() {
            return ((k6e) this.f89756b).getDescriptionBytes();
        }

        @Override // p000.l6e
        public String getOwner() {
            return ((k6e) this.f89756b).getOwner();
        }

        @Override // p000.l6e
        public vj1 getOwnerBytes() {
            return ((k6e) this.f89756b).getOwnerBytes();
        }

        @Override // p000.l6e
        public String getResourceName() {
            return ((k6e) this.f89756b).getResourceName();
        }

        @Override // p000.l6e
        public vj1 getResourceNameBytes() {
            return ((k6e) this.f89756b).getResourceNameBytes();
        }

        @Override // p000.l6e
        public String getResourceType() {
            return ((k6e) this.f89756b).getResourceType();
        }

        @Override // p000.l6e
        public vj1 getResourceTypeBytes() {
            return ((k6e) this.f89756b).getResourceTypeBytes();
        }

        public C8217b setDescription(String str) {
            m23743e();
            ((k6e) this.f89756b).setDescription(str);
            return this;
        }

        public C8217b setDescriptionBytes(vj1 vj1Var) {
            m23743e();
            ((k6e) this.f89756b).setDescriptionBytes(vj1Var);
            return this;
        }

        public C8217b setOwner(String str) {
            m23743e();
            ((k6e) this.f89756b).setOwner(str);
            return this;
        }

        public C8217b setOwnerBytes(vj1 vj1Var) {
            m23743e();
            ((k6e) this.f89756b).setOwnerBytes(vj1Var);
            return this;
        }

        public C8217b setResourceName(String str) {
            m23743e();
            ((k6e) this.f89756b).setResourceName(str);
            return this;
        }

        public C8217b setResourceNameBytes(vj1 vj1Var) {
            m23743e();
            ((k6e) this.f89756b).setResourceNameBytes(vj1Var);
            return this;
        }

        public C8217b setResourceType(String str) {
            m23743e();
            ((k6e) this.f89756b).setResourceType(str);
            return this;
        }

        public C8217b setResourceTypeBytes(vj1 vj1Var) {
            m23743e();
            ((k6e) this.f89756b).setResourceTypeBytes(vj1Var);
            return this;
        }

        private C8217b() {
            super(k6e.DEFAULT_INSTANCE);
        }
    }

    static {
        k6e k6eVar = new k6e();
        DEFAULT_INSTANCE = k6eVar;
        v27.m23715h0(k6e.class, k6eVar);
    }

    private k6e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwner() {
        this.owner_ = getDefaultInstance().getOwner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceName() {
        this.resourceName_ = getDefaultInstance().getResourceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceType() {
        this.resourceType_ = getDefaultInstance().getResourceType();
    }

    public static k6e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8217b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static k6e parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (k6e) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static k6e parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (k6e) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<k6e> parser() {
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
    public void setOwner(String str) {
        str.getClass();
        this.owner_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.owner_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceName(String str) {
        str.getClass();
        this.resourceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceNameBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.resourceName_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceType(String str) {
        str.getClass();
        this.resourceType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceTypeBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.resourceType_ = vj1Var.toStringUtf8();
    }

    @Override // p000.l6e
    public String getDescription() {
        return this.description_;
    }

    @Override // p000.l6e
    public vj1 getDescriptionBytes() {
        return vj1.copyFromUtf8(this.description_);
    }

    @Override // p000.l6e
    public String getOwner() {
        return this.owner_;
    }

    @Override // p000.l6e
    public vj1 getOwnerBytes() {
        return vj1.copyFromUtf8(this.owner_);
    }

    @Override // p000.l6e
    public String getResourceName() {
        return this.resourceName_;
    }

    @Override // p000.l6e
    public vj1 getResourceNameBytes() {
        return vj1.copyFromUtf8(this.resourceName_);
    }

    @Override // p000.l6e
    public String getResourceType() {
        return this.resourceType_;
    }

    @Override // p000.l6e
    public vj1 getResourceTypeBytes() {
        return vj1.copyFromUtf8(this.resourceType_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8216a c8216a = null;
        switch (C8216a.f52689a[enumC13830i.ordinal()]) {
            case 1:
                return new k6e();
            case 2:
                return new C8217b(c8216a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"resourceType_", "resourceName_", "owner_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<k6e> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (k6e.class) {
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

    public static C8217b newBuilder(k6e k6eVar) {
        return DEFAULT_INSTANCE.m23739o(k6eVar);
    }

    public static k6e parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (k6e) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static k6e parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (k6e) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static k6e parseFrom(vj1 vj1Var) throws ce8 {
        return (k6e) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static k6e parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (k6e) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static k6e parseFrom(byte[] bArr) throws ce8 {
        return (k6e) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static k6e parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (k6e) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static k6e parseFrom(InputStream inputStream) throws IOException {
        return (k6e) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static k6e parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (k6e) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static k6e parseFrom(f72 f72Var) throws IOException {
        return (k6e) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static k6e parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (k6e) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
