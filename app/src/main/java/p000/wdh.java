package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import p000.nr0;

/* JADX INFO: loaded from: classes3.dex */
public class wdh {

    /* JADX INFO: renamed from: a */
    public final Matrix f93999a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Matrix f94000b;

    /* JADX INFO: renamed from: c */
    public final Matrix f94001c;

    /* JADX INFO: renamed from: d */
    public final Matrix f94002d;

    /* JADX INFO: renamed from: e */
    public final float[] f94003e;

    /* JADX INFO: renamed from: f */
    @hib
    public nr0<PointF, PointF> f94004f;

    /* JADX INFO: renamed from: g */
    @hib
    public nr0<?, PointF> f94005g;

    /* JADX INFO: renamed from: h */
    @hib
    public nr0<xme, xme> f94006h;

    /* JADX INFO: renamed from: i */
    @hib
    public nr0<Float, Float> f94007i;

    /* JADX INFO: renamed from: j */
    @hib
    public nr0<Integer, Integer> f94008j;

    /* JADX INFO: renamed from: k */
    @hib
    public n46 f94009k;

    /* JADX INFO: renamed from: l */
    @hib
    public n46 f94010l;

    /* JADX INFO: renamed from: m */
    @hib
    public nr0<?, Float> f94011m;

    /* JADX INFO: renamed from: n */
    @hib
    public nr0<?, Float> f94012n;

    public wdh(C8540kx c8540kx) {
        this.f94004f = c8540kx.getAnchorPoint() == null ? null : c8540kx.getAnchorPoint().createAnimation();
        this.f94005g = c8540kx.getPosition() == null ? null : c8540kx.getPosition().createAnimation();
        this.f94006h = c8540kx.getScale() == null ? null : c8540kx.getScale().createAnimation();
        this.f94007i = c8540kx.getRotation() == null ? null : c8540kx.getRotation().createAnimation();
        n46 n46Var = c8540kx.getSkew() == null ? null : (n46) c8540kx.getSkew().createAnimation();
        this.f94009k = n46Var;
        if (n46Var != null) {
            this.f94000b = new Matrix();
            this.f94001c = new Matrix();
            this.f94002d = new Matrix();
            this.f94003e = new float[9];
        } else {
            this.f94000b = null;
            this.f94001c = null;
            this.f94002d = null;
            this.f94003e = null;
        }
        this.f94010l = c8540kx.getSkewAngle() == null ? null : (n46) c8540kx.getSkewAngle().createAnimation();
        if (c8540kx.getOpacity() != null) {
            this.f94008j = c8540kx.getOpacity().createAnimation();
        }
        if (c8540kx.getStartOpacity() != null) {
            this.f94011m = c8540kx.getStartOpacity().createAnimation();
        } else {
            this.f94011m = null;
        }
        if (c8540kx.getEndOpacity() != null) {
            this.f94012n = c8540kx.getEndOpacity().createAnimation();
        } else {
            this.f94012n = null;
        }
    }

    private void clearSkewValues() {
        for (int i = 0; i < 9; i++) {
            this.f94003e[i] = 0.0f;
        }
    }

    public void addAnimationsToLayer(pr0 pr0Var) {
        pr0Var.addAnimation(this.f94008j);
        pr0Var.addAnimation(this.f94011m);
        pr0Var.addAnimation(this.f94012n);
        pr0Var.addAnimation(this.f94004f);
        pr0Var.addAnimation(this.f94005g);
        pr0Var.addAnimation(this.f94006h);
        pr0Var.addAnimation(this.f94007i);
        pr0Var.addAnimation(this.f94009k);
        pr0Var.addAnimation(this.f94010l);
    }

    public void addListener(nr0.InterfaceC10013b interfaceC10013b) {
        nr0<Integer, Integer> nr0Var = this.f94008j;
        if (nr0Var != null) {
            nr0Var.addUpdateListener(interfaceC10013b);
        }
        nr0<?, Float> nr0Var2 = this.f94011m;
        if (nr0Var2 != null) {
            nr0Var2.addUpdateListener(interfaceC10013b);
        }
        nr0<?, Float> nr0Var3 = this.f94012n;
        if (nr0Var3 != null) {
            nr0Var3.addUpdateListener(interfaceC10013b);
        }
        nr0<PointF, PointF> nr0Var4 = this.f94004f;
        if (nr0Var4 != null) {
            nr0Var4.addUpdateListener(interfaceC10013b);
        }
        nr0<?, PointF> nr0Var5 = this.f94005g;
        if (nr0Var5 != null) {
            nr0Var5.addUpdateListener(interfaceC10013b);
        }
        nr0<xme, xme> nr0Var6 = this.f94006h;
        if (nr0Var6 != null) {
            nr0Var6.addUpdateListener(interfaceC10013b);
        }
        nr0<Float, Float> nr0Var7 = this.f94007i;
        if (nr0Var7 != null) {
            nr0Var7.addUpdateListener(interfaceC10013b);
        }
        n46 n46Var = this.f94009k;
        if (n46Var != null) {
            n46Var.addUpdateListener(interfaceC10013b);
        }
        n46 n46Var2 = this.f94010l;
        if (n46Var2 != null) {
            n46Var2.addUpdateListener(interfaceC10013b);
        }
    }

