package p000;

import p000.iu2;

/* JADX INFO: loaded from: classes.dex */
public class zc4 {

    /* JADX INFO: renamed from: i */
    public static final Object f104746i = new Object();

    /* JADX INFO: renamed from: j */
    public static final Object f104747j = new Object();

    /* JADX INFO: renamed from: k */
    public static final Object f104748k = new Object();

    /* JADX INFO: renamed from: l */
    public static final Object f104749l = new Object();

    /* JADX INFO: renamed from: m */
    public static final Object f104750m = new Object();

    /* JADX INFO: renamed from: n */
    public static final Object f104751n = new Object();

    /* JADX INFO: renamed from: a */
    public final int f104752a;

    /* JADX INFO: renamed from: b */
    public int f104753b;

    /* JADX INFO: renamed from: c */
    public int f104754c;

    /* JADX INFO: renamed from: d */
    public float f104755d;

    /* JADX INFO: renamed from: e */
    public int f104756e;

    /* JADX INFO: renamed from: f */
    public String f104757f;

    /* JADX INFO: renamed from: g */
    public Object f104758g;

    /* JADX INFO: renamed from: h */
    public boolean f104759h;

    /* JADX INFO: renamed from: zc4$a */
    public enum EnumC16085a {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    private zc4() {
        this.f104752a = -2;
        this.f104753b = 0;
        this.f104754c = Integer.MAX_VALUE;
        this.f104755d = 1.0f;
        this.f104756e = 0;
        this.f104757f = null;
        this.f104758g = f104747j;
        this.f104759h = false;
    }

    public static zc4 Fixed(int i) {
        zc4 zc4Var = new zc4(f104746i);
        zc4Var.fixed(i);
        return zc4Var;
    }

    public static zc4 Parent() {
        return new zc4(f104749l);
    }

    public static zc4 Percent(Object obj, float f) {
        zc4 zc4Var = new zc4(f104750m);
        zc4Var.percent(obj, f);
        return zc4Var;
    }

    public static zc4 Ratio(String str) {
        zc4 zc4Var = new zc4(f104751n);
        zc4Var.ratio(str);
        return zc4Var;
    }

    public static zc4 Spread() {
        return new zc4(f104748k);
    }

    public static zc4 Suggested(int i) {
        zc4 zc4Var = new zc4();
        zc4Var.suggested(i);
        return zc4Var;
    }

    public static zc4 Wrap() {
        return new zc4(f104747j);
    }

    /* JADX INFO: renamed from: a */
    public int m26653a() {
        return this.f104756e;
    }

    public void apply(f2g f2gVar, iu2 iu2Var, int i) {
        String str = this.f104757f;
        if (str != null) {
            iu2Var.setDimensionRatio(str);
        }
        int i2 = 2;
        if (i == 0) {
            if (this.f104759h) {
                iu2Var.setHorizontalDimensionBehaviour(iu2.EnumC7619b.MATCH_CONSTRAINT);
                Object obj = this.f104758g;
                if (obj == f104747j) {
                    i2 = 1;
                } else if (obj != f104750m) {
                    i2 = 0;
                }
                iu2Var.setHorizontalMatchStyle(i2, this.f104753b, this.f104754c, this.f104755d);
                return;
            }
            int i3 = this.f104753b;
            if (i3 > 0) {
                iu2Var.setMinWidth(i3);
            }
            int i4 = this.f104754c;
            if (i4 < Integer.MAX_VALUE) {
                iu2Var.setMaxWidth(i4);
            }
            Object obj2 = this.f104758g;
            if (obj2 == f104747j) {
                iu2Var.setHorizontalDimensionBehaviour(iu2.EnumC7619b.WRAP_CONTENT);
                return;
            }
            if (obj2 == f104749l) {
                iu2Var.setHorizontalDimensionBehaviour(iu2.EnumC7619b.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    iu2Var.setHorizontalDimensionBehaviour(iu2.EnumC7619b.FIXED);
                    iu2Var.setWidth(this.f104756e);
                    return;
                }
                return;
            }
        }
        if (this.f104759h) {
            iu2Var.setVerticalDimensionBehaviour(iu2.EnumC7619b.MATCH_CONSTRAINT);
            Object obj3 = this.f104758g;
            if (obj3 == f104747j) {
                i2 = 1;
            } else if (obj3 != f104750m) {
                i2 = 0;
            }
            iu2Var.setVerticalMatchStyle(i2, this.f104753b, this.f104754c, this.f104755d);
            return;
        }
        int i5 = this.f104753b;
        if (i5 > 0) {
            iu2Var.setMinHeight(i5);
        }
        int i6 = this.f104754c;
        if (i6 < Integer.MAX_VALUE) {
            iu2Var.setMaxHeight(i6);
        }
        Object obj4 = this.f104758g;
        if (obj4 == f104747j) {
            iu2Var.setVerticalDimensionBehaviour(iu2.EnumC7619b.WRAP_CONTENT);
            return;
        }
        if (obj4 == f104749l) {
            iu2Var.setVerticalDimensionBehaviour(iu2.EnumC7619b.MATCH_PARENT);
        } else if (obj4 == null) {
            iu2Var.setVerticalDimensionBehaviour(iu2.EnumC7619b.FIXED);
            iu2Var.setHeight(this.f104756e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m26654b(int i) {
        this.f104759h = false;
        this.f104758g = null;
        this.f104756e = i;
    }

    public boolean equalsFixedValue(int i) {
        return this.f104758g == null && this.f104756e == i;
    }

    public zc4 fixed(Object obj) {
        this.f104758g = obj;
        if (obj instanceof Integer) {
            this.f104756e = ((Integer) obj).intValue();
            this.f104758g = null;
        }
        return this;
    }

    public zc4 max(int i) {
        if (this.f104754c >= 0) {
            this.f104754c = i;
        }
        return this;
    }

    public zc4 min(int i) {
        if (i >= 0) {
            this.f104753b = i;
        }
        return this;
    }

    public zc4 percent(Object obj, float f) {
        this.f104755d = f;
        return this;
    }

    public zc4 ratio(String str) {
        this.f104757f = str;
        return this;
    }

    public zc4 suggested(int i) {
        this.f104759h = true;
        if (i >= 0) {
            this.f104754c = i;
        }
        return this;
    }

    public zc4 min(Object obj) {
        if (obj == f104747j) {
            this.f104753b = -2;
        }
        return this;
    }

    public static zc4 Fixed(Object obj) {
        zc4 zc4Var = new zc4(f104746i);
        zc4Var.fixed(obj);
        return zc4Var;
    }

    public static zc4 Suggested(Object obj) {
        zc4 zc4Var = new zc4();
        zc4Var.suggested(obj);
        return zc4Var;
    }

    public zc4 max(Object obj) {
        Object obj2 = f104747j;
        if (obj == obj2 && this.f104759h) {
            this.f104758g = obj2;
            this.f104754c = Integer.MAX_VALUE;
        }
        return this;
    }

    public zc4 suggested(Object obj) {
        this.f104758g = obj;
        this.f104759h = true;
        return this;
    }

    public zc4 fixed(int i) {
        this.f104758g = null;
        this.f104756e = i;
        return this;
    }

    private zc4(Object obj) {
        this.f104752a = -2;
        this.f104753b = 0;
        this.f104754c = Integer.MAX_VALUE;
        this.f104755d = 1.0f;
        this.f104756e = 0;
        this.f104757f = null;
        this.f104759h = false;
        this.f104758g = obj;
    }
}
