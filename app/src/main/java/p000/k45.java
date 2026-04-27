package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w6c;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class k45 extends v27<k45, C8193b> implements l45 {
    private static final k45 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile uhc<k45> PARSER;
    private int number_;
    private String name_ = "";
    private w98.InterfaceC14504k<w6c> options_ = v27.m23722x();

    /* JADX INFO: renamed from: k45$a */
    public static /* synthetic */ class C8192a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52565a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f52565a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52565a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52565a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52565a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52565a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52565a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52565a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: k45$b */
    public static final class C8193b extends v27.AbstractC13823b<k45, C8193b> implements l45 {
        public /* synthetic */ C8193b(C8192a c8192a) {
            this();
        }

        public C8193b addAllOptions(Iterable<? extends w6c> values) {
            m23743e();
            ((k45) this.f89756b).addAllOptions(values);
            return this;
        }

        public C8193b addOptions(w6c value) {
            m23743e();
            ((k45) this.f89756b).addOptions(value);
            return this;
        }

        public C8193b clearName() {
            m23743e();
            ((k45) this.f89756b).clearName();
            return this;
        }

        public C8193b clearNumber() {
            m23743e();
            ((k45) this.f89756b).clearNumber();
            return this;
        }

        public C8193b clearOptions() {
            m23743e();
            ((k45) this.f89756b).clearOptions();
            return this;
        }

        @Override // p000.l45
        public String getName() {
            return ((k45) this.f89756b).getName();
        }

        @Override // p000.l45
        public vj1 getNameBytes() {
            return ((k45) this.f89756b).getNameBytes();
        }

        @Override // p000.l45
        public int getNumber() {
            return ((k45) this.f89756b).getNumber();
        }

        @Override // p000.l45
        public w6c getOptions(int index) {
            return ((k45) this.f89756b).getOptions(index);
        }

        @Override // p000.l45
        public int getOptionsCount() {
            return ((k45) this.f89756b).getOptionsCount();
        }

        @Override // p000.l45
        public List<w6c> getOptionsList() {
            return Collections.unmodifiableList(((k45) this.f89756b).getOptionsList());
        }

        public C8193b removeOptions(int index) {
            m23743e();
            ((k45) this.f89756b).removeOptions(index);
            return this;
        }

        public C8193b setName(String value) {
            m23743e();
            ((k45) this.f89756b).setName(value);
            return this;
        }

        public C8193b setNameBytes(vj1 value) {
            m23743e();
            ((k45) this.f89756b).setNameBytes(value);
            return this;
        }

        public C8193b setNumber(int value) {
            m23743e();
            ((k45) this.f89756b).setNumber(value);
            return this;
        }

        public C8193b setOptions(int index, w6c value) {
            m23743e();
            ((k45) this.f89756b).setOptions(index, value);
            return this;
        }

        private C8193b() {
            super(k45.DEFAULT_INSTANCE);
        }

        public C8193b addOptions(int index, w6c value) {
            m23743e();
            ((k45) this.f89756b).addOptions(index, value);
            return this;
        }

        public C8193b setOptions(int index, w6c.C14445b builderForValue) {
            m23743e();
            ((k45) this.f89756b).setOptions(index, builderForValue.build());
            return this;
        }

        public C8193b addOptions(w6c.C14445b builderForValue) {
            m23743e();
            ((k45) this.f89756b).addOptions(builderForValue.build());
            return this;
        }

        public C8193b addOptions(int index, w6c.C14445b builderForValue) {
            m23743e();
            ((k45) this.f89756b).addOptions(index, builderForValue.build());
            return this;
        }
    }

    static {
        k45 k45Var = new k45();
        DEFAULT_INSTANCE = k45Var;
        v27.m23715h0(k45.class, k45Var);
    }

    private k45() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends w6c> values) {
        ensureOptionsIsMutable();
        AbstractC1714b3.m2856b(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(w6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = v27.m23722x();
    }

    private void ensureOptionsIsMutable() {
        w98.InterfaceC14504k<w6c> interfaceC14504k = this.options_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.options_ = v27.m23698P(interfaceC14504k);
    }

    public static k45 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8193b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static k45 parseDelimitedFrom(InputStream input) throws IOException {
        return (k45) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static k45 parseFrom(ByteBuffer data) throws ce8 {
        return (k45) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<k45> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int index) {
        ensureOptionsIsMutable();
        this.options_.remove(index);
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
    public void setNumber(int value) {
        this.number_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int index, w6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.set(index, value);
    }

    @Override // p000.l45
    public String getName() {
        return this.name_;
    }

    @Override // p000.l45
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.l45
    public int getNumber() {
        return this.number_;
    }

    @Override // p000.l45
    public w6c getOptions(int index) {
        return this.options_.get(index);
    }

    @Override // p000.l45
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // p000.l45
    public List<w6c> getOptionsList() {
        return this.options_;
    }

    public x6c getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    public List<? extends x6c> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C8192a c8192a = null;
        switch (C8192a.f52565a[method.ordinal()]) {
            case 1:
                return new k45();
            case 2:
                return new C8193b(c8192a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", w6c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<k45> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (k45.class) {
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

    public static C8193b newBuilder(k45 prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static k45 parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (k45) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static k45 parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (k45) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static k45 parseFrom(vj1 data) throws ce8 {
        return (k45) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, w6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    public static k45 parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (k45) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static k45 parseFrom(byte[] data) throws ce8 {
        return (k45) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static k45 parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (k45) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static k45 parseFrom(InputStream input) throws IOException {
        return (k45) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static k45 parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (k45) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static k45 parseFrom(f72 input) throws IOException {
        return (k45) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static k45 parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (k45) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
