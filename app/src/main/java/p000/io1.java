package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class io1<T> extends gu1<T> {

    /* JADX INFO: renamed from: e */
    @yfb
    public final gz6<vdd<? super T>, zy2<? super bth>, Object> f47764e;

    /* JADX INFO: renamed from: io1$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m4010f = "Builders.kt", m4011i = {0}, m4012l = {330}, m4013m = "collectTo", m4014n = {"scope"}, m4015s = {"L$0"})
    public static final class C7539a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f47765a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f47766b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ io1<T> f47767c;

        /* JADX INFO: renamed from: d */
        public int f47768d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7539a(io1<T> io1Var, zy2<? super C7539a> zy2Var) {
            super(zy2Var);
            this.f47767c = io1Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f47766b = obj;
            this.f47768d |= Integer.MIN_VALUE;
            return this.f47767c.mo8700c(null, this);
        }
    }

    public /* synthetic */ io1(gz6 gz6Var, e13 e13Var, int i, gf1 gf1Var, int i2, jt3 jt3Var) {
        this(gz6Var, (i2 & 2) != 0 ? a05.f2a : e13Var, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? gf1.f39657a : gf1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.gu1, p000.fu1
    @p000.gib
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo8700c(@p000.yfb p000.vdd<? super T> r5, @p000.yfb p000.zy2<? super p000.bth> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.io1.C7539a
            if (r0 == 0) goto L13
            r0 = r6
            io1$a r0 = (p000.io1.C7539a) r0
            int r1 = r0.f47768d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47768d = r1
            goto L18
        L13:
            io1$a r0 = new io1$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f47766b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f47768d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f47765a
            vdd r5 = (p000.vdd) r5
            p000.y7e.throwOnFailure(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p000.y7e.throwOnFailure(r6)
            r0.f47765a = r5
            r0.f47768d = r3
            java.lang.Object r6 = super.mo8700c(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.isClosedForSend()
            if (r5 == 0) goto L4c
            bth r5 = p000.bth.f14751a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.io1.mo8700c(vdd, zy2):java.lang.Object");
    }

    @Override // p000.gu1, p000.fu1
    @yfb
    /* JADX INFO: renamed from: d */
    public fu1<T> mo8701d(@yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        return new io1(this.f47764e, e13Var, i, gf1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public io1(@yfb gz6<? super vdd<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        super(gz6Var, e13Var, i, gf1Var);
        this.f47764e = gz6Var;
    }
}
