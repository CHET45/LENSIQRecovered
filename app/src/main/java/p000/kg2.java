package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class kg2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2 f54005a;

    /* JADX INFO: renamed from: b */
    public final jh2 f54006b;

    public kg2(ph2 source, jh2 onLift) {
        this.f54005a = source;
        this.f54006b = onLift;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        try {
            this.f54005a.subscribe(this.f54006b.apply(observer));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }
}
