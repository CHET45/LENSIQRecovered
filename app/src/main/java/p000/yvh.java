package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* JADX INFO: loaded from: classes.dex */
public class yvh implements ServiceConnection {

    /* JADX INFO: renamed from: b */
    @efb
    public o5e<Integer> f103167b;

    /* JADX INFO: renamed from: c */
    public final Context f103168c;

    /* JADX INFO: renamed from: a */
    @hib
    @fdi
    public IUnusedAppRestrictionsBackportService f103166a = null;

    /* JADX INFO: renamed from: d */
    public boolean f103169d = false;

    /* JADX INFO: renamed from: yvh$a */
    public class BinderC15853a extends IUnusedAppRestrictionsBackportCallback.Stub {
        public BinderC15853a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
        public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws RemoteException {
            if (!z) {
                yvh.this.f103167b.set(0);
                Log.e(oac.f66998a, "Unable to retrieve the permission revocation setting from the backport");
            } else if (z2) {
                yvh.this.f103167b.set(3);
            } else {
                yvh.this.f103167b.set(2);
            }
        }
    }

    public yvh(@efb Context context) {
        this.f103168c = context;
    }

    private IUnusedAppRestrictionsBackportCallback getBackportCallback() {
        return new BinderC15853a();
    }

    public void connectAndFetchResult(@efb o5e<Integer> o5eVar) {
        if (this.f103169d) {
            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
        this.f103169d = true;
        this.f103167b = o5eVar;
        this.f103168c.bindService(new Intent(UnusedAppRestrictionsBackportService.f7416b).setPackage(oac.getPermissionRevocationVerifierApp(this.f103168c.getPackageManager())), this, 1);
    }

    public void disconnectFromService() {
        if (!this.f103169d) {
            throw new IllegalStateException("bindService must be called before unbind");
        }
        this.f103169d = false;
        this.f103168c.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IUnusedAppRestrictionsBackportService iUnusedAppRestrictionsBackportServiceAsInterface = IUnusedAppRestrictionsBackportService.Stub.asInterface(iBinder);
        this.f103166a = iUnusedAppRestrictionsBackportServiceAsInterface;
        try {
            iUnusedAppRestrictionsBackportServiceAsInterface.isPermissionRevocationEnabledForApp(getBackportCallback());
        } catch (RemoteException unused) {
            this.f103167b.set(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f103166a = null;
    }
}
