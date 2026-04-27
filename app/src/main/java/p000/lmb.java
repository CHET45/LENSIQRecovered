package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class lmb<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: a */
    public final Observable<T> f58249a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends aaa<? extends R>> f58250b;

    /* JADX INFO: renamed from: c */
    public final f55 f58251c;

    /* JADX INFO: renamed from: d */
    public final int f58252d;

    /* JADX INFO: renamed from: lmb$a */
    public static final class C8901a<T, R> extends AtomicInteger implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: M */
        public static final int f58253M = 0;

        /* JADX INFO: renamed from: N */
        public static final int f58254N = 1;

        /* JADX INFO: renamed from: Q */
        public static final int f58255Q = 2;
        private static final long serialVersionUID = -9140123220065488293L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f58256C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f58257F;

        /* JADX INFO: renamed from: H */
        public R f58258H;

        /* JADX INFO: renamed from: L */
        public volatile int f58259L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f58260a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends aaa<? extends R>> f58261b;

        /* JADX INFO: renamed from: c */
        public final cc0 f58262c = new cc0();

        /* JADX INFO: renamed from: d */
        public final a<R> f58263d = new a<>(this);

        /* JADX INFO: renamed from: e */
        public final uif<T> f58264e;

        /* JADX INFO: renamed from: f */
        public final f55 f58265f;

        /* JADX INFO: renamed from: m */
        public mf4 f58266m;

        /* JADX INFO: renamed from: lmb$a$a */
        public static final class a<R> extends AtomicReference<mf4> implements l9a<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* JADX INFO: renamed from: a */
            public final C8901a<?, R> f58267a;

            public a(C8901a<?, R> c8901a) {
                this.f58267a = c8901a;
            }

            /* JADX INFO: renamed from: a */
            public void m16235a() {
                ag4.dispose(this);
            }

            @Override // p000.l9a
            public void onComplete() {
                this.f58267a.m16232b();
            }

            @Override // p000.l9a
            public void onError(Throwable th) {
                this.f58267a.m16233c(th);
            }

            @Override // p000.l9a
            public void onSubscribe(mf4 mf4Var) {
                ag4.replace(this, mf4Var);
            }

            @Override // p000.l9a
            public void onSuccess(R r) {
                this.f58267a.m16234d(r);
            }
        }

        public C8901a(oxb<? super R> oxbVar, py6<? super T, ? extends aaa<? extends R>> py6Var, int i, f55 f55Var) {
            this.f58260a = oxbVar;
            this.f58261b = py6Var;
            this.f58265f = f55Var;
            this.f58264e = new rzf(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            r2.clear();
            r10.f58258H = null;
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
        public void m16231a() {
            /*
                r10 = this;
                int r0 = r10.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                oxb<? super R> r0 = r10.f58260a
                f55 r1 = r10.f58265f
                uif<T> r2 = r10.f58264e
                cc0 r3 = r10.f58262c
                r4 = 1
                r5 = r4
            L11:
                boolean r6 = r10.f58257F
                r7 = 0
                if (r6 == 0) goto L1d
                r2.clear()
                r10.f58258H = r7
                goto L98
            L1d:
                int r6 = r10.f58259L
                java.lang.Object r8 = r3.get()
                if (r8 == 0) goto L3c
                f55 r8 = p000.f55.IMMEDIATE
                if (r1 == r8) goto L2f
                f55 r8 = p000.f55.BOUNDARY
                if (r1 != r8) goto L3c
                if (r6 != 0) goto L3c
            L2f:
                r2.clear()
                r10.f58258H = r7
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            L3c:
                r8 = 0
                if (r6 != 0) goto L8a
                boolean r6 = r10.f58256C
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
                py6<? super T, ? extends aaa<? extends R>> r6 = r10.f58261b     // Catch: java.lang.Throwable -> L73
                java.lang.Object r6 = r6.apply(r7)     // Catch: java.lang.Throwable -> L73
                java.lang.String r7 = "The mapper returned a null MaybeSource"
                java.lang.Object r6 = p000.xjb.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L73
                aaa r6 = (p000.aaa) r6     // Catch: java.lang.Throwable -> L73
                r10.f58259L = r4
                lmb$a$a<R> r7 = r10.f58263d
                r6.subscribe(r7)
                goto L98
            L73:
                r1 = move-exception
                p000.n75.throwIfFatal(r1)
                mf4 r4 = r10.f58266m
                r4.dispose()
                r2.clear()
                r3.addThrowable(r1)
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            L8a:
                r9 = 2
                if (r6 != r9) goto L98
                R r6 = r10.f58258H
                r10.f58258H = r7
                r0.onNext(r6)
                r10.f58259L = r8
                goto L11
            L98:
                int r5 = -r5
                int r5 = r10.addAndGet(r5)
                if (r5 != 0) goto L11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.lmb.C8901a.m16231a():void");
        }

        /* JADX INFO: renamed from: b */
        public void m16232b() {
            this.f58259L = 0;
            m16231a();
        }

        /* JADX INFO: renamed from: c */
        public void m16233c(Throwable th) {
            if (!this.f58262c.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f58265f != f55.END) {
                this.f58266m.dispose();
            }
            this.f58259L = 0;
            m16231a();
        }

        /* JADX INFO: renamed from: d */
        public void m16234d(R r) {
            this.f58258H = r;
            this.f58259L = 2;
            m16231a();
        }

        @Override // p000.mf4
        public void dispose() {
            this.f58257F = true;
            this.f58266m.dispose();
            this.f58263d.m16235a();
            if (getAndIncrement() == 0) {
                this.f58264e.clear();
                this.f58258H = null;
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f58257F;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f58256C = true;
            m16231a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f58262c.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f58265f == f55.IMMEDIATE) {
                this.f58263d.m16235a();
            }
            this.f58256C = true;
            m16231a();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f58264e.offer(t);
            m16231a();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f58266m, mf4Var)) {
                this.f58266m = mf4Var;
                this.f58260a.onSubscribe(this);
            }
        }
    }

    public lmb(Observable<T> observable, py6<? super T, ? extends aaa<? extends R>> py6Var, f55 f55Var, int i) {
        this.f58249a = observable;
        this.f58250b = py6Var;
        this.f58251c = f55Var;
        this.f58252d = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        if (nme.m18010b(this.f58249a, this.f58250b, oxbVar)) {
            return;
        }
        this.f58249a.subscribe(new C8901a(oxbVar, this.f58250b, this.f58252d, this.f58251c));
    }
}
