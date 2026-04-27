package p000;

/* JADX INFO: loaded from: classes.dex */
@ah5
@dwf({"SMAP\nDragAndDropTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropTarget.kt\nandroidx/compose/foundation/draganddrop/DragAndDropTargetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
public final class do4 extends d44 {

    /* JADX INFO: renamed from: M1 */
    @yfb
    public qy6<? super tn4, Boolean> f30246M1;

    /* JADX INFO: renamed from: V1 */
    @yfb
    public co4 f30247V1;

    /* JADX INFO: renamed from: Z1 */
    @gib
    public vn4 f30248Z1;

    /* JADX INFO: renamed from: do4$a */
    public static final class C4888a extends tt8 implements qy6<tn4, Boolean> {
        public C4888a() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb tn4 tn4Var) {
            return (Boolean) do4.this.f30246M1.invoke(tn4Var);
        }
    }

    public do4(@yfb qy6<? super tn4, Boolean> qy6Var, @yfb co4 co4Var) {
        this.f30246M1 = qy6Var;
        this.f30247V1 = co4Var;
    }

    private final void createAndAttachDragAndDropModifierNode() {
        this.f30248Z1 = (vn4) m8877a(xn4.DragAndDropModifierNode(new C4888a(), this.f30247V1));
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        createAndAttachDragAndDropModifierNode();
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        vn4 vn4Var = this.f30248Z1;
        md8.checkNotNull(vn4Var);
        m8878b(vn4Var);
    }

    public final void update(@yfb qy6<? super tn4, Boolean> qy6Var, @yfb co4 co4Var) {
        this.f30246M1 = qy6Var;
        if (md8.areEqual(co4Var, this.f30247V1)) {
            return;
        }
        vn4 vn4Var = this.f30248Z1;
        if (vn4Var != null) {
            m8878b(vn4Var);
        }
        this.f30247V1 = co4Var;
        createAndAttachDragAndDropModifierNode();
    }
}
