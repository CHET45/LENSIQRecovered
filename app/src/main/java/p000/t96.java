package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.df6;

/* JADX INFO: loaded from: classes7.dex */
public final class t96<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    @dib
    public final zjd<? extends T>[] f84022b;

    /* JADX INFO: renamed from: c */
    @dib
    public final Iterable<? extends zjd<? extends T>> f84023c;

    /* JADX INFO: renamed from: d */
    public final sy6<? super Object[], ? extends R> f84024d;

    /* JADX INFO: renamed from: e */
    public final int f84025e;

    /* JADX INFO: renamed from: f */
    public final boolean f84026f;

    /* JADX INFO: renamed from: t96$a */
    public static final class C12955a<T, R> extends rv0<R> {
        private static final long serialVersionUID = -5082275438355852221L;

        /* JADX INFO: renamed from: C */
        public int f84027C;

        /* JADX INFO: renamed from: F */
        public int f84028F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f84029H;

        /* JADX INFO: renamed from: L */
        public final AtomicLong f84030L;

        /* JADX INFO: renamed from: M */
        public volatile boolean f84031M;

        /* JADX INFO: renamed from: N */
        public final bc0 f84032N;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f84033a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super Object[], ? extends R> f84034b;

        /* JADX INFO: renamed from: c */
        public final C12956b<T>[] f84035c;

        /* JADX INFO: renamed from: d */
        public final qzf<Object> f84036d;

        /* JADX INFO: renamed from: e */
        public final Object[] f84037e;

        /* JADX INFO: renamed from: f */
        public final boolean f84038f;

        /* JADX INFO: renamed from: m */
        public boolean f84039m;

        public C12955a(ycg<? super R> actual, sy6<? super Object[], ? extends R> combiner, int n, int bufferSize, boolean delayErrors) {
            this.f84033a = actual;
            this.f84034b = combiner;
            C12956b<T>[] c12956bArr = new C12956b[n];
            for (int i = 0; i < n; i++) {
                c12956bArr[i] = new C12956b<>(this, i, bufferSize);
            }
            this.f84035c = c12956bArr;
            this.f84037e = new Object[n];
            this.f84036d = new qzf<>(bufferSize);
            this.f84030L = new AtomicLong();
            this.f84032N = new bc0();
            this.f84038f = delayErrors;
        }

        /* JADX INFO: renamed from: a */
        public void m22424a() {
            for (C12956b<T> c12956b : this.f84035c) {
                c12956b.cancel();
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m22425b(boolean d, boolean empty, ycg<?> a, qzf<?> q) {
            if (this.f84029H) {
                m22424a();
                q.clear();
                this.f84032N.tryTerminateAndReport();
                return true;
            }
            if (!d) {
                return false;
            }
            if (this.f84038f) {
                if (!empty) {
                    return false;
                }
                m22424a();
                this.f84032N.tryTerminateConsumer(a);
                return true;
            }
            Throwable thTerminate = k75.terminate(this.f84032N);
            if (thTerminate != null && thTerminate != k75.f52721a) {
                m22424a();
                q.clear();
                a.onError(thTerminate);
                return true;
            }
            if (!empty) {
                return false;
            }
            m22424a();
            a.onComplete();
            return true;
        }

        /* JADX INFO: renamed from: c */
        public void m22426c() {
            ycg<? super R> ycgVar = this.f84033a;
            qzf<?> qzfVar = this.f84036d;
            int iAddAndGet = 1;
            do {
                long j = this.f84030L.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f84031M;
                    Object objPoll = qzfVar.poll();
                    boolean z2 = objPoll == null;
                    if (m22425b(z, z2, ycgVar, qzfVar)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    try {
                        R rApply = this.f84034b.apply((Object[]) qzfVar.poll());
                        Objects.requireNonNull(rApply, "The combiner returned a null value");
                        ycgVar.onNext(rApply);
                        ((C12956b) objPoll).requestOne();
                        j2++;
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        m22424a();
                        k75.addThrowable(this.f84032N, th);
                        ycgVar.onError(k75.terminate(this.f84032N));
                        return;
                    }
                }
                if (j2 == j && m22425b(this.f84031M, qzfVar.isEmpty(), ycgVar, qzfVar)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.f84030L.addAndGet(-j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f84029H = true;
            m22424a();
            drain();
        }

        @Override // p000.zif
        public void clear() {
            this.f84036d.clear();
        }

        /* JADX INFO: renamed from: d */
        public void m22427d() {
            ycg<? super R> ycgVar = this.f84033a;
            qzf<Object> qzfVar = this.f84036d;
            int iAddAndGet = 1;
            while (!this.f84029H) {
                Throwable th = this.f84032N.get();
                if (th != null) {
                    qzfVar.clear();
                    ycgVar.onError(th);
                    return;
                }
                boolean z = this.f84031M;
                boolean zIsEmpty = qzfVar.isEmpty();
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
            qzfVar.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f84039m) {
                m22427d();
            } else {
                m22426c();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m22428e(int index) {
            int i;
            synchronized (this) {
                try {
                    Object[] objArr = this.f84037e;
                    if (objArr[index] != null && (i = this.f84028F + 1) != objArr.length) {
                        this.f84028F = i;
                    } else {
                        this.f84031M = true;
                        drain();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m22429f(int index, Throwable e) {
            if (!k75.addThrowable(this.f84032N, e)) {
                ofe.onError(e);
            } else {
                if (this.f84038f) {
                    m22428e(index);
                    return;
                }
                m22424a();
                this.f84031M = true;
                drain();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m22430g(int index, T value) {
            boolean z;
            synchronized (this) {
                try {
                    Object[] objArr = this.f84037e;
                    int i = this.f84027C;
                    if (objArr[index] == null) {
                        i++;
                        this.f84027C = i;
                    }
                    objArr[index] = value;
                    if (objArr.length == i) {
                        this.f84036d.offer(this.f84035c[index], objArr.clone());
                        z = false;
                    } else {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.f84035c[index].requestOne();
            } else {
                drain();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m22431h(zjd<? extends T>[] sources, int n) {
            C12956b<T>[] c12956bArr = this.f84035c;
            for (int i = 0; i < n && !this.f84031M && !this.f84029H; i++) {
                sources[i].subscribe(c12956bArr[i]);
            }
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f84036d.isEmpty();
        }

        @Override // p000.zif
        @dib
        public R poll() throws Throwable {
            Object objPoll = this.f84036d.poll();
            if (objPoll == null) {
                return null;
            }
            R rApply = this.f84034b.apply((Object[]) this.f84036d.poll());
            Objects.requireNonNull(rApply, "The combiner returned a null value");
            ((C12956b) objPoll).requestOne();
            return rApply;
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f84030L, n);
                drain();
            }
        }

        @Override // p000.vnd
        public int requestFusion(int requestedMode) {
            if ((requestedMode & 4) != 0) {
                return 0;
            }
            int i = requestedMode & 2;
            this.f84039m = i != 0;
            return i;
        }
    }

    /* JADX INFO: renamed from: t96$b */
    public static final class C12956b<T> extends AtomicReference<fdg> implements kj6<T> {
        private static final long serialVersionUID = -8730235182291002949L;

        /* JADX INFO: renamed from: a */
        public final C12955a<T, ?> f84040a;

        /* JADX INFO: renamed from: b */
        public final int f84041b;

        /* JADX INFO: renamed from: c */
        public final int f84042c;

        /* JADX INFO: renamed from: d */
        public final int f84043d;

        /* JADX INFO: renamed from: e */
        public int f84044e;

        public C12956b(C12955a<T, ?> parent, int index, int prefetch) {
            this.f84040a = parent;
            this.f84041b = index;
            this.f84042c = prefetch;
            this.f84043d = prefetch - (prefetch >> 2);
        }

        public void cancel() {
            ldg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f84040a.m22428e(this.f84041b);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f84040a.m22429f(this.f84041b, t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f84040a.m22430g(this.f84041b, t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this, s, this.f84042c);
        }

        public void requestOne() {
            int i = this.f84044e + 1;
            if (i != this.f84043d) {
                this.f84044e = i;
            } else {
                this.f84044e = 0;
                get().request(i);
            }
        }
    }

    /* JADX INFO: renamed from: t96$c */
    public final class C12957c implements sy6<T, R> {
        public C12957c() {
        }

        @Override // p000.sy6
        public R apply(T t) throws Throwable {
            return t96.this.f84024d.apply(new Object[]{t});
        }
    }

    public t96(@cfb zjd<? extends T>[] array, @cfb sy6<? super Object[], ? extends R> combiner, int bufferSize, boolean delayErrors) {
        this.f84022b = array;
        this.f84023c = null;
        this.f84024d = combiner;
        this.f84025e = bufferSize;
        this.f84026f = delayErrors;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        int length;
        zjd<? extends T>[] zjdVarArr = this.f84022b;
        if (zjdVarArr == null) {
            zjdVarArr = new zjd[8];
            try {
                length = 0;
                for (zjd<? extends T> zjdVar : this.f84023c) {
                    if (length == zjdVarArr.length) {
                        zjd<? extends T>[] zjdVarArr2 = new zjd[(length >> 2) + length];
                        System.arraycopy(zjdVarArr, 0, zjdVarArr2, 0, length);
                        zjdVarArr = zjdVarArr2;
                    }
                    int i = length + 1;
                    Objects.requireNonNull(zjdVar, "The Iterator returned a null Publisher");
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
        int i2 = length;
        if (i2 == 0) {
            w05.complete(s);
        } else {
            if (i2 == 1) {
                zjdVarArr[0].subscribe(new df6.C4778b(s, new C12957c()));
                return;
            }
            C12955a c12955a = new C12955a(s, this.f84024d, i2, this.f84025e, this.f84026f);
            s.onSubscribe(c12955a);
            c12955a.m22431h(zjdVarArr, i2);
        }
    }

    public t96(@cfb Iterable<? extends zjd<? extends T>> iterable, @cfb sy6<? super Object[], ? extends R> combiner, int bufferSize, boolean delayErrors) {
        this.f84022b = null;
        this.f84023c = iterable;
        this.f84024d = combiner;
        this.f84025e = bufferSize;
        this.f84026f = delayErrors;
    }
}
