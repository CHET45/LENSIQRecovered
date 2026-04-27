package p000;

/* JADX INFO: loaded from: classes6.dex */
public class i16 extends g16 {

    /* JADX INFO: renamed from: e */
    public byte[] f45420e;

    public i16(byte[] bArr) {
        this.f45420e = bArr;
    }

    public byte[] getBlockData() {
        return this.f45420e;
    }

    @Override // p000.g16, p000.ys0, p000.eq7
    public byte[] getParamData() {
        return this.f45420e;
    }

    public void setBlockData(byte[] bArr) {
        this.f45420e = bArr;
    }

    @Override // p000.g16, p000.ys0
    public String toString() {
        return "FirmwareUpdateBlockResponseParam{blockData=" + pk1.byte2HexStr(this.f45420e) + '}';
    }
}
