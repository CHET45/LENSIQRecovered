package p000;

import p000.f2g;

/* JADX INFO: loaded from: classes.dex */
public class st1 extends oj7 {

    /* JADX INFO: renamed from: n0 */
    public float f82802n0;

    /* JADX INFO: renamed from: o0 */
    public f2g.EnumC5562b f82803o0;

    public st1(f2g f2gVar, f2g.EnumC5565e enumC5565e) {
        super(f2gVar, enumC5565e);
        this.f82802n0 = 0.5f;
        this.f82803o0 = f2g.EnumC5562b.SPREAD;
    }

    public float getBias() {
        return this.f82802n0;
    }

    public f2g.EnumC5562b getStyle() {
        return f2g.EnumC5562b.SPREAD;
    }

    public st1 style(f2g.EnumC5562b enumC5562b) {
        this.f82803o0 = enumC5562b;
        return this;
    }

    @Override // p000.gu2
    public st1 bias(float f) {
        this.f82802n0 = f;
        return this;
    }
}
