package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rdh {

    /* JADX INFO: renamed from: a */
    public final double f77957a;

    /* JADX INFO: renamed from: b */
    public final double f77958b;

    /* JADX INFO: renamed from: c */
    public final double f77959c;

    /* JADX INFO: renamed from: d */
    public final double f77960d;

    /* JADX INFO: renamed from: e */
    public final double f77961e;

    /* JADX INFO: renamed from: f */
    public final double f77962f;

    /* JADX INFO: renamed from: g */
    public final double f77963g;

    public rdh(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f77957a = d;
        this.f77958b = d2;
        this.f77959c = d3;
        this.f77960d = d4;
        this.f77961e = d5;
        this.f77962f = d6;
        this.f77963g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < 0.0d || d < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double component1() {
        return this.f77957a;
    }

    public final double component2() {
        return this.f77958b;
    }

    public final double component3() {
        return this.f77959c;
    }

    public final double component4() {
        return this.f77960d;
    }

    public final double component5() {
        return this.f77961e;
    }

    public final double component6() {
        return this.f77962f;
    }

    public final double component7() {
        return this.f77963g;
    }

    @yfb
    public final rdh copy(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        return new rdh(d, d2, d3, d4, d5, d6, d7);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdh)) {
            return false;
        }
        rdh rdhVar = (rdh) obj;
        return Double.compare(this.f77957a, rdhVar.f77957a) == 0 && Double.compare(this.f77958b, rdhVar.f77958b) == 0 && Double.compare(this.f77959c, rdhVar.f77959c) == 0 && Double.compare(this.f77960d, rdhVar.f77960d) == 0 && Double.compare(this.f77961e, rdhVar.f77961e) == 0 && Double.compare(this.f77962f, rdhVar.f77962f) == 0 && Double.compare(this.f77963g, rdhVar.f77963g) == 0;
    }

    public final double getA() {
        return this.f77958b;
    }

    public final double getB() {
        return this.f77959c;
    }

    public final double getC() {
        return this.f77960d;
    }

    public final double getD() {
        return this.f77961e;
    }

    public final double getE() {
        return this.f77962f;
    }

    public final double getF() {
        return this.f77963g;
    }

    public final double getGamma() {
        return this.f77957a;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f77957a) * 31) + Double.hashCode(this.f77958b)) * 31) + Double.hashCode(this.f77959c)) * 31) + Double.hashCode(this.f77960d)) * 31) + Double.hashCode(this.f77961e)) * 31) + Double.hashCode(this.f77962f)) * 31) + Double.hashCode(this.f77963g);
    }

    @yfb
    public String toString() {
        return "TransferParameters(gamma=" + this.f77957a + ", a=" + this.f77958b + ", b=" + this.f77959c + ", c=" + this.f77960d + ", d=" + this.f77961e + ", e=" + this.f77962f + ", f=" + this.f77963g + ')';
    }

    public /* synthetic */ rdh(double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, jt3 jt3Var) {
        this(d, d2, d3, d4, d5, (i & 32) != 0 ? 0.0d : d6, (i & 64) != 0 ? 0.0d : d7);
    }
}
