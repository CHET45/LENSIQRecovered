package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import p000.q42;
import p000.q8b;
import p000.sc0;

/* JADX INFO: loaded from: classes7.dex */
@fgb
@lg5("https://github.com/grpc/grpc-java/issues/1771")
public abstract class zb9 {

    /* JADX INFO: renamed from: b */
    @x98
    public static final sc0.C12516c<Map<String, ?>> f104683b = sc0.C12516c.create("internal:health-checking-config");

    /* JADX INFO: renamed from: c */
    @x98
    public static final C16065b.b<InterfaceC16075l> f104684c = C16065b.b.create("internal:health-check-consumer-listener");

    /* JADX INFO: renamed from: d */
    @x98
    public static final sc0.C12516c<Boolean> f104685d = sc0.C12516c.create("internal:has-health-check-producer-listener");

    /* JADX INFO: renamed from: e */
    public static final sc0.C12516c<Boolean> f104686e = sc0.C12516c.create("io.grpc.IS_PETIOLE_POLICY");

    /* JADX INFO: renamed from: f */
    @Deprecated
    public static final AbstractC16074k f104687f = new C16064a();

    /* JADX INFO: renamed from: a */
    public int f104688a;

    /* JADX INFO: renamed from: zb9$a */
    public class C16064a extends AbstractC16074k {
        @Override // p000.zb9.AbstractC16074k
        public C16070g pickSubchannel(AbstractC16071h abstractC16071h) {
            return C16070g.withNoResult();
        }

        public String toString() {
            return "EMPTY_PICKER";
        }
    }

    /* JADX INFO: renamed from: zb9$b */
    @lg5("https://github.com/grpc/grpc-java/issues/1771")
    public static final class C16065b {

        /* JADX INFO: renamed from: a */
        public final List<s45> f104689a;

        /* JADX INFO: renamed from: b */
        public final sc0 f104690b;

        /* JADX INFO: renamed from: c */
        public final Object[][] f104691c;

        /* JADX INFO: renamed from: zb9$b$a */
        @lg5("https://github.com/grpc/grpc-java/issues/1771")
        public static final class a {

            /* JADX INFO: renamed from: a */
            public List<s45> f104692a;

            /* JADX INFO: renamed from: b */
            public sc0 f104693b = sc0.f81180c;

            /* JADX INFO: renamed from: c */
            public Object[][] f104694c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

            /* JADX INFO: Access modifiers changed from: private */
            public a copyCustomOptions(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                this.f104694c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            public <T> a addOption(b<T> bVar, T t) {
                v7d.checkNotNull(bVar, "key");
                v7d.checkNotNull(t, "value");
                int length = 0;
                while (true) {
                    Object[][] objArr = this.f104694c;
                    if (length >= objArr.length) {
                        length = -1;
                        break;
                    }
                    if (bVar.equals(objArr[length][0])) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f104694c.length + 1, 2);
                    Object[][] objArr3 = this.f104694c;
                    System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                    this.f104694c = objArr2;
                    length = objArr2.length - 1;
                }
                this.f104694c[length] = new Object[]{bVar, t};
                return this;
            }

            public C16065b build() {
                return new C16065b(this.f104692a, this.f104693b, this.f104694c, null);
            }

            public a setAddresses(s45 s45Var) {
                this.f104692a = Collections.singletonList(s45Var);
                return this;
            }

            public a setAttributes(sc0 sc0Var) {
                this.f104693b = (sc0) v7d.checkNotNull(sc0Var, "attrs");
                return this;
            }

            public a setAddresses(List<s45> list) {
                v7d.checkArgument(!list.isEmpty(), "addrs is empty");
                this.f104692a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }
        }

        /* JADX INFO: renamed from: zb9$b$b */
        @lg5("https://github.com/grpc/grpc-java/issues/1771")
        public static final class b<T> {

            /* JADX INFO: renamed from: a */
            public final String f104695a;

            /* JADX INFO: renamed from: b */
            public final T f104696b;

            private b(String str, T t) {
                this.f104695a = str;
                this.f104696b = t;
            }

            public static <T> b<T> create(String str) {
                v7d.checkNotNull(str, "debugString");
                return new b<>(str, null);
            }

            public static <T> b<T> createWithDefault(String str, T t) {
                v7d.checkNotNull(str, "debugString");
                return new b<>(str, t);
            }

            public T getDefault() {
                return this.f104696b;
            }

            public String toString() {
                return this.f104695a;
            }
        }

        public /* synthetic */ C16065b(List list, sc0 sc0Var, Object[][] objArr, C16064a c16064a) {
            this(list, sc0Var, objArr);
        }

        public static a newBuilder() {
            return new a();
        }

