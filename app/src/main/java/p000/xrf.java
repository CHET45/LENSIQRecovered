package p000;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes7.dex */
public class xrf {

    /* JADX INFO: renamed from: a */
    public static float f99071a = Resources.getSystem().getDisplayMetrics().density;

    public static int dp2px(float f) {
        return (int) ((f * f99071a) + 0.5f);
    }

    public static float px2dp(int i) {
        return i / f99071a;
    }
}
