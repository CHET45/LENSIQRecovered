package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w6c;
import p000.w98;
import p000.xq5;
import p000.yvf;

/* JADX INFO: loaded from: classes4.dex */
public final class hlh extends v27<hlh, C6907b> implements tlh {
    private static final hlh DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile uhc<hlh> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private int bitField0_;
    private yvf sourceContext_;
    private int syntax_;
    private String name_ = "";
    private w98.InterfaceC14504k<xq5> fields_ = v27.m23722x();
    private w98.InterfaceC14504k<String> oneofs_ = v27.m23722x();
    private w98.InterfaceC14504k<w6c> options_ = v27.m23722x();
    private String edition_ = "";

    /* JADX INFO: renamed from: hlh$a */
    public static /* synthetic */ class C6906a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44096a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f44096a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44096a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44096a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44096a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44096a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44096a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44096a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: hlh$b */
    public static final class C6907b extends v27.AbstractC13823b<hlh, C6907b> implements tlh {
        public /* synthetic */ C6907b(C6906a c6906a) {
            this();
        }

        public C6907b addAllFields(Iterable<? extends xq5> values) {
            m23743e();
            ((hlh) this.f89756b).addAllFields(values);
            return this;
        }

        public C6907b addAllOneofs(Iterable<String> values) {
            m23743e();
            ((hlh) this.f89756b).addAllOneofs(values);
            return this;
        }

        public C6907b addAllOptions(Iterable<? extends w6c> values) {
            m23743e();
            ((hlh) this.f89756b).addAllOptions(values);
            return this;
        }

        public C6907b addFields(xq5 value) {
            m23743e();
            ((hlh) this.f89756b).addFields(value);
            return this;
        }

        public C6907b addOneofs(String value) {
            m23743e();
            ((hlh) this.f89756b).addOneofs(value);
            return this;
        }

        public C6907b addOneofsBytes(vj1 value) {
            m23743e();
            ((hlh) this.f89756b).addOneofsBytes(value);
            return this;
        }

        public C6907b addOptions(w6c value) {
            m23743e();
            ((hlh) this.f89756b).addOptions(value);
            return this;
        }

        public C6907b clearEdition() {
            m23743e();
            ((hlh) this.f89756b).clearEdition();
            return this;
        }

        public C6907b clearFields() {
            m23743e();
            ((hlh) this.f89756b).clearFields();
            return this;
        }

        public C6907b clearName() {
            m23743e();
            ((hlh) this.f89756b).clearName();
            return this;
        }

        public C6907b clearOneofs() {
            m23743e();
            ((hlh) this.f89756b).clearOneofs();
            return this;
        }

        public C6907b clearOptions() {
            m23743e();
            ((hlh) this.f89756b).clearOptions();
            return this;
        }

        public C6907b clearSourceContext() {
            m23743e();
            ((hlh) this.f89756b).clearSourceContext();
            return this;
        }

        public C6907b clearSyntax() {
            m23743e();
            ((hlh) this.f89756b).clearSyntax();
            return this;
        }

        @Override // p000.tlh
        public String getEdition() {
            return ((hlh) this.f89756b).getEdition();
        }

        @Override // p000.tlh
        public vj1 getEditionBytes() {
            return ((hlh) this.f89756b).getEditionBytes();
        }

        @Override // p000.tlh
        public xq5 getFields(int index) {
            return ((hlh) this.f89756b).getFields(index);
        }

        @Override // p000.tlh
        public int getFieldsCount() {
            return ((hlh) this.f89756b).getFieldsCount();
        }

        @Override // p000.tlh
        public List<xq5> getFieldsList() {
            return Collections.unmodifiableList(((hlh) this.f89756b).getFieldsList());
        }

        @Override // p000.tlh
        public String getName() {
            return ((hlh) this.f89756b).getName();
        }

        @Override // p000.tlh
        public vj1 getNameBytes() {
            return ((hlh) this.f89756b).getNameBytes();
        }

        @Override // p000.tlh
        public String getOneofs(int index) {
            return ((hlh) this.f89756b).getOneofs(index);
        }

        @Override // p000.tlh
        public vj1 getOneofsBytes(int index) {
            return ((hlh) this.f89756b).getOneofsBytes(index);
        }

        @Override // p000.tlh
        public int getOneofsCount() {
            return ((hlh) this.f89756b).getOneofsCount();
        }

        @Override // p000.tlh
        public List<String> getOneofsList() {
            return Collections.unmodifiableList(((hlh) this.f89756b).getOneofsList());
        }

