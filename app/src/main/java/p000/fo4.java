package p000;

import android.content.ClipDescription;
import android.view.DragEvent;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fo4 {
    public static final long getPositionInRoot(@yfb tn4 tn4Var) {
        return mzb.Offset(tn4Var.getDragEvent$ui_release().getX(), tn4Var.getDragEvent$ui_release().getY());
    }

    @yfb
    public static final Set<String> mimeTypes(@yfb tn4 tn4Var) {
        ClipDescription clipDescription = tn4Var.getDragEvent$ui_release().getClipDescription();
        if (clipDescription == null) {
            return w6f.emptySet();
        }
        Set setCreateSetBuilder = v6f.createSetBuilder(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i = 0; i < mimeTypeCount; i++) {
            setCreateSetBuilder.add(clipDescription.getMimeType(i));
        }
        return v6f.build(setCreateSetBuilder);
    }

    @yfb
    public static final DragEvent toAndroidDragEvent(@yfb tn4 tn4Var) {
        return tn4Var.getDragEvent$ui_release();
    }
}
