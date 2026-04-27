package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public final class ewi extends wui implements hwi {
    public ewi(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.hwi
    /* JADX INFO: renamed from: c */
    public final void mo10330c(Bundle bundle, z3j z3jVar) throws RemoteException {
        Parcel parcelM24836a = m24836a();
        uvi.m23612c(parcelM24836a, bundle);
        parcelM24836a.writeStrongBinder(z3jVar);
        m24837b(6, parcelM24836a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.hwi
    /* JADX INFO: renamed from: d */
    public final void mo10331d(Bundle bundle, jwi jwiVar) throws RemoteException {
        Parcel parcelM24836a = m24836a();
        uvi.m23612c(parcelM24836a, bundle);
        parcelM24836a.writeStrongBinder(jwiVar);
        m24837b(3, parcelM24836a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.hwi
    /* JADX INFO: renamed from: e */
    public final void mo10332e(Bundle bundle, jwi jwiVar) throws RemoteException {
        Parcel parcelM24836a = m24836a();
        uvi.m23612c(parcelM24836a, bundle);
        parcelM24836a.writeStrongBinder(jwiVar);
        m24837b(2, parcelM24836a);
    }
}
