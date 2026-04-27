package p000;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
@c5e(34)
public final class w00 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final w00 f93031a = new w00();

    private w00() {
    }

    @yfb
    @ih4
    public final BackEvent createOnBackEvent(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    @ih4
    public final float progress(@yfb BackEvent backEvent) {
        md8.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    @ih4
    public final int swipeEdge(@yfb BackEvent backEvent) {
        md8.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    @ih4
    public final float touchX(@yfb BackEvent backEvent) {
        md8.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    @ih4
    public final float touchY(@yfb BackEvent backEvent) {
        md8.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
