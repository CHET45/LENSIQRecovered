package p000;

import java.util.HashMap;
import java.util.HashSet;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
public class rza extends oza {

    /* JADX INFO: renamed from: L */
    public static final String f80185L = "KeyPosition";

    /* JADX INFO: renamed from: M */
    public static final float f80186M = 20.0f;

    /* JADX INFO: renamed from: N */
    public static final int f80187N = 2;

    /* JADX INFO: renamed from: O */
    public static final int f80188O = 1;

    /* JADX INFO: renamed from: P */
    public static final int f80189P = 0;

    /* JADX INFO: renamed from: Q */
    public static final int f80190Q = 2;

    /* JADX INFO: renamed from: A */
    public int f80191A;

    /* JADX INFO: renamed from: B */
    public int f80192B;

    /* JADX INFO: renamed from: C */
    public float f80193C;

    /* JADX INFO: renamed from: D */
    public float f80194D;

    /* JADX INFO: renamed from: E */
    public float f80195E;

    /* JADX INFO: renamed from: F */
    public float f80196F;

    /* JADX INFO: renamed from: G */
    public float f80197G;

    /* JADX INFO: renamed from: H */
    public float f80198H;

    /* JADX INFO: renamed from: I */
    public int f80199I;

    /* JADX INFO: renamed from: J */
    public float f80200J;

    /* JADX INFO: renamed from: K */
    public float f80201K;

    /* JADX INFO: renamed from: y */
    public int f80202y;

    /* JADX INFO: renamed from: z */
    public String f80203z;

    public rza() {
        int i = oza.f69262m;
        this.f80202y = i;
        this.f80203z = null;
        this.f80191A = i;
        this.f80192B = 0;
        this.f80193C = Float.NaN;
        this.f80194D = Float.NaN;
        this.f80195E = Float.NaN;
        this.f80196F = Float.NaN;
        this.f80197G = Float.NaN;
        this.f80198H = Float.NaN;
        this.f80199I = 0;
        this.f80200J = Float.NaN;
        this.f80201K = Float.NaN;
        this.f69277k = 2;
    }

    private void calcCartesianPosition(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = Float.isNaN(this.f80195E) ? 0.0f : this.f80195E;
        float f8 = Float.isNaN(this.f80198H) ? 0.0f : this.f80198H;
        float f9 = Float.isNaN(this.f80196F) ? 0.0f : this.f80196F;
        this.f80200J = (int) (f + (f7 * f5) + ((Float.isNaN(this.f80197G) ? 0.0f : this.f80197G) * f6));
        this.f80201K = (int) (f2 + (f5 * f8) + (f6 * f9));
    }

    private void calcPathPosition(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = this.f80195E;
        float f8 = this.f80196F;
        this.f80200J = f + (f5 * f7) + ((-f6) * f8);
        this.f80201K = f2 + (f6 * f7) + (f5 * f8);
    }

    private void calcScreenPosition(int i, int i2) {
        float f = this.f80195E;
        float f2 = 0;
        this.f80200J = (i * f) + f2;
        this.f80201K = (i2 * f) + f2;
    }

    @Override // p000.oza
    public void addValues(HashMap<String, wyf> map) {
    }

