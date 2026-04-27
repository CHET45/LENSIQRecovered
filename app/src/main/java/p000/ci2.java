package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ci2<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final qh2 f16604b;

    public ci2(qh2 qh2Var) {
        this.f16604b = qh2Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f16604b.subscribe(new zcg(ycgVar));
    }
}
