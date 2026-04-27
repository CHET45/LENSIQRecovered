package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.oq7;

/* JADX INFO: loaded from: classes3.dex */
public interface nq7 extends IInterface {

    /* JADX INFO: renamed from: nq7$a */
    public static class C9986a implements nq7 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // p000.nq7
        public void cancelAllWork(oq7 callback) throws RemoteException {
        }

        @Override // p000.nq7
        public void cancelAllWorkByTag(String tag, oq7 callback) throws RemoteException {
        }

        @Override // p000.nq7
        public void cancelUniqueWork(String name, oq7 callback) throws RemoteException {
        }

        @Override // p000.nq7
        public void cancelWorkById(String id, oq7 callback) throws RemoteException {
        }

        @Override // p000.nq7
        public void enqueueContinuation(byte[] request, oq7 callback) throws RemoteException {
        }

        @Override // p000.nq7
        public void enqueueWorkRequests(byte[] request, oq7 callback) throws RemoteException {
        }

        @Override // p000.nq7
        public void queryWorkInfo(byte[] request, oq7 callback) throws RemoteException {
        }

        @Override // p000.nq7
        public void setProgress(byte[] request, oq7 callback) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: nq7$b */
    public static abstract class AbstractBinderC9987b extends Binder implements nq7 {

        /* JADX INFO: renamed from: a */
        public static final String f65259a = "androidx.work.multiprocess.IWorkManagerImpl";

        /* JADX INFO: renamed from: b */
        public static final int f65260b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f65261c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f65262d = 3;

        /* JADX INFO: renamed from: e */
        public static final int f65263e = 4;

        /* JADX INFO: renamed from: f */
        public static final int f65264f = 5;

        /* JADX INFO: renamed from: i */
        public static final int f65265i = 6;

        /* JADX INFO: renamed from: j */
        public static final int f65266j = 7;

        /* JADX INFO: renamed from: k */
        public static final int f65267k = 8;

        /* JADX INFO: renamed from: nq7$b$a */
        public static class a implements nq7 {

            /* JADX INFO: renamed from: b */
            public static nq7 f65268b;

            /* JADX INFO: renamed from: a */
            public IBinder f65269a;

            public a(IBinder remote) {
                this.f65269a = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f65269a;
            }

