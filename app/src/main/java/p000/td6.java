package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class td6<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final zjd<? extends T> f84317b;

    public td6(zjd<? extends T> publisher) {
        this.f84317b = publisher;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f84317b.subscribe(s);
    }
}
