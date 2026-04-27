package p000;

/* JADX INFO: loaded from: classes6.dex */
public class jd3 extends jc2 {

    /* JADX INFO: renamed from: c */
    public byte[] f50348c;

    public jd3(byte[] bArr) {
        this.f50348c = bArr;
    }

    public byte[] getData() {
        return this.f50348c;
    }

    public void setData(byte[] bArr) {
        this.f50348c = bArr;
    }

    @Override // p000.jc2
    public String toString() {
        return "CustomParam{data=" + pk1.byte2HexStr(this.f50348c) + '}';
    }

    public jd3() {
    }
}
