package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ejc {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final vic f33206a = C8522ku.Path();

    @yfb
    public static final djc PathHitTester(@yfb vic vicVar, @y46(from = 0.0d) float f) {
        djc djcVar = new djc();
        djcVar.updatePath(vicVar, f);
        return djcVar;
    }

    public static /* synthetic */ djc PathHitTester$default(vic vicVar, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        return PathHitTester(vicVar, f);
    }
}
