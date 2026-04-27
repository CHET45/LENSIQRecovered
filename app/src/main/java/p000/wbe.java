package p000;

/* JADX INFO: loaded from: classes5.dex */
public class wbe extends a13 {

    /* JADX INFO: renamed from: a */
    public float f93911a;

    public wbe() {
        this.f93911a = -1.0f;
    }

    @Override // p000.a13
    public void getCornerPath(@efb a9f a9fVar, float f, float f2, float f3) {
        a9fVar.reset(0.0f, f3 * f2, 180.0f, 180.0f - f);
        float f4 = f3 * 2.0f * f2;
        a9fVar.addArc(0.0f, 0.0f, f4, f4, 180.0f, f);
    }

    @Deprecated
    public wbe(float f) {
        this.f93911a = f;
    }
}
