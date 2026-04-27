package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class cmf<T, R> extends m86<R> {

    /* JADX INFO: renamed from: b */
    public final pof<T> f16971b;

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends zjd<? extends R>> f16972c;

    public cmf(pof<T> pofVar, py6<? super T, ? extends zjd<? extends R>> py6Var) {
        this.f16971b = pofVar;
        this.f16972c = py6Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        this.f16971b.subscribe(new C2390a(ycgVar, this.f16972c));
    }

    /* JADX INFO: renamed from: cmf$a */
    public static final class C2390a<S, T> extends AtomicLong implements inf<S>, lj6<T>, fdg {
        private static final long serialVersionUID = 7759721921468635667L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f16973a;

        /* JADX INFO: renamed from: b */
        public final py6<? super S, ? extends zjd<? extends T>> f16974b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<fdg> f16975c = new AtomicReference<>();

        /* JADX INFO: renamed from: d */
        public mf4 f16976d;

        public C2390a(ycg<? super T> ycgVar, py6<? super S, ? extends zjd<? extends T>> py6Var) {
            this.f16973a = ycgVar;
            this.f16974b = py6Var;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f16976d.dispose();
            mdg.cancel(this.f16975c);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f16973a.onComplete();
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f16973a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f16973a.onNext(t);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            this.f16976d = mf4Var;
            this.f16973a.onSubscribe(this);
        }

        @Override // p000.inf
        public void onSuccess(S s) {
            try {
                ((zjd) xjb.requireNonNull(this.f16974b.apply(s), "the mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f16973a.onError(th);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            mdg.deferredRequest(this.f16975c, this, j);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.deferredSetOnce(this.f16975c, this, fdgVar);
        }
    }
}
