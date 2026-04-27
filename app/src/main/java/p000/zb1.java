package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public class zb1 extends jw4 implements Cloneable {

    /* JADX INFO: renamed from: C */
    public static final int f104660C = 180;

    /* JADX INFO: renamed from: F */
    public static final int f104661F = 270;

    /* JADX INFO: renamed from: H */
    public static final int f104662H = 180;

    /* JADX INFO: renamed from: L */
    public static final float f104663L = 1.75f;

    /* JADX INFO: renamed from: m */
    public static final int f104664m = 90;

    /* JADX INFO: renamed from: a */
    public float f104665a;

    /* JADX INFO: renamed from: b */
    public float f104666b;

    /* JADX INFO: renamed from: c */
    public float f104667c;

    /* JADX INFO: renamed from: d */
    public float f104668d;

    /* JADX INFO: renamed from: e */
    public float f104669e;

    /* JADX INFO: renamed from: f */
    public float f104670f = -1.0f;

    public zb1(float f, float f2, float f3) {
        this.f104666b = f;
        this.f104665a = f2;
        m26640e(f3);
        this.f104669e = 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public float m26637b() {
        return this.f104668d;
    }

    /* JADX INFO: renamed from: c */
    public float m26638c() {
        return this.f104666b;
    }

    /* JADX INFO: renamed from: d */
    public float m26639d() {
        return this.f104665a;
    }

    /* JADX INFO: renamed from: e */
    public void m26640e(@y46(from = 0.0d) float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f104668d = f;
    }

    /* JADX INFO: renamed from: f */
    public void m26641f(float f) {
        this.f104666b = f;
    }

    /* JADX INFO: renamed from: g */
    public void m26642g(float f) {
        this.f104665a = f;
    }

    @Override // p000.jw4
    public void getEdgePath(float f, float f2, float f3, @efb a9f a9fVar) {
        float f4;
        float f5;
        float f6 = this.f104667c;
        if (f6 == 0.0f) {
            a9fVar.lineTo(f, 0.0f);
            return;
        }
        float f7 = ((this.f104666b * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.f104665a;
        float f9 = f2 + this.f104669e;
        float f10 = (this.f104668d * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            a9fVar.lineTo(f, 0.0f);
            return;
        }
        float f11 = this.f104670f;
        float f12 = f11 * f3;
        boolean z = f11 == -1.0f || Math.abs((f11 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = f10;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float fSqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - fSqrt;
        float f16 = f9 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        a9fVar.lineTo(f15, 0.0f);
        float f18 = f8 * 2.0f;
        a9fVar.addArc(f15 - f8, 0.0f, f15 + f8, f18, 270.0f, degrees);
        if (z) {
            a9fVar.addArc(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.f104666b;
            float f20 = f12 * 2.0f;
            float f21 = f9 - f7;
            a9fVar.addArc(f21, -(f12 + f19), f21 + f19 + f20, f19 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f9 + f7;
            float f23 = this.f104666b;
            a9fVar.lineTo(f22 - ((f23 / 2.0f) + f12), f23 + f12);
            float f24 = this.f104666b;
            a9fVar.addArc(f22 - (f20 + f24), -(f12 + f24), f22, f24 + f12, 90.0f, f17 - 90.0f);
        }
        a9fVar.addArc(f16 - f8, 0.0f, f16 + f8, f18, 270.0f - degrees, degrees);
        a9fVar.lineTo(f, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.f104670f;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public float getFabDiameter() {
        return this.f104667c;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public float getHorizontalOffset() {
        return this.f104669e;
    }

    /* JADX INFO: renamed from: h */
    public void m26643h(float f) {
        this.f104669e = f;
    }

    public void setFabCornerSize(float f) {
        this.f104670f = f;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void setFabDiameter(float f) {
        this.f104667c = f;
    }
}
