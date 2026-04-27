package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class hkc {

    /* JADX INFO: renamed from: hkc$a */
    @c5e(26)
    public static class C6880a {
        private C6880a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static float[] m12449a(Path path, float f) {
            return path.approximate(f);
        }
    }

    private hkc() {
    }

    @c5e(26)
    @efb
    public static Collection<ckc> flatten(@efb Path path) {
        return flatten(path, 0.5f);
    }

    @c5e(26)
    @efb
    public static Collection<ckc> flatten(@efb Path path, @y46(from = 0.0d) float f) {
        float[] fArrM12449a = C6880a.m12449a(path, f);
        int length = fArrM12449a.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 1; i < length; i++) {
            int i2 = i * 3;
            int i3 = (i - 1) * 3;
            float f2 = fArrM12449a[i2];
            float f3 = fArrM12449a[i2 + 1];
            float f4 = fArrM12449a[i2 + 2];
            float f5 = fArrM12449a[i3];
            float f6 = fArrM12449a[i3 + 1];
            float f7 = fArrM12449a[i3 + 2];
            if (f2 != f5 && (f3 != f6 || f4 != f7)) {
                arrayList.add(new ckc(new PointF(f6, f7), f5, new PointF(f3, f4), f2));
            }
        }
        return arrayList;
    }
}
