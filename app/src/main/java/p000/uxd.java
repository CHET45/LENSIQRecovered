package p000;

import android.graphics.RectF;
import java.util.Arrays;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public final class uxd implements x03 {

    /* JADX INFO: renamed from: a */
    public final float f89421a;

    public uxd(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        this.f89421a = f;
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public static uxd createFromCornerSize(@efb RectF rectF, @efb x03 x03Var) {
        return x03Var instanceof uxd ? (uxd) x03Var : new uxd(x03Var.getCornerSize(rectF) / getMaxCornerSize(rectF));
    }

    private static float getMaxCornerSize(@efb RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxd) && this.f89421a == ((uxd) obj).f89421a;
    }

    @Override // p000.x03
    public float getCornerSize(@efb RectF rectF) {
        return this.f89421a * getMaxCornerSize(rectF);
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public float getRelativePercent() {
        return this.f89421a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f89421a)});
    }
}
