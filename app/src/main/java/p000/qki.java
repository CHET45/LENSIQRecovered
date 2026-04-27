package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qki {

    /* JADX INFO: renamed from: a */
    public final float f74781a;

    /* JADX INFO: renamed from: b */
    public final float f74782b;

    public qki(float f, float f2) {
        this.f74781a = f;
        this.f74782b = f2;
    }

    public static /* synthetic */ qki copy$default(qki qkiVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = qkiVar.f74781a;
        }
        if ((i & 2) != 0) {
            f2 = qkiVar.f74782b;
        }
        return qkiVar.copy(f, f2);
    }

    public final float component1() {
        return this.f74781a;
    }

    public final float component2() {
        return this.f74782b;
    }

    @yfb
    public final qki copy(float f, float f2) {
        return new qki(f, f2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qki)) {
            return false;
        }
        qki qkiVar = (qki) obj;
        return Float.compare(this.f74781a, qkiVar.f74781a) == 0 && Float.compare(this.f74782b, qkiVar.f74782b) == 0;
    }

    public final float getX() {
        return this.f74781a;
    }

    public final float getY() {
        return this.f74782b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f74781a) * 31) + Float.hashCode(this.f74782b);
    }

    @yfb
    public String toString() {
        return "WhitePoint(x=" + this.f74781a + ", y=" + this.f74782b + ')';
    }

    @yfb
    @zpf(3)
    public final float[] toXyz$ui_graphics_release() {
        float f = this.f74781a;
        float f2 = this.f74782b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public qki(float f, float f2, float f3) {
        this(f, f2, f3, f + f2 + f3);
    }

    private qki(float f, float f2, float f3, float f4) {
        this(f / f4, f2 / f4);
    }
}
