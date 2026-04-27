package p000;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class ckc {

    /* JADX INFO: renamed from: a */
    public final PointF f16826a;

    /* JADX INFO: renamed from: b */
    public final float f16827b;

    /* JADX INFO: renamed from: c */
    public final PointF f16828c;

    /* JADX INFO: renamed from: d */
    public final float f16829d;

    public ckc(@efb PointF pointF, float f, @efb PointF pointF2, float f2) {
        this.f16826a = (PointF) z7d.checkNotNull(pointF, "start == null");
        this.f16827b = f;
        this.f16828c = (PointF) z7d.checkNotNull(pointF2, "end == null");
        this.f16829d = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckc)) {
            return false;
        }
        ckc ckcVar = (ckc) obj;
        return Float.compare(this.f16827b, ckcVar.f16827b) == 0 && Float.compare(this.f16829d, ckcVar.f16829d) == 0 && this.f16826a.equals(ckcVar.f16826a) && this.f16828c.equals(ckcVar.f16828c);
    }

    @efb
    public PointF getEnd() {
        return this.f16828c;
    }

    public float getEndFraction() {
        return this.f16829d;
    }

    @efb
    public PointF getStart() {
        return this.f16826a;
    }

    public float getStartFraction() {
        return this.f16827b;
    }

    public int hashCode() {
        int iHashCode = this.f16826a.hashCode() * 31;
        float f = this.f16827b;
        int iFloatToIntBits = (((iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f16828c.hashCode()) * 31;
        float f2 = this.f16829d;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    public String toString() {
        return "PathSegment{start=" + this.f16826a + ", startFraction=" + this.f16827b + ", end=" + this.f16828c + ", endFraction=" + this.f16829d + '}';
    }
}
