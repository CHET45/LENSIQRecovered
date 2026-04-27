package p000;

/* JADX INFO: renamed from: xy */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C15345xy extends AbstractC16313zy {

    /* JADX INFO: renamed from: f */
    public static final int f99644f = 8;

    /* JADX INFO: renamed from: b */
    public float f99645b;

    /* JADX INFO: renamed from: c */
    public float f99646c;

    /* JADX INFO: renamed from: d */
    public float f99647d;

    /* JADX INFO: renamed from: e */
    public final int f99648e;

    public C15345xy(float f, float f2, float f3) {
        super(null);
        this.f99645b = f;
        this.f99646c = f2;
        this.f99647d = f3;
        this.f99648e = 3;
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof C15345xy) {
            C15345xy c15345xy = (C15345xy) obj;
            if (c15345xy.f99645b == this.f99645b && c15345xy.f99646c == this.f99646c && c15345xy.f99647d == this.f99647d) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC16313zy
    public float get$animation_core_release(int i) {
        if (i == 0) {
            return this.f99645b;
        }
        if (i == 1) {
            return this.f99646c;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f99647d;
    }

    @Override // p000.AbstractC16313zy
    public int getSize$animation_core_release() {
        return this.f99648e;
    }

    public final float getV1() {
        return this.f99645b;
    }

    public final float getV2() {
        return this.f99646c;
    }

    public final float getV3() {
        return this.f99647d;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f99645b) * 31) + Float.hashCode(this.f99646c)) * 31) + Float.hashCode(this.f99647d);
    }

    @Override // p000.AbstractC16313zy
    public void reset$animation_core_release() {
        this.f99645b = 0.0f;
        this.f99646c = 0.0f;
        this.f99647d = 0.0f;
    }

    @Override // p000.AbstractC16313zy
    public void set$animation_core_release(int i, float f) {
        if (i == 0) {
            this.f99645b = f;
        } else if (i == 1) {
            this.f99646c = f;
        } else {
            if (i != 2) {
                return;
            }
            this.f99647d = f;
        }
    }

    public final void setV1$animation_core_release(float f) {
        this.f99645b = f;
    }

    public final void setV2$animation_core_release(float f) {
        this.f99646c = f;
    }

    public final void setV3$animation_core_release(float f) {
        this.f99647d = f;
    }

    @yfb
    public String toString() {
        return "AnimationVector3D: v1 = " + this.f99645b + ", v2 = " + this.f99646c + ", v3 = " + this.f99647d;
    }

    @Override // p000.AbstractC16313zy
    @yfb
    public C15345xy newVector$animation_core_release() {
        return new C15345xy(0.0f, 0.0f, 0.0f);
    }
}
