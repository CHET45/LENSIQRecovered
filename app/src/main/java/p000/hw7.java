package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public class hw7 {

    /* JADX INFO: renamed from: hw7$a */
    @c5e(21)
    public static class C7065a {
        private C7065a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static ColorStateList m12649a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static PorterDuff.Mode m12650b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m12651c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m12652d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    private hw7() {
    }

    @hib
    public static ColorStateList getImageTintList(@efb ImageView imageView) {
        return C7065a.m12649a(imageView);
    }

    @hib
    public static PorterDuff.Mode getImageTintMode(@efb ImageView imageView) {
        return C7065a.m12650b(imageView);
    }

    public static void setImageTintList(@efb ImageView imageView, @hib ColorStateList colorStateList) {
        C7065a.m12651c(imageView, colorStateList);
    }

    public static void setImageTintMode(@efb ImageView imageView, @hib PorterDuff.Mode mode) {
        C7065a.m12652d(imageView, mode);
    }
}
