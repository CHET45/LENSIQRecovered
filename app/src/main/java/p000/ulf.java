package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class ulf<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final oof<T> f88406b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends Iterable<? extends R>> f88407c;

    /* JADX INFO: renamed from: ulf$a */
    public static final class C13589a<T, R> extends rv0<R> implements hnf<T> {
        private static final long serialVersionUID = -8938804753851907758L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f88408a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends Iterable<? extends R>> f88409b;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f88410c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public lf4 f88411d;

        /* JADX INFO: renamed from: e */
        public volatile Iterator<? extends R> f88412e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f88413f;

        /* JADX INFO: renamed from: m */
        public boolean f88414m;

        public C13589a(ycg<? super R> actual, sy6<? super T, ? extends Iterable<? extends R>> mapper) {
            this.f88408a = actual;
            this.f88409b = mapper;
        }

        /* JADX INFO: renamed from: a */
        public void m23422a(ycg<? super R> ycgVar, Iterator<? extends R> it) {
            while (!this.f88413f) {
                try {
                    ycgVar.onNext(it.next());
                    if (this.f88413f) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            ycgVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        ycgVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    ycgVar.onError(th2);
                    return;
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f88413f = true;
            this.f88411d.dispose();
            this.f88411d = zf4.DISPOSED;
        }

        @Override // p000.zif
        public void clear() {
            this.f88412e = null;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f88408a;
            Iterator<? extends R> it = this.f88412e;
            if (this.f88414m && it != null) {
                ycgVar.onNext(null);
                ycgVar.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j = this.f88410c.get();
                    if (j == Long.MAX_VALUE) {
                        m23422a(ycgVar, it);
                        return;
                    }
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.f88413f) {
                            return;
                        }
                        try {
                            R next = it.next();
                            Objects.requireNonNull(next, "The iterator returned a null value");
                            ycgVar.onNext(next);
                            if (this.f88413f) {
                                return;
                            }
                            j2++;
                            try {
                                if (!it.hasNext()) {
                                    ycgVar.onComplete();
                                    return;
                                }
                            } catch (Throwable th) {
                                o75.throwIfFatal(th);
                                ycgVar.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            o75.throwIfFatal(th2);
                            ycgVar.onError(th2);
                            return;
                        }
                    }
                    if (j2 != 0) {
                        ro0.produced(this.f88410c, j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f88412e;
                }
            }
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f88412e == null;
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f88411d = zf4.DISPOSED;
            this.f88408a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f88411d, d)) {
                this.f88411d = d;
                this.f88408a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            try {
                Iterator<? extends R> it = this.f88409b.apply(value).iterator();
                if (!it.hasNext()) {
                    this.f88408a.onComplete();
                } else {
                    this.f88412e = it;
                    drain();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f88408a.onError(th);
            }
        }

        @Override // p000.zif
        @dib
        public R poll() {
            Iterator<? extends R> it = this.f88412e;
            if (it == null) {
                return null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f88412e = null;
            }
            return next;
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f88410c, n);
                drain();
            }
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 2) == 0) {
                return 0;
            }
            this.f88414m = true;
            return 2;
        }
    }

    public ulf(oof<T> source, sy6<? super T, ? extends Iterable<? extends R>> mapper) {
        this.f88406b = source;
        this.f88407c = mapper;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f88406b.subscribe(new C13589a(s, this.f88407c));
    }
}
