package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class rd6<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final Observable<T> f77876b;

    /* JADX INFO: renamed from: rd6$a */
    public static final class C12025a<T> implements oxb<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f77877a;

        /* JADX INFO: renamed from: b */
        public mf4 f77878b;

        public C12025a(ycg<? super T> ycgVar) {
            this.f77877a = ycgVar;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f77878b.dispose();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f77877a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f77877a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f77877a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f77878b = mf4Var;
            this.f77877a.onSubscribe(this);
        }

        @Override // p000.fdg
        public void request(long j) {
        }
    }

    public rd6(Observable<T> observable) {
        this.f77876b = observable;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f77876b.subscribe(new C12025a(ycgVar));
    }
}
