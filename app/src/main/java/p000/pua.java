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
public final class pua extends v27<pua, C11126b> implements tua {
    private static final pua DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile uhc<pua> PARSER = null;
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
    private w98.InterfaceC14504k<w6c> options_ = v27.m23722x();

    /* JADX INFO: renamed from: pua$a */
    public static /* synthetic */ class C11125a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f72129a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f72129a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72129a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72129a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72129a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f72129a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f72129a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f72129a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: pua$b */
    public static final class C11126b extends v27.AbstractC13823b<pua, C11126b> implements tua {
        public /* synthetic */ C11126b(C11125a c11125a) {
            this();
        }

        public C11126b addAllOptions(Iterable<? extends w6c> values) {
            m23743e();
            ((pua) this.f89756b).addAllOptions(values);
            return this;
        }

        public C11126b addOptions(w6c value) {
            m23743e();
            ((pua) this.f89756b).addOptions(value);
            return this;
        }

        public C11126b clearName() {
            m23743e();
            ((pua) this.f89756b).clearName();
            return this;
        }

        public C11126b clearOptions() {
            m23743e();
            ((pua) this.f89756b).clearOptions();
            return this;
        }

        public C11126b clearRequestStreaming() {
            m23743e();
            ((pua) this.f89756b).clearRequestStreaming();
            return this;
        }

        public C11126b clearRequestTypeUrl() {
            m23743e();
            ((pua) this.f89756b).clearRequestTypeUrl();
            return this;
        }

        public C11126b clearResponseStreaming() {
            m23743e();
            ((pua) this.f89756b).clearResponseStreaming();
            return this;
        }

        public C11126b clearResponseTypeUrl() {
            m23743e();
            ((pua) this.f89756b).clearResponseTypeUrl();
            return this;
        }

        public C11126b clearSyntax() {
            m23743e();
            ((pua) this.f89756b).clearSyntax();
            return this;
        }

        @Override // p000.tua
        public String getName() {
            return ((pua) this.f89756b).getName();
        }

        @Override // p000.tua
        public vj1 getNameBytes() {
            return ((pua) this.f89756b).getNameBytes();
        }

        @Override // p000.tua
        public w6c getOptions(int index) {
            return ((pua) this.f89756b).getOptions(index);
        }

        @Override // p000.tua
        public int getOptionsCount() {
            return ((pua) this.f89756b).getOptionsCount();
        }

        @Override // p000.tua
        public List<w6c> getOptionsList() {
            return Collections.unmodifiableList(((pua) this.f89756b).getOptionsList());
        }

        @Override // p000.tua
        public boolean getRequestStreaming() {
            return ((pua) this.f89756b).getRequestStreaming();
        }

        @Override // p000.tua
        public String getRequestTypeUrl() {
            return ((pua) this.f89756b).getRequestTypeUrl();
        }

        @Override // p000.tua
        public vj1 getRequestTypeUrlBytes() {
            return ((pua) this.f89756b).getRequestTypeUrlBytes();
        }

        @Override // p000.tua
        public boolean getResponseStreaming() {
            return ((pua) this.f89756b).getResponseStreaming();
        }

        @Override // p000.tua
        public String getResponseTypeUrl() {
            return ((pua) this.f89756b).getResponseTypeUrl();
        }

        @Override // p000.tua
        public vj1 getResponseTypeUrlBytes() {
            return ((pua) this.f89756b).getResponseTypeUrlBytes();
        }

        @Override // p000.tua
        public qig getSyntax() {
            return ((pua) this.f89756b).getSyntax();
        }

        @Override // p000.tua
        public int getSyntaxValue() {
            return ((pua) this.f89756b).getSyntaxValue();
        }

        public C11126b removeOptions(int index) {
            m23743e();
            ((pua) this.f89756b).removeOptions(index);
            return this;
        }

        public C11126b setName(String value) {
            m23743e();
            ((pua) this.f89756b).setName(value);
            return this;
        }

        public C11126b setNameBytes(vj1 value) {
            m23743e();
            ((pua) this.f89756b).setNameBytes(value);
            return this;
        }

        public C11126b setOptions(int index, w6c value) {
            m23743e();
            ((pua) this.f89756b).setOptions(index, value);
            return this;
        }

        public C11126b setRequestStreaming(boolean value) {
            m23743e();
            ((pua) this.f89756b).setRequestStreaming(value);
            return this;
        }

        public C11126b setRequestTypeUrl(String value) {
            m23743e();
            ((pua) this.f89756b).setRequestTypeUrl(value);
            return this;
        }

