package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes6.dex */
@omg(19)
public class xg9 {

    /* JADX INFO: renamed from: a */
    public final Context f97717a;

    /* JADX INFO: renamed from: b */
    public final ah9 f97718b;

    /* JADX INFO: renamed from: xg9$a */
    public class C15055a implements csb<Boolean> {

        /* JADX INFO: renamed from: xg9$a$a */
        public class a extends BroadcastReceiver {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ lob f97720a;

            public a(lob lobVar) {
                this.f97720a = lobVar;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                this.f97720a.onNext(Boolean.valueOf(xg9.this.f97718b.isLocationProviderOk()));
            }
        }

        /* JADX INFO: renamed from: xg9$a$b */
        public class b implements bq1 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ BroadcastReceiver f97722a;

            public b(BroadcastReceiver broadcastReceiver) {
                this.f97722a = broadcastReceiver;
            }

            @Override // p000.bq1
            public void cancel() {
                xg9.this.f97717a.unregisterReceiver(this.f97722a);
            }
        }

        public C15055a() {
        }

        @Override // p000.csb
        public void subscribe(lob<Boolean> lobVar) {
            boolean zIsLocationProviderOk = xg9.this.f97718b.isLocationProviderOk();
            a aVar = new a(lobVar);
            lobVar.onNext(Boolean.valueOf(zIsLocationProviderOk));
            xg9.this.f97717a.registerReceiver(aVar, new IntentFilter("android.location.MODE_CHANGED"));
            lobVar.setCancellable(new b(aVar));
        }
    }

    @b28
    public xg9(Context context, ah9 ah9Var) {
        this.f97717a = context;
        this.f97718b = ah9Var;
    }

    public vkb<Boolean> get() {
        return vkb.create(new C15055a()).distinctUntilChanged().subscribeOn(mpe.trampoline()).unsubscribeOn(mpe.trampoline());
    }
}