        public List<s45> getAddresses() {
            return this.f104689a;
        }

        public sc0 getAttributes() {
            return this.f104690b;
        }

        public <T> T getOption(b<T> bVar) {
            v7d.checkNotNull(bVar, "key");
            int i = 0;
            while (true) {
                Object[][] objArr = this.f104691c;
                if (i >= objArr.length) {
                    return (T) bVar.f104696b;
                }
                if (bVar.equals(objArr[i][0])) {
                    return (T) this.f104691c[i][1];
                }
                i++;
            }
        }

        public a toBuilder() {
            return newBuilder().setAddresses(this.f104689a).setAttributes(this.f104690b).copyCustomOptions(this.f104691c);
        }

        public String toString() {
            return yya.toStringHelper(this).add("addrs", this.f104689a).add("attrs", this.f104690b).add("customOptions", Arrays.deepToString(this.f104691c)).toString();
        }

        private C16065b(List<s45> list, sc0 sc0Var, Object[][] objArr) {
            this.f104689a = (List) v7d.checkNotNull(list, "addresses are not set");
            this.f104690b = (sc0) v7d.checkNotNull(sc0Var, "attrs");
            this.f104691c = (Object[][]) v7d.checkNotNull(objArr, "customOptions");
        }
    }

    /* JADX INFO: renamed from: zb9$c */
    @Deprecated
    public static final class C16066c extends AbstractC16074k {

        /* JADX INFO: renamed from: a */
        public final n4g f104697a;

        public C16066c(n4g n4gVar) {
            this.f104697a = (n4g) v7d.checkNotNull(n4gVar, "error");
        }

        @Override // p000.zb9.AbstractC16074k
        public C16070g pickSubchannel(AbstractC16071h abstractC16071h) {
            return C16070g.withError(this.f104697a);
        }

        public String toString() {
            return yya.toStringHelper(this).add("error", this.f104697a).toString();
        }
    }

    /* JADX INFO: renamed from: zb9$d */
    @lg5("https://github.com/grpc/grpc-java/issues/1771")
    @kyg
    public static abstract class AbstractC16067d {
        public abstract zb9 newLoadBalancer(AbstractC16069f abstractC16069f);
    }

    /* JADX INFO: renamed from: zb9$e */
    public static final class C16068e extends AbstractC16074k {

        /* JADX INFO: renamed from: a */
        public final C16070g f104698a;

        public C16068e(C16070g c16070g) {
            this.f104698a = (C16070g) v7d.checkNotNull(c16070g, "result");
        }

        @Override // p000.zb9.AbstractC16074k
        public C16070g pickSubchannel(AbstractC16071h abstractC16071h) {
            return this.f104698a;
        }

