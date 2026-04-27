package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class pj6<T, R> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends zjd<? extends R>> f71081c;

    /* JADX INFO: renamed from: d */
    public final int f71082d;

    /* JADX INFO: renamed from: e */
    public final boolean f71083e;

    /* JADX INFO: renamed from: pj6$a */
    public static final class C10986a<T, R> extends AtomicReference<fdg> implements kj6<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* JADX INFO: renamed from: a */
        public final C10987b<T, R> f71084a;

        /* JADX INFO: renamed from: b */
        public final long f71085b;

        /* JADX INFO: renamed from: c */
        public final int f71086c;

        /* JADX INFO: renamed from: d */
        public volatile zif<R> f71087d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f71088e;

        /* JADX INFO: renamed from: f */
        public int f71089f;

        public C10986a(C10987b<T, R> parent, long index, int bufferSize) {
            this.f71084a = parent;
            this.f71085b = index;
            this.f71086c = bufferSize;
        }

        public void cancel() {
            ldg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() throws Throwable {
            C10987b<T, R> c10987b = this.f71084a;
            if (this.f71085b == c10987b.f71094L) {
                this.f71088e = true;
                c10987b.m19530b();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) throws Throwable {
            C10987b<T, R> c10987b = this.f71084a;
            if (this.f71085b != c10987b.f71094L || !c10987b.f71100f.tryAddThrowable(t)) {
                ofe.onError(t);
                return;
            }
            if (!c10987b.f71098d) {
                c10987b.f71091C.cancel();
                c10987b.f71099e = true;
            }
            this.f71088e = true;
            c10987b.m19530b();
        }

        @Override // p000.ycg
        public void onNext(R t) throws Throwable {
            C10987b<T, R> c10987b = this.f71084a;
            if (this.f71085b == c10987b.f71094L) {
                if (this.f71089f != 0 || this.f71087d.offer(t)) {
                    c10987b.m19530b();
                } else {
                    onError(new bwa("Queue full?!"));
                }
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) throws Throwable {
            if (ldg.setOnce(this, s)) {
                if (s instanceof bod) {
                    bod bodVar = (bod) s;
                    int iRequestFusion = bodVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f71089f = iRequestFusion;
                        this.f71087d = bodVar;
                        this.f71088e = true;
                        this.f71084a.m19530b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f71089f = iRequestFusion;
                        this.f71087d = bodVar;
                        s.request(this.f71086c);
                        return;
                    }
                }
                this.f71087d = new ozf(this.f71086c);
                s.request(this.f71086c);
            }
        }

        public void request(long n) {
            if (this.f71089f != 1) {
                get().request(n);
            }
        }
    }

    /* JADX INFO: renamed from: pj6$b */
    public static final class C10987b<T, R> extends AtomicInteger implements kj6<T>, fdg {

        /* JADX INFO: renamed from: M */
        public static final C10986a<Object, Object> f71090M;
        private static final long serialVersionUID = -3491074160481096299L;

        /* JADX INFO: renamed from: C */
        public fdg f71091C;

        /* JADX INFO: renamed from: L */
        public volatile long f71094L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f71095a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends zjd<? extends R>> f71096b;

        /* JADX INFO: renamed from: c */
        public final int f71097c;

        /* JADX INFO: renamed from: d */
        public final boolean f71098d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f71099e;

        /* JADX INFO: renamed from: m */
        public volatile boolean f71101m;

        /* JADX INFO: renamed from: F */
        public final AtomicReference<C10986a<T, R>> f71092F = new AtomicReference<>();

        /* JADX INFO: renamed from: H */
        public final AtomicLong f71093H = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final bc0 f71100f = new bc0();

        static {
            C10986a<Object, Object> c10986a = new C10986a<>(null, -1L, 1);
            f71090M = c10986a;
            c10986a.cancel();
        }

        public C10987b(ycg<? super R> actual, sy6<? super T, ? extends zjd<? extends R>> mapper, int bufferSize, boolean delayErrors) {
            this.f71095a = actual;
            this.f71096b = mapper;
            this.f71097c = bufferSize;
            this.f71098d = delayErrors;
        }

        /* JADX INFO: renamed from: a */
        public void m19529a() {
            AtomicReference<C10986a<T, R>> atomicReference = this.f71092F;
            C10986a<Object, Object> c10986a = f71090M;
            C10986a<T, R> andSet = atomicReference.getAndSet((C10986a<T, R>) c10986a);
            if (andSet == c10986a || andSet == null) {
                return;
            }
            andSet.cancel();
        }

        /* JADX INFO: renamed from: b */
        public void m19530b() throws Throwable {
            boolean z;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f71095a;
            int iAddAndGet = 1;
            while (!this.f71101m) {
                if (this.f71099e) {
                    if (this.f71098d) {
                        if (this.f71092F.get() == null) {
                            this.f71100f.tryTerminateConsumer(ycgVar);
                            return;
                        }
                    } else if (this.f71100f.get() != null) {
                        m19529a();
                        this.f71100f.tryTerminateConsumer(ycgVar);
                        return;
                    } else if (this.f71092F.get() == null) {
                        ycgVar.onComplete();
                        return;
                    }
                }
                C10986a<T, R> c10986a = this.f71092F.get();
                zif<R> zifVar = c10986a != null ? c10986a.f71087d : null;
                if (zifVar != null) {
                    long j = this.f71093H.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (!this.f71101m) {
                            boolean z2 = c10986a.f71088e;
                            try {
                                objPoll = zifVar.poll();
                            } catch (Throwable th) {
                                o75.throwIfFatal(th);
                                c10986a.cancel();
                                this.f71100f.tryAddThrowableOrReport(th);
                                objPoll = null;
                                z2 = true;
                            }
                            boolean z3 = objPoll == null;
                            if (c10986a == this.f71092F.get()) {
                                if (z2) {
                                    if (this.f71098d) {
                                        if (z3) {
                                            v7b.m23844a(this.f71092F, c10986a, null);
                                        }
                                    } else if (this.f71100f.get() != null) {
                                        this.f71100f.tryTerminateConsumer(ycgVar);
                                        return;
                                    } else if (z3) {
                                        v7b.m23844a(this.f71092F, c10986a, null);
                                    }
                                }
                                if (z3) {
                                    break;
                                }
                                ycgVar.onNext(objPoll);
                                j2++;
                            }
                            z = true;
                            break;
                        }
                        return;
                    }
                    z = false;
                    if (j2 == j && c10986a.f71088e) {
                        if (this.f71098d) {
                            if (zifVar.isEmpty()) {
                                v7b.m23844a(this.f71092F, c10986a, null);
                            }
                        } else if (this.f71100f.get() != null) {
                            m19529a();
                            this.f71100f.tryTerminateConsumer(ycgVar);
                            return;
                        } else if (zifVar.isEmpty()) {
                            v7b.m23844a(this.f71092F, c10986a, null);
                        }
                    }
                    if (j2 != 0 && !this.f71101m) {
                        if (j != Long.MAX_VALUE) {
                            this.f71093H.addAndGet(-j2);
                        }
                        c10986a.request(j2);
                    }
                    if (z) {
                        continue;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f71101m) {
                return;
            }
            this.f71101m = true;
            this.f71091C.cancel();
            m19529a();
            this.f71100f.tryTerminateAndReport();
        }

        @Override // p000.ycg
        public void onComplete() throws Throwable {
            if (this.f71099e) {
                return;
            }
            this.f71099e = true;
            m19530b();
        }

        @Override // p000.ycg
        public void onError(Throwable t) throws Throwable {
            if (this.f71099e || !this.f71100f.tryAddThrowable(t)) {
                ofe.onError(t);
                return;
            }
            if (!this.f71098d) {
                m19529a();
            }
            this.f71099e = true;
            m19530b();
        }

        @Override // p000.ycg
        public void onNext(T t) throws Throwable {
            C10986a<T, R> c10986a;
            if (this.f71099e) {
                return;
            }
            long j = this.f71094L + 1;
            this.f71094L = j;
            C10986a<T, R> c10986a2 = this.f71092F.get();
            if (c10986a2 != null) {
                c10986a2.cancel();
            }
            try {
                zjd<? extends R> zjdVarApply = this.f71096b.apply(t);
                Objects.requireNonNull(zjdVarApply, "The publisher returned is null");
                zjd<? extends R> zjdVar = zjdVarApply;
                C10986a c10986a3 = new C10986a(this, j, this.f71097c);
                do {
                    c10986a = this.f71092F.get();
                    if (c10986a == f71090M) {
                        return;
                    }
                } while (!v7b.m23844a(this.f71092F, c10986a, c10986a3));
                zjdVar.subscribe(c10986a3);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f71091C.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f71091C, s)) {
                this.f71091C = s;
                this.f71095a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) throws Throwable {
            if (ldg.validate(n)) {
                ro0.add(this.f71093H, n);
                if (this.f71094L == 0) {
                    this.f71091C.request(Long.MAX_VALUE);
                } else {
                    m19530b();
                }
            }
        }
    }

    public pj6(l86<T> source, sy6<? super T, ? extends zjd<? extends R>> mapper, int bufferSize, boolean delayErrors) {
        super(source);
        this.f71081c = mapper;
        this.f71082d = bufferSize;
        this.f71083e = delayErrors;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        if (fi6.tryScalarXMapSubscribe(this.f49321b, s, this.f71081c)) {
            return;
        }
        this.f49321b.subscribe((kj6) new C10987b(s, this.f71081c, this.f71082d, this.f71083e));
    }
}
