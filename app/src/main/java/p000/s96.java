package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.cf6;

/* JADX INFO: loaded from: classes7.dex */
public final class s96<T, R> extends m86<R> {

    /* JADX INFO: renamed from: b */
    @cib
    public final zjd<? extends T>[] f80981b;

    /* JADX INFO: renamed from: c */
    @cib
    public final Iterable<? extends zjd<? extends T>> f80982c;

    /* JADX INFO: renamed from: d */
    public final py6<? super Object[], ? extends R> f80983d;

    /* JADX INFO: renamed from: e */
    public final int f80984e;

    /* JADX INFO: renamed from: f */
    public final boolean f80985f;

    /* JADX INFO: renamed from: s96$a */
    public static final class C12490a<T, R> extends sv0<R> {
        private static final long serialVersionUID = -5082275438355852221L;

        /* JADX INFO: renamed from: C */
        public int f80986C;

        /* JADX INFO: renamed from: F */
        public int f80987F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f80988H;

        /* JADX INFO: renamed from: L */
        public final AtomicLong f80989L;

        /* JADX INFO: renamed from: M */
        public volatile boolean f80990M;

        /* JADX INFO: renamed from: N */
        public final AtomicReference<Throwable> f80991N;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f80992a;

        /* JADX INFO: renamed from: b */
        public final py6<? super Object[], ? extends R> f80993b;

        /* JADX INFO: renamed from: c */
        public final C12491b<T>[] f80994c;

        /* JADX INFO: renamed from: d */
        public final rzf<Object> f80995d;

        /* JADX INFO: renamed from: e */
        public final Object[] f80996e;

        /* JADX INFO: renamed from: f */
        public final boolean f80997f;

        /* JADX INFO: renamed from: m */
        public boolean f80998m;

        public C12490a(ycg<? super R> ycgVar, py6<? super Object[], ? extends R> py6Var, int i, int i2, boolean z) {
            this.f80992a = ycgVar;
            this.f80993b = py6Var;
            C12491b<T>[] c12491bArr = new C12491b[i];
            for (int i3 = 0; i3 < i; i3++) {
                c12491bArr[i3] = new C12491b<>(this, i3, i2);
            }
            this.f80994c = c12491bArr;
            this.f80996e = new Object[i];
            this.f80995d = new rzf<>(i2);
            this.f80989L = new AtomicLong();
            this.f80991N = new AtomicReference<>();
            this.f80997f = z;
        }

