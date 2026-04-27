package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import java.util.List;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,157:1\n1223#2,6:158\n1223#2,6:164\n1223#2,6:170\n1223#2,6:179\n77#3:176\n77#3:177\n77#3:178\n81#4:185\n107#4,2:186\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n*L\n50#1:158,6\n54#1:164,6\n96#1:170,6\n150#1:179,6\n98#1:176\n99#1:177\n100#1:178\n50#1:185\n50#1:186,2\n*E\n"})
public final class owe {

    /* JADX INFO: renamed from: owe$a */
    public static final class C10686a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<zl2, Integer, bth> f69077a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f69078b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10686a(gz6<? super zl2, ? super Integer, bth> gz6Var, int i) {
            super(2);
            this.f69077a = gz6Var;
            this.f69078b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            owe.DisableSelection(this.f69077a, zl2Var, tsd.updateChangedFlags(this.f69078b | 1));
        }
    }

    /* JADX INFO: renamed from: owe$b */
    public static final class C10687b extends tt8 implements qy6<gwe, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z6b<gwe> f69079a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10687b(z6b<gwe> z6bVar) {
            super(1);
            this.f69079a = z6bVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(gwe gweVar) {
            invoke2(gweVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib gwe gweVar) {
            owe.SelectionContainer$lambda$2(this.f69079a, gweVar);
        }
    }

    /* JADX INFO: renamed from: owe$c */
    public static final class C10688c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f69080a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6<zl2, Integer, bth> f69081b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f69082c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f69083d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10688c(InterfaceC0701e interfaceC0701e, gz6<? super zl2, ? super Integer, bth> gz6Var, int i, int i2) {
            super(2);
            this.f69080a = interfaceC0701e;
            this.f69081b = gz6Var;
            this.f69082c = i;
            this.f69083d = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            owe.SelectionContainer(this.f69080a, this.f69081b, zl2Var, tsd.updateChangedFlags(this.f69082c | 1), this.f69083d);
        }
    }

    /* JADX INFO: renamed from: owe$d */
    public static final class C10689d extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fxe f69084a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f69085b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zwe f69086c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<zl2, Integer, bth> f69087d;

        /* JADX INFO: renamed from: owe$d$a */
        public static final class a extends tt8 implements gz6<zl2, Integer, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0701e f69088a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zwe f69089b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ gz6<zl2, Integer, bth> f69090c;

            /* JADX INFO: renamed from: owe$d$a$a, reason: collision with other inner class name */
            @dwf({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$3$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,157:1\n33#2,4:158\n38#2:180\n1223#3,6:162\n1223#3,6:168\n1223#3,6:174\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$3$1$1\n*L\n115#1:158,4\n115#1:180\n116#1:162,6\n120#1:168,6\n139#1:174,6\n*E\n"})
            public static final class C16497a extends tt8 implements gz6<zl2, Integer, bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ gz6<zl2, Integer, bth> f69091a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ zwe f69092b;

                /* JADX INFO: renamed from: owe$d$a$a$a, reason: collision with other inner class name */
                @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1$1$1$1$1", m4010f = "SelectionContainer.kt", m4011i = {}, m4012l = {140}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
                public static final class C16498a extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

                    /* JADX INFO: renamed from: a */
                    public int f69093a;

                    /* JADX INFO: renamed from: b */
                    public /* synthetic */ Object f69094b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ zqg f69095c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C16498a(zqg zqgVar, zy2<? super C16498a> zy2Var) {
                        super(2, zy2Var);
                        this.f69095c = zqgVar;
                    }

                    @Override // p000.tq0
                    @yfb
                    public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                        C16498a c16498a = new C16498a(this.f69095c, zy2Var);
                        c16498a.f69094b = obj;
                        return c16498a;
                    }

                    @Override // p000.gz6
                    @gib
                    public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
                        return ((C16498a) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
                    }

                    @Override // p000.tq0
                    @gib
                    public final Object invokeSuspend(@yfb Object obj) {
                        Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                        int i = this.f69093a;
                        if (i == 0) {
                            y7e.throwOnFailure(obj);
                            s2d s2dVar = (s2d) this.f69094b;
                            zqg zqgVar = this.f69095c;
                            this.f69093a = 1;
                            if (ql9.detectDownAndDragGesturesWithObserver(s2dVar, zqgVar, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: owe$d$a$a$b */
                public static final class b extends tt8 implements ny6<izb> {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ zwe f69096a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(zwe zweVar) {
                        super(0);
                        this.f69096a = zweVar;
                    }

                    @Override // p000.ny6
                    public /* bridge */ /* synthetic */ izb invoke() {
                        return izb.m30418boximpl(m31696invokeF1C5BW0());
                    }

                    /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m31696invokeF1C5BW0() {
                        izb izbVarM33558getStartHandlePosition_m7T9E = this.f69096a.m33558getStartHandlePosition_m7T9E();
                        return izbVarM33558getStartHandlePosition_m7T9E != null ? izbVarM33558getStartHandlePosition_m7T9E.m30439unboximpl() : izb.f49009b.m30444getUnspecifiedF1C5BW0();
                    }
                }

                /* JADX INFO: renamed from: owe$d$a$a$c */
                public static final class c extends tt8 implements ny6<izb> {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ zwe f69097a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public c(zwe zweVar) {
                        super(0);
                        this.f69097a = zweVar;
                    }

                    @Override // p000.ny6
                    public /* bridge */ /* synthetic */ izb invoke() {
                        return izb.m30418boximpl(m31697invokeF1C5BW0());
                    }

                    /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m31697invokeF1C5BW0() {
                        izb izbVarM33557getEndHandlePosition_m7T9E = this.f69097a.m33557getEndHandlePosition_m7T9E();
                        return izbVarM33557getEndHandlePosition_m7T9E != null ? izbVarM33557getEndHandlePosition_m7T9E.m30439unboximpl() : izb.f49009b.m30444getUnspecifiedF1C5BW0();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C16497a(gz6<? super zl2, ? super Integer, bth> gz6Var, zwe zweVar) {
                    super(2);
                    this.f69091a = gz6Var;
                    this.f69092b = zweVar;
                }

                @Override // p000.gz6
                public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
                    invoke(zl2Var, num.intValue());
                    return bth.f14751a;
                }

                @bl2(applier = "androidx.compose.ui.UiComposable")
                @hk2
                public final void invoke(@gib zl2 zl2Var, int i) {
                    if ((i & 3) == 2 && zl2Var.getSkipping()) {
                        zl2Var.skipToGroupEnd();
                        return;
                    }
                    if (gm2.isTraceInProgress()) {
                        gm2.traceEventStart(1375295262, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:108)");
                    }
                    this.f69091a.invoke(zl2Var, 0);
                    if (this.f69092b.isInTouchMode() && this.f69092b.getHasFocus() && !this.f69092b.isTriviallyCollapsedSelection$foundation_release()) {
                        zl2Var.startReplaceGroup(-882227523);
                        gwe selection = this.f69092b.getSelection();
                        if (selection == null) {
                            zl2Var.startReplaceGroup(-882188681);
                        } else {
                            zl2Var.startReplaceGroup(-882188680);
                            zwe zweVar = this.f69092b;
                            zl2Var.startReplaceGroup(1495564482);
                            List listListOf = l82.listOf((Object[]) new Boolean[]{Boolean.TRUE, Boolean.FALSE});
                            int size = listListOf.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                boolean zBooleanValue = ((Boolean) listListOf.get(i2)).booleanValue();
                                boolean zChanged = zl2Var.changed(zBooleanValue);
                                Object objRememberedValue = zl2Var.rememberedValue();
                                if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                                    objRememberedValue = zweVar.handleDragObserver(zBooleanValue);
                                    zl2Var.updateRememberedValue(objRememberedValue);
                                }
                                zqg zqgVar = (zqg) objRememberedValue;
                                boolean zChanged2 = zl2Var.changed(zBooleanValue);
                                Object objRememberedValue2 = zl2Var.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == zl2.f105372a.getEmpty()) {
                                    objRememberedValue2 = zBooleanValue ? new b(zweVar) : new c(zweVar);
                                    zl2Var.updateRememberedValue(objRememberedValue2);
                                }
                                ny6 ny6Var = (ny6) objRememberedValue2;
                                q5e direction = zBooleanValue ? selection.getStart().getDirection() : selection.getEnd().getDirection();
                                C10693h c10693h = new C10693h(ny6Var);
                                boolean handlesCrossed = selection.getHandlesCrossed();
                                InterfaceC0701e.a aVar = InterfaceC0701e.f5158d1;
                                boolean zChangedInstance = zl2Var.changedInstance(zqgVar);
                                Object objRememberedValue3 = zl2Var.rememberedValue();
                                if (zChangedInstance || objRememberedValue3 == zl2.f105372a.getEmpty()) {
                                    objRememberedValue3 = new C16498a(zqgVar, null);
                                    zl2Var.updateRememberedValue(objRememberedValue3);
                                }
                                C5475ev.m28857SelectionHandlepzduO1o(c10693h, zBooleanValue, direction, handlesCrossed, 0L, vgg.pointerInput(aVar, zqgVar, (gz6<? super s2d, ? super zy2<? super bth>, ? extends Object>) objRememberedValue3), zl2Var, 0, 16);
                            }
                            zl2Var.endReplaceGroup();
                        }
                        zl2Var.endReplaceGroup();
                        zl2Var.endReplaceGroup();
                    } else {
                        zl2Var.startReplaceGroup(-880741817);
                        zl2Var.endReplaceGroup();
                    }
                    if (gm2.isTraceInProgress()) {
                        gm2.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC0701e interfaceC0701e, zwe zweVar, gz6<? super zl2, ? super Integer, bth> gz6Var) {
                super(2);
                this.f69088a = interfaceC0701e;
                this.f69089b = zweVar;
                this.f69090c = gz6Var;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
                invoke(zl2Var, num.intValue());
                return bth.f14751a;
            }

            @bl2(applier = "androidx.compose.ui.UiComposable")
            @hk2
            public final void invoke(@gib zl2 zl2Var, int i) {
                if ((i & 3) == 2 && zl2Var.getSkipping()) {
                    zl2Var.skipToGroupEnd();
                    return;
                }
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventStart(935424596, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:107)");
                }
                nif.SimpleLayout(this.f69088a.then(this.f69089b.getModifier()), mk2.rememberComposableLambda(1375295262, true, new C16497a(this.f69090c, this.f69089b), zl2Var, 54), zl2Var, 48, 0);
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10689d(fxe fxeVar, InterfaceC0701e interfaceC0701e, zwe zweVar, gz6<? super zl2, ? super Integer, bth> gz6Var) {
            super(2);
            this.f69084a = fxeVar;
            this.f69085b = interfaceC0701e;
            this.f69086c = zweVar;
            this.f69087d = gz6Var;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        @bl2(applier = "androidx.compose.ui.UiComposable")
        @hk2
        public final void invoke(@gib zl2 zl2Var, int i) {
            if ((i & 3) == 2 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-123806316, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:104)");
            }
            pn2.CompositionLocalProvider(gxe.getLocalSelectionRegistrar().provides(this.f69084a), mk2.rememberComposableLambda(935424596, true, new a(this.f69085b, this.f69086c, this.f69087d), zl2Var, 54), zl2Var, did.f29712i | 48);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: owe$e */
    @dwf({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$4$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,157:1\n64#2,5:158\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$4$1\n*L\n151#1:158,5\n*E\n"})
    public static final class C10690e extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zwe f69098a;

        /* JADX INFO: renamed from: owe$e$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$4$1\n*L\n1#1,497:1\n152#2,3:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zwe f69099a;

            public a(zwe zweVar) {
                this.f69099a = zweVar;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f69099a.onRelease();
                this.f69099a.setHasFocus(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10690e(zwe zweVar) {
            super(1);
            this.f69098a = zweVar;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            return new a(this.f69098a);
        }
    }

    /* JADX INFO: renamed from: owe$f */
    public static final class C10691f extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f69100a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gwe f69101b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<gwe, bth> f69102c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<zl2, Integer, bth> f69103d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f69104e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f69105f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10691f(InterfaceC0701e interfaceC0701e, gwe gweVar, qy6<? super gwe, bth> qy6Var, gz6<? super zl2, ? super Integer, bth> gz6Var, int i, int i2) {
            super(2);
            this.f69100a = interfaceC0701e;
            this.f69101b = gweVar;
            this.f69102c = qy6Var;
            this.f69103d = gz6Var;
            this.f69104e = i;
            this.f69105f = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            owe.SelectionContainer(this.f69100a, this.f69101b, this.f69102c, this.f69103d, zl2Var, tsd.updateChangedFlags(this.f69104e | 1), this.f69105f);
        }
    }

    /* JADX INFO: renamed from: owe$g */
    public static final class C10692g extends tt8 implements ny6<fxe> {

        /* JADX INFO: renamed from: a */
        public static final C10692g f69106a = new C10692g();

        public C10692g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final fxe invoke() {
            return new fxe();
        }
    }

    /* JADX INFO: renamed from: owe$h */
    public static final class C10693h implements qzb, g07 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6 f69107a;

        public C10693h(ny6 ny6Var) {
            this.f69107a = ny6Var;
        }

        public final boolean equals(@gib Object obj) {
            if ((obj instanceof qzb) && (obj instanceof g07)) {
                return md8.areEqual(getFunctionDelegate(), ((g07) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p000.g07
        @yfb
        public final uy6<?> getFunctionDelegate() {
            return this.f69107a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // p000.qzb
        /* JADX INFO: renamed from: provide-F1C5BW0 */
        public final /* synthetic */ long mo29872provideF1C5BW0() {
            return ((izb) this.f69107a.invoke()).m30439unboximpl();
        }
    }

    @hk2
    @ik2(scheme = "[0[0]]")
    public static final void DisableSelection(@yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(336063542);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changedInstance(gz6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(336063542, i2, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:67)");
            }
            pn2.CompositionLocalProvider(gxe.getLocalSelectionRegistrar().provides(null), gz6Var, zl2VarStartRestartGroup, ((i2 << 3) & 112) | did.f29712i);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C10686a(gz6Var, i));
        }
    }

    @hk2
    @ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SelectionContainer(@gib InterfaceC0701e interfaceC0701e, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-1075498320);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (zl2VarStartRestartGroup.changed(interfaceC0701e) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(gz6Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                interfaceC0701e = InterfaceC0701e.f5158d1;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1075498320, i3, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:48)");
            }
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            zl2.C16170a c16170a = zl2.f105372a;
            if (objRememberedValue == c16170a.getEmpty()) {
                objRememberedValue = xtf.mutableStateOf$default(null, null, 2, null);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            z6b z6bVar = (z6b) objRememberedValue;
            gwe gweVarSelectionContainer$lambda$1 = SelectionContainer$lambda$1(z6bVar);
            Object objRememberedValue2 = zl2VarStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == c16170a.getEmpty()) {
                objRememberedValue2 = new C10687b(z6bVar);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SelectionContainer(interfaceC0701e, gweVarSelectionContainer$lambda$1, (qy6) objRememberedValue2, gz6Var, zl2VarStartRestartGroup, (i3 & 14) | 384 | ((i3 << 6) & 7168), 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C10688c(interfaceC0701e, gz6Var, i, i2));
        }
    }

    private static final gwe SelectionContainer$lambda$1(z6b<gwe> z6bVar) {
        return z6bVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectionContainer$lambda$2(z6b<gwe> z6bVar, gwe gweVar) {
        z6bVar.setValue(gweVar);
    }

    @hk2
    @ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SelectionContainer(@gib InterfaceC0701e interfaceC0701e, @gib gwe gweVar, @yfb qy6<? super gwe, bth> qy6Var, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(2078139907);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (zl2VarStartRestartGroup.changed(interfaceC0701e) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(gweVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(qy6Var) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= kw1.f55470l;
        } else if ((i & kw1.f55470l) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(gz6Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                interfaceC0701e = InterfaceC0701e.f5158d1;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(2078139907, i3, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:90)");
            }
            fxe fxeVar = (fxe) gyd.rememberSaveable(new Object[0], (dme) fxe.f37988o.getSaver(), (String) null, (ny6) C10692g.f69106a, zl2VarStartRestartGroup, kw1.f55470l, 4);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            zl2.C16170a c16170a = zl2.f105372a;
            if (objRememberedValue == c16170a.getEmpty()) {
                objRememberedValue = new zwe(fxeVar);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            zwe zweVar = (zwe) objRememberedValue;
            zweVar.setHapticFeedBack((lg7) zl2VarStartRestartGroup.consume(sn2.getLocalHapticFeedback()));
            zweVar.setClipboardManager((a52) zl2VarStartRestartGroup.consume(sn2.getLocalClipboardManager()));
            zweVar.setTextToolbar((awg) zl2VarStartRestartGroup.consume(sn2.getLocalTextToolbar()));
            zweVar.setOnSelectionChange(qy6Var);
            zweVar.setSelection(gweVar);
            ay2.ContextMenuArea(zweVar, mk2.rememberComposableLambda(-123806316, true, new C10689d(fxeVar, interfaceC0701e, zweVar, gz6Var), zl2VarStartRestartGroup, 54), zl2VarStartRestartGroup, 48);
            boolean zChangedInstance = zl2VarStartRestartGroup.changedInstance(zweVar);
            Object objRememberedValue2 = zl2VarStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == c16170a.getEmpty()) {
                objRememberedValue2 = new C10690e(zweVar);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            jx4.DisposableEffect(zweVar, (qy6<? super wf4, ? extends vf4>) objRememberedValue2, zl2VarStartRestartGroup, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        InterfaceC0701e interfaceC0701e2 = interfaceC0701e;
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C10691f(interfaceC0701e2, gweVar, qy6Var, gz6Var, i, i2));
        }
    }
}
