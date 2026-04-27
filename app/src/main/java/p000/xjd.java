package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class xjd<T> extends mcg<T> {

    /* JADX INFO: renamed from: c */
    public static final C15163a[] f98237c = new C15163a[0];

    /* JADX INFO: renamed from: d */
    public static final C15163a[] f98238d = new C15163a[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C15163a<T>[]> f98239a = new AtomicReference<>(f98238d);

    /* JADX INFO: renamed from: b */
    public Throwable f98240b;

    /* JADX INFO: renamed from: xjd$a */
    public static final class C15163a<T> extends AtomicBoolean implements mf4 {
        private static final long serialVersionUID = 3562861878281475070L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f98241a;

        /* JADX INFO: renamed from: b */
        public final xjd<T> f98242b;

        public C15163a(oxb<? super T> oxbVar, xjd<T> xjdVar) {
            this.f98241a = oxbVar;
            this.f98242b = xjdVar;
        }

        @Override // p000.mf4
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f98242b.m25242b(this);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get();
        }

        public void onComplete() {
            if (get()) {
                return;
            }
            this.f98241a.onComplete();
        }

        public void onError(Throwable th) {
            if (get()) {
                pfe.onError(th);
            } else {
                this.f98241a.onError(th);
            }
        }

        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.f98241a.onNext(t);
        }
    }

    @bfb
    @by1
    public static <T> xjd<T> create() {
        return new xjd<>();
    }

    /* JADX INFO: renamed from: a */
    public boolean m25241a(C15163a<T> c15163a) {
        C15163a<T>[] c15163aArr;
        C15163a[] c15163aArr2;
        do {
            c15163aArr = this.f98239a.get();
            if (c15163aArr == f98237c) {
                return false;
            }
            int length = c15163aArr.length;
            c15163aArr2 = new C15163a[length + 1];
            System.arraycopy(c15163aArr, 0, c15163aArr2, 0, length);
            c15163aArr2[length] = c15163a;
        } while (!v7b.m23844a(this.f98239a, c15163aArr, c15163aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m25242b(C15163a<T> c15163a) {
        C15163a<T>[] c15163aArr;
        C15163a[] c15163aArr2;
        do {
            c15163aArr = this.f98239a.get();
            if (c15163aArr == f98237c || c15163aArr == f98238d) {
                return;
            }
            int length = c15163aArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c15163aArr[i] == c15163a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c15163aArr2 = f98238d;
            } else {
                C15163a[] c15163aArr3 = new C15163a[length - 1];
                System.arraycopy(c15163aArr, 0, c15163aArr3, 0, i);
                System.arraycopy(c15163aArr, i + 1, c15163aArr3, i, (length - i) - 1);
                c15163aArr2 = c15163aArr3;
            }
        } while (!v7b.m23844a(this.f98239a, c15163aArr, c15163aArr2));
    }

    @Override // p000.mcg
    @cib
    public Throwable getThrowable() {
        if (this.f98239a.get() == f98237c) {
            return this.f98240b;
        }
        return null;
    }

    @Override // p000.mcg
    public boolean hasComplete() {
        return this.f98239a.get() == f98237c && this.f98240b == null;
    }

    @Override // p000.mcg
    public boolean hasObservers() {
        return this.f98239a.get().length != 0;
    }

    @Override // p000.mcg
    public boolean hasThrowable() {
        return this.f98239a.get() == f98237c && this.f98240b != null;
    }

    @Override // p000.oxb
    public void onComplete() {
        C15163a<T>[] c15163aArr = this.f98239a.get();
        C15163a<T>[] c15163aArr2 = f98237c;
        if (c15163aArr == c15163aArr2) {
            return;
        }
        for (C15163a<T> c15163a : this.f98239a.getAndSet(c15163aArr2)) {
            c15163a.onComplete();
        }
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        xjb.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C15163a<T>[] c15163aArr = this.f98239a.get();
        C15163a<T>[] c15163aArr2 = f98237c;
        if (c15163aArr == c15163aArr2) {
            pfe.onError(th);
            return;
        }
        this.f98240b = th;
        for (C15163a<T> c15163a : this.f98239a.getAndSet(c15163aArr2)) {
            c15163a.onError(th);
        }
    }

    @Override // p000.oxb
    public void onNext(T t) {
        xjb.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C15163a<T> c15163a : this.f98239a.get()) {
            c15163a.onNext(t);
        }
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        if (this.f98239a.get() == f98237c) {
            mf4Var.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C15163a<T> c15163a = new C15163a<>(oxbVar, this);
        oxbVar.onSubscribe(c15163a);
        if (m25241a(c15163a)) {
            if (c15163a.isDisposed()) {
                m25242b(c15163a);
            }
        } else {
            Throwable th = this.f98240b;
            if (th != null) {
                oxbVar.onError(th);
            } else {
                oxbVar.onComplete();
            }
        }
    }
}
