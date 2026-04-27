package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
public class ow9 {

    /* JADX INFO: renamed from: a */
    public static final float f69024a = 1.0f;

    /* JADX INFO: renamed from: b */
    public static final float f69025b = 0.54f;

    /* JADX INFO: renamed from: c */
    public static final float f69026c = 0.38f;

    /* JADX INFO: renamed from: d */
    public static final float f69027d = 0.32f;

    /* JADX INFO: renamed from: e */
    public static final float f69028e = 0.12f;

    /* JADX INFO: renamed from: f */
    public static final int f69029f = 40;

    /* JADX INFO: renamed from: g */
    public static final int f69030g = 100;

    /* JADX INFO: renamed from: h */
    public static final int f69031h = 90;

    /* JADX INFO: renamed from: i */
    public static final int f69032i = 10;

    /* JADX INFO: renamed from: j */
    public static final int f69033j = 80;

    /* JADX INFO: renamed from: k */
    public static final int f69034k = 20;

    /* JADX INFO: renamed from: l */
    public static final int f69035l = 30;

    /* JADX INFO: renamed from: m */
    public static final int f69036m = 90;

    private ow9() {
    }

    @g92
    public static int compositeARGBWithAlpha(@g92 int i, @h78(from = 0, m12174to = coe.f17274d) int i2) {
        return ua2.setAlphaComponent(i, (Color.alpha(i) * i2) / 255);
    }

    @g92
    public static int getColor(@efb View view, @gc0 int i) {
        return resolveColor(view.getContext(), hw9.resolveTypedValueOrThrow(view, i));
    }

    @g92
    private static int getColorRole(@g92 int i, @h78(from = 0, m12174to = 100) int i2) {
        bi7 bi7VarFromInt = bi7.fromInt(i);
        bi7VarFromInt.setTone(i2);
        return bi7VarFromInt.toInt();
    }

    @efb
    public static ha2 getColorRoles(@efb Context context, @g92 int i) {
        return getColorRoles(i, hw9.resolveBoolean(context, C3146R.attr.isLightTheme, true));
    }

    @efb
    public static ColorStateList getColorStateList(@efb Context context, @gc0 int i, @efb ColorStateList colorStateList) {
        TypedValue typedValueResolve = hw9.resolve(context, i);
        ColorStateList colorStateListResolveColorStateList = typedValueResolve != null ? resolveColorStateList(context, typedValueResolve) : null;
        return colorStateListResolveColorStateList == null ? colorStateList : colorStateListResolveColorStateList;
    }

    @hib
    public static ColorStateList getColorStateListOrNull(@efb Context context, @gc0 int i) {
        TypedValue typedValueResolve = hw9.resolve(context, i);
        if (typedValueResolve == null) {
            return null;
        }
        int i2 = typedValueResolve.resourceId;
        if (i2 != 0) {
            return lx2.getColorStateList(context, i2);
        }
        int i3 = typedValueResolve.data;
        if (i3 != 0) {
            return ColorStateList.valueOf(i3);
        }
        return null;
    }

    @g92
    public static int harmonize(@g92 int i, @g92 int i2) {
        return p51.harmonize(i, i2);
    }

    @g92
    public static int harmonizeWithPrimary(@efb Context context, @g92 int i) {
        return harmonize(i, getColor(context, C3146R.attr.colorPrimary, ow9.class.getCanonicalName()));
    }

    public static boolean isColorLight(@g92 int i) {
        return i != 0 && ua2.calculateLuminance(i) > 0.5d;
    }

    @g92
    public static int layer(@efb View view, @gc0 int i, @gc0 int i2) {
        return layer(view, i, i2, 1.0f);
    }

    private static int resolveColor(@efb Context context, @efb TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? lx2.getColor(context, i) : typedValue.data;
    }

    private static ColorStateList resolveColorStateList(@efb Context context, @efb TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? lx2.getColorStateList(context, i) : ColorStateList.valueOf(typedValue.data);
    }

    @g92
    public static int layer(@efb View view, @gc0 int i, @gc0 int i2, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        return layer(getColor(view, i), getColor(view, i2), f);
    }

    @g92
    public static int getColor(Context context, @gc0 int i, String str) {
        return resolveColor(context, hw9.resolveTypedValueOrThrow(context, i, str));
    }

    @efb
    public static ha2 getColorRoles(@g92 int i, boolean z) {
        if (z) {
            return new ha2(getColorRole(i, 40), getColorRole(i, 100), getColorRole(i, 90), getColorRole(i, 10));
        }
        return new ha2(getColorRole(i, 80), getColorRole(i, 20), getColorRole(i, 30), getColorRole(i, 90));
    }

    @g92
    public static int layer(@g92 int i, @g92 int i2, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        return layer(i, ua2.setAlphaComponent(i2, Math.round(Color.alpha(i2) * f)));
    }

    @g92
    public static int getColor(@efb View view, @gc0 int i, @g92 int i2) {
        return getColor(view.getContext(), i, i2);
    }

    @g92
    public static int getColor(@efb Context context, @gc0 int i, @g92 int i2) {
        TypedValue typedValueResolve = hw9.resolve(context, i);
        return typedValueResolve != null ? resolveColor(context, typedValueResolve) : i2;
    }

    @g92
    public static int layer(@g92 int i, @g92 int i2) {
        return ua2.compositeColors(i2, i);
    }
}
