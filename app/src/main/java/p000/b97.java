package p000;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import p000.nr0;

/* JADX INFO: loaded from: classes3.dex */
public class b97 implements yq4, nr0.InterfaceC10013b, hr8 {

    /* JADX INFO: renamed from: v */
    public static final int f13044v = 32;

    /* JADX INFO: renamed from: a */
    @efb
    public final String f13045a;

    /* JADX INFO: renamed from: b */
    public final boolean f13046b;

    /* JADX INFO: renamed from: c */
    public final pr0 f13047c;

    /* JADX INFO: renamed from: d */
    public final zl9<LinearGradient> f13048d = new zl9<>();

    /* JADX INFO: renamed from: e */
    public final zl9<RadialGradient> f13049e = new zl9<>();

    /* JADX INFO: renamed from: f */
    public final Path f13050f;

    /* JADX INFO: renamed from: g */
    public final Paint f13051g;

    /* JADX INFO: renamed from: h */
    public final RectF f13052h;

    /* JADX INFO: renamed from: i */
    public final List<yic> f13053i;

    /* JADX INFO: renamed from: j */
    public final g97 f13054j;

    /* JADX INFO: renamed from: k */
    public final nr0<w87, w87> f13055k;

    /* JADX INFO: renamed from: l */
    public final nr0<Integer, Integer> f13056l;

    /* JADX INFO: renamed from: m */
    public final nr0<PointF, PointF> f13057m;

    /* JADX INFO: renamed from: n */
    public final nr0<PointF, PointF> f13058n;

    /* JADX INFO: renamed from: o */
    @hib
    public nr0<ColorFilter, ColorFilter> f13059o;

    /* JADX INFO: renamed from: p */
    @hib
    public d2i f13060p;

    /* JADX INFO: renamed from: q */
    public final go9 f13061q;

    /* JADX INFO: renamed from: r */
    public final int f13062r;

    /* JADX INFO: renamed from: s */
    @hib
    public nr0<Float, Float> f13063s;

    /* JADX INFO: renamed from: t */
    public float f13064t;

    /* JADX INFO: renamed from: u */
    @hib
    public yr4 f13065u;

