package p000;

import p000.w22;

/* JADX INFO: loaded from: classes7.dex */
public abstract class fic<RespT> extends w22.AbstractC14364a<RespT> {
    /* JADX INFO: renamed from: a */
    public abstract w22.AbstractC14364a<?> mo9655a();

    @Override // p000.w22.AbstractC14364a
    public void onClose(n4g n4gVar, fta ftaVar) {
        mo9655a().onClose(n4gVar, ftaVar);
    }

    @Override // p000.w22.AbstractC14364a
    public void onHeaders(fta ftaVar) {
        mo9655a().onHeaders(ftaVar);
    }

    @Override // p000.w22.AbstractC14364a
    public void onReady() {
        mo9655a().onReady();
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", mo9655a()).toString();
    }
}
