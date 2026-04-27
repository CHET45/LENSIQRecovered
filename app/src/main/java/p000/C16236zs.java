package p000;

import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: renamed from: zs */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
@q64(message = "This path for preloading loading fonts is not supported.")
public final class C16236zs implements InterfaceC13724uv {

    /* JADX INFO: renamed from: c */
    public static final int f105870c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final do6 f105871a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Typeface f105872b;

    public C16236zs(@yfb z27 z27Var) {
        this.f105871a = z27Var;
        Typeface typefaceCreate = Typeface.create(z27Var.getName(), 0);
        md8.checkNotNull(typefaceCreate);
        this.f105872b = typefaceCreate;
    }

    /* JADX INFO: renamed from: buildStyledTypeface-FO1MlWM, reason: not valid java name */
    private final Typeface m33516buildStyledTypefaceFO1MlWM(jp6 jp6Var, int i) {
        return Build.VERSION.SDK_INT < 28 ? Typeface.create(this.f105872b, C15792ys.m33403getAndroidTypefaceStyleFO1MlWM(jp6Var, i)) : nnh.f65124a.create(this.f105872b, jp6Var.getWeight(), fp6.m29575equalsimpl0(i, fp6.f37355b.m29581getItalic_LCdwA()));
    }

    @Override // p000.zmh
    @yfb
    public do6 getFontFamily() {
        return this.f105871a;
    }

    @Override // p000.InterfaceC13724uv
    @yfb
    /* JADX INFO: renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo27877getNativeTypefacePYhJU0U(@yfb jp6 jp6Var, int i, int i2) {
        return m33516buildStyledTypefaceFO1MlWM(jp6Var, i);
    }
}
