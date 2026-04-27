package p000;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class axg {

    /* JADX INFO: renamed from: a */
    public static int f12167a;

    /* JADX INFO: renamed from: b */
    public static boolean f12168b;

    /* JADX INFO: renamed from: c */
    public static exg f12169c;

    private static void applyTheme(Activity activity, int i) {
        activity.setTheme(i);
    }

    public static void changeTheme(Activity activity, int i) {
        if (getCurrentTheme(activity) == i) {
            return;
        }
        saveTheme(activity, i);
        applyTheme(activity, i);
        recreateActivityViews(activity);
    }

    public static int getCurrentTheme(Activity activity) {
        return getSavedTheme(activity);
    }

    public static int getSavedTheme(Context context) {
        exg exgVar = f12169c;
        return exgVar != null ? exgVar.getSavedTheme(context, f12167a) : f12167a;
    }

    public static void init(exg exgVar, Context context, int i) {
        if (!f12168b) {
            f12168b = true;
        }
        f12169c = exgVar;
        f12167a = i;
        applyTheme((Activity) context, getSavedTheme(context));
    }

    public static void initTheme(int i) {
        f12167a = i;
    }

    private static void recreateActivityViews(Activity activity) {
        try {
            bxg bxgVar = new bxg();
            bxgVar.f15188a = 1;
            zgb.defaultCenter().publish(bxgVar);
        } catch (Exception unused) {
            activity.recreate();
        }
    }

    private static void saveTheme(Context context, int i) {
        exg exgVar = f12169c;
        if (exgVar != null) {
            exgVar.saveTheme(context, i);
        }
    }
}
