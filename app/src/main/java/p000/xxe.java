package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class xxe {

    /* JADX INFO: renamed from: c */
    public static final int f99639c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final lw8 f99640a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final s05 f99641b;

    public xxe(@yfb lw8 lw8Var, @yfb s05 s05Var) {
        this.f99640a = lw8Var;
        this.f99641b = s05Var;
    }

    @yfb
    public final txe getRootSemanticsNode() {
        return vxe.SemanticsNode(this.f99640a, true);
    }

    @yfb
    public final txe getUnmergedRootSemanticsNode() {
        return new txe(this.f99641b, false, this.f99640a, new nxe());
    }
}
