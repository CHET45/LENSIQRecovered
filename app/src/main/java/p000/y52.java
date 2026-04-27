package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class y52 implements z52<Float> {

    /* JADX INFO: renamed from: a */
    public final float f100416a;

    /* JADX INFO: renamed from: b */
    public final float f100417b;

    public y52(float f, float f2) {
        this.f100416a = f;
        this.f100417b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.z52, p000.a62, p000.r5c
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof y52) {
            if (!isEmpty() || !((y52) obj).isEmpty()) {
                y52 y52Var = (y52) obj;
                if (this.f100416a != y52Var.f100416a || this.f100417b != y52Var.f100417b) {
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
        return (Float.hashCode(this.f100416a) * 31) + Float.hashCode(this.f100417b);
    }

    @Override // p000.z52, p000.a62, p000.r5c
    public boolean isEmpty() {
        return this.f100416a > this.f100417b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.z52
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    @yfb
    public String toString() {
        return this.f100416a + ".." + this.f100417b;
    }

    public boolean contains(float f) {
        return f >= this.f100416a && f <= this.f100417b;
    }

    @Override // p000.a62
    @yfb
    public Float getEndInclusive() {
        return Float.valueOf(this.f100417b);
    }

    @Override // p000.a62, p000.r5c
    @yfb
    public Float getStart() {
        return Float.valueOf(this.f100416a);
    }

    public boolean lessThanOrEquals(float f, float f2) {
        return f <= f2;
    }
}
