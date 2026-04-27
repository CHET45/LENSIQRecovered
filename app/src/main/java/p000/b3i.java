package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
@e0g(parameters = 1)
public final class b3i extends AbstractC14853x<u1i> {

    /* JADX INFO: renamed from: e */
    public static final int f12615e = 0;

    public b3i(@yfb u1i u1iVar) {
        super(u1iVar);
    }

    private final mb7 asGroup(u1i u1iVar) {
        if (u1iVar instanceof mb7) {
            return (mb7) u1iVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // p000.AbstractC14853x
    /* JADX INFO: renamed from: b */
    public void mo2892b() {
        mb7 mb7VarAsGroup = asGroup(getRoot());
        mb7VarAsGroup.remove(0, mb7VarAsGroup.getNumChildren());
    }

    @Override // p000.p40
    public void move(int i, int i2, int i3) {
        asGroup(getCurrent()).move(i, i2, i3);
    }

    @Override // p000.p40
    public void remove(int i, int i2) {
        asGroup(getCurrent()).remove(i, i2);
    }

    @Override // p000.p40
    public void insertBottomUp(int i, @yfb u1i u1iVar) {
        asGroup(getCurrent()).insertAt(i, u1iVar);
    }

    @Override // p000.p40
    public void insertTopDown(int i, @yfb u1i u1iVar) {
    }
}
