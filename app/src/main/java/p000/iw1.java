package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class iw1 extends rbd<char[]> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final char[] f48644d;

    public iw1(int i) {
        super(i);
        this.f48644d = new char[i];
    }

    public final void add(char c) {
        char[] cArr = this.f48644d;
        int iM21109a = m21109a();
        m21110b(iM21109a + 1);
        cArr[iM21109a] = c;
    }

    @Override // p000.rbd
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int getSize(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @yfb
    public final char[] toArray() {
        return m21112d(this.f48644d, new char[m21111c()]);
    }
}
