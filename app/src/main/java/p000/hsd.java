package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public interface hsd<E> {

    /* JADX INFO: renamed from: hsd$a */
    public static final class C6996a {

        /* JADX INFO: renamed from: hsd$a$a */
        @ck3(m4009c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", m4010f = "Channel.kt", m4011i = {}, m4012l = {380}, m4013m = "receiveOrNull", m4014n = {}, m4015s = {})
        public static final class a<E> extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f44734a;

            /* JADX INFO: renamed from: b */
            public int f44735b;

            public a(zy2<? super a> zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                this.f44734a = obj;
                this.f44735b |= Integer.MIN_VALUE;
                return C6996a.receiveOrNull(null, this);
            }
        }

        public static /* synthetic */ void cancel$default(hsd hsdVar, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            hsdVar.cancel(cancellationException);
        }

        @yfb
        public static <E> jve<E> getOnReceiveOrNull(@yfb hsd<? extends E> hsdVar) {
            md8.checkNotNull(hsdVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>");
            return ((kf1) hsdVar).getOnReceiveOrNull();
        }

        @q64(level = u64.f86866b, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @i2e(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void getOnReceiveOrNull$annotations() {
        }

        @t54
        public static /* synthetic */ void isClosedForReceive$annotations() {
        }

        @wg5
        public static /* synthetic */ void isEmpty$annotations() {
        }

        @gib
        @q64(level = u64.f86866b, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @i2e(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E poll(@yfb hsd<? extends E> hsdVar) throws Throwable {
            Object objMo28704tryReceivePtdJZtk = hsdVar.mo28704tryReceivePtdJZtk();
            if (xu1.m33282isSuccessimpl(objMo28704tryReceivePtdJZtk)) {
                return (E) xu1.m33278getOrThrowimpl(objMo28704tryReceivePtdJZtk);
            }
            Throwable thM33276exceptionOrNullimpl = xu1.m33276exceptionOrNullimpl(objMo28704tryReceivePtdJZtk);
            if (thM33276exceptionOrNullimpl == null) {
                return null;
            }
            throw l0g.recoverStackTrace(thM33276exceptionOrNullimpl);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @p000.gib
        @p000.ip9
        @p000.q64(level = p000.u64.f86866b, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @p000.i2e(expression = "receiveCatching().getOrNull()", imports = {}))
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static <E> java.lang.Object receiveOrNull(@p000.yfb p000.hsd<? extends E> r4, @p000.yfb p000.zy2<? super E> r5) {
            /*
                boolean r0 = r5 instanceof p000.hsd.C6996a.a
                if (r0 == 0) goto L13
                r0 = r5
                hsd$a$a r0 = (p000.hsd.C6996a.a) r0
                int r1 = r0.f44735b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f44735b = r1
                goto L18
            L13:
                hsd$a$a r0 = new hsd$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f44734a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f44735b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                p000.y7e.throwOnFailure(r5)
                xu1 r5 = (p000.xu1) r5
                java.lang.Object r4 = r5.m33284unboximpl()
                goto L43
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                p000.y7e.throwOnFailure(r5)
                r0.f44735b = r3
                java.lang.Object r4 = r4.mo28703receiveCatchingJP2dKIU(r0)
                if (r4 != r1) goto L43
                return r1
            L43:
                java.lang.Object r4 = p000.xu1.m33277getOrNullimpl(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.hsd.C6996a.receiveOrNull(hsd, zy2):java.lang.Object");
        }

        public static /* synthetic */ boolean cancel$default(hsd hsdVar, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return hsdVar.cancel(th);
        }
    }

    @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void cancel(@gib CancellationException cancellationException);

    @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean cancel(Throwable th);

    @yfb
    jve<E> getOnReceive();

    @yfb
    jve<xu1<E>> getOnReceiveCatching();

    @yfb
    jve<E> getOnReceiveOrNull();

    boolean isClosedForReceive();

    boolean isEmpty();

    @yfb
    mu1<E> iterator();

    @gib
    @q64(level = u64.f86866b, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @i2e(expression = "tryReceive().getOrNull()", imports = {}))
    E poll();

    @gib
    Object receive(@yfb zy2<? super E> zy2Var);

    @gib
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    Object mo28703receiveCatchingJP2dKIU(@yfb zy2<? super xu1<? extends E>> zy2Var);

    @gib
    @ip9
    @q64(level = u64.f86866b, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @i2e(expression = "receiveCatching().getOrNull()", imports = {}))
    Object receiveOrNull(@yfb zy2<? super E> zy2Var);

    @yfb
    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    Object mo28704tryReceivePtdJZtk();
}
