package p000;

import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: renamed from: as */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
@q64(message = "This path for preloading fonts is not supported")
public final class C1582as implements InterfaceC13724uv {

    /* JADX INFO: renamed from: b */
    public static final int f11707b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final do6 f11708a = do6.f30259b.getDefault();

    @Override // p000.zmh
    @yfb
    public do6 getFontFamily() {
        return this.f11708a;
    }

    @Override // p000.InterfaceC13724uv
    @yfb
    /* JADX INFO: renamed from: getNativeTypeface-PYhJU0U, reason: not valid java name */
    public Typeface mo27877getNativeTypefacePYhJU0U(@yfb jp6 jp6Var, int i, int i2) {
        return Build.VERSION.SDK_INT < 28 ? Typeface.defaultFromStyle(C15792ys.m33403getAndroidTypefaceStyleFO1MlWM(jp6Var, i)) : nnh.f65124a.create(Typeface.DEFAULT, jp6Var.getWeight(), fp6.m29575equalsimpl0(i, fp6.f37355b.m29581getItalic_LCdwA()));
    }
}
