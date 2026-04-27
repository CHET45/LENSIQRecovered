package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.k45;
import p000.v27;
import p000.w6c;
import p000.w98;
import p000.yvf;

/* JADX INFO: loaded from: classes4.dex */
public final class p35 extends v27<p35, C10779b> implements c45 {
    private static final p35 DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile uhc<p35> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private int bitField0_;
    private yvf sourceContext_;
    private int syntax_;
    private String name_ = "";
    private w98.InterfaceC14504k<k45> enumvalue_ = v27.m23722x();
    private w98.InterfaceC14504k<w6c> options_ = v27.m23722x();
    private String edition_ = "";

    /* JADX INFO: renamed from: p35$a */
    public static /* synthetic */ class C10778a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f69552a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f69552a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69552a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69552a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69552a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69552a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69552a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69552a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: p35$b */
    public static final class C10779b extends v27.AbstractC13823b<p35, C10779b> implements c45 {
        public /* synthetic */ C10779b(C10778a c10778a) {
            this();
        }

        public C10779b addAllEnumvalue(Iterable<? extends k45> values) {
            m23743e();
            ((p35) this.f89756b).addAllEnumvalue(values);
            return this;
        }

        public C10779b addAllOptions(Iterable<? extends w6c> values) {
            m23743e();
            ((p35) this.f89756b).addAllOptions(values);
            return this;
        }

        public C10779b addEnumvalue(k45 value) {
            m23743e();
            ((p35) this.f89756b).addEnumvalue(value);
            return this;
        }

        public C10779b addOptions(w6c value) {
            m23743e();
            ((p35) this.f89756b).addOptions(value);
            return this;
        }

        public C10779b clearEdition() {
            m23743e();
            ((p35) this.f89756b).clearEdition();
            return this;
        }

        public C10779b clearEnumvalue() {
            m23743e();
            ((p35) this.f89756b).clearEnumvalue();
            return this;
        }

        public C10779b clearName() {
            m23743e();
            ((p35) this.f89756b).clearName();
            return this;
        }

        public C10779b clearOptions() {
            m23743e();
            ((p35) this.f89756b).clearOptions();
            return this;
        }

        public C10779b clearSourceContext() {
            m23743e();
            ((p35) this.f89756b).clearSourceContext();
            return this;
        }

        public C10779b clearSyntax() {
            m23743e();
            ((p35) this.f89756b).clearSyntax();
            return this;
        }

        @Override // p000.c45
        public String getEdition() {
            return ((p35) this.f89756b).getEdition();
        }

        @Override // p000.c45
        public vj1 getEditionBytes() {
            return ((p35) this.f89756b).getEditionBytes();
        }

        @Override // p000.c45
        public k45 getEnumvalue(int index) {
            return ((p35) this.f89756b).getEnumvalue(index);
        }

        @Override // p000.c45
        public int getEnumvalueCount() {
            return ((p35) this.f89756b).getEnumvalueCount();
        }

        @Override // p000.c45
        public List<k45> getEnumvalueList() {
            return Collections.unmodifiableList(((p35) this.f89756b).getEnumvalueList());
        }

        @Override // p000.c45
        public String getName() {
            return ((p35) this.f89756b).getName();
        }

        @Override // p000.c45
        public vj1 getNameBytes() {
            return ((p35) this.f89756b).getNameBytes();
        }

        @Override // p000.c45
        public w6c getOptions(int index) {
            return ((p35) this.f89756b).getOptions(index);
        }

        @Override // p000.c45
        public int getOptionsCount() {
            return ((p35) this.f89756b).getOptionsCount();
        }

        @Override // p000.c45
        public List<w6c> getOptionsList() {
            return Collections.unmodifiableList(((p35) this.f89756b).getOptionsList());
        }

        @Override // p000.c45
        public yvf getSourceContext() {
            return ((p35) this.f89756b).getSourceContext();
        }

        @Override // p000.c45
        public qig getSyntax() {
            return ((p35) this.f89756b).getSyntax();
        }

        @Override // p000.c45
        public int getSyntaxValue() {
            return ((p35) this.f89756b).getSyntaxValue();
        }

        @Override // p000.c45
        public boolean hasSourceContext() {
            return ((p35) this.f89756b).hasSourceContext();
        }

        public C10779b mergeSourceContext(yvf value) {
            m23743e();
            ((p35) this.f89756b).mergeSourceContext(value);
            return this;
        }

        public C10779b removeEnumvalue(int index) {
            m23743e();
            ((p35) this.f89756b).removeEnumvalue(index);
            return this;
        }

        public C10779b removeOptions(int index) {
            m23743e();
            ((p35) this.f89756b).removeOptions(index);
            return this;
        }

        public C10779b setEdition(String value) {
            m23743e();
            ((p35) this.f89756b).setEdition(value);
            return this;
        }

        public C10779b setEditionBytes(vj1 value) {
            m23743e();
            ((p35) this.f89756b).setEditionBytes(value);
            return this;
        }

        public C10779b setEnumvalue(int index, k45 value) {
            m23743e();
            ((p35) this.f89756b).setEnumvalue(index, value);
            return this;
        }

        public C10779b setName(String value) {
            m23743e();
            ((p35) this.f89756b).setName(value);
            return this;
        }

        public C10779b setNameBytes(vj1 value) {
            m23743e();
            ((p35) this.f89756b).setNameBytes(value);
            return this;
        }

        public C10779b setOptions(int index, w6c value) {
            m23743e();
            ((p35) this.f89756b).setOptions(index, value);
            return this;
        }

        public C10779b setSourceContext(yvf value) {
            m23743e();
            ((p35) this.f89756b).setSourceContext(value);
            return this;
        }

