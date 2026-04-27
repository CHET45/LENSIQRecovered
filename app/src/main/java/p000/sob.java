package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class sob<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final m8d<? super T> f82460b;

    /* JADX INFO: renamed from: sob$a */
    public static final class C12719a<T> extends mv0<T, T> {

        /* JADX INFO: renamed from: f */
        public final m8d<? super T> f82461f;

        public C12719a(oxb<? super T> oxbVar, m8d<? super T> m8dVar) {
            super(oxbVar);
            this.f82461f = m8dVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f62356e != 0) {
                this.f62352a.onNext(null);
                return;
            }
            try {
                if (this.f82461f.test(t)) {
                    this.f62352a.onNext((Object) t);
                }
            } catch (Throwable th) {
                m17581c(th);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f62354c.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f82461f.test(tPoll));
            return tPoll;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return m17582d(i);
        }
    }

    public sob(xub<T> xubVar, m8d<? super T> m8dVar) {
        super(xubVar);
        this.f82460b = m8dVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C12719a(oxbVar, this.f82460b));
    }
}
