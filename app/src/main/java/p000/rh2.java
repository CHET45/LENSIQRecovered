package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class rh2 extends xd2 implements ch2 {

    /* JADX INFO: renamed from: d */
    public static final C12089a[] f78285d = new C12089a[0];

    /* JADX INFO: renamed from: e */
    public static final C12089a[] f78286e = new C12089a[0];

    /* JADX INFO: renamed from: c */
    public Throwable f78289c;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f78288b = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C12089a[]> f78287a = new AtomicReference<>(f78285d);

    /* JADX INFO: renamed from: rh2$a */
    public static final class C12089a extends AtomicReference<rh2> implements lf4 {
        private static final long serialVersionUID = -7650903191002190468L;

        /* JADX INFO: renamed from: a */
        public final ch2 f78290a;

        public C12089a(ch2 actual, rh2 parent) {
            this.f78290a = actual;
            lazySet(parent);
        }

        @Override // p000.lf4
        public void dispose() {
            rh2 andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m21358c(this);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == null;
        }
    }

    @cfb
    @cy1
    public static rh2 create() {
        return new rh2();
    }

    /* JADX INFO: renamed from: a */
    public boolean m21356a(C12089a inner) {
        C12089a[] c12089aArr;
        C12089a[] c12089aArr2;
        do {
            c12089aArr = this.f78287a.get();
            if (c12089aArr == f78286e) {
                return false;
            }
            int length = c12089aArr.length;
            c12089aArr2 = new C12089a[length + 1];
            System.arraycopy(c12089aArr, 0, c12089aArr2, 0, length);
            c12089aArr2[length] = inner;
        } while (!v7b.m23844a(this.f78287a, c12089aArr, c12089aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public int m21357b() {
        return this.f78287a.get().length;
    }

    /* JADX INFO: renamed from: c */
    public void m21358c(C12089a inner) {
        C12089a[] c12089aArr;
        C12089a[] c12089aArr2;
        do {
            c12089aArr = this.f78287a.get();
            int length = c12089aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c12089aArr[i] == inner) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c12089aArr2 = f78285d;
            } else {
                C12089a[] c12089aArr3 = new C12089a[length - 1];
                System.arraycopy(c12089aArr, 0, c12089aArr3, 0, i);
                System.arraycopy(c12089aArr, i + 1, c12089aArr3, i, (length - i) - 1);
                c12089aArr2 = c12089aArr3;
            }
        } while (!v7b.m23844a(this.f78287a, c12089aArr, c12089aArr2));
    }

    @dib
    public Throwable getThrowable() {
        if (this.f78287a.get() == f78286e) {
            return this.f78289c;
        }
        return null;
    }

    public boolean hasComplete() {
        return this.f78287a.get() == f78286e && this.f78289c == null;
    }

    public boolean hasObservers() {
        return this.f78287a.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.f78287a.get() == f78286e && this.f78289c != null;
    }

    @Override // p000.ch2, p000.k9a
    public void onComplete() {
        if (this.f78288b.compareAndSet(false, true)) {
            for (C12089a c12089a : this.f78287a.getAndSet(f78286e)) {
                c12089a.f78290a.onComplete();
            }
        }
    }

    @Override // p000.ch2
    public void onError(Throwable e) {
        k75.nullCheck(e, "onError called with a null Throwable.");
        if (!this.f78288b.compareAndSet(false, true)) {
            ofe.onError(e);
            return;
        }
        this.f78289c = e;
        for (C12089a c12089a : this.f78287a.getAndSet(f78286e)) {
            c12089a.f78290a.onError(e);
        }
    }

    @Override // p000.ch2
    public void onSubscribe(lf4 d) {
        if (this.f78287a.get() == f78286e) {
            d.dispose();
        }
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        C12089a c12089a = new C12089a(observer, this);
        observer.onSubscribe(c12089a);
        if (m21356a(c12089a)) {
            if (c12089a.isDisposed()) {
                m21358c(c12089a);
            }
        } else {
            Throwable th = this.f78289c;
            if (th != null) {
                observer.onError(th);
            } else {
                observer.onComplete();
            }
        }
    }
}
