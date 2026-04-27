package p000;

import android.graphics.Color;
import android.graphics.Paint;
import p000.nr0;

/* JADX INFO: loaded from: classes3.dex */
public class yr4 implements nr0.InterfaceC10013b {

    /* JADX INFO: renamed from: h */
    public static final double f102739h = 0.017453292519943295d;

    /* JADX INFO: renamed from: a */
    public final nr0.InterfaceC10013b f102740a;

    /* JADX INFO: renamed from: b */
    public final nr0<Integer, Integer> f102741b;

    /* JADX INFO: renamed from: c */
    public final nr0<Float, Float> f102742c;

    /* JADX INFO: renamed from: d */
    public final nr0<Float, Float> f102743d;

    /* JADX INFO: renamed from: e */
    public final nr0<Float, Float> f102744e;

    /* JADX INFO: renamed from: f */
    public final nr0<Float, Float> f102745f;

    /* JADX INFO: renamed from: g */
    public boolean f102746g = true;

    /* JADX INFO: renamed from: yr4$a */
    public class C15776a extends bp9<Float> {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bp9 f102747d;

        public C15776a(bp9 bp9Var) {
            this.f102747d = bp9Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.bp9
        @hib
        public Float getValue(io9<Float> io9Var) {
            Float f = (Float) this.f102747d.getValue(io9Var);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public yr4(nr0.InterfaceC10013b interfaceC10013b, pr0 pr0Var, wr4 wr4Var) {
        this.f102740a = interfaceC10013b;
        nr0<Integer, Integer> nr0VarCreateAnimation = wr4Var.getColor().createAnimation();
        this.f102741b = nr0VarCreateAnimation;
        nr0VarCreateAnimation.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation);
        nr0<Float, Float> nr0VarCreateAnimation2 = wr4Var.getOpacity().createAnimation();
        this.f102742c = nr0VarCreateAnimation2;
        nr0VarCreateAnimation2.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation2);
        nr0<Float, Float> nr0VarCreateAnimation3 = wr4Var.getDirection().createAnimation();
        this.f102743d = nr0VarCreateAnimation3;
        nr0VarCreateAnimation3.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation3);
        nr0<Float, Float> nr0VarCreateAnimation4 = wr4Var.getDistance().createAnimation();
        this.f102744e = nr0VarCreateAnimation4;
        nr0VarCreateAnimation4.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation4);
        nr0<Float, Float> nr0VarCreateAnimation5 = wr4Var.getRadius().createAnimation();
        this.f102745f = nr0VarCreateAnimation5;
        nr0VarCreateAnimation5.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation5);
    }

    public void applyTo(Paint paint) {
        if (this.f102746g) {
            this.f102746g = false;
            double dFloatValue = ((double) this.f102743d.getValue().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.f102744e.getValue().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f102741b.getValue().intValue();
            paint.setShadowLayer(this.f102745f.getValue().floatValue(), fSin, fCos, Color.argb(Math.round(this.f102742c.getValue().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    @Override // p000.nr0.InterfaceC10013b
    public void onValueChanged() {
        this.f102746g = true;
        this.f102740a.onValueChanged();
    }

    public void setColorCallback(@hib bp9<Integer> bp9Var) {
        this.f102741b.setValueCallback(bp9Var);
    }

    public void setDirectionCallback(@hib bp9<Float> bp9Var) {
        this.f102743d.setValueCallback(bp9Var);
    }

    public void setDistanceCallback(@hib bp9<Float> bp9Var) {
        this.f102744e.setValueCallback(bp9Var);
    }

    public void setOpacityCallback(@hib bp9<Float> bp9Var) {
        if (bp9Var == null) {
            this.f102742c.setValueCallback(null);
        } else {
            this.f102742c.setValueCallback(new C15776a(bp9Var));
        }
    }

    public void setRadiusCallback(@hib bp9<Float> bp9Var) {
        this.f102745f.setValueCallback(bp9Var);
    }
}
