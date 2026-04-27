package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class grb<T, U> extends AbstractC10162o3<T, U> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends U> f40837b;

    /* JADX INFO: renamed from: grb$a */
    public static final class C6473a<T, U> extends mv0<T, U> {

        /* JADX INFO: renamed from: f */
        public final py6<? super T, ? extends U> f40838f;

        public C6473a(oxb<? super U> oxbVar, py6<? super T, ? extends U> py6Var) {
            super(oxbVar);
            this.f40838f = py6Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f62355d) {
                return;
            }
            if (this.f62356e != 0) {
                this.f62352a.onNext(null);
                return;
            }
            try {
                this.f62352a.onNext((Object) xjb.requireNonNull(this.f40838f.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                m17581c(th);
            }
        }

        @Override // p000.ajf
        @cib
        public U poll() throws Exception {
            T tPoll = this.f62354c.poll();
            if (tPoll != null) {
                return (U) xjb.requireNonNull(this.f40838f.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return m17582d(i);
        }
    }

    public grb(xub<T> xubVar, py6<? super T, ? extends U> py6Var) {
        super(xubVar);
        this.f40837b = py6Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super U> oxbVar) {
        this.f66354a.subscribe(new C6473a(oxbVar, this.f40837b));
    }
}
