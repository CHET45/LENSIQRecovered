package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutationInterruptedException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,214:1\n26#2:215\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutationInterruptedException\n*L\n64#1:215\n*E\n"})
public final class p7b extends CancellationException {
    public p7b() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    @yfb
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
