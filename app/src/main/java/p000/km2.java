package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class km2 extends eu1 {

    /* JADX INFO: renamed from: a */
    public final eu1 f54675a;

    /* JADX INFO: renamed from: b */
    public final pn1 f54676b;

    private km2(eu1 eu1Var, pn1 pn1Var) {
        this.f54675a = (eu1) v7d.checkNotNull(eu1Var, "channelCreds");
        this.f54676b = (pn1) v7d.checkNotNull(pn1Var, "callCreds");
    }

    public static eu1 create(eu1 eu1Var, pn1 pn1Var) {
        return new km2(eu1Var, pn1Var);
    }

    public pn1 getCallCredentials() {
        return this.f54676b;
    }

    public eu1 getChannelCredentials() {
        return this.f54675a;
    }

    @Override // p000.eu1
    public eu1 withoutBearerTokens() {
        return this.f54675a.withoutBearerTokens();
    }
}
