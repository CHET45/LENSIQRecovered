package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n1#1,102:1\n40#1,5:103\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n51#1:103,5\n*E\n"})
@e0g(parameters = 0)
public final class q6b {

    /* JADX INFO: renamed from: e */
    public static final int f73332e = 8;

    /* JADX INFO: renamed from: a */
    public float f73333a;

    /* JADX INFO: renamed from: b */
    public float f73334b;

    /* JADX INFO: renamed from: c */
    public float f73335c;

    /* JADX INFO: renamed from: d */
    public float f73336d;

    public q6b(float f, float f2, float f3, float f4) {
        this.f73333a = f;
        this.f73334b = f2;
        this.f73335c = f3;
        this.f73336d = f4;
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m31932containsk4lQ0M(long j) {
        return izb.m30429getXimpl(j) >= this.f73333a && izb.m30429getXimpl(j) < this.f73335c && izb.m30430getYimpl(j) >= this.f73334b && izb.m30430getYimpl(j) < this.f73336d;
    }

    public final float getBottom() {
        return this.f73336d;
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final float getLeft() {
        return this.f73333a;
    }

    public final float getRight() {
        return this.f73335c;
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m31933getSizeNHjbRc() {
        return eqf.Size(getRight() - getLeft(), getBottom() - getTop());
    }

    public final float getTop() {
        return this.f73334b;
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    @f0g
    public final void intersect(float f, float f2, float f3, float f4) {
        this.f73333a = Math.max(f, this.f73333a);
        this.f73334b = Math.max(f2, this.f73334b);
        this.f73335c = Math.min(f3, this.f73335c);
        this.f73336d = Math.min(f4, this.f73336d);
    }

    public final boolean isEmpty() {
        return this.f73333a >= this.f73335c || this.f73334b >= this.f73336d;
    }

    public final void set(float f, float f2, float f3, float f4) {
        this.f73333a = f;
        this.f73334b = f2;
        this.f73335c = f3;
        this.f73336d = f4;
    }

    public final void setBottom(float f) {
        this.f73336d = f;
    }

    public final void setLeft(float f) {
        this.f73333a = f;
    }

    public final void setRight(float f) {
        this.f73335c = f;
    }

    public final void setTop(float f) {
        this.f73334b = f;
    }

    @yfb
    public String toString() {
        return "MutableRect(" + f37.toStringAsFixed(this.f73333a, 1) + ", " + f37.toStringAsFixed(this.f73334b, 1) + ", " + f37.toStringAsFixed(this.f73335c, 1) + ", " + f37.toStringAsFixed(this.f73336d, 1) + ')';
    }
}
