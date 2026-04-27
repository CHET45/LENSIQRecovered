package p000;

/* JADX INFO: loaded from: classes6.dex */
public class bch {

    /* JADX INFO: renamed from: a */
    public boolean f13368a;

    /* JADX INFO: renamed from: b */
    public jbh f13369b;

    public bch(boolean isSelect, jbh transMachineRecord) {
        this.f13368a = isSelect;
        this.f13369b = transMachineRecord;
    }

    public jbh getTransMachineRecord() {
        return this.f13369b;
    }

    public boolean isSelect() {
        return this.f13368a;
    }

    public void setSelect(boolean select) {
        this.f13368a = select;
    }

    public void setTransMachineRecord(jbh transMachineRecord) {
        this.f13369b = transMachineRecord;
    }
}
