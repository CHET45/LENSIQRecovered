package p000;

/* JADX INFO: renamed from: yy */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C15879yy extends AbstractC16313zy {

    /* JADX INFO: renamed from: g */
    public static final int f103295g = 8;

    /* JADX INFO: renamed from: b */
    public float f103296b;

    /* JADX INFO: renamed from: c */
    public float f103297c;

    /* JADX INFO: renamed from: d */
    public float f103298d;

    /* JADX INFO: renamed from: e */
    public float f103299e;

    /* JADX INFO: renamed from: f */
    public final int f103300f;

    public C15879yy(float f, float f2, float f3, float f4) {
        super(null);
        this.f103296b = f;
        this.f103297c = f2;
        this.f103298d = f3;
        this.f103299e = f4;
        this.f103300f = 4;
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof C15879yy) {
            C15879yy c15879yy = (C15879yy) obj;
            if (c15879yy.f103296b == this.f103296b && c15879yy.f103297c == this.f103297c && c15879yy.f103298d == this.f103298d && c15879yy.f103299e == this.f103299e) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC16313zy
    public float get$animation_core_release(int i) {
        if (i == 0) {
            return this.f103296b;
        }
        if (i == 1) {
            return this.f103297c;
        }
        if (i == 2) {
            return this.f103298d;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f103299e;
    }

    @Override // p000.AbstractC16313zy
    public int getSize$animation_core_release() {
        return this.f103300f;
    }

    public final float getV1() {
        return this.f103296b;
    }

    public final float getV2() {
        return this.f103297c;
    }

    public final float getV3() {
        return this.f103298d;
    }

    public final float getV4() {
        return this.f103299e;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f103296b) * 31) + Float.hashCode(this.f103297c)) * 31) + Float.hashCode(this.f103298d)) * 31) + Float.hashCode(this.f103299e);
    }

    @Override // p000.AbstractC16313zy
    public void reset$animation_core_release() {
        this.f103296b = 0.0f;
        this.f103297c = 0.0f;
        this.f103298d = 0.0f;
        this.f103299e = 0.0f;
    }

    @Override // p000.AbstractC16313zy
    public void set$animation_core_release(int i, float f) {
        if (i == 0) {
            this.f103296b = f;
            return;
        }
        if (i == 1) {
            this.f103297c = f;
        } else if (i == 2) {
            this.f103298d = f;
        } else {
            if (i != 3) {
                return;
            }
            this.f103299e = f;
        }
    }

    public final void setV1$animation_core_release(float f) {
        this.f103296b = f;
    }

    public final void setV2$animation_core_release(float f) {
        this.f103297c = f;
    }

    public final void setV3$animation_core_release(float f) {
        this.f103298d = f;
    }

    public final void setV4$animation_core_release(float f) {
        this.f103299e = f;
    }

    @yfb
    public String toString() {
        return "AnimationVector4D: v1 = " + this.f103296b + ", v2 = " + this.f103297c + ", v3 = " + this.f103298d + ", v4 = " + this.f103299e;
    }

    @Override // p000.AbstractC16313zy
    @yfb
    public C15879yy newVector$animation_core_release() {
        return new C15879yy(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
