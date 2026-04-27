package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes3.dex */
public final class wv4 {

    /* JADX INFO: renamed from: a */
    public final EdgeEffect f95553a;

    /* JADX INFO: renamed from: wv4$a */
    @c5e(21)
    public static class C14805a {
        private C14805a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m24839a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* JADX INFO: renamed from: wv4$b */
    @c5e(31)
    public static class C14806b {
        private C14806b() {
        }

        @ih4
        public static EdgeEffect create(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @ih4
        public static float getDistance(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @ih4
        public static float onPullDistance(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public wv4(Context context) {
        this.f95553a = new EdgeEffect(context);
    }

    @efb
    public static EdgeEffect create(@efb Context context, @hib AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? C14806b.create(context, attributeSet) : new EdgeEffect(context);
    }

    public static float getDistance(@efb EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C14806b.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public static float onPullDistance(@efb EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C14806b.onPullDistance(edgeEffect, f, f2);
        }
        onPull(edgeEffect, f, f2);
        return f;
    }

    @Deprecated
    public boolean draw(Canvas canvas) {
        return this.f95553a.draw(canvas);
    }

    @Deprecated
    public void finish() {
        this.f95553a.finish();
    }

    @Deprecated
    public boolean isFinished() {
        return this.f95553a.isFinished();
    }

    @Deprecated
    public boolean onAbsorb(int i) {
        this.f95553a.onAbsorb(i);
        return true;
    }

    @Deprecated
    public boolean onPull(float f) {
        this.f95553a.onPull(f);
        return true;
    }

    @Deprecated
    public boolean onRelease() {
        this.f95553a.onRelease();
        return this.f95553a.isFinished();
    }

    @Deprecated
    public void setSize(int i, int i2) {
        this.f95553a.setSize(i, i2);
    }

    @Deprecated
    public boolean onPull(float f, float f2) {
        onPull(this.f95553a, f, f2);
        return true;
    }

    public static void onPull(@efb EdgeEffect edgeEffect, float f, float f2) {
        C14805a.m24839a(edgeEffect, f, f2);
    }
}
