package p000;

import p000.z24;

/* JADX INFO: loaded from: classes5.dex */
public class jyd {

    /* JADX INFO: renamed from: a */
    public final z24<bz5> f52234a;

    public jyd(z24<bz5> z24Var) {
        this.f52234a = z24Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setupListener$0(y33 y33Var, eid eidVar) {
        ((bz5) eidVar.get()).registerRolloutsStateSubscriber(cx5.f27983a, y33Var);
        ej9.getLogger().m10061d("Registering RemoteConfig Rollouts subscriber");
    }

    public void setupListener(gzh gzhVar) {
        if (gzhVar == null) {
            ej9.getLogger().m10069w("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final y33 y33Var = new y33(gzhVar);
            this.f52234a.whenAvailable(new z24.InterfaceC15937a() { // from class: iyd
                @Override // p000.z24.InterfaceC15937a
                public final void handle(eid eidVar) {
                    jyd.lambda$setupListener$0(y33Var, eidVar);
                }
            });
        }
    }
}
