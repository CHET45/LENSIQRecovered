package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p000.nr0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fu0 implements nr0.InterfaceC10013b, hr8, yq4 {

    /* JADX INFO: renamed from: e */
    public final go9 f37739e;

    /* JADX INFO: renamed from: f */
    public final pr0 f37740f;

    /* JADX INFO: renamed from: h */
    public final float[] f37742h;

    /* JADX INFO: renamed from: i */
    public final Paint f37743i;

    /* JADX INFO: renamed from: j */
    public final nr0<?, Float> f37744j;

    /* JADX INFO: renamed from: k */
    public final nr0<?, Integer> f37745k;

    /* JADX INFO: renamed from: l */
    public final List<nr0<?, Float>> f37746l;

    /* JADX INFO: renamed from: m */
    @hib
    public final nr0<?, Float> f37747m;

    /* JADX INFO: renamed from: n */
    @hib
    public nr0<ColorFilter, ColorFilter> f37748n;

    /* JADX INFO: renamed from: o */
    @hib
    public nr0<Float, Float> f37749o;

    /* JADX INFO: renamed from: p */
    public float f37750p;

    /* JADX INFO: renamed from: q */
    @hib
    public yr4 f37751q;

    /* JADX INFO: renamed from: a */
    public final PathMeasure f37735a = new PathMeasure();

    /* JADX INFO: renamed from: b */
    public final Path f37736b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f37737c = new Path();

    /* JADX INFO: renamed from: d */
    public final RectF f37738d = new RectF();

    /* JADX INFO: renamed from: g */
    public final List<C5980b> f37741g = new ArrayList();

    /* JADX INFO: renamed from: fu0$b */
    public static final class C5980b {

        /* JADX INFO: renamed from: a */
        public final List<yic> f37752a;

        /* JADX INFO: renamed from: b */
        @hib
        public final yih f37753b;

        private C5980b(@hib yih yihVar) {
            this.f37752a = new ArrayList();
            this.f37753b = yihVar;
        }
    }

    public fu0(go9 go9Var, pr0 pr0Var, Paint.Cap cap, Paint.Join join, float f, C16264zw c16264zw, C15326xw c15326xw, List<C15326xw> list, C15326xw c15326xw2) {
        it8 it8Var = new it8(1);
        this.f37743i = it8Var;
        this.f37750p = 0.0f;
        this.f37739e = go9Var;
        this.f37740f = pr0Var;
        it8Var.setStyle(Paint.Style.STROKE);
        it8Var.setStrokeCap(cap);
        it8Var.setStrokeJoin(join);
        it8Var.setStrokeMiter(f);
        this.f37745k = c16264zw.createAnimation();
        this.f37744j = c15326xw.createAnimation();
        if (c15326xw2 == null) {
            this.f37747m = null;
        } else {
            this.f37747m = c15326xw2.createAnimation();
        }
        this.f37746l = new ArrayList(list.size());
        this.f37742h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f37746l.add(list.get(i).createAnimation());
        }
        pr0Var.addAnimation(this.f37745k);
        pr0Var.addAnimation(this.f37744j);
        for (int i2 = 0; i2 < this.f37746l.size(); i2++) {
            pr0Var.addAnimation(this.f37746l.get(i2));
        }
        nr0<?, Float> nr0Var = this.f37747m;
        if (nr0Var != null) {
            pr0Var.addAnimation(nr0Var);
        }
        this.f37745k.addUpdateListener(this);
        this.f37744j.addUpdateListener(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f37746l.get(i3).addUpdateListener(this);
        }
        nr0<?, Float> nr0Var2 = this.f37747m;
        if (nr0Var2 != null) {
            nr0Var2.addUpdateListener(this);
        }
        if (pr0Var.getBlurEffect() != null) {
            nr0<Float, Float> nr0VarCreateAnimation = pr0Var.getBlurEffect().getBlurriness().createAnimation();
            this.f37749o = nr0VarCreateAnimation;
            nr0VarCreateAnimation.addUpdateListener(this);
            pr0Var.addAnimation(this.f37749o);
        }
        if (pr0Var.getDropShadowEffect() != null) {
            this.f37751q = new yr4(this, pr0Var, pr0Var.getDropShadowEffect());
        }
    }

    private void applyDashPatternIfNeeded(Matrix matrix) {
        bt8.beginSection("StrokeContent#applyDashPattern");
        if (this.f37746l.isEmpty()) {
            bt8.endSection("StrokeContent#applyDashPattern");
            return;
        }
        float scale = e1i.getScale(matrix);
        for (int i = 0; i < this.f37746l.size(); i++) {
            this.f37742h[i] = this.f37746l.get(i).getValue().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f37742h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f37742h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f37742h;
            fArr3[i] = fArr3[i] * scale;
        }
        nr0<?, Float> nr0Var = this.f37747m;
        this.f37743i.setPathEffect(new DashPathEffect(this.f37742h, nr0Var == null ? 0.0f : scale * nr0Var.getValue().floatValue()));
        bt8.endSection("StrokeContent#applyDashPattern");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void applyTrimPath(android.graphics.Canvas r17, p000.fu0.C5980b r18, android.graphics.Matrix r19) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fu0.applyTrimPath(android.graphics.Canvas, fu0$b, android.graphics.Matrix):void");
    }

    @un1
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        yr4 yr4Var;
        yr4 yr4Var2;
        yr4 yr4Var3;
        yr4 yr4Var4;
        yr4 yr4Var5;
        if (t == to9.f85487d) {
            this.f37745k.setValueCallback(bp9Var);
            return;
        }
        if (t == to9.f85502s) {
            this.f37744j.setValueCallback(bp9Var);
            return;
        }
        if (t == to9.f85479K) {
            nr0<ColorFilter, ColorFilter> nr0Var = this.f37748n;
            if (nr0Var != null) {
                this.f37740f.removeAnimation(nr0Var);
            }
            if (bp9Var == null) {
                this.f37748n = null;
                return;
            }
            d2i d2iVar = new d2i(bp9Var);
            this.f37748n = d2iVar;
            d2iVar.addUpdateListener(this);
            this.f37740f.addAnimation(this.f37748n);
            return;
        }
        if (t == to9.f85493j) {
            nr0<Float, Float> nr0Var2 = this.f37749o;
            if (nr0Var2 != null) {
                nr0Var2.setValueCallback(bp9Var);
                return;
            }
            d2i d2iVar2 = new d2i(bp9Var);
            this.f37749o = d2iVar2;
            d2iVar2.addUpdateListener(this);
            this.f37740f.addAnimation(this.f37749o);
            return;
        }
        if (t == to9.f85488e && (yr4Var5 = this.f37751q) != null) {
            yr4Var5.setColorCallback(bp9Var);
            return;
        }
        if (t == to9.f85475G && (yr4Var4 = this.f37751q) != null) {
            yr4Var4.setOpacityCallback(bp9Var);
            return;
        }
        if (t == to9.f85476H && (yr4Var3 = this.f37751q) != null) {
            yr4Var3.setDirectionCallback(bp9Var);
            return;
        }
        if (t == to9.f85477I && (yr4Var2 = this.f37751q) != null) {
            yr4Var2.setDistanceCallback(bp9Var);
        } else {
            if (t != to9.f85478J || (yr4Var = this.f37751q) == null) {
                return;
            }
            yr4Var.setRadiusCallback(bp9Var);
        }
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        bt8.beginSection("StrokeContent#draw");
        if (e1i.hasZeroScaleAxis(matrix)) {
            bt8.endSection("StrokeContent#draw");
            return;
        }
        this.f37743i.setAlpha(awa.clamp((int) ((((i / 255.0f) * ((c88) this.f37745k).getIntValue()) / 100.0f) * 255.0f), 0, 255));
        this.f37743i.setStrokeWidth(((n46) this.f37744j).getFloatValue() * e1i.getScale(matrix));
        if (this.f37743i.getStrokeWidth() <= 0.0f) {
            bt8.endSection("StrokeContent#draw");
            return;
        }
        applyDashPatternIfNeeded(matrix);
        nr0<ColorFilter, ColorFilter> nr0Var = this.f37748n;
        if (nr0Var != null) {
            this.f37743i.setColorFilter(nr0Var.getValue());
        }
        nr0<Float, Float> nr0Var2 = this.f37749o;
        if (nr0Var2 != null) {
            float fFloatValue = nr0Var2.getValue().floatValue();
            if (fFloatValue == 0.0f) {
                this.f37743i.setMaskFilter(null);
            } else if (fFloatValue != this.f37750p) {
                this.f37743i.setMaskFilter(this.f37740f.getBlurMaskFilter(fFloatValue));
            }
            this.f37750p = fFloatValue;
        }
        yr4 yr4Var = this.f37751q;
        if (yr4Var != null) {
            yr4Var.applyTo(this.f37743i);
        }
        for (int i2 = 0; i2 < this.f37741g.size(); i2++) {
            C5980b c5980b = this.f37741g.get(i2);
            if (c5980b.f37753b != null) {
                applyTrimPath(canvas, c5980b, matrix);
            } else {
                bt8.beginSection("StrokeContent#buildPath");
                this.f37736b.reset();
                for (int size = c5980b.f37752a.size() - 1; size >= 0; size--) {
                    this.f37736b.addPath(((yic) c5980b.f37752a.get(size)).getPath(), matrix);
                }
                bt8.endSection("StrokeContent#buildPath");
                bt8.beginSection("StrokeContent#drawPath");
                canvas.drawPath(this.f37736b, this.f37743i);
                bt8.endSection("StrokeContent#drawPath");
            }
        }
        bt8.endSection("StrokeContent#draw");
    }

    @Override // p000.yq4
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        bt8.beginSection("StrokeContent#getBounds");
        this.f37736b.reset();
        for (int i = 0; i < this.f37741g.size(); i++) {
            C5980b c5980b = this.f37741g.get(i);
            for (int i2 = 0; i2 < c5980b.f37752a.size(); i2++) {
                this.f37736b.addPath(((yic) c5980b.f37752a.get(i2)).getPath(), matrix);
            }
        }
        this.f37736b.computeBounds(this.f37738d, false);
        float floatValue = ((n46) this.f37744j).getFloatValue();
        RectF rectF2 = this.f37738d;
        float f = floatValue / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f37738d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        bt8.endSection("StrokeContent#getBounds");
    }

    @Override // p000.nr0.InterfaceC10013b
    public void onValueChanged() {
        this.f37739e.invalidateSelf();
    }

    @Override // p000.gr8
    public void resolveKeyPath(fr8 fr8Var, int i, List<fr8> list, fr8 fr8Var2) {
        awa.resolveKeyPath(fr8Var, i, list, fr8Var2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // p000.gv2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setContents(java.util.List<p000.gv2> r8, java.util.List<p000.gv2> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            gv2 r3 = (p000.gv2) r3
            boolean r4 = r3 instanceof p000.yih
            if (r4 == 0) goto L1f
            yih r3 = (p000.yih) r3
            g9f$a r4 = r3.m26125b()
            g9f$a r5 = p000.g9f.EnumC6176a.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.m26124a(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            gv2 r3 = (p000.gv2) r3
            boolean r4 = r3 instanceof p000.yih
            if (r4 == 0) goto L55
            r4 = r3
            yih r4 = (p000.yih) r4
            g9f$a r5 = r4.m26125b()
            g9f$a r6 = p000.g9f.EnumC6176a.INDIVIDUALLY
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List<fu0$b> r3 = r7.f37741g
            r3.add(r0)
        L4c:
            fu0$b r0 = new fu0$b
            r0.<init>(r4)
            r4.m26124a(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof p000.yic
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            fu0$b r0 = new fu0$b
            r0.<init>(r2)
        L60:
            java.util.List r4 = p000.fu0.C5980b.m11185a(r0)
            yic r3 = (p000.yic) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List<fu0$b> r8 = r7.f37741g
            r8.add(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fu0.setContents(java.util.List, java.util.List):void");
    }
}
