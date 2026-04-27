package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class i6a<T> extends s4a<T> {

    /* JADX INFO: renamed from: a */
    public final aaa<T> f45847a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7178i8 f45848b;

    /* JADX INFO: renamed from: i6a$a */
    public final class C7158a implements l9a<T> {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f45849a;

        public C7158a(l9a<? super T> l9aVar) {
            this.f45849a = l9aVar;
        }

        @Override // p000.l9a
        public void onComplete() {
            try {
                i6a.this.f45848b.run();
                this.f45849a.onComplete();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f45849a.onError(th);
            }
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            try {
                i6a.this.f45848b.run();
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                th = new pm2(th, th2);
            }
            this.f45849a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            this.f45849a.onSubscribe(mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            try {
                i6a.this.f45848b.run();
                this.f45849a.onSuccess(t);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f45849a.onError(th);
            }
        }
    }

    public i6a(aaa<T> aaaVar, InterfaceC7178i8 interfaceC7178i8) {
        this.f45847a = aaaVar;
        this.f45848b = interfaceC7178i8;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f45847a.subscribe(new C7158a(l9aVar));
    }
}
