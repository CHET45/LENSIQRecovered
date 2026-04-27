package p000;

import android.graphics.ColorFilter;

/* JADX INFO: loaded from: classes.dex */
@vw7
public class b92 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C1786a f13012b = new C1786a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final ColorFilter f13013a;

    /* JADX INFO: renamed from: b92$a */
    public static final class C1786a {
        public /* synthetic */ C1786a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ b92 m27964tintxETnrds$default(C1786a c1786a, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = q51.f73234b.m31926getSrcIn0nO6VwU();
            }
            return c1786a.m27967tintxETnrds(j, i);
        }

        @f0g
        @yfb
        /* JADX INFO: renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final b92 m27965colorMatrixjHGOpc(@yfb float[] fArr) {
            return new m92(fArr, (jt3) null);
        }

        @f0g
        @yfb
        /* JADX INFO: renamed from: lighting--OWjLjI, reason: not valid java name */
        public final b92 m27966lightingOWjLjI(long j, long j2) {
            return new q59(j, j2, (jt3) null);
        }

        @f0g
        @yfb
        /* JADX INFO: renamed from: tint-xETnrds, reason: not valid java name */
        public final b92 m27967tintxETnrds(long j, int i) {
            return new r51(j, i, (jt3) null);
        }

        private C1786a() {
        }
    }

    public b92(@yfb ColorFilter colorFilter) {
        this.f13013a = colorFilter;
    }

    @yfb
    public final ColorFilter getNativeColorFilter$ui_graphics_release() {
        return this.f13013a;
    }
}
