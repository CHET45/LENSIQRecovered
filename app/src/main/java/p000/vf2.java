package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class vf2<T> extends yd2 {

    /* JADX INFO: renamed from: a */
    public final xub<T> f90852a;

    /* JADX INFO: renamed from: vf2$a */
    public static final class C14033a<T> implements oxb<T> {

        /* JADX INFO: renamed from: a */
        public final dh2 f90853a;

        public C14033a(dh2 dh2Var) {
            this.f90853a = dh2Var;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f90853a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f90853a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f90853a.onSubscribe(mf4Var);
        }
    }

    public vf2(xub<T> xubVar) {
        this.f90852a = xubVar;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f90852a.subscribe(new C14033a(dh2Var));
    }
}
