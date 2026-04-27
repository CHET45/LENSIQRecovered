package p000;

/* JADX INFO: loaded from: classes6.dex */
public class fc0 {

    /* JADX INFO: renamed from: a */
    public byte f36070a;

    /* JADX INFO: renamed from: b */
    public byte[] f36071b;

    public byte[] getAttrData() {
        return this.f36071b;
    }

    public byte[] getData() {
        byte[] bArr = this.f36071b;
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 2];
        bArr2[0] = (byte) (length + 1);
        bArr2[1] = this.f36070a;
        System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        return bArr2;
    }

    public byte getType() {
        return this.f36070a;
    }

    public fc0 setAttrData(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.f36071b = bArr;
        return this;
    }

    public fc0 setType(byte b) {
        this.f36070a = b;
        return this;
    }

    public String toString() {
        return "AttrBean{type=" + ((int) this.f36070a) + ", attrData=" + pk1.byte2HexStr(this.f36071b) + '}';
    }
}
