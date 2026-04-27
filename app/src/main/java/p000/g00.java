package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.kwa;
import p000.oua;
import p000.u27;
import p000.u6c;
import p000.v98;
import p000.xvf;

/* JADX INFO: loaded from: classes3.dex */
public final class g00 extends u27<g00, C6048b> implements g10 {
    private static final g00 DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile vhc<g00> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private int bitField0_;
    private xvf sourceContext_;
    private int syntax_;
    private String name_ = "";
    private v98.InterfaceC13956l<oua> methods_ = u27.m23036w();
    private v98.InterfaceC13956l<u6c> options_ = u27.m23036w();
    private String version_ = "";
    private v98.InterfaceC13956l<kwa> mixins_ = u27.m23036w();

    /* JADX INFO: renamed from: g00$a */
    public static /* synthetic */ class C6047a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38103a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f38103a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38103a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38103a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38103a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38103a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38103a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38103a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: g00$b */
    public static final class C6048b extends u27.AbstractC13324b<g00, C6048b> implements g10 {
        public /* synthetic */ C6048b(C6047a c6047a) {
            this();
        }

        public C6048b addAllMethods(Iterable<? extends oua> values) {
            m23058e();
            ((g00) this.f86607b).addAllMethods(values);
            return this;
        }

        public C6048b addAllMixins(Iterable<? extends kwa> values) {
            m23058e();
            ((g00) this.f86607b).addAllMixins(values);
            return this;
        }

        public C6048b addAllOptions(Iterable<? extends u6c> values) {
            m23058e();
            ((g00) this.f86607b).addAllOptions(values);
            return this;
        }

        public C6048b addMethods(oua value) {
            m23058e();
            ((g00) this.f86607b).addMethods(value);
            return this;
        }

        public C6048b addMixins(kwa value) {
            m23058e();
            ((g00) this.f86607b).addMixins(value);
            return this;
        }

        public C6048b addOptions(u6c value) {
            m23058e();
            ((g00) this.f86607b).addOptions(value);
            return this;
        }

        public C6048b clearMethods() {
            m23058e();
            ((g00) this.f86607b).clearMethods();
            return this;
        }

        public C6048b clearMixins() {
            m23058e();
            ((g00) this.f86607b).clearMixins();
            return this;
        }

        public C6048b clearName() {
            m23058e();
            ((g00) this.f86607b).clearName();
            return this;
        }

        public C6048b clearOptions() {
            m23058e();
            ((g00) this.f86607b).clearOptions();
            return this;
        }

        public C6048b clearSourceContext() {
            m23058e();
            ((g00) this.f86607b).clearSourceContext();
            return this;
        }

        public C6048b clearSyntax() {
            m23058e();
            ((g00) this.f86607b).clearSyntax();
            return this;
        }

        public C6048b clearVersion() {
            m23058e();
            ((g00) this.f86607b).clearVersion();
            return this;
        }

        @Override // p000.g10
        public oua getMethods(int index) {
            return ((g00) this.f86607b).getMethods(index);
        }

        @Override // p000.g10
        public int getMethodsCount() {
            return ((g00) this.f86607b).getMethodsCount();
        }

        @Override // p000.g10
        public List<oua> getMethodsList() {
            return Collections.unmodifiableList(((g00) this.f86607b).getMethodsList());
        }

        @Override // p000.g10
        public kwa getMixins(int index) {
            return ((g00) this.f86607b).getMixins(index);
        }

        @Override // p000.g10
        public int getMixinsCount() {
            return ((g00) this.f86607b).getMixinsCount();
        }

        @Override // p000.g10
        public List<kwa> getMixinsList() {
            return Collections.unmodifiableList(((g00) this.f86607b).getMixinsList());
        }

        @Override // p000.g10
        public String getName() {
            return ((g00) this.f86607b).getName();
        }

        @Override // p000.g10
        public wj1 getNameBytes() {
            return ((g00) this.f86607b).getNameBytes();
        }

        @Override // p000.g10
        public u6c getOptions(int index) {
            return ((g00) this.f86607b).getOptions(index);
        }

        @Override // p000.g10
        public int getOptionsCount() {
            return ((g00) this.f86607b).getOptionsCount();
        }

        @Override // p000.g10
        public List<u6c> getOptionsList() {
            return Collections.unmodifiableList(((g00) this.f86607b).getOptionsList());
        }

        @Override // p000.g10
        public xvf getSourceContext() {
            return ((g00) this.f86607b).getSourceContext();
        }

        @Override // p000.g10
        public pig getSyntax() {
            return ((g00) this.f86607b).getSyntax();
        }

        @Override // p000.g10
        public int getSyntaxValue() {
            return ((g00) this.f86607b).getSyntaxValue();
        }

        @Override // p000.g10
        public String getVersion() {
            return ((g00) this.f86607b).getVersion();
        }

        @Override // p000.g10
        public wj1 getVersionBytes() {
            return ((g00) this.f86607b).getVersionBytes();
        }

        @Override // p000.g10
        public boolean hasSourceContext() {
            return ((g00) this.f86607b).hasSourceContext();
        }

