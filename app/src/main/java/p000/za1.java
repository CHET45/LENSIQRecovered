package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class za1 extends rbd<boolean[]> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final boolean[] f104537d;

    public za1(int i) {
        super(i);
        this.f104537d = new boolean[i];
    }

    public final void add(boolean z) {
        boolean[] zArr = this.f104537d;
        int iM21109a = m21109a();
        m21110b(iM21109a + 1);
        zArr[iM21109a] = z;
    }

    @Override // p000.rbd
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int getSize(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @yfb
    public final boolean[] toArray() {
        return m21112d(this.f104537d, new boolean[m21111c()]);
    }
}
