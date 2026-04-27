package com.draggable.library.extension;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import java.text.DecimalFormat;
import p000.do8;
import p000.h9g;
import p000.md8;
import p000.mlh;
import p000.omg;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
public final class Utils {
    public static final Utils INSTANCE = new Utils();
    private static final DisplayMetrics sMetrics;

    static {
        Resources system = Resources.getSystem();
        md8.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
        sMetrics = system.getDisplayMetrics();
    }

    private Utils() {
    }

    @do8
    public static final int getScreenHeight() {
        DisplayMetrics displayMetrics = sMetrics;
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return 0;
    }

    @do8
    public static final int getScreenWidth() {
        DisplayMetrics displayMetrics = sMetrics;
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return 0;
    }

    @yfb
    public final String formatImageSize(long j) {
        if (j <= 0) {
            return "";
        }
        DecimalFormat decimalFormat = new DecimalFormat("####");
        if (j < 1024) {
            return String.valueOf(j) + "B";
        }
        if (j < 1048576) {
            return decimalFormat.format(Float.valueOf(j / 1024.0f)) + "KB";
        }
        if (j < 1073741824) {
            return decimalFormat.format(Float.valueOf((j / 1024.0f) / 1024.0f)) + "MB";
        }
        if (j >= 0) {
            return "";
        }
        return decimalFormat.format(Float.valueOf(((j / 1024.0f) / 1024.0f) / 1024.0f)) + "GB";
    }

    public final boolean isWifiConnected(@yfb Context context) {
        md8.checkParameterIsNotNull(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            throw new mlh("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && h9g.equals(activeNetworkInfo.getTypeName(), "WIFI", true);
    }

    @omg(19)
    public final void transparentStatusBar(@yfb Activity activity) {
        md8.checkParameterIsNotNull(activity, "activity");
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        Window window = activity.getWindow();
        md8.checkExpressionValueIsNotNull(window, "activity.window");
        View decorView = window.getDecorView();
        md8.checkExpressionValueIsNotNull(decorView, "activity.window\n                .decorView");
        decorView.setSystemUiVisibility(1280);
        Window window2 = activity.getWindow();
        md8.checkExpressionValueIsNotNull(window2, "activity.window");
        window2.setStatusBarColor(0);
    }
}
