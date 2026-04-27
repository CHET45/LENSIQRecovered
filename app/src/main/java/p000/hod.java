package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.hva;
import p000.lod;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class hod extends v27<hod, C6959b> implements nod {
    private static final hod DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static volatile uhc<hod> PARSER;
    private w98.InterfaceC14504k<lod> limits_ = v27.m23722x();
    private w98.InterfaceC14504k<hva> metricRules_ = v27.m23722x();

    /* JADX INFO: renamed from: hod$a */
    public static /* synthetic */ class C6958a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44415a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f44415a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44415a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44415a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44415a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44415a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44415a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44415a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: hod$b */
    public static final class C6959b extends v27.AbstractC13823b<hod, C6959b> implements nod {
        public /* synthetic */ C6959b(C6958a c6958a) {
            this();
        }

        public C6959b addAllLimits(Iterable<? extends lod> iterable) {
            m23743e();
            ((hod) this.f89756b).addAllLimits(iterable);
            return this;
        }

        public C6959b addAllMetricRules(Iterable<? extends hva> iterable) {
            m23743e();
            ((hod) this.f89756b).addAllMetricRules(iterable);
            return this;
        }

        public C6959b addLimits(lod lodVar) {
            m23743e();
            ((hod) this.f89756b).addLimits(lodVar);
            return this;
        }

        public C6959b addMetricRules(hva hvaVar) {
            m23743e();
            ((hod) this.f89756b).addMetricRules(hvaVar);
            return this;
        }

        public C6959b clearLimits() {
            m23743e();
            ((hod) this.f89756b).clearLimits();
            return this;
        }

        public C6959b clearMetricRules() {
            m23743e();
            ((hod) this.f89756b).clearMetricRules();
            return this;
        }

        @Override // p000.nod
        public lod getLimits(int i) {
            return ((hod) this.f89756b).getLimits(i);
        }

        @Override // p000.nod
        public int getLimitsCount() {
            return ((hod) this.f89756b).getLimitsCount();
        }

        @Override // p000.nod
        public List<lod> getLimitsList() {
            return Collections.unmodifiableList(((hod) this.f89756b).getLimitsList());
        }

        @Override // p000.nod
        public hva getMetricRules(int i) {
            return ((hod) this.f89756b).getMetricRules(i);
        }

        @Override // p000.nod
        public int getMetricRulesCount() {
            return ((hod) this.f89756b).getMetricRulesCount();
        }

        @Override // p000.nod
        public List<hva> getMetricRulesList() {
            return Collections.unmodifiableList(((hod) this.f89756b).getMetricRulesList());
        }

        public C6959b removeLimits(int i) {
            m23743e();
            ((hod) this.f89756b).removeLimits(i);
            return this;
        }

        public C6959b removeMetricRules(int i) {
            m23743e();
            ((hod) this.f89756b).removeMetricRules(i);
            return this;
        }

        public C6959b setLimits(int i, lod lodVar) {
            m23743e();
            ((hod) this.f89756b).setLimits(i, lodVar);
            return this;
        }

        public C6959b setMetricRules(int i, hva hvaVar) {
            m23743e();
            ((hod) this.f89756b).setMetricRules(i, hvaVar);
            return this;
        }

        private C6959b() {
            super(hod.DEFAULT_INSTANCE);
        }

        public C6959b addLimits(int i, lod lodVar) {
            m23743e();
            ((hod) this.f89756b).addLimits(i, lodVar);
            return this;
        }

        public C6959b addMetricRules(int i, hva hvaVar) {
            m23743e();
            ((hod) this.f89756b).addMetricRules(i, hvaVar);
            return this;
        }

        public C6959b setLimits(int i, lod.C8920b c8920b) {
            m23743e();
            ((hod) this.f89756b).setLimits(i, c8920b.build());
            return this;
        }

        public C6959b setMetricRules(int i, hva.C7029b c7029b) {
            m23743e();
            ((hod) this.f89756b).setMetricRules(i, c7029b.build());
            return this;
        }

        public C6959b addLimits(lod.C8920b c8920b) {
            m23743e();
            ((hod) this.f89756b).addLimits(c8920b.build());
            return this;
        }

        public C6959b addMetricRules(hva.C7029b c7029b) {
            m23743e();
            ((hod) this.f89756b).addMetricRules(c7029b.build());
            return this;
        }

        public C6959b addLimits(int i, lod.C8920b c8920b) {
            m23743e();
            ((hod) this.f89756b).addLimits(i, c8920b.build());
            return this;
        }

        public C6959b addMetricRules(int i, hva.C7029b c7029b) {
            m23743e();
            ((hod) this.f89756b).addMetricRules(i, c7029b.build());
            return this;
        }
    }

    static {
        hod hodVar = new hod();
        DEFAULT_INSTANCE = hodVar;
        v27.m23715h0(hod.class, hodVar);
    }

    private hod() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLimits(Iterable<? extends lod> iterable) {
        ensureLimitsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.limits_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetricRules(Iterable<? extends hva> iterable) {
        ensureMetricRulesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.metricRules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLimits(lod lodVar) {
        lodVar.getClass();
        ensureLimitsIsMutable();
        this.limits_.add(lodVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetricRules(hva hvaVar) {
        hvaVar.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.add(hvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimits() {
        this.limits_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetricRules() {
        this.metricRules_ = v27.m23722x();
    }

    private void ensureLimitsIsMutable() {
        w98.InterfaceC14504k<lod> interfaceC14504k = this.limits_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.limits_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureMetricRulesIsMutable() {
        w98.InterfaceC14504k<hva> interfaceC14504k = this.metricRules_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.metricRules_ = v27.m23698P(interfaceC14504k);
    }

    public static hod getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6959b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static hod parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (hod) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static hod parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (hod) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<hod> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLimits(int i) {
        ensureLimitsIsMutable();
        this.limits_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetricRules(int i) {
        ensureMetricRulesIsMutable();
        this.metricRules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimits(int i, lod lodVar) {
        lodVar.getClass();
        ensureLimitsIsMutable();
        this.limits_.set(i, lodVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricRules(int i, hva hvaVar) {
        hvaVar.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.set(i, hvaVar);
    }

    @Override // p000.nod
    public lod getLimits(int i) {
        return this.limits_.get(i);
    }

    @Override // p000.nod
    public int getLimitsCount() {
        return this.limits_.size();
    }

    @Override // p000.nod
    public List<lod> getLimitsList() {
        return this.limits_;
    }

    public mod getLimitsOrBuilder(int i) {
        return this.limits_.get(i);
    }

    public List<? extends mod> getLimitsOrBuilderList() {
        return this.limits_;
    }

    @Override // p000.nod
    public hva getMetricRules(int i) {
        return this.metricRules_.get(i);
    }

    @Override // p000.nod
    public int getMetricRulesCount() {
        return this.metricRules_.size();
    }

    @Override // p000.nod
    public List<hva> getMetricRulesList() {
        return this.metricRules_;
    }

    public iva getMetricRulesOrBuilder(int i) {
        return this.metricRules_.get(i);
    }

    public List<? extends iva> getMetricRulesOrBuilderList() {
        return this.metricRules_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C6958a c6958a = null;
        switch (C6958a.f44415a[enumC13830i.ordinal()]) {
            case 1:
                return new hod();
            case 2:
                return new C6959b(c6958a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"limits_", lod.class, "metricRules_", hva.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<hod> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (hod.class) {
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

    public static C6959b newBuilder(hod hodVar) {
        return DEFAULT_INSTANCE.m23739o(hodVar);
    }

    public static hod parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (hod) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static hod parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (hod) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static hod parseFrom(vj1 vj1Var) throws ce8 {
        return (hod) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLimits(int i, lod lodVar) {
        lodVar.getClass();
        ensureLimitsIsMutable();
        this.limits_.add(i, lodVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetricRules(int i, hva hvaVar) {
        hvaVar.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.add(i, hvaVar);
    }

    public static hod parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (hod) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static hod parseFrom(byte[] bArr) throws ce8 {
        return (hod) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static hod parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (hod) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static hod parseFrom(InputStream inputStream) throws IOException {
        return (hod) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static hod parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (hod) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static hod parseFrom(f72 f72Var) throws IOException {
        return (hod) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static hod parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (hod) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
