package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class y96<T> extends yd2 {

    /* JADX INFO: renamed from: a */
    public final m86<T> f100859a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends qh2> f100860b;

    /* JADX INFO: renamed from: c */
    public final f55 f100861c;

    /* JADX INFO: renamed from: d */
    public final int f100862d;

    /* JADX INFO: renamed from: y96$a */
    public static final class C15577a<T> extends AtomicInteger implements lj6<T>, mf4 {
        private static final long serialVersionUID = 3610901111000061034L;

        /* JADX INFO: renamed from: C */
        public fdg f100863C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f100864F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f100865H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f100866L;

        /* JADX INFO: renamed from: M */
        public int f100867M;

        /* JADX INFO: renamed from: a */
        public final dh2 f100868a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends qh2> f100869b;

        /* JADX INFO: renamed from: c */
        public final f55 f100870c;

        /* JADX INFO: renamed from: d */
        public final cc0 f100871d = new cc0();

        /* JADX INFO: renamed from: e */
        public final a f100872e = new a(this);

        /* JADX INFO: renamed from: f */
        public final int f100873f;

        /* JADX INFO: renamed from: m */
        public final uif<T> f100874m;

        /* JADX INFO: renamed from: y96$a$a */
        public static final class a extends AtomicReference<mf4> implements dh2 {
            private static final long serialVersionUID = 5638352172918776687L;

            /* JADX INFO: renamed from: a */
            public final C15577a<?> f100875a;

            public a(C15577a<?> c15577a) {
                this.f100875a = c15577a;
            }

            /* JADX INFO: renamed from: a */
            public void m25798a() {
                ag4.dispose(this);
            }

            @Override // p000.dh2
            public void onComplete() {
                this.f100875a.m25796b();
            }

            @Override // p000.dh2
            public void onError(Throwable th) {
                this.f100875a.m25797c(th);
            }

            @Override // p000.dh2
            public void onSubscribe(mf4 mf4Var) {
                ag4.replace(this, mf4Var);
            }
        }

        public C15577a(dh2 dh2Var, py6<? super T, ? extends qh2> py6Var, f55 f55Var, int i) {
            this.f100868a = dh2Var;
            this.f100869b = py6Var;
            this.f100870c = f55Var;
            this.f100873f = i;
            this.f100874m = new pzf(i);
        }

        /* JADX INFO: renamed from: a */
        public void m25795a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f100866L) {
                if (!this.f100864F) {
                    if (this.f100870c == f55.BOUNDARY && this.f100871d.get() != null) {
                        this.f100874m.clear();
                        this.f100868a.onError(this.f100871d.terminate());
                        return;
                    }
                    boolean z = this.f100865H;
                    T tPoll = this.f100874m.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        Throwable thTerminate = this.f100871d.terminate();
                        if (thTerminate != null) {
                            this.f100868a.onError(thTerminate);
                            return;
                        } else {
                            this.f100868a.onComplete();
                            return;
                        }
                    }
                    if (!z2) {
                        int i = this.f100873f;
                        int i2 = i - (i >> 1);
                        int i3 = this.f100867M + 1;
                        if (i3 == i2) {
                            this.f100867M = 0;
                            this.f100863C.request(i2);
                        } else {
                            this.f100867M = i3;
                        }
                        try {
                            qh2 qh2Var = (qh2) xjb.requireNonNull(this.f100869b.apply(tPoll), "The mapper returned a null CompletableSource");
                            this.f100864F = true;
                            qh2Var.subscribe(this.f100872e);
                        } catch (Throwable th) {
                            n75.throwIfFatal(th);
                            this.f100874m.clear();
                            this.f100863C.cancel();
                            this.f100871d.addThrowable(th);
                            this.f100868a.onError(this.f100871d.terminate());
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f100874m.clear();
        }

        /* JADX INFO: renamed from: b */
        public void m25796b() {
            this.f100864F = false;
            m25795a();
        }

        /* JADX INFO: renamed from: c */
        public void m25797c(Throwable th) {
            if (!this.f100871d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f100870c != f55.IMMEDIATE) {
                this.f100864F = false;
                m25795a();
                return;
            }
            this.f100863C.cancel();
            Throwable thTerminate = this.f100871d.terminate();
            if (thTerminate != j75.f49698a) {
                this.f100868a.onError(thTerminate);
            }
            if (getAndIncrement() == 0) {
                this.f100874m.clear();
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f100866L = true;
            this.f100863C.cancel();
            this.f100872e.m25798a();
            if (getAndIncrement() == 0) {
                this.f100874m.clear();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f100866L;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f100865H = true;
            m25795a();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f100871d.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f100870c != f55.IMMEDIATE) {
                this.f100865H = true;
                m25795a();
                return;
            }
            this.f100872e.m25798a();
            Throwable thTerminate = this.f100871d.terminate();
            if (thTerminate != j75.f49698a) {
                this.f100868a.onError(thTerminate);
            }
            if (getAndIncrement() == 0) {
                this.f100874m.clear();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f100874m.offer(t)) {
                m25795a();
            } else {
                this.f100863C.cancel();
                onError(new cwa("Queue full?!"));
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f100863C, fdgVar)) {
                this.f100863C = fdgVar;
                this.f100868a.onSubscribe(this);
                fdgVar.request(this.f100873f);
            }
        }
    }

    public y96(m86<T> m86Var, py6<? super T, ? extends qh2> py6Var, f55 f55Var, int i) {
        this.f100859a = m86Var;
        this.f100860b = py6Var;
        this.f100861c = f55Var;
        this.f100862d = i;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f100859a.subscribe((lj6) new C15577a(dh2Var, this.f100860b, this.f100861c, this.f100862d));
    }
}
