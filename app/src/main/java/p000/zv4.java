package p000;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import p000.yig;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nEdgeToEdge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdge.kt\nandroidx/activity/EdgeToEdge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
@xn8(name = "EdgeToEdge")
public final class zv4 {

    /* JADX INFO: renamed from: a */
    public static final int f106141a = Color.argb(nb2.f63864l, 255, 255, 255);

    /* JADX INFO: renamed from: b */
    public static final int f106142b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: c */
    @gib
    public static hw4 f106143c;

    @xn8(name = "enable")
    @yn8
    public static final void enable(@yfb ComponentActivity componentActivity) {
        md8.checkNotNullParameter(componentActivity, "<this>");
        enable$default(componentActivity, null, null, 3, null);
    }

    public static /* synthetic */ void enable$default(ComponentActivity componentActivity, yig yigVar, yig yigVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            yigVar = yig.C15686a.auto$default(yig.f101747e, 0, 0, null, 4, null);
        }
        if ((i & 2) != 0) {
            yigVar2 = yig.C15686a.auto$default(yig.f101747e, f106141a, f106142b, null, 4, null);
        }
        enable(componentActivity, yigVar, yigVar2);
    }

    public static final int getDefaultDarkScrim() {
        return f106142b;
    }

    @fdi
    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
    }

    public static final int getDefaultLightScrim() {
        return f106141a;
    }

    @fdi
    public static /* synthetic */ void getDefaultLightScrim$annotations() {
    }

    @xn8(name = "enable")
    @yn8
    public static final void enable(@yfb ComponentActivity componentActivity, @yfb yig yigVar) {
        md8.checkNotNullParameter(componentActivity, "<this>");
        md8.checkNotNullParameter(yigVar, "statusBarStyle");
        enable$default(componentActivity, yigVar, null, 2, null);
    }

    @xn8(name = "enable")
    @yn8
    public static final void enable(@yfb ComponentActivity componentActivity, @yfb yig yigVar, @yfb yig yigVar2) {
        md8.checkNotNullParameter(componentActivity, "<this>");
        md8.checkNotNullParameter(yigVar, "statusBarStyle");
        md8.checkNotNullParameter(yigVar2, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        md8.checkNotNullExpressionValue(decorView, "window.decorView");
        qy6<Resources, Boolean> detectDarkMode$activity_release = yigVar.getDetectDarkMode$activity_release();
        Resources resources = decorView.getResources();
        md8.checkNotNullExpressionValue(resources, "view.resources");
        boolean zBooleanValue = detectDarkMode$activity_release.invoke(resources).booleanValue();
        qy6<Resources, Boolean> detectDarkMode$activity_release2 = yigVar2.getDetectDarkMode$activity_release();
        Resources resources2 = decorView.getResources();
        md8.checkNotNullExpressionValue(resources2, "view.resources");
        boolean zBooleanValue2 = detectDarkMode$activity_release2.invoke(resources2).booleanValue();
        hw4 cw4Var = f106143c;
        if (cw4Var == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                cw4Var = new fw4();
            } else {
                cw4Var = new cw4();
            }
        }
        hw4 hw4Var = cw4Var;
        Window window = componentActivity.getWindow();
        md8.checkNotNullExpressionValue(window, "window");
        hw4Var.setUp(yigVar, yigVar2, window, decorView, zBooleanValue, zBooleanValue2);
    }
}
