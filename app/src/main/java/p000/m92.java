package p000;

import android.graphics.ColorFilter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class m92 extends b92 {

    /* JADX INFO: renamed from: c */
    @gib
    public float[] f60235c;

    public /* synthetic */ m92(float[] fArr, jt3 jt3Var) {
        this(fArr);
    }

    /* JADX INFO: renamed from: copyColorMatrix-gBh15pI$default, reason: not valid java name */
    public static /* synthetic */ float[] m30969copyColorMatrixgBh15pI$default(m92 m92Var, float[] fArr, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = l92.m30833constructorimpl$default(null, 1, null);
        }
        return m92Var.m30971copyColorMatrixgBh15pI(fArr);
    }

    /* JADX INFO: renamed from: obtainColorMatrix-p10-uLo, reason: not valid java name */
    private final float[] m30970obtainColorMatrixp10uLo() {
        float[] fArr = this.f60235c;
        if (fArr != null) {
            return fArr;
        }
        float[] fArrActualColorMatrixFromFilter = C8936lq.actualColorMatrixFromFilter(getNativeColorFilter$ui_graphics_release());
        this.f60235c = fArrActualColorMatrixFromFilter;
        return fArrActualColorMatrixFromFilter;
    }

    @yfb
    /* JADX INFO: renamed from: copyColorMatrix-gBh15pI, reason: not valid java name */
    public final float[] m30971copyColorMatrixgBh15pI(@yfb float[] fArr) {
        u70.copyInto$default(m30970obtainColorMatrixp10uLo(), fArr, 0, 0, 0, 14, (Object) null);
        return fArr;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m92) && Arrays.equals(m30970obtainColorMatrixp10uLo(), ((m92) obj).m30970obtainColorMatrixp10uLo());
    }

    public int hashCode() {
        float[] fArr = this.f60235c;
        if (fArr != null) {
            return l92.m30840hashCodeimpl(fArr);
        }
        return 0;
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f60235c;
        sb.append((Object) (fArr == null ? "null" : l92.m30851toStringimpl(fArr)));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ m92(float[] fArr, ColorFilter colorFilter, jt3 jt3Var) {
        this(fArr, colorFilter);
    }

    private m92(float[] fArr, ColorFilter colorFilter) {
        super(colorFilter);
        this.f60235c = fArr;
    }

    private m92(float[] fArr) {
        this(fArr, C8936lq.m30884actualColorMatrixColorFilterjHGOpc(fArr), null);
    }
}
