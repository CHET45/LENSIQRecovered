package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class m9a<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final m8d<? super Throwable> f60286b;

    /* JADX INFO: renamed from: m9a$a */
    public static final class C9227a<T> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f60287a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super Throwable> f60288b;

        /* JADX INFO: renamed from: c */
        public mf4 f60289c;

        public C9227a(l9a<? super T> l9aVar, m8d<? super Throwable> m8dVar) {
            this.f60287a = l9aVar;
            this.f60288b = m8dVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f60289c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f60289c.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f60287a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            try {
                if (this.f60288b.test(th)) {
                    this.f60287a.onComplete();
                } else {
                    this.f60287a.onError(th);
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f60287a.onError(new pm2(th, th2));
            }
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f60289c, mf4Var)) {
                this.f60289c = mf4Var;
                this.f60287a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f60287a.onSuccess(t);
        }
    }

    public m9a(aaa<T> aaaVar, m8d<? super Throwable> m8dVar) {
        super(aaaVar);
        this.f60286b = m8dVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new C9227a(l9aVar, this.f60286b));
    }
}
