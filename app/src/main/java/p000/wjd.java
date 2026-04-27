package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class wjd<T> extends ncg<T> {

    /* JADX INFO: renamed from: c */
    public static final C14647a[] f94431c = new C14647a[0];

    /* JADX INFO: renamed from: d */
    public static final C14647a[] f94432d = new C14647a[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C14647a<T>[]> f94433a = new AtomicReference<>(f94432d);

    /* JADX INFO: renamed from: b */
    public Throwable f94434b;

    /* JADX INFO: renamed from: wjd$a */
    public static final class C14647a<T> extends AtomicBoolean implements lf4 {
        private static final long serialVersionUID = 3562861878281475070L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f94435a;

        /* JADX INFO: renamed from: b */
        public final wjd<T> f94436b;

        public C14647a(pxb<? super T> actual, wjd<T> parent) {
            this.f94435a = actual;
            this.f94436b = parent;
        }

        @Override // p000.lf4
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f94436b.m24613b(this);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get();
        }

        public void onComplete() {
            if (get()) {
                return;
            }
            this.f94435a.onComplete();
        }

        public void onError(Throwable t) {
            if (get()) {
                ofe.onError(t);
            } else {
                this.f94435a.onError(t);
            }
        }

        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.f94435a.onNext(t);
        }
    }

    @cfb
    @cy1
    public static <T> wjd<T> create() {
        return new wjd<>();
    }

    /* JADX INFO: renamed from: a */
    public boolean m24612a(C14647a<T> ps) {
        C14647a<T>[] c14647aArr;
        C14647a[] c14647aArr2;
        do {
            c14647aArr = this.f94433a.get();
            if (c14647aArr == f94431c) {
                return false;
            }
            int length = c14647aArr.length;
            c14647aArr2 = new C14647a[length + 1];
            System.arraycopy(c14647aArr, 0, c14647aArr2, 0, length);
            c14647aArr2[length] = ps;
        } while (!v7b.m23844a(this.f94433a, c14647aArr, c14647aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m24613b(C14647a<T> ps) {
        C14647a<T>[] c14647aArr;
        C14647a[] c14647aArr2;
        do {
            c14647aArr = this.f94433a.get();
            if (c14647aArr == f94431c || c14647aArr == f94432d) {
                return;
            }
            int length = c14647aArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c14647aArr[i] == ps) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c14647aArr2 = f94432d;
            } else {
                C14647a[] c14647aArr3 = new C14647a[length - 1];
                System.arraycopy(c14647aArr, 0, c14647aArr3, 0, i);
                System.arraycopy(c14647aArr, i + 1, c14647aArr3, i, (length - i) - 1);
                c14647aArr2 = c14647aArr3;
            }
        } while (!v7b.m23844a(this.f94433a, c14647aArr, c14647aArr2));
    }

    @Override // p000.ncg
    @dib
    @cy1
    public Throwable getThrowable() {
        if (this.f94433a.get() == f94431c) {
            return this.f94434b;
        }
        return null;
    }

    @Override // p000.ncg
    @cy1
    public boolean hasComplete() {
        return this.f94433a.get() == f94431c && this.f94434b == null;
    }

    @Override // p000.ncg
    @cy1
    public boolean hasObservers() {
        return this.f94433a.get().length != 0;
    }

    @Override // p000.ncg
    @cy1
    public boolean hasThrowable() {
        return this.f94433a.get() == f94431c && this.f94434b != null;
    }

    @Override // p000.pxb
    public void onComplete() {
        C14647a<T>[] c14647aArr = this.f94433a.get();
        C14647a<T>[] c14647aArr2 = f94431c;
        if (c14647aArr == c14647aArr2) {
            return;
        }
        for (C14647a<T> c14647a : this.f94433a.getAndSet(c14647aArr2)) {
            c14647a.onComplete();
        }
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        k75.nullCheck(t, "onError called with a null Throwable.");
        C14647a<T>[] c14647aArr = this.f94433a.get();
        C14647a<T>[] c14647aArr2 = f94431c;
        if (c14647aArr == c14647aArr2) {
            ofe.onError(t);
            return;
        }
        this.f94434b = t;
        for (C14647a<T> c14647a : this.f94433a.getAndSet(c14647aArr2)) {
            c14647a.onError(t);
        }
    }

    @Override // p000.pxb
    public void onNext(T t) {
        k75.nullCheck(t, "onNext called with a null value.");
        for (C14647a<T> c14647a : this.f94433a.get()) {
            c14647a.onNext(t);
        }
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        if (this.f94433a.get() == f94431c) {
            d.dispose();
        }
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        C14647a<T> c14647a = new C14647a<>(t, this);
        t.onSubscribe(c14647a);
        if (m24612a(c14647a)) {
            if (c14647a.isDisposed()) {
                m24613b(c14647a);
            }
        } else {
            Throwable th = this.f94434b;
            if (th != null) {
                t.onError(th);
            } else {
                t.onComplete();
            }
        }
    }
}
