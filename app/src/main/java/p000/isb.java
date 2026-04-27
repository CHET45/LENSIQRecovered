package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class isb<T> extends or2<T> implements bh7<T> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f48128a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C7584b<T>> f48129b = new AtomicReference<>();

    /* JADX INFO: renamed from: isb$a */
    public static final class C7583a<T> extends AtomicReference<C7584b<T>> implements lf4 {
        private static final long serialVersionUID = 7463222674719692880L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f48130a;

        public C7583a(pxb<? super T> downstream, C7584b<T> parent) {
            this.f48130a = downstream;
            lazySet(parent);
        }

        @Override // p000.lf4
        public void dispose() {
            C7584b<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.remove(this);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == null;
        }
    }

    /* JADX INFO: renamed from: isb$b */
    public static final class C7584b<T> extends AtomicReference<C7583a<T>[]> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: e */
        public static final C7583a[] f48131e = new C7583a[0];

        /* JADX INFO: renamed from: f */
        public static final C7583a[] f48132f = new C7583a[0];
        private static final long serialVersionUID = -3251430252873581268L;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<C7584b<T>> f48134b;

        /* JADX INFO: renamed from: d */
        public Throwable f48136d;

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f48133a = new AtomicBoolean();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<lf4> f48135c = new AtomicReference<>();

        public C7584b(AtomicReference<C7584b<T>> current) {
            this.f48134b = current;
            lazySet(f48131e);
        }

        public boolean add(C7583a<T> inner) {
            C7583a<T>[] c7583aArr;
            C7583a[] c7583aArr2;
            do {
                c7583aArr = get();
                if (c7583aArr == f48132f) {
                    return false;
                }
                int length = c7583aArr.length;
                c7583aArr2 = new C7583a[length + 1];
                System.arraycopy(c7583aArr, 0, c7583aArr2, 0, length);
                c7583aArr2[length] = inner;
            } while (!compareAndSet(c7583aArr, c7583aArr2));
            return true;
        }

        @Override // p000.lf4
        public void dispose() {
            getAndSet(f48132f);
            v7b.m23844a(this.f48134b, this, null);
            zf4.dispose(this.f48135c);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == f48132f;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f48135c.lazySet(zf4.DISPOSED);
            for (C7583a<T> c7583a : getAndSet(f48132f)) {
                c7583a.f48130a.onComplete();
            }
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            lf4 lf4Var = this.f48135c.get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var) {
                ofe.onError(e);
                return;
            }
            this.f48136d = e;
            this.f48135c.lazySet(zf4Var);
            for (C7583a<T> c7583a : getAndSet(f48132f)) {
                c7583a.f48130a.onError(e);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            for (C7583a<T> c7583a : get()) {
                c7583a.f48130a.onNext(t);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f48135c, d);
        }

        public void remove(C7583a<T> inner) {
            C7583a<T>[] c7583aArr;
            C7583a[] c7583aArr2;
            do {
                c7583aArr = get();
                int length = c7583aArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c7583aArr[i] == inner) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                c7583aArr2 = f48131e;
                if (length != 1) {
                    c7583aArr2 = new C7583a[length - 1];
                    System.arraycopy(c7583aArr, 0, c7583aArr2, 0, i);
                    System.arraycopy(c7583aArr, i + 1, c7583aArr2, i, (length - i) - 1);
                }
            } while (!compareAndSet(c7583aArr, c7583aArr2));
        }
    }

    public isb(wub<T> source) {
        this.f48128a = source;
    }

    @Override // p000.or2
    public void connect(uu2<? super lf4> connection) {
        C7584b<T> c7584b;
        while (true) {
            c7584b = this.f48129b.get();
            if (c7584b != null && !c7584b.isDisposed()) {
                break;
            }
            C7584b<T> c7584b2 = new C7584b<>(this.f48129b);
            if (v7b.m23844a(this.f48129b, c7584b, c7584b2)) {
                c7584b = c7584b2;
                break;
            }
        }
        boolean z = false;
        if (!c7584b.f48133a.get() && c7584b.f48133a.compareAndSet(false, true)) {
            z = true;
        }
        try {
            connection.accept(c7584b);
            if (z) {
                this.f48128a.subscribe(c7584b);
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            throw k75.wrapOrThrow(th);
        }
    }

    @Override // p000.or2
    public void reset() {
        C7584b<T> c7584b = this.f48129b.get();
        if (c7584b == null || !c7584b.isDisposed()) {
            return;
        }
        v7b.m23844a(this.f48129b, c7584b, null);
    }

    @Override // p000.bh7
    public wub<T> source() {
        return this.f48128a;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        C7584b<T> c7584b;
        while (true) {
            c7584b = this.f48129b.get();
            if (c7584b != null) {
                break;
            }
            C7584b<T> c7584b2 = new C7584b<>(this.f48129b);
            if (v7b.m23844a(this.f48129b, c7584b, c7584b2)) {
                c7584b = c7584b2;
                break;
            }
        }
        C7583a<T> c7583a = new C7583a<>(observer, c7584b);
        observer.onSubscribe(c7583a);
        if (c7584b.add(c7583a)) {
            if (c7583a.isDisposed()) {
                c7584b.remove(c7583a);
            }
        } else {
            Throwable th = c7584b.f48136d;
            if (th != null) {
                observer.onError(th);
            } else {
                observer.onComplete();
            }
        }
    }
}
