package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import p000.hsd;
import p000.nye;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,140:1\n105#2:141\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n83#1:141\n*E\n"})
public final class eb2 {

    /* JADX INFO: renamed from: eb2$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m4010f = "Combine.kt", m4011i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m4012l = {51, 73, 76}, m4013m = "invokeSuspend", m4014n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, m4015s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    public static final class C5227a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ ny6<T[]> f32438C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ kz6<t66<? super R>, T[], zy2<? super bth>, Object> f32439F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ t66<R> f32440H;

        /* JADX INFO: renamed from: a */
        public Object f32441a;

        /* JADX INFO: renamed from: b */
        public Object f32442b;

        /* JADX INFO: renamed from: c */
        public int f32443c;

        /* JADX INFO: renamed from: d */
        public int f32444d;

        /* JADX INFO: renamed from: e */
        public int f32445e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f32446f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ y56<T>[] f32447m;

        /* JADX INFO: renamed from: eb2$a$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m4010f = "Combine.kt", m4011i = {}, m4012l = {28}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f32448a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ y56<T>[] f32449b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f32450c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ AtomicInteger f32451d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ au1<q08<Object>> f32452e;

            /* JADX INFO: renamed from: eb2$a$a$a, reason: collision with other inner class name */
            public static final class C16434a<T> implements t66 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ au1<q08<Object>> f32453a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f32454b;

                /* JADX INFO: renamed from: eb2$a$a$a$a, reason: collision with other inner class name */
                @ck3(m4009c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", m4010f = "Combine.kt", m4011i = {}, m4012l = {29, 30}, m4013m = "emit", m4014n = {}, m4015s = {})
                public static final class C16435a extends cz2 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f32455a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C16434a<T> f32456b;

                    /* JADX INFO: renamed from: c */
                    public int f32457c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C16435a(C16434a<? super T> c16434a, zy2<? super C16435a> zy2Var) {
                        super(zy2Var);
                        this.f32456b = c16434a;
                    }

                    @Override // p000.tq0
                    public final Object invokeSuspend(Object obj) {
                        this.f32455a = obj;
                        this.f32457c |= Integer.MIN_VALUE;
                        return this.f32456b.emit(null, this);
                    }
                }

