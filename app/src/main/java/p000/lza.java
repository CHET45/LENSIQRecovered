package p000;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
@c5e(29)
public final class lza {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final lza f59335a = new lza();

    private lza() {
    }

    @ih4
    /* JADX INFO: renamed from: toRawOffset-dBAh8RU, reason: not valid java name */
    public final long m30926toRawOffsetdBAh8RU(@yfb MotionEvent motionEvent, int i) {
        return mzb.Offset(motionEvent.getRawX(i), motionEvent.getRawY(i));
    }
}
