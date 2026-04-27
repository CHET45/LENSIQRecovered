package p000;

import java.util.Set;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
public class d0b implements ymh {

    /* JADX INFO: renamed from: A */
    public static final int f28140A = 0;

    /* JADX INFO: renamed from: B */
    public static final int f28141B = 0;

    /* JADX INFO: renamed from: C */
    public static final int f28142C = -1;

    /* JADX INFO: renamed from: D */
    public static final int f28143D = -1;

    /* JADX INFO: renamed from: E */
    public static final int f28144E = -2;

    /* JADX INFO: renamed from: F */
    public static final int f28145F = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: G */
    public static final int f28146G = 1;

    /* JADX INFO: renamed from: m */
    public static final int f28147m = 0;

    /* JADX INFO: renamed from: n */
    public static final int f28148n = 1;

    /* JADX INFO: renamed from: o */
    public static final int f28149o = -1;

    /* JADX INFO: renamed from: p */
    public static final int f28150p = -2;

    /* JADX INFO: renamed from: q */
    public static final int f28151q = 0;

    /* JADX INFO: renamed from: r */
    public static final int f28152r = 4;

    /* JADX INFO: renamed from: s */
    public static final int f28153s = -3;

    /* JADX INFO: renamed from: t */
    public static final int f28154t = -4;

    /* JADX INFO: renamed from: u */
    public static final int f28155u = 0;

    /* JADX INFO: renamed from: v */
    public static final int f28156v = 1;

    /* JADX INFO: renamed from: w */
    public static final int f28157w = 2;

    /* JADX INFO: renamed from: x */
    public static final int f28158x = 3;

    /* JADX INFO: renamed from: y */
    public static final int f28159y = 4;

    /* JADX INFO: renamed from: z */
    public static final int f28160z = -1;

    /* JADX INFO: renamed from: h */
    public uki f28161h;

    /* JADX INFO: renamed from: i */
    public C4572a f28162i;

    /* JADX INFO: renamed from: j */
    public C4573b f28163j;

    /* JADX INFO: renamed from: k */
    public float f28164k;

    /* JADX INFO: renamed from: l */
    public float f28165l;

    /* JADX INFO: renamed from: d0b$a */
    public static class C4572a {

        /* JADX INFO: renamed from: n */
        public static final int f28166n = -2;

        /* JADX INFO: renamed from: o */
        public static final int f28167o = -1;

        /* JADX INFO: renamed from: p */
        public static final int f28168p = -3;

        /* JADX INFO: renamed from: a */
        public int f28169a = -1;

        /* JADX INFO: renamed from: b */
        public int f28170b = 0;

        /* JADX INFO: renamed from: c */
        public String f28171c = null;

        /* JADX INFO: renamed from: d */
        public int f28172d = -1;

        /* JADX INFO: renamed from: e */
        public int f28173e = 0;

        /* JADX INFO: renamed from: f */
        public float f28174f = Float.NaN;

        /* JADX INFO: renamed from: g */
        public int f28175g = -1;

        /* JADX INFO: renamed from: h */
        public float f28176h = Float.NaN;

        /* JADX INFO: renamed from: i */
        public float f28177i = Float.NaN;

        /* JADX INFO: renamed from: j */
        public int f28178j = -1;

        /* JADX INFO: renamed from: k */
        public String f28179k = null;

        /* JADX INFO: renamed from: l */
        public int f28180l = -3;

        /* JADX INFO: renamed from: m */
        public int f28181m = -1;
    }

    /* JADX INFO: renamed from: d0b$b */
    public static class C4573b {

        /* JADX INFO: renamed from: a */
        public int f28182a = 4;

        /* JADX INFO: renamed from: b */
        public int f28183b = 0;

        /* JADX INFO: renamed from: c */
        public float f28184c = 1.0f;

        /* JADX INFO: renamed from: d */
        public float f28185d = Float.NaN;
    }

    public d0b() {
        this.f28161h = new uki();
        this.f28162i = new C4572a();
        this.f28163j = new C4573b();
    }

    public d0b findViewById(int i) {
        return null;
    }

    public float getAlpha() {
        return this.f28163j.f28184c;
    }

    public int getBottom() {
        return this.f28161h.f88252e;
    }

