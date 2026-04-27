package p000;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import p000.nr0;

/* JADX INFO: loaded from: classes3.dex */
public class avd implements nr0.InterfaceC10013b, hr8, yic {

    /* JADX INFO: renamed from: c */
    public final String f11934c;

    /* JADX INFO: renamed from: d */
    public final boolean f11935d;

    /* JADX INFO: renamed from: e */
    public final go9 f11936e;

    /* JADX INFO: renamed from: f */
    public final nr0<?, PointF> f11937f;

    /* JADX INFO: renamed from: g */
    public final nr0<?, PointF> f11938g;

    /* JADX INFO: renamed from: h */
    public final nr0<?, Float> f11939h;

    /* JADX INFO: renamed from: k */
    public boolean f11942k;

    /* JADX INFO: renamed from: a */
    public final Path f11932a = new Path();

    /* JADX INFO: renamed from: b */
    public final RectF f11933b = new RectF();

    /* JADX INFO: renamed from: i */
    public final eo2 f11940i = new eo2();

    /* JADX INFO: renamed from: j */
    @hib
    public nr0<Float, Float> f11941j = null;

    public avd(go9 go9Var, pr0 pr0Var, bvd bvdVar) {
        this.f11934c = bvdVar.getName();
        this.f11935d = bvdVar.isHidden();
        this.f11936e = go9Var;
        nr0<PointF, PointF> nr0VarCreateAnimation = bvdVar.getPosition().createAnimation();
        this.f11937f = nr0VarCreateAnimation;
        nr0<PointF, PointF> nr0VarCreateAnimation2 = bvdVar.getSize().createAnimation();
        this.f11938g = nr0VarCreateAnimation2;
        nr0<Float, Float> nr0VarCreateAnimation3 = bvdVar.getCornerRadius().createAnimation();
        this.f11939h = nr0VarCreateAnimation3;
        pr0Var.addAnimation(nr0VarCreateAnimation);
        pr0Var.addAnimation(nr0VarCreateAnimation2);
        pr0Var.addAnimation(nr0VarCreateAnimation3);
        nr0VarCreateAnimation.addUpdateListener(this);
        nr0VarCreateAnimation2.addUpdateListener(this);
        nr0VarCreateAnimation3.addUpdateListener(this);
    }

    private void invalidate() {
        this.f11942k = false;
        this.f11936e.invalidateSelf();
    }

    @Override // p000.gr8
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        if (t == to9.f85495l) {
            this.f11938g.setValueCallback(bp9Var);
        } else if (t == to9.f85497n) {
            this.f11937f.setValueCallback(bp9Var);
        } else if (t == to9.f85496m) {
            this.f11939h.setValueCallback(bp9Var);
        }
    }

    @Override // p000.gv2
    public String getName() {
        return this.f11934c;
    }

    @Override // p000.yic
    public Path getPath() {
        nr0<Float, Float> nr0Var;
        if (this.f11942k) {
            return this.f11932a;
        }
        this.f11932a.reset();
        if (this.f11935d) {
            this.f11942k = true;
            return this.f11932a;
        }
        PointF value = this.f11938g.getValue();
        float f = value.x / 2.0f;
        float f2 = value.y / 2.0f;
        nr0<?, Float> nr0Var2 = this.f11939h;
        float floatValue = nr0Var2 == null ? 0.0f : ((n46) nr0Var2).getFloatValue();
        if (floatValue == 0.0f && (nr0Var = this.f11941j) != null) {
            floatValue = Math.min(nr0Var.getValue().floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (floatValue > fMin) {
            floatValue = fMin;
        }
        PointF value2 = this.f11937f.getValue();
        this.f11932a.moveTo(value2.x + f, (value2.y - f2) + floatValue);
        this.f11932a.lineTo(value2.x + f, (value2.y + f2) - floatValue);
        if (floatValue > 0.0f) {
            RectF rectF = this.f11933b;
            float f3 = value2.x;
            float f4 = floatValue * 2.0f;
            float f5 = value2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.f11932a.arcTo(this.f11933b, 0.0f, 90.0f, false);
        }
        this.f11932a.lineTo((value2.x - f) + floatValue, value2.y + f2);
        if (floatValue > 0.0f) {
            RectF rectF2 = this.f11933b;
            float f6 = value2.x;
            float f7 = value2.y;
            float f8 = floatValue * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.f11932a.arcTo(this.f11933b, 90.0f, 90.0f, false);
        }
        this.f11932a.lineTo(value2.x - f, (value2.y - f2) + floatValue);
        if (floatValue > 0.0f) {
            RectF rectF3 = this.f11933b;
            float f9 = value2.x;
            float f10 = value2.y;
            float f11 = floatValue * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.f11932a.arcTo(this.f11933b, 180.0f, 90.0f, false);
        }
        this.f11932a.lineTo((value2.x + f) - floatValue, value2.y - f2);
        if (floatValue > 0.0f) {
            RectF rectF4 = this.f11933b;
            float f12 = value2.x;
            float f13 = floatValue * 2.0f;
            float f14 = value2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.f11932a.arcTo(this.f11933b, 270.0f, 90.0f, false);
        }
        this.f11932a.close();
        this.f11940i.apply(this.f11932a);
        this.f11942k = true;
        return this.f11932a;
    }

    @Override // p000.nr0.InterfaceC10013b
    public void onValueChanged() {
        invalidate();
    }

    @Override // p000.gr8
    public void resolveKeyPath(fr8 fr8Var, int i, List<fr8> list, fr8 fr8Var2) {
        awa.resolveKeyPath(fr8Var, i, list, fr8Var2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // p000.gv2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setContents(java.util.List<p000.gv2> r5, java.util.List<p000.gv2> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            gv2 r0 = (p000.gv2) r0
            boolean r1 = r0 instanceof p000.yih
            if (r1 == 0) goto L25
            r1 = r0
            yih r1 = (p000.yih) r1
            g9f$a r2 = r1.m26125b()
            g9f$a r3 = p000.g9f.EnumC6176a.SIMULTANEOUSLY
            if (r2 != r3) goto L25
            eo2 r0 = r4.f11940i
            r0.m10164a(r1)
            r1.m26124a(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof p000.zbe
            if (r1 == 0) goto L31
            zbe r0 = (p000.zbe) r0
            nr0 r0 = r0.getRoundedCorners()
            r4.f11941j = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.avd.setContents(java.util.List, java.util.List):void");
    }
}