        public String toString() {
            return "FixedResultPicker(" + this.f104698a + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: zb9$f */
    @lg5("https://github.com/grpc/grpc-java/issues/1771")
    @kyg
    public static abstract class AbstractC16069f {
        public or9 createOobChannel(List<s45> list, String str) {
            throw new UnsupportedOperationException();
        }

        public abstract or9 createOobChannel(s45 s45Var, String str);

        public or9 createResolvingOobChannel(String str) {
            return createResolvingOobChannelBuilder(str).build();
        }

        @Deprecated
        public pr9<?> createResolvingOobChannelBuilder(String str) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public AbstractC16073j createSubchannel(C16065b c16065b) {
            throw new UnsupportedOperationException();
        }

        public abstract String getAuthority();

        public eu1 getChannelCredentials() {
            return getUnsafeChannelCredentials().withoutBearerTokens();
        }

        public pu1 getChannelLogger() {
            throw new UnsupportedOperationException();
        }

        public q8b.C11372b getNameResolverArgs() {
            throw new UnsupportedOperationException();
        }

        public t8b getNameResolverRegistry() {
            throw new UnsupportedOperationException();
        }

        public ScheduledExecutorService getScheduledExecutorService() {
            throw new UnsupportedOperationException();
        }

        public thg getSynchronizationContext() {
            throw new UnsupportedOperationException();
        }

        public eu1 getUnsafeChannelCredentials() {
            throw new UnsupportedOperationException();
        }

        @lg5("https://github.com/grpc/grpc-java/issues/8088")
        @Deprecated
        public void ignoreRefreshNameResolutionCheck() {
        }

        public void refreshNameResolution() {
            throw new UnsupportedOperationException();
        }

        public abstract void updateBalancingState(@ofb ws2 ws2Var, @ofb AbstractC16074k abstractC16074k);

        public void updateOobChannelAddresses(or9 or9Var, s45 s45Var) {
            throw new UnsupportedOperationException();
        }

        public pr9<?> createResolvingOobChannelBuilder(String str, eu1 eu1Var) {
            throw new UnsupportedOperationException();
        }

        public void updateOobChannelAddresses(or9 or9Var, List<s45> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: zb9$h */
    @lg5("https://github.com/grpc/grpc-java/issues/1771")
    public static abstract class AbstractC16071h {
        public abstract rn1 getCallOptions();

        public abstract fta getHeaders();

        public abstract rua<?, ?> getMethodDescriptor();
    }

    /* JADX INFO: renamed from: zb9$i */
    @lg5("https://github.com/grpc/grpc-java/issues/1771")
    public static final class C16072i {

        /* JADX INFO: renamed from: a */
        public final List<s45> f104704a;

        /* JADX INFO: renamed from: b */
        public final sc0 f104705b;

        /* JADX INFO: renamed from: c */
        @eib
        public final Object f104706c;

        /* JADX INFO: renamed from: zb9$i$a */
        @lg5("https://github.com/grpc/grpc-java/issues/1771")
        public static final class a {

            /* JADX INFO: renamed from: a */
            public List<s45> f104707a;

            /* JADX INFO: renamed from: b */
            public sc0 f104708b = sc0.f81180c;

            /* JADX INFO: renamed from: c */
            @eib
            public Object f104709c;

            public C16072i build() {
                return new C16072i(this.f104707a, this.f104708b, this.f104709c, null);
            }

            public a setAddresses(List<s45> list) {
                this.f104707a = list;
                return this;
            }

            public a setAttributes(sc0 sc0Var) {
                this.f104708b = sc0Var;
                return this;
            }

            public a setLoadBalancingPolicyConfig(@eib Object obj) {
                this.f104709c = obj;
                return this;
            }
        }

        public /* synthetic */ C16072i(List list, sc0 sc0Var, Object obj, C16064a c16064a) {
            this(list, sc0Var, obj);
        }

        public static a newBuilder() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C16072i)) {
                return false;
            }
            C16072i c16072i = (C16072i) obj;
            return okb.equal(this.f104704a, c16072i.f104704a) && okb.equal(this.f104705b, c16072i.f104705b) && okb.equal(this.f104706c, c16072i.f104706c);
        }

        public List<s45> getAddresses() {
            return this.f104704a;
        }

        public sc0 getAttributes() {
            return this.f104705b;
        }

        @eib
        public Object getLoadBalancingPolicyConfig() {
            return this.f104706c;
        }

        public int hashCode() {
            return okb.hashCode(this.f104704a, this.f104705b, this.f104706c);
        }

        public a toBuilder() {
            return newBuilder().setAddresses(this.f104704a).setAttributes(this.f104705b).setLoadBalancingPolicyConfig(this.f104706c);
        }

        public String toString() {
            return yya.toStringHelper(this).add("addresses", this.f104704a).add("attributes", this.f104705b).add("loadBalancingPolicyConfig", this.f104706c).toString();
        }

        private C16072i(List<s45> list, sc0 sc0Var, Object obj) {
            this.f104704a = Collections.unmodifiableList(new ArrayList((Collection) v7d.checkNotNull(list, "addresses")));
            this.f104705b = (sc0) v7d.checkNotNull(sc0Var, "attributes");
            this.f104706c = obj;
        }
    }

