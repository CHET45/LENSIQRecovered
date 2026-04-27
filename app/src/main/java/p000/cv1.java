package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,204:1\n94#1,8:205\n160#1:213\n94#1,3:214\n161#1,2:217\n101#1:219\n97#1,3:220\n*S KotlinDebug\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n160#1:205,8\n192#1:213\n192#1:214,3\n192#1:217,2\n192#1:219\n192#1:220,3\n*E\n"})
public final /* synthetic */ class cv1 {

    /* JADX INFO: renamed from: cv1$a */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m4010f = "Channels.common.kt", m4011i = {0, 0}, m4012l = {161}, m4013m = "consumeEach", m4014n = {"action", "$this$consume$iv"}, m4015s = {"L$0", "L$1"})
    public static final class C4518a<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f27712a;

        /* JADX INFO: renamed from: b */
        public Object f27713b;

        /* JADX INFO: renamed from: c */
        public Object f27714c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f27715d;

        /* JADX INFO: renamed from: e */
        public int f27716e;

        public C4518a(zy2<? super C4518a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f27715d = obj;
            this.f27716e |= Integer.MIN_VALUE;
            return cv1.consumeEach(null, null, this);
        }
    }

    /* JADX INFO: renamed from: cv1$b */
    @ck3(m4009c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m4010f = "Channels.common.kt", m4011i = {0, 0}, m4012l = {209}, m4013m = "toList", m4014n = {"$this$toList_u24lambda_u242", "$this$consume$iv$iv"}, m4015s = {"L$1", "L$2"})
    public static final class C4519b<E> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f27717a;

        /* JADX INFO: renamed from: b */
        public Object f27718b;

        /* JADX INFO: renamed from: c */
        public Object f27719c;

        /* JADX INFO: renamed from: d */
        public Object f27720d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27721e;

        /* JADX INFO: renamed from: f */
        public int f27722f;

        public C4519b(zy2<? super C4519b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f27721e = obj;
            this.f27722f |= Integer.MIN_VALUE;
            return av1.toList(null, this);
        }
    }

    @yjd
    public static final void cancelConsumed(@yfb hsd<?> hsdVar, @gib Throwable th) {
        if (th != null) {
            CancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            if (CancellationException == null) {
                CancellationException = y75.CancellationException("Channel was consumed, consumer had failed", th);
            }
        }
        hsdVar.cancel(CancellationException);
    }

    public static final <E, R> R consume(@yfb hsd<? extends E> hsdVar, @yfb qy6<? super hsd<? extends E>, ? extends R> qy6Var) {
        try {
            R rInvoke = qy6Var.invoke(hsdVar);
            o28.finallyStart(1);
            av1.cancelConsumed(hsdVar, null);
            o28.finallyEnd(1);
            return rInvoke;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x006d), top: B:37:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x006d), top: B:37:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E> java.lang.Object consumeEach(@p000.yfb p000.hsd<? extends E> r5, @p000.yfb p000.qy6<? super E, p000.bth> r6, @p000.yfb p000.zy2<? super p000.bth> r7) {
        /*
            boolean r0 = r7 instanceof p000.cv1.C4518a
            if (r0 == 0) goto L13
            r0 = r7
            cv1$a r0 = (p000.cv1.C4518a) r0
            int r1 = r0.f27716e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27716e = r1
            goto L18
        L13:
            cv1$a r0 = new cv1$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27715d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27716e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f27714c
            mu1 r5 = (p000.mu1) r5
            java.lang.Object r6 = r0.f27713b
            hsd r6 = (p000.hsd) r6
            java.lang.Object r2 = r0.f27712a
            qy6 r2 = (p000.qy6) r2
            p000.y7e.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L7e
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            p000.y7e.throwOnFailure(r7)
            mu1 r7 = r5.iterator()     // Catch: java.lang.Throwable -> L7a
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.f27712a = r7     // Catch: java.lang.Throwable -> L35
            r0.f27713b = r6     // Catch: java.lang.Throwable -> L35
            r0.f27714c = r5     // Catch: java.lang.Throwable -> L35
            r0.f27716e = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            r2.invoke(r7)     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4a
        L6d:
            bth r5 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L35
            p000.o28.finallyStart(r3)
            r7 = 0
            p000.av1.cancelConsumed(r6, r7)
            p000.o28.finallyEnd(r3)
            return r5
        L7a:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7e:
            throw r5     // Catch: java.lang.Throwable -> L7f
        L7f:
            r7 = move-exception
            p000.o28.finallyStart(r3)
            p000.av1.cancelConsumed(r6, r5)
            p000.o28.finallyEnd(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cv1.consumeEach(hsd, qy6, zy2):java.lang.Object");
    }

    private static final <E> Object consumeEach$$forInline(hsd<? extends E> hsdVar, qy6<? super E, bth> qy6Var, zy2<? super bth> zy2Var) {
        try {
            mu1<? extends E> it = hsdVar.iterator();
            while (true) {
                o28.mark(3);
                o28.mark(0);
                Object objHasNext = it.hasNext(null);
                o28.mark(1);
                if (!((Boolean) objHasNext).booleanValue()) {
                    bth bthVar = bth.f14751a;
                    o28.finallyStart(1);
                    av1.cancelConsumed(hsdVar, null);
                    o28.finallyEnd(1);
                    return bthVar;
                }
                qy6Var.invoke(it.next());
            }
        } finally {
        }
    }

    @q64(level = u64.f86867c, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ jve onReceiveOrNull(hsd hsdVar) {
        md8.checkNotNull(hsdVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>");
        return hsdVar.getOnReceiveOrNull();
    }

    @q64(level = u64.f86867c, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @i2e(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ Object receiveOrNull(hsd hsdVar, zy2 zy2Var) {
        md8.checkNotNull(hsdVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>");
        return hsdVar.receiveOrNull(zy2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0067, B:27:0x006f, B:28:0x0078), top: B:43:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0067, B:27:0x006f, B:28:0x0078), top: B:43:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:25:0x0067). Please report as a decompilation issue!!! */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E> java.lang.Object toList(@p000.yfb p000.hsd<? extends E> r7, @p000.yfb p000.zy2<? super java.util.List<? extends E>> r8) {
        /*
            boolean r0 = r8 instanceof p000.cv1.C4519b
            if (r0 == 0) goto L13
            r0 = r8
            cv1$b r0 = (p000.cv1.C4519b) r0
            int r1 = r0.f27722f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27722f = r1
            goto L18
        L13:
            cv1$b r0 = new cv1$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27721e
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27722f
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.f27720d
            mu1 r7 = (p000.mu1) r7
            java.lang.Object r2 = r0.f27719c
            hsd r2 = (p000.hsd) r2
            java.lang.Object r4 = r0.f27718b
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.f27717a
            java.util.List r5 = (java.util.List) r5
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L39
            goto L67
        L39:
            r7 = move-exception
            r8 = r2
            goto L89
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            p000.y7e.throwOnFailure(r8)
            java.util.List r8 = p000.k82.createListBuilder()
            mu1 r2 = r7.iterator()     // Catch: java.lang.Throwable -> L85
            r4 = r8
            r5 = r4
            r8 = r7
            r7 = r2
        L53:
            r0.f27717a = r5     // Catch: java.lang.Throwable -> L83
            r0.f27718b = r4     // Catch: java.lang.Throwable -> L83
            r0.f27719c = r8     // Catch: java.lang.Throwable -> L83
            r0.f27720d = r7     // Catch: java.lang.Throwable -> L83
            r0.f27722f = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L83
            if (r2 != r1) goto L64
            return r1
        L64:
            r6 = r2
            r2 = r8
            r8 = r6
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L39
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L78
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L39
            r4.add(r8)     // Catch: java.lang.Throwable -> L39
            r8 = r2
            goto L53
        L78:
            bth r7 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L39
            r7 = 0
            p000.av1.cancelConsumed(r2, r7)
            java.util.List r7 = p000.k82.build(r5)
            return r7
        L83:
            r7 = move-exception
            goto L89
        L85:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L89:
            throw r7     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            p000.av1.cancelConsumed(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cv1.toList(hsd, zy2):java.lang.Object");
    }
}
