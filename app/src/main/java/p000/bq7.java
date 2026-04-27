package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface bq7 extends IInterface {

    /* JADX INFO: renamed from: g */
    public static final String f14485g = "androidx.room.IMultiInstanceInvalidationCallback";

    /* JADX INFO: renamed from: bq7$a */
    public static class C1999a implements bq7 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // p000.bq7
        public void onInvalidation(String[] strArr) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: bq7$b */
    public static abstract class AbstractBinderC2000b extends Binder implements bq7 {

        /* JADX INFO: renamed from: a */
        public static final int f14486a = 1;

        /* JADX INFO: renamed from: bq7$b$a */
        public static class a implements bq7 {

            /* JADX INFO: renamed from: a */
            public IBinder f14487a;

            public a(IBinder iBinder) {
                this.f14487a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14487a;
            }

            public String getInterfaceDescriptor() {
                return bq7.f14485g;
            }

            @Override // p000.bq7
            public void onInvalidation(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(bq7.f14485g);
                    parcelObtain.writeStringArray(strArr);
                    this.f14487a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC2000b() {
            attachInterface(this, bq7.f14485g);
        }

        public static bq7 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(bq7.f14485g);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof bq7)) ? new a(iBinder) : (bq7) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(bq7.f14485g);
            }
            if (i == 1598968902) {
                parcel2.writeString(bq7.f14485g);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onInvalidation(parcel.createStringArray());
            return true;
        }
    }

    void onInvalidation(String[] strArr) throws RemoteException;
}