    /* JADX INFO: renamed from: zb9$j */
    @lg5("https://github.com/grpc/grpc-java/issues/1771")
    public static abstract class AbstractC16073j {
        @x98
        public bu1 asChannel() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p000.s45 getAddresses() {
            /*
                r4 = this;
                java.util.List r0 = r4.getAllAddresses()
                r1 = 0
                if (r0 == 0) goto Lf
                int r2 = r0.size()
                r3 = 1
                if (r2 != r3) goto Lf
                goto L10
            Lf:
                r3 = r1
            L10:
                java.lang.String r2 = "%s does not have exactly one group"
                p000.v7d.checkState(r3, r2, r0)
                java.lang.Object r0 = r0.get(r1)
                s45 r0 = (p000.s45) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.zb9.AbstractC16073j.getAddresses():s45");
        }

        public List<s45> getAllAddresses() {
            throw new UnsupportedOperationException();
        }

        public abstract sc0 getAttributes();

        public pu1 getChannelLogger() {
            throw new UnsupportedOperationException();
        }

        @x98
        public Object getInternalSubchannel() {
            throw new UnsupportedOperationException();
        }

        public abstract void requestConnection();

        public abstract void shutdown();

        public void start(InterfaceC16075l interfaceC16075l) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public void updateAddresses(List<s45> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: zb9$k */
    @lg5("https://github.com/grpc/grpc-java/issues/1771")
    @kyg
    public static abstract class AbstractC16074k {
        public abstract C16070g pickSubchannel(AbstractC16071h abstractC16071h);

        @Deprecated
        public void requestConnection() {
        }
    }

    /* JADX INFO: renamed from: zb9$l */
    public interface InterfaceC16075l {
        void onSubchannelState(xs2 xs2Var);
    }

    public n4g acceptResolvedAddresses(C16072i c16072i) {
        if (!c16072i.getAddresses().isEmpty() || canHandleEmptyAddressListFromNameResolution()) {
            int i = this.f104688a;
            this.f104688a = i + 1;
            if (i == 0) {
                handleResolvedAddresses(c16072i);
            }
            this.f104688a = 0;
            return n4g.f63258e;
        }
        n4g n4gVarWithDescription = n4g.f63273t.withDescription("NameResolver returned no usable address. addrs=" + c16072i.getAddresses() + ", attrs=" + c16072i.getAttributes());
        handleNameResolutionError(n4gVarWithDescription);
        return n4gVarWithDescription;
    }

    public boolean canHandleEmptyAddressListFromNameResolution() {
        return false;
    }

    public abstract void handleNameResolutionError(n4g n4gVar);

    public void handleResolvedAddresses(C16072i c16072i) {
        int i = this.f104688a;
        this.f104688a = i + 1;
        if (i == 0) {
            acceptResolvedAddresses(c16072i);
        }
        this.f104688a = 0;
    }

    @Deprecated
    public void handleSubchannelState(AbstractC16073j abstractC16073j, xs2 xs2Var) {
    }

    public void requestConnection() {
    }

    public abstract void shutdown();

    /* JADX INFO: renamed from: zb9$g */
    @lg5("https://github.com/grpc/grpc-java/issues/1771")
    @uw7
    public static final class C16070g {

        /* JADX INFO: renamed from: e */
        public static final C16070g f104699e = new C16070g(null, null, n4g.f63258e, false);

        /* JADX INFO: renamed from: a */
        @eib
        public final AbstractC16073j f104700a;

        /* JADX INFO: renamed from: b */
        @eib
        public final q42.AbstractC11305a f104701b;

        /* JADX INFO: renamed from: c */
        public final n4g f104702c;

        /* JADX INFO: renamed from: d */
        public final boolean f104703d;

        private C16070g(@eib AbstractC16073j abstractC16073j, @eib q42.AbstractC11305a abstractC11305a, n4g n4gVar, boolean z) {
            this.f104700a = abstractC16073j;
            this.f104701b = abstractC11305a;
            this.f104702c = (n4g) v7d.checkNotNull(n4gVar, "status");
            this.f104703d = z;
        }

        public static C16070g withDrop(n4g n4gVar) {
            v7d.checkArgument(!n4gVar.isOk(), "drop status shouldn't be OK");
            return new C16070g(null, null, n4gVar, true);
        }

        public static C16070g withError(n4g n4gVar) {
            v7d.checkArgument(!n4gVar.isOk(), "error status shouldn't be OK");
            return new C16070g(null, null, n4gVar, false);
        }

        public static C16070g withNoResult() {
            return f104699e;
        }

        public static C16070g withSubchannel(AbstractC16073j abstractC16073j, @eib q42.AbstractC11305a abstractC11305a) {
            return new C16070g((AbstractC16073j) v7d.checkNotNull(abstractC16073j, "subchannel"), abstractC11305a, n4g.f63258e, false);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C16070g)) {
                return false;
            }
            C16070g c16070g = (C16070g) obj;
            return okb.equal(this.f104700a, c16070g.f104700a) && okb.equal(this.f104702c, c16070g.f104702c) && okb.equal(this.f104701b, c16070g.f104701b) && this.f104703d == c16070g.f104703d;
        }

        public n4g getStatus() {
            return this.f104702c;
        }

        @eib
        public q42.AbstractC11305a getStreamTracerFactory() {
            return this.f104701b;
        }

        @eib
        public AbstractC16073j getSubchannel() {
            return this.f104700a;
        }

        public int hashCode() {
            return okb.hashCode(this.f104700a, this.f104702c, this.f104701b, Boolean.valueOf(this.f104703d));
        }

        public boolean isDrop() {
            return this.f104703d;
        }

        public String toString() {
            return yya.toStringHelper(this).add("subchannel", this.f104700a).add("streamTracerFactory", this.f104701b).add("status", this.f104702c).add("drop", this.f104703d).toString();
        }

        public static C16070g withSubchannel(AbstractC16073j abstractC16073j) {
            return withSubchannel(abstractC16073j, null);
        }
    }
}
