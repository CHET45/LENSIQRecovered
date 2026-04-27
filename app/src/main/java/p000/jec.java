package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class jec<T> extends fec<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<T>[] f50393a;

    public jec(zjd<T>[] zjdVarArr) {
        this.f50393a = zjdVarArr;
    }

    @Override // p000.fec
    public int parallelism() {
        return this.f50393a.length;
    }

    @Override // p000.fec
    public void subscribe(ycg<? super T>[] ycgVarArr) {
        if (m10853a(ycgVarArr)) {
            int length = ycgVarArr.length;
            for (int i = 0; i < length; i++) {
                this.f50393a[i].subscribe(ycgVarArr[i]);
            }
        }
    }
}
