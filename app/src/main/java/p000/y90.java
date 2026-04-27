package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class y90<T> extends qg6<T> {

    /* JADX INFO: renamed from: e */
    public static final C15568a[] f100814e = new C15568a[0];

    /* JADX INFO: renamed from: f */
    public static final C15568a[] f100815f = new C15568a[0];

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C15568a<T>[]> f100816b = new AtomicReference<>(f100814e);

    /* JADX INFO: renamed from: c */
    public Throwable f100817c;

    /* JADX INFO: renamed from: d */
    public T f100818d;

    /* JADX INFO: renamed from: y90$a */
    public static final class C15568a<T> extends j34<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* JADX INFO: renamed from: L */
        public final y90<T> f100819L;

        public C15568a(ycg<? super T> actual, y90<T> parent) {
            super(actual);
            this.f100819L = parent;
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            if (super.tryCancel()) {
                this.f100819L.m25791c(this);
            }
        }

        public void onComplete() {
            if (isCancelled()) {
                return;
            }
            this.f49483a.onComplete();
        }

        public void onError(Throwable t) {
            if (isCancelled()) {
                ofe.onError(t);
            } else {
                this.f49483a.onError(t);
            }
        }
    }

    @cfb
    @cy1
    public static <T> y90<T> create() {
        return new y90<>();
    }

    /* JADX INFO: renamed from: b */
    public boolean m25790b(C15568a<T> ps) {
        C15568a<T>[] c15568aArr;
        C15568a[] c15568aArr2;
        do {
            c15568aArr = this.f100816b.get();
            if (c15568aArr == f100815f) {
                return false;
            }
            int length = c15568aArr.length;
            c15568aArr2 = new C15568a[length + 1];
            System.arraycopy(c15568aArr, 0, c15568aArr2, 0, length);
            c15568aArr2[length] = ps;
        } while (!v7b.m23844a(this.f100816b, c15568aArr, c15568aArr2));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m25791c(C15568a<T> ps) {
        C15568a<T>[] c15568aArr;
        C15568a[] c15568aArr2;
        do {
            c15568aArr = this.f100816b.get();
            int length = c15568aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c15568aArr[i] == ps) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c15568aArr2 = f100814e;
            } else {
                C15568a[] c15568aArr3 = new C15568a[length - 1];
                System.arraycopy(c15568aArr, 0, c15568aArr3, 0, i);
                System.arraycopy(c15568aArr, i + 1, c15568aArr3, i, (length - i) - 1);
                c15568aArr2 = c15568aArr3;
            }
        } while (!v7b.m23844a(this.f100816b, c15568aArr, c15568aArr2));
    }

    @Override // p000.qg6
    @dib
    @cy1
    public Throwable getThrowable() {
        if (this.f100816b.get() == f100815f) {
            return this.f100817c;
        }
        return null;
    }

    @dib
    @cy1
    public T getValue() {
        if (this.f100816b.get() == f100815f) {
            return this.f100818d;
        }
        return null;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasComplete() {
        return this.f100816b.get() == f100815f && this.f100817c == null;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasSubscribers() {
        return this.f100816b.get().length != 0;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasThrowable() {
        return this.f100816b.get() == f100815f && this.f100817c != null;
    }

    @cy1
    public boolean hasValue() {
        return this.f100816b.get() == f100815f && this.f100818d != null;
    }

    @Override // p000.ycg
    public void onComplete() {
        C15568a<T>[] c15568aArr = this.f100816b.get();
        C15568a<T>[] c15568aArr2 = f100815f;
        if (c15568aArr == c15568aArr2) {
            return;
        }
        T t = this.f100818d;
        C15568a<T>[] andSet = this.f100816b.getAndSet(c15568aArr2);
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

    @Override // p000.ycg
    public void onError(@cfb Throwable t) {
        k75.nullCheck(t, "onError called with a null Throwable.");
        C15568a<T>[] c15568aArr = this.f100816b.get();
        C15568a<T>[] c15568aArr2 = f100815f;
        if (c15568aArr == c15568aArr2) {
            ofe.onError(t);
            return;
        }
        this.f100818d = null;
        this.f100817c = t;
        for (C15568a<T> c15568a : this.f100816b.getAndSet(c15568aArr2)) {
            c15568a.onError(t);
        }
    }

    @Override // p000.ycg
    public void onNext(@cfb T t) {
        k75.nullCheck(t, "onNext called with a null value.");
        if (this.f100816b.get() == f100815f) {
            return;
        }
        this.f100818d = t;
    }

    @Override // p000.ycg
    public void onSubscribe(@cfb fdg s) {
        if (this.f100816b.get() == f100815f) {
            s.cancel();
        } else {
            s.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.l86
    public void subscribeActual(@cfb ycg<? super T> s) {
        C15568a<T> c15568a = new C15568a<>(s, this);
        s.onSubscribe(c15568a);
        if (m25790b(c15568a)) {
            if (c15568a.isCancelled()) {
                m25791c(c15568a);
                return;
            }
            return;
        }
        Throwable th = this.f100817c;
        if (th != null) {
            s.onError(th);
            return;
        }
        T t = this.f100818d;
        if (t != null) {
            c15568a.complete(t);
        } else {
            c15568a.onComplete();
        }
    }
}
