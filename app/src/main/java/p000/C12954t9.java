package p000;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: t9 */
/* JADX INFO: loaded from: classes.dex */
public final class C12954t9 {
    public static final /* synthetic */ <T> T findOwner(Context context) {
        for (Object obj = context; obj instanceof ContextWrapper; obj = (T) ((ContextWrapper) obj).getBaseContext()) {
            md8.reifiedOperationMarker(3, "T");
            if (obj != null) {
                return (T) obj;
            }
        }
        return null;
    }
}
