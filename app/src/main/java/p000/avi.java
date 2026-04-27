package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes5.dex */
public final class avi implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bvi f11945a;

    public /* synthetic */ avi(bvi bviVar, zui zuiVar) {
        this.f11945a = bviVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f11945a.f14968b.m3767d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f11945a.m3456c().post(new xui(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11945a.f14968b.m3767d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f11945a.m3456c().post(new yui(this));
    }
}
