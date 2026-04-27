package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface nye<E> {

    /* JADX INFO: renamed from: nye$a */
    public static final class C10119a {
        public static /* synthetic */ boolean close$default(nye nyeVar, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return nyeVar.close(th);
        }

        @t54
        public static /* synthetic */ void isClosedForSend$annotations() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @q64(level = u64.f86866b, message = "Deprecated in the favour of 'trySend' method", replaceWith = @i2e(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean offer(@yfb nye<? super E> nyeVar, E e) throws Throwable {
            Object objMo28705trySendJP2dKIU = nyeVar.mo28705trySendJP2dKIU(e);
            if (xu1.m33282isSuccessimpl(objMo28705trySendJP2dKIU)) {
                return true;
            }
            Throwable thM33276exceptionOrNullimpl = xu1.m33276exceptionOrNullimpl(objMo28705trySendJP2dKIU);
            if (thM33276exceptionOrNullimpl == null) {
                return false;
            }
            throw l0g.recoverStackTrace(thM33276exceptionOrNullimpl);
        }
    }

    boolean close(@gib Throwable th);

    @yfb
    lve<E, nye<E>> getOnSend();

    void invokeOnClose(@yfb qy6<? super Throwable, bth> qy6Var);

    boolean isClosedForSend();

    @q64(level = u64.f86866b, message = "Deprecated in the favour of 'trySend' method", replaceWith = @i2e(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E e);

    @gib
    Object send(E e, @yfb zy2<? super bth> zy2Var);

    @yfb
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    Object mo28705trySendJP2dKIU(E e);
}
