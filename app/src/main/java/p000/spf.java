package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000.h77;
import p000.ts2;

/* JADX INFO: loaded from: classes3.dex */
public final class spf {

    /* JADX INFO: renamed from: d */
    public static volatile spf f82544d = null;

    /* JADX INFO: renamed from: e */
    public static final String f82545e = "ConnectivityMonitor";

    /* JADX INFO: renamed from: a */
    public final InterfaceC12738c f82546a;

    /* JADX INFO: renamed from: b */
    @xc7("this")
    public final Set<ts2.InterfaceC13182a> f82547b = new HashSet();

    /* JADX INFO: renamed from: c */
    @xc7("this")
    public boolean f82548c;

    /* JADX INFO: renamed from: spf$a */
    public class C12736a implements h77.InterfaceC6734b<ConnectivityManager> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f82549a;

        public C12736a(Context context) {
            this.f82549a = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.h77.InterfaceC6734b
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f82549a.getSystemService("connectivity");
        }
    }

    /* JADX INFO: renamed from: spf$b */
    public class C12737b implements ts2.InterfaceC13182a {
        public C12737b() {
        }

        @Override // p000.ts2.InterfaceC13182a
        public void onConnectivityChanged(boolean z) {
            ArrayList arrayList;
            synchronized (spf.this) {
                arrayList = new ArrayList(spf.this.f82547b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ts2.InterfaceC13182a) it.next()).onConnectivityChanged(z);
            }
        }
    }

    /* JADX INFO: renamed from: spf$c */
    public interface InterfaceC12738c {
        boolean register();

        void unregister();
    }

    /* JADX INFO: renamed from: spf$d */
    @c5e(24)
    public static final class C12739d implements InterfaceC12738c {

        /* JADX INFO: renamed from: a */
        public boolean f82552a;

        /* JADX INFO: renamed from: b */
        public final ts2.InterfaceC13182a f82553b;

        /* JADX INFO: renamed from: c */
        public final h77.InterfaceC6734b<ConnectivityManager> f82554c;

        /* JADX INFO: renamed from: d */
        public final ConnectivityManager.NetworkCallback f82555d = new a();

        /* JADX INFO: renamed from: spf$d$a */
        public class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: spf$d$a$a, reason: collision with other inner class name */
            public class RunnableC16527a implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f82557a;

                public RunnableC16527a(boolean z) {
                    this.f82557a = z;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.m22177a(this.f82557a);
                }
            }

            public a() {
            }

            private void postOnConnectivityChange(boolean z) {
                v0i.postOnUiThread(new RunnableC16527a(z));
            }

            /* JADX INFO: renamed from: a */
            public void m22177a(boolean z) {
                v0i.assertMainThread();
                C12739d c12739d = C12739d.this;
                boolean z2 = c12739d.f82552a;
                c12739d.f82552a = z;
                if (z2 != z) {
                    c12739d.f82553b.onConnectivityChanged(z);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@efb Network network) {
                postOnConnectivityChange(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@efb Network network) {
                postOnConnectivityChange(false);
            }
        }

        public C12739d(h77.InterfaceC6734b<ConnectivityManager> interfaceC6734b, ts2.InterfaceC13182a interfaceC13182a) {
            this.f82554c = interfaceC6734b;
            this.f82553b = interfaceC13182a;
        }

        @Override // p000.spf.InterfaceC12738c
        @igg({"MissingPermission"})
        public boolean register() {
            this.f82552a = this.f82554c.get().getActiveNetwork() != null;
            try {
                this.f82554c.get().registerDefaultNetworkCallback(this.f82555d);
                return true;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                return false;
            }
        }

        @Override // p000.spf.InterfaceC12738c
        public void unregister() {
            this.f82554c.get().unregisterNetworkCallback(this.f82555d);
        }
    }

    /* JADX INFO: renamed from: spf$e */
    public static final class C12740e implements InterfaceC12738c {

        /* JADX INFO: renamed from: a */
        public final Context f82559a;

        /* JADX INFO: renamed from: b */
        public final ts2.InterfaceC13182a f82560b;

        /* JADX INFO: renamed from: c */
        public final h77.InterfaceC6734b<ConnectivityManager> f82561c;

        /* JADX INFO: renamed from: d */
        public boolean f82562d;

        /* JADX INFO: renamed from: e */
        public final BroadcastReceiver f82563e = new a();

        /* JADX INFO: renamed from: spf$e$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(@efb Context context, Intent intent) {
                C12740e c12740e = C12740e.this;
                boolean z = c12740e.f82562d;
                c12740e.f82562d = c12740e.m22178a();
                if (z != C12740e.this.f82562d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("connectivity changed, isConnected: ");
                        sb.append(C12740e.this.f82562d);
                    }
                    C12740e c12740e2 = C12740e.this;
                    c12740e2.f82560b.onConnectivityChanged(c12740e2.f82562d);
                }
            }
        }

        public C12740e(Context context, h77.InterfaceC6734b<ConnectivityManager> interfaceC6734b, ts2.InterfaceC13182a interfaceC13182a) {
            this.f82559a = context.getApplicationContext();
            this.f82561c = interfaceC6734b;
            this.f82560b = interfaceC13182a;
        }

        @igg({"MissingPermission"})
        /* JADX INFO: renamed from: a */
        public boolean m22178a() {
            try {
                NetworkInfo activeNetworkInfo = this.f82561c.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
                }
                return true;
            }
        }

        @Override // p000.spf.InterfaceC12738c
        public boolean register() {
            this.f82562d = m22178a();
            try {
                this.f82559a.registerReceiver(this.f82563e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                return true;
            } catch (SecurityException e) {
                if (!Log.isLoggable("ConnectivityMonitor", 5)) {
                    return false;
                }
                Log.w("ConnectivityMonitor", "Failed to register", e);
                return false;
            }
        }

        @Override // p000.spf.InterfaceC12738c
        public void unregister() {
            this.f82559a.unregisterReceiver(this.f82563e);
        }
    }

    private spf(@efb Context context) {
        this.f82546a = new C12739d(h77.memorize(new C12736a(context)), new C12737b());
    }

    /* JADX INFO: renamed from: a */
    public static spf m22173a(@efb Context context) {
        if (f82544d == null) {
            synchronized (spf.class) {
                try {
                    if (f82544d == null) {
                        f82544d = new spf(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f82544d;
    }

    @fdi
    /* JADX INFO: renamed from: c */
    public static void m22174c() {
        f82544d = null;
    }

    @xc7("this")
    private void maybeRegisterReceiver() {
        if (this.f82548c || this.f82547b.isEmpty()) {
            return;
        }
        this.f82548c = this.f82546a.register();
    }

    @xc7("this")
    private void maybeUnregisterReceiver() {
        if (this.f82548c && this.f82547b.isEmpty()) {
            this.f82546a.unregister();
            this.f82548c = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m22175b(ts2.InterfaceC13182a interfaceC13182a) {
        this.f82547b.add(interfaceC13182a);
        maybeRegisterReceiver();
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m22176d(ts2.InterfaceC13182a interfaceC13182a) {
        this.f82547b.remove(interfaceC13182a);
        maybeUnregisterReceiver();
    }
}
