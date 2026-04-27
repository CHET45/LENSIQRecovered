package p000;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class no9<T> extends bp9<T> {

    /* JADX INFO: renamed from: d */
    public final T f65136d;

    /* JADX INFO: renamed from: e */
    public final T f65137e;

    /* JADX INFO: renamed from: f */
    public final Interpolator f65138f;

    public no9(T t, T t2) {
        this(t, t2, new LinearInterpolator());
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo14871a(T t, T t2, float f);

    @Override // p000.bp9
    public T getValue(io9<T> io9Var) {
        return mo14871a(this.f65136d, this.f65137e, this.f65138f.getInterpolation(io9Var.getOverallProgress()));
    }

    public no9(T t, T t2, Interpolator interpolator) {
        this.f65136d = t;
        this.f65137e = t2;
        this.f65138f = interpolator;
    }
}
