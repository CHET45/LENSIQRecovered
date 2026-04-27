package p000;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import p000.z51;

/* JADX INFO: loaded from: classes.dex */
public class s51 {

    /* JADX INFO: renamed from: s51$a */
    @c5e(29)
    public static class C12444a {
        private C12444a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static ColorFilter m21736a(int i, Object obj) {
            return new BlendModeColorFilter(i, (BlendMode) obj);
        }
    }

    private s51() {
    }

    @hib
    public static ColorFilter createBlendModeColorFilterCompat(int i, @efb y51 y51Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objM26586a = z51.C16008b.m26586a(y51Var);
            if (objM26586a != null) {
                return C12444a.m21736a(i, objM26586a);
            }
            return null;
        }
        PorterDuff.Mode modeM26585a = z51.m26585a(y51Var);
        if (modeM26585a != null) {
            return new PorterDuffColorFilter(i, modeM26585a);
        }
        return null;
    }
}
