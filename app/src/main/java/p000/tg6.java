package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class tg6<T> extends mr2<T> implements dh7<T> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f84618b;

    /* JADX INFO: renamed from: c */
    public final int f84619c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<C13022b<T>> f84620d = new AtomicReference<>();

    /* JADX INFO: renamed from: tg6$a */
    public static final class C13021a<T> extends AtomicLong implements fdg {
        private static final long serialVersionUID = 2845000326761540265L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f84621a;

        /* JADX INFO: renamed from: b */
        public final C13022b<T> f84622b;

        /* JADX INFO: renamed from: c */
        public long f84623c;

        public C13021a(ycg<? super T> downstream, C13022b<T> parent) {
            this.f84621a = downstream;
            this.f84622b = parent;
        }

        @Override // p000.fdg
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f84622b.m22499d(this);
                this.f84622b.m22498c();
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.addCancel(this, n);
                this.f84622b.m22498c();
            }
        }
    }

    /* JADX INFO: renamed from: tg6$b */
    public static final class C13022b<T> extends AtomicInteger implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: L */
        public static final C13021a[] f84624L = new C13021a[0];

        /* JADX INFO: renamed from: M */
        public static final C13021a[] f84625M = new C13021a[0];
        private static final long serialVersionUID = -1672047311619175801L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f84626C;

        /* JADX INFO: renamed from: F */
        public Throwable f84627F;

        /* JADX INFO: renamed from: H */
        public int f84628H;

        /* JADX INFO: renamed from: a */
        public final AtomicReference<C13022b<T>> f84629a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<fdg> f84630b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f84631c = new AtomicBoolean();

        /* JADX INFO: renamed from: d */
        public final AtomicReference<C13021a<T>[]> f84632d = new AtomicReference<>(f84624L);

        /* JADX INFO: renamed from: e */
        public final int f84633e;

        /* JADX INFO: renamed from: f */
        public volatile zif<T> f84634f;

        /* JADX INFO: renamed from: m */
        public int f84635m;

        public C13022b(AtomicReference<C13022b<T>> current, int bufferSize) {
            this.f84629a = current;
            this.f84633e = bufferSize;
        }

        /* JADX INFO: renamed from: a */
        public boolean m22496a(C13021a<T> inner) {
            C13021a<T>[] c13021aArr;
            C13021a[] c13021aArr2;
            do {
                c13021aArr = this.f84632d.get();
                if (c13021aArr == f84625M) {
                    return false;
                }
                int length = c13021aArr.length;
                c13021aArr2 = new C13021a[length + 1];
                System.arraycopy(c13021aArr, 0, c13021aArr2, 0, length);
                c13021aArr2[length] = inner;
            } while (!v7b.m23844a(this.f84632d, c13021aArr, c13021aArr2));
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m22497b(boolean isDone, boolean isEmpty) {
            if (!isDone || !isEmpty) {
                return false;
            }
            Throwable th = this.f84627F;
            if (th != null) {
                m22500e(th);
                return true;
            }
            for (C13021a<T> c13021a : this.f84632d.getAndSet(f84625M)) {
                if (!c13021a.isCancelled()) {
                    c13021a.f84621a.onComplete();
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: c */
        public void m22498c() {
            if (getAndIncrement() != 0) {
                return;
            }
            zif<T> zifVar = this.f84634f;
            int i = this.f84628H;
            int i2 = this.f84633e;
            int i3 = i2 - (i2 >> 2);
            boolean z = this.f84635m != 1;
            int iAddAndGet = 1;
            zif<T> zifVar2 = zifVar;
            int i4 = i;
            while (true) {
                if (zifVar2 != null) {
                    C13021a<T>[] c13021aArr = this.f84632d.get();
                    long jMin = Long.MAX_VALUE;
                    boolean z2 = false;
                    for (C13021a<T> c13021a : c13021aArr) {
                        long j = c13021a.get();
                        if (j != Long.MIN_VALUE) {
                            jMin = Math.min(j - c13021a.f84623c, jMin);
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        jMin = 0;
                    }
                    for (long j2 = 0; jMin != j2; j2 = 0) {
                        boolean z3 = this.f84626C;
                        try {
                            T tPoll = zifVar2.poll();
                            boolean z4 = tPoll == null;
                            if (m22497b(z3, z4)) {
                                return;
                            }
                            if (z4) {
                                break;
                            }
                            for (C13021a<T> c13021a2 : c13021aArr) {
                                if (!c13021a2.isCancelled()) {
                                    c13021a2.f84621a.onNext(tPoll);
                                    c13021a2.f84623c++;
                                }
                            }
                            if (z && (i4 = i4 + 1) == i3) {
                                this.f84630b.get().request(i3);
                                i4 = 0;
                            }
                            jMin--;
                            if (c13021aArr != this.f84632d.get()) {
                                break;
                            }
                        } catch (Throwable th) {
                            o75.throwIfFatal(th);
                            this.f84630b.get().cancel();
                            zifVar2.clear();
                            this.f84626C = true;
                            m22500e(th);
                            return;
                        }
                    }
                    if (m22497b(this.f84626C, zifVar2.isEmpty())) {
                        return;
                    }
                }
                this.f84628H = i4;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (zifVar2 == null) {
                    zifVar2 = this.f84634f;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m22499d(C13021a<T> inner) {
            C13021a<T>[] c13021aArr;
            C13021a[] c13021aArr2;
            do {
                c13021aArr = this.f84632d.get();
                int length = c13021aArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c13021aArr[i] == inner) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c13021aArr2 = f84624L;
                } else {
                    C13021a[] c13021aArr3 = new C13021a[length - 1];
                    System.arraycopy(c13021aArr, 0, c13021aArr3, 0, i);
                    System.arraycopy(c13021aArr, i + 1, c13021aArr3, i, (length - i) - 1);
                    c13021aArr2 = c13021aArr3;
                }
            } while (!v7b.m23844a(this.f84632d, c13021aArr, c13021aArr2));
        }

        @Override // p000.lf4
        public void dispose() {
            this.f84632d.getAndSet(f84625M);
            v7b.m23844a(this.f84629a, this, null);
            ldg.cancel(this.f84630b);
        }

        /* JADX INFO: renamed from: e */
        public void m22500e(Throwable ex) {
            for (C13021a<T> c13021a : this.f84632d.getAndSet(f84625M)) {
                if (!c13021a.isCancelled()) {
                    c13021a.f84621a.onError(ex);
                }
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f84632d.get() == f84625M;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f84626C = true;
            m22498c();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f84626C) {
                ofe.onError(t);
                return;
            }
            this.f84627F = t;
            this.f84626C = true;
            m22498c();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f84635m != 0 || this.f84634f.offer(t)) {
                m22498c();
            } else {
                onError(new bwa("Prefetch queue is full?!"));
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.setOnce(this.f84630b, s)) {
                if (s instanceof bod) {
                    bod bodVar = (bod) s;
                    int iRequestFusion = bodVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f84635m = iRequestFusion;
                        this.f84634f = bodVar;
                        this.f84626C = true;
                        m22498c();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f84635m = iRequestFusion;
                        this.f84634f = bodVar;
                        s.request(this.f84633e);
                        return;
                    }
                }
                this.f84634f = new ozf(this.f84633e);
                s.request(this.f84633e);
            }
        }
    }

    public tg6(zjd<T> source, int bufferSize) {
        this.f84618b = source;
        this.f84619c = bufferSize;
    }

    @Override // p000.mr2
    public void connect(uu2<? super lf4> connection) {
        C13022b<T> c13022b;
        while (true) {
            c13022b = this.f84620d.get();
            if (c13022b != null && !c13022b.isDisposed()) {
                break;
            }
            C13022b<T> c13022b2 = new C13022b<>(this.f84620d, this.f84619c);
            if (v7b.m23844a(this.f84620d, c13022b, c13022b2)) {
                c13022b = c13022b2;
                break;
            }
        }
        boolean z = false;
        if (!c13022b.f84631c.get() && c13022b.f84631c.compareAndSet(false, true)) {
            z = true;
        }
        try {
            connection.accept(c13022b);
            if (z) {
                this.f84618b.subscribe(c13022b);
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            throw k75.wrapOrThrow(th);
        }
    }

    @Override // p000.mr2
    public void reset() {
        C13022b<T> c13022b = this.f84620d.get();
        if (c13022b == null || !c13022b.isDisposed()) {
            return;
        }
        v7b.m23844a(this.f84620d, c13022b, null);
    }

    @Override // p000.dh7
    public zjd<T> source() {
        return this.f84618b;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        C13022b<T> c13022b;
        while (true) {
            c13022b = this.f84620d.get();
            if (c13022b != null) {
                break;
            }
            C13022b<T> c13022b2 = new C13022b<>(this.f84620d, this.f84619c);
            if (v7b.m23844a(this.f84620d, c13022b, c13022b2)) {
                c13022b = c13022b2;
                break;
            }
        }
        C13021a<T> c13021a = new C13021a<>(s, c13022b);
        s.onSubscribe(c13021a);
        if (c13022b.m22496a(c13021a)) {
            if (c13021a.isCancelled()) {
                c13022b.m22499d(c13021a);
                return;
            } else {
                c13022b.m22498c();
                return;
            }
        }
        Throwable th = c13022b.f84627F;
        if (th != null) {
            c13021a.f84621a.onError(th);
        } else {
            c13021a.f84621a.onComplete();
        }
    }
}
