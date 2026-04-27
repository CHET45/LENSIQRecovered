package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class iy1 {

    /* JADX INFO: renamed from: iy1$a */
    @c5e(21)
    public static class C7663a {
        private C7663a() {
        }

        @hib
        /* JADX INFO: renamed from: a */
        public static ColorStateList m13538a(@efb CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @hib
        /* JADX INFO: renamed from: b */
        public static PorterDuff.Mode m13539b(@efb CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        /* JADX INFO: renamed from: c */
        public static void m13540c(@efb CheckedTextView checkedTextView, @hib ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* JADX INFO: renamed from: d */
        public static void m13541d(@efb CheckedTextView checkedTextView, @hib PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    private iy1() {
    }

    @hib
    public static Drawable getCheckMarkDrawable(@efb CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    @hib
    public static ColorStateList getCheckMarkTintList(@efb CheckedTextView checkedTextView) {
        return C7663a.m13538a(checkedTextView);
    }

    @hib
    public static PorterDuff.Mode getCheckMarkTintMode(@efb CheckedTextView checkedTextView) {
        return C7663a.m13539b(checkedTextView);
    }

    public static void setCheckMarkTintList(@efb CheckedTextView checkedTextView, @hib ColorStateList colorStateList) {
        C7663a.m13540c(checkedTextView, colorStateList);
    }

    public static void setCheckMarkTintMode(@efb CheckedTextView checkedTextView, @hib PorterDuff.Mode mode) {
        C7663a.m13541d(checkedTextView, mode);
    }
}
