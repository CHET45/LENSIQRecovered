package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class tpb<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends T> f85545a;

    /* JADX INFO: renamed from: tpb$a */
    public static final class C13160a<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f85546a;

        /* JADX INFO: renamed from: b */
        public fdg f85547b;

        public C13160a(oxb<? super T> oxbVar) {
            this.f85546a = oxbVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f85547b.cancel();
            this.f85547b = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f85547b == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f85546a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f85546a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f85546a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f85547b, fdgVar)) {
                this.f85547b = fdgVar;
                this.f85546a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public tpb(zjd<? extends T> zjdVar) {
        this.f85545a = zjdVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f85545a.subscribe(new C13160a(oxbVar));
    }
}
