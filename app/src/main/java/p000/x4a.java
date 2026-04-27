package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class x4a<T> extends r4a<T> implements k9a<T> {

    /* JADX INFO: renamed from: e */
    public static final C14917a[] f96692e = new C14917a[0];

    /* JADX INFO: renamed from: f */
    public static final C14917a[] f96693f = new C14917a[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference<z9a<T>> f96694a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C14917a<T>[]> f96695b = new AtomicReference<>(f96692e);

    /* JADX INFO: renamed from: c */
    public T f96696c;

    /* JADX INFO: renamed from: d */
    public Throwable f96697d;

    /* JADX INFO: renamed from: x4a$a */
    public static final class C14917a<T> extends AtomicReference<x4a<T>> implements lf4 {
        private static final long serialVersionUID = -5791853038359966195L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f96698a;

        public C14917a(k9a<? super T> actual, x4a<T> parent) {
            super(parent);
            this.f96698a = actual;
        }

        @Override // p000.lf4
        public void dispose() {
            x4a<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m24989b(this);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == null;
        }
    }

    public x4a(z9a<T> source) {
        this.f96694a = new AtomicReference<>(source);
    }

    /* JADX INFO: renamed from: a */
    public boolean m24988a(C14917a<T> inner) {
        C14917a<T>[] c14917aArr;
        C14917a[] c14917aArr2;
        do {
            c14917aArr = this.f96695b.get();
            if (c14917aArr == f96693f) {
                return false;
            }
            int length = c14917aArr.length;
            c14917aArr2 = new C14917a[length + 1];
            System.arraycopy(c14917aArr, 0, c14917aArr2, 0, length);
            c14917aArr2[length] = inner;
        } while (!v7b.m23844a(this.f96695b, c14917aArr, c14917aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m24989b(C14917a<T> inner) {
        C14917a<T>[] c14917aArr;
        C14917a[] c14917aArr2;
        do {
            c14917aArr = this.f96695b.get();
            int length = c14917aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c14917aArr[i] == inner) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c14917aArr2 = f96692e;
            } else {
                C14917a[] c14917aArr3 = new C14917a[length - 1];
                System.arraycopy(c14917aArr, 0, c14917aArr3, 0, i);
                System.arraycopy(c14917aArr, i + 1, c14917aArr3, i, (length - i) - 1);
                c14917aArr2 = c14917aArr3;
            }
        } while (!v7b.m23844a(this.f96695b, c14917aArr, c14917aArr2));
    }

    @Override // p000.k9a
    public void onComplete() {
        for (C14917a<T> c14917a : this.f96695b.getAndSet(f96693f)) {
            if (!c14917a.isDisposed()) {
                c14917a.f96698a.onComplete();
            }
        }
    }

    @Override // p000.k9a
    public void onError(Throwable e) {
        this.f96697d = e;
        for (C14917a<T> c14917a : this.f96695b.getAndSet(f96693f)) {
            if (!c14917a.isDisposed()) {
                c14917a.f96698a.onError(e);
            }
        }
    }

    @Override // p000.k9a
    public void onSubscribe(lf4 d) {
    }

    @Override // p000.k9a
    public void onSuccess(T value) {
        this.f96696c = value;
        for (C14917a<T> c14917a : this.f96695b.getAndSet(f96693f)) {
            if (!c14917a.isDisposed()) {
                c14917a.f96698a.onSuccess(value);
            }
        }
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> k9aVar) {
        C14917a<T> c14917a = new C14917a<>(k9aVar, this);
        k9aVar.onSubscribe(c14917a);
        if (m24988a(c14917a)) {
            if (c14917a.isDisposed()) {
                m24989b(c14917a);
                return;
            }
            z9a<T> andSet = this.f96694a.getAndSet(null);
            if (andSet != null) {
                andSet.subscribe(this);
                return;
            }
            return;
        }
        if (c14917a.isDisposed()) {
            return;
        }
        Throwable th = this.f96697d;
        if (th != null) {
            k9aVar.onError(th);
            return;
        }
        T t = this.f96696c;
        if (t != null) {
            k9aVar.onSuccess(t);
        } else {
            k9aVar.onComplete();
        }
    }
}
