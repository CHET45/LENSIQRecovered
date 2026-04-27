package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class r86<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final zjd<? extends T>[] f77381b;

    /* JADX INFO: renamed from: c */
    public final Iterable<? extends zjd<? extends T>> f77382c;

    /* JADX INFO: renamed from: r86$a */
    public static final class C11942a<T> implements fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f77383a;

        /* JADX INFO: renamed from: b */
        public final C11943b<T>[] f77384b;

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f77385c = new AtomicInteger();

        public C11942a(ycg<? super T> ycgVar, int i) {
            this.f77383a = ycgVar;
            this.f77384b = new C11943b[i];
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f77385c.get() != -1) {
                this.f77385c.lazySet(-1);
                for (C11943b<T> c11943b : this.f77384b) {
                    c11943b.cancel();
                }
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                int i = this.f77385c.get();
                if (i > 0) {
                    this.f77384b[i - 1].request(j);
                    return;
                }
                if (i == 0) {
                    for (C11943b<T> c11943b : this.f77384b) {
                        c11943b.request(j);
                    }
                }
            }
        }

        public void subscribe(zjd<? extends T>[] zjdVarArr) {
            C11943b<T>[] c11943bArr = this.f77384b;
            int length = c11943bArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                c11943bArr[i] = new C11943b<>(this, i2, this.f77383a);
                i = i2;
            }
            this.f77385c.lazySet(0);
            this.f77383a.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.f77385c.get() == 0; i3++) {
                zjdVarArr[i3].subscribe(c11943bArr[i3]);
            }
        }

        public boolean win(int i) {
            int i2 = 0;
            if (this.f77385c.get() != 0 || !this.f77385c.compareAndSet(0, i)) {
                return false;
            }
            C11943b<T>[] c11943bArr = this.f77384b;
            int length = c11943bArr.length;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (i3 != i) {
                    c11943bArr[i2].cancel();
                }
                i2 = i3;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: r86$b */
    public static final class C11943b<T> extends AtomicReference<fdg> implements lj6<T>, fdg {
        private static final long serialVersionUID = -1185974347409665484L;

        /* JADX INFO: renamed from: a */
        public final C11942a<T> f77386a;

        /* JADX INFO: renamed from: b */
        public final int f77387b;

        /* JADX INFO: renamed from: c */
        public final ycg<? super T> f77388c;

        /* JADX INFO: renamed from: d */
        public boolean f77389d;

        /* JADX INFO: renamed from: e */
        public final AtomicLong f77390e = new AtomicLong();

        public C11943b(C11942a<T> c11942a, int i, ycg<? super T> ycgVar) {
            this.f77386a = c11942a;
            this.f77387b = i;
            this.f77388c = ycgVar;
        }

        @Override // p000.fdg
        public void cancel() {
            mdg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f77389d) {
                this.f77388c.onComplete();
            } else if (!this.f77386a.win(this.f77387b)) {
                get().cancel();
            } else {
                this.f77389d = true;
                this.f77388c.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f77389d) {
                this.f77388c.onError(th);
            } else if (this.f77386a.win(this.f77387b)) {
                this.f77389d = true;
                this.f77388c.onError(th);
            } else {
                get().cancel();
                pfe.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f77389d) {
                this.f77388c.onNext(t);
            } else if (!this.f77386a.win(this.f77387b)) {
                get().cancel();
            } else {
                this.f77389d = true;
                this.f77388c.onNext(t);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.deferredSetOnce(this, this.f77390e, fdgVar);
        }

        @Override // p000.fdg
        public void request(long j) {
            mdg.deferredRequest(this, this.f77390e, j);
        }
    }

    public r86(zjd<? extends T>[] zjdVarArr, Iterable<? extends zjd<? extends T>> iterable) {
        this.f77381b = zjdVarArr;
        this.f77382c = iterable;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        int length;
        zjd<? extends T>[] zjdVarArr = this.f77381b;
        if (zjdVarArr == null) {
            zjdVarArr = new zjd[8];
            try {
                length = 0;
                for (zjd<? extends T> zjdVar : this.f77382c) {
                    if (zjdVar == null) {
                        x05.error(new NullPointerException("One of the sources is null"), ycgVar);
                        return;
                    }
                    if (length == zjdVarArr.length) {
                        zjd<? extends T>[] zjdVarArr2 = new zjd[(length >> 2) + length];
                        System.arraycopy(zjdVarArr, 0, zjdVarArr2, 0, length);
                        zjdVarArr = zjdVarArr2;
                    }
                    int i = length + 1;
                    zjdVarArr[length] = zjdVar;
                    length = i;
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                x05.error(th, ycgVar);
                return;
            }
        } else {
            length = zjdVarArr.length;
        }
        if (length == 0) {
            x05.complete(ycgVar);
        } else if (length == 1) {
            zjdVarArr[0].subscribe(ycgVar);
        } else {
            new C11942a(ycgVar, length).subscribe(zjdVarArr);
        }
    }
}
