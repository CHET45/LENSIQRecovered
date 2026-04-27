package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;

/* JADX INFO: loaded from: classes.dex */
public class ljh {

    /* JADX INFO: renamed from: a */
    public final ITrustedWebActivityCallback f57745a;

    private ljh(@efb ITrustedWebActivityCallback iTrustedWebActivityCallback) {
        this.f57745a = iTrustedWebActivityCallback;
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static ljh m16187a(@hib IBinder iBinder) {
        ITrustedWebActivityCallback iTrustedWebActivityCallbackAsInterface = iBinder == null ? null : ITrustedWebActivityCallback.Stub.asInterface(iBinder);
        if (iTrustedWebActivityCallbackAsInterface == null) {
            return null;
        }
        return new ljh(iTrustedWebActivityCallbackAsInterface);
    }

    public void runExtraCallback(@efb String str, @efb Bundle bundle) throws RemoteException {
        this.f57745a.onExtraCallback(str, bundle);
    }
}
