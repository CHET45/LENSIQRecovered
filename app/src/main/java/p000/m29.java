package p000;

import androidx.compose.foundation.layout.C0648y;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,169:1\n1223#2,6:170\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n*L\n51#1:170,6\n*E\n"})
public final class m29 {

    /* JADX INFO: renamed from: m29$a */
    public /* synthetic */ class C9106a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59734a;

        static {
            int[] iArr = new int[t7c.values().length];
            try {
                iArr[t7c.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t7c.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f59734a = iArr;
        }
    }

    /* JADX INFO: renamed from: m29$b */
    @dwf({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,169:1\n50#2:170\n50#2:171\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n*L\n92#1:170\n95#1:171\n*E\n"})
    public static final class C9107b extends tt8 implements gz6<zz8, ku2, o29> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ x13 f59735C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ s97 f59736F;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z29 f59737a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ t7c f59738b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zy8 f59739c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ny6<c29> f59740d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ vac f59741e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f59742f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ float f59743m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9107b(z29 z29Var, t7c t7cVar, zy8 zy8Var, ny6<? extends c29> ny6Var, vac vacVar, boolean z, float f, x13 x13Var, s97 s97Var) {
            super(2);
            this.f59737a = z29Var;
            this.f59738b = t7cVar;
            this.f59739c = zy8Var;
            this.f59740d = ny6Var;
            this.f59741e = vacVar;
            this.f59742f = z;
            this.f59743m = f;
            this.f59735C = x13Var;
            this.f59736F = s97Var;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ o29 invoke(zz8 zz8Var, ku2 ku2Var) {
            return m30943invoke0kLqBqw(zz8Var, ku2Var.m30769unboximpl());
        }

        @yfb
        /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
        public final o29 m30943invoke0kLqBqw(@yfb zz8 zz8Var, long j) {
            aub.m27883attachToScopeimpl(this.f59737a.m33464getMeasurementScopeInvalidatorzYiylxw$foundation_release());
            fy1.m29679checkScrollableContainerConstraintsK40F9xA(j, this.f59738b);
            x29 x29VarMo32844invoke0kLqBqw = this.f59739c.mo32844invoke0kLqBqw(zz8Var, j);
            boolean z = this.f59738b == t7c.Vertical;
            c29 c29VarInvoke = this.f59740d.invoke();
            int iMo27167roundToPx0680j_4 = zz8Var.mo27167roundToPx0680j_4(m29.beforePadding(this.f59741e, this.f59738b, this.f59742f, zz8Var.getLayoutDirection()));
            int iMo27167roundToPx0680j_42 = zz8Var.mo27167roundToPx0680j_4(m29.afterPadding(this.f59741e, this.f59738b, this.f59742f, zz8Var.getLayoutDirection()));
            int iMo27167roundToPx0680j_43 = zz8Var.mo27167roundToPx0680j_4(m29.startPadding(this.f59741e, this.f59738b, zz8Var.getLayoutDirection()));
            int iM30762getMaxHeightimpl = ((z ? ku2.m30762getMaxHeightimpl(j) : ku2.m30763getMaxWidthimpl(j)) - iMo27167roundToPx0680j_4) - iMo27167roundToPx0680j_42;
            long jIntOffset = z ? b78.IntOffset(iMo27167roundToPx0680j_43, iMo27167roundToPx0680j_4) : b78.IntOffset(iMo27167roundToPx0680j_4, iMo27167roundToPx0680j_43);
            vac vacVar = this.f59741e;
            int iMo27167roundToPx0680j_44 = zz8Var.mo27167roundToPx0680j_4(kn4.m30705constructorimpl(C0648y.calculateStartPadding(vacVar, zz8Var.getLayoutDirection()) + C0648y.calculateEndPadding(vacVar, zz8Var.getLayoutDirection())));
            vac vacVar2 = this.f59741e;
            boolean z2 = z;
            o29 o29VarM30806measureStaggeredGridXtK8cYQ = l29.m30806measureStaggeredGridXtK8cYQ(zz8Var, this.f59737a, pz8.calculateLazyLayoutPinnedIndices(c29VarInvoke, this.f59737a.getPinnedItems$foundation_release(), this.f59737a.getBeyondBoundsInfo$foundation_release()), c29VarInvoke, x29VarMo32844invoke0kLqBqw, ku2.m30754copyZbe2FdA$default(j, nu2.m31227constrainWidthK40F9xA(j, iMo27167roundToPx0680j_44), 0, nu2.m31226constrainHeightK40F9xA(j, zz8Var.mo27167roundToPx0680j_4(kn4.m30705constructorimpl(vacVar2.mo32752calculateTopPaddingD9Ej5fM() + vacVar2.mo32749calculateBottomPaddingD9Ej5fM()))), 0, 10, null), z2, this.f59742f, jIntOffset, iM30762getMaxHeightimpl, zz8Var.mo27167roundToPx0680j_4(this.f59743m), iMo27167roundToPx0680j_4, iMo27167roundToPx0680j_42, this.f59735C, this.f59736F);
            z29.applyMeasureResult$foundation_release$default(this.f59737a, o29VarM30806measureStaggeredGridXtK8cYQ, false, 2, null);
            return o29VarM30806measureStaggeredGridXtK8cYQ;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float afterPadding(vac vacVar, t7c t7cVar, boolean z, ov8 ov8Var) {
        int i = C9106a.f59734a[t7cVar.ordinal()];
        if (i == 1) {
            return z ? vacVar.mo32752calculateTopPaddingD9Ej5fM() : vacVar.mo32749calculateBottomPaddingD9Ej5fM();
        }
        if (i == 2) {
            return z ? C0648y.calculateStartPadding(vacVar, ov8Var) : C0648y.calculateEndPadding(vacVar, ov8Var);
        }
        throw new ceb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float beforePadding(vac vacVar, t7c t7cVar, boolean z, ov8 ov8Var) {
        int i = C9106a.f59734a[t7cVar.ordinal()];
        if (i == 1) {
            return z ? vacVar.mo32749calculateBottomPaddingD9Ej5fM() : vacVar.mo32752calculateTopPaddingD9Ej5fM();
        }
        if (i == 2) {
            return z ? C0648y.calculateEndPadding(vacVar, ov8Var) : C0648y.calculateStartPadding(vacVar, ov8Var);
        }
        throw new ceb();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v4 ??, still in use, count: 1, list:
          (r1v4 ?? I:java.lang.Object) from 0x00f7: INVOKE (r25v0 ?? I:zl2), (r1v4 ?? I:java.lang.Object) INTERFACE call: zl2.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @p000.yfb
    @p000.hk2
    /* JADX INFO: renamed from: rememberStaggeredGridMeasurePolicy-qKj4JfE, reason: not valid java name */
    public static final p000.gz6<p000.zz8, p000.ku2, p000.o29> m30942rememberStaggeredGridMeasurePolicyqKj4JfE(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v4 ??, still in use, count: 1, list:
          (r1v4 ?? I:java.lang.Object) from 0x00f7: INVOKE (r25v0 ?? I:zl2), (r1v4 ?? I:java.lang.Object) INTERFACE call: zl2.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final float startPadding(vac vacVar, t7c t7cVar, ov8 ov8Var) {
        int i = C9106a.f59734a[t7cVar.ordinal()];
        if (i == 1) {
            return C0648y.calculateStartPadding(vacVar, ov8Var);
        }
        if (i == 2) {
            return vacVar.mo32752calculateTopPaddingD9Ej5fM();
        }
        throw new ceb();
    }
}
