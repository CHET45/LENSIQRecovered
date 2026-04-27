package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
public final class nvc extends zb9 {

    /* JADX INFO: renamed from: g */
    public final zb9.AbstractC16069f f65819g;

    /* JADX INFO: renamed from: h */
    public zb9.AbstractC16073j f65820h;

    /* JADX INFO: renamed from: i */
    public ws2 f65821i = ws2.IDLE;

    /* JADX INFO: renamed from: nvc$a */
    public class C10084a implements zb9.InterfaceC16075l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zb9.AbstractC16073j f65822a;

        public C10084a(zb9.AbstractC16073j abstractC16073j) {
            this.f65822a = abstractC16073j;
        }

        @Override // p000.zb9.InterfaceC16075l
        public void onSubchannelState(xs2 xs2Var) {
            nvc.this.processSubchannelState(this.f65822a, xs2Var);
        }
    }

    /* JADX INFO: renamed from: nvc$b */
    public static /* synthetic */ class C10085b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65824a;

        static {
            int[] iArr = new int[ws2.values().length];
            f65824a = iArr;
            try {
                iArr[ws2.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65824a[ws2.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65824a[ws2.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65824a[ws2.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: nvc$c */
    public static final class C10086c {

        /* JADX INFO: renamed from: a */
        @eib
        public final Boolean f65825a;

        /* JADX INFO: renamed from: b */
        @eib
        public final Long f65826b;

        public C10086c(@eib Boolean bool) {
            this(bool, null);
        }

        public C10086c(@eib Boolean bool, @eib Long l) {
            this.f65825a = bool;
            this.f65826b = l;
        }
    }

    /* JADX INFO: renamed from: nvc$d */
    public static final class C10087d extends zb9.AbstractC16074k {

        /* JADX INFO: renamed from: a */
        public final zb9.C16070g f65827a;

        public C10087d(zb9.C16070g c16070g) {
            this.f65827a = (zb9.C16070g) v7d.checkNotNull(c16070g, "result");
        }

        @Override // p000.zb9.AbstractC16074k
        public zb9.C16070g pickSubchannel(zb9.AbstractC16071h abstractC16071h) {
            return this.f65827a;
        }

        public String toString() {
            return yya.toStringHelper((Class<?>) C10087d.class).add("result", this.f65827a).toString();
        }
    }

    /* JADX INFO: renamed from: nvc$e */
    public final class C10088e extends zb9.AbstractC16074k {

        /* JADX INFO: renamed from: a */
        public final zb9.AbstractC16073j f65828a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f65829b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: nvc$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C10088e.this.f65828a.requestConnection();
            }
        }

        public C10088e(zb9.AbstractC16073j abstractC16073j) {
            this.f65828a = (zb9.AbstractC16073j) v7d.checkNotNull(abstractC16073j, "subchannel");
        }

        @Override // p000.zb9.AbstractC16074k
        public zb9.C16070g pickSubchannel(zb9.AbstractC16071h abstractC16071h) {
            if (this.f65829b.compareAndSet(false, true)) {
                nvc.this.f65819g.getSynchronizationContext().execute(new a());
            }
            return zb9.C16070g.withNoResult();
        }
    }

    public nvc(zb9.AbstractC16069f abstractC16069f) {
        this.f65819g = (zb9.AbstractC16069f) v7d.checkNotNull(abstractC16069f, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processSubchannelState(zb9.AbstractC16073j abstractC16073j, xs2 xs2Var) {
        zb9.AbstractC16074k c10088e;
        zb9.AbstractC16074k c10087d;
        ws2 state = xs2Var.getState();
        if (state == ws2.SHUTDOWN) {
            return;
        }
        ws2 ws2Var = ws2.TRANSIENT_FAILURE;
        if (state == ws2Var || state == ws2.IDLE) {
            this.f65819g.refreshNameResolution();
        }
        if (this.f65821i == ws2Var) {
            if (state == ws2.CONNECTING) {
                return;
            }
            if (state == ws2.IDLE) {
                requestConnection();
                return;
            }
        }
        int i = C10085b.f65824a[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c10087d = new C10087d(zb9.C16070g.withNoResult());
            } else if (i == 3) {
                c10088e = new C10087d(zb9.C16070g.withSubchannel(abstractC16073j));
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException("Unsupported state:" + state);
                }
                c10087d = new C10087d(zb9.C16070g.withError(xs2Var.getStatus()));
            }
            updateBalancingState(state, c10087d);
        }
        c10088e = new C10088e(abstractC16073j);
        c10087d = c10088e;
        updateBalancingState(state, c10087d);
    }

    private void updateBalancingState(ws2 ws2Var, zb9.AbstractC16074k abstractC16074k) {
        this.f65821i = ws2Var;
        this.f65819g.updateBalancingState(ws2Var, abstractC16074k);
    }

    @Override // p000.zb9
    public n4g acceptResolvedAddresses(zb9.C16072i c16072i) {
        C10086c c10086c;
        Boolean bool;
        List<s45> addresses = c16072i.getAddresses();
        if (addresses.isEmpty()) {
            n4g n4gVarWithDescription = n4g.f63273t.withDescription("NameResolver returned no usable address. addrs=" + c16072i.getAddresses() + ", attrs=" + c16072i.getAttributes());
            handleNameResolutionError(n4gVarWithDescription);
            return n4gVarWithDescription;
        }
        if ((c16072i.getLoadBalancingPolicyConfig() instanceof C10086c) && (bool = (c10086c = (C10086c) c16072i.getLoadBalancingPolicyConfig()).f65825a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(addresses);
            Collections.shuffle(arrayList, c10086c.f65826b != null ? new Random(c10086c.f65826b.longValue()) : new Random());
            addresses = arrayList;
        }
        zb9.AbstractC16073j abstractC16073j = this.f65820h;
        if (abstractC16073j == null) {
            zb9.AbstractC16073j abstractC16073jCreateSubchannel = this.f65819g.createSubchannel(zb9.C16065b.newBuilder().setAddresses(addresses).build());
            abstractC16073jCreateSubchannel.start(new C10084a(abstractC16073jCreateSubchannel));
            this.f65820h = abstractC16073jCreateSubchannel;
            updateBalancingState(ws2.CONNECTING, new C10087d(zb9.C16070g.withSubchannel(abstractC16073jCreateSubchannel)));
            abstractC16073jCreateSubchannel.requestConnection();
        } else {
            abstractC16073j.updateAddresses(addresses);
        }
        return n4g.f63258e;
    }

    @Override // p000.zb9
    public void handleNameResolutionError(n4g n4gVar) {
        zb9.AbstractC16073j abstractC16073j = this.f65820h;
        if (abstractC16073j != null) {
            abstractC16073j.shutdown();
            this.f65820h = null;
        }
        updateBalancingState(ws2.TRANSIENT_FAILURE, new C10087d(zb9.C16070g.withError(n4gVar)));
    }

    @Override // p000.zb9
    public void requestConnection() {
        zb9.AbstractC16073j abstractC16073j = this.f65820h;
        if (abstractC16073j != null) {
            abstractC16073j.requestConnection();
        }
    }

    @Override // p000.zb9
    public void shutdown() {
        zb9.AbstractC16073j abstractC16073j = this.f65820h;
        if (abstractC16073j != null) {
            abstractC16073j.shutdown();
        }
    }
}
