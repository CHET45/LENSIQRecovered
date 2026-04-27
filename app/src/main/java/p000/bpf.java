package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class bpf<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final pof<? extends T> f14415b;

    /* JADX INFO: renamed from: bpf$a */
    public static final class C1987a<T> extends k34<T> implements inf<T> {
        private static final long serialVersionUID = 187782011903685568L;

        /* JADX INFO: renamed from: L */
        public mf4 f14416L;

        public C1987a(ycg<? super T> ycgVar) {
            super(ycgVar);
        }

        @Override // p000.k34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f14416L.dispose();
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f52502a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f14416L, mf4Var)) {
                this.f14416L = mf4Var;
                this.f52502a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            complete(t);
        }
    }

    public bpf(pof<? extends T> pofVar) {
        this.f14415b = pofVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f14415b.subscribe(new C1987a(ycgVar));
    }
}
