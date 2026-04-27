package p000;

import java.util.ArrayList;
import java.util.HashMap;
import p000.iu2;

/* JADX INFO: loaded from: classes.dex */
public class x56 extends adi {

    /* JADX INFO: renamed from: o2 */
    public static final int f96766o2 = 0;

    /* JADX INFO: renamed from: p2 */
    public static final int f96767p2 = 1;

    /* JADX INFO: renamed from: q2 */
    public static final int f96768q2 = 2;

    /* JADX INFO: renamed from: r2 */
    public static final int f96769r2 = 0;

    /* JADX INFO: renamed from: s2 */
    public static final int f96770s2 = 1;

    /* JADX INFO: renamed from: t2 */
    public static final int f96771t2 = 2;

    /* JADX INFO: renamed from: u2 */
    public static final int f96772u2 = 3;

    /* JADX INFO: renamed from: v2 */
    public static final int f96773v2 = 0;

    /* JADX INFO: renamed from: w2 */
    public static final int f96774w2 = 1;

    /* JADX INFO: renamed from: x2 */
    public static final int f96775x2 = 2;

    /* JADX INFO: renamed from: y2 */
    public static final int f96776y2 = 3;

    /* JADX INFO: renamed from: m2 */
    public iu2[] f96800m2;

    /* JADX INFO: renamed from: P1 */
    public int f96777P1 = -1;

    /* JADX INFO: renamed from: Q1 */
    public int f96778Q1 = -1;

    /* JADX INFO: renamed from: R1 */
    public int f96779R1 = -1;

    /* JADX INFO: renamed from: S1 */
    public int f96780S1 = -1;

    /* JADX INFO: renamed from: T1 */
    public int f96781T1 = -1;

    /* JADX INFO: renamed from: U1 */
    public int f96782U1 = -1;

    /* JADX INFO: renamed from: V1 */
    public float f96783V1 = 0.5f;

    /* JADX INFO: renamed from: W1 */
    public float f96784W1 = 0.5f;

    /* JADX INFO: renamed from: X1 */
    public float f96785X1 = 0.5f;

    /* JADX INFO: renamed from: Y1 */
    public float f96786Y1 = 0.5f;

    /* JADX INFO: renamed from: Z1 */
    public float f96787Z1 = 0.5f;

    /* JADX INFO: renamed from: a2 */
    public float f96788a2 = 0.5f;

    /* JADX INFO: renamed from: b2 */
    public int f96789b2 = 0;

    /* JADX INFO: renamed from: c2 */
    public int f96790c2 = 0;

    /* JADX INFO: renamed from: d2 */
    public int f96791d2 = 2;

    /* JADX INFO: renamed from: e2 */
    public int f96792e2 = 2;

    /* JADX INFO: renamed from: f2 */
    public int f96793f2 = 0;

    /* JADX INFO: renamed from: g2 */
    public int f96794g2 = -1;

    /* JADX INFO: renamed from: h2 */
    public int f96795h2 = 0;

    /* JADX INFO: renamed from: i2 */
    public ArrayList<C14922a> f96796i2 = new ArrayList<>();

    /* JADX INFO: renamed from: j2 */
    public iu2[] f96797j2 = null;

    /* JADX INFO: renamed from: k2 */
    public iu2[] f96798k2 = null;

    /* JADX INFO: renamed from: l2 */
    public int[] f96799l2 = null;

    /* JADX INFO: renamed from: n2 */
    public int f96801n2 = 0;

    /* JADX INFO: renamed from: x56$a */
    public class C14922a {

        /* JADX INFO: renamed from: a */
        public int f96802a;

        /* JADX INFO: renamed from: d */
        public cu2 f96805d;

        /* JADX INFO: renamed from: e */
        public cu2 f96806e;

        /* JADX INFO: renamed from: f */
        public cu2 f96807f;

        /* JADX INFO: renamed from: g */
        public cu2 f96808g;

        /* JADX INFO: renamed from: h */
        public int f96809h;

        /* JADX INFO: renamed from: i */
        public int f96810i;

        /* JADX INFO: renamed from: j */
        public int f96811j;

        /* JADX INFO: renamed from: k */
        public int f96812k;

        /* JADX INFO: renamed from: q */
        public int f96818q;

        /* JADX INFO: renamed from: b */
        public iu2 f96803b = null;

        /* JADX INFO: renamed from: c */
        public int f96804c = 0;

        /* JADX INFO: renamed from: l */
        public int f96813l = 0;

        /* JADX INFO: renamed from: m */
        public int f96814m = 0;

        /* JADX INFO: renamed from: n */
        public int f96815n = 0;

        /* JADX INFO: renamed from: o */
        public int f96816o = 0;

        /* JADX INFO: renamed from: p */
        public int f96817p = 0;

        public C14922a(int i, cu2 cu2Var, cu2 cu2Var2, cu2 cu2Var3, cu2 cu2Var4, int i2) {
            this.f96809h = 0;
            this.f96810i = 0;
            this.f96811j = 0;
            this.f96812k = 0;
            this.f96818q = 0;
            this.f96802a = i;
            this.f96805d = cu2Var;
            this.f96806e = cu2Var2;
            this.f96807f = cu2Var3;
            this.f96808g = cu2Var4;
            this.f96809h = x56.this.getPaddingLeft();
            this.f96810i = x56.this.getPaddingTop();
            this.f96811j = x56.this.getPaddingRight();
            this.f96812k = x56.this.getPaddingBottom();
            this.f96818q = i2;
        }

