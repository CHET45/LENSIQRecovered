package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/BackwardsCompatLocalMap\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,253:1\n53#2,7:254\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/BackwardsCompatLocalMap\n*L\n73#1:254,7\n*E\n"})
@e0g(parameters = 0)
public final class cp0 extends lxa {

    /* JADX INFO: renamed from: c */
    public static final int f26707c = 8;

    /* JADX INFO: renamed from: b */
    @yfb
    public oxa<?> f26708b;

    public cp0(@yfb oxa<?> oxaVar) {
        super(null);
        this.f26708b = oxaVar;
    }

    @Override // p000.lxa
    public boolean contains$ui_release(@yfb fxa<?> fxaVar) {
        return fxaVar == this.f26708b.getKey();
    }

    @Override // p000.lxa
    @gib
    public <T> T get$ui_release(@yfb fxa<T> fxaVar) {
        if (!(fxaVar == this.f26708b.getKey())) {
            g28.throwIllegalStateException("Check failed.");
        }
        return (T) this.f26708b.getValue();
    }

    @yfb
    public final oxa<?> getElement() {
        return this.f26708b;
    }

    @Override // p000.lxa
    /* JADX INFO: renamed from: set$ui_release */
    public <T> void mo30446set$ui_release(@yfb fxa<T> fxaVar, T t) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider");
    }

    public final void setElement(@yfb oxa<?> oxaVar) {
        this.f26708b = oxaVar;
    }
}
