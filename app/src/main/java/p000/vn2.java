package p000;

/* JADX INFO: loaded from: classes.dex */
@tg5
@e0g(parameters = 0)
public final class vn2 {

    /* JADX INFO: renamed from: c */
    public static final int f91769c = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public tn2 f91770a;

    /* JADX INFO: renamed from: b */
    public boolean f91771b;

    public vn2() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @gib
    public final tn2 getObserver() {
        return this.f91770a;
    }

    public final boolean getRoot() {
        return this.f91771b;
    }

    public final void setObserver(@gib tn2 tn2Var) {
        this.f91770a = tn2Var;
    }

    public final void setRoot(boolean z) {
        this.f91771b = z;
    }

    public vn2(@gib tn2 tn2Var, boolean z) {
        this.f91770a = tn2Var;
        this.f91771b = z;
    }

    public /* synthetic */ vn2(tn2 tn2Var, boolean z, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : tn2Var, (i & 2) != 0 ? false : z);
    }
}
