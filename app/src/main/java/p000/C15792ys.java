package p000;

import p000.jp6;

/* JADX INFO: renamed from: ys */
/* JADX INFO: loaded from: classes.dex */
public final class C15792ys {
    @yfb
    public static final jp6 getAndroidBold(@yfb jp6.C8003a c8003a) {
        return c8003a.getW600();
    }

    public static final int getAndroidTypefaceStyle(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    /* JADX INFO: renamed from: getAndroidTypefaceStyle-FO1MlWM, reason: not valid java name */
    public static final int m33403getAndroidTypefaceStyleFO1MlWM(@yfb jp6 jp6Var, int i) {
        return getAndroidTypefaceStyle(jp6Var.compareTo(getAndroidBold(jp6.f51403b)) >= 0, fp6.m29575equalsimpl0(i, fp6.f37355b.m29581getItalic_LCdwA()));
    }
}
