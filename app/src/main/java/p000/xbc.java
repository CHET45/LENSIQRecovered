package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xbc {

    /* JADX INFO: renamed from: a */
    public static final int f97438a = 30;

    /* JADX INFO: renamed from: b */
    public static final int f97439b = 100;

    public static final long currentAbsoluteScrollOffset(@yfb dcc dccVar) {
        return (((long) dccVar.getCurrentPage()) * ((long) dccVar.getPageSizeWithSpacing$foundation_release())) + p3a.roundToLong(dccVar.getCurrentPageOffsetFraction() * dccVar.getPageSizeWithSpacing$foundation_release());
    }

    private static final void debugLog(ny6<String> ny6Var) {
    }
}
