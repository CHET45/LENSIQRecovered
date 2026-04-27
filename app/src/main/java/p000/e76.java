package p000;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e76 {

    /* JADX INFO: renamed from: e76$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m4010f = "Channels.kt", m4011i = {0, 0, 0, 1, 1, 1}, m4012l = {32, 33}, m4013m = "emitAllImpl$FlowKt__ChannelsKt", m4014n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, m4015s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    public static final class C5157a<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f32035a;

        /* JADX INFO: renamed from: b */
        public Object f32036b;

        /* JADX INFO: renamed from: c */
        public Object f32037c;

        /* JADX INFO: renamed from: d */
        public boolean f32038d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f32039e;

        /* JADX INFO: renamed from: f */
        public int f32040f;

        public C5157a(zy2<? super C5157a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f32039e = obj;
            this.f32040f |= Integer.MIN_VALUE;
            return e76.emitAllImpl$FlowKt__ChannelsKt(null, null, false, this);
        }
    }

    @yfb
    public static final <T> y56<T> consumeAsFlow(@yfb hsd<? extends T> hsdVar) {
        return new cu1(hsdVar, true, null, 0, null, 28, null);
    }

    @gib
    public static final <T> Object emitAll(@yfb t66<? super T> t66Var, @yfb hsd<? extends T> hsdVar, @yfb zy2<? super bth> zy2Var) {
        Object objEmitAllImpl$FlowKt__ChannelsKt = emitAllImpl$FlowKt__ChannelsKt(t66Var, hsdVar, true, zy2Var);
        return objEmitAllImpl$FlowKt__ChannelsKt == pd8.getCOROUTINE_SUSPENDED() ? objEmitAllImpl$FlowKt__ChannelsKt : bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object emitAllImpl$FlowKt__ChannelsKt(p000.t66<? super T> r6, p000.hsd<? extends T> r7, boolean r8, p000.zy2<? super p000.bth> r9) {
        /*
            boolean r0 = r9 instanceof p000.e76.C5157a
            if (r0 == 0) goto L13
            r0 = r9
            e76$a r0 = (p000.e76.C5157a) r0
            int r1 = r0.f32040f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32040f = r1
            goto L18
        L13:
            e76$a r0 = new e76$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f32039e
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f32040f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f32038d
            java.lang.Object r6 = r0.f32037c
            mu1 r6 = (p000.mu1) r6
            java.lang.Object r7 = r0.f32036b
            hsd r7 = (p000.hsd) r7
            java.lang.Object r2 = r0.f32035a
            t66 r2 = (p000.t66) r2
            p000.y7e.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f32038d
            java.lang.Object r6 = r0.f32037c
            mu1 r6 = (p000.mu1) r6
            java.lang.Object r7 = r0.f32036b
            hsd r7 = (p000.hsd) r7
            java.lang.Object r2 = r0.f32035a
            t66 r2 = (p000.t66) r2
            p000.y7e.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            p000.y7e.throwOnFailure(r9)
            p000.c76.ensureActive(r6)
            mu1 r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f32035a = r6     // Catch: java.lang.Throwable -> L3c
            r0.f32036b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f32037c = r9     // Catch: java.lang.Throwable -> L3c
            r0.f32038d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f32040f = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.hasNext(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            return r1
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f32035a = r2     // Catch: java.lang.Throwable -> L3c
            r0.f32036b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f32037c = r6     // Catch: java.lang.Throwable -> L3c
            r0.f32038d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f32040f = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            p000.av1.cancelConsumed(r7, r6)
        L9a:
            bth r6 = p000.bth.f14751a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            p000.av1.cancelConsumed(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e76.emitAllImpl$FlowKt__ChannelsKt(t66, hsd, boolean, zy2):java.lang.Object");
    }

    @yfb
    public static final <T> hsd<T> produceIn(@yfb y56<? extends T> y56Var, @yfb x13 x13Var) {
        return hu1.asChannelFlow(y56Var).produceImpl(x13Var);
    }

    @yfb
    public static final <T> y56<T> receiveAsFlow(@yfb hsd<? extends T> hsdVar) {
        return new cu1(hsdVar, false, null, 0, null, 28, null);
    }
}
