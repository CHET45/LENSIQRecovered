package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class g7a<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final z9a<T> f38953b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends Iterable<? extends R>> f38954c;

    /* JADX INFO: renamed from: g7a$a */
    public static final class C6157a<T, R> extends rv0<R> implements k9a<T> {
        private static final long serialVersionUID = -8938804753851907758L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f38955a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends Iterable<? extends R>> f38956b;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f38957c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public lf4 f38958d;

        /* JADX INFO: renamed from: e */
        public volatile Iterator<? extends R> f38959e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f38960f;

        /* JADX INFO: renamed from: m */
        public boolean f38961m;

        public C6157a(ycg<? super R> actual, sy6<? super T, ? extends Iterable<? extends R>> mapper) {
            this.f38955a = actual;
            this.f38956b = mapper;
        }

        /* JADX INFO: renamed from: a */
        public void m11422a(ycg<? super R> ycgVar, Iterator<? extends R> it) {
            while (!this.f38960f) {
                try {
                    ycgVar.onNext(it.next());
                    if (this.f38960f) {
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
            this.f38960f = true;
            this.f38958d.dispose();
            this.f38958d = zf4.DISPOSED;
        }

        @Override // p000.zif
        public void clear() {
            this.f38959e = null;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f38955a;
            Iterator<? extends R> it = this.f38959e;
            if (this.f38961m && it != null) {
                ycgVar.onNext(null);
                ycgVar.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j = this.f38957c.get();
                    if (j == Long.MAX_VALUE) {
                        m11422a(ycgVar, it);
                        return;
                    }
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.f38960f) {
                            return;
                        }
                        try {
                            R next = it.next();
                            Objects.requireNonNull(next, "The iterator returned a null value");
                            ycgVar.onNext(next);
                            if (this.f38960f) {
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
                        ro0.produced(this.f38957c, j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f38959e;
                }
            }
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f38959e == null;
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f38955a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f38958d = zf4.DISPOSED;
            this.f38955a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f38958d, d)) {
                this.f38958d = d;
                this.f38955a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            try {
                Iterator<? extends R> it = this.f38956b.apply(value).iterator();
                if (!it.hasNext()) {
                    this.f38955a.onComplete();
                } else {
                    this.f38959e = it;
                    drain();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f38955a.onError(th);
            }
        }

        @Override // p000.zif
        @dib
        public R poll() {
            Iterator<? extends R> it = this.f38959e;
            if (it == null) {
                return null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f38959e = null;
            }
            return next;
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f38957c, n);
                drain();
            }
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 2) == 0) {
                return 0;
            }
            this.f38961m = true;
            return 2;
        }
    }

    public g7a(z9a<T> source, sy6<? super T, ? extends Iterable<? extends R>> mapper) {
        this.f38953b = source;
        this.f38954c = mapper;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f38953b.subscribe(new C6157a(s, this.f38954c));
    }
}
