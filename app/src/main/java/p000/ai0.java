package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.fi0;
import p000.v27;
import p000.w98;
import p000.wh0;

/* JADX INFO: loaded from: classes5.dex */
public final class ai0 extends v27<ai0, C0255b> implements ei0 {
    private static final ai0 DEFAULT_INSTANCE;
    private static volatile uhc<ai0> PARSER = null;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private w98.InterfaceC14504k<fi0> rules_ = v27.m23722x();
    private w98.InterfaceC14504k<wh0> providers_ = v27.m23722x();

    /* JADX INFO: renamed from: ai0$a */
    public static /* synthetic */ class C0254a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1628a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f1628a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1628a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1628a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1628a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1628a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1628a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1628a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: ai0$b */
    public static final class C0255b extends v27.AbstractC13823b<ai0, C0255b> implements ei0 {
        public /* synthetic */ C0255b(C0254a c0254a) {
            this();
        }

        public C0255b addAllProviders(Iterable<? extends wh0> iterable) {
            m23743e();
            ((ai0) this.f89756b).addAllProviders(iterable);
            return this;
        }

        public C0255b addAllRules(Iterable<? extends fi0> iterable) {
            m23743e();
            ((ai0) this.f89756b).addAllRules(iterable);
            return this;
        }

        public C0255b addProviders(wh0 wh0Var) {
            m23743e();
            ((ai0) this.f89756b).addProviders(wh0Var);
            return this;
        }

        public C0255b addRules(fi0 fi0Var) {
            m23743e();
            ((ai0) this.f89756b).addRules(fi0Var);
            return this;
        }

        public C0255b clearProviders() {
            m23743e();
            ((ai0) this.f89756b).clearProviders();
            return this;
        }

        public C0255b clearRules() {
            m23743e();
            ((ai0) this.f89756b).clearRules();
            return this;
        }

        @Override // p000.ei0
        public wh0 getProviders(int i) {
            return ((ai0) this.f89756b).getProviders(i);
        }

        @Override // p000.ei0
        public int getProvidersCount() {
            return ((ai0) this.f89756b).getProvidersCount();
        }

        @Override // p000.ei0
        public List<wh0> getProvidersList() {
            return Collections.unmodifiableList(((ai0) this.f89756b).getProvidersList());
        }

        @Override // p000.ei0
        public fi0 getRules(int i) {
            return ((ai0) this.f89756b).getRules(i);
        }

        @Override // p000.ei0
        public int getRulesCount() {
            return ((ai0) this.f89756b).getRulesCount();
        }

        @Override // p000.ei0
        public List<fi0> getRulesList() {
            return Collections.unmodifiableList(((ai0) this.f89756b).getRulesList());
        }

        public C0255b removeProviders(int i) {
            m23743e();
            ((ai0) this.f89756b).removeProviders(i);
            return this;
        }

        public C0255b removeRules(int i) {
            m23743e();
            ((ai0) this.f89756b).removeRules(i);
            return this;
        }

        public C0255b setProviders(int i, wh0 wh0Var) {
            m23743e();
            ((ai0) this.f89756b).setProviders(i, wh0Var);
            return this;
        }

        public C0255b setRules(int i, fi0 fi0Var) {
            m23743e();
            ((ai0) this.f89756b).setRules(i, fi0Var);
            return this;
        }

        private C0255b() {
            super(ai0.DEFAULT_INSTANCE);
        }

        public C0255b addProviders(int i, wh0 wh0Var) {
            m23743e();
            ((ai0) this.f89756b).addProviders(i, wh0Var);
            return this;
        }

        public C0255b addRules(int i, fi0 fi0Var) {
            m23743e();
            ((ai0) this.f89756b).addRules(i, fi0Var);
            return this;
        }

        public C0255b setProviders(int i, wh0.C14600b c14600b) {
            m23743e();
            ((ai0) this.f89756b).setProviders(i, c14600b.build());
            return this;
        }

        public C0255b setRules(int i, fi0.C5811b c5811b) {
            m23743e();
            ((ai0) this.f89756b).setRules(i, c5811b.build());
            return this;
        }

