package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xkf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f98308a;

    /* JADX INFO: renamed from: b */
    public final f11<? super T, ? super Throwable> f98309b;

    /* JADX INFO: renamed from: xkf$a */
    public final class C15177a implements inf<T> {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f98310a;

        public C15177a(inf<? super T> infVar) {
            this.f98310a = infVar;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            try {
                xkf.this.f98309b.accept(null, th);
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                th = new pm2(th, th2);
            }
            this.f98310a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            this.f98310a.onSubscribe(mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            try {
                xkf.this.f98309b.accept(t, null);
                this.f98310a.onSuccess(t);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f98310a.onError(th);
            }
        }
    }

    public xkf(pof<T> pofVar, f11<? super T, ? super Throwable> f11Var) {
        this.f98308a = pofVar;
        this.f98309b = f11Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f98308a.subscribe(new C15177a(infVar));
    }
}
