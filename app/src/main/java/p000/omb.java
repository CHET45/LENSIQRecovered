package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class omb<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: a */
    public final Observable<T> f68132a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends pof<? extends R>> f68133b;

    /* JADX INFO: renamed from: c */
    public final f55 f68134c;

    /* JADX INFO: renamed from: d */
    public final int f68135d;

    /* JADX INFO: renamed from: omb$a */
    public static final class C10469a<T, R> extends AtomicInteger implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: M */
        public static final int f68136M = 0;

        /* JADX INFO: renamed from: N */
        public static final int f68137N = 1;

        /* JADX INFO: renamed from: Q */
        public static final int f68138Q = 2;
        private static final long serialVersionUID = -9140123220065488293L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f68139C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f68140F;

        /* JADX INFO: renamed from: H */
        public R f68141H;

        /* JADX INFO: renamed from: L */
        public volatile int f68142L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f68143a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends pof<? extends R>> f68144b;

        /* JADX INFO: renamed from: c */
        public final cc0 f68145c = new cc0();

        /* JADX INFO: renamed from: d */
        public final a<R> f68146d = new a<>(this);

        /* JADX INFO: renamed from: e */
        public final uif<T> f68147e;

        /* JADX INFO: renamed from: f */
        public final f55 f68148f;

        /* JADX INFO: renamed from: m */
        public mf4 f68149m;

        /* JADX INFO: renamed from: omb$a$a */
        public static final class a<R> extends AtomicReference<mf4> implements inf<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* JADX INFO: renamed from: a */
            public final C10469a<?, R> f68150a;

            public a(C10469a<?, R> c10469a) {
                this.f68150a = c10469a;
            }

            /* JADX INFO: renamed from: a */
            public void m18781a() {
                ag4.dispose(this);
            }

            @Override // p000.inf
            public void onError(Throwable th) {
                this.f68150a.m18779b(th);
            }

            @Override // p000.inf
            public void onSubscribe(mf4 mf4Var) {
                ag4.replace(this, mf4Var);
            }

            @Override // p000.inf
            public void onSuccess(R r) {
                this.f68150a.m18780c(r);
            }
        }

        public C10469a(oxb<? super R> oxbVar, py6<? super T, ? extends pof<? extends R>> py6Var, int i, f55 f55Var) {
            this.f68143a = oxbVar;
            this.f68144b = py6Var;
            this.f68148f = f55Var;
            this.f68147e = new rzf(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            r2.clear();
            r10.f68141H = null;
            r0.onError(r3.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m18778a() {
            /*
                r10 = this;
                int r0 = r10.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                oxb<? super R> r0 = r10.f68143a
                f55 r1 = r10.f68148f
                uif<T> r2 = r10.f68147e
                cc0 r3 = r10.f68145c
                r4 = 1
                r5 = r4
            L11:
                boolean r6 = r10.f68140F
                r7 = 0
                if (r6 == 0) goto L1d
                r2.clear()
                r10.f68141H = r7
                goto L98
            L1d:
                int r6 = r10.f68142L
                java.lang.Object r8 = r3.get()
                if (r8 == 0) goto L3c
                f55 r8 = p000.f55.IMMEDIATE
                if (r1 == r8) goto L2f
                f55 r8 = p000.f55.BOUNDARY
                if (r1 != r8) goto L3c
                if (r6 != 0) goto L3c
            L2f:
                r2.clear()
                r10.f68141H = r7
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            L3c:
                r8 = 0
                if (r6 != 0) goto L8a
                boolean r6 = r10.f68139C
                java.lang.Object r7 = r2.poll()
                if (r7 != 0) goto L48
                r8 = r4
            L48:
                if (r6 == 0) goto L5a
                if (r8 == 0) goto L5a
                java.lang.Throwable r1 = r3.terminate()
                if (r1 != 0) goto L56
                r0.onComplete()
                goto L59
            L56:
                r0.onError(r1)
            L59:
                return
            L5a:
                if (r8 == 0) goto L5d
                goto L98
            L5d:
                py6<? super T, ? extends pof<? extends R>> r6 = r10.f68144b     // Catch: java.lang.Throwable -> L73
                java.lang.Object r6 = r6.apply(r7)     // Catch: java.lang.Throwable -> L73
                java.lang.String r7 = "The mapper returned a null SingleSource"
                java.lang.Object r6 = p000.xjb.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L73
                pof r6 = (p000.pof) r6     // Catch: java.lang.Throwable -> L73
                r10.f68142L = r4
                omb$a$a<R> r7 = r10.f68146d
                r6.subscribe(r7)
                goto L98
            L73:
                r1 = move-exception
                p000.n75.throwIfFatal(r1)
                mf4 r4 = r10.f68149m
                r4.dispose()
                r2.clear()
                r3.addThrowable(r1)
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            L8a:
                r9 = 2
                if (r6 != r9) goto L98
                R r6 = r10.f68141H
                r10.f68141H = r7
                r0.onNext(r6)
                r10.f68142L = r8
                goto L11
            L98:
                int r5 = -r5
                int r5 = r10.addAndGet(r5)
                if (r5 != 0) goto L11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.omb.C10469a.m18778a():void");
        }

        /* JADX INFO: renamed from: b */
        public void m18779b(Throwable th) {
            if (!this.f68145c.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f68148f != f55.END) {
                this.f68149m.dispose();
            }
            this.f68142L = 0;
            m18778a();
        }

        /* JADX INFO: renamed from: c */
        public void m18780c(R r) {
            this.f68141H = r;
            this.f68142L = 2;
            m18778a();
        }

        @Override // p000.mf4
        public void dispose() {
            this.f68140F = true;
            this.f68149m.dispose();
            this.f68146d.m18781a();
            if (getAndIncrement() == 0) {
                this.f68147e.clear();
                this.f68141H = null;
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f68140F;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f68139C = true;
            m18778a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f68145c.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f68148f == f55.IMMEDIATE) {
                this.f68146d.m18781a();
            }
            this.f68139C = true;
            m18778a();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f68147e.offer(t);
            m18778a();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f68149m, mf4Var)) {
                this.f68149m = mf4Var;
                this.f68143a.onSubscribe(this);
            }
        }
    }

    public omb(Observable<T> observable, py6<? super T, ? extends pof<? extends R>> py6Var, f55 f55Var, int i) {
        this.f68132a = observable;
        this.f68133b = py6Var;
        this.f68134c = f55Var;
        this.f68135d = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        if (nme.m18011c(this.f68132a, this.f68133b, oxbVar)) {
            return;
        }
        this.f68132a.subscribe(new C10469a(oxbVar, this.f68133b, this.f68135d, this.f68134c));
    }
}
