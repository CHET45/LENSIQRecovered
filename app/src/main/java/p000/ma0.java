package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ma0<T> extends ncg<T> {

    /* JADX INFO: renamed from: d */
    public static final C9232a[] f60322d = new C9232a[0];

    /* JADX INFO: renamed from: e */
    public static final C9232a[] f60323e = new C9232a[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C9232a<T>[]> f60324a = new AtomicReference<>(f60322d);

    /* JADX INFO: renamed from: b */
    public Throwable f60325b;

    /* JADX INFO: renamed from: c */
    public T f60326c;

    /* JADX INFO: renamed from: ma0$a */
    public static final class C9232a<T> extends d34<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* JADX INFO: renamed from: C */
        public final ma0<T> f60327C;

        public C9232a(pxb<? super T> actual, ma0<T> parent) {
            super(actual);
            this.f60327C = parent;
        }

        @Override // p000.d34, p000.lf4
        public void dispose() {
            if (super.tryDispose()) {
                this.f60327C.m17182b(this);
            }
        }

        public void onComplete() {
            if (isDisposed()) {
                return;
            }
            this.f28317a.onComplete();
        }

        public void onError(Throwable t) {
            if (isDisposed()) {
                ofe.onError(t);
            } else {
                this.f28317a.onError(t);
            }
        }
    }

    @cfb
    @cy1
    public static <T> ma0<T> create() {
        return new ma0<>();
    }

    /* JADX INFO: renamed from: a */
    public boolean m17181a(C9232a<T> ps) {
        C9232a<T>[] c9232aArr;
        C9232a[] c9232aArr2;
        do {
            c9232aArr = this.f60324a.get();
            if (c9232aArr == f60323e) {
                return false;
            }
            int length = c9232aArr.length;
            c9232aArr2 = new C9232a[length + 1];
            System.arraycopy(c9232aArr, 0, c9232aArr2, 0, length);
            c9232aArr2[length] = ps;
        } while (!v7b.m23844a(this.f60324a, c9232aArr, c9232aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m17182b(C9232a<T> ps) {
        C9232a<T>[] c9232aArr;
        C9232a[] c9232aArr2;
        do {
            c9232aArr = this.f60324a.get();
            int length = c9232aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c9232aArr[i] == ps) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c9232aArr2 = f60322d;
            } else {
                C9232a[] c9232aArr3 = new C9232a[length - 1];
                System.arraycopy(c9232aArr, 0, c9232aArr3, 0, i);
                System.arraycopy(c9232aArr, i + 1, c9232aArr3, i, (length - i) - 1);
                c9232aArr2 = c9232aArr3;
            }
        } while (!v7b.m23844a(this.f60324a, c9232aArr, c9232aArr2));
    }

    @Override // p000.ncg
    @cy1
    public Throwable getThrowable() {
        if (this.f60324a.get() == f60323e) {
            return this.f60325b;
        }
        return null;
    }

    @dib
    @cy1
    public T getValue() {
        if (this.f60324a.get() == f60323e) {
            return this.f60326c;
        }
        return null;
    }

    @Override // p000.ncg
    @cy1
    public boolean hasComplete() {
        return this.f60324a.get() == f60323e && this.f60325b == null;
    }

    @Override // p000.ncg
    @cy1
    public boolean hasObservers() {
        return this.f60324a.get().length != 0;
    }

    @Override // p000.ncg
    @cy1
    public boolean hasThrowable() {
        return this.f60324a.get() == f60323e && this.f60325b != null;
    }

    @cy1
    public boolean hasValue() {
        return this.f60324a.get() == f60323e && this.f60326c != null;
    }

    @Override // p000.pxb
    public void onComplete() {
        C9232a<T>[] c9232aArr = this.f60324a.get();
        C9232a<T>[] c9232aArr2 = f60323e;
        if (c9232aArr == c9232aArr2) {
            return;
        }
        T t = this.f60326c;
        C9232a<T>[] andSet = this.f60324a.getAndSet(c9232aArr2);
        int i = 0;
        if (t == null) {
            int length = andSet.length;
            while (i < length) {
                andSet[i].onComplete();
                i++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i < length2) {
            andSet[i].complete(t);
            i++;
        }
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        k75.nullCheck(t, "onError called with a null Throwable.");
        C9232a<T>[] c9232aArr = this.f60324a.get();
        C9232a<T>[] c9232aArr2 = f60323e;
        if (c9232aArr == c9232aArr2) {
            ofe.onError(t);
            return;
        }
        this.f60326c = null;
        this.f60325b = t;
        for (C9232a<T> c9232a : this.f60324a.getAndSet(c9232aArr2)) {
            c9232a.onError(t);
        }
    }

    @Override // p000.pxb
    public void onNext(T t) {
        k75.nullCheck(t, "onNext called with a null value.");
        if (this.f60324a.get() == f60323e) {
            return;
        }
        this.f60326c = t;
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        if (this.f60324a.get() == f60323e) {
            d.dispose();
        }
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        C9232a<T> c9232a = new C9232a<>(observer, this);
        observer.onSubscribe(c9232a);
        if (m17181a(c9232a)) {
            if (c9232a.isDisposed()) {
                m17182b(c9232a);
                return;
            }
            return;
        }
        Throwable th = this.f60325b;
        if (th != null) {
            observer.onError(th);
            return;
        }
        T t = this.f60326c;
        if (t != null) {
            c9232a.complete(t);
        } else {
            c9232a.onComplete();
        }
    }
}
