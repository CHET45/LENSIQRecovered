package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.VectorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class gxg {
    public static void applyBackgroundTint(View view, @g92 int i) {
        yp4.setTint(view.getBackground().mutate(), i);
        invalidateView(view);
    }

    public static void applyIconTint(TextView textView, @g92 int i) {
        Drawable drawable = textView.getCompoundDrawables()[0];
        if (drawable == null) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        yp4.setTint(drawableMutate, i);
        textView.setCompoundDrawablesWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
        invalidateView(textView);
    }

    public static void applyIconTints(List<TextView> list, @g92 int i) {
        Iterator<TextView> it = list.iterator();
        while (it.hasNext()) {
            applyIconTint(it.next(), i);
        }
    }

    public static void applyTintToBackground(View view, int i) {
        Drawable background = view.getBackground();
        if (background != null) {
            yp4.setTint(background.mutate(), i);
        }
        invalidateView(view);
    }

    public static void applyVectorColorTint(ImageView imageView, @g92 int i) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof VectorDrawable) {
            ((VectorDrawable) drawable.mutate()).setTint(i);
            invalidateView(imageView);
        }
    }

    public static void invalidateView(View view) {
        view.postInvalidate();
    }

    public static int resolveThemeColor(Context context, @gc0 int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return lx2.getColor(context, typedValue.resourceId);
    }

    public static Drawable resolveThemeDrawable(Context context, @gc0 int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static Drawable resolveThemeMineDrawable(Context context, @gc0 int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return u20.getDrawable(context, typedValue.resourceId);
    }

    public static void updateStrokeColor(Context context, View view, int i, int i2) {
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) background.mutate();
            gradientDrawable.setStroke((int) context.getResources().getDimension(i2), i);
            view.setBackground(gradientDrawable);
            invalidateView(view);
        }
    }
}
