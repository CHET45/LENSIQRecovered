package p000;

import android.content.Context;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class s7h {

    /* JADX INFO: renamed from: e */
    public static s7h f80920e;

    /* JADX INFO: renamed from: a */
    public cx0 f80921a;

    /* JADX INFO: renamed from: b */
    public ex0 f80922b;

    /* JADX INFO: renamed from: c */
    public vbb f80923c;

    /* JADX INFO: renamed from: d */
    public k5g f80924d;

    private s7h(@efb Context context, @efb ong taskExecutor) {
        Context applicationContext = context.getApplicationContext();
        this.f80921a = new cx0(applicationContext, taskExecutor);
        this.f80922b = new ex0(applicationContext, taskExecutor);
        this.f80923c = new vbb(applicationContext, taskExecutor);
        this.f80924d = new k5g(applicationContext, taskExecutor);
    }

    @efb
    public static synchronized s7h getInstance(Context context, ong taskExecutor) {
        try {
            if (f80920e == null) {
                f80920e = new s7h(context, taskExecutor);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f80920e;
    }

    @fdi
    public static synchronized void setInstance(@efb s7h trackers) {
        f80920e = trackers;
    }

    @efb
    public cx0 getBatteryChargingTracker() {
        return this.f80921a;
    }

    @efb
    public ex0 getBatteryNotLowTracker() {
        return this.f80922b;
    }

    @efb
    public vbb getNetworkStateTracker() {
        return this.f80923c;
    }

    @efb
    public k5g getStorageNotLowTracker() {
        return this.f80924d;
    }
}
