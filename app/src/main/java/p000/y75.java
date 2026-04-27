package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public final class y75 {
    @yfb
    public static final CancellationException CancellationException(@gib String str, @gib Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
