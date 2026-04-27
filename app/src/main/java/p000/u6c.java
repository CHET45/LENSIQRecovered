package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.C15358xz;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class u6c extends u27<u6c, C13378b> implements y6c {
    private static final u6c DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile vhc<u6c> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private C15358xz value_;

    /* JADX INFO: renamed from: u6c$a */
    public static /* synthetic */ class C13377a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f86900a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f86900a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86900a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f86900a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f86900a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f86900a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f86900a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f86900a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: u6c$b */
    public static final class C13378b extends u27.AbstractC13324b<u6c, C13378b> implements y6c {
        public /* synthetic */ C13378b(C13377a c13377a) {
            this();
        }

        public C13378b clearName() {
            m23058e();
            ((u6c) this.f86607b).clearName();
            return this;
        }

        public C13378b clearValue() {
            m23058e();
            ((u6c) this.f86607b).clearValue();
            return this;
        }

        @Override // p000.y6c
        public String getName() {
            return ((u6c) this.f86607b).getName();
        }

        @Override // p000.y6c
        public wj1 getNameBytes() {
            return ((u6c) this.f86607b).getNameBytes();
        }

        @Override // p000.y6c
        public C15358xz getValue() {
            return ((u6c) this.f86607b).getValue();
        }

        @Override // p000.y6c
        public boolean hasValue() {
            return ((u6c) this.f86607b).hasValue();
        }

        public C13378b mergeValue(C15358xz value) {
            m23058e();
            ((u6c) this.f86607b).mergeValue(value);
            return this;
        }

        public C13378b setName(String value) {
            m23058e();
            ((u6c) this.f86607b).setName(value);
            return this;
        }

        public C13378b setNameBytes(wj1 value) {
            m23058e();
            ((u6c) this.f86607b).setNameBytes(value);
            return this;
        }

        public C13378b setValue(C15358xz value) {
            m23058e();
            ((u6c) this.f86607b).setValue(value);
            return this;
        }

        private C13378b() {
            super(u6c.DEFAULT_INSTANCE);
        }

        public C13378b setValue(C15358xz.b builderForValue) {
            m23058e();
            ((u6c) this.f86607b).setValue(builderForValue.build());
            return this;
        }
    }

    static {
        u6c u6cVar = new u6c();
        DEFAULT_INSTANCE = u6cVar;
        u27.m23029g0(u6c.class, u6cVar);
    }

    private u6c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
        this.bitField0_ &= -2;
    }

    public static u6c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(C15358xz value) {
        value.getClass();
        C15358xz c15358xz = this.value_;
        if (c15358xz == null || c15358xz == C15358xz.getDefaultInstance()) {
            this.value_ = value;
        } else {
            this.value_ = C15358xz.newBuilder(this.value_).mergeFrom(value).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C13378b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static u6c parseDelimitedFrom(InputStream input) throws IOException {
        return (u6c) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static u6c parseFrom(ByteBuffer data) throws be8 {
        return (u6c) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<u6c> parser() {
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
    public void setValue(C15358xz value) {
        value.getClass();
        this.value_ = value;
        this.bitField0_ |= 1;
    }

    @Override // p000.y6c
    public String getName() {
        return this.name_;
    }

    @Override // p000.y6c
    public wj1 getNameBytes() {
        return wj1.copyFromUtf8(this.name_);
    }

    @Override // p000.y6c
    public C15358xz getValue() {
        C15358xz c15358xz = this.value_;
        return c15358xz == null ? C15358xz.getDefaultInstance() : c15358xz;
    }

    @Override // p000.y6c
    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C13377a c13377a = null;
        switch (C13377a.f86900a[method.ordinal()]) {
            case 1:
                return new u6c();
            case 2:
                return new C13378b(c13377a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<u6c> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (u6c.class) {
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

    public static C13378b newBuilder(u6c prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static u6c parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (u6c) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static u6c parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (u6c) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static u6c parseFrom(wj1 data) throws be8 {
        return (u6c) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static u6c parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (u6c) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static u6c parseFrom(byte[] data) throws be8 {
        return (u6c) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static u6c parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (u6c) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static u6c parseFrom(InputStream input) throws IOException {
        return (u6c) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static u6c parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (u6c) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static u6c parseFrom(e72 input) throws IOException {
        return (u6c) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static u6c parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (u6c) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
