package p000;

import android.content.Context;
import android.util.Log;
import p000.ts2;

/* JADX INFO: loaded from: classes3.dex */
public class it3 implements vs2 {

    /* JADX INFO: renamed from: a */
    public static final String f48184a = "ConnectivityMonitor";

    /* JADX INFO: renamed from: b */
    public static final String f48185b = "android.permission.ACCESS_NETWORK_STATE";

    @Override // p000.vs2
    @efb
    public ts2 build(@efb Context context, @efb ts2.InterfaceC13182a interfaceC13182a) {
        boolean z = lx2.checkSelfPermission(context, f48185b) == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z ? new ht3(context, interfaceC13182a) : new xhb();
    }
}
