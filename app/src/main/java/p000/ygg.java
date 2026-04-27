package p000;

import android.graphics.Shader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class ygg extends a8f {

    /* JADX INFO: renamed from: e */
    public final long f101448e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final List<w82> f101449f;

    /* JADX INFO: renamed from: g */
    @gib
    public final List<Float> f101450g;

    public /* synthetic */ ygg(long j, List list, List list2, jt3 jt3Var) {
        this(j, list, list2);
    }

    @Override // p000.a8f
    @yfb
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo27218createShaderuvyYCjk(long j) {
        long jOffset;
        if (mzb.m31102isUnspecifiedk4lQ0M(this.f101448e)) {
            jOffset = eqf.m28834getCenteruvyYCjk(j);
        } else {
            jOffset = mzb.Offset(izb.m30429getXimpl(this.f101448e) == Float.POSITIVE_INFINITY ? wpf.m33069getWidthimpl(j) : izb.m30429getXimpl(this.f101448e), izb.m30430getYimpl(this.f101448e) == Float.POSITIVE_INFINITY ? wpf.m33066getHeightimpl(j) : izb.m30430getYimpl(this.f101448e));
        }
        return d8f.m28632SweepGradientShader9KIMszo(jOffset, this.f101449f, this.f101450g);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygg)) {
            return false;
        }
        ygg yggVar = (ygg) obj;
        return izb.m30426equalsimpl0(this.f101448e, yggVar.f101448e) && md8.areEqual(this.f101449f, yggVar.f101449f) && md8.areEqual(this.f101450g, yggVar.f101450g);
    }

    public int hashCode() {
        int iM30431hashCodeimpl = ((izb.m30431hashCodeimpl(this.f101448e) * 31) + this.f101449f.hashCode()) * 31;
        List<Float> list = this.f101450g;
        return iM30431hashCodeimpl + (list != null ? list.hashCode() : 0);
    }

    @yfb
    public String toString() {
        String str;
        if (mzb.m31100isSpecifiedk4lQ0M(this.f101448e)) {
            str = "center=" + ((Object) izb.m30437toStringimpl(this.f101448e)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.f101449f + ", stops=" + this.f101450g + ')';
    }

    public /* synthetic */ ygg(long j, List list, List list2, int i, jt3 jt3Var) {
        this(j, list, (i & 4) != 0 ? null : list2, null);
    }

    private ygg(long j, List<w82> list, List<Float> list2) {
        this.f101448e = j;
        this.f101449f = list;
        this.f101450g = list2;
    }
}
