package p000;

/* JADX INFO: loaded from: classes6.dex */
public class shb extends ys0 {

    /* JADX INFO: renamed from: c */
    public int f81839c;

    /* JADX INFO: renamed from: d */
    public int f81840d;

    public shb(int i, int i2) {
        this.f81839c = i;
        this.f81840d = i2;
    }

    @Override // p000.ys0, p000.eq7
    public byte[] getParamData() {
        return new byte[]{(byte) this.f81839c, (byte) this.f81840d};
    }

    public int getReconnect() {
        return this.f81840d;
    }

    public int getWay() {
        return this.f81839c;
    }

    @Override // p000.ys0
    public String toString() {
        return "NotifyCommunicationWayParam{way=" + this.f81839c + "reconnect=" + this.f81840d + '}';
    }
}
