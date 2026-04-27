package com.watchfun.network.help;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000.bbb;

/* JADX INFO: loaded from: classes6.dex */
public class NetChangeReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public InterfaceC4025a f25226a;

    /* JADX INFO: renamed from: com.watchfun.network.help.NetChangeReceiver$a */
    public interface InterfaceC4025a {
        void onChangeListener(int i);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            int netWorkState = bbb.getNetWorkState(context);
            InterfaceC4025a interfaceC4025a = this.f25226a;
            if (interfaceC4025a != null) {
                interfaceC4025a.onChangeListener(netWorkState);
            }
        }
    }

    public void setNetChangeListener(InterfaceC4025a interfaceC4025a) {
        this.f25226a = interfaceC4025a;
    }
}
