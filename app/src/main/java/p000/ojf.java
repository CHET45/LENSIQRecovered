package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ojf<T> extends ljf<T> implements inf<T> {

    /* JADX INFO: renamed from: f */
    public static final C10395a[] f67841f = new C10395a[0];

    /* JADX INFO: renamed from: m */
    public static final C10395a[] f67842m = new C10395a[0];

    /* JADX INFO: renamed from: a */
    public final pof<? extends T> f67843a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f67844b = new AtomicInteger();

    /* JADX INFO: renamed from: c */
    public final AtomicReference<C10395a<T>[]> f67845c = new AtomicReference<>(f67841f);

    /* JADX INFO: renamed from: d */
    public T f67846d;

    /* JADX INFO: renamed from: e */
    public Throwable f67847e;

    /* JADX INFO: renamed from: ojf$a */
    public static final class C10395a<T> extends AtomicBoolean implements mf4 {
        private static final long serialVersionUID = 7514387411091976596L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f67848a;

        /* JADX INFO: renamed from: b */
        public final ojf<T> f67849b;

        public C10395a(inf<? super T> infVar, ojf<T> ojfVar) {
            this.f67848a = infVar;
            this.f67849b = ojfVar;
        }

        @Override // p000.mf4
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f67849b.m18730b(this);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get();
        }
    }

    public ojf(pof<? extends T> pofVar) {
        this.f67843a = pofVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m18729a(C10395a<T> c10395a) {
        C10395a<T>[] c10395aArr;
        C10395a[] c10395aArr2;
        do {
            c10395aArr = this.f67845c.get();
            if (c10395aArr == f67842m) {
                return false;
            }
            int length = c10395aArr.length;
            c10395aArr2 = new C10395a[length + 1];
            System.arraycopy(c10395aArr, 0, c10395aArr2, 0, length);
            c10395aArr2[length] = c10395a;
        } while (!v7b.m23844a(this.f67845c, c10395aArr, c10395aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m18730b(C10395a<T> c10395a) {
        C10395a<T>[] c10395aArr;
        C10395a[] c10395aArr2;
        do {
            c10395aArr = this.f67845c.get();
            int length = c10395aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c10395aArr[i] == c10395a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c10395aArr2 = f67841f;
            } else {
                C10395a[] c10395aArr3 = new C10395a[length - 1];
                System.arraycopy(c10395aArr, 0, c10395aArr3, 0, i);
                System.arraycopy(c10395aArr, i + 1, c10395aArr3, i, (length - i) - 1);
                c10395aArr2 = c10395aArr3;
            }
        } while (!v7b.m23844a(this.f67845c, c10395aArr, c10395aArr2));
    }

    @Override // p000.inf
    public void onError(Throwable th) {
        this.f67847e = th;
        for (C10395a<T> c10395a : this.f67845c.getAndSet(f67842m)) {
            if (!c10395a.isDisposed()) {
                c10395a.f67848a.onError(th);
            }
        }
    }

    @Override // p000.inf
    public void onSubscribe(mf4 mf4Var) {
    }

    @Override // p000.inf
    public void onSuccess(T t) {
        this.f67846d = t;
        for (C10395a<T> c10395a : this.f67845c.getAndSet(f67842m)) {
            if (!c10395a.isDisposed()) {
                c10395a.f67848a.onSuccess(t);
            }
        }
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        C10395a<T> c10395a = new C10395a<>(infVar, this);
        infVar.onSubscribe(c10395a);
        if (m18729a(c10395a)) {
            if (c10395a.isDisposed()) {
                m18730b(c10395a);
            }
            if (this.f67844b.getAndIncrement() == 0) {
                this.f67843a.subscribe(this);
                return;
            }
            return;
        }
        Throwable th = this.f67847e;
        if (th != null) {
            infVar.onError(th);
        } else {
            infVar.onSuccess(this.f67846d);
        }
    }
}
