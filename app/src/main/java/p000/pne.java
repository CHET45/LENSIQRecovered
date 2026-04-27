package p000;

/* JADX INFO: loaded from: classes6.dex */
public class pne {

    /* JADX INFO: renamed from: a */
    public final yee f71503a;

    /* JADX INFO: renamed from: b */
    public final int f71504b;

    /* JADX INFO: renamed from: c */
    public final long f71505c;

    /* JADX INFO: renamed from: d */
    public final zme f71506d;

    /* JADX INFO: renamed from: e */
    public final jne f71507e;

    /* JADX INFO: renamed from: f */
    public final gf8 f71508f;

    public pne(yee yeeVar, int i, long j, zme zmeVar, jne jneVar, gf8 gf8Var) {
        this.f71503a = yeeVar;
        this.f71504b = i;
        this.f71505c = j;
        this.f71506d = zmeVar;
        this.f71507e = jneVar;
        this.f71508f = gf8Var;
    }

    public yee getBleDevice() {
        return this.f71503a;
    }

    public zme getCallbackType() {
        return this.f71506d;
    }

    public int getRssi() {
        return this.f71504b;
    }

    public jne getScanRecord() {
        return this.f71507e;
    }

    public long getTimestampNanos() {
        return this.f71505c;
    }

    public gf8 isConnectable() {
        return this.f71508f;
    }

    @efb
    public String toString() {
        return "ScanResult{bleDevice=" + this.f71503a + ", rssi=" + this.f71504b + ", timestampNanos=" + this.f71505c + ", callbackType=" + this.f71506d + ", scanRecord=" + pj9.bytesToHex(this.f71507e.getBytes()) + ", isConnectable=" + this.f71508f + '}';
    }
}
