package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public final class qwi extends wui implements cxi {
    public qwi(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.cxi
    /* JADX INFO: renamed from: c */
    public final void mo8774c(Bundle bundle, z3j z3jVar) throws RemoteException {
        Parcel parcelM24836a = m24836a();
        uvi.m23612c(parcelM24836a, bundle);
        parcelM24836a.writeStrongBinder(z3jVar);
        m24837b(3, parcelM24836a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.cxi
    /* JADX INFO: renamed from: d */
    public final void mo8775d(Bundle bundle, exi exiVar) throws RemoteException {
        Parcel parcelM24836a = m24836a();
        uvi.m23612c(parcelM24836a, bundle);
        parcelM24836a.writeStrongBinder(exiVar);
        m24837b(2, parcelM24836a);
    }
}
