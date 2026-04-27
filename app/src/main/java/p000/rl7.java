package p000;

import p000.cu2;
import p000.iu2;
import p000.p64;
import p000.wki;

/* JADX INFO: loaded from: classes.dex */
public class rl7 extends wki {

    /* JADX INFO: renamed from: k */
    public static int[] f78634k = new int[2];

    /* JADX INFO: renamed from: rl7$a */
    public static /* synthetic */ class C12145a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78635a;

        static {
            int[] iArr = new int[wki.EnumC14664b.values().length];
            f78635a = iArr;
            try {
                iArr[wki.EnumC14664b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78635a[wki.EnumC14664b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78635a[wki.EnumC14664b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public rl7(iu2 iu2Var) {
        super(iu2Var);
        this.f94569h.f69821e = p64.EnumC10807a.LEFT;
        this.f94570i.f69821e = p64.EnumC10807a.RIGHT;
        this.f94567f = 0;
    }

    private void computeInsetRatio(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    @Override // p000.wki
    public void applyToWidget() {
        p64 p64Var = this.f94569h;
        if (p64Var.f69826j) {
            this.f94563b.setX(p64Var.f69823g);
        }
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: c */
    public void mo9896c() {
        iu2 parent;
        iu2 parent2;
        iu2 iu2Var = this.f94563b;
        if (iu2Var.f48374a) {
            this.f94566e.resolve(iu2Var.getWidth());
        }
        if (this.f94566e.f69826j) {
            iu2.EnumC7619b enumC7619b = this.f94565d;
            iu2.EnumC7619b enumC7619b2 = iu2.EnumC7619b.MATCH_PARENT;
            if (enumC7619b == enumC7619b2 && (parent = this.f94563b.getParent()) != null && (parent.getHorizontalDimensionBehaviour() == iu2.EnumC7619b.FIXED || parent.getHorizontalDimensionBehaviour() == enumC7619b2)) {
                m24637a(this.f94569h, parent.f48382e.f94569h, this.f94563b.f48360Q.getMargin());
                m24637a(this.f94570i, parent.f48382e.f94570i, -this.f94563b.f48364S.getMargin());
                return;
            }
        } else {
            iu2.EnumC7619b horizontalDimensionBehaviour = this.f94563b.getHorizontalDimensionBehaviour();
            this.f94565d = horizontalDimensionBehaviour;
            if (horizontalDimensionBehaviour != iu2.EnumC7619b.MATCH_CONSTRAINT) {
                iu2.EnumC7619b enumC7619b3 = iu2.EnumC7619b.MATCH_PARENT;
                if (horizontalDimensionBehaviour == enumC7619b3 && (parent2 = this.f94563b.getParent()) != null && (parent2.getHorizontalDimensionBehaviour() == iu2.EnumC7619b.FIXED || parent2.getHorizontalDimensionBehaviour() == enumC7619b3)) {
                    int width = (parent2.getWidth() - this.f94563b.f48360Q.getMargin()) - this.f94563b.f48364S.getMargin();
                    m24637a(this.f94569h, parent2.f48382e.f94569h, this.f94563b.f48360Q.getMargin());
                    m24637a(this.f94570i, parent2.f48382e.f94570i, -this.f94563b.f48364S.getMargin());
                    this.f94566e.resolve(width);
                    return;
                }
                if (this.f94565d == iu2.EnumC7619b.FIXED) {
                    this.f94566e.resolve(this.f94563b.getWidth());
                }
            }
        }
        ad4 ad4Var = this.f94566e;
        if (ad4Var.f69826j) {
            iu2 iu2Var2 = this.f94563b;
            if (iu2Var2.f48374a) {
                cu2[] cu2VarArr = iu2Var2.f48372Y;
                cu2 cu2Var = cu2VarArr[0];
                cu2 cu2Var2 = cu2Var.f27600f;
                if (cu2Var2 != null && cu2VarArr[1].f27600f != null) {
                    if (iu2Var2.isInHorizontalChain()) {
                        this.f94569h.f69822f = this.f94563b.f48372Y[0].getMargin();
                        this.f94570i.f69822f = -this.f94563b.f48372Y[1].getMargin();
                        return;
                    }
                    p64 p64VarM24640f = m24640f(this.f94563b.f48372Y[0]);
                    if (p64VarM24640f != null) {
                        m24637a(this.f94569h, p64VarM24640f, this.f94563b.f48372Y[0].getMargin());
                    }
                    p64 p64VarM24640f2 = m24640f(this.f94563b.f48372Y[1]);
                    if (p64VarM24640f2 != null) {
                        m24637a(this.f94570i, p64VarM24640f2, -this.f94563b.f48372Y[1].getMargin());
                    }
                    this.f94569h.f69818b = true;
                    this.f94570i.f69818b = true;
                    return;
                }
                if (cu2Var2 != null) {
                    p64 p64VarM24640f3 = m24640f(cu2Var);
                    if (p64VarM24640f3 != null) {
                        m24637a(this.f94569h, p64VarM24640f3, this.f94563b.f48372Y[0].getMargin());
                        m24637a(this.f94570i, this.f94569h, this.f94566e.f69823g);
                        return;
                    }
                    return;
                }
                cu2 cu2Var3 = cu2VarArr[1];
                if (cu2Var3.f27600f != null) {
                    p64 p64VarM24640f4 = m24640f(cu2Var3);
                    if (p64VarM24640f4 != null) {
                        m24637a(this.f94570i, p64VarM24640f4, -this.f94563b.f48372Y[1].getMargin());
                        m24637a(this.f94569h, this.f94570i, -this.f94566e.f69823g);
                        return;
                    }
                    return;
                }
                if ((iu2Var2 instanceof nj7) || iu2Var2.getParent() == null || this.f94563b.getAnchor(cu2.EnumC4503b.CENTER).f27600f != null) {
                    return;
                }
                m24637a(this.f94569h, this.f94563b.getParent().f48382e.f94569h, this.f94563b.getX());
                m24637a(this.f94570i, this.f94569h, this.f94566e.f69823g);
                return;
            }
        }
        if (this.f94565d == iu2.EnumC7619b.MATCH_CONSTRAINT) {
            iu2 iu2Var3 = this.f94563b;
            int i = iu2Var3.f48418w;
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
            } else if (i == 3) {
                if (iu2Var3.f48420x == 3) {
                    this.f94569h.f69817a = this;
                    this.f94570i.f69817a = this;
                    k5i k5iVar = iu2Var3.f48384f;
                    k5iVar.f94569h.f69817a = this;
                    k5iVar.f94570i.f69817a = this;
                    ad4Var.f69817a = this;
                    if (iu2Var3.isInVerticalChain()) {
                        this.f94566e.f69828l.add(this.f94563b.f48384f.f94566e);
                        this.f94563b.f48384f.f94566e.f69827k.add(this.f94566e);
                        k5i k5iVar2 = this.f94563b.f48384f;
                        k5iVar2.f94566e.f69817a = this;
                        this.f94566e.f69828l.add(k5iVar2.f94569h);
                        this.f94566e.f69828l.add(this.f94563b.f48384f.f94570i);
                        this.f94563b.f48384f.f94569h.f69827k.add(this.f94566e);
                        this.f94563b.f48384f.f94570i.f69827k.add(this.f94566e);
                    } else if (this.f94563b.isInHorizontalChain()) {
                        this.f94563b.f48384f.f94566e.f69828l.add(this.f94566e);
                        this.f94566e.f69827k.add(this.f94563b.f48384f.f94566e);
                    } else {
                        this.f94563b.f48384f.f94566e.f69828l.add(this.f94566e);
                    }
                } else {
                    ad4 ad4Var4 = iu2Var3.f48384f.f94566e;
                    ad4Var.f69828l.add(ad4Var4);
                    ad4Var4.f69827k.add(this.f94566e);
                    this.f94563b.f48384f.f94569h.f69827k.add(this.f94566e);
                    this.f94563b.f48384f.f94570i.f69827k.add(this.f94566e);
                    ad4 ad4Var5 = this.f94566e;
                    ad4Var5.f69818b = true;
                    ad4Var5.f69827k.add(this.f94569h);
                    this.f94566e.f69827k.add(this.f94570i);
                    this.f94569h.f69828l.add(this.f94566e);
                    this.f94570i.f69828l.add(this.f94566e);
                }
            }
        }
        iu2 iu2Var4 = this.f94563b;
        cu2[] cu2VarArr2 = iu2Var4.f48372Y;
        cu2 cu2Var4 = cu2VarArr2[0];
        cu2 cu2Var5 = cu2Var4.f27600f;
        if (cu2Var5 != null && cu2VarArr2[1].f27600f != null) {
            if (iu2Var4.isInHorizontalChain()) {
                this.f94569h.f69822f = this.f94563b.f48372Y[0].getMargin();
                this.f94570i.f69822f = -this.f94563b.f48372Y[1].getMargin();
                return;
            }
            p64 p64VarM24640f5 = m24640f(this.f94563b.f48372Y[0]);
            p64 p64VarM24640f6 = m24640f(this.f94563b.f48372Y[1]);
            if (p64VarM24640f5 != null) {
                p64VarM24640f5.addDependency(this);
            }
            if (p64VarM24640f6 != null) {
                p64VarM24640f6.addDependency(this);
            }
            this.f94571j = wki.EnumC14664b.CENTER;
            return;
        }
        if (cu2Var5 != null) {
            p64 p64VarM24640f7 = m24640f(cu2Var4);
            if (p64VarM24640f7 != null) {
                m24637a(this.f94569h, p64VarM24640f7, this.f94563b.f48372Y[0].getMargin());
                m24638b(this.f94570i, this.f94569h, 1, this.f94566e);
                return;
            }
            return;
        }
        cu2 cu2Var6 = cu2VarArr2[1];
        if (cu2Var6.f27600f != null) {
            p64 p64VarM24640f8 = m24640f(cu2Var6);
            if (p64VarM24640f8 != null) {
                m24637a(this.f94570i, p64VarM24640f8, -this.f94563b.f48372Y[1].getMargin());
                m24638b(this.f94569h, this.f94570i, -1, this.f94566e);
                return;
            }
            return;
        }
        if ((iu2Var4 instanceof nj7) || iu2Var4.getParent() == null) {
            return;
        }
        m24637a(this.f94569h, this.f94563b.getParent().f48382e.f94569h, this.f94563b.getX());
        m24638b(this.f94570i, this.f94569h, 1, this.f94566e);
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: d */
    public void mo9897d() {
        this.f94564c = null;
        this.f94569h.clear();
        this.f94570i.clear();
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
        this.f94566e.f69826j = false;
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: i */
    public boolean mo9899i() {
        return this.f94565d != iu2.EnumC7619b.MATCH_CONSTRAINT || this.f94563b.f48418w == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f94563b.getDebugName();
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02df  */
    @Override // p000.wki, p000.j64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void update(p000.j64 r17) {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rl7.update(j64):void");
    }
}
