package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class tjd<T> extends rg6<T> {

    /* JADX INFO: renamed from: d */
    public static final C13075a[] f85074d = new C13075a[0];

    /* JADX INFO: renamed from: e */
    public static final C13075a[] f85075e = new C13075a[0];

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C13075a<T>[]> f85076b = new AtomicReference<>(f85075e);

    /* JADX INFO: renamed from: c */
    public Throwable f85077c;

    /* JADX INFO: renamed from: tjd$a */
    public static final class C13075a<T> extends AtomicLong implements fdg {
        private static final long serialVersionUID = 3562861878281475070L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f85078a;

        /* JADX INFO: renamed from: b */
        public final tjd<T> f85079b;

        public C13075a(ycg<? super T> ycgVar, tjd<T> tjdVar) {
            this.f85078a = ycgVar;
            this.f85079b = tjdVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m22701a() {
            return get() == 0;
        }

        @Override // p000.fdg
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f85079b.m22700c(this);
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.f85078a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.f85078a.onError(th);
            } else {
                pfe.onError(th);
            }
        }

        public void onNext(T t) {
            long j = get();
            if (j == Long.MIN_VALUE) {
                return;
            }
            if (j != 0) {
                this.f85078a.onNext(t);
                so0.producedCancel(this, 1L);
            } else {
                cancel();
                this.f85078a.onError(new cwa("Could not emit value due to lack of requests"));
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.addCancel(this, j);
            }
        }
    }

    @bfb
    @by1
    public static <T> tjd<T> create() {
        return new tjd<>();
    }

    /* JADX INFO: renamed from: b */
    public boolean m22699b(C13075a<T> c13075a) {
        C13075a<T>[] c13075aArr;
        C13075a[] c13075aArr2;
        do {
            c13075aArr = this.f85076b.get();
            if (c13075aArr == f85074d) {
                return false;
            }
            int length = c13075aArr.length;
            c13075aArr2 = new C13075a[length + 1];
            System.arraycopy(c13075aArr, 0, c13075aArr2, 0, length);
            c13075aArr2[length] = c13075a;
        } while (!v7b.m23844a(this.f85076b, c13075aArr, c13075aArr2));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m22700c(C13075a<T> c13075a) {
        C13075a<T>[] c13075aArr;
        C13075a[] c13075aArr2;
        do {
            c13075aArr = this.f85076b.get();
            if (c13075aArr == f85074d || c13075aArr == f85075e) {
                return;
            }
            int length = c13075aArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c13075aArr[i] == c13075a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c13075aArr2 = f85075e;
            } else {
                C13075a[] c13075aArr3 = new C13075a[length - 1];
                System.arraycopy(c13075aArr, 0, c13075aArr3, 0, i);
                System.arraycopy(c13075aArr, i + 1, c13075aArr3, i, (length - i) - 1);
                c13075aArr2 = c13075aArr3;
            }
        } while (!v7b.m23844a(this.f85076b, c13075aArr, c13075aArr2));
    }

    @Override // p000.rg6
    @cib
    public Throwable getThrowable() {
        if (this.f85076b.get() == f85074d) {
            return this.f85077c;
        }
        return null;
    }

    @Override // p000.rg6
    public boolean hasComplete() {
        return this.f85076b.get() == f85074d && this.f85077c == null;
    }

    @Override // p000.rg6
    public boolean hasSubscribers() {
        return this.f85076b.get().length != 0;
    }

    @Override // p000.rg6
    public boolean hasThrowable() {
        return this.f85076b.get() == f85074d && this.f85077c != null;
    }

    public boolean offer(T t) {
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        C13075a<T>[] c13075aArr = this.f85076b.get();
        for (C13075a<T> c13075a : c13075aArr) {
            if (c13075a.m22701a()) {
                return false;
            }
        }
        for (C13075a<T> c13075a2 : c13075aArr) {
            c13075a2.onNext(t);
        }
        return true;
    }

    @Override // p000.ycg
    public void onComplete() {
        C13075a<T>[] c13075aArr = this.f85076b.get();
        C13075a<T>[] c13075aArr2 = f85074d;
        if (c13075aArr == c13075aArr2) {
            return;
        }
        for (C13075a<T> c13075a : this.f85076b.getAndSet(c13075aArr2)) {
            c13075a.onComplete();
        }
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        xjb.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C13075a<T>[] c13075aArr = this.f85076b.get();
        C13075a<T>[] c13075aArr2 = f85074d;
        if (c13075aArr == c13075aArr2) {
            pfe.onError(th);
            return;
        }
        this.f85077c = th;
        for (C13075a<T> c13075a : this.f85076b.getAndSet(c13075aArr2)) {
            c13075a.onError(th);
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        xjb.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C13075a<T> c13075a : this.f85076b.get()) {
            c13075a.onNext(t);
        }
    }

    @Override // p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (this.f85076b.get() == f85074d) {
            fdgVar.cancel();
        } else {
            fdgVar.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C13075a<T> c13075a = new C13075a<>(ycgVar, this);
        ycgVar.onSubscribe(c13075a);
        if (m22699b(c13075a)) {
            if (c13075a.isCancelled()) {
                m22700c(c13075a);
            }
        } else {
            Throwable th = this.f85077c;
            if (th != null) {
                ycgVar.onError(th);
            } else {
                ycgVar.onComplete();
            }
        }
    }
}
