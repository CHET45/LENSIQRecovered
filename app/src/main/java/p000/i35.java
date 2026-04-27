package p000;

/* JADX INFO: loaded from: classes6.dex */
public class i35 extends jc2 {

    /* JADX INFO: renamed from: c */
    public int f45574c;

    public i35(int i) {
        this.f45574c = i;
    }

    public int getCanUpdateFlag() {
        return this.f45574c;
    }

    @Override // p000.jc2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EnterUpdateModeResponse{rawData size =");
        sb.append(getRawData() == null ? 0 : getRawData().length);
        sb.append("\nxmOpCode=");
        sb.append(getXmOpCode());
        sb.append("\ncanUpdateFlag=");
        sb.append(this.f45574c);
        sb.append('}');
        return sb.toString();
    }
}
