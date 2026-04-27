package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class x11 extends v27<x11, C14871d> implements y11 {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    private static final x11 DEFAULT_INSTANCE;
    private static volatile uhc<x11> PARSER;
    private w98.InterfaceC14504k<C14869b> consumerDestinations_ = v27.m23722x();

    /* JADX INFO: renamed from: x11$a */
    public static /* synthetic */ class C14868a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95998a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f95998a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95998a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95998a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95998a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f95998a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f95998a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f95998a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: x11$b */
    public static final class C14869b extends v27<C14869b, a> implements InterfaceC14870c {
        private static final C14869b DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile uhc<C14869b> PARSER;
        private String monitoredResource_ = "";
        private w98.InterfaceC14504k<String> metrics_ = v27.m23722x();

        /* JADX INFO: renamed from: x11$b$a */
        public static final class a extends v27.AbstractC13823b<C14869b, a> implements InterfaceC14870c {
            public /* synthetic */ a(C14868a c14868a) {
                this();
            }

            public a addAllMetrics(Iterable<String> iterable) {
                m23743e();
                ((C14869b) this.f89756b).addAllMetrics(iterable);
                return this;
            }

            public a addMetrics(String str) {
                m23743e();
                ((C14869b) this.f89756b).addMetrics(str);
                return this;
            }

            public a addMetricsBytes(vj1 vj1Var) {
                m23743e();
                ((C14869b) this.f89756b).addMetricsBytes(vj1Var);
                return this;
            }

            public a clearMetrics() {
                m23743e();
                ((C14869b) this.f89756b).clearMetrics();
                return this;
            }

            public a clearMonitoredResource() {
                m23743e();
                ((C14869b) this.f89756b).clearMonitoredResource();
                return this;
            }

            @Override // p000.x11.InterfaceC14870c
            public String getMetrics(int i) {
                return ((C14869b) this.f89756b).getMetrics(i);
            }

            @Override // p000.x11.InterfaceC14870c
            public vj1 getMetricsBytes(int i) {
                return ((C14869b) this.f89756b).getMetricsBytes(i);
            }

            @Override // p000.x11.InterfaceC14870c
            public int getMetricsCount() {
                return ((C14869b) this.f89756b).getMetricsCount();
            }

            @Override // p000.x11.InterfaceC14870c
            public List<String> getMetricsList() {
                return Collections.unmodifiableList(((C14869b) this.f89756b).getMetricsList());
            }

            @Override // p000.x11.InterfaceC14870c
            public String getMonitoredResource() {
                return ((C14869b) this.f89756b).getMonitoredResource();
            }

            @Override // p000.x11.InterfaceC14870c
            public vj1 getMonitoredResourceBytes() {
                return ((C14869b) this.f89756b).getMonitoredResourceBytes();
            }

            public a setMetrics(int i, String str) {
                m23743e();
                ((C14869b) this.f89756b).setMetrics(i, str);
                return this;
            }

            public a setMonitoredResource(String str) {
                m23743e();
                ((C14869b) this.f89756b).setMonitoredResource(str);
                return this;
            }

            public a setMonitoredResourceBytes(vj1 vj1Var) {
                m23743e();
                ((C14869b) this.f89756b).setMonitoredResourceBytes(vj1Var);
                return this;
            }

            private a() {
                super(C14869b.DEFAULT_INSTANCE);
            }
        }

        static {
            C14869b c14869b = new C14869b();
            DEFAULT_INSTANCE = c14869b;
            v27.m23715h0(C14869b.class, c14869b);
        }

        private C14869b() {
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

        public static C14869b getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C14869b parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C14869b) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C14869b parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C14869b) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C14869b> parser() {
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

        @Override // p000.x11.InterfaceC14870c
        public String getMetrics(int i) {
            return this.metrics_.get(i);
        }

        @Override // p000.x11.InterfaceC14870c
        public vj1 getMetricsBytes(int i) {
            return vj1.copyFromUtf8(this.metrics_.get(i));
        }

        @Override // p000.x11.InterfaceC14870c
        public int getMetricsCount() {
            return this.metrics_.size();
        }

        @Override // p000.x11.InterfaceC14870c
        public List<String> getMetricsList() {
            return this.metrics_;
        }

        @Override // p000.x11.InterfaceC14870c
        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        @Override // p000.x11.InterfaceC14870c
        public vj1 getMonitoredResourceBytes() {
            return vj1.copyFromUtf8(this.monitoredResource_);
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C14868a c14868a = null;
            switch (C14868a.f95998a[enumC13830i.ordinal()]) {
                case 1:
                    return new C14869b();
                case 2:
                    return new a(c14868a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C14869b> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C14869b.class) {
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

        public static a newBuilder(C14869b c14869b) {
            return DEFAULT_INSTANCE.m23739o(c14869b);
        }

        public static C14869b parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C14869b) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C14869b parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C14869b) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C14869b parseFrom(vj1 vj1Var) throws ce8 {
            return (C14869b) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C14869b parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C14869b) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C14869b parseFrom(byte[] bArr) throws ce8 {
            return (C14869b) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C14869b parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C14869b) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C14869b parseFrom(InputStream inputStream) throws IOException {
            return (C14869b) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C14869b parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C14869b) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C14869b parseFrom(f72 f72Var) throws IOException {
            return (C14869b) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C14869b parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C14869b) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: x11$c */
    public interface InterfaceC14870c extends rsa {
        String getMetrics(int i);

        vj1 getMetricsBytes(int i);

        int getMetricsCount();

        List<String> getMetricsList();

        String getMonitoredResource();

        vj1 getMonitoredResourceBytes();
    }

    /* JADX INFO: renamed from: x11$d */
    public static final class C14871d extends v27.AbstractC13823b<x11, C14871d> implements y11 {
        public /* synthetic */ C14871d(C14868a c14868a) {
            this();
        }

        public C14871d addAllConsumerDestinations(Iterable<? extends C14869b> iterable) {
            m23743e();
            ((x11) this.f89756b).addAllConsumerDestinations(iterable);
            return this;
        }

        public C14871d addConsumerDestinations(C14869b c14869b) {
            m23743e();
            ((x11) this.f89756b).addConsumerDestinations(c14869b);
            return this;
        }

        public C14871d clearConsumerDestinations() {
            m23743e();
            ((x11) this.f89756b).clearConsumerDestinations();
            return this;
        }

        @Override // p000.y11
        public C14869b getConsumerDestinations(int i) {
            return ((x11) this.f89756b).getConsumerDestinations(i);
        }

        @Override // p000.y11
        public int getConsumerDestinationsCount() {
            return ((x11) this.f89756b).getConsumerDestinationsCount();
        }

        @Override // p000.y11
        public List<C14869b> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((x11) this.f89756b).getConsumerDestinationsList());
        }

        public C14871d removeConsumerDestinations(int i) {
            m23743e();
            ((x11) this.f89756b).removeConsumerDestinations(i);
            return this;
        }

        public C14871d setConsumerDestinations(int i, C14869b c14869b) {
            m23743e();
            ((x11) this.f89756b).setConsumerDestinations(i, c14869b);
            return this;
        }

        private C14871d() {
            super(x11.DEFAULT_INSTANCE);
        }

        public C14871d addConsumerDestinations(int i, C14869b c14869b) {
            m23743e();
            ((x11) this.f89756b).addConsumerDestinations(i, c14869b);
            return this;
        }

        public C14871d setConsumerDestinations(int i, C14869b.a aVar) {
            m23743e();
            ((x11) this.f89756b).setConsumerDestinations(i, aVar.build());
            return this;
        }

        public C14871d addConsumerDestinations(C14869b.a aVar) {
            m23743e();
            ((x11) this.f89756b).addConsumerDestinations(aVar.build());
            return this;
        }

        public C14871d addConsumerDestinations(int i, C14869b.a aVar) {
            m23743e();
            ((x11) this.f89756b).addConsumerDestinations(i, aVar.build());
            return this;
        }
    }

    static {
        x11 x11Var = new x11();
        DEFAULT_INSTANCE = x11Var;
        v27.m23715h0(x11.class, x11Var);
    }

    private x11() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends C14869b> iterable) {
        ensureConsumerDestinationsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.consumerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(C14869b c14869b) {
        c14869b.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(c14869b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsumerDestinations() {
        this.consumerDestinations_ = v27.m23722x();
    }

    private void ensureConsumerDestinationsIsMutable() {
        w98.InterfaceC14504k<C14869b> interfaceC14504k = this.consumerDestinations_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.consumerDestinations_ = v27.m23698P(interfaceC14504k);
    }

    public static x11 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14871d newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static x11 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (x11) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static x11 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (x11) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<x11> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConsumerDestinations(int i) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumerDestinations(int i, C14869b c14869b) {
        c14869b.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i, c14869b);
    }

    @Override // p000.y11
    public C14869b getConsumerDestinations(int i) {
        return this.consumerDestinations_.get(i);
    }

    @Override // p000.y11
    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    @Override // p000.y11
    public List<C14869b> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public InterfaceC14870c getConsumerDestinationsOrBuilder(int i) {
        return this.consumerDestinations_.get(i);
    }

    public List<? extends InterfaceC14870c> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C14868a c14868a = null;
        switch (C14868a.f95998a[enumC13830i.ordinal()]) {
            case 1:
                return new x11();
            case 2:
                return new C14871d(c14868a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"consumerDestinations_", C14869b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<x11> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (x11.class) {
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

    public static C14871d newBuilder(x11 x11Var) {
        return DEFAULT_INSTANCE.m23739o(x11Var);
    }

    public static x11 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (x11) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static x11 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (x11) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static x11 parseFrom(vj1 vj1Var) throws ce8 {
        return (x11) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(int i, C14869b c14869b) {
        c14869b.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i, c14869b);
    }

    public static x11 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (x11) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static x11 parseFrom(byte[] bArr) throws ce8 {
        return (x11) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static x11 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (x11) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static x11 parseFrom(InputStream inputStream) throws IOException {
        return (x11) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static x11 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (x11) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static x11 parseFrom(f72 f72Var) throws IOException {
        return (x11) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static x11 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (x11) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
