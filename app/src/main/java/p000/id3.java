package p000;

/* JADX INFO: loaded from: classes6.dex */
public class id3 extends ys0 {

    /* JADX INFO: renamed from: c */
    public byte[] f46531c;

    public id3(byte[] bArr) {
        this.f46531c = bArr;
    }

    public byte[] getData() {
        return this.f46531c;
    }

    @Override // p000.ys0, p000.eq7
    public byte[] getParamData() {
        byte[] bArr = this.f46531c;
        return bArr == null ? new byte[0] : bArr;
    }

    public void setData(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.f46531c = bArr;
    }

    @Override // p000.ys0
    public String toString() {
        return "CustomParam{data=" + pk1.byte2HexStr(this.f46531c) + '}';
    }

    public id3() {
    }
}
