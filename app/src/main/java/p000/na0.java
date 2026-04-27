package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class na0<T> extends mcg<T> {

    /* JADX INFO: renamed from: d */
    public static final C9759a[] f63772d = new C9759a[0];

    /* JADX INFO: renamed from: e */
    public static final C9759a[] f63773e = new C9759a[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C9759a<T>[]> f63774a = new AtomicReference<>(f63772d);

    /* JADX INFO: renamed from: b */
    public Throwable f63775b;

    /* JADX INFO: renamed from: c */
    public T f63776c;

    /* JADX INFO: renamed from: na0$a */
    public static final class C9759a<T> extends e34<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* JADX INFO: renamed from: C */
        public final na0<T> f63777C;

        public C9759a(oxb<? super T> oxbVar, na0<T> na0Var) {
            super(oxbVar);
            this.f63777C = na0Var;
        }

        @Override // p000.e34, p000.mf4
        public void dispose() {
            if (super.tryDispose()) {
                this.f63777C.m17823b(this);
            }
        }

        public void onComplete() {
            if (isDisposed()) {
                return;
            }
            this.f31631a.onComplete();
        }

        public void onError(Throwable th) {
            if (isDisposed()) {
                pfe.onError(th);
            } else {
                this.f31631a.onError(th);
            }
        }
    }

    @bfb
    @by1
    public static <T> na0<T> create() {
        return new na0<>();
    }

    /* JADX INFO: renamed from: a */
    public boolean m17822a(C9759a<T> c9759a) {
        C9759a<T>[] c9759aArr;
        C9759a[] c9759aArr2;
        do {
            c9759aArr = this.f63774a.get();
            if (c9759aArr == f63773e) {
                return false;
            }
            int length = c9759aArr.length;
            c9759aArr2 = new C9759a[length + 1];
            System.arraycopy(c9759aArr, 0, c9759aArr2, 0, length);
            c9759aArr2[length] = c9759a;
        } while (!v7b.m23844a(this.f63774a, c9759aArr, c9759aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m17823b(C9759a<T> c9759a) {
        C9759a<T>[] c9759aArr;
        C9759a[] c9759aArr2;
        do {
            c9759aArr = this.f63774a.get();
            int length = c9759aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c9759aArr[i] == c9759a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c9759aArr2 = f63772d;
            } else {
                C9759a[] c9759aArr3 = new C9759a[length - 1];
                System.arraycopy(c9759aArr, 0, c9759aArr3, 0, i);
                System.arraycopy(c9759aArr, i + 1, c9759aArr3, i, (length - i) - 1);
                c9759aArr2 = c9759aArr3;
            }
        } while (!v7b.m23844a(this.f63774a, c9759aArr, c9759aArr2));
    }

    @Override // p000.mcg
    public Throwable getThrowable() {
        if (this.f63774a.get() == f63773e) {
            return this.f63775b;
        }
        return null;
    }

    @cib
    public T getValue() {
        if (this.f63774a.get() == f63773e) {
            return this.f63776c;
        }
        return null;
    }

    @Deprecated
    public Object[] getValues() {
        T value = getValue();
        return value != null ? new Object[]{value} : new Object[0];
    }

    @Override // p000.mcg
    public boolean hasComplete() {
        return this.f63774a.get() == f63773e && this.f63775b == null;
    }

    @Override // p000.mcg
    public boolean hasObservers() {
        return this.f63774a.get().length != 0;
    }

    @Override // p000.mcg
    public boolean hasThrowable() {
        return this.f63774a.get() == f63773e && this.f63775b != null;
    }

    public boolean hasValue() {
        return this.f63774a.get() == f63773e && this.f63776c != null;
    }

    @Override // p000.oxb
    public void onComplete() {
        C9759a<T>[] c9759aArr = this.f63774a.get();
        C9759a<T>[] c9759aArr2 = f63773e;
        if (c9759aArr == c9759aArr2) {
            return;
        }
        T t = this.f63776c;
        C9759a<T>[] andSet = this.f63774a.getAndSet(c9759aArr2);
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

    @Override // p000.oxb
    public void onError(Throwable th) {
        xjb.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C9759a<T>[] c9759aArr = this.f63774a.get();
        C9759a<T>[] c9759aArr2 = f63773e;
        if (c9759aArr == c9759aArr2) {
            pfe.onError(th);
            return;
        }
        this.f63776c = null;
        this.f63775b = th;
        for (C9759a<T> c9759a : this.f63774a.getAndSet(c9759aArr2)) {
            c9759a.onError(th);
        }
    }

    @Override // p000.oxb
    public void onNext(T t) {
        xjb.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f63774a.get() == f63773e) {
            return;
        }
        this.f63776c = t;
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        if (this.f63774a.get() == f63773e) {
            mf4Var.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C9759a<T> c9759a = new C9759a<>(oxbVar, this);
        oxbVar.onSubscribe(c9759a);
        if (m17822a(c9759a)) {
            if (c9759a.isDisposed()) {
                m17823b(c9759a);
                return;
            }
            return;
        }
        Throwable th = this.f63775b;
        if (th != null) {
            oxbVar.onError(th);
            return;
        }
        T t = this.f63776c;
        if (t != null) {
            c9759a.complete(t);
        } else {
            c9759a.onComplete();
        }
    }

    @Deprecated
    public T[] getValues(T[] tArr) {
        T value = getValue();
        if (value == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 1);
        }
        tArr[0] = value;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }
}
