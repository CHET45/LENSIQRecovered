package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import com.google.android.exoplayer2.scheduler.Requirements;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b5e {

    /* JADX INFO: renamed from: a */
    public final Context f12717a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1745c f12718b;

    /* JADX INFO: renamed from: c */
    public final Requirements f12719c;

    /* JADX INFO: renamed from: d */
    public final Handler f12720d = x0i.createHandlerForCurrentOrMainLooper();

    /* JADX INFO: renamed from: e */
    @hib
    public C1744b f12721e;

    /* JADX INFO: renamed from: f */
    public int f12722f;

    /* JADX INFO: renamed from: g */
    @hib
    public C1746d f12723g;

    /* JADX INFO: renamed from: b5e$b */
    public class C1744b extends BroadcastReceiver {
        private C1744b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            b5e.this.checkRequirements();
        }
    }

    /* JADX INFO: renamed from: b5e$c */
    public interface InterfaceC1745c {
        void onRequirementsStateChanged(b5e b5eVar, int i);
    }

    /* JADX INFO: renamed from: b5e$d */
    @c5e(24)
    public final class C1746d extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a */
        public boolean f12725a;

        /* JADX INFO: renamed from: b */
        public boolean f12726b;

        private C1746d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$postCheckRequirements$0() {
            if (b5e.this.f12723g != null) {
                b5e.this.checkRequirements();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$postRecheckNotMetNetworkRequirements$1() {
            if (b5e.this.f12723g != null) {
                b5e.this.recheckNotMetNetworkRequirements();
            }
        }

        private void postCheckRequirements() {
            b5e.this.f12720d.post(new Runnable() { // from class: x4e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f96699a.lambda$postCheckRequirements$0();
                }
            });
        }

        private void postRecheckNotMetNetworkRequirements() {
            b5e.this.f12720d.post(new Runnable() { // from class: z4e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f104154a.lambda$postRecheckNotMetNetworkRequirements$1();
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
            if (this.f12725a && this.f12726b == zHasCapability) {
                if (zHasCapability) {
                    postRecheckNotMetNetworkRequirements();
                }
            } else {
                this.f12725a = true;
                this.f12726b = zHasCapability;
                postCheckRequirements();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            postCheckRequirements();
        }
    }

    public b5e(Context context, InterfaceC1745c interfaceC1745c, Requirements requirements) {
        this.f12717a = context.getApplicationContext();
        this.f12718b = interfaceC1745c;
        this.f12719c = requirements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkRequirements() {
        int notMetRequirements = this.f12719c.getNotMetRequirements(this.f12717a);
        if (this.f12722f != notMetRequirements) {
            this.f12722f = notMetRequirements;
            this.f12718b.onRequirementsStateChanged(this, notMetRequirements);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recheckNotMetNetworkRequirements() {
        if ((this.f12722f & 3) == 0) {
            return;
        }
        checkRequirements();
    }

    @c5e(24)
    private void registerNetworkCallbackV24() {
        ConnectivityManager connectivityManager = (ConnectivityManager) u80.checkNotNull((ConnectivityManager) this.f12717a.getSystemService("connectivity"));
        C1746d c1746d = new C1746d();
        this.f12723g = c1746d;
        connectivityManager.registerDefaultNetworkCallback(c1746d);
    }

    @c5e(24)
    private void unregisterNetworkCallbackV24() {
        ((ConnectivityManager) u80.checkNotNull((ConnectivityManager) this.f12717a.getSystemService("connectivity"))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) u80.checkNotNull(this.f12723g));
        this.f12723g = null;
    }

    public Requirements getRequirements() {
        return this.f12719c;
    }

    public int start() {
        this.f12722f = this.f12719c.getNotMetRequirements(this.f12717a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f12719c.isNetworkRequired()) {
            if (x0i.f95978a >= 24) {
                registerNetworkCallbackV24();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f12719c.isChargingRequired()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f12719c.isIdleRequired()) {
            if (x0i.f95978a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.f12719c.isStorageNotLowRequired()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        C1744b c1744b = new C1744b();
        this.f12721e = c1744b;
        this.f12717a.registerReceiver(c1744b, intentFilter, null, this.f12720d);
        return this.f12722f;
    }

    public void stop() {
        this.f12717a.unregisterReceiver((BroadcastReceiver) u80.checkNotNull(this.f12721e));
        this.f12721e = null;
        if (x0i.f95978a < 24 || this.f12723g == null) {
            return;
        }
        unregisterNetworkCallbackV24();
    }
}
