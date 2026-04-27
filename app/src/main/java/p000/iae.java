package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import com.google.android.material.C3146R;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class iae {

    /* JADX INFO: renamed from: a */
    @sy1(api = 21)
    public static final boolean f46253a = true;

    /* JADX INFO: renamed from: b */
    public static final int[] f46254b = {16842919};

    /* JADX INFO: renamed from: c */
    public static final int[] f46255c = {R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f46256d = {R.attr.state_focused};

    /* JADX INFO: renamed from: e */
    public static final int[] f46257e = {R.attr.state_hovered};

    /* JADX INFO: renamed from: f */
    public static final int[] f46258f = {R.attr.state_selected, 16842919};

    /* JADX INFO: renamed from: g */
    public static final int[] f46259g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: h */
    public static final int[] f46260h = {R.attr.state_selected, R.attr.state_focused};

    /* JADX INFO: renamed from: i */
    public static final int[] f46261i = {R.attr.state_selected, R.attr.state_hovered};

    /* JADX INFO: renamed from: j */
    public static final int[] f46262j = {R.attr.state_selected};

    /* JADX INFO: renamed from: k */
    public static final int[] f46263k = {16842910, 16842919};

    /* JADX INFO: renamed from: l */
    @fdi
    public static final String f46264l = iae.class.getSimpleName();

    /* JADX INFO: renamed from: m */
    @fdi
    public static final String f46265m = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    /* JADX INFO: renamed from: iae$a */
    @c5e(21)
    public static class C7220a {
        private C7220a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ih4
        public static Drawable createOvalRipple(@efb Context context, @fkd int i) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(ow9.getColorStateList(context, C3146R.attr.colorControlHighlight, ColorStateList.valueOf(0)), null, new InsetDrawable((Drawable) gradientDrawable, i, i, i, i));
        }
    }

    private iae() {
    }

    @efb
    public static ColorStateList convertToRippleDrawableColor(@hib ColorStateList colorStateList) {
        if (f46253a) {
            int[] iArr = f46256d;
            return new ColorStateList(new int[][]{f46262j, iArr, StateSet.NOTHING}, new int[]{getColorForState(colorStateList, f46258f), getColorForState(colorStateList, iArr), getColorForState(colorStateList, f46254b)});
        }
        int[] iArr2 = f46258f;
        int[] iArr3 = f46259g;
        int[] iArr4 = f46260h;
        int[] iArr5 = f46261i;
        int[] iArr6 = f46254b;
        int[] iArr7 = f46255c;
        int[] iArr8 = f46256d;
        int[] iArr9 = f46257e;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f46262j, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{getColorForState(colorStateList, iArr2), getColorForState(colorStateList, iArr3), getColorForState(colorStateList, iArr4), getColorForState(colorStateList, iArr5), 0, getColorForState(colorStateList, iArr6), getColorForState(colorStateList, iArr7), getColorForState(colorStateList, iArr8), getColorForState(colorStateList, iArr9), 0});
    }

    @c5e(21)
    @efb
    public static Drawable createOvalRippleLollipop(@efb Context context, @fkd int i) {
        return C7220a.createOvalRipple(context, i);
    }

    @g92
    @omg(21)
    private static int doubleAlpha(@g92 int i) {
        return ua2.setAlphaComponent(i, Math.min(Color.alpha(i) * 2, 255));
    }

    @g92
    private static int getColorForState(@hib ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f46253a ? doubleAlpha(colorForState) : colorForState;
    }

    @efb
    public static ColorStateList sanitizeRippleDrawableColor(@hib ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f46263k, 0)) != 0) {
            Log.w(f46264l, f46265m);
        }
        return colorStateList;
    }

    public static boolean shouldDrawRippleCompat(@efb int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
