package p000;

import java.util.ArrayList;
import p000.cj4;

/* JADX INFO: loaded from: classes5.dex */
public final class ve9 {

    /* JADX INFO: renamed from: a */
    public final int f90792a;

    /* JADX INFO: renamed from: b */
    public final boolean f90793b;

    /* JADX INFO: renamed from: c */
    public final qy7<ci4> f90794c;

    /* JADX INFO: renamed from: d */
    public final qy7<ci4> f90795d;

    /* JADX INFO: renamed from: ve9$a */
    public static /* synthetic */ class C14018a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f90796a;

        static {
            int[] iArr = new int[cj4.EnumC2330a.values().length];
            f90796a = iArr;
            try {
                iArr[cj4.EnumC2330a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90796a[cj4.EnumC2330a.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ve9(int i, boolean z, qy7<ci4> qy7Var, qy7<ci4> qy7Var2) {
        this.f90792a = i;
        this.f90793b = z;
        this.f90794c = qy7Var;
        this.f90795d = qy7Var2;
    }

    public static ve9 fromViewSnapshot(int i, lbi lbiVar) {
        qy7 qy7Var = new qy7(new ArrayList(), ci4.comparator());
        qy7 qy7Var2 = new qy7(new ArrayList(), ci4.comparator());
        for (cj4 cj4Var : lbiVar.getChanges()) {
            int i2 = C14018a.f90796a[cj4Var.getType().ordinal()];
            if (i2 == 1) {
                qy7Var = qy7Var.insert(cj4Var.getDocument().getKey());
            } else if (i2 == 2) {
                qy7Var2 = qy7Var2.insert(cj4Var.getDocument().getKey());
            }
        }
        return new ve9(i, lbiVar.isFromCache(), qy7Var, qy7Var2);
    }

    public qy7<ci4> getAdded() {
        return this.f90794c;
    }

    public qy7<ci4> getRemoved() {
        return this.f90795d;
    }

    public int getTargetId() {
        return this.f90792a;
    }

    public boolean isFromCache() {
        return this.f90793b;
    }
}
