package p000;

import p000.cu2;
import p000.iu2;

/* JADX INFO: loaded from: classes.dex */
public abstract class wki implements j64 {

    /* JADX INFO: renamed from: a */
    public int f94562a;

    /* JADX INFO: renamed from: b */
    public iu2 f94563b;

    /* JADX INFO: renamed from: c */
    public zce f94564c;

    /* JADX INFO: renamed from: d */
    public iu2.EnumC7619b f94565d;

    /* JADX INFO: renamed from: e */
    public ad4 f94566e = new ad4(this);

    /* JADX INFO: renamed from: f */
    public int f94567f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f94568g = false;

    /* JADX INFO: renamed from: h */
    public p64 f94569h = new p64(this);

    /* JADX INFO: renamed from: i */
    public p64 f94570i = new p64(this);

    /* JADX INFO: renamed from: j */
    public EnumC14664b f94571j = EnumC14664b.NONE;

    /* JADX INFO: renamed from: wki$a */
    public static /* synthetic */ class C14663a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94572a;

        static {
            int[] iArr = new int[cu2.EnumC4503b.values().length];
            f94572a = iArr;
            try {
                iArr[cu2.EnumC4503b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94572a[cu2.EnumC4503b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94572a[cu2.EnumC4503b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94572a[cu2.EnumC4503b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94572a[cu2.EnumC4503b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: wki$b */
    public enum EnumC14664b {
        NONE,
        START,
        END,
        CENTER
    }

    public wki(iu2 iu2Var) {
        this.f94563b = iu2Var;
    }

    private void resolveDimension(int i, int i2) {
        int i3 = this.f94562a;
        if (i3 == 0) {
            this.f94566e.resolve(m24639e(i2, i));
            return;
        }
        if (i3 == 1) {
            this.f94566e.resolve(Math.min(m24639e(this.f94566e.f1116m, i), i2));
            return;
        }
        if (i3 == 2) {
            iu2 parent = this.f94563b.getParent();
            if (parent != null) {
                if ((i == 0 ? parent.f48382e : parent.f48384f).f94566e.f69826j) {
                    iu2 iu2Var = this.f94563b;
                    this.f94566e.resolve(m24639e((int) ((r9.f69823g * (i == 0 ? iu2Var.f48330B : iu2Var.f48336E)) + 0.5f), i));
                    return;
                }
                return;
            }
            return;
        }
        if (i3 != 3) {
            return;
        }
        iu2 iu2Var2 = this.f94563b;
        wki wkiVar = iu2Var2.f48382e;
        iu2.EnumC7619b enumC7619b = wkiVar.f94565d;
        iu2.EnumC7619b enumC7619b2 = iu2.EnumC7619b.MATCH_CONSTRAINT;
        if (enumC7619b == enumC7619b2 && wkiVar.f94562a == 3) {
            k5i k5iVar = iu2Var2.f48384f;
            if (k5iVar.f94565d == enumC7619b2 && k5iVar.f94562a == 3) {
                return;
            }
        }
        if (i == 0) {
            wkiVar = iu2Var2.f48384f;
        }
        if (wkiVar.f94566e.f69826j) {
            float dimensionRatio = iu2Var2.getDimensionRatio();
            this.f94566e.resolve(i == 1 ? (int) ((wkiVar.f94566e.f69823g / dimensionRatio) + 0.5f) : (int) ((dimensionRatio * wkiVar.f94566e.f69823g) + 0.5f));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m24637a(p64 p64Var, p64 p64Var2, int i) {
        p64Var.f69828l.add(p64Var2);
        p64Var.f69822f = i;
        p64Var2.f69827k.add(p64Var);
    }

    public abstract void applyToWidget();

    /* JADX INFO: renamed from: b */
    public final void m24638b(p64 p64Var, p64 p64Var2, int i, ad4 ad4Var) {
        p64Var.f69828l.add(p64Var2);
        p64Var.f69828l.add(this.f94566e);
        p64Var.f69824h = i;
        p64Var.f69825i = ad4Var;
        p64Var2.f69827k.add(p64Var);
        ad4Var.f69827k.add(p64Var);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo9896c();

    /* JADX INFO: renamed from: d */
    public abstract void mo9897d();

    /* JADX INFO: renamed from: e */
    public final int m24639e(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            iu2 iu2Var = this.f94563b;
            int i3 = iu2Var.f48328A;
            iMax = Math.max(iu2Var.f48424z, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            iu2 iu2Var2 = this.f94563b;
            int i4 = iu2Var2.f48334D;
            iMax = Math.max(iu2Var2.f48332C, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: f */
    public final p64 m24640f(cu2 cu2Var) {
        cu2 cu2Var2 = cu2Var.f27600f;
        if (cu2Var2 == null) {
            return null;
        }
        iu2 iu2Var = cu2Var2.f27598d;
        int i = C14663a.f94572a[cu2Var2.f27599e.ordinal()];
        if (i == 1) {
            return iu2Var.f48382e.f94569h;
        }
        if (i == 2) {
            return iu2Var.f48382e.f94570i;
        }
        if (i == 3) {
            return iu2Var.f48384f.f94569h;
        }
        if (i == 4) {
            return iu2Var.f48384f.f52615k;
        }
        if (i != 5) {
            return null;
        }
        return iu2Var.f48384f.f94570i;
    }

    /* JADX INFO: renamed from: g */
    public final p64 m24641g(cu2 cu2Var, int i) {
        cu2 cu2Var2 = cu2Var.f27600f;
        if (cu2Var2 == null) {
            return null;
        }
        iu2 iu2Var = cu2Var2.f27598d;
        wki wkiVar = i == 0 ? iu2Var.f48382e : iu2Var.f48384f;
        int i2 = C14663a.f94572a[cu2Var2.f27599e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return wkiVar.f94570i;
        }
        return wkiVar.f94569h;
    }

    public long getWrapDimension() {
        if (this.f94566e.f69826j) {
            return r0.f69823g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo9898h();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo9899i();

    public boolean isCenterConnection() {
        int size = this.f94569h.f69828l.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f94569h.f69828l.get(i2).f69820d != this) {
                i++;
            }
        }
        int size2 = this.f94570i.f69828l.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (this.f94570i.f69828l.get(i3).f69820d != this) {
                i++;
            }
        }
        return i >= 2;
    }

    public boolean isDimensionResolved() {
        return this.f94566e.f69826j;
    }

    public boolean isResolved() {
        return this.f94568g;
    }

    /* JADX INFO: renamed from: j */
    public void m24642j(j64 j64Var, cu2 cu2Var, cu2 cu2Var2, int i) {
        p64 p64VarM24640f = m24640f(cu2Var);
        p64 p64VarM24640f2 = m24640f(cu2Var2);
        if (p64VarM24640f.f69826j && p64VarM24640f2.f69826j) {
            int margin = p64VarM24640f.f69823g + cu2Var.getMargin();
            int margin2 = p64VarM24640f2.f69823g - cu2Var2.getMargin();
            int i2 = margin2 - margin;
            if (!this.f94566e.f69826j && this.f94565d == iu2.EnumC7619b.MATCH_CONSTRAINT) {
                resolveDimension(i, i2);
            }
            ad4 ad4Var = this.f94566e;
            if (ad4Var.f69826j) {
                if (ad4Var.f69823g == i2) {
                    this.f94569h.resolve(margin);
                    this.f94570i.resolve(margin2);
                    return;
                }
                iu2 iu2Var = this.f94563b;
                float horizontalBiasPercent = i == 0 ? iu2Var.getHorizontalBiasPercent() : iu2Var.getVerticalBiasPercent();
                if (p64VarM24640f == p64VarM24640f2) {
                    margin = p64VarM24640f.f69823g;
                    margin2 = p64VarM24640f2.f69823g;
                    horizontalBiasPercent = 0.5f;
                }
                this.f94569h.resolve((int) (margin + 0.5f + (((margin2 - margin) - this.f94566e.f69823g) * horizontalBiasPercent)));
                this.f94570i.resolve(this.f94569h.f69823g + this.f94566e.f69823g);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m24643k(j64 j64Var) {
    }

    /* JADX INFO: renamed from: l */
    public void m24644l(j64 j64Var) {
    }

    @Override // p000.j64
    public void update(j64 j64Var) {
    }

    public long wrapSize(int i) {
        int i2;
        ad4 ad4Var = this.f94566e;
        if (!ad4Var.f69826j) {
            return 0L;
        }
        long j = ad4Var.f69823g;
        if (isCenterConnection()) {
            i2 = this.f94569h.f69822f - this.f94570i.f69822f;
        } else {
            if (i != 0) {
                return j - ((long) this.f94570i.f69822f);
            }
            i2 = this.f94569h.f69822f;
        }
        return j + ((long) i2);
    }
}
