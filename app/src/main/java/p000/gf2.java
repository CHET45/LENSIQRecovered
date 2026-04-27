package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class gf2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2 f39662a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super Throwable> f39663b;

    /* JADX INFO: renamed from: gf2$a */
    public final class C6279a implements dh2 {

        /* JADX INFO: renamed from: a */
        public final dh2 f39664a;

        public C6279a(dh2 dh2Var) {
            this.f39664a = dh2Var;
        }

        @Override // p000.dh2
        public void onComplete() {
            try {
                gf2.this.f39663b.accept(null);
                this.f39664a.onComplete();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f39664a.onError(th);
            }
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            try {
                gf2.this.f39663b.accept(th);
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                th = new pm2(th, th2);
            }
            this.f39664a.onError(th);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            this.f39664a.onSubscribe(mf4Var);
        }
    }

    public gf2(qh2 qh2Var, tu2<? super Throwable> tu2Var) {
        this.f39662a = qh2Var;
        this.f39663b = tu2Var;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f39662a.subscribe(new C6279a(dh2Var));
    }
}
