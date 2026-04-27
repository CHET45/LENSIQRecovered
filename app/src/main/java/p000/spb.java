package p000;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class spb<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends T> f82526a;

    /* JADX INFO: renamed from: spb$a */
    public static final class C12735a<T> extends zv0<T> {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f82527a;

        /* JADX INFO: renamed from: b */
        public final Iterator<? extends T> f82528b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f82529c;

        /* JADX INFO: renamed from: d */
        public boolean f82530d;

        /* JADX INFO: renamed from: e */
        public boolean f82531e;

        /* JADX INFO: renamed from: f */
        public boolean f82532f;

        public C12735a(pxb<? super T> actual, Iterator<? extends T> it) {
            this.f82527a = actual;
            this.f82528b = it;
        }

        /* JADX INFO: renamed from: a */
        public void m22170a() {
            while (!isDisposed()) {
                try {
                    T next = this.f82528b.next();
                    Objects.requireNonNull(next, "The iterator returned a null value");
                    this.f82527a.onNext(next);
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.f82528b.hasNext()) {
                            if (isDisposed()) {
                                return;
                            }
                            this.f82527a.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        this.f82527a.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    this.f82527a.onError(th2);
                    return;
                }
            }
        }

        @Override // p000.zif
        public void clear() {
            this.f82531e = true;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f82529c = true;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f82529c;
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f82531e;
        }

        @Override // p000.zif
        @dib
        public T poll() {
            if (this.f82531e) {
                return null;
            }
            if (!this.f82532f) {
                this.f82532f = true;
            } else if (!this.f82528b.hasNext()) {
                this.f82531e = true;
                return null;
            }
            T next = this.f82528b.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            return next;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 1) == 0) {
                return 0;
            }
            this.f82530d = true;
            return 1;
        }
    }

    public spb(Iterable<? extends T> source) {
        this.f82526a = source;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        try {
            Iterator<? extends T> it = this.f82526a.iterator();
            try {
                if (!it.hasNext()) {
                    b05.complete(observer);
                    return;
                }
                C12735a c12735a = new C12735a(observer, it);
                observer.onSubscribe(c12735a);
                if (c12735a.f82530d) {
                    return;
                }
                c12735a.m22170a();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                b05.error(th, observer);
            }
        } catch (Throwable th2) {
            o75.throwIfFatal(th2);
            b05.error(th2, observer);
        }
    }
}
