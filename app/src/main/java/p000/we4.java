package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 2 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,297:1\n277#1,5:305\n282#1,12:311\n294#1:379\n281#1:381\n282#1,12:383\n294#1:412\n207#2,7:298\n214#2,23:326\n237#2,2:359\n239#2:363\n217#2:364\n219#2:380\n1#3:310\n1#3:382\n1#3:413\n186#4,3:323\n189#4,14:365\n186#4,17:395\n186#4,17:414\n103#5,10:349\n114#5,2:361\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n*L\n262#1:305,5\n262#1:311,12\n262#1:379\n267#1:381\n267#1:383,12\n267#1:412\n262#1:298,7\n262#1:326,23\n262#1:359,2\n262#1:363\n262#1:364\n262#1:380\n262#1:310\n267#1:382\n262#1:323,3\n262#1:365,14\n267#1:395,17\n293#1:414,17\n262#1:349,10\n262#1:361,2\n*E\n"})
public final class we4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final qhg f94021a = new qhg("UNDEFINED");

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public static final qhg f94022b = new qhg("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m24489a(ve4 ve4Var, Object obj, int i, boolean z, ny6 ny6Var, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        e65 eventLoop$kotlinx_coroutines_core = xxg.f99642a.getEventLoop$kotlinx_coroutines_core();
        if (z && eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            ve4Var.f90783f = obj;
            ve4Var.f101289c = i;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(ve4Var);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            ny6Var.invoke();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
            o28.finallyStart(1);
        } catch (Throwable th) {
            try {
                ve4Var.handleFatalException$kotlinx_coroutines_core(th);
                o28.finallyStart(1);
            } catch (Throwable th2) {
                o28.finallyStart(1);
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                o28.finallyEnd(1);
                throw th2;
            }
        }
        eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
        o28.finallyEnd(1);
        return false;
    }

    private static final boolean executeUnconfined(ve4<?> ve4Var, Object obj, int i, boolean z, ny6<bth> ny6Var) {
        e65 eventLoop$kotlinx_coroutines_core = xxg.f99642a.getEventLoop$kotlinx_coroutines_core();
        if (z && eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            ve4Var.f90783f = obj;
            ve4Var.f101289c = i;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(ve4Var);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            ny6Var.invoke();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
            o28.finallyStart(1);
        } catch (Throwable th) {
            try {
                ve4Var.handleFatalException$kotlinx_coroutines_core(th);
                o28.finallyStart(1);
            } catch (Throwable th2) {
                o28.finallyStart(1);
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                o28.finallyEnd(1);
                throw th2;
            }
        }
        eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
        o28.finallyEnd(1);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x003e, B:13:0x004c, B:15:0x0052, B:28:0x0091, B:18:0x0069, B:20:0x0079, B:25:0x0088, B:27:0x008e, B:33:0x009e, B:36:0x00a7, B:35:0x00a4, B:23:0x007f), top: B:44:0x003e, inners: #1 }] */
    @p000.la8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void resumeCancellableWith(@p000.yfb p000.zy2<? super T> r6, @p000.yfb java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof p000.ve4
            if (r0 == 0) goto Lb1
            ve4 r6 = (p000.ve4) r6
            java.lang.Object r0 = p000.ri2.toState(r7)
            m13 r1 = r6.f90781d
            e13 r2 = r6.getContext()
            boolean r1 = r1.isDispatchNeeded(r2)
            r2 = 1
            if (r1 == 0) goto L26
            r6.f90783f = r0
            r6.f101289c = r2
            m13 r7 = r6.f90781d
            e13 r0 = r6.getContext()
            r7.mo29873dispatch(r0, r6)
            goto Lb4
        L26:
            xxg r1 = p000.xxg.f99642a
            e65 r1 = r1.getEventLoop$kotlinx_coroutines_core()
            boolean r3 = r1.isUnconfinedLoopActive()
            if (r3 == 0) goto L3b
            r6.f90783f = r0
            r6.f101289c = r2
            r1.dispatchUnconfined(r6)
            goto Lb4
        L3b:
            r1.incrementUseCount(r2)
            e13 r3 = r6.getContext()     // Catch: java.lang.Throwable -> L67
            jj8$b r4 = p000.jj8.f50715A     // Catch: java.lang.Throwable -> L67
            e13$b r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L67
            jj8 r3 = (p000.jj8) r3     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L69
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch: java.lang.Throwable -> L67
            r6.cancelCompletedResult$kotlinx_coroutines_core(r0, r7)     // Catch: java.lang.Throwable -> L67
            v7e$a r0 = p000.v7e.f90266b     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = p000.y7e.createFailure(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = p000.v7e.m32723constructorimpl(r7)     // Catch: java.lang.Throwable -> L67
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L67
            goto L91
        L67:
            r7 = move-exception
            goto La8
        L69:
            zy2<T> r0 = r6.f90782e     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = r6.f90784m     // Catch: java.lang.Throwable -> L67
            e13 r4 = r0.getContext()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = p000.sxg.updateThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L67
            qhg r5 = p000.sxg.f83208a     // Catch: java.lang.Throwable -> L67
            if (r3 == r5) goto L7e
            esh r0 = p000.j13.updateUndispatchedCompletion(r0, r4, r3)     // Catch: java.lang.Throwable -> L67
            goto L7f
        L7e:
            r0 = 0
        L7f:
            zy2<T> r5 = r6.f90782e     // Catch: java.lang.Throwable -> L9b
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9b
            bth r7 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L8e
            boolean r7 = r0.clearThreadContext()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L91
        L8e:
            p000.sxg.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L67
        L91:
            boolean r7 = r1.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L67
            if (r7 != 0) goto L91
        L97:
            r1.decrementUseCount(r2)
            goto Lb4
        L9b:
            r7 = move-exception
            if (r0 == 0) goto La4
            boolean r0 = r0.clearThreadContext()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto La7
        La4:
            p000.sxg.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L67
        La7:
            throw r7     // Catch: java.lang.Throwable -> L67
        La8:
            r6.handleFatalException$kotlinx_coroutines_core(r7)     // Catch: java.lang.Throwable -> Lac
            goto L97
        Lac:
            r6 = move-exception
            r1.decrementUseCount(r2)
            throw r6
        Lb1:
            r6.resumeWith(r7)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.we4.resumeCancellableWith(zy2, java.lang.Object):void");
    }

    public static final boolean yieldUndispatched(@yfb ve4<? super bth> ve4Var) {
        bth bthVar = bth.f14751a;
        e65 eventLoop$kotlinx_coroutines_core = xxg.f99642a.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            ve4Var.f90783f = bthVar;
            ve4Var.f101289c = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(ve4Var);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            ve4Var.run();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }
}