        public C6048b mergeSourceContext(xvf value) {
            m23058e();
            ((g00) this.f86607b).mergeSourceContext(value);
            return this;
        }

        public C6048b removeMethods(int index) {
            m23058e();
            ((g00) this.f86607b).removeMethods(index);
            return this;
        }

        public C6048b removeMixins(int index) {
            m23058e();
            ((g00) this.f86607b).removeMixins(index);
            return this;
        }

        public C6048b removeOptions(int index) {
            m23058e();
            ((g00) this.f86607b).removeOptions(index);
            return this;
        }

        public C6048b setMethods(int index, oua value) {
            m23058e();
            ((g00) this.f86607b).setMethods(index, value);
            return this;
        }

        public C6048b setMixins(int index, kwa value) {
            m23058e();
            ((g00) this.f86607b).setMixins(index, value);
            return this;
        }

        public C6048b setName(String value) {
            m23058e();
            ((g00) this.f86607b).setName(value);
            return this;
        }

        public C6048b setNameBytes(wj1 value) {
            m23058e();
            ((g00) this.f86607b).setNameBytes(value);
            return this;
        }

        public C6048b setOptions(int index, u6c value) {
            m23058e();
            ((g00) this.f86607b).setOptions(index, value);
            return this;
        }

        public C6048b setSourceContext(xvf value) {
            m23058e();
            ((g00) this.f86607b).setSourceContext(value);
            return this;
        }

        public C6048b setSyntax(pig value) {
            m23058e();
            ((g00) this.f86607b).setSyntax(value);
            return this;
        }

        public C6048b setSyntaxValue(int value) {
            m23058e();
            ((g00) this.f86607b).setSyntaxValue(value);
            return this;
        }

        public C6048b setVersion(String value) {
            m23058e();
            ((g00) this.f86607b).setVersion(value);
            return this;
        }

        public C6048b setVersionBytes(wj1 value) {
            m23058e();
            ((g00) this.f86607b).setVersionBytes(value);
            return this;
        }

        private C6048b() {
            super(g00.DEFAULT_INSTANCE);
        }

        public C6048b addMethods(int index, oua value) {
            m23058e();
            ((g00) this.f86607b).addMethods(index, value);
            return this;
        }

        public C6048b addMixins(int index, kwa value) {
            m23058e();
            ((g00) this.f86607b).addMixins(index, value);
            return this;
        }

        public C6048b addOptions(int index, u6c value) {
            m23058e();
            ((g00) this.f86607b).addOptions(index, value);
            return this;
        }

        public C6048b setMethods(int index, oua.C10658b builderForValue) {
            m23058e();
            ((g00) this.f86607b).setMethods(index, builderForValue.build());
            return this;
        }

        public C6048b setMixins(int index, kwa.C8537b builderForValue) {
            m23058e();
            ((g00) this.f86607b).setMixins(index, builderForValue.build());
            return this;
        }

        public C6048b setOptions(int index, u6c.C13378b builderForValue) {
            m23058e();
            ((g00) this.f86607b).setOptions(index, builderForValue.build());
            return this;
        }

        public C6048b setSourceContext(xvf.C15319b builderForValue) {
            m23058e();
            ((g00) this.f86607b).setSourceContext(builderForValue.build());
            return this;
        }

        public C6048b addMethods(oua.C10658b builderForValue) {
            m23058e();
            ((g00) this.f86607b).addMethods(builderForValue.build());
            return this;
        }

        public C6048b addMixins(kwa.C8537b builderForValue) {
            m23058e();
            ((g00) this.f86607b).addMixins(builderForValue.build());
            return this;
        }

        public C6048b addOptions(u6c.C13378b builderForValue) {
            m23058e();
            ((g00) this.f86607b).addOptions(builderForValue.build());
            return this;
        }

        public C6048b addMethods(int index, oua.C10658b builderForValue) {
            m23058e();
            ((g00) this.f86607b).addMethods(index, builderForValue.build());
            return this;
        }

        public C6048b addMixins(int index, kwa.C8537b builderForValue) {
            m23058e();
            ((g00) this.f86607b).addMixins(index, builderForValue.build());
            return this;
        }

        public C6048b addOptions(int index, u6c.C13378b builderForValue) {
            m23058e();
            ((g00) this.f86607b).addOptions(index, builderForValue.build());
            return this;
        }
    }

    static {
        g00 g00Var = new g00();
        DEFAULT_INSTANCE = g00Var;
        u27.m23029g0(g00.class, g00Var);
    }

