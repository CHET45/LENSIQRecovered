package p000;

/* JADX INFO: loaded from: classes.dex */
public class rqe extends gv4 {

    /* JADX INFO: renamed from: s */
    public static final boolean f79046s = false;

    /* JADX INFO: renamed from: p */
    public double f79047p;

    /* JADX INFO: renamed from: q */
    public double f79048q;

    /* JADX INFO: renamed from: r */
    public double f79049r;

    public rqe(String str) {
        this.f41450a = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f79047p = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        this.f79048q = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    private double dfunc(double d) {
        double d2 = this.f79048q;
        if (d < d2) {
            double d3 = this.f79047p;
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * ((d3 * (d2 - d)) + d));
        }
        double d4 = this.f79047p;
        return (((d2 - 1.0d) * d4) * (d2 - 1.0d)) / (((((-d4) * (d2 - d)) - d) + 1.0d) * ((((-d4) * (d2 - d)) - d) + 1.0d));
    }

    private double func(double d) {
        double d2 = this.f79048q;
        return d < d2 ? (d2 * d) / (d + (this.f79047p * (d2 - d))) : ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.f79047p * (d2 - d)));
    }

    @Override // p000.gv4
    public double get(double d) {
        return func(d);
    }

    @Override // p000.gv4
    public double getDiff(double d) {
        return dfunc(d);
    }
}
