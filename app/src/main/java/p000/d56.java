package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class d56 extends rbd<float[]> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final float[] f28459d;

    public d56(int i) {
        super(i);
        this.f28459d = new float[i];
    }

    public final void add(float f) {
        float[] fArr = this.f28459d;
        int iM21109a = m21109a();
        m21110b(iM21109a + 1);
        fArr[iM21109a] = f;
    }

    @Override // p000.rbd
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int getSize(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @yfb
    public final float[] toArray() {
        return m21112d(this.f28459d, new float[m21111c()]);
    }
}
