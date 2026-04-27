package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class hmb<T> extends yd2 {

    /* JADX INFO: renamed from: a */
    public final Observable<T> f44118a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends qh2> f44119b;

    /* JADX INFO: renamed from: c */
    public final f55 f44120c;

    /* JADX INFO: renamed from: d */
    public final int f44121d;

    /* JADX INFO: renamed from: hmb$a */
    public static final class C6909a<T> extends AtomicInteger implements oxb<T>, mf4 {
        private static final long serialVersionUID = 3610901111000061034L;

        /* JADX INFO: renamed from: C */
        public mf4 f44122C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f44123F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f44124H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f44125L;

        /* JADX INFO: renamed from: a */
        public final dh2 f44126a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends qh2> f44127b;

        /* JADX INFO: renamed from: c */
        public final f55 f44128c;

        /* JADX INFO: renamed from: d */
        public final cc0 f44129d = new cc0();

        /* JADX INFO: renamed from: e */
        public final a f44130e = new a(this);

        /* JADX INFO: renamed from: f */
        public final int f44131f;

        /* JADX INFO: renamed from: m */
        public ajf<T> f44132m;

        /* JADX INFO: renamed from: hmb$a$a */
        public static final class a extends AtomicReference<mf4> implements dh2 {
            private static final long serialVersionUID = 5638352172918776687L;

            /* JADX INFO: renamed from: a */
            public final C6909a<?> f44133a;

            public a(C6909a<?> c6909a) {
                this.f44133a = c6909a;
            }

            /* JADX INFO: renamed from: a */
            public void m12494a() {
                ag4.dispose(this);
            }

            @Override // p000.dh2
            public void onComplete() {
                this.f44133a.m12492b();
            }

            @Override // p000.dh2
            public void onError(Throwable th) {
                this.f44133a.m12493c(th);
            }

            @Override // p000.dh2
            public void onSubscribe(mf4 mf4Var) {
                ag4.replace(this, mf4Var);
            }
        }

        public C6909a(dh2 dh2Var, py6<? super T, ? extends qh2> py6Var, f55 f55Var, int i) {
            this.f44126a = dh2Var;
            this.f44127b = py6Var;
            this.f44128c = f55Var;
            this.f44131f = i;
        }

        /* JADX INFO: renamed from: a */
        public void m12491a() {
            qh2 qh2Var;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            cc0 cc0Var = this.f44129d;
            f55 f55Var = this.f44128c;
            while (!this.f44125L) {
                if (!this.f44123F) {
                    if (f55Var == f55.BOUNDARY && cc0Var.get() != null) {
                        this.f44125L = true;
                        this.f44132m.clear();
                        this.f44126a.onError(cc0Var.terminate());
                        return;
                    }
                    boolean z2 = this.f44124H;
                    try {
                        T tPoll = this.f44132m.poll();
                        if (tPoll != null) {
                            qh2Var = (qh2) xjb.requireNonNull(this.f44127b.apply(tPoll), "The mapper returned a null CompletableSource");
                            z = false;
                        } else {
                            qh2Var = null;
                            z = true;
                        }
                        if (z2 && z) {
                            this.f44125L = true;
                            Throwable thTerminate = cc0Var.terminate();
                            if (thTerminate != null) {
                                this.f44126a.onError(thTerminate);
                                return;
                            } else {
                                this.f44126a.onComplete();
                                return;
                            }
                        }
                        if (!z) {
                            this.f44123F = true;
                            qh2Var.subscribe(this.f44130e);
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f44125L = true;
                        this.f44132m.clear();
                        this.f44122C.dispose();
                        cc0Var.addThrowable(th);
                        this.f44126a.onError(cc0Var.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f44132m.clear();
        }

        /* JADX INFO: renamed from: b */
        public void m12492b() {
            this.f44123F = false;
            m12491a();
        }

        /* JADX INFO: renamed from: c */
        public void m12493c(Throwable th) {
            if (!this.f44129d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f44128c != f55.IMMEDIATE) {
                this.f44123F = false;
                m12491a();
                return;
            }
            this.f44125L = true;
            this.f44122C.dispose();
            Throwable thTerminate = this.f44129d.terminate();
            if (thTerminate != j75.f49698a) {
                this.f44126a.onError(thTerminate);
            }
            if (getAndIncrement() == 0) {
                this.f44132m.clear();
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f44125L = true;
            this.f44122C.dispose();
            this.f44130e.m12494a();
            if (getAndIncrement() == 0) {
                this.f44132m.clear();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f44125L;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f44124H = true;
            m12491a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f44129d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f44128c != f55.IMMEDIATE) {
                this.f44124H = true;
                m12491a();
                return;
            }
            this.f44125L = true;
            this.f44130e.m12494a();
            Throwable thTerminate = this.f44129d.terminate();
            if (thTerminate != j75.f49698a) {
                this.f44126a.onError(thTerminate);
            }
            if (getAndIncrement() == 0) {
                this.f44132m.clear();
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (t != null) {
                this.f44132m.offer(t);
            }
            m12491a();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f44122C, mf4Var)) {
                this.f44122C = mf4Var;
                if (mf4Var instanceof umd) {
                    umd umdVar = (umd) mf4Var;
                    int iRequestFusion = umdVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f44132m = umdVar;
                        this.f44124H = true;
                        this.f44126a.onSubscribe(this);
                        m12491a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f44132m = umdVar;
                        this.f44126a.onSubscribe(this);
                        return;
                    }
                }
                this.f44132m = new rzf(this.f44131f);
                this.f44126a.onSubscribe(this);
            }
        }
    }

    public hmb(Observable<T> observable, py6<? super T, ? extends qh2> py6Var, f55 f55Var, int i) {
        this.f44118a = observable;
        this.f44119b = py6Var;
        this.f44120c = f55Var;
        this.f44121d = i;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        if (nme.m18009a(this.f44118a, this.f44119b, dh2Var)) {
            return;
        }
        this.f44118a.subscribe(new C6909a(dh2Var, this.f44119b, this.f44120c, this.f44121d));
    }
}
