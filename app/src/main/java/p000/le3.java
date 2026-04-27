package p000;

/* JADX INFO: loaded from: classes5.dex */
public class le3 extends a13 {

    /* JADX INFO: renamed from: a */
    public float f57348a;

    public le3() {
        this.f57348a = -1.0f;
    }

    @Override // p000.a13
    public void getCornerPath(@efb a9f a9fVar, float f, float f2, float f3) {
        a9fVar.reset(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        a9fVar.lineTo((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }

    @Deprecated
    public le3(float f) {
        this.f57348a = f;
    }
}
