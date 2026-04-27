package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collection;
import java.util.List;
import p000.kx7;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class wg1 extends Binder {

    /* JADX INFO: renamed from: b */
    public static final int f94136b;

    /* JADX INFO: renamed from: c */
    public static final int f94137c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f94138d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f94139e = 2;

    /* JADX INFO: renamed from: a */
    public final kx7<Bundle> f94140a;

    static {
        f94136b = x0i.f95978a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public wg1(List<Bundle> list) {
        this.f94140a = kx7.copyOf((Collection) list);
    }

    public static kx7<Bundle> getList(IBinder iBinder) {
        int i;
        kx7.C8541a c8541aBuilder = kx7.builder();
        int i2 = 0;
        int i3 = 1;
        while (i3 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            c8541aBuilder.add((Bundle) u80.checkNotNull(parcelObtain2.readBundle()));
                            i2++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i3 = i;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return c8541aBuilder.build();
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, @hib Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f94140a.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < f94136b) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f94140a.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }
}
