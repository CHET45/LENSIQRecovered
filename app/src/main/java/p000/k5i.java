package p000;

import p000.cu2;
import p000.iu2;
import p000.p64;
import p000.wki;

/* JADX INFO: loaded from: classes.dex */
public class k5i extends wki {

    /* JADX INFO: renamed from: k */
    public p64 f52615k;

    /* JADX INFO: renamed from: l */
    public ad4 f52616l;

    /* JADX INFO: renamed from: k5i$a */
    public static /* synthetic */ class C8205a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52617a;

        static {
            int[] iArr = new int[wki.EnumC14664b.values().length];
            f52617a = iArr;
            try {
                iArr[wki.EnumC14664b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52617a[wki.EnumC14664b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52617a[wki.EnumC14664b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k5i(iu2 iu2Var) {
        super(iu2Var);
        p64 p64Var = new p64(this);
        this.f52615k = p64Var;
        this.f52616l = null;
        this.f94569h.f69821e = p64.EnumC10807a.TOP;
        this.f94570i.f69821e = p64.EnumC10807a.BOTTOM;
        p64Var.f69821e = p64.EnumC10807a.BASELINE;
        this.f94567f = 1;
    }

    @Override // p000.wki
    public void applyToWidget() {
        p64 p64Var = this.f94569h;
        if (p64Var.f69826j) {
            this.f94563b.setY(p64Var.f69823g);
        }
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: c */
    public void mo9896c() {
        iu2 parent;
        iu2 parent2;
        iu2 iu2Var = this.f94563b;
        if (iu2Var.f48374a) {
            this.f94566e.resolve(iu2Var.getHeight());
        }
        if (!this.f94566e.f69826j) {
            this.f94565d = this.f94563b.getVerticalDimensionBehaviour();
            if (this.f94563b.hasBaseline()) {
                this.f52616l = new fv0(this);
            }
            iu2.EnumC7619b enumC7619b = this.f94565d;
            if (enumC7619b != iu2.EnumC7619b.MATCH_CONSTRAINT) {
                if (enumC7619b == iu2.EnumC7619b.MATCH_PARENT && (parent2 = this.f94563b.getParent()) != null && parent2.getVerticalDimensionBehaviour() == iu2.EnumC7619b.FIXED) {
                    int height = (parent2.getHeight() - this.f94563b.f48362R.getMargin()) - this.f94563b.f48366T.getMargin();
                    m24637a(this.f94569h, parent2.f48384f.f94569h, this.f94563b.f48362R.getMargin());
                    m24637a(this.f94570i, parent2.f48384f.f94570i, -this.f94563b.f48366T.getMargin());
                    this.f94566e.resolve(height);
                    return;
                }
                if (this.f94565d == iu2.EnumC7619b.FIXED) {
                    this.f94566e.resolve(this.f94563b.getHeight());
                }
            }
        } else if (this.f94565d == iu2.EnumC7619b.MATCH_PARENT && (parent = this.f94563b.getParent()) != null && parent.getVerticalDimensionBehaviour() == iu2.EnumC7619b.FIXED) {
            m24637a(this.f94569h, parent.f48384f.f94569h, this.f94563b.f48362R.getMargin());
            m24637a(this.f94570i, parent.f48384f.f94570i, -this.f94563b.f48366T.getMargin());
            return;
        }
        ad4 ad4Var = this.f94566e;
        boolean z = ad4Var.f69826j;
        if (z) {
            iu2 iu2Var2 = this.f94563b;
            if (iu2Var2.f48374a) {
                cu2[] cu2VarArr = iu2Var2.f48372Y;
                cu2 cu2Var = cu2VarArr[2];
                cu2 cu2Var2 = cu2Var.f27600f;
                if (cu2Var2 != null && cu2VarArr[3].f27600f != null) {
                    if (iu2Var2.isInVerticalChain()) {
                        this.f94569h.f69822f = this.f94563b.f48372Y[2].getMargin();
                        this.f94570i.f69822f = -this.f94563b.f48372Y[3].getMargin();
                    } else {
                        p64 p64VarM24640f = m24640f(this.f94563b.f48372Y[2]);
                        if (p64VarM24640f != null) {
                            m24637a(this.f94569h, p64VarM24640f, this.f94563b.f48372Y[2].getMargin());
                        }
                        p64 p64VarM24640f2 = m24640f(this.f94563b.f48372Y[3]);
                        if (p64VarM24640f2 != null) {
                            m24637a(this.f94570i, p64VarM24640f2, -this.f94563b.f48372Y[3].getMargin());
                        }
                        this.f94569h.f69818b = true;
                        this.f94570i.f69818b = true;
                    }
                    if (this.f94563b.hasBaseline()) {
                        m24637a(this.f52615k, this.f94569h, this.f94563b.getBaselineDistance());
                        return;
                    }
                    return;
                }
                if (cu2Var2 != null) {
                    p64 p64VarM24640f3 = m24640f(cu2Var);
                    if (p64VarM24640f3 != null) {
                        m24637a(this.f94569h, p64VarM24640f3, this.f94563b.f48372Y[2].getMargin());
                        m24637a(this.f94570i, this.f94569h, this.f94566e.f69823g);
                        if (this.f94563b.hasBaseline()) {
                            m24637a(this.f52615k, this.f94569h, this.f94563b.getBaselineDistance());
                            return;
                        }
                        return;
                    }
                    return;
                }
                cu2 cu2Var3 = cu2VarArr[3];
                if (cu2Var3.f27600f != null) {
                    p64 p64VarM24640f4 = m24640f(cu2Var3);
                    if (p64VarM24640f4 != null) {
                        m24637a(this.f94570i, p64VarM24640f4, -this.f94563b.f48372Y[3].getMargin());
                        m24637a(this.f94569h, this.f94570i, -this.f94566e.f69823g);
                    }
                    if (this.f94563b.hasBaseline()) {
                        m24637a(this.f52615k, this.f94569h, this.f94563b.getBaselineDistance());
                        return;
                    }
                    return;
                }
                cu2 cu2Var4 = cu2VarArr[4];
                if (cu2Var4.f27600f != null) {
                    p64 p64VarM24640f5 = m24640f(cu2Var4);
                    if (p64VarM24640f5 != null) {
                        m24637a(this.f52615k, p64VarM24640f5, 0);
                        m24637a(this.f94569h, this.f52615k, -this.f94563b.getBaselineDistance());
                        m24637a(this.f94570i, this.f94569h, this.f94566e.f69823g);
                        return;
                    }
                    return;
                }
                if ((iu2Var2 instanceof nj7) || iu2Var2.getParent() == null || this.f94563b.getAnchor(cu2.EnumC4503b.CENTER).f27600f != null) {
                    return;
                }
                m24637a(this.f94569h, this.f94563b.getParent().f48384f.f94569h, this.f94563b.getY());
                m24637a(this.f94570i, this.f94569h, this.f94566e.f69823g);
                if (this.f94563b.hasBaseline()) {
                    m24637a(this.f52615k, this.f94569h, this.f94563b.getBaselineDistance());
                    return;
                }
                return;
            }
        }
        if (z || this.f94565d != iu2.EnumC7619b.MATCH_CONSTRAINT) {
            ad4Var.addDependency(this);
        } else {
            iu2 iu2Var3 = this.f94563b;
            int i = iu2Var3.f48420x;
            if (i == 2) {
                iu2 parent3 = iu2Var3.getParent();
                if (parent3 != null) {
                    ad4 ad4Var2 = parent3.f48384f.f94566e;
                    this.f94566e.f69828l.add(ad4Var2);
                    ad4Var2.f69827k.add(this.f94566e);
                    ad4 ad4Var3 = this.f94566e;
                    ad4Var3.f69818b = true;
                    ad4Var3.f69827k.add(this.f94569h);
                    this.f94566e.f69827k.add(this.f94570i);
                }
            } else if (i == 3 && !iu2Var3.isInVerticalChain()) {
                iu2 iu2Var4 = this.f94563b;
                if (iu2Var4.f48418w != 3) {
                    ad4 ad4Var4 = iu2Var4.f48382e.f94566e;
                    this.f94566e.f69828l.add(ad4Var4);
                    ad4Var4.f69827k.add(this.f94566e);
                    ad4 ad4Var5 = this.f94566e;
                    ad4Var5.f69818b = true;
                    ad4Var5.f69827k.add(this.f94569h);
                    this.f94566e.f69827k.add(this.f94570i);
                }
            }
        }
        iu2 iu2Var5 = this.f94563b;
        cu2[] cu2VarArr2 = iu2Var5.f48372Y;
        cu2 cu2Var5 = cu2VarArr2[2];
        cu2 cu2Var6 = cu2Var5.f27600f;
        if (cu2Var6 != null && cu2VarArr2[3].f27600f != null) {
            if (iu2Var5.isInVerticalChain()) {
                this.f94569h.f69822f = this.f94563b.f48372Y[2].getMargin();
                this.f94570i.f69822f = -this.f94563b.f48372Y[3].getMargin();
            } else {
                p64 p64VarM24640f6 = m24640f(this.f94563b.f48372Y[2]);
                p64 p64VarM24640f7 = m24640f(this.f94563b.f48372Y[3]);
                if (p64VarM24640f6 != null) {
                    p64VarM24640f6.addDependency(this);
                }
                if (p64VarM24640f7 != null) {
                    p64VarM24640f7.addDependency(this);
                }
                this.f94571j = wki.EnumC14664b.CENTER;
            }
            if (this.f94563b.hasBaseline()) {
                m24638b(this.f52615k, this.f94569h, 1, this.f52616l);
            }
        } else if (cu2Var6 != null) {
            p64 p64VarM24640f8 = m24640f(cu2Var5);
            if (p64VarM24640f8 != null) {
                m24637a(this.f94569h, p64VarM24640f8, this.f94563b.f48372Y[2].getMargin());
                m24638b(this.f94570i, this.f94569h, 1, this.f94566e);
                if (this.f94563b.hasBaseline()) {
                    m24638b(this.f52615k, this.f94569h, 1, this.f52616l);
                }
                iu2.EnumC7619b enumC7619b2 = this.f94565d;
                iu2.EnumC7619b enumC7619b3 = iu2.EnumC7619b.MATCH_CONSTRAINT;
                if (enumC7619b2 == enumC7619b3 && this.f94563b.getDimensionRatio() > 0.0f) {
                    rl7 rl7Var = this.f94563b.f48382e;
                    if (rl7Var.f94565d == enumC7619b3) {
                        rl7Var.f94566e.f69827k.add(this.f94566e);
                        this.f94566e.f69828l.add(this.f94563b.f48382e.f94566e);
                        this.f94566e.f69817a = this;
                    }
                }
            }
        } else {
            cu2 cu2Var7 = cu2VarArr2[3];
            if (cu2Var7.f27600f != null) {
                p64 p64VarM24640f9 = m24640f(cu2Var7);
                if (p64VarM24640f9 != null) {
                    m24637a(this.f94570i, p64VarM24640f9, -this.f94563b.f48372Y[3].getMargin());
                    m24638b(this.f94569h, this.f94570i, -1, this.f94566e);
                    if (this.f94563b.hasBaseline()) {
                        m24638b(this.f52615k, this.f94569h, 1, this.f52616l);
                    }
                }
            } else {
                cu2 cu2Var8 = cu2VarArr2[4];
                if (cu2Var8.f27600f != null) {
                    p64 p64VarM24640f10 = m24640f(cu2Var8);
                    if (p64VarM24640f10 != null) {
                        m24637a(this.f52615k, p64VarM24640f10, 0);
                        m24638b(this.f94569h, this.f52615k, -1, this.f52616l);
                        m24638b(this.f94570i, this.f94569h, 1, this.f94566e);
                    }
                } else if (!(iu2Var5 instanceof nj7) && iu2Var5.getParent() != null) {
                    m24637a(this.f94569h, this.f94563b.getParent().f48384f.f94569h, this.f94563b.getY());
                    m24638b(this.f94570i, this.f94569h, 1, this.f94566e);
                    if (this.f94563b.hasBaseline()) {
                        m24638b(this.f52615k, this.f94569h, 1, this.f52616l);
                    }
                    iu2.EnumC7619b enumC7619b4 = this.f94565d;
                    iu2.EnumC7619b enumC7619b5 = iu2.EnumC7619b.MATCH_CONSTRAINT;
                    if (enumC7619b4 == enumC7619b5 && this.f94563b.getDimensionRatio() > 0.0f) {
                        rl7 rl7Var2 = this.f94563b.f48382e;
                        if (rl7Var2.f94565d == enumC7619b5) {
                            rl7Var2.f94566e.f69827k.add(this.f94566e);
                            this.f94566e.f69828l.add(this.f94563b.f48382e.f94566e);
                            this.f94566e.f69817a = this;
                        }
                    }
                }
            }
        }
        if (this.f94566e.f69828l.size() == 0) {
            this.f94566e.f69819c = true;
        }
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: d */
    public void mo9897d() {
        this.f94564c = null;
        this.f94569h.clear();
        this.f94570i.clear();
        this.f52615k.clear();
        this.f94566e.clear();
        this.f94568g = false;
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: h */
    public void mo9898h() {
        this.f94568g = false;
        this.f94569h.clear();
        this.f94569h.f69826j = false;
        this.f94570i.clear();
        this.f94570i.f69826j = false;
        this.f52615k.clear();
        this.f52615k.f69826j = false;
        this.f94566e.f69826j = false;
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: i */
    public boolean mo9899i() {
        return this.f94565d != iu2.EnumC7619b.MATCH_CONSTRAINT || this.f94563b.f48420x == 0;
    }

    public String toString() {
        return "VerticalRun " + this.f94563b.getDebugName();
    }

    @Override // p000.wki, p000.j64
    public void update(j64 j64Var) {
        float f;
        float dimensionRatio;
        float dimensionRatio2;
        int i;
        int i2 = C8205a.f52617a[this.f94571j.ordinal()];
        if (i2 == 1) {
            m24644l(j64Var);
        } else if (i2 == 2) {
            m24643k(j64Var);
        } else if (i2 == 3) {
            iu2 iu2Var = this.f94563b;
            m24642j(j64Var, iu2Var.f48362R, iu2Var.f48366T, 1);
            return;
        }
        ad4 ad4Var = this.f94566e;
        if (ad4Var.f69819c && !ad4Var.f69826j && this.f94565d == iu2.EnumC7619b.MATCH_CONSTRAINT) {
            iu2 iu2Var2 = this.f94563b;
            int i3 = iu2Var2.f48420x;
            if (i3 == 2) {
                iu2 parent = iu2Var2.getParent();
                if (parent != null) {
                    if (parent.f48384f.f94566e.f69826j) {
                        this.f94566e.resolve((int) ((r7.f69823g * this.f94563b.f48336E) + 0.5f));
                    }
                }
            } else if (i3 == 3 && iu2Var2.f48382e.f94566e.f69826j) {
                int dimensionRatioSide = iu2Var2.getDimensionRatioSide();
                if (dimensionRatioSide == -1) {
                    iu2 iu2Var3 = this.f94563b;
                    f = iu2Var3.f48382e.f94566e.f69823g;
                    dimensionRatio = iu2Var3.getDimensionRatio();
                } else if (dimensionRatioSide == 0) {
                    dimensionRatio2 = r7.f48382e.f94566e.f69823g * this.f94563b.getDimensionRatio();
                    i = (int) (dimensionRatio2 + 0.5f);
                    this.f94566e.resolve(i);
                } else if (dimensionRatioSide != 1) {
                    i = 0;
                    this.f94566e.resolve(i);
                } else {
                    iu2 iu2Var4 = this.f94563b;
                    f = iu2Var4.f48382e.f94566e.f69823g;
                    dimensionRatio = iu2Var4.getDimensionRatio();
                }
                dimensionRatio2 = f / dimensionRatio;
                i = (int) (dimensionRatio2 + 0.5f);
                this.f94566e.resolve(i);
            }
        }
        p64 p64Var = this.f94569h;
        if (p64Var.f69819c) {
            p64 p64Var2 = this.f94570i;
            if (p64Var2.f69819c) {
                if (p64Var.f69826j && p64Var2.f69826j && this.f94566e.f69826j) {
                    return;
                }
                if (!this.f94566e.f69826j && this.f94565d == iu2.EnumC7619b.MATCH_CONSTRAINT) {
                    iu2 iu2Var5 = this.f94563b;
                    if (iu2Var5.f48418w == 0 && !iu2Var5.isInVerticalChain()) {
                        p64 p64Var3 = this.f94569h.f69828l.get(0);
                        p64 p64Var4 = this.f94570i.f69828l.get(0);
                        int i4 = p64Var3.f69823g;
                        p64 p64Var5 = this.f94569h;
                        int i5 = i4 + p64Var5.f69822f;
                        int i6 = p64Var4.f69823g + this.f94570i.f69822f;
                        p64Var5.resolve(i5);
                        this.f94570i.resolve(i6);
                        this.f94566e.resolve(i6 - i5);
                        return;
                    }
                }
                if (!this.f94566e.f69826j && this.f94565d == iu2.EnumC7619b.MATCH_CONSTRAINT && this.f94562a == 1 && this.f94569h.f69828l.size() > 0 && this.f94570i.f69828l.size() > 0) {
                    p64 p64Var6 = this.f94569h.f69828l.get(0);
                    int i7 = (this.f94570i.f69828l.get(0).f69823g + this.f94570i.f69822f) - (p64Var6.f69823g + this.f94569h.f69822f);
                    ad4 ad4Var2 = this.f94566e;
                    int i8 = ad4Var2.f1116m;
                    if (i7 < i8) {
                        ad4Var2.resolve(i7);
                    } else {
                        ad4Var2.resolve(i8);
                    }
                }
                if (this.f94566e.f69826j && this.f94569h.f69828l.size() > 0 && this.f94570i.f69828l.size() > 0) {
                    p64 p64Var7 = this.f94569h.f69828l.get(0);
                    p64 p64Var8 = this.f94570i.f69828l.get(0);
                    int i9 = p64Var7.f69823g + this.f94569h.f69822f;
                    int i10 = p64Var8.f69823g + this.f94570i.f69822f;
                    float verticalBiasPercent = this.f94563b.getVerticalBiasPercent();
                    if (p64Var7 == p64Var8) {
                        i9 = p64Var7.f69823g;
                        i10 = p64Var8.f69823g;
                        verticalBiasPercent = 0.5f;
                    }
                    this.f94569h.resolve((int) (i9 + 0.5f + (((i10 - i9) - this.f94566e.f69823g) * verticalBiasPercent)));
                    this.f94570i.resolve(this.f94569h.f69823g + this.f94566e.f69823g);
                }
            }
        }
    }
}