    public <T> boolean applyValueCallback(T t, @hib bp9<T> bp9Var) {
        if (t == to9.f85489f) {
            nr0<PointF, PointF> nr0Var = this.f94004f;
            if (nr0Var == null) {
                this.f94004f = new d2i(bp9Var, new PointF());
                return true;
            }
            nr0Var.setValueCallback(bp9Var);
            return true;
        }
        if (t == to9.f85490g) {
            nr0<?, PointF> nr0Var2 = this.f94005g;
            if (nr0Var2 == null) {
                this.f94005g = new d2i(bp9Var, new PointF());
                return true;
            }
            nr0Var2.setValueCallback(bp9Var);
            return true;
        }
        if (t == to9.f85491h) {
            nr0<?, PointF> nr0Var3 = this.f94005g;
            if (nr0Var3 instanceof xyf) {
                ((xyf) nr0Var3).setXValueCallback(bp9Var);
                return true;
            }
        }
        if (t == to9.f85492i) {
            nr0<?, PointF> nr0Var4 = this.f94005g;
            if (nr0Var4 instanceof xyf) {
                ((xyf) nr0Var4).setYValueCallback(bp9Var);
                return true;
            }
        }
        if (t == to9.f85498o) {
            nr0<xme, xme> nr0Var5 = this.f94006h;
            if (nr0Var5 == null) {
                this.f94006h = new d2i(bp9Var, new xme());
                return true;
            }
            nr0Var5.setValueCallback(bp9Var);
            return true;
        }
        if (t == to9.f85499p) {
            nr0<Float, Float> nr0Var6 = this.f94007i;
            if (nr0Var6 == null) {
                this.f94007i = new d2i(bp9Var, Float.valueOf(0.0f));
                return true;
            }
            nr0Var6.setValueCallback(bp9Var);
            return true;
        }
        if (t == to9.f85486c) {
            nr0<Integer, Integer> nr0Var7 = this.f94008j;
            if (nr0Var7 == null) {
                this.f94008j = new d2i(bp9Var, 100);
                return true;
            }
            nr0Var7.setValueCallback(bp9Var);
            return true;
        }
        if (t == to9.f85471C) {
            nr0<?, Float> nr0Var8 = this.f94011m;
            if (nr0Var8 == null) {
                this.f94011m = new d2i(bp9Var, Float.valueOf(100.0f));
                return true;
            }
            nr0Var8.setValueCallback(bp9Var);
            return true;
        }
        if (t == to9.f85472D) {
            nr0<?, Float> nr0Var9 = this.f94012n;
            if (nr0Var9 == null) {
                this.f94012n = new d2i(bp9Var, Float.valueOf(100.0f));
                return true;
            }
            nr0Var9.setValueCallback(bp9Var);
            return true;
        }
        if (t == to9.f85500q) {
            if (this.f94009k == null) {
                this.f94009k = new n46(Collections.singletonList(new hs8(Float.valueOf(0.0f))));
            }
            this.f94009k.setValueCallback(bp9Var);
            return true;
        }
        if (t != to9.f85501r) {
            return false;
        }
        if (this.f94010l == null) {
            this.f94010l = new n46(Collections.singletonList(new hs8(Float.valueOf(0.0f))));
        }
        this.f94010l.setValueCallback(bp9Var);
        return true;
    }

    @hib
    public nr0<?, Float> getEndOpacity() {
        return this.f94012n;
    }

