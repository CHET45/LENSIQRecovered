package p000;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: classes3.dex */
public final class cb7 {

    /* JADX INFO: renamed from: a */
    public static final int f16188a = 8388608;

    /* JADX INFO: renamed from: b */
    public static final int f16189b = 8388611;

    /* JADX INFO: renamed from: c */
    public static final int f16190c = 8388613;

    /* JADX INFO: renamed from: d */
    public static final int f16191d = 8388615;

    private cb7() {
    }

    public static void apply(int i, int i2, int i3, @efb Rect rect, @efb Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    public static void applyDisplay(int i, @efb Rect rect, @efb Rect rect2, int i2) {
        Gravity.applyDisplay(i, rect, rect2, i2);
    }

    public static int getAbsoluteGravity(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }

    public static void apply(int i, int i2, int i3, @efb Rect rect, int i4, int i5, @efb Rect rect2, int i6) {
        Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
    }
}
