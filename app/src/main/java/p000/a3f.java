package p000;

import p000.y3f;

/* JADX INFO: loaded from: classes7.dex */
public final class a3f<ReqT, RespT> extends y3f.AbstractC15414c<ReqT, RespT> {

    /* JADX INFO: renamed from: a */
    public final rua<ReqT, RespT> f314a;

    /* JADX INFO: renamed from: b */
    public final sc0 f315b;

    /* JADX INFO: renamed from: c */
    public final String f316c;

    public a3f(rua<ReqT, RespT> ruaVar, sc0 sc0Var, @eib String str) {
        this.f314a = ruaVar;
        this.f315b = sc0Var;
        this.f316c = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a3f)) {
            return false;
        }
        a3f a3fVar = (a3f) obj;
        return okb.equal(this.f314a, a3fVar.f314a) && okb.equal(this.f315b, a3fVar.f315b) && okb.equal(this.f316c, a3fVar.f316c);
    }

    @Override // p000.y3f.AbstractC15414c
    public sc0 getAttributes() {
        return this.f315b;
    }

    @Override // p000.y3f.AbstractC15414c
    @eib
    public String getAuthority() {
        return this.f316c;
    }

    @Override // p000.y3f.AbstractC15414c
    public rua<ReqT, RespT> getMethodDescriptor() {
        return this.f314a;
    }

    public int hashCode() {
        return okb.hashCode(this.f314a, this.f315b, this.f316c);
    }
}
