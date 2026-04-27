package p000;

/* JADX INFO: loaded from: classes6.dex */
public class e57 extends ys0 {

    /* JADX INFO: renamed from: c */
    public int f31841c;

    /* JADX INFO: renamed from: d */
    public byte f31842d;

    public e57(int i) {
        this.f31841c = i;
        setPlatform((byte) 0);
    }

    public int getMask() {
        return this.f31841c;
    }

    @Override // p000.ys0, p000.eq7
    public byte[] getParamData() {
        byte[] bArr = new byte[5];
        byte[] bArrIntToBigBytes = pk1.intToBigBytes(this.f31841c);
        System.arraycopy(bArrIntToBigBytes, 0, bArr, 0, bArrIntToBigBytes.length);
        bArr[4] = this.f31842d;
        return bArr;
    }

    public byte getPlatform() {
        return this.f31842d;
    }

    public e57 setMask(int i) {
        this.f31841c = i;
        return this;
    }

    public e57 setPlatform(byte b) {
        this.f31842d = b;
        return this;
    }

    @Override // p000.ys0
    public String toString() {
        return "GetTargetInfoParam{mask=" + this.f31841c + '}';
    }
}
