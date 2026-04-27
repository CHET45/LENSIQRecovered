package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.C0392R;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class ixg {

    /* JADX INFO: renamed from: a */
    public static final String f48835a = "ThemeUtils";

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<TypedValue> f48836b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c */
    public static final int[] f48837c = {-16842910};

    /* JADX INFO: renamed from: d */
    public static final int[] f48838d = {R.attr.state_focused};

    /* JADX INFO: renamed from: e */
    public static final int[] f48839e = {R.attr.state_activated};

    /* JADX INFO: renamed from: f */
    public static final int[] f48840f = {16842919};

    /* JADX INFO: renamed from: g */
    public static final int[] f48841g = {16842912};

    /* JADX INFO: renamed from: h */
    public static final int[] f48842h = {R.attr.state_selected};

    /* JADX INFO: renamed from: i */
    public static final int[] f48843i = {-16842919, -16842908};

    /* JADX INFO: renamed from: j */
    public static final int[] f48844j = new int[0];

    /* JADX INFO: renamed from: k */
    public static final int[] f48845k = new int[1];

    private ixg() {
    }

    /* JADX INFO: renamed from: a */
    public static int m13537a(@efb Context context, int i, float f) {
        return ua2.setAlphaComponent(getThemeAttrColor(context, i), Math.round(Color.alpha(r0) * f));
    }

    public static void checkAppCompatTheme(@efb View view, @efb Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C0392R.styleable.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(C0392R.styleable.AppCompatTheme_windowActionBar)) {
                Log.e(f48835a, "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @efb
    public static ColorStateList createDisabledStateList(int i, int i2) {
        return new ColorStateList(new int[][]{f48837c, f48844j}, new int[]{i2, i});
    }

    public static int getDisabledThemeAttrColor(@efb Context context, int i) {
        ColorStateList themeAttrColorStateList = getThemeAttrColorStateList(context, i);
        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
            return themeAttrColorStateList.getColorForState(f48837c, themeAttrColorStateList.getDefaultColor());
        }
        TypedValue typedValue = getTypedValue();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        return m13537a(context, i, typedValue.getFloat());
    }

    public static int getThemeAttrColor(@efb Context context, int i) {
        int[] iArr = f48845k;
        iArr[0] = i;
        t2h t2hVarObtainStyledAttributes = t2h.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        try {
            return t2hVarObtainStyledAttributes.getColor(0, 0);
        } finally {
            t2hVarObtainStyledAttributes.recycle();
        }
    }

    @hib
    public static ColorStateList getThemeAttrColorStateList(@efb Context context, int i) {
        int[] iArr = f48845k;
        iArr[0] = i;
        t2h t2hVarObtainStyledAttributes = t2h.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        try {
            return t2hVarObtainStyledAttributes.getColorStateList(0);
        } finally {
            t2hVarObtainStyledAttributes.recycle();
        }
    }

    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = f48836b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
