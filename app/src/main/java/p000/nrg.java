package p000;

import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import org.opencv.videoio.Videoio;
import p000.ms8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,102:1\n148#2:103\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n*L\n96#1:103\n*E\n"})
public final class nrg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final InterfaceC11178py<Float> f65400a = C11760qy.m32055infiniteRepeatable9IiC70o$default(C11760qy.keyframes(C10030b.f65413a), null, 0, 6, null);

    /* JADX INFO: renamed from: b */
    public static final float f65401b = kn4.m30705constructorimpl(2);

    /* JADX INFO: renamed from: nrg$a */
    @dwf({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,102:1\n1223#2,6:103\n1223#2,6:111\n1223#2,6:117\n702#3:109\n77#4:110\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n*L\n46#1:103,6\n54#1:111,6\n57#1:117,6\n48#1:109\n52#1:110\n*E\n"})
    public static final class C10029a extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ he1 f65402a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z39 f65403b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zsg f65404c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ nzb f65405d;

        /* JADX INFO: renamed from: nrg$a$a */
        @ck3(m4009c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", m4010f = "TextFieldCursor.kt", m4011i = {}, m4012l = {55}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f65406a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ wa3 f65407b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wa3 wa3Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f65407b = wa3Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f65407b, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f65406a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    wa3 wa3Var = this.f65407b;
                    this.f65406a = 1;
                    if (wa3Var.snapToVisibleAndAnimate(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return bth.f14751a;
            }
        }

        /* JADX INFO: renamed from: nrg$a$b */
        public static final class b extends tt8 implements qy6<ov2, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ wa3 f65408a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ nzb f65409b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ zsg f65410c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ z39 f65411d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ he1 f65412e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(wa3 wa3Var, nzb nzbVar, zsg zsgVar, z39 z39Var, he1 he1Var) {
                super(1);
                this.f65408a = wa3Var;
                this.f65409b = nzbVar;
                this.f65410c = zsgVar;
                this.f65411d = z39Var;
                this.f65412e = he1Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(ov2 ov2Var) {
                invoke2(ov2Var);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb ov2 ov2Var) {
                rud rudVar;
                hug value;
                ov2Var.drawContent();
                float cursorAlpha = this.f65408a.getCursorAlpha();
                if (cursorAlpha == 0.0f) {
                    return;
                }
                int iOriginalToTransformed = this.f65409b.originalToTransformed(jvg.m30593getStartimpl(this.f65410c.m33527getSelectiond9O1mEE()));
                iug layoutResult = this.f65411d.getLayoutResult();
                if (layoutResult == null || (value = layoutResult.getValue()) == null || (rudVar = value.getCursorRect(iOriginalToTransformed)) == null) {
                    rudVar = new rud(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float fMo27173toPx0680j_4 = ov2Var.mo27173toPx0680j_4(nrg.getDefaultCursorThickness());
                float f = fMo27173toPx0680j_4 / 2;
                float fCoerceAtLeast = kpd.coerceAtLeast(kpd.coerceAtMost(rudVar.getLeft() + f, wpf.m33069getWidthimpl(ov2Var.mo30273getSizeNHjbRc()) - f), f);
                ip4.m30239drawLine1RTmtNc$default(ov2Var, this.f65412e, mzb.Offset(fCoerceAtLeast, rudVar.getTop()), mzb.Offset(fCoerceAtLeast, rudVar.getBottom()), fMo27173toPx0680j_4, 0, null, cursorAlpha, null, 0, Videoio.CAP_PROP_XI_DECIMATION_VERTICAL, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10029a(he1 he1Var, z39 z39Var, zsg zsgVar, nzb nzbVar) {
            super(3);
            this.f65402a = he1Var;
            this.f65403b = z39Var;
            this.f65404c = zsgVar;
            this.f65405d = nzbVar;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v15 ??, still in use, count: 1, list:
              (r11v15 ?? I:java.lang.Object) from 0x00d3: INVOKE (r10v0 ?? I:zl2), (r11v15 ?? I:java.lang.Object) INTERFACE call: zl2.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:23)
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
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v15 ??, still in use, count: 1, list:
              (r11v15 ?? I:java.lang.Object) from 0x00d3: INVOKE (r10v0 ?? I:zl2), (r11v15 ?? I:java.lang.Object) INTERFACE call: zl2.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:23)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
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

    /* JADX INFO: renamed from: nrg$b */
    public static final class C10030b extends tt8 implements qy6<ms8.C9496b<Float>, bth> {

        /* JADX INFO: renamed from: a */
        public static final C10030b f65413a = new C10030b();

        public C10030b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ms8.C9496b<Float> c9496b) {
            invoke2(c9496b);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ms8.C9496b<Float> c9496b) {
            c9496b.setDurationMillis(1000);
            Float fValueOf = Float.valueOf(1.0f);
            c9496b.mo17540at(fValueOf, 0);
            c9496b.mo17540at(fValueOf, Videoio.CAP_PROP_XI_ACQ_FRAME_BURST_COUNT);
            Float fValueOf2 = Float.valueOf(0.0f);
            c9496b.mo17540at(fValueOf2, 500);
            c9496b.mo17540at(fValueOf2, 999);
        }
    }

    @yfb
    public static final InterfaceC0701e cursor(@yfb InterfaceC0701e interfaceC0701e, @yfb z39 z39Var, @yfb zsg zsgVar, @yfb nzb nzbVar, @yfb he1 he1Var, boolean z) {
        return z ? C0696c.composed$default(interfaceC0701e, null, new C10029a(he1Var, z39Var, zsgVar, nzbVar), 1, null) : interfaceC0701e;
    }

    public static final float getDefaultCursorThickness() {
        return f65401b;
    }
}
