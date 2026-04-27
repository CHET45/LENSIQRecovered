package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class bi7 {

    /* JADX INFO: renamed from: a */
    public double f13793a;

    /* JADX INFO: renamed from: b */
    public double f13794b;

    /* JADX INFO: renamed from: c */
    public double f13795c;

    /* JADX INFO: renamed from: d */
    public int f13796d;

    private bi7(int i) {
        setInternalState(i);
    }

    public static bi7 from(double d, double d2, double d3) {
        return new bi7(ci7.solveToInt(d, d2, d3));
    }

    public static bi7 fromInt(int i) {
        return new bi7(i);
    }

    private void setInternalState(int i) {
        this.f13796d = i;
        xo1 xo1VarFromInt = xo1.fromInt(i);
        this.f13793a = xo1VarFromInt.getHue();
        this.f13794b = xo1VarFromInt.getChroma();
        this.f13795c = xa2.lstarFromArgb(i);
    }

    public double getChroma() {
        return this.f13794b;
    }

    public double getHue() {
        return this.f13793a;
    }

    public double getTone() {
        return this.f13795c;
    }

    public bi7 inViewingConditions(sci sciVar) {
        double[] dArrM25356f = xo1.fromInt(toInt()).m25356f(sciVar, null);
        xo1 xo1VarM25353d = xo1.m25353d(dArrM25356f[0], dArrM25356f[1], dArrM25356f[2], sci.f81232k);
        return from(xo1VarM25353d.getHue(), xo1VarM25353d.getChroma(), xa2.lstarFromY(dArrM25356f[1]));
    }

    public void setChroma(double d) {
        setInternalState(ci7.solveToInt(this.f13793a, d, this.f13795c));
    }

    public void setHue(double d) {
        setInternalState(ci7.solveToInt(d, this.f13794b, this.f13795c));
    }

    public void setTone(double d) {
        setInternalState(ci7.solveToInt(this.f13793a, this.f13794b, d));
    }

    public int toInt() {
        return this.f13796d;
    }
}