    public ge3 getCustomAttribute(String str) {
        return this.f28161h.getCustomAttribute(str);
    }

    public Set<String> getCustomAttributeNames() {
        return this.f28161h.getCustomAttributeNames();
    }

    public int getHeight() {
        uki ukiVar = this.f28161h;
        return ukiVar.f88252e - ukiVar.f88250c;
    }

    @Override // p000.ymh
    public int getId(String str) {
        int id = ymh.InterfaceC15722a.getId(str);
        return id != -1 ? id : ymh.InterfaceC15726e.getId(str);
    }

    public int getLeft() {
        return this.f28161h.f88249b;
    }

    public String getName() {
        return this.f28161h.getId();
    }

    public d0b getParent() {
        return null;
    }

    public float getPivotX() {
        return this.f28161h.f88253f;
    }

    public float getPivotY() {
        return this.f28161h.f88254g;
    }

    public int getRight() {
        return this.f28161h.f88251d;
    }

    public float getRotationX() {
        return this.f28161h.f88255h;
    }

    public float getRotationY() {
        return this.f28161h.f88256i;
    }

    public float getRotationZ() {
        return this.f28161h.f88257j;
    }

    public float getScaleX() {
        return this.f28161h.f88261n;
    }

    public float getScaleY() {
        return this.f28161h.f88262o;
    }

    public int getTop() {
        return this.f28161h.f88250c;
    }

    public float getTranslationX() {
        return this.f28161h.f88258k;
    }

    public float getTranslationY() {
        return this.f28161h.f88259l;
    }

    public float getTranslationZ() {
        return this.f28161h.f88260m;
    }

    public float getValueAttributes(int i) {
        switch (i) {
            case 303:
                return this.f28161h.f88263p;
            case 304:
                return this.f28161h.f88258k;
            case 305:
                return this.f28161h.f88259l;
            case 306:
                return this.f28161h.f88260m;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.f28161h.f88255h;
            case 309:
                return this.f28161h.f88256i;
            case 310:
                return this.f28161h.f88257j;
            case 311:
                return this.f28161h.f88261n;
            case 312:
                return this.f28161h.f88262o;
            case 313:
                return this.f28161h.f88253f;
            case 314:
                return this.f28161h.f88254g;
            case 315:
                return this.f28164k;
            case ymh.InterfaceC15722a.f102113q /* 316 */:
                return this.f28165l;
        }
    }

    public int getVisibility() {
        return this.f28163j.f28182a;
    }

    public uki getWidgetFrame() {
        return this.f28161h;
    }

    public int getWidth() {
        uki ukiVar = this.f28161h;
        return ukiVar.f88251d - ukiVar.f88249b;
    }

    public int getX() {
        return this.f28161h.f88249b;
    }

    public int getY() {
        return this.f28161h.f88250c;
    }

    public void layout(int i, int i2, int i3, int i4) {
        setBounds(i, i2, i3, i4);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        if (this.f28161h == null) {
            this.f28161h = new uki((iu2) null);
        }
        uki ukiVar = this.f28161h;
        ukiVar.f88250c = i2;
        ukiVar.f88249b = i;
        ukiVar.f88251d = i3;
        ukiVar.f88252e = i4;
    }

    public void setCustomAttribute(String str, int i, float f) {
        this.f28161h.setCustomAttribute(str, i, f);
    }

    public void setInterpolatedValue(fb3 fb3Var, float[] fArr) {
        this.f28161h.setCustomAttribute(fb3Var.f35985b, 901, fArr[0]);
    }

    public void setPivotX(float f) {
        this.f28161h.f88253f = f;
    }

    public void setPivotY(float f) {
        this.f28161h.f88254g = f;
    }

    public void setRotationX(float f) {
        this.f28161h.f88255h = f;
    }

    public void setRotationY(float f) {
        this.f28161h.f88256i = f;
    }

    public void setRotationZ(float f) {
        this.f28161h.f88257j = f;
    }

    public void setScaleX(float f) {
        this.f28161h.f88261n = f;
    }

    public void setScaleY(float f) {
        this.f28161h.f88262o = f;
    }

    public void setTranslationX(float f) {
        this.f28161h.f88258k = f;
    }

