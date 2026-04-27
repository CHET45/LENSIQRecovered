package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class bg2<T> extends yd2 {

    /* JADX INFO: renamed from: a */
    public final pof<T> f13669a;

    /* JADX INFO: renamed from: bg2$a */
    public static final class C1882a<T> implements inf<T> {

        /* JADX INFO: renamed from: a */
        public final dh2 f13670a;

        public C1882a(dh2 dh2Var) {
            this.f13670a = dh2Var;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f13670a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            this.f13670a.onSubscribe(mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f13670a.onComplete();
        }
    }

    public bg2(pof<T> pofVar) {
        this.f13669a = pofVar;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f13669a.subscribe(new C1882a(dh2Var));
    }
}
