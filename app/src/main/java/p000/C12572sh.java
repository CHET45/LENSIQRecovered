package p000;

import android.graphics.RectF;
import java.util.Arrays;
import p000.p7e;

/* JADX INFO: renamed from: sh */
/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class C12572sh implements x03 {

    /* JADX INFO: renamed from: a */
    public final x03 f81747a;

    /* JADX INFO: renamed from: b */
    public final float f81748b;

    public C12572sh(float f, @efb x03 x03Var) {
        while (x03Var instanceof C12572sh) {
            x03Var = ((C12572sh) x03Var).f81747a;
            f += ((C12572sh) x03Var).f81748b;
        }
        this.f81747a = x03Var;
        this.f81748b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12572sh)) {
            return false;
        }
        C12572sh c12572sh = (C12572sh) obj;
        return this.f81747a.equals(c12572sh.f81747a) && this.f81748b == c12572sh.f81748b;
    }

    @Override // p000.x03
    public float getCornerSize(@efb RectF rectF) {
        return Math.max(0.0f, this.f81747a.getCornerSize(rectF) + this.f81748b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81747a, Float.valueOf(this.f81748b)});
    }
}
