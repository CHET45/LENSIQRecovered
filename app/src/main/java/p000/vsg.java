package p000;

import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
public final class vsg {

    /* JADX INFO: renamed from: vsg$a */
    @dwf({"SMAP\nTextFieldSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,114:1\n77#2:115\n77#2:116\n77#2:117\n1223#3,6:118\n1223#3,6:124\n1223#3,6:130\n1223#3,6:136\n81#4:142\n*S KotlinDebug\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n*L\n38#1:115\n39#1:116\n40#1:117\n42#1:118,6\n45#1:124,6\n54#1:130,6\n60#1:136,6\n45#1:142\n*E\n"})
    public static final class C14252a extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yvg f92189a;

        /* JADX INFO: renamed from: vsg$a$a */
        public static final class a extends tt8 implements kz6<InterfaceC0761n, rba, ku2, vba> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ usg f92190a;

            /* JADX INFO: renamed from: vsg$a$a$a, reason: collision with other inner class name */
            public static final class C16544a extends tt8 implements qy6<AbstractC0767t.a, bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AbstractC0767t f92191a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16544a(AbstractC0767t abstractC0767t) {
                    super(1);
                    this.f92191a = abstractC0767t;
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
                    invoke2(aVar);
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@yfb AbstractC0767t.a aVar) {
                    AbstractC0767t.a.placeRelative$default(aVar, this.f92191a, 0, 0, 0.0f, 4, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(usg usgVar) {
                super(3);
                this.f92190a = usgVar;
            }

            @Override // p000.kz6
            public /* bridge */ /* synthetic */ vba invoke(InterfaceC0761n interfaceC0761n, rba rbaVar, ku2 ku2Var) {
                return m32815invoke3p2s80s(interfaceC0761n, rbaVar, ku2Var.m30769unboximpl());
            }

            @yfb
            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
            public final vba m32815invoke3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
                long jM32658getMinSizeYbymL2g = this.f92190a.m32658getMinSizeYbymL2g();
                AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(ku2.m30754copyZbe2FdA$default(j, kpd.coerceIn(r78.m32087getWidthimpl(jM32658getMinSizeYbymL2g), ku2.m30765getMinWidthimpl(j), ku2.m30763getMaxWidthimpl(j)), 0, kpd.coerceIn(r78.m32086getHeightimpl(jM32658getMinSizeYbymL2g), ku2.m30764getMinHeightimpl(j), ku2.m30762getMaxHeightimpl(j)), 0, 10, null));
                return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C16544a(abstractC0767tMo27949measureBRTryo0), 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14252a(yvg yvgVar) {
            super(3);
            this.f92189a = yvgVar;
        }

        private static final Object invoke$lambda$2(i2g<? extends Object> i2gVar) {
            return i2gVar.getValue();
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 ??, still in use, count: 1, list:
              (r10v2 ?? I:java.lang.Object) from 0x00c4: INVOKE (r13v0 ?? I:zl2), (r10v2 ?? I:java.lang.Object) INTERFACE call: zl2.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:31)
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
        public final androidx.compose.p002ui.InterfaceC0701e invoke(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 ??, still in use, count: 1, list:
              (r10v2 ?? I:java.lang.Object) from 0x00c4: INVOKE (r13v0 ?? I:zl2), (r10v2 ?? I:java.lang.Object) INTERFACE call: zl2.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:31)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
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
    }

    @yfb
    public static final InterfaceC0701e textFieldMinSize(@yfb InterfaceC0701e interfaceC0701e, @yfb yvg yvgVar) {
        return C0696c.composed$default(interfaceC0701e, null, new C14252a(yvgVar), 1, null);
    }
}
