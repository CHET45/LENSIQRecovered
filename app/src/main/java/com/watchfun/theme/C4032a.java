package com.watchfun.theme;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AbstractC0432e;
import androidx.drawerlayout.widget.DrawerLayout;
import p000.c5e;
import p000.efb;
import p000.g92;
import p000.igg;
import p000.j5e;
import p000.xig;
import p000.ymh;

/* JADX INFO: renamed from: com.watchfun.theme.a */
/* JADX INFO: loaded from: classes6.dex */
public class C4032a {

    /* JADX INFO: renamed from: a */
    public static final String f25273a = "StatusBarUtils";

    /* JADX INFO: renamed from: b */
    public static final String f25274b = "TAG_STATUS_BAR";

    /* JADX INFO: renamed from: c */
    public static final String f25275c = "TAG_OFFSET";

    /* JADX INFO: renamed from: d */
    public static final int f25276d = -123;

    /* JADX INFO: renamed from: com.watchfun.theme.a$a */
    public enum a {
        THREE_BUTTONS(false, 0),
        TWO_BUTTONS(true, 1),
        NO_BUTTON(true, 2);


        /* JADX INFO: renamed from: a */
        public final boolean f25281a;

        /* JADX INFO: renamed from: b */
        public final int f25282b;

        a(boolean z, int i) {
            this.f25281a = z;
            this.f25282b = i;
        }
    }

