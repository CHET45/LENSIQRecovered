package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.j45;
import p000.u27;
import p000.u6c;
import p000.v98;
import p000.xvf;

/* JADX INFO: loaded from: classes3.dex */
public final class o35 extends u27<o35, C10166b> implements d45 {
    private static final o35 DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile vhc<o35> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private int bitField0_;
    private xvf sourceContext_;
    private int syntax_;
    private String name_ = "";
    private v98.InterfaceC13956l<j45> enumvalue_ = u27.m23036w();
    private v98.InterfaceC13956l<u6c> options_ = u27.m23036w();
    private String edition_ = "";

    /* JADX INFO: renamed from: o35$a */
    public static /* synthetic */ class C10165a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66362a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f66362a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66362a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66362a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66362a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66362a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66362a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66362a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: o35$b */
    public static final class C10166b extends u27.AbstractC13324b<o35, C10166b> implements d45 {
        public /* synthetic */ C10166b(C10165a c10165a) {
            this();
        }

        public C10166b addAllEnumvalue(Iterable<? extends j45> values) {
            m23058e();
            ((o35) this.f86607b).addAllEnumvalue(values);
            return this;
        }

        public C10166b addAllOptions(Iterable<? extends u6c> values) {
            m23058e();
            ((o35) this.f86607b).addAllOptions(values);
            return this;
        }

        public C10166b addEnumvalue(j45 value) {
            m23058e();
            ((o35) this.f86607b).addEnumvalue(value);
            return this;
        }

        public C10166b addOptions(u6c value) {
            m23058e();
            ((o35) this.f86607b).addOptions(value);
            return this;
        }

        public C10166b clearEdition() {
            m23058e();
            ((o35) this.f86607b).clearEdition();
            return this;
        }

        public C10166b clearEnumvalue() {
            m23058e();
            ((o35) this.f86607b).clearEnumvalue();
            return this;
        }

        public C10166b clearName() {
            m23058e();
            ((o35) this.f86607b).clearName();
            return this;
        }

        public C10166b clearOptions() {
            m23058e();
            ((o35) this.f86607b).clearOptions();
            return this;
        }

        public C10166b clearSourceContext() {
            m23058e();
            ((o35) this.f86607b).clearSourceContext();
            return this;
        }

        public C10166b clearSyntax() {
            m23058e();
            ((o35) this.f86607b).clearSyntax();
            return this;
        }

        @Override // p000.d45
        public String getEdition() {
            return ((o35) this.f86607b).getEdition();
        }

        @Override // p000.d45
        public wj1 getEditionBytes() {
            return ((o35) this.f86607b).getEditionBytes();
        }

        @Override // p000.d45
        public j45 getEnumvalue(int index) {
            return ((o35) this.f86607b).getEnumvalue(index);
        }

        @Override // p000.d45
        public int getEnumvalueCount() {
            return ((o35) this.f86607b).getEnumvalueCount();
        }

        @Override // p000.d45
        public List<j45> getEnumvalueList() {
            return Collections.unmodifiableList(((o35) this.f86607b).getEnumvalueList());
        }

        @Override // p000.d45
        public String getName() {
            return ((o35) this.f86607b).getName();
        }

        @Override // p000.d45
        public wj1 getNameBytes() {
            return ((o35) this.f86607b).getNameBytes();
        }

        @Override // p000.d45
        public u6c getOptions(int index) {
            return ((o35) this.f86607b).getOptions(index);
        }

        @Override // p000.d45
        public int getOptionsCount() {
            return ((o35) this.f86607b).getOptionsCount();
        }

        @Override // p000.d45
        public List<u6c> getOptionsList() {
            return Collections.unmodifiableList(((o35) this.f86607b).getOptionsList());
        }

        @Override // p000.d45
        public xvf getSourceContext() {
            return ((o35) this.f86607b).getSourceContext();
        }

        @Override // p000.d45
        public pig getSyntax() {
            return ((o35) this.f86607b).getSyntax();
        }

