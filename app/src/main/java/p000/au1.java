package p000;

import p000.hsd;
import p000.nye;

/* JADX INFO: loaded from: classes7.dex */
public interface au1<E> extends nye<E>, hsd<E> {

    /* JADX INFO: renamed from: h */
    @yfb
    public static final C1611b f11861h = C1611b.f11868a;

    /* JADX INFO: renamed from: i */
    public static final int f11862i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j */
    public static final int f11863j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f11864k = -1;

    /* JADX INFO: renamed from: l */
    public static final int f11865l = -2;

    /* JADX INFO: renamed from: n */
    public static final int f11866n = -3;

    /* JADX INFO: renamed from: o */
    @yfb
    public static final String f11867o = "kotlinx.coroutines.channels.defaultBuffer";

    /* JADX INFO: renamed from: au1$a */
    public static final class C1610a {
        @yfb
        public static <E> jve<E> getOnReceiveOrNull(@yfb au1<E> au1Var) {
            return hsd.C6996a.getOnReceiveOrNull(au1Var);
        }

        @q64(level = u64.f86866b, message = "Deprecated in the favour of 'trySend' method", replaceWith = @i2e(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean offer(@yfb au1<E> au1Var, E e) {
            return nye.C10119a.offer(au1Var, e);
        }

        @gib
        @q64(level = u64.f86866b, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @i2e(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E poll(@yfb au1<E> au1Var) {
            return (E) hsd.C6996a.poll(au1Var);
        }

        @gib
        @ip9
        @q64(level = u64.f86866b, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @i2e(expression = "receiveCatching().getOrNull()", imports = {}))
        public static <E> Object receiveOrNull(@yfb au1<E> au1Var, @yfb zy2<? super E> zy2Var) {
            return hsd.C6996a.receiveOrNull(au1Var, zy2Var);
        }
    }

    /* JADX INFO: renamed from: au1$b */
    public static final class C1611b {

        /* JADX INFO: renamed from: b */
        public static final int f11869b = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: c */
        public static final int f11870c = 0;

        /* JADX INFO: renamed from: d */
        public static final int f11871d = -1;

        /* JADX INFO: renamed from: e */
        public static final int f11872e = -2;

        /* JADX INFO: renamed from: f */
        public static final int f11873f = -3;

        /* JADX INFO: renamed from: g */
        @yfb
        public static final String f11874g = "kotlinx.coroutines.channels.defaultBuffer";

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C1611b f11868a = new C1611b();

        /* JADX INFO: renamed from: h */
        public static final int f11875h = zjg.systemProp("kotlinx.coroutines.channels.defaultBuffer", 64, 1, m51.f59908N);

        private C1611b() {
        }

        public final int getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core() {
            return f11875h;
        }
    }
}
