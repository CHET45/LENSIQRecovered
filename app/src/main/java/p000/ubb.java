package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.blankj.utilcode.util.NetworkUtils;

/* JADX INFO: loaded from: classes6.dex */
public class ubb {

    /* JADX INFO: renamed from: a */
    public Context f87443a;

    /* JADX INFO: renamed from: b */
    public C13462b f87444b = new C13462b();

    /* JADX INFO: renamed from: c */
    public InterfaceC13463c f87445c;

    /* JADX INFO: renamed from: ubb$b */
    public class C13462b extends BroadcastReceiver {
        private C13462b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                ubb.this.handleNetworkChange();
            }
        }
    }

    /* JADX INFO: renamed from: ubb$c */
    public interface InterfaceC13463c {
        void onNetworkConnected();

        void onNetworkDisconnected();
    }

    public ubb(Context context) {
        this.f87443a = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleNetworkChange() {
        if (isNetworkAvailable(this.f87443a)) {
            InterfaceC13463c interfaceC13463c = this.f87445c;
            if (interfaceC13463c != null) {
                interfaceC13463c.onNetworkConnected();
                return;
            }
            return;
        }
        InterfaceC13463c interfaceC13463c2 = this.f87445c;
        if (interfaceC13463c2 != null) {
            interfaceC13463c2.onNetworkDisconnected();
        }
    }

    public static boolean isNetworkAvailable(Context context) {
        return NetworkUtils.isConnected();
    }

    public void registerNetworkReceiver() {
        this.f87443a.registerReceiver(this.f87444b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void setNetworkStateListener(InterfaceC13463c interfaceC13463c) {
        this.f87445c = interfaceC13463c;
    }

    public void unregisterNetworkReceiver() {
        this.f87443a.unregisterReceiver(this.f87444b);
    }
}
