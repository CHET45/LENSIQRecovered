package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p000.g9f;
import p000.h4d;
import p000.nr0;

/* JADX INFO: loaded from: classes3.dex */
public class g4d implements yic, nr0.InterfaceC10013b, hr8 {

    /* JADX INFO: renamed from: p */
    public static final float f38726p = 0.47829f;

    /* JADX INFO: renamed from: q */
    public static final float f38727q = 0.25f;

    /* JADX INFO: renamed from: b */
    public final String f38729b;

    /* JADX INFO: renamed from: c */
    public final go9 f38730c;

    /* JADX INFO: renamed from: d */
    public final h4d.EnumC6708a f38731d;

    /* JADX INFO: renamed from: e */
    public final boolean f38732e;

    /* JADX INFO: renamed from: f */
    public final boolean f38733f;

    /* JADX INFO: renamed from: g */
    public final nr0<?, Float> f38734g;

    /* JADX INFO: renamed from: h */
    public final nr0<?, PointF> f38735h;

    /* JADX INFO: renamed from: i */
    public final nr0<?, Float> f38736i;

    /* JADX INFO: renamed from: j */
    @hib
    public final nr0<?, Float> f38737j;

    /* JADX INFO: renamed from: k */
    public final nr0<?, Float> f38738k;

    /* JADX INFO: renamed from: l */
    @hib
    public final nr0<?, Float> f38739l;

    /* JADX INFO: renamed from: m */
    public final nr0<?, Float> f38740m;

    /* JADX INFO: renamed from: o */
    public boolean f38742o;

    /* JADX INFO: renamed from: a */
    public final Path f38728a = new Path();

    /* JADX INFO: renamed from: n */
    public final eo2 f38741n = new eo2();

    /* JADX INFO: renamed from: g4d$a */
    public static /* synthetic */ class C6125a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38743a;

