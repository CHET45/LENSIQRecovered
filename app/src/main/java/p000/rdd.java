package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nProduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,300:1\n1#2:301\n351#3,11:302\n*S KotlinDebug\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n*L\n63#1:302,11\n*E\n"})
public final class rdd {

    /* JADX INFO: renamed from: rdd$a */
    @ck3(m4009c = "kotlinx.coroutines.channels.ProduceKt", m4010f = "Produce.kt", m4011i = {0, 0}, m4012l = {302}, m4013m = "awaitClose", m4014n = {"$this$awaitClose", "block"}, m4015s = {"L$0", "L$1"})
    public static final class C12032a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f77949a;

        /* JADX INFO: renamed from: b */
        public Object f77950b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f77951c;

        /* JADX INFO: renamed from: d */
        public int f77952d;

        public C12032a(zy2<? super C12032a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f77951c = obj;
            this.f77952d |= Integer.MIN_VALUE;
            return rdd.awaitClose(null, null, this);
        }
    }

    /* JADX INFO: renamed from: rdd$b */
    public static final class C12033b implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dq1<bth> f77953a;

        /* JADX WARN: Multi-variable type inference failed */
        public C12033b(dq1<? super bth> dq1Var) {
            this.f77953a = dq1Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            dq1<bth> dq1Var = this.f77953a;
            v7e.C13927a c13927a = v7e.f90266b;
            dq1Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitClose(@p000.yfb p000.vdd<?> r4, @p000.yfb p000.ny6<p000.bth> r5, @p000.yfb p000.zy2<? super p000.bth> r6) {
        /*
            boolean r0 = r6 instanceof p000.rdd.C12032a
            if (r0 == 0) goto L13
            r0 = r6
            rdd$a r0 = (p000.rdd.C12032a) r0
            int r1 = r0.f77952d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f77952d = r1
            goto L18
        L13:
            rdd$a r0 = new rdd$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f77951c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77952d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f77950b
            r5 = r4
            ny6 r5 = (p000.ny6) r5
            java.lang.Object r4 = r0.f77949a
            vdd r4 = (p000.vdd) r4
            p000.y7e.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            p000.y7e.throwOnFailure(r6)
            e13 r6 = r0.getContext()
            jj8$b r2 = p000.jj8.f50715A
            e13$b r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.f77949a = r4     // Catch: java.lang.Throwable -> L32
            r0.f77950b = r5     // Catch: java.lang.Throwable -> L32
            r0.f77952d = r3     // Catch: java.lang.Throwable -> L32
            fq1 r6 = new fq1     // Catch: java.lang.Throwable -> L32
            zy2 r2 = p000.od8.intercepted(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.initCancellability()     // Catch: java.lang.Throwable -> L32
            rdd$b r2 = new rdd$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.invokeOnClose(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.getResult()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = p000.pd8.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            p000.jk3.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            bth r4 = p000.bth.f14751a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rdd.awaitClose(vdd, ny6, zy2):java.lang.Object");
    }

    public static /* synthetic */ Object awaitClose$default(vdd vddVar, ny6 ny6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ny6Var = new ny6() { // from class: qdd
                @Override // p000.ny6
                public final Object invoke() {
                    return bth.f14751a;
                }
            };
        }
        return awaitClose(vddVar, ny6Var, zy2Var);
    }

    @wg5
    @yfb
    public static final <E> hsd<E> produce(@yfb x13 x13Var, @yfb e13 e13Var, int i, @yfb @cg1 gz6<? super vdd<? super E>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return produce(x13Var, e13Var, i, gf1.f39657a, b23.f12441a, null, gz6Var);
    }

    public static /* synthetic */ hsd produce$default(x13 x13Var, e13 e13Var, int i, gz6 gz6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            e13Var = a05.f2a;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return produce(x13Var, e13Var, i, gz6Var);
    }

    @la8
    @yfb
    public static final <E> hsd<E> produce(@yfb x13 x13Var, @yfb e13 e13Var, int i, @yfb b23 b23Var, @gib qy6<? super Throwable, bth> qy6Var, @yfb @cg1 gz6<? super vdd<? super E>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return produce(x13Var, e13Var, i, gf1.f39657a, b23Var, qy6Var, gz6Var);
    }

    @yfb
    public static final <E> hsd<E> produce(@yfb x13 x13Var, @yfb e13 e13Var, int i, @yfb gf1 gf1Var, @yfb b23 b23Var, @gib qy6<? super Throwable, bth> qy6Var, @yfb @cg1 gz6<? super vdd<? super E>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        udd uddVar = new udd(j13.newCoroutineContext(x13Var, e13Var), nu1.Channel$default(i, gf1Var, null, 4, null));
        if (qy6Var != null) {
            uddVar.invokeOnCompletion(qy6Var);
        }
        uddVar.start(b23Var, uddVar, gz6Var);
        return uddVar;
    }

    public static /* synthetic */ hsd produce$default(x13 x13Var, e13 e13Var, int i, b23 b23Var, qy6 qy6Var, gz6 gz6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            e13Var = a05.f2a;
        }
        e13 e13Var2 = e13Var;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            b23Var = b23.f12441a;
        }
        b23 b23Var2 = b23Var;
        if ((i2 & 8) != 0) {
            qy6Var = null;
        }
        return produce(x13Var, e13Var2, i3, b23Var2, qy6Var, gz6Var);
    }

    public static /* synthetic */ hsd produce$default(x13 x13Var, e13 e13Var, int i, gf1 gf1Var, b23 b23Var, qy6 qy6Var, gz6 gz6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            e13Var = a05.f2a;
        }
        e13 e13Var2 = e13Var;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            gf1Var = gf1.f39657a;
        }
        gf1 gf1Var2 = gf1Var;
        if ((i2 & 8) != 0) {
            b23Var = b23.f12441a;
        }
        b23 b23Var2 = b23Var;
        if ((i2 & 16) != 0) {
            qy6Var = null;
        }
        return produce(x13Var, e13Var2, i3, gf1Var2, b23Var2, qy6Var, gz6Var);
    }
}
