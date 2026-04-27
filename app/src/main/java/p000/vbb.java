package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class vbb extends hu2<rbb> {

    /* JADX INFO: renamed from: j */
    public static final String f90559j = cj9.tagWithPrefix("NetworkStateTracker");

    /* JADX INFO: renamed from: g */
    public final ConnectivityManager f90560g;

    /* JADX INFO: renamed from: h */
    @c5e(24)
    public C13988b f90561h;

    /* JADX INFO: renamed from: i */
    public C13987a f90562i;

    /* JADX INFO: renamed from: vbb$a */
    public class C13987a extends BroadcastReceiver {
        public C13987a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            cj9.get().debug(vbb.f90559j, "Network broadcast received", new Throwable[0]);
            vbb vbbVar = vbb.this;
            vbbVar.setState(vbbVar.m23904a());
        }
    }

    /* JADX INFO: renamed from: vbb$b */
    @c5e(24)
    public class C13988b extends ConnectivityManager.NetworkCallback {
        public C13988b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@efb Network network, @efb NetworkCapabilities capabilities) {
            cj9.get().debug(vbb.f90559j, String.format("Network capabilities changed: %s", capabilities), new Throwable[0]);
            vbb vbbVar = vbb.this;
            vbbVar.setState(vbbVar.m23904a());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@efb Network network) {
            cj9.get().debug(vbb.f90559j, "Network connection lost", new Throwable[0]);
            vbb vbbVar = vbb.this;
            vbbVar.setState(vbbVar.m23904a());
        }
    }

    public vbb(@efb Context context, @efb ong taskExecutor) {
        super(context, taskExecutor);
        this.f90560g = (ConnectivityManager) this.f44876b.getSystemService("connectivity");
        if (isNetworkCallbackSupported()) {
            this.f90561h = new C13988b();
        } else {
            this.f90562i = new C13987a();
        }
    }

    private static boolean isNetworkCallbackSupported() {
        return true;
    }

    /* JADX INFO: renamed from: a */
    public rbb m23904a() {
        NetworkInfo activeNetworkInfo = this.f90560g.getActiveNetworkInfo();
        boolean z = false;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zM23905b = m23905b();
        boolean zIsActiveNetworkMetered = ss2.isActiveNetworkMetered(this.f90560g);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z = true;
        }
        return new rbb(z2, zM23905b, zIsActiveNetworkMetered, z);
    }

    @fdi
    /* JADX INFO: renamed from: b */
    public boolean m23905b() {
        try {
            NetworkCapabilities networkCapabilities = this.f90560g.getNetworkCapabilities(this.f90560g.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e) {
            cj9.get().error(f90559j, "Unable to validate active network", e);
            return false;
        }
    }

    @Override // p000.hu2
    public void startTracking() {
        if (!isNetworkCallbackSupported()) {
            cj9.get().debug(f90559j, "Registering broadcast receiver", new Throwable[0]);
            this.f44876b.registerReceiver(this.f90562i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            cj9.get().debug(f90559j, "Registering network callback", new Throwable[0]);
            this.f90560g.registerDefaultNetworkCallback(this.f90561h);
        } catch (IllegalArgumentException | SecurityException e) {
            cj9.get().error(f90559j, "Received exception while registering network callback", e);
        }
    }

    @Override // p000.hu2
    public void stopTracking() {
        if (!isNetworkCallbackSupported()) {
            cj9.get().debug(f90559j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f44876b.unregisterReceiver(this.f90562i);
            return;
        }
        try {
            cj9.get().debug(f90559j, "Unregistering network callback", new Throwable[0]);
            this.f90560g.unregisterNetworkCallback(this.f90561h);
        } catch (IllegalArgumentException | SecurityException e) {
            cj9.get().error(f90559j, "Received exception while unregistering network callback", e);
        }
    }

    @Override // p000.hu2
    public rbb getInitialState() {
        return m23904a();
    }
}
