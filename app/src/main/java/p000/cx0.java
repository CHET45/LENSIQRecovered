package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class cx0 extends be1<Boolean> {

    /* JADX INFO: renamed from: i */
    public static final String f27977i = cj9.tagWithPrefix("BatteryChrgTracker");

    public cx0(@efb Context context, @efb ong taskExecutor) {
        super(context, taskExecutor);
    }

    private boolean isBatteryChangedIntentCharging(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // p000.be1
    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // p000.be1
    public void onBroadcastReceive(Context context, @efb Intent intent) {
        String action = intent.getAction();
        if (action == null) {
        }
        cj9.get().debug(f27977i, String.format("Received %s", action), new Throwable[0]);
        switch (action) {
            case "android.intent.action.ACTION_POWER_DISCONNECTED":
                setState(Boolean.FALSE);
                break;
            case "android.os.action.DISCHARGING":
                setState(Boolean.FALSE);
                break;
            case "android.os.action.CHARGING":
                setState(Boolean.TRUE);
                break;
            case "android.intent.action.ACTION_POWER_CONNECTED":
                setState(Boolean.TRUE);
                break;
        }
    }

    @Override // p000.hu2
    public Boolean getInitialState() {
        Intent intentRegisterReceiver = this.f44876b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(isBatteryChangedIntentCharging(intentRegisterReceiver));
        }
        cj9.get().error(f27977i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
