package p000;

import com.google.j2objc.annotations.ReflectionSupport;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.AbstractC9640n1;

/* JADX INFO: renamed from: mj */
/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
@qx4
public abstract class AbstractC9363mj<OutputT> extends AbstractC9640n1.j<OutputT> {

    /* JADX INFO: renamed from: L */
    public static final b f61115L;

    /* JADX INFO: renamed from: M */
    public static final Logger f61116M = Logger.getLogger(AbstractC9363mj.class.getName());

    /* JADX INFO: renamed from: F */
    @wx1
    public volatile Set<Throwable> f61117F = null;

    /* JADX INFO: renamed from: H */
    public volatile int f61118H;

    /* JADX INFO: renamed from: mj$b */
    public static abstract class b {
        private b() {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo17342a(AbstractC9363mj<?> state, @wx1 Set<Throwable> expect, Set<Throwable> update);

        /* JADX INFO: renamed from: b */
        public abstract int mo17343b(AbstractC9363mj<?> state);
    }

    /* JADX INFO: renamed from: mj$c */
    public static final class c extends b {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<AbstractC9363mj<?>, Set<Throwable>> f61119a;

        /* JADX INFO: renamed from: b */
        public final AtomicIntegerFieldUpdater<AbstractC9363mj<?>> f61120b;

        public c(AtomicReferenceFieldUpdater seenExceptionsUpdater, AtomicIntegerFieldUpdater remainingCountUpdater) {
            super();
            this.f61119a = seenExceptionsUpdater;
            this.f61120b = remainingCountUpdater;
        }

        @Override // p000.AbstractC9363mj.b
        /* JADX INFO: renamed from: a */
        public void mo17342a(AbstractC9363mj<?> state, @wx1 Set<Throwable> expect, Set<Throwable> update) {
            C0051a4.m134a(this.f61119a, state, expect, update);
        }

        @Override // p000.AbstractC9363mj.b
        /* JADX INFO: renamed from: b */
        public int mo17343b(AbstractC9363mj<?> state) {
            return this.f61120b.decrementAndGet(state);
        }
    }

    /* JADX INFO: renamed from: mj$d */
    public static final class d extends b {
        private d() {
            super();
        }

        @Override // p000.AbstractC9363mj.b
        /* JADX INFO: renamed from: a */
        public void mo17342a(AbstractC9363mj<?> state, @wx1 Set<Throwable> expect, Set<Throwable> update) {
            synchronized (state) {
                try {
                    if (state.f61117F == expect) {
                        state.f61117F = update;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.AbstractC9363mj.b
        /* JADX INFO: renamed from: b */
        public int mo17343b(AbstractC9363mj<?> state) {
            int iM17338r;
            synchronized (state) {
                iM17338r = AbstractC9363mj.m17338r(state);
            }
            return iM17338r;
        }
    }

    static {
        b dVar;
        Throwable th = null;
        byte b2 = 0;
        try {
            dVar = new c(AtomicReferenceFieldUpdater.newUpdater(AbstractC9363mj.class, Set.class, "F"), AtomicIntegerFieldUpdater.newUpdater(AbstractC9363mj.class, "H"));
        } catch (Error | RuntimeException e) {
            dVar = new d();
            th = e;
        }
        f61115L = dVar;
        if (th != null) {
            f61116M.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public AbstractC9363mj(int remainingFutures) {
        this.f61118H = remainingFutures;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m17338r(AbstractC9363mj abstractC9363mj) {
        int i = abstractC9363mj.f61118H - 1;
        abstractC9363mj.f61118H = i;
        return i;
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo16168s(Set<Throwable> seen);

    /* JADX INFO: renamed from: t */
    public final void m17339t() {
        this.f61117F = null;
    }

    /* JADX INFO: renamed from: u */
    public final int m17340u() {
        return f61115L.mo17343b(this);
    }

    /* JADX INFO: renamed from: v */
    public final Set<Throwable> m17341v() {
        Set<Throwable> set = this.f61117F;
        if (set != null) {
            return set;
        }
        Set<Throwable> setNewConcurrentHashSet = t6f.newConcurrentHashSet();
        mo16168s(setNewConcurrentHashSet);
        f61115L.mo17342a(this, null, setNewConcurrentHashSet);
        Set<Throwable> set2 = this.f61117F;
        Objects.requireNonNull(set2);
        return set2;
    }
}
