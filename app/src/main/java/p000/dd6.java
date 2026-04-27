package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes7.dex */
public final class dd6<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final l86<T> f29382b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends Stream<? extends R>> f29383c;

    /* JADX INFO: renamed from: d */
    public final int f29384d;

    /* JADX INFO: renamed from: dd6$a */
    public static final class C4748a<T, R> extends AtomicInteger implements kj6<T>, fdg {
        private static final long serialVersionUID = -5127032662980523968L;

        /* JADX INFO: renamed from: C */
        public AutoCloseable f29385C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f29386F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f29387H;

        /* JADX INFO: renamed from: M */
        public long f29389M;

        /* JADX INFO: renamed from: N */
        public int f29390N;

        /* JADX INFO: renamed from: Q */
        public int f29391Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f29392a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends Stream<? extends R>> f29393b;

        /* JADX INFO: renamed from: c */
        public final int f29394c;

        /* JADX INFO: renamed from: e */
        public zif<T> f29396e;

        /* JADX INFO: renamed from: f */
        public fdg f29397f;

        /* JADX INFO: renamed from: m */
        public Iterator<? extends R> f29398m;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f29395d = new AtomicLong();

        /* JADX INFO: renamed from: L */
        public final bc0 f29388L = new bc0();

        public C4748a(ycg<? super R> downstream, sy6<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
            this.f29392a = downstream;
            this.f29393b = mapper;
            this.f29394c = prefetch;
        }

        /* JADX INFO: renamed from: a */
        public void m9079a() throws Exception {
            this.f29398m = null;
            AutoCloseable autoCloseable = this.f29385C;
            this.f29385C = null;
            if (autoCloseable != null) {
                autoCloseable.close();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m9080b() {
            try {
                m9079a();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r16v0 */
        /* JADX WARN: Type inference failed for: r16v1 */
        /* JADX WARN: Type inference failed for: r16v2 */
        /* JADX INFO: renamed from: c */
        public void m9081c() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f29392a;
            zif<T> zifVar = this.f29396e;
            bc0 bc0Var = this.f29388L;
            Iterator<? extends R> it = this.f29398m;
            long j = this.f29395d.get();
            long j2 = this.f29389M;
            int i = this.f29394c;
            int i2 = i - (i >> 2);
            int i3 = 0;
            ?? r12 = 1;
            boolean z = this.f29391Q != 1;
            long j3 = j2;
            int iAddAndGet = 1;
            long j4 = j;
            Iterator<? extends R> it2 = it;
            while (true) {
                if (this.f29386F) {
                    zifVar.clear();
                    m9080b();
                } else {
                    boolean z2 = this.f29387H;
                    if (bc0Var.get() != null) {
                        ycgVar.onError(bc0Var.get());
                        this.f29386F = r12;
                    } else if (it2 == null) {
                        try {
                            T tPoll = zifVar.poll();
                            ?? r16 = tPoll == null ? r12 : i3;
                            if (z2 && r16 != 0) {
                                ycgVar.onComplete();
                                this.f29386F = r12;
                            } else if (r16 == 0) {
                                if (z) {
                                    int i4 = this.f29390N + r12;
                                    this.f29390N = i4;
                                    if (i4 == i2) {
                                        this.f29390N = i3;
                                        this.f29397f.request(i2);
                                    }
                                }
                                try {
                                    Stream<? extends R> streamApply = this.f29393b.apply(tPoll);
                                    Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                                    Stream<? extends R> stream = streamApply;
                                    it2 = stream.iterator();
                                    if (it2.hasNext()) {
                                        this.f29398m = it2;
                                        this.f29385C = stream;
                                    } else {
                                        it2 = null;
                                    }
                                } catch (Throwable th) {
                                    o75.throwIfFatal(th);
                                    m9082d(ycgVar, th);
                                }
                            }
                            if (it2 == null && j3 != j4) {
                                try {
                                    Object obj = (R) it2.next();
                                    Objects.requireNonNull(obj, "The Stream.Iterator returned a null value");
                                    if (!this.f29386F) {
                                        ycgVar.onNext(obj);
                                        j3++;
                                        if (!this.f29386F) {
                                            try {
                                                if (!it2.hasNext()) {
                                                    try {
                                                        m9079a();
                                                        it2 = null;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        it2 = null;
                                                        o75.throwIfFatal(th);
                                                        m9082d(ycgVar, th);
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
                                    o75.throwIfFatal(th4);
                                    m9082d(ycgVar, th4);
                                }
                            }
                        } catch (Throwable th5) {
                            o75.throwIfFatal(th5);
                            m9082d(ycgVar, th5);
                        }
                    } else if (it2 == null) {
                    }
                    i3 = 0;
                    r12 = 1;
                }
                this.f29389M = j3;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                j4 = this.f29395d.get();
                i3 = 0;
                r12 = 1;
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f29386F = true;
            this.f29397f.cancel();
            m9081c();
        }

        /* JADX INFO: renamed from: d */
        public void m9082d(ycg<?> downstream, Throwable ex) {
            if (!this.f29388L.compareAndSet(null, ex)) {
                ofe.onError(ex);
                return;
            }
            this.f29397f.cancel();
            this.f29386F = true;
            downstream.onError(ex);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f29387H = true;
            m9081c();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (!this.f29388L.compareAndSet(null, t)) {
                ofe.onError(t);
            } else {
                this.f29387H = true;
                m9081c();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f29391Q == 2 || this.f29396e.offer(t)) {
                m9081c();
            } else {
                this.f29397f.cancel();
                onError(new bwa("Queue full?!"));
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(@cfb fdg s) {
            if (ldg.validate(this.f29397f, s)) {
                this.f29397f = s;
                if (s instanceof bod) {
                    bod bodVar = (bod) s;
                    int iRequestFusion = bodVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f29391Q = iRequestFusion;
                        this.f29396e = bodVar;
                        this.f29387H = true;
                        this.f29392a.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f29391Q = iRequestFusion;
                        this.f29396e = bodVar;
                        this.f29392a.onSubscribe(this);
                        s.request(this.f29394c);
                        return;
                    }
                }
                this.f29396e = new ozf(this.f29394c);
                this.f29392a.onSubscribe(this);
                s.request(this.f29394c);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f29395d, n);
                m9081c();
            }
        }
    }

    public dd6(l86<T> source, sy6<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
        this.f29382b = source;
        this.f29383c = mapper;
        this.f29384d = prefetch;
    }

    public static <T, R> ycg<T> subscribe(ycg<? super R> downstream, sy6<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
        return new C4748a(downstream, mapper, prefetch);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p000.l86
    public void subscribeActual(ycg<? super R> ycgVar) {
        Stream<? extends R> stream;
        l86<T> l86Var = this.f29382b;
        if (!(l86Var instanceof nfg)) {
            l86Var.subscribe(subscribe(ycgVar, this.f29383c, this.f29384d));
            return;
        }
        try {
            Object obj = ((nfg) l86Var).get();
            if (obj != null) {
                Stream<? extends R> streamApply = this.f29383c.apply(obj);
                Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                stream = streamApply;
            } else {
                stream = null;
            }
            if (stream != null) {
                wd6.subscribeStream(ycgVar, stream);
            } else {
                w05.complete(ycgVar);
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, ycgVar);
        }
    }
}
