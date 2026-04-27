package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public abstract class be1<T> extends hu2<T> {

    /* JADX INFO: renamed from: h */
    public static final String f13494h = cj9.tagWithPrefix("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g */
    public final BroadcastReceiver f13495g;

    /* JADX INFO: renamed from: be1$a */
    public class C1855a extends BroadcastReceiver {
        public C1855a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                be1.this.onBroadcastReceive(context, intent);
            }
        }
    }

    public be1(@efb Context context, @efb ong taskExecutor) {
        super(context, taskExecutor);
        this.f13495g = new C1855a();
    }

    public abstract IntentFilter getIntentFilter();

    public abstract void onBroadcastReceive(Context context, @efb Intent intent);

    @Override // p000.hu2
    public void startTracking() {
        cj9.get().debug(f13494h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f44876b.registerReceiver(this.f13495g, getIntentFilter());
    }

    @Override // p000.hu2
    public void stopTracking() {
        cj9.get().debug(f13494h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f44876b.unregisterReceiver(this.f13495g);
    }
}