                public C16434a(au1<q08<Object>> au1Var, int i) {
                    this.f32453a = au1Var;
                    this.f32454b = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p000.t66
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r7, p000.zy2<? super p000.bth> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof p000.eb2.C5227a.a.C16434a.C16435a
                        if (r0 == 0) goto L13
                        r0 = r8
                        eb2$a$a$a$a r0 = (p000.eb2.C5227a.a.C16434a.C16435a) r0
                        int r1 = r0.f32457c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f32457c = r1
                        goto L18
                    L13:
                        eb2$a$a$a$a r0 = new eb2$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f32455a
                        java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f32457c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        p000.y7e.throwOnFailure(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        p000.y7e.throwOnFailure(r8)
                        goto L4d
                    L38:
                        p000.y7e.throwOnFailure(r8)
                        au1<q08<java.lang.Object>> r8 = r6.f32453a
                        q08 r2 = new q08
                        int r5 = r6.f32454b
                        r2.<init>(r5, r7)
                        r0.f32457c = r4
                        java.lang.Object r7 = r8.send(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f32457c = r3
                        java.lang.Object r7 = p000.lti.yield(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        bth r7 = p000.bth.f14751a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.eb2.C5227a.a.C16434a.emit(java.lang.Object, zy2):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(y56<? extends T>[] y56VarArr, int i, AtomicInteger atomicInteger, au1<q08<Object>> au1Var, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f32449b = y56VarArr;
                this.f32450c = i;
                this.f32451d = atomicInteger;
                this.f32452e = au1Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return new a(this.f32449b, this.f32450c, this.f32451d, this.f32452e, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f32448a;
                try {
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        y56[] y56VarArr = this.f32449b;
                        int i2 = this.f32450c;
                        y56 y56Var = y56VarArr[i2];
                        C16434a c16434a = new C16434a(this.f32452e, i2);
                        this.f32448a = 1;
                        if (y56Var.collect(c16434a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        nye.C10119a.close$default(this.f32452e, null, 1, null);
                    }
                    return bth.f14751a;
                } finally {
                    if (this.f32451d.decrementAndGet() == 0) {
                        nye.C10119a.close$default(this.f32452e, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5227a(y56<? extends T>[] y56VarArr, ny6<T[]> ny6Var, kz6<? super t66<? super R>, ? super T[], ? super zy2<? super bth>, ? extends Object> kz6Var, t66<? super R> t66Var, zy2<? super C5227a> zy2Var) {
            super(2, zy2Var);
            this.f32447m = y56VarArr;
            this.f32438C = ny6Var;
            this.f32439F = kz6Var;
            this.f32440H = t66Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C5227a c5227a = new C5227a(this.f32447m, this.f32438C, this.f32439F, this.f32440H, zy2Var);
            c5227a.f32446f = obj;
            return c5227a;
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C5227a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[LOOP:0: B:28:0x00ca->B:48:?, LOOP_START, PHI: r6 r10
  0x00ca: PHI (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:25:0x00c5, B:48:?] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r10v8 q08) = (r10v7 q08), (r10v21 q08) binds: [B:25:0x00c5, B:48:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0135 -> B:45:0x0137). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.eb2.C5227a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: eb2$b */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n1#1,108:1\n84#2:109\n139#2:110\n*E\n"})
    public static final class C5228b<R> implements y56<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f32458a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ y56 f32459b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ kz6 f32460c;

        public C5228b(y56 y56Var, y56 y56Var2, kz6 kz6Var) {
            this.f32458a = y56Var;
            this.f32459b = y56Var2;
            this.f32460c = kz6Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            Object objCoroutineScope = y13.coroutineScope(new C5229c(this.f32458a, this.f32459b, t66Var, this.f32460c, null), zy2Var);
            return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: eb2$c */
    @ck3(m4009c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", m4010f = "Combine.kt", m4011i = {0, 0}, m4012l = {123}, m4013m = "invokeSuspend", m4014n = {"second", "collectJob"}, m4015s = {"L$0", "L$1"})
    public static final class C5229c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f32461a;

        /* JADX INFO: renamed from: b */
        public int f32462b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f32463c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ y56<T2> f32464d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ y56<T1> f32465e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ t66<R> f32466f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ kz6<T1, T2, zy2<? super R>, Object> f32467m;

        /* JADX INFO: renamed from: eb2$c$a */
        public static final class a implements qy6<Throwable, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jg2 f32468a;

            public a(jg2 jg2Var) {
                this.f32468a = jg2Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
                invoke2(th);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (this.f32468a.isActive()) {
                    this.f32468a.cancel((CancellationException) new C8562l(this.f32468a));
                }
            }
        }

        /* JADX INFO: renamed from: eb2$c$b */
        @ck3(m4009c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", m4010f = "Combine.kt", m4011i = {}, m4012l = {124}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<bth, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: C */
            public final /* synthetic */ jg2 f32469C;

            /* JADX INFO: renamed from: a */
            public int f32470a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ y56<T1> f32471b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ e13 f32472c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Object f32473d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ hsd<Object> f32474e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ t66<R> f32475f;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ kz6<T1, T2, zy2<? super R>, Object> f32476m;

            /* JADX INFO: renamed from: eb2$c$b$a */
            public static final class a<T> implements t66 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ e13 f32477a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f32478b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ hsd<Object> f32479c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ t66<R> f32480d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ kz6<T1, T2, zy2<? super R>, Object> f32481e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ jg2 f32482f;

                /* JADX INFO: renamed from: eb2$c$b$a$a, reason: collision with other inner class name */
                @ck3(m4009c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", m4010f = "Combine.kt", m4011i = {}, m4012l = {126, 129, 129}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
                @dwf({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,140:1\n516#2:141\n14#3:142\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n*L\n126#1:141\n129#1:142\n*E\n"})
                public static final class C16436a extends ugg implements gz6<bth, zy2<? super bth>, Object> {

                    /* JADX INFO: renamed from: a */
                    public Object f32483a;

                    /* JADX INFO: renamed from: b */
                    public int f32484b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ hsd<Object> f32485c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ t66<R> f32486d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ kz6<T1, T2, zy2<? super R>, Object> f32487e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ T1 f32488f;

                    /* JADX INFO: renamed from: m */
                    public final /* synthetic */ jg2 f32489m;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C16436a(hsd<? extends Object> hsdVar, t66<? super R> t66Var, kz6<? super T1, ? super T2, ? super zy2<? super R>, ? extends Object> kz6Var, T1 t1, jg2 jg2Var, zy2<? super C16436a> zy2Var) {
                        super(2, zy2Var);
                        this.f32485c = hsdVar;
                        this.f32486d = t66Var;
                        this.f32487e = kz6Var;
                        this.f32488f = t1;
                        this.f32489m = jg2Var;
                    }

                    @Override // p000.tq0
                    public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                        return new C16436a(this.f32485c, this.f32486d, this.f32487e, this.f32488f, this.f32489m, zy2Var);
                    }

                    @Override // p000.gz6
                    public final Object invoke(bth bthVar, zy2<? super bth> zy2Var) {
                        return ((C16436a) create(bthVar, zy2Var)).invokeSuspend(bth.f14751a);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[RETURN] */
                    /* JADX WARN: Type inference failed for: r1v3, types: [t66] */
                    /* JADX WARN: Type inference failed for: r1v6 */
                    /* JADX WARN: Type inference failed for: r1v7 */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // p000.tq0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                        /*
                            r8 = this;
                            java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                            int r1 = r8.f32484b
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L30
                            if (r1 == r5) goto L26
                            if (r1 == r4) goto L1e
                            if (r1 != r3) goto L16
                            p000.y7e.throwOnFailure(r9)
                            goto L71
                        L16:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L1e:
                            java.lang.Object r1 = r8.f32483a
                            t66 r1 = (p000.t66) r1
                            p000.y7e.throwOnFailure(r9)
                            goto L66
                        L26:
                            p000.y7e.throwOnFailure(r9)
                            xu1 r9 = (p000.xu1) r9
                            java.lang.Object r9 = r9.m33284unboximpl()
                            goto L3e
                        L30:
                            p000.y7e.throwOnFailure(r9)
                            hsd<java.lang.Object> r9 = r8.f32485c
                            r8.f32484b = r5
                            java.lang.Object r9 = r9.mo28703receiveCatchingJP2dKIU(r8)
                            if (r9 != r0) goto L3e
                            return r0
                        L3e:
                            jg2 r1 = r8.f32489m
                            boolean r5 = r9 instanceof p000.xu1.C15302c
                            if (r5 == 0) goto L50
                            java.lang.Throwable r9 = p000.xu1.m33276exceptionOrNullimpl(r9)
                            if (r9 != 0) goto L4f
                            l r9 = new l
                            r9.<init>(r1)
                        L4f:
                            throw r9
                        L50:
                            t66<R> r1 = r8.f32486d
                            kz6<T1, T2, zy2<? super R>, java.lang.Object> r5 = r8.f32487e
                            T1 r6 = r8.f32488f
                            qhg r7 = p000.zhb.f105096a
                            if (r9 != r7) goto L5b
                            r9 = r2
                        L5b:
                            r8.f32483a = r1
                            r8.f32484b = r4
                            java.lang.Object r9 = r5.invoke(r6, r9, r8)
                            if (r9 != r0) goto L66
                            return r0
                        L66:
                            r8.f32483a = r2
                            r8.f32484b = r3
                            java.lang.Object r9 = r1.emit(r9, r8)
                            if (r9 != r0) goto L71
                            return r0
                        L71:
                            bth r9 = p000.bth.f14751a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p000.eb2.C5229c.b.a.C16436a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: renamed from: eb2$c$b$a$b, reason: collision with other inner class name */
                @ck3(m4009c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", m4010f = "Combine.kt", m4011i = {}, m4012l = {125}, m4013m = "emit", m4014n = {}, m4015s = {})
                public static final class C16437b extends cz2 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f32490a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ a<T> f32491b;

                    /* JADX INFO: renamed from: c */
                    public int f32492c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C16437b(a<? super T> aVar, zy2<? super C16437b> zy2Var) {
                        super(zy2Var);
                        this.f32491b = aVar;
                    }

                    @Override // p000.tq0
                    public final Object invokeSuspend(Object obj) {
                        this.f32490a = obj;
                        this.f32492c |= Integer.MIN_VALUE;
                        return this.f32491b.emit(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a(e13 e13Var, Object obj, hsd<? extends Object> hsdVar, t66<? super R> t66Var, kz6<? super T1, ? super T2, ? super zy2<? super R>, ? extends Object> kz6Var, jg2 jg2Var) {
                    this.f32477a = e13Var;
                    this.f32478b = obj;
                    this.f32479c = hsdVar;
                    this.f32480d = t66Var;
                    this.f32481e = kz6Var;
                    this.f32482f = jg2Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p000.t66
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T1 r14, p000.zy2<? super p000.bth> r15) {
                    /*
                        r13 = this;
                        boolean r0 = r15 instanceof p000.eb2.C5229c.b.a.C16437b
                        if (r0 == 0) goto L13
                        r0 = r15
                        eb2$c$b$a$b r0 = (p000.eb2.C5229c.b.a.C16437b) r0
                        int r1 = r0.f32492c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f32492c = r1
                        goto L18
                    L13:
                        eb2$c$b$a$b r0 = new eb2$c$b$a$b
                        r0.<init>(r13, r15)
                    L18:
                        java.lang.Object r15 = r0.f32490a
                        java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f32492c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        p000.y7e.throwOnFailure(r15)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                        java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                        r14.<init>(r15)
                        throw r14
                    L31:
                        p000.y7e.throwOnFailure(r15)
                        e13 r15 = r13.f32477a
                        bth r2 = p000.bth.f14751a
                        java.lang.Object r4 = r13.f32478b
                        eb2$c$b$a$a r12 = new eb2$c$b$a$a
                        hsd<java.lang.Object> r6 = r13.f32479c
                        t66<R> r7 = r13.f32480d
                        kz6<T1, T2, zy2<? super R>, java.lang.Object> r8 = r13.f32481e
                        jg2 r10 = r13.f32482f
                        r11 = 0
                        r5 = r12
                        r9 = r14
                        r5.<init>(r6, r7, r8, r9, r10, r11)
                        r0.f32492c = r3
                        java.lang.Object r14 = p000.hu1.withContextUndispatched(r15, r2, r4, r12, r0)
                        if (r14 != r1) goto L53
                        return r1
                    L53:
                        bth r14 = p000.bth.f14751a
                        return r14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.eb2.C5229c.b.a.emit(java.lang.Object, zy2):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(y56<? extends T1> y56Var, e13 e13Var, Object obj, hsd<? extends Object> hsdVar, t66<? super R> t66Var, kz6<? super T1, ? super T2, ? super zy2<? super R>, ? extends Object> kz6Var, jg2 jg2Var, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f32471b = y56Var;
                this.f32472c = e13Var;
                this.f32473d = obj;
                this.f32474e = hsdVar;
                this.f32475f = t66Var;
                this.f32476m = kz6Var;
                this.f32469C = jg2Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return new b(this.f32471b, this.f32472c, this.f32473d, this.f32474e, this.f32475f, this.f32476m, this.f32469C, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(bth bthVar, zy2<? super bth> zy2Var) {
                return ((b) create(bthVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to eb2$c$b for r10v1 'this'  zy2
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // p000.tq0
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r1 = r10.f32470a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p000.y7e.throwOnFailure(r11)
                    goto L37
                Lf:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L17:
                    p000.y7e.throwOnFailure(r11)
                    y56<T1> r11 = r10.f32471b
                    eb2$c$b$a r1 = new eb2$c$b$a
                    e13 r4 = r10.f32472c
                    java.lang.Object r5 = r10.f32473d
                    hsd<java.lang.Object> r6 = r10.f32474e
                    t66<R> r7 = r10.f32475f
                    kz6<T1, T2, zy2<? super R>, java.lang.Object> r8 = r10.f32476m
                    jg2 r9 = r10.f32469C
                    r3 = r1
                    r3.<init>(r4, r5, r6, r7, r8, r9)
                    r10.f32470a = r2
                    java.lang.Object r11 = r11.collect(r1, r10)
                    if (r11 != r0) goto L37
                    return r0
                L37:
                    bth r11 = p000.bth.f14751a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.eb2.C5229c.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: eb2$c$c */
        @ck3(m4009c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", m4010f = "Combine.kt", m4011i = {}, m4012l = {86}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class c extends ugg implements gz6<vdd<? super Object>, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f32493a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f32494b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ y56<T2> f32495c;

            /* JADX INFO: renamed from: eb2$c$c$a */
            public static final class a<T> implements t66 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ vdd<Object> f32496a;

                /* JADX INFO: renamed from: eb2$c$c$a$a, reason: collision with other inner class name */
                @ck3(m4009c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", m4010f = "Combine.kt", m4011i = {}, m4012l = {87}, m4013m = "emit", m4014n = {}, m4015s = {})
                public static final class C16438a extends cz2 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f32497a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ a<T> f32498b;

                    /* JADX INFO: renamed from: c */
                    public int f32499c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C16438a(a<? super T> aVar, zy2<? super C16438a> zy2Var) {
                        super(zy2Var);
                        this.f32498b = aVar;
                    }

                    @Override // p000.tq0
                    public final Object invokeSuspend(Object obj) {
                        this.f32497a = obj;
                        this.f32499c |= Integer.MIN_VALUE;
                        return this.f32498b.emit(null, this);
                    }
                }

                public a(vdd<Object> vddVar) {
                    this.f32496a = vddVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p000.t66
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T2 r5, p000.zy2<? super p000.bth> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof p000.eb2.C5229c.c.a.C16438a
                        if (r0 == 0) goto L13
                        r0 = r6
                        eb2$c$c$a$a r0 = (p000.eb2.C5229c.c.a.C16438a) r0
                        int r1 = r0.f32499c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f32499c = r1
                        goto L18
                    L13:
                        eb2$c$c$a$a r0 = new eb2$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f32497a
                        java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f32499c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        p000.y7e.throwOnFailure(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        p000.y7e.throwOnFailure(r6)
                        vdd<java.lang.Object> r6 = r4.f32496a
                        nye r6 = r6.getChannel()
                        if (r5 != 0) goto L3e
                        qhg r5 = p000.zhb.f105096a
                    L3e:
                        r0.f32499c = r3
                        java.lang.Object r5 = r6.send(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        bth r5 = p000.bth.f14751a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.eb2.C5229c.c.a.emit(java.lang.Object, zy2):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(y56<? extends T2> y56Var, zy2<? super c> zy2Var) {
                super(2, zy2Var);
                this.f32495c = y56Var;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                c cVar = new c(this.f32495c, zy2Var);
                cVar.f32494b = obj;
                return cVar;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vdd<Object> vddVar, zy2<? super bth> zy2Var) {
                return ((c) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to eb2$c$c for r4v1 'this'  zy2
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // p000.tq0
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r1 = r4.f32493a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p000.y7e.throwOnFailure(r5)
                    goto L2e
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    p000.y7e.throwOnFailure(r5)
                    java.lang.Object r5 = r4.f32494b
                    vdd r5 = (p000.vdd) r5
                    y56<T2> r1 = r4.f32495c
                    eb2$c$c$a r3 = new eb2$c$c$a
                    r3.<init>(r5)
                    r4.f32493a = r2
                    java.lang.Object r5 = r1.collect(r3, r4)
                    if (r5 != r0) goto L2e
                    return r0
                L2e:
                    bth r5 = p000.bth.f14751a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.eb2.C5229c.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ Object invoke(vdd<? super Object> vddVar, zy2<? super bth> zy2Var) {
                return invoke2((vdd<Object>) vddVar, zy2Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5229c(y56<? extends T2> y56Var, y56<? extends T1> y56Var2, t66<? super R> t66Var, kz6<? super T1, ? super T2, ? super zy2<? super R>, ? extends Object> kz6Var, zy2<? super C5229c> zy2Var) {
            super(2, zy2Var);
            this.f32464d = y56Var;
            this.f32465e = y56Var2;
            this.f32466f = t66Var;
            this.f32467m = kz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C5229c c5229c = new C5229c(this.f32464d, this.f32465e, this.f32466f, this.f32467m, zy2Var);
            c5229c.f32463c = obj;
            return c5229c;
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C5229c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) throws Throwable {
            hsd hsdVar;
            jg2 jg2Var;
            hsd hsdVar2;
            jg2 jg2Var2;
            e13 e13VarPlus;
            bth bthVar;
            b bVar;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f32462b;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x13 x13Var = (x13) this.f32463c;
                hsd hsdVarProduce$default = rdd.produce$default(x13Var, null, 0, new c(this.f32464d, null), 3, null);
                jg2 jg2VarJob$default = qj8.Job$default((jj8) null, 1, (Object) null);
                md8.checkNotNull(hsdVarProduce$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
                ((nye) hsdVarProduce$default).invokeOnClose(new a(jg2VarJob$default));
                try {
                    e13 coroutineContext = x13Var.getCoroutineContext();
                    Object objThreadContextElements = sxg.threadContextElements(coroutineContext);
                    e13VarPlus = x13Var.getCoroutineContext().plus(jg2VarJob$default);
                    bthVar = bth.f14751a;
                    bVar = new b(this.f32465e, coroutineContext, objThreadContextElements, hsdVarProduce$default, this.f32466f, this.f32467m, jg2VarJob$default, null);
                    this.f32463c = hsdVarProduce$default;
                    this.f32461a = jg2VarJob$default;
                    this.f32462b = 1;
                    jg2Var = jg2VarJob$default;
                    hsdVar = hsdVarProduce$default;
                } catch (C8562l e) {
                    e = e;
                    jg2Var = jg2VarJob$default;
                    hsdVar = hsdVarProduce$default;
                } catch (Throwable th) {
                    th = th;
                    hsdVar = hsdVarProduce$default;
                }
                try {
                    if (hu1.withContextUndispatched$default(e13VarPlus, bthVar, null, bVar, this, 4, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    hsdVar2 = hsdVar;
                } catch (C8562l e2) {
                    e = e2;
                    hsdVar2 = hsdVar;
                    jg2Var2 = jg2Var;
                    a76.checkOwnership(e, jg2Var2);
                } catch (Throwable th2) {
                    th = th2;
                    hsdVar2 = hsdVar;
                    hsd.C6996a.cancel$default(hsdVar2, (CancellationException) null, 1, (Object) null);
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jg2Var2 = (jg2) this.f32461a;
                hsdVar2 = (hsd) this.f32463c;
                try {
                    try {
                        y7e.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        hsd.C6996a.cancel$default(hsdVar2, (CancellationException) null, 1, (Object) null);
                        throw th;
                    }
                } catch (C8562l e3) {
                    e = e3;
                    a76.checkOwnership(e, jg2Var2);
                }
            }
            hsd.C6996a.cancel$default(hsdVar2, (CancellationException) null, 1, (Object) null);
            return bth.f14751a;
        }
    }

    @gib
    @yjd
    public static final <R, T> Object combineInternal(@yfb t66<? super R> t66Var, @yfb y56<? extends T>[] y56VarArr, @yfb ny6<T[]> ny6Var, @yfb kz6<? super t66<? super R>, ? super T[], ? super zy2<? super bth>, ? extends Object> kz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objFlowScope = z66.flowScope(new C5227a(y56VarArr, ny6Var, kz6Var, t66Var, null), zy2Var);
        return objFlowScope == pd8.getCOROUTINE_SUSPENDED() ? objFlowScope : bth.f14751a;
    }

    @yfb
    public static final <T1, T2, R> y56<R> zipImpl(@yfb y56<? extends T1> y56Var, @yfb y56<? extends T2> y56Var2, @yfb kz6<? super T1, ? super T2, ? super zy2<? super R>, ? extends Object> kz6Var) {
        return new C5228b(y56Var2, y56Var, kz6Var);
    }
}
