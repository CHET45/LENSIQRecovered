package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
@c5e(31)
public final class t00 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final t00 f83293a = new t00();

    private t00() {
    }

    @yfb
    @ih4
    public final EdgeEffect create(@yfb Context context, @gib AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    @ih4
    public final float getDistance(@yfb EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    @ih4
    public final float onPullDistance(@yfb EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
