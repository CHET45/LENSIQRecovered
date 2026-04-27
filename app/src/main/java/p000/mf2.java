package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class mf2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final Throwable f60876a;

    public mf2(Throwable error) {
        this.f60876a = error;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        b05.error(this.f60876a, observer);
    }
}