    private C4032a() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void addMarginTopEqualStatusBarHeight(@efb View view) {
        view.setTag("TAG_OFFSET");
        Object tag = view.getTag(-123);
        if (tag == null || !((Boolean) tag).booleanValue()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + getStatusBarHeight(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.setTag(-123, Boolean.TRUE);
        }
    }

    private static View applyStatusBarColor(Activity activity, int i, boolean z) {
        ViewGroup viewGroup = z ? (ViewGroup) activity.getWindow().getDecorView() : (ViewGroup) activity.findViewById(android.R.id.content);
        View viewFindViewWithTag = viewGroup.findViewWithTag("TAG_STATUS_BAR");
        if (viewFindViewWithTag == null) {
            View viewCreateStatusBarView = createStatusBarView(activity, i);
            viewGroup.addView(viewCreateStatusBarView);
            return viewCreateStatusBarView;
        }
        if (viewFindViewWithTag.getVisibility() == 8) {
            viewFindViewWithTag.setVisibility(0);
        }
        viewFindViewWithTag.setBackgroundColor(i);
        return viewFindViewWithTag;
    }

    private static View createStatusBarView(Activity activity, int i) {
        View view = new View(activity);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, getStatusBarHeight()));
        view.setBackgroundColor(i);
        view.setTag("TAG_STATUS_BAR");
        return view;
    }

    private static Activity getActivityByView(@efb View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    @c5e(21)
    public static int getNavBarColor(@efb Activity activity) {
        return getNavBarColor(activity.getWindow());
    }

    @igg({"DiscouragedApi", "InternalInsetResource"})
    public static int getNavBarHeight() {
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static a getNavMode(Context context) {
        a aVar = null;
        if (context == null) {
            return null;
        }
        int systemIntegerRes = getSystemIntegerRes(context, "config_navBarInteractionMode");
        for (a aVar2 : a.values()) {
            if (aVar2.f25282b == systemIntegerRes) {
                aVar = aVar2;
            }
        }
        return aVar;
    }

    @igg({"InternalInsetResource", "DiscouragedApi"})
    public static int getStatusBarHeight() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier(xig.f98117d, "dimen", "android"));
    }

    private static int getSystemIntegerRes(Context context, String str) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, ymh.InterfaceC15723b.f102124b, "android");
        if (identifier != 0) {
            return resources.getInteger(identifier);
        }
        return -1;
    }

    private static void hideStatusBarView(Activity activity) {
        hideStatusBarView(activity.getWindow());
    }

    private static void invokePanels(Activity activity, String str) {
        try {
            Class.forName("android.app.StatusBarManager").getMethod(str, null).invoke(activity.getSystemService("statusbar"), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isNavBarVisible(@efb Activity activity) {
        return isNavBarVisible(activity, activity.getWindow());
    }

    public static boolean isStatusBarLightMode(@efb Activity activity) {
        return isStatusBarLightMode(activity.getWindow());
    }

    public static boolean isStatusBarVisible(@efb Activity activity) {
        return (activity.getWindow().getAttributes().flags & 1024) == 0;
    }

    public static boolean isSupportNavBar(Activity activity) {
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
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

    public static void setNavBarColor(@efb Activity activity, @g92 int i) {
        if (isSupportNavBar(activity)) {
            setNavBarColor(activity.getWindow(), i);
        }
    }

    public static void setNavBarVisibility(@efb Activity activity, boolean z) {
        setNavBarVisibility(activity.getWindow(), activity, z);
    }

    @j5e("android.permission.EXPAND_STATUS_BAR")
    public static void setNotificationBarVisibility(Activity activity, boolean z) {
        invokePanels(activity, z ? "expandNotificationsPanel" : "collapsePanels");
    }

    public static View setStatusBarColor(@efb Activity activity, @g92 int i) {
        return setStatusBarColor(activity, i, false);
    }

    public static void setStatusBarColor4Drawer(@efb DrawerLayout drawerLayout, @efb View view, @g92 int i) {
        setStatusBarColor4Drawer(drawerLayout, view, i, false);
    }

    public static void setStatusBarCustom(@efb View view) {
        Activity activityByView = getActivityByView(view);
        if (activityByView == null) {
            return;
        }
        transparentStatusBar(activityByView);
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, getStatusBarHeight()));
        } else {
            layoutParams.width = -1;
            layoutParams.height = getStatusBarHeight();
        }
    }

    @c5e(api = 23)
    public static void setStatusBarDark(Activity activity, boolean z, boolean z2, boolean z3) {
        if (activity == null) {
            return;
        }
        if (!z) {
            AbstractC0432e.setDefaultNightMode(1);
            Window window = activity.getWindow();
            window.getDecorView().setSystemUiVisibility(9488);
            window.setStatusBarColor(activity.getResources().getColor(C4031R.color.transparent, null));
            window.setNavigationBarColor(activity.getResources().getColor(C4031R.color.tab_bg, null));
            window.addFlags(Integer.MIN_VALUE);
            return;
        }
        AbstractC0432e.setDefaultNightMode(2);
        Window window2 = activity.getWindow();
        window2.clearFlags(67108864);
        window2.getDecorView().setSystemUiVisibility(1280);
        window2.addFlags(Integer.MIN_VALUE);
        window2.setStatusBarColor(0);
        window2.setNavigationBarColor(activity.getResources().getColor(C4031R.color.tab_bg, null));
    }

    public static void setStatusBarLightMode(@efb Activity activity, boolean z) {
        setStatusBarLightMode(activity.getWindow(), z);
    }

    public static void setStatusBarVisibility(@efb Activity activity, boolean z) {
        setStatusBarVisibility(activity.getWindow(), z);
    }

    private static void showStatusBarView(Window window) {
        View viewFindViewWithTag = ((ViewGroup) window.getDecorView()).findViewWithTag("TAG_STATUS_BAR");
        if (viewFindViewWithTag == null) {
            return;
        }
        viewFindViewWithTag.setVisibility(0);
    }

    public static void subtractMarginTopEqualStatusBarHeight(@efb View view) {
        Object tag = view.getTag(-123);
        if (tag == null || !((Boolean) tag).booleanValue()) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin - getStatusBarHeight(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view.setTag(-123, Boolean.FALSE);
    }

    private static void transparentStatusBar(Activity activity) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(1280);
        window.setStatusBarColor(0);
    }

    @c5e(21)
    public static int getNavBarColor(@efb Window window) {
        return window.getNavigationBarColor();
    }

    private static void hideStatusBarView(Window window) {
        View viewFindViewWithTag = ((ViewGroup) window.getDecorView()).findViewWithTag("TAG_STATUS_BAR");
        if (viewFindViewWithTag == null) {
            return;
        }
        viewFindViewWithTag.setVisibility(8);
    }

    public static boolean isNavBarVisible(Activity activity, @efb Window window) {
        boolean z;
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
            if (id != -1 && "navigationBarBackground".equals(activity.getResources().getResourceEntryName(id)) && childAt.getVisibility() == 0) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return (viewGroup.getSystemUiVisibility() & 2) == 0;
        }
        return z;
    }

    public static boolean isStatusBarLightMode(@efb Window window) {
        View decorView = window.getDecorView();
        return (decorView == null || (decorView.getSystemUiVisibility() & 8192) == 0) ? false : true;
    }

    public static void setNavBarVisibility(@efb Window window, Activity activity, boolean z) {
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            int id = childAt.getId();
            if (id != -1 && "navigationBarBackground".equals(activity.getResources().getResourceEntryName(id))) {
                childAt.setVisibility(z ? 0 : 4);
            }
        }
        if (z) {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-4611));
        } else {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 4610);
        }
    }

    public static View setStatusBarColor(@efb Activity activity, @g92 int i, boolean z) {
        transparentStatusBar(activity);
        return applyStatusBarColor(activity, i, z);
    }

    public static void setStatusBarColor4Drawer(@efb DrawerLayout drawerLayout, @efb View view, @g92 int i, boolean z) {
        Activity activityByView = getActivityByView(view);
        if (activityByView == null) {
            return;
        }
        transparentStatusBar(activityByView);
        drawerLayout.setFitsSystemWindows(false);
        setStatusBarColor(view, i);
        int childCount = drawerLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            drawerLayout.getChildAt(i2).setFitsSystemWindows(false);
        }
        if (z) {
            hideStatusBarView(activityByView);
        } else {
            setStatusBarColor(activityByView, i, false);
        }
    }

    public static void setStatusBarLightMode(@efb Window window, boolean z) {
        View decorView = window.getDecorView();
        if (decorView != null) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    public static void setStatusBarVisibility(@efb Window window, boolean z) {
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

    @c5e(21)
    public static void setNavBarColor(@efb Window window, @g92 int i) {
        window.setNavigationBarColor(i);
    }

    public static void setStatusBarColor(@efb View view, @g92 int i) {
        Activity activityByView = getActivityByView(view);
        if (activityByView == null) {
            return;
        }
        transparentStatusBar(activityByView);
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = getStatusBarHeight();
        view.setBackgroundColor(i);
    }

    private static void subtractMarginTopEqualStatusBarHeight(Window window) {
        View viewFindViewWithTag = window.getDecorView().findViewWithTag("TAG_OFFSET");
        if (viewFindViewWithTag == null) {
            return;
        }
        subtractMarginTopEqualStatusBarHeight(viewFindViewWithTag);
    }

    private static void addMarginTopEqualStatusBarHeight(Window window) {
        View viewFindViewWithTag = window.getDecorView().findViewWithTag("TAG_OFFSET");
        if (viewFindViewWithTag == null) {
            return;
        }
        addMarginTopEqualStatusBarHeight(viewFindViewWithTag);
    }

    @c5e(api = 23)
    public static void setStatusBarDark(Activity activity, boolean z, boolean z2, boolean z3, int i) {
        if (activity == null) {
            return;
        }
        if (!z) {
            AbstractC0432e.setDefaultNightMode(1);
            Window window = activity.getWindow();
            window.getDecorView().setSystemUiVisibility(9488);
            window.setStatusBarColor(activity.getResources().getColor(C4031R.color.transparent, null));
            window.setNavigationBarColor(i);
            window.addFlags(Integer.MIN_VALUE);
            return;
        }
        AbstractC0432e.setDefaultNightMode(2);
        Window window2 = activity.getWindow();
        window2.clearFlags(67108864);
        window2.getDecorView().setSystemUiVisibility(1280);
        window2.addFlags(Integer.MIN_VALUE);
        window2.setStatusBarColor(0);
        window2.setNavigationBarColor(i);
    }
}