        static {
            int[] iArr = new int[h4d.EnumC6708a.values().length];
            f38743a = iArr;
            try {
                iArr[h4d.EnumC6708a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38743a[h4d.EnumC6708a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g4d(go9 go9Var, pr0 pr0Var, h4d h4dVar) {
        this.f38730c = go9Var;
        this.f38729b = h4dVar.getName();
        h4d.EnumC6708a type = h4dVar.getType();
        this.f38731d = type;
        this.f38732e = h4dVar.isHidden();
        this.f38733f = h4dVar.isReversed();
        nr0<Float, Float> nr0VarCreateAnimation = h4dVar.getPoints().createAnimation();
        this.f38734g = nr0VarCreateAnimation;
        nr0<PointF, PointF> nr0VarCreateAnimation2 = h4dVar.getPosition().createAnimation();
        this.f38735h = nr0VarCreateAnimation2;
        nr0<Float, Float> nr0VarCreateAnimation3 = h4dVar.getRotation().createAnimation();
        this.f38736i = nr0VarCreateAnimation3;
        nr0<Float, Float> nr0VarCreateAnimation4 = h4dVar.getOuterRadius().createAnimation();
        this.f38738k = nr0VarCreateAnimation4;
        nr0<Float, Float> nr0VarCreateAnimation5 = h4dVar.getOuterRoundedness().createAnimation();
        this.f38740m = nr0VarCreateAnimation5;
        h4d.EnumC6708a enumC6708a = h4d.EnumC6708a.STAR;
        if (type == enumC6708a) {
            this.f38737j = h4dVar.getInnerRadius().createAnimation();
            this.f38739l = h4dVar.getInnerRoundedness().createAnimation();
        } else {
            this.f38737j = null;
            this.f38739l = null;
        }
        pr0Var.addAnimation(nr0VarCreateAnimation);
        pr0Var.addAnimation(nr0VarCreateAnimation2);
        pr0Var.addAnimation(nr0VarCreateAnimation3);
        pr0Var.addAnimation(nr0VarCreateAnimation4);
        pr0Var.addAnimation(nr0VarCreateAnimation5);
        if (type == enumC6708a) {
            pr0Var.addAnimation(this.f38737j);
            pr0Var.addAnimation(this.f38739l);
        }
        nr0VarCreateAnimation.addUpdateListener(this);
        nr0VarCreateAnimation2.addUpdateListener(this);
        nr0VarCreateAnimation3.addUpdateListener(this);
        nr0VarCreateAnimation4.addUpdateListener(this);
        nr0VarCreateAnimation5.addUpdateListener(this);
        if (type == enumC6708a) {
            this.f38737j.addUpdateListener(this);
            this.f38739l.addUpdateListener(this);
        }
    }

    private void createPolygonPath() {
        int i;
        double d;
        double d2;
        double d3;
        int iFloor = (int) Math.floor(this.f38734g.getValue().floatValue());
        double radians = Math.toRadians((this.f38736i == null ? 0.0d : r2.getValue().floatValue()) - 90.0d);
        double d4 = iFloor;
        float fFloatValue = this.f38740m.getValue().floatValue() / 100.0f;
        float fFloatValue2 = this.f38738k.getValue().floatValue();
        double d5 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d5);
        float fSin = (float) (Math.sin(radians) * d5);
        this.f38728a.moveTo(fCos, fSin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double dCeil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < dCeil) {
            float fCos2 = (float) (Math.cos(d7) * d5);
            double d8 = dCeil;
            float fSin2 = (float) (d5 * Math.sin(d7));
            if (fFloatValue != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                d3 = d6;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f = fFloatValue2 * fFloatValue * 0.25f;
                this.f38728a.cubicTo(fCos - (fCos3 * f), fSin - (fSin3 * f), fCos2 + (((float) Math.cos(dAtan22)) * f), fSin2 + (f * ((float) Math.sin(dAtan22))), fCos2, fSin2);
            } else {
                i = i2;
                d = d7;
                d2 = d5;
                d3 = d6;
                this.f38728a.lineTo(fCos2, fSin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            fSin = fSin2;
            fCos = fCos2;
            dCeil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF value = this.f38735h.getValue();
        this.f38728a.offset(value.x, value.y);
        this.f38728a.close();
    }

    private void createStarPath() {
        int i;
        float f;
        float f2;
        double d;
        float fSin;
        float f3;
        float f4;
        float f5;
        double d2;
        float f6;
        float f7;
        float f8;
        double d3;
        float fFloatValue = this.f38734g.getValue().floatValue();
        double radians = Math.toRadians((this.f38736i == null ? 0.0d : r2.getValue().floatValue()) - 90.0d);
        double d4 = fFloatValue;
        float f9 = (float) (6.283185307179586d / d4);
        if (this.f38733f) {
            f9 *= -1.0f;
        }
        float f10 = f9 / 2.0f;
        float f11 = fFloatValue - ((int) fFloatValue);
        int i2 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (double) ((1.0f - f11) * f10);
        }
        float fFloatValue2 = this.f38738k.getValue().floatValue();
        float fFloatValue3 = this.f38737j.getValue().floatValue();
        nr0<?, Float> nr0Var = this.f38739l;
        float fFloatValue4 = nr0Var != null ? nr0Var.getValue().floatValue() / 100.0f : 0.0f;
        nr0<?, Float> nr0Var2 = this.f38740m;
        float fFloatValue5 = nr0Var2 != null ? nr0Var2.getValue().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f3 = ((fFloatValue2 - fFloatValue3) * f11) + fFloatValue3;
            i = i2;
            double d5 = f3;
            float fCos = (float) (d5 * Math.cos(radians));
            fSin = (float) (d5 * Math.sin(radians));
            this.f38728a.moveTo(fCos, fSin);
            d = radians + ((double) ((f9 * f11) / 2.0f));
            f = fCos;
            f2 = f10;
        } else {
            i = i2;
            double d6 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d6);
            float fSin2 = (float) (d6 * Math.sin(radians));
            this.f38728a.moveTo(fCos2, fSin2);
            f = fCos2;
            f2 = f10;
            d = radians + ((double) f2);
            fSin = fSin2;
            f3 = 0.0f;
        }
        double dCeil = Math.ceil(d4) * 2.0d;
        int i3 = 0;
        float f12 = f2;
        float f13 = f;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 >= dCeil) {
                PointF value = this.f38735h.getValue();
                this.f38728a.offset(value.x, value.y);
                this.f38728a.close();
                return;
            }
            float f14 = z ? fFloatValue2 : fFloatValue3;
            if (f3 == 0.0f || d7 != dCeil - 2.0d) {
                f4 = f9;
                f5 = f12;
            } else {
                f4 = f9;
                f5 = (f9 * f11) / 2.0f;
            }
            if (f3 == 0.0f || d7 != dCeil - 1.0d) {
                d2 = d7;
                f6 = f3;
                f3 = f14;
            } else {
                d2 = d7;
                f6 = f3;
            }
            double d8 = f3;
            double d9 = dCeil;
            float fCos3 = (float) (d8 * Math.cos(d));
            float fSin3 = (float) (d8 * Math.sin(d));
            if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                this.f38728a.lineTo(fCos3, fSin3);
                d3 = d;
                f7 = fFloatValue4;
                f8 = fFloatValue5;
            } else {
                f7 = fFloatValue4;
                double dAtan2 = (float) (Math.atan2(fSin, f13) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin4 = (float) Math.sin(dAtan2);
                f8 = fFloatValue5;
                d3 = d;
                double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin5 = (float) Math.sin(dAtan22);
                float f15 = z ? f7 : f8;
                float f16 = z ? f8 : f7;
                float f17 = (z ? fFloatValue3 : fFloatValue2) * f15 * 0.47829f;
                float f18 = fCos4 * f17;
                float f19 = f17 * fSin4;
                float f20 = (z ? fFloatValue2 : fFloatValue3) * f16 * 0.47829f;
                float f21 = fCos5 * f20;
                float f22 = f20 * fSin5;
                if (i != 0) {
                    if (i3 == 0) {
                        f18 *= f11;
                        f19 *= f11;
                    } else if (d2 == d9 - 1.0d) {
                        f21 *= f11;
                        f22 *= f11;
                    }
                }
                this.f38728a.cubicTo(f13 - f18, fSin - f19, fCos3 + f21, fSin3 + f22, fCos3, fSin3);
            }
            d = d3 + ((double) f5);
            z = !z;
            i3++;
            f13 = fCos3;
            fSin = fSin3;
            fFloatValue5 = f8;
            fFloatValue4 = f7;
            f3 = f6;
            f9 = f4;
            dCeil = d9;
        }
    }

    private void invalidate() {
        this.f38742o = false;
        this.f38730c.invalidateSelf();
    }

    @Override // p000.gr8
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        nr0<?, Float> nr0Var;
        nr0<?, Float> nr0Var2;
        if (t == to9.f85506w) {
            this.f38734g.setValueCallback(bp9Var);
            return;
        }
        if (t == to9.f85507x) {
            this.f38736i.setValueCallback(bp9Var);
            return;
        }
        if (t == to9.f85497n) {
            this.f38735h.setValueCallback(bp9Var);
            return;
        }
        if (t == to9.f85508y && (nr0Var2 = this.f38737j) != null) {
            nr0Var2.setValueCallback(bp9Var);
            return;
        }
        if (t == to9.f85509z) {
            this.f38738k.setValueCallback(bp9Var);
            return;
        }
        if (t == to9.f85469A && (nr0Var = this.f38739l) != null) {
            nr0Var.setValueCallback(bp9Var);
        } else if (t == to9.f85470B) {
            this.f38740m.setValueCallback(bp9Var);
        }
    }

