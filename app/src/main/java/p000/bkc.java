package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bkc {

    /* JADX INFO: renamed from: a */
    @yfb
    public final EnumC1929a f13954a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final float[] f13955b;

    /* JADX INFO: renamed from: c */
    public final float f13956c;

    /* JADX INFO: renamed from: bkc$a */
    public enum EnumC1929a {
        Move,
        Line,
        Quadratic,
        Conic,
        Cubic,
        Close,
        Done
    }

    public bkc(@yfb EnumC1929a enumC1929a, @yfb float[] fArr, float f) {
        this.f13954a = enumC1929a;
        this.f13955b = fArr;
        this.f13956c = f;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bkc.class == obj.getClass()) {
            bkc bkcVar = (bkc) obj;
            if (this.f13954a == bkcVar.f13954a && Arrays.equals(this.f13955b, bkcVar.f13955b) && this.f13956c == bkcVar.f13956c) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public final float[] getPoints() {
        return this.f13955b;
    }

    @yfb
    public final EnumC1929a getType() {
        return this.f13954a;
    }

    public final float getWeight() {
        return this.f13956c;
    }

    public int hashCode() {
        return (((this.f13954a.hashCode() * 31) + Arrays.hashCode(this.f13955b)) * 31) + Float.hashCode(this.f13956c);
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PathSegment(type=");
        sb.append(this.f13954a);
        sb.append(", points=");
        String string = Arrays.toString(this.f13955b);
        md8.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        sb.append(", weight=");
        sb.append(this.f13956c);
        sb.append(')');
        return sb.toString();
    }
}
