package p000;

import p000.c6f;

/* JADX INFO: loaded from: classes5.dex */
public class z23 implements c6f {

    /* JADX INFO: renamed from: a */
    public final tf3 f103733a;

    /* JADX INFO: renamed from: b */
    public final y23 f103734b;

    public z23(tf3 tf3Var, kt5 kt5Var) {
        this.f103733a = tf3Var;
        this.f103734b = new y23(kt5Var);
    }

    @hib
    public String getAppQualitySessionId(@efb String str) {
        return this.f103734b.getAppQualitySessionId(str);
    }

    @Override // p000.c6f
    @efb
    public c6f.EnumC2215a getSessionSubscriberName() {
        return c6f.EnumC2215a.f15860a;
    }

    @Override // p000.c6f
    public boolean isDataCollectionEnabled() {
        return this.f103733a.isAutomaticDataCollectionEnabled();
    }

    @Override // p000.c6f
    public void onSessionChanged(@efb c6f.C2216b c2216b) {
        ej9.getLogger().m10061d("App Quality Sessions session changed: " + c2216b);
        this.f103734b.rotateAppQualitySessionId(c2216b.getSessionId());
    }

    public void setSessionId(@hib String str) {
        this.f103734b.rotateSessionId(str);
    }
}
