package p000;

import java.util.concurrent.CancellationException;
import p000.jj8;
import p000.rsg;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidTextFieldMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextFieldMagnifier.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNodeImpl28\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n81#2:204\n107#2,2:205\n1#3:207\n*S KotlinDebug\n*F\n+ 1 AndroidTextFieldMagnifier.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNodeImpl28\n*L\n52#1:204\n52#1:205,2\n*E\n"})
@e0g(parameters = 1)
public final class hsg extends gsg implements mn2 {

    /* JADX INFO: renamed from: g2 */
    public static final int f44771g2 = 0;

    /* JADX INFO: renamed from: V1 */
    @yfb
    public jeh f44772V1;

    /* JADX INFO: renamed from: Z1 */
    @yfb
    public rsg f44773Z1;

    /* JADX INFO: renamed from: a2 */
    @yfb
    public lug f44774a2;

    /* JADX INFO: renamed from: b2 */
    public boolean f44775b2;

    /* JADX INFO: renamed from: d2 */
    @yfb
    public final C13257tw<izb, C14830wy> f44777d2;

    /* JADX INFO: renamed from: f2 */
    @gib
    public jj8 f44779f2;

    /* JADX INFO: renamed from: c2 */
    @yfb
    public final z6b f44776c2 = xtf.mutableStateOf$default(r78.m32079boximpl(r78.f77324b.m32092getZeroYbymL2g()), null, 2, null);

    /* JADX INFO: renamed from: e2 */
    @yfb
    public final uq9 f44778e2 = (uq9) m8877a(new uq9(new C7000a(), null, new C7001b(), 0.0f, true, 0, 0.0f, 0.0f, false, null, 1002, null));

    /* JADX INFO: renamed from: hsg$a */
    public static final class C7000a extends tt8 implements qy6<c64, izb> {
        public C7000a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ izb invoke(c64 c64Var) {
            return izb.m30418boximpl(m30113invoketuRUvjQ(c64Var));
        }

        /* JADX INFO: renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m30113invoketuRUvjQ(@yfb c64 c64Var) {
            return ((izb) hsg.this.f44777d2.getValue()).m30439unboximpl();
        }
    }

    /* JADX INFO: renamed from: hsg$b */
    public static final class C7001b extends tt8 implements qy6<pn4, bth> {
        public C7001b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(pn4 pn4Var) {
            m30114invokeEaSLcWc(pn4Var.m31823unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-EaSLcWc, reason: not valid java name */
        public final void m30114invokeEaSLcWc(long j) {
            hsg hsgVar = hsg.this;
            c64 c64Var = (c64) nn2.currentValueOf(hsgVar, sn2.getLocalDensity());
            hsgVar.m30112setMagnifierSizeozmzZPI(s78.IntSize(c64Var.mo27167roundToPx0680j_4(pn4.m31815getWidthD9Ej5fM(j)), c64Var.mo27167roundToPx0680j_4(pn4.m31813getHeightD9Ej5fM(j))));
        }
    }

    /* JADX INFO: renamed from: hsg$c */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", m4010f = "AndroidTextFieldMagnifier.android.kt", m4011i = {}, m4012l = {134}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C7002c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f44782a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f44783b;

        /* JADX INFO: renamed from: hsg$c$a */
        public static final class a extends tt8 implements ny6<izb> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ hsg f44785a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(hsg hsgVar) {
                super(0);
                this.f44785a = hsgVar;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ izb invoke() {
                return izb.m30418boximpl(m30115invokeF1C5BW0());
            }

            /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
            public final long m30115invokeF1C5BW0() {
                return (this.f44785a.f44775b2 || this.f44785a.f44773Z1.getDirectDragGestureInitiator() == rsg.EnumC12235a.Touch) ? fsg.m29660calculateSelectionMagnifierCenterAndroidhUlJWOE(this.f44785a.f44772V1, this.f44785a.f44773Z1, this.f44785a.f44774a2, this.f44785a.m30111getMagnifierSizeYbymL2g()) : izb.f49009b.m30444getUnspecifiedF1C5BW0();
            }
        }

        /* JADX INFO: renamed from: hsg$c$b */
        public static final class b<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ hsg f44786a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ x13 f44787b;

            /* JADX INFO: renamed from: hsg$c$b$a */
            @ck3(m4009c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", m4010f = "AndroidTextFieldMagnifier.android.kt", m4011i = {}, m4012l = {148}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f44788a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ hsg f44789b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f44790c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(hsg hsgVar, long j, zy2<? super a> zy2Var) {
                    super(2, zy2Var);
                    this.f44789b = hsgVar;
                    this.f44790c = j;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new a(this.f44789b, this.f44790c, zy2Var);
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
                    int i = this.f44788a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        C13257tw c13257tw = this.f44789b.f44777d2;
                        izb izbVarM30418boximpl = izb.m30418boximpl(this.f44790c);
                        mzf<izb> magnifierSpringSpec = ywe.getMagnifierSpringSpec();
                        this.f44788a = 1;
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

            public b(hsg hsgVar, x13 x13Var) {
                this.f44786a = hsgVar;
                this.f44787b = x13Var;
            }

            @Override // p000.t66
            public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                return m30116emit3MmeM6k(((izb) obj).m30439unboximpl(), zy2Var);
            }

            @gib
            /* JADX INFO: renamed from: emit-3MmeM6k, reason: not valid java name */
            public final Object m30116emit3MmeM6k(long j, @yfb zy2<? super bth> zy2Var) {
                if (mzb.m31100isSpecifiedk4lQ0M(((izb) this.f44786a.f44777d2.getValue()).m30439unboximpl()) && mzb.m31100isSpecifiedk4lQ0M(j) && izb.m30430getYimpl(((izb) this.f44786a.f44777d2.getValue()).m30439unboximpl()) != izb.m30430getYimpl(j)) {
                    fg1.launch$default(this.f44787b, null, null, new a(this.f44786a, j, null), 3, null);
                    return bth.f14751a;
                }
                Object objSnapTo = this.f44786a.f44777d2.snapTo(izb.m30418boximpl(j), zy2Var);
                return objSnapTo == pd8.getCOROUTINE_SUSPENDED() ? objSnapTo : bth.f14751a;
            }
        }

