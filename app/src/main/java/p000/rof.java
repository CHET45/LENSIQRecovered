package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class rof<T> extends ljf<T> implements inf<T> {

    /* JADX INFO: renamed from: e */
    public static final C12181a[] f78876e = new C12181a[0];

    /* JADX INFO: renamed from: f */
    public static final C12181a[] f78877f = new C12181a[0];

    /* JADX INFO: renamed from: c */
    public T f78880c;

    /* JADX INFO: renamed from: d */
    public Throwable f78881d;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f78879b = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C12181a<T>[]> f78878a = new AtomicReference<>(f78876e);

    /* JADX INFO: renamed from: rof$a */
    public static final class C12181a<T> extends AtomicReference<rof<T>> implements mf4 {
        private static final long serialVersionUID = -7650903191002190468L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f78882a;

        public C12181a(inf<? super T> infVar, rof<T> rofVar) {
            this.f78882a = infVar;
            lazySet(rofVar);
        }

        @Override // p000.mf4
        public void dispose() {
            rof<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m21452c(this);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == null;
        }
    }

    @bfb
    @by1
    public static <T> rof<T> create() {
        return new rof<>();
    }

    /* JADX INFO: renamed from: a */
    public boolean m21450a(@bfb C12181a<T> c12181a) {
        C12181a<T>[] c12181aArr;
        C12181a[] c12181aArr2;
        do {
            c12181aArr = this.f78878a.get();
            if (c12181aArr == f78877f) {
                return false;
            }
            int length = c12181aArr.length;
            c12181aArr2 = new C12181a[length + 1];
            System.arraycopy(c12181aArr, 0, c12181aArr2, 0, length);
            c12181aArr2[length] = c12181a;
        } while (!v7b.m23844a(this.f78878a, c12181aArr, c12181aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public int m21451b() {
        return this.f78878a.get().length;
    }

    /* JADX INFO: renamed from: c */
    public void m21452c(@bfb C12181a<T> c12181a) {
        C12181a<T>[] c12181aArr;
        C12181a[] c12181aArr2;
        do {
            c12181aArr = this.f78878a.get();
            int length = c12181aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c12181aArr[i] == c12181a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c12181aArr2 = f78876e;
            } else {
                C12181a[] c12181aArr3 = new C12181a[length - 1];
                System.arraycopy(c12181aArr, 0, c12181aArr3, 0, i);
                System.arraycopy(c12181aArr, i + 1, c12181aArr3, i, (length - i) - 1);
                c12181aArr2 = c12181aArr3;
            }
        } while (!v7b.m23844a(this.f78878a, c12181aArr, c12181aArr2));
    }

    @cib
    public Throwable getThrowable() {
        if (this.f78878a.get() == f78877f) {
            return this.f78881d;
        }
        return null;
    }

    @cib
    public T getValue() {
        if (this.f78878a.get() == f78877f) {
            return this.f78880c;
        }
        return null;
    }

    public boolean hasObservers() {
        return this.f78878a.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.f78878a.get() == f78877f && this.f78881d != null;
    }

    public boolean hasValue() {
        return this.f78878a.get() == f78877f && this.f78880c != null;
    }

    @Override // p000.inf
    public void onError(@bfb Throwable th) {
        xjb.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f78879b.compareAndSet(false, true)) {
            pfe.onError(th);
            return;
        }
        this.f78881d = th;
        for (C12181a<T> c12181a : this.f78878a.getAndSet(f78877f)) {
            c12181a.f78882a.onError(th);
        }
    }

    @Override // p000.inf
    public void onSubscribe(@bfb mf4 mf4Var) {
        if (this.f78878a.get() == f78877f) {
            mf4Var.dispose();
        }
    }

    @Override // p000.inf
    public void onSuccess(@bfb T t) {
        xjb.requireNonNull(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f78879b.compareAndSet(false, true)) {
            this.f78880c = t;
            for (C12181a<T> c12181a : this.f78878a.getAndSet(f78877f)) {
                c12181a.f78882a.onSuccess(t);
            }
        }
    }

    @Override // p000.ljf
    public void subscribeActual(@bfb inf<? super T> infVar) {
        C12181a<T> c12181a = new C12181a<>(infVar, this);
        infVar.onSubscribe(c12181a);
        if (m21450a(c12181a)) {
            if (c12181a.isDisposed()) {
                m21452c(c12181a);
            }
        } else {
            Throwable th = this.f78881d;
            if (th != null) {
                infVar.onError(th);
            } else {
                infVar.onSuccess(this.f78880c);
            }
        }
    }
}
