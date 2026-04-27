package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,253:1\n81#2:254\n107#2,2:255\n53#3,7:257\n53#3,7:264\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n*L\n44#1:254\n44#1:255,2\n51#1:257,7\n57#1:264,7\n*E\n"})
@e0g(parameters = 1)
public final class xmf extends lxa {

    /* JADX INFO: renamed from: d */
    public static final int f98545d = 0;

    /* JADX INFO: renamed from: b */
    @yfb
    public final fxa<?> f98546b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b f98547c;

    public xmf(@yfb fxa<?> fxaVar) {
        super(null);
        this.f98546b = fxaVar;
        this.f98547c = xtf.mutableStateOf$default(null, null, 2, null);
    }

    private final Object getValue() {
        return this.f98547c.getValue();
    }

    private final void setValue(Object obj) {
        this.f98547c.setValue(obj);
    }

    @Override // p000.lxa
    public boolean contains$ui_release(@yfb fxa<?> fxaVar) {
        return fxaVar == this.f98546b;
    }

    public final void forceValue$ui_release(@gib Object obj) {
        setValue(obj);
    }

    @Override // p000.lxa
    @gib
    public <T> T get$ui_release(@yfb fxa<T> fxaVar) {
        if (!(fxaVar == this.f98546b)) {
            g28.throwIllegalStateException("Check failed.");
        }
        T t = (T) getValue();
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // p000.lxa
    /* JADX INFO: renamed from: set$ui_release */
    public <T> void mo30446set$ui_release(@yfb fxa<T> fxaVar, T t) {
        if (!(fxaVar == this.f98546b)) {
            g28.throwIllegalStateException("Check failed.");
        }
        setValue(t);
    }
}
