package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class fnf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f37183a;

    /* JADX INFO: renamed from: b */
    public final voe f37184b;

    /* JADX INFO: renamed from: fnf$a */
    public static final class RunnableC5896a<T> extends AtomicReference<mf4> implements inf<T>, mf4, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f37185a;

        /* JADX INFO: renamed from: b */
        public final voe f37186b;

        /* JADX INFO: renamed from: c */
        public T f37187c;

        /* JADX INFO: renamed from: d */
        public Throwable f37188d;

        public RunnableC5896a(inf<? super T> infVar, voe voeVar) {
            this.f37185a = infVar;
            this.f37186b = voeVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f37188d = th;
            ag4.replace(this, this.f37186b.scheduleDirect(this));
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f37185a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f37187c = t;
            ag4.replace(this, this.f37186b.scheduleDirect(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f37188d;
            if (th != null) {
                this.f37185a.onError(th);
            } else {
                this.f37185a.onSuccess(this.f37187c);
            }
        }
    }

    public fnf(pof<T> pofVar, voe voeVar) {
        this.f37183a = pofVar;
        this.f37184b = voeVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f37183a.subscribe(new RunnableC5896a(infVar, this.f37184b));
    }
}
