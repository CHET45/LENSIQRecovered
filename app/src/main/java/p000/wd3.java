package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.util.Log;
import androidx.core.app.BundleCompat;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public class wd3 {

    /* JADX INFO: renamed from: d */
    public static final String f93970d = "CustomTabsSessionToken";

    /* JADX INFO: renamed from: a */
    @hib
    public final ICustomTabsCallback f93971a;

    /* JADX INFO: renamed from: b */
    @hib
    public final PendingIntent f93972b;

    /* JADX INFO: renamed from: c */
    @hib
    public final qd3 f93973c;

    /* JADX INFO: renamed from: wd3$a */
    public class C14553a extends qd3 {
        public C14553a() {
        }

        @Override // p000.qd3
        public void extraCallback(@efb String str, @hib Bundle bundle) {
            try {
                wd3.this.f93971a.extraCallback(str, bundle);
            } catch (RemoteException unused) {
                Log.e(wd3.f93970d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p000.qd3
        @efb
        public Bundle extraCallbackWithResult(@efb String str, @hib Bundle bundle) {
            try {
                return wd3.this.f93971a.extraCallbackWithResult(str, bundle);
            } catch (RemoteException unused) {
                Log.e(wd3.f93970d, "RemoteException during ICustomTabsCallback transaction");
                return null;
            }
        }

        @Override // p000.qd3
        public void onMessageChannelReady(@hib Bundle bundle) {
            try {
                wd3.this.f93971a.onMessageChannelReady(bundle);
            } catch (RemoteException unused) {
                Log.e(wd3.f93970d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p000.qd3
        public void onNavigationEvent(int i, @hib Bundle bundle) {
            try {
                wd3.this.f93971a.onNavigationEvent(i, bundle);
            } catch (RemoteException unused) {
                Log.e(wd3.f93970d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p000.qd3
        public void onPostMessage(@efb String str, @hib Bundle bundle) {
            try {
                wd3.this.f93971a.onPostMessage(str, bundle);
            } catch (RemoteException unused) {
                Log.e(wd3.f93970d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p000.qd3
        public void onRelationshipValidationResult(int i, @efb Uri uri, boolean z, @hib Bundle bundle) {
            try {
                wd3.this.f93971a.onRelationshipValidationResult(i, uri, z, bundle);
            } catch (RemoteException unused) {
                Log.e(wd3.f93970d, "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    /* JADX INFO: renamed from: wd3$b */
    public static class BinderC14554b extends ICustomTabsCallback.Stub {
        @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        }
    }

    public wd3(@hib ICustomTabsCallback iCustomTabsCallback, @hib PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f93971a = iCustomTabsCallback;
        this.f93972b = pendingIntent;
        this.f93973c = iCustomTabsCallback == null ? null : new C14553a();
    }

    @efb
    public static wd3 createMockSessionTokenForTesting() {
        return new wd3(new BinderC14554b(), null);
    }

    private IBinder getCallbackBinderAssertNotNull() {
        ICustomTabsCallback iCustomTabsCallback = this.f93971a;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    @hib
    public static wd3 getSessionTokenFromIntent(@efb Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        IBinder binder = BundleCompat.getBinder(extras, sd3.f81270d);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(sd3.f81271e);
        if (binder == null && pendingIntent == null) {
            return null;
        }
        return new wd3(binder != null ? ICustomTabsCallback.Stub.asInterface(binder) : null, pendingIntent);
    }

    @hib
    /* JADX INFO: renamed from: a */
    public IBinder m24485a() {
        ICustomTabsCallback iCustomTabsCallback = this.f93971a;
        if (iCustomTabsCallback == null) {
            return null;
        }
        return iCustomTabsCallback.asBinder();
    }

    @hib
    /* JADX INFO: renamed from: b */
    public PendingIntent m24486b() {
        return this.f93972b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wd3)) {
            return false;
        }
        wd3 wd3Var = (wd3) obj;
        PendingIntent pendingIntentM24486b = wd3Var.m24486b();
        PendingIntent pendingIntent = this.f93972b;
        if ((pendingIntent == null) != (pendingIntentM24486b == null)) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(pendingIntentM24486b) : getCallbackBinderAssertNotNull().equals(wd3Var.getCallbackBinderAssertNotNull());
    }

    @hib
    public qd3 getCallback() {
        return this.f93973c;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public boolean hasCallback() {
        return this.f93971a != null;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public boolean hasId() {
        return this.f93972b != null;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f93972b;
        return pendingIntent != null ? pendingIntent.hashCode() : getCallbackBinderAssertNotNull().hashCode();
    }

    public boolean isAssociatedWith(@efb vd3 vd3Var) {
        return vd3Var.m23922a().equals(this.f93971a);
    }
}
