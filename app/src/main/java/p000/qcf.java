package p000;

import p000.xu1;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nSimpleActor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleActor.kt\nandroidx/datastore/core/SimpleActor\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,127:1\n548#2,5:128\n*S KotlinDebug\n*F\n+ 1 SimpleActor.kt\nandroidx/datastore/core/SimpleActor\n*L\n104#1:128,5\n*E\n"})
public final class qcf<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final x13 f73977a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final gz6<T, zy2<? super bth>, Object> f73978b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final au1<T> f73979c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final vb0 f73980d;

    /* JADX INFO: renamed from: qcf$a */
    public static final class C11430a extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<Throwable, bth> f73981a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qcf<T> f73982b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<T, Throwable, bth> f73983c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11430a(qy6<? super Throwable, bth> qy6Var, qcf<T> qcfVar, gz6<? super T, ? super Throwable, bth> gz6Var) {
            super(1);
            this.f73981a = qy6Var;
            this.f73982b = qcfVar;
            this.f73983c = gz6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            bth bthVar;
            this.f73981a.invoke(th);
            this.f73982b.f73979c.close(th);
            do {
                Object objM33277getOrNullimpl = xu1.m33277getOrNullimpl(this.f73982b.f73979c.mo28704tryReceivePtdJZtk());
                if (objM33277getOrNullimpl != null) {
                    this.f73983c.invoke((T) objM33277getOrNullimpl, th);
                    bthVar = bth.f14751a;
                } else {
                    bthVar = null;
                }
            } while (bthVar != null);
        }
    }

    /* JADX INFO: renamed from: qcf$b */
    @ck3(m4009c = "androidx.datastore.core.SimpleActor$offer$2", m4010f = "SimpleActor.kt", m4011i = {}, m4012l = {121, 121}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11431b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f73984a;

        /* JADX INFO: renamed from: b */
        public int f73985b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qcf<T> f73986c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11431b(qcf<T> qcfVar, zy2<? super C11431b> zy2Var) {
            super(2, zy2Var);
            this.f73986c = qcfVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C11431b(this.f73986c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C11431b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r5.f73985b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p000.y7e.throwOnFailure(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f73984a
                gz6 r1 = (p000.gz6) r1
                p000.y7e.throwOnFailure(r6)
                goto L51
            L22:
                p000.y7e.throwOnFailure(r6)
                qcf<T> r6 = r5.f73986c
                vb0 r6 = p000.qcf.access$getRemainingMessages$p(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L6c
            L31:
                qcf<T> r6 = r5.f73986c
                x13 r6 = p000.qcf.access$getScope$p(r6)
                p000.y13.ensureActive(r6)
                qcf<T> r6 = r5.f73986c
                gz6 r1 = p000.qcf.access$getConsumeMessage$p(r6)
                qcf<T> r6 = r5.f73986c
                au1 r6 = p000.qcf.access$getMessageQueue$p(r6)
                r5.f73984a = r1
                r5.f73985b = r3
                java.lang.Object r6 = r6.receive(r5)
                if (r6 != r0) goto L51
                return r0
            L51:
                r4 = 0
                r5.f73984a = r4
                r5.f73985b = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5d
                return r0
            L5d:
                qcf<T> r6 = r5.f73986c
                vb0 r6 = p000.qcf.access$getRemainingMessages$p(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L31
                bth r6 = p000.bth.f14751a
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.qcf.C11431b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qcf(@yfb x13 x13Var, @yfb qy6<? super Throwable, bth> qy6Var, @yfb gz6<? super T, ? super Throwable, bth> gz6Var, @yfb gz6<? super T, ? super zy2<? super bth>, ? extends Object> gz6Var2) {
        md8.checkNotNullParameter(x13Var, "scope");
        md8.checkNotNullParameter(qy6Var, "onComplete");
        md8.checkNotNullParameter(gz6Var, "onUndeliveredElement");
        md8.checkNotNullParameter(gz6Var2, "consumeMessage");
        this.f73977a = x13Var;
        this.f73978b = gz6Var2;
        this.f73979c = nu1.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.f73980d = new vb0(0);
        jj8 jj8Var = (jj8) x13Var.getCoroutineContext().get(jj8.f50715A);
        if (jj8Var != null) {
            jj8Var.invokeOnCompletion(new C11430a(qy6Var, this, gz6Var));
        }
    }

    public final void offer(T t) throws Throwable {
        Object objMo28705trySendJP2dKIU = this.f73979c.mo28705trySendJP2dKIU(t);
        if (objMo28705trySendJP2dKIU instanceof xu1.C15300a) {
            Throwable thM33276exceptionOrNullimpl = xu1.m33276exceptionOrNullimpl(objMo28705trySendJP2dKIU);
            if (thM33276exceptionOrNullimpl != null) {
                throw thM33276exceptionOrNullimpl;
            }
            throw new c62("Channel was closed normally");
        }
        if (!xu1.m33282isSuccessimpl(objMo28705trySendJP2dKIU)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f73980d.getAndIncrement() == 0) {
            fg1.launch$default(this.f73977a, null, null, new C11431b(this, null), 3, null);
        }
    }
}
