package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.lwa;
import p000.pua;
import p000.v27;
import p000.w6c;
import p000.w98;
import p000.yvf;

/* JADX INFO: loaded from: classes4.dex */
public final class j00 extends v27<j00, C7699b> implements f10 {
    private static final j00 DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile uhc<j00> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private int bitField0_;
    private yvf sourceContext_;
    private int syntax_;
    private String name_ = "";
    private w98.InterfaceC14504k<pua> methods_ = v27.m23722x();
    private w98.InterfaceC14504k<w6c> options_ = v27.m23722x();
    private String version_ = "";
    private w98.InterfaceC14504k<lwa> mixins_ = v27.m23722x();

    /* JADX INFO: renamed from: j00$a */
    public static /* synthetic */ class C7698a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49202a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f49202a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49202a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49202a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49202a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49202a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49202a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f49202a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: j00$b */
    public static final class C7699b extends v27.AbstractC13823b<j00, C7699b> implements f10 {
        public /* synthetic */ C7699b(C7698a c7698a) {
            this();
        }

        public C7699b addAllMethods(Iterable<? extends pua> values) {
            m23743e();
            ((j00) this.f89756b).addAllMethods(values);
            return this;
        }

        public C7699b addAllMixins(Iterable<? extends lwa> values) {
            m23743e();
            ((j00) this.f89756b).addAllMixins(values);
            return this;
        }

        public C7699b addAllOptions(Iterable<? extends w6c> values) {
            m23743e();
            ((j00) this.f89756b).addAllOptions(values);
            return this;
        }

        public C7699b addMethods(pua value) {
            m23743e();
            ((j00) this.f89756b).addMethods(value);
            return this;
        }

        public C7699b addMixins(lwa value) {
            m23743e();
            ((j00) this.f89756b).addMixins(value);
            return this;
        }

        public C7699b addOptions(w6c value) {
            m23743e();
            ((j00) this.f89756b).addOptions(value);
            return this;
        }

        public C7699b clearMethods() {
            m23743e();
            ((j00) this.f89756b).clearMethods();
            return this;
        }

        public C7699b clearMixins() {
            m23743e();
            ((j00) this.f89756b).clearMixins();
            return this;
        }

        public C7699b clearName() {
            m23743e();
            ((j00) this.f89756b).clearName();
            return this;
        }

        public C7699b clearOptions() {
            m23743e();
            ((j00) this.f89756b).clearOptions();
            return this;
        }

        public C7699b clearSourceContext() {
            m23743e();
            ((j00) this.f89756b).clearSourceContext();
            return this;
        }

        public C7699b clearSyntax() {
            m23743e();
            ((j00) this.f89756b).clearSyntax();
            return this;
        }

        public C7699b clearVersion() {
            m23743e();
            ((j00) this.f89756b).clearVersion();
            return this;
        }

        @Override // p000.f10
        public pua getMethods(int index) {
            return ((j00) this.f89756b).getMethods(index);
        }

        @Override // p000.f10
        public int getMethodsCount() {
            return ((j00) this.f89756b).getMethodsCount();
        }

        @Override // p000.f10
        public List<pua> getMethodsList() {
            return Collections.unmodifiableList(((j00) this.f89756b).getMethodsList());
        }

        @Override // p000.f10
        public lwa getMixins(int index) {
            return ((j00) this.f89756b).getMixins(index);
        }

        @Override // p000.f10
        public int getMixinsCount() {
            return ((j00) this.f89756b).getMixinsCount();
        }

        @Override // p000.f10
        public List<lwa> getMixinsList() {
            return Collections.unmodifiableList(((j00) this.f89756b).getMixinsList());
        }

        @Override // p000.f10
        public String getName() {
            return ((j00) this.f89756b).getName();
        }

        @Override // p000.f10
        public vj1 getNameBytes() {
            return ((j00) this.f89756b).getNameBytes();
        }

        @Override // p000.f10
        public w6c getOptions(int index) {
            return ((j00) this.f89756b).getOptions(index);
        }

        @Override // p000.f10
        public int getOptionsCount() {
            return ((j00) this.f89756b).getOptionsCount();
        }

        @Override // p000.f10
        public List<w6c> getOptionsList() {
            return Collections.unmodifiableList(((j00) this.f89756b).getOptionsList());
        }

        @Override // p000.f10
        public yvf getSourceContext() {
            return ((j00) this.f89756b).getSourceContext();
        }

        @Override // p000.f10
        public qig getSyntax() {
            return ((j00) this.f89756b).getSyntax();
        }

        @Override // p000.f10
        public int getSyntaxValue() {
            return ((j00) this.f89756b).getSyntaxValue();
        }

        @Override // p000.f10
        public String getVersion() {
            return ((j00) this.f89756b).getVersion();
        }

