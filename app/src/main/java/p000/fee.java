package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes6.dex */
public class fee extends vkb<C5754b> {

    /* JADX INFO: renamed from: a */
    @efb
    public final vkb<C5754b> f36306a;

    /* JADX INFO: renamed from: fee$a */
    public class C5753a implements csb<C5754b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f36307a;

        /* JADX INFO: renamed from: fee$a$a */
        public class a extends BroadcastReceiver {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ lob f36309a;

            public a(lob lobVar) {
                this.f36309a = lobVar;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                C5754b c5754bM10856a = fee.m10856a(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1));
                kfe.m14726i("Adapter state changed: %s", c5754bM10856a);
                this.f36309a.onNext(c5754bM10856a);
            }
        }

        /* JADX INFO: renamed from: fee$a$b */
        public class b implements bq1 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ BroadcastReceiver f36311a;

            public b(BroadcastReceiver broadcastReceiver) {
                this.f36311a = broadcastReceiver;
            }

            @Override // p000.bq1
            public void cancel() {
                C5753a.this.f36307a.unregisterReceiver(this.f36311a);
            }
        }

        public C5753a(Context context) {
            this.f36307a = context;
        }

        @Override // p000.csb
        public void subscribe(lob<C5754b> lobVar) {
            a aVar = new a(lobVar);
            this.f36307a.registerReceiver(aVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            lobVar.setCancellable(new b(aVar));
        }
    }

    /* JADX INFO: renamed from: fee$b */
    public static class C5754b {

        /* JADX INFO: renamed from: c */
        public static final C5754b f36313c = new C5754b(true, "STATE_ON");

        /* JADX INFO: renamed from: d */
        public static final C5754b f36314d = new C5754b(false, "STATE_OFF");

        /* JADX INFO: renamed from: e */
        public static final C5754b f36315e = new C5754b(false, "STATE_TURNING_ON");

        /* JADX INFO: renamed from: f */
        public static final C5754b f36316f = new C5754b(false, "STATE_TURNING_OFF");

        /* JADX INFO: renamed from: a */
        public final boolean f36317a;

        /* JADX INFO: renamed from: b */
        public final String f36318b;

        private C5754b(boolean z, String str) {
            this.f36317a = z;
            this.f36318b = str;
        }

        public boolean isUsable() {
            return this.f36317a;
        }

        @efb
        public String toString() {
            return this.f36318b;
        }
    }

    @b28
    public fee(@efb Context context) {
        this.f36306a = vkb.create(new C5753a(context)).subscribeOn(mpe.trampoline()).unsubscribeOn(mpe.trampoline()).share();
    }

    /* JADX INFO: renamed from: a */
    public static C5754b m10856a(int i) {
        switch (i) {
            case 11:
                return C5754b.f36315e;
            case 12:
                return C5754b.f36313c;
            case 13:
                return C5754b.f36316f;
            default:
                return C5754b.f36314d;
        }
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super C5754b> pxbVar) {
        this.f36306a.subscribe(pxbVar);
    }
}
