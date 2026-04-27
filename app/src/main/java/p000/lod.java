package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p000.hpi;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class lod extends v27<lod, C8920b> implements mod {
    private static final lod DEFAULT_INSTANCE;
    public static final int DEFAULT_LIMIT_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 12;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int FREE_TIER_FIELD_NUMBER = 7;
    public static final int MAX_LIMIT_FIELD_NUMBER = 4;
    public static final int METRIC_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile uhc<lod> PARSER = null;
    public static final int UNIT_FIELD_NUMBER = 9;
    public static final int VALUES_FIELD_NUMBER = 10;
    private long defaultLimit_;
    private long freeTier_;
    private long maxLimit_;
    private ss9<String, Long> values_ = ss9.emptyMapField();
    private String name_ = "";
    private String description_ = "";
    private String duration_ = "";
    private String metric_ = "";
    private String unit_ = "";
    private String displayName_ = "";

    /* JADX INFO: renamed from: lod$a */
    public static /* synthetic */ class C8919a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58364a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f58364a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58364a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58364a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58364a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58364a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58364a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58364a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: lod$b */
    public static final class C8920b extends v27.AbstractC13823b<lod, C8920b> implements mod {
        public /* synthetic */ C8920b(C8919a c8919a) {
            this();
        }

        public C8920b clearDefaultLimit() {
            m23743e();
            ((lod) this.f89756b).clearDefaultLimit();
            return this;
        }

        public C8920b clearDescription() {
            m23743e();
            ((lod) this.f89756b).clearDescription();
            return this;
        }

        public C8920b clearDisplayName() {
            m23743e();
            ((lod) this.f89756b).clearDisplayName();
            return this;
        }

        public C8920b clearDuration() {
            m23743e();
            ((lod) this.f89756b).clearDuration();
            return this;
        }

        public C8920b clearFreeTier() {
            m23743e();
            ((lod) this.f89756b).clearFreeTier();
            return this;
        }

        public C8920b clearMaxLimit() {
            m23743e();
            ((lod) this.f89756b).clearMaxLimit();
            return this;
        }

        public C8920b clearMetric() {
            m23743e();
            ((lod) this.f89756b).clearMetric();
            return this;
        }

        public C8920b clearName() {
            m23743e();
            ((lod) this.f89756b).clearName();
            return this;
        }

        public C8920b clearUnit() {
            m23743e();
            ((lod) this.f89756b).clearUnit();
            return this;
        }

        public C8920b clearValues() {
            m23743e();
            ((lod) this.f89756b).getMutableValuesMap().clear();
            return this;
        }

        @Override // p000.mod
        public boolean containsValues(String str) {
            str.getClass();
            return ((lod) this.f89756b).getValuesMap().containsKey(str);
        }

        @Override // p000.mod
        public long getDefaultLimit() {
            return ((lod) this.f89756b).getDefaultLimit();
        }

        @Override // p000.mod
        public String getDescription() {
            return ((lod) this.f89756b).getDescription();
        }

        @Override // p000.mod
        public vj1 getDescriptionBytes() {
            return ((lod) this.f89756b).getDescriptionBytes();
        }

        @Override // p000.mod
        public String getDisplayName() {
            return ((lod) this.f89756b).getDisplayName();
        }

        @Override // p000.mod
        public vj1 getDisplayNameBytes() {
            return ((lod) this.f89756b).getDisplayNameBytes();
        }

        @Override // p000.mod
        public String getDuration() {
            return ((lod) this.f89756b).getDuration();
        }

        @Override // p000.mod
        public vj1 getDurationBytes() {
            return ((lod) this.f89756b).getDurationBytes();
        }

        @Override // p000.mod
        public long getFreeTier() {
            return ((lod) this.f89756b).getFreeTier();
        }

        @Override // p000.mod
        public long getMaxLimit() {
            return ((lod) this.f89756b).getMaxLimit();
        }

        @Override // p000.mod
        public String getMetric() {
            return ((lod) this.f89756b).getMetric();
        }

        @Override // p000.mod
        public vj1 getMetricBytes() {
            return ((lod) this.f89756b).getMetricBytes();
        }

        @Override // p000.mod
        public String getName() {
            return ((lod) this.f89756b).getName();
        }

        @Override // p000.mod
        public vj1 getNameBytes() {
            return ((lod) this.f89756b).getNameBytes();
        }

        @Override // p000.mod
        public String getUnit() {
            return ((lod) this.f89756b).getUnit();
        }

        @Override // p000.mod
        public vj1 getUnitBytes() {
            return ((lod) this.f89756b).getUnitBytes();
        }

        @Override // p000.mod
        @Deprecated
        public Map<String, Long> getValues() {
            return getValuesMap();
        }

        @Override // p000.mod
        public int getValuesCount() {
            return ((lod) this.f89756b).getValuesMap().size();
        }

        @Override // p000.mod
        public Map<String, Long> getValuesMap() {
            return Collections.unmodifiableMap(((lod) this.f89756b).getValuesMap());
        }

        @Override // p000.mod
        public long getValuesOrDefault(String str, long j) {
            str.getClass();
            Map<String, Long> valuesMap = ((lod) this.f89756b).getValuesMap();
            return valuesMap.containsKey(str) ? valuesMap.get(str).longValue() : j;
        }

        @Override // p000.mod
        public long getValuesOrThrow(String str) {
            str.getClass();
            Map<String, Long> valuesMap = ((lod) this.f89756b).getValuesMap();
            if (valuesMap.containsKey(str)) {
                return valuesMap.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        public C8920b putAllValues(Map<String, Long> map) {
            m23743e();
            ((lod) this.f89756b).getMutableValuesMap().putAll(map);
            return this;
        }

        public C8920b putValues(String str, long j) {
            str.getClass();
            m23743e();
            ((lod) this.f89756b).getMutableValuesMap().put(str, Long.valueOf(j));
            return this;
        }

        public C8920b removeValues(String str) {
            str.getClass();
            m23743e();
            ((lod) this.f89756b).getMutableValuesMap().remove(str);
            return this;
        }

        public C8920b setDefaultLimit(long j) {
            m23743e();
            ((lod) this.f89756b).setDefaultLimit(j);
            return this;
        }

        public C8920b setDescription(String str) {
            m23743e();
            ((lod) this.f89756b).setDescription(str);
            return this;
        }

        public C8920b setDescriptionBytes(vj1 vj1Var) {
            m23743e();
            ((lod) this.f89756b).setDescriptionBytes(vj1Var);
            return this;
        }

        public C8920b setDisplayName(String str) {
            m23743e();
            ((lod) this.f89756b).setDisplayName(str);
            return this;
        }

        public C8920b setDisplayNameBytes(vj1 vj1Var) {
            m23743e();
            ((lod) this.f89756b).setDisplayNameBytes(vj1Var);
            return this;
        }

        public C8920b setDuration(String str) {
            m23743e();
            ((lod) this.f89756b).setDuration(str);
            return this;
        }

        public C8920b setDurationBytes(vj1 vj1Var) {
            m23743e();
            ((lod) this.f89756b).setDurationBytes(vj1Var);
            return this;
        }

        public C8920b setFreeTier(long j) {
            m23743e();
            ((lod) this.f89756b).setFreeTier(j);
            return this;
        }

        public C8920b setMaxLimit(long j) {
            m23743e();
            ((lod) this.f89756b).setMaxLimit(j);
            return this;
        }

        public C8920b setMetric(String str) {
            m23743e();
            ((lod) this.f89756b).setMetric(str);
            return this;
        }

        public C8920b setMetricBytes(vj1 vj1Var) {
            m23743e();
            ((lod) this.f89756b).setMetricBytes(vj1Var);
            return this;
        }

        public C8920b setName(String str) {
            m23743e();
            ((lod) this.f89756b).setName(str);
            return this;
        }

        public C8920b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((lod) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C8920b setUnit(String str) {
            m23743e();
            ((lod) this.f89756b).setUnit(str);
            return this;
        }

        public C8920b setUnitBytes(vj1 vj1Var) {
            m23743e();
            ((lod) this.f89756b).setUnitBytes(vj1Var);
            return this;
        }

        private C8920b() {
            super(lod.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: lod$c */
    public static final class C8921c {

        /* JADX INFO: renamed from: a */
        public static final os9<String, Long> f58365a = os9.newDefaultInstance(hpi.EnumC6968b.f44485L, "", hpi.EnumC6968b.f44498e, 0L);

        private C8921c() {
        }
    }

    static {
        lod lodVar = new lod();
        DEFAULT_INSTANCE = lodVar;
        v27.m23715h0(lod.class, lodVar);
    }

    private lod() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultLimit() {
        this.defaultLimit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = getDefaultInstance().getDuration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeTier() {
        this.freeTier_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxLimit() {
        this.maxLimit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetric() {
        this.metric_ = getDefaultInstance().getMetric();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = getDefaultInstance().getUnit();
    }

    public static lod getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableValuesMap() {
        return internalGetMutableValues();
    }

    private ss9<String, Long> internalGetMutableValues() {
        if (!this.values_.isMutable()) {
            this.values_ = this.values_.mutableCopy();
        }
        return this.values_;
    }

    private ss9<String, Long> internalGetValues() {
        return this.values_;
    }

    public static C8920b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static lod parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (lod) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static lod parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (lod) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<lod> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultLimit(long j) {
        this.defaultLimit_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.description_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayName(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayNameBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.displayName_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(String str) {
        str.getClass();
        this.duration_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.duration_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeTier(long j) {
        this.freeTier_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxLimit(long j) {
        this.maxLimit_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetric(String str) {
        str.getClass();
        this.metric_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.metric_ = vj1Var.toStringUtf8();
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
    public void setUnit(String str) {
        str.getClass();
        this.unit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.unit_ = vj1Var.toStringUtf8();
    }

    @Override // p000.mod
    public boolean containsValues(String str) {
        str.getClass();
        return internalGetValues().containsKey(str);
    }

    @Override // p000.mod
    public long getDefaultLimit() {
        return this.defaultLimit_;
    }

    @Override // p000.mod
    public String getDescription() {
        return this.description_;
    }

    @Override // p000.mod
    public vj1 getDescriptionBytes() {
        return vj1.copyFromUtf8(this.description_);
    }

    @Override // p000.mod
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override // p000.mod
    public vj1 getDisplayNameBytes() {
        return vj1.copyFromUtf8(this.displayName_);
    }

    @Override // p000.mod
    public String getDuration() {
        return this.duration_;
    }

    @Override // p000.mod
    public vj1 getDurationBytes() {
        return vj1.copyFromUtf8(this.duration_);
    }

    @Override // p000.mod
    public long getFreeTier() {
        return this.freeTier_;
    }

    @Override // p000.mod
    public long getMaxLimit() {
        return this.maxLimit_;
    }

    @Override // p000.mod
    public String getMetric() {
        return this.metric_;
    }

    @Override // p000.mod
    public vj1 getMetricBytes() {
        return vj1.copyFromUtf8(this.metric_);
    }

    @Override // p000.mod
    public String getName() {
        return this.name_;
    }

    @Override // p000.mod
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.mod
    public String getUnit() {
        return this.unit_;
    }

    @Override // p000.mod
    public vj1 getUnitBytes() {
        return vj1.copyFromUtf8(this.unit_);
    }

    @Override // p000.mod
    @Deprecated
    public Map<String, Long> getValues() {
        return getValuesMap();
    }

    @Override // p000.mod
    public int getValuesCount() {
        return internalGetValues().size();
    }

    @Override // p000.mod
    public Map<String, Long> getValuesMap() {
        return Collections.unmodifiableMap(internalGetValues());
    }

    @Override // p000.mod
    public long getValuesOrDefault(String str, long j) {
        str.getClass();
        ss9<String, Long> ss9VarInternalGetValues = internalGetValues();
        return ss9VarInternalGetValues.containsKey(str) ? ss9VarInternalGetValues.get(str).longValue() : j;
    }

    @Override // p000.mod
    public long getValuesOrThrow(String str) {
        str.getClass();
        ss9<String, Long> ss9VarInternalGetValues = internalGetValues();
        if (ss9VarInternalGetValues.containsKey(str)) {
            return ss9VarInternalGetValues.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8919a c8919a = null;
        switch (C8919a.f58364a[enumC13830i.ordinal()]) {
            case 1:
                return new lod();
            case 2:
                return new C8920b(c8919a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0002\f\n\u0001\u0000\u0000\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ\u0006Ȉ\u0007\u0002\bȈ\tȈ\n2\fȈ", new Object[]{"description_", "defaultLimit_", "maxLimit_", "duration_", "name_", "freeTier_", "metric_", "unit_", "values_", C8921c.f58365a, "displayName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<lod> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (lod.class) {
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

    public static C8920b newBuilder(lod lodVar) {
        return DEFAULT_INSTANCE.m23739o(lodVar);
    }

    public static lod parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (lod) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static lod parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (lod) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static lod parseFrom(vj1 vj1Var) throws ce8 {
        return (lod) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static lod parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (lod) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static lod parseFrom(byte[] bArr) throws ce8 {
        return (lod) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static lod parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (lod) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static lod parseFrom(InputStream inputStream) throws IOException {
        return (lod) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static lod parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (lod) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static lod parseFrom(f72 f72Var) throws IOException {
        return (lod) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static lod parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (lod) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
