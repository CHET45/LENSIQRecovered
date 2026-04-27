package p000;

import androidx.compose.foundation.layout.AbstractC0635k;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class fce {

    /* JADX INFO: renamed from: e */
    public static final int f36143e = 8;

    /* JADX INFO: renamed from: a */
    public float f36144a;

    /* JADX INFO: renamed from: b */
    public boolean f36145b;

    /* JADX INFO: renamed from: c */
    @gib
    public AbstractC0635k f36146c;

    /* JADX INFO: renamed from: d */
    @gib
    public z76 f36147d;

    public fce() {
        this(0.0f, false, null, null, 15, null);
    }

    public static /* synthetic */ fce copy$default(fce fceVar, float f, boolean z, AbstractC0635k abstractC0635k, z76 z76Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fceVar.f36144a;
        }
        if ((i & 2) != 0) {
            z = fceVar.f36145b;
        }
        if ((i & 4) != 0) {
            abstractC0635k = fceVar.f36146c;
        }
        if ((i & 8) != 0) {
            z76Var = fceVar.f36147d;
        }
        return fceVar.copy(f, z, abstractC0635k, z76Var);
    }

    public final float component1() {
        return this.f36144a;
    }

    public final boolean component2() {
        return this.f36145b;
    }

    @gib
    public final AbstractC0635k component3() {
        return this.f36146c;
    }

    @gib
    public final z76 component4() {
        return this.f36147d;
    }

    @yfb
    public final fce copy(float f, boolean z, @gib AbstractC0635k abstractC0635k, @gib z76 z76Var) {
        return new fce(f, z, abstractC0635k, z76Var);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fce)) {
            return false;
        }
        fce fceVar = (fce) obj;
        return Float.compare(this.f36144a, fceVar.f36144a) == 0 && this.f36145b == fceVar.f36145b && md8.areEqual(this.f36146c, fceVar.f36146c) && md8.areEqual(this.f36147d, fceVar.f36147d);
    }

    @gib
    public final AbstractC0635k getCrossAxisAlignment() {
        return this.f36146c;
    }

    public final boolean getFill() {
        return this.f36145b;
    }

    @gib
    public final z76 getFlowLayoutData() {
        return this.f36147d;
    }

    public final float getWeight() {
        return this.f36144a;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f36144a) * 31) + Boolean.hashCode(this.f36145b)) * 31;
        AbstractC0635k abstractC0635k = this.f36146c;
        int iHashCode2 = (iHashCode + (abstractC0635k == null ? 0 : abstractC0635k.hashCode())) * 31;
        z76 z76Var = this.f36147d;
        return iHashCode2 + (z76Var != null ? z76Var.hashCode() : 0);
    }

    public final void setCrossAxisAlignment(@gib AbstractC0635k abstractC0635k) {
        this.f36146c = abstractC0635k;
    }

    public final void setFill(boolean z) {
        this.f36145b = z;
    }

    public final void setFlowLayoutData(@gib z76 z76Var) {
        this.f36147d = z76Var;
    }

    public final void setWeight(float f) {
        this.f36144a = f;
    }

    @yfb
    public String toString() {
        return "RowColumnParentData(weight=" + this.f36144a + ", fill=" + this.f36145b + ", crossAxisAlignment=" + this.f36146c + ", flowLayoutData=" + this.f36147d + ')';
    }

    public fce(float f, boolean z, @gib AbstractC0635k abstractC0635k, @gib z76 z76Var) {
        this.f36144a = f;
        this.f36145b = z;
        this.f36146c = abstractC0635k;
        this.f36147d = z76Var;
    }

    public /* synthetic */ fce(float f, boolean z, AbstractC0635k abstractC0635k, z76 z76Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : abstractC0635k, (i & 8) != 0 ? null : z76Var);
    }
}
