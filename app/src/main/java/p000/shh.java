package p000;

/* JADX INFO: loaded from: classes.dex */
public interface shh extends v34 {

    /* JADX INFO: renamed from: c1 */
    @yfb
    public static final C12597a f81868c1 = C12597a.f81869a;

    /* JADX INFO: renamed from: shh$a */
    public static final class C12597a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C12597a f81869a = new C12597a();

        /* JADX INFO: renamed from: shh$a$a */
        public enum a {
            ContinueTraversal,
            SkipSubtreeAndContinueTraversal,
            CancelTraversal
        }

        private C12597a() {
        }
    }

    @yfb
    Object getTraverseKey();
}
