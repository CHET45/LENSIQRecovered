package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class s13<T> extends zpa<T> {

    /* JADX INFO: renamed from: n */
    @gib
    public s61<T> f80363n;

    /* JADX INFO: renamed from: o */
    @gib
    public py4 f80364o;

    /* JADX INFO: renamed from: s13$a */
    public static final class C12394a extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ s13<T> f80365a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12394a(s13<T> s13Var) {
            super(0);
            this.f80365a = s13Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f80365a.f80363n = null;
        }
    }

    /* JADX INFO: renamed from: s13$b */
    @ck3(m4009c = "androidx.lifecycle.CoroutineLiveData", m4010f = "CoroutineLiveData.kt", m4011i = {0}, m4012l = {235}, m4013m = "clearSource$lifecycle_livedata_release", m4014n = {"this"}, m4015s = {"L$0"})
    public static final class C12395b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f80366a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f80367b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ s13<T> f80368c;

        /* JADX INFO: renamed from: d */
        public int f80369d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12395b(s13<T> s13Var, zy2<? super C12395b> zy2Var) {
            super(zy2Var);
            this.f80368c = s13Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f80367b = obj;
            this.f80369d |= Integer.MIN_VALUE;
            return this.f80368c.clearSource$lifecycle_livedata_release(this);
        }
    }

    /* JADX INFO: renamed from: s13$c */
    @ck3(m4009c = "androidx.lifecycle.CoroutineLiveData", m4010f = "CoroutineLiveData.kt", m4011i = {0, 0, 1}, m4012l = {nb2.f63862j, nb2.f63863k}, m4013m = "emitSource$lifecycle_livedata_release", m4014n = {"this", "source", "this"}, m4015s = {"L$0", "L$1", "L$0"})
    public static final class C12396c extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f80370a;

        /* JADX INFO: renamed from: b */
        public Object f80371b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f80372c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ s13<T> f80373d;

        /* JADX INFO: renamed from: e */
        public int f80374e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12396c(s13<T> s13Var, zy2<? super C12396c> zy2Var) {
            super(zy2Var);
            this.f80373d = s13Var;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f80372c = obj;
            this.f80374e |= Integer.MIN_VALUE;
            return this.f80373d.emitSource$lifecycle_livedata_release(null, this);
        }
    }

    public /* synthetic */ s13(e13 e13Var, long j, gz6 gz6Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? a05.f2a : e13Var, (i & 2) != 0 ? 5000L : j, gz6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object clearSource$lifecycle_livedata_release(@p000.yfb p000.zy2<? super p000.bth> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000.s13.C12395b
            if (r0 == 0) goto L13
            r0 = r5
            s13$b r0 = (p000.s13.C12395b) r0
            int r1 = r0.f80369d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80369d = r1
            goto L18
        L13:
            s13$b r0 = new s13$b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f80367b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f80369d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f80366a
            s13 r0 = (p000.s13) r0
            p000.y7e.throwOnFailure(r5)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            p000.y7e.throwOnFailure(r5)
            py4 r5 = r4.f80364o
            if (r5 == 0) goto L47
            r0.f80366a = r4
            r0.f80369d = r3
            java.lang.Object r5 = r5.disposeNow(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            r5 = 0
            r0.f80364o = r5
            bth r5 = p000.bth.f14751a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s13.clearSource$lifecycle_livedata_release(zy2):java.lang.Object");
    }

    @Override // p000.zpa, androidx.lifecycle.AbstractC1158q
    /* JADX INFO: renamed from: d */
    public void mo317d() {
        super.mo317d();
        s61<T> s61Var = this.f80363n;
        if (s61Var != null) {
            s61Var.maybeRun();
        }
    }

    @Override // p000.zpa, androidx.lifecycle.AbstractC1158q
    /* JADX INFO: renamed from: e */
    public void mo318e() {
        super.mo318e();
        s61<T> s61Var = this.f80363n;
        if (s61Var != null) {
            s61Var.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emitSource$lifecycle_livedata_release(@p000.yfb androidx.lifecycle.AbstractC1158q<T> r6, @p000.yfb p000.zy2<? super p000.yf4> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.s13.C12396c
            if (r0 == 0) goto L13
            r0 = r7
            s13$c r0 = (p000.s13.C12396c) r0
            int r1 = r0.f80374e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80374e = r1
            goto L18
        L13:
            s13$c r0 = new s13$c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f80372c
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f80374e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f80370a
            s13 r6 = (p000.s13) r6
            p000.y7e.throwOnFailure(r7)
            goto L66
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f80371b
            androidx.lifecycle.q r6 = (androidx.lifecycle.AbstractC1158q) r6
            java.lang.Object r2 = r0.f80370a
            s13 r2 = (p000.s13) r2
            p000.y7e.throwOnFailure(r7)
            r7 = r6
            r6 = r2
            goto L58
        L46:
            p000.y7e.throwOnFailure(r7)
            r0.f80370a = r5
            r0.f80371b = r6
            r0.f80374e = r4
            java.lang.Object r7 = r5.clearSource$lifecycle_livedata_release(r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r7 = r6
            r6 = r5
        L58:
            r0.f80370a = r6
            r2 = 0
            r0.f80371b = r2
            r0.f80374e = r3
            java.lang.Object r7 = p000.t13.addDisposableSource(r6, r7, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            py4 r7 = (p000.py4) r7
            r6.f80364o = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s13.emitSource$lifecycle_livedata_release(androidx.lifecycle.q, zy2):java.lang.Object");
    }

    public s13(@yfb e13 e13Var, long j, @yfb gz6<? super lb9<T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        md8.checkNotNullParameter(e13Var, "context");
        md8.checkNotNullParameter(gz6Var, "block");
        this.f80363n = new s61<>(this, gz6Var, j, y13.CoroutineScope(df4.getMain().getImmediate().plus(e13Var).plus(kfg.SupervisorJob((jj8) e13Var.get(jj8.f50715A)))), new C12394a(this));
    }
}
