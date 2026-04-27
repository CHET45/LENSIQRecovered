package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class caa<T> extends s4a<T> implements l9a<T> {

    /* JADX INFO: renamed from: e */
    public static final C2253a[] f16107e = new C2253a[0];

    /* JADX INFO: renamed from: f */
    public static final C2253a[] f16108f = new C2253a[0];

    /* JADX INFO: renamed from: c */
    public T f16111c;

    /* JADX INFO: renamed from: d */
    public Throwable f16112d;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f16110b = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C2253a<T>[]> f16109a = new AtomicReference<>(f16107e);

    /* JADX INFO: renamed from: caa$a */
    public static final class C2253a<T> extends AtomicReference<caa<T>> implements mf4 {
        private static final long serialVersionUID = -7650903191002190468L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f16113a;

        public C2253a(l9a<? super T> l9aVar, caa<T> caaVar) {
            this.f16113a = l9aVar;
            lazySet(caaVar);
        }

        @Override // p000.mf4
        public void dispose() {
            caa<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m3875c(this);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == null;
        }
    }

    @bfb
    @by1
    public static <T> caa<T> create() {
        return new caa<>();
    }

    /* JADX INFO: renamed from: a */
    public boolean m3873a(C2253a<T> c2253a) {
        C2253a<T>[] c2253aArr;
        C2253a[] c2253aArr2;
        do {
            c2253aArr = this.f16109a.get();
            if (c2253aArr == f16108f) {
                return false;
            }
            int length = c2253aArr.length;
            c2253aArr2 = new C2253a[length + 1];
            System.arraycopy(c2253aArr, 0, c2253aArr2, 0, length);
            c2253aArr2[length] = c2253a;
        } while (!v7b.m23844a(this.f16109a, c2253aArr, c2253aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public int m3874b() {
        return this.f16109a.get().length;
    }

    /* JADX INFO: renamed from: c */
    public void m3875c(C2253a<T> c2253a) {
        C2253a<T>[] c2253aArr;
        C2253a[] c2253aArr2;
        do {
            c2253aArr = this.f16109a.get();
            int length = c2253aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c2253aArr[i] == c2253a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c2253aArr2 = f16107e;
            } else {
                C2253a[] c2253aArr3 = new C2253a[length - 1];
                System.arraycopy(c2253aArr, 0, c2253aArr3, 0, i);
                System.arraycopy(c2253aArr, i + 1, c2253aArr3, i, (length - i) - 1);
                c2253aArr2 = c2253aArr3;
            }
        } while (!v7b.m23844a(this.f16109a, c2253aArr, c2253aArr2));
    }

    @cib
    public Throwable getThrowable() {
        if (this.f16109a.get() == f16108f) {
            return this.f16112d;
        }
        return null;
    }

    @cib
    public T getValue() {
        if (this.f16109a.get() == f16108f) {
            return this.f16111c;
        }
        return null;
    }

    public boolean hasComplete() {
        return this.f16109a.get() == f16108f && this.f16111c == null && this.f16112d == null;
    }

    public boolean hasObservers() {
        return this.f16109a.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.f16109a.get() == f16108f && this.f16112d != null;
    }

    public boolean hasValue() {
        return this.f16109a.get() == f16108f && this.f16111c != null;
    }

    @Override // p000.l9a
    public void onComplete() {
        if (this.f16110b.compareAndSet(false, true)) {
            for (C2253a<T> c2253a : this.f16109a.getAndSet(f16108f)) {
                c2253a.f16113a.onComplete();
            }
        }
    }

    @Override // p000.l9a
    public void onError(Throwable th) {
        xjb.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f16110b.compareAndSet(false, true)) {
            pfe.onError(th);
            return;
        }
        this.f16112d = th;
        for (C2253a<T> c2253a : this.f16109a.getAndSet(f16108f)) {
            c2253a.f16113a.onError(th);
        }
    }

    @Override // p000.l9a
    public void onSubscribe(mf4 mf4Var) {
        if (this.f16109a.get() == f16108f) {
            mf4Var.dispose();
        }
    }

    @Override // p000.l9a
    public void onSuccess(T t) {
        xjb.requireNonNull(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f16110b.compareAndSet(false, true)) {
            this.f16111c = t;
            for (C2253a<T> c2253a : this.f16109a.getAndSet(f16108f)) {
                c2253a.f16113a.onSuccess(t);
            }
        }
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        C2253a<T> c2253a = new C2253a<>(l9aVar, this);
        l9aVar.onSubscribe(c2253a);
        if (m3873a(c2253a)) {
            if (c2253a.isDisposed()) {
                m3875c(c2253a);
                return;
            }
            return;
        }
        Throwable th = this.f16112d;
        if (th != null) {
            l9aVar.onError(th);
            return;
        }
        T t = this.f16111c;
        if (t == null) {
            l9aVar.onComplete();
        } else {
            l9aVar.onSuccess(t);
        }
    }
}
