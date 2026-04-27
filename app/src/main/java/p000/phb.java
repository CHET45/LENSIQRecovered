package p000;

/* JADX INFO: loaded from: classes6.dex */
public class phb extends ys0 {

    /* JADX INFO: renamed from: c */
    public int f70807c;

    /* JADX INFO: renamed from: d */
    public int f70808d;

    /* JADX INFO: renamed from: e */
    public int f70809e;

    /* JADX INFO: renamed from: f */
    public int f70810f;

    /* JADX INFO: renamed from: g */
    public int f70811g;

    /* JADX INFO: renamed from: h */
    public boolean f70812h;

    /* JADX INFO: renamed from: i */
    public String f70813i;

    /* JADX INFO: renamed from: j */
    public int f70814j;

    /* JADX INFO: renamed from: k */
    public int f70815k;

    /* JADX INFO: renamed from: l */
    public int f70816l;

    /* JADX INFO: renamed from: m */
    public boolean f70817m;

    /* JADX INFO: renamed from: n */
    public int f70818n;

    /* JADX INFO: renamed from: o */
    public boolean f70819o;

    /* JADX INFO: renamed from: p */
    public int f70820p;

    /* JADX INFO: renamed from: q */
    public boolean f70821q;

    public int getAction() {
        return this.f70815k;
    }

    public int getChargingBinQuantity() {
        return this.f70820p;
    }

    public int getDeviceType() {
        return this.f70810f;
    }

    public String getEdrAddr() {
        return this.f70813i;
    }

    public int getLeftDeviceQuantity() {
        return this.f70816l;
    }

    @Override // p000.ys0, p000.eq7
    public byte[] getParamData() {
        byte[] bArr = new byte[18];
        byte[] bArrInt2byte2 = pk1.int2byte2(this.f70808d);
        System.arraycopy(bArrInt2byte2, 0, bArr, 0, bArrInt2byte2.length);
        int length = bArrInt2byte2.length;
        byte[] bArrInt2byte22 = pk1.int2byte2(this.f70809e);
        System.arraycopy(bArrInt2byte22, 0, bArr, length, bArrInt2byte22.length);
        int length2 = length + bArrInt2byte22.length;
        byte[] bArrInt2byte23 = pk1.int2byte2(this.f70807c);
        System.arraycopy(bArrInt2byte23, 0, bArr, length2, bArrInt2byte23.length);
        int length3 = length2 + bArrInt2byte23.length;
        bArr[length3] = (byte) ((this.f70810f << 4) | (this.f70811g & 15));
        int i = length3 + 1;
        byte[] bArrAddressCovertToByteArray = v91.addressCovertToByteArray(this.f70813i);
        if (bArrAddressCovertToByteArray != null && bArrAddressCovertToByteArray.length == 6) {
            System.arraycopy(bArrAddressCovertToByteArray, 0, bArr, i, bArrAddressCovertToByteArray.length);
            i = length3 + 7;
        }
        bArr[i] = pk1.intToByte(this.f70815k);
        bArr[i + 1] = this.f70817m ? (byte) -128 : (byte) 0;
        bArr[i + 2] = this.f70819o ? (byte) -128 : (byte) 0;
        bArr[i + 3] = this.f70821q ? (byte) -128 : (byte) 0;
        bArr[i + 4] = pk1.intToByte(this.f70814j);
        return bArr;
    }

    public int getPid() {
        return this.f70807c;
    }

    public int getRightDeviceQuantity() {
        return this.f70818n;
    }

    public int getSeq() {
        return this.f70814j;
    }

    public int getUid() {
        return this.f70809e;
    }

    public int getVersion() {
        return this.f70811g;
    }

    public int getVid() {
        return this.f70808d;
    }

    public boolean isDeviceCharging() {
        return this.f70821q;
    }

    public boolean isLeftCharging() {
        return this.f70817m;
    }

    public boolean isRightCharging() {
        return this.f70819o;
    }

    public boolean isShowDialog() {
        return this.f70812h;
    }

    public phb setAction(int i) {
        this.f70815k = i;
        return this;
    }

    public phb setChargingBinQuantity(int i) {
        this.f70820p = i;
        return this;
    }

    public phb setDeviceCharging(boolean z) {
        this.f70821q = z;
        return this;
    }

    public phb setDeviceType(int i) {
        this.f70810f = i;
        return this;
    }

    public phb setEdrAddr(String str) {
        this.f70813i = str;
        return this;
    }

    public phb setLeftCharging(boolean z) {
        this.f70817m = z;
        return this;
    }

    public phb setLeftDeviceQuantity(int i) {
        this.f70816l = i;
        return this;
    }

    public phb setPid(int i) {
        this.f70807c = i;
        return this;
    }

    public phb setRightCharging(boolean z) {
        this.f70819o = z;
        return this;
    }

    public phb setRightDeviceQuantity(int i) {
        this.f70818n = i;
        return this;
    }

    public phb setSeq(int i) {
        this.f70814j = i;
        return this;
    }

    public phb setShowDialog(boolean z) {
        this.f70812h = z;
        return this;
    }

    public phb setUid(int i) {
        this.f70809e = i;
        return this;
    }

    public phb setVersion(int i) {
        this.f70811g = i;
        return this;
    }

    public phb setVid(int i) {
        this.f70808d = i;
        return this;
    }

    @Override // p000.ys0
    public String toString() {
        return "NotifyAdvInfoParam{pid=" + this.f70807c + ", vid=" + this.f70808d + ", uid=" + this.f70809e + ", chipType=" + this.f70810f + ", version=" + this.f70811g + ", showDialog=" + this.f70812h + ", edrAddr='" + this.f70813i + "', seq=" + this.f70814j + ", action=" + this.f70815k + ", leftDeviceQuantity=" + this.f70816l + ", isLeftCharging=" + this.f70817m + ", rightDeviceQuantity=" + this.f70818n + ", isRightCharging=" + this.f70819o + ", chargingBinQuantity=" + this.f70820p + ", isDeviceCharging=" + this.f70821q + "} " + super.toString();
    }
}
