package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class yec<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final fec<? extends T> f101299b;

    /* JADX INFO: renamed from: c */
    public final j11<T, T, T> f101300c;

    /* JADX INFO: renamed from: yec$a */
    public static final class C15632a<T> extends AtomicReference<fdg> implements lj6<T> {
        private static final long serialVersionUID = -7954444275102466525L;

        /* JADX INFO: renamed from: a */
        public final C15633b<T> f101301a;

        /* JADX INFO: renamed from: b */
        public final j11<T, T, T> f101302b;

        /* JADX INFO: renamed from: c */
        public T f101303c;

        /* JADX INFO: renamed from: d */
        public boolean f101304d;

        public C15632a(C15633b<T> c15633b, j11<T, T, T> j11Var) {
            this.f101301a = c15633b;
            this.f101302b = j11Var;
        }

        /* JADX INFO: renamed from: a */
        public void m25881a() {
            mdg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f101304d) {
                return;
            }
            this.f101304d = true;
            this.f101301a.m25883b(this.f101303c);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f101304d) {
                pfe.onError(th);
            } else {
                this.f101304d = true;
                this.f101301a.innerError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f101304d) {
                return;
            }
            T t2 = this.f101303c;
            if (t2 == null) {
                this.f101303c = t;
                return;
            }
            try {
                this.f101303c = (T) xjb.requireNonNull(this.f101302b.apply(t2, t), "The reducer returned a null value");
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                get().cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: yec$b */
    public static final class C15633b<T> extends k34<T> {
        private static final long serialVersionUID = -5370107872170712765L;

        /* JADX INFO: renamed from: L */
        public final C15632a<T>[] f101305L;

        /* JADX INFO: renamed from: M */
        public final j11<T, T, T> f101306M;

        /* JADX INFO: renamed from: N */
        public final AtomicReference<C15634c<T>> f101307N;

        /* JADX INFO: renamed from: Q */
        public final AtomicInteger f101308Q;

        /* JADX INFO: renamed from: X */
        public final AtomicReference<Throwable> f101309X;

        public C15633b(ycg<? super T> ycgVar, int i, j11<T, T, T> j11Var) {
            super(ycgVar);
            this.f101307N = new AtomicReference<>();
            this.f101308Q = new AtomicInteger();
            this.f101309X = new AtomicReference<>();
            C15632a<T>[] c15632aArr = new C15632a[i];
            for (int i2 = 0; i2 < i; i2++) {
                c15632aArr[i2] = new C15632a<>(this, j11Var);
            }
            this.f101305L = c15632aArr;
            this.f101306M = j11Var;
            this.f101308Q.lazySet(i);
        }

        /* JADX INFO: renamed from: a */
        public C15634c<T> m25882a(T t) {
            C15634c<T> c15634c;
            int iM25885b;
            while (true) {
                c15634c = this.f101307N.get();
                if (c15634c == null) {
                    c15634c = new C15634c<>();
                    if (!v7b.m23844a(this.f101307N, null, c15634c)) {
                        continue;
                    }
                }
                iM25885b = c15634c.m25885b();
                if (iM25885b >= 0) {
                    break;
                }
                v7b.m23844a(this.f101307N, c15634c, null);
            }
            if (iM25885b == 0) {
                c15634c.f101310a = t;
            } else {
                c15634c.f101311b = t;
            }
            if (!c15634c.m25884a()) {
                return null;
            }
            v7b.m23844a(this.f101307N, c15634c, null);
            return c15634c;
        }

        /* JADX INFO: renamed from: b */
        public void m25883b(T t) {
            if (t != null) {
                while (true) {
                    C15634c<T> c15634cM25882a = m25882a(t);
                    if (c15634cM25882a == null) {
                        break;
                    }
                    try {
                        t = (T) xjb.requireNonNull(this.f101306M.apply(c15634cM25882a.f101310a, c15634cM25882a.f101311b), "The reducer returned a null value");
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        innerError(th);
                        return;
                    }
                }
            }
            if (this.f101308Q.decrementAndGet() == 0) {
                C15634c<T> c15634c = this.f101307N.get();
                this.f101307N.lazySet(null);
                if (c15634c != null) {
                    complete(c15634c.f101310a);
                } else {
                    this.f52502a.onComplete();
                }
            }
        }

        @Override // p000.k34, p000.fdg
        public void cancel() {
            for (C15632a<T> c15632a : this.f101305L) {
                c15632a.m25881a();
            }
        }

        public void innerError(Throwable th) {
            if (v7b.m23844a(this.f101309X, null, th)) {
                cancel();
                this.f52502a.onError(th);
            } else if (th != this.f101309X.get()) {
                pfe.onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: yec$c */
    public static final class C15634c<T> extends AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;

        /* JADX INFO: renamed from: a */
        public T f101310a;

        /* JADX INFO: renamed from: b */
        public T f101311b;

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f101312c = new AtomicInteger();

        /* JADX INFO: renamed from: a */
        public boolean m25884a() {
            return this.f101312c.incrementAndGet() == 2;
        }

        /* JADX INFO: renamed from: b */
        public int m25885b() {
            int i;
            do {
                i = get();
                if (i >= 2) {
                    return -1;
                }
            } while (!compareAndSet(i, i + 1));
            return i;
        }
    }

    public yec(fec<? extends T> fecVar, j11<T, T, T> j11Var) {
        this.f101299b = fecVar;
        this.f101300c = j11Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C15633b c15633b = new C15633b(ycgVar, this.f101299b.parallelism(), this.f101300c);
        ycgVar.onSubscribe(c15633b);
        this.f101299b.subscribe(c15633b.f101305L);
    }
}
