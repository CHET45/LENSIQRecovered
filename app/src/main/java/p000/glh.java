package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.u27;
import p000.u6c;
import p000.v98;
import p000.wq5;
import p000.xvf;

/* JADX INFO: loaded from: classes3.dex */
public final class glh extends u27<glh, C6377b> implements ulh {
    private static final glh DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile vhc<glh> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private int bitField0_;
    private xvf sourceContext_;
    private int syntax_;
    private String name_ = "";
    private v98.InterfaceC13956l<wq5> fields_ = u27.m23036w();
    private v98.InterfaceC13956l<String> oneofs_ = u27.m23036w();
    private v98.InterfaceC13956l<u6c> options_ = u27.m23036w();
    private String edition_ = "";

    /* JADX INFO: renamed from: glh$a */
    public static /* synthetic */ class C6376a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40153a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f40153a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40153a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40153a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40153a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40153a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40153a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40153a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: glh$b */
    public static final class C6377b extends u27.AbstractC13324b<glh, C6377b> implements ulh {
        public /* synthetic */ C6377b(C6376a c6376a) {
            this();
        }

        public C6377b addAllFields(Iterable<? extends wq5> values) {
            m23058e();
            ((glh) this.f86607b).addAllFields(values);
            return this;
        }

        public C6377b addAllOneofs(Iterable<String> values) {
            m23058e();
            ((glh) this.f86607b).addAllOneofs(values);
            return this;
        }

        public C6377b addAllOptions(Iterable<? extends u6c> values) {
            m23058e();
            ((glh) this.f86607b).addAllOptions(values);
            return this;
        }

        public C6377b addFields(wq5 value) {
            m23058e();
            ((glh) this.f86607b).addFields(value);
            return this;
        }

        public C6377b addOneofs(String value) {
            m23058e();
            ((glh) this.f86607b).addOneofs(value);
            return this;
        }

        public C6377b addOneofsBytes(wj1 value) {
            m23058e();
            ((glh) this.f86607b).addOneofsBytes(value);
            return this;
        }

        public C6377b addOptions(u6c value) {
            m23058e();
            ((glh) this.f86607b).addOptions(value);
            return this;
        }

        public C6377b clearEdition() {
            m23058e();
            ((glh) this.f86607b).clearEdition();
            return this;
        }

        public C6377b clearFields() {
            m23058e();
            ((glh) this.f86607b).clearFields();
            return this;
        }

        public C6377b clearName() {
            m23058e();
            ((glh) this.f86607b).clearName();
            return this;
        }

        public C6377b clearOneofs() {
            m23058e();
            ((glh) this.f86607b).clearOneofs();
            return this;
        }

        public C6377b clearOptions() {
            m23058e();
            ((glh) this.f86607b).clearOptions();
            return this;
        }

        public C6377b clearSourceContext() {
            m23058e();
            ((glh) this.f86607b).clearSourceContext();
            return this;
        }

        public C6377b clearSyntax() {
            m23058e();
            ((glh) this.f86607b).clearSyntax();
            return this;
        }

        @Override // p000.ulh
        public String getEdition() {
            return ((glh) this.f86607b).getEdition();
        }

        @Override // p000.ulh
        public wj1 getEditionBytes() {
            return ((glh) this.f86607b).getEditionBytes();
        }

        @Override // p000.ulh
        public wq5 getFields(int index) {
            return ((glh) this.f86607b).getFields(index);
        }

        @Override // p000.ulh
        public int getFieldsCount() {
            return ((glh) this.f86607b).getFieldsCount();
        }

        @Override // p000.ulh
        public List<wq5> getFieldsList() {
            return Collections.unmodifiableList(((glh) this.f86607b).getFieldsList());
        }

        @Override // p000.ulh
        public String getName() {
            return ((glh) this.f86607b).getName();
        }

        @Override // p000.ulh
        public wj1 getNameBytes() {
            return ((glh) this.f86607b).getNameBytes();
        }

        @Override // p000.ulh
        public String getOneofs(int index) {
            return ((glh) this.f86607b).getOneofs(index);
        }

        @Override // p000.ulh
        public wj1 getOneofsBytes(int index) {
            return ((glh) this.f86607b).getOneofsBytes(index);
        }

        @Override // p000.ulh
        public int getOneofsCount() {
            return ((glh) this.f86607b).getOneofsCount();
        }

        @Override // p000.ulh
        public List<String> getOneofsList() {
            return Collections.unmodifiableList(((glh) this.f86607b).getOneofsList());
        }

        @Override // p000.ulh
        public u6c getOptions(int index) {
            return ((glh) this.f86607b).getOptions(index);
        }

