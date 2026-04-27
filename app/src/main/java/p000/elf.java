package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class elf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f33357a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7178i8 f33358b;

    /* JADX INFO: renamed from: elf$a */
    public final class C5370a implements inf<T> {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f33359a;

        public C5370a(inf<? super T> infVar) {
            this.f33359a = infVar;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            try {
                elf.this.f33358b.run();
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                th = new pm2(th, th2);
            }
            this.f33359a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            this.f33359a.onSubscribe(mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            try {
                elf.this.f33358b.run();
                this.f33359a.onSuccess(t);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f33359a.onError(th);
            }
        }
    }

    public elf(pof<T> pofVar, InterfaceC7178i8 interfaceC7178i8) {
        this.f33357a = pofVar;
        this.f33358b = interfaceC7178i8;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f33357a.subscribe(new C5370a(infVar));
    }
}
