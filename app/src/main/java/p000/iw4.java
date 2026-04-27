package p000;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class iw4 {

    /* JADX INFO: renamed from: a */
    public static final int f48649a = 128;

    private iw4() {
    }

    public static void applyEdgeToEdge(@efb Window window, boolean z) {
        applyEdgeToEdge(window, z, null, null);
    }

    @omg(21)
    private static int getNavigationBarColor(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return ua2.setAlphaComponent(ow9.getColor(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return ow9.getColor(context, R.attr.navigationBarColor, -16777216);
    }

    @omg(21)
    private static int getStatusBarColor(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return ow9.getColor(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean isUsingLightSystemBar(int i, boolean z) {
        return ow9.isColorLight(i) || (i == 0 && z);
    }

    public static void setLightNavigationBar(@efb Window window, boolean z) {
        oli.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(z);
    }

    public static void setLightStatusBar(@efb Window window, boolean z) {
        oli.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(z);
    }

    public static void applyEdgeToEdge(@efb Window window, boolean z, @g92 @hib Integer num, @g92 @hib Integer num2) {
        boolean z2 = num == null || num.intValue() == 0;
        boolean z3 = num2 == null || num2.intValue() == 0;
        if (z2 || z3) {
            int color = ow9.getColor(window.getContext(), R.attr.colorBackground, -16777216);
            if (z2) {
                num = Integer.valueOf(color);
            }
            if (z3) {
                num2 = Integer.valueOf(color);
            }
        }
        oli.setDecorFitsSystemWindows(window, !z);
        int statusBarColor = getStatusBarColor(window.getContext(), z);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, ow9.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, ow9.isColorLight(num2.intValue())));
    }
}
