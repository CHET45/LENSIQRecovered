package p000;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class cm6<T, U, V> extends AbstractC7714j1<T, V> {

    /* JADX INFO: renamed from: c */
    public final Iterable<U> f16938c;

    /* JADX INFO: renamed from: d */
    public final i11<? super T, ? super U, ? extends V> f16939d;

    /* JADX INFO: renamed from: cm6$a */
    public static final class C2386a<T, U, V> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super V> f16940a;

        /* JADX INFO: renamed from: b */
        public final Iterator<U> f16941b;

        /* JADX INFO: renamed from: c */
        public final i11<? super T, ? super U, ? extends V> f16942c;

        /* JADX INFO: renamed from: d */
        public fdg f16943d;

        /* JADX INFO: renamed from: e */
        public boolean f16944e;

        public C2386a(ycg<? super V> actual, Iterator<U> iterator, i11<? super T, ? super U, ? extends V> zipper) {
            this.f16940a = actual;
            this.f16941b = iterator;
            this.f16942c = zipper;
        }

        /* JADX INFO: renamed from: a */
        public void m4070a(Throwable e) {
            o75.throwIfFatal(e);
            this.f16944e = true;
            this.f16943d.cancel();
            this.f16940a.onError(e);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f16943d.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f16944e) {
                return;
            }
            this.f16944e = true;
            this.f16940a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f16944e) {
                ofe.onError(t);
            } else {
                this.f16944e = true;
                this.f16940a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f16944e) {
                return;
            }
            try {
                U next = this.f16941b.next();
                Objects.requireNonNull(next, "The iterator returned a null value");
                try {
                    V vApply = this.f16942c.apply(t, next);
                    Objects.requireNonNull(vApply, "The zipper function returned a null value");
                    this.f16940a.onNext(vApply);
                    try {
                        if (this.f16941b.hasNext()) {
                            return;
                        }
                        this.f16944e = true;
                        this.f16943d.cancel();
                        this.f16940a.onComplete();
                    } catch (Throwable th) {
                        m4070a(th);
                    }
                } catch (Throwable th2) {
                    m4070a(th2);
                }
            } catch (Throwable th3) {
                m4070a(th3);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f16943d, s)) {
                this.f16943d = s;
                this.f16940a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f16943d.request(n);
        }
    }

    public cm6(l86<T> source, Iterable<U> other, i11<? super T, ? super U, ? extends V> zipper) {
        super(source);
        this.f16938c = other;
        this.f16939d = zipper;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super V> t) {
        try {
            Iterator<U> it = this.f16938c.iterator();
            Objects.requireNonNull(it, "The iterator returned by other is null");
            Iterator<U> it2 = it;
            try {
                if (it2.hasNext()) {
                    this.f49321b.subscribe((kj6) new C2386a(t, it2, this.f16939d));
                } else {
                    w05.complete(t);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                w05.error(th, t);
            }
        } catch (Throwable th2) {
            o75.throwIfFatal(th2);
            w05.error(th2, t);
        }
    }
}
