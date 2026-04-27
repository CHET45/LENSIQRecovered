package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.thg;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/10383")
public final class lvc extends zb9 {

    /* JADX INFO: renamed from: p */
    public static final Logger f58894p = Logger.getLogger(lvc.class.getName());

    /* JADX INFO: renamed from: q */
    @gdi
    public static final int f58895q = 250;

    /* JADX INFO: renamed from: r */
    public static final String f58896r = "GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS";

    /* JADX INFO: renamed from: g */
    public final zb9.AbstractC16069f f58897g;

    /* JADX INFO: renamed from: i */
    public C8985d f58899i;

    /* JADX INFO: renamed from: l */
    @eib
    public thg.C13053d f58902l;

    /* JADX INFO: renamed from: m */
    public ws2 f58903m;

    /* JADX INFO: renamed from: n */
    public ws2 f58904n;

    /* JADX INFO: renamed from: o */
    public final boolean f58905o;

    /* JADX INFO: renamed from: h */
    public final Map<SocketAddress, C8989h> f58898h = new HashMap();

    /* JADX INFO: renamed from: j */
    public int f58900j = 0;

    /* JADX INFO: renamed from: k */
    public boolean f58901k = true;

    /* JADX INFO: renamed from: lvc$a */
    public static /* synthetic */ class C8982a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58906a;

