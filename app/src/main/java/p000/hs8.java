package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public class hs8<T> {

    /* JADX INFO: renamed from: q */
    public static final float f44688q = -3987645.8f;

    /* JADX INFO: renamed from: r */
    public static final int f44689r = 784923401;

    /* JADX INFO: renamed from: a */
    @hib
    public final bn9 f44690a;

    /* JADX INFO: renamed from: b */
    @hib
    public final T f44691b;

    /* JADX INFO: renamed from: c */
    @hib
    public T f44692c;

    /* JADX INFO: renamed from: d */
    @hib
    public final Interpolator f44693d;

    /* JADX INFO: renamed from: e */
    @hib
    public final Interpolator f44694e;

    /* JADX INFO: renamed from: f */
    @hib
    public final Interpolator f44695f;

    /* JADX INFO: renamed from: g */
    public final float f44696g;

    /* JADX INFO: renamed from: h */
    @hib
    public Float f44697h;

    /* JADX INFO: renamed from: i */
    public float f44698i;

    /* JADX INFO: renamed from: j */
    public float f44699j;

    /* JADX INFO: renamed from: k */
    public int f44700k;

    /* JADX INFO: renamed from: l */
    public int f44701l;

    /* JADX INFO: renamed from: m */
    public float f44702m;

    /* JADX INFO: renamed from: n */
    public float f44703n;

    /* JADX INFO: renamed from: o */
    public PointF f44704o;

    /* JADX INFO: renamed from: p */
    public PointF f44705p;

    public hs8(bn9 bn9Var, @hib T t, @hib T t2, @hib Interpolator interpolator, float f, @hib Float f2) {
        this.f44698i = -3987645.8f;
        this.f44699j = -3987645.8f;
        this.f44700k = f44689r;
        this.f44701l = f44689r;
        this.f44702m = Float.MIN_VALUE;
        this.f44703n = Float.MIN_VALUE;
        this.f44704o = null;
        this.f44705p = null;
        this.f44690a = bn9Var;
        this.f44691b = t;
        this.f44692c = t2;
        this.f44693d = interpolator;
        this.f44694e = null;
        this.f44695f = null;
        this.f44696g = f;
        this.f44697h = f2;
    }

    public boolean containsProgress(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        return f >= getStartProgress() && f < getEndProgress();
    }

    public float getEndProgress() {
        if (this.f44690a == null) {
            return 1.0f;
        }
        if (this.f44703n == Float.MIN_VALUE) {
            if (this.f44697h == null) {
                this.f44703n = 1.0f;
            } else {
                this.f44703n = getStartProgress() + ((this.f44697h.floatValue() - this.f44696g) / this.f44690a.getDurationFrames());
            }
        }
        return this.f44703n;
    }

    public float getEndValueFloat() {
        if (this.f44699j == -3987645.8f) {
            this.f44699j = ((Float) this.f44692c).floatValue();
        }
        return this.f44699j;
    }

    public int getEndValueInt() {
        if (this.f44701l == 784923401) {
            this.f44701l = ((Integer) this.f44692c).intValue();
        }
        return this.f44701l;
    }

    public float getStartProgress() {
        bn9 bn9Var = this.f44690a;
        if (bn9Var == null) {
            return 0.0f;
        }
        if (this.f44702m == Float.MIN_VALUE) {
            this.f44702m = (this.f44696g - bn9Var.getStartFrame()) / this.f44690a.getDurationFrames();
        }
        return this.f44702m;
    }

    public float getStartValueFloat() {
        if (this.f44698i == -3987645.8f) {
            this.f44698i = ((Float) this.f44691b).floatValue();
        }
        return this.f44698i;
    }

    public int getStartValueInt() {
        if (this.f44700k == 784923401) {
            this.f44700k = ((Integer) this.f44691b).intValue();
        }
        return this.f44700k;
    }

    public boolean isStatic() {
        return this.f44693d == null && this.f44694e == null && this.f44695f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f44691b + ", endValue=" + this.f44692c + ", startFrame=" + this.f44696g + ", endFrame=" + this.f44697h + ", interpolator=" + this.f44693d + '}';
    }

    public hs8(bn9 bn9Var, @hib T t, @hib T t2, @hib Interpolator interpolator, @hib Interpolator interpolator2, float f, @hib Float f2) {
        this.f44698i = -3987645.8f;
        this.f44699j = -3987645.8f;
        this.f44700k = f44689r;
        this.f44701l = f44689r;
        this.f44702m = Float.MIN_VALUE;
        this.f44703n = Float.MIN_VALUE;
        this.f44704o = null;
        this.f44705p = null;
        this.f44690a = bn9Var;
        this.f44691b = t;
        this.f44692c = t2;
        this.f44693d = null;
        this.f44694e = interpolator;
        this.f44695f = interpolator2;
        this.f44696g = f;
        this.f44697h = f2;
    }

    public hs8(bn9 bn9Var, @hib T t, @hib T t2, @hib Interpolator interpolator, @hib Interpolator interpolator2, @hib Interpolator interpolator3, float f, @hib Float f2) {
        this.f44698i = -3987645.8f;
        this.f44699j = -3987645.8f;
        this.f44700k = f44689r;
        this.f44701l = f44689r;
        this.f44702m = Float.MIN_VALUE;
        this.f44703n = Float.MIN_VALUE;
        this.f44704o = null;
        this.f44705p = null;
        this.f44690a = bn9Var;
        this.f44691b = t;
        this.f44692c = t2;
        this.f44693d = interpolator;
        this.f44694e = interpolator2;
        this.f44695f = interpolator3;
        this.f44696g = f;
        this.f44697h = f2;
    }

    public hs8(T t) {
        this.f44698i = -3987645.8f;
        this.f44699j = -3987645.8f;
        this.f44700k = f44689r;
        this.f44701l = f44689r;
        this.f44702m = Float.MIN_VALUE;
        this.f44703n = Float.MIN_VALUE;
        this.f44704o = null;
        this.f44705p = null;
        this.f44690a = null;
        this.f44691b = t;
        this.f44692c = t;
        this.f44693d = null;
        this.f44694e = null;
        this.f44695f = null;
        this.f44696g = Float.MIN_VALUE;
        this.f44697h = Float.valueOf(Float.MAX_VALUE);
    }
}
