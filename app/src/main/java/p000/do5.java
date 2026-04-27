package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public class do5<T> implements Comparable<do5> {

    /* JADX INFO: renamed from: d */
    public static final AtomicLong f30250d = new AtomicLong(0);

    /* JADX INFO: renamed from: a */
    public final long f30251a = f30250d.getAndIncrement();

    /* JADX INFO: renamed from: b */
    public final z5c<T> f30252b;

    /* JADX INFO: renamed from: c */
    public final lob<T> f30253c;

    /* JADX INFO: renamed from: do5$a */
    public class RunnableC4889a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aod f30254a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ woe f30255b;

        /* JADX INFO: renamed from: do5$a$a */
        public class a implements pxb<T> {
            public a() {
            }

            @Override // p000.pxb
            public void onComplete() {
                do5.this.f30253c.onComplete();
            }

            @Override // p000.pxb
            public void onError(Throwable th) {
                do5.this.f30253c.tryOnError(th);
            }

            @Override // p000.pxb
            public void onNext(T t) {
                do5.this.f30253c.onNext(t);
            }

            @Override // p000.pxb
            public void onSubscribe(lf4 lf4Var) {
                do5.this.f30253c.setDisposable(lf4Var);
            }
        }

        public RunnableC4889a(aod aodVar, woe woeVar) {
            this.f30254a = aodVar;
            this.f30255b = woeVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            do5.this.f30252b.run(this.f30254a).unsubscribeOn(this.f30255b).subscribe(new a());
        }
    }

    public do5(z5c<T> z5cVar, lob<T> lobVar) {
        this.f30252b = z5cVar;
        this.f30253c = lobVar;
    }

    public void run(aod aodVar, woe woeVar) {
        if (!this.f30253c.isDisposed()) {
            woeVar.scheduleDirect(new RunnableC4889a(aodVar, woeVar));
        } else {
            pj9.logOperationSkippedBecauseDisposedWhenAboutToRun(this.f30252b);
            aodVar.release();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@efb do5 do5Var) {
        int iCompareTo = this.f30252b.compareTo((T) do5Var.f30252b);
        if (iCompareTo != 0 || do5Var.f30252b == this.f30252b) {
            return iCompareTo;
        }
        return this.f30251a < do5Var.f30251a ? -1 : 1;
    }
}
