package p000;

/* JADX INFO: loaded from: classes3.dex */
public class w87 {

    /* JADX INFO: renamed from: a */
    public final float[] f93611a;

    /* JADX INFO: renamed from: b */
    public final int[] f93612b;

    public w87(float[] fArr, int[] iArr) {
        this.f93611a = fArr;
        this.f93612b = iArr;
    }

    public int[] getColors() {
        return this.f93612b;
    }

    public float[] getPositions() {
        return this.f93611a;
    }

    public int getSize() {
        return this.f93612b.length;
    }

    public void lerp(w87 w87Var, w87 w87Var2, float f) {
        if (w87Var.f93612b.length == w87Var2.f93612b.length) {
            for (int i = 0; i < w87Var.f93612b.length; i++) {
                this.f93611a[i] = awa.lerp(w87Var.f93611a[i], w87Var2.f93611a[i], f);
                this.f93612b[i] = i27.evaluate(f, w87Var.f93612b[i], w87Var2.f93612b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + w87Var.f93612b.length + " vs " + w87Var2.f93612b.length + c0b.f15434d);
    }
}