        public C0255b addProviders(wh0.C14600b c14600b) {
            m23743e();
            ((ai0) this.f89756b).addProviders(c14600b.build());
            return this;
        }

        public C0255b addRules(fi0.C5811b c5811b) {
            m23743e();
            ((ai0) this.f89756b).addRules(c5811b.build());
            return this;
        }

        public C0255b addProviders(int i, wh0.C14600b c14600b) {
            m23743e();
            ((ai0) this.f89756b).addProviders(i, c14600b.build());
            return this;
        }

        public C0255b addRules(int i, fi0.C5811b c5811b) {
            m23743e();
            ((ai0) this.f89756b).addRules(i, c5811b.build());
            return this;
        }
    }

    static {
        ai0 ai0Var = new ai0();
        DEFAULT_INSTANCE = ai0Var;
        v27.m23715h0(ai0.class, ai0Var);
    }

    private ai0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProviders(Iterable<? extends wh0> iterable) {
        ensureProvidersIsMutable();
        AbstractC1714b3.m2856b(iterable, this.providers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends fi0> iterable) {
        ensureRulesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProviders(wh0 wh0Var) {
        wh0Var.getClass();
        ensureProvidersIsMutable();
        this.providers_.add(wh0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(fi0 fi0Var) {
        fi0Var.getClass();
        ensureRulesIsMutable();
        this.rules_.add(fi0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviders() {
        this.providers_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = v27.m23722x();
    }

    private void ensureProvidersIsMutable() {
        w98.InterfaceC14504k<wh0> interfaceC14504k = this.providers_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.providers_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureRulesIsMutable() {
        w98.InterfaceC14504k<fi0> interfaceC14504k = this.rules_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.rules_ = v27.m23698P(interfaceC14504k);
    }

    public static ai0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0255b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static ai0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ai0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static ai0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (ai0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<ai0> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProviders(int i) {
        ensureProvidersIsMutable();
        this.providers_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviders(int i, wh0 wh0Var) {
        wh0Var.getClass();
        ensureProvidersIsMutable();
        this.providers_.set(i, wh0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i, fi0 fi0Var) {
        fi0Var.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, fi0Var);
    }

    @Override // p000.ei0
    public wh0 getProviders(int i) {
        return this.providers_.get(i);
    }

    @Override // p000.ei0
    public int getProvidersCount() {
        return this.providers_.size();
    }

    @Override // p000.ei0
    public List<wh0> getProvidersList() {
        return this.providers_;
    }

    public xh0 getProvidersOrBuilder(int i) {
        return this.providers_.get(i);
    }

    public List<? extends xh0> getProvidersOrBuilderList() {
        return this.providers_;
    }

    @Override // p000.ei0
    public fi0 getRules(int i) {
        return this.rules_.get(i);
    }

    @Override // p000.ei0
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // p000.ei0
    public List<fi0> getRulesList() {
        return this.rules_;
    }

    public gi0 getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public List<? extends gi0> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C0254a c0254a = null;
        switch (C0254a.f1628a[enumC13830i.ordinal()]) {
            case 1:
                return new ai0();
            case 2:
                return new C0255b(c0254a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"rules_", fi0.class, "providers_", wh0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<ai0> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (ai0.class) {
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

    public static C0255b newBuilder(ai0 ai0Var) {
        return DEFAULT_INSTANCE.m23739o(ai0Var);
    }

    public static ai0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ai0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ai0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (ai0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static ai0 parseFrom(vj1 vj1Var) throws ce8 {
        return (ai0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProviders(int i, wh0 wh0Var) {
        wh0Var.getClass();
        ensureProvidersIsMutable();
        this.providers_.add(i, wh0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i, fi0 fi0Var) {
        fi0Var.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, fi0Var);
    }

    public static ai0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (ai0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static ai0 parseFrom(byte[] bArr) throws ce8 {
        return (ai0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static ai0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (ai0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static ai0 parseFrom(InputStream inputStream) throws IOException {
        return (ai0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static ai0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ai0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ai0 parseFrom(f72 f72Var) throws IOException {
        return (ai0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static ai0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (ai0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
