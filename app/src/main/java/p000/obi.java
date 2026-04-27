package p000;

/* JADX INFO: loaded from: classes.dex */
public class obi {

    /* JADX INFO: renamed from: a */
    public float f67108a;

    /* JADX INFO: renamed from: b */
    public int f67109b;

    /* JADX INFO: renamed from: c */
    public int f67110c;

    /* JADX INFO: renamed from: d */
    public int f67111d;

    /* JADX INFO: renamed from: e */
    public int f67112e;

    public void getState(d0b d0bVar) {
        this.f67109b = d0bVar.getLeft();
        this.f67110c = d0bVar.getTop();
        this.f67111d = d0bVar.getRight();
        this.f67112e = d0bVar.getBottom();
        this.f67108a = (int) d0bVar.getRotationZ();
    }

    public int height() {
        return this.f67112e - this.f67110c;
    }

    public int width() {
        return this.f67111d - this.f67109b;
    }
}
