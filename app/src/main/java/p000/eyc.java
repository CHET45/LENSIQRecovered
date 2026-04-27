package p000;

import android.content.Context;
import android.graphics.Typeface;
import p000.do6;
import p000.fp6;
import p000.ip6;

/* JADX INFO: loaded from: classes.dex */
@c5e(28)
@fdi
public final class eyc implements cyc {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Typeface m10377a(eyc eycVar, String str, jp6 jp6Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return eycVar.m28877createAndroidTypefaceApi28RetOiIg(str, jp6Var, i);
    }

    /* JADX INFO: renamed from: createAndroidTypefaceApi28-RetOiIg, reason: not valid java name */
    private final Typeface m28877createAndroidTypefaceApi28RetOiIg(String str, jp6 jp6Var, int i) {
        fp6.C5920a c5920a = fp6.f37355b;
        if (fp6.m29575equalsimpl0(i, c5920a.m29582getNormal_LCdwA()) && md8.areEqual(jp6Var, jp6.f51403b.getNormal()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), jp6Var.getWeight(), fp6.m29575equalsimpl0(i, c5920a.m29581getItalic_LCdwA()));
    }

    /* JADX INFO: renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final Typeface m28878loadNamedFromTypefaceCacheOrNullRetOiIg(String str, jp6 jp6Var, int i) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceM28877createAndroidTypefaceApi28RetOiIg = m28877createAndroidTypefaceApi28RetOiIg(str, jp6Var, i);
        if (md8.areEqual(typefaceM28877createAndroidTypefaceApi28RetOiIg, nnh.f65124a.create(Typeface.DEFAULT, jp6Var.getWeight(), fp6.m29575equalsimpl0(i, fp6.f37355b.m29581getItalic_LCdwA()))) || md8.areEqual(typefaceM28877createAndroidTypefaceApi28RetOiIg, m28877createAndroidTypefaceApi28RetOiIg(null, jp6Var, i))) {
            return null;
        }
        return typefaceM28877createAndroidTypefaceApi28RetOiIg;
    }

    @Override // p000.cyc
    @yfb
    /* JADX INFO: renamed from: createDefault-FO1MlWM */
    public Typeface mo28561createDefaultFO1MlWM(@yfb jp6 jp6Var, int i) {
        return m28877createAndroidTypefaceApi28RetOiIg(null, jp6Var, i);
    }

    @Override // p000.cyc
    @yfb
    /* JADX INFO: renamed from: createNamed-RetOiIg */
    public Typeface mo28562createNamedRetOiIg(@yfb z27 z27Var, @yfb jp6 jp6Var, int i) {
        return m28877createAndroidTypefaceApi28RetOiIg(z27Var.getName(), jp6Var, i);
    }

    @Override // p000.cyc
    @gib
    /* JADX INFO: renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public Typeface mo28563optionalOnDeviceFontFamilyByName78DK7lM(@yfb String str, @yfb jp6 jp6Var, int i, @yfb ip6.C7556e c7556e, @yfb Context context) {
        do6.C4890a c4890a = do6.f30259b;
        return gyc.setFontVariationSettings(md8.areEqual(str, c4890a.getSansSerif().getName()) ? mo28562createNamedRetOiIg(c4890a.getSansSerif(), jp6Var, i) : md8.areEqual(str, c4890a.getSerif().getName()) ? mo28562createNamedRetOiIg(c4890a.getSerif(), jp6Var, i) : md8.areEqual(str, c4890a.getMonospace().getName()) ? mo28562createNamedRetOiIg(c4890a.getMonospace(), jp6Var, i) : md8.areEqual(str, c4890a.getCursive().getName()) ? mo28562createNamedRetOiIg(c4890a.getCursive(), jp6Var, i) : m28878loadNamedFromTypefaceCacheOrNullRetOiIg(str, jp6Var, i), c7556e, context);
    }
}
