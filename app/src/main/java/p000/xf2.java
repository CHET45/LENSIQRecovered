package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xf2<T> extends yd2 {

    /* JADX INFO: renamed from: a */
    public final zjd<T> f97610a;

    /* JADX INFO: renamed from: xf2$a */
    public static final class C15042a<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final dh2 f97611a;

        /* JADX INFO: renamed from: b */
        public fdg f97612b;

        public C15042a(dh2 dh2Var) {
            this.f97611a = dh2Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f97612b.cancel();
            this.f97612b = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f97612b == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f97611a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f97611a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f97612b, fdgVar)) {
                this.f97612b = fdgVar;
                this.f97611a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public xf2(zjd<T> zjdVar) {
        this.f97610a = zjdVar;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f97610a.subscribe(new C15042a(dh2Var));
    }
}
