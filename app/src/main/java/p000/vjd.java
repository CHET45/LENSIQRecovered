package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class vjd<T> extends xxd<T> {

    /* JADX INFO: renamed from: b */
    public static final C14124a[] f91407b = new C14124a[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C14124a<T>[]> f91408a = new AtomicReference<>(f91407b);

    /* JADX INFO: renamed from: vjd$a */
    public static final class C14124a<T> extends AtomicBoolean implements lf4 {
        private static final long serialVersionUID = 3562861878281475070L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f91409a;

        /* JADX INFO: renamed from: b */
        public final vjd<T> f91410b;

        public C14124a(pxb<? super T> pxbVar, vjd<T> vjdVar) {
            this.f91409a = pxbVar;
            this.f91410b = vjdVar;
        }

        @Override // p000.lf4
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f91410b.m24038b(this);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get();
        }

        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.f91409a.onNext(t);
        }
    }

    @cfb
    @cy1
    public static <T> vjd<T> create() {
        return new vjd<>();
    }

    /* JADX INFO: renamed from: a */
    public void m24037a(C14124a<T> c14124a) {
        C14124a<T>[] c14124aArr;
        C14124a[] c14124aArr2;
        do {
            c14124aArr = this.f91408a.get();
            int length = c14124aArr.length;
            c14124aArr2 = new C14124a[length + 1];
            System.arraycopy(c14124aArr, 0, c14124aArr2, 0, length);
            c14124aArr2[length] = c14124a;
        } while (!v7b.m23844a(this.f91408a, c14124aArr, c14124aArr2));
    }

    @Override // p000.xxd, p000.uu2
    public void accept(@cfb T t) {
        if (t == null) {
            throw new NullPointerException("value == null");
        }
        for (C14124a<T> c14124a : this.f91408a.get()) {
            c14124a.onNext(t);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m24038b(C14124a<T> c14124a) {
        C14124a<T>[] c14124aArr;
        C14124a[] c14124aArr2;
        do {
            c14124aArr = this.f91408a.get();
            if (c14124aArr == f91407b) {
                return;
            }
            int length = c14124aArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c14124aArr[i] == c14124a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c14124aArr2 = f91407b;
            } else {
                C14124a[] c14124aArr3 = new C14124a[length - 1];
                System.arraycopy(c14124aArr, 0, c14124aArr3, 0, i);
                System.arraycopy(c14124aArr, i + 1, c14124aArr3, i, (length - i) - 1);
                c14124aArr2 = c14124aArr3;
            }
        } while (!v7b.m23844a(this.f91408a, c14124aArr, c14124aArr2));
    }

    @Override // p000.xxd
    public boolean hasObservers() {
        return this.f91408a.get().length != 0;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> pxbVar) {
        C14124a<T> c14124a = new C14124a<>(pxbVar, this);
        pxbVar.onSubscribe(c14124a);
        m24037a(c14124a);
        if (c14124a.isDisposed()) {
            m24038b(c14124a);
        }
    }
}
