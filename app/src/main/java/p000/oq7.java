package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface oq7 extends IInterface {

    /* JADX INFO: renamed from: oq7$a */
    public static class C10498a implements oq7 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // p000.oq7
        public void onFailure(String error) throws RemoteException {
        }

        @Override // p000.oq7
        public void onSuccess(byte[] response) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: oq7$b */
    public static abstract class AbstractBinderC10499b extends Binder implements oq7 {

        /* JADX INFO: renamed from: a */
        public static final String f68295a = "androidx.work.multiprocess.IWorkManagerImplCallback";

        /* JADX INFO: renamed from: b */
        public static final int f68296b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f68297c = 2;

        /* JADX INFO: renamed from: oq7$b$a */
        public static class a implements oq7 {

            /* JADX INFO: renamed from: b */
            public static oq7 f68298b;

            /* JADX INFO: renamed from: a */
            public IBinder f68299a;

            public a(IBinder remote) {
                this.f68299a = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f68299a;
            }

            public String getInterfaceDescriptor() {
                return AbstractBinderC10499b.f68295a;
            }

            @Override // p000.oq7
            public void onFailure(String error) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC10499b.f68295a);
                    parcelObtain.writeString(error);
                    if (this.f68299a.transact(2, parcelObtain, null, 1) || AbstractBinderC10499b.getDefaultImpl() == null) {
                        return;
                    }
                    AbstractBinderC10499b.getDefaultImpl().onFailure(error);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // p000.oq7
            public void onSuccess(byte[] response) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC10499b.f68295a);
                    parcelObtain.writeByteArray(response);
                    if (this.f68299a.transact(1, parcelObtain, null, 1) || AbstractBinderC10499b.getDefaultImpl() == null) {
                        return;
                    }
                    AbstractBinderC10499b.getDefaultImpl().onSuccess(response);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC10499b() {
            attachInterface(this, f68295a);
        }

        public static oq7 asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(f68295a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof oq7)) ? new a(obj) : (oq7) iInterfaceQueryLocalInterface;
        }

        public static oq7 getDefaultImpl() {
            return a.f68298b;
        }

        public static boolean setDefaultImpl(oq7 impl) {
            if (a.f68298b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            a.f68298b = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == 1) {
                data.enforceInterface(f68295a);
                onSuccess(data.createByteArray());
                return true;
            }
            if (code == 2) {
                data.enforceInterface(f68295a);
                onFailure(data.readString());
                return true;
            }
            if (code != 1598968902) {
                return super.onTransact(code, data, reply, flags);
            }
            reply.writeString(f68295a);
            return true;
        }
    }

    void onFailure(String error) throws RemoteException;

    void onSuccess(byte[] response) throws RemoteException;
}
