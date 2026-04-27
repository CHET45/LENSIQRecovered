package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class xof<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f98829a;

    /* JADX INFO: renamed from: b */
    public final long f98830b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f98831c;

    /* JADX INFO: renamed from: d */
    public final voe f98832d;

    /* JADX INFO: renamed from: e */
    public final pof<? extends T> f98833e;

    /* JADX INFO: renamed from: xof$a */
    public static final class RunnableC15235a<T> extends AtomicReference<mf4> implements inf<T>, Runnable, mf4 {
        private static final long serialVersionUID = 37497744973048446L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f98834a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<mf4> f98835b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final a<T> f98836c;

        /* JADX INFO: renamed from: d */
        public pof<? extends T> f98837d;

        /* JADX INFO: renamed from: e */
        public final long f98838e;

        /* JADX INFO: renamed from: f */
        public final TimeUnit f98839f;

        /* JADX INFO: renamed from: xof$a$a */
        public static final class a<T> extends AtomicReference<mf4> implements inf<T> {
            private static final long serialVersionUID = 2071387740092105509L;

            /* JADX INFO: renamed from: a */
            public final inf<? super T> f98840a;

            public a(inf<? super T> infVar) {
                this.f98840a = infVar;
            }

            @Override // p000.inf
            public void onError(Throwable th) {
                this.f98840a.onError(th);
            }

            @Override // p000.inf
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }

            @Override // p000.inf
            public void onSuccess(T t) {
                this.f98840a.onSuccess(t);
            }
        }

        public RunnableC15235a(inf<? super T> infVar, pof<? extends T> pofVar, long j, TimeUnit timeUnit) {
            this.f98834a = infVar;
            this.f98837d = pofVar;
            this.f98838e = j;
            this.f98839f = timeUnit;
            if (pofVar != null) {
                this.f98836c = new a<>(infVar);
            } else {
                this.f98836c = null;
            }
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
            ag4.dispose(this.f98835b);
            a<T> aVar = this.f98836c;
            if (aVar != null) {
                ag4.dispose(aVar);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            mf4 mf4Var = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var || !compareAndSet(mf4Var, ag4Var)) {
                pfe.onError(th);
            } else {
                ag4.dispose(this.f98835b);
                this.f98834a.onError(th);
            }
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            mf4 mf4Var = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var || !compareAndSet(mf4Var, ag4Var)) {
                return;
            }
            ag4.dispose(this.f98835b);
            this.f98834a.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            mf4 mf4Var = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var || !compareAndSet(mf4Var, ag4Var)) {
                return;
            }
            if (mf4Var != null) {
                mf4Var.dispose();
            }
            pof<? extends T> pofVar = this.f98837d;
            if (pofVar == null) {
                this.f98834a.onError(new TimeoutException(j75.timeoutMessage(this.f98838e, this.f98839f)));
            } else {
                this.f98837d = null;
                pofVar.subscribe(this.f98836c);
            }
        }
    }

    public xof(pof<T> pofVar, long j, TimeUnit timeUnit, voe voeVar, pof<? extends T> pofVar2) {
        this.f98829a = pofVar;
        this.f98830b = j;
        this.f98831c = timeUnit;
        this.f98832d = voeVar;
        this.f98833e = pofVar2;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        RunnableC15235a runnableC15235a = new RunnableC15235a(infVar, this.f98833e, this.f98830b, this.f98831c);
        infVar.onSubscribe(runnableC15235a);
        ag4.replace(runnableC15235a.f98835b, this.f98832d.scheduleDirect(runnableC15235a, this.f98830b, this.f98831c));
        this.f98829a.subscribe(runnableC15235a);
    }
}
