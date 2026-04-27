package p000;

/* JADX INFO: loaded from: classes.dex */
public class k4i {

    /* JADX INFO: renamed from: g */
    public static String f52591g = "VelocityMatrix";

    /* JADX INFO: renamed from: a */
    public float f52592a;

    /* JADX INFO: renamed from: b */
    public float f52593b;

    /* JADX INFO: renamed from: c */
    public float f52594c;

    /* JADX INFO: renamed from: d */
    public float f52595d;

    /* JADX INFO: renamed from: e */
    public float f52596e;

    /* JADX INFO: renamed from: f */
    public float f52597f;

    public void applyTransform(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f52594c;
        float f8 = f4 + this.f52595d;
        float f9 = f7 + (this.f52592a * f5);
        float f10 = f8 + (this.f52593b * f6);
        float radians = (float) Math.toRadians(this.f52597f);
        float radians2 = (float) Math.toRadians(this.f52596e);
        double d = radians;
        double d2 = i2 * f6;
        float fSin = f9 + (((float) ((((double) ((-i) * f5)) * Math.sin(d)) - (Math.cos(d) * d2))) * radians2);
        float fCos = f10 + (radians2 * ((float) ((((double) (i * f5)) * Math.cos(d)) - (d2 * Math.sin(d)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void clear() {
        this.f52596e = 0.0f;
        this.f52595d = 0.0f;
        this.f52594c = 0.0f;
        this.f52593b = 0.0f;
        this.f52592a = 0.0f;
    }

    public void setRotationVelocity(wyf wyfVar, float f) {
        if (wyfVar != null) {
            this.f52596e = wyfVar.getSlope(f);
            this.f52597f = wyfVar.get(f);
        }
    }

    public void setScaleVelocity(wyf wyfVar, wyf wyfVar2, float f) {
        if (wyfVar != null) {
            this.f52592a = wyfVar.getSlope(f);
        }
        if (wyfVar2 != null) {
            this.f52593b = wyfVar2.getSlope(f);
        }
    }

    public void setTranslationVelocity(wyf wyfVar, wyf wyfVar2, float f) {
        if (wyfVar != null) {
            this.f52594c = wyfVar.getSlope(f);
        }
        if (wyfVar2 != null) {
            this.f52595d = wyfVar2.getSlope(f);
        }
    }

    public void setRotationVelocity(jq8 jq8Var, float f) {
        if (jq8Var != null) {
            this.f52596e = jq8Var.getSlope(f);
        }
    }

    public void setScaleVelocity(jq8 jq8Var, jq8 jq8Var2, float f) {
        if (jq8Var != null) {
            this.f52592a = jq8Var.getSlope(f);
        }
        if (jq8Var2 != null) {
            this.f52593b = jq8Var2.getSlope(f);
        }
    }

    public void setTranslationVelocity(jq8 jq8Var, jq8 jq8Var2, float f) {
        if (jq8Var != null) {
            this.f52594c = jq8Var.getSlope(f);
        }
        if (jq8Var2 != null) {
            this.f52595d = jq8Var2.getSlope(f);
        }
    }
}