        static {
            int[] iArr = new int[ws2.values().length];
            f58906a = iArr;
            try {
                iArr[ws2.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58906a[ws2.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58906a[ws2.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58906a[ws2.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58906a[ws2.SHUTDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: lvc$b */
    public class RunnableC8983b implements Runnable {
        public RunnableC8983b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            lvc.this.f58902l = null;
            if (lvc.this.f58899i.increment()) {
                lvc.this.requestConnection();
            }
        }
    }

    /* JADX INFO: renamed from: lvc$d */
    @gdi
    public static final class C8985d {

        /* JADX INFO: renamed from: a */
        public List<s45> f58911a;

        /* JADX INFO: renamed from: b */
        public int f58912b;

        /* JADX INFO: renamed from: c */
        public int f58913c;

        public C8985d(List<s45> list) {
            this.f58911a = list == null ? Collections.emptyList() : list;
        }

        public SocketAddress getCurrentAddress() {
            if (isValid()) {
                return this.f58911a.get(this.f58912b).getAddresses().get(this.f58913c);
            }
            throw new IllegalStateException("Index is past the end of the address group list");
        }

        public sc0 getCurrentEagAttributes() {
            if (isValid()) {
                return this.f58911a.get(this.f58912b).getAttributes();
            }
            throw new IllegalStateException("Index is off the end of the address group list");
        }

        public boolean increment() {
            if (!isValid()) {
                return false;
            }
            s45 s45Var = this.f58911a.get(this.f58912b);
            int i = this.f58913c + 1;
            this.f58913c = i;
            if (i < s45Var.getAddresses().size()) {
                return true;
            }
            int i2 = this.f58912b + 1;
            this.f58912b = i2;
            this.f58913c = 0;
            return i2 < this.f58911a.size();
        }

        public boolean isAtBeginning() {
            return this.f58912b == 0 && this.f58913c == 0;
        }

        public boolean isValid() {
            return this.f58912b < this.f58911a.size();
        }

        public void reset() {
            this.f58912b = 0;
            this.f58913c = 0;
        }

        public boolean seekTo(SocketAddress socketAddress) {
            for (int i = 0; i < this.f58911a.size(); i++) {
                int iIndexOf = this.f58911a.get(i).getAddresses().indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.f58912b = i;
                    this.f58913c = iIndexOf;
                    return true;
                }
            }
            return false;
        }

        public int size() {
            List<s45> list = this.f58911a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public void updateGroups(kx7<s45> kx7Var) {
            List<s45> listEmptyList = kx7Var;
            if (kx7Var == null) {
                listEmptyList = Collections.emptyList();
            }
            this.f58911a = listEmptyList;
            reset();
        }
    }

    /* JADX INFO: renamed from: lvc$e */
    public static final class C8986e {

        /* JADX INFO: renamed from: a */
        @eib
        public final Boolean f58914a;

        /* JADX INFO: renamed from: b */
        @eib
        public final Long f58915b;

        public C8986e(@eib Boolean bool) {
            this(bool, null);
        }

        public C8986e(@eib Boolean bool, @eib Long l) {
            this.f58914a = bool;
            this.f58915b = l;
        }
    }

    /* JADX INFO: renamed from: lvc$f */
    public static final class C8987f extends zb9.AbstractC16074k {

        /* JADX INFO: renamed from: a */
        public final zb9.C16070g f58916a;

        public C8987f(zb9.C16070g c16070g) {
            this.f58916a = (zb9.C16070g) v7d.checkNotNull(c16070g, "result");
        }

        @Override // p000.zb9.AbstractC16074k
        public zb9.C16070g pickSubchannel(zb9.AbstractC16071h abstractC16071h) {
            return this.f58916a;
        }

        public String toString() {
            return yya.toStringHelper((Class<?>) C8987f.class).add("result", this.f58916a).toString();
        }
    }

    /* JADX INFO: renamed from: lvc$g */
    public final class C8988g extends zb9.AbstractC16074k {

        /* JADX INFO: renamed from: a */
        public final lvc f58917a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f58918b = new AtomicBoolean(false);

        public C8988g(lvc lvcVar) {
            this.f58917a = (lvc) v7d.checkNotNull(lvcVar, "pickFirstLeafLoadBalancer");
        }

        @Override // p000.zb9.AbstractC16074k
        public zb9.C16070g pickSubchannel(zb9.AbstractC16071h abstractC16071h) {
            if (this.f58918b.compareAndSet(false, true)) {
                thg synchronizationContext = lvc.this.f58897g.getSynchronizationContext();
                final lvc lvcVar = this.f58917a;
                Objects.requireNonNull(lvcVar);
                synchronizationContext.execute(new Runnable() { // from class: mvc
                    @Override // java.lang.Runnable
                    public final void run() {
                        lvcVar.requestConnection();
                    }
                });
            }
            return zb9.C16070g.withNoResult();
        }
    }

    /* JADX INFO: renamed from: lvc$h */
    public static final class C8989h {

        /* JADX INFO: renamed from: a */
        public final zb9.AbstractC16073j f58920a;

        /* JADX INFO: renamed from: b */
        public ws2 f58921b;

        /* JADX INFO: renamed from: c */
        public final C8984c f58922c;

        /* JADX INFO: renamed from: d */
        public boolean f58923d = false;

        public C8989h(zb9.AbstractC16073j abstractC16073j, ws2 ws2Var, C8984c c8984c) {
            this.f58920a = abstractC16073j;
            this.f58921b = ws2Var;
            this.f58922c = c8984c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ws2 getHealthState() {
            return this.f58922c.f58908a.getState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateState(ws2 ws2Var) {
            this.f58921b = ws2Var;
            if (ws2Var == ws2.READY || ws2Var == ws2.TRANSIENT_FAILURE) {
                this.f58923d = true;
            } else if (ws2Var == ws2.IDLE) {
                this.f58923d = false;
            }
        }

        public ws2 getState() {
            return this.f58921b;
        }

        public zb9.AbstractC16073j getSubchannel() {
            return this.f58920a;
        }

        public boolean isCompletedConnectivityAttempt() {
            return this.f58923d;
        }
    }

    public lvc(zb9.AbstractC16069f abstractC16069f) {
        ws2 ws2Var = ws2.IDLE;
        this.f58903m = ws2Var;
        this.f58904n = ws2Var;
        this.f58905o = oc7.getFlag(f58896r, false);
        this.f58897g = (zb9.AbstractC16069f) v7d.checkNotNull(abstractC16069f, "helper");
    }

    private void cancelScheduleTask() {
        thg.C13053d c13053d = this.f58902l;
        if (c13053d != null) {
            c13053d.cancel();
            this.f58902l = null;
        }
    }

    private zb9.AbstractC16073j createNewSubchannel(SocketAddress socketAddress) {
        C8984c c8984c = new C8984c(this, null);
        final zb9.AbstractC16073j abstractC16073jCreateSubchannel = this.f58897g.createSubchannel(zb9.C16065b.newBuilder().setAddresses(eb9.newArrayList(new s45(socketAddress))).addOption(zb9.f104684c, c8984c).build());
        if (abstractC16073jCreateSubchannel == null) {
            f58894p.warning("Was not able to create subchannel for " + socketAddress);
            throw new IllegalStateException("Can't create subchannel");
        }
        C8989h c8989h = new C8989h(abstractC16073jCreateSubchannel, ws2.IDLE, c8984c);
        c8984c.f58909b = c8989h;
        this.f58898h.put(socketAddress, c8989h);
        if (abstractC16073jCreateSubchannel.getAttributes().get(zb9.f104685d) == null) {
            c8984c.f58908a = xs2.forNonError(ws2.READY);
        }
        abstractC16073jCreateSubchannel.start(new zb9.InterfaceC16075l() { // from class: kvc
            @Override // p000.zb9.InterfaceC16075l
            public final void onSubchannelState(xs2 xs2Var) {
                this.f55458a.lambda$createNewSubchannel$0(abstractC16073jCreateSubchannel, xs2Var);
            }
        });
        return abstractC16073jCreateSubchannel;
    }

    private SocketAddress getAddress(zb9.AbstractC16073j abstractC16073j) {
        return abstractC16073j.getAddresses().getAddresses().get(0);
    }

    private boolean isPassComplete() {
        C8985d c8985d = this.f58899i;
        if (c8985d == null || c8985d.isValid() || this.f58898h.size() < this.f58899i.size()) {
            return false;
        }
        Iterator<C8989h> it = this.f58898h.values().iterator();
        while (it.hasNext()) {
            if (!it.next().isCompletedConnectivityAttempt()) {
                return false;
            }
        }
        return true;
    }

    private void scheduleNextConnection() {
        if (this.f58905o) {
            thg.C13053d c13053d = this.f58902l;
            if (c13053d == null || !c13053d.isPending()) {
                this.f58902l = this.f58897g.getSynchronizationContext().schedule(new RunnableC8983b(), 250L, TimeUnit.MILLISECONDS, this.f58897g.getScheduledExecutorService());
            }
        }
    }

    private void shutdownRemaining(C8989h c8989h) {
        cancelScheduleTask();
        for (C8989h c8989h2 : this.f58898h.values()) {
            if (!c8989h2.getSubchannel().equals(c8989h.f58920a)) {
                c8989h2.getSubchannel().shutdown();
            }
        }
        this.f58898h.clear();
        c8989h.updateState(ws2.READY);
        this.f58898h.put(getAddress(c8989h.f58920a), c8989h);
    }

    private void updateBalancingState(ws2 ws2Var, zb9.AbstractC16074k abstractC16074k) {
        if (ws2Var == this.f58904n && (ws2Var == ws2.IDLE || ws2Var == ws2.CONNECTING)) {
            return;
        }
        this.f58904n = ws2Var;
        this.f58897g.updateBalancingState(ws2Var, abstractC16074k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHealthCheckedState(C8989h c8989h) {
        ws2 ws2Var = c8989h.f58921b;
        ws2 ws2Var2 = ws2.READY;
        if (ws2Var != ws2Var2) {
            return;
        }
        if (c8989h.getHealthState() == ws2Var2) {
            updateBalancingState(ws2Var2, new zb9.C16068e(zb9.C16070g.withSubchannel(c8989h.f58920a)));
            return;
        }
        ws2 healthState = c8989h.getHealthState();
        ws2 ws2Var3 = ws2.TRANSIENT_FAILURE;
        if (healthState == ws2Var3) {
            updateBalancingState(ws2Var3, new C8987f(zb9.C16070g.withError(c8989h.f58922c.f58908a.getStatus())));
        } else if (this.f58904n != ws2Var3) {
            updateBalancingState(c8989h.getHealthState(), new C8987f(zb9.C16070g.withNoResult()));
        }
    }

    @Override // p000.zb9
    public n4g acceptResolvedAddresses(zb9.C16072i c16072i) {
        ws2 ws2Var;
        C8986e c8986e;
        Boolean bool;
        if (this.f58903m == ws2.SHUTDOWN) {
            return n4g.f63268o.withDescription("Already shut down");
        }
        List<s45> addresses = c16072i.getAddresses();
        if (addresses.isEmpty()) {
            n4g n4gVarWithDescription = n4g.f63273t.withDescription("NameResolver returned no usable address. addrs=" + c16072i.getAddresses() + ", attrs=" + c16072i.getAttributes());
            handleNameResolutionError(n4gVarWithDescription);
            return n4gVarWithDescription;
        }
        Iterator<s45> it = addresses.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                n4g n4gVarWithDescription2 = n4g.f63273t.withDescription("NameResolver returned address list with null endpoint. addrs=" + c16072i.getAddresses() + ", attrs=" + c16072i.getAttributes());
                handleNameResolutionError(n4gVarWithDescription2);
                return n4gVarWithDescription2;
            }
        }
        this.f58901k = true;
        if ((c16072i.getLoadBalancingPolicyConfig() instanceof C8986e) && (bool = (c8986e = (C8986e) c16072i.getLoadBalancingPolicyConfig()).f58914a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(addresses);
            Collections.shuffle(arrayList, c8986e.f58915b != null ? new Random(c8986e.f58915b.longValue()) : new Random());
            addresses = arrayList;
        }
        kx7<s45> kx7VarBuild = kx7.builder().addAll((Iterable) addresses).build();
        C8985d c8985d = this.f58899i;
        if (c8985d == null) {
            this.f58899i = new C8985d(kx7VarBuild);
        } else if (this.f58903m == ws2.READY) {
            SocketAddress currentAddress = c8985d.getCurrentAddress();
            this.f58899i.updateGroups(kx7VarBuild);
            if (this.f58899i.seekTo(currentAddress)) {
                return n4g.f63258e;
            }
            this.f58899i.reset();
        } else {
            c8985d.updateGroups(kx7VarBuild);
        }
        HashSet<SocketAddress> hashSet = new HashSet(this.f58898h.keySet());
        HashSet hashSet2 = new HashSet();
        quh<s45> it2 = kx7VarBuild.iterator();
        while (it2.hasNext()) {
            hashSet2.addAll(it2.next().getAddresses());
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                this.f58898h.remove(socketAddress).getSubchannel().shutdown();
            }
        }
        if (hashSet.size() == 0 || (ws2Var = this.f58903m) == ws2.CONNECTING || ws2Var == ws2.READY) {
            ws2 ws2Var2 = ws2.CONNECTING;
            this.f58903m = ws2Var2;
            updateBalancingState(ws2Var2, new C8987f(zb9.C16070g.withNoResult()));
            cancelScheduleTask();
            requestConnection();
        } else {
            ws2 ws2Var3 = ws2.IDLE;
            if (ws2Var == ws2Var3) {
                updateBalancingState(ws2Var3, new C8988g(this));
            } else if (ws2Var == ws2.TRANSIENT_FAILURE) {
                cancelScheduleTask();
                requestConnection();
            }
        }
        return n4g.f63258e;
    }

    @gdi
    /* JADX INFO: renamed from: h */
    public ws2 m16403h() {
        return this.f58904n;
    }

    @Override // p000.zb9
    public void handleNameResolutionError(n4g n4gVar) {
        Iterator<C8989h> it = this.f58898h.values().iterator();
        while (it.hasNext()) {
            it.next().getSubchannel().shutdown();
        }
        this.f58898h.clear();
        updateBalancingState(ws2.TRANSIENT_FAILURE, new C8987f(zb9.C16070g.withError(n4gVar)));
    }

    /* JADX INFO: renamed from: processSubchannelState, reason: merged with bridge method [inline-methods] */
    public void lambda$createNewSubchannel$0(zb9.AbstractC16073j abstractC16073j, xs2 xs2Var) {
        ws2 state = xs2Var.getState();
        C8989h c8989h = this.f58898h.get(getAddress(abstractC16073j));
        if (c8989h == null || c8989h.getSubchannel() != abstractC16073j || state == ws2.SHUTDOWN) {
            return;
        }
        ws2 ws2Var = ws2.IDLE;
        if (state == ws2Var) {
            this.f58897g.refreshNameResolution();
        }
        c8989h.updateState(state);
        ws2 ws2Var2 = this.f58903m;
        ws2 ws2Var3 = ws2.TRANSIENT_FAILURE;
        if (ws2Var2 == ws2Var3 || this.f58904n == ws2Var3) {
            if (state == ws2.CONNECTING) {
                return;
            }
            if (state == ws2Var) {
                requestConnection();
                return;
            }
        }
        int i = C8982a.f58906a[state.ordinal()];
        if (i == 1) {
            this.f58899i.reset();
            this.f58903m = ws2Var;
            updateBalancingState(ws2Var, new C8988g(this));
            return;
        }
        if (i == 2) {
            ws2 ws2Var4 = ws2.CONNECTING;
            this.f58903m = ws2Var4;
            updateBalancingState(ws2Var4, new C8987f(zb9.C16070g.withNoResult()));
            return;
        }
        if (i == 3) {
            shutdownRemaining(c8989h);
            this.f58899i.seekTo(getAddress(abstractC16073j));
            this.f58903m = ws2.READY;
            updateHealthCheckedState(c8989h);
            return;
        }
        if (i != 4) {
            throw new IllegalArgumentException("Unsupported state:" + state);
        }
        if (this.f58899i.isValid() && this.f58898h.get(this.f58899i.getCurrentAddress()).getSubchannel() == abstractC16073j && this.f58899i.increment()) {
            cancelScheduleTask();
            requestConnection();
        }
        if (isPassComplete()) {
            this.f58903m = ws2Var3;
            updateBalancingState(ws2Var3, new C8987f(zb9.C16070g.withError(xs2Var.getStatus())));
            int i2 = this.f58900j + 1;
            this.f58900j = i2;
            if (i2 >= this.f58899i.size() || this.f58901k) {
                this.f58901k = false;
                this.f58900j = 0;
                this.f58897g.refreshNameResolution();
            }
        }
    }

    @Override // p000.zb9
    public void requestConnection() {
        C8985d c8985d = this.f58899i;
        if (c8985d == null || !c8985d.isValid() || this.f58903m == ws2.SHUTDOWN) {
            return;
        }
        SocketAddress currentAddress = this.f58899i.getCurrentAddress();
        zb9.AbstractC16073j subchannel = this.f58898h.containsKey(currentAddress) ? this.f58898h.get(currentAddress).getSubchannel() : createNewSubchannel(currentAddress);
        int i = C8982a.f58906a[this.f58898h.get(currentAddress).getState().ordinal()];
        if (i == 1) {
            subchannel.requestConnection();
            this.f58898h.get(currentAddress).updateState(ws2.CONNECTING);
            scheduleNextConnection();
        } else {
            if (i == 2) {
                if (this.f58905o) {
                    scheduleNextConnection();
                    return;
                } else {
                    subchannel.requestConnection();
                    return;
                }
            }
            if (i == 3) {
                f58894p.warning("Requesting a connection even though we have a READY subchannel");
            } else {
                if (i != 4) {
                    return;
                }
                this.f58899i.increment();
                requestConnection();
            }
        }
    }

    @Override // p000.zb9
    public void shutdown() {
        f58894p.log(Level.FINE, "Shutting down, currently have {} subchannels created", Integer.valueOf(this.f58898h.size()));
        ws2 ws2Var = ws2.SHUTDOWN;
        this.f58903m = ws2Var;
        this.f58904n = ws2Var;
        cancelScheduleTask();
        Iterator<C8989h> it = this.f58898h.values().iterator();
        while (it.hasNext()) {
            it.next().getSubchannel().shutdown();
        }
        this.f58898h.clear();
    }

    /* JADX INFO: renamed from: lvc$c */
    public final class C8984c implements zb9.InterfaceC16075l {

        /* JADX INFO: renamed from: a */
        public xs2 f58908a;

        /* JADX INFO: renamed from: b */
        public C8989h f58909b;

        private C8984c() {
            this.f58908a = xs2.forNonError(ws2.IDLE);
        }

        @Override // p000.zb9.InterfaceC16075l
        public void onSubchannelState(xs2 xs2Var) {
            lvc.f58894p.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{xs2Var, this.f58909b.f58920a});
            this.f58908a = xs2Var;
            if (lvc.this.f58899i.isValid() && ((C8989h) lvc.this.f58898h.get(lvc.this.f58899i.getCurrentAddress())).f58922c == this) {
                lvc.this.updateHealthCheckedState(this.f58909b);
            }
        }

        public /* synthetic */ C8984c(lvc lvcVar, C8982a c8982a) {
            this();
        }
    }
}
