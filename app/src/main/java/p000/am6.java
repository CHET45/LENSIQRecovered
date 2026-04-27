package p000;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class am6<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final zjd<? extends T>[] f2025b;

    /* JADX INFO: renamed from: c */
    public final Iterable<? extends zjd<? extends T>> f2026c;

    /* JADX INFO: renamed from: d */
    public final sy6<? super Object[], ? extends R> f2027d;

    /* JADX INFO: renamed from: e */
    public final int f2028e;

    /* JADX INFO: renamed from: f */
    public final boolean f2029f;

    /* JADX INFO: renamed from: am6$a */
    public static final class C0320a<T, R> extends AtomicInteger implements fdg {
        private static final long serialVersionUID = -2434867452883857743L;

        /* JADX INFO: renamed from: C */
        public final Object[] f2030C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f2031a;

        /* JADX INFO: renamed from: b */
        public final C0321b<T, R>[] f2032b;

        /* JADX INFO: renamed from: c */
        public final sy6<? super Object[], ? extends R> f2033c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f2034d;

        /* JADX INFO: renamed from: e */
        public final bc0 f2035e;

        /* JADX INFO: renamed from: f */
        public final boolean f2036f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f2037m;

        public C0320a(ycg<? super R> actual, sy6<? super Object[], ? extends R> zipper, int n, int prefetch, boolean delayErrors) {
            this.f2031a = actual;
            this.f2033c = zipper;
            this.f2036f = delayErrors;
            C0321b<T, R>[] c0321bArr = new C0321b[n];
            for (int i = 0; i < n; i++) {
                c0321bArr[i] = new C0321b<>(this, prefetch);
            }
            this.f2030C = new Object[n];
            this.f2032b = c0321bArr;
            this.f2034d = new AtomicLong();
            this.f2035e = new bc0();
        }

        /* JADX INFO: renamed from: a */
        public void m893a() {
            for (C0321b<T, R> c0321b : this.f2032b) {
                c0321b.cancel();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m894b() {
            T tPoll;
            T tPoll2;
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f2031a;
            C0321b<T, R>[] c0321bArr = this.f2032b;
            int length = c0321bArr.length;
            Object[] objArr = this.f2030C;
            int iAddAndGet = 1;
            do {
                long j = this.f2034d.get();
                long j2 = 0;
                while (j != j2) {
                    if (this.f2037m) {
                        return;
                    }
                    if (!this.f2036f && this.f2035e.get() != null) {
                        m893a();
                        this.f2035e.tryTerminateConsumer(ycgVar);
                        return;
                    }
                    boolean z = false;
                    for (int i = 0; i < length; i++) {
                        C0321b<T, R> c0321b = c0321bArr[i];
                        if (objArr[i] == null) {
                            boolean z2 = c0321b.f2043f;
                            zif<T> zifVar = c0321b.f2041d;
                            if (zifVar != null) {
                                try {
                                    tPoll2 = zifVar.poll();
                                } catch (Throwable th) {
                                    o75.throwIfFatal(th);
                                    this.f2035e.tryAddThrowableOrReport(th);
                                    if (!this.f2036f) {
                                        m893a();
                                        this.f2035e.tryTerminateConsumer(ycgVar);
                                        return;
                                    } else {
                                        tPoll2 = null;
                                        z2 = true;
                                    }
                                }
                            } else {
                                tPoll2 = null;
                            }
                            boolean z3 = tPoll2 == null;
                            if (z2 && z3) {
                                m893a();
                                this.f2035e.tryTerminateConsumer(ycgVar);
                                return;
                            } else if (z3) {
                                z = true;
                            } else {
                                objArr[i] = tPoll2;
                            }
                        }
                    }
                    if (z) {
                        break;
                    }
                    try {
                        R rApply = this.f2033c.apply(objArr.clone());
                        Objects.requireNonNull(rApply, "The zipper returned a null value");
                        ycgVar.onNext(rApply);
                        j2++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        m893a();
                        this.f2035e.tryAddThrowableOrReport(th2);
                        this.f2035e.tryTerminateConsumer(ycgVar);
                        return;
                    }
                }
                if (j == j2) {
                    if (this.f2037m) {
                        return;
                    }
                    if (!this.f2036f && this.f2035e.get() != null) {
                        m893a();
                        this.f2035e.tryTerminateConsumer(ycgVar);
                        return;
                    }
                    for (int i2 = 0; i2 < length; i2++) {
                        C0321b<T, R> c0321b2 = c0321bArr[i2];
                        if (objArr[i2] == null) {
                            boolean z4 = c0321b2.f2043f;
                            zif<T> zifVar2 = c0321b2.f2041d;
                            if (zifVar2 != null) {
                                try {
                                    tPoll = zifVar2.poll();
                                } catch (Throwable th3) {
                                    o75.throwIfFatal(th3);
                                    this.f2035e.tryAddThrowableOrReport(th3);
                                    if (!this.f2036f) {
                                        m893a();
                                        this.f2035e.tryTerminateConsumer(ycgVar);
                                        return;
                                    } else {
                                        tPoll = null;
                                        z4 = true;
                                    }
                                }
                            } else {
                                tPoll = null;
                            }
                            boolean z5 = tPoll == null;
                            if (z4 && z5) {
                                m893a();
                                this.f2035e.tryTerminateConsumer(ycgVar);
                                return;
                            } else if (!z5) {
                                objArr[i2] = tPoll;
                            }
                        }
                    }
                }
                if (j2 != 0) {
                    for (C0321b<T, R> c0321b3 : c0321bArr) {
                        c0321b3.request(j2);
                    }
                    if (j != Long.MAX_VALUE) {
                        this.f2034d.addAndGet(-j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        /* JADX INFO: renamed from: c */
        public void m895c(C0321b<T, R> inner, Throwable e) {
            if (this.f2035e.tryAddThrowableOrReport(e)) {
                inner.f2043f = true;
                m894b();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f2037m) {
                return;
            }
            this.f2037m = true;
            m893a();
        }

        /* JADX INFO: renamed from: d */
        public void m896d(zjd<? extends T>[] sources, int n) {
            C0321b<T, R>[] c0321bArr = this.f2032b;
            for (int i = 0; i < n && !this.f2037m; i++) {
                if (!this.f2036f && this.f2035e.get() != null) {
                    return;
                }
                sources[i].subscribe(c0321bArr[i]);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f2034d, n);
                m894b();
            }
        }
    }

    /* JADX INFO: renamed from: am6$b */
    public static final class C0321b<T, R> extends AtomicReference<fdg> implements kj6<T>, fdg {
        private static final long serialVersionUID = -4627193790118206028L;

        /* JADX INFO: renamed from: a */
        public final C0320a<T, R> f2038a;

        /* JADX INFO: renamed from: b */
        public final int f2039b;

        /* JADX INFO: renamed from: c */
        public final int f2040c;

        /* JADX INFO: renamed from: d */
        public zif<T> f2041d;

        /* JADX INFO: renamed from: e */
        public long f2042e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f2043f;

        /* JADX INFO: renamed from: m */
        public int f2044m;

        public C0321b(C0320a<T, R> parent, int prefetch) {
            this.f2038a = parent;
            this.f2039b = prefetch;
            this.f2040c = prefetch - (prefetch >> 2);
        }

        @Override // p000.fdg
        public void cancel() {
            ldg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f2043f = true;
            this.f2038a.m894b();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f2038a.m895c(this, t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f2044m != 2) {
                this.f2041d.offer(t);
            }
            this.f2038a.m894b();
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.setOnce(this, s)) {
                if (s instanceof bod) {
                    bod bodVar = (bod) s;
                    int iRequestFusion = bodVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f2044m = iRequestFusion;
                        this.f2041d = bodVar;
                        this.f2043f = true;
                        this.f2038a.m894b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f2044m = iRequestFusion;
                        this.f2041d = bodVar;
                        s.request(this.f2039b);
                        return;
                    }
                }
                this.f2041d = new ozf(this.f2039b);
                s.request(this.f2039b);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (this.f2044m != 1) {
                long j = this.f2042e + n;
                if (j < this.f2040c) {
                    this.f2042e = j;
                } else {
                    this.f2042e = 0L;
                    get().request(j);
                }
            }
        }
    }

    public am6(zjd<? extends T>[] sources, Iterable<? extends zjd<? extends T>> sourcesIterable, sy6<? super Object[], ? extends R> zipper, int bufferSize, boolean delayError) {
        this.f2025b = sources;
        this.f2026c = sourcesIterable;
        this.f2027d = zipper;
        this.f2028e = bufferSize;
        this.f2029f = delayError;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        int length;
        zjd<? extends T>[] zjdVarArr = this.f2025b;
        if (zjdVarArr == null) {
            zjdVarArr = new zjd[8];
            length = 0;
            for (zjd<? extends T> zjdVar : this.f2026c) {
                if (length == zjdVarArr.length) {
                    zjd<? extends T>[] zjdVarArr2 = new zjd[(length >> 2) + length];
                    System.arraycopy(zjdVarArr, 0, zjdVarArr2, 0, length);
                    zjdVarArr = zjdVarArr2;
                }
                zjdVarArr[length] = zjdVar;
                length++;
            }
        } else {
            length = zjdVarArr.length;
        }
        int i = length;
        if (i == 0) {
            w05.complete(s);
            return;
        }
        C0320a c0320a = new C0320a(s, this.f2027d, i, this.f2028e, this.f2029f);
        s.onSubscribe(c0320a);
        c0320a.m896d(zjdVarArr, i);
    }
}