        /* JADX INFO: renamed from: a */
        public void m21777a() {
            for (C12491b<T> c12491b : this.f80994c) {
                c12491b.cancel();
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m21778b(boolean z, boolean z2, ycg<?> ycgVar, rzf<?> rzfVar) {
            if (this.f80988H) {
                m21777a();
                rzfVar.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f80997f) {
                if (!z2) {
                    return false;
                }
                m21777a();
                Throwable thTerminate = j75.terminate(this.f80991N);
                if (thTerminate == null || thTerminate == j75.f49698a) {
                    ycgVar.onComplete();
                } else {
                    ycgVar.onError(thTerminate);
                }
                return true;
            }
            Throwable thTerminate2 = j75.terminate(this.f80991N);
            if (thTerminate2 != null && thTerminate2 != j75.f49698a) {
                m21777a();
                rzfVar.clear();
                ycgVar.onError(thTerminate2);
                return true;
            }
            if (!z2) {
                return false;
            }
            m21777a();
            ycgVar.onComplete();
            return true;
        }

        /* JADX INFO: renamed from: c */
        public void m21779c() {
            ycg<? super R> ycgVar = this.f80992a;
            rzf<?> rzfVar = this.f80995d;
            int iAddAndGet = 1;
            do {
                long j = this.f80989L.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f80990M;
                    Object objPoll = rzfVar.poll();
                    boolean z2 = objPoll == null;
                    if (m21778b(z, z2, ycgVar, rzfVar)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    try {
                        ycgVar.onNext((Object) xjb.requireNonNull(this.f80993b.apply((Object[]) rzfVar.poll()), "The combiner returned a null value"));
                        ((C12491b) objPoll).requestOne();
                        j2++;
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        m21777a();
                        j75.addThrowable(this.f80991N, th);
                        ycgVar.onError(j75.terminate(this.f80991N));
                        return;
                    }
                }
                if (j2 == j && m21778b(this.f80990M, rzfVar.isEmpty(), ycgVar, rzfVar)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.f80989L.addAndGet(-j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f80988H = true;
            m21777a();
        }

        @Override // p000.ajf
        public void clear() {
            this.f80995d.clear();
        }

        /* JADX INFO: renamed from: d */
        public void m21780d() {
            ycg<? super R> ycgVar = this.f80992a;
            rzf<Object> rzfVar = this.f80995d;
            int iAddAndGet = 1;
            while (!this.f80988H) {
                Throwable th = this.f80991N.get();
                if (th != null) {
                    rzfVar.clear();
                    ycgVar.onError(th);
                    return;
                }
                boolean z = this.f80990M;
                boolean zIsEmpty = rzfVar.isEmpty();
                if (!zIsEmpty) {
                    ycgVar.onNext(null);
                }
                if (z && zIsEmpty) {
                    ycgVar.onComplete();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            rzfVar.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f80998m) {
                m21780d();
            } else {
                m21779c();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m21781e(int i) {
            int i2;
            synchronized (this) {
                try {
                    Object[] objArr = this.f80996e;
                    if (objArr[i] != null && (i2 = this.f80987F + 1) != objArr.length) {
                        this.f80987F = i2;
                    } else {
                        this.f80990M = true;
                        drain();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m21782f(int i, Throwable th) {
            if (!j75.addThrowable(this.f80991N, th)) {
                pfe.onError(th);
            } else {
                if (this.f80997f) {
                    m21781e(i);
                    return;
                }
                m21777a();
                this.f80990M = true;
                drain();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m21783g(int i, T t) {
            boolean z;
            synchronized (this) {
                try {
                    Object[] objArr = this.f80996e;
                    int i2 = this.f80986C;
                    if (objArr[i] == null) {
                        i2++;
                        this.f80986C = i2;
                    }
                    objArr[i] = t;
                    if (objArr.length == i2) {
                        this.f80995d.offer(this.f80994c[i], objArr.clone());
                        z = false;
                    } else {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.f80994c[i].requestOne();
            } else {
                drain();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m21784h(zjd<? extends T>[] zjdVarArr, int i) {
            C12491b<T>[] c12491bArr = this.f80994c;
            for (int i2 = 0; i2 < i && !this.f80990M && !this.f80988H; i2++) {
                zjdVarArr[i2].subscribe(c12491bArr[i2]);
            }
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f80995d.isEmpty();
        }

        @Override // p000.ajf
        @cib
        public R poll() throws Exception {
            Object objPoll = this.f80995d.poll();
            if (objPoll == null) {
                return null;
            }
            R r = (R) xjb.requireNonNull(this.f80993b.apply((Object[]) this.f80995d.poll()), "The combiner returned a null value");
            ((C12491b) objPoll).requestOne();
            return r;
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f80989L, j);
                drain();
            }
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 4) != 0) {
                return 0;
            }
            int i2 = i & 2;
            this.f80998m = i2 != 0;
            return i2;
        }
    }

    /* JADX INFO: renamed from: s96$b */
    public static final class C12491b<T> extends AtomicReference<fdg> implements lj6<T> {
        private static final long serialVersionUID = -8730235182291002949L;

        /* JADX INFO: renamed from: a */
        public final C12490a<T, ?> f80999a;

        /* JADX INFO: renamed from: b */
        public final int f81000b;

        /* JADX INFO: renamed from: c */
        public final int f81001c;

        /* JADX INFO: renamed from: d */
        public final int f81002d;

        /* JADX INFO: renamed from: e */
        public int f81003e;

        public C12491b(C12490a<T, ?> c12490a, int i, int i2) {
            this.f80999a = c12490a;
            this.f81000b = i;
            this.f81001c = i2;
            this.f81002d = i2 - (i2 >> 2);
        }

        public void cancel() {
            mdg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f80999a.m21781e(this.f81000b);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f80999a.m21782f(this.f81000b, th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f80999a.m21783g(this.f81000b, t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this, fdgVar, this.f81001c);
        }

        public void requestOne() {
            int i = this.f81003e + 1;
            if (i != this.f81002d) {
                this.f81003e = i;
            } else {
                this.f81003e = 0;
                get().request(i);
            }
        }
    }

    /* JADX INFO: renamed from: s96$c */
    public final class C12492c implements py6<T, R> {
        public C12492c() {
        }

        @Override // p000.py6
        public R apply(T t) throws Exception {
            return s96.this.f80983d.apply(new Object[]{t});
        }
    }

    public s96(@bfb zjd<? extends T>[] zjdVarArr, @bfb py6<? super Object[], ? extends R> py6Var, int i, boolean z) {
        this.f80981b = zjdVarArr;
        this.f80982c = null;
        this.f80983d = py6Var;
        this.f80984e = i;
        this.f80985f = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        int length;
        zjd<? extends T>[] zjdVarArr = this.f80981b;
        if (zjdVarArr == null) {
            zjdVarArr = new zjd[8];
            try {
                Iterator it = (Iterator) xjb.requireNonNull(this.f80982c.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            zjd<? extends T> zjdVar = (zjd) xjb.requireNonNull(it.next(), "The publisher returned by the iterator is null");
                            if (length == zjdVarArr.length) {
                                zjd<? extends T>[] zjdVarArr2 = new zjd[(length >> 2) + length];
                                System.arraycopy(zjdVarArr, 0, zjdVarArr2, 0, length);
                                zjdVarArr = zjdVarArr2;
                            }
                            zjdVarArr[length] = zjdVar;
                            length++;
                        } catch (Throwable th) {
                            n75.throwIfFatal(th);
                            x05.error(th, ycgVar);
                            return;
                        }
                    } catch (Throwable th2) {
                        n75.throwIfFatal(th2);
                        x05.error(th2, ycgVar);
                        return;
                    }
                }
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                x05.error(th3, ycgVar);
                return;
            }
        } else {
            length = zjdVarArr.length;
        }
        int i = length;
        if (i == 0) {
            x05.complete(ycgVar);
        } else {
            if (i == 1) {
                zjdVarArr[0].subscribe(new cf6.C2298b(ycgVar, new C12492c()));
                return;
            }
            C12490a c12490a = new C12490a(ycgVar, this.f80983d, i, this.f80984e, this.f80985f);
            ycgVar.onSubscribe(c12490a);
            c12490a.m21784h(zjdVarArr, i);
        }
    }

    public s96(@bfb Iterable<? extends zjd<? extends T>> iterable, @bfb py6<? super Object[], ? extends R> py6Var, int i, boolean z) {
        this.f80981b = null;
        this.f80982c = iterable;
        this.f80983d = py6Var;
        this.f80984e = i;
        this.f80985f = z;
    }
}
