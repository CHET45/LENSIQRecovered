package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class kya extends v27<kya, C8555b> implements lya {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final kya DEFAULT_INSTANCE;
    private static volatile uhc<kya> PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private w98.InterfaceC14504k<C8556c> producerDestinations_ = v27.m23722x();
    private w98.InterfaceC14504k<C8556c> consumerDestinations_ = v27.m23722x();

    /* JADX INFO: renamed from: kya$a */
    public static /* synthetic */ class C8554a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55638a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f55638a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55638a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55638a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55638a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55638a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55638a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55638a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: kya$b */
    public static final class C8555b extends v27.AbstractC13823b<kya, C8555b> implements lya {
        public /* synthetic */ C8555b(C8554a c8554a) {
            this();
        }

        public C8555b addAllConsumerDestinations(Iterable<? extends C8556c> iterable) {
            m23743e();
            ((kya) this.f89756b).addAllConsumerDestinations(iterable);
            return this;
        }

        public C8555b addAllProducerDestinations(Iterable<? extends C8556c> iterable) {
            m23743e();
            ((kya) this.f89756b).addAllProducerDestinations(iterable);
            return this;
        }

        public C8555b addConsumerDestinations(C8556c c8556c) {
            m23743e();
            ((kya) this.f89756b).addConsumerDestinations(c8556c);
            return this;
        }

        public C8555b addProducerDestinations(C8556c c8556c) {
            m23743e();
            ((kya) this.f89756b).addProducerDestinations(c8556c);
            return this;
        }

        public C8555b clearConsumerDestinations() {
            m23743e();
            ((kya) this.f89756b).clearConsumerDestinations();
            return this;
        }

        public C8555b clearProducerDestinations() {
            m23743e();
            ((kya) this.f89756b).clearProducerDestinations();
            return this;
        }

        @Override // p000.lya
        public C8556c getConsumerDestinations(int i) {
            return ((kya) this.f89756b).getConsumerDestinations(i);
        }

        @Override // p000.lya
        public int getConsumerDestinationsCount() {
            return ((kya) this.f89756b).getConsumerDestinationsCount();
        }

        @Override // p000.lya
        public List<C8556c> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((kya) this.f89756b).getConsumerDestinationsList());
        }

        @Override // p000.lya
        public C8556c getProducerDestinations(int i) {
            return ((kya) this.f89756b).getProducerDestinations(i);
        }

        @Override // p000.lya
        public int getProducerDestinationsCount() {
            return ((kya) this.f89756b).getProducerDestinationsCount();
        }

        @Override // p000.lya
        public List<C8556c> getProducerDestinationsList() {
            return Collections.unmodifiableList(((kya) this.f89756b).getProducerDestinationsList());
        }

        public C8555b removeConsumerDestinations(int i) {
            m23743e();
            ((kya) this.f89756b).removeConsumerDestinations(i);
            return this;
        }

        public C8555b removeProducerDestinations(int i) {
            m23743e();
            ((kya) this.f89756b).removeProducerDestinations(i);
            return this;
        }

        public C8555b setConsumerDestinations(int i, C8556c c8556c) {
            m23743e();
            ((kya) this.f89756b).setConsumerDestinations(i, c8556c);
            return this;
        }

        public C8555b setProducerDestinations(int i, C8556c c8556c) {
            m23743e();
            ((kya) this.f89756b).setProducerDestinations(i, c8556c);
            return this;
        }

        private C8555b() {
            super(kya.DEFAULT_INSTANCE);
        }

        public C8555b addConsumerDestinations(int i, C8556c c8556c) {
            m23743e();
            ((kya) this.f89756b).addConsumerDestinations(i, c8556c);
            return this;
        }

        public C8555b addProducerDestinations(int i, C8556c c8556c) {
            m23743e();
            ((kya) this.f89756b).addProducerDestinations(i, c8556c);
            return this;
        }

        public C8555b setConsumerDestinations(int i, C8556c.a aVar) {
            m23743e();
            ((kya) this.f89756b).setConsumerDestinations(i, aVar.build());
            return this;
        }

        public C8555b setProducerDestinations(int i, C8556c.a aVar) {
            m23743e();
            ((kya) this.f89756b).setProducerDestinations(i, aVar.build());
            return this;
        }

        public C8555b addConsumerDestinations(C8556c.a aVar) {
            m23743e();
            ((kya) this.f89756b).addConsumerDestinations(aVar.build());
            return this;
        }

        public C8555b addProducerDestinations(C8556c.a aVar) {
            m23743e();
            ((kya) this.f89756b).addProducerDestinations(aVar.build());
            return this;
        }

        public C8555b addConsumerDestinations(int i, C8556c.a aVar) {
            m23743e();
            ((kya) this.f89756b).addConsumerDestinations(i, aVar.build());
            return this;
        }

        public C8555b addProducerDestinations(int i, C8556c.a aVar) {
            m23743e();
            ((kya) this.f89756b).addProducerDestinations(i, aVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: kya$c */
    public static final class C8556c extends v27<C8556c, a> implements InterfaceC8557d {
        private static final C8556c DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile uhc<C8556c> PARSER;
        private String monitoredResource_ = "";
        private w98.InterfaceC14504k<String> metrics_ = v27.m23722x();

        /* JADX INFO: renamed from: kya$c$a */
        public static final class a extends v27.AbstractC13823b<C8556c, a> implements InterfaceC8557d {
            public /* synthetic */ a(C8554a c8554a) {
                this();
            }

            public a addAllMetrics(Iterable<String> iterable) {
                m23743e();
                ((C8556c) this.f89756b).addAllMetrics(iterable);
                return this;
            }

            public a addMetrics(String str) {
                m23743e();
                ((C8556c) this.f89756b).addMetrics(str);
                return this;
            }

            public a addMetricsBytes(vj1 vj1Var) {
                m23743e();
                ((C8556c) this.f89756b).addMetricsBytes(vj1Var);
                return this;
            }

            public a clearMetrics() {
                m23743e();
                ((C8556c) this.f89756b).clearMetrics();
                return this;
            }

            public a clearMonitoredResource() {
                m23743e();
                ((C8556c) this.f89756b).clearMonitoredResource();
                return this;
            }

            @Override // p000.kya.InterfaceC8557d
            public String getMetrics(int i) {
                return ((C8556c) this.f89756b).getMetrics(i);
            }

            @Override // p000.kya.InterfaceC8557d
            public vj1 getMetricsBytes(int i) {
                return ((C8556c) this.f89756b).getMetricsBytes(i);
            }

            @Override // p000.kya.InterfaceC8557d
            public int getMetricsCount() {
                return ((C8556c) this.f89756b).getMetricsCount();
            }

            @Override // p000.kya.InterfaceC8557d
            public List<String> getMetricsList() {
                return Collections.unmodifiableList(((C8556c) this.f89756b).getMetricsList());
            }

            @Override // p000.kya.InterfaceC8557d
            public String getMonitoredResource() {
                return ((C8556c) this.f89756b).getMonitoredResource();
            }

            @Override // p000.kya.InterfaceC8557d
            public vj1 getMonitoredResourceBytes() {
                return ((C8556c) this.f89756b).getMonitoredResourceBytes();
            }

            public a setMetrics(int i, String str) {
                m23743e();
                ((C8556c) this.f89756b).setMetrics(i, str);
                return this;
            }

            public a setMonitoredResource(String str) {
                m23743e();
                ((C8556c) this.f89756b).setMonitoredResource(str);
                return this;
            }

            public a setMonitoredResourceBytes(vj1 vj1Var) {
                m23743e();
                ((C8556c) this.f89756b).setMonitoredResourceBytes(vj1Var);
                return this;
            }

            private a() {
                super(C8556c.DEFAULT_INSTANCE);
            }
        }

        static {
            C8556c c8556c = new C8556c();
            DEFAULT_INSTANCE = c8556c;
            v27.m23715h0(C8556c.class, c8556c);
        }

        private C8556c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMetrics(Iterable<String> iterable) {
            ensureMetricsIsMutable();
            AbstractC1714b3.m2856b(iterable, this.metrics_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetrics(String str) {
            str.getClass();
            ensureMetricsIsMutable();
            this.metrics_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetricsBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            ensureMetricsIsMutable();
            this.metrics_.add(vj1Var.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetrics() {
            this.metrics_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonitoredResource() {
            this.monitoredResource_ = getDefaultInstance().getMonitoredResource();
        }

        private void ensureMetricsIsMutable() {
            w98.InterfaceC14504k<String> interfaceC14504k = this.metrics_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.metrics_ = v27.m23698P(interfaceC14504k);
        }

        public static C8556c getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C8556c parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C8556c) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C8556c parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C8556c) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C8556c> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetrics(int i, String str) {
            str.getClass();
            ensureMetricsIsMutable();
            this.metrics_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonitoredResource(String str) {
            str.getClass();
            this.monitoredResource_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonitoredResourceBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.monitoredResource_ = vj1Var.toStringUtf8();
        }

        @Override // p000.kya.InterfaceC8557d
        public String getMetrics(int i) {
            return this.metrics_.get(i);
        }

        @Override // p000.kya.InterfaceC8557d
        public vj1 getMetricsBytes(int i) {
            return vj1.copyFromUtf8(this.metrics_.get(i));
        }

        @Override // p000.kya.InterfaceC8557d
        public int getMetricsCount() {
            return this.metrics_.size();
        }

        @Override // p000.kya.InterfaceC8557d
        public List<String> getMetricsList() {
            return this.metrics_;
        }

        @Override // p000.kya.InterfaceC8557d
        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        @Override // p000.kya.InterfaceC8557d
        public vj1 getMonitoredResourceBytes() {
            return vj1.copyFromUtf8(this.monitoredResource_);
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C8554a c8554a = null;
            switch (C8554a.f55638a[enumC13830i.ordinal()]) {
                case 1:
                    return new C8556c();
                case 2:
                    return new a(c8554a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C8556c> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C8556c.class) {
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

        public static a newBuilder(C8556c c8556c) {
            return DEFAULT_INSTANCE.m23739o(c8556c);
        }

        public static C8556c parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C8556c) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C8556c parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C8556c) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C8556c parseFrom(vj1 vj1Var) throws ce8 {
            return (C8556c) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C8556c parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C8556c) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C8556c parseFrom(byte[] bArr) throws ce8 {
            return (C8556c) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C8556c parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C8556c) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C8556c parseFrom(InputStream inputStream) throws IOException {
            return (C8556c) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C8556c parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C8556c) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C8556c parseFrom(f72 f72Var) throws IOException {
            return (C8556c) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C8556c parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C8556c) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: kya$d */
    public interface InterfaceC8557d extends rsa {
        String getMetrics(int i);

        vj1 getMetricsBytes(int i);

        int getMetricsCount();

        List<String> getMetricsList();

        String getMonitoredResource();

        vj1 getMonitoredResourceBytes();
    }

    static {
        kya kyaVar = new kya();
        DEFAULT_INSTANCE = kyaVar;
        v27.m23715h0(kya.class, kyaVar);
    }

    private kya() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends C8556c> iterable) {
        ensureConsumerDestinationsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.consumerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProducerDestinations(Iterable<? extends C8556c> iterable) {
        ensureProducerDestinationsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.producerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(C8556c c8556c) {
        c8556c.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(c8556c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(C8556c c8556c) {
        c8556c.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(c8556c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsumerDestinations() {
        this.consumerDestinations_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerDestinations() {
        this.producerDestinations_ = v27.m23722x();
    }

    private void ensureConsumerDestinationsIsMutable() {
        w98.InterfaceC14504k<C8556c> interfaceC14504k = this.consumerDestinations_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.consumerDestinations_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureProducerDestinationsIsMutable() {
        w98.InterfaceC14504k<C8556c> interfaceC14504k = this.producerDestinations_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.producerDestinations_ = v27.m23698P(interfaceC14504k);
    }

    public static kya getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8555b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static kya parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (kya) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static kya parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (kya) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<kya> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConsumerDestinations(int i) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProducerDestinations(int i) {
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumerDestinations(int i, C8556c c8556c) {
        c8556c.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i, c8556c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerDestinations(int i, C8556c c8556c) {
        c8556c.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(i, c8556c);
    }

    @Override // p000.lya
    public C8556c getConsumerDestinations(int i) {
        return this.consumerDestinations_.get(i);
    }

    @Override // p000.lya
    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    @Override // p000.lya
    public List<C8556c> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public InterfaceC8557d getConsumerDestinationsOrBuilder(int i) {
        return this.consumerDestinations_.get(i);
    }

    public List<? extends InterfaceC8557d> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    @Override // p000.lya
    public C8556c getProducerDestinations(int i) {
        return this.producerDestinations_.get(i);
    }

    @Override // p000.lya
    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    @Override // p000.lya
    public List<C8556c> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public InterfaceC8557d getProducerDestinationsOrBuilder(int i) {
        return this.producerDestinations_.get(i);
    }

    public List<? extends InterfaceC8557d> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8554a c8554a = null;
        switch (C8554a.f55638a[enumC13830i.ordinal()]) {
            case 1:
                return new kya();
            case 2:
                return new C8555b(c8554a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", C8556c.class, "consumerDestinations_", C8556c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<kya> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (kya.class) {
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

    public static C8555b newBuilder(kya kyaVar) {
        return DEFAULT_INSTANCE.m23739o(kyaVar);
    }

    public static kya parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (kya) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static kya parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (kya) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static kya parseFrom(vj1 vj1Var) throws ce8 {
        return (kya) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(int i, C8556c c8556c) {
        c8556c.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i, c8556c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(int i, C8556c c8556c) {
        c8556c.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(i, c8556c);
    }

    public static kya parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (kya) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static kya parseFrom(byte[] bArr) throws ce8 {
        return (kya) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static kya parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (kya) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static kya parseFrom(InputStream inputStream) throws IOException {
        return (kya) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static kya parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (kya) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static kya parseFrom(f72 f72Var) throws IOException {
        return (kya) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static kya parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (kya) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
