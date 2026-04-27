package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public abstract class isd {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C7585a f48142a = new C7585a(null);

    /* JADX INFO: renamed from: b */
    public static final int f48143b = 0;

    /* JADX INFO: renamed from: isd$a */
    public static final class C7585a {
        public /* synthetic */ C7585a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final isd invoke(@yfb nsd nsdVar) {
            return new jsd(nsdVar);
        }

        private C7585a() {
        }
    }

    @yfb
    public abstract nsd getReceiveContentListener();

    public final boolean onCommitContent(@yfb sdh sdhVar) {
        return !md8.areEqual(getReceiveContentListener().onReceive(sdhVar), sdhVar);
    }
}
