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
public final class oua extends u27<oua, C10658b> implements uua {
    private static final oua DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile vhc<oua> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private String name_ = "";
    private String requestTypeUrl_ = "";
    private String responseTypeUrl_ = "";
    private v98.InterfaceC13956l<u6c> options_ = u27.m23036w();

    /* JADX INFO: renamed from: oua$a */
    public static /* synthetic */ class C10657a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68834a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f68834a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68834a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68834a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68834a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68834a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68834a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f68834a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: oua$b */
    public static final class C10658b extends u27.AbstractC13324b<oua, C10658b> implements uua {
        public /* synthetic */ C10658b(C10657a c10657a) {
            this();
        }

        public C10658b addAllOptions(Iterable<? extends u6c> values) {
            m23058e();
            ((oua) this.f86607b).addAllOptions(values);
            return this;
        }

        public C10658b addOptions(u6c value) {
            m23058e();
            ((oua) this.f86607b).addOptions(value);
            return this;
        }

        public C10658b clearName() {
            m23058e();
            ((oua) this.f86607b).clearName();
            return this;
        }

        public C10658b clearOptions() {
            m23058e();
            ((oua) this.f86607b).clearOptions();
            return this;
        }

        public C10658b clearRequestStreaming() {
            m23058e();
            ((oua) this.f86607b).clearRequestStreaming();
            return this;
        }

        public C10658b clearRequestTypeUrl() {
            m23058e();
            ((oua) this.f86607b).clearRequestTypeUrl();
            return this;
        }

        public C10658b clearResponseStreaming() {
            m23058e();
            ((oua) this.f86607b).clearResponseStreaming();
            return this;
        }

        public C10658b clearResponseTypeUrl() {
            m23058e();
            ((oua) this.f86607b).clearResponseTypeUrl();
            return this;
        }

        public C10658b clearSyntax() {
            m23058e();
            ((oua) this.f86607b).clearSyntax();
            return this;
        }

        @Override // p000.uua
        public String getName() {
            return ((oua) this.f86607b).getName();
        }

        @Override // p000.uua
        public wj1 getNameBytes() {
            return ((oua) this.f86607b).getNameBytes();
        }

        @Override // p000.uua
        public u6c getOptions(int index) {
            return ((oua) this.f86607b).getOptions(index);
        }

        @Override // p000.uua
        public int getOptionsCount() {
            return ((oua) this.f86607b).getOptionsCount();
        }

        @Override // p000.uua
        public List<u6c> getOptionsList() {
            return Collections.unmodifiableList(((oua) this.f86607b).getOptionsList());
        }

        @Override // p000.uua
        public boolean getRequestStreaming() {
            return ((oua) this.f86607b).getRequestStreaming();
        }

        @Override // p000.uua
        public String getRequestTypeUrl() {
            return ((oua) this.f86607b).getRequestTypeUrl();
        }

        @Override // p000.uua
        public wj1 getRequestTypeUrlBytes() {
            return ((oua) this.f86607b).getRequestTypeUrlBytes();
        }

        @Override // p000.uua
        public boolean getResponseStreaming() {
            return ((oua) this.f86607b).getResponseStreaming();
        }

        @Override // p000.uua
        public String getResponseTypeUrl() {
            return ((oua) this.f86607b).getResponseTypeUrl();
        }

        @Override // p000.uua
        public wj1 getResponseTypeUrlBytes() {
            return ((oua) this.f86607b).getResponseTypeUrlBytes();
        }

        @Override // p000.uua
        public pig getSyntax() {
            return ((oua) this.f86607b).getSyntax();
        }

        @Override // p000.uua
        public int getSyntaxValue() {
            return ((oua) this.f86607b).getSyntaxValue();
        }

        public C10658b removeOptions(int index) {
            m23058e();
            ((oua) this.f86607b).removeOptions(index);
            return this;
        }

        public C10658b setName(String value) {
            m23058e();
            ((oua) this.f86607b).setName(value);
            return this;
        }

        public C10658b setNameBytes(wj1 value) {
            m23058e();
            ((oua) this.f86607b).setNameBytes(value);
            return this;
        }

        public C10658b setOptions(int index, u6c value) {
            m23058e();
            ((oua) this.f86607b).setOptions(index, value);
            return this;
        }

        public C10658b setRequestStreaming(boolean value) {
            m23058e();
            ((oua) this.f86607b).setRequestStreaming(value);
            return this;
        }

        public C10658b setRequestTypeUrl(String value) {
            m23058e();
            ((oua) this.f86607b).setRequestTypeUrl(value);
            return this;
        }

        public C10658b setRequestTypeUrlBytes(wj1 value) {
            m23058e();
            ((oua) this.f86607b).setRequestTypeUrlBytes(value);
            return this;
        }

        public C10658b setResponseStreaming(boolean value) {
            m23058e();
            ((oua) this.f86607b).setResponseStreaming(value);
            return this;
        }

