package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class zn4 {
    private static final boolean containsContentUri(ClipData clipData) {
        int itemCount = clipData.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            Uri uri = clipData.getItemAt(i).getUri();
            if (uri != null && md8.areEqual(uri.getScheme(), "content")) {
                return true;
            }
        }
        return false;
    }

    public static final void dragAndDropRequestPermission(@yfb v34 v34Var, @yfb tn4 tn4Var) {
        Activity activityTryGetActivity;
        if (containsContentUri(fo4.toAndroidDragEvent(tn4Var).getClipData()) && v34Var.getNode().isAttached() && (activityTryGetActivity = tryGetActivity(x34.requireView(v34Var))) != null) {
            yn4.request(activityTryGetActivity, fo4.toAndroidDragEvent(tn4Var));
        }
    }

    private static final Activity tryGetActivity(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
