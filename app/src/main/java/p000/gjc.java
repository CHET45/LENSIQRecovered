package p000;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public final class gjc {

    /* JADX INFO: renamed from: gjc$a */
    @c5e(21)
    public static class C6342a {
        private C6342a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Interpolator m11708a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static Interpolator m11709b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static Interpolator m11710c(Path path) {
            return new PathInterpolator(path);
        }
    }

    private gjc() {
    }

    @efb
    public static Interpolator create(@efb Path path) {
        return C6342a.m11710c(path);
    }

    @efb
    public static Interpolator create(float f, float f2) {
        return C6342a.m11708a(f, f2);
    }

    @efb
    public static Interpolator create(float f, float f2, float f3, float f4) {
        return C6342a.m11709b(f, f2, f3, f4);
    }
}
