package p000;

import android.content.Context;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
public class wg9 extends vkb<Boolean> {

    /* JADX INFO: renamed from: a */
    @efb
    public final vkb<Boolean> f94203a;

    @b28
    public wg9(@efb @w8b(a32.C0032e.f244a) vkb<Boolean> vkbVar) {
        this.f94203a = vkbVar;
    }

    public static wg9 createInstance(@efb Context context) {
        return qe3.builder().applicationContext(context.getApplicationContext()).build().locationServicesOkObservable();
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super Boolean> pxbVar) {
        this.f94203a.subscribe(pxbVar);
    }
}
