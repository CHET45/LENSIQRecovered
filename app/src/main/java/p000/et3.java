package p000;

import android.view.Choreographer;
import p000.e13;
import p000.rya;
import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nActualAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,126:1\n314#2,11:127\n*S KotlinDebug\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n*L\n64#1:127,11\n*E\n"})
public final class et3 implements rya {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final et3 f33995a = new et3();

    /* JADX INFO: renamed from: b */
    public static final Choreographer f33996b = (Choreographer) dg1.runBlocking(df4.getMain().getImmediate(), new C5461a(null));

    /* JADX INFO: renamed from: et3$a */
    @ck3(m4009c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", m4010f = "ActualAndroid.android.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5461a extends ugg implements gz6<x13, zy2<? super Choreographer>, Object> {

        /* JADX INFO: renamed from: a */
        public int f33997a;

        public C5461a(zy2<? super C5461a> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C5461a(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super Choreographer> zy2Var) {
            return ((C5461a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f33997a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return Choreographer.getInstance();
        }
    }

    /* JADX INFO: renamed from: et3$b */
    public static final class C5462b extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Choreographer.FrameCallback f33998a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5462b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f33998a = frameCallback;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            et3.f33996b.removeFrameCallback(this.f33998a);
        }
    }

    /* JADX INFO: renamed from: et3$c */
    @dwf({"SMAP\nActualAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$callback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    public static final class ChoreographerFrameCallbackC5463c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dq1<R> f33999a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<Long, R> f34000b;

        /* JADX WARN: Multi-variable type inference failed */
        public ChoreographerFrameCallbackC5463c(dq1<? super R> dq1Var, qy6<? super Long, ? extends R> qy6Var) {
            this.f33999a = dq1Var;
            this.f34000b = qy6Var;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object objM32723constructorimpl;
            zy2 zy2Var = this.f33999a;
            et3 et3Var = et3.f33995a;
            qy6<Long, R> qy6Var = this.f34000b;
            try {
                v7e.C13927a c13927a = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(qy6Var.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                v7e.C13927a c13927a2 = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
            }
            zy2Var.resumeWith(objM32723constructorimpl);
        }
    }

    private et3() {
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    public <R> R fold(R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
        return (R) rya.C12368a.fold(this, r, gz6Var);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @gib
    public <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        return (E) rya.C12368a.get(this, interfaceC5041c);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        return rya.C12368a.minusKey(this, interfaceC5041c);
    }

    @Override // p000.e13
    @yfb
    public e13 plus(@yfb e13 e13Var) {
        return rya.C12368a.plus(this, e13Var);
    }

    @Override // p000.rya
    @gib
    public <R> Object withFrameNanos(@yfb qy6<? super Long, ? extends R> qy6Var, @yfb zy2<? super R> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        ChoreographerFrameCallbackC5463c choreographerFrameCallbackC5463c = new ChoreographerFrameCallbackC5463c(fq1Var, qy6Var);
        f33996b.postFrameCallback(choreographerFrameCallbackC5463c);
        fq1Var.invokeOnCancellation(new C5462b(choreographerFrameCallbackC5463c));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }
}
