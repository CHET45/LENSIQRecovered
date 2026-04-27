package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class gr9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f40827a = "kotlinx.coroutines.fast.service.loader";

    /* JADX INFO: renamed from: b */
    public static final boolean f40828b = false;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ gwa m11824a(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return createMissingDispatcher(th, str);
    }

    private static final gwa createMissingDispatcher(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        throwMissingMainDispatcherException();
        throw new us8();
    }

    private static /* synthetic */ void getSUPPORT_MISSING$annotations() {
    }

    @la8
    public static final boolean isMissing(@yfb dr9 dr9Var) {
        return dr9Var.getImmediate() instanceof gwa;
    }

    @yfb
    public static final Void throwMissingMainDispatcherException() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @la8
    @yfb
    public static final dr9 tryCreateDispatcher(@yfb er9 er9Var, @yfb List<? extends er9> list) {
        try {
            return er9Var.createDispatcher(list);
        } catch (Throwable th) {
            return createMissingDispatcher(th, er9Var.hintOnError());
        }
    }
}
