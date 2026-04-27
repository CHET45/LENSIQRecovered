package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class k5g extends be1<Boolean> {

    /* JADX INFO: renamed from: i */
    public static final String f52614i = cj9.tagWithPrefix("StorageNotLowTracker");

    public k5g(@efb Context context, @efb ong taskExecutor) {
        super(context, taskExecutor);
    }

    @Override // p000.be1
    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // p000.be1
    public void onBroadcastReceive(Context context, @efb Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        cj9.get().debug(f52614i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            setState(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            setState(Boolean.TRUE);
        }
    }

    @Override // p000.hu2
    public Boolean getInitialState() {
        Intent intentRegisterReceiver = this.f44876b.registerReceiver(null, getIntentFilter());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }
}
