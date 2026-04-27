package p000;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
@c5e(29)
public final class mza {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final mza f62860a = new mza();

    private mza() {
    }

    @ih4
    public final boolean isValidMotionEvent(@yfb MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            float rawY = motionEvent.getRawY(i);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
