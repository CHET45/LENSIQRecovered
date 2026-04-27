package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class kwa extends u27<kwa, C8537b> implements nwa {
    private static final kwa DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile vhc<kwa> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    /* JADX INFO: renamed from: kwa$a */
    public static /* synthetic */ class C8536a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55515a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f55515a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55515a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55515a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55515a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55515a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55515a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55515a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: kwa$b */
    public static final class C8537b extends u27.AbstractC13324b<kwa, C8537b> implements nwa {
        public /* synthetic */ C8537b(C8536a c8536a) {
            this();
        }

        public C8537b clearName() {
            m23058e();
            ((kwa) this.f86607b).clearName();
            return this;
        }

        public C8537b clearRoot() {
            m23058e();
            ((kwa) this.f86607b).clearRoot();
            return this;
        }

        @Override // p000.nwa
        public String getName() {
            return ((kwa) this.f86607b).getName();
        }

        @Override // p000.nwa
        public wj1 getNameBytes() {
            return ((kwa) this.f86607b).getNameBytes();
        }

        @Override // p000.nwa
        public String getRoot() {
            return ((kwa) this.f86607b).getRoot();
        }

        @Override // p000.nwa
        public wj1 getRootBytes() {
            return ((kwa) this.f86607b).getRootBytes();
        }

        public C8537b setName(String value) {
            m23058e();
            ((kwa) this.f86607b).setName(value);
            return this;
        }

        public C8537b setNameBytes(wj1 value) {
            m23058e();
            ((kwa) this.f86607b).setNameBytes(value);
            return this;
        }

        public C8537b setRoot(String value) {
            m23058e();
            ((kwa) this.f86607b).setRoot(value);
            return this;
        }

        public C8537b setRootBytes(wj1 value) {
            m23058e();
            ((kwa) this.f86607b).setRootBytes(value);
            return this;
        }

        private C8537b() {
            super(kwa.DEFAULT_INSTANCE);
        }
    }

    static {
        kwa kwaVar = new kwa();
        DEFAULT_INSTANCE = kwaVar;
        u27.m23029g0(kwa.class, kwaVar);
    }

    private kwa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoot() {
        this.root_ = getDefaultInstance().getRoot();
    }

    public static kwa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8537b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static kwa parseDelimitedFrom(InputStream input) throws IOException {
        return (kwa) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static kwa parseFrom(ByteBuffer data) throws be8 {
        return (kwa) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<kwa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        this.name_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoot(String value) {
        value.getClass();
        this.root_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRootBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        this.root_ = value.toStringUtf8();
    }

    @Override // p000.nwa
    public String getName() {
        return this.name_;
    }

    @Override // p000.nwa
    public wj1 getNameBytes() {
        return wj1.copyFromUtf8(this.name_);
    }

    @Override // p000.nwa
    public String getRoot() {
        return this.root_;
    }

    @Override // p000.nwa
    public wj1 getRootBytes() {
        return wj1.copyFromUtf8(this.root_);
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C8536a c8536a = null;
        switch (C8536a.f55515a[method.ordinal()]) {
            case 1:
                return new kwa();
            case 2:
                return new C8537b(c8536a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<kwa> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (kwa.class) {
                        try {
                            c13325c = PARSER;
                            if (c13325c == null) {
                                c13325c = new u27.C13325c<>(DEFAULT_INSTANCE);
                                PARSER = c13325c;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return c13325c;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static C8537b newBuilder(kwa prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static kwa parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (kwa) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static kwa parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (kwa) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static kwa parseFrom(wj1 data) throws be8 {
        return (kwa) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static kwa parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (kwa) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static kwa parseFrom(byte[] data) throws be8 {
        return (kwa) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static kwa parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (kwa) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static kwa parseFrom(InputStream input) throws IOException {
        return (kwa) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static kwa parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (kwa) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static kwa parseFrom(e72 input) throws IOException {
        return (kwa) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static kwa parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (kwa) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
