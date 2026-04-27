package p000;

import android.graphics.RectF;
import java.util.Arrays;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class n02 implements x03 {

    /* JADX INFO: renamed from: a */
    public final float f62880a;

    public n02(float f) {
        this.f62880a = f;
    }

    @efb
    public static n02 createFromCornerSize(@efb C12380s c12380s) {
        return new n02(c12380s.getCornerSize());
    }

    private static float getMaxCornerSize(@efb RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n02) && this.f62880a == ((n02) obj).f62880a;
    }

    @Override // p000.x03
    public float getCornerSize(@efb RectF rectF) {
        return Math.min(this.f62880a, getMaxCornerSize(rectF));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f62880a)});
    }
}
