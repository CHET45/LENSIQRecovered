package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iwi extends pvi implements jwi {
    public iwi() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // p000.pvi
    /* JADX INFO: renamed from: a */
    public final boolean mo9522a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            Bundle bundle = (Bundle) uvi.m23610a(parcel, Bundle.CREATOR);
            uvi.m23611b(parcel);
            mo6661e(bundle);
            return true;
        }
        if (i == 3) {
            Bundle bundle2 = (Bundle) uvi.m23610a(parcel, Bundle.CREATOR);
            uvi.m23611b(parcel);
            mo6659c(bundle2);
            return true;
        }
        if (i == 4) {
            Bundle bundle3 = (Bundle) uvi.m23610a(parcel, Bundle.CREATOR);
            uvi.m23611b(parcel);
            mo6660d(bundle3);
            return true;
        }
        if (i != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) uvi.m23610a(parcel, Bundle.CREATOR);
        uvi.m23611b(parcel);
        mo6658b(bundle4);
        return true;
    }
}
