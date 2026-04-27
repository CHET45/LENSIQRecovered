package p000;

import java.util.Iterator;
import p000.f2g;

/* JADX INFO: loaded from: classes.dex */
public class g5i extends st1 {

    /* JADX INFO: renamed from: g5i$a */
    public static /* synthetic */ class C6139a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38842a;

        static {
            int[] iArr = new int[f2g.EnumC5562b.values().length];
            f38842a = iArr;
            try {
                iArr[f2g.EnumC5562b.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38842a[f2g.EnumC5562b.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38842a[f2g.EnumC5562b.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g5i(f2g f2gVar) {
        super(f2gVar, f2g.EnumC5565e.VERTICAL_CHAIN);
    }

    @Override // p000.oj7, p000.gu2, p000.lvd, p000.eo5
    public void apply() {
        Iterator<Object> it = this.f67811l0.iterator();
        while (it.hasNext()) {
            this.f67809j0.constraints(it.next()).clearVertical();
        }
        Iterator<Object> it2 = this.f67811l0.iterator();
        gu2 gu2Var = null;
        gu2 gu2Var2 = null;
        while (it2.hasNext()) {
            gu2 gu2VarConstraints = this.f67809j0.constraints(it2.next());
            if (gu2Var2 == null) {
                Object obj = this.f41146S;
                if (obj != null) {
                    gu2VarConstraints.topToTop(obj).margin(this.f41177o).marginGone(this.f41183u);
                } else {
                    Object obj2 = this.f41147T;
                    if (obj2 != null) {
                        gu2VarConstraints.topToBottom(obj2).margin(this.f41177o).marginGone(this.f41183u);
                    } else {
                        gu2VarConstraints.topToTop(f2g.f34895j);
                    }
                }
                gu2Var2 = gu2VarConstraints;
            }
            if (gu2Var != null) {
                gu2Var.bottomToTop(gu2VarConstraints.getKey());
                gu2VarConstraints.topToBottom(gu2Var.getKey());
            }
            gu2Var = gu2VarConstraints;
        }
        if (gu2Var != null) {
            Object obj3 = this.f41148U;
            if (obj3 != null) {
                gu2Var.bottomToTop(obj3).margin(this.f41178p).marginGone(this.f41184v);
            } else {
                Object obj4 = this.f41149V;
                if (obj4 != null) {
                    gu2Var.bottomToBottom(obj4).margin(this.f41178p).marginGone(this.f41184v);
                } else {
                    gu2Var.bottomToBottom(f2g.f34895j);
                }
            }
        }
        if (gu2Var2 == null) {
            return;
        }
        float f = this.f82802n0;
        if (f != 0.5f) {
            gu2Var2.verticalBias(f);
        }
        int i = C6139a.f38842a[this.f82803o0.ordinal()];
        if (i == 1) {
            gu2Var2.setVerticalChainStyle(0);
        } else if (i == 2) {
            gu2Var2.setVerticalChainStyle(1);
        } else {
            if (i != 3) {
                return;
            }
            gu2Var2.setVerticalChainStyle(2);
        }
    }
}
