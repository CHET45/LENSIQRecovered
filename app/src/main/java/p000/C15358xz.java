package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.u27;

/* JADX INFO: renamed from: xz */
/* JADX INFO: loaded from: classes3.dex */
public final class C15358xz extends u27<C15358xz, b> implements b00 {
    private static final C15358xz DEFAULT_INSTANCE;
    private static volatile vhc<C15358xz> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private wj1 value_ = wj1.f94379e;

    /* JADX INFO: renamed from: xz$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99767a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f99767a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99767a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99767a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99767a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99767a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99767a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f99767a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: xz$b */
    public static final class b extends u27.AbstractC13324b<C15358xz, b> implements b00 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b clearTypeUrl() {
            m23058e();
            ((C15358xz) this.f86607b).clearTypeUrl();
            return this;
        }

        public b clearValue() {
            m23058e();
            ((C15358xz) this.f86607b).clearValue();
            return this;
        }

        @Override // p000.b00
        public String getTypeUrl() {
            return ((C15358xz) this.f86607b).getTypeUrl();
        }

        @Override // p000.b00
        public wj1 getTypeUrlBytes() {
            return ((C15358xz) this.f86607b).getTypeUrlBytes();
        }

        @Override // p000.b00
        public wj1 getValue() {
            return ((C15358xz) this.f86607b).getValue();
        }

        public b setTypeUrl(String value) {
            m23058e();
            ((C15358xz) this.f86607b).setTypeUrl(value);
            return this;
        }

        public b setTypeUrlBytes(wj1 value) {
            m23058e();
            ((C15358xz) this.f86607b).setTypeUrlBytes(value);
            return this;
        }

        public b setValue(wj1 value) {
            m23058e();
            ((C15358xz) this.f86607b).setValue(value);
            return this;
        }

        private b() {
            super(C15358xz.DEFAULT_INSTANCE);
        }
    }

    static {
        C15358xz c15358xz = new C15358xz();
        DEFAULT_INSTANCE = c15358xz;
        u27.m23029g0(C15358xz.class, c15358xz);
    }

    private C15358xz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static C15358xz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static C15358xz parseDelimitedFrom(InputStream input) throws IOException {
        return (C15358xz) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static C15358xz parseFrom(ByteBuffer data) throws be8 {
        return (C15358xz) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<C15358xz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String value) {
        value.getClass();
        this.typeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        this.typeUrl_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(wj1 value) {
        value.getClass();
        this.value_ = value;
    }

    @Override // p000.b00
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // p000.b00
    public wj1 getTypeUrlBytes() {
        return wj1.copyFromUtf8(this.typeUrl_);
    }

    @Override // p000.b00
    public wj1 getValue() {
        return this.value_;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        a aVar = null;
        switch (a.f99767a[method.ordinal()]) {
            case 1:
                return new C15358xz();
            case 2:
                return new b(aVar);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<C15358xz> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (C15358xz.class) {
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

    public static b newBuilder(C15358xz prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static C15358xz parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (C15358xz) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static C15358xz parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (C15358xz) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static C15358xz parseFrom(wj1 data) throws be8 {
        return (C15358xz) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static C15358xz parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (C15358xz) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static C15358xz parseFrom(byte[] data) throws be8 {
        return (C15358xz) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static C15358xz parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (C15358xz) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static C15358xz parseFrom(InputStream input) throws IOException {
        return (C15358xz) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static C15358xz parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (C15358xz) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static C15358xz parseFrom(e72 input) throws IOException {
        return (C15358xz) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static C15358xz parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (C15358xz) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
