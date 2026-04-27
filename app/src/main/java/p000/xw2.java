package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xw2 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: computeFillHeight-iLBOSCw, reason: not valid java name */
    public static final float m33322computeFillHeightiLBOSCw(long j, long j2) {
        return wpf.m33066getHeightimpl(j2) / wpf.m33066getHeightimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final float m33323computeFillMaxDimensioniLBOSCw(long j, long j2) {
        return Math.max(m33325computeFillWidthiLBOSCw(j, j2), m33322computeFillHeightiLBOSCw(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final float m33324computeFillMinDimensioniLBOSCw(long j, long j2) {
        return Math.min(m33325computeFillWidthiLBOSCw(j, j2), m33322computeFillHeightiLBOSCw(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: computeFillWidth-iLBOSCw, reason: not valid java name */
    public static final float m33325computeFillWidthiLBOSCw(long j, long j2) {
        return wpf.m33069getWidthimpl(j2) / wpf.m33069getWidthimpl(j);
    }
}
