package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class hba<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final woe f43092b;

    /* JADX INFO: renamed from: hba$a */
    public static final class RunnableC6789a<T> extends AtomicReference<lf4> implements k9a<T>, lf4, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f43093a;

        /* JADX INFO: renamed from: b */
        public final woe f43094b;

        /* JADX INFO: renamed from: c */
        public lf4 f43095c;

        public RunnableC6789a(k9a<? super T> actual, woe scheduler) {
            this.f43093a = actual;
            this.f43094b = scheduler;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4 zf4Var = zf4.DISPOSED;
            lf4 andSet = getAndSet(zf4Var);
            if (andSet != zf4Var) {
                this.f43095c = andSet;
                this.f43094b.scheduleDirect(this);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f43093a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f43093a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f43093a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f43093a.onSuccess(value);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f43095c.dispose();
        }
    }

    public hba(z9a<T> source, woe scheduler) {
        super(source);
        this.f43092b = scheduler;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new RunnableC6789a(observer, this.f43092b));
    }
}