        @Override // p000.ulh
        public int getOptionsCount() {
            return ((glh) this.f86607b).getOptionsCount();
        }

        @Override // p000.ulh
        public List<u6c> getOptionsList() {
            return Collections.unmodifiableList(((glh) this.f86607b).getOptionsList());
        }

        @Override // p000.ulh
        public xvf getSourceContext() {
            return ((glh) this.f86607b).getSourceContext();
        }

        @Override // p000.ulh
        public pig getSyntax() {
            return ((glh) this.f86607b).getSyntax();
        }

        @Override // p000.ulh
        public int getSyntaxValue() {
            return ((glh) this.f86607b).getSyntaxValue();
        }

        @Override // p000.ulh
        public boolean hasSourceContext() {
            return ((glh) this.f86607b).hasSourceContext();
        }

        public C6377b mergeSourceContext(xvf value) {
            m23058e();
            ((glh) this.f86607b).mergeSourceContext(value);
            return this;
        }

        public C6377b removeFields(int index) {
            m23058e();
            ((glh) this.f86607b).removeFields(index);
            return this;
        }

        public C6377b removeOptions(int index) {
            m23058e();
            ((glh) this.f86607b).removeOptions(index);
            return this;
        }

        public C6377b setEdition(String value) {
            m23058e();
            ((glh) this.f86607b).setEdition(value);
            return this;
        }

        public C6377b setEditionBytes(wj1 value) {
            m23058e();
            ((glh) this.f86607b).setEditionBytes(value);
            return this;
        }

        public C6377b setFields(int index, wq5 value) {
            m23058e();
            ((glh) this.f86607b).setFields(index, value);
            return this;
        }

        public C6377b setName(String value) {
            m23058e();
            ((glh) this.f86607b).setName(value);
            return this;
        }

        public C6377b setNameBytes(wj1 value) {
            m23058e();
            ((glh) this.f86607b).setNameBytes(value);
            return this;
        }

        public C6377b setOneofs(int index, String value) {
            m23058e();
            ((glh) this.f86607b).setOneofs(index, value);
            return this;
        }

        public C6377b setOptions(int index, u6c value) {
            m23058e();
            ((glh) this.f86607b).setOptions(index, value);
            return this;
        }

        public C6377b setSourceContext(xvf value) {
            m23058e();
            ((glh) this.f86607b).setSourceContext(value);
            return this;
        }

        public C6377b setSyntax(pig value) {
            m23058e();
            ((glh) this.f86607b).setSyntax(value);
            return this;
        }

        public C6377b setSyntaxValue(int value) {
            m23058e();
            ((glh) this.f86607b).setSyntaxValue(value);
            return this;
        }

        private C6377b() {
            super(glh.DEFAULT_INSTANCE);
        }

        public C6377b addFields(int index, wq5 value) {
            m23058e();
            ((glh) this.f86607b).addFields(index, value);
            return this;
        }

        public C6377b addOptions(int index, u6c value) {
            m23058e();
            ((glh) this.f86607b).addOptions(index, value);
            return this;
        }

        public C6377b setFields(int index, wq5.C14745b builderForValue) {
            m23058e();
            ((glh) this.f86607b).setFields(index, builderForValue.build());
            return this;
        }

        public C6377b setOptions(int index, u6c.C13378b builderForValue) {
            m23058e();
            ((glh) this.f86607b).setOptions(index, builderForValue.build());
            return this;
        }

        public C6377b setSourceContext(xvf.C15319b builderForValue) {
            m23058e();
            ((glh) this.f86607b).setSourceContext(builderForValue.build());
            return this;
        }

        public C6377b addFields(wq5.C14745b builderForValue) {
            m23058e();
            ((glh) this.f86607b).addFields(builderForValue.build());
            return this;
        }

        public C6377b addOptions(u6c.C13378b builderForValue) {
            m23058e();
            ((glh) this.f86607b).addOptions(builderForValue.build());
            return this;
        }

        public C6377b addFields(int index, wq5.C14745b builderForValue) {
            m23058e();
            ((glh) this.f86607b).addFields(index, builderForValue.build());
            return this;
        }

        public C6377b addOptions(int index, u6c.C13378b builderForValue) {
            m23058e();
            ((glh) this.f86607b).addOptions(index, builderForValue.build());
            return this;
        }
    }

    static {
        glh glhVar = new glh();
        DEFAULT_INSTANCE = glhVar;
        u27.m23029g0(glh.class, glhVar);
    }

