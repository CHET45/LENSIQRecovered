package p000;

import io.reactivex.Observable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class kxb<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: a */
    public final xub<? extends T>[] f55570a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends xub<? extends T>> f55571b;

    /* JADX INFO: renamed from: c */
    public final py6<? super Object[], ? extends R> f55572c;

    /* JADX INFO: renamed from: d */
    public final int f55573d;

    /* JADX INFO: renamed from: e */
    public final boolean f55574e;

    /* JADX INFO: renamed from: kxb$a */
    public static final class C8547a<T, R> extends AtomicInteger implements mf4 {
        private static final long serialVersionUID = 2983708048395377667L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f55575a;

        /* JADX INFO: renamed from: b */
        public final py6<? super Object[], ? extends R> f55576b;

        /* JADX INFO: renamed from: c */
        public final C8548b<T, R>[] f55577c;

        /* JADX INFO: renamed from: d */
        public final T[] f55578d;

        /* JADX INFO: renamed from: e */
        public final boolean f55579e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f55580f;

        public C8547a(oxb<? super R> oxbVar, py6<? super Object[], ? extends R> py6Var, int i, boolean z) {
            this.f55575a = oxbVar;
            this.f55576b = py6Var;
            this.f55577c = new C8548b[i];
            this.f55578d = (T[]) new Object[i];
            this.f55579e = z;
        }

        /* JADX INFO: renamed from: a */
        public void m15125a() {
            m15128d();
            m15126b();
        }

        /* JADX INFO: renamed from: b */
        public void m15126b() {
            for (C8548b<T, R> c8548b : this.f55577c) {
                c8548b.dispose();
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m15127c(boolean z, boolean z2, oxb<? super R> oxbVar, boolean z3, C8548b<?, ?> c8548b) {
            if (this.f55580f) {
                m15125a();
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = c8548b.f55584d;
                this.f55580f = true;
                m15125a();
                if (th != null) {
                    oxbVar.onError(th);
                } else {
                    oxbVar.onComplete();
                }
                return true;
            }
            Throwable th2 = c8548b.f55584d;
            if (th2 != null) {
                this.f55580f = true;
                m15125a();
                oxbVar.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f55580f = true;
            m15125a();
            oxbVar.onComplete();
            return true;
        }

        /* JADX INFO: renamed from: d */
        public void m15128d() {
            for (C8548b<T, R> c8548b : this.f55577c) {
                c8548b.f55582b.clear();
            }
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f55580f) {
                return;
            }
            this.f55580f = true;
            m15126b();
            if (getAndIncrement() == 0) {
                m15128d();
            }
        }

        public void drain() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            C8548b<T, R>[] c8548bArr = this.f55577c;
            oxb<? super R> oxbVar = this.f55575a;
            T[] tArr = this.f55578d;
            boolean z = this.f55579e;
            int iAddAndGet = 1;
            while (true) {
                int i = 0;
                int i2 = 0;
                for (C8548b<T, R> c8548b : c8548bArr) {
                    if (tArr[i2] == null) {
                        boolean z2 = c8548b.f55583c;
                        T tPoll = c8548b.f55582b.poll();
                        boolean z3 = tPoll == null;
                        if (m15127c(z2, z3, oxbVar, z, c8548b)) {
                            return;
                        }
                        if (z3) {
                            i++;
                        } else {
                            tArr[i2] = tPoll;
                        }
                    } else if (c8548b.f55583c && !z && (th = c8548b.f55584d) != null) {
                        this.f55580f = true;
                        m15125a();
                        oxbVar.onError(th);
                        return;
                    }
                    i2++;
                }
                if (i != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        oxbVar.onNext((Object) xjb.requireNonNull(this.f55576b.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th2) {
                        n75.throwIfFatal(th2);
                        m15125a();
                        oxbVar.onError(th2);
                        return;
                    }
                }
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f55580f;
        }

        public void subscribe(xub<? extends T>[] xubVarArr, int i) {
            C8548b<T, R>[] c8548bArr = this.f55577c;
            int length = c8548bArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                c8548bArr[i2] = new C8548b<>(this, i);
            }
            lazySet(0);
            this.f55575a.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.f55580f; i3++) {
                xubVarArr[i3].subscribe(c8548bArr[i3]);
            }
        }
    }

    /* JADX INFO: renamed from: kxb$b */
    public static final class C8548b<T, R> implements oxb<T> {

        /* JADX INFO: renamed from: a */
        public final C8547a<T, R> f55581a;

        /* JADX INFO: renamed from: b */
        public final rzf<T> f55582b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f55583c;

        /* JADX INFO: renamed from: d */
        public Throwable f55584d;

        /* JADX INFO: renamed from: e */
        public final AtomicReference<mf4> f55585e = new AtomicReference<>();

        public C8548b(C8547a<T, R> c8547a, int i) {
            this.f55581a = c8547a;
            this.f55582b = new rzf<>(i);
        }

        public void dispose() {
            ag4.dispose(this.f55585e);
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f55583c = true;
            this.f55581a.drain();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f55584d = th;
            this.f55583c = true;
            this.f55581a.drain();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f55582b.offer(t);
            this.f55581a.drain();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f55585e, mf4Var);
        }
    }

    public kxb(xub<? extends T>[] xubVarArr, Iterable<? extends xub<? extends T>> iterable, py6<? super Object[], ? extends R> py6Var, int i, boolean z) {
        this.f55570a = xubVarArr;
        this.f55571b = iterable;
        this.f55572c = py6Var;
        this.f55573d = i;
        this.f55574e = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        int length;
        xub<? extends T>[] xubVarArr = this.f55570a;
        if (xubVarArr == null) {
            xubVarArr = new xub[8];
            length = 0;
            for (xub<? extends T> xubVar : this.f55571b) {
                if (length == xubVarArr.length) {
                    xub<? extends T>[] xubVarArr2 = new xub[(length >> 2) + length];
                    System.arraycopy(xubVarArr, 0, xubVarArr2, 0, length);
                    xubVarArr = xubVarArr2;
                }
                xubVarArr[length] = xubVar;
                length++;
            }
        } else {
            length = xubVarArr.length;
        }
        if (length == 0) {
            c05.complete(oxbVar);
        } else {
            new C8547a(oxbVar, this.f55572c, length, this.f55574e).subscribe(xubVarArr, this.f55573d);
        }
    }
}
