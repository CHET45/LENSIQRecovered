package p000;

import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,109:1\n1223#2,6:110\n1223#2,6:116\n1223#2,6:122\n81#3:128\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n*L\n78#1:110,6\n79#1:116,6\n83#1:122,6\n78#1:128\n*E\n"})
public final class ywe {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C14830wy f103210a = new C14830wy(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final alh<izb, C14830wy> f103211b = g3i.TwoWayConverter(C15859a.f103214a, C15860b.f103215a);

    /* JADX INFO: renamed from: c */
    public static final long f103212c;

    /* JADX INFO: renamed from: d */
    @yfb
    public static final mzf<izb> f103213d;

    /* JADX INFO: renamed from: ywe$a */
    public static final class C15859a extends tt8 implements qy6<izb, C14830wy> {

        /* JADX INFO: renamed from: a */
        public static final C15859a f103214a = new C15859a();

        public C15859a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ C14830wy invoke(izb izbVar) {
            return m33456invokek4lQ0M(izbVar.m30439unboximpl());
        }

        @yfb
        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final C14830wy m33456invokek4lQ0M(long j) {
            return mzb.m31100isSpecifiedk4lQ0M(j) ? new C14830wy(izb.m30429getXimpl(j), izb.m30430getYimpl(j)) : ywe.f103210a;
        }
    }

    /* JADX INFO: renamed from: ywe$b */
    public static final class C15860b extends tt8 implements qy6<C14830wy, izb> {

        /* JADX INFO: renamed from: a */
        public static final C15860b f103215a = new C15860b();

        public C15860b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ izb invoke(C14830wy c14830wy) {
            return izb.m30418boximpl(m33457invoketuRUvjQ(c14830wy));
        }

        /* JADX INFO: renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m33457invoketuRUvjQ(@yfb C14830wy c14830wy) {
            return mzb.Offset(c14830wy.getV1(), c14830wy.getV2());
        }
    }

    /* JADX INFO: renamed from: ywe$c */
    @dwf({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,109:1\n1223#2,6:110\n81#3:116\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n*L\n67#1:110,6\n66#1:116\n*E\n"})
    public static final class C15861c extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<izb> f103216a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<ny6<izb>, InterfaceC0701e> f103217b;

        /* JADX INFO: renamed from: ywe$c$a */
        public static final class a extends tt8 implements ny6<izb> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ i2g<izb> f103218a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i2g<izb> i2gVar) {
                super(0);
                this.f103218a = i2gVar;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ izb invoke() {
                return izb.m30418boximpl(m33458invokeF1C5BW0());
            }

            /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
            public final long m33458invokeF1C5BW0() {
                return C15861c.invoke$lambda$0(this.f103218a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15861c(ny6<izb> ny6Var, qy6<? super ny6<izb>, ? extends InterfaceC0701e> qy6Var) {
            super(3);
            this.f103216a = ny6Var;
            this.f103217b = qy6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$0(i2g<izb> i2gVar) {
            return i2gVar.getValue().m30439unboximpl();
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(759876635);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(759876635, i, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
            }
            i2g i2gVarRememberAnimatedMagnifierPosition = ywe.rememberAnimatedMagnifierPosition(this.f103216a, zl2Var, 0);
            qy6<ny6<izb>, InterfaceC0701e> qy6Var = this.f103217b;
            boolean zChanged = zl2Var.changed(i2gVarRememberAnimatedMagnifierPosition);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new a(i2gVarRememberAnimatedMagnifierPosition);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            InterfaceC0701e interfaceC0701eInvoke = qy6Var.invoke((ny6) objRememberedValue);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return interfaceC0701eInvoke;
        }
    }

    /* JADX INFO: renamed from: ywe$d */
    @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", m4010f = "SelectionMagnifier.kt", m4011i = {}, m4012l = {86}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C15862d extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f103219a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f103220b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ i2g<izb> f103221c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C13257tw<izb, C14830wy> f103222d;

        /* JADX INFO: renamed from: ywe$d$a */
        public static final class a extends tt8 implements ny6<izb> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ i2g<izb> f103223a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i2g<izb> i2gVar) {
                super(0);
                this.f103223a = i2gVar;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ izb invoke() {
                return izb.m30418boximpl(m33459invokeF1C5BW0());
            }

            /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
            public final long m33459invokeF1C5BW0() {
                return ywe.rememberAnimatedMagnifierPosition$lambda$1(this.f103223a);
            }
        }

        /* JADX INFO: renamed from: ywe$d$b */
        public static final class b<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C13257tw<izb, C14830wy> f103224a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ x13 f103225b;

            /* JADX INFO: renamed from: ywe$d$b$a */
            @ck3(m4009c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", m4010f = "SelectionMagnifier.kt", m4011i = {}, m4012l = {100}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f103226a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C13257tw<izb, C14830wy> f103227b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f103228c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(C13257tw<izb, C14830wy> c13257tw, long j, zy2<? super a> zy2Var) {
                    super(2, zy2Var);
                    this.f103227b = c13257tw;
                    this.f103228c = j;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new a(this.f103227b, this.f103228c, zy2Var);
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
                    int i = this.f103226a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        C13257tw<izb, C14830wy> c13257tw = this.f103227b;
                        izb izbVarM30418boximpl = izb.m30418boximpl(this.f103228c);
                        mzf<izb> magnifierSpringSpec = ywe.getMagnifierSpringSpec();
                        this.f103226a = 1;
                        if (C13257tw.animateTo$default(c13257tw, izbVarM30418boximpl, magnifierSpringSpec, null, null, this, 12, null) == coroutine_suspended) {
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

            public b(C13257tw<izb, C14830wy> c13257tw, x13 x13Var) {
                this.f103224a = c13257tw;
                this.f103225b = x13Var;
            }

            @Override // p000.t66
            public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                return m33460emit3MmeM6k(((izb) obj).m30439unboximpl(), zy2Var);
            }

            @gib
            /* JADX INFO: renamed from: emit-3MmeM6k, reason: not valid java name */
            public final Object m33460emit3MmeM6k(long j, @yfb zy2<? super bth> zy2Var) {
                if (mzb.m31100isSpecifiedk4lQ0M(this.f103224a.getValue().m30439unboximpl()) && mzb.m31100isSpecifiedk4lQ0M(j) && izb.m30430getYimpl(this.f103224a.getValue().m30439unboximpl()) != izb.m30430getYimpl(j)) {
                    fg1.launch$default(this.f103225b, null, null, new a(this.f103224a, j, null), 3, null);
                    return bth.f14751a;
                }
                Object objSnapTo = this.f103224a.snapTo(izb.m30418boximpl(j), zy2Var);
                return objSnapTo == pd8.getCOROUTINE_SUSPENDED() ? objSnapTo : bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15862d(i2g<izb> i2gVar, C13257tw<izb, C14830wy> c13257tw, zy2<? super C15862d> zy2Var) {
            super(2, zy2Var);
            this.f103221c = i2gVar;
            this.f103222d = c13257tw;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C15862d c15862d = new C15862d(this.f103221c, this.f103222d, zy2Var);
            c15862d.f103220b = obj;
            return c15862d;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C15862d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f103219a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x13 x13Var = (x13) this.f103220b;
                y56 y56VarSnapshotFlow = stf.snapshotFlow(new a(this.f103221c));
                b bVar = new b(this.f103222d, x13Var);
                this.f103219a = 1;
                if (y56VarSnapshotFlow.collect(bVar, this) == coroutine_suspended) {
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

    static {
        long jOffset = mzb.Offset(0.01f, 0.01f);
        f103212c = jOffset;
        f103213d = new mzf<>(0.0f, 0.0f, izb.m30418boximpl(jOffset), 3, null);
    }

    @yfb
    public static final InterfaceC0701e animatedSelectionMagnifier(@yfb InterfaceC0701e interfaceC0701e, @yfb ny6<izb> ny6Var, @yfb qy6<? super ny6<izb>, ? extends InterfaceC0701e> qy6Var) {
        return C0696c.composed$default(interfaceC0701e, null, new C15861c(ny6Var, qy6Var), 1, null);
    }

    @yfb
    public static final mzf<izb> getMagnifierSpringSpec() {
        return f103213d;
    }

    public static final long getOffsetDisplacementThreshold() {
        return f103212c;
    }

    @yfb
    public static final alh<izb, C14830wy> getUnspecifiedSafeOffsetVectorConverter() {
        return f103211b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hk2
    public static final i2g<izb> rememberAnimatedMagnifierPosition(ny6<izb> ny6Var, zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1589795249, i, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue == c16170a.getEmpty()) {
            objRememberedValue = stf.derivedStateOf(ny6Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        i2g i2gVar = (i2g) objRememberedValue;
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = new C13257tw(izb.m30418boximpl(rememberAnimatedMagnifierPosition$lambda$1(i2gVar)), f103211b, izb.m30418boximpl(f103212c), null, 8, null);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        C13257tw c13257tw = (C13257tw) objRememberedValue2;
        bth bthVar = bth.f14751a;
        boolean zChangedInstance = zl2Var.changedInstance(c13257tw);
        Object objRememberedValue3 = zl2Var.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == c16170a.getEmpty()) {
            objRememberedValue3 = new C15862d(i2gVar, c13257tw, null);
            zl2Var.updateRememberedValue(objRememberedValue3);
        }
        jx4.LaunchedEffect(bthVar, (gz6<? super x13, ? super zy2<? super bth>, ? extends Object>) objRememberedValue3, zl2Var, 6);
        i2g<izb> i2gVarAsState = c13257tw.asState();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rememberAnimatedMagnifierPosition$lambda$1(i2g<izb> i2gVar) {
        return i2gVar.getValue().m30439unboximpl();
    }
}
