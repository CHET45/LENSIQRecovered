package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class gba<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final voe f39262b;

    /* JADX INFO: renamed from: gba$a */
    public static final class RunnableC6199a<T> extends AtomicReference<mf4> implements l9a<T>, mf4, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f39263a;

        /* JADX INFO: renamed from: b */
        public final voe f39264b;

        /* JADX INFO: renamed from: c */
        public mf4 f39265c;

        public RunnableC6199a(l9a<? super T> l9aVar, voe voeVar) {
            this.f39263a = l9aVar;
            this.f39264b = voeVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4 ag4Var = ag4.DISPOSED;
            mf4 andSet = getAndSet(ag4Var);
            if (andSet != ag4Var) {
                this.f39265c = andSet;
                this.f39264b.scheduleDirect(this);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f39263a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f39263a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f39263a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f39263a.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f39265c.dispose();
        }
    }

    public gba(aaa<T> aaaVar, voe voeVar) {
        super(aaaVar);
        this.f39262b = voeVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new RunnableC6199a(l9aVar, this.f39262b));
    }
}