        private void recomputeDimensions() {
            this.f96813l = 0;
            this.f96814m = 0;
            this.f96803b = null;
            this.f96804c = 0;
            int i = this.f96816o;
            for (int i2 = 0; i2 < i && this.f96815n + i2 < x56.this.f96801n2; i2++) {
                iu2 iu2Var = x56.this.f96800m2[this.f96815n + i2];
                if (this.f96802a == 0) {
                    int width = iu2Var.getWidth();
                    int i3 = x56.this.f96789b2;
                    if (iu2Var.getVisibility() == 8) {
                        i3 = 0;
                    }
                    this.f96813l += width + i3;
                    int widgetHeight = x56.this.getWidgetHeight(iu2Var, this.f96818q);
                    if (this.f96803b == null || this.f96804c < widgetHeight) {
                        this.f96803b = iu2Var;
                        this.f96804c = widgetHeight;
                        this.f96814m = widgetHeight;
                    }
                } else {
                    int widgetWidth = x56.this.getWidgetWidth(iu2Var, this.f96818q);
                    int widgetHeight2 = x56.this.getWidgetHeight(iu2Var, this.f96818q);
                    int i4 = x56.this.f96790c2;
                    if (iu2Var.getVisibility() == 8) {
                        i4 = 0;
                    }
                    this.f96814m += widgetHeight2 + i4;
                    if (this.f96803b == null || this.f96804c < widgetWidth) {
                        this.f96803b = iu2Var;
                        this.f96804c = widgetWidth;
                        this.f96813l = widgetWidth;
                    }
                }
            }
        }

        public void add(iu2 iu2Var) {
            if (this.f96802a == 0) {
                int widgetWidth = x56.this.getWidgetWidth(iu2Var, this.f96818q);
                if (iu2Var.getHorizontalDimensionBehaviour() == iu2.EnumC7619b.MATCH_CONSTRAINT) {
                    this.f96817p++;
                    widgetWidth = 0;
                }
                this.f96813l += widgetWidth + (iu2Var.getVisibility() != 8 ? x56.this.f96789b2 : 0);
                int widgetHeight = x56.this.getWidgetHeight(iu2Var, this.f96818q);
                if (this.f96803b == null || this.f96804c < widgetHeight) {
                    this.f96803b = iu2Var;
                    this.f96804c = widgetHeight;
                    this.f96814m = widgetHeight;
                }
            } else {
                int widgetWidth2 = x56.this.getWidgetWidth(iu2Var, this.f96818q);
                int widgetHeight2 = x56.this.getWidgetHeight(iu2Var, this.f96818q);
                if (iu2Var.getVerticalDimensionBehaviour() == iu2.EnumC7619b.MATCH_CONSTRAINT) {
                    this.f96817p++;
                    widgetHeight2 = 0;
                }
                this.f96814m += widgetHeight2 + (iu2Var.getVisibility() != 8 ? x56.this.f96790c2 : 0);
                if (this.f96803b == null || this.f96804c < widgetWidth2) {
                    this.f96803b = iu2Var;
                    this.f96804c = widgetWidth2;
                    this.f96813l = widgetWidth2;
                }
            }
            this.f96816o++;
        }

        public void clear() {
            this.f96804c = 0;
            this.f96803b = null;
            this.f96813l = 0;
            this.f96814m = 0;
            this.f96815n = 0;
            this.f96816o = 0;
            this.f96817p = 0;
        }

