package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: renamed from: yz */
/* JADX INFO: loaded from: classes4.dex */
public final class C15896yz extends v27<C15896yz, b> implements a00 {
    private static final C15896yz DEFAULT_INSTANCE;
    private static volatile uhc<C15896yz> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private vj1 value_ = vj1.f91344e;

    /* JADX INFO: renamed from: yz$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f103494a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f103494a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103494a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103494a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f103494a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f103494a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f103494a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f103494a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: yz$b */
    public static final class b extends v27.AbstractC13823b<C15896yz, b> implements a00 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b clearTypeUrl() {
            m23743e();
            ((C15896yz) this.f89756b).clearTypeUrl();
            return this;
        }

        public b clearValue() {
            m23743e();
            ((C15896yz) this.f89756b).clearValue();
            return this;
        }

        @Override // p000.a00
        public String getTypeUrl() {
            return ((C15896yz) this.f89756b).getTypeUrl();
        }

        @Override // p000.a00
        public vj1 getTypeUrlBytes() {
            return ((C15896yz) this.f89756b).getTypeUrlBytes();
        }

        @Override // p000.a00
        public vj1 getValue() {
            return ((C15896yz) this.f89756b).getValue();
        }

        public b setTypeUrl(String value) {
            m23743e();
            ((C15896yz) this.f89756b).setTypeUrl(value);
            return this;
        }

        public b setTypeUrlBytes(vj1 value) {
            m23743e();
            ((C15896yz) this.f89756b).setTypeUrlBytes(value);
            return this;
        }

        public b setValue(vj1 value) {
            m23743e();
            ((C15896yz) this.f89756b).setValue(value);
            return this;
        }

        private b() {
            super(C15896yz.DEFAULT_INSTANCE);
        }
    }

    static {
        C15896yz c15896yz = new C15896yz();
        DEFAULT_INSTANCE = c15896yz;
        v27.m23715h0(C15896yz.class, c15896yz);
    }

    private C15896yz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static C15896yz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static C15896yz parseDelimitedFrom(InputStream input) throws IOException {
        return (C15896yz) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static C15896yz parseFrom(ByteBuffer data) throws ce8 {
        return (C15896yz) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<C15896yz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String value) {
        value.getClass();
        this.typeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.typeUrl_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(vj1 value) {
        value.getClass();
        this.value_ = value;
    }

    @Override // p000.a00
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // p000.a00
    public vj1 getTypeUrlBytes() {
        return vj1.copyFromUtf8(this.typeUrl_);
    }

    @Override // p000.a00
    public vj1 getValue() {
        return this.value_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        a aVar = null;
        switch (a.f103494a[method.ordinal()]) {
            case 1:
                return new C15896yz();
            case 2:
                return new b(aVar);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<C15896yz> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (C15896yz.class) {
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

    public static b newBuilder(C15896yz prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static C15896yz parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (C15896yz) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static C15896yz parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (C15896yz) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static C15896yz parseFrom(vj1 data) throws ce8 {
        return (C15896yz) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static C15896yz parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (C15896yz) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static C15896yz parseFrom(byte[] data) throws ce8 {
        return (C15896yz) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static C15896yz parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (C15896yz) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static C15896yz parseFrom(InputStream input) throws IOException {
        return (C15896yz) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static C15896yz parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (C15896yz) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static C15896yz parseFrom(f72 input) throws IOException {
        return (C15896yz) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static C15896yz parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (C15896yz) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
