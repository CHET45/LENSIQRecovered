package p000;

import android.content.Context;
import p000.ts2;

/* JADX INFO: loaded from: classes3.dex */
public final class ht3 implements ts2 {

    /* JADX INFO: renamed from: a */
    public final Context f44808a;

    /* JADX INFO: renamed from: b */
    public final ts2.InterfaceC13182a f44809b;

    public ht3(@efb Context context, @efb ts2.InterfaceC13182a interfaceC13182a) {
        this.f44808a = context.getApplicationContext();
        this.f44809b = interfaceC13182a;
    }

    private void register() {
        spf.m22173a(this.f44808a).m22175b(this.f44809b);
    }

    private void unregister() {
        spf.m22173a(this.f44808a).m22176d(this.f44809b);
    }

    @Override // p000.e59
    public void onDestroy() {
    }

    @Override // p000.e59
    public void onStart() {
        register();
    }

    @Override // p000.e59
    public void onStop() {
        unregister();
    }
}
