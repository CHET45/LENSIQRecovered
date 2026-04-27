package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class baa<T> extends r4a<T> implements k9a<T> {

    /* JADX INFO: renamed from: e */
    public static final C1806a[] f13160e = new C1806a[0];

    /* JADX INFO: renamed from: f */
    public static final C1806a[] f13161f = new C1806a[0];

    /* JADX INFO: renamed from: c */
    public T f13164c;

    /* JADX INFO: renamed from: d */
    public Throwable f13165d;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f13163b = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C1806a<T>[]> f13162a = new AtomicReference<>(f13160e);

    /* JADX INFO: renamed from: baa$a */
    public static final class C1806a<T> extends AtomicReference<baa<T>> implements lf4 {
        private static final long serialVersionUID = -7650903191002190468L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f13166a;

        public C1806a(k9a<? super T> actual, baa<T> parent) {
            this.f13166a = actual;
            lazySet(parent);
        }

        @Override // p000.lf4
        public void dispose() {
            baa<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m3023c(this);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == null;
        }
    }

    @cfb
    @cy1
    public static <T> baa<T> create() {
        return new baa<>();
    }

    /* JADX INFO: renamed from: a */
    public boolean m3021a(C1806a<T> inner) {
        C1806a<T>[] c1806aArr;
        C1806a[] c1806aArr2;
        do {
            c1806aArr = this.f13162a.get();
            if (c1806aArr == f13161f) {
                return false;
            }
            int length = c1806aArr.length;
            c1806aArr2 = new C1806a[length + 1];
            System.arraycopy(c1806aArr, 0, c1806aArr2, 0, length);
            c1806aArr2[length] = inner;
        } while (!v7b.m23844a(this.f13162a, c1806aArr, c1806aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public int m3022b() {
        return this.f13162a.get().length;
    }

    /* JADX INFO: renamed from: c */
    public void m3023c(C1806a<T> inner) {
        C1806a<T>[] c1806aArr;
        C1806a[] c1806aArr2;
        do {
            c1806aArr = this.f13162a.get();
            int length = c1806aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c1806aArr[i] == inner) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c1806aArr2 = f13160e;
            } else {
                C1806a[] c1806aArr3 = new C1806a[length - 1];
                System.arraycopy(c1806aArr, 0, c1806aArr3, 0, i);
                System.arraycopy(c1806aArr, i + 1, c1806aArr3, i, (length - i) - 1);
                c1806aArr2 = c1806aArr3;
            }
        } while (!v7b.m23844a(this.f13162a, c1806aArr, c1806aArr2));
    }

    @dib
    public Throwable getThrowable() {
        if (this.f13162a.get() == f13161f) {
            return this.f13165d;
        }
        return null;
    }

    @dib
    public T getValue() {
        if (this.f13162a.get() == f13161f) {
            return this.f13164c;
        }
        return null;
    }

    public boolean hasComplete() {
        return this.f13162a.get() == f13161f && this.f13164c == null && this.f13165d == null;
    }

    public boolean hasObservers() {
        return this.f13162a.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.f13162a.get() == f13161f && this.f13165d != null;
    }

    public boolean hasValue() {
        return this.f13162a.get() == f13161f && this.f13164c != null;
    }

    @Override // p000.k9a
    public void onComplete() {
        if (this.f13163b.compareAndSet(false, true)) {
            for (C1806a<T> c1806a : this.f13162a.getAndSet(f13161f)) {
                c1806a.f13166a.onComplete();
            }
        }
    }

    @Override // p000.k9a
    public void onError(Throwable e) {
        k75.nullCheck(e, "onError called with a null Throwable.");
        if (!this.f13163b.compareAndSet(false, true)) {
            ofe.onError(e);
            return;
        }
        this.f13165d = e;
        for (C1806a<T> c1806a : this.f13162a.getAndSet(f13161f)) {
            c1806a.f13166a.onError(e);
        }
    }

    @Override // p000.k9a
    public void onSubscribe(lf4 d) {
        if (this.f13162a.get() == f13161f) {
            d.dispose();
        }
    }

    @Override // p000.k9a
    public void onSuccess(T value) {
        k75.nullCheck(value, "onSuccess called with a null value.");
        if (this.f13163b.compareAndSet(false, true)) {
            this.f13164c = value;
            for (C1806a<T> c1806a : this.f13162a.getAndSet(f13161f)) {
                c1806a.f13166a.onSuccess(value);
            }
        }
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> k9aVar) {
        C1806a<T> c1806a = new C1806a<>(k9aVar, this);
        k9aVar.onSubscribe(c1806a);
        if (m3021a(c1806a)) {
            if (c1806a.isDisposed()) {
                m3023c(c1806a);
                return;
            }
            return;
        }
        Throwable th = this.f13165d;
        if (th != null) {
            k9aVar.onError(th);
            return;
        }
        T t = this.f13164c;
        if (t == null) {
            k9aVar.onComplete();
        } else {
            k9aVar.onSuccess(t);
        }
    }
}
