package p000;

import p000.w22;

/* JADX INFO: loaded from: classes7.dex */
public abstract class gr6<RespT> extends fic<RespT> {

    /* JADX INFO: renamed from: gr6$a */
    public static abstract class AbstractC6471a<RespT> extends gr6<RespT> {

        /* JADX INFO: renamed from: a */
        public final w22.AbstractC14364a<RespT> f40818a;

        public AbstractC6471a(w22.AbstractC14364a<RespT> abstractC14364a) {
            this.f40818a = abstractC14364a;
        }

        @Override // p000.gr6, p000.fic
        /* JADX INFO: renamed from: a */
        public w22.AbstractC14364a<RespT> mo9655a() {
            return this.f40818a;
        }

        @Override // p000.gr6, p000.fic, p000.w22.AbstractC14364a
        public /* bridge */ /* synthetic */ void onClose(n4g n4gVar, fta ftaVar) {
            super.onClose(n4gVar, ftaVar);
        }

        @Override // p000.gr6, p000.fic, p000.w22.AbstractC14364a
        public /* bridge */ /* synthetic */ void onHeaders(fta ftaVar) {
            super.onHeaders(ftaVar);
        }

        @Override // p000.gr6, p000.fic, p000.w22.AbstractC14364a
        public /* bridge */ /* synthetic */ void onReady() {
            super.onReady();
        }

        @Override // p000.gr6, p000.fic
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // p000.fic
    /* JADX INFO: renamed from: a */
    public abstract w22.AbstractC14364a<RespT> mo9655a();

    @Override // p000.fic, p000.w22.AbstractC14364a
    public /* bridge */ /* synthetic */ void onClose(n4g n4gVar, fta ftaVar) {
        super.onClose(n4gVar, ftaVar);
    }

    @Override // p000.fic, p000.w22.AbstractC14364a
    public /* bridge */ /* synthetic */ void onHeaders(fta ftaVar) {
        super.onHeaders(ftaVar);
    }

    @Override // p000.w22.AbstractC14364a
    public void onMessage(RespT respt) {
        mo9655a().onMessage(respt);
    }

    @Override // p000.fic, p000.w22.AbstractC14364a
    public /* bridge */ /* synthetic */ void onReady() {
        super.onReady();
    }

    @Override // p000.fic
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
