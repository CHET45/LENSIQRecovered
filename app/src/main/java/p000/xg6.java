package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class xg6<T, R> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super l86<T>, ? extends zjd<? extends R>> f97694c;

    /* JADX INFO: renamed from: d */
    public final int f97695d;

    /* JADX INFO: renamed from: e */
    public final boolean f97696e;

    /* JADX INFO: renamed from: xg6$a */
    public static final class C15052a<T> extends l86<T> implements kj6<T> {

        /* JADX INFO: renamed from: N */
        public static final C15053b[] f97697N = new C15053b[0];

        /* JADX INFO: renamed from: Q */
        public static final C15053b[] f97698Q = new C15053b[0];

        /* JADX INFO: renamed from: C */
        public volatile zif<T> f97699C;

        /* JADX INFO: renamed from: F */
        public int f97700F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f97701H;

        /* JADX INFO: renamed from: L */
        public Throwable f97702L;

        /* JADX INFO: renamed from: M */
        public int f97703M;

        /* JADX INFO: renamed from: d */
        public final int f97706d;

        /* JADX INFO: renamed from: e */
        public final int f97707e;

        /* JADX INFO: renamed from: f */
        public final boolean f97708f;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f97704b = new AtomicInteger();

        /* JADX INFO: renamed from: m */
        public final AtomicReference<fdg> f97709m = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<C15053b<T>[]> f97705c = new AtomicReference<>(f97697N);

        public C15052a(int prefetch, boolean delayError) {
            this.f97706d = prefetch;
            this.f97707e = prefetch - (prefetch >> 2);
            this.f97708f = delayError;
        }

        /* JADX INFO: renamed from: b */
        public boolean m25121b(C15053b<T> s) {
            C15053b<T>[] c15053bArr;
            C15053b[] c15053bArr2;
            do {
                c15053bArr = this.f97705c.get();
                if (c15053bArr == f97698Q) {
                    return false;
                }
                int length = c15053bArr.length;
                c15053bArr2 = new C15053b[length + 1];
                System.arraycopy(c15053bArr, 0, c15053bArr2, 0, length);
                c15053bArr2[length] = s;
            } while (!v7b.m23844a(this.f97705c, c15053bArr, c15053bArr2));
            return true;
        }

        /* JADX INFO: renamed from: c */
        public void m25122c() {
            for (C15053b<T> c15053b : this.f97705c.getAndSet(f97698Q)) {
                if (c15053b.get() != Long.MIN_VALUE) {
                    c15053b.f97710a.onComplete();
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m25123d() {
            AtomicReference<C15053b<T>[]> atomicReference;
            Throwable th;
            Throwable th2;
            if (this.f97704b.getAndIncrement() != 0) {
                return;
            }
            zif<T> zifVar = this.f97699C;
            int i = this.f97703M;
            int i2 = this.f97707e;
            boolean z = this.f97700F != 1;
            AtomicReference<C15053b<T>[]> atomicReference2 = this.f97705c;
            C15053b<T>[] c15053bArr = atomicReference2.get();
            int iAddAndGet = 1;
            while (true) {
                int length = c15053bArr.length;
                if (zifVar == null || length == 0) {
                    atomicReference = atomicReference2;
                } else {
                    int length2 = c15053bArr.length;
                    long j = Long.MAX_VALUE;
                    long j2 = Long.MAX_VALUE;
                    int i3 = 0;
                    while (i3 < length2) {
                        C15053b<T> c15053b = c15053bArr[i3];
                        AtomicReference<C15053b<T>[]> atomicReference3 = atomicReference2;
                        long j3 = c15053b.get() - c15053b.f97712c;
                        if (j3 == Long.MIN_VALUE) {
                            length--;
                        } else if (j2 > j3) {
                            j2 = j3;
                        }
                        i3++;
                        atomicReference2 = atomicReference3;
                    }
                    atomicReference = atomicReference2;
                    long j4 = 0;
                    if (length == 0) {
                        j2 = 0;
                    }
                    while (j2 != j4) {
                        if (isDisposed()) {
                            zifVar.clear();
                            return;
                        }
                        boolean z2 = this.f97701H;
                        if (z2 && !this.f97708f && (th2 = this.f97702L) != null) {
                            m25124e(th2);
                            return;
                        }
                        try {
                            T tPoll = zifVar.poll();
                            boolean z3 = tPoll == null;
                            if (z2 && z3) {
                                Throwable th3 = this.f97702L;
                                if (th3 != null) {
                                    m25124e(th3);
                                    return;
                                } else {
                                    m25122c();
                                    return;
                                }
                            }
                            if (z3) {
                                break;
                            }
                            int length3 = c15053bArr.length;
                            int i4 = 0;
                            boolean z4 = false;
                            while (i4 < length3) {
                                C15053b<T> c15053b2 = c15053bArr[i4];
                                long j5 = c15053b2.get();
                                if (j5 != Long.MIN_VALUE) {
                                    if (j5 != j) {
                                        c15053b2.f97712c++;
                                    }
                                    c15053b2.f97710a.onNext(tPoll);
                                } else {
                                    z4 = true;
                                }
                                i4++;
                                j = Long.MAX_VALUE;
                            }
                            j2--;
                            if (z && (i = i + 1) == i2) {
                                this.f97709m.get().request(i2);
                                i = 0;
                            }
                            C15053b<T>[] c15053bArr2 = atomicReference.get();
                            if (z4 || c15053bArr2 != c15053bArr) {
                                c15053bArr = c15053bArr2;
                                break;
                            } else {
                                j4 = 0;
                                j = Long.MAX_VALUE;
                            }
                        } catch (Throwable th4) {
                            o75.throwIfFatal(th4);
                            ldg.cancel(this.f97709m);
                            m25124e(th4);
                            return;
                        }
                    }
                    if (j2 == j4) {
                        if (isDisposed()) {
                            zifVar.clear();
                            return;
                        }
                        boolean z5 = this.f97701H;
                        if (z5 && !this.f97708f && (th = this.f97702L) != null) {
                            m25124e(th);
                            return;
                        }
                        if (z5 && zifVar.isEmpty()) {
                            Throwable th5 = this.f97702L;
                            if (th5 != null) {
                                m25124e(th5);
                                return;
                            } else {
                                m25122c();
                                return;
                            }
                        }
                    }
                }
                this.f97703M = i;
                iAddAndGet = this.f97704b.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (zifVar == null) {
                    zifVar = this.f97699C;
                }
                c15053bArr = atomicReference.get();
                atomicReference2 = atomicReference;
            }
        }

        public void dispose() {
            zif<T> zifVar;
            if (this.f97701H) {
                return;
            }
            ldg.cancel(this.f97709m);
            if (this.f97704b.getAndIncrement() != 0 || (zifVar = this.f97699C) == null) {
                return;
            }
            zifVar.clear();
        }

        /* JADX INFO: renamed from: e */
        public void m25124e(Throwable ex) {
            for (C15053b<T> c15053b : this.f97705c.getAndSet(f97698Q)) {
                if (c15053b.get() != Long.MIN_VALUE) {
                    c15053b.f97710a.onError(ex);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m25125f(C15053b<T> s) {
            C15053b<T>[] c15053bArr;
            C15053b[] c15053bArr2;
            do {
                c15053bArr = this.f97705c.get();
                int length = c15053bArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c15053bArr[i] == s) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c15053bArr2 = f97697N;
                } else {
                    C15053b[] c15053bArr3 = new C15053b[length - 1];
                    System.arraycopy(c15053bArr, 0, c15053bArr3, 0, i);
                    System.arraycopy(c15053bArr, i + 1, c15053bArr3, i, (length - i) - 1);
                    c15053bArr2 = c15053bArr3;
                }
            } while (!v7b.m23844a(this.f97705c, c15053bArr, c15053bArr2));
        }

        public boolean isDisposed() {
            return this.f97709m.get() == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f97701H) {
                return;
            }
            this.f97701H = true;
            m25123d();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f97701H) {
                ofe.onError(t);
                return;
            }
            this.f97702L = t;
            this.f97701H = true;
            m25123d();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f97701H) {
                return;
            }
            if (this.f97700F != 0 || this.f97699C.offer(t)) {
                m25123d();
            } else {
                this.f97709m.get().cancel();
                onError(new bwa());
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.setOnce(this.f97709m, s)) {
                if (s instanceof bod) {
                    bod bodVar = (bod) s;
                    int iRequestFusion = bodVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f97700F = iRequestFusion;
                        this.f97699C = bodVar;
                        this.f97701H = true;
                        m25123d();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f97700F = iRequestFusion;
                        this.f97699C = bodVar;
                        xmd.request(s, this.f97706d);
                        return;
                    }
                }
                this.f97699C = xmd.createQueue(this.f97706d);
                xmd.request(s, this.f97706d);
            }
        }

        @Override // p000.l86
        public void subscribeActual(ycg<? super T> s) {
            C15053b<T> c15053b = new C15053b<>(s, this);
            s.onSubscribe(c15053b);
            if (m25121b(c15053b)) {
                if (c15053b.isCancelled()) {
                    m25125f(c15053b);
                    return;
                } else {
                    m25123d();
                    return;
                }
            }
            Throwable th = this.f97702L;
            if (th != null) {
                s.onError(th);
            } else {
                s.onComplete();
            }
        }
    }

    /* JADX INFO: renamed from: xg6$b */
    public static final class C15053b<T> extends AtomicLong implements fdg {
        private static final long serialVersionUID = 8664815189257569791L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f97710a;

        /* JADX INFO: renamed from: b */
        public final C15052a<T> f97711b;

        /* JADX INFO: renamed from: c */
        public long f97712c;

        public C15053b(ycg<? super T> actual, C15052a<T> parent) {
            this.f97710a = actual;
            this.f97711b = parent;
        }

        @Override // p000.fdg
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f97711b.m25125f(this);
                this.f97711b.m25123d();
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.addCancel(this, n);
                this.f97711b.m25123d();
            }
        }
    }

    /* JADX INFO: renamed from: xg6$c */
    public static final class C15054c<R> implements kj6<R>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f97713a;

        /* JADX INFO: renamed from: b */
        public final C15052a<?> f97714b;

        /* JADX INFO: renamed from: c */
        public fdg f97715c;

        public C15054c(ycg<? super R> actual, C15052a<?> processor) {
            this.f97713a = actual;
            this.f97714b = processor;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f97715c.cancel();
            this.f97714b.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f97713a.onComplete();
            this.f97714b.dispose();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f97713a.onError(t);
            this.f97714b.dispose();
        }

        @Override // p000.ycg
        public void onNext(R t) {
            this.f97713a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f97715c, s)) {
                this.f97715c = s;
                this.f97713a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f97715c.request(n);
        }
    }

    public xg6(l86<T> source, sy6<? super l86<T>, ? extends zjd<? extends R>> selector, int prefetch, boolean delayError) {
        super(source);
        this.f97694c = selector;
        this.f97695d = prefetch;
        this.f97696e = delayError;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        C15052a c15052a = new C15052a(this.f97695d, this.f97696e);
        try {
            zjd<? extends R> zjdVarApply = this.f97694c.apply(c15052a);
            Objects.requireNonNull(zjdVarApply, "selector returned a null Publisher");
            zjdVarApply.subscribe(new C15054c(s, c15052a));
            this.f49321b.subscribe((kj6) c15052a);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, s);
        }
    }
}
