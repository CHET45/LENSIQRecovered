package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class iec<T> extends eec<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<T>[] f46700a;

    public iec(zjd<T>[] sources) {
        this.f46700a = sources;
    }

    @Override // p000.eec
    public int parallelism() {
        return this.f46700a.length;
    }

    @Override // p000.eec
    public void subscribe(ycg<? super T>[] subscribers) {
        ycg<? super T>[] ycgVarArrOnSubscribe = ofe.onSubscribe(this, subscribers);
        if (m9902a(ycgVarArrOnSubscribe)) {
            int length = ycgVarArrOnSubscribe.length;
            for (int i = 0; i < length; i++) {
                this.f46700a[i].subscribe(ycgVarArrOnSubscribe[i]);
            }
        }
    }
}
