package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class s86<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final zjd<? extends T>[] f80932b;

    /* JADX INFO: renamed from: c */
    public final Iterable<? extends zjd<? extends T>> f80933c;

    /* JADX INFO: renamed from: s86$a */
    public static final class C12486a<T> implements fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f80934a;

        /* JADX INFO: renamed from: b */
        public final C12487b<T>[] f80935b;

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f80936c = new AtomicInteger();

        public C12486a(ycg<? super T> actual, int count) {
            this.f80934a = actual;
            this.f80935b = new C12487b[count];
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f80936c.get() != -1) {
                this.f80936c.lazySet(-1);
                for (C12487b<T> c12487b : this.f80935b) {
                    c12487b.cancel();
                }
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                int i = this.f80936c.get();
                if (i > 0) {
                    this.f80935b[i - 1].request(n);
                    return;
                }
                if (i == 0) {
                    for (C12487b<T> c12487b : this.f80935b) {
                        c12487b.request(n);
                    }
                }
            }
        }

        public void subscribe(zjd<? extends T>[] sources) {
            C12487b<T>[] c12487bArr = this.f80935b;
            int length = c12487bArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                c12487bArr[i] = new C12487b<>(this, i2, this.f80934a);
                i = i2;
            }
            this.f80936c.lazySet(0);
            this.f80934a.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.f80936c.get() == 0; i3++) {
                sources[i3].subscribe(c12487bArr[i3]);
            }
        }

        public boolean win(int index) {
            int i = 0;
            if (this.f80936c.get() != 0 || !this.f80936c.compareAndSet(0, index)) {
                return false;
            }
            C12487b<T>[] c12487bArr = this.f80935b;
            int length = c12487bArr.length;
            while (i < length) {
                int i2 = i + 1;
                if (i2 != index) {
                    c12487bArr[i].cancel();
                }
                i = i2;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: s86$b */
    public static final class C12487b<T> extends AtomicReference<fdg> implements kj6<T>, fdg {
        private static final long serialVersionUID = -1185974347409665484L;

        /* JADX INFO: renamed from: a */
        public final C12486a<T> f80937a;

        /* JADX INFO: renamed from: b */
        public final int f80938b;

        /* JADX INFO: renamed from: c */
        public final ycg<? super T> f80939c;

        /* JADX INFO: renamed from: d */
        public boolean f80940d;

        /* JADX INFO: renamed from: e */
        public final AtomicLong f80941e = new AtomicLong();

        public C12487b(C12486a<T> parent, int index, ycg<? super T> downstream) {
            this.f80937a = parent;
            this.f80938b = index;
            this.f80939c = downstream;
        }

        @Override // p000.fdg
        public void cancel() {
            ldg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f80940d) {
                this.f80939c.onComplete();
            } else if (!this.f80937a.win(this.f80938b)) {
                get().cancel();
            } else {
                this.f80940d = true;
                this.f80939c.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f80940d) {
                this.f80939c.onError(t);
            } else if (this.f80937a.win(this.f80938b)) {
                this.f80940d = true;
                this.f80939c.onError(t);
            } else {
                get().cancel();
                ofe.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f80940d) {
                this.f80939c.onNext(t);
            } else if (!this.f80937a.win(this.f80938b)) {
                get().cancel();
            } else {
                this.f80940d = true;
                this.f80939c.onNext(t);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.deferredSetOnce(this, this.f80941e, s);
        }

        @Override // p000.fdg
        public void request(long n) {
            ldg.deferredRequest(this, this.f80941e, n);
        }
    }

    public s86(zjd<? extends T>[] sources, Iterable<? extends zjd<? extends T>> sourcesIterable) {
        this.f80932b = sources;
        this.f80933c = sourcesIterable;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        int length;
        zjd<? extends T>[] zjdVarArr = this.f80932b;
        if (zjdVarArr == null) {
            zjdVarArr = new zjd[8];
            try {
                length = 0;
                for (zjd<? extends T> zjdVar : this.f80933c) {
                    if (zjdVar == null) {
                        w05.error(new NullPointerException("One of the sources is null"), s);
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
                o75.throwIfFatal(th);
                w05.error(th, s);
                return;
            }
        } else {
            length = zjdVarArr.length;
        }
        if (length == 0) {
            w05.complete(s);
        } else if (length == 1) {
            zjdVarArr[0].subscribe(s);
        } else {
            new C12486a(s, length).subscribe(zjdVarArr);
        }
    }
}
