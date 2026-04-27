package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.bya;
import p000.g4f;
import p000.gy7;
import p000.ra9;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public final class s4f implements t4f {

    /* JADX INFO: renamed from: c */
    public static final Logger f80635c = Logger.getLogger(s4f.class.getName());

    /* JADX INFO: renamed from: d */
    public static final ra9.InterfaceC11965a<AbstractC12439d> f80636d = new C12436a();

    /* JADX INFO: renamed from: e */
    public static final ra9.InterfaceC11965a<AbstractC12439d> f80637e = new C12437b();

    /* JADX INFO: renamed from: a */
    public final C12442g f80638a;

    /* JADX INFO: renamed from: b */
    public final kx7<g4f> f80639b;

    /* JADX INFO: renamed from: s4f$a */
    public class C12436a implements ra9.InterfaceC11965a<AbstractC12439d> {
        public String toString() {
            return "healthy()";
        }

        @Override // p000.ra9.InterfaceC11965a
        public void call(AbstractC12439d listener) {
            listener.healthy();
        }
    }

    /* JADX INFO: renamed from: s4f$b */
    public class C12437b implements ra9.InterfaceC11965a<AbstractC12439d> {
        public String toString() {
            return "stopped()";
        }

        @Override // p000.ra9.InterfaceC11965a
        public void call(AbstractC12439d listener) {
            listener.stopped();
        }
    }

    /* JADX INFO: renamed from: s4f$c */
    public static final class C12438c extends Throwable {
        private C12438c() {
        }

        public /* synthetic */ C12438c(C12436a c12436a) {
            this();
        }
    }

    /* JADX INFO: renamed from: s4f$d */
    public static abstract class AbstractC12439d {
        public void failure(g4f service) {
        }

        public void healthy() {
        }

        public void stopped() {
        }
    }

    /* JADX INFO: renamed from: s4f$e */
    public static final class C12440e extends AbstractC6698h4 {
        private C12440e() {
        }

        @Override // p000.AbstractC6698h4
        /* JADX INFO: renamed from: c */
        public void mo2911c() {
            m12129f();
        }

        @Override // p000.AbstractC6698h4
        /* JADX INFO: renamed from: d */
        public void mo2912d() {
            m12130g();
        }

        public /* synthetic */ C12440e(C12436a c12436a) {
            this();
        }
    }

    /* JADX INFO: renamed from: s4f$f */
    public static final class C12441f extends g4f.AbstractC6129a {

        /* JADX INFO: renamed from: a */
        public final g4f f80640a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<C12442g> f80641b;

        public C12441f(g4f service, WeakReference<C12442g> state) {
            this.f80640a = service;
            this.f80641b = state;
        }

        @Override // p000.g4f.AbstractC6129a
        public void failed(g4f.EnumC6130b from, Throwable failure) {
            C12442g c12442g = this.f80641b.get();
            if (c12442g != null) {
                if (!(this.f80640a instanceof C12440e)) {
                    s4f.f80635c.log(Level.SEVERE, "Service " + this.f80640a + " has failed in the " + from + " state.", failure);
                }
                c12442g.m21734n(this.f80640a, from, g4f.EnumC6130b.FAILED);
            }
        }

        @Override // p000.g4f.AbstractC6129a
        public void running() {
            C12442g c12442g = this.f80641b.get();
            if (c12442g != null) {
                c12442g.m21734n(this.f80640a, g4f.EnumC6130b.STARTING, g4f.EnumC6130b.RUNNING);
            }
        }

        @Override // p000.g4f.AbstractC6129a
        public void starting() {
            C12442g c12442g = this.f80641b.get();
            if (c12442g != null) {
                c12442g.m21734n(this.f80640a, g4f.EnumC6130b.NEW, g4f.EnumC6130b.STARTING);
                if (this.f80640a instanceof C12440e) {
                    return;
                }
                s4f.f80635c.log(Level.FINE, "Starting {0}.", this.f80640a);
            }
        }

        @Override // p000.g4f.AbstractC6129a
        public void stopping(g4f.EnumC6130b from) {
            C12442g c12442g = this.f80641b.get();
            if (c12442g != null) {
                c12442g.m21734n(this.f80640a, from, g4f.EnumC6130b.STOPPING);
            }
        }

        @Override // p000.g4f.AbstractC6129a
        public void terminated(g4f.EnumC6130b from) {
            C12442g c12442g = this.f80641b.get();
            if (c12442g != null) {
                if (!(this.f80640a instanceof C12440e)) {
                    s4f.f80635c.log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.f80640a, from});
                }
                c12442g.m21734n(this.f80640a, from, g4f.EnumC6130b.TERMINATED);
            }
        }
    }

    /* JADX INFO: renamed from: s4f$g */
    public static final class C12442g {

        /* JADX INFO: renamed from: a */
        public final bya f80642a = new bya();

        /* JADX INFO: renamed from: b */
        @uc7("monitor")
        public final p6f<g4f.EnumC6130b, g4f> f80643b;

        /* JADX INFO: renamed from: c */
        @uc7("monitor")
        public final d4b<g4f.EnumC6130b> f80644c;

        /* JADX INFO: renamed from: d */
        @uc7("monitor")
        public final Map<g4f, d5g> f80645d;

        /* JADX INFO: renamed from: e */
        @uc7("monitor")
        public boolean f80646e;

        /* JADX INFO: renamed from: f */
        @uc7("monitor")
        public boolean f80647f;

        /* JADX INFO: renamed from: g */
        public final int f80648g;

        /* JADX INFO: renamed from: h */
        public final bya.AbstractC2103a f80649h;

        /* JADX INFO: renamed from: i */
        public final bya.AbstractC2103a f80650i;

        /* JADX INFO: renamed from: j */
        public final ra9<AbstractC12439d> f80651j;

        /* JADX INFO: renamed from: s4f$g$a */
        public class a implements lz6<Map.Entry<g4f, Long>, Long> {
            public a(final C12442g this$0) {
            }

            @Override // p000.lz6
            public Long apply(Map.Entry<g4f, Long> input) {
                return input.getValue();
            }
        }

        /* JADX INFO: renamed from: s4f$g$b */
        public class b implements ra9.InterfaceC11965a<AbstractC12439d> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ g4f f80652a;

            public b(final C12442g this$0, final g4f val$service) {
                this.f80652a = val$service;
            }

            public String toString() {
                return "failed({service=" + this.f80652a + "})";
            }

            @Override // p000.ra9.InterfaceC11965a
            public void call(AbstractC12439d listener) {
                listener.failure(this.f80652a);
            }
        }

        /* JADX INFO: renamed from: s4f$g$c */
        public final class c extends bya.AbstractC2103a {
            public c() {
                super(C12442g.this.f80642a);
            }

            @Override // p000.bya.AbstractC2103a
            @uc7("ServiceManagerState.this.monitor")
            public boolean isSatisfied() {
                int iCount = C12442g.this.f80644c.count(g4f.EnumC6130b.RUNNING);
                C12442g c12442g = C12442g.this;
                return iCount == c12442g.f80648g || c12442g.f80644c.contains(g4f.EnumC6130b.STOPPING) || C12442g.this.f80644c.contains(g4f.EnumC6130b.TERMINATED) || C12442g.this.f80644c.contains(g4f.EnumC6130b.FAILED);
            }
        }

        /* JADX INFO: renamed from: s4f$g$d */
        public final class d extends bya.AbstractC2103a {
            public d() {
                super(C12442g.this.f80642a);
            }

            @Override // p000.bya.AbstractC2103a
            @uc7("ServiceManagerState.this.monitor")
            public boolean isSatisfied() {
                return C12442g.this.f80644c.count(g4f.EnumC6130b.TERMINATED) + C12442g.this.f80644c.count(g4f.EnumC6130b.FAILED) == C12442g.this.f80648g;
            }
        }

        public C12442g(ax7<g4f> services) {
            p6f<g4f.EnumC6130b, g4f> p6fVarBuild = v3b.enumKeys(g4f.EnumC6130b.class).linkedHashSetValues().build();
            this.f80643b = p6fVarBuild;
            this.f80644c = p6fVarBuild.keys();
            this.f80645d = tt9.newIdentityHashMap();
            this.f80649h = new c();
            this.f80650i = new d();
            this.f80651j = new ra9<>();
            this.f80648g = services.size();
            p6fVarBuild.putAll(g4f.EnumC6130b.NEW, services);
        }

        /* JADX INFO: renamed from: a */
        public void m21721a(AbstractC12439d listener, Executor executor) {
            this.f80651j.addListener(listener, executor);
        }

        /* JADX INFO: renamed from: b */
        public void m21722b() {
            this.f80642a.enterWhenUninterruptibly(this.f80649h);
            try {
                m21726f();
            } finally {
                this.f80642a.leave();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m21723c(long timeout, TimeUnit unit) throws TimeoutException {
            this.f80642a.enter();
            try {
                if (this.f80642a.waitForUninterruptibly(this.f80649h, timeout, unit)) {
                    m21726f();
                    return;
                }
                throw new TimeoutException("Timeout waiting for the services to become healthy. The following services have not started: " + x3b.filterKeys((p6f) this.f80643b, p8d.m19339in(dy7.m9577of(g4f.EnumC6130b.NEW, g4f.EnumC6130b.STARTING))));
            } finally {
                this.f80642a.leave();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m21724d() {
            this.f80642a.enterWhenUninterruptibly(this.f80650i);
            this.f80642a.leave();
        }

        /* JADX INFO: renamed from: e */
        public void m21725e(long timeout, TimeUnit unit) throws TimeoutException {
            this.f80642a.enter();
            try {
                if (this.f80642a.waitForUninterruptibly(this.f80650i, timeout, unit)) {
                    return;
                }
                throw new TimeoutException("Timeout waiting for the services to stop. The following services have not stopped: " + x3b.filterKeys((p6f) this.f80643b, p8d.not(p8d.m19339in(EnumSet.of(g4f.EnumC6130b.TERMINATED, g4f.EnumC6130b.FAILED)))));
            } finally {
                this.f80642a.leave();
            }
        }

        @uc7("monitor")
        /* JADX INFO: renamed from: f */
        public void m21726f() {
            d4b<g4f.EnumC6130b> d4bVar = this.f80644c;
            g4f.EnumC6130b enumC6130b = g4f.EnumC6130b.RUNNING;
            if (d4bVar.count(enumC6130b) == this.f80648g) {
                return;
            }
            throw new IllegalStateException("Expected to be healthy after starting. The following services are not running: " + x3b.filterKeys((p6f) this.f80643b, p8d.not(p8d.equalTo(enumC6130b))));
        }

        /* JADX INFO: renamed from: g */
        public void m21727g() {
            v7d.checkState(!this.f80642a.isOccupiedByCurrentThread(), "It is incorrect to execute listeners with the monitor held.");
            this.f80651j.dispatch();
        }

        /* JADX INFO: renamed from: h */
        public void m21728h(final g4f service) {
            this.f80651j.enqueue(new b(this, service));
        }

        /* JADX INFO: renamed from: i */
        public void m21729i() {
            this.f80651j.enqueue(s4f.f80636d);
        }

        /* JADX INFO: renamed from: j */
        public void m21730j() {
            this.f80651j.enqueue(s4f.f80637e);
        }

        /* JADX INFO: renamed from: k */
        public void m21731k() {
            this.f80642a.enter();
            try {
                if (!this.f80647f) {
                    this.f80646e = true;
                    return;
                }
                ArrayList arrayListNewArrayList = eb9.newArrayList();
                quh<g4f> it = m21732l().values().iterator();
                while (it.hasNext()) {
                    g4f next = it.next();
                    if (next.state() != g4f.EnumC6130b.NEW) {
                        arrayListNewArrayList.add(next);
                    }
                }
                throw new IllegalArgumentException("Services started transitioning asynchronously before the ServiceManager was constructed: " + arrayListNewArrayList);
            } finally {
                this.f80642a.leave();
            }
        }

        /* JADX INFO: renamed from: l */
        public gy7<g4f.EnumC6130b, g4f> m21732l() {
            gy7.C6650a c6650aBuilder = gy7.builder();
            this.f80642a.enter();
            try {
                for (Map.Entry<g4f.EnumC6130b, g4f> entry : this.f80643b.entries()) {
                    if (!(entry.getValue() instanceof C12440e)) {
                        c6650aBuilder.put((Map.Entry) entry);
                    }
                }
                this.f80642a.leave();
                return c6650aBuilder.build();
            } catch (Throwable th) {
                this.f80642a.leave();
                throw th;
            }
        }

        /* JADX INFO: renamed from: m */
        public ox7<g4f, Long> m21733m() {
            this.f80642a.enter();
            try {
                ArrayList arrayListNewArrayListWithCapacity = eb9.newArrayListWithCapacity(this.f80645d.size());
                for (Map.Entry<g4f, d5g> entry : this.f80645d.entrySet()) {
                    g4f key = entry.getKey();
                    d5g value = entry.getValue();
                    if (!value.isRunning() && !(key instanceof C12440e)) {
                        arrayListNewArrayListWithCapacity.add(tt9.immutableEntry(key, Long.valueOf(value.elapsed(TimeUnit.MILLISECONDS))));
                    }
                }
                this.f80642a.leave();
                Collections.sort(arrayListNewArrayListWithCapacity, s7c.natural().onResultOf(new a(this)));
                return ox7.copyOf(arrayListNewArrayListWithCapacity);
            } catch (Throwable th) {
                this.f80642a.leave();
                throw th;
            }
        }

        /* JADX INFO: renamed from: n */
        public void m21734n(final g4f service, g4f.EnumC6130b from, g4f.EnumC6130b to) {
            v7d.checkNotNull(service);
            v7d.checkArgument(from != to);
            this.f80642a.enter();
            try {
                this.f80647f = true;
                if (!this.f80646e) {
                    this.f80642a.leave();
                    m21727g();
                    return;
                }
                v7d.checkState(this.f80643b.remove(from, service), "Service %s not at the expected location in the state map %s", service, from);
                v7d.checkState(this.f80643b.put(to, service), "Service %s in the state map unexpectedly at %s", service, to);
                d5g d5gVarCreateStarted = this.f80645d.get(service);
                if (d5gVarCreateStarted == null) {
                    d5gVarCreateStarted = d5g.createStarted();
                    this.f80645d.put(service, d5gVarCreateStarted);
                }
                g4f.EnumC6130b enumC6130b = g4f.EnumC6130b.RUNNING;
                if (to.compareTo(enumC6130b) >= 0 && d5gVarCreateStarted.isRunning()) {
                    d5gVarCreateStarted.stop();
                    if (!(service instanceof C12440e)) {
                        s4f.f80635c.log(Level.FINE, "Started {0} in {1}.", new Object[]{service, d5gVarCreateStarted});
                    }
                }
                g4f.EnumC6130b enumC6130b2 = g4f.EnumC6130b.FAILED;
                if (to == enumC6130b2) {
                    m21728h(service);
                }
                if (this.f80644c.count(enumC6130b) == this.f80648g) {
                    m21729i();
                } else if (this.f80644c.count(g4f.EnumC6130b.TERMINATED) + this.f80644c.count(enumC6130b2) == this.f80648g) {
                    m21730j();
                }
                this.f80642a.leave();
                m21727g();
            } catch (Throwable th) {
                this.f80642a.leave();
                m21727g();
                throw th;
            }
        }

        /* JADX INFO: renamed from: o */
        public void m21735o(g4f service) {
            this.f80642a.enter();
            try {
                if (this.f80645d.get(service) == null) {
                    this.f80645d.put(service, d5g.createStarted());
                }
            } finally {
                this.f80642a.leave();
            }
        }
    }

    public s4f(Iterable<? extends g4f> services) {
        kx7<g4f> kx7VarCopyOf = kx7.copyOf(services);
        if (kx7VarCopyOf.isEmpty()) {
            C12436a c12436a = null;
            f80635c.log(Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", (Throwable) new C12438c(c12436a));
            kx7VarCopyOf = kx7.m15111of(new C12440e(c12436a));
        }
        C12442g c12442g = new C12442g(kx7VarCopyOf);
        this.f80638a = c12442g;
        this.f80639b = kx7VarCopyOf;
        WeakReference weakReference = new WeakReference(c12442g);
        quh<g4f> it = kx7VarCopyOf.iterator();
        while (it.hasNext()) {
            g4f next = it.next();
            next.addListener(new C12441f(next, weakReference), xya.directExecutor());
            v7d.checkArgument(next.state() == g4f.EnumC6130b.NEW, "Can only manage NEW services, %s", next);
        }
        this.f80638a.m21731k();
    }

    public void addListener(AbstractC12439d listener, Executor executor) {
        this.f80638a.m21721a(listener, executor);
    }

    public void awaitHealthy() {
        this.f80638a.m21722b();
    }

    public void awaitStopped() {
        this.f80638a.m21724d();
    }

    public boolean isHealthy() {
        quh<g4f> it = this.f80639b.iterator();
        while (it.hasNext()) {
            if (!it.next().isRunning()) {
                return false;
            }
        }
        return true;
    }

    @op1
    public s4f startAsync() {
        quh<g4f> it = this.f80639b.iterator();
        while (it.hasNext()) {
            v7d.checkState(it.next().state() == g4f.EnumC6130b.NEW, "Not all services are NEW, cannot start %s", this);
        }
        quh<g4f> it2 = this.f80639b.iterator();
        while (it2.hasNext()) {
            g4f next = it2.next();
            try {
                this.f80638a.m21735o(next);
                next.startAsync();
            } catch (IllegalStateException e) {
                f80635c.log(Level.WARNING, "Unable to start Service " + next, (Throwable) e);
            }
        }
        return this;
    }

    public ox7<g4f, Long> startupTimes() {
        return this.f80638a.m21733m();
    }

    @op1
    public s4f stopAsync() {
        quh<g4f> it = this.f80639b.iterator();
        while (it.hasNext()) {
            it.next().stopAsync();
        }
        return this;
    }

    public String toString() {
        return yya.toStringHelper((Class<?>) s4f.class).add("services", h82.filter(this.f80639b, p8d.not(p8d.instanceOf(C12440e.class)))).toString();
    }

    public void awaitHealthy(long timeout, TimeUnit unit) throws TimeoutException {
        this.f80638a.m21723c(timeout, unit);
    }

    public void awaitStopped(long timeout, TimeUnit unit) throws TimeoutException {
        this.f80638a.m21725e(timeout, unit);
    }

    @Override // p000.t4f
    public gy7<g4f.EnumC6130b, g4f> servicesByState() {
        return this.f80638a.m21732l();
    }
}