        @Override // p000.tlh
        public w6c getOptions(int index) {
            return ((hlh) this.f89756b).getOptions(index);
        }

        @Override // p000.tlh
        public int getOptionsCount() {
            return ((hlh) this.f89756b).getOptionsCount();
        }

        @Override // p000.tlh
        public List<w6c> getOptionsList() {
            return Collections.unmodifiableList(((hlh) this.f89756b).getOptionsList());
        }

        @Override // p000.tlh
        public yvf getSourceContext() {
            return ((hlh) this.f89756b).getSourceContext();
        }

        @Override // p000.tlh
        public qig getSyntax() {
            return ((hlh) this.f89756b).getSyntax();
        }

        @Override // p000.tlh
        public int getSyntaxValue() {
            return ((hlh) this.f89756b).getSyntaxValue();
        }

        @Override // p000.tlh
        public boolean hasSourceContext() {
            return ((hlh) this.f89756b).hasSourceContext();
        }

        public C6907b mergeSourceContext(yvf value) {
            m23743e();
            ((hlh) this.f89756b).mergeSourceContext(value);
            return this;
        }

        public C6907b removeFields(int index) {
            m23743e();
            ((hlh) this.f89756b).removeFields(index);
            return this;
        }

        public C6907b removeOptions(int index) {
            m23743e();
            ((hlh) this.f89756b).removeOptions(index);
            return this;
        }

        public C6907b setEdition(String value) {
            m23743e();
            ((hlh) this.f89756b).setEdition(value);
            return this;
        }

        public C6907b setEditionBytes(vj1 value) {
            m23743e();
            ((hlh) this.f89756b).setEditionBytes(value);
            return this;
        }

        public C6907b setFields(int index, xq5 value) {
            m23743e();
            ((hlh) this.f89756b).setFields(index, value);
            return this;
        }

        public C6907b setName(String value) {
            m23743e();
            ((hlh) this.f89756b).setName(value);
            return this;
        }

        public C6907b setNameBytes(vj1 value) {
            m23743e();
            ((hlh) this.f89756b).setNameBytes(value);
            return this;
        }

        public C6907b setOneofs(int index, String value) {
            m23743e();
            ((hlh) this.f89756b).setOneofs(index, value);
            return this;
        }

        public C6907b setOptions(int index, w6c value) {
            m23743e();
            ((hlh) this.f89756b).setOptions(index, value);
            return this;
        }

        public C6907b setSourceContext(yvf value) {
            m23743e();
            ((hlh) this.f89756b).setSourceContext(value);
            return this;
        }

        public C6907b setSyntax(qig value) {
            m23743e();
            ((hlh) this.f89756b).setSyntax(value);
            return this;
        }

        public C6907b setSyntaxValue(int value) {
            m23743e();
            ((hlh) this.f89756b).setSyntaxValue(value);
            return this;
        }

        private C6907b() {
            super(hlh.DEFAULT_INSTANCE);
        }

        public C6907b addFields(int index, xq5 value) {
            m23743e();
            ((hlh) this.f89756b).addFields(index, value);
            return this;
        }

        public C6907b addOptions(int index, w6c value) {
            m23743e();
            ((hlh) this.f89756b).addOptions(index, value);
            return this;
        }

        public C6907b setFields(int index, xq5.C15251b builderForValue) {
            m23743e();
            ((hlh) this.f89756b).setFields(index, builderForValue.build());
            return this;
        }

        public C6907b setOptions(int index, w6c.C14445b builderForValue) {
            m23743e();
            ((hlh) this.f89756b).setOptions(index, builderForValue.build());
            return this;
        }

        public C6907b setSourceContext(yvf.C15851b builderForValue) {
            m23743e();
            ((hlh) this.f89756b).setSourceContext(builderForValue.build());
            return this;
        }

        public C6907b addFields(xq5.C15251b builderForValue) {
            m23743e();
            ((hlh) this.f89756b).addFields(builderForValue.build());
            return this;
        }

        public C6907b addOptions(w6c.C14445b builderForValue) {
            m23743e();
            ((hlh) this.f89756b).addOptions(builderForValue.build());
            return this;
        }

        public C6907b addFields(int index, xq5.C15251b builderForValue) {
            m23743e();
            ((hlh) this.f89756b).addFields(index, builderForValue.build());
            return this;
        }

        public C6907b addOptions(int index, w6c.C14445b builderForValue) {
            m23743e();
            ((hlh) this.f89756b).addOptions(index, builderForValue.build());
            return this;
        }
    }