        public C7002c(zy2<? super C7002c> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C7002c c7002c = hsg.this.new C7002c(zy2Var);
            c7002c.f44783b = obj;
            return c7002c;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C7002c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f44782a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x13 x13Var = (x13) this.f44783b;
                y56 y56VarSnapshotFlow = stf.snapshotFlow(new a(hsg.this));
                b bVar = new b(hsg.this, x13Var);
                this.f44782a = 1;
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

    public hsg(@yfb jeh jehVar, @yfb rsg rsgVar, @yfb lug lugVar, boolean z) {
        this.f44772V1 = jehVar;
        this.f44773Z1 = rsgVar;
        this.f44774a2 = lugVar;
        this.f44775b2 = z;
        this.f44777d2 = new C13257tw<>(izb.m30418boximpl(fsg.m29660calculateSelectionMagnifierCenterAndroidhUlJWOE(this.f44772V1, this.f44773Z1, this.f44774a2, m30111getMagnifierSizeYbymL2g())), ywe.getUnspecifiedSafeOffsetVectorConverter(), izb.m30418boximpl(ywe.getOffsetDisplacementThreshold()), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getMagnifierSize-YbymL2g, reason: not valid java name */
    public final long m30111getMagnifierSizeYbymL2g() {
        return ((r78) this.f44776c2.getValue()).m32091unboximpl();
    }

    private final void restartAnimationJob() {
        jj8 jj8Var = this.f44779f2;
        if (jj8Var != null) {
            jj8.C7916a.cancel$default(jj8Var, (CancellationException) null, 1, (Object) null);
        }
        this.f44779f2 = null;
        if (vq9.isPlatformMagnifierSupported$default(0, 1, null)) {
            this.f44779f2 = fg1.launch$default(getCoroutineScope(), null, null, new C7002c(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setMagnifierSize-ozmzZPI, reason: not valid java name */
    public final void m30112setMagnifierSizeozmzZPI(long j) {
        this.f44776c2.setValue(r78.m32079boximpl(j));
    }

    @Override // p000.gsg, p000.rxe
    public void applySemantics(@yfb eye eyeVar) {
        this.f44778e2.applySemantics(eyeVar);
    }

    @Override // p000.gsg, p000.fp4
    public void draw(@yfb ov2 ov2Var) {
        ov2Var.drawContent();
        this.f44778e2.draw(ov2Var);
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        restartAnimationJob();
    }

    @Override // p000.gsg, p000.x2c
    public void onGloballyPositioned(@yfb mv8 mv8Var) {
        this.f44778e2.onGloballyPositioned(mv8Var);
    }

    @Override // p000.gsg
    public void update(@yfb jeh jehVar, @yfb rsg rsgVar, @yfb lug lugVar, boolean z) {
        jeh jehVar2 = this.f44772V1;
        rsg rsgVar2 = this.f44773Z1;
        lug lugVar2 = this.f44774a2;
        boolean z2 = this.f44775b2;
        this.f44772V1 = jehVar;
        this.f44773Z1 = rsgVar;
        this.f44774a2 = lugVar;
        this.f44775b2 = z;
        if (md8.areEqual(jehVar, jehVar2) && md8.areEqual(rsgVar, rsgVar2) && md8.areEqual(lugVar, lugVar2) && z == z2) {
            return;
        }
        restartAnimationJob();
    }
}
