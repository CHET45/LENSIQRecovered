package p000;

import java.util.HashMap;
import java.util.Map;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class z3h {

    /* JADX INFO: renamed from: a */
    public Map<Integer, Integer> f104025a = new HashMap();

    /* JADX INFO: renamed from: b */
    public double f104026b;

    /* JADX INFO: renamed from: c */
    public double f104027c;

    private z3h(double d, double d2) {
        this.f104026b = d;
        this.f104027c = d2;
    }

    public static final z3h fromHct(bi7 bi7Var) {
        return fromHueAndChroma(bi7Var.getHue(), bi7Var.getChroma());
    }

    public static final z3h fromHueAndChroma(double d, double d2) {
        return new z3h(d, d2);
    }

    public static final z3h fromInt(int i) {
        return fromHct(bi7.fromInt(i));
    }

    public double getChroma() {
        return this.f104027c;
    }

    public bi7 getHct(double d) {
        return bi7.from(this.f104026b, this.f104027c, d);
    }

    public double getHue() {
        return this.f104026b;
    }

    public int tone(int i) {
        Integer numValueOf = this.f104025a.get(Integer.valueOf(i));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(bi7.from(this.f104026b, this.f104027c, i).toInt());
            this.f104025a.put(Integer.valueOf(i), numValueOf);
        }
        return numValueOf.intValue();
    }
}