    private glh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFields(Iterable<? extends wq5> values) {
        ensureFieldsIsMutable();
        AbstractC0027a3.m80a(values, this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOneofs(Iterable<String> values) {
        ensureOneofsIsMutable();
        AbstractC0027a3.m80a(values, this.oneofs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends u6c> values) {
        ensureOptionsIsMutable();
        AbstractC0027a3.m80a(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(wq5 value) {
        value.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofs(String value) {
        value.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofsBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        ensureOneofsIsMutable();
        this.oneofs_.add(value.toStringUtf8());
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
    public void clearFields() {
        this.fields_ = u27.m23036w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofs() {
        this.oneofs_ = u27.m23036w();
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

    private void ensureFieldsIsMutable() {
        v98.InterfaceC13956l<wq5> interfaceC13956l = this.fields_;
        if (interfaceC13956l.isModifiable()) {
            return;
        }
        this.fields_ = u27.m23012O(interfaceC13956l);
    }

    private void ensureOneofsIsMutable() {
        v98.InterfaceC13956l<String> interfaceC13956l = this.oneofs_;
        if (interfaceC13956l.isModifiable()) {
            return;
        }
        this.oneofs_ = u27.m23012O(interfaceC13956l);
    }

    private void ensureOptionsIsMutable() {
        v98.InterfaceC13956l<u6c> interfaceC13956l = this.options_;
        if (interfaceC13956l.isModifiable()) {
            return;
        }
        this.options_ = u27.m23012O(interfaceC13956l);
    }

    public static glh getDefaultInstance() {
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

    public static C6377b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static glh parseDelimitedFrom(InputStream input) throws IOException {
        return (glh) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static glh parseFrom(ByteBuffer data) throws be8 {
        return (glh) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<glh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFields(int index) {
        ensureFieldsIsMutable();
        this.fields_.remove(index);
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
    public void setFields(int index, wq5 value) {
        value.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(index, value);
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
    public void setOneofs(int index, String value) {
        value.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.set(index, value);
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

    @Override // p000.ulh
    public String getEdition() {
        return this.edition_;
    }

    @Override // p000.ulh
    public wj1 getEditionBytes() {
        return wj1.copyFromUtf8(this.edition_);
    }

    @Override // p000.ulh
    public wq5 getFields(int index) {
        return this.fields_.get(index);
    }

    @Override // p000.ulh
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // p000.ulh
    public List<wq5> getFieldsList() {
        return this.fields_;
    }

    public vr5 getFieldsOrBuilder(int index) {
        return this.fields_.get(index);
    }

    public List<? extends vr5> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // p000.ulh
    public String getName() {
        return this.name_;
    }

    @Override // p000.ulh
    public wj1 getNameBytes() {
        return wj1.copyFromUtf8(this.name_);
    }

    @Override // p000.ulh
    public String getOneofs(int index) {
        return this.oneofs_.get(index);
    }

    @Override // p000.ulh
    public wj1 getOneofsBytes(int index) {
        return wj1.copyFromUtf8(this.oneofs_.get(index));
    }

    @Override // p000.ulh
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override // p000.ulh
    public List<String> getOneofsList() {
        return this.oneofs_;
    }

    @Override // p000.ulh
    public u6c getOptions(int index) {
        return this.options_.get(index);
    }

    @Override // p000.ulh
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // p000.ulh
    public List<u6c> getOptionsList() {
        return this.options_;
    }

    public y6c getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    public List<? extends y6c> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // p000.ulh
    public xvf getSourceContext() {
        xvf xvfVar = this.sourceContext_;
        return xvfVar == null ? xvf.getDefaultInstance() : xvfVar;
    }

    @Override // p000.ulh
    public pig getSyntax() {
        pig pigVarForNumber = pig.forNumber(this.syntax_);
        return pigVarForNumber == null ? pig.UNRECOGNIZED : pigVarForNumber;
    }

    @Override // p000.ulh
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // p000.ulh
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C6376a c6376a = null;
        switch (C6376a.f40153a[method.ordinal()]) {
            case 1:
                return new glh();
            case 2:
                return new C6377b(c6376a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005ဉ\u0000\u0006\f\u0007Ȉ", new Object[]{"bitField0_", "name_", "fields_", wq5.class, "oneofs_", "options_", u6c.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<glh> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (glh.class) {
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

    public static C6377b newBuilder(glh prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static glh parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (glh) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static glh parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (glh) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static glh parseFrom(wj1 data) throws be8 {
        return (glh) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(int index, wq5 value) {
        value.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, u6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    public static glh parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (glh) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static glh parseFrom(byte[] data) throws be8 {
        return (glh) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static glh parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (glh) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static glh parseFrom(InputStream input) throws IOException {
        return (glh) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static glh parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (glh) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static glh parseFrom(e72 input) throws IOException {
        return (glh) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static glh parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (glh) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
