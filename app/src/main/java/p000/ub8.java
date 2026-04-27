package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p000.da8;
import p000.no0;
import p000.p42;
import p000.pu1;
import p000.s42;
import p000.thg;
import p000.wr9;

/* JADX INFO: loaded from: classes7.dex */
@kyg
public final class ub8 implements xa8<da8.C4685b>, jhh {

    /* JADX INFO: renamed from: a */
    public final cb8 f87380a;

    /* JADX INFO: renamed from: b */
    public final String f87381b;

    /* JADX INFO: renamed from: c */
    public final String f87382c;

    /* JADX INFO: renamed from: d */
    public final no0.InterfaceC9959a f87383d;

    /* JADX INFO: renamed from: e */
    public final AbstractC13455l f87384e;

    /* JADX INFO: renamed from: f */
    public final s42 f87385f;

    /* JADX INFO: renamed from: g */
    public final ScheduledExecutorService f87386g;

    /* JADX INFO: renamed from: h */
    public final da8 f87387h;

    /* JADX INFO: renamed from: i */
    public final vn1 f87388i;

    /* JADX INFO: renamed from: j */
    public final zu1 f87389j;

    /* JADX INFO: renamed from: k */
    public final pu1 f87390k;

    /* JADX INFO: renamed from: l */
    public final List<t42> f87391l;

    /* JADX INFO: renamed from: m */
    public final thg f87392m;

    /* JADX INFO: renamed from: n */
    public final C13456m f87393n;

    /* JADX INFO: renamed from: o */
    public volatile List<s45> f87394o;

    /* JADX INFO: renamed from: p */
    public no0 f87395p;

    /* JADX INFO: renamed from: q */
    public final d5g f87396q;

    /* JADX INFO: renamed from: r */
    @eib
    public thg.C13053d f87397r;

    /* JADX INFO: renamed from: s */
    @eib
    public thg.C13053d f87398s;

    /* JADX INFO: renamed from: t */
    @eib
    public wr9 f87399t;

    /* JADX INFO: renamed from: w */
    @eib
    public qr2 f87402w;

    /* JADX INFO: renamed from: x */
    @eib
    public volatile wr9 f87403x;

    /* JADX INFO: renamed from: z */
    public n4g f87405z;

    /* JADX INFO: renamed from: u */
    public final Collection<qr2> f87400u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public final cz7<qr2> f87401v = new C13444a();

    /* JADX INFO: renamed from: y */
    public volatile xs2 f87404y = xs2.forNonError(ws2.IDLE);

    /* JADX INFO: renamed from: ub8$a */
    public class C13444a extends cz7<qr2> {
        public C13444a() {
        }

        @Override // p000.cz7
        /* JADX INFO: renamed from: a */
        public void mo8796a() {
            ub8.this.f87384e.mo20613a(ub8.this);
        }

        @Override // p000.cz7
        /* JADX INFO: renamed from: b */
        public void mo8797b() {
            ub8.this.f87384e.mo20614b(ub8.this);
        }
    }

