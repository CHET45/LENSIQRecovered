package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.C15896yz;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class w6c extends v27<w6c, C14445b> implements x6c {
    private static final w6c DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<w6c> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private C15896yz value_;

    /* JADX INFO: renamed from: w6c$a */
    public static /* synthetic */ class C14444a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93432a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f93432a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93432a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93432a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93432a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93432a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93432a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93432a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: w6c$b */
    public static final class C14445b extends v27.AbstractC13823b<w6c, C14445b> implements x6c {
        public /* synthetic */ C14445b(C14444a c14444a) {
            this();
        }

        public C14445b clearName() {
            m23743e();
            ((w6c) this.f89756b).clearName();
            return this;
        }

        public C14445b clearValue() {
            m23743e();
            ((w6c) this.f89756b).clearValue();
            return this;
        }

        @Override // p000.x6c
        public String getName() {
            return ((w6c) this.f89756b).getName();
        }

        @Override // p000.x6c
        public vj1 getNameBytes() {
            return ((w6c) this.f89756b).getNameBytes();
        }

        @Override // p000.x6c
        public C15896yz getValue() {
            return ((w6c) this.f89756b).getValue();
        }

        @Override // p000.x6c
        public boolean hasValue() {
            return ((w6c) this.f89756b).hasValue();
        }

        public C14445b mergeValue(C15896yz value) {
            m23743e();
            ((w6c) this.f89756b).mergeValue(value);
            return this;
        }

        public C14445b setName(String value) {
            m23743e();
            ((w6c) this.f89756b).setName(value);
            return this;
        }

        public C14445b setNameBytes(vj1 value) {
            m23743e();
            ((w6c) this.f89756b).setNameBytes(value);
            return this;
        }

        public C14445b setValue(C15896yz value) {
            m23743e();
            ((w6c) this.f89756b).setValue(value);
            return this;
        }

        private C14445b() {
            super(w6c.DEFAULT_INSTANCE);
        }

        public C14445b setValue(C15896yz.b builderForValue) {
            m23743e();
            ((w6c) this.f89756b).setValue(builderForValue.build());
            return this;
        }
    }

    static {
        w6c w6cVar = new w6c();
        DEFAULT_INSTANCE = w6cVar;
        v27.m23715h0(w6c.class, w6cVar);
    }

    private w6c() {
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

    public static w6c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(C15896yz value) {
        value.getClass();
        C15896yz c15896yz = this.value_;
        if (c15896yz == null || c15896yz == C15896yz.getDefaultInstance()) {
            this.value_ = value;
        } else {
            this.value_ = C15896yz.newBuilder(this.value_).mergeFrom(value).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C14445b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static w6c parseDelimitedFrom(InputStream input) throws IOException {
        return (w6c) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static w6c parseFrom(ByteBuffer data) throws ce8 {
        return (w6c) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<w6c> parser() {
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
    public void setValue(C15896yz value) {
        value.getClass();
        this.value_ = value;
        this.bitField0_ |= 1;
    }

    @Override // p000.x6c
    public String getName() {
        return this.name_;
    }

    @Override // p000.x6c
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.x6c
    public C15896yz getValue() {
        C15896yz c15896yz = this.value_;
        return c15896yz == null ? C15896yz.getDefaultInstance() : c15896yz;
    }

    @Override // p000.x6c
    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C14444a c14444a = null;
        switch (C14444a.f93432a[method.ordinal()]) {
            case 1:
                return new w6c();
            case 2:
                return new C14445b(c14444a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<w6c> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (w6c.class) {
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

    public static C14445b newBuilder(w6c prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static w6c parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (w6c) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static w6c parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (w6c) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static w6c parseFrom(vj1 data) throws ce8 {
        return (w6c) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static w6c parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (w6c) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static w6c parseFrom(byte[] data) throws ce8 {
        return (w6c) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static w6c parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (w6c) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static w6c parseFrom(InputStream input) throws IOException {
        return (w6c) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static w6c parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (w6c) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static w6c parseFrom(f72 input) throws IOException {
        return (w6c) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static w6c parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (w6c) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
