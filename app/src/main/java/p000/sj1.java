package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class sj1 extends rbd<byte[]> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final byte[] f81947d;

    public sj1(int i) {
        super(i);
        this.f81947d = new byte[i];
    }

    public final void add(byte b) {
        byte[] bArr = this.f81947d;
        int iM21109a = m21109a();
        m21110b(iM21109a + 1);
        bArr[iM21109a] = b;
    }

    @Override // p000.rbd
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int getSize(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @yfb
    public final byte[] toArray() {
        return m21112d(this.f81947d, new byte[m21111c()]);
    }
}
