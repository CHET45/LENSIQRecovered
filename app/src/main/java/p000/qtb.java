package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class qtb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f75729b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f75730c;

    /* JADX INFO: renamed from: d */
    public final voe f75731d;

    /* JADX INFO: renamed from: e */
    public final boolean f75732e;

    /* JADX INFO: renamed from: qtb$a */
    public static final class C11690a<T> extends AbstractRunnableC11692c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* JADX INFO: renamed from: m */
        public final AtomicInteger f75733m;

        public C11690a(oxb<? super T> oxbVar, long j, TimeUnit timeUnit, voe voeVar) {
            super(oxbVar, j, timeUnit, voeVar);
            this.f75733m = new AtomicInteger(1);
        }

        @Override // p000.qtb.AbstractRunnableC11692c
        /* JADX INFO: renamed from: b */
        public void mo20658b() {
            m20660c();
            if (this.f75733m.decrementAndGet() == 0) {
                this.f75734a.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f75733m.incrementAndGet() == 2) {
                m20660c();
                if (this.f75733m.decrementAndGet() == 0) {
                    this.f75734a.onComplete();
                }
            }
        }
    }

    /* JADX INFO: renamed from: qtb$b */
    public static final class C11691b<T> extends AbstractRunnableC11692c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public C11691b(oxb<? super T> oxbVar, long j, TimeUnit timeUnit, voe voeVar) {
            super(oxbVar, j, timeUnit, voeVar);
        }

        @Override // p000.qtb.AbstractRunnableC11692c
        /* JADX INFO: renamed from: b */
        public void mo20658b() {
            this.f75734a.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            m20660c();
        }
    }

    /* JADX INFO: renamed from: qtb$c */
    public static abstract class AbstractRunnableC11692c<T> extends AtomicReference<T> implements oxb<T>, mf4, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f75734a;

        /* JADX INFO: renamed from: b */
        public final long f75735b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f75736c;

        /* JADX INFO: renamed from: d */
        public final voe f75737d;

        /* JADX INFO: renamed from: e */
        public final AtomicReference<mf4> f75738e = new AtomicReference<>();

        /* JADX INFO: renamed from: f */
        public mf4 f75739f;

        public AbstractRunnableC11692c(oxb<? super T> oxbVar, long j, TimeUnit timeUnit, voe voeVar) {
            this.f75734a = oxbVar;
            this.f75735b = j;
            this.f75736c = timeUnit;
            this.f75737d = voeVar;
        }

        /* JADX INFO: renamed from: a */
        public void m20659a() {
            ag4.dispose(this.f75738e);
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo20658b();

        /* JADX INFO: renamed from: c */
        public void m20660c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f75734a.onNext(andSet);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            m20659a();
            this.f75739f.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f75739f.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            m20659a();
            mo20658b();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            m20659a();
            this.f75734a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f75739f, mf4Var)) {
                this.f75739f = mf4Var;
                this.f75734a.onSubscribe(this);
                voe voeVar = this.f75737d;
                long j = this.f75735b;
                ag4.replace(this.f75738e, voeVar.schedulePeriodicallyDirect(this, j, j, this.f75736c));
            }
        }
    }

    public qtb(xub<T> xubVar, long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        super(xubVar);
        this.f75729b = j;
        this.f75730c = timeUnit;
        this.f75731d = voeVar;
        this.f75732e = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        n1f n1fVar = new n1f(oxbVar);
        if (this.f75732e) {
            this.f66354a.subscribe(new C11690a(n1fVar, this.f75729b, this.f75730c, this.f75731d));
        } else {
            this.f66354a.subscribe(new C11691b(n1fVar, this.f75729b, this.f75730c, this.f75731d));
        }
    }
}
