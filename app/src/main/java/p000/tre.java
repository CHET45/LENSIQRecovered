package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tre {

    /* JADX INFO: renamed from: tre$a */
    @dwf({"SMAP\nScrollIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollIntoViewRequester.kt\nandroidx/compose/foundation/relocation/ScrollIntoView__ScrollIntoViewRequesterKt$scrollIntoView$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
    public static final class C13178a extends tt8 implements ny6<rud> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rud f85678a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mv8 f85679b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13178a(rud rudVar, mv8 mv8Var) {
            super(0);
            this.f85678a = rudVar;
            this.f85679b = mv8Var;
        }

        @Override // p000.ny6
        @gib
        public final rud invoke() {
            rud rudVar = this.f85678a;
            if (rudVar != null) {
                return rudVar;
            }
            mv8 mv8Var = this.f85679b;
            if (!mv8Var.isAttached()) {
                mv8Var = null;
            }
            if (mv8Var != null) {
                return eqf.m28845toRectuvyYCjk(s78.m32288toSizeozmzZPI(mv8Var.mo30031getSizeYbymL2g()));
            }
            return null;
        }
    }

    @gib
    public static final Object scrollIntoView(@yfb v34 v34Var, @gib rud rudVar, @yfb zy2<? super bth> zy2Var) {
        Object objBringChildIntoView;
        if (!v34Var.getNode().isAttached()) {
            return bth.f14751a;
        }
        mv8 mv8VarRequireLayoutCoordinates = w34.requireLayoutCoordinates(v34Var);
        kd1 kd1VarFindBringIntoViewParent = od1.findBringIntoViewParent(v34Var);
        return (kd1VarFindBringIntoViewParent != null && (objBringChildIntoView = kd1VarFindBringIntoViewParent.bringChildIntoView(mv8VarRequireLayoutCoordinates, new C13178a(rudVar, mv8VarRequireLayoutCoordinates), zy2Var)) == pd8.getCOROUTINE_SUSPENDED()) ? objBringChildIntoView : bth.f14751a;
    }

    public static /* synthetic */ Object scrollIntoView$default(v34 v34Var, rud rudVar, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            rudVar = null;
        }
        return sre.scrollIntoView(v34Var, rudVar, zy2Var);
    }
}
