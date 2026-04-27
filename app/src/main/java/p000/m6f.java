package p000;

/* JADX INFO: loaded from: classes6.dex */
public class m6f extends ys0 {

    /* JADX INFO: renamed from: c */
    public int f60027c;

    public m6f(int i) {
        this.f60027c = i;
    }

    public int getOp() {
        return this.f60027c;
    }

    @Override // p000.ys0, p000.eq7
    public byte[] getParamData() {
        return new byte[]{(byte) this.f60027c};
    }

    public m6f setOp(int i) {
        this.f60027c = i;
        return this;
    }

    @Override // p000.ys0
    public String toString() {
        return "SetDeviceNotifyAdvInfoParam{op=" + this.f60027c + "} " + super.toString();
    }
}
