package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class zbb {

    /* JADX INFO: renamed from: f */
    @hib
    public static zbb f104710f;

    /* JADX INFO: renamed from: a */
    public final Executor f104711a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<C16079d> f104712b;

    /* JADX INFO: renamed from: c */
    public final Object f104713c;

    /* JADX INFO: renamed from: d */
    @xc7("lock")
    public int f104714d;

    /* JADX INFO: renamed from: e */
    @xc7("lock")
    public boolean f104715e;

    /* JADX INFO: renamed from: zbb$b */
    @c5e(31)
    public static final class C16077b {

        /* JADX INFO: renamed from: zbb$b$a */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a */
            public final zbb f104716a;

            public a(zbb zbbVar) {
                this.f104716a = zbbVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f104716a.updateNetworkType(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        private C16077b() {
        }

        public static void disambiguate4gAnd5gNsa(Context context, zbb zbbVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) v80.checkNotNull((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(zbbVar);
                telephonyManager.registerTelephonyCallback(zbbVar.f104711a, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                zbbVar.updateNetworkType(5);
            }
        }
    }

    /* JADX INFO: renamed from: zbb$c */
    public interface InterfaceC16078c {
        void onNetworkTypeChanged(int i);
    }

    /* JADX INFO: renamed from: zbb$d */
    public final class C16079d {

        /* JADX INFO: renamed from: a */
        public final WeakReference<InterfaceC16078c> f104717a;

        /* JADX INFO: renamed from: b */
        public final Executor f104718b;

        public C16079d(InterfaceC16078c interfaceC16078c, Executor executor) {
            this.f104717a = new WeakReference<>(interfaceC16078c);
            this.f104718b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$callOnNetworkTypeChanged$0() {
            InterfaceC16078c interfaceC16078c = this.f104717a.get();
            if (interfaceC16078c != null) {
                interfaceC16078c.onNetworkTypeChanged(zbb.this.getNetworkType());
            }
        }

        public void callOnNetworkTypeChanged() {
            this.f104718b.execute(new Runnable() { // from class: ecb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32627a.lambda$callOnNetworkTypeChanged$0();
                }
            });
        }

        public boolean canBeRemoved() {
            return this.f104717a.get() == null;
        }
    }

    /* JADX INFO: renamed from: zbb$e */
    public final class C16080e extends BroadcastReceiver {
        private C16080e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0(Context context) {
            zbb.this.handleConnectivityActionBroadcast(context);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            zbb.this.f104711a.execute(new Runnable() { // from class: fcb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36121a.lambda$onReceive$0(context);
                }
            });
        }
    }

    private zbb(final Context context) {
        Executor executor = bo0.get();
        this.f104711a = executor;
        this.f104712b = new CopyOnWriteArrayList<>();
        this.f104713c = new Object();
        this.f104714d = 0;
        executor.execute(new Runnable() { // from class: ybb
            @Override // java.lang.Runnable
            public final void run() {
                this.f101045a.lambda$new$0(context);
            }
        });
    }

    public static synchronized zbb getInstance(Context context) {
        try {
            if (f104710f == null) {
                f104710f = new zbb(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f104710f;
    }

    private static int getMobileNetworkType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return Build.VERSION.SDK_INT >= 29 ? 9 : 0;
        }
    }

    private static int getNetworkTypeFromConnectivityManager(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return getMobileNetworkType(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleConnectivityActionBroadcast(Context context) {
        int networkTypeFromConnectivityManager = getNetworkTypeFromConnectivityManager(context);
        if (Build.VERSION.SDK_INT < 31 || networkTypeFromConnectivityManager != 5) {
            updateNetworkType(networkTypeFromConnectivityManager);
        } else {
            C16077b.disambiguate4gAnd5gNsa(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @igg({"UnprotectedReceiver"})
    /* JADX INFO: renamed from: init, reason: merged with bridge method [inline-methods] */
    public void lambda$new$0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C16080e(), intentFilter);
    }

    private void removeClearedReferences() {
        for (C16079d c16079d : this.f104712b) {
            if (c16079d.canBeRemoved()) {
                this.f104712b.remove(c16079d);
            }
        }
    }

    @fdi
    public static synchronized void resetForTests() {
        f104710f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNetworkType(int i) {
        removeClearedReferences();
        synchronized (this.f104713c) {
            try {
                if (this.f104715e && this.f104714d == i) {
                    return;
                }
                this.f104715e = true;
                this.f104714d = i;
                Iterator<C16079d> it = this.f104712b.iterator();
                while (it.hasNext()) {
                    it.next().callOnNetworkTypeChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getNetworkType() {
        int i;
        synchronized (this.f104713c) {
            i = this.f104714d;
        }
        return i;
    }

    @Deprecated
    @p28(imports = {"android.os.Handler", "android.os.Looper"}, replacement = "this.register(listener, new Handler(Looper.getMainLooper())::post)")
    public void register(InterfaceC16078c interfaceC16078c) {
        register(interfaceC16078c, new gp2(new Handler(Looper.getMainLooper())));
    }

    public void register(InterfaceC16078c interfaceC16078c, Executor executor) {
        boolean z;
        removeClearedReferences();
        C16079d c16079d = new C16079d(interfaceC16078c, executor);
        synchronized (this.f104713c) {
            this.f104712b.add(c16079d);
            z = this.f104715e;
        }
        if (z) {
            c16079d.callOnNetworkTypeChanged();
        }
    }
}
