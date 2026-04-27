package p000;

/* JADX INFO: renamed from: vy */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C14294vy extends AbstractC16313zy {

    /* JADX INFO: renamed from: d */
    public static final int f92647d = 8;

    /* JADX INFO: renamed from: b */
    public float f92648b;

    /* JADX INFO: renamed from: c */
    public final int f92649c;

    public C14294vy(float f) {
        super(null);
        this.f92648b = f;
        this.f92649c = 1;
    }

    public boolean equals(@gib Object obj) {
        return (obj instanceof C14294vy) && ((C14294vy) obj).f92648b == this.f92648b;
    }

    @Override // p000.AbstractC16313zy
    public float get$animation_core_release(int i) {
        if (i == 0) {
            return this.f92648b;
        }
        return 0.0f;
    }

    @Override // p000.AbstractC16313zy
    public int getSize$animation_core_release() {
        return this.f92649c;
    }

    public final float getValue() {
        return this.f92648b;
    }

    public int hashCode() {
        return Float.hashCode(this.f92648b);
    }

    @Override // p000.AbstractC16313zy
    public void reset$animation_core_release() {
        this.f92648b = 0.0f;
    }

    @Override // p000.AbstractC16313zy
    public void set$animation_core_release(int i, float f) {
        if (i == 0) {
            this.f92648b = f;
        }
    }

    public final void setValue$animation_core_release(float f) {
        this.f92648b = f;
    }

    @yfb
    public String toString() {
        return "AnimationVector1D: value = " + this.f92648b;
    }

    @Override // p000.AbstractC16313zy
    @yfb
    public C14294vy newVector$animation_core_release() {
        return new C14294vy(0.0f);
    }
}
