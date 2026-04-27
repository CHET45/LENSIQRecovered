package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ie2 extends xd2 implements ch2 {

    /* JADX INFO: renamed from: e */
    public static final C7249a[] f46587e = new C7249a[0];

    /* JADX INFO: renamed from: f */
    public static final C7249a[] f46588f = new C7249a[0];

    /* JADX INFO: renamed from: a */
    public final ph2 f46589a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C7249a[]> f46590b = new AtomicReference<>(f46587e);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f46591c = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    public Throwable f46592d;

    /* JADX INFO: renamed from: ie2$a */
    public final class C7249a extends AtomicBoolean implements lf4 {
        private static final long serialVersionUID = 8943152917179642732L;

        /* JADX INFO: renamed from: a */
        public final ch2 f46593a;

        public C7249a(ch2 downstream) {
            this.f46593a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            if (compareAndSet(false, true)) {
                ie2.this.m12913b(this);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get();
        }
    }

    public ie2(ph2 source) {
        this.f46589a = source;
    }

    /* JADX INFO: renamed from: a */
    public boolean m12912a(C7249a inner) {
        C7249a[] c7249aArr;
        C7249a[] c7249aArr2;
        do {
            c7249aArr = this.f46590b.get();
            if (c7249aArr == f46588f) {
                return false;
            }
            int length = c7249aArr.length;
            c7249aArr2 = new C7249a[length + 1];
            System.arraycopy(c7249aArr, 0, c7249aArr2, 0, length);
            c7249aArr2[length] = inner;
        } while (!v7b.m23844a(this.f46590b, c7249aArr, c7249aArr2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m12913b(C7249a inner) {
        C7249a[] c7249aArr;
        C7249a[] c7249aArr2;
        do {
            c7249aArr = this.f46590b.get();
            int length = c7249aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c7249aArr[i] == inner) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c7249aArr2 = f46587e;
            } else {
                C7249a[] c7249aArr3 = new C7249a[length - 1];
                System.arraycopy(c7249aArr, 0, c7249aArr3, 0, i);
                System.arraycopy(c7249aArr, i + 1, c7249aArr3, i, (length - i) - 1);
                c7249aArr2 = c7249aArr3;
            }
        } while (!v7b.m23844a(this.f46590b, c7249aArr, c7249aArr2));
    }

    @Override // p000.ch2, p000.k9a
    public void onComplete() {
        for (C7249a c7249a : this.f46590b.getAndSet(f46588f)) {
            if (!c7249a.get()) {
                c7249a.f46593a.onComplete();
            }
        }
    }

    @Override // p000.ch2
    public void onError(Throwable e) {
        this.f46592d = e;
        for (C7249a c7249a : this.f46590b.getAndSet(f46588f)) {
            if (!c7249a.get()) {
                c7249a.f46593a.onError(e);
            }
        }
    }

    @Override // p000.ch2
    public void onSubscribe(lf4 d) {
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        C7249a c7249a = new C7249a(observer);
        observer.onSubscribe(c7249a);
        if (m12912a(c7249a)) {
            if (c7249a.isDisposed()) {
                m12913b(c7249a);
            }
            if (this.f46591c.compareAndSet(false, true)) {
                this.f46589a.subscribe(this);
                return;
            }
            return;
        }
        Throwable th = this.f46592d;
        if (th != null) {
            observer.onError(th);
        } else {
            observer.onComplete();
        }
    }
}
