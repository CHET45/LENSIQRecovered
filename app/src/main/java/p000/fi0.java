package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.kjb;
import p000.v27;
import p000.w98;
import p000.yh0;

/* JADX INFO: loaded from: classes5.dex */
public final class fi0 extends v27<fi0, C5811b> implements gi0 {
    public static final int ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5;
    private static final fi0 DEFAULT_INSTANCE;
    public static final int OAUTH_FIELD_NUMBER = 2;
    private static volatile uhc<fi0> PARSER = null;
    public static final int REQUIREMENTS_FIELD_NUMBER = 7;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private boolean allowWithoutCredential_;
    private int bitField0_;
    private kjb oauth_;
    private String selector_ = "";
    private w98.InterfaceC14504k<yh0> requirements_ = v27.m23722x();

    /* JADX INFO: renamed from: fi0$a */
    public static /* synthetic */ class C5810a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36615a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f36615a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36615a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36615a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36615a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36615a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36615a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36615a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: fi0$b */
    public static final class C5811b extends v27.AbstractC13823b<fi0, C5811b> implements gi0 {
        public /* synthetic */ C5811b(C5810a c5810a) {
            this();
        }

        public C5811b addAllRequirements(Iterable<? extends yh0> iterable) {
            m23743e();
            ((fi0) this.f89756b).addAllRequirements(iterable);
            return this;
        }

        public C5811b addRequirements(yh0 yh0Var) {
            m23743e();
            ((fi0) this.f89756b).addRequirements(yh0Var);
            return this;
        }

        public C5811b clearAllowWithoutCredential() {
            m23743e();
            ((fi0) this.f89756b).clearAllowWithoutCredential();
            return this;
        }

        public C5811b clearOauth() {
            m23743e();
            ((fi0) this.f89756b).clearOauth();
            return this;
        }

        public C5811b clearRequirements() {
            m23743e();
            ((fi0) this.f89756b).clearRequirements();
            return this;
        }

        public C5811b clearSelector() {
            m23743e();
            ((fi0) this.f89756b).clearSelector();
            return this;
        }

        @Override // p000.gi0
        public boolean getAllowWithoutCredential() {
            return ((fi0) this.f89756b).getAllowWithoutCredential();
        }

        @Override // p000.gi0
        public kjb getOauth() {
            return ((fi0) this.f89756b).getOauth();
        }

        @Override // p000.gi0
        public yh0 getRequirements(int i) {
            return ((fi0) this.f89756b).getRequirements(i);
        }

        @Override // p000.gi0
        public int getRequirementsCount() {
            return ((fi0) this.f89756b).getRequirementsCount();
        }

        @Override // p000.gi0
        public List<yh0> getRequirementsList() {
            return Collections.unmodifiableList(((fi0) this.f89756b).getRequirementsList());
        }

        @Override // p000.gi0
        public String getSelector() {
            return ((fi0) this.f89756b).getSelector();
        }

        @Override // p000.gi0
        public vj1 getSelectorBytes() {
            return ((fi0) this.f89756b).getSelectorBytes();
        }

        @Override // p000.gi0
        public boolean hasOauth() {
            return ((fi0) this.f89756b).hasOauth();
        }

        public C5811b mergeOauth(kjb kjbVar) {
            m23743e();
            ((fi0) this.f89756b).mergeOauth(kjbVar);
            return this;
        }

        public C5811b removeRequirements(int i) {
            m23743e();
            ((fi0) this.f89756b).removeRequirements(i);
            return this;
        }

        public C5811b setAllowWithoutCredential(boolean z) {
            m23743e();
            ((fi0) this.f89756b).setAllowWithoutCredential(z);
            return this;
        }

        public C5811b setOauth(kjb kjbVar) {
            m23743e();
            ((fi0) this.f89756b).setOauth(kjbVar);
            return this;
        }

        public C5811b setRequirements(int i, yh0 yh0Var) {
            m23743e();
            ((fi0) this.f89756b).setRequirements(i, yh0Var);
            return this;
        }

        public C5811b setSelector(String str) {
            m23743e();
            ((fi0) this.f89756b).setSelector(str);
            return this;
        }

        public C5811b setSelectorBytes(vj1 vj1Var) {
            m23743e();
            ((fi0) this.f89756b).setSelectorBytes(vj1Var);
            return this;
        }

        private C5811b() {
            super(fi0.DEFAULT_INSTANCE);
        }

        public C5811b addRequirements(int i, yh0 yh0Var) {
            m23743e();
            ((fi0) this.f89756b).addRequirements(i, yh0Var);
            return this;
        }

