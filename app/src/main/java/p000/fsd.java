package p000;

/* JADX INFO: loaded from: classes6.dex */
public class fsd extends jc2 {

    /* JADX INFO: renamed from: c */
    public int f37614c;

    public fsd(int i) {
        this.f37614c = i;
    }

    public int getResult() {
        return this.f37614c;
    }

    @Override // p000.jc2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RebootDeviceResponse{rawData size =");
        sb.append(getRawData() == null ? 0 : getRawData().length);
        sb.append("\nxmOpCode=");
        sb.append(getXmOpCode());
        sb.append("\nresult=");
        sb.append(this.f37614c);
        sb.append('}');
        return sb.toString();
    }
}
