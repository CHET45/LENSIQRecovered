package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.u27;
import p000.u6c;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public final class j45 extends u27<j45, C7731b> implements m45 {
    private static final j45 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile vhc<j45> PARSER;
    private int number_;
    private String name_ = "";
    private v98.InterfaceC13956l<u6c> options_ = u27.m23036w();

    /* JADX INFO: renamed from: j45$a */
    public static /* synthetic */ class C7730a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49505a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f49505a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49505a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49505a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49505a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49505a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49505a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f49505a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: j45$b */
    public static final class C7731b extends u27.AbstractC13324b<j45, C7731b> implements m45 {
        public /* synthetic */ C7731b(C7730a c7730a) {
            this();
        }

        public C7731b addAllOptions(Iterable<? extends u6c> values) {
            m23058e();
            ((j45) this.f86607b).addAllOptions(values);
            return this;
        }

        public C7731b addOptions(u6c value) {
            m23058e();
            ((j45) this.f86607b).addOptions(value);
            return this;
        }

        public C7731b clearName() {
            m23058e();
            ((j45) this.f86607b).clearName();
            return this;
        }

        public C7731b clearNumber() {
            m23058e();
            ((j45) this.f86607b).clearNumber();
            return this;
        }

        public C7731b clearOptions() {
            m23058e();
            ((j45) this.f86607b).clearOptions();
            return this;
        }

        @Override // p000.m45
        public String getName() {
            return ((j45) this.f86607b).getName();
        }

        @Override // p000.m45
        public wj1 getNameBytes() {
            return ((j45) this.f86607b).getNameBytes();
        }

        @Override // p000.m45
        public int getNumber() {
            return ((j45) this.f86607b).getNumber();
        }

        @Override // p000.m45
        public u6c getOptions(int index) {
            return ((j45) this.f86607b).getOptions(index);
        }

        @Override // p000.m45
        public int getOptionsCount() {
            return ((j45) this.f86607b).getOptionsCount();
        }

        @Override // p000.m45
        public List<u6c> getOptionsList() {
            return Collections.unmodifiableList(((j45) this.f86607b).getOptionsList());
        }

        public C7731b removeOptions(int index) {
            m23058e();
            ((j45) this.f86607b).removeOptions(index);
            return this;
        }

        public C7731b setName(String value) {
            m23058e();
            ((j45) this.f86607b).setName(value);
            return this;
        }

        public C7731b setNameBytes(wj1 value) {
            m23058e();
            ((j45) this.f86607b).setNameBytes(value);
            return this;
        }

        public C7731b setNumber(int value) {
            m23058e();
            ((j45) this.f86607b).setNumber(value);
            return this;
        }

        public C7731b setOptions(int index, u6c value) {
            m23058e();
            ((j45) this.f86607b).setOptions(index, value);
            return this;
        }

        private C7731b() {
            super(j45.DEFAULT_INSTANCE);
        }

        public C7731b addOptions(int index, u6c value) {
            m23058e();
            ((j45) this.f86607b).addOptions(index, value);
            return this;
        }

        public C7731b setOptions(int index, u6c.C13378b builderForValue) {
            m23058e();
            ((j45) this.f86607b).setOptions(index, builderForValue.build());
            return this;
        }

        public C7731b addOptions(u6c.C13378b builderForValue) {
            m23058e();
            ((j45) this.f86607b).addOptions(builderForValue.build());
            return this;
        }

        public C7731b addOptions(int index, u6c.C13378b builderForValue) {
            m23058e();
            ((j45) this.f86607b).addOptions(index, builderForValue.build());
            return this;
        }
    }

    static {
        j45 j45Var = new j45();
        DEFAULT_INSTANCE = j45Var;
        u27.m23029g0(j45.class, j45Var);
    }

    private j45() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends u6c> values) {
        ensureOptionsIsMutable();
        AbstractC0027a3.m80a(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(u6c value) {
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
        this.options_ = u27.m23036w();
    }

    private void ensureOptionsIsMutable() {
        v98.InterfaceC13956l<u6c> interfaceC13956l = this.options_;
        if (interfaceC13956l.isModifiable()) {
            return;
        }
        this.options_ = u27.m23012O(interfaceC13956l);
    }

    public static j45 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C7731b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static j45 parseDelimitedFrom(InputStream input) throws IOException {
        return (j45) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static j45 parseFrom(ByteBuffer data) throws be8 {
        return (j45) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<j45> parser() {
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
    public void setNameBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        this.name_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int value) {
        this.number_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int index, u6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.set(index, value);
    }

    @Override // p000.m45
    public String getName() {
        return this.name_;
    }

    @Override // p000.m45
    public wj1 getNameBytes() {
        return wj1.copyFromUtf8(this.name_);
    }

    @Override // p000.m45
    public int getNumber() {
        return this.number_;
    }

    @Override // p000.m45
    public u6c getOptions(int index) {
        return this.options_.get(index);
    }

    @Override // p000.m45
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // p000.m45
    public List<u6c> getOptionsList() {
        return this.options_;
    }

    public y6c getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    public List<? extends y6c> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C7730a c7730a = null;
        switch (C7730a.f49505a[method.ordinal()]) {
            case 1:
                return new j45();
            case 2:
                return new C7731b(c7730a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", u6c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<j45> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (j45.class) {
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

    public static C7731b newBuilder(j45 prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static j45 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (j45) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static j45 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (j45) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static j45 parseFrom(wj1 data) throws be8 {
        return (j45) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, u6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    public static j45 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (j45) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static j45 parseFrom(byte[] data) throws be8 {
        return (j45) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static j45 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (j45) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static j45 parseFrom(InputStream input) throws IOException {
        return (j45) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static j45 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (j45) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static j45 parseFrom(e72 input) throws IOException {
        return (j45) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static j45 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (j45) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
