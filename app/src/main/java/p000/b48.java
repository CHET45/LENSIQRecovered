package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nInputModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,77:1\n81#2:78\n107#2,2:79\n*S KotlinDebug\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n*L\n72#1:78\n72#1:79,2\n*E\n"})
@e0g(parameters = 1)
public final class b48 implements a48 {

    /* JADX INFO: renamed from: c */
    public static final int f12672c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<z38, Boolean> f12673a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final z6b f12674b;

    public /* synthetic */ b48(int i, qy6 qy6Var, jt3 jt3Var) {
        this(i, qy6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.a48
    /* JADX INFO: renamed from: getInputMode-aOaMEAU */
    public int mo27183getInputModeaOaMEAU() {
        return ((z38) this.f12674b.getValue()).m33484unboximpl();
    }

    @Override // p000.a48
    @ug5
    /* JADX INFO: renamed from: requestInputMode-iuPiT84 */
    public boolean mo27184requestInputModeiuPiT84(int i) {
        return this.f12673a.invoke(z38.m33478boximpl(i)).booleanValue();
    }

    /* JADX INFO: renamed from: setInputMode-iuPiT84, reason: not valid java name */
    public void m27950setInputModeiuPiT84(int i) {
        this.f12674b.setValue(z38.m33478boximpl(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b48(int i, qy6<? super z38, Boolean> qy6Var) {
        this.f12673a = qy6Var;
        this.f12674b = xtf.mutableStateOf$default(z38.m33478boximpl(i), null, 2, null);
    }
}
