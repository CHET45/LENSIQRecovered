package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class ba6<T, R> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends zjd<? extends R>> f13141c;

    /* JADX INFO: renamed from: d */
    public final int f13142d;

    /* JADX INFO: renamed from: e */
    public final int f13143e;

    /* JADX INFO: renamed from: f */
    public final e55 f13144f;

    /* JADX INFO: renamed from: ba6$a */
    public static final class C1804a<T, R> extends AtomicInteger implements kj6<T>, fdg, i38<R> {
        private static final long serialVersionUID = -4255299542215038287L;

        /* JADX INFO: renamed from: C */
        public final qzf<g38<R>> f13145C;

        /* JADX INFO: renamed from: F */
        public fdg f13146F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f13147H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f13148L;

        /* JADX INFO: renamed from: M */
        public volatile g38<R> f13149M;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f13150a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends zjd<? extends R>> f13151b;

        /* JADX INFO: renamed from: c */
        public final int f13152c;

        /* JADX INFO: renamed from: d */
        public final int f13153d;

        /* JADX INFO: renamed from: e */
        public final e55 f13154e;

        /* JADX INFO: renamed from: f */
        public final bc0 f13155f = new bc0();

        /* JADX INFO: renamed from: m */
        public final AtomicLong f13156m = new AtomicLong();

        public C1804a(ycg<? super R> actual, sy6<? super T, ? extends zjd<? extends R>> mapper, int maxConcurrency, int prefetch, e55 errorMode) {
            this.f13150a = actual;
            this.f13151b = mapper;
            this.f13152c = maxConcurrency;
            this.f13153d = prefetch;
            this.f13154e = errorMode;
            this.f13145C = new qzf<>(Math.min(prefetch, maxConcurrency));
        }

        /* JADX INFO: renamed from: a */
        public void m3018a() {
            g38<R> g38Var = this.f13149M;
            this.f13149M = null;
            if (g38Var != null) {
                g38Var.cancel();
            }
            while (true) {
                g38<R> g38VarPoll = this.f13145C.poll();
                if (g38VarPoll == null) {
                    return;
                } else {
                    g38VarPoll.cancel();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m3019b() {
            if (getAndIncrement() == 0) {
                do {
                    m3018a();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f13147H) {
                return;
            }
            this.f13147H = true;
            this.f13146F.cancel();
            this.f13155f.tryTerminateAndReport();
            m3019b();
        }

        /* JADX WARN: Code restructure failed: missing block: B:52:0x00bf, code lost:
        
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
        
            if (r12 != r6) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00c4, code lost:
        
            if (r17.f13147H == false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        
            m3018a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00c9, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00cc, code lost:
        
            if (r3 != p000.e55.IMMEDIATE) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00d6, code lost:
        
            if (r17.f13155f.get() == null) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00d8, code lost:
        
            r17.f13149M = null;
            r8.cancel();
            m3018a();
            r17.f13155f.tryTerminateConsumer(r17.f13150a);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00e7, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00e8, code lost:
        
            r9 = r8.isDone();
            r10 = r11.isEmpty();
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00f0, code lost:
        
            if (r9 == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00f2, code lost:
        
            if (r10 == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00f4, code lost:
        
            r17.f13149M = null;
            r17.f13146F.request(1);
            r8 = null;
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00fd, code lost:
        
            r4 = 0;
         */
        @Override // p000.i38
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drain() {
            /*
                Method dump skipped, instruction units count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ba6.C1804a.drain():void");
        }

        @Override // p000.i38
        public void innerComplete(g38<R> inner) {
            inner.setDone();
            drain();
        }

        @Override // p000.i38
        public void innerError(g38<R> inner, Throwable e) {
            if (this.f13155f.tryAddThrowableOrReport(e)) {
                inner.setDone();
                if (this.f13154e != e55.END) {
                    this.f13146F.cancel();
                }
                drain();
            }
        }

        @Override // p000.i38
        public void innerNext(g38<R> inner, R value) {
            if (inner.queue().offer(value)) {
                drain();
            } else {
                inner.cancel();
                innerError(inner, new bwa());
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f13148L = true;
            drain();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f13155f.tryAddThrowableOrReport(t)) {
                this.f13148L = true;
                drain();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            try {
                zjd<? extends R> zjdVarApply = this.f13151b.apply(t);
                Objects.requireNonNull(zjdVarApply, "The mapper returned a null Publisher");
                zjd<? extends R> zjdVar = zjdVarApply;
                g38<R> g38Var = new g38<>(this, this.f13153d);
                if (this.f13147H) {
                    return;
                }
                this.f13145C.offer(g38Var);
                zjdVar.subscribe(g38Var);
                if (this.f13147H) {
                    g38Var.cancel();
                    m3019b();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f13146F.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f13146F, s)) {
                this.f13146F = s;
                this.f13150a.onSubscribe(this);
                int i = this.f13152c;
                s.request(i == Integer.MAX_VALUE ? Long.MAX_VALUE : i);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f13156m, n);
                drain();
            }
        }
    }

    public ba6(l86<T> source, sy6<? super T, ? extends zjd<? extends R>> mapper, int maxConcurrency, int prefetch, e55 errorMode) {
        super(source);
        this.f13141c = mapper;
        this.f13142d = maxConcurrency;
        this.f13143e = prefetch;
        this.f13144f = errorMode;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f49321b.subscribe((kj6) new C1804a(s, this.f13141c, this.f13142d, this.f13143e, this.f13144f));
    }
}
