package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class t78 extends rbd<int[]> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final int[] f83948d;

    public t78(int i) {
        super(i);
        this.f83948d = new int[i];
    }

    public final void add(int i) {
        int[] iArr = this.f83948d;
        int iM21109a = m21109a();
        m21110b(iM21109a + 1);
        iArr[iM21109a] = i;
    }

    @Override // p000.rbd
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int getSize(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @yfb
    public final int[] toArray() {
        return m21112d(this.f83948d, new int[m21111c()]);
    }
}
