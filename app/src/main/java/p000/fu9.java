package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class fu9 extends jw4 {

    /* JADX INFO: renamed from: a */
    public final float f37782a;

    public fu9(float f) {
        this.f37782a = f - 0.001f;
    }

    @Override // p000.jw4
    /* JADX INFO: renamed from: a */
    public boolean mo11188a() {
        return true;
    }

    @Override // p000.jw4
    public void getEdgePath(float f, float f2, float f3, @efb a9f a9fVar) {
        float fSqrt = (float) ((((double) this.f37782a) * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f37782a, 2.0d) - Math.pow(fSqrt, 2.0d));
        a9fVar.reset(f2 - fSqrt, ((float) (-((((double) this.f37782a) * Math.sqrt(2.0d)) - ((double) this.f37782a)))) + fSqrt2);
        a9fVar.lineTo(f2, (float) (-((((double) this.f37782a) * Math.sqrt(2.0d)) - ((double) this.f37782a))));
        a9fVar.lineTo(f2 + fSqrt, ((float) (-((((double) this.f37782a) * Math.sqrt(2.0d)) - ((double) this.f37782a)))) + fSqrt2);
    }
}
