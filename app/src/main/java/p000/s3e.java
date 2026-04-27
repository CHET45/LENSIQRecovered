package p000;

/* JADX INFO: loaded from: classes6.dex */
public class s3e extends ys0 {

    /* JADX INFO: renamed from: c */
    public int f80554c;

    public s3e(int i) {
        this.f80554c = i;
    }

    public int getOp() {
        return this.f80554c;
    }

    @Override // p000.ys0, p000.eq7
    public byte[] getParamData() {
        return new byte[pk1.intToByte(this.f80554c)];
    }

    public s3e setOp(int i) {
        this.f80554c = i;
        return this;
    }

    @Override // p000.ys0
    public String toString() {
        return "RequestAdvOpParam{op=" + this.f80554c + "} " + super.toString();
    }
}
