package p000;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: loaded from: classes3.dex */
public class zjc<T> extends Property<T, Float> {

    /* JADX INFO: renamed from: a */
    public final Property<T, PointF> f105303a;

    /* JADX INFO: renamed from: b */
    public final PathMeasure f105304b;

    /* JADX INFO: renamed from: c */
    public final float f105305c;

    /* JADX INFO: renamed from: d */
    public final float[] f105306d;

    /* JADX INFO: renamed from: e */
    public final PointF f105307e;

    /* JADX INFO: renamed from: f */
    public float f105308f;

    public zjc(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f105306d = new float[2];
        this.f105307e = new PointF();
        this.f105303a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f105304b = pathMeasure;
        this.f105305c = pathMeasure.getLength();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public Float get(T t) {
        return Float.valueOf(this.f105308f);
    }

    @Override // android.util.Property
    public void set(T t, Float f) {
        this.f105308f = f.floatValue();
        this.f105304b.getPosTan(this.f105305c * f.floatValue(), this.f105306d, null);
        PointF pointF = this.f105307e;
        float[] fArr = this.f105306d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f105303a.set(t, pointF);
    }
}
