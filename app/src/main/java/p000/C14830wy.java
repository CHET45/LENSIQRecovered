package p000;

/* JADX INFO: renamed from: wy */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C14830wy extends AbstractC16313zy {

    /* JADX INFO: renamed from: e */
    public static final int f95693e = 8;

    /* JADX INFO: renamed from: b */
    public float f95694b;

    /* JADX INFO: renamed from: c */
    public float f95695c;

    /* JADX INFO: renamed from: d */
    public final int f95696d;

    public C14830wy(float f, float f2) {
        super(null);
        this.f95694b = f;
        this.f95695c = f2;
        this.f95696d = 2;
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof C14830wy) {
            C14830wy c14830wy = (C14830wy) obj;
            if (c14830wy.f95694b == this.f95694b && c14830wy.f95695c == this.f95695c) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC16313zy
    public float get$animation_core_release(int i) {
        if (i == 0) {
            return this.f95694b;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f95695c;
    }

    @Override // p000.AbstractC16313zy
    public int getSize$animation_core_release() {
        return this.f95696d;
    }

    public final float getV1() {
        return this.f95694b;
    }

    public final float getV2() {
        return this.f95695c;
    }

    public int hashCode() {
        return (Float.hashCode(this.f95694b) * 31) + Float.hashCode(this.f95695c);
    }

    @Override // p000.AbstractC16313zy
    public void reset$animation_core_release() {
        this.f95694b = 0.0f;
        this.f95695c = 0.0f;
    }

    @Override // p000.AbstractC16313zy
    public void set$animation_core_release(int i, float f) {
        if (i == 0) {
            this.f95694b = f;
        } else {
            if (i != 1) {
                return;
            }
            this.f95695c = f;
        }
    }

    public final void setV1$animation_core_release(float f) {
        this.f95694b = f;
    }

    public final void setV2$animation_core_release(float f) {
        this.f95695c = f;
    }

    @yfb
    public String toString() {
        return "AnimationVector2D: v1 = " + this.f95694b + ", v2 = " + this.f95695c;
    }

    @Override // p000.AbstractC16313zy
    @yfb
    public C14830wy newVector$animation_core_release() {
        return new C14830wy(0.0f, 0.0f);
    }
}
