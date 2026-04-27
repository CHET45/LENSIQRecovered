package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/ScopedGraphicsContext\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,425:1\n42#2,7:426\n1#3:433\n305#4,6:434\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/ScopedGraphicsContext\n*L\n200#1:426,7\n218#1:434,6\n*E\n"})
public final class bre implements s97 {

    /* JADX INFO: renamed from: a */
    @gib
    public f6b<u97> f14603a;

    /* JADX INFO: renamed from: b */
    @gib
    public s97 f14604b;

    @Override // p000.s97
    @yfb
    public u97 createGraphicsLayer() {
        s97 s97Var = this.f14604b;
        if (!(s97Var != null)) {
            g28.throwIllegalStateException("GraphicsContext not provided");
        }
        u97 u97VarCreateGraphicsLayer = s97Var.createGraphicsLayer();
        f6b<u97> f6bVar = this.f14603a;
        if (f6bVar == null) {
            this.f14603a = dkb.mutableObjectListOf(u97VarCreateGraphicsLayer);
        } else {
            f6bVar.add(u97VarCreateGraphicsLayer);
        }
        return u97VarCreateGraphicsLayer;
    }

    @gib
    public final s97 getGraphicsContext() {
        return this.f14604b;
    }

    @Override // p000.s97
    public void releaseGraphicsLayer(@yfb u97 u97Var) {
        s97 s97Var = this.f14604b;
        if (s97Var != null) {
            s97Var.releaseGraphicsLayer(u97Var);
        }
    }

    public final void releaseGraphicsLayers() {
        f6b<u97> f6bVar = this.f14603a;
        if (f6bVar != null) {
            Object[] objArr = f6bVar.f16823a;
            int i = f6bVar.f16824b;
            for (int i2 = 0; i2 < i; i2++) {
                releaseGraphicsLayer((u97) objArr[i2]);
            }
            f6bVar.clear();
        }
    }

    public final void setGraphicsContext(@gib s97 s97Var) {
        releaseGraphicsLayers();
        this.f14604b = s97Var;
    }
}
