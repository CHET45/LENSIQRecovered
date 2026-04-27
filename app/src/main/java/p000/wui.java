package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public class wui implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f95547a;

    /* JADX INFO: renamed from: b */
    public final String f95548b;

    public wui(IBinder iBinder, String str) {
        this.f95547a = iBinder;
        this.f95548b = str;
    }

    /* JADX INFO: renamed from: a */
    public final Parcel m24836a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f95548b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f95547a;
    }

    /* JADX INFO: renamed from: b */
    public final void m24837b(int i, Parcel parcel) throws RemoteException {
        try {
            this.f95547a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
