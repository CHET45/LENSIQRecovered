package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
public final class qp5 {

    /* JADX INFO: renamed from: a */
    public static final boolean f75064a = false;

    static {
        Object objM32723constructorimpl;
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
        }
        v7e.m32730isSuccessimpl(objM32723constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return true;
    }
}
