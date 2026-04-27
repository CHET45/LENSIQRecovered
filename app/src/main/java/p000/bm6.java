package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class bm6<T, U, V> extends AbstractC8162k1<T, V> {

    /* JADX INFO: renamed from: c */
    public final Iterable<U> f14126c;

    /* JADX INFO: renamed from: d */
    public final j11<? super T, ? super U, ? extends V> f14127d;

    /* JADX INFO: renamed from: bm6$a */
    public static final class C1945a<T, U, V> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super V> f14128a;

        /* JADX INFO: renamed from: b */
        public final Iterator<U> f14129b;

        /* JADX INFO: renamed from: c */
        public final j11<? super T, ? super U, ? extends V> f14130c;

        /* JADX INFO: renamed from: d */
        public fdg f14131d;

        /* JADX INFO: renamed from: e */
        public boolean f14132e;

        public C1945a(ycg<? super V> ycgVar, Iterator<U> it, j11<? super T, ? super U, ? extends V> j11Var) {
            this.f14128a = ycgVar;
            this.f14129b = it;
            this.f14130c = j11Var;
        }

        /* JADX INFO: renamed from: a */
        public void m3248a(Throwable th) {
            n75.throwIfFatal(th);
            this.f14132e = true;
            this.f14131d.cancel();
            this.f14128a.onError(th);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f14131d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f14132e) {
                return;
            }
            this.f14132e = true;
            this.f14128a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f14132e) {
                pfe.onError(th);
            } else {
                this.f14132e = true;
                this.f14128a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f14132e) {
                return;
            }
            try {
                try {
                    this.f14128a.onNext(xjb.requireNonNull(this.f14130c.apply(t, xjb.requireNonNull(this.f14129b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.f14129b.hasNext()) {
                            return;
                        }
                        this.f14132e = true;
                        this.f14131d.cancel();
                        this.f14128a.onComplete();
                    } catch (Throwable th) {
                        m3248a(th);
                    }
                } catch (Throwable th2) {
                    m3248a(th2);
                }
            } catch (Throwable th3) {
                m3248a(th3);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f14131d, fdgVar)) {
                this.f14131d = fdgVar;
                this.f14128a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f14131d.request(j);
        }
    }

    public bm6(m86<T> m86Var, Iterable<U> iterable, j11<? super T, ? super U, ? extends V> j11Var) {
        super(m86Var);
        this.f14126c = iterable;
        this.f14127d = j11Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super V> ycgVar) {
        try {
            Iterator it = (Iterator) xjb.requireNonNull(this.f14126c.iterator(), "The iterator returned by other is null");
            try {
                if (it.hasNext()) {
                    this.f52360b.subscribe((lj6) new C1945a(ycgVar, it, this.f14127d));
                } else {
                    x05.complete(ycgVar);
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                x05.error(th, ycgVar);
            }
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            x05.error(th2, ycgVar);
        }
    }
}
