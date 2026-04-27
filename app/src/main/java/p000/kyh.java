package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.nyh;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class kyh extends v27<kyh, C8560b> implements lyh {
    private static final kyh DEFAULT_INSTANCE;
    private static volatile uhc<kyh> PARSER = null;
    public static final int PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7;
    public static final int REQUIREMENTS_FIELD_NUMBER = 1;
    public static final int RULES_FIELD_NUMBER = 6;
    private w98.InterfaceC14504k<String> requirements_ = v27.m23722x();
    private w98.InterfaceC14504k<nyh> rules_ = v27.m23722x();
    private String producerNotificationChannel_ = "";

    /* JADX INFO: renamed from: kyh$a */
    public static /* synthetic */ class C8559a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55711a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f55711a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55711a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55711a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55711a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55711a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55711a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55711a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: kyh$b */
    public static final class C8560b extends v27.AbstractC13823b<kyh, C8560b> implements lyh {
        public /* synthetic */ C8560b(C8559a c8559a) {
            this();
        }

        public C8560b addAllRequirements(Iterable<String> iterable) {
            m23743e();
            ((kyh) this.f89756b).addAllRequirements(iterable);
            return this;
        }

        public C8560b addAllRules(Iterable<? extends nyh> iterable) {
            m23743e();
            ((kyh) this.f89756b).addAllRules(iterable);
            return this;
        }

        public C8560b addRequirements(String str) {
            m23743e();
            ((kyh) this.f89756b).addRequirements(str);
            return this;
        }

        public C8560b addRequirementsBytes(vj1 vj1Var) {
            m23743e();
            ((kyh) this.f89756b).addRequirementsBytes(vj1Var);
            return this;
        }

        public C8560b addRules(nyh nyhVar) {
            m23743e();
            ((kyh) this.f89756b).addRules(nyhVar);
            return this;
        }

        public C8560b clearProducerNotificationChannel() {
            m23743e();
            ((kyh) this.f89756b).clearProducerNotificationChannel();
            return this;
        }

        public C8560b clearRequirements() {
            m23743e();
            ((kyh) this.f89756b).clearRequirements();
            return this;
        }

        public C8560b clearRules() {
            m23743e();
            ((kyh) this.f89756b).clearRules();
            return this;
        }

        @Override // p000.lyh
        public String getProducerNotificationChannel() {
            return ((kyh) this.f89756b).getProducerNotificationChannel();
        }

        @Override // p000.lyh
        public vj1 getProducerNotificationChannelBytes() {
            return ((kyh) this.f89756b).getProducerNotificationChannelBytes();
        }

        @Override // p000.lyh
        public String getRequirements(int i) {
            return ((kyh) this.f89756b).getRequirements(i);
        }

        @Override // p000.lyh
        public vj1 getRequirementsBytes(int i) {
            return ((kyh) this.f89756b).getRequirementsBytes(i);
        }

        @Override // p000.lyh
        public int getRequirementsCount() {
            return ((kyh) this.f89756b).getRequirementsCount();
        }

        @Override // p000.lyh
        public List<String> getRequirementsList() {
            return Collections.unmodifiableList(((kyh) this.f89756b).getRequirementsList());
        }

        @Override // p000.lyh
        public nyh getRules(int i) {
            return ((kyh) this.f89756b).getRules(i);
        }

        @Override // p000.lyh
        public int getRulesCount() {
            return ((kyh) this.f89756b).getRulesCount();
        }

        @Override // p000.lyh
        public List<nyh> getRulesList() {
            return Collections.unmodifiableList(((kyh) this.f89756b).getRulesList());
        }

        public C8560b removeRules(int i) {
            m23743e();
            ((kyh) this.f89756b).removeRules(i);
            return this;
        }

        public C8560b setProducerNotificationChannel(String str) {
            m23743e();
            ((kyh) this.f89756b).setProducerNotificationChannel(str);
            return this;
        }

        public C8560b setProducerNotificationChannelBytes(vj1 vj1Var) {
            m23743e();
            ((kyh) this.f89756b).setProducerNotificationChannelBytes(vj1Var);
            return this;
        }

        public C8560b setRequirements(int i, String str) {
            m23743e();
            ((kyh) this.f89756b).setRequirements(i, str);
            return this;
        }

        public C8560b setRules(int i, nyh nyhVar) {
            m23743e();
            ((kyh) this.f89756b).setRules(i, nyhVar);
            return this;
        }

        private C8560b() {
            super(kyh.DEFAULT_INSTANCE);
        }

        public C8560b addRules(int i, nyh nyhVar) {
            m23743e();
            ((kyh) this.f89756b).addRules(i, nyhVar);
            return this;
        }

        public C8560b setRules(int i, nyh.C10121b c10121b) {
            m23743e();
            ((kyh) this.f89756b).setRules(i, c10121b.build());
            return this;
        }

        public C8560b addRules(nyh.C10121b c10121b) {
            m23743e();
            ((kyh) this.f89756b).addRules(c10121b.build());
            return this;
        }

        public C8560b addRules(int i, nyh.C10121b c10121b) {
            m23743e();
            ((kyh) this.f89756b).addRules(i, c10121b.build());
            return this;
        }
    }

    static {
        kyh kyhVar = new kyh();
        DEFAULT_INSTANCE = kyhVar;
        v27.m23715h0(kyh.class, kyhVar);
    }

    private kyh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequirements(Iterable<String> iterable) {
        ensureRequirementsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.requirements_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends nyh> iterable) {
        ensureRulesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequirements(String str) {
        str.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequirementsBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensureRequirementsIsMutable();
        this.requirements_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(nyh nyhVar) {
        nyhVar.getClass();
        ensureRulesIsMutable();
        this.rules_.add(nyhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerNotificationChannel() {
        this.producerNotificationChannel_ = getDefaultInstance().getProducerNotificationChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequirements() {
        this.requirements_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = v27.m23722x();
    }

    private void ensureRequirementsIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.requirements_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.requirements_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureRulesIsMutable() {
        w98.InterfaceC14504k<nyh> interfaceC14504k = this.rules_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.rules_ = v27.m23698P(interfaceC14504k);
    }

    public static kyh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8560b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static kyh parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (kyh) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static kyh parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (kyh) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<kyh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerNotificationChannel(String str) {
        str.getClass();
        this.producerNotificationChannel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerNotificationChannelBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.producerNotificationChannel_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequirements(int i, String str) {
        str.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i, nyh nyhVar) {
        nyhVar.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, nyhVar);
    }

    @Override // p000.lyh
    public String getProducerNotificationChannel() {
        return this.producerNotificationChannel_;
    }

    @Override // p000.lyh
    public vj1 getProducerNotificationChannelBytes() {
        return vj1.copyFromUtf8(this.producerNotificationChannel_);
    }

    @Override // p000.lyh
    public String getRequirements(int i) {
        return this.requirements_.get(i);
    }

    @Override // p000.lyh
    public vj1 getRequirementsBytes(int i) {
        return vj1.copyFromUtf8(this.requirements_.get(i));
    }

    @Override // p000.lyh
    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    @Override // p000.lyh
    public List<String> getRequirementsList() {
        return this.requirements_;
    }

    @Override // p000.lyh
    public nyh getRules(int i) {
        return this.rules_.get(i);
    }

    @Override // p000.lyh
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // p000.lyh
    public List<nyh> getRulesList() {
        return this.rules_;
    }

    public oyh getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public List<? extends oyh> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8559a c8559a = null;
        switch (C8559a.f55711a[enumC13830i.ordinal()]) {
            case 1:
                return new kyh();
            case 2:
                return new C8560b(c8559a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0002\u0000\u0001Ț\u0006\u001b\u0007Ȉ", new Object[]{"requirements_", "rules_", nyh.class, "producerNotificationChannel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<kyh> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (kyh.class) {
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

    public static C8560b newBuilder(kyh kyhVar) {
        return DEFAULT_INSTANCE.m23739o(kyhVar);
    }

    public static kyh parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (kyh) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static kyh parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (kyh) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static kyh parseFrom(vj1 vj1Var) throws ce8 {
        return (kyh) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i, nyh nyhVar) {
        nyhVar.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, nyhVar);
    }

    public static kyh parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (kyh) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static kyh parseFrom(byte[] bArr) throws ce8 {
        return (kyh) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static kyh parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (kyh) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static kyh parseFrom(InputStream inputStream) throws IOException {
        return (kyh) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static kyh parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (kyh) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static kyh parseFrom(f72 f72Var) throws IOException {
        return (kyh) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static kyh parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (kyh) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
