package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class zvb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f106147b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f106148c;

    /* JADX INFO: renamed from: d */
    public final voe f106149d;

    /* JADX INFO: renamed from: zvb$a */
    public static final class RunnableC16262a<T> extends AtomicReference<mf4> implements oxb<T>, mf4, Runnable {
        private static final long serialVersionUID = 786994795061867455L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f106150a;

        /* JADX INFO: renamed from: b */
        public final long f106151b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f106152c;

        /* JADX INFO: renamed from: d */
        public final voe.AbstractC14185c f106153d;

        /* JADX INFO: renamed from: e */
        public mf4 f106154e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f106155f;

        /* JADX INFO: renamed from: m */
        public boolean f106156m;

        public RunnableC16262a(oxb<? super T> oxbVar, long j, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c) {
            this.f106150a = oxbVar;
            this.f106151b = j;
            this.f106152c = timeUnit;
            this.f106153d = abstractC14185c;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f106154e.dispose();
            this.f106153d.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f106153d.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f106156m) {
                return;
            }
            this.f106156m = true;
            this.f106150a.onComplete();
            this.f106153d.dispose();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f106156m) {
                pfe.onError(th);
                return;
            }
            this.f106156m = true;
            this.f106150a.onError(th);
            this.f106153d.dispose();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f106155f || this.f106156m) {
                return;
            }
            this.f106155f = true;
            this.f106150a.onNext(t);
            mf4 mf4Var = get();
            if (mf4Var != null) {
                mf4Var.dispose();
            }
            ag4.replace(this, this.f106153d.schedule(this, this.f106151b, this.f106152c));
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f106154e, mf4Var)) {
                this.f106154e = mf4Var;
                this.f106150a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f106155f = false;
        }
    }

    public zvb(xub<T> xubVar, long j, TimeUnit timeUnit, voe voeVar) {
        super(xubVar);
        this.f106147b = j;
        this.f106148c = timeUnit;
        this.f106149d = voeVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new RunnableC16262a(new n1f(oxbVar), this.f106147b, this.f106148c, this.f106149d.createWorker()));
    }
}
