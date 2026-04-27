package p000;

/* JADX INFO: loaded from: classes6.dex */
public class esd extends ys0 {

    /* JADX INFO: renamed from: c */
    public int f33969c;

    public esd(int i) {
        this.f33969c = i;
    }

    @Override // p000.ys0, p000.eq7
    public byte[] getParamData() {
        return new byte[]{(byte) this.f33969c};
    }

    @Override // p000.ys0
    public String toString() {
        return "RebootDeviceParam{param=" + this.f33969c + '}';
    }
}
