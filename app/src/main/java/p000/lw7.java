package p000;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class lw7 {

    /* JADX INFO: renamed from: a */
    public static boolean f59003a = true;

    /* JADX INFO: renamed from: b */
    public static Field f59004b;

    /* JADX INFO: renamed from: c */
    public static boolean f59005c;

    private lw7() {
    }

    /* JADX INFO: renamed from: a */
    public static void m16423a(@efb ImageView imageView, @hib Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
            return;
        }
        if (matrix != null) {
            hiddenAnimateTransform(imageView, matrix);
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            imageView.invalidate();
        }
    }

    private static void fetchDrawMatrixField() {
        if (f59005c) {
            return;
        }
        try {
            Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
            f59004b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f59005c = true;
    }

    @c5e(21)
    @igg({"NewApi"})
    private static void hiddenAnimateTransform(@efb ImageView imageView, @hib Matrix matrix) {
        if (f59003a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f59003a = false;
            }
        }
    }
}
