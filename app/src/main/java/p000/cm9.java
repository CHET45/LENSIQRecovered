package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class cm9 extends rbd<long[]> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final long[] f16951d;

    public cm9(int i) {
        super(i);
        this.f16951d = new long[i];
    }

    public final void add(long j) {
        long[] jArr = this.f16951d;
        int iM21109a = m21109a();
        m21110b(iM21109a + 1);
        jArr[iM21109a] = j;
    }

    @Override // p000.rbd
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int getSize(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @yfb
    public final long[] toArray() {
        return m21112d(this.f16951d, new long[m21111c()]);
    }
}
