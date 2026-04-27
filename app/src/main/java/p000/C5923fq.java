package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: fq */
/* JADX INFO: loaded from: classes7.dex */
public final class C5923fq extends er6<C5923fq> {

    /* JADX INFO: renamed from: c */
    public static final String f37375c = "AndroidChannelBuilder";

    /* JADX INFO: renamed from: d */
    @eib
    public static final tr9 f37376d = findOkHttp();

    /* JADX INFO: renamed from: a */
    public final pr9<?> f37377a;

    /* JADX INFO: renamed from: b */
    @eib
    public Context f37378b;

    /* JADX INFO: renamed from: fq$b */
    @gdi
    public static final class b extends or9 {

        /* JADX INFO: renamed from: a */
        public final or9 f37379a;

        /* JADX INFO: renamed from: b */
        @eib
        public final Context f37380b;

        /* JADX INFO: renamed from: c */
        @eib
        public final ConnectivityManager f37381c;

        /* JADX INFO: renamed from: d */
        public final Object f37382d = new Object();

        /* JADX INFO: renamed from: e */
        @vc7("lock")
        public Runnable f37383e;

        /* JADX INFO: renamed from: fq$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ c f37384a;

            public a(c cVar) {
                this.f37384a = cVar;
            }

            @Override // java.lang.Runnable
            @omg(21)
            public void run() {
                b.this.f37381c.unregisterNetworkCallback(this.f37384a);
            }
        }

        /* JADX INFO: renamed from: fq$b$b, reason: collision with other inner class name */
        public class RunnableC16447b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d f37386a;

            public RunnableC16447b(d dVar) {
                this.f37386a = dVar;
            }

            @Override // java.lang.Runnable
            @omg(21)
            public void run() {
                b.this.f37380b.unregisterReceiver(this.f37386a);
            }
        }

        /* JADX INFO: renamed from: fq$b$c */
        @omg(24)
        public class c extends ConnectivityManager.NetworkCallback {
            private c() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b.this.f37379a.enterIdle();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onBlockedStatusChanged(Network network, boolean z) {
                if (z) {
                    return;
                }
                b.this.f37379a.enterIdle();
            }
        }

        /* JADX INFO: renamed from: fq$b$d */
        public class d extends BroadcastReceiver {

            /* JADX INFO: renamed from: a */
            public boolean f37389a;

            private d() {
                this.f37389a = false;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z = this.f37389a;
                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f37389a = z2;
                if (!z2 || z) {
                    return;
                }
                b.this.f37379a.enterIdle();
            }
        }

        @gdi
        public b(or9 or9Var, @eib Context context) {
            this.f37379a = or9Var;
            this.f37380b = context;
            if (context == null) {
                this.f37381c = null;
                return;
            }
            this.f37381c = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                configureNetworkMonitoring();
            } catch (SecurityException e) {
                Log.w(C5923fq.f37375c, "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e);
            }
        }

        @vc7("lock")
        private void configureNetworkMonitoring() {
            if (this.f37381c != null) {
                c cVar = new c();
                this.f37381c.registerDefaultNetworkCallback(cVar);
                this.f37383e = new a(cVar);
            } else {
                d dVar = new d();
                this.f37380b.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f37383e = new RunnableC16447b(dVar);
            }
        }

        private void unregisterNetworkListener() {
            synchronized (this.f37382d) {
                try {
                    Runnable runnable = this.f37383e;
                    if (runnable != null) {
                        runnable.run();
                        this.f37383e = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.bu1
        public String authority() {
            return this.f37379a.authority();
        }

        @Override // p000.or9
        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f37379a.awaitTermination(j, timeUnit);
        }

        @Override // p000.or9
        public void enterIdle() {
            this.f37379a.enterIdle();
        }

        @Override // p000.or9
        public ws2 getState(boolean z) {
            return this.f37379a.getState(z);
        }

        @Override // p000.or9
        public boolean isShutdown() {
            return this.f37379a.isShutdown();
        }

        @Override // p000.or9
        public boolean isTerminated() {
            return this.f37379a.isTerminated();
        }

        @Override // p000.bu1
        public <RequestT, ResponseT> w22<RequestT, ResponseT> newCall(rua<RequestT, ResponseT> ruaVar, rn1 rn1Var) {
            return this.f37379a.newCall(ruaVar, rn1Var);
        }

        @Override // p000.or9
        public void notifyWhenStateChanged(ws2 ws2Var, Runnable runnable) {
            this.f37379a.notifyWhenStateChanged(ws2Var, runnable);
        }

        @Override // p000.or9
        public void resetConnectBackoff() {
            this.f37379a.resetConnectBackoff();
        }

        @Override // p000.or9
        public or9 shutdown() {
            unregisterNetworkListener();
            return this.f37379a.shutdown();
        }

        @Override // p000.or9
        public or9 shutdownNow() {
            unregisterNetworkListener();
            return this.f37379a.shutdownNow();
        }
    }

    private C5923fq(String str) {
        tr9 tr9Var = f37376d;
        if (tr9Var == null) {
            throw new UnsupportedOperationException("Unable to load OkHttpChannelProvider");
        }
        this.f37377a = db8.builderForTarget(tr9Var, str);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    private static tr9 findOkHttp() {
        try {
            try {
                tr9 tr9Var = (tr9) h0c.class.asSubclass(tr9.class).getConstructor(null).newInstance(null);
                if (db8.isAvailable(tr9Var)) {
                    return tr9Var;
                }
                Log.w(f37375c, "OkHttpChannelProvider.isAvailable() returned false");
                return null;
            } catch (Exception e) {
                Log.w(f37375c, "Failed to construct OkHttpChannelProvider", e);
                return null;
            }
        } catch (ClassCastException e2) {
            Log.w(f37375c, "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e2);
            return null;
        }
    }

    public static C5923fq forAddress(String str, int i) {
        return forTarget(oc7.authorityFromHostAndPort(str, i));
    }

    public static C5923fq forTarget(String str) {
        return new C5923fq(str);
    }

    @lg5("https://github.com/grpc/grpc-java/issues/6043")
    @Deprecated
    @p28(imports = {"io.grpc.android.AndroidChannelBuilder"}, replacement = "AndroidChannelBuilder.usingBuilder(builder)")
    public static C5923fq fromBuilder(pr9<?> pr9Var) {
        return usingBuilder(pr9Var);
    }

    public static C5923fq usingBuilder(pr9<?> pr9Var) {
        return new C5923fq(pr9Var);
    }

    @Override // p000.er6, p000.dr6
    /* JADX INFO: renamed from: a */
    public pr9<?> mo9331a() {
        return this.f37377a;
    }

    @Override // p000.dr6, p000.pr9
    public or9 build() {
        return new b(this.f37377a.build(), this.f37378b);
    }

    public C5923fq context(Context context) {
        this.f37378b = context;
        return this;
    }

    private C5923fq(pr9<?> pr9Var) {
        this.f37377a = (pr9) v7d.checkNotNull(pr9Var, "delegateBuilder");
    }
}
