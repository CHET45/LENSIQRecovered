package p000;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class z42 {
    @gib
    @ug5
    public static final Uri firstUriOrNull(@yfb u42 u42Var) {
        int itemCount = u42Var.getClipData().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            Uri uri = u42Var.getClipData().getItemAt(i).getUri();
            if (uri != null) {
                return uri;
            }
        }
        return null;
    }
}
