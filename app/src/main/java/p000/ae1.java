package p000;

import p000.n13;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,124:1\n46#2,4:125\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n21#1:125,4\n*E\n"})
public final class ae1 {

    /* JADX INFO: renamed from: ae1$a */
    @dwf({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n1#1,48:1\n21#2:49\n*E\n"})
    public static final class C0188a extends AbstractC13302u0 implements n13 {
        public C0188a(n13.C9643b c9643b) {
            super(c9643b);
        }

        @Override // p000.n13
        public void handleException(e13 e13Var, Throwable th) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: ae1$b */
    @ck3(m4009c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", m4010f = "Broadcast.kt", m4011i = {0, 1}, m4012l = {26, 27}, m4013m = "invokeSuspend", m4014n = {"$this$broadcast", "$this$broadcast"}, m4015s = {"L$0", "L$0"})
    public static final class C0189b<E> extends ugg implements gz6<vdd<? super E>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f1189a;

        /* JADX INFO: renamed from: b */
        public int f1190b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f1191c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ hsd<E> f1192d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0189b(hsd<? extends E> hsdVar, zy2<? super C0189b> zy2Var) {
            super(2, zy2Var);
            this.f1192d = hsdVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C0189b c0189b = new C0189b(this.f1192d, zy2Var);
            c0189b.f1191c = obj;
            return c0189b;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<? super E> vddVar, zy2<? super bth> zy2Var) {
            return ((C0189b) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0062 -> B:7:0x0019). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r6.f1190b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r6.f1189a
                mu1 r1 = (p000.mu1) r1
                java.lang.Object r4 = r6.f1191c
                vdd r4 = (p000.vdd) r4
                p000.y7e.throwOnFailure(r7)
            L19:
                r7 = r4
                goto L3c
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L23:
                java.lang.Object r1 = r6.f1189a
                mu1 r1 = (p000.mu1) r1
                java.lang.Object r4 = r6.f1191c
                vdd r4 = (p000.vdd) r4
                p000.y7e.throwOnFailure(r7)
                goto L4c
            L2f:
                p000.y7e.throwOnFailure(r7)
                java.lang.Object r7 = r6.f1191c
                vdd r7 = (p000.vdd) r7
                hsd<E> r1 = r6.f1192d
                mu1 r1 = r1.iterator()
            L3c:
                r6.f1191c = r7
                r6.f1189a = r1
                r6.f1190b = r3
                java.lang.Object r4 = r1.hasNext(r6)
                if (r4 != r0) goto L49
                return r0
            L49:
                r5 = r4
                r4 = r7
                r7 = r5
            L4c:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L65
                java.lang.Object r7 = r1.next()
                r6.f1191c = r4
                r6.f1189a = r1
                r6.f1190b = r2
                java.lang.Object r7 = r4.send(r7, r6)
                if (r7 != r0) goto L19
                return r0
            L65:
                bth r7 = p000.bth.f14751a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ae1.C0189b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @yfb
    @xxb
    @q64(level = u64.f86866b, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> ud1<E> broadcast(@yfb final hsd<? extends E> hsdVar, int i, @yfb b23 b23Var) {
        return broadcast$default(y13.plus(y13.plus(q77.f73410a, df4.getUnconfined()), new C0188a(n13.f62944t)), null, i, b23Var, new qy6() { // from class: zd1
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return ae1.broadcast$lambda$1(hsdVar, (Throwable) obj);
            }
        }, new C0189b(hsdVar, null), 1, null);
    }

    public static /* synthetic */ ud1 broadcast$default(hsd hsdVar, int i, b23 b23Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            b23Var = b23.f12442b;
        }
        return broadcast(hsdVar, i, b23Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth broadcast$lambda$1(hsd hsdVar, Throwable th) {
        av1.cancelConsumed(hsdVar, th);
        return bth.f14751a;
    }

    public static /* synthetic */ ud1 broadcast$default(x13 x13Var, e13 e13Var, int i, b23 b23Var, qy6 qy6Var, gz6 gz6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            e13Var = a05.f2a;
        }
        e13 e13Var2 = e13Var;
        if ((i2 & 2) != 0) {
            i = 1;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            b23Var = b23.f12442b;
        }
        b23 b23Var2 = b23Var;
        if ((i2 & 8) != 0) {
            qy6Var = null;
        }
        return broadcast(x13Var, e13Var2, i3, b23Var2, qy6Var, gz6Var);
    }

    @yfb
    @xxb
    @q64(level = u64.f86866b, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> ud1<E> broadcast(@yfb x13 x13Var, @yfb e13 e13Var, int i, @yfb b23 b23Var, @gib qy6<? super Throwable, bth> qy6Var, @yfb @cg1 gz6<? super vdd<? super E>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        xd1 xd1Var;
        e13 e13VarNewCoroutineContext = j13.newCoroutineContext(x13Var, e13Var);
        ud1 ud1VarBroadcastChannel = wd1.BroadcastChannel(i);
        if (b23Var.isLazy()) {
            xd1Var = new kx8(e13VarNewCoroutineContext, ud1VarBroadcastChannel, gz6Var);
        } else {
            xd1Var = new xd1(e13VarNewCoroutineContext, ud1VarBroadcastChannel, true);
        }
        if (qy6Var != null) {
            ((sj8) xd1Var).invokeOnCompletion(qy6Var);
        }
        ((AbstractC12833t0) xd1Var).start(b23Var, xd1Var, gz6Var);
        return (ud1<E>) xd1Var;
    }
}