        @Override // p000.f10
        public vj1 getVersionBytes() {
            return ((j00) this.f89756b).getVersionBytes();
        }

        @Override // p000.f10
        public boolean hasSourceContext() {
            return ((j00) this.f89756b).hasSourceContext();
        }

        public C7699b mergeSourceContext(yvf value) {
            m23743e();
            ((j00) this.f89756b).mergeSourceContext(value);
            return this;
        }

        public C7699b removeMethods(int index) {
            m23743e();
            ((j00) this.f89756b).removeMethods(index);
            return this;
        }

        public C7699b removeMixins(int index) {
            m23743e();
            ((j00) this.f89756b).removeMixins(index);
            return this;
        }

        public C7699b removeOptions(int index) {
            m23743e();
            ((j00) this.f89756b).removeOptions(index);
            return this;
        }

        public C7699b setMethods(int index, pua value) {
            m23743e();
            ((j00) this.f89756b).setMethods(index, value);
            return this;
        }

        public C7699b setMixins(int index, lwa value) {
            m23743e();
            ((j00) this.f89756b).setMixins(index, value);
            return this;
        }

        public C7699b setName(String value) {
            m23743e();
            ((j00) this.f89756b).setName(value);
            return this;
        }

        public C7699b setNameBytes(vj1 value) {
            m23743e();
            ((j00) this.f89756b).setNameBytes(value);
            return this;
        }

        public C7699b setOptions(int index, w6c value) {
            m23743e();
            ((j00) this.f89756b).setOptions(index, value);
            return this;
        }

        public C7699b setSourceContext(yvf value) {
            m23743e();
            ((j00) this.f89756b).setSourceContext(value);
            return this;
        }

        public C7699b setSyntax(qig value) {
            m23743e();
            ((j00) this.f89756b).setSyntax(value);
            return this;
        }

        public C7699b setSyntaxValue(int value) {
            m23743e();
            ((j00) this.f89756b).setSyntaxValue(value);
            return this;
        }

        public C7699b setVersion(String value) {
            m23743e();
            ((j00) this.f89756b).setVersion(value);
            return this;
        }

        public C7699b setVersionBytes(vj1 value) {
            m23743e();
            ((j00) this.f89756b).setVersionBytes(value);
            return this;
        }

        private C7699b() {
            super(j00.DEFAULT_INSTANCE);
        }

        public C7699b addMethods(int index, pua value) {
            m23743e();
            ((j00) this.f89756b).addMethods(index, value);
            return this;
        }

        public C7699b addMixins(int index, lwa value) {
            m23743e();
            ((j00) this.f89756b).addMixins(index, value);
            return this;
        }

        public C7699b addOptions(int index, w6c value) {
            m23743e();
            ((j00) this.f89756b).addOptions(index, value);
            return this;
        }

        public C7699b setMethods(int index, pua.C11126b builderForValue) {
            m23743e();
            ((j00) this.f89756b).setMethods(index, builderForValue.build());
            return this;
        }

        public C7699b setMixins(int index, lwa.C9010b builderForValue) {
            m23743e();
            ((j00) this.f89756b).setMixins(index, builderForValue.build());
            return this;
        }

        public C7699b setOptions(int index, w6c.C14445b builderForValue) {
            m23743e();
            ((j00) this.f89756b).setOptions(index, builderForValue.build());
            return this;
        }

        public C7699b setSourceContext(yvf.C15851b builderForValue) {
            m23743e();
            ((j00) this.f89756b).setSourceContext(builderForValue.build());
            return this;
        }

        public C7699b addMethods(pua.C11126b builderForValue) {
            m23743e();
            ((j00) this.f89756b).addMethods(builderForValue.build());
            return this;
        }

        public C7699b addMixins(lwa.C9010b builderForValue) {
            m23743e();
            ((j00) this.f89756b).addMixins(builderForValue.build());
            return this;
        }

        public C7699b addOptions(w6c.C14445b builderForValue) {
            m23743e();
            ((j00) this.f89756b).addOptions(builderForValue.build());
            return this;
        }

        public C7699b addMethods(int index, pua.C11126b builderForValue) {
            m23743e();
            ((j00) this.f89756b).addMethods(index, builderForValue.build());
            return this;
        }

        public C7699b addMixins(int index, lwa.C9010b builderForValue) {
            m23743e();
            ((j00) this.f89756b).addMixins(index, builderForValue.build());
            return this;
        }

        public C7699b addOptions(int index, w6c.C14445b builderForValue) {
            m23743e();
            ((j00) this.f89756b).addOptions(index, builderForValue.build());
            return this;
        }
    }

    static {
        j00 j00Var = new j00();
        DEFAULT_INSTANCE = j00Var;
        v27.m23715h0(j00.class, j00Var);
    }

