package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class waf extends rbd<short[]> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final short[] f93828d;

    public waf(int i) {
        super(i);
        this.f93828d = new short[i];
    }

    public final void add(short s) {
        short[] sArr = this.f93828d;
        int iM21109a = m21109a();
        m21110b(iM21109a + 1);
        sArr[iM21109a] = s;
    }

    @Override // p000.rbd
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int getSize(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @yfb
    public final short[] toArray() {
        return m21112d(this.f93828d, new short[m21111c()]);
    }
}
