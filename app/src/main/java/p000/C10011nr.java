package p000;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.us2;

/* JADX INFO: renamed from: nr */
/* JADX INFO: loaded from: classes5.dex */
public final class C10011nr implements us2 {

    /* JADX INFO: renamed from: e */
    public static final String f65321e = "AndroidConnectivityMonitor";

    /* JADX INFO: renamed from: a */
    public final Context f65322a;

    /* JADX INFO: renamed from: b */
    @hib
    public final ConnectivityManager f65323b;

    /* JADX INFO: renamed from: c */
    @hib
    public Runnable f65324c;

    /* JADX INFO: renamed from: d */
    public final List<su2<us2.EnumC13674a>> f65325d = new ArrayList();

    /* JADX INFO: renamed from: nr$a */
    public class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicBoolean f65326a;

        public a(AtomicBoolean atomicBoolean) {
            this.f65326a = atomicBoolean;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@efb Activity activity, Bundle bundle) {
            if (this.f65326a.compareAndSet(true, false)) {
                C10011nr.this.raiseForegroundNotification();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@efb Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@efb Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@efb Activity activity) {
            if (this.f65326a.compareAndSet(true, false)) {
                C10011nr.this.raiseForegroundNotification();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@efb Activity activity, @efb Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@efb Activity activity) {
            if (this.f65326a.compareAndSet(true, false)) {
                C10011nr.this.raiseForegroundNotification();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@efb Activity activity) {
        }
    }

    /* JADX INFO: renamed from: nr$b */
    public class b implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicBoolean f65328a;

        public b(AtomicBoolean atomicBoolean) {
            this.f65328a = atomicBoolean;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@efb Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            if (i == 20) {
                this.f65328a.set(true);
            }
        }
    }

    /* JADX INFO: renamed from: nr$c */
    @omg(24)
    public class c extends ConnectivityManager.NetworkCallback {
        private c() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C10011nr.this.raiseCallbacks(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            C10011nr.this.raiseCallbacks(false);
        }

        public /* synthetic */ c(C10011nr c10011nr, a aVar) {
            this();
        }
    }

    public C10011nr(Context context) {
        r80.hardAssert(context != null, "Context must be non-null", new Object[0]);
        this.f65322a = context;
        this.f65323b = (ConnectivityManager) context.getSystemService("connectivity");
        configureBackgroundStateListener();
        configureNetworkMonitoring();
    }

    private void configureBackgroundStateListener() {
        Application application = (Application) this.f65322a.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new a(atomicBoolean));
        application.registerComponentCallbacks(new b(atomicBoolean));
    }

    private void configureNetworkMonitoring() {
        a aVar = null;
        if (this.f65323b != null) {
            final c cVar = new c(this, aVar);
            this.f65323b.registerDefaultNetworkCallback(cVar);
            this.f65324c = new Runnable() { // from class: lr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f58490a.lambda$configureNetworkMonitoring$0(cVar);
                }
            };
        } else {
            final d dVar = new d(this, aVar);
            this.f65322a.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f65324c = new Runnable() { // from class: mr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61775a.lambda$configureNetworkMonitoring$1(dVar);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isConnected() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f65322a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureNetworkMonitoring$0(c cVar) {
        this.f65323b.unregisterNetworkCallback(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureNetworkMonitoring$1(d dVar) {
        this.f65322a.unregisterReceiver(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void raiseCallbacks(boolean z) {
        synchronized (this.f65325d) {
            try {
                Iterator<su2<us2.EnumC13674a>> it = this.f65325d.iterator();
                while (it.hasNext()) {
                    it.next().accept(z ? us2.EnumC13674a.REACHABLE : us2.EnumC13674a.UNREACHABLE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.us2
    public void addCallback(su2<us2.EnumC13674a> su2Var) {
        synchronized (this.f65325d) {
            this.f65325d.add(su2Var);
        }
    }

    public void raiseForegroundNotification() {
        fj9.debug(f65321e, "App has entered the foreground.", new Object[0]);
        if (isConnected()) {
            raiseCallbacks(true);
        }
    }

    @Override // p000.us2
    public void shutdown() {
        Runnable runnable = this.f65324c;
        if (runnable != null) {
            runnable.run();
            this.f65324c = null;
        }
    }

    /* JADX INFO: renamed from: nr$d */
    public class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public boolean f65331a;

        private d() {
            this.f65331a = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean zIsConnected = C10011nr.this.isConnected();
            if (C10011nr.this.isConnected() && !this.f65331a) {
                C10011nr.this.raiseCallbacks(true);
            } else if (!zIsConnected && this.f65331a) {
                C10011nr.this.raiseCallbacks(false);
            }
            this.f65331a = zIsConnected;
        }

        public /* synthetic */ d(C10011nr c10011nr, a aVar) {
            this();
        }
    }
}
