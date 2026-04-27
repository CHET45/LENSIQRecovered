package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class jsb<T> extends pr2<T> implements ch7<T>, m5e {

    /* JADX INFO: renamed from: a */
    public final xub<T> f51719a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C8058b<T>> f51720b = new AtomicReference<>();

    /* JADX INFO: renamed from: jsb$a */
    public static final class C8057a<T> extends AtomicReference<C8058b<T>> implements mf4 {
        private static final long serialVersionUID = 7463222674719692880L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f51721a;

        public C8057a(oxb<? super T> oxbVar, C8058b<T> c8058b) {
            this.f51721a = oxbVar;
            lazySet(c8058b);
        }

        @Override // p000.mf4
        public void dispose() {
            C8058b<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.remove(this);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == null;
        }
    }

    /* JADX INFO: renamed from: jsb$b */
    public static final class C8058b<T> extends AtomicReference<C8057a<T>[]> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: e */
        public static final C8057a[] f51722e = new C8057a[0];

        /* JADX INFO: renamed from: f */
        public static final C8057a[] f51723f = new C8057a[0];
        private static final long serialVersionUID = -3251430252873581268L;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<C8058b<T>> f51725b;

        /* JADX INFO: renamed from: d */
        public Throwable f51727d;

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f51724a = new AtomicBoolean();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<mf4> f51726c = new AtomicReference<>();

        public C8058b(AtomicReference<C8058b<T>> atomicReference) {
            this.f51725b = atomicReference;
            lazySet(f51722e);
        }

        public boolean add(C8057a<T> c8057a) {
            C8057a<T>[] c8057aArr;
            C8057a[] c8057aArr2;
            do {
                c8057aArr = get();
                if (c8057aArr == f51723f) {
                    return false;
                }
                int length = c8057aArr.length;
                c8057aArr2 = new C8057a[length + 1];
                System.arraycopy(c8057aArr, 0, c8057aArr2, 0, length);
                c8057aArr2[length] = c8057a;
            } while (!compareAndSet(c8057aArr, c8057aArr2));
            return true;
        }

        @Override // p000.mf4
        public void dispose() {
            getAndSet(f51723f);
            v7b.m23844a(this.f51725b, this, null);
            ag4.dispose(this.f51726c);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == f51723f;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f51726c.lazySet(ag4.DISPOSED);
            for (C8057a<T> c8057a : getAndSet(f51723f)) {
                c8057a.f51721a.onComplete();
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f51727d = th;
            this.f51726c.lazySet(ag4.DISPOSED);
            for (C8057a<T> c8057a : getAndSet(f51723f)) {
                c8057a.f51721a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            for (C8057a<T> c8057a : get()) {
                c8057a.f51721a.onNext(t);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f51726c, mf4Var);
        }

        public void remove(C8057a<T> c8057a) {
            C8057a<T>[] c8057aArr;
            C8057a[] c8057aArr2;
            do {
                c8057aArr = get();
                int length = c8057aArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c8057aArr[i] == c8057a) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                c8057aArr2 = f51722e;
                if (length != 1) {
                    c8057aArr2 = new C8057a[length - 1];
                    System.arraycopy(c8057aArr, 0, c8057aArr2, 0, i);
                    System.arraycopy(c8057aArr, i + 1, c8057aArr2, i, (length - i) - 1);
                }
            } while (!compareAndSet(c8057aArr, c8057aArr2));
        }
    }

    public jsb(xub<T> xubVar) {
        this.f51719a = xubVar;
    }

    @Override // p000.pr2
    public void connect(tu2<? super mf4> tu2Var) {
        C8058b<T> c8058b;
        while (true) {
            c8058b = this.f51720b.get();
            if (c8058b != null && !c8058b.isDisposed()) {
                break;
            }
            C8058b<T> c8058b2 = new C8058b<>(this.f51720b);
            if (v7b.m23844a(this.f51720b, c8058b, c8058b2)) {
                c8058b = c8058b2;
                break;
            }
        }
        boolean z = false;
        if (!c8058b.f51724a.get() && c8058b.f51724a.compareAndSet(false, true)) {
            z = true;
        }
        try {
            tu2Var.accept(c8058b);
            if (z) {
                this.f51719a.subscribe(c8058b);
            }
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            throw j75.wrapOrThrow(th);
        }
    }

    @Override // p000.m5e
    public void resetIf(mf4 mf4Var) {
        v7b.m23844a(this.f51720b, (C8058b) mf4Var, null);
    }

    @Override // p000.ch7
    public xub<T> source() {
        return this.f51719a;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C8058b<T> c8058b;
        while (true) {
            c8058b = this.f51720b.get();
            if (c8058b != null) {
                break;
            }
            C8058b<T> c8058b2 = new C8058b<>(this.f51720b);
            if (v7b.m23844a(this.f51720b, c8058b, c8058b2)) {
                c8058b = c8058b2;
                break;
            }
        }
        C8057a<T> c8057a = new C8057a<>(oxbVar, c8058b);
        oxbVar.onSubscribe(c8057a);
        if (c8058b.add(c8057a)) {
            if (c8057a.isDisposed()) {
                c8058b.remove(c8057a);
            }
        } else {
            Throwable th = c8058b.f51727d;
            if (th != null) {
                oxbVar.onError(th);
            } else {
                oxbVar.onComplete();
            }
        }
    }
}
