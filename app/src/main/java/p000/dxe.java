package p000;

/* JADX INFO: loaded from: classes.dex */
public interface dxe {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C4996a f31255a = C4996a.f31257a;

    /* JADX INFO: renamed from: b */
    public static final long f31256b = 0;

    /* JADX INFO: renamed from: dxe$a */
    public static final class C4996a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C4996a f31257a = new C4996a();

        /* JADX INFO: renamed from: b */
        public static final long f31258b = 0;

        private C4996a() {
        }
    }

    @yfb
    ol9<gwe> getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long j);

    void notifySelectableChange(long j);

    /* JADX INFO: renamed from: notifySelectionUpdate-njBpvok, reason: not valid java name */
    boolean mo28712notifySelectionUpdatenjBpvok(@yfb mv8 mv8Var, long j, long j2, boolean z, @yfb mwe mweVar, boolean z2);

    void notifySelectionUpdateEnd();

    void notifySelectionUpdateSelectAll(long j, boolean z);

    /* JADX INFO: renamed from: notifySelectionUpdateStart-ubNVwUQ, reason: not valid java name */
    void mo28713notifySelectionUpdateStartubNVwUQ(@yfb mv8 mv8Var, long j, @yfb mwe mweVar, boolean z);

    @yfb
    cwe subscribe(@yfb cwe cweVar);

    void unsubscribe(@yfb cwe cweVar);
}
