package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDebugStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugStrings.kt\nkotlinx/coroutines/DebugStringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
public final class kk3 {
    @yfb
    public static final String getClassSimpleName(@yfb Object obj) {
        return obj.getClass().getSimpleName();
    }

    @yfb
    public static final String getHexAddress(@yfb Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @yfb
    public static final String toDebugString(@yfb zy2<?> zy2Var) {
        Object objM32723constructorimpl;
        if (zy2Var instanceof ve4) {
            return ((ve4) zy2Var).toString();
        }
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(zy2Var + '@' + getHexAddress(zy2Var));
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
        }
        if (v7e.m32726exceptionOrNullimpl(objM32723constructorimpl) != null) {
            objM32723constructorimpl = zy2Var.getClass().getName() + '@' + getHexAddress(zy2Var);
        }
        return (String) objM32723constructorimpl;
    }
}
