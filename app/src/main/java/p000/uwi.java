package p000;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes5.dex */
public abstract class uwi extends pvi implements cxi {
    /* JADX INFO: renamed from: b */
    public static cxi m23619b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof cxi ? (cxi) iInterfaceQueryLocalInterface : new qwi(iBinder);
    }
}
