package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public interface doc {
    Intent getPermissionIntent(@efb Context context, @efb String str);

    boolean isDoNotAskAgainPermission(@efb Activity activity, @efb String str);

    boolean isGrantedPermission(@efb Context context, @efb String str);
}
