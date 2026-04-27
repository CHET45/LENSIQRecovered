package p000;

import android.app.Activity;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface a4c {
    default void deniedPermissionRequest(@efb Activity activity, @efb List<String> list, @efb List<String> list2, boolean z, @hib y3c y3cVar) {
        if (y3cVar == null) {
            return;
        }
        y3cVar.onDenied(list2, z);
    }

    default void finishPermissionRequest(@efb Activity activity, @efb List<String> list, boolean z, @hib y3c y3cVar) {
    }

    default void grantedPermissionRequest(@efb Activity activity, @efb List<String> list, @efb List<String> list2, boolean z, @hib y3c y3cVar) {
        if (y3cVar == null) {
            return;
        }
        y3cVar.onGranted(list2, z);
    }

    default void launchPermissionRequest(@efb Activity activity, @efb List<String> list, @hib y3c y3cVar) {
        xoc.launch(activity, list, this, y3cVar);
    }
}
