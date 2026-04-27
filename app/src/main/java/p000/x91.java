package p000;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class x91 extends ozd {

    /* JADX INFO: renamed from: b */
    @gib
    public final ozd f97238b;

    /* JADX INFO: renamed from: c */
    public final float f97239c;

    /* JADX INFO: renamed from: d */
    public final float f97240d;

    /* JADX INFO: renamed from: e */
    public final int f97241e;

    public /* synthetic */ x91(ozd ozdVar, float f, float f2, int i, jt3 jt3Var) {
        this(ozdVar, f, f2, i);
    }

    @Override // p000.ozd
    @c5e(31)
    @yfb
    /* JADX INFO: renamed from: a */
    public RenderEffect mo16479a() {
        return uzd.f89595a.m32674createBlurEffect8A3gB4(this.f97238b, this.f97239c, this.f97240d, this.f97241e);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x91)) {
            return false;
        }
        x91 x91Var = (x91) obj;
        return this.f97239c == x91Var.f97239c && this.f97240d == x91Var.f97240d && tzg.m32472equalsimpl0(this.f97241e, x91Var.f97241e) && md8.areEqual(this.f97238b, x91Var.f97238b);
    }

    public int hashCode() {
        ozd ozdVar = this.f97238b;
        return ((((((ozdVar != null ? ozdVar.hashCode() : 0) * 31) + Float.hashCode(this.f97239c)) * 31) + Float.hashCode(this.f97240d)) * 31) + tzg.m32473hashCodeimpl(this.f97241e);
    }

    @yfb
    public String toString() {
        return "BlurEffect(renderEffect=" + this.f97238b + ", radiusX=" + this.f97239c + ", radiusY=" + this.f97240d + ", edgeTreatment=" + ((Object) tzg.m32474toStringimpl(this.f97241e)) + ')';
    }

    private x91(ozd ozdVar, float f, float f2, int i) {
        super(null);
        this.f97238b = ozdVar;
        this.f97239c = f;
        this.f97240d = f2;
        this.f97241e = i;
    }

    public /* synthetic */ x91(ozd ozdVar, float f, float f2, int i, int i2, jt3 jt3Var) {
        this(ozdVar, f, (i2 & 4) != 0 ? f : f2, (i2 & 8) != 0 ? tzg.f86446b.m32476getClamp3opZhB0() : i, null);
    }
}
