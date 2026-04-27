package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ujd<T> extends qg6<T> {

    /* JADX INFO: renamed from: d */
    public static final C13556a[] f88166d = new C13556a[0];

    /* JADX INFO: renamed from: e */
    public static final C13556a[] f88167e = new C13556a[0];

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C13556a<T>[]> f88168b = new AtomicReference<>(f88167e);

    /* JADX INFO: renamed from: c */
    public Throwable f88169c;

    /* JADX INFO: renamed from: ujd$a */
    public static final class C13556a<T> extends AtomicLong implements fdg {
        private static final long serialVersionUID = 3562861878281475070L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f88170a;

        /* JADX INFO: renamed from: b */
        public final ujd<T> f88171b;

        public C13556a(ycg<? super T> actual, ujd<T> parent) {
            this.f88170a = actual;
            this.f88171b = parent;
        }

        /* JADX INFO: renamed from: a */
        public boolean m23390a() {
            return get() == 0;
        }

        @Override // p000.fdg
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f88171b.m23389c(this);
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.f88170a.onComplete();
            }
        }

        public void onError(Throwable t) {
            if (get() != Long.MIN_VALUE) {
                this.f88170a.onError(t);
            } else {
                ofe.onError(t);
            }
        }

        public void onNext(T t) {
            long j = get();
            if (j == Long.MIN_VALUE) {
                return;
            }
            if (j != 0) {
                this.f88170a.onNext(t);
                ro0.producedCancel(this, 1L);
            } else {
                cancel();
                this.f88170a.onError(new bwa("Could not emit value due to lack of requests"));
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.addCancel(this, n);
            }
        }
    }

    @cfb
    @cy1
    public static <T> ujd<T> create() {
        return new ujd<>();
    }

    /* JADX INFO: renamed from: b */
    public boolean m23388b(C13556a<T> ps) {
        C13556a<T>[] c13556aArr;
        C13556a[] c13556aArr2;
        do {
            c13556aArr = this.f88168b.get();
            if (c13556aArr == f88166d) {
                return false;
            }
            int length = c13556aArr.length;
            c13556aArr2 = new C13556a[length + 1];
            System.arraycopy(c13556aArr, 0, c13556aArr2, 0, length);
            c13556aArr2[length] = ps;
        } while (!v7b.m23844a(this.f88168b, c13556aArr, c13556aArr2));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m23389c(C13556a<T> ps) {
        C13556a<T>[] c13556aArr;
        C13556a[] c13556aArr2;
        do {
            c13556aArr = this.f88168b.get();
            if (c13556aArr == f88166d || c13556aArr == f88167e) {
                return;
            }
            int length = c13556aArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c13556aArr[i] == ps) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c13556aArr2 = f88167e;
            } else {
                C13556a[] c13556aArr3 = new C13556a[length - 1];
                System.arraycopy(c13556aArr, 0, c13556aArr3, 0, i);
                System.arraycopy(c13556aArr, i + 1, c13556aArr3, i, (length - i) - 1);
                c13556aArr2 = c13556aArr3;
            }
        } while (!v7b.m23844a(this.f88168b, c13556aArr, c13556aArr2));
    }

    @Override // p000.qg6
    @dib
    @cy1
    public Throwable getThrowable() {
        if (this.f88168b.get() == f88166d) {
            return this.f88169c;
        }
        return null;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasComplete() {
        return this.f88168b.get() == f88166d && this.f88169c == null;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasSubscribers() {
        return this.f88168b.get().length != 0;
    }

    @Override // p000.qg6
    @cy1
    public boolean hasThrowable() {
        return this.f88168b.get() == f88166d && this.f88169c != null;
    }

    @cy1
    public boolean offer(@cfb T t) {
        k75.nullCheck(t, "offer called with a null value.");
        C13556a<T>[] c13556aArr = this.f88168b.get();
        for (C13556a<T> c13556a : c13556aArr) {
            if (c13556a.m23390a()) {
                return false;
            }
        }
        for (C13556a<T> c13556a2 : c13556aArr) {
            c13556a2.onNext(t);
        }
        return true;
    }

    @Override // p000.ycg
    public void onComplete() {
        C13556a<T>[] c13556aArr = this.f88168b.get();
        C13556a<T>[] c13556aArr2 = f88166d;
        if (c13556aArr == c13556aArr2) {
            return;
        }
        for (C13556a<T> c13556a : this.f88168b.getAndSet(c13556aArr2)) {
            c13556a.onComplete();
        }
    }

    @Override // p000.ycg
    public void onError(@cfb Throwable t) {
        k75.nullCheck(t, "onError called with a null Throwable.");
        C13556a<T>[] c13556aArr = this.f88168b.get();
        C13556a<T>[] c13556aArr2 = f88166d;
        if (c13556aArr == c13556aArr2) {
            ofe.onError(t);
            return;
        }
        this.f88169c = t;
        for (C13556a<T> c13556a : this.f88168b.getAndSet(c13556aArr2)) {
            c13556a.onError(t);
        }
    }

    @Override // p000.ycg
    public void onNext(@cfb T t) {
        k75.nullCheck(t, "onNext called with a null value.");
        for (C13556a<T> c13556a : this.f88168b.get()) {
            c13556a.onNext(t);
        }
    }

    @Override // p000.ycg
    public void onSubscribe(@cfb fdg s) {
        if (this.f88168b.get() == f88166d) {
            s.cancel();
        } else {
            s.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.l86
    public void subscribeActual(@cfb ycg<? super T> t) {
        C13556a<T> c13556a = new C13556a<>(t, this);
        t.onSubscribe(c13556a);
        if (m23388b(c13556a)) {
            if (c13556a.isCancelled()) {
                m23389c(c13556a);
            }
        } else {
            Throwable th = this.f88169c;
            if (th != null) {
                t.onError(th);
            } else {
                t.onComplete();
            }
        }
    }
}
