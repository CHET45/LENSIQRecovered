package p000;

import android.view.Choreographer;
import p000.e13;
import p000.rya;
import p000.v7e;

/* JADX INFO: renamed from: aw */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,61:1\n314#2,11:62\n*S KotlinDebug\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n*L\n38#1:62,11\n*E\n"})
@e0g(parameters = 0)
public final class C1621aw implements rya {

    /* JADX INFO: renamed from: c */
    public static final int f11946c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Choreographer f11947a;

    /* JADX INFO: renamed from: b */
    @gib
    public final C15816yv f11948b;

    /* JADX INFO: renamed from: aw$a */
    public static final class a extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C15816yv f11949a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Choreographer.FrameCallback f11950b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15816yv c15816yv, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f11949a = c15816yv;
            this.f11950b = frameCallback;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            this.f11949a.removeFrameCallback$ui_release(this.f11950b);
        }
    }

    /* JADX INFO: renamed from: aw$b */
    public static final class b extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Choreographer.FrameCallback f11952b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f11952b = frameCallback;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            C1621aw.this.getChoreographer().removeFrameCallback(this.f11952b);
        }
    }

    /* JADX INFO: renamed from: aw$c */
    @dwf({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock$withFrameNanos$2$callback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    public static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dq1<R> f11953a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1621aw f11954b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<Long, R> f11955c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(dq1<? super R> dq1Var, C1621aw c1621aw, qy6<? super Long, ? extends R> qy6Var) {
            this.f11953a = dq1Var;
            this.f11954b = c1621aw;
            this.f11955c = qy6Var;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object objM32723constructorimpl;
            zy2 zy2Var = this.f11953a;
            qy6<Long, R> qy6Var = this.f11955c;
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

    public C1621aw(@yfb Choreographer choreographer, @gib C15816yv c15816yv) {
        this.f11947a = choreographer;
        this.f11948b = c15816yv;
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

    @yfb
    public final Choreographer getChoreographer() {
        return this.f11947a;
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
        C15816yv c15816yv = this.f11948b;
        if (c15816yv == null) {
            e13.InterfaceC5040b interfaceC5040b = zy2Var.getContext().get(dz2.f31343s);
            c15816yv = interfaceC5040b instanceof C15816yv ? (C15816yv) interfaceC5040b : null;
        }
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        c cVar = new c(fq1Var, this, qy6Var);
        if (c15816yv == null || !md8.areEqual(c15816yv.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(cVar);
            fq1Var.invokeOnCancellation(new b(cVar));
        } else {
            c15816yv.postFrameCallback$ui_release(cVar);
            fq1Var.invokeOnCancellation(new a(c15816yv, cVar));
        }
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    public C1621aw(@yfb Choreographer choreographer) {
        this(choreographer, null);
    }
}
