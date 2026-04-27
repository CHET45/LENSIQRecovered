package p000;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import p000.z51;

/* JADX INFO: loaded from: classes.dex */
public final class jcc {

    /* JADX INFO: renamed from: a */
    public static final String f50324a = "\udfffd";

    /* JADX INFO: renamed from: b */
    public static final String f50325b = "m";

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal<tcc<Rect, Rect>> f50326c = new ThreadLocal<>();

    /* JADX INFO: renamed from: jcc$a */
    @c5e(23)
    public static class C7871a {
        private C7871a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m14060a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* JADX INFO: renamed from: jcc$b */
    @c5e(29)
    public static class C7872b {
        private C7872b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m14061a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    private jcc() {
    }

    public static boolean hasGlyph(@efb Paint paint, @efb String str) {
        return C7871a.m14060a(paint, str);
    }

    private static tcc<Rect, Rect> obtainEmptyRects() {
        ThreadLocal<tcc<Rect, Rect>> threadLocal = f50326c;
        tcc<Rect, Rect> tccVar = threadLocal.get();
        if (tccVar == null) {
            tcc<Rect, Rect> tccVar2 = new tcc<>(new Rect(), new Rect());
            threadLocal.set(tccVar2);
            return tccVar2;
        }
        tccVar.f84271a.setEmpty();
        tccVar.f84272b.setEmpty();
        return tccVar;
    }

    public static boolean setBlendMode(@efb Paint paint, @hib y51 y51Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            C7872b.m14061a(paint, y51Var != null ? z51.C16008b.m26586a(y51Var) : null);
            return true;
        }
        if (y51Var == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeM26585a = z51.m26585a(y51Var);
        paint.setXfermode(modeM26585a != null ? new PorterDuffXfermode(modeM26585a) : null);
        return modeM26585a != null;
    }
}
