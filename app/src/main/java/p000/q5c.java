package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class q5c implements r5c<Float> {

    /* JADX INFO: renamed from: a */
    public final float f73283a;

    /* JADX INFO: renamed from: b */
    public final float f73284b;

    public q5c(float f, float f2) {
        this.f73283a = f;
        this.f73284b = f2;
    }

    private final boolean lessThanOrEquals(float f, float f2) {
        return f <= f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.r5c
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof q5c) {
            if (!isEmpty() || !((q5c) obj).isEmpty()) {
                q5c q5cVar = (q5c) obj;
                if (this.f73283a != q5cVar.f73283a || this.f73284b != q5cVar.f73284b) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f73283a) * 31) + Float.hashCode(this.f73284b);
    }

    @Override // p000.r5c
    public boolean isEmpty() {
        return this.f73283a >= this.f73284b;
    }

    @yfb
    public String toString() {
        return this.f73283a + "..<" + this.f73284b;
    }

    public boolean contains(float f) {
        return f >= this.f73283a && f < this.f73284b;
    }

    @Override // p000.r5c
    @yfb
    public Float getEndExclusive() {
        return Float.valueOf(this.f73284b);
    }

    @Override // p000.r5c
    @yfb
    public Float getStart() {
        return Float.valueOf(this.f73283a);
    }
}
