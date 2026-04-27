package p000;

/* JADX INFO: loaded from: classes6.dex */
public class v95 extends jc2 {

    /* JADX INFO: renamed from: c */
    public int f90369c;

    public v95(int i) {
        this.f90369c = i;
    }

    public int getResult() {
        return this.f90369c;
    }

    @Override // p000.jc2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExitUpdateModeResponse{rawData size =");
        sb.append(getRawData() == null ? 0 : getRawData().length);
        sb.append("\nxmOpCode=");
        sb.append(getXmOpCode());
        sb.append("\nresult=");
        sb.append(this.f90369c);
        sb.append('}');
        return sb.toString();
    }
}
