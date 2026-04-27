package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class bfh {

    /* JADX INFO: renamed from: g */
    public static final int f13658g = 0;

    /* JADX INFO: renamed from: a */
    @gib
    public final lo5 f13659a;

    /* JADX INFO: renamed from: b */
    @gib
    public final qqf f13660b;

    /* JADX INFO: renamed from: c */
    @gib
    public final xt1 f13661c;

    /* JADX INFO: renamed from: d */
    @gib
    public final ome f13662d;

    /* JADX INFO: renamed from: e */
    public final boolean f13663e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final Map<dfh<?>, cfh> f13664f;

    public bfh() {
        this(null, null, null, null, false, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ bfh copy$default(bfh bfhVar, lo5 lo5Var, qqf qqfVar, xt1 xt1Var, ome omeVar, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            lo5Var = bfhVar.f13659a;
        }
        if ((i & 2) != 0) {
            qqfVar = bfhVar.f13660b;
        }
        qqf qqfVar2 = qqfVar;
        if ((i & 4) != 0) {
            xt1Var = bfhVar.f13661c;
        }
        xt1 xt1Var2 = xt1Var;
        if ((i & 8) != 0) {
            omeVar = bfhVar.f13662d;
        }
        ome omeVar2 = omeVar;
        if ((i & 16) != 0) {
            z = bfhVar.f13663e;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            map = bfhVar.f13664f;
        }
        return bfhVar.copy(lo5Var, qqfVar2, xt1Var2, omeVar2, z2, map);
    }

    @gib
    public final lo5 component1() {
        return this.f13659a;
    }

    @gib
    public final qqf component2() {
        return this.f13660b;
    }

    @gib
    public final xt1 component3() {
        return this.f13661c;
    }

    @gib
    public final ome component4() {
        return this.f13662d;
    }

    public final boolean component5() {
        return this.f13663e;
    }

    @yfb
    public final Map<dfh<?>, cfh> component6() {
        return this.f13664f;
    }

    @yfb
    public final bfh copy(@gib lo5 lo5Var, @gib qqf qqfVar, @gib xt1 xt1Var, @gib ome omeVar, boolean z, @yfb Map<dfh<?>, ? extends cfh> map) {
        return new bfh(lo5Var, qqfVar, xt1Var, omeVar, z, map);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfh)) {
            return false;
        }
        bfh bfhVar = (bfh) obj;
        return md8.areEqual(this.f13659a, bfhVar.f13659a) && md8.areEqual(this.f13660b, bfhVar.f13660b) && md8.areEqual(this.f13661c, bfhVar.f13661c) && md8.areEqual(this.f13662d, bfhVar.f13662d) && this.f13663e == bfhVar.f13663e && md8.areEqual(this.f13664f, bfhVar.f13664f);
    }

    @gib
    public final xt1 getChangeSize() {
        return this.f13661c;
    }

    @yfb
    public final Map<dfh<?>, cfh> getEffectsMap() {
        return this.f13664f;
    }

    @gib
    public final lo5 getFade() {
        return this.f13659a;
    }

    public final boolean getHold() {
        return this.f13663e;
    }

    @gib
    public final ome getScale() {
        return this.f13662d;
    }

    @gib
    public final qqf getSlide() {
        return this.f13660b;
    }

    public int hashCode() {
        lo5 lo5Var = this.f13659a;
        int iHashCode = (lo5Var == null ? 0 : lo5Var.hashCode()) * 31;
        qqf qqfVar = this.f13660b;
        int iHashCode2 = (iHashCode + (qqfVar == null ? 0 : qqfVar.hashCode())) * 31;
        xt1 xt1Var = this.f13661c;
        int iHashCode3 = (iHashCode2 + (xt1Var == null ? 0 : xt1Var.hashCode())) * 31;
        ome omeVar = this.f13662d;
        return ((((iHashCode3 + (omeVar != null ? omeVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f13663e)) * 31) + this.f13664f.hashCode();
    }

    @yfb
    public String toString() {
        return "TransitionData(fade=" + this.f13659a + ", slide=" + this.f13660b + ", changeSize=" + this.f13661c + ", scale=" + this.f13662d + ", hold=" + this.f13663e + ", effectsMap=" + this.f13664f + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bfh(@gib lo5 lo5Var, @gib qqf qqfVar, @gib xt1 xt1Var, @gib ome omeVar, boolean z, @yfb Map<dfh<?>, ? extends cfh> map) {
        this.f13659a = lo5Var;
        this.f13660b = qqfVar;
        this.f13661c = xt1Var;
        this.f13662d = omeVar;
        this.f13663e = z;
        this.f13664f = map;
    }

    public /* synthetic */ bfh(lo5 lo5Var, qqf qqfVar, xt1 xt1Var, ome omeVar, boolean z, Map map, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : lo5Var, (i & 2) != 0 ? null : qqfVar, (i & 4) != 0 ? null : xt1Var, (i & 8) == 0 ? omeVar : null, (i & 16) != 0 ? false : z, (i & 32) != 0 ? xt9.emptyMap() : map);
    }
}
