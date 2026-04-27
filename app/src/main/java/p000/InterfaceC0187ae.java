package p000;

import p000.hsd;

/* JADX INFO: renamed from: ae */
/* JADX INFO: loaded from: classes7.dex */
@xxb
public interface InterfaceC0187ae<E> extends x13, hsd<E> {

    /* JADX INFO: renamed from: ae$a */
    public static final class a {
        @yfb
        public static <E> jve<E> getOnReceiveOrNull(@yfb InterfaceC0187ae<E> interfaceC0187ae) {
            return hsd.C6996a.getOnReceiveOrNull(interfaceC0187ae);
        }

        @gib
        @q64(level = u64.f86866b, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @i2e(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E poll(@yfb InterfaceC0187ae<E> interfaceC0187ae) {
            return (E) hsd.C6996a.poll(interfaceC0187ae);
        }

        @gib
        @ip9
        @q64(level = u64.f86866b, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @i2e(expression = "receiveCatching().getOrNull()", imports = {}))
        public static <E> Object receiveOrNull(@yfb InterfaceC0187ae<E> interfaceC0187ae, @yfb zy2<? super E> zy2Var) {
            return hsd.C6996a.receiveOrNull(interfaceC0187ae, zy2Var);
        }
    }

    @yfb
    au1<E> getChannel();
}