        public C10779b setSyntax(qig value) {
            m23743e();
            ((p35) this.f89756b).setSyntax(value);
            return this;
        }

        public C10779b setSyntaxValue(int value) {
            m23743e();
            ((p35) this.f89756b).setSyntaxValue(value);
            return this;
        }

        private C10779b() {
            super(p35.DEFAULT_INSTANCE);
        }

        public C10779b addEnumvalue(int index, k45 value) {
            m23743e();
            ((p35) this.f89756b).addEnumvalue(index, value);
            return this;
        }

        public C10779b addOptions(int index, w6c value) {
            m23743e();
            ((p35) this.f89756b).addOptions(index, value);
            return this;
        }

        public C10779b setEnumvalue(int index, k45.C8193b builderForValue) {
            m23743e();
            ((p35) this.f89756b).setEnumvalue(index, builderForValue.build());
            return this;
        }

        public C10779b setOptions(int index, w6c.C14445b builderForValue) {
            m23743e();
            ((p35) this.f89756b).setOptions(index, builderForValue.build());
            return this;
        }

        public C10779b setSourceContext(yvf.C15851b builderForValue) {
            m23743e();
            ((p35) this.f89756b).setSourceContext(builderForValue.build());
            return this;
        }

        public C10779b addEnumvalue(k45.C8193b builderForValue) {
            m23743e();
            ((p35) this.f89756b).addEnumvalue(builderForValue.build());
            return this;
        }

        public C10779b addOptions(w6c.C14445b builderForValue) {
            m23743e();
            ((p35) this.f89756b).addOptions(builderForValue.build());
            return this;
        }

        public C10779b addEnumvalue(int index, k45.C8193b builderForValue) {
            m23743e();
            ((p35) this.f89756b).addEnumvalue(index, builderForValue.build());
            return this;
        }

        public C10779b addOptions(int index, w6c.C14445b builderForValue) {
            m23743e();
            ((p35) this.f89756b).addOptions(index, builderForValue.build());
            return this;
        }
    }

    static {
        p35 p35Var = new p35();
        DEFAULT_INSTANCE = p35Var;
        v27.m23715h0(p35.class, p35Var);
    }

    private p35() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnumvalue(Iterable<? extends k45> values) {
        ensureEnumvalueIsMutable();
        AbstractC1714b3.m2856b(values, this.enumvalue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends w6c> values) {
        ensureOptionsIsMutable();
        AbstractC1714b3.m2856b(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumvalue(k45 value) {
        value.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(value);
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
    public void clearEnumvalue() {
        this.enumvalue_ = v27.m23722x();
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

    private void ensureEnumvalueIsMutable() {
        w98.InterfaceC14504k<k45> interfaceC14504k = this.enumvalue_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.enumvalue_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureOptionsIsMutable() {
        w98.InterfaceC14504k<w6c> interfaceC14504k = this.options_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.options_ = v27.m23698P(interfaceC14504k);
    }

    public static p35 getDefaultInstance() {
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

    public static C10779b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static p35 parseDelimitedFrom(InputStream input) throws IOException {
        return (p35) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static p35 parseFrom(ByteBuffer data) throws ce8 {
        return (p35) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<p35> parser() {
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
    public void setEditionBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.edition_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumvalue(int index, k45 value) {
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

    @Override // p000.c45
    public String getEdition() {
        return this.edition_;
    }

    @Override // p000.c45
    public vj1 getEditionBytes() {
        return vj1.copyFromUtf8(this.edition_);
    }

    @Override // p000.c45
    public k45 getEnumvalue(int index) {
        return this.enumvalue_.get(index);
    }

    @Override // p000.c45
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // p000.c45
    public List<k45> getEnumvalueList() {
        return this.enumvalue_;
    }

    public l45 getEnumvalueOrBuilder(int index) {
        return this.enumvalue_.get(index);
    }

    public List<? extends l45> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // p000.c45
    public String getName() {
        return this.name_;
    }

    @Override // p000.c45
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.c45
    public w6c getOptions(int index) {
        return this.options_.get(index);
    }

    @Override // p000.c45
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // p000.c45
    public List<w6c> getOptionsList() {
        return this.options_;
    }

    public x6c getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    public List<? extends x6c> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // p000.c45
    public yvf getSourceContext() {
        yvf yvfVar = this.sourceContext_;
        return yvfVar == null ? yvf.getDefaultInstance() : yvfVar;
    }

    @Override // p000.c45
    public qig getSyntax() {
        qig qigVarForNumber = qig.forNumber(this.syntax_);
        return qigVarForNumber == null ? qig.UNRECOGNIZED : qigVarForNumber;
    }

    @Override // p000.c45
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // p000.c45
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C10778a c10778a = null;
        switch (C10778a.f69552a[method.ordinal()]) {
            case 1:
                return new p35();
            case 2:
                return new C10779b(c10778a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005\f\u0006Ȉ", new Object[]{"bitField0_", "name_", "enumvalue_", k45.class, "options_", w6c.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<p35> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (p35.class) {
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

    public static C10779b newBuilder(p35 prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static p35 parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (p35) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static p35 parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (p35) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static p35 parseFrom(vj1 data) throws ce8 {
        return (p35) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumvalue(int index, k45 value) {
        value.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, w6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    public static p35 parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (p35) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static p35 parseFrom(byte[] data) throws ce8 {
        return (p35) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static p35 parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (p35) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static p35 parseFrom(InputStream input) throws IOException {
        return (p35) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static p35 parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (p35) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static p35 parseFrom(f72 input) throws IOException {
        return (p35) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static p35 parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (p35) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