        public C5811b setOauth(kjb.C8398b c8398b) {
            m23743e();
            ((fi0) this.f89756b).setOauth(c8398b.build());
            return this;
        }

        public C5811b setRequirements(int i, yh0.C15658b c15658b) {
            m23743e();
            ((fi0) this.f89756b).setRequirements(i, c15658b.build());
            return this;
        }

        public C5811b addRequirements(yh0.C15658b c15658b) {
            m23743e();
            ((fi0) this.f89756b).addRequirements(c15658b.build());
            return this;
        }

        public C5811b addRequirements(int i, yh0.C15658b c15658b) {
            m23743e();
            ((fi0) this.f89756b).addRequirements(i, c15658b.build());
            return this;
        }
    }

    static {
        fi0 fi0Var = new fi0();
        DEFAULT_INSTANCE = fi0Var;
        v27.m23715h0(fi0.class, fi0Var);
    }

    private fi0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequirements(Iterable<? extends yh0> iterable) {
        ensureRequirementsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.requirements_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequirements(yh0 yh0Var) {
        yh0Var.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.add(yh0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowWithoutCredential() {
        this.allowWithoutCredential_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauth() {
        this.oauth_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequirements() {
        this.requirements_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureRequirementsIsMutable() {
        w98.InterfaceC14504k<yh0> interfaceC14504k = this.requirements_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.requirements_ = v27.m23698P(interfaceC14504k);
    }

    public static fi0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOauth(kjb kjbVar) {
        kjbVar.getClass();
        kjb kjbVar2 = this.oauth_;
        if (kjbVar2 == null || kjbVar2 == kjb.getDefaultInstance()) {
            this.oauth_ = kjbVar;
        } else {
            this.oauth_ = kjb.newBuilder(this.oauth_).mergeFrom(kjbVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C5811b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static fi0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (fi0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static fi0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (fi0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<fi0> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRequirements(int i) {
        ensureRequirementsIsMutable();
        this.requirements_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowWithoutCredential(boolean z) {
        this.allowWithoutCredential_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauth(kjb kjbVar) {
        kjbVar.getClass();
        this.oauth_ = kjbVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequirements(int i, yh0 yh0Var) {
        yh0Var.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.set(i, yh0Var);
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

    @Override // p000.gi0
    public boolean getAllowWithoutCredential() {
        return this.allowWithoutCredential_;
    }

    @Override // p000.gi0
    public kjb getOauth() {
        kjb kjbVar = this.oauth_;
        return kjbVar == null ? kjb.getDefaultInstance() : kjbVar;
    }

    @Override // p000.gi0
    public yh0 getRequirements(int i) {
        return this.requirements_.get(i);
    }

    @Override // p000.gi0
    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    @Override // p000.gi0
    public List<yh0> getRequirementsList() {
        return this.requirements_;
    }

    public zh0 getRequirementsOrBuilder(int i) {
        return this.requirements_.get(i);
    }

    public List<? extends zh0> getRequirementsOrBuilderList() {
        return this.requirements_;
    }

    @Override // p000.gi0
    public String getSelector() {
        return this.selector_;
    }

    @Override // p000.gi0
    public vj1 getSelectorBytes() {
        return vj1.copyFromUtf8(this.selector_);
    }

    @Override // p000.gi0
    public boolean hasOauth() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C5810a c5810a = null;
        switch (C5810a.f36615a[enumC13830i.ordinal()]) {
            case 1:
                return new fi0();
            case 2:
                return new C5811b(c5810a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0005\u0007\u0007\u001b", new Object[]{"bitField0_", "selector_", "oauth_", "allowWithoutCredential_", "requirements_", yh0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<fi0> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (fi0.class) {
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

    public static C5811b newBuilder(fi0 fi0Var) {
        return DEFAULT_INSTANCE.m23739o(fi0Var);
    }

    public static fi0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (fi0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static fi0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (fi0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static fi0 parseFrom(vj1 vj1Var) throws ce8 {
        return (fi0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequirements(int i, yh0 yh0Var) {
        yh0Var.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.add(i, yh0Var);
    }

    public static fi0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (fi0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static fi0 parseFrom(byte[] bArr) throws ce8 {
        return (fi0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static fi0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (fi0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static fi0 parseFrom(InputStream inputStream) throws IOException {
        return (fi0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static fi0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (fi0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static fi0 parseFrom(f72 f72Var) throws IOException {
        return (fi0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static fi0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (fi0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
