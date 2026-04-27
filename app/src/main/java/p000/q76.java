package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n105#2:221\n105#2:223\n1#3:222\n159#4:224\n*S KotlinDebug\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n54#1:221\n128#1:223\n217#1:224\n*E\n"})
public final /* synthetic */ class q76 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: q76$a */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,108:1\n55#2,3:109\n*E\n"})
    public static final class C11330a<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f73378a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6 f73379b;

        /* JADX INFO: renamed from: q76$a$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", m4010f = "Errors.kt", m4011i = {0, 0}, m4012l = {109, 110}, m4013m = "collect", m4014n = {"this", "$this$catch_u24lambda_u240"}, m4015s = {"L$0", "L$1"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f73380a;

            /* JADX INFO: renamed from: b */
            public int f73381b;

            /* JADX INFO: renamed from: d */
            public Object f73383d;

            /* JADX INFO: renamed from: e */
            public Object f73384e;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f73380a = obj;
                this.f73381b |= Integer.MIN_VALUE;
                return C11330a.this.collect(null, this);
            }
        }

        public C11330a(y56 y56Var, kz6 kz6Var) {
            this.f73378a = y56Var;
            this.f73379b = kz6Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super T> r6, p000.zy2<? super p000.bth> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p000.q76.C11330a.a
                if (r0 == 0) goto L13
                r0 = r7
                q76$a$a r0 = (p000.q76.C11330a.a) r0
                int r1 = r0.f73381b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73381b = r1
                goto L18
            L13:
                q76$a$a r0 = new q76$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f73380a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f73381b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                p000.y7e.throwOnFailure(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f73384e
                t66 r6 = (p000.t66) r6
                java.lang.Object r2 = r0.f73383d
                q76$a r2 = (p000.q76.C11330a) r2
                p000.y7e.throwOnFailure(r7)
                goto L53
            L40:
                p000.y7e.throwOnFailure(r7)
                y56 r7 = r5.f73378a
                r0.f73383d = r5
                r0.f73384e = r6
                r0.f73381b = r4
                java.lang.Object r7 = p000.c76.catchImpl(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                kz6 r2 = r2.f73379b
                r4 = 0
                r0.f73383d = r4
                r0.f73384e = r4
                r0.f73381b = r3
                r3 = 6
                p000.o28.mark(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                p000.o28.mark(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.q76.C11330a.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: q76$b */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m4010f = "Errors.kt", m4011i = {0}, m4012l = {152}, m4013m = "catchImpl", m4014n = {"fromDownstream"}, m4015s = {"L$0"})
    public static final class C11331b<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f73385a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f73386b;

        /* JADX INFO: renamed from: c */
        public int f73387c;

        public C11331b(zy2<? super C11331b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f73386b = obj;
            this.f73387c |= Integer.MIN_VALUE;
            return c76.catchImpl(null, null, this);
        }
    }

    /* JADX INFO: renamed from: q76$c */
    public static final class C11332c<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ t66<T> f73388a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8121h<Throwable> f73389b;

        /* JADX INFO: renamed from: q76$c$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m4010f = "Errors.kt", m4011i = {0}, m4012l = {154}, m4013m = "emit", m4014n = {"this"}, m4015s = {"L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f73390a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f73391b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C11332c<T> f73392c;

            /* JADX INFO: renamed from: d */
            public int f73393d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C11332c<? super T> c11332c, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f73392c = c11332c;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f73391b = obj;
                this.f73393d |= Integer.MIN_VALUE;
                return this.f73392c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C11332c(t66<? super T> t66Var, jvd.C8121h<Throwable> c8121h) {
            this.f73388a = t66Var;
            this.f73389b = c8121h;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, p000.zy2<? super p000.bth> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof p000.q76.C11332c.a
                if (r0 == 0) goto L13
                r0 = r6
                q76$c$a r0 = (p000.q76.C11332c.a) r0
                int r1 = r0.f73393d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73393d = r1
                goto L18
            L13:
                q76$c$a r0 = new q76$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f73391b
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f73393d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f73390a
                q76$c r5 = (p000.q76.C11332c) r5
                p000.y7e.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                p000.y7e.throwOnFailure(r6)
                t66<T> r6 = r4.f73388a     // Catch: java.lang.Throwable -> L4a
                r0.f73390a = r4     // Catch: java.lang.Throwable -> L4a
                r0.f73393d = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                bth r5 = p000.bth.f14751a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                jvd$h<java.lang.Throwable> r5 = r5.f73389b
                r5.f52110a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.q76.C11332c.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: q76$d */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", m4010f = "Errors.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11333d extends ugg implements gz6<Throwable, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f73394a;

        public C11333d(zy2<? super C11333d> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C11333d(zy2Var);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f73394a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return wc1.boxBoolean(true);
        }

        @Override // p000.gz6
        public final Object invoke(Throwable th, zy2<? super Boolean> zy2Var) {
            return ((C11333d) create(th, zy2Var)).invokeSuspend(bth.f14751a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: q76$e */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", m4010f = "Errors.kt", m4011i = {}, m4012l = {91}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11334e<T> extends ugg implements oz6<t66<? super T>, Throwable, Long, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f73395a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f73396b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ long f73397c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f73398d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gz6<Throwable, zy2<? super Boolean>, Object> f73399e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11334e(long j, gz6<? super Throwable, ? super zy2<? super Boolean>, ? extends Object> gz6Var, zy2<? super C11334e> zy2Var) {
            super(4, zy2Var);
            this.f73398d = j;
            this.f73399e = gz6Var;
        }

        public final Object invoke(t66<? super T> t66Var, Throwable th, long j, zy2<? super Boolean> zy2Var) {
            C11334e c11334e = new C11334e(this.f73398d, this.f73399e, zy2Var);
            c11334e.f73396b = th;
            c11334e.f73397c = j;
            return c11334e.invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f73395a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                Throwable th = (Throwable) this.f73396b;
                if (this.f73397c < this.f73398d) {
                    gz6<Throwable, zy2<? super Boolean>, Object> gz6Var = this.f73399e;
                    this.f73395a = 1;
                    obj = gz6Var.invoke(th, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return wc1.boxBoolean(z);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            boolean z = ((Boolean) obj).booleanValue();
            return wc1.boxBoolean(z);
        }

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th, Long l, zy2<? super Boolean> zy2Var) {
            return invoke((t66) obj, th, l.longValue(), zy2Var);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: q76$f */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,108:1\n129#2,15:109\n*E\n"})
    public static final class C11335f<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f73400a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ oz6 f73401b;

        /* JADX INFO: renamed from: q76$f$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", m4010f = "Errors.kt", m4011i = {0, 0, 0, 0, 1, 1, 1, 1}, m4012l = {113, 115}, m4013m = "collect", m4014n = {"this", "$this$retryWhen_u24lambda_u242", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u242", "cause", "attempt"}, m4015s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: C */
            public int f73402C;

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f73403a;

            /* JADX INFO: renamed from: b */
            public int f73404b;

            /* JADX INFO: renamed from: d */
            public Object f73406d;

            /* JADX INFO: renamed from: e */
            public Object f73407e;

            /* JADX INFO: renamed from: f */
            public Object f73408f;

            /* JADX INFO: renamed from: m */
            public long f73409m;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f73403a = obj;
                this.f73404b |= Integer.MIN_VALUE;
                return C11335f.this.collect(null, this);
            }
        }

        public C11335f(y56 y56Var, oz6 oz6Var) {
            this.f73400a = y56Var;
            this.f73401b = oz6Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:30:0x00a6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0097 -> B:27:0x009a). Please report as a decompilation issue!!! */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super T> r12, p000.zy2<? super p000.bth> r13) throws java.lang.Throwable {
            /*
                r11 = this;
                boolean r0 = r13 instanceof p000.q76.C11335f.a
                if (r0 == 0) goto L13
                r0 = r13
                q76$f$a r0 = (p000.q76.C11335f.a) r0
                int r1 = r0.f73404b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73404b = r1
                goto L18
            L13:
                q76$f$a r0 = new q76$f$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.f73403a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f73404b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L52
                if (r2 == r4) goto L42
                if (r2 != r3) goto L3a
                long r5 = r0.f73409m
                java.lang.Object r12 = r0.f73408f
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                java.lang.Object r2 = r0.f73407e
                t66 r2 = (p000.t66) r2
                java.lang.Object r7 = r0.f73406d
                q76$f r7 = (p000.q76.C11335f) r7
                p000.y7e.throwOnFailure(r13)
                goto L9a
            L3a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L42:
                int r12 = r0.f73402C
                long r5 = r0.f73409m
                java.lang.Object r2 = r0.f73407e
                t66 r2 = (p000.t66) r2
                java.lang.Object r7 = r0.f73406d
                q76$f r7 = (p000.q76.C11335f) r7
                p000.y7e.throwOnFailure(r13)
                goto L74
            L52:
                p000.y7e.throwOnFailure(r13)
                r5 = 0
                r13 = r11
            L58:
                y56 r2 = r13.f73400a
                r0.f73406d = r13
                r0.f73407e = r12
                r7 = 0
                r0.f73408f = r7
                r0.f73409m = r5
                r7 = 0
                r0.f73402C = r7
                r0.f73404b = r4
                java.lang.Object r2 = p000.c76.catchImpl(r2, r12, r0)
                if (r2 != r1) goto L6f
                return r1
            L6f:
                r10 = r2
                r2 = r12
                r12 = r7
                r7 = r13
                r13 = r10
            L74:
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                if (r13 == 0) goto La6
                oz6 r12 = r7.f73401b
                java.lang.Long r8 = p000.wc1.boxLong(r5)
                r0.f73406d = r7
                r0.f73407e = r2
                r0.f73408f = r13
                r0.f73409m = r5
                r0.f73404b = r3
                r9 = 6
                p000.o28.mark(r9)
                java.lang.Object r12 = r12.invoke(r2, r13, r8, r0)
                r8 = 7
                p000.o28.mark(r8)
                if (r12 != r1) goto L97
                return r1
            L97:
                r10 = r13
                r13 = r12
                r12 = r10
            L9a:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto La8
                r12 = 1
                long r5 = r5 + r12
                r12 = r4
            La6:
                r13 = r7
                goto La9
            La8:
                throw r12
            La9:
                if (r12 != 0) goto Lae
                bth r12 = p000.bth.f14751a
                return r12
            Lae:
                r12 = r2
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.q76.C11335f.collect(t66, zy2):java.lang.Object");
        }
    }

    @yfb
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final <T> y56<T> m31934catch(@yfb y56<? extends T> y56Var, @yfb kz6<? super t66<? super T>, ? super Throwable, ? super zy2<? super bth>, ? extends Object> kz6Var) {
        return new C11330a(y56Var, kz6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object catchImpl(@p000.yfb p000.y56<? extends T> r4, @p000.yfb p000.t66<? super T> r5, @p000.yfb p000.zy2<? super java.lang.Throwable> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof p000.q76.C11331b
            if (r0 == 0) goto L13
            r0 = r6
            q76$b r0 = (p000.q76.C11331b) r0
            int r1 = r0.f73387c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73387c = r1
            goto L18
        L13:
            q76$b r0 = new q76$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f73386b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f73387c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f73385a
            jvd$h r4 = (p000.jvd.C8121h) r4
            p000.y7e.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            p000.y7e.throwOnFailure(r6)
            jvd$h r6 = new jvd$h
            r6.<init>()
            q76$c r2 = new q76$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f73385a = r6     // Catch: java.lang.Throwable -> L51
            r0.f73387c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.f52110a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = isSameExceptionAs$FlowKt__ErrorsKt(r5, r4)
            if (r6 != 0) goto L76
            e13 r6 = r0.getContext()
            boolean r6 = isCancellationCause$FlowKt__ErrorsKt(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            p000.a85.addSuppressed(r4, r5)
            throw r4
        L72:
            p000.a85.addSuppressed(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q76.catchImpl(y56, t66, zy2):java.lang.Object");
    }

    private static final boolean isCancellationCause$FlowKt__ErrorsKt(Throwable th, e13 e13Var) {
        jj8 jj8Var = (jj8) e13Var.get(jj8.f50715A);
        if (jj8Var == null || !jj8Var.isCancelled()) {
            return false;
        }
        return isSameExceptionAs$FlowKt__ErrorsKt(th, jj8Var.getCancellationException());
    }

    private static final boolean isSameExceptionAs$FlowKt__ErrorsKt(Throwable th, Throwable th2) {
        return th2 != null && md8.areEqual(th2, th);
    }

    @yfb
    public static final <T> y56<T> retry(@yfb y56<? extends T> y56Var, long j, @yfb gz6<? super Throwable, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
        if (j > 0) {
            return c76.retryWhen(y56Var, new C11334e(j, gz6Var, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j).toString());
    }

    public static /* synthetic */ y56 retry$default(y56 y56Var, long j, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            gz6Var = new C11333d(null);
        }
        return c76.retry(y56Var, j, gz6Var);
    }

    @yfb
    public static final <T> y56<T> retryWhen(@yfb y56<? extends T> y56Var, @yfb oz6<? super t66<? super T>, ? super Throwable, ? super Long, ? super zy2<? super Boolean>, ? extends Object> oz6Var) {
        return new C11335f(y56Var, oz6Var);
    }
}
