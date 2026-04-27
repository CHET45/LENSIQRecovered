package p000;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class xv4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final xv4 f99437a = new xv4();

    /* JADX INFO: renamed from: b */
    public static final int f99438b = 0;

    private xv4() {
    }

    @yfb
    public final EdgeEffect create(@yfb Context context) {
        return Build.VERSION.SDK_INT >= 31 ? t00.f83293a.create(context, null) : new w77(context);
    }

    public final float getDistanceCompat(@yfb EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t00.f83293a.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public final void onAbsorbCompat(@yfb EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public final float onPullDistanceCompat(@yfb EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t00.f83293a.onPullDistance(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public final void onReleaseWithOppositeDelta(@yfb EdgeEffect edgeEffect, float f) {
        if (edgeEffect instanceof w77) {
            ((w77) edgeEffect).releaseWithOppositeDelta(f);
        } else {
            edgeEffect.onRelease();
        }
    }
}
