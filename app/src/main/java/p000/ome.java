package p000;

import androidx.compose.p002ui.graphics.C0739f;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class ome {

    /* JADX INFO: renamed from: d */
    public static final int f68151d = 0;

    /* JADX INFO: renamed from: a */
    public final float f68152a;

    /* JADX INFO: renamed from: b */
    public final long f68153b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final fw5<Float> f68154c;

    public /* synthetic */ ome(float f, long j, fw5 fw5Var, jt3 jt3Var) {
        this(f, j, fw5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-bnNdC4k$default, reason: not valid java name */
    public static /* synthetic */ ome m31492copybnNdC4k$default(ome omeVar, float f, long j, fw5 fw5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = omeVar.f68152a;
        }
        if ((i & 2) != 0) {
            j = omeVar.f68153b;
        }
        if ((i & 4) != 0) {
            fw5Var = omeVar.f68154c;
        }
        return omeVar.m31494copybnNdC4k(f, j, fw5Var);
    }

    public final float component1() {
        return this.f68152a;
    }

    /* JADX INFO: renamed from: component2-SzJe1aQ, reason: not valid java name */
    public final long m31493component2SzJe1aQ() {
        return this.f68153b;
    }

    @yfb
    public final fw5<Float> component3() {
        return this.f68154c;
    }

    @yfb
    /* JADX INFO: renamed from: copy-bnNdC4k, reason: not valid java name */
    public final ome m31494copybnNdC4k(float f, long j, @yfb fw5<Float> fw5Var) {
        return new ome(f, j, fw5Var, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ome)) {
            return false;
        }
        ome omeVar = (ome) obj;
        return Float.compare(this.f68152a, omeVar.f68152a) == 0 && C0739f.m27660equalsimpl0(this.f68153b, omeVar.f68153b) && md8.areEqual(this.f68154c, omeVar.f68154c);
    }

    @yfb
    public final fw5<Float> getAnimationSpec() {
        return this.f68154c;
    }

    public final float getScale() {
        return this.f68152a;
    }

    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m31495getTransformOriginSzJe1aQ() {
        return this.f68153b;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f68152a) * 31) + C0739f.m27663hashCodeimpl(this.f68153b)) * 31) + this.f68154c.hashCode();
    }

    @yfb
    public String toString() {
        return "Scale(scale=" + this.f68152a + ", transformOrigin=" + ((Object) C0739f.m27664toStringimpl(this.f68153b)) + ", animationSpec=" + this.f68154c + ')';
    }

    private ome(float f, long j, fw5<Float> fw5Var) {
        this.f68152a = f;
        this.f68153b = j;
        this.f68154c = fw5Var;
    }
}
