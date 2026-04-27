package p000;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class jwb extends Observable<Long> {

    /* JADX INFO: renamed from: a */
    public final voe f52133a;

    /* JADX INFO: renamed from: b */
    public final long f52134b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f52135c;

    /* JADX INFO: renamed from: jwb$a */
    public static final class RunnableC8127a extends AtomicReference<mf4> implements mf4, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super Long> f52136a;

        public RunnableC8127a(oxb<? super Long> oxbVar) {
            this.f52136a = oxbVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == ag4.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            this.f52136a.onNext(0L);
            lazySet(c05.INSTANCE);
            this.f52136a.onComplete();
        }

        public void setResource(mf4 mf4Var) {
            ag4.trySet(this, mf4Var);
        }
    }

    public jwb(long j, TimeUnit timeUnit, voe voeVar) {
        this.f52134b = j;
        this.f52135c = timeUnit;
        this.f52133a = voeVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Long> oxbVar) {
        RunnableC8127a runnableC8127a = new RunnableC8127a(oxbVar);
        oxbVar.onSubscribe(runnableC8127a);
        runnableC8127a.setResource(this.f52133a.scheduleDirect(runnableC8127a, this.f52134b, this.f52135c));
    }
}
