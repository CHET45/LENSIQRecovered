package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,490:1\n81#2:491\n107#2,2:492\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n*L\n402#1:491\n402#1:492,2\n*E\n"})
public abstract class t48 implements gxa, oxa<vli> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final z6b f83693a;

    public /* synthetic */ t48(jt3 jt3Var) {
        this();
    }

    private final vli getConsumedInsets() {
        return (vli) this.f83693a.getValue();
    }

    private final void setConsumedInsets(vli vliVar) {
        this.f83693a.setValue(vliVar);
    }

    @yfb
    public abstract vli calculateInsets(@yfb vli vliVar);

    @Override // p000.oxa
    @yfb
    public aid<vli> getKey() {
        return soi.getModifierLocalConsumedWindowInsets();
    }

    @Override // p000.gxa
    public void onModifierLocalsUpdated(@yfb qxa qxaVar) {
        setConsumedInsets(calculateInsets((vli) qxaVar.getCurrent(soi.getModifierLocalConsumedWindowInsets())));
    }

    private t48() {
        this.f83693a = xtf.mutableStateOf$default(goi.WindowInsets(0, 0, 0, 0), null, 2, null);
    }

    @Override // p000.oxa
    @yfb
    public vli getValue() {
        return getConsumedInsets();
    }
}
