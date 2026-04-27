package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class sj9 extends v27<sj9, C12626b> implements xj9 {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final sj9 DEFAULT_INSTANCE;
    private static volatile uhc<sj9> PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private w98.InterfaceC14504k<C12627c> producerDestinations_ = v27.m23722x();
    private w98.InterfaceC14504k<C12627c> consumerDestinations_ = v27.m23722x();

    /* JADX INFO: renamed from: sj9$a */
    public static /* synthetic */ class C12625a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f82004a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f82004a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82004a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82004a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82004a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82004a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82004a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82004a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: sj9$b */
    public static final class C12626b extends v27.AbstractC13823b<sj9, C12626b> implements xj9 {
        public /* synthetic */ C12626b(C12625a c12625a) {
            this();
        }

        public C12626b addAllConsumerDestinations(Iterable<? extends C12627c> iterable) {
            m23743e();
            ((sj9) this.f89756b).addAllConsumerDestinations(iterable);
            return this;
        }

        public C12626b addAllProducerDestinations(Iterable<? extends C12627c> iterable) {
            m23743e();
            ((sj9) this.f89756b).addAllProducerDestinations(iterable);
            return this;
        }

        public C12626b addConsumerDestinations(C12627c c12627c) {
            m23743e();
            ((sj9) this.f89756b).addConsumerDestinations(c12627c);
            return this;
        }

        public C12626b addProducerDestinations(C12627c c12627c) {
            m23743e();
            ((sj9) this.f89756b).addProducerDestinations(c12627c);
            return this;
        }

        public C12626b clearConsumerDestinations() {
            m23743e();
            ((sj9) this.f89756b).clearConsumerDestinations();
            return this;
        }

        public C12626b clearProducerDestinations() {
            m23743e();
            ((sj9) this.f89756b).clearProducerDestinations();
            return this;
        }

        @Override // p000.xj9
        public C12627c getConsumerDestinations(int i) {
            return ((sj9) this.f89756b).getConsumerDestinations(i);
        }

        @Override // p000.xj9
        public int getConsumerDestinationsCount() {
            return ((sj9) this.f89756b).getConsumerDestinationsCount();
        }

        @Override // p000.xj9
        public List<C12627c> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((sj9) this.f89756b).getConsumerDestinationsList());
        }

        @Override // p000.xj9
        public C12627c getProducerDestinations(int i) {
            return ((sj9) this.f89756b).getProducerDestinations(i);
        }

        @Override // p000.xj9
        public int getProducerDestinationsCount() {
            return ((sj9) this.f89756b).getProducerDestinationsCount();
        }

        @Override // p000.xj9
        public List<C12627c> getProducerDestinationsList() {
            return Collections.unmodifiableList(((sj9) this.f89756b).getProducerDestinationsList());
        }

        public C12626b removeConsumerDestinations(int i) {
            m23743e();
            ((sj9) this.f89756b).removeConsumerDestinations(i);
            return this;
        }

        public C12626b removeProducerDestinations(int i) {
            m23743e();
            ((sj9) this.f89756b).removeProducerDestinations(i);
            return this;
        }

        public C12626b setConsumerDestinations(int i, C12627c c12627c) {
            m23743e();
            ((sj9) this.f89756b).setConsumerDestinations(i, c12627c);
            return this;
        }

        public C12626b setProducerDestinations(int i, C12627c c12627c) {
            m23743e();
            ((sj9) this.f89756b).setProducerDestinations(i, c12627c);
            return this;
        }

        private C12626b() {
            super(sj9.DEFAULT_INSTANCE);
        }

        public C12626b addConsumerDestinations(int i, C12627c c12627c) {
            m23743e();
            ((sj9) this.f89756b).addConsumerDestinations(i, c12627c);
            return this;
        }

        public C12626b addProducerDestinations(int i, C12627c c12627c) {
            m23743e();
            ((sj9) this.f89756b).addProducerDestinations(i, c12627c);
            return this;
        }

        public C12626b setConsumerDestinations(int i, C12627c.a aVar) {
            m23743e();
            ((sj9) this.f89756b).setConsumerDestinations(i, aVar.build());
            return this;
        }

        public C12626b setProducerDestinations(int i, C12627c.a aVar) {
            m23743e();
            ((sj9) this.f89756b).setProducerDestinations(i, aVar.build());
            return this;
        }

        public C12626b addConsumerDestinations(C12627c.a aVar) {
            m23743e();
            ((sj9) this.f89756b).addConsumerDestinations(aVar.build());
            return this;
        }

        public C12626b addProducerDestinations(C12627c.a aVar) {
            m23743e();
            ((sj9) this.f89756b).addProducerDestinations(aVar.build());
            return this;
        }

        public C12626b addConsumerDestinations(int i, C12627c.a aVar) {
            m23743e();
            ((sj9) this.f89756b).addConsumerDestinations(i, aVar.build());
            return this;
        }

        public C12626b addProducerDestinations(int i, C12627c.a aVar) {
            m23743e();
            ((sj9) this.f89756b).addProducerDestinations(i, aVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: sj9$c */
    public static final class C12627c extends v27<C12627c, a> implements InterfaceC12628d {
        private static final C12627c DEFAULT_INSTANCE;
        public static final int LOGS_FIELD_NUMBER = 1;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 3;
        private static volatile uhc<C12627c> PARSER;
        private String monitoredResource_ = "";
        private w98.InterfaceC14504k<String> logs_ = v27.m23722x();

        /* JADX INFO: renamed from: sj9$c$a */
        public static final class a extends v27.AbstractC13823b<C12627c, a> implements InterfaceC12628d {
            public /* synthetic */ a(C12625a c12625a) {
                this();
            }

            public a addAllLogs(Iterable<String> iterable) {
                m23743e();
                ((C12627c) this.f89756b).addAllLogs(iterable);
                return this;
            }

            public a addLogs(String str) {
                m23743e();
                ((C12627c) this.f89756b).addLogs(str);
                return this;
            }

            public a addLogsBytes(vj1 vj1Var) {
                m23743e();
                ((C12627c) this.f89756b).addLogsBytes(vj1Var);
                return this;
            }

            public a clearLogs() {
                m23743e();
                ((C12627c) this.f89756b).clearLogs();
                return this;
            }

            public a clearMonitoredResource() {
                m23743e();
                ((C12627c) this.f89756b).clearMonitoredResource();
                return this;
            }

            @Override // p000.sj9.InterfaceC12628d
            public String getLogs(int i) {
                return ((C12627c) this.f89756b).getLogs(i);
            }

            @Override // p000.sj9.InterfaceC12628d
            public vj1 getLogsBytes(int i) {
                return ((C12627c) this.f89756b).getLogsBytes(i);
            }

            @Override // p000.sj9.InterfaceC12628d
            public int getLogsCount() {
                return ((C12627c) this.f89756b).getLogsCount();
            }

            @Override // p000.sj9.InterfaceC12628d
            public List<String> getLogsList() {
                return Collections.unmodifiableList(((C12627c) this.f89756b).getLogsList());
            }

            @Override // p000.sj9.InterfaceC12628d
            public String getMonitoredResource() {
                return ((C12627c) this.f89756b).getMonitoredResource();
            }

            @Override // p000.sj9.InterfaceC12628d
            public vj1 getMonitoredResourceBytes() {
                return ((C12627c) this.f89756b).getMonitoredResourceBytes();
            }

            public a setLogs(int i, String str) {
                m23743e();
                ((C12627c) this.f89756b).setLogs(i, str);
                return this;
            }

            public a setMonitoredResource(String str) {
                m23743e();
                ((C12627c) this.f89756b).setMonitoredResource(str);
                return this;
            }

            public a setMonitoredResourceBytes(vj1 vj1Var) {
                m23743e();
                ((C12627c) this.f89756b).setMonitoredResourceBytes(vj1Var);
                return this;
            }

            private a() {
                super(C12627c.DEFAULT_INSTANCE);
            }
        }

        static {
            C12627c c12627c = new C12627c();
            DEFAULT_INSTANCE = c12627c;
            v27.m23715h0(C12627c.class, c12627c);
        }

        private C12627c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLogs(Iterable<String> iterable) {
            ensureLogsIsMutable();
            AbstractC1714b3.m2856b(iterable, this.logs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogs(String str) {
            str.getClass();
            ensureLogsIsMutable();
            this.logs_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogsBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            ensureLogsIsMutable();
            this.logs_.add(vj1Var.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLogs() {
            this.logs_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonitoredResource() {
            this.monitoredResource_ = getDefaultInstance().getMonitoredResource();
        }

        private void ensureLogsIsMutable() {
            w98.InterfaceC14504k<String> interfaceC14504k = this.logs_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.logs_ = v27.m23698P(interfaceC14504k);
        }

        public static C12627c getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C12627c parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C12627c) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C12627c parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C12627c) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C12627c> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogs(int i, String str) {
            str.getClass();
            ensureLogsIsMutable();
            this.logs_.set(i, str);
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

        @Override // p000.sj9.InterfaceC12628d
        public String getLogs(int i) {
            return this.logs_.get(i);
        }

        @Override // p000.sj9.InterfaceC12628d
        public vj1 getLogsBytes(int i) {
            return vj1.copyFromUtf8(this.logs_.get(i));
        }

        @Override // p000.sj9.InterfaceC12628d
        public int getLogsCount() {
            return this.logs_.size();
        }

        @Override // p000.sj9.InterfaceC12628d
        public List<String> getLogsList() {
            return this.logs_;
        }

        @Override // p000.sj9.InterfaceC12628d
        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        @Override // p000.sj9.InterfaceC12628d
        public vj1 getMonitoredResourceBytes() {
            return vj1.copyFromUtf8(this.monitoredResource_);
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C12625a c12625a = null;
            switch (C12625a.f82004a[enumC13830i.ordinal()]) {
                case 1:
                    return new C12627c();
                case 2:
                    return new a(c12625a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ț\u0003Ȉ", new Object[]{"logs_", "monitoredResource_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C12627c> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C12627c.class) {
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

        public static a newBuilder(C12627c c12627c) {
            return DEFAULT_INSTANCE.m23739o(c12627c);
        }

        public static C12627c parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C12627c) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C12627c parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C12627c) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C12627c parseFrom(vj1 vj1Var) throws ce8 {
            return (C12627c) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C12627c parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C12627c) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C12627c parseFrom(byte[] bArr) throws ce8 {
            return (C12627c) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C12627c parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C12627c) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C12627c parseFrom(InputStream inputStream) throws IOException {
            return (C12627c) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C12627c parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C12627c) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C12627c parseFrom(f72 f72Var) throws IOException {
            return (C12627c) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C12627c parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C12627c) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: sj9$d */
    public interface InterfaceC12628d extends rsa {
        String getLogs(int i);

        vj1 getLogsBytes(int i);

        int getLogsCount();

        List<String> getLogsList();

        String getMonitoredResource();

        vj1 getMonitoredResourceBytes();
    }

    static {
        sj9 sj9Var = new sj9();
        DEFAULT_INSTANCE = sj9Var;
        v27.m23715h0(sj9.class, sj9Var);
    }

    private sj9() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends C12627c> iterable) {
        ensureConsumerDestinationsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.consumerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProducerDestinations(Iterable<? extends C12627c> iterable) {
        ensureProducerDestinationsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.producerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(C12627c c12627c) {
        c12627c.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(c12627c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(C12627c c12627c) {
        c12627c.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(c12627c);
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
        w98.InterfaceC14504k<C12627c> interfaceC14504k = this.consumerDestinations_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.consumerDestinations_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureProducerDestinationsIsMutable() {
        w98.InterfaceC14504k<C12627c> interfaceC14504k = this.producerDestinations_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.producerDestinations_ = v27.m23698P(interfaceC14504k);
    }

    public static sj9 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12626b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static sj9 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (sj9) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static sj9 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (sj9) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<sj9> parser() {
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
    public void setConsumerDestinations(int i, C12627c c12627c) {
        c12627c.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i, c12627c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerDestinations(int i, C12627c c12627c) {
        c12627c.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(i, c12627c);
    }

    @Override // p000.xj9
    public C12627c getConsumerDestinations(int i) {
        return this.consumerDestinations_.get(i);
    }

    @Override // p000.xj9
    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    @Override // p000.xj9
    public List<C12627c> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public InterfaceC12628d getConsumerDestinationsOrBuilder(int i) {
        return this.consumerDestinations_.get(i);
    }

    public List<? extends InterfaceC12628d> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    @Override // p000.xj9
    public C12627c getProducerDestinations(int i) {
        return this.producerDestinations_.get(i);
    }

    @Override // p000.xj9
    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    @Override // p000.xj9
    public List<C12627c> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public InterfaceC12628d getProducerDestinationsOrBuilder(int i) {
        return this.producerDestinations_.get(i);
    }

    public List<? extends InterfaceC12628d> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C12625a c12625a = null;
        switch (C12625a.f82004a[enumC13830i.ordinal()]) {
            case 1:
                return new sj9();
            case 2:
                return new C12626b(c12625a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", C12627c.class, "consumerDestinations_", C12627c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<sj9> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (sj9.class) {
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

    public static C12626b newBuilder(sj9 sj9Var) {
        return DEFAULT_INSTANCE.m23739o(sj9Var);
    }

    public static sj9 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (sj9) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static sj9 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (sj9) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static sj9 parseFrom(vj1 vj1Var) throws ce8 {
        return (sj9) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(int i, C12627c c12627c) {
        c12627c.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i, c12627c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(int i, C12627c c12627c) {
        c12627c.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(i, c12627c);
    }

    public static sj9 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (sj9) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static sj9 parseFrom(byte[] bArr) throws ce8 {
        return (sj9) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static sj9 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (sj9) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static sj9 parseFrom(InputStream inputStream) throws IOException {
        return (sj9) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static sj9 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (sj9) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static sj9 parseFrom(f72 f72Var) throws IOException {
        return (sj9) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static sj9 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (sj9) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