    @Override // p000.oza
    public oza copy(oza ozaVar) {
        super.copy(ozaVar);
        rza rzaVar = (rza) ozaVar;
        this.f80203z = rzaVar.f80203z;
        this.f80191A = rzaVar.f80191A;
        this.f80192B = rzaVar.f80192B;
        this.f80193C = rzaVar.f80193C;
        this.f80194D = Float.NaN;
        this.f80195E = rzaVar.f80195E;
        this.f80196F = rzaVar.f80196F;
        this.f80197G = rzaVar.f80197G;
        this.f80198H = rzaVar.f80198H;
        this.f80200J = rzaVar.f80200J;
        this.f80201K = rzaVar.f80201K;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void m21616e(int i, int i2, float f, float f2, float f3, float f4) {
        int i3 = this.f80199I;
        if (i3 == 1) {
            calcPathPosition(f, f2, f3, f4);
        } else if (i3 != 2) {
            calcCartesianPosition(f, f2, f3, f4);
        } else {
            calcScreenPosition(i, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public float m21617f() {
        return this.f80200J;
    }

    /* JADX INFO: renamed from: g */
    public float m21618g() {
        return this.f80201K;
    }

    @Override // p000.oza
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    @Override // p000.ymh
    public int getId(String str) {
        return ymh.InterfaceC15728g.getId(str);
    }

    /* JADX INFO: renamed from: h */
    public void m21619h(z46 z46Var, z46 z46Var2, float f, float f2, String[] strArr, float[] fArr) {
        float fCenterX = z46Var.centerX();
        float fCenterY = z46Var.centerY();
        float fCenterX2 = z46Var2.centerX() - fCenterX;
        float fCenterY2 = z46Var2.centerY() - fCenterY;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f - fCenterX) / fCenterX2;
            strArr[1] = "percentY";
            fArr[1] = (f2 - fCenterY) / fCenterY2;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = (f - fCenterX) / fCenterX2;
            fArr[1] = (f2 - fCenterY) / fCenterY2;
        } else {
            fArr[1] = (f - fCenterX) / fCenterX2;
            fArr[0] = (f2 - fCenterY) / fCenterY2;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m21620i(z46 z46Var, z46 z46Var2, float f, float f2, String[] strArr, float[] fArr) {
        float fCenterX = z46Var.centerX();
        float fCenterY = z46Var.centerY();
        float fCenterX2 = z46Var2.centerX() - fCenterX;
        float fCenterY2 = z46Var2.centerY() - fCenterY;
        float fHypot = (float) Math.hypot(fCenterX2, fCenterY2);
        if (fHypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f3 = fCenterX2 / fHypot;
        float f4 = fCenterY2 / fHypot;
        float f5 = f2 - fCenterY;
        float f6 = f - fCenterX;
        float f7 = ((f3 * f5) - (f6 * f4)) / fHypot;
        float f8 = ((f3 * f6) + (f4 * f5)) / fHypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f8;
                fArr[1] = f7;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f8;
        fArr[1] = f7;
    }

    public boolean intersects(int i, int i2, z46 z46Var, z46 z46Var2, float f, float f2) {
        m21616e(i, i2, z46Var.centerX(), z46Var.centerY(), z46Var2.centerX(), z46Var2.centerY());
        return Math.abs(f - this.f80200J) < 20.0f && Math.abs(f2 - this.f80201K) < 20.0f;
    }

    /* JADX INFO: renamed from: j */
    public void m21621j(d0b d0bVar, z46 z46Var, z46 z46Var2, float f, float f2, String[] strArr, float[] fArr) {
        z46Var.centerX();
        z46Var.centerY();
        z46Var2.centerX();
        z46Var2.centerY();
        d0b parent = d0bVar.getParent();
        int width = parent.getWidth();
        int height = parent.getHeight();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = f / width;
            strArr[1] = "percentY";
            fArr[1] = f2 / height;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = f / width;
            fArr[1] = f2 / height;
        } else {
            fArr[1] = f / width;
            fArr[0] = f2 / height;
        }
    }

    public void positionAttributes(d0b d0bVar, z46 z46Var, z46 z46Var2, float f, float f2, String[] strArr, float[] fArr) {
        int i = this.f80199I;
        if (i == 1) {
            m21620i(z46Var, z46Var2, f, f2, strArr, fArr);
        } else if (i != 2) {
            m21619h(z46Var, z46Var2, f, f2, strArr, fArr);
        } else {
            m21621j(d0bVar, z46Var, z46Var2, f, f2, strArr, fArr);
        }
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, int i2) {
        if (i == 100) {
            this.f69274h = i2;
            return true;
        }
        if (i == 508) {
            this.f80202y = i2;
            return true;
        }
        if (i != 510) {
            return super.setValue(i, i2);
        }
        this.f80199I = i2;
        return true;
    }

    @Override // p000.oza
    public oza clone() {
        return new rza().copy(this);
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, float f) {
        switch (i) {
            case 503:
                this.f80193C = f;
                return true;
            case 504:
                this.f80194D = f;
                return true;
            case ymh.InterfaceC15728g.f102254m /* 505 */:
                this.f80193C = f;
                this.f80194D = f;
                return true;
            case ymh.InterfaceC15728g.f102255n /* 506 */:
                this.f80195E = f;
                return true;
            case 507:
                this.f80196F = f;
                return true;
            default:
                return super.setValue(i, f);
        }
    }

    @Override // p000.oza, p000.ymh
    public boolean setValue(int i, String str) {
        if (i != 501) {
            return super.setValue(i, str);
        }
        this.f80203z = str.toString();
        return true;
    }
}