    private g00() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMethods(Iterable<? extends oua> values) {
        ensureMethodsIsMutable();
        AbstractC0027a3.m80a(values, this.methods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMixins(Iterable<? extends kwa> values) {
        ensureMixinsIsMutable();
        AbstractC0027a3.m80a(values, this.mixins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends u6c> values) {
        ensureOptionsIsMutable();
        AbstractC0027a3.m80a(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethods(oua value) {
        value.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMixins(kwa value) {
        value.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(u6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethods() {
        this.methods_ = u27.m23036w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMixins() {
        this.mixins_ = u27.m23036w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = u27.m23036w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContext() {
        this.sourceContext_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    private void ensureMethodsIsMutable() {
        v98.InterfaceC13956l<oua> interfaceC13956l = this.methods_;
        if (interfaceC13956l.isModifiable()) {
            return;
        }
        this.methods_ = u27.m23012O(interfaceC13956l);
    }

    private void ensureMixinsIsMutable() {
        v98.InterfaceC13956l<kwa> interfaceC13956l = this.mixins_;
        if (interfaceC13956l.isModifiable()) {
            return;
        }
        this.mixins_ = u27.m23012O(interfaceC13956l);
    }

    private void ensureOptionsIsMutable() {
        v98.InterfaceC13956l<u6c> interfaceC13956l = this.options_;
        if (interfaceC13956l.isModifiable()) {
            return;
        }
        this.options_ = u27.m23012O(interfaceC13956l);
    }

    public static g00 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContext(xvf value) {
        value.getClass();
        xvf xvfVar = this.sourceContext_;
        if (xvfVar == null || xvfVar == xvf.getDefaultInstance()) {
            this.sourceContext_ = value;
        } else {
            this.sourceContext_ = xvf.newBuilder(this.sourceContext_).mergeFrom(value).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6048b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static g00 parseDelimitedFrom(InputStream input) throws IOException {
        return (g00) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static g00 parseFrom(ByteBuffer data) throws be8 {
        return (g00) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<g00> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMethods(int index) {
        ensureMethodsIsMutable();
        this.methods_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMixins(int index) {
        ensureMixinsIsMutable();
        this.mixins_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int index) {
        ensureOptionsIsMutable();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethods(int index, oua value) {
        value.getClass();
        ensureMethodsIsMutable();
        this.methods_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMixins(int index, kwa value) {
        value.getClass();
        ensureMixinsIsMutable();
        this.mixins_.set(index, value);
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
    public void setOptions(int index, u6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContext(xvf value) {
        value.getClass();
        this.sourceContext_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(pig value) {
        this.syntax_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int value) {
        this.syntax_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(String value) {
        value.getClass();
        this.version_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        this.version_ = value.toStringUtf8();
    }

    @Override // p000.g10
    public oua getMethods(int index) {
        return this.methods_.get(index);
    }

    @Override // p000.g10
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // p000.g10
    public List<oua> getMethodsList() {
        return this.methods_;
    }

    public uua getMethodsOrBuilder(int index) {
        return this.methods_.get(index);
    }

    public List<? extends uua> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // p000.g10
    public kwa getMixins(int index) {
        return this.mixins_.get(index);
    }

    @Override // p000.g10
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // p000.g10
    public List<kwa> getMixinsList() {
        return this.mixins_;
    }

    public nwa getMixinsOrBuilder(int index) {
        return this.mixins_.get(index);
    }

    public List<? extends nwa> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // p000.g10
    public String getName() {
        return this.name_;
    }

    @Override // p000.g10
    public wj1 getNameBytes() {
        return wj1.copyFromUtf8(this.name_);
    }

    @Override // p000.g10
    public u6c getOptions(int index) {
        return this.options_.get(index);
    }

    @Override // p000.g10
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // p000.g10
    public List<u6c> getOptionsList() {
        return this.options_;
    }

    public y6c getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    public List<? extends y6c> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // p000.g10
    public xvf getSourceContext() {
        xvf xvfVar = this.sourceContext_;
        return xvfVar == null ? xvf.getDefaultInstance() : xvfVar;
    }

    @Override // p000.g10
    public pig getSyntax() {
        pig pigVarForNumber = pig.forNumber(this.syntax_);
        return pigVarForNumber == null ? pig.UNRECOGNIZED : pigVarForNumber;
    }

    @Override // p000.g10
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // p000.g10
    public String getVersion() {
        return this.version_;
    }

    @Override // p000.g10
    public wj1 getVersionBytes() {
        return wj1.copyFromUtf8(this.version_);
    }

    @Override // p000.g10
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C6047a c6047a = null;
        switch (C6047a.f38103a[method.ordinal()]) {
            case 1:
                return new g00();
            case 2:
                return new C6048b(c6047a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005ဉ\u0000\u0006\u001b\u0007\f", new Object[]{"bitField0_", "name_", "methods_", oua.class, "options_", u6c.class, "version_", "sourceContext_", "mixins_", kwa.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<g00> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (g00.class) {
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

    public static C6048b newBuilder(g00 prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static g00 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (g00) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static g00 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (g00) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static g00 parseFrom(wj1 data) throws be8 {
        return (g00) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethods(int index, oua value) {
        value.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMixins(int index, kwa value) {
        value.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, u6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    public static g00 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (g00) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static g00 parseFrom(byte[] data) throws be8 {
        return (g00) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static g00 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (g00) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static g00 parseFrom(InputStream input) throws IOException {
        return (g00) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static g00 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (g00) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static g00 parseFrom(e72 input) throws IOException {
        return (g00) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static g00 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (g00) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
