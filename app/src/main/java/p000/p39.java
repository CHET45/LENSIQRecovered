package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/LeftCompositionCancellationException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,497:1\n26#2:498\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/LeftCompositionCancellationException\n*L\n395#1:498\n*E\n"})
public final class p39 extends CancellationException {
    public p39() {
        super("The coroutine scope left the composition");
    }

    @Override // java.lang.Throwable
    @yfb
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
