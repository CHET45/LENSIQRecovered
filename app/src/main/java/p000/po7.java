package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.cd3;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class po7 extends v27<po7, C11054b> implements qo7 {
    public static final int ADDITIONAL_BINDINGS_FIELD_NUMBER = 11;
    public static final int BODY_FIELD_NUMBER = 7;
    public static final int CUSTOM_FIELD_NUMBER = 8;
    private static final po7 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 5;
    public static final int GET_FIELD_NUMBER = 2;
    private static volatile uhc<po7> PARSER = null;
    public static final int PATCH_FIELD_NUMBER = 6;
    public static final int POST_FIELD_NUMBER = 4;
    public static final int PUT_FIELD_NUMBER = 3;
    public static final int RESPONSE_BODY_FIELD_NUMBER = 12;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Object pattern_;
    private int patternCase_ = 0;
    private String selector_ = "";
    private String body_ = "";
    private String responseBody_ = "";
    private w98.InterfaceC14504k<po7> additionalBindings_ = v27.m23722x();

    /* JADX INFO: renamed from: po7$a */
    public static /* synthetic */ class C11053a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f71539a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f71539a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71539a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71539a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71539a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71539a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71539a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71539a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: po7$b */
    public static final class C11054b extends v27.AbstractC13823b<po7, C11054b> implements qo7 {
        public /* synthetic */ C11054b(C11053a c11053a) {
            this();
        }

        public C11054b addAdditionalBindings(po7 po7Var) {
            m23743e();
            ((po7) this.f89756b).addAdditionalBindings(po7Var);
            return this;
        }

        public C11054b addAllAdditionalBindings(Iterable<? extends po7> iterable) {
            m23743e();
            ((po7) this.f89756b).addAllAdditionalBindings(iterable);
            return this;
        }

        public C11054b clearAdditionalBindings() {
            m23743e();
            ((po7) this.f89756b).clearAdditionalBindings();
            return this;
        }

        public C11054b clearBody() {
            m23743e();
            ((po7) this.f89756b).clearBody();
            return this;
        }

        public C11054b clearCustom() {
            m23743e();
            ((po7) this.f89756b).clearCustom();
            return this;
        }

        public C11054b clearDelete() {
            m23743e();
            ((po7) this.f89756b).clearDelete();
            return this;
        }

        public C11054b clearGet() {
            m23743e();
            ((po7) this.f89756b).clearGet();
            return this;
        }

        public C11054b clearPatch() {
            m23743e();
            ((po7) this.f89756b).clearPatch();
            return this;
        }

        public C11054b clearPattern() {
            m23743e();
            ((po7) this.f89756b).clearPattern();
            return this;
        }

        public C11054b clearPost() {
            m23743e();
            ((po7) this.f89756b).clearPost();
            return this;
        }

        public C11054b clearPut() {
            m23743e();
            ((po7) this.f89756b).clearPut();
            return this;
        }

        public C11054b clearResponseBody() {
            m23743e();
            ((po7) this.f89756b).clearResponseBody();
            return this;
        }

        public C11054b clearSelector() {
            m23743e();
            ((po7) this.f89756b).clearSelector();
            return this;
        }

        @Override // p000.qo7
        public po7 getAdditionalBindings(int i) {
            return ((po7) this.f89756b).getAdditionalBindings(i);
        }

        @Override // p000.qo7
        public int getAdditionalBindingsCount() {
            return ((po7) this.f89756b).getAdditionalBindingsCount();
        }

        @Override // p000.qo7
        public List<po7> getAdditionalBindingsList() {
            return Collections.unmodifiableList(((po7) this.f89756b).getAdditionalBindingsList());
        }

        @Override // p000.qo7
        public String getBody() {
            return ((po7) this.f89756b).getBody();
        }

        @Override // p000.qo7
        public vj1 getBodyBytes() {
            return ((po7) this.f89756b).getBodyBytes();
        }

        @Override // p000.qo7
        public cd3 getCustom() {
            return ((po7) this.f89756b).getCustom();
        }

        @Override // p000.qo7
        public String getDelete() {
            return ((po7) this.f89756b).getDelete();
        }

        @Override // p000.qo7
        public vj1 getDeleteBytes() {
            return ((po7) this.f89756b).getDeleteBytes();
        }

        @Override // p000.qo7
        public String getGet() {
            return ((po7) this.f89756b).getGet();
        }

        @Override // p000.qo7
        public vj1 getGetBytes() {
            return ((po7) this.f89756b).getGetBytes();
        }

        @Override // p000.qo7
        public String getPatch() {
            return ((po7) this.f89756b).getPatch();
        }

        @Override // p000.qo7
        public vj1 getPatchBytes() {
            return ((po7) this.f89756b).getPatchBytes();
        }

        @Override // p000.qo7
        public EnumC11055c getPatternCase() {
            return ((po7) this.f89756b).getPatternCase();
        }

        @Override // p000.qo7
        public String getPost() {
            return ((po7) this.f89756b).getPost();
        }

        @Override // p000.qo7
        public vj1 getPostBytes() {
            return ((po7) this.f89756b).getPostBytes();
        }

        @Override // p000.qo7
        public String getPut() {
            return ((po7) this.f89756b).getPut();
        }

        @Override // p000.qo7
        public vj1 getPutBytes() {
            return ((po7) this.f89756b).getPutBytes();
        }

        @Override // p000.qo7
        public String getResponseBody() {
            return ((po7) this.f89756b).getResponseBody();
        }

        @Override // p000.qo7
        public vj1 getResponseBodyBytes() {
            return ((po7) this.f89756b).getResponseBodyBytes();
        }

        @Override // p000.qo7
        public String getSelector() {
            return ((po7) this.f89756b).getSelector();
        }

        @Override // p000.qo7
        public vj1 getSelectorBytes() {
            return ((po7) this.f89756b).getSelectorBytes();
        }

        @Override // p000.qo7
        public boolean hasCustom() {
            return ((po7) this.f89756b).hasCustom();
        }

        @Override // p000.qo7
        public boolean hasDelete() {
            return ((po7) this.f89756b).hasDelete();
        }

        @Override // p000.qo7
        public boolean hasGet() {
            return ((po7) this.f89756b).hasGet();
        }

        @Override // p000.qo7
        public boolean hasPatch() {
            return ((po7) this.f89756b).hasPatch();
        }

        @Override // p000.qo7
        public boolean hasPost() {
            return ((po7) this.f89756b).hasPost();
        }

        @Override // p000.qo7
        public boolean hasPut() {
            return ((po7) this.f89756b).hasPut();
        }

        public C11054b mergeCustom(cd3 cd3Var) {
            m23743e();
            ((po7) this.f89756b).mergeCustom(cd3Var);
            return this;
        }

        public C11054b removeAdditionalBindings(int i) {
            m23743e();
            ((po7) this.f89756b).removeAdditionalBindings(i);
            return this;
        }

        public C11054b setAdditionalBindings(int i, po7 po7Var) {
            m23743e();
            ((po7) this.f89756b).setAdditionalBindings(i, po7Var);
            return this;
        }

        public C11054b setBody(String str) {
            m23743e();
            ((po7) this.f89756b).setBody(str);
            return this;
        }

        public C11054b setBodyBytes(vj1 vj1Var) {
            m23743e();
            ((po7) this.f89756b).setBodyBytes(vj1Var);
            return this;
        }

        public C11054b setCustom(cd3 cd3Var) {
            m23743e();
            ((po7) this.f89756b).setCustom(cd3Var);
            return this;
        }

        public C11054b setDelete(String str) {
            m23743e();
            ((po7) this.f89756b).setDelete(str);
            return this;
        }

        public C11054b setDeleteBytes(vj1 vj1Var) {
            m23743e();
            ((po7) this.f89756b).setDeleteBytes(vj1Var);
            return this;
        }

        public C11054b setGet(String str) {
            m23743e();
            ((po7) this.f89756b).setGet(str);
            return this;
        }

        public C11054b setGetBytes(vj1 vj1Var) {
            m23743e();
            ((po7) this.f89756b).setGetBytes(vj1Var);
            return this;
        }

        public C11054b setPatch(String str) {
            m23743e();
            ((po7) this.f89756b).setPatch(str);
            return this;
        }

        public C11054b setPatchBytes(vj1 vj1Var) {
            m23743e();
            ((po7) this.f89756b).setPatchBytes(vj1Var);
            return this;
        }

        public C11054b setPost(String str) {
            m23743e();
            ((po7) this.f89756b).setPost(str);
            return this;
        }

        public C11054b setPostBytes(vj1 vj1Var) {
            m23743e();
            ((po7) this.f89756b).setPostBytes(vj1Var);
            return this;
        }

        public C11054b setPut(String str) {
            m23743e();
            ((po7) this.f89756b).setPut(str);
            return this;
        }

        public C11054b setPutBytes(vj1 vj1Var) {
            m23743e();
            ((po7) this.f89756b).setPutBytes(vj1Var);
            return this;
        }

        public C11054b setResponseBody(String str) {
            m23743e();
            ((po7) this.f89756b).setResponseBody(str);
            return this;
        }

        public C11054b setResponseBodyBytes(vj1 vj1Var) {
            m23743e();
            ((po7) this.f89756b).setResponseBodyBytes(vj1Var);
            return this;
        }

        public C11054b setSelector(String str) {
            m23743e();
            ((po7) this.f89756b).setSelector(str);
            return this;
        }

        public C11054b setSelectorBytes(vj1 vj1Var) {
            m23743e();
            ((po7) this.f89756b).setSelectorBytes(vj1Var);
            return this;
        }

        private C11054b() {
            super(po7.DEFAULT_INSTANCE);
        }

        public C11054b addAdditionalBindings(int i, po7 po7Var) {
            m23743e();
            ((po7) this.f89756b).addAdditionalBindings(i, po7Var);
            return this;
        }

        public C11054b setAdditionalBindings(int i, C11054b c11054b) {
            m23743e();
            ((po7) this.f89756b).setAdditionalBindings(i, c11054b.build());
            return this;
        }

        public C11054b setCustom(cd3.C2278b c2278b) {
            m23743e();
            ((po7) this.f89756b).setCustom(c2278b.build());
            return this;
        }

        public C11054b addAdditionalBindings(C11054b c11054b) {
            m23743e();
            ((po7) this.f89756b).addAdditionalBindings(c11054b.build());
            return this;
        }

        public C11054b addAdditionalBindings(int i, C11054b c11054b) {
            m23743e();
            ((po7) this.f89756b).addAdditionalBindings(i, c11054b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: po7$c */
    public enum EnumC11055c {
        GET(2),
        PUT(3),
        POST(4),
        DELETE(5),
        PATCH(6),
        CUSTOM(8),
        PATTERN_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f71548a;

        EnumC11055c(int i) {
            this.f71548a = i;
        }

        public static EnumC11055c forNumber(int i) {
            if (i == 0) {
                return PATTERN_NOT_SET;
            }
            if (i == 8) {
                return CUSTOM;
            }
            if (i == 2) {
                return GET;
            }
            if (i == 3) {
                return PUT;
            }
            if (i == 4) {
                return POST;
            }
            if (i == 5) {
                return DELETE;
            }
            if (i != 6) {
                return null;
            }
            return PATCH;
        }

        public int getNumber() {
            return this.f71548a;
        }

        @Deprecated
        public static EnumC11055c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        po7 po7Var = new po7();
        DEFAULT_INSTANCE = po7Var;
        v27.m23715h0(po7.class, po7Var);
    }

    private po7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalBindings(po7 po7Var) {
        po7Var.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(po7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdditionalBindings(Iterable<? extends po7> iterable) {
        ensureAdditionalBindingsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.additionalBindings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalBindings() {
        this.additionalBindings_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.body_ = getDefaultInstance().getBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustom() {
        if (this.patternCase_ == 8) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDelete() {
        if (this.patternCase_ == 5) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGet() {
        if (this.patternCase_ == 2) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPatch() {
        if (this.patternCase_ == 6) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPattern() {
        this.patternCase_ = 0;
        this.pattern_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPost() {
        if (this.patternCase_ == 4) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPut() {
        if (this.patternCase_ == 3) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseBody() {
        this.responseBody_ = getDefaultInstance().getResponseBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureAdditionalBindingsIsMutable() {
        w98.InterfaceC14504k<po7> interfaceC14504k = this.additionalBindings_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.additionalBindings_ = v27.m23698P(interfaceC14504k);
    }

    public static po7 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCustom(cd3 cd3Var) {
        cd3Var.getClass();
        if (this.patternCase_ != 8 || this.pattern_ == cd3.getDefaultInstance()) {
            this.pattern_ = cd3Var;
        } else {
            this.pattern_ = cd3.newBuilder((cd3) this.pattern_).mergeFrom(cd3Var).buildPartial();
        }
        this.patternCase_ = 8;
    }

    public static C11054b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static po7 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (po7) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static po7 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (po7) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<po7> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAdditionalBindings(int i) {
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalBindings(int i, po7 po7Var) {
        po7Var.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.set(i, po7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBody(String str) {
        str.getClass();
        this.body_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBodyBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.body_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustom(cd3 cd3Var) {
        cd3Var.getClass();
        this.pattern_ = cd3Var;
        this.patternCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDelete(String str) {
        str.getClass();
        this.patternCase_ = 5;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.pattern_ = vj1Var.toStringUtf8();
        this.patternCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGet(String str) {
        str.getClass();
        this.patternCase_ = 2;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGetBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.pattern_ = vj1Var.toStringUtf8();
        this.patternCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPatch(String str) {
        str.getClass();
        this.patternCase_ = 6;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPatchBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.pattern_ = vj1Var.toStringUtf8();
        this.patternCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPost(String str) {
        str.getClass();
        this.patternCase_ = 4;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.pattern_ = vj1Var.toStringUtf8();
        this.patternCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPut(String str) {
        str.getClass();
        this.patternCase_ = 3;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPutBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.pattern_ = vj1Var.toStringUtf8();
        this.patternCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseBody(String str) {
        str.getClass();
        this.responseBody_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseBodyBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.responseBody_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.selector_ = vj1Var.toStringUtf8();
    }

    @Override // p000.qo7
    public po7 getAdditionalBindings(int i) {
        return this.additionalBindings_.get(i);
    }

    @Override // p000.qo7
    public int getAdditionalBindingsCount() {
        return this.additionalBindings_.size();
    }

    @Override // p000.qo7
    public List<po7> getAdditionalBindingsList() {
        return this.additionalBindings_;
    }

    public qo7 getAdditionalBindingsOrBuilder(int i) {
        return this.additionalBindings_.get(i);
    }

    public List<? extends qo7> getAdditionalBindingsOrBuilderList() {
        return this.additionalBindings_;
    }

    @Override // p000.qo7
    public String getBody() {
        return this.body_;
    }

    @Override // p000.qo7
    public vj1 getBodyBytes() {
        return vj1.copyFromUtf8(this.body_);
    }

    @Override // p000.qo7
    public cd3 getCustom() {
        return this.patternCase_ == 8 ? (cd3) this.pattern_ : cd3.getDefaultInstance();
    }

    @Override // p000.qo7
    public String getDelete() {
        return this.patternCase_ == 5 ? (String) this.pattern_ : "";
    }

    @Override // p000.qo7
    public vj1 getDeleteBytes() {
        return vj1.copyFromUtf8(this.patternCase_ == 5 ? (String) this.pattern_ : "");
    }

    @Override // p000.qo7
    public String getGet() {
        return this.patternCase_ == 2 ? (String) this.pattern_ : "";
    }

    @Override // p000.qo7
    public vj1 getGetBytes() {
        return vj1.copyFromUtf8(this.patternCase_ == 2 ? (String) this.pattern_ : "");
    }

    @Override // p000.qo7
    public String getPatch() {
        return this.patternCase_ == 6 ? (String) this.pattern_ : "";
    }

    @Override // p000.qo7
    public vj1 getPatchBytes() {
        return vj1.copyFromUtf8(this.patternCase_ == 6 ? (String) this.pattern_ : "");
    }

    @Override // p000.qo7
    public EnumC11055c getPatternCase() {
        return EnumC11055c.forNumber(this.patternCase_);
    }

    @Override // p000.qo7
    public String getPost() {
        return this.patternCase_ == 4 ? (String) this.pattern_ : "";
    }

    @Override // p000.qo7
    public vj1 getPostBytes() {
        return vj1.copyFromUtf8(this.patternCase_ == 4 ? (String) this.pattern_ : "");
    }

    @Override // p000.qo7
    public String getPut() {
        return this.patternCase_ == 3 ? (String) this.pattern_ : "";
    }

    @Override // p000.qo7
    public vj1 getPutBytes() {
        return vj1.copyFromUtf8(this.patternCase_ == 3 ? (String) this.pattern_ : "");
    }

    @Override // p000.qo7
    public String getResponseBody() {
        return this.responseBody_;
    }

    @Override // p000.qo7
    public vj1 getResponseBodyBytes() {
        return vj1.copyFromUtf8(this.responseBody_);
    }

    @Override // p000.qo7
    public String getSelector() {
        return this.selector_;
    }

    @Override // p000.qo7
    public vj1 getSelectorBytes() {
        return vj1.copyFromUtf8(this.selector_);
    }

    @Override // p000.qo7
    public boolean hasCustom() {
        return this.patternCase_ == 8;
    }

    @Override // p000.qo7
    public boolean hasDelete() {
        return this.patternCase_ == 5;
    }

    @Override // p000.qo7
    public boolean hasGet() {
        return this.patternCase_ == 2;
    }

    @Override // p000.qo7
    public boolean hasPatch() {
        return this.patternCase_ == 6;
    }

    @Override // p000.qo7
    public boolean hasPost() {
        return this.patternCase_ == 4;
    }

    @Override // p000.qo7
    public boolean hasPut() {
        return this.patternCase_ == 3;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C11053a c11053a = null;
        switch (C11053a.f71539a[enumC13830i.ordinal()]) {
            case 1:
                return new po7();
            case 2:
                return new C11054b(c11053a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006Ȼ\u0000\u0007Ȉ\b<\u0000\u000b\u001b\fȈ", new Object[]{"pattern_", "patternCase_", "selector_", "body_", cd3.class, "additionalBindings_", po7.class, "responseBody_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<po7> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (po7.class) {
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

    public static C11054b newBuilder(po7 po7Var) {
        return DEFAULT_INSTANCE.m23739o(po7Var);
    }

    public static po7 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (po7) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static po7 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (po7) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static po7 parseFrom(vj1 vj1Var) throws ce8 {
        return (po7) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalBindings(int i, po7 po7Var) {
        po7Var.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(i, po7Var);
    }

    public static po7 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (po7) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static po7 parseFrom(byte[] bArr) throws ce8 {
        return (po7) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static po7 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (po7) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static po7 parseFrom(InputStream inputStream) throws IOException {
        return (po7) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static po7 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (po7) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static po7 parseFrom(f72 f72Var) throws IOException {
        return (po7) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static po7 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (po7) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
