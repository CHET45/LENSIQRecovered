package p000;

import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
public final class bz2<T> implements BiFunction<T, Throwable, bth> {

    @gib
    @un8
    public volatile zy2<? super T> cont;

    public bz2(@gib zy2<? super T> zy2Var) {
        this.cont = zy2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ bth apply(Object obj, Throwable th) {
        apply2(obj, th);
        return bth.f14751a;
    }

    /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
    public void apply2(@gib T t, @gib Throwable th) {
        Throwable cause;
        zy2<? super T> zy2Var = this.cont;
        if (zy2Var == null) {
            return;
        }
        if (th == null) {
            v7e.C13927a c13927a = v7e.f90266b;
            zy2Var.resumeWith(v7e.m32723constructorimpl(t));
            return;
        }
        CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
        if (completionException != null && (cause = completionException.getCause()) != null) {
            th = cause;
        }
        v7e.C13927a c13927a2 = v7e.f90266b;
        zy2Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(th)));
    }
}
