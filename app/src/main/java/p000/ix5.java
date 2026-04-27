package p000;

import p000.fta;

/* JADX INFO: loaded from: classes5.dex */
public class ix5 implements nc7 {

    /* JADX INFO: renamed from: d */
    public static final String f48762d = "fire-fst";

    /* JADX INFO: renamed from: e */
    public static final fta.AbstractC5971i<String> f48763e;

    /* JADX INFO: renamed from: f */
    public static final fta.AbstractC5971i<String> f48764f;

    /* JADX INFO: renamed from: g */
    public static final fta.AbstractC5971i<String> f48765g;

    /* JADX INFO: renamed from: a */
    public final eid<xi7> f48766a;

    /* JADX INFO: renamed from: b */
    public final eid<tyh> f48767b;

    /* JADX INFO: renamed from: c */
    public final az5 f48768c;

    static {
        fta.InterfaceC5967e<String> interfaceC5967e = fta.f37690f;
        f48763e = fta.AbstractC5971i.m11174of("x-firebase-client-log-type", interfaceC5967e);
        f48764f = fta.AbstractC5971i.m11174of(ny5.f66030w, interfaceC5967e);
        f48765g = fta.AbstractC5971i.m11174of("x-firebase-gmpid", interfaceC5967e);
    }

    public ix5(@efb eid<tyh> eidVar, @efb eid<xi7> eidVar2, @hib az5 az5Var) {
        this.f48767b = eidVar;
        this.f48766a = eidVar2;
        this.f48768c = az5Var;
    }

    private void maybeAddGmpAppId(@efb fta ftaVar) {
        az5 az5Var = this.f48768c;
        if (az5Var == null) {
            return;
        }
        String applicationId = az5Var.getApplicationId();
        if (applicationId.length() != 0) {
            ftaVar.put(f48765g, applicationId);
        }
    }

    @Override // p000.nc7
    public void updateMetadata(@efb fta ftaVar) {
        if (this.f48766a.get() == null || this.f48767b.get() == null) {
            return;
        }
        int code = this.f48766a.get().getHeartBeatCode(f48762d).getCode();
        if (code != 0) {
            ftaVar.put(f48763e, Integer.toString(code));
        }
        ftaVar.put(f48764f, this.f48767b.get().getUserAgent());
        maybeAddGmpAppId(ftaVar);
    }
}
