package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface gm1 {

    /* JADX INFO: renamed from: a */
    public static final gm1 f40163a = new gm1() { // from class: em1
        @Override // p000.gm1
        public final String buildCacheKey(yh3 yh3Var) {
            return gm1.lambda$static$0(yh3Var);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$static$0(yh3 yh3Var) {
        String str = yh3Var.f101493i;
        return str != null ? str : yh3Var.f101485a.toString();
    }

    String buildCacheKey(yh3 yh3Var);
}
