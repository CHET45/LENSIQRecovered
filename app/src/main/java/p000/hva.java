package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p000.hpi;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class hva extends v27<hva, C7029b> implements iva {
    private static final hva DEFAULT_INSTANCE;
    public static final int METRIC_COSTS_FIELD_NUMBER = 2;
    private static volatile uhc<hva> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private ss9<String, Long> metricCosts_ = ss9.emptyMapField();
    private String selector_ = "";

    /* JADX INFO: renamed from: hva$a */
    public static /* synthetic */ class C7028a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44949a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f44949a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44949a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44949a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44949a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44949a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44949a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44949a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: hva$b */
    public static final class C7029b extends v27.AbstractC13823b<hva, C7029b> implements iva {
        public /* synthetic */ C7029b(C7028a c7028a) {
            this();
        }

        public C7029b clearMetricCosts() {
            m23743e();
            ((hva) this.f89756b).getMutableMetricCostsMap().clear();
            return this;
        }

        public C7029b clearSelector() {
            m23743e();
            ((hva) this.f89756b).clearSelector();
            return this;
        }

        @Override // p000.iva
        public boolean containsMetricCosts(String str) {
            str.getClass();
            return ((hva) this.f89756b).getMetricCostsMap().containsKey(str);
        }

        @Override // p000.iva
        @Deprecated
        public Map<String, Long> getMetricCosts() {
            return getMetricCostsMap();
        }

        @Override // p000.iva
        public int getMetricCostsCount() {
            return ((hva) this.f89756b).getMetricCostsMap().size();
        }

        @Override // p000.iva
        public Map<String, Long> getMetricCostsMap() {
            return Collections.unmodifiableMap(((hva) this.f89756b).getMetricCostsMap());
        }

        @Override // p000.iva
        public long getMetricCostsOrDefault(String str, long j) {
            str.getClass();
            Map<String, Long> metricCostsMap = ((hva) this.f89756b).getMetricCostsMap();
            return metricCostsMap.containsKey(str) ? metricCostsMap.get(str).longValue() : j;
        }

        @Override // p000.iva
        public long getMetricCostsOrThrow(String str) {
            str.getClass();
            Map<String, Long> metricCostsMap = ((hva) this.f89756b).getMetricCostsMap();
            if (metricCostsMap.containsKey(str)) {
                return metricCostsMap.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // p000.iva
        public String getSelector() {
            return ((hva) this.f89756b).getSelector();
        }

        @Override // p000.iva
        public vj1 getSelectorBytes() {
            return ((hva) this.f89756b).getSelectorBytes();
        }

        public C7029b putAllMetricCosts(Map<String, Long> map) {
            m23743e();
            ((hva) this.f89756b).getMutableMetricCostsMap().putAll(map);
            return this;
        }

        public C7029b putMetricCosts(String str, long j) {
            str.getClass();
            m23743e();
            ((hva) this.f89756b).getMutableMetricCostsMap().put(str, Long.valueOf(j));
            return this;
        }

        public C7029b removeMetricCosts(String str) {
            str.getClass();
            m23743e();
            ((hva) this.f89756b).getMutableMetricCostsMap().remove(str);
            return this;
        }

        public C7029b setSelector(String str) {
            m23743e();
            ((hva) this.f89756b).setSelector(str);
            return this;
        }

        public C7029b setSelectorBytes(vj1 vj1Var) {
            m23743e();
            ((hva) this.f89756b).setSelectorBytes(vj1Var);
            return this;
        }

        private C7029b() {
            super(hva.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: hva$c */
    public static final class C7030c {

        /* JADX INFO: renamed from: a */
        public static final os9<String, Long> f44950a = os9.newDefaultInstance(hpi.EnumC6968b.f44485L, "", hpi.EnumC6968b.f44498e, 0L);

        private C7030c() {
        }
    }

    static {
        hva hvaVar = new hva();
        DEFAULT_INSTANCE = hvaVar;
        v27.m23715h0(hva.class, hvaVar);
    }

    private hva() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    public static hva getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableMetricCostsMap() {
        return internalGetMutableMetricCosts();
    }

    private ss9<String, Long> internalGetMetricCosts() {
        return this.metricCosts_;
    }

    private ss9<String, Long> internalGetMutableMetricCosts() {
        if (!this.metricCosts_.isMutable()) {
            this.metricCosts_ = this.metricCosts_.mutableCopy();
        }
        return this.metricCosts_;
    }

    public static C7029b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static hva parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (hva) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static hva parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (hva) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<hva> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    @Override // p000.iva
    public boolean containsMetricCosts(String str) {
        str.getClass();
        return internalGetMetricCosts().containsKey(str);
    }

    @Override // p000.iva
    @Deprecated
    public Map<String, Long> getMetricCosts() {
        return getMetricCostsMap();
    }

    @Override // p000.iva
    public int getMetricCostsCount() {
        return internalGetMetricCosts().size();
    }

    @Override // p000.iva
    public Map<String, Long> getMetricCostsMap() {
        return Collections.unmodifiableMap(internalGetMetricCosts());
    }

    @Override // p000.iva
    public long getMetricCostsOrDefault(String str, long j) {
        str.getClass();
        ss9<String, Long> ss9VarInternalGetMetricCosts = internalGetMetricCosts();
        return ss9VarInternalGetMetricCosts.containsKey(str) ? ss9VarInternalGetMetricCosts.get(str).longValue() : j;
    }

    @Override // p000.iva
    public long getMetricCostsOrThrow(String str) {
        str.getClass();
        ss9<String, Long> ss9VarInternalGetMetricCosts = internalGetMetricCosts();
        if (ss9VarInternalGetMetricCosts.containsKey(str)) {
            return ss9VarInternalGetMetricCosts.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.iva
    public String getSelector() {
        return this.selector_;
    }

    @Override // p000.iva
    public vj1 getSelectorBytes() {
        return vj1.copyFromUtf8(this.selector_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C7028a c7028a = null;
        switch (C7028a.f44949a[enumC13830i.ordinal()]) {
            case 1:
                return new hva();
            case 2:
                return new C7029b(c7028a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"selector_", "metricCosts_", C7030c.f44950a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<hva> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (hva.class) {
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

    public static C7029b newBuilder(hva hvaVar) {
        return DEFAULT_INSTANCE.m23739o(hvaVar);
    }

    public static hva parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (hva) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static hva parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (hva) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static hva parseFrom(vj1 vj1Var) throws ce8 {
        return (hva) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static hva parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (hva) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static hva parseFrom(byte[] bArr) throws ce8 {
        return (hva) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static hva parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (hva) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static hva parseFrom(InputStream inputStream) throws IOException {
        return (hva) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static hva parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (hva) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static hva parseFrom(f72 f72Var) throws IOException {
        return (hva) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static hva parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (hva) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