            @Override // p000.nq7
            public void cancelAllWork(oq7 callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC9987b.f65259a);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f65269a.transact(6, parcelObtain, null, 1) || AbstractBinderC9987b.getDefaultImpl() == null) {
                        parcelObtain.recycle();
                    } else {
                        AbstractBinderC9987b.getDefaultImpl().cancelAllWork(callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // p000.nq7
            public void cancelAllWorkByTag(String tag, oq7 callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC9987b.f65259a);
                    parcelObtain.writeString(tag);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f65269a.transact(4, parcelObtain, null, 1) || AbstractBinderC9987b.getDefaultImpl() == null) {
                        parcelObtain.recycle();
                    } else {
                        AbstractBinderC9987b.getDefaultImpl().cancelAllWorkByTag(tag, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // p000.nq7
            public void cancelUniqueWork(String name, oq7 callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC9987b.f65259a);
                    parcelObtain.writeString(name);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f65269a.transact(5, parcelObtain, null, 1) || AbstractBinderC9987b.getDefaultImpl() == null) {
                        parcelObtain.recycle();
                    } else {
                        AbstractBinderC9987b.getDefaultImpl().cancelUniqueWork(name, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // p000.nq7
            public void cancelWorkById(String id, oq7 callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC9987b.f65259a);
                    parcelObtain.writeString(id);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f65269a.transact(3, parcelObtain, null, 1) || AbstractBinderC9987b.getDefaultImpl() == null) {
                        parcelObtain.recycle();
                    } else {
                        AbstractBinderC9987b.getDefaultImpl().cancelWorkById(id, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // p000.nq7
            public void enqueueContinuation(byte[] request, oq7 callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC9987b.f65259a);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f65269a.transact(2, parcelObtain, null, 1) || AbstractBinderC9987b.getDefaultImpl() == null) {
                        parcelObtain.recycle();
                    } else {
                        AbstractBinderC9987b.getDefaultImpl().enqueueContinuation(request, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // p000.nq7
            public void enqueueWorkRequests(byte[] request, oq7 callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC9987b.f65259a);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f65269a.transact(1, parcelObtain, null, 1) || AbstractBinderC9987b.getDefaultImpl() == null) {
                        parcelObtain.recycle();
                    } else {
                        AbstractBinderC9987b.getDefaultImpl().enqueueWorkRequests(request, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            public String getInterfaceDescriptor() {
                return AbstractBinderC9987b.f65259a;
            }

            @Override // p000.nq7
            public void queryWorkInfo(byte[] request, oq7 callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC9987b.f65259a);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f65269a.transact(7, parcelObtain, null, 1) || AbstractBinderC9987b.getDefaultImpl() == null) {
                        parcelObtain.recycle();
                    } else {
                        AbstractBinderC9987b.getDefaultImpl().queryWorkInfo(request, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // p000.nq7
            public void setProgress(byte[] request, oq7 callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC9987b.f65259a);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    if (this.f65269a.transact(8, parcelObtain, null, 1) || AbstractBinderC9987b.getDefaultImpl() == null) {
                        parcelObtain.recycle();
                    } else {
                        AbstractBinderC9987b.getDefaultImpl().setProgress(request, callback);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public AbstractBinderC9987b() {
            attachInterface(this, f65259a);
        }

        public static nq7 asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(f65259a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof nq7)) ? new a(obj) : (nq7) iInterfaceQueryLocalInterface;
        }

        public static nq7 getDefaultImpl() {
            return a.f65268b;
        }

        public static boolean setDefaultImpl(nq7 impl) {
            if (a.f65268b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            a.f65268b = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code == 1598968902) {
                reply.writeString(f65259a);
                return true;
            }
            switch (code) {
                case 1:
                    data.enforceInterface(f65259a);
                    enqueueWorkRequests(data.createByteArray(), oq7.AbstractBinderC10499b.asInterface(data.readStrongBinder()));
                    return true;
                case 2:
                    data.enforceInterface(f65259a);
                    enqueueContinuation(data.createByteArray(), oq7.AbstractBinderC10499b.asInterface(data.readStrongBinder()));
                    return true;
                case 3:
                    data.enforceInterface(f65259a);
                    cancelWorkById(data.readString(), oq7.AbstractBinderC10499b.asInterface(data.readStrongBinder()));
                    return true;
                case 4:
                    data.enforceInterface(f65259a);
                    cancelAllWorkByTag(data.readString(), oq7.AbstractBinderC10499b.asInterface(data.readStrongBinder()));
                    return true;
                case 5:
                    data.enforceInterface(f65259a);
                    cancelUniqueWork(data.readString(), oq7.AbstractBinderC10499b.asInterface(data.readStrongBinder()));
                    return true;
                case 6:
                    data.enforceInterface(f65259a);
                    cancelAllWork(oq7.AbstractBinderC10499b.asInterface(data.readStrongBinder()));
                    return true;
                case 7:
                    data.enforceInterface(f65259a);
                    queryWorkInfo(data.createByteArray(), oq7.AbstractBinderC10499b.asInterface(data.readStrongBinder()));
                    return true;
                case 8:
                    data.enforceInterface(f65259a);
                    setProgress(data.createByteArray(), oq7.AbstractBinderC10499b.asInterface(data.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void cancelAllWork(oq7 callback) throws RemoteException;

    void cancelAllWorkByTag(String tag, oq7 callback) throws RemoteException;

    void cancelUniqueWork(String name, oq7 callback) throws RemoteException;

    void cancelWorkById(String id, oq7 callback) throws RemoteException;

    void enqueueContinuation(byte[] request, oq7 callback) throws RemoteException;

    void enqueueWorkRequests(byte[] request, oq7 callback) throws RemoteException;

    void queryWorkInfo(byte[] request, oq7 callback) throws RemoteException;

    void setProgress(byte[] request, oq7 callback) throws RemoteException;
}
