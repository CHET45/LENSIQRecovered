package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.at4;
import p000.ot8;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class dva extends v27<dva, C4968b> implements eva {
    private static final dva DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<dva> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private int launchStage_;
    private C4969c metadata_;
    private int metricKind_;
    private int valueType_;
    private String name_ = "";
    private String type_ = "";
    private w98.InterfaceC14504k<ot8> labels_ = v27.m23722x();
    private String unit_ = "";
    private String description_ = "";
    private String displayName_ = "";

    /* JADX INFO: renamed from: dva$a */
    public static /* synthetic */ class C4967a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30989a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f30989a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30989a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30989a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30989a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30989a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30989a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30989a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: dva$b */
    public static final class C4968b extends v27.AbstractC13823b<dva, C4968b> implements eva {
        public /* synthetic */ C4968b(C4967a c4967a) {
            this();
        }

        public C4968b addAllLabels(Iterable<? extends ot8> iterable) {
            m23743e();
            ((dva) this.f89756b).addAllLabels(iterable);
            return this;
        }

        public C4968b addLabels(ot8 ot8Var) {
            m23743e();
            ((dva) this.f89756b).addLabels(ot8Var);
            return this;
        }

        public C4968b clearDescription() {
            m23743e();
            ((dva) this.f89756b).clearDescription();
            return this;
        }

        public C4968b clearDisplayName() {
            m23743e();
            ((dva) this.f89756b).clearDisplayName();
            return this;
        }

        public C4968b clearLabels() {
            m23743e();
            ((dva) this.f89756b).clearLabels();
            return this;
        }

        public C4968b clearLaunchStage() {
            m23743e();
            ((dva) this.f89756b).clearLaunchStage();
            return this;
        }

        public C4968b clearMetadata() {
            m23743e();
            ((dva) this.f89756b).clearMetadata();
            return this;
        }

        public C4968b clearMetricKind() {
            m23743e();
            ((dva) this.f89756b).clearMetricKind();
            return this;
        }

        public C4968b clearName() {
            m23743e();
            ((dva) this.f89756b).clearName();
            return this;
        }

        public C4968b clearType() {
            m23743e();
            ((dva) this.f89756b).clearType();
            return this;
        }

        public C4968b clearUnit() {
            m23743e();
            ((dva) this.f89756b).clearUnit();
            return this;
        }

        public C4968b clearValueType() {
            m23743e();
            ((dva) this.f89756b).clearValueType();
            return this;
        }

        @Override // p000.eva
        public String getDescription() {
            return ((dva) this.f89756b).getDescription();
        }

        @Override // p000.eva
        public vj1 getDescriptionBytes() {
            return ((dva) this.f89756b).getDescriptionBytes();
        }

        @Override // p000.eva
        public String getDisplayName() {
            return ((dva) this.f89756b).getDisplayName();
        }

        @Override // p000.eva
        public vj1 getDisplayNameBytes() {
            return ((dva) this.f89756b).getDisplayNameBytes();
        }

        @Override // p000.eva
        public ot8 getLabels(int i) {
            return ((dva) this.f89756b).getLabels(i);
        }

        @Override // p000.eva
        public int getLabelsCount() {
            return ((dva) this.f89756b).getLabelsCount();
        }

        @Override // p000.eva
        public List<ot8> getLabelsList() {
            return Collections.unmodifiableList(((dva) this.f89756b).getLabelsList());
        }

        @Override // p000.eva
        public qu8 getLaunchStage() {
            return ((dva) this.f89756b).getLaunchStage();
        }

        @Override // p000.eva
        public int getLaunchStageValue() {
            return ((dva) this.f89756b).getLaunchStageValue();
        }

        @Override // p000.eva
        public C4969c getMetadata() {
            return ((dva) this.f89756b).getMetadata();
        }

        @Override // p000.eva
        public EnumC4971e getMetricKind() {
            return ((dva) this.f89756b).getMetricKind();
        }

        @Override // p000.eva
        public int getMetricKindValue() {
            return ((dva) this.f89756b).getMetricKindValue();
        }

        @Override // p000.eva
        public String getName() {
            return ((dva) this.f89756b).getName();
        }

        @Override // p000.eva
        public vj1 getNameBytes() {
            return ((dva) this.f89756b).getNameBytes();
        }

        @Override // p000.eva
        public String getType() {
            return ((dva) this.f89756b).getType();
        }

        @Override // p000.eva
        public vj1 getTypeBytes() {
            return ((dva) this.f89756b).getTypeBytes();
        }

        @Override // p000.eva
        public String getUnit() {
            return ((dva) this.f89756b).getUnit();
        }

        @Override // p000.eva
        public vj1 getUnitBytes() {
            return ((dva) this.f89756b).getUnitBytes();
        }

        @Override // p000.eva
        public EnumC4972f getValueType() {
            return ((dva) this.f89756b).getValueType();
        }

        @Override // p000.eva
        public int getValueTypeValue() {
            return ((dva) this.f89756b).getValueTypeValue();
        }

        @Override // p000.eva
        public boolean hasMetadata() {
            return ((dva) this.f89756b).hasMetadata();
        }

        public C4968b mergeMetadata(C4969c c4969c) {
            m23743e();
            ((dva) this.f89756b).mergeMetadata(c4969c);
            return this;
        }

        public C4968b removeLabels(int i) {
            m23743e();
            ((dva) this.f89756b).removeLabels(i);
            return this;
        }

        public C4968b setDescription(String str) {
            m23743e();
            ((dva) this.f89756b).setDescription(str);
            return this;
        }

        public C4968b setDescriptionBytes(vj1 vj1Var) {
            m23743e();
            ((dva) this.f89756b).setDescriptionBytes(vj1Var);
            return this;
        }

        public C4968b setDisplayName(String str) {
            m23743e();
            ((dva) this.f89756b).setDisplayName(str);
            return this;
        }

        public C4968b setDisplayNameBytes(vj1 vj1Var) {
            m23743e();
            ((dva) this.f89756b).setDisplayNameBytes(vj1Var);
            return this;
        }

        public C4968b setLabels(int i, ot8 ot8Var) {
            m23743e();
            ((dva) this.f89756b).setLabels(i, ot8Var);
            return this;
        }

        public C4968b setLaunchStage(qu8 qu8Var) {
            m23743e();
            ((dva) this.f89756b).setLaunchStage(qu8Var);
            return this;
        }

        public C4968b setLaunchStageValue(int i) {
            m23743e();
            ((dva) this.f89756b).setLaunchStageValue(i);
            return this;
        }

        public C4968b setMetadata(C4969c c4969c) {
            m23743e();
            ((dva) this.f89756b).setMetadata(c4969c);
            return this;
        }

        public C4968b setMetricKind(EnumC4971e enumC4971e) {
            m23743e();
            ((dva) this.f89756b).setMetricKind(enumC4971e);
            return this;
        }

        public C4968b setMetricKindValue(int i) {
            m23743e();
            ((dva) this.f89756b).setMetricKindValue(i);
            return this;
        }

        public C4968b setName(String str) {
            m23743e();
            ((dva) this.f89756b).setName(str);
            return this;
        }

        public C4968b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((dva) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C4968b setType(String str) {
            m23743e();
            ((dva) this.f89756b).setType(str);
            return this;
        }

        public C4968b setTypeBytes(vj1 vj1Var) {
            m23743e();
            ((dva) this.f89756b).setTypeBytes(vj1Var);
            return this;
        }

        public C4968b setUnit(String str) {
            m23743e();
            ((dva) this.f89756b).setUnit(str);
            return this;
        }

        public C4968b setUnitBytes(vj1 vj1Var) {
            m23743e();
            ((dva) this.f89756b).setUnitBytes(vj1Var);
            return this;
        }

        public C4968b setValueType(EnumC4972f enumC4972f) {
            m23743e();
            ((dva) this.f89756b).setValueType(enumC4972f);
            return this;
        }

        public C4968b setValueTypeValue(int i) {
            m23743e();
            ((dva) this.f89756b).setValueTypeValue(i);
            return this;
        }

        private C4968b() {
            super(dva.DEFAULT_INSTANCE);
        }

        public C4968b addLabels(int i, ot8 ot8Var) {
            m23743e();
            ((dva) this.f89756b).addLabels(i, ot8Var);
            return this;
        }

        public C4968b setLabels(int i, ot8.C10651b c10651b) {
            m23743e();
            ((dva) this.f89756b).setLabels(i, c10651b.build());
            return this;
        }

        public C4968b setMetadata(C4969c.a aVar) {
            m23743e();
            ((dva) this.f89756b).setMetadata(aVar.build());
            return this;
        }

        public C4968b addLabels(ot8.C10651b c10651b) {
            m23743e();
            ((dva) this.f89756b).addLabels(c10651b.build());
            return this;
        }

        public C4968b addLabels(int i, ot8.C10651b c10651b) {
            m23743e();
            ((dva) this.f89756b).addLabels(i, c10651b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: dva$c */
    public static final class C4969c extends v27<C4969c, a> implements InterfaceC4970d {
        private static final C4969c DEFAULT_INSTANCE;
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        private static volatile uhc<C4969c> PARSER = null;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private int bitField0_;
        private at4 ingestDelay_;
        private int launchStage_;
        private at4 samplePeriod_;

        /* JADX INFO: renamed from: dva$c$a */
        public static final class a extends v27.AbstractC13823b<C4969c, a> implements InterfaceC4970d {
            public /* synthetic */ a(C4967a c4967a) {
                this();
            }

            public a clearIngestDelay() {
                m23743e();
                ((C4969c) this.f89756b).clearIngestDelay();
                return this;
            }

            @Deprecated
            public a clearLaunchStage() {
                m23743e();
                ((C4969c) this.f89756b).clearLaunchStage();
                return this;
            }

            public a clearSamplePeriod() {
                m23743e();
                ((C4969c) this.f89756b).clearSamplePeriod();
                return this;
            }

            @Override // p000.dva.InterfaceC4970d
            public at4 getIngestDelay() {
                return ((C4969c) this.f89756b).getIngestDelay();
            }

            @Override // p000.dva.InterfaceC4970d
            @Deprecated
            public qu8 getLaunchStage() {
                return ((C4969c) this.f89756b).getLaunchStage();
            }

            @Override // p000.dva.InterfaceC4970d
            @Deprecated
            public int getLaunchStageValue() {
                return ((C4969c) this.f89756b).getLaunchStageValue();
            }

            @Override // p000.dva.InterfaceC4970d
            public at4 getSamplePeriod() {
                return ((C4969c) this.f89756b).getSamplePeriod();
            }

            @Override // p000.dva.InterfaceC4970d
            public boolean hasIngestDelay() {
                return ((C4969c) this.f89756b).hasIngestDelay();
            }

            @Override // p000.dva.InterfaceC4970d
            public boolean hasSamplePeriod() {
                return ((C4969c) this.f89756b).hasSamplePeriod();
            }

            public a mergeIngestDelay(at4 at4Var) {
                m23743e();
                ((C4969c) this.f89756b).mergeIngestDelay(at4Var);
                return this;
            }

            public a mergeSamplePeriod(at4 at4Var) {
                m23743e();
                ((C4969c) this.f89756b).mergeSamplePeriod(at4Var);
                return this;
            }

            public a setIngestDelay(at4 at4Var) {
                m23743e();
                ((C4969c) this.f89756b).setIngestDelay(at4Var);
                return this;
            }

            @Deprecated
            public a setLaunchStage(qu8 qu8Var) {
                m23743e();
                ((C4969c) this.f89756b).setLaunchStage(qu8Var);
                return this;
            }

            @Deprecated
            public a setLaunchStageValue(int i) {
                m23743e();
                ((C4969c) this.f89756b).setLaunchStageValue(i);
                return this;
            }

            public a setSamplePeriod(at4 at4Var) {
                m23743e();
                ((C4969c) this.f89756b).setSamplePeriod(at4Var);
                return this;
            }

            private a() {
                super(C4969c.DEFAULT_INSTANCE);
            }

            public a setIngestDelay(at4.C1602b c1602b) {
                m23743e();
                ((C4969c) this.f89756b).setIngestDelay(c1602b.build());
                return this;
            }

            public a setSamplePeriod(at4.C1602b c1602b) {
                m23743e();
                ((C4969c) this.f89756b).setSamplePeriod(c1602b.build());
                return this;
            }
        }

        static {
            C4969c c4969c = new C4969c();
            DEFAULT_INSTANCE = c4969c;
            v27.m23715h0(C4969c.class, c4969c);
        }

        private C4969c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIngestDelay() {
            this.ingestDelay_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLaunchStage() {
            this.launchStage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSamplePeriod() {
            this.samplePeriod_ = null;
            this.bitField0_ &= -2;
        }

        public static C4969c getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIngestDelay(at4 at4Var) {
            at4Var.getClass();
            at4 at4Var2 = this.ingestDelay_;
            if (at4Var2 == null || at4Var2 == at4.getDefaultInstance()) {
                this.ingestDelay_ = at4Var;
            } else {
                this.ingestDelay_ = at4.newBuilder(this.ingestDelay_).mergeFrom(at4Var).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSamplePeriod(at4 at4Var) {
            at4Var.getClass();
            at4 at4Var2 = this.samplePeriod_;
            if (at4Var2 == null || at4Var2 == at4.getDefaultInstance()) {
                this.samplePeriod_ = at4Var;
            } else {
                this.samplePeriod_ = at4.newBuilder(this.samplePeriod_).mergeFrom(at4Var).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C4969c parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C4969c) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C4969c parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C4969c) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C4969c> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIngestDelay(at4 at4Var) {
            at4Var.getClass();
            this.ingestDelay_ = at4Var;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLaunchStage(qu8 qu8Var) {
            this.launchStage_ = qu8Var.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLaunchStageValue(int i) {
            this.launchStage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSamplePeriod(at4 at4Var) {
            at4Var.getClass();
            this.samplePeriod_ = at4Var;
            this.bitField0_ |= 1;
        }

        @Override // p000.dva.InterfaceC4970d
        public at4 getIngestDelay() {
            at4 at4Var = this.ingestDelay_;
            return at4Var == null ? at4.getDefaultInstance() : at4Var;
        }

        @Override // p000.dva.InterfaceC4970d
        @Deprecated
        public qu8 getLaunchStage() {
            qu8 qu8VarForNumber = qu8.forNumber(this.launchStage_);
            return qu8VarForNumber == null ? qu8.UNRECOGNIZED : qu8VarForNumber;
        }

        @Override // p000.dva.InterfaceC4970d
        @Deprecated
        public int getLaunchStageValue() {
            return this.launchStage_;
        }

        @Override // p000.dva.InterfaceC4970d
        public at4 getSamplePeriod() {
            at4 at4Var = this.samplePeriod_;
            return at4Var == null ? at4.getDefaultInstance() : at4Var;
        }

        @Override // p000.dva.InterfaceC4970d
        public boolean hasIngestDelay() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.dva.InterfaceC4970d
        public boolean hasSamplePeriod() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C4967a c4967a = null;
            switch (C4967a.f30989a[enumC13830i.ordinal()]) {
                case 1:
                    return new C4969c();
                case 2:
                    return new a(c4967a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "launchStage_", "samplePeriod_", "ingestDelay_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C4969c> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C4969c.class) {
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

        public static a newBuilder(C4969c c4969c) {
            return DEFAULT_INSTANCE.m23739o(c4969c);
        }

        public static C4969c parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C4969c) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C4969c parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C4969c) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C4969c parseFrom(vj1 vj1Var) throws ce8 {
            return (C4969c) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C4969c parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C4969c) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C4969c parseFrom(byte[] bArr) throws ce8 {
            return (C4969c) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C4969c parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C4969c) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C4969c parseFrom(InputStream inputStream) throws IOException {
            return (C4969c) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C4969c parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C4969c) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C4969c parseFrom(f72 f72Var) throws IOException {
            return (C4969c) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C4969c parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C4969c) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: dva$d */
    public interface InterfaceC4970d extends rsa {
        at4 getIngestDelay();

        @Deprecated
        qu8 getLaunchStage();

        @Deprecated
        int getLaunchStageValue();

        at4 getSamplePeriod();

        boolean hasIngestDelay();

        boolean hasSamplePeriod();
    }

    /* JADX INFO: renamed from: dva$e */
    public enum EnumC4971e implements w98.InterfaceC14497d {
        METRIC_KIND_UNSPECIFIED(0),
        GAUGE(1),
        DELTA(2),
        CUMULATIVE(3),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: C */
        public static final int f30990C = 1;

        /* JADX INFO: renamed from: F */
        public static final int f30991F = 2;

        /* JADX INFO: renamed from: H */
        public static final int f30992H = 3;

        /* JADX INFO: renamed from: L */
        public static final w98.InterfaceC14498e<EnumC4971e> f30993L = new a();

        /* JADX INFO: renamed from: m */
        public static final int f31000m = 0;

        /* JADX INFO: renamed from: a */
        public final int f31001a;

        /* JADX INFO: renamed from: dva$e$a */
        public class a implements w98.InterfaceC14498e<EnumC4971e> {
            @Override // p000.w98.InterfaceC14498e
            public EnumC4971e findValueByNumber(int i) {
                return EnumC4971e.forNumber(i);
            }
        }

        /* JADX INFO: renamed from: dva$e$b */
        public static final class b implements w98.InterfaceC14499f {

            /* JADX INFO: renamed from: a */
            public static final w98.InterfaceC14499f f31002a = new b();

            private b() {
            }

            @Override // p000.w98.InterfaceC14499f
            public boolean isInRange(int i) {
                return EnumC4971e.forNumber(i) != null;
            }
        }

        EnumC4971e(int i) {
            this.f31001a = i;
        }

        public static EnumC4971e forNumber(int i) {
            if (i == 0) {
                return METRIC_KIND_UNSPECIFIED;
            }
            if (i == 1) {
                return GAUGE;
            }
            if (i == 2) {
                return DELTA;
            }
            if (i != 3) {
                return null;
            }
            return CUMULATIVE;
        }

        public static w98.InterfaceC14498e<EnumC4971e> internalGetValueMap() {
            return f30993L;
        }

        public static w98.InterfaceC14499f internalGetVerifier() {
            return b.f31002a;
        }

        @Override // p000.w98.InterfaceC14497d
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f31001a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC4971e valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: renamed from: dva$f */
    public enum EnumC4972f implements w98.InterfaceC14497d {
        VALUE_TYPE_UNSPECIFIED(0),
        BOOL(1),
        INT64(2),
        DOUBLE(3),
        STRING(4),
        DISTRIBUTION(5),
        MONEY(6),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: H */
        public static final int f31005H = 0;

        /* JADX INFO: renamed from: L */
        public static final int f31006L = 1;

        /* JADX INFO: renamed from: M */
        public static final int f31007M = 2;

        /* JADX INFO: renamed from: N */
        public static final int f31009N = 3;

        /* JADX INFO: renamed from: Q */
        public static final int f31010Q = 4;

        /* JADX INFO: renamed from: X */
        public static final int f31011X = 5;

        /* JADX INFO: renamed from: Y */
        public static final int f31012Y = 6;

        /* JADX INFO: renamed from: Z */
        public static final w98.InterfaceC14498e<EnumC4972f> f31013Z = new a();

        /* JADX INFO: renamed from: a */
        public final int f31020a;

        /* JADX INFO: renamed from: dva$f$a */
        public class a implements w98.InterfaceC14498e<EnumC4972f> {
            @Override // p000.w98.InterfaceC14498e
            public EnumC4972f findValueByNumber(int i) {
                return EnumC4972f.forNumber(i);
            }
        }

        /* JADX INFO: renamed from: dva$f$b */
        public static final class b implements w98.InterfaceC14499f {

            /* JADX INFO: renamed from: a */
            public static final w98.InterfaceC14499f f31021a = new b();

            private b() {
            }

            @Override // p000.w98.InterfaceC14499f
            public boolean isInRange(int i) {
                return EnumC4972f.forNumber(i) != null;
            }
        }

        EnumC4972f(int i) {
            this.f31020a = i;
        }

        public static EnumC4972f forNumber(int i) {
            switch (i) {
                case 0:
                    return VALUE_TYPE_UNSPECIFIED;
                case 1:
                    return BOOL;
                case 2:
                    return INT64;
                case 3:
                    return DOUBLE;
                case 4:
                    return STRING;
                case 5:
                    return DISTRIBUTION;
                case 6:
                    return MONEY;
                default:
                    return null;
            }
        }

        public static w98.InterfaceC14498e<EnumC4972f> internalGetValueMap() {
            return f31013Z;
        }

        public static w98.InterfaceC14499f internalGetVerifier() {
            return b.f31021a;
        }

        @Override // p000.w98.InterfaceC14497d
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f31020a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC4972f valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        dva dvaVar = new dva();
        DEFAULT_INSTANCE = dvaVar;
        v27.m23715h0(dva.class, dvaVar);
    }

    private dva() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLabels(Iterable<? extends ot8> iterable) {
        ensureLabelsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.labels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(ot8 ot8Var) {
        ot8Var.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(ot8Var);
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
    public void clearLabels() {
        this.labels_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaunchStage() {
        this.launchStage_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetricKind() {
        this.metricKind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = getDefaultInstance().getUnit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueType() {
        this.valueType_ = 0;
    }

    private void ensureLabelsIsMutable() {
        w98.InterfaceC14504k<ot8> interfaceC14504k = this.labels_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.labels_ = v27.m23698P(interfaceC14504k);
    }

    public static dva getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(C4969c c4969c) {
        c4969c.getClass();
        C4969c c4969c2 = this.metadata_;
        if (c4969c2 == null || c4969c2 == C4969c.getDefaultInstance()) {
            this.metadata_ = c4969c;
        } else {
            this.metadata_ = C4969c.newBuilder(this.metadata_).mergeFrom(c4969c).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C4968b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static dva parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (dva) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static dva parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (dva) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<dva> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLabels(int i) {
        ensureLabelsIsMutable();
        this.labels_.remove(i);
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
    public void setLabels(int i, ot8 ot8Var) {
        ot8Var.getClass();
        ensureLabelsIsMutable();
        this.labels_.set(i, ot8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaunchStage(qu8 qu8Var) {
        this.launchStage_ = qu8Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaunchStageValue(int i) {
        this.launchStage_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(C4969c c4969c) {
        c4969c.getClass();
        this.metadata_ = c4969c;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricKind(EnumC4971e enumC4971e) {
        this.metricKind_ = enumC4971e.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricKindValue(int i) {
        this.metricKind_ = i;
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
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.type_ = vj1Var.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueType(EnumC4972f enumC4972f) {
        this.valueType_ = enumC4972f.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueTypeValue(int i) {
        this.valueType_ = i;
    }

    @Override // p000.eva
    public String getDescription() {
        return this.description_;
    }

    @Override // p000.eva
    public vj1 getDescriptionBytes() {
        return vj1.copyFromUtf8(this.description_);
    }

    @Override // p000.eva
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override // p000.eva
    public vj1 getDisplayNameBytes() {
        return vj1.copyFromUtf8(this.displayName_);
    }

    @Override // p000.eva
    public ot8 getLabels(int i) {
        return this.labels_.get(i);
    }

    @Override // p000.eva
    public int getLabelsCount() {
        return this.labels_.size();
    }

    @Override // p000.eva
    public List<ot8> getLabelsList() {
        return this.labels_;
    }

    public pt8 getLabelsOrBuilder(int i) {
        return this.labels_.get(i);
    }

    public List<? extends pt8> getLabelsOrBuilderList() {
        return this.labels_;
    }

    @Override // p000.eva
    public qu8 getLaunchStage() {
        qu8 qu8VarForNumber = qu8.forNumber(this.launchStage_);
        return qu8VarForNumber == null ? qu8.UNRECOGNIZED : qu8VarForNumber;
    }

    @Override // p000.eva
    public int getLaunchStageValue() {
        return this.launchStage_;
    }

    @Override // p000.eva
    public C4969c getMetadata() {
        C4969c c4969c = this.metadata_;
        return c4969c == null ? C4969c.getDefaultInstance() : c4969c;
    }

    @Override // p000.eva
    public EnumC4971e getMetricKind() {
        EnumC4971e enumC4971eForNumber = EnumC4971e.forNumber(this.metricKind_);
        return enumC4971eForNumber == null ? EnumC4971e.UNRECOGNIZED : enumC4971eForNumber;
    }

    @Override // p000.eva
    public int getMetricKindValue() {
        return this.metricKind_;
    }

    @Override // p000.eva
    public String getName() {
        return this.name_;
    }

    @Override // p000.eva
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.eva
    public String getType() {
        return this.type_;
    }

    @Override // p000.eva
    public vj1 getTypeBytes() {
        return vj1.copyFromUtf8(this.type_);
    }

    @Override // p000.eva
    public String getUnit() {
        return this.unit_;
    }

    @Override // p000.eva
    public vj1 getUnitBytes() {
        return vj1.copyFromUtf8(this.unit_);
    }

    @Override // p000.eva
    public EnumC4972f getValueType() {
        EnumC4972f enumC4972fForNumber = EnumC4972f.forNumber(this.valueType_);
        return enumC4972fForNumber == null ? EnumC4972f.UNRECOGNIZED : enumC4972fForNumber;
    }

    @Override // p000.eva
    public int getValueTypeValue() {
        return this.valueType_;
    }

    @Override // p000.eva
    public boolean hasMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C4967a c4967a = null;
        switch (C4967a.f30989a[enumC13830i.ordinal()]) {
            case 1:
                return new dva();
            case 2:
                return new C4968b(c4967a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\f\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\nဉ\u0000\f\f", new Object[]{"bitField0_", "name_", "labels_", ot8.class, "metricKind_", "valueType_", "unit_", "description_", "displayName_", "type_", "metadata_", "launchStage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<dva> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (dva.class) {
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

    public static C4968b newBuilder(dva dvaVar) {
        return DEFAULT_INSTANCE.m23739o(dvaVar);
    }

    public static dva parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (dva) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static dva parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (dva) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static dva parseFrom(vj1 vj1Var) throws ce8 {
        return (dva) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(int i, ot8 ot8Var) {
        ot8Var.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i, ot8Var);
    }

    public static dva parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (dva) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static dva parseFrom(byte[] bArr) throws ce8 {
        return (dva) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static dva parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (dva) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static dva parseFrom(InputStream inputStream) throws IOException {
        return (dva) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static dva parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (dva) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static dva parseFrom(f72 f72Var) throws IOException {
        return (dva) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static dva parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (dva) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
