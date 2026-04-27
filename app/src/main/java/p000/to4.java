package p000;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,649:1\n1223#2,6:650\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n139#1:650,6\n*E\n"})
public final class to4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final kz6<x13, izb, zy2<? super bth>, Object> f85439a = new C13120a(null);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final kz6<x13, Float, zy2<? super bth>, Object> f85440b = new C13121b(null);

    /* JADX INFO: renamed from: to4$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", m4010f = "Draggable.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13120a extends ugg implements kz6<x13, izb, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f85441a;

        public C13120a(zy2<? super C13120a> zy2Var) {
            super(3, zy2Var);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Object invoke(x13 x13Var, izb izbVar, zy2<? super bth> zy2Var) {
            return m32425invoked4ec7I(x13Var, izbVar.m30439unboximpl(), zy2Var);
        }

        @gib
        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m32425invoked4ec7I(@yfb x13 x13Var, long j, @gib zy2<? super bth> zy2Var) {
            return new C13120a(zy2Var).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f85441a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: to4$b */
    @ck3(m4009c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", m4010f = "Draggable.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13121b extends ugg implements kz6<x13, Float, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f85442a;

        public C13121b(zy2<? super C13121b> zy2Var) {
            super(3, zy2Var);
        }

        @gib
        public final Object invoke(@yfb x13 x13Var, float f, @gib zy2<? super bth> zy2Var) {
            return new C13121b(zy2Var).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f85442a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return bth.f14751a;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Object invoke(x13 x13Var, Float f, zy2<? super bth> zy2Var) {
            return invoke(x13Var, f.floatValue(), zy2Var);
        }
    }

    /* JADX INFO: renamed from: to4$c */
    public static final class C13122c extends tt8 implements qy6<Float, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i2g<qy6<Float, bth>> f85443a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13122c(i2g<? extends qy6<? super Float, bth>> i2gVar) {
            super(1);
            this.f85443a = i2gVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Float f) {
            invoke(f.floatValue());
            return bth.f14751a;
        }

        public final void invoke(float f) {
            this.f85443a.getValue().invoke(Float.valueOf(f));
        }
    }

    @yfb
    public static final wo4 DraggableState(@yfb qy6<? super Float, bth> qy6Var) {
        return new xt3(qy6Var);
    }

    @f0g
    @yfb
    public static final InterfaceC0701e draggable(@yfb InterfaceC0701e interfaceC0701e, @yfb wo4 wo4Var, @yfb t7c t7cVar, boolean z, @gib l5b l5bVar, boolean z2, @yfb kz6<? super x13, ? super izb, ? super zy2<? super bth>, ? extends Object> kz6Var, @yfb kz6<? super x13, ? super Float, ? super zy2<? super bth>, ? extends Object> kz6Var2, boolean z3) {
        return interfaceC0701e.then(new DraggableElement(wo4Var, t7cVar, z, l5bVar, z2, kz6Var, kz6Var2, z3));
    }

    @yfb
    @hk2
    public static final wo4 rememberDraggableState(@yfb qy6<? super Float, bth> qy6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:136)");
        }
        i2g i2gVarRememberUpdatedState = stf.rememberUpdatedState(qy6Var, zl2Var, i & 14);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = DraggableState(new C13122c(i2gVarRememberUpdatedState));
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        wo4 wo4Var = (wo4) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return wo4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m32422toFloat3MmeM6k(long j, t7c t7cVar) {
        return t7cVar == t7c.Vertical ? izb.m30430getYimpl(j) : izb.m30429getXimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m32423toFloatsFctU(long j, t7c t7cVar) {
        return t7cVar == t7c.Vertical ? i4i.m30158getYimpl(j) : i4i.m30157getXimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toValidVelocity-TH1AsA0, reason: not valid java name */
    public static final long m32424toValidVelocityTH1AsA0(long j) {
        return j4i.Velocity(Float.isNaN(i4i.m30157getXimpl(j)) ? 0.0f : i4i.m30157getXimpl(j), Float.isNaN(i4i.m30158getYimpl(j)) ? 0.0f : i4i.m30158getYimpl(j));
    }
}
