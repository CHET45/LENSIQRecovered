package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class hxg {
    public static String getAppTheme() {
        return vfe.getInstance().getString("THEMES", "isFollowSys");
    }

    public static String getH5AiSummaryColor(Context context) {
        return isCurrentlyDark(context) ? C9389ml.getInstance().getAiSummaryThemeDarkColor() : C9389ml.getInstance().getAiSummaryThemeLightColor();
    }

    public static boolean isCurrentlyDark(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
