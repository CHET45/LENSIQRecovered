package p000;

import androidx.compose.p002ui.C0693R;
import androidx.compose.p002ui.platform.AbstractComposeView;
import androidx.compose.p002ui.platform.ComposeView;
import p000.vli;

/* JADX INFO: loaded from: classes.dex */
public final class woi {
    @yfb
    public static final m2i ValueInsets(@yfb r48 r48Var, @yfb String str) {
        return new m2i(toInsetsValues(r48Var), str);
    }

    @hh5
    @xn8(name = "getAreNavigationBarsVisible")
    @hk2
    public static final boolean getAreNavigationBarsVisible(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(710310464, i, -1, "androidx.compose.foundation.layout.<get-areNavigationBarsVisible> (WindowInsets.android.kt:366)");
        }
        boolean zIsVisible = foi.f37296x.current(zl2Var, 6).getNavigationBars().isVisible();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return zIsVisible;
    }

    @hh5
    public static /* synthetic */ void getAreNavigationBarsVisible$annotations(vli.C14156a c14156a) {
    }

    @hh5
    @xn8(name = "getAreStatusBarsVisible")
    @hk2
    public static final boolean getAreStatusBarsVisible(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1613283456, i, -1, "androidx.compose.foundation.layout.<get-areStatusBarsVisible> (WindowInsets.android.kt:354)");
        }
        boolean zIsVisible = foi.f37296x.current(zl2Var, 6).getStatusBars().isVisible();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return zIsVisible;
    }

    @hh5
    public static /* synthetic */ void getAreStatusBarsVisible$annotations(vli.C14156a c14156a) {
    }

    @hh5
    @xn8(name = "getAreSystemBarsVisible")
    @hk2
    public static final boolean getAreSystemBarsVisible(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1985490720, i, -1, "androidx.compose.foundation.layout.<get-areSystemBarsVisible> (WindowInsets.android.kt:378)");
        }
        boolean zIsVisible = foi.f37296x.current(zl2Var, 6).getSystemBars().isVisible();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return zIsVisible;
    }

    @hh5
    public static /* synthetic */ void getAreSystemBarsVisible$annotations(vli.C14156a c14156a) {
    }

    @yfb
    @xn8(name = "getCaptionBar")
    @hk2
    public static final vli getCaptionBar(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1832025528, i, -1, "androidx.compose.foundation.layout.<get-captionBar> (WindowInsets.android.kt:142)");
        }
        C10671ow captionBar = foi.f37296x.current(zl2Var, 6).getCaptionBar();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return captionBar;
    }

    @xn8(name = "getCaptionBarIgnoringVisibility")
    @hh5
    @yfb
    @hk2
    public static final vli getCaptionBarIgnoringVisibility(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1731251574, i, -1, "androidx.compose.foundation.layout.<get-captionBarIgnoringVisibility> (WindowInsets.android.kt:266)");
        }
        m2i captionBarIgnoringVisibility = foi.f37296x.current(zl2Var, 6).getCaptionBarIgnoringVisibility();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return captionBarIgnoringVisibility;
    }

    @hh5
    public static /* synthetic */ void getCaptionBarIgnoringVisibility$annotations(vli.C14156a c14156a) {
    }

    public static final boolean getConsumeWindowInsets(@yfb AbstractComposeView abstractComposeView) {
        Object tag = abstractComposeView.getTag(C0693R.id.consume_window_insets_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @q64(level = u64.f86867c, message = "Please use AbstractComposeView.consumeWindowInsets")
    public static /* synthetic */ void getConsumeWindowInsets$annotations(ComposeView composeView) {
    }

    @yfb
    @xn8(name = "getDisplayCutout")
    @hk2
    public static final vli getDisplayCutout(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1324817724, i, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:151)");
        }
        C10671ow displayCutout = foi.f37296x.current(zl2Var, 6).getDisplayCutout();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return displayCutout;
    }

    @yfb
    @xn8(name = "getIme")
    @hk2
    public static final vli getIme(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1466917860, i, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:165)");
        }
        C10671ow ime = foi.f37296x.current(zl2Var, 6).getIme();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return ime;
    }

    @xn8(name = "getImeAnimationSource")
    @hh5
    @yfb
    @hk2
    public static final vli getImeAnimationSource(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1126064918, i, -1, "androidx.compose.foundation.layout.<get-imeAnimationSource> (WindowInsets.android.kt:404)");
        }
        m2i imeAnimationSource = foi.f37296x.current(zl2Var, 6).getImeAnimationSource();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return imeAnimationSource;
    }

    @hh5
    public static /* synthetic */ void getImeAnimationSource$annotations(vli.C14156a c14156a) {
    }

    @xn8(name = "getImeAnimationTarget")
    @hh5
    @yfb
    @hk2
    public static final vli getImeAnimationTarget(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-466319786, i, -1, "androidx.compose.foundation.layout.<get-imeAnimationTarget> (WindowInsets.android.kt:419)");
        }
        m2i imeAnimationTarget = foi.f37296x.current(zl2Var, 6).getImeAnimationTarget();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return imeAnimationTarget;
    }

    @hh5
    public static /* synthetic */ void getImeAnimationTarget$annotations(vli.C14156a c14156a) {
    }

    @yfb
    @xn8(name = "getMandatorySystemGestures")
    @hk2
    public static final vli getMandatorySystemGestures(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1369492988, i, -1, "androidx.compose.foundation.layout.<get-mandatorySystemGestures> (WindowInsets.android.kt:174)");
        }
        C10671ow mandatorySystemGestures = foi.f37296x.current(zl2Var, 6).getMandatorySystemGestures();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return mandatorySystemGestures;
    }

    @yfb
    @xn8(name = "getNavigationBars")
    @hk2
    public static final vli getNavigationBars(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1596175702, i, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:184)");
        }
        C10671ow navigationBars = foi.f37296x.current(zl2Var, 6).getNavigationBars();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return navigationBars;
    }

    @xn8(name = "getNavigationBarsIgnoringVisibility")
    @hh5
    @yfb
    @hk2
    public static final vli getNavigationBarsIgnoringVisibility(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1990981160, i, -1, "androidx.compose.foundation.layout.<get-navigationBarsIgnoringVisibility> (WindowInsets.android.kt:280)");
        }
        m2i navigationBarsIgnoringVisibility = foi.f37296x.current(zl2Var, 6).getNavigationBarsIgnoringVisibility();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return navigationBarsIgnoringVisibility;
    }

    @hh5
    public static /* synthetic */ void getNavigationBarsIgnoringVisibility$annotations(vli.C14156a c14156a) {
    }

    @yfb
    @xn8(name = "getSafeContent")
    @hk2
    public static final vli getSafeContent(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-2026663876, i, -1, "androidx.compose.foundation.layout.<get-safeContent> (WindowInsets.android.kt:254)");
        }
        vli safeContent = foi.f37296x.current(zl2Var, 6).getSafeContent();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return safeContent;
    }

    @yfb
    @xn8(name = "getSafeDrawing")
    @hk2
    public static final vli getSafeDrawing(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-49441252, i, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:234)");
        }
        vli safeDrawing = foi.f37296x.current(zl2Var, 6).getSafeDrawing();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return safeDrawing;
    }

    @yfb
    @xn8(name = "getSafeGestures")
    @hk2
    public static final vli getSafeGestures(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1594247780, i, -1, "androidx.compose.foundation.layout.<get-safeGestures> (WindowInsets.android.kt:245)");
        }
        vli safeGestures = foi.f37296x.current(zl2Var, 6).getSafeGestures();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return safeGestures;
    }

    @yfb
    @xn8(name = "getStatusBars")
    @hk2
    public static final vli getStatusBars(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-675090670, i, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:192)");
        }
        C10671ow statusBars = foi.f37296x.current(zl2Var, 6).getStatusBars();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return statusBars;
    }

    @xn8(name = "getStatusBarsIgnoringVisibility")
    @hh5
    @yfb
    @hk2
    public static final vli getStatusBarsIgnoringVisibility(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(594020756, i, -1, "androidx.compose.foundation.layout.<get-statusBarsIgnoringVisibility> (WindowInsets.android.kt:292)");
        }
        m2i statusBarsIgnoringVisibility = foi.f37296x.current(zl2Var, 6).getStatusBarsIgnoringVisibility();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return statusBarsIgnoringVisibility;
    }

    @hh5
    public static /* synthetic */ void getStatusBarsIgnoringVisibility$annotations(vli.C14156a c14156a) {
    }

    @yfb
    @xn8(name = "getSystemBars")
    @hk2
    public static final vli getSystemBars(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-282936756, i, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:200)");
        }
        C10671ow systemBars = foi.f37296x.current(zl2Var, 6).getSystemBars();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return systemBars;
    }

    @xn8(name = "getSystemBarsIgnoringVisibility")
    @hh5
    @yfb
    @hk2
    public static final vli getSystemBarsIgnoringVisibility(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1564566798, i, -1, "androidx.compose.foundation.layout.<get-systemBarsIgnoringVisibility> (WindowInsets.android.kt:305)");
        }
        m2i systemBarsIgnoringVisibility = foi.f37296x.current(zl2Var, 6).getSystemBarsIgnoringVisibility();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return systemBarsIgnoringVisibility;
    }

    @hh5
    public static /* synthetic */ void getSystemBarsIgnoringVisibility$annotations(vli.C14156a c14156a) {
    }

    @yfb
    @xn8(name = "getSystemGestures")
    @hk2
    public static final vli getSystemGestures(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(989216224, i, -1, "androidx.compose.foundation.layout.<get-systemGestures> (WindowInsets.android.kt:208)");
        }
        C10671ow systemGestures = foi.f37296x.current(zl2Var, 6).getSystemGestures();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return systemGestures;
    }

    @yfb
    @xn8(name = "getTappableElement")
    @hk2
    public static final vli getTappableElement(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1994205284, i, -1, "androidx.compose.foundation.layout.<get-tappableElement> (WindowInsets.android.kt:216)");
        }
        C10671ow tappableElement = foi.f37296x.current(zl2Var, 6).getTappableElement();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return tappableElement;
    }

    @xn8(name = "getTappableElementIgnoringVisibility")
    @hh5
    @yfb
    @hk2
    public static final vli getTappableElementIgnoringVisibility(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1488788292, i, -1, "androidx.compose.foundation.layout.<get-tappableElementIgnoringVisibility> (WindowInsets.android.kt:318)");
        }
        m2i tappableElementIgnoringVisibility = foi.f37296x.current(zl2Var, 6).getTappableElementIgnoringVisibility();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return tappableElementIgnoringVisibility;
    }

    @hh5
    public static /* synthetic */ void getTappableElementIgnoringVisibility$annotations(vli.C14156a c14156a) {
    }

    @yfb
    @xn8(name = "getWaterfall")
    @hk2
    public static final vli getWaterfall(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1943241020, i, -1, "androidx.compose.foundation.layout.<get-waterfall> (WindowInsets.android.kt:224)");
        }
        m2i waterfall = foi.f37296x.current(zl2Var, 6).getWaterfall();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return waterfall;
    }

    @hh5
    @xn8(name = "isCaptionBarVisible")
    @hk2
    public static final boolean isCaptionBarVisible(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-501076620, i, -1, "androidx.compose.foundation.layout.<get-isCaptionBarVisible> (WindowInsets.android.kt:330)");
        }
        boolean zIsVisible = foi.f37296x.current(zl2Var, 6).getCaptionBar().isVisible();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return zIsVisible;
    }

    @hh5
    public static /* synthetic */ void isCaptionBarVisible$annotations(vli.C14156a c14156a) {
    }

    @hh5
    @xn8(name = "isImeVisible")
    @hk2
    public static final boolean isImeVisible(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1873571424, i, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:342)");
        }
        boolean zIsVisible = foi.f37296x.current(zl2Var, 6).getIme().isVisible();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return zIsVisible;
    }

    @hh5
    public static /* synthetic */ void isImeVisible$annotations(vli.C14156a c14156a) {
    }

    @hh5
    @xn8(name = "isTappableElementVisible")
    @hk2
    public static final boolean isTappableElementVisible(@yfb vli.C14156a c14156a, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1737201120, i, -1, "androidx.compose.foundation.layout.<get-isTappableElementVisible> (WindowInsets.android.kt:389)");
        }
        boolean zIsVisible = foi.f37296x.current(zl2Var, 6).getTappableElement().isVisible();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return zIsVisible;
    }

    @hh5
    public static /* synthetic */ void isTappableElementVisible$annotations(vli.C14156a c14156a) {
    }

    public static final void setConsumeWindowInsets(@yfb AbstractComposeView abstractComposeView, boolean z) {
        abstractComposeView.setTag(C0693R.id.consume_window_insets_tag, Boolean.valueOf(z));
    }

    @yfb
    public static final x48 toInsetsValues(@yfb r48 r48Var) {
        return new x48(r48Var.f77014a, r48Var.f77015b, r48Var.f77016c, r48Var.f77017d);
    }

    public static final /* synthetic */ boolean getConsumeWindowInsets(ComposeView composeView) {
        Object tag = composeView.getTag(C0693R.id.consume_window_insets_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
