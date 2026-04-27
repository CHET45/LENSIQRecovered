package p000;

import android.graphics.Shader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class rod extends a8f {

    /* JADX INFO: renamed from: e */
    @yfb
    public final List<w82> f78869e;

    /* JADX INFO: renamed from: f */
    @gib
    public final List<Float> f78870f;

    /* JADX INFO: renamed from: g */
    public final long f78871g;

    /* JADX INFO: renamed from: h */
    public final float f78872h;

    /* JADX INFO: renamed from: i */
    public final int f78873i;

    public /* synthetic */ rod(List list, List list2, long j, float f, int i, jt3 jt3Var) {
        this(list, list2, j, f, i);
    }

    @Override // p000.a8f
    @yfb
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo27218createShaderuvyYCjk(long j) {
        float fM33069getWidthimpl;
        float fM33066getHeightimpl;
        if (mzb.m31102isUnspecifiedk4lQ0M(this.f78871g)) {
            long jM28834getCenteruvyYCjk = eqf.m28834getCenteruvyYCjk(j);
            fM33069getWidthimpl = izb.m30429getXimpl(jM28834getCenteruvyYCjk);
            fM33066getHeightimpl = izb.m30430getYimpl(jM28834getCenteruvyYCjk);
        } else {
            fM33069getWidthimpl = izb.m30429getXimpl(this.f78871g) == Float.POSITIVE_INFINITY ? wpf.m33069getWidthimpl(j) : izb.m30429getXimpl(this.f78871g);
            fM33066getHeightimpl = izb.m30430getYimpl(this.f78871g) == Float.POSITIVE_INFINITY ? wpf.m33066getHeightimpl(j) : izb.m30430getYimpl(this.f78871g);
        }
        List<w82> list = this.f78869e;
        List<Float> list2 = this.f78870f;
        long jOffset = mzb.Offset(fM33069getWidthimpl, fM33066getHeightimpl);
        float f = this.f78872h;
        return d8f.m28630RadialGradientShader8uybcMk(jOffset, f == Float.POSITIVE_INFINITY ? wpf.m33068getMinDimensionimpl(j) / 2 : f, list, list2, this.f78873i);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rod)) {
            return false;
        }
        rod rodVar = (rod) obj;
        return md8.areEqual(this.f78869e, rodVar.f78869e) && md8.areEqual(this.f78870f, rodVar.f78870f) && izb.m30426equalsimpl0(this.f78871g, rodVar.f78871g) && this.f78872h == rodVar.f78872h && tzg.m32472equalsimpl0(this.f78873i, rodVar.f78873i);
    }

    @Override // p000.he1
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo29991getIntrinsicSizeNHjbRc() {
        float f = this.f78872h;
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            return wpf.f95046b.m33077getUnspecifiedNHjbRc();
        }
        float f2 = this.f78872h;
        float f3 = 2;
        return eqf.Size(f2 * f3, f2 * f3);
    }

    public int hashCode() {
        int iHashCode = this.f78869e.hashCode() * 31;
        List<Float> list = this.f78870f;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + izb.m30431hashCodeimpl(this.f78871g)) * 31) + Float.hashCode(this.f78872h)) * 31) + tzg.m32473hashCodeimpl(this.f78873i);
    }

    @yfb
    public String toString() {
        String str;
        String str2 = "";
        if (mzb.m31100isSpecifiedk4lQ0M(this.f78871g)) {
            str = "center=" + ((Object) izb.m30437toStringimpl(this.f78871g)) + ", ";
        } else {
            str = "";
        }
        float f = this.f78872h;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            str2 = "radius=" + this.f78872h + ", ";
        }
        return "RadialGradient(colors=" + this.f78869e + ", stops=" + this.f78870f + ", " + str + str2 + "tileMode=" + ((Object) tzg.m32474toStringimpl(this.f78873i)) + ')';
    }

    public /* synthetic */ rod(List list, List list2, long j, float f, int i, int i2, jt3 jt3Var) {
        this(list, (i2 & 2) != 0 ? null : list2, j, f, (i2 & 16) != 0 ? tzg.f86446b.m32476getClamp3opZhB0() : i, null);
    }

    private rod(List<w82> list, List<Float> list2, long j, float f, int i) {
        this.f78869e = list;
        this.f78870f = list2;
        this.f78871g = j;
        this.f78872h = f;
        this.f78873i = i;
    }
}
