package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class kzb extends jw4 {

    /* JADX INFO: renamed from: a */
    public final jw4 f55720a;

    /* JADX INFO: renamed from: b */
    public final float f55721b;

    public kzb(@efb jw4 jw4Var, float f) {
        this.f55720a = jw4Var;
        this.f55721b = f;
    }

    @Override // p000.jw4
    /* JADX INFO: renamed from: a */
    public boolean mo11188a() {
        return this.f55720a.mo11188a();
    }

    @Override // p000.jw4
    public void getEdgePath(float f, float f2, float f3, @efb a9f a9fVar) {
        this.f55720a.getEdgePath(f, f2 - this.f55721b, f3, a9fVar);
    }
}
