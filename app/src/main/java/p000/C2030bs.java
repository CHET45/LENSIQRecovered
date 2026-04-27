package p000;

import android.content.Context;

/* JADX INFO: renamed from: bs */
/* JADX INFO: loaded from: classes.dex */
public final class C2030bs {
    @yfb
    public static final c64 Density(@yfb Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        ap6 ap6VarForScale = bp6.f14373a.forScale(f);
        if (ap6VarForScale == null) {
            ap6VarForScale = new p69(f);
        }
        return new g64(f2, f, ap6VarForScale);
    }
}
