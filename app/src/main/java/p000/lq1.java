package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lq1<T> implements kq1<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final y56<T> f58451a;

    /* JADX INFO: renamed from: lq1$a */
    @dwf({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,281:1\n326#2:282\n*S KotlinDebug\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n*L\n270#1:282\n*E\n"})
    public static final class C8937a<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ t66<T> f58452a;

        /* JADX INFO: renamed from: lq1$a$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", m4010f = "Context.kt", m4011i = {}, m4012l = {271}, m4013m = "emit", m4014n = {}, m4015s = {})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f58453a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C8937a<T> f58454b;

            /* JADX INFO: renamed from: c */
            public int f58455c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C8937a<? super T> c8937a, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f58454b = c8937a;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f58453a = obj;
                this.f58455c |= Integer.MIN_VALUE;
                return this.f58454b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C8937a(t66<? super T> t66Var) {
            this.f58452a = t66Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, p000.zy2<? super p000.bth> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof p000.lq1.C8937a.a
                if (r0 == 0) goto L13
                r0 = r6
                lq1$a$a r0 = (p000.lq1.C8937a.a) r0
                int r1 = r0.f58455c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f58455c = r1
                goto L18
            L13:
                lq1$a$a r0 = new lq1$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f58453a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f58455c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                p000.y7e.throwOnFailure(r6)
                goto L46
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                p000.y7e.throwOnFailure(r6)
                e13 r6 = r0.getContext()
                p000.oj8.ensureActive(r6)
                t66<T> r6 = r4.f58452a
                r0.f58455c = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                bth r5 = p000.bth.f14751a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.lq1.C8937a.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lq1(@yfb y56<? extends T> y56Var) {
        this.f58451a = y56Var;
    }

    @Override // p000.y56
    @gib
    public Object collect(@yfb t66<? super T> t66Var, @yfb zy2<? super bth> zy2Var) {
        Object objCollect = this.f58451a.collect(new C8937a(t66Var), zy2Var);
        return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
    }
}
