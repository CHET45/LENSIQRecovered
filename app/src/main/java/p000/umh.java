package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class umh {
    private static final void checkAttribute(TypedArray typedArray, @ebg int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean getBooleanOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        return typedArray.getBoolean(i, false);
    }

    @g92
    public static final int getColorOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        return typedArray.getColor(i, 0);
    }

    @yfb
    public static final ColorStateList getColorStateListOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        ColorStateList colorStateList = typedArray.getColorStateList(i);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.");
    }

    public static final float getDimensionOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        return typedArray.getDimension(i, 0.0f);
    }

    @yc4
    public static final int getDimensionPixelOffsetOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        return typedArray.getDimensionPixelOffset(i, 0);
    }

    @yc4
    public static final int getDimensionPixelSizeOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        return typedArray.getDimensionPixelSize(i, 0);
    }

    @yfb
    public static final Drawable getDrawableOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        Drawable drawable = typedArray.getDrawable(i);
        md8.checkNotNull(drawable);
        return drawable;
    }

    public static final float getFloatOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        return typedArray.getFloat(i, 0.0f);
    }

    @c5e(26)
    @yfb
    public static final Typeface getFontOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        return tmh.getFont(typedArray, i);
    }

    public static final int getIntOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        return typedArray.getInt(i, 0);
    }

    public static final int getIntegerOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        return typedArray.getInteger(i, 0);
    }

    @e00
    public static final int getResourceIdOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }

    @yfb
    public static final String getStringOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        String string = typedArray.getString(i);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.");
    }

    @yfb
    public static final CharSequence[] getTextArrayOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        return typedArray.getTextArray(i);
    }

    @yfb
    public static final CharSequence getTextOrThrow(@yfb TypedArray typedArray, @ebg int i) {
        checkAttribute(typedArray, i);
        CharSequence text = typedArray.getText(i);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.");
    }

    public static final <R> R use(@yfb TypedArray typedArray, @yfb qy6<? super TypedArray, ? extends R> qy6Var) {
        R rInvoke = qy6Var.invoke(typedArray);
        typedArray.recycle();
        return rInvoke;
    }
}
