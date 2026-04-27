package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,113:1\n35#1,2:114\n66#1,3:116\n40#1,3:119\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n46#1:114,2\n50#1:116,3\n50#1:119,3\n*E\n"})
@e0g(parameters = 0)
public final class ui2 {

    /* JADX INFO: renamed from: c */
    public static final int f88036c = 8;

    /* JADX INFO: renamed from: a */
    public double f88037a;

    /* JADX INFO: renamed from: b */
    public double f88038b;

    public ui2(double d, double d2) {
        this.f88037a = d;
        this.f88038b = d2;
    }

    private final double component1() {
        return this.f88037a;
    }

    private final double component2() {
        return this.f88038b;
    }

    public static /* synthetic */ ui2 copy$default(ui2 ui2Var, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = ui2Var.f88037a;
        }
        if ((i & 2) != 0) {
            d2 = ui2Var.f88038b;
        }
        return ui2Var.copy(d, d2);
    }

    @yfb
    public final ui2 copy(double d, double d2) {
        return new ui2(d, d2);
    }

    @yfb
    public final ui2 div(double d) {
        this.f88037a /= d;
        this.f88038b /= d;
        return this;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui2)) {
            return false;
        }
        ui2 ui2Var = (ui2) obj;
        return Double.compare(this.f88037a, ui2Var.f88037a) == 0 && Double.compare(this.f88038b, ui2Var.f88038b) == 0;
    }

    public final double getImaginary() {
        return this.f88038b;
    }

    public final double getReal() {
        return this.f88037a;
    }

    public int hashCode() {
        return (Double.hashCode(this.f88037a) * 31) + Double.hashCode(this.f88038b);
    }

    @yfb
    public final ui2 minus(double d) {
        this.f88037a += -d;
        return this;
    }

    @yfb
    public final ui2 plus(double d) {
        this.f88037a += d;
        return this;
    }

    @yfb
    public final ui2 times(double d) {
        this.f88037a *= d;
        this.f88038b *= d;
        return this;
    }

    @yfb
    public String toString() {
        return "ComplexDouble(_real=" + this.f88037a + ", _imaginary=" + this.f88038b + ')';
    }

    @yfb
    public final ui2 unaryMinus() {
        double d = -1;
        this.f88037a *= d;
        this.f88038b *= d;
        return this;
    }

    @yfb
    public final ui2 minus(@yfb ui2 ui2Var) {
        double d = -1;
        ui2Var.f88037a *= d;
        ui2Var.f88038b *= d;
        this.f88037a += ui2Var.getReal();
        this.f88038b += ui2Var.getImaginary();
        return this;
    }

    @yfb
    public final ui2 plus(@yfb ui2 ui2Var) {
        this.f88037a += ui2Var.getReal();
        this.f88038b += ui2Var.getImaginary();
        return this;
    }

    @yfb
    public final ui2 times(@yfb ui2 ui2Var) {
        this.f88037a = (getReal() * ui2Var.getReal()) - (getImaginary() * ui2Var.getImaginary());
        this.f88038b = (getReal() * ui2Var.getImaginary()) + (ui2Var.getReal() * getImaginary());
        return this;
    }
}
