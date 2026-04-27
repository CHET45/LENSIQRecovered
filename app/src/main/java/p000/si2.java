package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class si2 {

    /* JADX INFO: renamed from: a */
    public final double f81910a;

    /* JADX INFO: renamed from: b */
    public final double f81911b;

    public si2(double d, double d2) {
        this.f81910a = d;
        this.f81911b = d2;
    }

    public si2 conjugate() {
        return new si2(this.f81910a, -this.f81911b);
    }

    public si2 cos() {
        return new si2(Math.cos(this.f81910a) * Math.cosh(this.f81911b), (-Math.sin(this.f81910a)) * Math.sinh(this.f81911b));
    }

    public si2 divides(si2 si2Var) {
        return times(si2Var.reciprocal());
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        si2 si2Var = (si2) obj;
        return this.f81910a == si2Var.f81910a && this.f81911b == si2Var.f81911b;
    }

    public si2 exp() {
        return new si2(Math.exp(this.f81910a) * Math.cos(this.f81911b), Math.exp(this.f81910a) * Math.sin(this.f81911b));
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f81910a), Double.valueOf(this.f81911b));
    }

    public double hypot() {
        return Math.hypot(this.f81910a, this.f81911b);
    }

    /* JADX INFO: renamed from: im */
    public double m22014im() {
        return this.f81911b;
    }

    public si2 minus(si2 si2Var) {
        return new si2(this.f81910a - si2Var.f81910a, this.f81911b - si2Var.f81911b);
    }

    public double phase() {
        return Math.atan2(this.f81911b, this.f81910a);
    }

    public si2 plus(si2 si2Var) {
        return new si2(this.f81910a + si2Var.f81910a, this.f81911b + si2Var.f81911b);
    }

    /* JADX INFO: renamed from: re */
    public double m22015re() {
        return this.f81910a;
    }

    public si2 reciprocal() {
        double d = this.f81910a;
        double d2 = this.f81911b;
        double d3 = (d * d) + (d2 * d2);
        return new si2(d / d3, (-d2) / d3);
    }

    public si2 scale(double d) {
        return new si2(this.f81910a * d, d * this.f81911b);
    }

    public si2 sin() {
        return new si2(Math.sin(this.f81910a) * Math.cosh(this.f81911b), Math.cos(this.f81910a) * Math.sinh(this.f81911b));
    }

    public si2 tan() {
        return sin().divides(cos());
    }

    public si2 times(si2 si2Var) {
        double d = this.f81910a;
        double d2 = si2Var.f81910a;
        double d3 = this.f81911b;
        double d4 = si2Var.f81911b;
        return new si2((d * d2) - (d3 * d4), (d * d4) + (d3 * d2));
    }

    public String toString() {
        return String.format("hypot: %s, complex: %s+%si", Double.valueOf(hypot()), Double.valueOf(this.f81910a), Double.valueOf(this.f81911b));
    }

    public static si2 plus(si2 si2Var, si2 si2Var2) {
        return new si2(si2Var.f81910a + si2Var2.f81910a, si2Var.f81911b + si2Var2.f81911b);
    }
}
