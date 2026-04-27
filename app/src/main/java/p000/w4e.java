package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.media3.exoplayer.scheduler.Requirements;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class w4e {

    /* JADX INFO: renamed from: a */
    public final Context f93246a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC14385c f93247b;

    /* JADX INFO: renamed from: c */
    public final Requirements f93248c;

    /* JADX INFO: renamed from: d */
    public final Handler f93249d = t0i.createHandlerForCurrentOrMainLooper();

    /* JADX INFO: renamed from: e */
    @hib
    public C14384b f93250e;

    /* JADX INFO: renamed from: f */
    public int f93251f;

    /* JADX INFO: renamed from: g */
    @hib
    public C14386d f93252g;

    /* JADX INFO: renamed from: w4e$b */
    public class C14384b extends BroadcastReceiver {
        private C14384b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            w4e.this.checkRequirements();
        }
    }

    /* JADX INFO: renamed from: w4e$c */
    public interface InterfaceC14385c {
        void onRequirementsStateChanged(w4e w4eVar, int i);
    }

    /* JADX INFO: renamed from: w4e$d */
    @c5e(24)
    public final class C14386d extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a */
        public boolean f93254a;

        /* JADX INFO: renamed from: b */
        public boolean f93255b;

        private C14386d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$postCheckRequirements$0() {
            if (w4e.this.f93252g != null) {
                w4e.this.checkRequirements();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$postRecheckNotMetNetworkRequirements$1() {
            if (w4e.this.f93252g != null) {
                w4e.this.recheckNotMetNetworkRequirements();
            }
        }

        private void postCheckRequirements() {
            w4e.this.f93249d.post(new Runnable() { // from class: y4e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f100344a.lambda$postCheckRequirements$0();
                }
            });
        }

        private void postRecheckNotMetNetworkRequirements() {
            w4e.this.f93249d.post(new Runnable() { // from class: a5e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f447a.lambda$postRecheckNotMetNetworkRequirements$1();
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            postCheckRequirements();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z) {
            if (z) {
                return;
            }
            postRecheckNotMetNetworkRequirements();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f93254a && this.f93255b == zHasCapability) {
                if (zHasCapability) {
                    postRecheckNotMetNetworkRequirements();
                }
            } else {
                this.f93254a = true;
                this.f93255b = zHasCapability;
                postCheckRequirements();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            postCheckRequirements();
        }
    }

    public w4e(Context context, InterfaceC14385c interfaceC14385c, Requirements requirements) {
        this.f93246a = context.getApplicationContext();
        this.f93247b = interfaceC14385c;
        this.f93248c = requirements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkRequirements() {
        int notMetRequirements = this.f93248c.getNotMetRequirements(this.f93246a);
        if (this.f93251f != notMetRequirements) {
            this.f93251f = notMetRequirements;
            this.f93247b.onRequirementsStateChanged(this, notMetRequirements);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recheckNotMetNetworkRequirements() {
        if ((this.f93251f & 3) == 0) {
            return;
        }
        checkRequirements();
    }

    @c5e(24)
    private void registerNetworkCallbackV24() {
        ConnectivityManager connectivityManager = (ConnectivityManager) v80.checkNotNull((ConnectivityManager) this.f93246a.getSystemService("connectivity"));
        C14386d c14386d = new C14386d();
        this.f93252g = c14386d;
        connectivityManager.registerDefaultNetworkCallback(c14386d);
    }

    @c5e(24)
    private void unregisterNetworkCallbackV24() {
        ((ConnectivityManager) v80.checkNotNull((ConnectivityManager) this.f93246a.getSystemService("connectivity"))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) v80.checkNotNull(this.f93252g));
        this.f93252g = null;
    }

    public Requirements getRequirements() {
        return this.f93248c;
    }

    public int start() {
        this.f93251f = this.f93248c.getNotMetRequirements(this.f93246a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f93248c.isNetworkRequired()) {
            registerNetworkCallbackV24();
        }
        if (this.f93248c.isChargingRequired()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f93248c.isIdleRequired()) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        if (this.f93248c.isStorageNotLowRequired()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        C14384b c14384b = new C14384b();
        this.f93250e = c14384b;
        this.f93246a.registerReceiver(c14384b, intentFilter, null, this.f93249d);
        return this.f93251f;
    }

    public void stop() {
        this.f93246a.unregisterReceiver((BroadcastReceiver) v80.checkNotNull(this.f93250e));
        this.f93250e = null;
        if (this.f93252g != null) {
            unregisterNetworkCallbackV24();
        }
    }
}
