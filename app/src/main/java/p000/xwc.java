package p000;

import android.graphics.Typeface;
import p000.qnh;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class xwc implements io6 {

    /* JADX INFO: renamed from: b */
    public static final int f99586b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final cyc f99587a = gyc.PlatformTypefaces();

    @Override // p000.io6
    @gib
    public qnh resolve(@yfb onh onhVar, @yfb ywc ywcVar, @yfb qy6<? super qnh.C11571b, bth> qy6Var, @yfb qy6<? super onh, ? extends Object> qy6Var2) {
        Typeface typefaceMo27877getNativeTypefacePYhJU0U;
        do6 fontFamily = onhVar.getFontFamily();
        if (fontFamily == null ? true : fontFamily instanceof gv3) {
            typefaceMo27877getNativeTypefacePYhJU0U = this.f99587a.mo28561createDefaultFO1MlWM(onhVar.getFontWeight(), onhVar.m31514getFontStyle_LCdwA());
        } else if (fontFamily instanceof z27) {
            typefaceMo27877getNativeTypefacePYhJU0U = this.f99587a.mo28562createNamedRetOiIg((z27) onhVar.getFontFamily(), onhVar.getFontWeight(), onhVar.m31514getFontStyle_LCdwA());
        } else {
            if (!(fontFamily instanceof rc9)) {
                return null;
            }
            zmh typeface = ((rc9) onhVar.getFontFamily()).getTypeface();
            md8.checkNotNull(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceMo27877getNativeTypefacePYhJU0U = ((InterfaceC13724uv) typeface).mo27877getNativeTypefacePYhJU0U(onhVar.getFontWeight(), onhVar.m31514getFontStyle_LCdwA(), onhVar.m31515getFontSynthesisGVVA2EU());
        }
        return new qnh.C11571b(typefaceMo27877getNativeTypefacePYhJU0U, false, 2, null);
    }
}
