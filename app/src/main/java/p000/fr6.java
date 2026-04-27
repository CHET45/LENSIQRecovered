package p000;

import p000.w22;

/* JADX INFO: loaded from: classes7.dex */
public abstract class fr6<ReqT, RespT> extends eic<ReqT, RespT> {

    /* JADX INFO: renamed from: fr6$a */
    public static abstract class AbstractC5940a<ReqT, RespT> extends fr6<ReqT, RespT> {

        /* JADX INFO: renamed from: a */
        public final w22<ReqT, RespT> f37553a;

        public AbstractC5940a(w22<ReqT, RespT> w22Var) {
            this.f37553a = w22Var;
        }

        @Override // p000.fr6, p000.eic
        /* JADX INFO: renamed from: a */
        public w22<ReqT, RespT> mo9654a() {
            return this.f37553a;
        }

        @Override // p000.fr6, p000.eic, p000.w22
        public /* bridge */ /* synthetic */ void cancel(@eib String str, @eib Throwable th) {
            super.cancel(str, th);
        }

        @Override // p000.fr6, p000.eic, p000.w22
        public /* bridge */ /* synthetic */ sc0 getAttributes() {
            return super.getAttributes();
        }

        @Override // p000.fr6, p000.eic, p000.w22
        public /* bridge */ /* synthetic */ void halfClose() {
            super.halfClose();
        }

        @Override // p000.fr6, p000.eic, p000.w22
        public /* bridge */ /* synthetic */ boolean isReady() {
            return super.isReady();
        }

        @Override // p000.fr6, p000.eic, p000.w22
        public /* bridge */ /* synthetic */ void request(int i) {
            super.request(i);
        }

        @Override // p000.fr6, p000.eic, p000.w22
        public /* bridge */ /* synthetic */ void setMessageCompression(boolean z) {
            super.setMessageCompression(z);
        }

        @Override // p000.fr6, p000.eic
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // p000.eic
    /* JADX INFO: renamed from: a */
    public abstract w22<ReqT, RespT> mo9654a();

    @Override // p000.eic, p000.w22
    public /* bridge */ /* synthetic */ void cancel(@eib String str, @eib Throwable th) {
        super.cancel(str, th);
    }

    @Override // p000.eic, p000.w22
    public /* bridge */ /* synthetic */ sc0 getAttributes() {
        return super.getAttributes();
    }

    @Override // p000.eic, p000.w22
    public /* bridge */ /* synthetic */ void halfClose() {
        super.halfClose();
    }

    @Override // p000.eic, p000.w22
    public /* bridge */ /* synthetic */ boolean isReady() {
        return super.isReady();
    }

    @Override // p000.eic, p000.w22
    public /* bridge */ /* synthetic */ void request(int i) {
        super.request(i);
    }

    @Override // p000.w22
    public void sendMessage(ReqT reqt) {
        mo9654a().sendMessage(reqt);
    }

    @Override // p000.eic, p000.w22
    public /* bridge */ /* synthetic */ void setMessageCompression(boolean z) {
        super.setMessageCompression(z);
    }

    @Override // p000.w22
    public void start(w22.AbstractC14364a<RespT> abstractC14364a, fta ftaVar) {
        mo9654a().start(abstractC14364a, ftaVar);
    }

    @Override // p000.eic
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
