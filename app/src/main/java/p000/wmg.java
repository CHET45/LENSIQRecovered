package p000;

/* JADX INFO: loaded from: classes6.dex */
public class wmg extends jc2 {

    /* JADX INFO: renamed from: c */
    public int f94777c;

    public wmg() {
    }

    public int getMask() {
        return this.f94777c;
    }

    public void setMask(int i) {
        this.f94777c = i;
    }

    @Override // p000.jc2
    public String toString() {
        return "GetTargetFeatureMapResponse{mask=" + this.f94777c + '}';
    }

    public wmg(int i) {
        setMask(i);
    }
}
