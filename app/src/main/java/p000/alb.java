package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class alb<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final xub<? extends T>[] f1993a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends xub<? extends T>> f1994b;

    /* JADX INFO: renamed from: alb$a */
    public static final class C0315a<T> implements mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f1995a;

        /* JADX INFO: renamed from: b */
        public final C0316b<T>[] f1996b;

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f1997c = new AtomicInteger();

        public C0315a(oxb<? super T> oxbVar, int i) {
            this.f1995a = oxbVar;
            this.f1996b = new C0316b[i];
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f1997c.get() != -1) {
                this.f1997c.lazySet(-1);
                for (C0316b<T> c0316b : this.f1996b) {
                    c0316b.dispose();
                }
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f1997c.get() == -1;
        }

        public void subscribe(xub<? extends T>[] xubVarArr) {
            C0316b<T>[] c0316bArr = this.f1996b;
            int length = c0316bArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                c0316bArr[i] = new C0316b<>(this, i2, this.f1995a);
                i = i2;
            }
            this.f1997c.lazySet(0);
            this.f1995a.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.f1997c.get() == 0; i3++) {
                xubVarArr[i3].subscribe(c0316bArr[i3]);
            }
        }

        public boolean win(int i) {
            int i2 = this.f1997c.get();
            int i3 = 0;
            if (i2 != 0) {
                return i2 == i;
            }
            if (!this.f1997c.compareAndSet(0, i)) {
                return false;
            }
            C0316b<T>[] c0316bArr = this.f1996b;
            int length = c0316bArr.length;
            while (i3 < length) {
                int i4 = i3 + 1;
                if (i4 != i) {
                    c0316bArr[i3].dispose();
                }
                i3 = i4;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: alb$b */
    public static final class C0316b<T> extends AtomicReference<mf4> implements oxb<T> {
        private static final long serialVersionUID = -1185974347409665484L;

        /* JADX INFO: renamed from: a */
        public final C0315a<T> f1998a;

        /* JADX INFO: renamed from: b */
        public final int f1999b;

        /* JADX INFO: renamed from: c */
        public final oxb<? super T> f2000c;

        /* JADX INFO: renamed from: d */
        public boolean f2001d;

        public C0316b(C0315a<T> c0315a, int i, oxb<? super T> oxbVar) {
            this.f1998a = c0315a;
            this.f1999b = i;
            this.f2000c = oxbVar;
        }

        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f2001d) {
                this.f2000c.onComplete();
            } else if (this.f1998a.win(this.f1999b)) {
                this.f2001d = true;
                this.f2000c.onComplete();
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f2001d) {
                this.f2000c.onError(th);
            } else if (!this.f1998a.win(this.f1999b)) {
                pfe.onError(th);
            } else {
                this.f2001d = true;
                this.f2000c.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f2001d) {
                this.f2000c.onNext(t);
            } else if (!this.f1998a.win(this.f1999b)) {
                get().dispose();
            } else {
                this.f2001d = true;
                this.f2000c.onNext(t);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }
    }

    public alb(xub<? extends T>[] xubVarArr, Iterable<? extends xub<? extends T>> iterable) {
        this.f1993a = xubVarArr;
        this.f1994b = iterable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        int length;
        xub<? extends T>[] xubVarArr = this.f1993a;
        if (xubVarArr == null) {
            xubVarArr = new xub[8];
            try {
                length = 0;
                for (xub<? extends T> xubVar : this.f1994b) {
                    if (xubVar == null) {
                        c05.error(new NullPointerException("One of the sources is null"), oxbVar);
                        return;
                    }
                    if (length == xubVarArr.length) {
                        xub<? extends T>[] xubVarArr2 = new xub[(length >> 2) + length];
                        System.arraycopy(xubVarArr, 0, xubVarArr2, 0, length);
                        xubVarArr = xubVarArr2;
                    }
                    int i = length + 1;
                    xubVarArr[length] = xubVar;
                    length = i;
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                c05.error(th, oxbVar);
                return;
            }
        } else {
            length = xubVarArr.length;
        }
        if (length == 0) {
            c05.complete(oxbVar);
        } else if (length == 1) {
            xubVarArr[0].subscribe(oxbVar);
        } else {
            new C0315a(oxbVar, length).subscribe(xubVarArr);
        }
    }
}
