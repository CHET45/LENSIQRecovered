package p000;

import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
@c5e(33)
public final class na3 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final na3 f63780a = new na3();

    private na3() {
    }

    @do8
    @yfb
    @ih4
    public static final CursorAnchorInfo.Builder setEditorBoundsInfo(@yfb CursorAnchorInfo.Builder builder, @yfb rud rudVar) {
        return builder.setEditorBoundsInfo(ma3.m17187a().setEditorBounds(vud.toAndroidRectF(rudVar)).setHandwritingBounds(vud.toAndroidRectF(rudVar)).build());
    }
}
