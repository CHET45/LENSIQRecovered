package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class x90<T> extends rg6<T> {

    /* JADX INFO: renamed from: e */
    public static final C14995a[] f97232e = new C14995a[0];

    /* JADX INFO: renamed from: f */
    public static final C14995a[] f97233f = new C14995a[0];

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C14995a<T>[]> f97234b = new AtomicReference<>(f97232e);

    /* JADX INFO: renamed from: c */
    public Throwable f97235c;

    /* JADX INFO: renamed from: d */
    public T f97236d;

    /* JADX INFO: renamed from: x90$a */
    public static final class C14995a<T> extends k34<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* JADX INFO: renamed from: L */
        public final x90<T> f97237L;

        public C14995a(ycg<? super T> ycgVar, x90<T> x90Var) {
            super(ycgVar);
            this.f97237L = x90Var;
        }

        @Override // p000.k34, p000.fdg
        public void cancel() {
            if (super.tryCancel()) {
                this.f97237L.m25057c(this);
            }
        }

        public void onComplete() {
            if (isCancelled()) {
                return;
            }
            this.f52502a.onComplete();
        }

        public void onError(Throwable th) {
            if (isCancelled()) {
                pfe.onError(th);
            } else {
                this.f52502a.onError(th);
            }
        }
    }

    @bfb
    @by1
    public static <T> x90<T> create() {
        return new x90<>();
    }

    /* JADX INFO: renamed from: b */
    public boolean m25056b(C14995a<T> c14995a) {
        C14995a<T>[] c14995aArr;
        C14995a[] c14995aArr2;
        do {
            c14995aArr = this.f97234b.get();
            if (c14995aArr == f97233f) {
                return false;
            }
            int length = c14995aArr.length;
            c14995aArr2 = new C14995a[length + 1];
            System.arraycopy(c14995aArr, 0, c14995aArr2, 0, length);
            c14995aArr2[length] = c14995a;
        } while (!v7b.m23844a(this.f97234b, c14995aArr, c14995aArr2));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m25057c(C14995a<T> c14995a) {
        C14995a<T>[] c14995aArr;
        C14995a[] c14995aArr2;
        do {
            c14995aArr = this.f97234b.get();
            int length = c14995aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c14995aArr[i] == c14995a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c14995aArr2 = f97232e;
            } else {
                C14995a[] c14995aArr3 = new C14995a[length - 1];
                System.arraycopy(c14995aArr, 0, c14995aArr3, 0, i);
                System.arraycopy(c14995aArr, i + 1, c14995aArr3, i, (length - i) - 1);
                c14995aArr2 = c14995aArr3;
            }
        } while (!v7b.m23844a(this.f97234b, c14995aArr, c14995aArr2));
    }

    @Override // p000.rg6
    @cib
    public Throwable getThrowable() {
        if (this.f97234b.get() == f97233f) {
            return this.f97235c;
        }
        return null;
    }

    @cib
    public T getValue() {
        if (this.f97234b.get() == f97233f) {
            return this.f97236d;
        }
        return null;
    }

    @Deprecated
    public Object[] getValues() {
        T value = getValue();
        return value != null ? new Object[]{value} : new Object[0];
    }

    @Override // p000.rg6
    public boolean hasComplete() {
        return this.f97234b.get() == f97233f && this.f97235c == null;
    }

    @Override // p000.rg6
    public boolean hasSubscribers() {
        return this.f97234b.get().length != 0;
    }

    @Override // p000.rg6
    public boolean hasThrowable() {
        return this.f97234b.get() == f97233f && this.f97235c != null;
    }

    public boolean hasValue() {
        return this.f97234b.get() == f97233f && this.f97236d != null;
    }

    @Override // p000.ycg
    public void onComplete() {
        C14995a<T>[] c14995aArr = this.f97234b.get();
        C14995a<T>[] c14995aArr2 = f97233f;
        if (c14995aArr == c14995aArr2) {
            return;
        }
        T t = this.f97236d;
        C14995a<T>[] andSet = this.f97234b.getAndSet(c14995aArr2);
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
    public void onError(Throwable th) {
        xjb.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C14995a<T>[] c14995aArr = this.f97234b.get();
        C14995a<T>[] c14995aArr2 = f97233f;
        if (c14995aArr == c14995aArr2) {
            pfe.onError(th);
            return;
        }
        this.f97236d = null;
        this.f97235c = th;
        for (C14995a<T> c14995a : this.f97234b.getAndSet(c14995aArr2)) {
            c14995a.onError(th);
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        xjb.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f97234b.get() == f97233f) {
            return;
        }
        this.f97236d = t;
    }

    @Override // p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (this.f97234b.get() == f97233f) {
            fdgVar.cancel();
        } else {
            fdgVar.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C14995a<T> c14995a = new C14995a<>(ycgVar, this);
        ycgVar.onSubscribe(c14995a);
        if (m25056b(c14995a)) {
            if (c14995a.isCancelled()) {
                m25057c(c14995a);
                return;
            }
            return;
        }
        Throwable th = this.f97235c;
        if (th != null) {
            ycgVar.onError(th);
            return;
        }
        T t = this.f97236d;
        if (t != null) {
            c14995a.complete(t);
        } else {
            c14995a.onComplete();
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
