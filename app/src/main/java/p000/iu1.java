package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class iu1<T> extends fu1<T> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final y56<y56<T>> f48281d;

    /* JADX INFO: renamed from: e */
    public final int f48282e;

    public /* synthetic */ iu1(y56 y56Var, int i, e13 e13Var, int i2, gf1 gf1Var, int i3, jt3 jt3Var) {
        this(y56Var, i, (i3 & 4) != 0 ? a05.f2a : e13Var, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? gf1.f39657a : gf1Var);
    }

    @Override // p000.fu1
    @yfb
    /* JADX INFO: renamed from: a */
    public String mo8699a() {
        return "concurrency=" + this.f48282e;
    }

    @Override // p000.fu1
    @gib
    /* JADX INFO: renamed from: c */
    public Object mo8700c(@yfb vdd<? super T> vddVar, @yfb zy2<? super bth> zy2Var) {
        Object objCollect = this.f48281d.collect(new C7617a((jj8) zy2Var.getContext().get(jj8.f50715A), lye.Semaphore$default(this.f48282e, 0, 2, null), vddVar, new tye(vddVar)), zy2Var);
        return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
    }

    @Override // p000.fu1
    @yfb
    /* JADX INFO: renamed from: d */
    public fu1<T> mo8701d(@yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        return new iu1(this.f48281d, this.f48282e, e13Var, i, gf1Var);
    }

    @Override // p000.fu1
    @yfb
    public hsd<T> produceImpl(@yfb x13 x13Var) {
        return rdd.produce(x13Var, this.f37754a, this.f37755b, getCollectToFun$kotlinx_coroutines_core());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iu1(@yfb y56<? extends y56<? extends T>> y56Var, int i, @yfb e13 e13Var, int i2, @yfb gf1 gf1Var) {
        super(e13Var, i2, gf1Var);
        this.f48281d = y56Var;
        this.f48282e = i;
    }

    /* JADX INFO: renamed from: iu1$a */
    public static final class C7617a<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jj8 f48283a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ hye f48284b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vdd<T> f48285c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ tye<T> f48286d;

        /* JADX INFO: renamed from: iu1$a$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", m4010f = "Merge.kt", m4011i = {}, m4012l = {65}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f48287a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ y56<T> f48288b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ tye<T> f48289c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ hye f48290d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(y56<? extends T> y56Var, tye<T> tyeVar, hye hyeVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f48288b = y56Var;
                this.f48289c = tyeVar;
                this.f48290d = hyeVar;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return new a(this.f48288b, this.f48289c, this.f48290d, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f48287a;
                try {
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        y56<T> y56Var = this.f48288b;
                        tye<T> tyeVar = this.f48289c;
                        this.f48287a = 1;
                        if (y56Var.collect(tyeVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                    }
                    this.f48290d.release();
                    return bth.f14751a;
                } catch (Throwable th) {
                    this.f48290d.release();
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: iu1$a$b */
        @ck3(m4009c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", m4010f = "Merge.kt", m4011i = {0, 0}, m4012l = {62}, m4013m = "emit", m4014n = {"this", "inner"}, m4015s = {"L$0", "L$1"})
        public static final class b extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f48291a;

            /* JADX INFO: renamed from: b */
            public Object f48292b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f48293c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C7617a<T> f48294d;

            /* JADX INFO: renamed from: e */
            public int f48295e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(C7617a<? super T> c7617a, zy2<? super b> zy2Var) {
                super(zy2Var);
                this.f48294d = c7617a;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f48293c = obj;
                this.f48295e |= Integer.MIN_VALUE;
                return this.f48294d.emit((y56) null, (zy2<? super bth>) this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C7617a(jj8 jj8Var, hye hyeVar, vdd<? super T> vddVar, tye<T> tyeVar) {
            this.f48283a = jj8Var;
            this.f48284b = hyeVar;
            this.f48285c = vddVar;
            this.f48286d = tyeVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(p000.y56<? extends T> r8, p000.zy2<? super p000.bth> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p000.iu1.C7617a.b
                if (r0 == 0) goto L13
                r0 = r9
                iu1$a$b r0 = (p000.iu1.C7617a.b) r0
                int r1 = r0.f48295e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f48295e = r1
                goto L18
            L13:
                iu1$a$b r0 = new iu1$a$b
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f48293c
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f48295e
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.f48292b
                y56 r8 = (p000.y56) r8
                java.lang.Object r0 = r0.f48291a
                iu1$a r0 = (p000.iu1.C7617a) r0
                p000.y7e.throwOnFailure(r9)
                goto L53
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                p000.y7e.throwOnFailure(r9)
                jj8 r9 = r7.f48283a
                if (r9 == 0) goto L43
                p000.oj8.ensureActive(r9)
            L43:
                hye r9 = r7.f48284b
                r0.f48291a = r7
                r0.f48292b = r8
                r0.f48295e = r3
                java.lang.Object r9 = r9.acquire(r0)
                if (r9 != r1) goto L52
                return r1
            L52:
                r0 = r7
            L53:
                vdd<T> r1 = r0.f48285c
                iu1$a$a r4 = new iu1$a$a
                tye<T> r9 = r0.f48286d
                hye r0 = r0.f48284b
                r2 = 0
                r4.<init>(r8, r9, r0, r2)
                r5 = 3
                r6 = 0
                r3 = 0
                p000.dg1.launch$default(r1, r2, r3, r4, r5, r6)
                bth r8 = p000.bth.f14751a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.iu1.C7617a.emit(y56, zy2):java.lang.Object");
        }

        @Override // p000.t66
        public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
            return emit((y56) obj, (zy2<? super bth>) zy2Var);
        }
    }
}
