package p000;

import android.content.Context;
import android.graphics.Typeface;
import p000.do6;
import p000.ip6;

/* JADX INFO: loaded from: classes.dex */
@fdi
public final class fyc implements cyc {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Typeface m11233a(fyc fycVar, String str, jp6 jp6Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            jp6Var = jp6.f51403b.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = fp6.f37355b.m29582getNormal_LCdwA();
        }
        return fycVar.m29681createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, jp6Var, i);
    }

    /* JADX INFO: renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final Typeface m29681createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, jp6 jp6Var, int i) {
        if (fp6.m29575equalsimpl0(i, fp6.f37355b.m29582getNormal_LCdwA()) && md8.areEqual(jp6Var, jp6.f51403b.getNormal()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM33403getAndroidTypefaceStyleFO1MlWM = C15792ys.m33403getAndroidTypefaceStyleFO1MlWM(jp6Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM33403getAndroidTypefaceStyleFO1MlWM) : Typeface.create(str, iM33403getAndroidTypefaceStyleFO1MlWM);
    }

    /* JADX INFO: renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final Typeface m29682loadNamedFromTypefaceCacheOrNullRetOiIg(String str, jp6 jp6Var, int i) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceM29681createAndroidTypefaceUsingTypefaceStyleRetOiIg = m29681createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, jp6Var, i);
        if (md8.areEqual(typefaceM29681createAndroidTypefaceUsingTypefaceStyleRetOiIg, Typeface.create(Typeface.DEFAULT, C15792ys.m33403getAndroidTypefaceStyleFO1MlWM(jp6Var, i))) || md8.areEqual(typefaceM29681createAndroidTypefaceUsingTypefaceStyleRetOiIg, m29681createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, jp6Var, i))) {
            return null;
        }
        return typefaceM29681createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    @Override // p000.cyc
    @yfb
    /* JADX INFO: renamed from: createDefault-FO1MlWM */
    public Typeface mo28561createDefaultFO1MlWM(@yfb jp6 jp6Var, int i) {
        return m29681createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, jp6Var, i);
    }

    @Override // p000.cyc
    @yfb
    /* JADX INFO: renamed from: createNamed-RetOiIg */
    public Typeface mo28562createNamedRetOiIg(@yfb z27 z27Var, @yfb jp6 jp6Var, int i) {
        Typeface typefaceM29682loadNamedFromTypefaceCacheOrNullRetOiIg = m29682loadNamedFromTypefaceCacheOrNullRetOiIg(gyc.getWeightSuffixForFallbackFamilyName(z27Var.getName(), jp6Var), jp6Var, i);
        return typefaceM29682loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m29681createAndroidTypefaceUsingTypefaceStyleRetOiIg(z27Var.getName(), jp6Var, i) : typefaceM29682loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // p000.cyc
    @gib
    /* JADX INFO: renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public Typeface mo28563optionalOnDeviceFontFamilyByName78DK7lM(@yfb String str, @yfb jp6 jp6Var, int i, @yfb ip6.C7556e c7556e, @yfb Context context) {
        do6.C4890a c4890a = do6.f30259b;
        return gyc.setFontVariationSettings(md8.areEqual(str, c4890a.getSansSerif().getName()) ? mo28562createNamedRetOiIg(c4890a.getSansSerif(), jp6Var, i) : md8.areEqual(str, c4890a.getSerif().getName()) ? mo28562createNamedRetOiIg(c4890a.getSerif(), jp6Var, i) : md8.areEqual(str, c4890a.getMonospace().getName()) ? mo28562createNamedRetOiIg(c4890a.getMonospace(), jp6Var, i) : md8.areEqual(str, c4890a.getCursive().getName()) ? mo28562createNamedRetOiIg(c4890a.getCursive(), jp6Var, i) : m29682loadNamedFromTypefaceCacheOrNullRetOiIg(str, jp6Var, i), c7556e, context);
    }
}
