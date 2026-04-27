package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.google.android.material.C3146R;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class a3a {

    /* JADX INFO: renamed from: a */
    public static final float f271a = 1.3f;

    /* JADX INFO: renamed from: b */
    public static final float f272b = 2.0f;

    private a3a() {
    }

    @ebg
    /* JADX INFO: renamed from: a */
    public static int m124a(@efb TypedArray typedArray, @ebg int i, @ebg int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    @hib
    public static ColorStateList getColorStateList(@efb Context context, @efb TypedArray typedArray, @ebg int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = u20.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    private static int getComplexUnit(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static int getDimensionPixelSize(@efb Context context, @efb TypedArray typedArray, @ebg int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @hib
    public static Drawable getDrawable(@efb Context context, @efb TypedArray typedArray, @ebg int i) {
        int resourceId;
        Drawable drawable;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawable = u20.getDrawable(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawable;
    }

    @hib
    public static iqg getTextAppearance(@efb Context context, @efb TypedArray typedArray, @ebg int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new iqg(context, resourceId);
    }

    public static int getUnscaledTextSize(@efb Context context, @dbg int i, int i2) {
        if (i == 0) {
            return i2;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C3146R.styleable.TextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(C3146R.styleable.TextAppearance_android_textSize, typedValue);
        typedArrayObtainStyledAttributes.recycle();
        return !value ? i2 : getComplexUnit(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static boolean isFontScaleAtLeast1_3(@efb Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean isFontScaleAtLeast2_0(@efb Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    @hib
    public static ColorStateList getColorStateList(@efb Context context, @efb t2h t2hVar, @ebg int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!t2hVar.hasValue(i) || (resourceId = t2hVar.getResourceId(i, 0)) == 0 || (colorStateList = u20.getColorStateList(context, resourceId)) == null) ? t2hVar.getColorStateList(i) : colorStateList;
    }
}
