package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xnb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final tu2<? super T> f98574b;

    /* JADX INFO: renamed from: xnb$a */
    public static final class C15212a<T> extends mv0<T, T> {

        /* JADX INFO: renamed from: f */
        public final tu2<? super T> f98575f;

        public C15212a(oxb<? super T> oxbVar, tu2<? super T> tu2Var) {
            super(oxbVar);
            this.f98575f = tu2Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.oxb
        public void onNext(T t) {
            this.f62352a.onNext((Object) t);
            if (this.f62356e == 0) {
                try {
                    this.f98575f.accept(t);
                } catch (Throwable th) {
                    m17581c(th);
                }
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            T tPoll = this.f62354c.poll();
            if (tPoll != null) {
                this.f98575f.accept(tPoll);
            }
            return tPoll;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return m17582d(i);
        }
    }

    public xnb(xub<T> xubVar, tu2<? super T> tu2Var) {
        super(xubVar);
        this.f98574b = tu2Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C15212a(oxbVar, this.f98574b));
    }
}
