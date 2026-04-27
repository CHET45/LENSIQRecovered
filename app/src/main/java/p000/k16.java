package p000;

/* JADX INFO: loaded from: classes6.dex */
public class k16 extends jc2 {

    /* JADX INFO: renamed from: c */
    public int f52368c;

    public k16(int i) {
        this.f52368c = i;
    }

    public int getResult() {
        return this.f52368c;
    }

    @Override // p000.jc2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FirmwareUpdateStatusResponse{rawData size =");
        sb.append(getRawData() == null ? 0 : getRawData().length);
        sb.append("\nxmOpCode=");
        sb.append(getXmOpCode());
        sb.append("\nresult=");
        sb.append(this.f52368c);
        sb.append('}');
        return sb.toString();
    }
}
