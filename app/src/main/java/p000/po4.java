package p000;

import androidx.compose.foundation.gestures.Draggable2DCompatElement;
import androidx.compose.foundation.gestures.Draggable2DElement;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDraggable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,509:1\n1223#2,6:510\n*S KotlinDebug\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DKt\n*L\n123#1:510,6\n*E\n"})
public final class po4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final kz6<x13, izb, zy2<? super bth>, Object> f71525a = new C11045b(null);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final qy6<izb, bth> f71526b = C11044a.f71529a;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final kz6<x13, i4i, zy2<? super bth>, Object> f71527c = new C11047d(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final qy6<i4i, bth> f71528d = C11046c.f71531a;

    /* JADX INFO: renamed from: po4$a */
    public static final class C11044a extends tt8 implements qy6<izb, bth> {

        /* JADX INFO: renamed from: a */
        public static final C11044a f71529a = new C11044a();

        public C11044a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m31826invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m31826invokek4lQ0M(long j) {
        }
    }

    /* JADX INFO: renamed from: po4$b */
    @ck3(m4009c = "androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStarted$1", m4010f = "Draggable2D.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11045b extends ugg implements kz6<x13, izb, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f71530a;

        public C11045b(zy2<? super C11045b> zy2Var) {
            super(3, zy2Var);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Object invoke(x13 x13Var, izb izbVar, zy2<? super bth> zy2Var) {
            return m31827invoked4ec7I(x13Var, izbVar.m30439unboximpl(), zy2Var);
        }

        @gib
        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m31827invoked4ec7I(@yfb x13 x13Var, long j, @gib zy2<? super bth> zy2Var) {
            return new C11045b(zy2Var).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f71530a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: po4$c */
    public static final class C11046c extends tt8 implements qy6<i4i, bth> {

        /* JADX INFO: renamed from: a */
        public static final C11046c f71531a = new C11046c();

        public C11046c() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(i4i i4iVar) {
            m31828invokeTH1AsA0(i4iVar.m30166unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-TH1AsA0, reason: not valid java name */
        public final void m31828invokeTH1AsA0(long j) {
        }
    }

    /* JADX INFO: renamed from: po4$d */
    @ck3(m4009c = "androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStopped$1", m4010f = "Draggable2D.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11047d extends ugg implements kz6<x13, i4i, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f71532a;

        public C11047d(zy2<? super C11047d> zy2Var) {
            super(3, zy2Var);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Object invoke(x13 x13Var, i4i i4iVar, zy2<? super bth> zy2Var) {
            return m31829invokeLuvzFrg(x13Var, i4iVar.m30166unboximpl(), zy2Var);
        }

        @gib
        /* JADX INFO: renamed from: invoke-LuvzFrg, reason: not valid java name */
        public final Object m31829invokeLuvzFrg(@yfb x13 x13Var, long j, @gib zy2<? super bth> zy2Var) {
            return new C11047d(zy2Var).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f71532a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: po4$e */
    public static final class C11048e extends tt8 implements qy6<izb, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i2g<qy6<izb, bth>> f71533a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11048e(i2g<? extends qy6<? super izb, bth>> i2gVar) {
            super(1);
            this.f71533a = i2gVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
            m31830invokek4lQ0M(izbVar.m30439unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m31830invokek4lQ0M(long j) {
            this.f71533a.getValue().invoke(izb.m30418boximpl(j));
        }
    }

    @ah5
    @yfb
    public static final qo4 Draggable2DState(@yfb qy6<? super izb, bth> qy6Var) {
        return new wt3(qy6Var);
    }

    @f0g
    @ah5
    @yfb
    public static final InterfaceC0701e draggable2D(@yfb InterfaceC0701e interfaceC0701e, @yfb qo4 qo4Var, boolean z, @gib l5b l5bVar, boolean z2, @yfb qy6<? super izb, bth> qy6Var, @yfb qy6<? super i4i, bth> qy6Var2, boolean z3) {
        return interfaceC0701e.then(new Draggable2DElement(qo4Var, z, l5bVar, z2, qy6Var, qy6Var2, z3));
    }

    @ah5
    @yfb
    @hk2
    public static final qo4 rememberDraggable2DState(@yfb qy6<? super izb, bth> qy6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1150277615, i, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:120)");
        }
        i2g i2gVarRememberUpdatedState = stf.rememberUpdatedState(qy6Var, zl2Var, i & 14);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = Draggable2DState(new C11048e(i2gVarRememberUpdatedState));
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        qo4 qo4Var = (qo4) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return qo4Var;
    }

    @f0g
    @ah5
    @q64(level = u64.f86867c, message = "Please use overload without the suspend onDragStarted onDragStopped and callbacks")
    public static final /* synthetic */ InterfaceC0701e draggable2D(InterfaceC0701e interfaceC0701e, qo4 qo4Var, boolean z, l5b l5bVar, boolean z2, kz6 kz6Var, kz6 kz6Var2, boolean z3) {
        return interfaceC0701e.then(new Draggable2DCompatElement(qo4Var, z, l5bVar, z2, kz6Var, kz6Var2, z3));
    }
}
