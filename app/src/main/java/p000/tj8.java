package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class tj8 {

    /* JADX INFO: renamed from: e */
    public static final int f85053e = -1;

    /* JADX INFO: renamed from: f */
    public static final int f85054f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f85055g = 1;

    /* JADX INFO: renamed from: k */
    public static final int f85059k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f85060l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f85061m = 4;

    /* JADX INFO: renamed from: a */
    @yfb
    public static final qhg f85049a = new qhg("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public static final qhg f85050b = new qhg("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c */
    @yfb
    public static final qhg f85051c = new qhg("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d */
    @yfb
    public static final qhg f85052d = new qhg("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: h */
    @yfb
    public static final qhg f85056h = new qhg("SEALED");

    /* JADX INFO: renamed from: i */
    @yfb
    public static final rz4 f85057i = new rz4(false);

    /* JADX INFO: renamed from: j */
    @yfb
    public static final rz4 f85058j = new rz4(true);

    @gib
    public static final Object boxIncomplete(@gib Object obj) {
        return obj instanceof iz7 ? new lz7((iz7) obj) : obj;
    }

    @gib
    public static final Object unboxState(@gib Object obj) {
        iz7 iz7Var;
        lz7 lz7Var = obj instanceof lz7 ? (lz7) obj : null;
        return (lz7Var == null || (iz7Var = lz7Var.f59329a) == null) ? obj : iz7Var;
    }
}
