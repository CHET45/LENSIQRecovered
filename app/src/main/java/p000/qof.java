package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class qof<T> extends kjf<T> implements hnf<T> {

    /* JADX INFO: renamed from: e */
    public static final C11573a[] f75050e = new C11573a[0];

    /* JADX INFO: renamed from: f */
    public static final C11573a[] f75051f = new C11573a[0];

    /* JADX INFO: renamed from: c */
    public T f75054c;

    /* JADX INFO: renamed from: d */
    public Throwable f75055d;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f75053b = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C11573a<T>[]> f75052a = new AtomicReference<>(f75050e);

    /* JADX INFO: renamed from: qof$a */
    public static final class C11573a<T> extends AtomicReference<qof<T>> implements lf4 {
        private static final long serialVersionUID = -7650903191002190468L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f75056a;

        public C11573a(hnf<? super T> actual, qof<T> parent) {
            this.f75056a = actual;
            lazySet(parent);
        }

        @Override // p000.lf4
        public void dispose() {
            qof<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m20471c(this);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == null;
        }
    }

    @cfb
    @cy1
    public static <T> qof<T> create() {
        return new qof<>();
    }

    /* JADX INFO: renamed from: a */
    public boolean m20469a(@cfb C11573a<T> inner) {
        C11573a<T>[] c11573aArr;
        C11573a[] c11573aArr2;
        do {
            c11573aArr = this.f75052a.get();
            if (c11573aArr == f75051f) {
                return false;
            }
            int length = c11573aArr.length;
            c11573aArr2 = new C11573a[length + 1];
            System.arraycopy(c11573aArr, 0, c11573aArr2, 0, length);
            c11573aArr2[length] = inner;
        } while (!v7b.m23844a(this.f75052a, c11573aArr, c11573aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public int m20470b() {
        return this.f75052a.get().length;
    }

    /* JADX INFO: renamed from: c */
    public void m20471c(@cfb C11573a<T> inner) {
        C11573a<T>[] c11573aArr;
        C11573a[] c11573aArr2;
        do {
            c11573aArr = this.f75052a.get();
            int length = c11573aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c11573aArr[i] == inner) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c11573aArr2 = f75050e;
            } else {
                C11573a[] c11573aArr3 = new C11573a[length - 1];
                System.arraycopy(c11573aArr, 0, c11573aArr3, 0, i);
                System.arraycopy(c11573aArr, i + 1, c11573aArr3, i, (length - i) - 1);
                c11573aArr2 = c11573aArr3;
            }
        } while (!v7b.m23844a(this.f75052a, c11573aArr, c11573aArr2));
    }

    @dib
    public Throwable getThrowable() {
        if (this.f75052a.get() == f75051f) {
            return this.f75055d;
        }
        return null;
    }

    @dib
    public T getValue() {
        if (this.f75052a.get() == f75051f) {
            return this.f75054c;
        }
        return null;
    }

    public boolean hasObservers() {
        return this.f75052a.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.f75052a.get() == f75051f && this.f75055d != null;
    }

    public boolean hasValue() {
        return this.f75052a.get() == f75051f && this.f75054c != null;
    }

    @Override // p000.hnf
    public void onError(@cfb Throwable e) {
        k75.nullCheck(e, "onError called with a null Throwable.");
        if (!this.f75053b.compareAndSet(false, true)) {
            ofe.onError(e);
            return;
        }
        this.f75055d = e;
        for (C11573a<T> c11573a : this.f75052a.getAndSet(f75051f)) {
            c11573a.f75056a.onError(e);
        }
    }

    @Override // p000.hnf
    public void onSubscribe(@cfb lf4 d) {
        if (this.f75052a.get() == f75051f) {
            d.dispose();
        }
    }

    @Override // p000.hnf
    public void onSuccess(@cfb T value) {
        k75.nullCheck(value, "onSuccess called with a null value.");
        if (this.f75053b.compareAndSet(false, true)) {
            this.f75054c = value;
            for (C11573a<T> c11573a : this.f75052a.getAndSet(f75051f)) {
                c11573a.f75056a.onSuccess(value);
            }
        }
    }

    @Override // p000.kjf
    public void subscribeActual(@cfb hnf<? super T> hnfVar) {
        C11573a<T> c11573a = new C11573a<>(hnfVar, this);
        hnfVar.onSubscribe(c11573a);
        if (m20469a(c11573a)) {
            if (c11573a.isDisposed()) {
                m20471c(c11573a);
            }
        } else {
            Throwable th = this.f75055d;
            if (th != null) {
                hnfVar.onError(th);
            } else {
                hnfVar.onSuccess(this.f75054c);
            }
        }
    }
}
