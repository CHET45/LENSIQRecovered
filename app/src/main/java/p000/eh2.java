package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class eh2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2 f32970a;

    /* JADX INFO: renamed from: b */
    public final m8d<? super Throwable> f32971b;

    /* JADX INFO: renamed from: eh2$a */
    public final class C5298a implements dh2 {

        /* JADX INFO: renamed from: a */
        public final dh2 f32972a;

        public C5298a(dh2 dh2Var) {
            this.f32972a = dh2Var;
        }

        @Override // p000.dh2
        public void onComplete() {
            this.f32972a.onComplete();
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            try {
                if (eh2.this.f32971b.test(th)) {
                    this.f32972a.onComplete();
                } else {
                    this.f32972a.onError(th);
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f32972a.onError(new pm2(th, th2));
            }
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            this.f32972a.onSubscribe(mf4Var);
        }
    }

    public eh2(qh2 qh2Var, m8d<? super Throwable> m8dVar) {
        this.f32970a = qh2Var;
        this.f32971b = m8dVar;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f32970a.subscribe(new C5298a(dh2Var));
    }
}
