package p000;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gwi extends pvi implements hwi {
    /* JADX INFO: renamed from: b */
    public static hwi m12012b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return iInterfaceQueryLocalInterface instanceof hwi ? (hwi) iInterfaceQueryLocalInterface : new ewi(iBinder);
    }
}
