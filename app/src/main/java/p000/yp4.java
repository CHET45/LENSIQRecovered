package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class yp4 {

    /* JADX INFO: renamed from: a */
    public static final String f102469a = "DrawableCompat";

    /* JADX INFO: renamed from: b */
    public static Method f102470b;

    /* JADX INFO: renamed from: c */
    public static boolean f102471c;

    /* JADX INFO: renamed from: d */
    public static Method f102472d;

    /* JADX INFO: renamed from: e */
    public static boolean f102473e;

    /* JADX INFO: renamed from: yp4$a */
    @c5e(21)
    public static class C15755a {
        private C15755a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m26271a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static boolean m26272b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static ColorFilter m26273c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m26274d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static void m26275e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static void m26276f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        @ih4
        /* JADX INFO: renamed from: g */
        public static void m26277g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        @ih4
        /* JADX INFO: renamed from: h */
        public static void m26278h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @ih4
        /* JADX INFO: renamed from: i */
        public static void m26279i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: yp4$b */
    @c5e(23)
    public static class C15756b {
        private C15756b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m26280a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static boolean m26281b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    private yp4() {
    }

    public static void applyTheme(@efb Drawable drawable, @efb Resources.Theme theme) {
        C15755a.m26271a(drawable, theme);
    }

    public static boolean canApplyTheme(@efb Drawable drawable) {
        return C15755a.m26272b(drawable);
    }

    public static void clearColorFilter(@efb Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int getAlpha(@efb Drawable drawable) {
        return drawable.getAlpha();
    }

    @hib
    public static ColorFilter getColorFilter(@efb Drawable drawable) {
        return C15755a.m26273c(drawable);
    }

    public static int getLayoutDirection(@efb Drawable drawable) {
        return C15756b.m26280a(drawable);
    }

    public static void inflate(@efb Drawable drawable, @efb Resources resources, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
        C15755a.m26274d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean isAutoMirrored(@efb Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void jumpToCurrentState(@efb Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void setAutoMirrored(@efb Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static void setHotspot(@efb Drawable drawable, float f, float f2) {
        C15755a.m26275e(drawable, f, f2);
    }

    public static void setHotspotBounds(@efb Drawable drawable, int i, int i2, int i3, int i4) {
        C15755a.m26276f(drawable, i, i2, i3, i4);
    }

    public static boolean setLayoutDirection(@efb Drawable drawable, int i) {
        return C15756b.m26281b(drawable, i);
    }

    public static void setTint(@efb Drawable drawable, @g92 int i) {
        C15755a.m26277g(drawable, i);
    }

    public static void setTintList(@efb Drawable drawable, @hib ColorStateList colorStateList) {
        C15755a.m26278h(drawable, colorStateList);
    }

    public static void setTintMode(@efb Drawable drawable, @hib PorterDuff.Mode mode) {
        C15755a.m26279i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T unwrap(@efb Drawable drawable) {
        return drawable instanceof cri ? (T) ((cri) drawable).getWrappedDrawable() : drawable;
    }

    @efb
    public static Drawable wrap(@efb Drawable drawable) {
        return drawable;
    }
}
