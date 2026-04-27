package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dxi extends pvi implements exi {
    public dxi() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // p000.pvi
    /* JADX INFO: renamed from: a */
    public final boolean mo9522a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Bundle bundle = (Bundle) uvi.m23610a(parcel, Bundle.CREATOR);
        uvi.m23611b(parcel);
        mo6638b(bundle);
        return true;
    }
}