    @Override // p000.gv2
    public String getName() {
        return this.f38729b;
    }

    @Override // p000.yic
    public Path getPath() {
        if (this.f38742o) {
            return this.f38728a;
        }
        this.f38728a.reset();
        if (this.f38732e) {
            this.f38742o = true;
            return this.f38728a;
        }
        int i = C6125a.f38743a[this.f38731d.ordinal()];
        if (i == 1) {
            createStarPath();
        } else if (i == 2) {
            createPolygonPath();
        }
        this.f38728a.close();
        this.f38741n.apply(this.f38728a);
        this.f38742o = true;
        return this.f38728a;
    }

    @Override // p000.nr0.InterfaceC10013b
    public void onValueChanged() {
        invalidate();
    }

    @Override // p000.gr8
    public void resolveKeyPath(fr8 fr8Var, int i, List<fr8> list, fr8 fr8Var2) {
        awa.resolveKeyPath(fr8Var, i, list, fr8Var2, this);
    }

    @Override // p000.gv2
    public void setContents(List<gv2> list, List<gv2> list2) {
        for (int i = 0; i < list.size(); i++) {
            gv2 gv2Var = list.get(i);
            if (gv2Var instanceof yih) {
                yih yihVar = (yih) gv2Var;
                if (yihVar.m26125b() == g9f.EnumC6176a.SIMULTANEOUSLY) {
                    this.f38741n.m10164a(yihVar);
                    yihVar.m26124a(this);
                }
            }
        }
    }
}
