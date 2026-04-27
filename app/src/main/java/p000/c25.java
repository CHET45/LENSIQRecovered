package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class c25 extends v27<c25, C2166b> implements d25 {
    public static final int ALIASES_FIELD_NUMBER = 2;
    public static final int ALLOW_CORS_FIELD_NUMBER = 5;
    private static final c25 DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<c25> PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 101;
    private boolean allowCors_;
    private String name_ = "";
    private w98.InterfaceC14504k<String> aliases_ = v27.m23722x();
    private w98.InterfaceC14504k<String> features_ = v27.m23722x();
    private String target_ = "";

    /* JADX INFO: renamed from: c25$a */
    public static /* synthetic */ class C2165a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15573a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f15573a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15573a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15573a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15573a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15573a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15573a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15573a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: c25$b */
    public static final class C2166b extends v27.AbstractC13823b<c25, C2166b> implements d25 {
        public /* synthetic */ C2166b(C2165a c2165a) {
            this();
        }

        @Deprecated
        public C2166b addAliases(String str) {
            m23743e();
            ((c25) this.f89756b).addAliases(str);
            return this;
        }

        @Deprecated
        public C2166b addAliasesBytes(vj1 vj1Var) {
            m23743e();
            ((c25) this.f89756b).addAliasesBytes(vj1Var);
            return this;
        }

        @Deprecated
        public C2166b addAllAliases(Iterable<String> iterable) {
            m23743e();
            ((c25) this.f89756b).addAllAliases(iterable);
            return this;
        }

        public C2166b addAllFeatures(Iterable<String> iterable) {
            m23743e();
            ((c25) this.f89756b).addAllFeatures(iterable);
            return this;
        }

        public C2166b addFeatures(String str) {
            m23743e();
            ((c25) this.f89756b).addFeatures(str);
            return this;
        }

        public C2166b addFeaturesBytes(vj1 vj1Var) {
            m23743e();
            ((c25) this.f89756b).addFeaturesBytes(vj1Var);
            return this;
        }

        @Deprecated
        public C2166b clearAliases() {
            m23743e();
            ((c25) this.f89756b).clearAliases();
            return this;
        }

        public C2166b clearAllowCors() {
            m23743e();
            ((c25) this.f89756b).clearAllowCors();
            return this;
        }

        public C2166b clearFeatures() {
            m23743e();
            ((c25) this.f89756b).clearFeatures();
            return this;
        }

        public C2166b clearName() {
            m23743e();
            ((c25) this.f89756b).clearName();
            return this;
        }

        public C2166b clearTarget() {
            m23743e();
            ((c25) this.f89756b).clearTarget();
            return this;
        }

        @Override // p000.d25
        @Deprecated
        public String getAliases(int i) {
            return ((c25) this.f89756b).getAliases(i);
        }

        @Override // p000.d25
        @Deprecated
        public vj1 getAliasesBytes(int i) {
            return ((c25) this.f89756b).getAliasesBytes(i);
        }

        @Override // p000.d25
        @Deprecated
        public int getAliasesCount() {
            return ((c25) this.f89756b).getAliasesCount();
        }

        @Override // p000.d25
        @Deprecated
        public List<String> getAliasesList() {
            return Collections.unmodifiableList(((c25) this.f89756b).getAliasesList());
        }

        @Override // p000.d25
        public boolean getAllowCors() {
            return ((c25) this.f89756b).getAllowCors();
        }

        @Override // p000.d25
        public String getFeatures(int i) {
            return ((c25) this.f89756b).getFeatures(i);
        }

        @Override // p000.d25
        public vj1 getFeaturesBytes(int i) {
            return ((c25) this.f89756b).getFeaturesBytes(i);
        }

        @Override // p000.d25
        public int getFeaturesCount() {
            return ((c25) this.f89756b).getFeaturesCount();
        }

        @Override // p000.d25
        public List<String> getFeaturesList() {
            return Collections.unmodifiableList(((c25) this.f89756b).getFeaturesList());
        }

        @Override // p000.d25
        public String getName() {
            return ((c25) this.f89756b).getName();
        }

        @Override // p000.d25
        public vj1 getNameBytes() {
            return ((c25) this.f89756b).getNameBytes();
        }

        @Override // p000.d25
        public String getTarget() {
            return ((c25) this.f89756b).getTarget();
        }

        @Override // p000.d25
        public vj1 getTargetBytes() {
            return ((c25) this.f89756b).getTargetBytes();
        }

        @Deprecated
        public C2166b setAliases(int i, String str) {
            m23743e();
            ((c25) this.f89756b).setAliases(i, str);
            return this;
        }

        public C2166b setAllowCors(boolean z) {
            m23743e();
            ((c25) this.f89756b).setAllowCors(z);
            return this;
        }

        public C2166b setFeatures(int i, String str) {
            m23743e();
            ((c25) this.f89756b).setFeatures(i, str);
            return this;
        }

        public C2166b setName(String str) {
            m23743e();
            ((c25) this.f89756b).setName(str);
            return this;
        }

        public C2166b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((c25) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C2166b setTarget(String str) {
            m23743e();
            ((c25) this.f89756b).setTarget(str);
            return this;
        }

        public C2166b setTargetBytes(vj1 vj1Var) {
            m23743e();
            ((c25) this.f89756b).setTargetBytes(vj1Var);
            return this;
        }

        private C2166b() {
            super(c25.DEFAULT_INSTANCE);
        }
    }

    static {
        c25 c25Var = new c25();
        DEFAULT_INSTANCE = c25Var;
        v27.m23715h0(c25.class, c25Var);
    }

    private c25() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAliases(String str) {
        str.getClass();
        ensureAliasesIsMutable();
        this.aliases_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAliasesBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensureAliasesIsMutable();
        this.aliases_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAliases(Iterable<String> iterable) {
        ensureAliasesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.aliases_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFeatures(Iterable<String> iterable) {
        ensureFeaturesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.features_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeatures(String str) {
        str.getClass();
        ensureFeaturesIsMutable();
        this.features_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeaturesBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensureFeaturesIsMutable();
        this.features_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAliases() {
        this.aliases_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowCors() {
        this.allowCors_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTarget() {
        this.target_ = getDefaultInstance().getTarget();
    }

    private void ensureAliasesIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.aliases_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.aliases_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureFeaturesIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.features_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.features_ = v27.m23698P(interfaceC14504k);
    }

    public static c25 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C2166b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static c25 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (c25) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static c25 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (c25) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<c25> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAliases(int i, String str) {
        str.getClass();
        ensureAliasesIsMutable();
        this.aliases_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowCors(boolean z) {
        this.allowCors_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(int i, String str) {
        str.getClass();
        ensureFeaturesIsMutable();
        this.features_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.name_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTarget(String str) {
        str.getClass();
        this.target_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.target_ = vj1Var.toStringUtf8();
    }

    @Override // p000.d25
    @Deprecated
    public String getAliases(int i) {
        return this.aliases_.get(i);
    }

    @Override // p000.d25
    @Deprecated
    public vj1 getAliasesBytes(int i) {
        return vj1.copyFromUtf8(this.aliases_.get(i));
    }

    @Override // p000.d25
    @Deprecated
    public int getAliasesCount() {
        return this.aliases_.size();
    }

    @Override // p000.d25
    @Deprecated
    public List<String> getAliasesList() {
        return this.aliases_;
    }

    @Override // p000.d25
    public boolean getAllowCors() {
        return this.allowCors_;
    }

    @Override // p000.d25
    public String getFeatures(int i) {
        return this.features_.get(i);
    }

    @Override // p000.d25
    public vj1 getFeaturesBytes(int i) {
        return vj1.copyFromUtf8(this.features_.get(i));
    }

    @Override // p000.d25
    public int getFeaturesCount() {
        return this.features_.size();
    }

    @Override // p000.d25
    public List<String> getFeaturesList() {
        return this.features_;
    }

    @Override // p000.d25
    public String getName() {
        return this.name_;
    }

    @Override // p000.d25
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.d25
    public String getTarget() {
        return this.target_;
    }

    @Override // p000.d25
    public vj1 getTargetBytes() {
        return vj1.copyFromUtf8(this.target_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C2165a c2165a = null;
        switch (C2165a.f15573a[enumC13830i.ordinal()]) {
            case 1:
                return new c25();
            case 2:
                return new C2166b(c2165a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001e\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0004Ț\u0005\u0007eȈ", new Object[]{"name_", "aliases_", "features_", "allowCors_", "target_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<c25> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (c25.class) {
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

    public static C2166b newBuilder(c25 c25Var) {
        return DEFAULT_INSTANCE.m23739o(c25Var);
    }

    public static c25 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (c25) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static c25 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (c25) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static c25 parseFrom(vj1 vj1Var) throws ce8 {
        return (c25) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static c25 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (c25) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static c25 parseFrom(byte[] bArr) throws ce8 {
        return (c25) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static c25 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (c25) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static c25 parseFrom(InputStream inputStream) throws IOException {
        return (c25) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static c25 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (c25) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static c25 parseFrom(f72 f72Var) throws IOException {
        return (c25) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static c25 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (c25) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
