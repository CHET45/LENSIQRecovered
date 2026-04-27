package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.shg;

/* JADX INFO: loaded from: classes5.dex */
public final class j65 implements shg.InterfaceC12596c {

    /* JADX INFO: renamed from: a */
    public final shg f49601a;

    /* JADX INFO: renamed from: c */
    public final Set<b65<Void>> f49603c = new HashSet();

    /* JADX INFO: renamed from: d */
    public h5c f49604d = h5c.UNKNOWN;

    /* JADX INFO: renamed from: b */
    public final Map<nld, C7755e> f49602b = new HashMap();

    /* JADX INFO: renamed from: j65$a */
    public static /* synthetic */ class C7751a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49605a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f49606b;

        static {
            int[] iArr = new int[EnumC7753c.values().length];
            f49606b = iArr;
            try {
                iArr[EnumC7753c.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49606b[EnumC7753c.TERMINATE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49606b[EnumC7753c.REQUIRE_WATCH_DISCONNECTION_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC7754d.values().length];
            f49605a = iArr2;
            try {
                iArr2[EnumC7754d.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49605a[EnumC7754d.INITIALIZE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49605a[EnumC7754d.REQUIRE_WATCH_CONNECTION_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: j65$b */
    public static class C7752b {

        /* JADX INFO: renamed from: a */
        public boolean f49607a;

        /* JADX INFO: renamed from: b */
        public boolean f49608b;

        /* JADX INFO: renamed from: c */
        public boolean f49609c;

        /* JADX INFO: renamed from: d */
        public ia9 f49610d = ia9.DEFAULT;
    }

    /* JADX INFO: renamed from: j65$c */
    public enum EnumC7753c {
        TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION,
        TERMINATE_LOCAL_LISTEN_ONLY,
        REQUIRE_WATCH_DISCONNECTION_ONLY,
        NO_ACTION_REQUIRED
    }

    /* JADX INFO: renamed from: j65$d */
    public enum EnumC7754d {
        INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION,
        INITIALIZE_LOCAL_LISTEN_ONLY,
        REQUIRE_WATCH_CONNECTION_ONLY,
        NO_ACTION_REQUIRED
    }

    /* JADX INFO: renamed from: j65$e */
    public static class C7755e {

        /* JADX INFO: renamed from: a */
        public final List<nmd> f49621a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public lbi f49622b;

        /* JADX INFO: renamed from: c */
        public int f49623c;

        /* JADX INFO: renamed from: f */
        public boolean m13749f() {
            Iterator<nmd> it = this.f49621a.iterator();
            while (it.hasNext()) {
                if (it.next().listensToRemoteStore()) {
                    return true;
                }
            }
            return false;
        }
    }

    public j65(shg shgVar) {
        this.f49601a = shgVar;
        shgVar.setCallback(this);
    }

    private void raiseSnapshotsInSyncEvent() {
        Iterator<b65<Void>> it = this.f49603c.iterator();
        while (it.hasNext()) {
            it.next().onEvent(null, null);
        }
    }

    public int addQueryListener(nmd nmdVar) {
        nld query = nmdVar.getQuery();
        EnumC7754d enumC7754d = EnumC7754d.NO_ACTION_REQUIRED;
        C7755e c7755e = this.f49602b.get(query);
        if (c7755e == null) {
            c7755e = new C7755e();
            this.f49602b.put(query, c7755e);
            enumC7754d = nmdVar.listensToRemoteStore() ? EnumC7754d.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION : EnumC7754d.INITIALIZE_LOCAL_LISTEN_ONLY;
        } else if (!c7755e.m13749f() && nmdVar.listensToRemoteStore()) {
            enumC7754d = EnumC7754d.REQUIRE_WATCH_CONNECTION_ONLY;
        }
        c7755e.f49621a.add(nmdVar);
        r80.hardAssert(!nmdVar.onOnlineStateChanged(this.f49604d), "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
        if (c7755e.f49622b != null && nmdVar.onViewSnapshot(c7755e.f49622b)) {
            raiseSnapshotsInSyncEvent();
        }
        int i = C7751a.f49605a[enumC7754d.ordinal()];
        if (i == 1) {
            c7755e.f49623c = this.f49601a.listen(query, true);
        } else if (i == 2) {
            c7755e.f49623c = this.f49601a.listen(query, false);
        } else if (i == 3) {
            this.f49601a.listenToRemoteStore(query);
        }
        return c7755e.f49623c;
    }

    public void addSnapshotsInSyncListener(b65<Void> b65Var) {
        this.f49603c.add(b65Var);
        b65Var.onEvent(null, null);
    }

    @Override // p000.shg.InterfaceC12596c
    public void handleOnlineStateChange(h5c h5cVar) {
        this.f49604d = h5cVar;
        Iterator<C7755e> it = this.f49602b.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Iterator it2 = it.next().f49621a.iterator();
            while (it2.hasNext()) {
                if (((nmd) it2.next()).onOnlineStateChanged(h5cVar)) {
                    z = true;
                }
            }
        }
        if (z) {
            raiseSnapshotsInSyncEvent();
        }
    }

    @Override // p000.shg.InterfaceC12596c
    public void onError(nld nldVar, n4g n4gVar) {
        C7755e c7755e = this.f49602b.get(nldVar);
        if (c7755e != null) {
            Iterator it = c7755e.f49621a.iterator();
            while (it.hasNext()) {
                ((nmd) it.next()).onError(r0i.exceptionFromStatus(n4gVar));
            }
        }
        this.f49602b.remove(nldVar);
    }

    @Override // p000.shg.InterfaceC12596c
    public void onViewSnapshots(List<lbi> list) {
        boolean z = false;
        for (lbi lbiVar : list) {
            C7755e c7755e = this.f49602b.get(lbiVar.getQuery());
            if (c7755e != null) {
                Iterator it = c7755e.f49621a.iterator();
                while (it.hasNext()) {
                    if (((nmd) it.next()).onViewSnapshot(lbiVar)) {
                        z = true;
                    }
                }
                c7755e.f49622b = lbiVar;
            }
        }
        if (z) {
            raiseSnapshotsInSyncEvent();
        }
    }

    public void removeQueryListener(nmd nmdVar) {
        nld query = nmdVar.getQuery();
        C7755e c7755e = this.f49602b.get(query);
        EnumC7753c enumC7753c = EnumC7753c.NO_ACTION_REQUIRED;
        if (c7755e == null) {
            return;
        }
        c7755e.f49621a.remove(nmdVar);
        if (c7755e.f49621a.isEmpty()) {
            enumC7753c = nmdVar.listensToRemoteStore() ? EnumC7753c.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION : EnumC7753c.TERMINATE_LOCAL_LISTEN_ONLY;
        } else if (!c7755e.m13749f() && nmdVar.listensToRemoteStore()) {
            enumC7753c = EnumC7753c.REQUIRE_WATCH_DISCONNECTION_ONLY;
        }
        int i = C7751a.f49606b[enumC7753c.ordinal()];
        if (i == 1) {
            this.f49602b.remove(query);
            this.f49601a.m22005a(query, true);
        } else if (i == 2) {
            this.f49602b.remove(query);
            this.f49601a.m22005a(query, false);
        } else {
            if (i != 3) {
                return;
            }
            this.f49601a.m22006b(query);
        }
    }

    public void removeSnapshotsInSyncListener(b65<Void> b65Var) {
        this.f49603c.remove(b65Var);
    }
}
