package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;
import android.util.Log;
import androidx.browser.customtabs.PostMessageService;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public abstract class n5d implements m5d, ServiceConnection {

    /* JADX INFO: renamed from: f */
    public static final String f63349f = "PostMessageServConn";

    /* JADX INFO: renamed from: a */
    public final Object f63350a = new Object();

    /* JADX INFO: renamed from: b */
    public final ICustomTabsCallback f63351b;

    /* JADX INFO: renamed from: c */
    @hib
    public IPostMessageService f63352c;

    /* JADX INFO: renamed from: d */
    @hib
    public String f63353d;

    /* JADX INFO: renamed from: e */
    public boolean f63354e;

    public n5d(@efb wd3 wd3Var) {
        IBinder iBinderM24485a = wd3Var.m24485a();
        if (iBinderM24485a == null) {
            throw new IllegalArgumentException("Provided session must have binder.");
        }
        this.f63351b = ICustomTabsCallback.Stub.asInterface(iBinderM24485a);
    }

    private boolean isBoundToService() {
        return this.f63352c != null;
    }

    private boolean notifyMessageChannelReadyInternal(@hib Bundle bundle) {
        if (this.f63352c == null) {
            return false;
        }
        synchronized (this.f63350a) {
            try {
                try {
                    this.f63352c.onMessageChannelReady(this.f63351b, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public boolean bindSessionToPostMessageService(@efb Context context, @efb String str) {
        Intent intent = new Intent();
        intent.setClassName(str, PostMessageService.class.getName());
        boolean zBindService = context.bindService(intent, this, 1);
        if (!zBindService) {
            Log.w(f63349f, "Could not bind to PostMessageService in client.");
        }
        return zBindService;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public void cleanup(@efb Context context) {
        if (isBoundToService()) {
            unbindFromContext(context);
        }
    }

    public final boolean notifyMessageChannelReady(@hib Bundle bundle) {
        this.f63354e = true;
        return notifyMessageChannelReadyInternal(bundle);
    }

    @Override // p000.m5d
    @p7e({p7e.EnumC10826a.f69934a})
    public void onDisconnectChannel(@efb Context context) {
        unbindFromContext(context);
    }

    @Override // p000.m5d
    @p7e({p7e.EnumC10826a.f69934a})
    public final boolean onNotifyMessageChannelReady(@hib Bundle bundle) {
        return notifyMessageChannelReady(bundle);
    }

    @Override // p000.m5d
    @p7e({p7e.EnumC10826a.f69934a})
    public final boolean onPostMessage(@efb String str, @hib Bundle bundle) {
        return postMessage(str, bundle);
    }

    public void onPostMessageServiceConnected() {
        if (this.f63354e) {
            notifyMessageChannelReadyInternal(null);
        }
    }

    public void onPostMessageServiceDisconnected() {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@efb ComponentName componentName, @efb IBinder iBinder) {
        this.f63352c = IPostMessageService.Stub.asInterface(iBinder);
        onPostMessageServiceConnected();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@efb ComponentName componentName) {
        this.f63352c = null;
        onPostMessageServiceDisconnected();
    }

    public final boolean postMessage(@efb String str, @hib Bundle bundle) {
        if (this.f63352c == null) {
            return false;
        }
        synchronized (this.f63350a) {
            try {
                try {
                    this.f63352c.onPostMessage(this.f63351b, str, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public void setPackageName(@efb String str) {
        this.f63353d = str;
    }

    public void unbindFromContext(@efb Context context) {
        if (isBoundToService()) {
            context.unbindService(this);
            this.f63352c = null;
        }
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public boolean bindSessionToPostMessageService(@efb Context context) {
        String str = this.f63353d;
        if (str != null) {
            return bindSessionToPostMessageService(context, str);
        }
        throw new IllegalStateException("setPackageName must be called before bindSessionToPostMessageService.");
    }
}
