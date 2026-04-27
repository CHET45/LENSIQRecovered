package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class gcb {

    /* JADX INFO: renamed from: e */
    @hib
    public static gcb f39356e;

    /* JADX INFO: renamed from: a */
    public final Handler f39357a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<WeakReference<InterfaceC6215c>> f39358b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    public final Object f39359c = new Object();

    /* JADX INFO: renamed from: d */
    @xc7("networkTypeLock")
    public int f39360d = 0;

    /* JADX INFO: renamed from: gcb$b */
    @c5e(31)
    public static final class C6214b {

        /* JADX INFO: renamed from: gcb$b$a */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a */
            public final gcb f39361a;

            public a(gcb gcbVar) {
                this.f39361a = gcbVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f39361a.updateNetworkType(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        private C6214b() {
        }

        public static void disambiguate4gAnd5gNsa(Context context, gcb gcbVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) u80.checkNotNull((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(gcbVar);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                gcbVar.updateNetworkType(5);
            }
        }
    }

    /* JADX INFO: renamed from: gcb$c */
    public interface InterfaceC6215c {
        void onNetworkTypeChanged(int i);
    }

    /* JADX INFO: renamed from: gcb$d */
    public final class C6216d extends BroadcastReceiver {
        private C6216d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int networkTypeFromConnectivityManager = gcb.getNetworkTypeFromConnectivityManager(context);
            if (x0i.f95978a < 31 || networkTypeFromConnectivityManager != 5) {
                gcb.this.updateNetworkType(networkTypeFromConnectivityManager);
            } else {
                C6214b.disambiguate4gAnd5gNsa(context, gcb.this);
            }
        }
    }

    private gcb(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C6216d(), intentFilter);
    }

    public static synchronized gcb getInstance(Context context) {
        try {
            if (f39356e == null) {
                f39356e = new gcb(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f39356e;
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
                return x0i.f95978a >= 29 ? 9 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getNetworkTypeFromConnectivityManager(Context context) {
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
    public /* synthetic */ void lambda$register$0(InterfaceC6215c interfaceC6215c) {
        interfaceC6215c.onNetworkTypeChanged(getNetworkType());
    }

    private void removeClearedReferences() {
        for (WeakReference<InterfaceC6215c> weakReference : this.f39358b) {
            if (weakReference.get() == null) {
                this.f39358b.remove(weakReference);
            }
        }
    }

    @fdi
    public static synchronized void resetForTests() {
        f39356e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNetworkType(int i) {
        synchronized (this.f39359c) {
            try {
                if (this.f39360d == i) {
                    return;
                }
                this.f39360d = i;
                for (WeakReference<InterfaceC6215c> weakReference : this.f39358b) {
                    InterfaceC6215c interfaceC6215c = weakReference.get();
                    if (interfaceC6215c != null) {
                        interfaceC6215c.onNetworkTypeChanged(i);
                    } else {
                        this.f39358b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getNetworkType() {
        int i;
        synchronized (this.f39359c) {
            i = this.f39360d;
        }
        return i;
    }

    public void register(final InterfaceC6215c interfaceC6215c) {
        removeClearedReferences();
        this.f39358b.add(new WeakReference<>(interfaceC6215c));
        this.f39357a.post(new Runnable() { // from class: xbb
            @Override // java.lang.Runnable
            public final void run() {
                this.f97436a.lambda$register$0(interfaceC6215c);
            }
        });
    }
}