        @Override // p000.d45
        public int getSyntaxValue() {
            return ((o35) this.f86607b).getSyntaxValue();
        }

        @Override // p000.d45
        public boolean hasSourceContext() {
            return ((o35) this.f86607b).hasSourceContext();
        }

        public C10166b mergeSourceContext(xvf value) {
            m23058e();
            ((o35) this.f86607b).mergeSourceContext(value);
            return this;
        }

        public C10166b removeEnumvalue(int index) {
            m23058e();
            ((o35) this.f86607b).removeEnumvalue(index);
            return this;
        }

        public C10166b removeOptions(int index) {
            m23058e();
            ((o35) this.f86607b).removeOptions(index);
            return this;
        }

        public C10166b setEdition(String value) {
            m23058e();
            ((o35) this.f86607b).setEdition(value);
            return this;
        }

        public C10166b setEditionBytes(wj1 value) {
            m23058e();
            ((o35) this.f86607b).setEditionBytes(value);
            return this;
        }

        public C10166b setEnumvalue(int index, j45 value) {
            m23058e();
            ((o35) this.f86607b).setEnumvalue(index, value);
            return this;
        }

        public C10166b setName(String value) {
            m23058e();
            ((o35) this.f86607b).setName(value);
            return this;
        }

        public C10166b setNameBytes(wj1 value) {
            m23058e();
            ((o35) this.f86607b).setNameBytes(value);
            return this;
        }

        public C10166b setOptions(int index, u6c value) {
            m23058e();
            ((o35) this.f86607b).setOptions(index, value);
            return this;
        }

        public C10166b setSourceContext(xvf value) {
            m23058e();
            ((o35) this.f86607b).setSourceContext(value);
            return this;
        }

        public C10166b setSyntax(pig value) {
            m23058e();
            ((o35) this.f86607b).setSyntax(value);
            return this;
        }

        public C10166b setSyntaxValue(int value) {
            m23058e();
            ((o35) this.f86607b).setSyntaxValue(value);
            return this;
        }

        private C10166b() {
            super(o35.DEFAULT_INSTANCE);
        }

        public C10166b addEnumvalue(int index, j45 value) {
            m23058e();
            ((o35) this.f86607b).addEnumvalue(index, value);
            return this;
        }

        public C10166b addOptions(int index, u6c value) {
            m23058e();
            ((o35) this.f86607b).addOptions(index, value);
            return this;
        }

        public C10166b setEnumvalue(int index, j45.C7731b builderForValue) {
            m23058e();
            ((o35) this.f86607b).setEnumvalue(index, builderForValue.build());
            return this;
        }

        public C10166b setOptions(int index, u6c.C13378b builderForValue) {
            m23058e();
            ((o35) this.f86607b).setOptions(index, builderForValue.build());
            return this;
        }

        public C10166b setSourceContext(xvf.C15319b builderForValue) {
            m23058e();
            ((o35) this.f86607b).setSourceContext(builderForValue.build());
            return this;
        }

        public C10166b addEnumvalue(j45.C7731b builderForValue) {
            m23058e();
            ((o35) this.f86607b).addEnumvalue(builderForValue.build());
            return this;
        }

        public C10166b addOptions(u6c.C13378b builderForValue) {
            m23058e();
            ((o35) this.f86607b).addOptions(builderForValue.build());
            return this;
        }

        public C10166b addEnumvalue(int index, j45.C7731b builderForValue) {
            m23058e();
            ((o35) this.f86607b).addEnumvalue(index, builderForValue.build());
            return this;
        }

        public C10166b addOptions(int index, u6c.C13378b builderForValue) {
            m23058e();
            ((o35) this.f86607b).addOptions(index, builderForValue.build());
            return this;
        }
    }

    static {
        o35 o35Var = new o35();
        DEFAULT_INSTANCE = o35Var;
        u27.m23029g0(o35.class, o35Var);
    }

