package p000;

import android.content.Context;
import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,94:1\n314#2,11:95\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n81#1:95,11\n*E\n"})
public final class jx2 {

    /* JADX INFO: renamed from: jx2$a */
    @dwf({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$1\n*L\n1#1,94:1\n*E\n"})
    public static final class C8131a extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ hx2 f52163a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C8132b f52164b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8131a(hx2 hx2Var, C8132b c8132b) {
            super(1);
            this.f52163a = hx2Var;
            this.f52164b = c8132b;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            this.f52163a.removeOnContextAvailableListener(this.f52164b);
        }
    }

    /* JADX INFO: renamed from: jx2$b */
    @dwf({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
    public static final class C8132b implements d2c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dq1<R> f52165a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<Context, R> f52166b;

        public C8132b(dq1<R> dq1Var, qy6<Context, R> qy6Var) {
            this.f52165a = dq1Var;
            this.f52166b = qy6Var;
        }

        @Override // p000.d2c
        public void onContextAvailable(@yfb Context context) {
            Object objM32723constructorimpl;
            md8.checkNotNullParameter(context, "context");
            zy2 zy2Var = this.f52165a;
            qy6<Context, R> qy6Var = this.f52166b;
            try {
                v7e.C13927a c13927a = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(qy6Var.invoke(context));
            } catch (Throwable th) {
                v7e.C13927a c13927a2 = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
            }
            zy2Var.resumeWith(objM32723constructorimpl);
        }
    }

    @gib
    public static final <R> Object withContextAvailable(@yfb hx2 hx2Var, @yfb qy6<Context, R> qy6Var, @yfb zy2<R> zy2Var) {
        Context contextPeekAvailableContext = hx2Var.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return qy6Var.invoke(contextPeekAvailableContext);
        }
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        C8132b c8132b = new C8132b(fq1Var, qy6Var);
        hx2Var.addOnContextAvailableListener(c8132b);
        fq1Var.invokeOnCancellation(new C8131a(hx2Var, c8132b));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    private static final <R> Object withContextAvailable$$forInline(hx2 hx2Var, qy6<Context, R> qy6Var, zy2<R> zy2Var) {
        Context contextPeekAvailableContext = hx2Var.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return qy6Var.invoke(contextPeekAvailableContext);
        }
        o28.mark(0);
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        C8132b c8132b = new C8132b(fq1Var, qy6Var);
        hx2Var.addOnContextAvailableListener(c8132b);
        fq1Var.invokeOnCancellation(new C8131a(hx2Var, c8132b));
        bth bthVar = bth.f14751a;
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        o28.mark(1);
        return result;
    }
}
