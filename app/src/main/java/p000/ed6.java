package p000;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ed6<T, R> extends AbstractC8162k1<T, R> {

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends Iterable<? extends R>> f32685c;

    /* JADX INFO: renamed from: d */
    public final int f32686d;

    /* JADX INFO: renamed from: ed6$a */
    public static final class C5264a<T, R> extends sv0<R> implements lj6<T> {
        private static final long serialVersionUID = -3096000382929934955L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f32687C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f32688F;

        /* JADX INFO: renamed from: L */
        public Iterator<? extends R> f32690L;

        /* JADX INFO: renamed from: M */
        public int f32691M;

        /* JADX INFO: renamed from: N */
        public int f32692N;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f32693a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends Iterable<? extends R>> f32694b;

        /* JADX INFO: renamed from: c */
        public final int f32695c;

        /* JADX INFO: renamed from: d */
        public final int f32696d;

        /* JADX INFO: renamed from: f */
        public fdg f32698f;

        /* JADX INFO: renamed from: m */
        public ajf<T> f32699m;

        /* JADX INFO: renamed from: H */
        public final AtomicReference<Throwable> f32689H = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f32697e = new AtomicLong();

        public C5264a(ycg<? super R> ycgVar, py6<? super T, ? extends Iterable<? extends R>> py6Var, int i) {
            this.f32693a = ycgVar;
            this.f32694b = py6Var;
            this.f32695c = i;
            this.f32696d = i - (i >> 2);
        }

        /* JADX INFO: renamed from: a */
        public boolean m9894a(boolean z, boolean z2, ycg<?> ycgVar, ajf<?> ajfVar) {
            if (this.f32688F) {
                this.f32690L = null;
                ajfVar.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f32689H.get() == null) {
                if (!z2) {
                    return false;
                }
                ycgVar.onComplete();
                return true;
            }
            Throwable thTerminate = j75.terminate(this.f32689H);
            this.f32690L = null;
            ajfVar.clear();
            ycgVar.onError(thTerminate);
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m9895b(boolean z) {
            if (z) {
                int i = this.f32691M + 1;
                if (i != this.f32696d) {
                    this.f32691M = i;
                } else {
                    this.f32691M = 0;
                    this.f32698f.request(i);
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f32688F) {
                return;
            }
            this.f32688F = true;
            this.f32698f.cancel();
            if (getAndIncrement() == 0) {
                this.f32699m.clear();
            }
        }

        @Override // p000.ajf
        public void clear() {
            this.f32690L = null;
            this.f32699m.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x0126 A[PHI: r6
  0x0126: PHI (r6v4 java.util.Iterator<? extends R>) = (r6v3 java.util.Iterator<? extends R>), (r6v6 java.util.Iterator<? extends R>) binds: [B:31:0x0080, B:68:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drain() {
            /*
                Method dump skipped, instruction units count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ed6.C5264a.drain():void");
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f32690L == null && this.f32699m.isEmpty();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f32687C) {
                return;
            }
            this.f32687C = true;
            drain();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f32687C || !j75.addThrowable(this.f32689H, th)) {
                pfe.onError(th);
            } else {
                this.f32687C = true;
                drain();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f32687C) {
                return;
            }
            if (this.f32692N != 0 || this.f32699m.offer(t)) {
                drain();
            } else {
                onError(new cwa("Queue is full?!"));
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f32698f, fdgVar)) {
                this.f32698f = fdgVar;
                if (fdgVar instanceof cod) {
                    cod codVar = (cod) fdgVar;
                    int iRequestFusion = codVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f32692N = iRequestFusion;
                        this.f32699m = codVar;
                        this.f32687C = true;
                        this.f32693a.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f32692N = iRequestFusion;
                        this.f32699m = codVar;
                        this.f32693a.onSubscribe(this);
                        fdgVar.request(this.f32695c);
                        return;
                    }
                }
                this.f32699m = new pzf(this.f32695c);
                this.f32693a.onSubscribe(this);
                fdgVar.request(this.f32695c);
            }
        }

        @Override // p000.ajf
        @cib
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f32690L;
            while (true) {
                if (it == null) {
                    T tPoll = this.f32699m.poll();
                    if (tPoll != null) {
                        it = this.f32694b.apply(tPoll).iterator();
                        if (it.hasNext()) {
                            this.f32690L = it;
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
            R r = (R) xjb.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f32690L = null;
            }
            return r;
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f32697e, j);
                drain();
            }
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return ((i & 1) == 0 || this.f32692N != 1) ? 0 : 1;
        }
    }

    public ed6(m86<T> m86Var, py6<? super T, ? extends Iterable<? extends R>> py6Var, int i) {
        super(m86Var);
        this.f32685c = py6Var;
        this.f32686d = i;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        m86<T> m86Var = this.f52360b;
        if (!(m86Var instanceof Callable)) {
            m86Var.subscribe((lj6) new C5264a(ycgVar, this.f32685c, this.f32686d));
            return;
        }
        try {
            Object objCall = ((Callable) m86Var).call();
            if (objCall == null) {
                x05.complete(ycgVar);
                return;
            }
            try {
                pd6.subscribe(ycgVar, this.f32685c.apply(objCall).iterator());
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                x05.error(th, ycgVar);
            }
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            x05.error(th2, ycgVar);
        }
    }
}
