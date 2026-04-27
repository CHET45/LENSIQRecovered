package p000;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.bya;
import p000.g4f;
import p000.ra9;

/* JADX INFO: renamed from: h4 */
/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public abstract class AbstractC6698h4 implements g4f {

    /* JADX INFO: renamed from: h */
    public static final ra9.InterfaceC11965a<g4f.AbstractC6129a> f42260h = new a();

    /* JADX INFO: renamed from: i */
    public static final ra9.InterfaceC11965a<g4f.AbstractC6129a> f42261i = new b();

    /* JADX INFO: renamed from: j */
    public static final ra9.InterfaceC11965a<g4f.AbstractC6129a> f42262j;

    /* JADX INFO: renamed from: k */
    public static final ra9.InterfaceC11965a<g4f.AbstractC6129a> f42263k;

    /* JADX INFO: renamed from: l */
    public static final ra9.InterfaceC11965a<g4f.AbstractC6129a> f42264l;

    /* JADX INFO: renamed from: m */
    public static final ra9.InterfaceC11965a<g4f.AbstractC6129a> f42265m;

    /* JADX INFO: renamed from: n */
    public static final ra9.InterfaceC11965a<g4f.AbstractC6129a> f42266n;

    /* JADX INFO: renamed from: o */
    public static final ra9.InterfaceC11965a<g4f.AbstractC6129a> f42267o;

    /* JADX INFO: renamed from: a */
    public final bya f42268a = new bya();

    /* JADX INFO: renamed from: b */
    public final bya.AbstractC2103a f42269b = new h();

    /* JADX INFO: renamed from: c */
    public final bya.AbstractC2103a f42270c = new i();

    /* JADX INFO: renamed from: d */
    public final bya.AbstractC2103a f42271d = new g();

    /* JADX INFO: renamed from: e */
    public final bya.AbstractC2103a f42272e = new j();

    /* JADX INFO: renamed from: f */
    public final ra9<g4f.AbstractC6129a> f42273f = new ra9<>();

    /* JADX INFO: renamed from: g */
    public volatile k f42274g = new k(g4f.EnumC6130b.NEW);

    /* JADX INFO: renamed from: h4$a */
    public class a implements ra9.InterfaceC11965a<g4f.AbstractC6129a> {
        public String toString() {
            return "starting()";
        }

        @Override // p000.ra9.InterfaceC11965a
        public void call(g4f.AbstractC6129a listener) {
            listener.starting();
        }
    }

    /* JADX INFO: renamed from: h4$b */
    public class b implements ra9.InterfaceC11965a<g4f.AbstractC6129a> {
        public String toString() {
            return "running()";
        }

        @Override // p000.ra9.InterfaceC11965a
        public void call(g4f.AbstractC6129a listener) {
            listener.running();
        }
    }

    /* JADX INFO: renamed from: h4$c */
    public class c implements ra9.InterfaceC11965a<g4f.AbstractC6129a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g4f.EnumC6130b f42275a;

        public c(final g4f.EnumC6130b val$from) {
            this.f42275a = val$from;
        }

        public String toString() {
            return "terminated({from = " + this.f42275a + "})";
        }

        @Override // p000.ra9.InterfaceC11965a
        public void call(g4f.AbstractC6129a listener) {
            listener.terminated(this.f42275a);
        }
    }

    /* JADX INFO: renamed from: h4$d */
    public class d implements ra9.InterfaceC11965a<g4f.AbstractC6129a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g4f.EnumC6130b f42276a;

        public d(final g4f.EnumC6130b val$from) {
            this.f42276a = val$from;
        }

        public String toString() {
            return "stopping({from = " + this.f42276a + "})";
        }

        @Override // p000.ra9.InterfaceC11965a
        public void call(g4f.AbstractC6129a listener) {
            listener.stopping(this.f42276a);
        }
    }

    /* JADX INFO: renamed from: h4$e */
    public class e implements ra9.InterfaceC11965a<g4f.AbstractC6129a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g4f.EnumC6130b f42277a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Throwable f42278b;

        public e(final AbstractC6698h4 this$0, final g4f.EnumC6130b val$from, final Throwable val$cause) {
            this.f42277a = val$from;
            this.f42278b = val$cause;
        }

        public String toString() {
            return "failed({from = " + this.f42277a + ", cause = " + this.f42278b + "})";
        }

        @Override // p000.ra9.InterfaceC11965a
        public void call(g4f.AbstractC6129a listener) {
            listener.failed(this.f42277a, this.f42278b);
        }
    }

    /* JADX INFO: renamed from: h4$f */
    public static /* synthetic */ class f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f42279a;

        static {
            int[] iArr = new int[g4f.EnumC6130b.values().length];
            f42279a = iArr;
            try {
                iArr[g4f.EnumC6130b.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42279a[g4f.EnumC6130b.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42279a[g4f.EnumC6130b.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42279a[g4f.EnumC6130b.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42279a[g4f.EnumC6130b.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42279a[g4f.EnumC6130b.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: h4$g */
    public final class g extends bya.AbstractC2103a {
        public g() {
            super(AbstractC6698h4.this.f42268a);
        }

        @Override // p000.bya.AbstractC2103a
        public boolean isSatisfied() {
            return AbstractC6698h4.this.state().compareTo(g4f.EnumC6130b.RUNNING) >= 0;
        }
    }

    /* JADX INFO: renamed from: h4$h */
    public final class h extends bya.AbstractC2103a {
        public h() {
            super(AbstractC6698h4.this.f42268a);
        }

        @Override // p000.bya.AbstractC2103a
        public boolean isSatisfied() {
            return AbstractC6698h4.this.state() == g4f.EnumC6130b.NEW;
        }
    }

    /* JADX INFO: renamed from: h4$i */
    public final class i extends bya.AbstractC2103a {
        public i() {
            super(AbstractC6698h4.this.f42268a);
        }

        @Override // p000.bya.AbstractC2103a
        public boolean isSatisfied() {
            return AbstractC6698h4.this.state().compareTo(g4f.EnumC6130b.RUNNING) <= 0;
        }
    }

    /* JADX INFO: renamed from: h4$j */
    public final class j extends bya.AbstractC2103a {
        public j() {
            super(AbstractC6698h4.this.f42268a);
        }

        @Override // p000.bya.AbstractC2103a
        public boolean isSatisfied() {
            return AbstractC6698h4.this.state().compareTo(g4f.EnumC6130b.TERMINATED) >= 0;
        }
    }

    /* JADX INFO: renamed from: h4$k */
    public static final class k {

        /* JADX INFO: renamed from: a */
        public final g4f.EnumC6130b f42284a;

        /* JADX INFO: renamed from: b */
        public final boolean f42285b;

        /* JADX INFO: renamed from: c */
        @wx1
        public final Throwable f42286c;

        public k(g4f.EnumC6130b internalState) {
            this(internalState, false, null);
        }

        /* JADX INFO: renamed from: a */
        public g4f.EnumC6130b m12131a() {
            return (this.f42285b && this.f42284a == g4f.EnumC6130b.STARTING) ? g4f.EnumC6130b.STOPPING : this.f42284a;
        }

        /* JADX INFO: renamed from: b */
        public Throwable m12132b() {
            g4f.EnumC6130b enumC6130b = this.f42284a;
            v7d.checkState(enumC6130b == g4f.EnumC6130b.FAILED, "failureCause() is only valid if the service has failed, service is %s", enumC6130b);
            Throwable th = this.f42286c;
            Objects.requireNonNull(th);
            return th;
        }

        public k(g4f.EnumC6130b internalState, boolean shutdownWhenStartupFinishes, @wx1 Throwable failure) {
            v7d.checkArgument(!shutdownWhenStartupFinishes || internalState == g4f.EnumC6130b.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", internalState);
            v7d.checkArgument((failure != null) == (internalState == g4f.EnumC6130b.FAILED), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", internalState, failure);
            this.f42284a = internalState;
            this.f42285b = shutdownWhenStartupFinishes;
            this.f42286c = failure;
        }
    }

    static {
        g4f.EnumC6130b enumC6130b = g4f.EnumC6130b.STARTING;
        f42262j = stoppingEvent(enumC6130b);
        g4f.EnumC6130b enumC6130b2 = g4f.EnumC6130b.RUNNING;
        f42263k = stoppingEvent(enumC6130b2);
        f42264l = terminatedEvent(g4f.EnumC6130b.NEW);
        f42265m = terminatedEvent(enumC6130b);
        f42266n = terminatedEvent(enumC6130b2);
        f42267o = terminatedEvent(g4f.EnumC6130b.STOPPING);
    }

    @uc7("monitor")
    private void checkCurrentState(g4f.EnumC6130b expected) {
        g4f.EnumC6130b enumC6130bState = state();
        if (enumC6130bState != expected) {
            if (enumC6130bState == g4f.EnumC6130b.FAILED) {
                throw new IllegalStateException("Expected the service " + this + " to be " + expected + ", but the service has FAILED", failureCause());
            }
            throw new IllegalStateException("Expected the service " + this + " to be " + expected + ", but was " + enumC6130bState);
        }
    }

    private void dispatchListenerEvents() {
        if (this.f42268a.isOccupiedByCurrentThread()) {
            return;
        }
        this.f42273f.dispatch();
    }

    private void enqueueFailedEvent(final g4f.EnumC6130b from, final Throwable cause) {
        this.f42273f.enqueue(new e(this, from, cause));
    }

    private void enqueueRunningEvent() {
        this.f42273f.enqueue(f42261i);
    }

    private void enqueueStartingEvent() {
        this.f42273f.enqueue(f42260h);
    }

    private void enqueueStoppingEvent(final g4f.EnumC6130b from) {
        if (from == g4f.EnumC6130b.STARTING) {
            this.f42273f.enqueue(f42262j);
        } else {
            if (from != g4f.EnumC6130b.RUNNING) {
                throw new AssertionError();
            }
            this.f42273f.enqueue(f42263k);
        }
    }

    private void enqueueTerminatedEvent(final g4f.EnumC6130b from) {
        switch (f.f42279a[from.ordinal()]) {
            case 1:
                this.f42273f.enqueue(f42264l);
                return;
            case 2:
                this.f42273f.enqueue(f42265m);
                return;
            case 3:
                this.f42273f.enqueue(f42266n);
                return;
            case 4:
                this.f42273f.enqueue(f42267o);
                return;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
    }

    private static ra9.InterfaceC11965a<g4f.AbstractC6129a> stoppingEvent(final g4f.EnumC6130b from) {
        return new d(from);
    }

    private static ra9.InterfaceC11965a<g4f.AbstractC6129a> terminatedEvent(final g4f.EnumC6130b from) {
        return new c(from);
    }

    @Override // p000.g4f
    public final void addListener(g4f.AbstractC6129a listener, Executor executor) {
        this.f42273f.addListener(listener, executor);
    }

    @Override // p000.g4f
    public final void awaitRunning() {
        this.f42268a.enterWhenUninterruptibly(this.f42271d);
        try {
            checkCurrentState(g4f.EnumC6130b.RUNNING);
        } finally {
            this.f42268a.leave();
        }
    }

    @Override // p000.g4f
    public final void awaitTerminated() {
        this.f42268a.enterWhenUninterruptibly(this.f42272e);
        try {
            checkCurrentState(g4f.EnumC6130b.TERMINATED);
        } finally {
            this.f42268a.leave();
        }
    }

    @vp6
    /* JADX INFO: renamed from: b */
    public void m12127b() {
    }

    @vp6
    /* JADX INFO: renamed from: c */
    public abstract void mo2911c();

    @vp6
    /* JADX INFO: renamed from: d */
    public abstract void mo2912d();

    /* JADX INFO: renamed from: e */
    public final void m12128e(Throwable cause) {
        v7d.checkNotNull(cause);
        this.f42268a.enter();
        try {
            g4f.EnumC6130b enumC6130bState = state();
            int i2 = f.f42279a[enumC6130bState.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3 || i2 == 4) {
                    this.f42274g = new k(g4f.EnumC6130b.FAILED, false, cause);
                    enqueueFailedEvent(enumC6130bState, cause);
                } else if (i2 != 5) {
                }
                return;
            }
            throw new IllegalStateException("Failed while in state:" + enumC6130bState, cause);
        } finally {
            this.f42268a.leave();
            dispatchListenerEvents();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12129f() {
        this.f42268a.enter();
        try {
            if (this.f42274g.f42284a != g4f.EnumC6130b.STARTING) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStarted() when the service is " + this.f42274g.f42284a);
                m12128e(illegalStateException);
                throw illegalStateException;
            }
            if (this.f42274g.f42285b) {
                this.f42274g = new k(g4f.EnumC6130b.STOPPING);
                mo2912d();
            } else {
                this.f42274g = new k(g4f.EnumC6130b.RUNNING);
                enqueueRunningEvent();
            }
            this.f42268a.leave();
            dispatchListenerEvents();
        } catch (Throwable th) {
            this.f42268a.leave();
            dispatchListenerEvents();
            throw th;
        }
    }

    @Override // p000.g4f
    public final Throwable failureCause() {
        return this.f42274g.m12132b();
    }

    /* JADX INFO: renamed from: g */
    public final void m12130g() {
        this.f42268a.enter();
        try {
            g4f.EnumC6130b enumC6130bState = state();
            switch (f.f42279a[enumC6130bState.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    throw new IllegalStateException("Cannot notifyStopped() when the service is " + enumC6130bState);
                case 2:
                case 3:
                case 4:
                    this.f42274g = new k(g4f.EnumC6130b.TERMINATED);
                    enqueueTerminatedEvent(enumC6130bState);
                    break;
            }
        } finally {
            this.f42268a.leave();
            dispatchListenerEvents();
        }
    }

    @Override // p000.g4f
    public final boolean isRunning() {
        return state() == g4f.EnumC6130b.RUNNING;
    }

    @Override // p000.g4f
    @op1
    public final g4f startAsync() {
        if (this.f42268a.enterIf(this.f42269b)) {
            try {
                this.f42274g = new k(g4f.EnumC6130b.STARTING);
                enqueueStartingEvent();
                mo2911c();
            } finally {
                try {
                } finally {
                }
            }
            return this;
        }
        throw new IllegalStateException("Service " + this + " has already been started");
    }

    @Override // p000.g4f
    public final g4f.EnumC6130b state() {
        return this.f42274g.m12131a();
    }

    @Override // p000.g4f
    @op1
    public final g4f stopAsync() {
        if (this.f42268a.enterIf(this.f42270c)) {
            try {
                g4f.EnumC6130b enumC6130bState = state();
                switch (f.f42279a[enumC6130bState.ordinal()]) {
                    case 1:
                        this.f42274g = new k(g4f.EnumC6130b.TERMINATED);
                        enqueueTerminatedEvent(g4f.EnumC6130b.NEW);
                        break;
                    case 2:
                        g4f.EnumC6130b enumC6130b = g4f.EnumC6130b.STARTING;
                        this.f42274g = new k(enumC6130b, true, null);
                        enqueueStoppingEvent(enumC6130b);
                        m12127b();
                        break;
                    case 3:
                        this.f42274g = new k(g4f.EnumC6130b.STOPPING);
                        enqueueStoppingEvent(g4f.EnumC6130b.RUNNING);
                        mo2912d();
                        break;
                    case 4:
                    case 5:
                    case 6:
                        throw new AssertionError("isStoppable is incorrectly implemented, saw: " + enumC6130bState);
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + " [" + state() + "]";
    }

    @Override // p000.g4f
    public final void awaitRunning(long timeout, TimeUnit unit) throws TimeoutException {
        if (this.f42268a.enterWhenUninterruptibly(this.f42271d, timeout, unit)) {
            try {
                checkCurrentState(g4f.EnumC6130b.RUNNING);
            } finally {
                this.f42268a.leave();
            }
        } else {
            throw new TimeoutException("Timed out waiting for " + this + " to reach the RUNNING state.");
        }
    }

    @Override // p000.g4f
    public final void awaitTerminated(long timeout, TimeUnit unit) throws TimeoutException {
        if (this.f42268a.enterWhenUninterruptibly(this.f42272e, timeout, unit)) {
            try {
                checkCurrentState(g4f.EnumC6130b.TERMINATED);
            } finally {
                this.f42268a.leave();
            }
        } else {
            throw new TimeoutException("Timed out waiting for " + this + " to reach a terminal state. Current state: " + state());
        }
    }
}
