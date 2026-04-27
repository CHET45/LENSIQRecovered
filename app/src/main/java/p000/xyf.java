package p000;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class xyf extends nr0<PointF, PointF> {

    /* JADX INFO: renamed from: i */
    public final PointF f99759i;

    /* JADX INFO: renamed from: j */
    public final PointF f99760j;

    /* JADX INFO: renamed from: k */
    public final nr0<Float, Float> f99761k;

    /* JADX INFO: renamed from: l */
    public final nr0<Float, Float> f99762l;

    /* JADX INFO: renamed from: m */
    @hib
    public bp9<Float> f99763m;

    /* JADX INFO: renamed from: n */
    @hib
    public bp9<Float> f99764n;

    public xyf(nr0<Float, Float> nr0Var, nr0<Float, Float> nr0Var2) {
        super(Collections.emptyList());
        this.f99759i = new PointF();
        this.f99760j = new PointF();
        this.f99761k = nr0Var;
        this.f99762l = nr0Var2;
        setProgress(getProgress());
    }

    @Override // p000.nr0
    public void setProgress(float f) {
        this.f99761k.setProgress(f);
        this.f99762l.setProgress(f);
        this.f99759i.set(this.f99761k.getValue().floatValue(), this.f99762l.getValue().floatValue());
        for (int i = 0; i < this.f65333a.size(); i++) {
            this.f65333a.get(i).onValueChanged();
        }
    }

    public void setXValueCallback(@hib bp9<Float> bp9Var) {
        bp9<Float> bp9Var2 = this.f99763m;
        if (bp9Var2 != null) {
            bp9Var2.setAnimation(null);
        }
        this.f99763m = bp9Var;
        if (bp9Var != null) {
            bp9Var.setAnimation(this);
        }
    }

    public void setYValueCallback(@hib bp9<Float> bp9Var) {
        bp9<Float> bp9Var2 = this.f99764n;
        if (bp9Var2 != null) {
            bp9Var2.setAnimation(null);
        }
        this.f99764n = bp9Var;
        if (bp9Var != null) {
            bp9Var.setAnimation(this);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.nr0
    public PointF getValue() {
        return getValue((hs8<PointF>) null, 0.0f);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.nr0
    public PointF getValue(hs8<PointF> hs8Var, float f) {
        Float valueInternal;
        hs8<Float> hs8VarM18078a;
        hs8<Float> hs8VarM18078a2;
        Float valueInternal2 = null;
        if (this.f99763m == null || (hs8VarM18078a2 = this.f99761k.m18078a()) == null) {
            valueInternal = null;
        } else {
            float fM18079c = this.f99761k.m18079c();
            Float f2 = hs8VarM18078a2.f44697h;
            bp9<Float> bp9Var = this.f99763m;
            float f3 = hs8VarM18078a2.f44696g;
            valueInternal = bp9Var.getValueInternal(f3, f2 == null ? f3 : f2.floatValue(), hs8VarM18078a2.f44691b, hs8VarM18078a2.f44692c, f, f, fM18079c);
        }
        if (this.f99764n != null && (hs8VarM18078a = this.f99762l.m18078a()) != null) {
            float fM18079c2 = this.f99762l.m18079c();
            Float f4 = hs8VarM18078a.f44697h;
            bp9<Float> bp9Var2 = this.f99764n;
            float f5 = hs8VarM18078a.f44696g;
            valueInternal2 = bp9Var2.getValueInternal(f5, f4 == null ? f5 : f4.floatValue(), hs8VarM18078a.f44691b, hs8VarM18078a.f44692c, f, f, fM18079c2);
        }
        if (valueInternal == null) {
            this.f99760j.set(this.f99759i.x, 0.0f);
        } else {
            this.f99760j.set(valueInternal.floatValue(), 0.0f);
        }
        if (valueInternal2 == null) {
            PointF pointF = this.f99760j;
            pointF.set(pointF.x, this.f99759i.y);
        } else {
            PointF pointF2 = this.f99760j;
            pointF2.set(pointF2.x, valueInternal2.floatValue());
        }
        return this.f99760j;
    }
}
