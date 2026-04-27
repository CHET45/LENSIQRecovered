package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public abstract class s03 implements m8f {

    /* JADX INFO: renamed from: e */
    public static final int f80261e = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final y03 f80262a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final y03 f80263b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final y03 f80264c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final y03 f80265d;

    public s03(@yfb y03 y03Var, @yfb y03 y03Var2, @yfb y03 y03Var3, @yfb y03 y03Var4) {
        this.f80262a = y03Var;
        this.f80263b = y03Var2;
        this.f80264c = y03Var3;
        this.f80265d = y03Var4;
    }

    public static /* synthetic */ s03 copy$default(s03 s03Var, y03 y03Var, y03 y03Var2, y03 y03Var3, y03 y03Var4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            y03Var = s03Var.f80262a;
        }
        if ((i & 2) != 0) {
            y03Var2 = s03Var.f80263b;
        }
        if ((i & 4) != 0) {
            y03Var3 = s03Var.f80264c;
        }
        if ((i & 8) != 0) {
            y03Var4 = s03Var.f80265d;
        }
        return s03Var.copy(y03Var, y03Var2, y03Var3, y03Var4);
    }

    @yfb
    public final s03 copy(@yfb y03 y03Var) {
        return copy(y03Var, y03Var, y03Var, y03Var);
    }

    @yfb
    public abstract s03 copy(@yfb y03 y03Var, @yfb y03 y03Var2, @yfb y03 y03Var3, @yfb y03 y03Var4);

    @yfb
    /* JADX INFO: renamed from: createOutline-LjSzlW0 */
    public abstract n8c mo30509createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, @yfb ov8 ov8Var);

    @Override // p000.m8f
    @yfb
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final n8c mo27947createOutlinePq9zytI(long j, @yfb ov8 ov8Var, @yfb c64 c64Var) {
        float fMo29740toPxTmRCtEA = this.f80262a.mo29740toPxTmRCtEA(j, c64Var);
        float fMo29740toPxTmRCtEA2 = this.f80263b.mo29740toPxTmRCtEA(j, c64Var);
        float fMo29740toPxTmRCtEA3 = this.f80264c.mo29740toPxTmRCtEA(j, c64Var);
        float fMo29740toPxTmRCtEA4 = this.f80265d.mo29740toPxTmRCtEA(j, c64Var);
        float fM33068getMinDimensionimpl = wpf.m33068getMinDimensionimpl(j);
        float f = fMo29740toPxTmRCtEA + fMo29740toPxTmRCtEA4;
        if (f > fM33068getMinDimensionimpl) {
            float f2 = fM33068getMinDimensionimpl / f;
            fMo29740toPxTmRCtEA *= f2;
            fMo29740toPxTmRCtEA4 *= f2;
        }
        float f3 = fMo29740toPxTmRCtEA4;
        float f4 = fMo29740toPxTmRCtEA2 + fMo29740toPxTmRCtEA3;
        if (f4 > fM33068getMinDimensionimpl) {
            float f5 = fM33068getMinDimensionimpl / f4;
            fMo29740toPxTmRCtEA2 *= f5;
            fMo29740toPxTmRCtEA3 *= f5;
        }
        if (fMo29740toPxTmRCtEA >= 0.0f && fMo29740toPxTmRCtEA2 >= 0.0f && fMo29740toPxTmRCtEA3 >= 0.0f && f3 >= 0.0f) {
            return mo30509createOutlineLjSzlW0(j, fMo29740toPxTmRCtEA, fMo29740toPxTmRCtEA2, fMo29740toPxTmRCtEA3, f3, ov8Var);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fMo29740toPxTmRCtEA + ", topEnd = " + fMo29740toPxTmRCtEA2 + ", bottomEnd = " + fMo29740toPxTmRCtEA3 + ", bottomStart = " + f3 + ")!").toString());
    }

    @yfb
    public final y03 getBottomEnd() {
        return this.f80264c;
    }

    @yfb
    public final y03 getBottomStart() {
        return this.f80265d;
    }

    @yfb
    public final y03 getTopEnd() {
        return this.f80263b;
    }

    @yfb
    public final y03 getTopStart() {
        return this.f80262a;
    }
}