    public b97(go9 go9Var, pr0 pr0Var, a97 a97Var) {
        Path path = new Path();
        this.f13050f = path;
        this.f13051g = new it8(1);
        this.f13052h = new RectF();
        this.f13053i = new ArrayList();
        this.f13064t = 0.0f;
        this.f13047c = pr0Var;
        this.f13045a = a97Var.getName();
        this.f13046b = a97Var.isHidden();
        this.f13061q = go9Var;
        this.f13054j = a97Var.getGradientType();
        path.setFillType(a97Var.getFillType());
        this.f13062r = (int) (go9Var.getComposition().getDuration() / 32.0f);
        nr0<w87, w87> nr0VarCreateAnimation = a97Var.getGradientColor().createAnimation();
        this.f13055k = nr0VarCreateAnimation;
        nr0VarCreateAnimation.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation);
        nr0<Integer, Integer> nr0VarCreateAnimation2 = a97Var.getOpacity().createAnimation();
        this.f13056l = nr0VarCreateAnimation2;
        nr0VarCreateAnimation2.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation2);
        nr0<PointF, PointF> nr0VarCreateAnimation3 = a97Var.getStartPoint().createAnimation();
        this.f13057m = nr0VarCreateAnimation3;
        nr0VarCreateAnimation3.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation3);
        nr0<PointF, PointF> nr0VarCreateAnimation4 = a97Var.getEndPoint().createAnimation();
        this.f13058n = nr0VarCreateAnimation4;
        nr0VarCreateAnimation4.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation4);
        if (pr0Var.getBlurEffect() != null) {
            nr0<Float, Float> nr0VarCreateAnimation5 = pr0Var.getBlurEffect().getBlurriness().createAnimation();
            this.f13063s = nr0VarCreateAnimation5;
            nr0VarCreateAnimation5.addUpdateListener(this);
            pr0Var.addAnimation(this.f13063s);
        }
        if (pr0Var.getDropShadowEffect() != null) {
            this.f13065u = new yr4(this, pr0Var, pr0Var.getDropShadowEffect());
        }
    }

    private int[] applyDynamicColorsIfNeeded(int[] iArr) {
        d2i d2iVar = this.f13060p;
        if (d2iVar != null) {
            Integer[] numArr = (Integer[]) d2iVar.getValue();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int getGradientHash() {
        int iRound = Math.round(this.f13057m.getProgress() * this.f13062r);
        int iRound2 = Math.round(this.f13058n.getProgress() * this.f13062r);
        int iRound3 = Math.round(this.f13055k.getProgress() * this.f13062r);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private LinearGradient getLinearGradient() {
        long gradientHash = getGradientHash();
        LinearGradient linearGradient = this.f13048d.get(gradientHash);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF value = this.f13057m.getValue();
        PointF value2 = this.f13058n.getValue();
        w87 value3 = this.f13055k.getValue();
        LinearGradient linearGradient2 = new LinearGradient(value.x, value.y, value2.x, value2.y, applyDynamicColorsIfNeeded(value3.getColors()), value3.getPositions(), Shader.TileMode.CLAMP);
        this.f13048d.put(gradientHash, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient getRadialGradient() {
        long gradientHash = getGradientHash();
        RadialGradient radialGradient = this.f13049e.get(gradientHash);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF value = this.f13057m.getValue();
        PointF value2 = this.f13058n.getValue();
        w87 value3 = this.f13055k.getValue();
        int[] iArrApplyDynamicColorsIfNeeded = applyDynamicColorsIfNeeded(value3.getColors());
        float[] positions = value3.getPositions();
        float f = value.x;
        float f2 = value.y;
        float fHypot = (float) Math.hypot(value2.x - f, value2.y - f2);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArrApplyDynamicColorsIfNeeded, positions, Shader.TileMode.CLAMP);
        this.f13049e.put(gradientHash, radialGradient2);
        return radialGradient2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.gr8
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        yr4 yr4Var;
        yr4 yr4Var2;
        yr4 yr4Var3;
        yr4 yr4Var4;
        yr4 yr4Var5;
        if (t == to9.f85487d) {
            this.f13056l.setValueCallback(bp9Var);
            return;
        }
        if (t == to9.f85479K) {
            nr0<ColorFilter, ColorFilter> nr0Var = this.f13059o;
            if (nr0Var != null) {
                this.f13047c.removeAnimation(nr0Var);
            }
            if (bp9Var == null) {
                this.f13059o = null;
                return;
            }
            d2i d2iVar = new d2i(bp9Var);
            this.f13059o = d2iVar;
            d2iVar.addUpdateListener(this);
            this.f13047c.addAnimation(this.f13059o);
            return;
        }
        if (t == to9.f85480L) {
            d2i d2iVar2 = this.f13060p;
            if (d2iVar2 != null) {
                this.f13047c.removeAnimation(d2iVar2);
            }
            if (bp9Var == null) {
                this.f13060p = null;
                return;
            }
            this.f13048d.clear();
            this.f13049e.clear();
            d2i d2iVar3 = new d2i(bp9Var);
            this.f13060p = d2iVar3;
            d2iVar3.addUpdateListener(this);
            this.f13047c.addAnimation(this.f13060p);
            return;
        }
        if (t == to9.f85493j) {
            nr0<Float, Float> nr0Var2 = this.f13063s;
            if (nr0Var2 != null) {
                nr0Var2.setValueCallback(bp9Var);
                return;
            }
            d2i d2iVar4 = new d2i(bp9Var);
            this.f13063s = d2iVar4;
            d2iVar4.addUpdateListener(this);
            this.f13047c.addAnimation(this.f13063s);
            return;
        }
        if (t == to9.f85488e && (yr4Var5 = this.f13065u) != null) {
            yr4Var5.setColorCallback(bp9Var);
            return;
        }
        if (t == to9.f85475G && (yr4Var4 = this.f13065u) != null) {
            yr4Var4.setOpacityCallback(bp9Var);
            return;
        }
        if (t == to9.f85476H && (yr4Var3 = this.f13065u) != null) {
            yr4Var3.setDirectionCallback(bp9Var);
            return;
        }
        if (t == to9.f85477I && (yr4Var2 = this.f13065u) != null) {
            yr4Var2.setDistanceCallback(bp9Var);
        } else {
            if (t != to9.f85478J || (yr4Var = this.f13065u) == null) {
                return;
            }
            yr4Var.setRadiusCallback(bp9Var);
        }
    }

    @Override // p000.yq4
    public void draw(Canvas canvas, Matrix matrix, int i) {
        if (this.f13046b) {
            return;
        }
        bt8.beginSection("GradientFillContent#draw");
        this.f13050f.reset();
        for (int i2 = 0; i2 < this.f13053i.size(); i2++) {
            this.f13050f.addPath(this.f13053i.get(i2).getPath(), matrix);
        }
        this.f13050f.computeBounds(this.f13052h, false);
        Shader linearGradient = this.f13054j == g97.LINEAR ? getLinearGradient() : getRadialGradient();
        linearGradient.setLocalMatrix(matrix);
        this.f13051g.setShader(linearGradient);
        nr0<ColorFilter, ColorFilter> nr0Var = this.f13059o;
        if (nr0Var != null) {
            this.f13051g.setColorFilter(nr0Var.getValue());
        }
        nr0<Float, Float> nr0Var2 = this.f13063s;
        if (nr0Var2 != null) {
            float fFloatValue = nr0Var2.getValue().floatValue();
            if (fFloatValue == 0.0f) {
                this.f13051g.setMaskFilter(null);
            } else if (fFloatValue != this.f13064t) {
                this.f13051g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f13064t = fFloatValue;
        }
        yr4 yr4Var = this.f13065u;
        if (yr4Var != null) {
            yr4Var.applyTo(this.f13051g);
        }
        this.f13051g.setAlpha(awa.clamp((int) ((((i / 255.0f) * this.f13056l.getValue().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f13050f, this.f13051g);
        bt8.endSection("GradientFillContent#draw");
    }

    @Override // p000.yq4
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f13050f.reset();
        for (int i = 0; i < this.f13053i.size(); i++) {
            this.f13050f.addPath(this.f13053i.get(i).getPath(), matrix);
        }
        this.f13050f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p000.gv2
    public String getName() {
        return this.f13045a;
    }

    @Override // p000.nr0.InterfaceC10013b
    public void onValueChanged() {
        this.f13061q.invalidateSelf();
    }

    @Override // p000.gr8
    public void resolveKeyPath(fr8 fr8Var, int i, List<fr8> list, fr8 fr8Var2) {
        awa.resolveKeyPath(fr8Var, i, list, fr8Var2, this);
    }

    @Override // p000.gv2
    public void setContents(List<gv2> list, List<gv2> list2) {
        for (int i = 0; i < list2.size(); i++) {
            gv2 gv2Var = list2.get(i);
            if (gv2Var instanceof yic) {
                this.f13053i.add((yic) gv2Var);
            }
        }
    }
}