    static {
        hlh hlhVar = new hlh();
        DEFAULT_INSTANCE = hlhVar;
        v27.m23715h0(hlh.class, hlhVar);
    }

    private hlh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFields(Iterable<? extends xq5> values) {
        ensureFieldsIsMutable();
        AbstractC1714b3.m2856b(values, this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOneofs(Iterable<String> values) {
        ensureOneofsIsMutable();
        AbstractC1714b3.m2856b(values, this.oneofs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends w6c> values) {
        ensureOptionsIsMutable();
        AbstractC1714b3.m2856b(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(xq5 value) {
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
    public void addOneofsBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        ensureOneofsIsMutable();
        this.oneofs_.add(value.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(w6c value) {
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
        this.fields_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofs() {
        this.oneofs_ = v27.m23722x();
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

    private void ensureFieldsIsMutable() {
        w98.InterfaceC14504k<xq5> interfaceC14504k = this.fields_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.fields_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureOneofsIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.oneofs_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.oneofs_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureOptionsIsMutable() {
        w98.InterfaceC14504k<w6c> interfaceC14504k = this.options_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.options_ = v27.m23698P(interfaceC14504k);
    }

    public static hlh getDefaultInstance() {
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

    public static C6907b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static hlh parseDelimitedFrom(InputStream input) throws IOException {
        return (hlh) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static hlh parseFrom(ByteBuffer data) throws ce8 {
        return (hlh) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<hlh> parser() {
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
    public void setEditionBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.edition_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFields(int index, xq5 value) {
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
    public void setNameBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.name_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofs(int index, String value) {
        value.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.set(index, value);
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

    @Override // p000.tlh
    public String getEdition() {
        return this.edition_;
    }

    @Override // p000.tlh
    public vj1 getEditionBytes() {
        return vj1.copyFromUtf8(this.edition_);
    }

    @Override // p000.tlh
    public xq5 getFields(int index) {
        return this.fields_.get(index);
    }

    @Override // p000.tlh
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // p000.tlh
    public List<xq5> getFieldsList() {
        return this.fields_;
    }

    public ur5 getFieldsOrBuilder(int index) {
        return this.fields_.get(index);
    }

    public List<? extends ur5> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // p000.tlh
    public String getName() {
        return this.name_;
    }

    @Override // p000.tlh
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.tlh
    public String getOneofs(int index) {
        return this.oneofs_.get(index);
    }

    @Override // p000.tlh
    public vj1 getOneofsBytes(int index) {
        return vj1.copyFromUtf8(this.oneofs_.get(index));
    }

    @Override // p000.tlh
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override // p000.tlh
    public List<String> getOneofsList() {
        return this.oneofs_;
    }

    @Override // p000.tlh
    public w6c getOptions(int index) {
        return this.options_.get(index);
    }

    @Override // p000.tlh
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // p000.tlh
    public List<w6c> getOptionsList() {
        return this.options_;
    }

    public x6c getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    public List<? extends x6c> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // p000.tlh
    public yvf getSourceContext() {
        yvf yvfVar = this.sourceContext_;
        return yvfVar == null ? yvf.getDefaultInstance() : yvfVar;
    }

    @Override // p000.tlh
    public qig getSyntax() {
        qig qigVarForNumber = qig.forNumber(this.syntax_);
        return qigVarForNumber == null ? qig.UNRECOGNIZED : qigVarForNumber;
    }

    @Override // p000.tlh
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // p000.tlh
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C6906a c6906a = null;
        switch (C6906a.f44096a[method.ordinal()]) {
            case 1:
                return new hlh();
            case 2:
                return new C6907b(c6906a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005ဉ\u0000\u0006\f\u0007Ȉ", new Object[]{"bitField0_", "name_", "fields_", xq5.class, "oneofs_", "options_", w6c.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<hlh> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (hlh.class) {
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

    public static C6907b newBuilder(hlh prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static hlh parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (hlh) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static hlh parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (hlh) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static hlh parseFrom(vj1 data) throws ce8 {
        return (hlh) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(int index, xq5 value) {
        value.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, w6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    public static hlh parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (hlh) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static hlh parseFrom(byte[] data) throws ce8 {
        return (hlh) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static hlh parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (hlh) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static hlh parseFrom(InputStream input) throws IOException {
        return (hlh) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static hlh parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (hlh) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static hlh parseFrom(f72 input) throws IOException {
        return (hlh) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static hlh parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (hlh) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
