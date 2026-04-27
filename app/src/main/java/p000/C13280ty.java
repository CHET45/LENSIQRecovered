package p000;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p000.p7e;

/* JADX INFO: renamed from: ty */
/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class C13280ty {

    /* JADX INFO: renamed from: a */
    public static final TimeInterpolator f86289a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final TimeInterpolator f86290b = new np5();

    /* JADX INFO: renamed from: c */
    public static final TimeInterpolator f86291c = new mp5();

    /* JADX INFO: renamed from: d */
    public static final TimeInterpolator f86292d = new u69();

    /* JADX INFO: renamed from: e */
    public static final TimeInterpolator f86293e = new DecelerateInterpolator();

    public static float lerp(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int lerp(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }

    public static float lerp(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : lerp(f, f2, (f5 - f3) / (f4 - f3));
    }
}
