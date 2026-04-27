package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class co2 {

    /* JADX INFO: renamed from: a */
    public static final String f17225a = "CompoundButtonCompat";

    /* JADX INFO: renamed from: b */
    public static Field f17226b;

    /* JADX INFO: renamed from: c */
    public static boolean f17227c;

    /* JADX INFO: renamed from: co2$a */
    @c5e(21)
    public static class C2411a {
        private C2411a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static ColorStateList m4103a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static PorterDuff.Mode m4104b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m4105c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m4106d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: co2$b */
    @c5e(23)
    public static class C2412b {
        private C2412b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Drawable m4107a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    private co2() {
    }

    @hib
    public static Drawable getButtonDrawable(@efb CompoundButton compoundButton) {
        return C2412b.m4107a(compoundButton);
    }

    @hib
    public static ColorStateList getButtonTintList(@efb CompoundButton compoundButton) {
        return C2411a.m4103a(compoundButton);
    }

    @hib
    public static PorterDuff.Mode getButtonTintMode(@efb CompoundButton compoundButton) {
        return C2411a.m4104b(compoundButton);
    }

    public static void setButtonTintList(@efb CompoundButton compoundButton, @hib ColorStateList colorStateList) {
        C2411a.m4105c(compoundButton, colorStateList);
    }

    public static void setButtonTintMode(@efb CompoundButton compoundButton, @hib PorterDuff.Mode mode) {
        C2411a.m4106d(compoundButton, mode);
    }
}
