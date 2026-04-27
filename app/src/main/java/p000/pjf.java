package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class pjf<T> extends kjf<T> implements hnf<T> {

    /* JADX INFO: renamed from: f */
    public static final C10989a[] f71115f = new C10989a[0];

    /* JADX INFO: renamed from: m */
    public static final C10989a[] f71116m = new C10989a[0];

    /* JADX INFO: renamed from: a */
    public final oof<? extends T> f71117a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f71118b = new AtomicInteger();

    /* JADX INFO: renamed from: c */
    public final AtomicReference<C10989a<T>[]> f71119c = new AtomicReference<>(f71115f);

    /* JADX INFO: renamed from: d */
    public T f71120d;

    /* JADX INFO: renamed from: e */
    public Throwable f71121e;

    /* JADX INFO: renamed from: pjf$a */
    public static final class C10989a<T> extends AtomicBoolean implements lf4 {
        private static final long serialVersionUID = 7514387411091976596L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f71122a;

        /* JADX INFO: renamed from: b */
        public final pjf<T> f71123b;

        public C10989a(hnf<? super T> actual, pjf<T> parent) {
            this.f71122a = actual;
            this.f71123b = parent;
        }

        @Override // p000.lf4
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f71123b.m19540b(this);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get();
        }
    }

    public pjf(oof<? extends T> source) {
        this.f71117a = source;
    }

    /* JADX INFO: renamed from: a */
    public boolean m19539a(C10989a<T> observer) {
        C10989a<T>[] c10989aArr;
        C10989a[] c10989aArr2;
        do {
            c10989aArr = this.f71119c.get();
            if (c10989aArr == f71116m) {
                return false;
            }
            int length = c10989aArr.length;
            c10989aArr2 = new C10989a[length + 1];
            System.arraycopy(c10989aArr, 0, c10989aArr2, 0, length);
            c10989aArr2[length] = observer;
        } while (!v7b.m23844a(this.f71119c, c10989aArr, c10989aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m19540b(C10989a<T> observer) {
        C10989a<T>[] c10989aArr;
        C10989a[] c10989aArr2;
        do {
            c10989aArr = this.f71119c.get();
            int length = c10989aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c10989aArr[i] == observer) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c10989aArr2 = f71115f;
            } else {
                C10989a[] c10989aArr3 = new C10989a[length - 1];
                System.arraycopy(c10989aArr, 0, c10989aArr3, 0, i);
                System.arraycopy(c10989aArr, i + 1, c10989aArr3, i, (length - i) - 1);
                c10989aArr2 = c10989aArr3;
            }
        } while (!v7b.m23844a(this.f71119c, c10989aArr, c10989aArr2));
    }

    @Override // p000.hnf
    public void onError(Throwable e) {
        this.f71121e = e;
        for (C10989a<T> c10989a : this.f71119c.getAndSet(f71116m)) {
            if (!c10989a.isDisposed()) {
                c10989a.f71122a.onError(e);
            }
        }
    }

    @Override // p000.hnf
    public void onSubscribe(lf4 d) {
    }

    @Override // p000.hnf
    public void onSuccess(T value) {
        this.f71120d = value;
        for (C10989a<T> c10989a : this.f71119c.getAndSet(f71116m)) {
            if (!c10989a.isDisposed()) {
                c10989a.f71122a.onSuccess(value);
            }
        }
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> hnfVar) {
        C10989a<T> c10989a = new C10989a<>(hnfVar, this);
        hnfVar.onSubscribe(c10989a);
        if (m19539a(c10989a)) {
            if (c10989a.isDisposed()) {
                m19540b(c10989a);
            }
            if (this.f71118b.getAndIncrement() == 0) {
                this.f71117a.subscribe(this);
                return;
            }
            return;
        }
        Throwable th = this.f71121e;
        if (th != null) {
            hnfVar.onError(th);
        } else {
            hnfVar.onSuccess(this.f71120d);
        }
    }
}
