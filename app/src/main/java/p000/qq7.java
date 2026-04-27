package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class qq7 {
    private qq7() {
    }

    /* JADX INFO: renamed from: a */
    public static void m20502a(@efb TextInputLayout textInputLayout, @efb CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = yp4.wrap(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                yp4.setTintList(drawable, colorStateList);
            } else {
                yp4.setTintList(drawable, ColorStateList.valueOf(colorStateList.getColorForState(mergeIconState(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                yp4.setTintMode(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ImageView.ScaleType m20503b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX INFO: renamed from: c */
    public static void m20504c(@efb TextInputLayout textInputLayout, @efb CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(mergeIconState(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = yp4.wrap(drawable).mutate();
        yp4.setTintList(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: d */
    public static void m20505d(@efb CheckableImageButton checkableImageButton) {
    }

    /* JADX INFO: renamed from: e */
    public static void m20506e(@efb CheckableImageButton checkableImageButton, @fkd int i) {
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
    }

    /* JADX INFO: renamed from: f */
    public static void m20507f(@efb CheckableImageButton checkableImageButton, @hib View.OnClickListener onClickListener, @hib View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: renamed from: g */
    public static void m20508g(@efb CheckableImageButton checkableImageButton, @hib View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: renamed from: h */
    public static void m20509h(@efb CheckableImageButton checkableImageButton, @efb ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }

    private static int[] mergeIconState(@efb TextInputLayout textInputLayout, @efb CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    private static void setIconClickable(@efb CheckableImageButton checkableImageButton, @hib View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = o8i.hasOnClickListeners(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        o8i.setImportantForAccessibility(checkableImageButton, z2 ? 1 : 2);
    }
}
