package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p000.g9f;
import p000.nr0;

/* JADX INFO: loaded from: classes3.dex */
public class ky4 implements yic, nr0.InterfaceC10013b, hr8 {

    /* JADX INFO: renamed from: i */
    public static final float f55620i = 0.55228f;

    /* JADX INFO: renamed from: b */
    public final String f55622b;

    /* JADX INFO: renamed from: c */
    public final go9 f55623c;

    /* JADX INFO: renamed from: d */
    public final nr0<?, PointF> f55624d;

    /* JADX INFO: renamed from: e */
    public final nr0<?, PointF> f55625e;

    /* JADX INFO: renamed from: f */
    public final f02 f55626f;

    /* JADX INFO: renamed from: h */
    public boolean f55628h;

    /* JADX INFO: renamed from: a */
    public final Path f55621a = new Path();

    /* JADX INFO: renamed from: g */
    public final eo2 f55627g = new eo2();

    public ky4(go9 go9Var, pr0 pr0Var, f02 f02Var) {
        this.f55622b = f02Var.getName();
        this.f55623c = go9Var;
        nr0<PointF, PointF> nr0VarCreateAnimation = f02Var.getSize().createAnimation();
        this.f55624d = nr0VarCreateAnimation;
        nr0<PointF, PointF> nr0VarCreateAnimation2 = f02Var.getPosition().createAnimation();
        this.f55625e = nr0VarCreateAnimation2;
        this.f55626f = f02Var;
        pr0Var.addAnimation(nr0VarCreateAnimation);
        pr0Var.addAnimation(nr0VarCreateAnimation2);
        nr0VarCreateAnimation.addUpdateListener(this);
        nr0VarCreateAnimation2.addUpdateListener(this);
    }

    private void invalidate() {
        this.f55628h = false;
        this.f55623c.invalidateSelf();
    }

    @Override // p000.gr8
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        if (t == to9.f85494k) {
            this.f55624d.setValueCallback(bp9Var);
        } else if (t == to9.f85497n) {
            this.f55625e.setValueCallback(bp9Var);
        }
    }

    @Override // p000.gv2
    public String getName() {
        return this.f55622b;
    }

    @Override // p000.yic
    public Path getPath() {
        if (this.f55628h) {
            return this.f55621a;
        }
        this.f55621a.reset();
        if (this.f55626f.isHidden()) {
            this.f55628h = true;
            return this.f55621a;
        }
        PointF value = this.f55624d.getValue();
        float f = value.x / 2.0f;
        float f2 = value.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f55621a.reset();
        if (this.f55626f.isReversed()) {
            float f5 = -f2;
            this.f55621a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f55621a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.f55621a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.f55621a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.f55621a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.f55621a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.f55621a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.f55621a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.f55621a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.f55621a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF value2 = this.f55625e.getValue();
        this.f55621a.offset(value2.x, value2.y);
        this.f55621a.close();
        this.f55627g.apply(this.f55621a);
        this.f55628h = true;
        return this.f55621a;
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
                    this.f55627g.m10164a(yihVar);
                    yihVar.m26124a(this);
                }
            }
        }
    }
}