        public void createConstraints(boolean z, int i, boolean z2) {
            iu2 iu2Var;
            char c;
            float f;
            float f2;
            int i2 = this.f96816o;
            for (int i3 = 0; i3 < i2 && this.f96815n + i3 < x56.this.f96801n2; i3++) {
                iu2 iu2Var2 = x56.this.f96800m2[this.f96815n + i3];
                if (iu2Var2 != null) {
                    iu2Var2.resetAnchors();
                }
            }
            if (i2 == 0 || this.f96803b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.f96815n + i7 >= x56.this.f96801n2) {
                    break;
                }
                iu2 iu2Var3 = x56.this.f96800m2[this.f96815n + i7];
                if (iu2Var3 != null && iu2Var3.getVisibility() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            iu2 iu2Var4 = null;
            if (this.f96802a != 0) {
                iu2 iu2Var5 = this.f96803b;
                iu2Var5.setHorizontalChainStyle(x56.this.f96777P1);
                int i8 = this.f96809h;
                if (i > 0) {
                    i8 += x56.this.f96789b2;
                }
                if (z) {
                    iu2Var5.f48364S.connect(this.f96807f, i8);
                    if (z2) {
                        iu2Var5.f48360Q.connect(this.f96805d, this.f96811j);
                    }
                    if (i > 0) {
                        this.f96807f.f27598d.f48360Q.connect(iu2Var5.f48364S, 0);
                    }
                } else {
                    iu2Var5.f48360Q.connect(this.f96805d, i8);
                    if (z2) {
                        iu2Var5.f48364S.connect(this.f96807f, this.f96811j);
                    }
                    if (i > 0) {
                        this.f96805d.f27598d.f48364S.connect(iu2Var5.f48360Q, 0);
                    }
                }
                for (int i9 = 0; i9 < i2 && this.f96815n + i9 < x56.this.f96801n2; i9++) {
                    iu2 iu2Var6 = x56.this.f96800m2[this.f96815n + i9];
                    if (iu2Var6 != null) {
                        if (i9 == 0) {
                            iu2Var6.connect(iu2Var6.f48362R, this.f96806e, this.f96810i);
                            int i10 = x56.this.f96778Q1;
                            float f3 = x56.this.f96784W1;
                            if (this.f96815n == 0 && x56.this.f96780S1 != -1) {
                                i10 = x56.this.f96780S1;
                                f3 = x56.this.f96786Y1;
                            } else if (z2 && x56.this.f96782U1 != -1) {
                                i10 = x56.this.f96782U1;
                                f3 = x56.this.f96788a2;
                            }
                            iu2Var6.setVerticalChainStyle(i10);
                            iu2Var6.setVerticalBiasPercent(f3);
                        }
                        if (i9 == i2 - 1) {
                            iu2Var6.connect(iu2Var6.f48366T, this.f96808g, this.f96812k);
                        }
                        if (iu2Var4 != null) {
                            iu2Var6.f48362R.connect(iu2Var4.f48366T, x56.this.f96790c2);
                            if (i9 == i4) {
                                iu2Var6.f48362R.setGoneMargin(this.f96810i);
                            }
                            iu2Var4.f48366T.connect(iu2Var6.f48362R, 0);
                            if (i9 == i5 + 1) {
                                iu2Var4.f48366T.setGoneMargin(this.f96812k);
                            }
                        }
                        if (iu2Var6 == iu2Var5) {
                            iu2Var4 = iu2Var6;
                        } else if (z) {
                            int i11 = x56.this.f96791d2;
                            if (i11 == 0) {
                                iu2Var6.f48364S.connect(iu2Var5.f48364S, 0);
                            } else if (i11 == 1) {
                                iu2Var6.f48360Q.connect(iu2Var5.f48360Q, 0);
                            } else if (i11 == 2) {
                                iu2Var6.f48360Q.connect(iu2Var5.f48360Q, 0);
                                iu2Var6.f48364S.connect(iu2Var5.f48364S, 0);
                            }
                            iu2Var4 = iu2Var6;
                        } else {
                            int i12 = x56.this.f96791d2;
                            if (i12 == 0) {
                                iu2Var6.f48360Q.connect(iu2Var5.f48360Q, 0);
                            } else if (i12 == 1) {
                                iu2Var6.f48364S.connect(iu2Var5.f48364S, 0);
                            } else if (i12 == 2) {
                                if (z3) {
                                    iu2Var6.f48360Q.connect(this.f96805d, this.f96809h);
                                    iu2Var6.f48364S.connect(this.f96807f, this.f96811j);
                                } else {
                                    iu2Var6.f48360Q.connect(iu2Var5.f48360Q, 0);
                                    iu2Var6.f48364S.connect(iu2Var5.f48364S, 0);
                                }
                            }
                            iu2Var4 = iu2Var6;
                        }
                    }
                }
                return;
            }
            iu2 iu2Var7 = this.f96803b;
            iu2Var7.setVerticalChainStyle(x56.this.f96778Q1);
            int i13 = this.f96810i;
            if (i > 0) {
                i13 += x56.this.f96790c2;
            }
            iu2Var7.f48362R.connect(this.f96806e, i13);
            if (z2) {
                iu2Var7.f48366T.connect(this.f96808g, this.f96812k);
            }
            if (i > 0) {
                this.f96806e.f27598d.f48366T.connect(iu2Var7.f48362R, 0);
            }
            char c2 = 3;
            if (x56.this.f96792e2 != 3 || iu2Var7.hasBaseline()) {
                iu2Var = iu2Var7;
            } else {
                for (int i14 = 0; i14 < i2; i14++) {
                    int i15 = z ? (i2 - 1) - i14 : i14;
                    if (this.f96815n + i15 >= x56.this.f96801n2) {
                        break;
                    }
                    iu2Var = x56.this.f96800m2[this.f96815n + i15];
                    if (iu2Var.hasBaseline()) {
                        break;
                    }
                }
                iu2Var = iu2Var7;
            }
            int i16 = 0;
            while (i16 < i2) {
                int i17 = z ? (i2 - 1) - i16 : i16;
                if (this.f96815n + i17 >= x56.this.f96801n2) {
                    return;
                }
                iu2 iu2Var8 = x56.this.f96800m2[this.f96815n + i17];
                if (iu2Var8 == null) {
                    iu2Var8 = iu2Var4;
                    c = c2;
                } else {
                    if (i16 == 0) {
                        iu2Var8.connect(iu2Var8.f48360Q, this.f96805d, this.f96809h);
                    }
                    if (i17 == 0) {
                        int i18 = x56.this.f96777P1;
                        float f4 = x56.this.f96783V1;
                        if (z) {
                            f4 = 1.0f - f4;
                        }
                        if (this.f96815n != 0 || x56.this.f96779R1 == -1) {
                            if (z2 && x56.this.f96781T1 != -1) {
                                i18 = x56.this.f96781T1;
                                if (z) {
                                    f2 = x56.this.f96787Z1;
                                    f = 1.0f - f2;
                                    f4 = f;
                                } else {
                                    f = x56.this.f96787Z1;
                                    f4 = f;
                                }
                            }
                            iu2Var8.setHorizontalChainStyle(i18);
                            iu2Var8.setHorizontalBiasPercent(f4);
                        } else {
                            i18 = x56.this.f96779R1;
                            if (z) {
                                f2 = x56.this.f96785X1;
                                f = 1.0f - f2;
                                f4 = f;
                                iu2Var8.setHorizontalChainStyle(i18);
                                iu2Var8.setHorizontalBiasPercent(f4);
                            } else {
                                f = x56.this.f96785X1;
                                f4 = f;
                                iu2Var8.setHorizontalChainStyle(i18);
                                iu2Var8.setHorizontalBiasPercent(f4);
                            }
                        }
                    }
                    if (i16 == i2 - 1) {
                        iu2Var8.connect(iu2Var8.f48364S, this.f96807f, this.f96811j);
                    }
                    if (iu2Var4 != null) {
                        iu2Var8.f48360Q.connect(iu2Var4.f48364S, x56.this.f96789b2);
                        if (i16 == i4) {
                            iu2Var8.f48360Q.setGoneMargin(this.f96809h);
                        }
                        iu2Var4.f48364S.connect(iu2Var8.f48360Q, 0);
                        if (i16 == i5 + 1) {
                            iu2Var4.f48364S.setGoneMargin(this.f96811j);
                        }
                    }
                    if (iu2Var8 != iu2Var7) {
                        c = 3;
                        if (x56.this.f96792e2 == 3 && iu2Var.hasBaseline() && iu2Var8 != iu2Var && iu2Var8.hasBaseline()) {
                            iu2Var8.f48368U.connect(iu2Var.f48368U, 0);
                        } else {
                            int i19 = x56.this.f96792e2;
                            if (i19 == 0) {
                                iu2Var8.f48362R.connect(iu2Var7.f48362R, 0);
                            } else if (i19 == 1) {
                                iu2Var8.f48366T.connect(iu2Var7.f48366T, 0);
                            } else if (z3) {
                                iu2Var8.f48362R.connect(this.f96806e, this.f96810i);
                                iu2Var8.f48366T.connect(this.f96808g, this.f96812k);
                            } else {
                                iu2Var8.f48362R.connect(iu2Var7.f48362R, 0);
                                iu2Var8.f48366T.connect(iu2Var7.f48366T, 0);
                            }
                        }
                    } else {
                        c = 3;
                    }
                }
                i16++;
                c2 = c;
                iu2Var4 = iu2Var8;
            }
        }

        public int getHeight() {
            return this.f96802a == 1 ? this.f96814m - x56.this.f96790c2 : this.f96814m;
        }

        public int getWidth() {
            return this.f96802a == 0 ? this.f96813l - x56.this.f96789b2 : this.f96813l;
        }

        public void measureMatchConstraints(int i) {
            int i2 = this.f96817p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.f96816o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.f96815n + i5 < x56.this.f96801n2; i5++) {
                iu2 iu2Var = x56.this.f96800m2[this.f96815n + i5];
                if (this.f96802a == 0) {
                    if (iu2Var != null && iu2Var.getHorizontalDimensionBehaviour() == iu2.EnumC7619b.MATCH_CONSTRAINT && iu2Var.f48418w == 0) {
                        x56.this.m432g(iu2Var, iu2.EnumC7619b.FIXED, i4, iu2Var.getVerticalDimensionBehaviour(), iu2Var.getHeight());
                    }
                } else if (iu2Var != null && iu2Var.getVerticalDimensionBehaviour() == iu2.EnumC7619b.MATCH_CONSTRAINT && iu2Var.f48420x == 0) {
                    x56.this.m432g(iu2Var, iu2Var.getHorizontalDimensionBehaviour(), iu2Var.getWidth(), iu2.EnumC7619b.FIXED, i4);
                }
            }
            recomputeDimensions();
        }

