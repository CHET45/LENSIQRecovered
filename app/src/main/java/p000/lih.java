package p000;

/* JADX INFO: loaded from: classes5.dex */
public class lih extends jw4 {

    /* JADX INFO: renamed from: a */
    public final float f57716a;

    /* JADX INFO: renamed from: b */
    public final boolean f57717b;

    public lih(float f, boolean z) {
        this.f57716a = f;
        this.f57717b = z;
    }

    @Override // p000.jw4
    public void getEdgePath(float f, float f2, float f3, @efb a9f a9fVar) {
        if (!this.f57717b) {
            float f4 = this.f57716a;
            a9fVar.lineTo(f2 - (f4 * f3), 0.0f, f2, (-f4) * f3);
            a9fVar.lineTo(f2 + (this.f57716a * f3), 0.0f, f, 0.0f);
        } else {
            a9fVar.lineTo(f2 - (this.f57716a * f3), 0.0f);
            float f5 = this.f57716a;
            a9fVar.lineTo(f2, f5 * f3, (f5 * f3) + f2, 0.0f);
            a9fVar.lineTo(f, 0.0f);
        }
    }
}