        public C10658b setResponseTypeUrl(String value) {
            m23058e();
            ((oua) this.f86607b).setResponseTypeUrl(value);
            return this;
        }

        public C10658b setResponseTypeUrlBytes(wj1 value) {
            m23058e();
            ((oua) this.f86607b).setResponseTypeUrlBytes(value);
            return this;
        }

        public C10658b setSyntax(pig value) {
            m23058e();
            ((oua) this.f86607b).setSyntax(value);
            return this;
        }

        public C10658b setSyntaxValue(int value) {
            m23058e();
            ((oua) this.f86607b).setSyntaxValue(value);
            return this;
        }

        private C10658b() {
            super(oua.DEFAULT_INSTANCE);
        }

        public C10658b addOptions(int index, u6c value) {
            m23058e();
            ((oua) this.f86607b).addOptions(index, value);
            return this;
        }

        public C10658b setOptions(int index, u6c.C13378b builderForValue) {
            m23058e();
            ((oua) this.f86607b).setOptions(index, builderForValue.build());
            return this;
        }

        public C10658b addOptions(u6c.C13378b builderForValue) {
            m23058e();
            ((oua) this.f86607b).addOptions(builderForValue.build());
            return this;
        }

        public C10658b addOptions(int index, u6c.C13378b builderForValue) {
            m23058e();
            ((oua) this.f86607b).addOptions(index, builderForValue.build());
            return this;
        }
    }

    static {
        oua ouaVar = new oua();
        DEFAULT_INSTANCE = ouaVar;
        u27.m23029g0(oua.class, ouaVar);
    }

    private oua() {
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
    public void clearOptions() {
        this.options_ = u27.m23036w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestStreaming() {
        this.requestStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestTypeUrl() {
        this.requestTypeUrl_ = getDefaultInstance().getRequestTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseStreaming() {
        this.responseStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseTypeUrl() {
        this.responseTypeUrl_ = getDefaultInstance().getResponseTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    private void ensureOptionsIsMutable() {
        v98.InterfaceC13956l<u6c> interfaceC13956l = this.options_;
        if (interfaceC13956l.isModifiable()) {
            return;
        }
        this.options_ = u27.m23012O(interfaceC13956l);
    }

    public static oua getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C10658b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static oua parseDelimitedFrom(InputStream input) throws IOException {
        return (oua) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static oua parseFrom(ByteBuffer data) throws be8 {
        return (oua) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<oua> parser() {
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
    public void setOptions(int index, u6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestStreaming(boolean value) {
        this.requestStreaming_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeUrl(String value) {
        value.getClass();
        this.requestTypeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeUrlBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        this.requestTypeUrl_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseStreaming(boolean value) {
        this.responseStreaming_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeUrl(String value) {
        value.getClass();
        this.responseTypeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeUrlBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        this.responseTypeUrl_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(pig value) {
        this.syntax_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int value) {
        this.syntax_ = value;
    }

    @Override // p000.uua
    public String getName() {
        return this.name_;
    }

    @Override // p000.uua
    public wj1 getNameBytes() {
        return wj1.copyFromUtf8(this.name_);
    }

    @Override // p000.uua
    public u6c getOptions(int index) {
        return this.options_.get(index);
    }

    @Override // p000.uua
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // p000.uua
    public List<u6c> getOptionsList() {
        return this.options_;
    }

    public y6c getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    public List<? extends y6c> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // p000.uua
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override // p000.uua
    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    @Override // p000.uua
    public wj1 getRequestTypeUrlBytes() {
        return wj1.copyFromUtf8(this.requestTypeUrl_);
    }

    @Override // p000.uua
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override // p000.uua
    public String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    @Override // p000.uua
    public wj1 getResponseTypeUrlBytes() {
        return wj1.copyFromUtf8(this.responseTypeUrl_);
    }

    @Override // p000.uua
    public pig getSyntax() {
        pig pigVarForNumber = pig.forNumber(this.syntax_);
        return pigVarForNumber == null ? pig.UNRECOGNIZED : pigVarForNumber;
    }

    @Override // p000.uua
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C10657a c10657a = null;
        switch (C10657a.f68834a[method.ordinal()]) {
            case 1:
                return new oua();
            case 2:
                return new C10658b(c10657a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", u6c.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<oua> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (oua.class) {
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

    public static C10658b newBuilder(oua prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static oua parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (oua) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static oua parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (oua) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static oua parseFrom(wj1 data) throws be8 {
        return (oua) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, u6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    public static oua parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (oua) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static oua parseFrom(byte[] data) throws be8 {
        return (oua) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static oua parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (oua) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static oua parseFrom(InputStream input) throws IOException {
        return (oua) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static oua parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (oua) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static oua parseFrom(e72 input) throws IOException {
        return (oua) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static oua parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (oua) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
