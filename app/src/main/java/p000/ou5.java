package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p000.nr0;

/* JADX INFO: loaded from: classes3.dex */
public class ou5 implements yq4, nr0.InterfaceC10013b, hr8 {

    /* JADX INFO: renamed from: a */
    public final Path f68757a;

    /* JADX INFO: renamed from: b */
    public final Paint f68758b;

    /* JADX INFO: renamed from: c */
    public final pr0 f68759c;

    /* JADX INFO: renamed from: d */
    public final String f68760d;

    /* JADX INFO: renamed from: e */
    public final boolean f68761e;

    /* JADX INFO: renamed from: f */
    public final List<yic> f68762f;

    /* JADX INFO: renamed from: g */
    public final nr0<Integer, Integer> f68763g;

    /* JADX INFO: renamed from: h */
    public final nr0<Integer, Integer> f68764h;

    /* JADX INFO: renamed from: i */
    @hib
    public nr0<ColorFilter, ColorFilter> f68765i;

    /* JADX INFO: renamed from: j */
    public final go9 f68766j;

    /* JADX INFO: renamed from: k */
    @hib
    public nr0<Float, Float> f68767k;

    /* JADX INFO: renamed from: l */
    public float f68768l;

    /* JADX INFO: renamed from: m */
    @hib
    public yr4 f68769m;

    public ou5(go9 go9Var, pr0 pr0Var, t8f t8fVar) {
        Path path = new Path();
        this.f68757a = path;
        this.f68758b = new it8(1);
        this.f68762f = new ArrayList();
        this.f68759c = pr0Var;
        this.f68760d = t8fVar.getName();
        this.f68761e = t8fVar.isHidden();
        this.f68766j = go9Var;
        if (pr0Var.getBlurEffect() != null) {
            nr0<Float, Float> nr0VarCreateAnimation = pr0Var.getBlurEffect().getBlurriness().createAnimation();
            this.f68767k = nr0VarCreateAnimation;
            nr0VarCreateAnimation.addUpdateListener(this);
            pr0Var.addAnimation(this.f68767k);
        }
        if (pr0Var.getDropShadowEffect() != null) {
            this.f68769m = new yr4(this, pr0Var, pr0Var.getDropShadowEffect());
        }
        if (t8fVar.getColor() == null || t8fVar.getOpacity() == null) {
            this.f68763g = null;
            this.f68764h = null;
            return;
        }
        path.setFillType(t8fVar.getFillType());
        nr0<Integer, Integer> nr0VarCreateAnimation2 = t8fVar.getColor().createAnimation();
        this.f68763g = nr0VarCreateAnimation2;
        nr0VarCreateAnimation2.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation2);
        nr0<Integer, Integer> nr0VarCreateAnimation3 = t8fVar.getOpacity().createAnimation();
        this.f68764h = nr0VarCreateAnimation3;
        nr0VarCreateAnimation3.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation3);
    }

    @Override // p000.gr8
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        yr4 yr4Var;
        yr4 yr4Var2;
        yr4 yr4Var3;
        yr4 yr4Var4;
        yr4 yr4Var5;
        if (t == to9.f85484a) {
            this.f68763g.setValueCallback(bp9Var);
            return;
        }
        if (t == to9.f85487d) {
            this.f68764h.setValueCallback(bp9Var);
            return;
        }
        if (t == to9.f85479K) {
            nr0<ColorFilter, ColorFilter> nr0Var = this.f68765i;
            if (nr0Var != null) {
                this.f68759c.removeAnimation(nr0Var);
            }
            if (bp9Var == null) {
                this.f68765i = null;
                return;
            }
            d2i d2iVar = new d2i(bp9Var);
            this.f68765i = d2iVar;
            d2iVar.addUpdateListener(this);
            this.f68759c.addAnimation(this.f68765i);
            return;
        }
        if (t == to9.f85493j) {
            nr0<Float, Float> nr0Var2 = this.f68767k;
            if (nr0Var2 != null) {
                nr0Var2.setValueCallback(bp9Var);
                return;
            }
            d2i d2iVar2 = new d2i(bp9Var);
            this.f68767k = d2iVar2;
            d2iVar2.addUpdateListener(this);
            this.f68759c.addAnimation(this.f68767k);
            return;
        }
        if (t == to9.f85488e && (yr4Var5 = this.f68769m) != null) {
            yr4Var5.setColorCallback(bp9Var);
            return;
        }
        if (t == to9.f85475G && (yr4Var4 = this.f68769m) != null) {
            yr4Var4.setOpacityCallback(bp9Var);
            return;
        }
        if (t == to9.f85476H && (yr4Var3 = this.f68769m) != null) {
            yr4Var3.setDirectionCallback(bp9Var);
            return;
        }
        if (t == to9.f85477I && (yr4Var2 = this.f68769m) != null) {
            yr4Var2.setDistanceCallback(bp9Var);
        } else {
            if (t != to9.f85478J || (yr4Var = this.f68769m) == null) {
                return;
            }
            yr4Var.setRadiusCallback(bp9Var);
        }
    }

    @Override // p000.yq4
    public void draw(Canvas canvas, Matrix matrix, int i) {
        if (this.f68761e) {
            return;
        }
        bt8.beginSection("FillContent#draw");
        this.f68758b.setColor((awa.clamp((int) ((((i / 255.0f) * this.f68764h.getValue().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((h92) this.f68763g).getIntValue() & 16777215));
        nr0<ColorFilter, ColorFilter> nr0Var = this.f68765i;
        if (nr0Var != null) {
            this.f68758b.setColorFilter(nr0Var.getValue());
        }
        nr0<Float, Float> nr0Var2 = this.f68767k;
        if (nr0Var2 != null) {
            float fFloatValue = nr0Var2.getValue().floatValue();
            if (fFloatValue == 0.0f) {
                this.f68758b.setMaskFilter(null);
            } else if (fFloatValue != this.f68768l) {
                this.f68758b.setMaskFilter(this.f68759c.getBlurMaskFilter(fFloatValue));
            }
            this.f68768l = fFloatValue;
        }
        yr4 yr4Var = this.f68769m;
        if (yr4Var != null) {
            yr4Var.applyTo(this.f68758b);
        }
        this.f68757a.reset();
        for (int i2 = 0; i2 < this.f68762f.size(); i2++) {
            this.f68757a.addPath(this.f68762f.get(i2).getPath(), matrix);
        }
        canvas.drawPath(this.f68757a, this.f68758b);
        bt8.endSection("FillContent#draw");
    }

    @Override // p000.yq4
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f68757a.reset();
        for (int i = 0; i < this.f68762f.size(); i++) {
            this.f68757a.addPath(this.f68762f.get(i).getPath(), matrix);
        }
        this.f68757a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p000.gv2
    public String getName() {
        return this.f68760d;
    }

    @Override // p000.nr0.InterfaceC10013b
    public void onValueChanged() {
        this.f68766j.invalidateSelf();
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
                this.f68762f.add((yic) gv2Var);
            }
        }
    }
}
