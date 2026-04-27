package p000;

/* JADX INFO: loaded from: classes6.dex */
public class n7f extends ys0 {

    /* JADX INFO: renamed from: c */
    public int f63465c;

    public n7f(int i) {
        this.f63465c = i;
    }

    public int getMtu() {
        return this.f63465c;
    }

    @Override // p000.ys0, p000.eq7
    public byte[] getParamData() {
        return pk1.int2byte2(this.f63465c);
    }

    public void setMtu(int i) {
        this.f63465c = i;
    }
}
