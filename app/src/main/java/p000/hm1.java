package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface hm1 {

    /* JADX INFO: renamed from: a */
    public static final hm1 f44102a = new hm1() { // from class: fm1
        @Override // p000.hm1
        public final String buildCacheKey(xh3 xh3Var) {
            return hm1.lambda$static$0(xh3Var);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$static$0(xh3 xh3Var) {
        String str = xh3Var.f97808i;
        return str != null ? str : xh3Var.f97800a.toString();
    }

    String buildCacheKey(xh3 xh3Var);
}
