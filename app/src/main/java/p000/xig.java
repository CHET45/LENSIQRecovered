package p000;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes6.dex */
public final class xig {

    /* JADX INFO: renamed from: d */
    public static final String f98117d = "status_bar_height";

    /* JADX INFO: renamed from: a */
    public final int f98118a;

    /* JADX INFO: renamed from: b */
    public final int f98119b;

    /* JADX INFO: renamed from: c */
    public final int f98120c;

    public xig(Activity activity) {
        this.f98118a = getInternalDimensionSize(activity.getResources(), f98117d);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f98119b = displayMetrics.widthPixels;
        this.f98120c = displayMetrics.heightPixels;
    }

    private int getInternalDimensionSize(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public int getScreenHeight() {
        return this.f98120c;
    }

    public int[] getScreenSize() {
        return new int[]{this.f98119b, this.f98120c};
    }

    public int getScreenWidth() {
        return this.f98119b;
    }

    public int getStatusBarHeight() {
        return this.f98118a;
    }
}