    private j00() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMethods(Iterable<? extends pua> values) {
        ensureMethodsIsMutable();
        AbstractC1714b3.m2856b(values, this.methods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMixins(Iterable<? extends lwa> values) {
        ensureMixinsIsMutable();
        AbstractC1714b3.m2856b(values, this.mixins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends w6c> values) {
        ensureOptionsIsMutable();
        AbstractC1714b3.m2856b(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethods(pua value) {
        value.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMixins(lwa value) {
        value.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(w6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethods() {
        this.methods_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMixins() {
        this.mixins_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = v27.m23722x();
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
        w98.InterfaceC14504k<pua> interfaceC14504k = this.methods_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.methods_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureMixinsIsMutable() {
        w98.InterfaceC14504k<lwa> interfaceC14504k = this.mixins_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.mixins_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureOptionsIsMutable() {
        w98.InterfaceC14504k<w6c> interfaceC14504k = this.options_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.options_ = v27.m23698P(interfaceC14504k);
    }

    public static j00 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContext(yvf value) {
        value.getClass();
        yvf yvfVar = this.sourceContext_;
        if (yvfVar == null || yvfVar == yvf.getDefaultInstance()) {
            this.sourceContext_ = value;
        } else {
            this.sourceContext_ = yvf.newBuilder(this.sourceContext_).mergeFrom(value).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C7699b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static j00 parseDelimitedFrom(InputStream input) throws IOException {
        return (j00) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static j00 parseFrom(ByteBuffer data) throws ce8 {
        return (j00) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<j00> parser() {
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
    public void setMethods(int index, pua value) {
        value.getClass();
        ensureMethodsIsMutable();
        this.methods_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMixins(int index, lwa value) {
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
    public void setNameBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.name_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int index, w6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContext(yvf value) {
        value.getClass();
        this.sourceContext_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(qig value) {
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
    public void setVersionBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.version_ = value.toStringUtf8();
    }

    @Override // p000.f10
    public pua getMethods(int index) {
        return this.methods_.get(index);
    }

    @Override // p000.f10
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // p000.f10
    public List<pua> getMethodsList() {
        return this.methods_;
    }

    public tua getMethodsOrBuilder(int index) {
        return this.methods_.get(index);
    }

    public List<? extends tua> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // p000.f10
    public lwa getMixins(int index) {
        return this.mixins_.get(index);
    }

    @Override // p000.f10
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // p000.f10
    public List<lwa> getMixinsList() {
        return this.mixins_;
    }

    public mwa getMixinsOrBuilder(int index) {
        return this.mixins_.get(index);
    }

    public List<? extends mwa> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // p000.f10
    public String getName() {
        return this.name_;
    }

    @Override // p000.f10
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.f10
    public w6c getOptions(int index) {
        return this.options_.get(index);
    }

    @Override // p000.f10
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // p000.f10
    public List<w6c> getOptionsList() {
        return this.options_;
    }

    public x6c getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    public List<? extends x6c> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // p000.f10
    public yvf getSourceContext() {
        yvf yvfVar = this.sourceContext_;
        return yvfVar == null ? yvf.getDefaultInstance() : yvfVar;
    }

    @Override // p000.f10
    public qig getSyntax() {
        qig qigVarForNumber = qig.forNumber(this.syntax_);
        return qigVarForNumber == null ? qig.UNRECOGNIZED : qigVarForNumber;
    }

    @Override // p000.f10
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // p000.f10
    public String getVersion() {
        return this.version_;
    }

    @Override // p000.f10
    public vj1 getVersionBytes() {
        return vj1.copyFromUtf8(this.version_);
    }

    @Override // p000.f10
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C7698a c7698a = null;
        switch (C7698a.f49202a[method.ordinal()]) {
            case 1:
                return new j00();
            case 2:
                return new C7699b(c7698a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005ဉ\u0000\u0006\u001b\u0007\f", new Object[]{"bitField0_", "name_", "methods_", pua.class, "options_", w6c.class, "version_", "sourceContext_", "mixins_", lwa.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<j00> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (j00.class) {
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

    public static C7699b newBuilder(j00 prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static j00 parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (j00) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static j00 parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (j00) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static j00 parseFrom(vj1 data) throws ce8 {
        return (j00) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethods(int index, pua value) {
        value.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMixins(int index, lwa value) {
        value.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, w6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    public static j00 parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (j00) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static j00 parseFrom(byte[] data) throws ce8 {
        return (j00) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static j00 parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (j00) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static j00 parseFrom(InputStream input) throws IOException {
        return (j00) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static j00 parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (j00) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static j00 parseFrom(f72 input) throws IOException {
        return (j00) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static j00 parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (j00) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
