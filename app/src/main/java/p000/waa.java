package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class waa<T> extends Observable<T> implements ah7<T> {

    /* JADX INFO: renamed from: a */
    public final aaa<T> f93816a;

    /* JADX INFO: renamed from: waa$a */
    public static final class C14527a<T> extends e34<T> implements l9a<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* JADX INFO: renamed from: C */
        public mf4 f93817C;

        public C14527a(oxb<? super T> oxbVar) {
            super(oxbVar);
        }

        @Override // p000.e34, p000.mf4
        public void dispose() {
            super.dispose();
            this.f93817C.dispose();
        }

        @Override // p000.l9a
        public void onComplete() {
            complete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            error(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f93817C, mf4Var)) {
                this.f93817C = mf4Var;
                this.f31631a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            complete(t);
        }
    }

    public waa(aaa<T> aaaVar) {
        this.f93816a = aaaVar;
    }

    public static <T> l9a<T> create(oxb<? super T> oxbVar) {
        return new C14527a(oxbVar);
    }

    @Override // p000.ah7
    public aaa<T> source() {
        return this.f93816a;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f93816a.subscribe(create(oxbVar));
    }
}
