package p000;

import android.content.Context;
import android.graphics.Typeface;
import p000.ip6;

/* JADX INFO: loaded from: classes.dex */
public final class i84 extends AbstractC11083ps {

    /* JADX INFO: renamed from: g */
    @yfb
    public final String f46018g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final jp6 f46019h;

    /* JADX INFO: renamed from: i */
    public final int f46020i;

    public /* synthetic */ i84(String str, jp6 jp6Var, int i, ip6.C7556e c7556e, jt3 jt3Var) {
        this(str, jp6Var, i, c7556e);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i84)) {
            return false;
        }
        i84 i84Var = (i84) obj;
        return h84.m29954equalsimpl0(this.f46018g, i84Var.f46018g) && md8.areEqual(getWeight(), i84Var.getWeight()) && fp6.m29575equalsimpl0(mo30175getStyle_LCdwA(), i84Var.mo30175getStyle_LCdwA()) && md8.areEqual(getVariationSettings(), i84Var.getVariationSettings());
    }

    @Override // p000.xn6
    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    public int mo30175getStyle_LCdwA() {
        return this.f46020i;
    }

    @Override // p000.xn6
    @yfb
    public jp6 getWeight() {
        return this.f46019h;
    }

    public int hashCode() {
        return (((((h84.m29955hashCodeimpl(this.f46018g) * 31) + getWeight().hashCode()) * 31) + fp6.m29576hashCodeimpl(mo30175getStyle_LCdwA())) * 31) + getVariationSettings().hashCode();
    }

    @gib
    public final Typeface loadCached(@yfb Context context) {
        return gyc.PlatformTypefaces().mo28563optionalOnDeviceFontFamilyByName78DK7lM(this.f46018g, getWeight(), mo30175getStyle_LCdwA(), getVariationSettings(), context);
    }

    @yfb
    public String toString() {
        return "Font(familyName=\"" + ((Object) h84.m29956toStringimpl(this.f46018g)) + "\", weight=" + getWeight() + ", style=" + ((Object) fp6.m29577toStringimpl(mo30175getStyle_LCdwA())) + ')';
    }

    private i84(String str, jp6 jp6Var, int i, ip6.C7556e c7556e) {
        super(oo6.f68233b.m31525getOptionalLocalPKNRLFQ(), z8b.f104379a, c7556e, null);
        this.f46018g = str;
        this.f46019h = jp6Var;
        this.f46020i = i;
    }
}
