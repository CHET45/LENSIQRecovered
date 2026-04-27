package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class tlf<T, R> extends m86<R> {

    /* JADX INFO: renamed from: b */
    public final pof<T> f85279b;

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends Iterable<? extends R>> f85280c;

    /* JADX INFO: renamed from: tlf$a */
    public static final class C13098a<T, R> extends sv0<R> implements inf<T> {
        private static final long serialVersionUID = -8938804753851907758L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f85281a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends Iterable<? extends R>> f85282b;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f85283c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public mf4 f85284d;

        /* JADX INFO: renamed from: e */
        public volatile Iterator<? extends R> f85285e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f85286f;

        /* JADX INFO: renamed from: m */
        public boolean f85287m;

        public C13098a(ycg<? super R> ycgVar, py6<? super T, ? extends Iterable<? extends R>> py6Var) {
            this.f85281a = ycgVar;
            this.f85282b = py6Var;
        }

        /* JADX INFO: renamed from: a */
        public void m22717a(ycg<? super R> ycgVar, Iterator<? extends R> it) {
            while (!this.f85286f) {
                try {
                    ycgVar.onNext(it.next());
                    if (this.f85286f) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            ycgVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        ycgVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    ycgVar.onError(th2);
                    return;
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f85286f = true;
            this.f85284d.dispose();
            this.f85284d = ag4.DISPOSED;
        }

        @Override // p000.ajf
        public void clear() {
            this.f85285e = null;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f85281a;
            Iterator<? extends R> it = this.f85285e;
            if (this.f85287m && it != null) {
                ycgVar.onNext(null);
                ycgVar.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j = this.f85283c.get();
                    if (j == Long.MAX_VALUE) {
                        m22717a(ycgVar, it);
                        return;
                    }
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.f85286f) {
                            return;
                        }
                        try {
                            ycgVar.onNext((Object) xjb.requireNonNull(it.next(), "The iterator returned a null value"));
                            if (this.f85286f) {
                                return;
                            }
                            j2++;
                            try {
                                if (!it.hasNext()) {
                                    ycgVar.onComplete();
                                    return;
                                }
                            } catch (Throwable th) {
                                n75.throwIfFatal(th);
                                ycgVar.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            n75.throwIfFatal(th2);
                            ycgVar.onError(th2);
                            return;
                        }
                    }
                    if (j2 != 0) {
                        so0.produced(this.f85283c, j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f85285e;
                }
            }
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f85285e == null;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f85284d = ag4.DISPOSED;
            this.f85281a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f85284d, mf4Var)) {
                this.f85284d = mf4Var;
                this.f85281a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            try {
                Iterator<? extends R> it = this.f85282b.apply(t).iterator();
                if (!it.hasNext()) {
                    this.f85281a.onComplete();
                } else {
                    this.f85285e = it;
                    drain();
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f85281a.onError(th);
            }
        }

        @Override // p000.ajf
        @cib
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f85285e;
            if (it == null) {
                return null;
            }
            R r = (R) xjb.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f85285e = null;
            }
            return r;
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f85283c, j);
                drain();
            }
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f85287m = true;
            return 2;
        }
    }

    public tlf(pof<T> pofVar, py6<? super T, ? extends Iterable<? extends R>> py6Var) {
        this.f85279b = pofVar;
        this.f85280c = py6Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        this.f85279b.subscribe(new C13098a(ycgVar, this.f85280c));
    }
}