        public void setStartIndex(int i) {
            this.f96815n = i;
        }

        public void setup(int i, cu2 cu2Var, cu2 cu2Var2, cu2 cu2Var3, cu2 cu2Var4, int i2, int i3, int i4, int i5, int i6) {
            this.f96802a = i;
            this.f96805d = cu2Var;
            this.f96806e = cu2Var2;
            this.f96807f = cu2Var3;
            this.f96808g = cu2Var4;
            this.f96809h = i2;
            this.f96810i = i3;
            this.f96811j = i4;
            this.f96812k = i5;
            this.f96818q = i6;
        }
    }

    private void createAlignedConstraints(boolean z) {
        iu2 iu2Var;
        float f;
        int i;
        if (this.f96799l2 == null || this.f96798k2 == null || this.f96797j2 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f96801n2; i2++) {
            this.f96800m2[i2].resetAnchors();
        }
        int[] iArr = this.f96799l2;
        int i3 = iArr[0];
        int i4 = iArr[1];
        float f2 = this.f96783V1;
        iu2 iu2Var2 = null;
        int i5 = 0;
        while (i5 < i3) {
            if (z) {
                i = (i3 - i5) - 1;
                f = 1.0f - this.f96783V1;
            } else {
                f = f2;
                i = i5;
            }
            iu2 iu2Var3 = this.f96798k2[i];
            if (iu2Var3 != null && iu2Var3.getVisibility() != 8) {
                if (i5 == 0) {
                    iu2Var3.connect(iu2Var3.f48360Q, this.f48360Q, getPaddingLeft());
                    iu2Var3.setHorizontalChainStyle(this.f96777P1);
                    iu2Var3.setHorizontalBiasPercent(f);
                }
                if (i5 == i3 - 1) {
                    iu2Var3.connect(iu2Var3.f48364S, this.f48364S, getPaddingRight());
                }
                if (i5 > 0 && iu2Var2 != null) {
                    iu2Var3.connect(iu2Var3.f48360Q, iu2Var2.f48364S, this.f96789b2);
                    iu2Var2.connect(iu2Var2.f48364S, iu2Var3.f48360Q, 0);
                }
                iu2Var2 = iu2Var3;
            }
            i5++;
            f2 = f;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            iu2 iu2Var4 = this.f96797j2[i6];
            if (iu2Var4 != null && iu2Var4.getVisibility() != 8) {
                if (i6 == 0) {
                    iu2Var4.connect(iu2Var4.f48362R, this.f48362R, getPaddingTop());
                    iu2Var4.setVerticalChainStyle(this.f96778Q1);
                    iu2Var4.setVerticalBiasPercent(this.f96784W1);
                }
                if (i6 == i4 - 1) {
                    iu2Var4.connect(iu2Var4.f48366T, this.f48366T, getPaddingBottom());
                }
                if (i6 > 0 && iu2Var2 != null) {
                    iu2Var4.connect(iu2Var4.f48362R, iu2Var2.f48366T, this.f96790c2);
                    iu2Var2.connect(iu2Var2.f48366T, iu2Var4.f48362R, 0);
                }
                iu2Var2 = iu2Var4;
            }
        }
        for (int i7 = 0; i7 < i3; i7++) {
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = (i8 * i3) + i7;
                if (this.f96795h2 == 1) {
                    i9 = (i7 * i4) + i8;
                }
                iu2[] iu2VarArr = this.f96800m2;
                if (i9 < iu2VarArr.length && (iu2Var = iu2VarArr[i9]) != null && iu2Var.getVisibility() != 8) {
                    iu2 iu2Var5 = this.f96798k2[i7];
                    iu2 iu2Var6 = this.f96797j2[i8];
                    if (iu2Var != iu2Var5) {
                        iu2Var.connect(iu2Var.f48360Q, iu2Var5.f48360Q, 0);
                        iu2Var.connect(iu2Var.f48364S, iu2Var5.f48364S, 0);
                    }
                    if (iu2Var != iu2Var6) {
                        iu2Var.connect(iu2Var.f48362R, iu2Var6.f48362R, 0);
                        iu2Var.connect(iu2Var.f48366T, iu2Var6.f48366T, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidgetHeight(iu2 iu2Var, int i) {
        if (iu2Var == null) {
            return 0;
        }
        if (iu2Var.getVerticalDimensionBehaviour() == iu2.EnumC7619b.MATCH_CONSTRAINT) {
            int i2 = iu2Var.f48420x;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (iu2Var.f48336E * i);
                if (i3 != iu2Var.getHeight()) {
                    iu2Var.setMeasureRequested(true);
                    m432g(iu2Var, iu2Var.getHorizontalDimensionBehaviour(), iu2Var.getWidth(), iu2.EnumC7619b.FIXED, i3);
                }
                return i3;
            }
            if (i2 == 1) {
                return iu2Var.getHeight();
            }
            if (i2 == 3) {
                return (int) ((iu2Var.getWidth() * iu2Var.f48385f0) + 0.5f);
            }
        }
        return iu2Var.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidgetWidth(iu2 iu2Var, int i) {
        if (iu2Var == null) {
            return 0;
        }
        if (iu2Var.getHorizontalDimensionBehaviour() == iu2.EnumC7619b.MATCH_CONSTRAINT) {
            int i2 = iu2Var.f48418w;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (iu2Var.f48330B * i);
                if (i3 != iu2Var.getWidth()) {
                    iu2Var.setMeasureRequested(true);
                    m432g(iu2Var, iu2.EnumC7619b.FIXED, i3, iu2Var.getVerticalDimensionBehaviour(), iu2Var.getHeight());
                }
                return i3;
            }
            if (i2 == 1) {
                return iu2Var.getWidth();
            }
            if (i2 == 3) {
                return (int) ((iu2Var.getHeight() * iu2Var.f48385f0) + 0.5f);
            }
        }
        return iu2Var.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void measureAligned(p000.iu2[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.x56.measureAligned(iu2[], int, int, int, int[]):void");
    }

    private void measureChainWrap(iu2[] iu2VarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        cu2 cu2Var;
        int paddingRight;
        cu2 cu2Var2;
        int paddingBottom;
        int i7;
        if (i == 0) {
            return;
        }
        this.f96796i2.clear();
        C14922a c14922a = new C14922a(i2, this.f48360Q, this.f48362R, this.f48364S, this.f48366T, i3);
        this.f96796i2.add(c14922a);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                iu2 iu2Var = iu2VarArr[i9];
                int widgetWidth = getWidgetWidth(iu2Var, i3);
                if (iu2Var.getHorizontalDimensionBehaviour() == iu2.EnumC7619b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                boolean z = (i8 == i3 || (this.f96789b2 + i8) + widgetWidth > i3) && c14922a.f96803b != null;
                if (!z && i9 > 0 && (i7 = this.f96794g2) > 0 && i9 % i7 == 0) {
                    z = true;
                }
                if (z) {
                    c14922a = new C14922a(i2, this.f48360Q, this.f48362R, this.f48364S, this.f48366T, i3);
                    c14922a.setStartIndex(i9);
                    this.f96796i2.add(c14922a);
                } else {
                    if (i9 > 0) {
                        i8 += this.f96789b2 + widgetWidth;
                    }
                    c14922a.add(iu2Var);
                    i9++;
                    i4 = i10;
                }
                i8 = widgetWidth;
                c14922a.add(iu2Var);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                iu2 iu2Var2 = iu2VarArr[i12];
                int widgetHeight = getWidgetHeight(iu2Var2, i3);
                if (iu2Var2.getVerticalDimensionBehaviour() == iu2.EnumC7619b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                boolean z2 = (i11 == i3 || (this.f96790c2 + i11) + widgetHeight > i3) && c14922a.f96803b != null;
                if (!z2 && i12 > 0 && (i5 = this.f96794g2) > 0 && i12 % i5 == 0) {
                    z2 = true;
                }
                if (z2) {
                    c14922a = new C14922a(i2, this.f48360Q, this.f48362R, this.f48364S, this.f48366T, i3);
                    c14922a.setStartIndex(i12);
                    this.f96796i2.add(c14922a);
                } else {
                    if (i12 > 0) {
                        i11 += this.f96790c2 + widgetHeight;
                    }
                    c14922a.add(iu2Var2);
                    i12++;
                    i4 = i13;
                }
                i11 = widgetHeight;
                c14922a.add(iu2Var2);
                i12++;
                i4 = i13;
            }
        }
        int size = this.f96796i2.size();
        cu2 cu2Var3 = this.f48360Q;
        cu2 cu2Var4 = this.f48362R;
        cu2 cu2Var5 = this.f48364S;
        cu2 cu2Var6 = this.f48366T;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        iu2.EnumC7619b horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        iu2.EnumC7619b enumC7619b = iu2.EnumC7619b.WRAP_CONTENT;
        boolean z3 = horizontalDimensionBehaviour == enumC7619b || getVerticalDimensionBehaviour() == enumC7619b;
        if (i4 > 0 && z3) {
            for (int i14 = 0; i14 < size; i14++) {
                C14922a c14922a2 = this.f96796i2.get(i14);
                if (i2 == 0) {
                    c14922a2.measureMatchConstraints(i3 - c14922a2.getWidth());
                } else {
                    c14922a2.measureMatchConstraints(i3 - c14922a2.getHeight());
                }
            }
        }
        int i15 = paddingTop;
        int i16 = paddingRight2;
        int height = 0;
        int width = 0;
        int i17 = 0;
        int i18 = paddingLeft;
        cu2 cu2Var7 = cu2Var4;
        cu2 cu2Var8 = cu2Var3;
        int i19 = paddingBottom2;
        while (i17 < size) {
            C14922a c14922a3 = this.f96796i2.get(i17);
            if (i2 == 0) {
                if (i17 < size - 1) {
                    cu2Var2 = this.f96796i2.get(i17 + 1).f96803b.f48362R;
                    paddingBottom = 0;
                } else {
                    cu2Var2 = this.f48366T;
                    paddingBottom = getPaddingBottom();
                }
                cu2 cu2Var9 = c14922a3.f96803b.f48366T;
                cu2 cu2Var10 = cu2Var8;
                cu2 cu2Var11 = cu2Var8;
                int i20 = height;
                cu2 cu2Var12 = cu2Var7;
                int i21 = width;
                cu2 cu2Var13 = cu2Var5;
                cu2 cu2Var14 = cu2Var5;
                i6 = i17;
                c14922a3.setup(i2, cu2Var10, cu2Var12, cu2Var13, cu2Var2, i18, i15, i16, paddingBottom, i3);
                int iMax = Math.max(i21, c14922a3.getWidth());
                height = i20 + c14922a3.getHeight();
                if (i6 > 0) {
                    height += this.f96790c2;
                }
                cu2Var8 = cu2Var11;
                width = iMax;
                i15 = 0;
                cu2Var7 = cu2Var9;
                cu2Var = cu2Var14;
                int i22 = paddingBottom;
                cu2Var6 = cu2Var2;
                i19 = i22;
            } else {
                cu2 cu2Var15 = cu2Var8;
                int i23 = height;
                int i24 = width;
                i6 = i17;
                if (i6 < size - 1) {
                    cu2Var = this.f96796i2.get(i6 + 1).f96803b.f48360Q;
                    paddingRight = 0;
                } else {
                    cu2Var = this.f48364S;
                    paddingRight = getPaddingRight();
                }
                cu2 cu2Var16 = c14922a3.f96803b.f48364S;
                c14922a3.setup(i2, cu2Var15, cu2Var7, cu2Var, cu2Var6, i18, i15, paddingRight, i19, i3);
                width = i24 + c14922a3.getWidth();
                int iMax2 = Math.max(i23, c14922a3.getHeight());
                if (i6 > 0) {
                    width += this.f96789b2;
                }
                height = iMax2;
                i18 = 0;
                i16 = paddingRight;
                cu2Var8 = cu2Var16;
            }
            i17 = i6 + 1;
            cu2Var5 = cu2Var;
        }
        iArr[0] = width;
        iArr[1] = height;
    }

    private void measureChainWrap_new(iu2[] iu2VarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        cu2 cu2Var;
        int paddingRight;
        cu2 cu2Var2;
        int paddingBottom;
        int i7;
        if (i == 0) {
            return;
        }
        this.f96796i2.clear();
        C14922a c14922a = new C14922a(i2, this.f48360Q, this.f48362R, this.f48364S, this.f48366T, i3);
        this.f96796i2.add(c14922a);
        if (i2 == 0) {
            int i8 = 0;
            i4 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i10 < i) {
                int i11 = i8 + 1;
                iu2 iu2Var = iu2VarArr[i10];
                int widgetWidth = getWidgetWidth(iu2Var, i3);
                if (iu2Var.getHorizontalDimensionBehaviour() == iu2.EnumC7619b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i12 = i4;
                boolean z = (i9 == i3 || (this.f96789b2 + i9) + widgetWidth > i3) && c14922a.f96803b != null;
                if (!z && i10 > 0 && (i7 = this.f96794g2) > 0 && i11 > i7) {
                    z = true;
                }
                if (z) {
                    c14922a = new C14922a(i2, this.f48360Q, this.f48362R, this.f48364S, this.f48366T, i3);
                    c14922a.setStartIndex(i10);
                    this.f96796i2.add(c14922a);
                    i8 = i11;
                    i9 = widgetWidth;
                } else {
                    i9 = i10 > 0 ? i9 + this.f96789b2 + widgetWidth : widgetWidth;
                    i8 = 0;
                }
                c14922a.add(iu2Var);
                i10++;
                i4 = i12;
            }
        } else {
            int i13 = 0;
            i4 = 0;
            int i14 = 0;
            while (i14 < i) {
                iu2 iu2Var2 = iu2VarArr[i14];
                int widgetHeight = getWidgetHeight(iu2Var2, i3);
                if (iu2Var2.getVerticalDimensionBehaviour() == iu2.EnumC7619b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i15 = i4;
                boolean z2 = (i13 == i3 || (this.f96790c2 + i13) + widgetHeight > i3) && c14922a.f96803b != null;
                if (!z2 && i14 > 0 && (i5 = this.f96794g2) > 0 && i5 < 0) {
                    z2 = true;
                }
                if (z2) {
                    c14922a = new C14922a(i2, this.f48360Q, this.f48362R, this.f48364S, this.f48366T, i3);
                    c14922a.setStartIndex(i14);
                    this.f96796i2.add(c14922a);
                } else {
                    if (i14 > 0) {
                        i13 += this.f96790c2 + widgetHeight;
                    }
                    c14922a.add(iu2Var2);
                    i14++;
                    i4 = i15;
                }
                i13 = widgetHeight;
                c14922a.add(iu2Var2);
                i14++;
                i4 = i15;
            }
        }
        int size = this.f96796i2.size();
        cu2 cu2Var3 = this.f48360Q;
        cu2 cu2Var4 = this.f48362R;
        cu2 cu2Var5 = this.f48364S;
        cu2 cu2Var6 = this.f48366T;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        iu2.EnumC7619b horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        iu2.EnumC7619b enumC7619b = iu2.EnumC7619b.WRAP_CONTENT;
        boolean z3 = horizontalDimensionBehaviour == enumC7619b || getVerticalDimensionBehaviour() == enumC7619b;
        if (i4 > 0 && z3) {
            for (int i16 = 0; i16 < size; i16++) {
                C14922a c14922a2 = this.f96796i2.get(i16);
                if (i2 == 0) {
                    c14922a2.measureMatchConstraints(i3 - c14922a2.getWidth());
                } else {
                    c14922a2.measureMatchConstraints(i3 - c14922a2.getHeight());
                }
            }
        }
        int i17 = paddingTop;
        int i18 = paddingRight2;
        int height = 0;
        int width = 0;
        int i19 = 0;
        int i20 = paddingLeft;
        cu2 cu2Var7 = cu2Var4;
        cu2 cu2Var8 = cu2Var3;
        int i21 = paddingBottom2;
        while (i19 < size) {
            C14922a c14922a3 = this.f96796i2.get(i19);
            if (i2 == 0) {
                if (i19 < size - 1) {
                    cu2Var2 = this.f96796i2.get(i19 + 1).f96803b.f48362R;
                    paddingBottom = 0;
                } else {
                    cu2Var2 = this.f48366T;
                    paddingBottom = getPaddingBottom();
                }
                cu2 cu2Var9 = c14922a3.f96803b.f48366T;
                cu2 cu2Var10 = cu2Var8;
                cu2 cu2Var11 = cu2Var8;
                int i22 = height;
                cu2 cu2Var12 = cu2Var7;
                int i23 = width;
                cu2 cu2Var13 = cu2Var5;
                cu2 cu2Var14 = cu2Var5;
                i6 = i19;
                c14922a3.setup(i2, cu2Var10, cu2Var12, cu2Var13, cu2Var2, i20, i17, i18, paddingBottom, i3);
                int iMax = Math.max(i23, c14922a3.getWidth());
                height = i22 + c14922a3.getHeight();
                if (i6 > 0) {
                    height += this.f96790c2;
                }
                cu2Var8 = cu2Var11;
                width = iMax;
                i17 = 0;
                cu2Var7 = cu2Var9;
                cu2Var = cu2Var14;
                int i24 = paddingBottom;
                cu2Var6 = cu2Var2;
                i21 = i24;
            } else {
                cu2 cu2Var15 = cu2Var8;
                int i25 = height;
                int i26 = width;
                i6 = i19;
                if (i6 < size - 1) {
                    cu2Var = this.f96796i2.get(i6 + 1).f96803b.f48360Q;
                    paddingRight = 0;
                } else {
                    cu2Var = this.f48364S;
                    paddingRight = getPaddingRight();
                }
                cu2 cu2Var16 = c14922a3.f96803b.f48364S;
                c14922a3.setup(i2, cu2Var15, cu2Var7, cu2Var, cu2Var6, i20, i17, paddingRight, i21, i3);
                width = i26 + c14922a3.getWidth();
                int iMax2 = Math.max(i25, c14922a3.getHeight());
                if (i6 > 0) {
                    width += this.f96789b2;
                }
                height = iMax2;
                i20 = 0;
                i18 = paddingRight;
                cu2Var8 = cu2Var16;
            }
            i19 = i6 + 1;
            cu2Var5 = cu2Var;
        }
        iArr[0] = width;
        iArr[1] = height;
    }

    private void measureNoWrap(iu2[] iu2VarArr, int i, int i2, int i3, int[] iArr) {
        C14922a c14922a;
        if (i == 0) {
            return;
        }
        if (this.f96796i2.size() == 0) {
            c14922a = new C14922a(i2, this.f48360Q, this.f48362R, this.f48364S, this.f48366T, i3);
            this.f96796i2.add(c14922a);
        } else {
            C14922a c14922a2 = this.f96796i2.get(0);
            c14922a2.clear();
            c14922a = c14922a2;
            c14922a.setup(i2, this.f48360Q, this.f48362R, this.f48364S, this.f48366T, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i3);
        }
        for (int i4 = 0; i4 < i; i4++) {
            c14922a.add(iu2VarArr[i4]);
        }
        iArr[0] = c14922a.getWidth();
        iArr[1] = c14922a.getHeight();
    }

    @Override // p000.iu2
    public void addToSolver(v69 v69Var, boolean z) {
        super.addToSolver(v69Var, z);
        boolean z2 = getParent() != null && ((ju2) getParent()).isRtl();
        int i = this.f96793f2;
        if (i != 0) {
            if (i == 1) {
                int size = this.f96796i2.size();
                int i2 = 0;
                while (i2 < size) {
                    this.f96796i2.get(i2).createConstraints(z2, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                createAlignedConstraints(z2);
            } else if (i == 3) {
                int size2 = this.f96796i2.size();
                int i3 = 0;
                while (i3 < size2) {
                    this.f96796i2.get(i3).createConstraints(z2, i3, i3 == size2 + (-1));
                    i3++;
                }
            }
        } else if (this.f96796i2.size() > 0) {
            this.f96796i2.get(0).createConstraints(z2, 0, true);
        }
        m434i(false);
    }

    @Override // p000.qj7, p000.iu2
    public void copy(iu2 iu2Var, HashMap<iu2, iu2> map) {
        super.copy(iu2Var, map);
        x56 x56Var = (x56) iu2Var;
        this.f96777P1 = x56Var.f96777P1;
        this.f96778Q1 = x56Var.f96778Q1;
        this.f96779R1 = x56Var.f96779R1;
        this.f96780S1 = x56Var.f96780S1;
        this.f96781T1 = x56Var.f96781T1;
        this.f96782U1 = x56Var.f96782U1;
        this.f96783V1 = x56Var.f96783V1;
        this.f96784W1 = x56Var.f96784W1;
        this.f96785X1 = x56Var.f96785X1;
        this.f96786Y1 = x56Var.f96786Y1;
        this.f96787Z1 = x56Var.f96787Z1;
        this.f96788a2 = x56Var.f96788a2;
        this.f96789b2 = x56Var.f96789b2;
        this.f96790c2 = x56Var.f96790c2;
        this.f96791d2 = x56Var.f96791d2;
        this.f96792e2 = x56Var.f96792e2;
        this.f96793f2 = x56Var.f96793f2;
        this.f96794g2 = x56Var.f96794g2;
        this.f96795h2 = x56Var.f96795h2;
    }

    public float getMaxElementsWrap() {
        return this.f96794g2;
    }

    @Override // p000.adi
    public void measure(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int[] iArr;
        boolean z;
        if (this.f74597B1 > 0 && !m433h()) {
            setMeasure(0, 0);
            m434i(false);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int[] iArr2 = new int[2];
        int i7 = (i2 - paddingLeft) - paddingRight;
        int i8 = this.f96795h2;
        if (i8 == 1) {
            i7 = (i4 - paddingTop) - paddingBottom;
        }
        int i9 = i7;
        if (i8 == 0) {
            if (this.f96777P1 == -1) {
                this.f96777P1 = 0;
            }
            if (this.f96778Q1 == -1) {
                this.f96778Q1 = 0;
            }
        } else {
            if (this.f96777P1 == -1) {
                this.f96777P1 = 0;
            }
            if (this.f96778Q1 == -1) {
                this.f96778Q1 = 0;
            }
        }
        iu2[] iu2VarArr = this.f74596A1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = this.f74597B1;
            if (i10 >= i5) {
                break;
            }
            if (this.f74596A1[i10].getVisibility() == 8) {
                i11++;
            }
            i10++;
        }
        if (i11 > 0) {
            iu2VarArr = new iu2[i5 - i11];
            int i12 = 0;
            for (int i13 = 0; i13 < this.f74597B1; i13++) {
                iu2 iu2Var = this.f74596A1[i13];
                if (iu2Var.getVisibility() != 8) {
                    iu2VarArr[i12] = iu2Var;
                    i12++;
                }
            }
            i6 = i12;
        } else {
            i6 = i5;
        }
        this.f96800m2 = iu2VarArr;
        this.f96801n2 = i6;
        int i14 = this.f96793f2;
        if (i14 == 0) {
            iArr = iArr2;
            z = true;
            measureNoWrap(iu2VarArr, i6, this.f96795h2, i9, iArr2);
        } else if (i14 == 1) {
            z = true;
            iArr = iArr2;
            measureChainWrap(iu2VarArr, i6, this.f96795h2, i9, iArr2);
        } else if (i14 == 2) {
            z = true;
            iArr = iArr2;
            measureAligned(iu2VarArr, i6, this.f96795h2, i9, iArr2);
        } else if (i14 != 3) {
            z = true;
            iArr = iArr2;
        } else {
            z = true;
            iArr = iArr2;
            measureChainWrap_new(iu2VarArr, i6, this.f96795h2, i9, iArr2);
        }
        int iMin = iArr[0] + paddingLeft + paddingRight;
        int iMin2 = iArr[z ? 1 : 0] + paddingTop + paddingBottom;
        if (i == 1073741824) {
            iMin = i2;
        } else if (i == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i2);
        } else if (i != 0) {
            iMin = 0;
        }
        if (i3 == 1073741824) {
            iMin2 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i4);
        } else if (i3 != 0) {
            iMin2 = 0;
        }
        setMeasure(iMin, iMin2);
        setWidth(iMin);
        setHeight(iMin2);
        if (this.f74597B1 <= 0) {
            z = false;
        }
        m434i(z);
    }

    public void setFirstHorizontalBias(float f) {
        this.f96785X1 = f;
    }

    public void setFirstHorizontalStyle(int i) {
        this.f96779R1 = i;
    }

    public void setFirstVerticalBias(float f) {
        this.f96786Y1 = f;
    }

    public void setFirstVerticalStyle(int i) {
        this.f96780S1 = i;
    }

    public void setHorizontalAlign(int i) {
        this.f96791d2 = i;
    }

    public void setHorizontalBias(float f) {
        this.f96783V1 = f;
    }

    public void setHorizontalGap(int i) {
        this.f96789b2 = i;
    }

    public void setHorizontalStyle(int i) {
        this.f96777P1 = i;
    }

    public void setLastHorizontalBias(float f) {
        this.f96787Z1 = f;
    }

    public void setLastHorizontalStyle(int i) {
        this.f96781T1 = i;
    }

    public void setLastVerticalBias(float f) {
        this.f96788a2 = f;
    }

    public void setLastVerticalStyle(int i) {
        this.f96782U1 = i;
    }

    public void setMaxElementsWrap(int i) {
        this.f96794g2 = i;
    }

    public void setOrientation(int i) {
        this.f96795h2 = i;
    }

    public void setVerticalAlign(int i) {
        this.f96792e2 = i;
    }

    public void setVerticalBias(float f) {
        this.f96784W1 = f;
    }

    public void setVerticalGap(int i) {
        this.f96790c2 = i;
    }

    public void setVerticalStyle(int i) {
        this.f96778Q1 = i;
    }

    public void setWrapMode(int i) {
        this.f96793f2 = i;
    }
}