    private o35() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnumvalue(Iterable<? extends j45> values) {
        ensureEnumvalueIsMutable();
        AbstractC0027a3.m80a(values, this.enumvalue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends u6c> values) {
        ensureOptionsIsMutable();
        AbstractC0027a3.m80a(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumvalue(j45 value) {
        value.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(u6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdition() {
        this.edition_ = getDefaultInstance().getEdition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumvalue() {
        this.enumvalue_ = u27.m23036w();
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

    private void ensureEnumvalueIsMutable() {
        v98.InterfaceC13956l<j45> interfaceC13956l = this.enumvalue_;
        if (interfaceC13956l.isModifiable()) {
            return;
        }
        this.enumvalue_ = u27.m23012O(interfaceC13956l);
    }

    private void ensureOptionsIsMutable() {
        v98.InterfaceC13956l<u6c> interfaceC13956l = this.options_;
        if (interfaceC13956l.isModifiable()) {
            return;
        }
        this.options_ = u27.m23012O(interfaceC13956l);
    }

    public static o35 getDefaultInstance() {
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

    public static C10166b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static o35 parseDelimitedFrom(InputStream input) throws IOException {
        return (o35) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static o35 parseFrom(ByteBuffer data) throws be8 {
        return (o35) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<o35> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnumvalue(int index) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int index) {
        ensureOptionsIsMutable();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdition(String value) {
        value.getClass();
        this.edition_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        this.edition_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumvalue(int index, j45 value) {
        value.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.set(index, value);
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

    @Override // p000.d45
    public String getEdition() {
        return this.edition_;
    }

    @Override // p000.d45
    public wj1 getEditionBytes() {
        return wj1.copyFromUtf8(this.edition_);
    }

    @Override // p000.d45
    public j45 getEnumvalue(int index) {
        return this.enumvalue_.get(index);
    }

    @Override // p000.d45
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // p000.d45
    public List<j45> getEnumvalueList() {
        return this.enumvalue_;
    }

    public m45 getEnumvalueOrBuilder(int index) {
        return this.enumvalue_.get(index);
    }

    public List<? extends m45> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // p000.d45
    public String getName() {
        return this.name_;
    }

    @Override // p000.d45
    public wj1 getNameBytes() {
        return wj1.copyFromUtf8(this.name_);
    }

    @Override // p000.d45
    public u6c getOptions(int index) {
        return this.options_.get(index);
    }

    @Override // p000.d45
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // p000.d45
    public List<u6c> getOptionsList() {
        return this.options_;
    }

    public y6c getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    public List<? extends y6c> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // p000.d45
    public xvf getSourceContext() {
        xvf xvfVar = this.sourceContext_;
        return xvfVar == null ? xvf.getDefaultInstance() : xvfVar;
    }

    @Override // p000.d45
    public pig getSyntax() {
        pig pigVarForNumber = pig.forNumber(this.syntax_);
        return pigVarForNumber == null ? pig.UNRECOGNIZED : pigVarForNumber;
    }

    @Override // p000.d45
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // p000.d45
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C10165a c10165a = null;
        switch (C10165a.f66362a[method.ordinal()]) {
            case 1:
                return new o35();
            case 2:
                return new C10166b(c10165a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005\f\u0006Ȉ", new Object[]{"bitField0_", "name_", "enumvalue_", j45.class, "options_", u6c.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<o35> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (o35.class) {
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

    public static C10166b newBuilder(o35 prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static o35 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (o35) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o35 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (o35) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static o35 parseFrom(wj1 data) throws be8 {
        return (o35) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumvalue(int index, j45 value) {
        value.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, u6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    public static o35 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (o35) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static o35 parseFrom(byte[] data) throws be8 {
        return (o35) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static o35 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (o35) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static o35 parseFrom(InputStream input) throws IOException {
        return (o35) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static o35 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (o35) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static o35 parseFrom(e72 input) throws IOException {
        return (o35) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static o35 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (o35) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
