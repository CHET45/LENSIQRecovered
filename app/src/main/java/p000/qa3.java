package p000;

import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
@c5e(34)
public final class qa3 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final qa3 f73732a = new qa3();

    private qa3() {
    }

    @do8
    @yfb
    @ih4
    public static final CursorAnchorInfo.Builder addVisibleLineBounds(@yfb CursorAnchorInfo.Builder builder, @yfb hug hugVar, @yfb rud rudVar) {
        int lineForVerticalPosition;
        int lineForVerticalPosition2;
        if (!rudVar.isEmpty() && (lineForVerticalPosition = hugVar.getLineForVerticalPosition(rudVar.getTop())) <= (lineForVerticalPosition2 = hugVar.getLineForVerticalPosition(rudVar.getBottom()))) {
            while (true) {
                builder.addVisibleLineBounds(hugVar.getLineLeft(lineForVerticalPosition), hugVar.getLineTop(lineForVerticalPosition), hugVar.getLineRight(lineForVerticalPosition), hugVar.getLineBottom(lineForVerticalPosition));
                if (lineForVerticalPosition == lineForVerticalPosition2) {
                    break;
                }
                lineForVerticalPosition++;
            }
        }
        return builder;
    }
}
