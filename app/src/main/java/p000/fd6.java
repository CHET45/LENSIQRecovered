package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class fd6<T, R> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends Iterable<? extends R>> f36166c;

    /* JADX INFO: renamed from: d */
    public final int f36167d;

    /* JADX INFO: renamed from: fd6$a */
    public static final class C5726a<T, R> extends rv0<R> implements kj6<T> {
        private static final long serialVersionUID = -3096000382929934955L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f36168C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f36169F;

        /* JADX INFO: renamed from: L */
        public Iterator<? extends R> f36171L;

        /* JADX INFO: renamed from: M */
        public int f36172M;

        /* JADX INFO: renamed from: N */
        public int f36173N;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f36174a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends Iterable<? extends R>> f36175b;

        /* JADX INFO: renamed from: c */
        public final int f36176c;

        /* JADX INFO: renamed from: d */
        public final int f36177d;

        /* JADX INFO: renamed from: f */
        public fdg f36179f;

        /* JADX INFO: renamed from: m */
        public zif<T> f36180m;

        /* JADX INFO: renamed from: H */
        public final AtomicReference<Throwable> f36170H = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f36178e = new AtomicLong();

        public C5726a(ycg<? super R> actual, sy6<? super T, ? extends Iterable<? extends R>> mapper, int prefetch) {
            this.f36174a = actual;
            this.f36175b = mapper;
            this.f36176c = prefetch;
            this.f36177d = prefetch - (prefetch >> 2);
        }

        /* JADX INFO: renamed from: a */
        public boolean m10811a(boolean d, boolean empty, ycg<?> a, zif<?> q) {
            if (this.f36169F) {
                this.f36171L = null;
                q.clear();
                return true;
            }
            if (!d) {
                return false;
            }
            if (this.f36170H.get() == null) {
                if (!empty) {
                    return false;
                }
                a.onComplete();
                return true;
            }
            Throwable thTerminate = k75.terminate(this.f36170H);
            this.f36171L = null;
            q.clear();
            a.onError(thTerminate);
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m10812b(boolean enabled) {
            if (enabled) {
                int i = this.f36172M + 1;
                if (i != this.f36177d) {
                    this.f36172M = i;
                } else {
                    this.f36172M = 0;
                    this.f36179f.request(i);
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f36169F) {
                return;
            }
            this.f36169F = true;
            this.f36179f.cancel();
            if (getAndIncrement() == 0) {
                this.f36180m.clear();
            }
        }

        @Override // p000.zif
        public void clear() {
            this.f36171L = null;
            this.f36180m.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x0125 A[PHI: r6
  0x0125: PHI (r6v4 java.util.Iterator<? extends R>) = (r6v3 java.util.Iterator<? extends R>), (r6v6 java.util.Iterator<? extends R>) binds: [B:31:0x0080, B:68:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drain() {
            /*
                Method dump skipped, instruction units count: 301
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fd6.C5726a.drain():void");
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f36171L == null && this.f36180m.isEmpty();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f36168C) {
                return;
            }
            this.f36168C = true;
            drain();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f36168C || !k75.addThrowable(this.f36170H, t)) {
                ofe.onError(t);
            } else {
                this.f36168C = true;
                drain();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f36168C) {
                return;
            }
            if (this.f36173N != 0 || this.f36180m.offer(t)) {
                drain();
            } else {
                onError(new bwa("Queue is full?!"));
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f36179f, s)) {
                this.f36179f = s;
                if (s instanceof bod) {
                    bod bodVar = (bod) s;
                    int iRequestFusion = bodVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f36173N = iRequestFusion;
                        this.f36180m = bodVar;
                        this.f36168C = true;
                        this.f36174a.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f36173N = iRequestFusion;
                        this.f36180m = bodVar;
                        this.f36174a.onSubscribe(this);
                        s.request(this.f36176c);
                        return;
                    }
                }
                this.f36180m = new ozf(this.f36176c);
                this.f36174a.onSubscribe(this);
                s.request(this.f36176c);
            }
        }

        @Override // p000.zif
        @dib
        public R poll() throws Throwable {
            Iterator<? extends R> it = this.f36171L;
            while (true) {
                if (it == null) {
                    T tPoll = this.f36180m.poll();
                    if (tPoll != null) {
                        it = this.f36175b.apply(tPoll).iterator();
                        if (it.hasNext()) {
                            this.f36171L = it;
                            break;
                        }
                        it = null;
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f36171L = null;
            }
            return next;
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f36178e, n);
                drain();
            }
        }

        @Override // p000.vnd
        public int requestFusion(int requestedMode) {
            return ((requestedMode & 1) == 0 || this.f36173N != 1) ? 0 : 1;
        }
    }

    public fd6(l86<T> source, sy6<? super T, ? extends Iterable<? extends R>> mapper, int prefetch) {
        super(source);
        this.f36166c = mapper;
        this.f36167d = prefetch;
    }

    public static <T, R> ycg<T> subscribe(ycg<? super R> downstream, sy6<? super T, ? extends Iterable<? extends R>> mapper, int prefetch) {
        return new C5726a(downstream, mapper, prefetch);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p000.l86
    public void subscribeActual(ycg<? super R> ycgVar) {
        l86<T> l86Var = this.f49321b;
        if (!(l86Var instanceof nfg)) {
            l86Var.subscribe((kj6) new C5726a(ycgVar, this.f36166c, this.f36167d));
            return;
        }
        try {
            Object obj = ((nfg) l86Var).get();
            if (obj == null) {
                w05.complete(ycgVar);
                return;
            }
            try {
                qd6.subscribe(ycgVar, this.f36166c.apply(obj).iterator());
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                w05.error(th, ycgVar);
            }
        } catch (Throwable th2) {
            o75.throwIfFatal(th2);
            w05.error(th2, ycgVar);
        }
    }
}
