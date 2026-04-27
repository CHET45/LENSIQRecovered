package p000;

/* JADX INFO: loaded from: classes.dex */
public class zud {

    /* JADX INFO: renamed from: a */
    public int f106131a;

    /* JADX INFO: renamed from: b */
    public int f106132b;

    /* JADX INFO: renamed from: c */
    public int f106133c;

    /* JADX INFO: renamed from: d */
    public int f106134d;

    /* JADX INFO: renamed from: a */
    public void m27098a(int i, int i2) {
        this.f106131a -= i;
        this.f106132b -= i2;
        this.f106133c += i * 2;
        this.f106134d += i2 * 2;
    }

    /* JADX INFO: renamed from: b */
    public boolean m27099b(zud zudVar) {
        int i;
        int i2;
        int i3 = this.f106131a;
        int i4 = zudVar.f106131a;
        return i3 >= i4 && i3 < i4 + zudVar.f106133c && (i = this.f106132b) >= (i2 = zudVar.f106132b) && i < i2 + zudVar.f106134d;
    }

    public boolean contains(int i, int i2) {
        int i3;
        int i4 = this.f106131a;
        return i >= i4 && i < i4 + this.f106133c && i2 >= (i3 = this.f106132b) && i2 < i3 + this.f106134d;
    }

    public int getCenterX() {
        return (this.f106131a + this.f106133c) / 2;
    }

    public int getCenterY() {
        return (this.f106132b + this.f106134d) / 2;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        this.f106131a = i;
        this.f106132b = i2;
        this.f106133c = i3;
        this.f106134d = i4;
    }
}
