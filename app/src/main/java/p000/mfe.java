package p000;

/* JADX INFO: loaded from: classes6.dex */
public class mfe {

    /* JADX INFO: renamed from: a */
    public final yee f60897a;

    /* JADX INFO: renamed from: b */
    public final int f60898b;

    /* JADX INFO: renamed from: c */
    public final byte[] f60899c;

    public mfe(yee yeeVar, int i, byte[] bArr) {
        this.f60897a = yeeVar;
        this.f60898b = i;
        this.f60899c = bArr;
    }

    public yee getBleDevice() {
        return this.f60897a;
    }

    public int getRssi() {
        return this.f60898b;
    }

    public byte[] getScanRecord() {
        return this.f60899c;
    }

    public String toString() {
        return "RxBleScanResult{bleDevice=" + this.f60897a + ", rssi=" + this.f60898b + ", scanRecord=" + pj9.bytesToHex(this.f60899c) + '}';
    }
}
