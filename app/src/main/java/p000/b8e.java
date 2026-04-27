package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
public final class b8e<T> extends rj8 {

    /* JADX INFO: renamed from: e */
    @yfb
    public final fq1<T> f12978e;

    /* JADX WARN: Multi-variable type inference failed */
    public b8e(@yfb fq1<? super T> fq1Var) {
        this.f12978e = fq1Var;
    }

    @Override // p000.rj8
    public boolean getOnCancelling() {
        return false;
    }

    @Override // p000.rj8
    public void invoke(@gib Throwable th) {
        Object state$kotlinx_coroutines_core = getJob().getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof ni2) {
            fq1<T> fq1Var = this.f12978e;
            v7e.C13927a c13927a = v7e.f90266b;
            fq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(((ni2) state$kotlinx_coroutines_core).f64635a)));
        } else {
            fq1<T> fq1Var2 = this.f12978e;
            v7e.C13927a c13927a2 = v7e.f90266b;
            fq1Var2.resumeWith(v7e.m32723constructorimpl(tj8.unboxState(state$kotlinx_coroutines_core)));
        }
    }
}
