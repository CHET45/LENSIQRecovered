package p000;

/* JADX INFO: loaded from: classes6.dex */
public class j91 {

    /* JADX INFO: renamed from: o */
    public static final int f49948o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f49949p = 0;

    /* JADX INFO: renamed from: c */
    public boolean f49952c;

    /* JADX INFO: renamed from: g */
    public String f49956g;

    /* JADX INFO: renamed from: h */
    public byte[] f49957h;

    /* JADX INFO: renamed from: i */
    public sp7 f49958i;

    /* JADX INFO: renamed from: j */
    public boolean f49959j;

    /* JADX INFO: renamed from: k */
    @Deprecated
    public String f49960k;

    /* JADX INFO: renamed from: a */
    public int f49950a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f49951b = false;

    /* JADX INFO: renamed from: d */
    public int f49953d = 500;

    /* JADX INFO: renamed from: e */
    public int f49954e = 3000;

    /* JADX INFO: renamed from: f */
    public boolean f49955f = false;

    /* JADX INFO: renamed from: l */
    public int f49961l = 20;

    /* JADX INFO: renamed from: m */
    public boolean f49962m = false;

    /* JADX INFO: renamed from: n */
    public int f49963n = 0;

    public static j91 createDefault() {
        return new j91().setPriority(0).setBleIntervalMs(500).setTimeoutMs(3000).setUseAuthDevice(false).setUseReconnect(false).setMtu(20).setUseJLServer(false).setNeedChangeMtu(false);
    }

    public int getBleIntervalMs() {
        return this.f49953d;
    }

    public int getBleScanMode() {
        return this.f49963n;
    }

    public byte[] getFirmwareFileData() {
        return this.f49957h;
    }

    public String getFirmwareFilePath() {
        return this.f49956g;
    }

    public int getMtu() {
        return this.f49961l;
    }

    public int getPriority() {
        return this.f49950a;
    }

    @Deprecated
    public String getScanFilterData() {
        return this.f49960k;
    }

    public sp7 getSnGenerator() {
        return this.f49958i;
    }

    public int getTimeoutMs() {
        return this.f49954e;
    }

    public boolean isNeedChangeMtu() {
        return this.f49962m;
    }

    public boolean isPriorityCallbackOtaFinish() {
        return this.f49959j;
    }

    public boolean isUseAuthDevice() {
        return this.f49952c;
    }

    public boolean isUseJLServer() {
        return this.f49955f;
    }

    public boolean isUseReconnect() {
        return this.f49951b;
    }

    public j91 setBleIntervalMs(int i) {
        this.f49953d = i;
        return this;
    }

    public j91 setBleScanMode(int i) {
        this.f49963n = i;
        return this;
    }

    public j91 setFirmwareFileData(byte[] bArr) {
        this.f49957h = bArr;
        return this;
    }

    public j91 setFirmwareFilePath(String str) {
        this.f49956g = str;
        return this;
    }

    public j91 setMtu(int i) {
        this.f49961l = i;
        return this;
    }

    public j91 setNeedChangeMtu(boolean z) {
        this.f49962m = z;
        return this;
    }

    public j91 setPriority(int i) {
        this.f49950a = i;
        return this;
    }

    public j91 setPriorityCallbackOtaFinish(boolean z) {
        this.f49959j = z;
        return this;
    }

    @Deprecated
    public j91 setScanFilterData(String str) {
        this.f49960k = str;
        return this;
    }

    public j91 setSnGenerator(sp7 sp7Var) {
        this.f49958i = sp7Var;
        return this;
    }

    public j91 setTimeoutMs(int i) {
        if (i < 500) {
            i = 500;
        }
        this.f49954e = i;
        return this;
    }

    public j91 setUseAuthDevice(boolean z) {
        this.f49952c = z;
        return this;
    }

    public j91 setUseJLServer(boolean z) {
        this.f49955f = z;
        return this;
    }

    public j91 setUseReconnect(boolean z) {
        this.f49951b = z;
        return this;
    }

    @efb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BluetoothOTAConfigure{priority=");
        sb.append(this.f49950a);
        sb.append(", isUseReconnect=");
        sb.append(this.f49951b);
        sb.append(", isUseAuthDevice=");
        sb.append(this.f49952c);
        sb.append(", bleIntervalMs=");
        sb.append(this.f49953d);
        sb.append(", timeoutMs=");
        sb.append(this.f49954e);
        sb.append(", isUseJLServer=");
        sb.append(this.f49955f);
        sb.append(", firmwareFilePath='");
        sb.append(this.f49956g);
        sb.append('\'');
        sb.append(", scanFilterData='");
        sb.append(this.f49960k);
        sb.append('\'');
        sb.append(", mtu=");
        sb.append(this.f49961l);
        sb.append(", isNeedChangeMtu=");
        sb.append(this.f49962m);
        sb.append(", bleScanMode=");
        sb.append(this.f49963n);
        sb.append(", firmwareFileData= ");
        byte[] bArr = this.f49957h;
        sb.append(bArr == null ? 0 : bArr.length);
        sb.append(", snGenerator=");
        sb.append(this.f49958i);
        sb.append(", isPriorityCallbackOtaFinish=");
        sb.append(this.f49959j);
        sb.append('}');
        return sb.toString();
    }
}
