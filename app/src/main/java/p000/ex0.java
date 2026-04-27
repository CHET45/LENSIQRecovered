package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class ex0 extends be1<Boolean> {

    /* JADX INFO: renamed from: i */
    public static final String f34338i = cj9.tagWithPrefix("BatteryNotLowTracker");

    /* JADX INFO: renamed from: j */
    public static final float f34339j = 0.15f;

    public ex0(@efb Context context, @efb ong taskExecutor) {
        super(context, taskExecutor);
    }

    @Override // p000.be1
    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p000.be1
    public void onBroadcastReceive(Context context, @efb Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        cj9.get().debug(f34338i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            setState(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            setState(Boolean.FALSE);
        }
    }

    @Override // p000.hu2
    public Boolean getInitialState() {
        Intent intentRegisterReceiver = this.f44876b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra(FirebaseAnalytics.C3552d.f23228t, -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        cj9.get().error(f34338i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
