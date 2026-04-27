package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ie6<T> extends yd2 implements v07<T> {

    /* JADX INFO: renamed from: a */
    public final m86<T> f46689a;

    /* JADX INFO: renamed from: ie6$a */
    public static final class C7260a<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final dh2 f46690a;

        /* JADX INFO: renamed from: b */
        public fdg f46691b;

        public C7260a(dh2 dh2Var) {
            this.f46690a = dh2Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f46691b.cancel();
            this.f46691b = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f46691b == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f46691b = mdg.CANCELLED;
            this.f46690a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f46691b = mdg.CANCELLED;
            this.f46690a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f46691b, fdgVar)) {
                this.f46691b = fdgVar;
                this.f46690a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public ie6(m86<T> m86Var) {
        this.f46689a = m86Var;
    }

    @Override // p000.v07
    public m86<T> fuseToFlowable() {
        return pfe.onAssembly(new ge6(this.f46689a));
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f46689a.subscribe((lj6) new C7260a(dh2Var));
    }
}
