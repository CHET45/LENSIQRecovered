package p000;

/* JADX INFO: loaded from: classes6.dex */
public class vhb extends ys0 {

    /* JADX INFO: renamed from: c */
    public int f91200c;

    /* JADX INFO: renamed from: d */
    public int f91201d = 0;

    public vhb(int i) {
        this.f91200c = i;
    }

    public int getContentSize() {
        return this.f91200c;
    }

    public int getCurrentProgress() {
        return this.f91201d;
    }

    @Override // p000.ys0, p000.eq7
    public byte[] getParamData() {
        if (this.f91201d <= 0) {
            return pk1.intToBigBytes(this.f91200c);
        }
        byte[] bArr = new byte[8];
        byte[] bArrIntToBigBytes = pk1.intToBigBytes(this.f91200c);
        byte[] bArrIntToBigBytes2 = pk1.intToBigBytes(this.f91201d);
        System.arraycopy(bArrIntToBigBytes, 0, bArr, 0, bArrIntToBigBytes.length);
        System.arraycopy(bArrIntToBigBytes2, 0, bArr, bArrIntToBigBytes.length, bArrIntToBigBytes2.length);
        return bArr;
    }

    public vhb setContentSize(int i) {
        this.f91200c = i;
        return this;
    }

    public vhb setCurrentProgress(int i) {
        this.f91201d = i;
        return this;
    }

    @Override // p000.ys0
    public String toString() {
        return "NotifyUpdateContentSizeParam{contentSize=" + this.f91200c + ", currentProgress=" + this.f91201d + "} " + super.toString();
    }
}
