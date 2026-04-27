package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class lwa extends v27<lwa, C9010b> implements mwa {
    private static final lwa DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<lwa> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    /* JADX INFO: renamed from: lwa$a */
    public static /* synthetic */ class C9009a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59068a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f59068a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59068a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59068a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59068a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59068a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59068a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f59068a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: lwa$b */
    public static final class C9010b extends v27.AbstractC13823b<lwa, C9010b> implements mwa {
        public /* synthetic */ C9010b(C9009a c9009a) {
            this();
        }

        public C9010b clearName() {
            m23743e();
            ((lwa) this.f89756b).clearName();
            return this;
        }

        public C9010b clearRoot() {
            m23743e();
            ((lwa) this.f89756b).clearRoot();
            return this;
        }

        @Override // p000.mwa
        public String getName() {
            return ((lwa) this.f89756b).getName();
        }

        @Override // p000.mwa
        public vj1 getNameBytes() {
            return ((lwa) this.f89756b).getNameBytes();
        }

        @Override // p000.mwa
        public String getRoot() {
            return ((lwa) this.f89756b).getRoot();
        }

        @Override // p000.mwa
        public vj1 getRootBytes() {
            return ((lwa) this.f89756b).getRootBytes();
        }

        public C9010b setName(String value) {
            m23743e();
            ((lwa) this.f89756b).setName(value);
            return this;
        }

        public C9010b setNameBytes(vj1 value) {
            m23743e();
            ((lwa) this.f89756b).setNameBytes(value);
            return this;
        }

        public C9010b setRoot(String value) {
            m23743e();
            ((lwa) this.f89756b).setRoot(value);
            return this;
        }

        public C9010b setRootBytes(vj1 value) {
            m23743e();
            ((lwa) this.f89756b).setRootBytes(value);
            return this;
        }

        private C9010b() {
            super(lwa.DEFAULT_INSTANCE);
        }
    }

    static {
        lwa lwaVar = new lwa();
        DEFAULT_INSTANCE = lwaVar;
        v27.m23715h0(lwa.class, lwaVar);
    }

    private lwa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoot() {
        this.root_ = getDefaultInstance().getRoot();
    }

    public static lwa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C9010b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static lwa parseDelimitedFrom(InputStream input) throws IOException {
        return (lwa) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static lwa parseFrom(ByteBuffer data) throws ce8 {
        return (lwa) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<lwa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.name_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoot(String value) {
        value.getClass();
        this.root_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRootBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.root_ = value.toStringUtf8();
    }

    @Override // p000.mwa
    public String getName() {
        return this.name_;
    }

    @Override // p000.mwa
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.mwa
    public String getRoot() {
        return this.root_;
    }

    @Override // p000.mwa
    public vj1 getRootBytes() {
        return vj1.copyFromUtf8(this.root_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C9009a c9009a = null;
        switch (C9009a.f59068a[method.ordinal()]) {
            case 1:
                return new lwa();
            case 2:
                return new C9010b(c9009a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<lwa> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (lwa.class) {
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

    public static C9010b newBuilder(lwa prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static lwa parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (lwa) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static lwa parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (lwa) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static lwa parseFrom(vj1 data) throws ce8 {
        return (lwa) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static lwa parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (lwa) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static lwa parseFrom(byte[] data) throws ce8 {
        return (lwa) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static lwa parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (lwa) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static lwa parseFrom(InputStream input) throws IOException {
        return (lwa) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static lwa parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (lwa) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static lwa parseFrom(f72 input) throws IOException {
        return (lwa) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static lwa parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (lwa) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
