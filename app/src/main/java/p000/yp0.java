package p000;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.drawerlayout.widget.DrawerLayout;
import com.blankj.utilcode.util.C2479l;
import com.blankj.utilcode.util.C2481n;

/* JADX INFO: loaded from: classes3.dex */
public final class yp0 {

    /* JADX INFO: renamed from: a */
    public static final String f102458a = "TAG_STATUS_BAR";

    /* JADX INFO: renamed from: b */
    public static final String f102459b = "TAG_OFFSET";

    /* JADX INFO: renamed from: c */
    public static final int f102460c = -123;

    private yp0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void addMarginTopEqualStatusBarHeight(@efb View view) {
        if (view == null) {
            throw new NullPointerException("Argument 'view' of type View (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        view.setTag("TAG_OFFSET");
        Object tag = view.getTag(-123);
        if (tag == null || !((Boolean) tag).booleanValue()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + getStatusBarHeight(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.setTag(-123, Boolean.TRUE);
        }
    }

    private static View applyStatusBarColor(@efb Activity activity, int i, boolean z) {
        if (activity != null) {
            return applyStatusBarColor(activity.getWindow(), i, z);
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    private static View createStatusBarView(@efb Context context, int i) {
        if (context == null) {
            throw new NullPointerException("Argument 'context' of type Context (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, getStatusBarHeight()));
        view.setBackgroundColor(i);
        view.setTag("TAG_STATUS_BAR");
        return view;
    }

    public static int getActionBarHeight() {
        TypedValue typedValue = new TypedValue();
        if (C2479l.getApp().getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, C2479l.getApp().getResources().getDisplayMetrics());
        }
        return 0;
    }

    @c5e(21)
    public static int getNavBarColor(@efb Activity activity) {
        if (activity != null) {
            return getNavBarColor(activity.getWindow());
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static int getNavBarHeight() {
        Resources resources = C2479l.getApp().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static String getResNameById(int i) {
        try {
            return C2479l.getApp().getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int getStatusBarHeight() {
        Resources resources = C2479l.getApp().getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier(xig.f98117d, "dimen", "android"));
    }

    private static void hideStatusBarView(@efb Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        hideStatusBarView(activity.getWindow());
    }

    private static void invokePanels(String str) {
        try {
            Class.forName("android.app.StatusBarManager").getMethod(str, null).invoke(C2479l.getApp().getSystemService("statusbar"), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isNavBarLightMode(@efb Activity activity) {
        if (activity != null) {
            return isNavBarLightMode(activity.getWindow());
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean isNavBarVisible(@efb Activity activity) {
        if (activity != null) {
            return isNavBarVisible(activity.getWindow());
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean isStatusBarLightMode(@efb Activity activity) {
        if (activity != null) {
            return isStatusBarLightMode(activity.getWindow());
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean isStatusBarVisible(@efb Activity activity) {
        if (activity != null) {
            return (activity.getWindow().getAttributes().flags & 1024) == 0;
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean isSupportNavBar() {
        WindowManager windowManager = (WindowManager) C2479l.getApp().getSystemService("window");
        if (windowManager == null) {
            return false;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        return (point2.y == point.y && point2.x == point.x) ? false : true;
    }

    @c5e(21)
    public static void setNavBarColor(@efb Activity activity, @g92 int i) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        setNavBarColor(activity.getWindow(), i);
    }

    public static void setNavBarLightMode(@efb Activity activity, boolean z) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        setNavBarLightMode(activity.getWindow(), z);
    }

    public static void setNavBarVisibility(@efb Activity activity, boolean z) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        setNavBarVisibility(activity.getWindow(), z);
    }

    @j5e("android.permission.EXPAND_STATUS_BAR")
    public static void setNotificationBarVisibility(boolean z) {
        invokePanels(z ? "expandNotificationsPanel" : "collapsePanels");
    }

    public static View setStatusBarColor(@efb Activity activity, @g92 int i) {
        if (activity != null) {
            return setStatusBarColor(activity, i, false);
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void setStatusBarColor4Drawer(@efb DrawerLayout drawerLayout, @efb View view, @g92 int i) {
        if (drawerLayout == null) {
            throw new NullPointerException("Argument 'drawer' of type DrawerLayout (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (view == null) {
            throw new NullPointerException("Argument 'fakeStatusBar' of type View (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        setStatusBarColor4Drawer(drawerLayout, view, i, false);
    }

    public static void setStatusBarCustom(@efb View view) {
        if (view == null) {
            throw new NullPointerException("Argument 'fakeStatusBar' of type View (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        Activity activityM4244H = C2481n.m4244H(view.getContext());
        if (activityM4244H == null) {
            return;
        }
        transparentStatusBar(activityM4244H);
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, getStatusBarHeight()));
        } else {
            layoutParams.width = -1;
            layoutParams.height = getStatusBarHeight();
        }
    }

    public static void setStatusBarLightMode(@efb Activity activity, boolean z) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        setStatusBarLightMode(activity.getWindow(), z);
    }

    public static void setStatusBarVisibility(@efb Activity activity, boolean z) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        setStatusBarVisibility(activity.getWindow(), z);
    }

    private static void showStatusBarView(@efb Window window) {
        if (window == null) {
            throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        View viewFindViewWithTag = ((ViewGroup) window.getDecorView()).findViewWithTag("TAG_STATUS_BAR");
        if (viewFindViewWithTag == null) {
            return;
        }
        viewFindViewWithTag.setVisibility(0);
    }

    public static void subtractMarginTopEqualStatusBarHeight(@efb View view) {
        if (view == null) {
            throw new NullPointerException("Argument 'view' of type View (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        Object tag = view.getTag(-123);
        if (tag == null || !((Boolean) tag).booleanValue()) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin - getStatusBarHeight(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view.setTag(-123, Boolean.FALSE);
    }

    public static void transparentStatusBar(@efb Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        transparentStatusBar(activity.getWindow());
    }

    private static View applyStatusBarColor(@efb Window window, int i, boolean z) {
        ViewGroup viewGroup;
        if (window != null) {
            if (z) {
                viewGroup = (ViewGroup) window.getDecorView();
            } else {
                viewGroup = (ViewGroup) window.findViewById(R.id.content);
            }
            View viewFindViewWithTag = viewGroup.findViewWithTag("TAG_STATUS_BAR");
            if (viewFindViewWithTag != null) {
                if (viewFindViewWithTag.getVisibility() == 8) {
                    viewFindViewWithTag.setVisibility(0);
                }
                viewFindViewWithTag.setBackgroundColor(i);
                return viewFindViewWithTag;
            }
            View viewCreateStatusBarView = createStatusBarView(window.getContext(), i);
            viewGroup.addView(viewCreateStatusBarView);
            return viewCreateStatusBarView;
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    @c5e(21)
    public static int getNavBarColor(@efb Window window) {
        if (window != null) {
            return window.getNavigationBarColor();
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    private static void hideStatusBarView(@efb Window window) {
        if (window != null) {
            View viewFindViewWithTag = ((ViewGroup) window.getDecorView()).findViewWithTag("TAG_STATUS_BAR");
            if (viewFindViewWithTag == null) {
                return;
            }
            viewFindViewWithTag.setVisibility(8);
            return;
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean isNavBarLightMode(@efb Window window) {
        if (window != null) {
            return (window.getDecorView().getSystemUiVisibility() & 16) != 0;
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean isNavBarVisible(@efb Window window) {
        boolean z;
        if (window != null) {
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    z = false;
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                int id = childAt.getId();
                if (id != -1 && "navigationBarBackground".equals(getResNameById(id)) && childAt.getVisibility() == 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                return z;
            }
            if (C2481n.m4231A0() && Build.VERSION.SDK_INT < 29) {
                try {
                    return Settings.Global.getInt(C2479l.getApp().getContentResolver(), "navigationbar_hide_bar_enabled") == 0;
                } catch (Exception unused) {
                }
            }
            return (viewGroup.getSystemUiVisibility() & 2) == 0;
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean isStatusBarLightMode(@efb Window window) {
        if (window != null) {
            return (window.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    @c5e(21)
    public static void setNavBarColor(@efb Window window, @g92 int i) {
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setNavigationBarColor(i);
            return;
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void setNavBarLightMode(@efb Window window, boolean z) {
        if (window != null) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility | 16 : systemUiVisibility & (-17));
            return;
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void setNavBarVisibility(@efb Window window, boolean z) {
        if (window != null) {
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                int id = childAt.getId();
                if (id != -1 && "navigationBarBackground".equals(getResNameById(id))) {
                    childAt.setVisibility(z ? 0 : 4);
                }
            }
            if (z) {
                viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-4611));
                return;
            } else {
                viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 4610);
                return;
            }
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static View setStatusBarColor(@efb Activity activity, @g92 int i, boolean z) {
        if (activity != null) {
            transparentStatusBar(activity);
            return applyStatusBarColor(activity, i, z);
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void setStatusBarLightMode(@efb Window window, boolean z) {
        if (window != null) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            return;
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void setStatusBarVisibility(@efb Window window, boolean z) {
        if (window == null) {
            throw new NullPointerException("Argument 'window' of type Window (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (z) {
            window.clearFlags(1024);
            showStatusBarView(window);
            addMarginTopEqualStatusBarHeight(window);
        } else {
            window.addFlags(1024);
            hideStatusBarView(window);
            subtractMarginTopEqualStatusBarHeight(window);
        }
    }

    public static void transparentStatusBar(@efb Window window) {
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
            window.setStatusBarColor(0);
            return;
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void setStatusBarColor4Drawer(@efb DrawerLayout drawerLayout, @efb View view, @g92 int i, boolean z) {
        if (drawerLayout == null) {
            throw new NullPointerException("Argument 'drawer' of type DrawerLayout (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (view != null) {
            Activity activityM4244H = C2481n.m4244H(view.getContext());
            if (activityM4244H == null) {
                return;
            }
            transparentStatusBar(activityM4244H);
            drawerLayout.setFitsSystemWindows(false);
            setStatusBarColor(view, i);
            int childCount = drawerLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                drawerLayout.getChildAt(i2).setFitsSystemWindows(false);
            }
            if (z) {
                hideStatusBarView(activityM4244H);
                return;
            } else {
                setStatusBarColor(activityM4244H, i, false);
                return;
            }
        }
        throw new NullPointerException("Argument 'fakeStatusBar' of type View (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static View setStatusBarColor(@efb Window window, @g92 int i) {
        if (window != null) {
            return setStatusBarColor(window, i, false);
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static View setStatusBarColor(@efb Window window, @g92 int i, boolean z) {
        if (window != null) {
            transparentStatusBar(window);
            return applyStatusBarColor(window, i, z);
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    private static void subtractMarginTopEqualStatusBarHeight(@efb Window window) {
        if (window != null) {
            View viewFindViewWithTag = window.getDecorView().findViewWithTag("TAG_OFFSET");
            if (viewFindViewWithTag == null) {
                return;
            }
            subtractMarginTopEqualStatusBarHeight(viewFindViewWithTag);
            return;
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    private static void addMarginTopEqualStatusBarHeight(@efb Window window) {
        if (window != null) {
            View viewFindViewWithTag = window.getDecorView().findViewWithTag("TAG_OFFSET");
            if (viewFindViewWithTag == null) {
                return;
            }
            addMarginTopEqualStatusBarHeight(viewFindViewWithTag);
            return;
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void setStatusBarColor(@efb View view, @g92 int i) {
        if (view != null) {
            Activity activityM4244H = C2481n.m4244H(view.getContext());
            if (activityM4244H == null) {
                return;
            }
            transparentStatusBar(activityM4244H);
            view.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = getStatusBarHeight();
            view.setBackgroundColor(i);
            return;
        }
        throw new NullPointerException("Argument 'fakeStatusBar' of type View (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
