package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class dnb<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final dsb<T> f30204a;

    /* JADX INFO: renamed from: dnb$a */
    public static final class C4884a<T> extends AtomicReference<mf4> implements mob<T>, mf4 {
        private static final long serialVersionUID = -3434801548987643227L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f30205a;

        public C4884a(oxb<? super T> oxbVar) {
            this.f30205a = oxbVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mob, p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.ry4
        public void onComplete() {
            if (isDisposed()) {
                return;
            }
            try {
                this.f30205a.onComplete();
            } finally {
                dispose();
            }
        }

        @Override // p000.ry4
        public void onError(Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            pfe.onError(th);
        }

        @Override // p000.ry4
        public void onNext(T t) {
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.f30205a.onNext(t);
            }
        }

        @Override // p000.mob
        public mob<T> serialize() {
            return new C4885b(this);
        }

        @Override // p000.mob
        public void setCancellable(aq1 aq1Var) {
            setDisposable(new jq1(aq1Var));
        }

        @Override // p000.mob
        public void setDisposable(mf4 mf4Var) {
            ag4.set(this, mf4Var);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C4884a.class.getSimpleName(), super.toString());
        }

        @Override // p000.mob
        public boolean tryOnError(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f30205a.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: dnb$b */
    public static final class C4885b<T> extends AtomicInteger implements mob<T> {
        private static final long serialVersionUID = 4883307006032401862L;

        /* JADX INFO: renamed from: a */
        public final mob<T> f30206a;

        /* JADX INFO: renamed from: b */
        public final cc0 f30207b = new cc0();

        /* JADX INFO: renamed from: c */
        public final rzf<T> f30208c = new rzf<>(16);

        /* JADX INFO: renamed from: d */
        public volatile boolean f30209d;

        public C4885b(mob<T> mobVar) {
            this.f30206a = mobVar;
        }

        /* JADX INFO: renamed from: a */
        public void m9275a() {
            if (getAndIncrement() == 0) {
                m9276b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m9276b() {
            mob<T> mobVar = this.f30206a;
            rzf<T> rzfVar = this.f30208c;
            cc0 cc0Var = this.f30207b;
            int iAddAndGet = 1;
            while (!mobVar.isDisposed()) {
                if (cc0Var.get() != null) {
                    rzfVar.clear();
                    mobVar.onError(cc0Var.terminate());
                    return;
                }
                boolean z = this.f30209d;
                T tPoll = rzfVar.poll();
                boolean z2 = tPoll == null;
                if (z && z2) {
                    mobVar.onComplete();
                    return;
                } else if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    mobVar.onNext(tPoll);
                }
            }
            rzfVar.clear();
        }

        @Override // p000.mob, p000.mf4
        public boolean isDisposed() {
            return this.f30206a.isDisposed();
        }

        @Override // p000.ry4
        public void onComplete() {
            if (this.f30206a.isDisposed() || this.f30209d) {
                return;
            }
            this.f30209d = true;
            m9275a();
        }

        @Override // p000.ry4
        public void onError(Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            pfe.onError(th);
        }

        @Override // p000.ry4
        public void onNext(T t) {
            if (this.f30206a.isDisposed() || this.f30209d) {
                return;
            }
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f30206a.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                rzf<T> rzfVar = this.f30208c;
                synchronized (rzfVar) {
                    rzfVar.offer(t);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m9276b();
        }

        @Override // p000.mob
        public mob<T> serialize() {
            return this;
        }

        @Override // p000.mob
        public void setCancellable(aq1 aq1Var) {
            this.f30206a.setCancellable(aq1Var);
        }

        @Override // p000.mob
        public void setDisposable(mf4 mf4Var) {
            this.f30206a.setDisposable(mf4Var);
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            return this.f30206a.toString();
        }

        @Override // p000.mob
        public boolean tryOnError(Throwable th) {
            if (!this.f30206a.isDisposed() && !this.f30209d) {
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.f30207b.addThrowable(th)) {
                    this.f30209d = true;
                    m9275a();
                    return true;
                }
            }
            return false;
        }
    }

    public dnb(dsb<T> dsbVar) {
        this.f30204a = dsbVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C4884a c4884a = new C4884a(oxbVar);
        oxbVar.onSubscribe(c4884a);
        try {
            this.f30204a.subscribe(c4884a);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c4884a.onError(th);
        }
    }
}
