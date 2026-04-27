package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.bq7;

/* JADX INFO: loaded from: classes3.dex */
public interface cq7 extends IInterface {

    /* JADX INFO: renamed from: h */
    public static final String f26782h = "androidx.room.IMultiInstanceInvalidationService";

    /* JADX INFO: renamed from: cq7$a */
    public static class C4460a implements cq7 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // p000.cq7
        public void broadcastInvalidation(int i, String[] strArr) throws RemoteException {
        }

        @Override // p000.cq7
        public int registerCallback(bq7 bq7Var, String str) throws RemoteException {
            return 0;
        }

        @Override // p000.cq7
        public void unregisterCallback(bq7 bq7Var, int i) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: cq7$b */
    public static abstract class AbstractBinderC4461b extends Binder implements cq7 {

        /* JADX INFO: renamed from: a */
        public static final int f26783a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f26784b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f26785c = 3;

        /* JADX INFO: renamed from: cq7$b$a */
        public static class a implements cq7 {

            /* JADX INFO: renamed from: a */
            public IBinder f26786a;

            public a(IBinder iBinder) {
                this.f26786a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26786a;
            }

            @Override // p000.cq7
            public void broadcastInvalidation(int i, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(cq7.f26782h);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    this.f26786a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return cq7.f26782h;
            }

            @Override // p000.cq7
            public int registerCallback(bq7 bq7Var, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(cq7.f26782h);
                    parcelObtain.writeStrongInterface(bq7Var);
                    parcelObtain.writeString(str);
                    this.f26786a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p000.cq7
            public void unregisterCallback(bq7 bq7Var, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(cq7.f26782h);
                    parcelObtain.writeStrongInterface(bq7Var);
                    parcelObtain.writeInt(i);
                    this.f26786a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC4461b() {
            attachInterface(this, cq7.f26782h);
        }

        public static cq7 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(cq7.f26782h);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof cq7)) ? new a(iBinder) : (cq7) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(cq7.f26782h);
            }
            if (i == 1598968902) {
                parcel2.writeString(cq7.f26782h);
                return true;
            }
            if (i == 1) {
                int iRegisterCallback = registerCallback(bq7.AbstractBinderC2000b.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iRegisterCallback);
            } else if (i == 2) {
                unregisterCallback(bq7.AbstractBinderC2000b.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                broadcastInvalidation(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    void broadcastInvalidation(int i, String[] strArr) throws RemoteException;

    int registerCallback(bq7 bq7Var, String str) throws RemoteException;

    void unregisterCallback(bq7 bq7Var, int i) throws RemoteException;
}
