package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class rb4 {

    /* JADX INFO: renamed from: f */
    public static final int f77641f = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f77642a;

    /* JADX INFO: renamed from: b */
    public final boolean f77643b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final yte f77644c;

    /* JADX INFO: renamed from: d */
    public final boolean f77645d;

    /* JADX INFO: renamed from: e */
    public final boolean f77646e;

    public rb4() {
        this(false, false, null, false, false, 31, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb4)) {
            return false;
        }
        rb4 rb4Var = (rb4) obj;
        return this.f77642a == rb4Var.f77642a && this.f77643b == rb4Var.f77643b && this.f77644c == rb4Var.f77644c && this.f77645d == rb4Var.f77645d && this.f77646e == rb4Var.f77646e;
    }

    public final boolean getDecorFitsSystemWindows() {
        return this.f77646e;
    }

    public final boolean getDismissOnBackPress() {
        return this.f77642a;
    }

    public final boolean getDismissOnClickOutside() {
        return this.f77643b;
    }

    @yfb
    public final yte getSecurePolicy() {
        return this.f77644c;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.f77645d;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f77642a) * 31) + Boolean.hashCode(this.f77643b)) * 31) + this.f77644c.hashCode()) * 31) + Boolean.hashCode(this.f77645d)) * 31) + Boolean.hashCode(this.f77646e);
    }

    public rb4(boolean z, boolean z2, @yfb yte yteVar, boolean z3, boolean z4) {
        this.f77642a = z;
        this.f77643b = z2;
        this.f77644c = yteVar;
        this.f77645d = z3;
        this.f77646e = z4;
    }

    public /* synthetic */ rb4(boolean z, boolean z2, yte yteVar, boolean z3, boolean z4, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? yte.Inherit : yteVar, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4);
    }

    public /* synthetic */ rb4(boolean z, boolean z2, boolean z3, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }

    public rb4(boolean z, boolean z2, boolean z3) {
        this(z, z2, yte.Inherit, z3, true);
    }

    public /* synthetic */ rb4(boolean z, boolean z2, yte yteVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? yte.Inherit : yteVar);
    }

    @q64(level = u64.f86867c, message = "Maintained for binary compatibility")
    public /* synthetic */ rb4(boolean z, boolean z2, yte yteVar) {
        this(z, z2, yteVar, true, true);
    }
}