    /* JADX INFO: renamed from: ub8$b */
    public class RunnableC13445b implements Runnable {
        public RunnableC13445b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ub8.this.f87397r = null;
            ub8.this.f87390k.log(pu1.EnumC11124a.INFO, "CONNECTING after backoff");
            ub8.this.gotoNonErrorState(ws2.CONNECTING);
            ub8.this.startNewTransport();
        }
    }

    /* JADX INFO: renamed from: ub8$c */
    public class RunnableC13446c implements Runnable {
        public RunnableC13446c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ub8.this.f87404y.getState() == ws2.IDLE) {
                ub8.this.f87390k.log(pu1.EnumC11124a.INFO, "CONNECTING as requested");
                ub8.this.gotoNonErrorState(ws2.CONNECTING);
                ub8.this.startNewTransport();
            }
        }
    }

    /* JADX INFO: renamed from: ub8$d */
    public class RunnableC13447d implements Runnable {
        public RunnableC13447d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ub8.this.f87404y.getState() != ws2.TRANSIENT_FAILURE) {
                return;
            }
            ub8.this.cancelReconnectTask();
            ub8.this.f87390k.log(pu1.EnumC11124a.INFO, "CONNECTING; backoff interrupted");
            ub8.this.gotoNonErrorState(ws2.CONNECTING);
            ub8.this.startNewTransport();
        }
    }

    /* JADX INFO: renamed from: ub8$e */
    public class RunnableC13448e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f87410a;

        /* JADX INFO: renamed from: ub8$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                wr9 wr9Var = ub8.this.f87399t;
                ub8.this.f87398s = null;
                ub8.this.f87399t = null;
                wr9Var.shutdown(n4g.f63273t.withDescription("InternalSubchannel closed transport due to address change"));
            }
        }

        public RunnableC13448e(List list) {
            this.f87410a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            wr9 wr9Var;
            SocketAddress currentAddress = ub8.this.f87393n.getCurrentAddress();
            ub8.this.f87393n.updateGroups(this.f87410a);
            ub8.this.f87394o = this.f87410a;
            ws2 state = ub8.this.f87404y.getState();
            ws2 ws2Var = ws2.READY;
            if ((state != ws2Var && ub8.this.f87404y.getState() != ws2.CONNECTING) || ub8.this.f87393n.seekTo(currentAddress)) {
                wr9Var = null;
            } else if (ub8.this.f87404y.getState() == ws2Var) {
                wr9Var = ub8.this.f87403x;
                ub8.this.f87403x = null;
                ub8.this.f87393n.reset();
                ub8.this.gotoNonErrorState(ws2.IDLE);
            } else {
                ub8.this.f87402w.shutdown(n4g.f63273t.withDescription("InternalSubchannel closed pending transport due to address change"));
                ub8.this.f87402w = null;
                ub8.this.f87393n.reset();
                ub8.this.startNewTransport();
                wr9Var = null;
            }
            if (wr9Var != null) {
                if (ub8.this.f87398s != null) {
                    ub8.this.f87399t.shutdown(n4g.f63273t.withDescription("InternalSubchannel closed transport early due to address change"));
                    ub8.this.f87398s.cancel();
                    ub8.this.f87398s = null;
                    ub8.this.f87399t = null;
                }
                ub8.this.f87399t = wr9Var;
                ub8 ub8Var = ub8.this;
                ub8Var.f87398s = ub8Var.f87392m.schedule(new a(), 5L, TimeUnit.SECONDS, ub8.this.f87386g);
            }
        }
    }

    /* JADX INFO: renamed from: ub8$f */
    public class RunnableC13449f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n4g f87413a;

        public RunnableC13449f(n4g n4gVar) {
            this.f87413a = n4gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ws2 state = ub8.this.f87404y.getState();
            ws2 ws2Var = ws2.SHUTDOWN;
            if (state == ws2Var) {
                return;
            }
            ub8.this.f87405z = this.f87413a;
            wr9 wr9Var = ub8.this.f87403x;
            qr2 qr2Var = ub8.this.f87402w;
            ub8.this.f87403x = null;
            ub8.this.f87402w = null;
            ub8.this.gotoNonErrorState(ws2Var);
            ub8.this.f87393n.reset();
            if (ub8.this.f87400u.isEmpty()) {
                ub8.this.handleTermination();
            }
            ub8.this.cancelReconnectTask();
            if (ub8.this.f87398s != null) {
                ub8.this.f87398s.cancel();
                ub8.this.f87399t.shutdown(this.f87413a);
                ub8.this.f87398s = null;
                ub8.this.f87399t = null;
            }
            if (wr9Var != null) {
                wr9Var.shutdown(this.f87413a);
            }
            if (qr2Var != null) {
                qr2Var.shutdown(this.f87413a);
            }
        }
    }

    /* JADX INFO: renamed from: ub8$g */
    public class RunnableC13450g implements Runnable {
        public RunnableC13450g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ub8.this.f87390k.log(pu1.EnumC11124a.INFO, "Terminated");
            ub8.this.f87384e.mo20603d(ub8.this);
        }
    }

    /* JADX INFO: renamed from: ub8$h */
    public class RunnableC13451h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qr2 f87416a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f87417b;

        public RunnableC13451h(qr2 qr2Var, boolean z) {
            this.f87416a = qr2Var;
            this.f87417b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ub8.this.f87401v.updateObjectInUse(this.f87416a, this.f87417b);
        }
    }

    /* JADX INFO: renamed from: ub8$i */
    public class RunnableC13452i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n4g f87419a;

        public RunnableC13452i(n4g n4gVar) {
            this.f87419a = n4gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(ub8.this.f87400u).iterator();
            while (it.hasNext()) {
                ((wr9) it.next()).shutdownNow(this.f87419a);
            }
        }
    }

    /* JADX INFO: renamed from: ub8$j */
    public class RunnableC13453j implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y6f f87421a;

        public RunnableC13453j(y6f y6fVar) {
            this.f87421a = y6fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            da8.C4685b.a aVar = new da8.C4685b.a();
            List<s45> groups = ub8.this.f87393n.getGroups();
            ArrayList arrayList = new ArrayList(ub8.this.f87400u);
            aVar.setTarget(groups.toString()).setState(ub8.this.m23209J());
            aVar.setSockets(arrayList);
            ub8.this.f87388i.m24076a(aVar);
            ub8.this.f87389j.m27094g(aVar);
            this.f87421a.set(aVar.build());
        }
    }

    /* JADX INFO: renamed from: ub8$k */
    @gdi
    public static final class C13454k extends or6 {

        /* JADX INFO: renamed from: a */
        public final qr2 f87423a;

        /* JADX INFO: renamed from: b */
        public final vn1 f87424b;

        /* JADX INFO: renamed from: ub8$k$a */
        public class a extends hr6 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ o42 f87425a;

            /* JADX INFO: renamed from: ub8$k$a$a, reason: collision with other inner class name */
            public class C16538a extends ir6 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ p42 f87427a;

                public C16538a(p42 p42Var) {
                    this.f87427a = p42Var;
                }

                @Override // p000.ir6
                /* JADX INFO: renamed from: a */
                public p42 mo13346a() {
                    return this.f87427a;
                }

                @Override // p000.ir6, p000.p42
                public void closed(n4g n4gVar, p42.EnumC10788a enumC10788a, fta ftaVar) {
                    C13454k.this.f87424b.reportCallEnded(n4gVar.isOk());
                    super.closed(n4gVar, enumC10788a, ftaVar);
                }
            }

            public a(o42 o42Var) {
                this.f87425a = o42Var;
            }

            @Override // p000.hr6
            /* JADX INFO: renamed from: a */
            public o42 mo12579a() {
                return this.f87425a;
            }

            @Override // p000.hr6, p000.o42
            public void start(p42 p42Var) {
                C13454k.this.f87424b.reportCallStarted();
                super.start(new C16538a(p42Var));
            }
        }

        public /* synthetic */ C13454k(qr2 qr2Var, vn1 vn1Var, C13444a c13444a) {
            this(qr2Var, vn1Var);
        }

        @Override // p000.or6
        /* JADX INFO: renamed from: a */
        public qr2 mo18816a() {
            return this.f87423a;
        }

        @Override // p000.or6, p000.r42
        public o42 newStream(rua<?, ?> ruaVar, fta ftaVar, rn1 rn1Var, q42[] q42VarArr) {
            return new a(super.newStream(ruaVar, ftaVar, rn1Var, q42VarArr));
        }

        private C13454k(qr2 qr2Var, vn1 vn1Var) {
            this.f87423a = qr2Var;
            this.f87424b = vn1Var;
        }
    }

    /* JADX INFO: renamed from: ub8$l */
    public static abstract class AbstractC13455l {
        @vp6
        /* JADX INFO: renamed from: a */
        public void mo20613a(ub8 ub8Var) {
        }

        @vp6
        /* JADX INFO: renamed from: b */
        public void mo20614b(ub8 ub8Var) {
        }

        @vp6
        /* JADX INFO: renamed from: c */
        public void mo20602c(ub8 ub8Var, xs2 xs2Var) {
        }

        @vp6
        /* JADX INFO: renamed from: d */
        public void mo20603d(ub8 ub8Var) {
        }
    }

    /* JADX INFO: renamed from: ub8$m */
    @gdi
    public static final class C13456m {

        /* JADX INFO: renamed from: a */
        public List<s45> f87429a;

        /* JADX INFO: renamed from: b */
        public int f87430b;

        /* JADX INFO: renamed from: c */
        public int f87431c;

        public C13456m(List<s45> list) {
            this.f87429a = list;
        }

        public SocketAddress getCurrentAddress() {
            return this.f87429a.get(this.f87430b).getAddresses().get(this.f87431c);
        }

        public sc0 getCurrentEagAttributes() {
            return this.f87429a.get(this.f87430b).getAttributes();
        }

        public List<s45> getGroups() {
            return this.f87429a;
        }

        public void increment() {
            s45 s45Var = this.f87429a.get(this.f87430b);
            int i = this.f87431c + 1;
            this.f87431c = i;
            if (i >= s45Var.getAddresses().size()) {
                this.f87430b++;
                this.f87431c = 0;
            }
        }

        public boolean isAtBeginning() {
            return this.f87430b == 0 && this.f87431c == 0;
        }

        public boolean isValid() {
            return this.f87430b < this.f87429a.size();
        }

        public void reset() {
            this.f87430b = 0;
            this.f87431c = 0;
        }

        public boolean seekTo(SocketAddress socketAddress) {
            for (int i = 0; i < this.f87429a.size(); i++) {
                int iIndexOf = this.f87429a.get(i).getAddresses().indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.f87430b = i;
                    this.f87431c = iIndexOf;
                    return true;
                }
            }
            return false;
        }

        public void updateGroups(List<s45> list) {
            this.f87429a = list;
            reset();
        }
    }

    /* JADX INFO: renamed from: ub8$n */
    public class C13457n implements wr9.InterfaceC14756a {

        /* JADX INFO: renamed from: a */
        public final qr2 f87432a;

        /* JADX INFO: renamed from: b */
        public boolean f87433b = false;

        /* JADX INFO: renamed from: ub8$n$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ub8.this.f87395p = null;
                if (ub8.this.f87405z != null) {
                    v7d.checkState(ub8.this.f87403x == null, "Unexpected non-null activeTransport");
                    C13457n c13457n = C13457n.this;
                    c13457n.f87432a.shutdown(ub8.this.f87405z);
                    return;
                }
                qr2 qr2Var = ub8.this.f87402w;
                C13457n c13457n2 = C13457n.this;
                qr2 qr2Var2 = c13457n2.f87432a;
                if (qr2Var == qr2Var2) {
                    ub8.this.f87403x = qr2Var2;
                    ub8.this.f87402w = null;
                    ub8.this.gotoNonErrorState(ws2.READY);
                }
            }
        }

        /* JADX INFO: renamed from: ub8$n$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ n4g f87436a;

            public b(n4g n4gVar) {
                this.f87436a = n4gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (ub8.this.f87404y.getState() == ws2.SHUTDOWN) {
                    return;
                }
                wr9 wr9Var = ub8.this.f87403x;
                C13457n c13457n = C13457n.this;
                if (wr9Var == c13457n.f87432a) {
                    ub8.this.f87403x = null;
                    ub8.this.f87393n.reset();
                    ub8.this.gotoNonErrorState(ws2.IDLE);
                    return;
                }
                qr2 qr2Var = ub8.this.f87402w;
                C13457n c13457n2 = C13457n.this;
                if (qr2Var == c13457n2.f87432a) {
                    v7d.checkState(ub8.this.f87404y.getState() == ws2.CONNECTING, "Expected state is CONNECTING, actual state is %s", ub8.this.f87404y.getState());
                    ub8.this.f87393n.increment();
                    if (ub8.this.f87393n.isValid()) {
                        ub8.this.startNewTransport();
                        return;
                    }
                    ub8.this.f87402w = null;
                    ub8.this.f87393n.reset();
                    ub8.this.scheduleBackoff(this.f87436a);
                }
            }
        }

        /* JADX INFO: renamed from: ub8$n$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ub8.this.f87400u.remove(C13457n.this.f87432a);
                if (ub8.this.f87404y.getState() == ws2.SHUTDOWN && ub8.this.f87400u.isEmpty()) {
                    ub8.this.handleTermination();
                }
            }
        }

        public C13457n(qr2 qr2Var) {
            this.f87432a = qr2Var;
        }

        @Override // p000.wr9.InterfaceC14756a
        public sc0 filterTransport(sc0 sc0Var) {
            for (t42 t42Var : ub8.this.f87391l) {
                sc0Var = (sc0) v7d.checkNotNull(t42Var.transportReady(sc0Var), "Filter %s returned null", t42Var);
            }
            return sc0Var;
        }

        @Override // p000.wr9.InterfaceC14756a
        public void transportInUse(boolean z) {
            ub8.this.handleTransportInUseState(this.f87432a, z);
        }

        @Override // p000.wr9.InterfaceC14756a
        public void transportReady() {
            ub8.this.f87390k.log(pu1.EnumC11124a.INFO, "READY");
            ub8.this.f87392m.execute(new a());
        }

        @Override // p000.wr9.InterfaceC14756a
        public void transportShutdown(n4g n4gVar) {
            ub8.this.f87390k.log(pu1.EnumC11124a.INFO, "{0} SHUTDOWN with {1}", this.f87432a.getLogId(), ub8.this.printShortStatus(n4gVar));
            this.f87433b = true;
            ub8.this.f87392m.execute(new b(n4gVar));
        }

        @Override // p000.wr9.InterfaceC14756a
        public void transportTerminated() {
            v7d.checkState(this.f87433b, "transportShutdown() must be called before transportTerminated().");
            ub8.this.f87390k.log(pu1.EnumC11124a.INFO, "{0} Terminated", this.f87432a.getLogId());
            ub8.this.f87387h.removeClientSocket(this.f87432a);
            ub8.this.handleTransportInUseState(this.f87432a, false);
            Iterator it = ub8.this.f87391l.iterator();
            while (it.hasNext()) {
                ((t42) it.next()).transportTerminated(this.f87432a.getAttributes());
            }
            ub8.this.f87392m.execute(new c());
        }
    }

    /* JADX INFO: renamed from: ub8$o */
    @gdi
    public static final class C13458o extends pu1 {

        /* JADX INFO: renamed from: a */
        public cb8 f87439a;

        @Override // p000.pu1
        public void log(pu1.EnumC11124a enumC11124a, String str) {
            qu1.m20662a(this.f87439a, enumC11124a, str);
        }

        @Override // p000.pu1
        public void log(pu1.EnumC11124a enumC11124a, String str, Object... objArr) {
            qu1.m20663b(this.f87439a, enumC11124a, str, objArr);
        }
    }

    public ub8(List<s45> list, String str, String str2, no0.InterfaceC9959a interfaceC9959a, s42 s42Var, ScheduledExecutorService scheduledExecutorService, lfg<d5g> lfgVar, thg thgVar, AbstractC13455l abstractC13455l, da8 da8Var, vn1 vn1Var, zu1 zu1Var, cb8 cb8Var, pu1 pu1Var, List<t42> list2) {
        v7d.checkNotNull(list, "addressGroups");
        v7d.checkArgument(!list.isEmpty(), "addressGroups is empty");
        checkListHasNoNulls(list, "addressGroups contains null entry");
        List<s45> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f87394o = listUnmodifiableList;
        this.f87393n = new C13456m(listUnmodifiableList);
        this.f87381b = str;
        this.f87382c = str2;
        this.f87383d = interfaceC9959a;
        this.f87385f = s42Var;
        this.f87386g = scheduledExecutorService;
        this.f87396q = lfgVar.get();
        this.f87392m = thgVar;
        this.f87384e = abstractC13455l;
        this.f87387h = da8Var;
        this.f87388i = vn1Var;
        this.f87389j = (zu1) v7d.checkNotNull(zu1Var, "channelTracer");
        this.f87380a = (cb8) v7d.checkNotNull(cb8Var, "logId");
        this.f87390k = (pu1) v7d.checkNotNull(pu1Var, "channelLogger");
        this.f87391l = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelReconnectTask() {
        this.f87392m.throwIfNotInThisSynchronizationContext();
        thg.C13053d c13053d = this.f87397r;
        if (c13053d != null) {
            c13053d.cancel();
            this.f87397r = null;
            this.f87395p = null;
        }
    }

    private static void checkListHasNoNulls(List<?> list, String str) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            v7d.checkNotNull(it.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotoNonErrorState(ws2 ws2Var) {
        this.f87392m.throwIfNotInThisSynchronizationContext();
        gotoState(xs2.forNonError(ws2Var));
    }

    private void gotoState(xs2 xs2Var) {
        this.f87392m.throwIfNotInThisSynchronizationContext();
        if (this.f87404y.getState() != xs2Var.getState()) {
            v7d.checkState(this.f87404y.getState() != ws2.SHUTDOWN, "Cannot transition out of SHUTDOWN to " + xs2Var);
            this.f87404y = xs2Var;
            this.f87384e.mo20602c(this, xs2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleTermination() {
        this.f87392m.execute(new RunnableC13450g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleTransportInUseState(qr2 qr2Var, boolean z) {
        this.f87392m.execute(new RunnableC13451h(qr2Var, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String printShortStatus(n4g n4gVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(n4gVar.getCode());
        if (n4gVar.getDescription() != null) {
            sb.append(c0b.f15433c);
            sb.append(n4gVar.getDescription());
            sb.append(c0b.f15434d);
        }
        if (n4gVar.getCause() != null) {
            sb.append("[");
            sb.append(n4gVar.getCause());
            sb.append("]");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleBackoff(n4g n4gVar) {
        this.f87392m.throwIfNotInThisSynchronizationContext();
        gotoState(xs2.forTransientFailure(n4gVar));
        if (this.f87395p == null) {
            this.f87395p = this.f87383d.get();
        }
        long jNextBackoffNanos = this.f87395p.nextBackoffNanos();
        d5g d5gVar = this.f87396q;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jElapsed = jNextBackoffNanos - d5gVar.elapsed(timeUnit);
        this.f87390k.log(pu1.EnumC11124a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", printShortStatus(n4gVar), Long.valueOf(jElapsed));
        v7d.checkState(this.f87397r == null, "previous reconnectTask is not done");
        this.f87397r = this.f87392m.schedule(new RunnableC13445b(), jElapsed, timeUnit, this.f87386g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startNewTransport() {
        SocketAddress targetAddress;
        an7 an7Var;
        this.f87392m.throwIfNotInThisSynchronizationContext();
        v7d.checkState(this.f87397r == null, "Should have no reconnectTask scheduled");
        if (this.f87393n.isAtBeginning()) {
            this.f87396q.reset().start();
        }
        SocketAddress currentAddress = this.f87393n.getCurrentAddress();
        C13444a c13444a = null;
        if (currentAddress instanceof an7) {
            an7Var = (an7) currentAddress;
            targetAddress = an7Var.getTargetAddress();
        } else {
            targetAddress = currentAddress;
            an7Var = null;
        }
        sc0 currentEagAttributes = this.f87393n.getCurrentEagAttributes();
        String str = (String) currentEagAttributes.get(s45.f80626d);
        s42.C12428a c12428a = new s42.C12428a();
        if (str == null) {
            str = this.f87381b;
        }
        s42.C12428a httpConnectProxiedSocketAddress = c12428a.setAuthority(str).setEagAttributes(currentEagAttributes).setUserAgent(this.f87382c).setHttpConnectProxiedSocketAddress(an7Var);
        C13458o c13458o = new C13458o();
        c13458o.f87439a = getLogId();
        C13454k c13454k = new C13454k(this.f87385f.newClientTransport(targetAddress, httpConnectProxiedSocketAddress, c13458o), this.f87388i, c13444a);
        c13458o.f87439a = c13454k.getLogId();
        this.f87387h.addClientSocket(c13454k);
        this.f87402w = c13454k;
        this.f87400u.add(c13454k);
        Runnable runnableStart = c13454k.start(new C13457n(c13454k));
        if (runnableStart != null) {
            this.f87392m.executeLater(runnableStart);
        }
        this.f87390k.log(pu1.EnumC11124a.INFO, "Started transport {0}", c13458o.f87439a);
    }

    /* JADX INFO: renamed from: G */
    public List<s45> m23206G() {
        return this.f87394o;
    }

    /* JADX INFO: renamed from: H */
    public String m23207H() {
        return this.f87381b;
    }

    /* JADX INFO: renamed from: I */
    public pu1 m23208I() {
        return this.f87390k;
    }

    /* JADX INFO: renamed from: J */
    public ws2 m23209J() {
        return this.f87404y.getState();
    }

    @eib
    /* JADX INFO: renamed from: K */
    public r42 m23210K() {
        return this.f87403x;
    }

    /* JADX INFO: renamed from: L */
    public void m23211L() {
        this.f87392m.execute(new RunnableC13447d());
    }

    @Override // p000.ac8
    public cb8 getLogId() {
        return this.f87380a;
    }

    @Override // p000.xa8
    public ja9<da8.C4685b> getStats() {
        y6f y6fVarCreate = y6f.create();
        this.f87392m.execute(new RunnableC13453j(y6fVarCreate));
        return y6fVarCreate;
    }

    @Override // p000.jhh
    public r42 obtainActiveTransport() {
        wr9 wr9Var = this.f87403x;
        if (wr9Var != null) {
            return wr9Var;
        }
        this.f87392m.execute(new RunnableC13446c());
        return null;
    }

    public void shutdown(n4g n4gVar) {
        this.f87392m.execute(new RunnableC13449f(n4gVar));
    }

    public void shutdownNow(n4g n4gVar) {
        shutdown(n4gVar);
        this.f87392m.execute(new RunnableC13452i(n4gVar));
    }

    public String toString() {
        return yya.toStringHelper(this).add("logId", this.f87380a.getId()).add("addressGroups", this.f87394o).toString();
    }

    public void updateAddresses(List<s45> list) {
        v7d.checkNotNull(list, "newAddressGroups");
        checkListHasNoNulls(list, "newAddressGroups contains null entry");
        v7d.checkArgument(!list.isEmpty(), "newAddressGroups is empty");
        this.f87392m.execute(new RunnableC13448e(Collections.unmodifiableList(new ArrayList(list))));
    }
}
