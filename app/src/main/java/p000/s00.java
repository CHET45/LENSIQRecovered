package p000;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
@c5e(29)
@e0g(parameters = 1)
public final class s00 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final s00 f80239a = new s00();

    /* JADX INFO: renamed from: b */
    public static final int f80240b = 0;

    private s00() {
    }

    @ih4
    public final int getRecommendedTimeoutMillis(@yfb AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }
}
