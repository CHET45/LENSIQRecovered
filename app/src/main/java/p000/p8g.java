package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class p8g extends v27<p8g, C10853b> implements q8g {
    private static final p8g DEFAULT_INSTANCE;
    private static volatile uhc<p8g> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    /* JADX INFO: renamed from: p8g$a */
    public static /* synthetic */ class C10852a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70029a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f70029a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70029a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70029a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70029a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70029a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70029a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70029a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: p8g$b */
    public static final class C10853b extends v27.AbstractC13823b<p8g, C10853b> implements q8g {
        public /* synthetic */ C10853b(C10852a c10852a) {
            this();
        }

        public C10853b clearValue() {
            m23743e();
            ((p8g) this.f89756b).clearValue();
            return this;
        }

        @Override // p000.q8g
        public String getValue() {
            return ((p8g) this.f89756b).getValue();
        }

        @Override // p000.q8g
        public vj1 getValueBytes() {
            return ((p8g) this.f89756b).getValueBytes();
        }

        public C10853b setValue(String value) {
            m23743e();
            ((p8g) this.f89756b).setValue(value);
            return this;
        }

        public C10853b setValueBytes(vj1 value) {
            m23743e();
            ((p8g) this.f89756b).setValueBytes(value);
            return this;
        }

        private C10853b() {
            super(p8g.DEFAULT_INSTANCE);
        }
    }

    static {
        p8g p8gVar = new p8g();
        DEFAULT_INSTANCE = p8gVar;
        v27.m23715h0(p8g.class, p8gVar);
    }

    private p8g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static p8g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C10853b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    /* JADX INFO: renamed from: of */
    public static p8g m19349of(String value) {
        return newBuilder().setValue(value).build();
    }

    public static p8g parseDelimitedFrom(InputStream input) throws IOException {
        return (p8g) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static p8g parseFrom(ByteBuffer data) throws ce8 {
        return (p8g) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<p8g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String value) {
        value.getClass();
        this.value_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.value_ = value.toStringUtf8();
    }

    @Override // p000.q8g
    public String getValue() {
        return this.value_;
    }

    @Override // p000.q8g
    public vj1 getValueBytes() {
        return vj1.copyFromUtf8(this.value_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C10852a c10852a = null;
        switch (C10852a.f70029a[method.ordinal()]) {
            case 1:
                return new p8g();
            case 2:
                return new C10853b(c10852a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<p8g> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (p8g.class) {
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

    public static C10853b newBuilder(p8g prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static p8g parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (p8g) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static p8g parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (p8g) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static p8g parseFrom(vj1 data) throws ce8 {
        return (p8g) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static p8g parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (p8g) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static p8g parseFrom(byte[] data) throws ce8 {
        return (p8g) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static p8g parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (p8g) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static p8g parseFrom(InputStream input) throws IOException {
        return (p8g) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static p8g parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (p8g) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static p8g parseFrom(f72 input) throws IOException {
        return (p8g) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static p8g parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (p8g) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
