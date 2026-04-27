package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
public final class y7e {
    @jjf(version = "1.3")
    @yfb
    @yjd
    public static final Object createFailure(@yfb Throwable th) {
        md8.checkNotNullParameter(th, "exception");
        return new v7e.C13928b(th);
    }

    @jjf(version = "1.3")
    @t28
    private static final <R, T> R fold(Object obj, qy6<? super T, ? extends R> qy6Var, qy6<? super Throwable, ? extends R> qy6Var2) {
        md8.checkNotNullParameter(qy6Var, "onSuccess");
        md8.checkNotNullParameter(qy6Var2, "onFailure");
        Throwable thM32726exceptionOrNullimpl = v7e.m32726exceptionOrNullimpl(obj);
        return thM32726exceptionOrNullimpl == null ? qy6Var.invoke(obj) : qy6Var2.invoke(thM32726exceptionOrNullimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @t28
    private static final <R, T extends R> R getOrDefault(Object obj, R r) {
        return v7e.m32729isFailureimpl(obj) ? r : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @t28
    private static final <R, T extends R> R getOrElse(Object obj, qy6<? super Throwable, ? extends R> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "onFailure");
        Throwable thM32726exceptionOrNullimpl = v7e.m32726exceptionOrNullimpl(obj);
        return thM32726exceptionOrNullimpl == null ? obj : qy6Var.invoke(thM32726exceptionOrNullimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @t28
    private static final <T> T getOrThrow(Object obj) {
        throwOnFailure(obj);
        return obj;
    }

    @jjf(version = "1.3")
    @t28
    private static final <R, T> Object map(Object obj, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "transform");
        if (!v7e.m32730isSuccessimpl(obj)) {
            return v7e.m32723constructorimpl(obj);
        }
        v7e.C13927a c13927a = v7e.f90266b;
        return v7e.m32723constructorimpl(qy6Var.invoke(obj));
    }

    @jjf(version = "1.3")
    @t28
    private static final <R, T> Object mapCatching(Object obj, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "transform");
        if (!v7e.m32730isSuccessimpl(obj)) {
            return v7e.m32723constructorimpl(obj);
        }
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            return v7e.m32723constructorimpl(qy6Var.invoke(obj));
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            return v7e.m32723constructorimpl(createFailure(th));
        }
    }

    @jjf(version = "1.3")
    @t28
    private static final <T> Object onFailure(Object obj, qy6<? super Throwable, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "action");
        Throwable thM32726exceptionOrNullimpl = v7e.m32726exceptionOrNullimpl(obj);
        if (thM32726exceptionOrNullimpl != null) {
            qy6Var.invoke(thM32726exceptionOrNullimpl);
        }
        return obj;
    }

    @jjf(version = "1.3")
    @t28
    private static final <T> Object onSuccess(Object obj, qy6<? super T, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "action");
        if (v7e.m32730isSuccessimpl(obj)) {
            qy6Var.invoke(obj);
        }
        return obj;
    }

    @jjf(version = "1.3")
    @t28
    private static final <R, T extends R> Object recover(Object obj, qy6<? super Throwable, ? extends R> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "transform");
        Throwable thM32726exceptionOrNullimpl = v7e.m32726exceptionOrNullimpl(obj);
        if (thM32726exceptionOrNullimpl == null) {
            return obj;
        }
        v7e.C13927a c13927a = v7e.f90266b;
        return v7e.m32723constructorimpl(qy6Var.invoke(thM32726exceptionOrNullimpl));
    }

    @jjf(version = "1.3")
    @t28
    private static final <R, T extends R> Object recoverCatching(Object obj, qy6<? super Throwable, ? extends R> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "transform");
        Throwable thM32726exceptionOrNullimpl = v7e.m32726exceptionOrNullimpl(obj);
        if (thM32726exceptionOrNullimpl == null) {
            return obj;
        }
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            return v7e.m32723constructorimpl(qy6Var.invoke(thM32726exceptionOrNullimpl));
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            return v7e.m32723constructorimpl(createFailure(th));
        }
    }

    @jjf(version = "1.3")
    @t28
    private static final <R> Object runCatching(ny6<? extends R> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "block");
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            return v7e.m32723constructorimpl(ny6Var.invoke());
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            return v7e.m32723constructorimpl(createFailure(th));
        }
    }

    @jjf(version = "1.3")
    @yjd
    public static final void throwOnFailure(@yfb Object obj) {
        if (obj instanceof v7e.C13928b) {
            throw ((v7e.C13928b) obj).f90268a;
        }
    }

    @jjf(version = "1.3")
    @t28
    private static final <T, R> Object runCatching(T t, qy6<? super T, ? extends R> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            return v7e.m32723constructorimpl(qy6Var.invoke(t));
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            return v7e.m32723constructorimpl(createFailure(th));
        }
    }
}