    public void setTranslationY(float f) {
        this.f28161h.f88259l = f;
    }

    public void setTranslationZ(float f) {
        this.f28161h.f88260m = f;
    }

    @Override // p000.ymh
    public boolean setValue(int i, int i2) {
        return setValueAttributes(i, i2);
    }

    public boolean setValueAttributes(int i, float f) {
        switch (i) {
            case 303:
                this.f28161h.f88263p = f;
                return true;
            case 304:
                this.f28161h.f88258k = f;
                return true;
            case 305:
                this.f28161h.f88259l = f;
                return true;
            case 306:
                this.f28161h.f88260m = f;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.f28161h.f88255h = f;
                return true;
            case 309:
                this.f28161h.f88256i = f;
                return true;
            case 310:
                this.f28161h.f88257j = f;
                return true;
            case 311:
                this.f28161h.f88261n = f;
                return true;
            case 312:
                this.f28161h.f88262o = f;
                return true;
            case 313:
                this.f28161h.f88253f = f;
                return true;
            case 314:
                this.f28161h.f88254g = f;
                return true;
            case 315:
                this.f28164k = f;
                return true;
            case ymh.InterfaceC15722a.f102113q /* 316 */:
                this.f28165l = f;
                return true;
        }
    }

    public boolean setValueMotion(int i, int i2) {
        switch (i) {
            case ymh.InterfaceC15726e.f102213u /* 605 */:
                this.f28162i.f28169a = i2;
                return true;
            case ymh.InterfaceC15726e.f102214v /* 606 */:
                this.f28162i.f28170b = i2;
                return true;
            case ymh.InterfaceC15726e.f102215w /* 607 */:
                this.f28162i.f28172d = i2;
                return true;
            case ymh.InterfaceC15726e.f102216x /* 608 */:
                this.f28162i.f28173e = i2;
                return true;
            case ymh.InterfaceC15726e.f102217y /* 609 */:
                this.f28162i.f28175g = i2;
                return true;
            case ymh.InterfaceC15726e.f102218z /* 610 */:
                this.f28162i.f28178j = i2;
                return true;
            case ymh.InterfaceC15726e.f102191A /* 611 */:
                this.f28162i.f28180l = i2;
                return true;
            case ymh.InterfaceC15726e.f102192B /* 612 */:
                this.f28162i.f28181m = i2;
                return true;
            default:
                return false;
        }
    }

    public void setVisibility(int i) {
        this.f28163j.f28182a = i;
    }

    public String toString() {
        return this.f28161h.f88249b + ", " + this.f28161h.f88250c + ", " + this.f28161h.f88251d + ", " + this.f28161h.f88252e;
    }

    public void setCustomAttribute(String str, int i, int i2) {
        this.f28161h.setCustomAttribute(str, i, i2);
    }

    @Override // p000.ymh
    public boolean setValue(int i, float f) {
        if (setValueAttributes(i, f)) {
            return true;
        }
        return setValueMotion(i, f);
    }

    public void setCustomAttribute(String str, int i, boolean z) {
        this.f28161h.setCustomAttribute(str, i, z);
    }

    public void setCustomAttribute(String str, int i, String str2) {
        this.f28161h.setCustomAttribute(str, i, str2);
    }

    @Override // p000.ymh
    public boolean setValue(int i, String str) {
        return setValueMotion(i, str);
    }

    public d0b(uki ukiVar) {
        this.f28161h = new uki();
        this.f28162i = new C4572a();
        this.f28163j = new C4573b();
        this.f28161h = ukiVar;
    }

    @Override // p000.ymh
    public boolean setValue(int i, boolean z) {
        return false;
    }

    public boolean setValueMotion(int i, String str) {
        if (i == 603) {
            this.f28162i.f28171c = str;
            return true;
        }
        if (i != 604) {
            return false;
        }
        this.f28162i.f28179k = str;
        return true;
    }

    public boolean setValueMotion(int i, float f) {
        switch (i) {
            case 600:
                this.f28162i.f28174f = f;
                return true;
            case 601:
                this.f28162i.f28176h = f;
                return true;
            case ymh.InterfaceC15726e.f102210r /* 602 */:
                this.f28162i.f28177i = f;
                return true;
            default:
                return false;
        }
    }
}