    public Matrix getMatrix() {
        PointF value;
        this.f93999a.reset();
        nr0<?, PointF> nr0Var = this.f94005g;
        if (nr0Var != null && (value = nr0Var.getValue()) != null) {
            float f = value.x;
            if (f != 0.0f || value.y != 0.0f) {
                this.f93999a.preTranslate(f, value.y);
            }
        }
        nr0<Float, Float> nr0Var2 = this.f94007i;
        if (nr0Var2 != null) {
            float fFloatValue = nr0Var2 instanceof d2i ? nr0Var2.getValue().floatValue() : ((n46) nr0Var2).getFloatValue();
            if (fFloatValue != 0.0f) {
                this.f93999a.preRotate(fFloatValue);
            }
        }
        if (this.f94009k != null) {
            float fCos = this.f94010l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.getFloatValue()) + 90.0f));
            float fSin = this.f94010l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.getFloatValue()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.getFloatValue()));
            clearSkewValues();
            float[] fArr = this.f94003e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f94000b.setValues(fArr);
            clearSkewValues();
            float[] fArr2 = this.f94003e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f94001c.setValues(fArr2);
            clearSkewValues();
            float[] fArr3 = this.f94003e;
            fArr3[0] = fCos;
            fArr3[1] = f2;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f94002d.setValues(fArr3);
            this.f94001c.preConcat(this.f94000b);
            this.f94002d.preConcat(this.f94001c);
            this.f93999a.preConcat(this.f94002d);
        }
        nr0<xme, xme> nr0Var3 = this.f94006h;
        if (nr0Var3 != null) {
            xme value2 = nr0Var3.getValue();
            if (value2.getScaleX() != 1.0f || value2.getScaleY() != 1.0f) {
                this.f93999a.preScale(value2.getScaleX(), value2.getScaleY());
            }
        }
        nr0<PointF, PointF> nr0Var4 = this.f94004f;
        if (nr0Var4 != null) {
            PointF value3 = nr0Var4.getValue();
            float f3 = value3.x;
            if (f3 != 0.0f || value3.y != 0.0f) {
                this.f93999a.preTranslate(-f3, -value3.y);
            }
        }
        return this.f93999a;
    }

    public Matrix getMatrixForRepeater(float f) {
        nr0<?, PointF> nr0Var = this.f94005g;
        PointF value = nr0Var == null ? null : nr0Var.getValue();
        nr0<xme, xme> nr0Var2 = this.f94006h;
        xme value2 = nr0Var2 == null ? null : nr0Var2.getValue();
        this.f93999a.reset();
        if (value != null) {
            this.f93999a.preTranslate(value.x * f, value.y * f);
        }
        if (value2 != null) {
            double d = f;
            this.f93999a.preScale((float) Math.pow(value2.getScaleX(), d), (float) Math.pow(value2.getScaleY(), d));
        }
        nr0<Float, Float> nr0Var3 = this.f94007i;
        if (nr0Var3 != null) {
            float fFloatValue = nr0Var3.getValue().floatValue();
            nr0<PointF, PointF> nr0Var4 = this.f94004f;
            PointF value3 = nr0Var4 != null ? nr0Var4.getValue() : null;
            this.f93999a.preRotate(fFloatValue * f, value3 == null ? 0.0f : value3.x, value3 != null ? value3.y : 0.0f);
        }
        return this.f93999a;
    }

    @hib
    public nr0<?, Integer> getOpacity() {
        return this.f94008j;
    }

    @hib
    public nr0<?, Float> getStartOpacity() {
        return this.f94011m;
    }

    public void setProgress(float f) {
        nr0<Integer, Integer> nr0Var = this.f94008j;
        if (nr0Var != null) {
            nr0Var.setProgress(f);
        }
        nr0<?, Float> nr0Var2 = this.f94011m;
        if (nr0Var2 != null) {
            nr0Var2.setProgress(f);
        }
        nr0<?, Float> nr0Var3 = this.f94012n;
        if (nr0Var3 != null) {
            nr0Var3.setProgress(f);
        }
        nr0<PointF, PointF> nr0Var4 = this.f94004f;
        if (nr0Var4 != null) {
            nr0Var4.setProgress(f);
        }
        nr0<?, PointF> nr0Var5 = this.f94005g;
        if (nr0Var5 != null) {
            nr0Var5.setProgress(f);
        }
        nr0<xme, xme> nr0Var6 = this.f94006h;
        if (nr0Var6 != null) {
            nr0Var6.setProgress(f);
        }
        nr0<Float, Float> nr0Var7 = this.f94007i;
        if (nr0Var7 != null) {
            nr0Var7.setProgress(f);
        }
        n46 n46Var = this.f94009k;
        if (n46Var != null) {
            n46Var.setProgress(f);
        }
        n46 n46Var2 = this.f94010l;
        if (n46Var2 != null) {
            n46Var2.setProgress(f);
        }
    }
}
