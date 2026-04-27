package p000;

import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
@c5e(33)
@e0g(parameters = 1)
public final class oa3 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final oa3 f66961a = new oa3();

    /* JADX INFO: renamed from: b */
    public static final int f66962b = 0;

    private oa3() {
    }

    @do8
    @yfb
    @ih4
    public static final CursorAnchorInfo.Builder setEditorBoundsInfo(@yfb CursorAnchorInfo.Builder builder, @yfb rud rudVar) {
        return builder.setEditorBoundsInfo(ma3.m17187a().setEditorBounds(vud.toAndroidRectF(rudVar)).setHandwritingBounds(vud.toAndroidRectF(rudVar)).build());
    }
}
