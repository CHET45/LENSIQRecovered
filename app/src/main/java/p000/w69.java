package p000;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@ay4
public abstract class w69 {

    /* JADX INFO: renamed from: w69$b */
    public static final class C14439b {

        /* JADX INFO: renamed from: a */
        public final double f93411a;

        /* JADX INFO: renamed from: b */
        public final double f93412b;

        public w69 and(double x2, double y2) {
            v7d.checkArgument(ik4.m13152d(x2) && ik4.m13152d(y2));
            double d = this.f93411a;
            if (x2 != d) {
                return withSlope((y2 - this.f93412b) / (x2 - d));
            }
            v7d.checkArgument(y2 != this.f93412b);
            return new C14442e(this.f93411a);
        }

        public w69 withSlope(double slope) {
            v7d.checkArgument(!Double.isNaN(slope));
            return ik4.m13152d(slope) ? new C14441d(slope, this.f93412b - (this.f93411a * slope)) : new C14442e(this.f93411a);
        }

        private C14439b(double x1, double y1) {
            this.f93411a = x1;
            this.f93412b = y1;
        }
    }

    /* JADX INFO: renamed from: w69$c */
    public static final class C14440c extends w69 {

        /* JADX INFO: renamed from: a */
        public static final C14440c f93413a = new C14440c();

        private C14440c() {
        }

        @Override // p000.w69
        public w69 inverse() {
            return this;
        }

        @Override // p000.w69
        public boolean isHorizontal() {
            return false;
        }

        @Override // p000.w69
        public boolean isVertical() {
            return false;
        }

        @Override // p000.w69
        public double slope() {
            return Double.NaN;
        }

        public String toString() {
            return "NaN";
        }

        @Override // p000.w69
        public double transform(double x) {
            return Double.NaN;
        }
    }

    public static w69 forNaN() {
        return C14440c.f93413a;
    }

    public static w69 horizontal(double y) {
        v7d.checkArgument(ik4.m13152d(y));
        return new C14441d(0.0d, y);
    }

    public static C14439b mapping(double x1, double y1) {
        v7d.checkArgument(ik4.m13152d(x1) && ik4.m13152d(y1));
        return new C14439b(x1, y1);
    }

    public static w69 vertical(double x) {
        v7d.checkArgument(ik4.m13152d(x));
        return new C14442e(x);
    }

    public abstract w69 inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double x);

    /* JADX INFO: renamed from: w69$e */
    public static final class C14442e extends w69 {

        /* JADX INFO: renamed from: a */
        public final double f93417a;

        /* JADX INFO: renamed from: b */
        @wx1
        @ez8
        public w69 f93418b;

        public C14442e(double x) {
            this.f93417a = x;
            this.f93418b = null;
        }

        private w69 createInverse() {
            return new C14441d(0.0d, this.f93417a, this);
        }

        @Override // p000.w69
        public w69 inverse() {
            w69 w69Var = this.f93418b;
            if (w69Var != null) {
                return w69Var;
            }
            w69 w69VarCreateInverse = createInverse();
            this.f93418b = w69VarCreateInverse;
            return w69VarCreateInverse;
        }

        @Override // p000.w69
        public boolean isHorizontal() {
            return false;
        }

        @Override // p000.w69
        public boolean isVertical() {
            return true;
        }

        @Override // p000.w69
        public double slope() {
            throw new IllegalStateException();
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f93417a));
        }

        @Override // p000.w69
        public double transform(double x) {
            throw new IllegalStateException();
        }

        public C14442e(double x, w69 inverse) {
            this.f93417a = x;
            this.f93418b = inverse;
        }
    }

    /* JADX INFO: renamed from: w69$d */
    public static final class C14441d extends w69 {

        /* JADX INFO: renamed from: a */
        public final double f93414a;

        /* JADX INFO: renamed from: b */
        public final double f93415b;

        /* JADX INFO: renamed from: c */
        @wx1
        @ez8
        public w69 f93416c;

        public C14441d(double slope, double yIntercept) {
            this.f93414a = slope;
            this.f93415b = yIntercept;
            this.f93416c = null;
        }

        private w69 createInverse() {
            double d = this.f93414a;
            return d != 0.0d ? new C14441d(1.0d / d, (this.f93415b * (-1.0d)) / d, this) : new C14442e(this.f93415b, this);
        }

        @Override // p000.w69
        public w69 inverse() {
            w69 w69Var = this.f93416c;
            if (w69Var != null) {
                return w69Var;
            }
            w69 w69VarCreateInverse = createInverse();
            this.f93416c = w69VarCreateInverse;
            return w69VarCreateInverse;
        }

        @Override // p000.w69
        public boolean isHorizontal() {
            return this.f93414a == 0.0d;
        }

        @Override // p000.w69
        public boolean isVertical() {
            return false;
        }

        @Override // p000.w69
        public double slope() {
            return this.f93414a;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.f93414a), Double.valueOf(this.f93415b));
        }

        @Override // p000.w69
        public double transform(double x) {
            return (x * this.f93414a) + this.f93415b;
        }

        public C14441d(double slope, double yIntercept, w69 inverse) {
            this.f93414a = slope;
            this.f93415b = yIntercept;
            this.f93416c = inverse;
        }
    }
}
