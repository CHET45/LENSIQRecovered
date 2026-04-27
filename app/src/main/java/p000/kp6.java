package p000;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class kp6 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final kp6 f54886a = new kp6();

    /* JADX INFO: renamed from: b */
    public static final int f54887b = 0;

    private kp6() {
    }

    public final int getFontWeightAdjustment(@yfb Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return lp6.f58391a.fontWeightAdjustment(context);
        }
        return 0;
    }
}
