package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.widget.RemoteViews;
import java.util.List;
import p000.p7e;
import p000.wd3;

/* JADX INFO: loaded from: classes.dex */
public final class vd3 {

    /* JADX INFO: renamed from: f */
    public static final String f90725f = "CustomTabsSession";

    /* JADX INFO: renamed from: a */
    public final Object f90726a = new Object();

    /* JADX INFO: renamed from: b */
    public final ICustomTabsService f90727b;

    /* JADX INFO: renamed from: c */
    public final ICustomTabsCallback f90728c;

    /* JADX INFO: renamed from: d */
    public final ComponentName f90729d;

    /* JADX INFO: renamed from: e */
    @hib
    public final PendingIntent f90730e;

    /* JADX INFO: renamed from: vd3$a */
    public static class BinderC14008a extends ICustomTabsService.Stub {
        @Override // android.support.customtabs.ICustomTabsService
        public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(ICustomTabsCallback iCustomTabsCallback) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) throws RemoteException {
            return false;
        }
    }

    /* JADX INFO: renamed from: vd3$b */
    @p7e({p7e.EnumC10826a.f69934a})
    public static class C14009b {

        /* JADX INFO: renamed from: a */
        @hib
        public final qd3 f90731a;

        /* JADX INFO: renamed from: b */
        @hib
        public final PendingIntent f90732b;

        public C14009b(@hib qd3 qd3Var, @hib PendingIntent pendingIntent) {
            this.f90731a = qd3Var;
            this.f90732b = pendingIntent;
        }

        @hib
        /* JADX INFO: renamed from: a */
        public qd3 m23925a() {
            return this.f90731a;
        }

        @hib
        /* JADX INFO: renamed from: b */
        public PendingIntent m23926b() {
            return this.f90732b;
        }
    }

    public vd3(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, @hib PendingIntent pendingIntent) {
        this.f90727b = iCustomTabsService;
        this.f90728c = iCustomTabsCallback;
        this.f90729d = componentName;
        this.f90730e = pendingIntent;
    }

    private void addIdToBundle(Bundle bundle) {
        PendingIntent pendingIntent = this.f90730e;
        if (pendingIntent != null) {
            bundle.putParcelable(sd3.f81271e, pendingIntent);
        }
    }

    private Bundle createBundleWithId(@hib Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        addIdToBundle(bundle2);
        return bundle2;
    }

    @efb
    @fdi
    public static vd3 createMockSessionForTesting(@efb ComponentName componentName) {
        return new vd3(new BinderC14008a(), new wd3.BinderC14554b(), componentName, null);
    }

    /* JADX INFO: renamed from: a */
    public IBinder m23922a() {
        return this.f90728c.asBinder();
    }

    /* JADX INFO: renamed from: b */
    public ComponentName m23923b() {
        return this.f90729d;
    }

    @hib
    /* JADX INFO: renamed from: c */
    public PendingIntent m23924c() {
        return this.f90730e;
    }

    public boolean mayLaunchUrl(@hib Uri uri, @hib Bundle bundle, @hib List<Bundle> list) {
        try {
            return this.f90727b.mayLaunchUrl(this.f90728c, uri, createBundleWithId(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int postMessage(@efb String str, @hib Bundle bundle) {
        int iPostMessage;
        Bundle bundleCreateBundleWithId = createBundleWithId(bundle);
        synchronized (this.f90726a) {
            try {
                try {
                    iPostMessage = this.f90727b.postMessage(this.f90728c, str, bundleCreateBundleWithId);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iPostMessage;
    }

    public boolean receiveFile(@efb Uri uri, int i, @hib Bundle bundle) {
        try {
            return this.f90727b.receiveFile(this.f90728c, uri, i, createBundleWithId(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(@efb Uri uri) {
        try {
            return this.f90730e != null ? this.f90727b.requestPostMessageChannelWithExtras(this.f90728c, uri, createBundleWithId(null)) : this.f90727b.requestPostMessageChannel(this.f90728c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setActionButton(@efb Bitmap bitmap, @efb String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(sd3.f81286t, bitmap);
        bundle.putString(sd3.f81287u, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(sd3.f81283q, bundle);
        addIdToBundle(bundle);
        try {
            return this.f90727b.updateVisuals(this.f90728c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setSecondaryToolbarViews(@hib RemoteViews remoteViews, @hib int[] iArr, @hib PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(sd3.f81258G, remoteViews);
        bundle.putIntArray(sd3.f81259H, iArr);
        bundle.putParcelable(sd3.f81260I, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.f90727b.updateVisuals(this.f90728c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean setToolbarItem(int i, @efb Bitmap bitmap, @efb String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(sd3.f81266O, i);
        bundle.putParcelable(sd3.f81286t, bitmap);
        bundle.putString(sd3.f81287u, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(sd3.f81283q, bundle);
        addIdToBundle(bundle2);
        try {
            return this.f90727b.updateVisuals(this.f90728c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean validateRelationship(int i, @efb Uri uri, @hib Bundle bundle) {
        if (i >= 1 && i <= 2) {
            try {
                return this.f90727b.validateRelationship(this.f90728c, i, uri, createBundleWithId(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
