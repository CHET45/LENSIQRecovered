package p000;

import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public class xvh {

    /* JADX INFO: renamed from: a */
    public IUnusedAppRestrictionsBackportCallback f99515a;

    @p7e({p7e.EnumC10826a.f69934a})
    public xvh(@efb IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
        this.f99515a = iUnusedAppRestrictionsBackportCallback;
    }

    public void onResult(boolean z, boolean z2) throws RemoteException {
        this.f99515a.onIsPermissionRevocationEnabledForAppResult(z, z2);
    }
}
