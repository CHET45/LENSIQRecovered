package p000;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class nxb<T, U, V> extends vkb<V> {

    /* JADX INFO: renamed from: a */
    public final vkb<? extends T> f65959a;

    /* JADX INFO: renamed from: b */
    public final Iterable<U> f65960b;

    /* JADX INFO: renamed from: c */
    public final i11<? super T, ? super U, ? extends V> f65961c;

    /* JADX INFO: renamed from: nxb$a */
    public static final class C10107a<T, U, V> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super V> f65962a;

        /* JADX INFO: renamed from: b */
        public final Iterator<U> f65963b;

        /* JADX INFO: renamed from: c */
        public final i11<? super T, ? super U, ? extends V> f65964c;

        /* JADX INFO: renamed from: d */
        public lf4 f65965d;

        /* JADX INFO: renamed from: e */
        public boolean f65966e;

        public C10107a(pxb<? super V> actual, Iterator<U> iterator, i11<? super T, ? super U, ? extends V> zipper) {
            this.f65962a = actual;
            this.f65963b = iterator;
            this.f65964c = zipper;
        }

        /* JADX INFO: renamed from: a */
        public void m18190a(Throwable e) {
            this.f65966e = true;
            this.f65965d.dispose();
            this.f65962a.onError(e);
        }

        @Override // p000.lf4
        public void dispose() {
            this.f65965d.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f65965d.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f65966e) {
                return;
            }
            this.f65966e = true;
            this.f65962a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f65966e) {
                ofe.onError(t);
            } else {
                this.f65966e = true;
                this.f65962a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f65966e) {
                return;
            }
            try {
                U next = this.f65963b.next();
                Objects.requireNonNull(next, "The iterator returned a null value");
                try {
                    V vApply = this.f65964c.apply(t, next);
                    Objects.requireNonNull(vApply, "The zipper function returned a null value");
                    this.f65962a.onNext(vApply);
                    try {
                        if (this.f65963b.hasNext()) {
                            return;
                        }
                        this.f65966e = true;
                        this.f65965d.dispose();
                        this.f65962a.onComplete();
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        m18190a(th);
                    }
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    m18190a(th2);
                }
            } catch (Throwable th3) {
                o75.throwIfFatal(th3);
                m18190a(th3);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f65965d, d)) {
                this.f65965d = d;
                this.f65962a.onSubscribe(this);
            }
        }
    }

    public nxb(vkb<? extends T> source, Iterable<U> other, i11<? super T, ? super U, ? extends V> zipper) {
        this.f65959a = source;
        this.f65960b = other;
        this.f65961c = zipper;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super V> t) {
        try {
            Iterator<U> it = this.f65960b.iterator();
            Objects.requireNonNull(it, "The iterator returned by other is null");
            Iterator<U> it2 = it;
            try {
                if (it2.hasNext()) {
                    this.f65959a.subscribe(new C10107a(t, it2, this.f65961c));
                } else {
                    b05.complete(t);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                b05.error(th, t);
            }
        } catch (Throwable th2) {
            o75.throwIfFatal(th2);
            b05.error(th2, t);
        }
    }
}
