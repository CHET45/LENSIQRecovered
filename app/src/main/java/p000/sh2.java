package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class sh2 extends yd2 implements dh2 {

    /* JADX INFO: renamed from: d */
    public static final C12577a[] f81763d = new C12577a[0];

    /* JADX INFO: renamed from: e */
    public static final C12577a[] f81764e = new C12577a[0];

    /* JADX INFO: renamed from: c */
    public Throwable f81767c;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f81766b = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C12577a[]> f81765a = new AtomicReference<>(f81763d);

    /* JADX INFO: renamed from: sh2$a */
    public static final class C12577a extends AtomicReference<sh2> implements mf4 {
        private static final long serialVersionUID = -7650903191002190468L;

        /* JADX INFO: renamed from: a */
        public final dh2 f81768a;

        public C12577a(dh2 dh2Var, sh2 sh2Var) {
            this.f81768a = dh2Var;
            lazySet(sh2Var);
        }

        @Override // p000.mf4
        public void dispose() {
            sh2 andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m21971c(this);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == null;
        }
    }

    @bfb
    @by1
    public static sh2 create() {
        return new sh2();
    }

    /* JADX INFO: renamed from: a */
    public boolean m21969a(C12577a c12577a) {
        C12577a[] c12577aArr;
        C12577a[] c12577aArr2;
        do {
            c12577aArr = this.f81765a.get();
            if (c12577aArr == f81764e) {
                return false;
            }
            int length = c12577aArr.length;
            c12577aArr2 = new C12577a[length + 1];
            System.arraycopy(c12577aArr, 0, c12577aArr2, 0, length);
            c12577aArr2[length] = c12577a;
        } while (!v7b.m23844a(this.f81765a, c12577aArr, c12577aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public int m21970b() {
        return this.f81765a.get().length;
    }

    /* JADX INFO: renamed from: c */
    public void m21971c(C12577a c12577a) {
        C12577a[] c12577aArr;
        C12577a[] c12577aArr2;
        do {
            c12577aArr = this.f81765a.get();
            int length = c12577aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c12577aArr[i] == c12577a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c12577aArr2 = f81763d;
            } else {
                C12577a[] c12577aArr3 = new C12577a[length - 1];
                System.arraycopy(c12577aArr, 0, c12577aArr3, 0, i);
                System.arraycopy(c12577aArr, i + 1, c12577aArr3, i, (length - i) - 1);
                c12577aArr2 = c12577aArr3;
            }
        } while (!v7b.m23844a(this.f81765a, c12577aArr, c12577aArr2));
    }

    @cib
    public Throwable getThrowable() {
        if (this.f81765a.get() == f81764e) {
            return this.f81767c;
        }
        return null;
    }

    public boolean hasComplete() {
        return this.f81765a.get() == f81764e && this.f81767c == null;
    }

    public boolean hasObservers() {
        return this.f81765a.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.f81765a.get() == f81764e && this.f81767c != null;
    }

    @Override // p000.dh2
    public void onComplete() {
        if (this.f81766b.compareAndSet(false, true)) {
            for (C12577a c12577a : this.f81765a.getAndSet(f81764e)) {
                c12577a.f81768a.onComplete();
            }
        }
    }

    @Override // p000.dh2
    public void onError(Throwable th) {
        xjb.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f81766b.compareAndSet(false, true)) {
            pfe.onError(th);
            return;
        }
        this.f81767c = th;
        for (C12577a c12577a : this.f81765a.getAndSet(f81764e)) {
            c12577a.f81768a.onError(th);
        }
    }

    @Override // p000.dh2
    public void onSubscribe(mf4 mf4Var) {
        if (this.f81765a.get() == f81764e) {
            mf4Var.dispose();
        }
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        C12577a c12577a = new C12577a(dh2Var, this);
        dh2Var.onSubscribe(c12577a);
        if (m21969a(c12577a)) {
            if (c12577a.isDisposed()) {
                m21971c(c12577a);
            }
        } else {
            Throwable th = this.f81767c;
            if (th != null) {
                dh2Var.onError(th);
            } else {
                dh2Var.onComplete();
            }
        }
    }
}
