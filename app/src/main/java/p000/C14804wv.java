package p000;

import android.graphics.Typeface;

/* JADX INFO: renamed from: wv */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C14804wv implements InterfaceC13724uv {

    /* JADX INFO: renamed from: c */
    public static final int f95549c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Typeface f95550a;

    /* JADX INFO: renamed from: b */
    @gib
    public final do6 f95551b;

    public C14804wv(@yfb Typeface typeface) {
        this.f95550a = typeface;
    }

    @Override // p000.zmh
    @gib
    public do6 getFontFamily() {
        return this.f95551b;
    }

    @Override // p000.InterfaceC13724uv
    @yfb
    /* JADX INFO: renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo27877getNativeTypefacePYhJU0U(@yfb jp6 jp6Var, int i, int i2) {
        return this.f95550a;
    }

    @yfb
    public final Typeface getTypeface() {
        return this.f95550a;
    }
}
