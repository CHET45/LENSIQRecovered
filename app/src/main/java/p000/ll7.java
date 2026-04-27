package p000;

import java.util.Iterator;
import p000.f2g;

/* JADX INFO: loaded from: classes.dex */
public class ll7 extends st1 {

    /* JADX INFO: renamed from: ll7$a */
    public static /* synthetic */ class C8886a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58142a;

        static {
            int[] iArr = new int[f2g.EnumC5562b.values().length];
            f58142a = iArr;
            try {
                iArr[f2g.EnumC5562b.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58142a[f2g.EnumC5562b.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58142a[f2g.EnumC5562b.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ll7(f2g f2gVar) {
        super(f2gVar, f2g.EnumC5565e.HORIZONTAL_CHAIN);
    }

    @Override // p000.oj7, p000.gu2, p000.lvd, p000.eo5
    public void apply() {
        Iterator<Object> it = this.f67811l0.iterator();
        while (it.hasNext()) {
            this.f67809j0.constraints(it.next()).clearHorizontal();
        }
        Iterator<Object> it2 = this.f67811l0.iterator();
        gu2 gu2Var = null;
        gu2 gu2Var2 = null;
        while (it2.hasNext()) {
            gu2 gu2VarConstraints = this.f67809j0.constraints(it2.next());
            if (gu2Var2 == null) {
                Object obj = this.f41142O;
                if (obj != null) {
                    gu2VarConstraints.startToStart(obj).margin(this.f41175m).marginGone(this.f41181s);
                } else {
                    Object obj2 = this.f41143P;
                    if (obj2 != null) {
                        gu2VarConstraints.startToEnd(obj2).margin(this.f41175m).marginGone(this.f41181s);
                    } else {
                        Object obj3 = this.f41138K;
                        if (obj3 != null) {
                            gu2VarConstraints.startToStart(obj3).margin(this.f41173k).marginGone(this.f41179q);
                        } else {
                            Object obj4 = this.f41139L;
                            if (obj4 != null) {
                                gu2VarConstraints.startToEnd(obj4).margin(this.f41173k).marginGone(this.f41179q);
                            } else {
                                gu2VarConstraints.startToStart(f2g.f34895j);
                            }
                        }
                    }
                }
                gu2Var2 = gu2VarConstraints;
            }
            if (gu2Var != null) {
                gu2Var.endToStart(gu2VarConstraints.getKey());
                gu2VarConstraints.startToEnd(gu2Var.getKey());
            }
            gu2Var = gu2VarConstraints;
        }
        if (gu2Var != null) {
            Object obj5 = this.f41144Q;
            if (obj5 != null) {
                gu2Var.endToStart(obj5).margin(this.f41176n).marginGone(this.f41182t);
            } else {
                Object obj6 = this.f41145R;
                if (obj6 != null) {
                    gu2Var.endToEnd(obj6).margin(this.f41176n).marginGone(this.f41182t);
                } else {
                    Object obj7 = this.f41140M;
                    if (obj7 != null) {
                        gu2Var.endToStart(obj7).margin(this.f41174l).marginGone(this.f41180r);
                    } else {
                        Object obj8 = this.f41141N;
                        if (obj8 != null) {
                            gu2Var.endToEnd(obj8).margin(this.f41174l).marginGone(this.f41180r);
                        } else {
                            gu2Var.endToEnd(f2g.f34895j);
                        }
                    }
                }
            }
        }
        if (gu2Var2 == null) {
            return;
        }
        float f = this.f82802n0;
        if (f != 0.5f) {
            gu2Var2.horizontalBias(f);
        }
        int i = C8886a.f58142a[this.f82803o0.ordinal()];
        if (i == 1) {
            gu2Var2.setHorizontalChainStyle(0);
        } else if (i == 2) {
            gu2Var2.setHorizontalChainStyle(1);
        } else {
            if (i != 3) {
                return;
            }
            gu2Var2.setHorizontalChainStyle(2);
        }
    }
}
