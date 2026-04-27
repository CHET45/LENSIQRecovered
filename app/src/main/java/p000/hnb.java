package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class hnb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f44209b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f44210c;

    /* JADX INFO: renamed from: d */
    public final voe f44211d;

    /* JADX INFO: renamed from: hnb$a */
    public static final class RunnableC6921a<T> extends AtomicReference<mf4> implements Runnable, mf4 {
        private static final long serialVersionUID = 6812032969491025141L;

        /* JADX INFO: renamed from: a */
        public final T f44212a;

        /* JADX INFO: renamed from: b */
        public final long f44213b;

        /* JADX INFO: renamed from: c */
        public final C6922b<T> f44214c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f44215d = new AtomicBoolean();

        public RunnableC6921a(T t, long j, C6922b<T> c6922b) {
            this.f44212a = t;
            this.f44213b = j;
            this.f44214c = c6922b;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == ag4.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f44215d.compareAndSet(false, true)) {
                this.f44214c.m12505a(this.f44213b, this.f44212a, this);
            }
        }

        public void setResource(mf4 mf4Var) {
            ag4.replace(this, mf4Var);
        }
    }

    /* JADX INFO: renamed from: hnb$b */
    public static final class C6922b<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: C */
        public boolean f44216C;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f44217a;

        /* JADX INFO: renamed from: b */
        public final long f44218b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f44219c;

        /* JADX INFO: renamed from: d */
        public final voe.AbstractC14185c f44220d;

        /* JADX INFO: renamed from: e */
        public mf4 f44221e;

        /* JADX INFO: renamed from: f */
        public mf4 f44222f;

        /* JADX INFO: renamed from: m */
        public volatile long f44223m;

        public C6922b(oxb<? super T> oxbVar, long j, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c) {
            this.f44217a = oxbVar;
            this.f44218b = j;
            this.f44219c = timeUnit;
            this.f44220d = abstractC14185c;
        }

        /* JADX INFO: renamed from: a */
        public void m12505a(long j, T t, RunnableC6921a<T> runnableC6921a) {
            if (j == this.f44223m) {
                this.f44217a.onNext(t);
                runnableC6921a.dispose();
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f44221e.dispose();
            this.f44220d.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f44220d.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f44216C) {
                return;
            }
            this.f44216C = true;
            mf4 mf4Var = this.f44222f;
            if (mf4Var != null) {
                mf4Var.dispose();
            }
            RunnableC6921a runnableC6921a = (RunnableC6921a) mf4Var;
            if (runnableC6921a != null) {
                runnableC6921a.run();
            }
            this.f44217a.onComplete();
            this.f44220d.dispose();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f44216C) {
                pfe.onError(th);
                return;
            }
            mf4 mf4Var = this.f44222f;
            if (mf4Var != null) {
                mf4Var.dispose();
            }
            this.f44216C = true;
            this.f44217a.onError(th);
            this.f44220d.dispose();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f44216C) {
                return;
            }
            long j = this.f44223m + 1;
            this.f44223m = j;
            mf4 mf4Var = this.f44222f;
            if (mf4Var != null) {
                mf4Var.dispose();
            }
            RunnableC6921a runnableC6921a = new RunnableC6921a(t, j, this);
            this.f44222f = runnableC6921a;
            runnableC6921a.setResource(this.f44220d.schedule(runnableC6921a, this.f44218b, this.f44219c));
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f44221e, mf4Var)) {
                this.f44221e = mf4Var;
                this.f44217a.onSubscribe(this);
            }
        }
    }

    public hnb(xub<T> xubVar, long j, TimeUnit timeUnit, voe voeVar) {
        super(xubVar);
        this.f44209b = j;
        this.f44210c = timeUnit;
        this.f44211d = voeVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C6922b(new n1f(oxbVar), this.f44209b, this.f44210c, this.f44211d.createWorker()));
    }
}