        public C11126b setRequestTypeUrlBytes(vj1 value) {
            m23743e();
            ((pua) this.f89756b).setRequestTypeUrlBytes(value);
            return this;
        }

        public C11126b setResponseStreaming(boolean value) {
            m23743e();
            ((pua) this.f89756b).setResponseStreaming(value);
            return this;
        }

        public C11126b setResponseTypeUrl(String value) {
            m23743e();
            ((pua) this.f89756b).setResponseTypeUrl(value);
            return this;
        }

        public C11126b setResponseTypeUrlBytes(vj1 value) {
            m23743e();
            ((pua) this.f89756b).setResponseTypeUrlBytes(value);
            return this;
        }

        public C11126b setSyntax(qig value) {
            m23743e();
            ((pua) this.f89756b).setSyntax(value);
            return this;
        }

        public C11126b setSyntaxValue(int value) {
            m23743e();
            ((pua) this.f89756b).setSyntaxValue(value);
            return this;
        }

        private C11126b() {
            super(pua.DEFAULT_INSTANCE);
        }

        public C11126b addOptions(int index, w6c value) {
            m23743e();
            ((pua) this.f89756b).addOptions(index, value);
            return this;
        }

        public C11126b setOptions(int index, w6c.C14445b builderForValue) {
            m23743e();
            ((pua) this.f89756b).setOptions(index, builderForValue.build());
            return this;
        }

        public C11126b addOptions(w6c.C14445b builderForValue) {
            m23743e();
            ((pua) this.f89756b).addOptions(builderForValue.build());
            return this;
        }

        public C11126b addOptions(int index, w6c.C14445b builderForValue) {
            m23743e();
            ((pua) this.f89756b).addOptions(index, builderForValue.build());
            return this;
        }
    }

    static {
        pua puaVar = new pua();
        DEFAULT_INSTANCE = puaVar;
        v27.m23715h0(pua.class, puaVar);
    }

    private pua() {
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
    public void clearOptions() {
        this.options_ = v27.m23722x();
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
        w98.InterfaceC14504k<w6c> interfaceC14504k = this.options_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.options_ = v27.m23698P(interfaceC14504k);
    }

    public static pua getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C11126b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static pua parseDelimitedFrom(InputStream input) throws IOException {
        return (pua) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static pua parseFrom(ByteBuffer data) throws ce8 {
        return (pua) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<pua> parser() {
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
    public void setOptions(int index, w6c value) {
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
    public void setRequestTypeUrlBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
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
    public void setResponseTypeUrlBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.responseTypeUrl_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(qig value) {
        this.syntax_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int value) {
        this.syntax_ = value;
    }

    @Override // p000.tua
    public String getName() {
        return this.name_;
    }

    @Override // p000.tua
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.tua
    public w6c getOptions(int index) {
        return this.options_.get(index);
    }

    @Override // p000.tua
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // p000.tua
    public List<w6c> getOptionsList() {
        return this.options_;
    }

    public x6c getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    public List<? extends x6c> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // p000.tua
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override // p000.tua
    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    @Override // p000.tua
    public vj1 getRequestTypeUrlBytes() {
        return vj1.copyFromUtf8(this.requestTypeUrl_);
    }

    @Override // p000.tua
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override // p000.tua
    public String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    @Override // p000.tua
    public vj1 getResponseTypeUrlBytes() {
        return vj1.copyFromUtf8(this.responseTypeUrl_);
    }

    @Override // p000.tua
    public qig getSyntax() {
        qig qigVarForNumber = qig.forNumber(this.syntax_);
        return qigVarForNumber == null ? qig.UNRECOGNIZED : qigVarForNumber;
    }

    @Override // p000.tua
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C11125a c11125a = null;
        switch (C11125a.f72129a[method.ordinal()]) {
            case 1:
                return new pua();
            case 2:
                return new C11126b(c11125a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", w6c.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<pua> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (pua.class) {
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

    public static C11126b newBuilder(pua prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static pua parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (pua) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static pua parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (pua) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static pua parseFrom(vj1 data) throws ce8 {
        return (pua) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, w6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    public static pua parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (pua) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static pua parseFrom(byte[] data) throws ce8 {
        return (pua) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static pua parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (pua) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static pua parseFrom(InputStream input) throws IOException {
        return (pua) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static pua parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (pua) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static pua parseFrom(f72 input) throws IOException {
        return (pua) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static pua parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (pua) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
