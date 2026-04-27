package p000;

import java.util.concurrent.CancellationException;
import p000.nye;

/* JADX INFO: loaded from: classes7.dex */
@xxb
@q64(level = u64.f86866b, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
public interface ud1<E> extends nye<E> {

    /* JADX INFO: renamed from: ud1$a */
    public static final class C13504a {
        public static /* synthetic */ void cancel$default(ud1 ud1Var, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            ud1Var.cancel(cancellationException);
        }

        @q64(level = u64.f86866b, message = "Deprecated in the favour of 'trySend' method", replaceWith = @i2e(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean offer(@yfb ud1<E> ud1Var, E e) {
            return nye.C10119a.offer(ud1Var, e);
        }

        public static /* synthetic */ boolean cancel$default(ud1 ud1Var, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return ud1Var.cancel(th);
        }
    }

    void cancel(@gib CancellationException cancellationException);

    @q64(level = u64.f86867c, message = "Binary compatibility only")
    /* synthetic */ boolean cancel(Throwable th);

    @yfb
    hsd<E> openSubscription();
}
