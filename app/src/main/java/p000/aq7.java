package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.oq7;

/* JADX INFO: loaded from: classes3.dex */
public interface aq7 extends IInterface {

    /* JADX INFO: renamed from: aq7$a */
    public static class C1559a implements aq7 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // p000.aq7
        public void interrupt(byte[] request, oq7 callback) throws RemoteException {
        }

        @Override // p000.aq7
        public void startWork(byte[] request, oq7 callback) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: aq7$b */
    public static abstract class AbstractBinderC1560b extends Binder implements aq7 {

        /* JADX INFO: renamed from: a */
        public static final String f11579a = "androidx.work.multiprocess.IListenableWorkerImpl";

        /* JADX INFO: renamed from: b */
        public static final int f11580b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f11581c = 2;

        /* JADX INFO: renamed from: aq7$b$a */
        public static class a implements aq7 {

            /* JADX INFO: renamed from: b */
            public static aq7 f11582b;

            /* JADX INFO: renamed from: a */
            public IBinder f11583a;

            public a(IBinder remote) {
                this.f11583a = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11583a;
            }

            public String getInterfaceDescriptor() {
                return AbstractBinderC1560b.f11579a;
            }

            @Override // p000.aq7
            public void interrupt(byte[] request, oq7 callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC1560b.f11579a);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f11583a.transact(2, parcelObtain, null, 1) || AbstractBinderC1560b.getDefaultImpl() == null) {
                        parcelObtain.recycle();
                    } else {
                        AbstractBinderC1560b.getDefaultImpl().interrupt(request, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // p000.aq7
            public void startWork(byte[] request, oq7 callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC1560b.f11579a);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f11583a.transact(1, parcelObtain, null, 1) || AbstractBinderC1560b.getDefaultImpl() == null) {
                        parcelObtain.recycle();
                    } else {
                        AbstractBinderC1560b.getDefaultImpl().startWork(request, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public AbstractBinderC1560b() {
            attachInterface(this, f11579a);
        }

        public static aq7 asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(f11579a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof aq7)) ? new a(obj) : (aq7) iInterfaceQueryLocalInterface;
        }

        public static aq7 getDefaultImpl() {
            return a.f11582b;
        }

        public static boolean setDefaultImpl(aq7 impl) {
            if (a.f11582b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            a.f11582b = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == 1) {
                data.enforceInterface(f11579a);
                startWork(data.createByteArray(), oq7.AbstractBinderC10499b.asInterface(data.readStrongBinder()));
                return true;
            }
            if (code == 2) {
                data.enforceInterface(f11579a);
                interrupt(data.createByteArray(), oq7.AbstractBinderC10499b.asInterface(data.readStrongBinder()));
                return true;
            }
            if (code != 1598968902) {
                return super.onTransact(code, data, reply, flags);
            }
            reply.writeString(f11579a);
            return true;
        }
    }

    void interrupt(byte[] request, oq7 callback) throws RemoteException;

    void startWork(byte[] request, oq7 callback) throws RemoteException;
}
