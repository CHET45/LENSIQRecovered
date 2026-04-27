package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes5.dex */
public class c0b {

    /* JADX INFO: renamed from: a */
    public static final String f15431a = "cubic-bezier";

    /* JADX INFO: renamed from: b */
    public static final String f15432b = "path";

    /* JADX INFO: renamed from: c */
    public static final String f15433c = "(";

    /* JADX INFO: renamed from: d */
    public static final String f15434d = ")";

    private c0b() {
    }

    private static float getLegacyControlPoint(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    private static String getLegacyEasingContent(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static TimeInterpolator getLegacyThemeInterpolator(String str) {
        if (!isLegacyEasingType(str, f15431a)) {
            if (isLegacyEasingType(str, "path")) {
                return gjc.create(vjc.createPathFromPathData(getLegacyEasingContent(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = getLegacyEasingContent(str, f15431a).split(",");
        if (strArrSplit.length == 4) {
            return gjc.create(getLegacyControlPoint(strArrSplit, 0), getLegacyControlPoint(strArrSplit, 1), getLegacyControlPoint(strArrSplit, 2), getLegacyControlPoint(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    private static boolean isLegacyEasingAttribute(String str) {
        return isLegacyEasingType(str, f15431a) || isLegacyEasingType(str, "path");
    }

    private static boolean isLegacyEasingType(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(f15433c);
        return str.startsWith(sb.toString()) && str.endsWith(f15434d);
    }

    public static int resolveThemeDuration(@efb Context context, @gc0 int i, int i2) {
        return hw9.resolveInteger(context, i, i2);
    }

    @efb
    public static TimeInterpolator resolveThemeInterpolator(@efb Context context, @gc0 int i, @efb TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return isLegacyEasingAttribute(strValueOf) ? getLegacyThemeInterpolator(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }
}
