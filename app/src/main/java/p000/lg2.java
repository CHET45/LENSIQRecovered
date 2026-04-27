package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lg2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2 f57492a;

    /* JADX INFO: renamed from: b */
    public final kh2 f57493b;

    public lg2(qh2 qh2Var, kh2 kh2Var) {
        this.f57492a = qh2Var;
        this.f57493b = kh2Var;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        try {
            this.f57492a.subscribe(this.f57493b.apply(dh2Var));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
        }
    }
}
