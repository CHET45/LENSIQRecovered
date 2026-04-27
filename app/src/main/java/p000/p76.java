package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,218:1\n105#2:219\n105#2:220\n105#2:221\n105#2:222\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n46#1:219\n72#1:220\n142#1:221\n177#1:222\n*E\n"})
public final /* synthetic */ class p76 {

    /* JADX INFO: renamed from: p76$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", m4010f = "Emitters.kt", m4011i = {0}, m4012l = {nb2.f63868p}, m4013m = "invokeSafely$FlowKt__EmittersKt", m4014n = {"cause"}, m4015s = {"L$0"})
    public static final class C10812a<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f69869a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f69870b;

        /* JADX INFO: renamed from: c */
        public int f69871c;

        public C10812a(zy2<? super C10812a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f69870b = obj;
            this.f69871c |= Integer.MIN_VALUE;
            return p76.invokeSafely$FlowKt__EmittersKt(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: p76$b */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,108:1\n143#2,13:109\n156#2,6:123\n326#3:122\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n155#1:122\n*E\n"})
    public static final class C10813b<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f69872a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6 f69873b;

        /* JADX INFO: renamed from: p76$b$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m4010f = "Emitters.kt", m4011i = {0, 0, 1, 2}, m4012l = {110, 117, 124}, m4013m = "collect", m4014n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, m4015s = {"L$0", "L$1", "L$0", "L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f69874a;

            /* JADX INFO: renamed from: b */
            public int f69875b;

            /* JADX INFO: renamed from: d */
            public Object f69877d;

            /* JADX INFO: renamed from: e */
            public Object f69878e;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f69874a = obj;
                this.f69875b |= Integer.MIN_VALUE;
                return C10813b.this.collect(null, this);
            }
        }

        public C10813b(y56 y56Var, kz6 kz6Var) {
            this.f69872a = y56Var;
            this.f69873b = kz6Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super T> r9, p000.zy2<? super p000.bth> r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof p000.p76.C10813b.a
                if (r0 == 0) goto L13
                r0 = r10
                p76$b$a r0 = (p000.p76.C10813b.a) r0
                int r1 = r0.f69875b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f69875b = r1
                goto L18
            L13:
                p76$b$a r0 = new p76$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f69874a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f69875b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f69877d
                jke r9 = (p000.jke) r9
                p000.y7e.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f69877d
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                p000.y7e.throwOnFailure(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.f69878e
                t66 r9 = (p000.t66) r9
                java.lang.Object r2 = r0.f69877d
                p76$b r2 = (p000.p76.C10813b) r2
                p000.y7e.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                p000.y7e.throwOnFailure(r10)
                y56 r10 = r8.f69872a     // Catch: java.lang.Throwable -> L96
                r0.f69877d = r8     // Catch: java.lang.Throwable -> L96
                r0.f69878e = r9     // Catch: java.lang.Throwable -> L96
                r0.f69875b = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                jke r10 = new jke
                e13 r4 = r0.getContext()
                r10.<init>(r9, r4)
                kz6 r9 = r2.f69873b     // Catch: java.lang.Throwable -> L8e
                r0.f69877d = r10     // Catch: java.lang.Throwable -> L8e
                r0.f69878e = r6     // Catch: java.lang.Throwable -> L8e
                r0.f69875b = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                p000.o28.mark(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                p000.o28.mark(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                bth r9 = p000.bth.f14751a
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                dzg r10 = new dzg
                r10.<init>(r9)
                kz6 r2 = r2.f69873b
                r0.f69877d = r9
                r0.f69878e = r6
                r0.f69875b = r4
                java.lang.Object r10 = p000.p76.access$invokeSafely$FlowKt__EmittersKt(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.p76.C10813b.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: p76$c */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,108:1\n178#2,7:109\n185#2,7:117\n326#3:116\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n184#1:116\n*E\n"})
    public static final class C10814c<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f69879a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f69880b;

        /* JADX INFO: renamed from: p76$c$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", m4010f = "Emitters.kt", m4011i = {0, 0, 0, 1}, m4012l = {110, 118}, m4013m = "collect", m4014n = {"this", "$this$onEmpty_u24lambda_u243", "isEmpty", "collector"}, m4015s = {"L$0", "L$1", "L$2", "L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f69881a;

            /* JADX INFO: renamed from: b */
            public int f69882b;

            /* JADX INFO: renamed from: d */
            public Object f69884d;

            /* JADX INFO: renamed from: e */
            public Object f69885e;

            /* JADX INFO: renamed from: f */
            public Object f69886f;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f69881a = obj;
                this.f69882b |= Integer.MIN_VALUE;
                return C10814c.this.collect(null, this);
            }
        }

        public C10814c(y56 y56Var, gz6 gz6Var) {
            this.f69879a = y56Var;
            this.f69880b = gz6Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [t66] */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, t66, t66<? super T>] */
        /* JADX WARN: Type inference failed for: r7v1, types: [jke] */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v7, types: [jke] */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super T> r7, p000.zy2<? super p000.bth> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p000.p76.C10814c.a
                if (r0 == 0) goto L13
                r0 = r8
                p76$c$a r0 = (p000.p76.C10814c.a) r0
                int r1 = r0.f69882b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f69882b = r1
                goto L18
            L13:
                p76$c$a r0 = new p76$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f69881a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f69882b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4a
                if (r2 == r4) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r7 = r0.f69884d
                jke r7 = (p000.jke) r7
                p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L30
                goto L94
            L30:
                r8 = move-exception
                goto L98
            L32:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3a:
                java.lang.Object r7 = r0.f69886f
                jvd$a r7 = (p000.jvd.C8114a) r7
                java.lang.Object r2 = r0.f69885e
                t66 r2 = (p000.t66) r2
                java.lang.Object r4 = r0.f69884d
                p76$c r4 = (p000.p76.C10814c) r4
                p000.y7e.throwOnFailure(r8)
                goto L6d
            L4a:
                p000.y7e.throwOnFailure(r8)
                jvd$a r8 = new jvd$a
                r8.<init>()
                r8.f52103a = r4
                y56 r2 = r6.f69879a
                p76$d r5 = new p76$d
                r5.<init>(r8, r7)
                r0.f69884d = r6
                r0.f69885e = r7
                r0.f69886f = r8
                r0.f69882b = r4
                java.lang.Object r2 = r2.collect(r5, r0)
                if (r2 != r1) goto L6a
                return r1
            L6a:
                r4 = r6
                r2 = r7
                r7 = r8
            L6d:
                boolean r7 = r7.f52103a
                if (r7 == 0) goto L9c
                jke r7 = new jke
                e13 r8 = r0.getContext()
                r7.<init>(r2, r8)
                gz6 r8 = r4.f69880b     // Catch: java.lang.Throwable -> L30
                r0.f69884d = r7     // Catch: java.lang.Throwable -> L30
                r2 = 0
                r0.f69885e = r2     // Catch: java.lang.Throwable -> L30
                r0.f69886f = r2     // Catch: java.lang.Throwable -> L30
                r0.f69882b = r3     // Catch: java.lang.Throwable -> L30
                r2 = 6
                p000.o28.mark(r2)     // Catch: java.lang.Throwable -> L30
                java.lang.Object r8 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L30
                r0 = 7
                p000.o28.mark(r0)     // Catch: java.lang.Throwable -> L30
                if (r8 != r1) goto L94
                return r1
            L94:
                r7.releaseIntercepted()
                goto L9c
            L98:
                r7.releaseIntercepted()
                throw r8
            L9c:
                bth r7 = p000.bth.f14751a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.p76.C10814c.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: p76$d */
    public static final class C10815d<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8114a f69887a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ t66<T> f69888b;

        /* JADX INFO: renamed from: p76$d$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", m4010f = "Emitters.kt", m4011i = {}, m4012l = {181}, m4013m = "emit", m4014n = {}, m4015s = {})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f69889a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C10815d<T> f69890b;

            /* JADX INFO: renamed from: c */
            public int f69891c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C10815d<? super T> c10815d, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f69890b = c10815d;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f69889a = obj;
                this.f69891c |= Integer.MIN_VALUE;
                return this.f69890b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C10815d(jvd.C8114a c8114a, t66<? super T> t66Var) {
            this.f69887a = c8114a;
            this.f69888b = t66Var;
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
                boolean r0 = r6 instanceof p000.p76.C10815d.a
                if (r0 == 0) goto L13
                r0 = r6
                p76$d$a r0 = (p000.p76.C10815d.a) r0
                int r1 = r0.f69891c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f69891c = r1
                goto L18
            L13:
                p76$d$a r0 = new p76$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f69889a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f69891c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                p000.y7e.throwOnFailure(r6)
                goto L44
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                p000.y7e.throwOnFailure(r6)
                jvd$a r6 = r4.f69887a
                r2 = 0
                r6.f52103a = r2
                t66<T> r6 = r4.f69888b
                r0.f69891c = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                bth r5 = p000.bth.f14751a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.p76.C10815d.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: p76$e */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,108:1\n73#2:109\n74#2,7:111\n326#3:110\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n73#1:110\n*E\n"})
    public static final class C10816e<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6 f69892a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ y56 f69893b;

        /* JADX INFO: renamed from: p76$e$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", m4010f = "Emitters.kt", m4011i = {0, 0, 0}, m4012l = {112, 116}, m4013m = "collect", m4014n = {"this", "$this$onStart_u24lambda_u241", "safeCollector"}, m4015s = {"L$0", "L$1", "L$2"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f69894a;

            /* JADX INFO: renamed from: b */
            public int f69895b;

            /* JADX INFO: renamed from: d */
            public Object f69897d;

            /* JADX INFO: renamed from: e */
            public Object f69898e;

            /* JADX INFO: renamed from: f */
            public Object f69899f;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f69894a = obj;
                this.f69895b |= Integer.MIN_VALUE;
                return C10816e.this.collect(null, this);
            }
        }

        public C10816e(gz6 gz6Var, y56 y56Var) {
            this.f69892a = gz6Var;
            this.f69893b = y56Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super T> r7, p000.zy2<? super p000.bth> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p000.p76.C10816e.a
                if (r0 == 0) goto L13
                r0 = r8
                p76$e$a r0 = (p000.p76.C10816e.a) r0
                int r1 = r0.f69895b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f69895b = r1
                goto L18
            L13:
                p76$e$a r0 = new p76$e$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f69894a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f69895b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                p000.y7e.throwOnFailure(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f69899f
                jke r7 = (p000.jke) r7
                java.lang.Object r2 = r0.f69898e
                t66 r2 = (p000.t66) r2
                java.lang.Object r4 = r0.f69897d
                p76$e r4 = (p000.p76.C10816e) r4
                p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                p000.y7e.throwOnFailure(r8)
                jke r8 = new jke
                e13 r2 = r0.getContext()
                r8.<init>(r7, r2)
                gz6 r2 = r6.f69892a     // Catch: java.lang.Throwable -> L86
                r0.f69897d = r6     // Catch: java.lang.Throwable -> L86
                r0.f69898e = r7     // Catch: java.lang.Throwable -> L86
                r0.f69899f = r8     // Catch: java.lang.Throwable -> L86
                r0.f69895b = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                p000.o28.mark(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                p000.o28.mark(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                y56 r7 = r4.f69893b
                r8 = 0
                r0.f69897d = r8
                r0.f69898e = r8
                r0.f69899f = r8
                r0.f69895b = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                bth r7 = p000.bth.f14751a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.p76.C10816e.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: p76$f */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", m4010f = "Emitters.kt", m4011i = {}, m4012l = {36}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C10817f<R> extends ugg implements gz6<t66<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f69900a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f69901b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y56<T> f69902c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kz6<t66<? super R>, T, zy2<? super bth>, Object> f69903d;

        /* JADX INFO: renamed from: p76$f$a */
        public static final class a<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ kz6<t66<? super R>, T, zy2<? super bth>, Object> f69904a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ t66<R> f69905b;

            /* JADX INFO: renamed from: p76$f$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", m4010f = "Emitters.kt", m4011i = {}, m4012l = {38}, m4013m = "emit", m4014n = {}, m4015s = {})
            public static final class C16500a extends cz2 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f69906a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ a<T> f69907b;

                /* JADX INFO: renamed from: c */
                public int f69908c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C16500a(a<? super T> aVar, zy2<? super C16500a> zy2Var) {
                    super(zy2Var);
                    this.f69907b = aVar;
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    this.f69906a = obj;
                    this.f69908c |= Integer.MIN_VALUE;
                    return this.f69907b.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(kz6<? super t66<? super R>, ? super T, ? super zy2<? super bth>, ? extends Object> kz6Var, t66<? super R> t66Var) {
                this.f69904a = kz6Var;
                this.f69905b = t66Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // p000.t66
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r5, p000.zy2<? super p000.bth> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p000.p76.C10817f.a.C16500a
                    if (r0 == 0) goto L13
                    r0 = r6
                    p76$f$a$a r0 = (p000.p76.C10817f.a.C16500a) r0
                    int r1 = r0.f69908c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f69908c = r1
                    goto L18
                L13:
                    p76$f$a$a r0 = new p76$f$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f69906a
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f69908c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p000.y7e.throwOnFailure(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p000.y7e.throwOnFailure(r6)
                    kz6<t66<? super R>, T, zy2<? super bth>, java.lang.Object> r6 = r4.f69904a
                    t66<R> r2 = r4.f69905b
                    r0.f69908c = r3
                    java.lang.Object r5 = r6.invoke(r2, r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    bth r5 = p000.bth.f14751a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.p76.C10817f.a.emit(java.lang.Object, zy2):java.lang.Object");
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final Object emit$$forInline(T t, zy2<? super bth> zy2Var) {
                o28.mark(4);
                new C16500a(this, zy2Var);
                o28.mark(5);
                this.f69904a.invoke((t66<? super R>) this.f69905b, t, zy2Var);
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10817f(y56<? extends T> y56Var, kz6<? super t66<? super R>, ? super T, ? super zy2<? super bth>, ? extends Object> kz6Var, zy2<? super C10817f> zy2Var) {
            super(2, zy2Var);
            this.f69902c = y56Var;
            this.f69903d = kz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C10817f c10817f = new C10817f(this.f69902c, this.f69903d, zy2Var);
            c10817f.f69901b = obj;
            return c10817f;
        }

        @Override // p000.gz6
        public final Object invoke(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            return ((C10817f) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to p76$f<R> for r5v1 'this'  zy2
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r5.f69900a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                p000.y7e.throwOnFailure(r6)
                goto L30
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                p000.y7e.throwOnFailure(r6)
                java.lang.Object r6 = r5.f69901b
                t66 r6 = (p000.t66) r6
                y56<T> r1 = r5.f69902c
                p76$f$a r3 = new p76$f$a
                kz6<t66<? super R>, T, zy2<? super bth>, java.lang.Object> r4 = r5.f69903d
                r3.<init>(r4, r6)
                r5.f69900a = r2
                java.lang.Object r6 = r1.collect(r3, r5)
                if (r6 != r0) goto L30
                return r0
            L30:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.p76.C10817f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to p76$f<R> for r3v1 'this'  zy2
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r4 = r3.f69901b
                t66 r4 = (p000.t66) r4
                y56<T> r0 = r3.f69902c
                p76$f$a r1 = new p76$f$a
                kz6<t66<? super R>, T, zy2<? super bth>, java.lang.Object> r2 = r3.f69903d
                r1.<init>(r2, r4)
                r4 = 0
                p000.o28.mark(r4)
                r0.collect(r1, r3)
                r4 = 1
                p000.o28.mark(r4)
                bth r4 = p000.bth.f14751a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.p76.C10817f.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: p76$g */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class C10818g<R> implements y56<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f69909a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6 f69910b;

        /* JADX INFO: renamed from: p76$g$a */
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f69911a;

            /* JADX INFO: renamed from: b */
            public int f69912b;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f69911a = obj;
                this.f69912b |= Integer.MIN_VALUE;
                return C10818g.this.collect(null, this);
            }
        }

        public C10818g(y56 y56Var, kz6 kz6Var) {
            this.f69909a = y56Var;
            this.f69910b = kz6Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            Object objCollect = this.f69909a.collect(new C10819h(this.f69910b, t66Var), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }

        public Object collect$$forInline(t66 t66Var, zy2 zy2Var) {
            o28.mark(4);
            new a(zy2Var);
            o28.mark(5);
            y56 y56Var = this.f69909a;
            C10819h c10819h = new C10819h(this.f69910b, t66Var);
            o28.mark(0);
            y56Var.collect(c10819h, zy2Var);
            o28.mark(1);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: p76$h */
    public static final class C10819h<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kz6<t66<? super R>, T, zy2<? super bth>, Object> f69914a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ t66<R> f69915b;

        /* JADX INFO: renamed from: p76$h$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", m4010f = "Emitters.kt", m4011i = {}, m4012l = {49}, m4013m = "emit", m4014n = {}, m4015s = {})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f69916a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C10819h<T> f69917b;

            /* JADX INFO: renamed from: c */
            public int f69918c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C10819h<? super T> c10819h, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f69917b = c10819h;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f69916a = obj;
                this.f69918c |= Integer.MIN_VALUE;
                return this.f69917b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C10819h(kz6<? super t66<? super R>, ? super T, ? super zy2<? super bth>, ? extends Object> kz6Var, t66<? super R> t66Var) {
            this.f69914a = kz6Var;
            this.f69915b = t66Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
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
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, p000.zy2<? super p000.bth> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof p000.p76.C10819h.a
                if (r0 == 0) goto L13
                r0 = r6
                p76$h$a r0 = (p000.p76.C10819h.a) r0
                int r1 = r0.f69918c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f69918c = r1
                goto L18
            L13:
                p76$h$a r0 = new p76$h$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f69916a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f69918c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                p000.y7e.throwOnFailure(r6)
                goto L41
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                p000.y7e.throwOnFailure(r6)
                kz6<t66<? super R>, T, zy2<? super bth>, java.lang.Object> r6 = r4.f69914a
                t66<R> r2 = r4.f69915b
                r0.f69918c = r3
                java.lang.Object r5 = r6.invoke(r2, r5, r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                bth r5 = p000.bth.f14751a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.p76.C10819h.emit(java.lang.Object, zy2):java.lang.Object");
        }

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
        public final Object emit$$forInline(T t, zy2<? super bth> zy2Var) {
            o28.mark(4);
            new a(this, zy2Var);
            o28.mark(5);
            this.f69914a.invoke(this.f69915b, t, zy2Var);
            return bth.f14751a;
        }
    }

    public static final void ensureActive(@yfb t66<?> t66Var) {
        if (t66Var instanceof dzg) {
            throw ((dzg) t66Var).f31392a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object invokeSafely$FlowKt__EmittersKt(p000.t66<? super T> r4, p000.kz6<? super p000.t66<? super T>, ? super java.lang.Throwable, ? super p000.zy2<? super p000.bth>, ? extends java.lang.Object> r5, java.lang.Throwable r6, p000.zy2<? super p000.bth> r7) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            boolean r0 = r7 instanceof p000.p76.C10812a
            if (r0 == 0) goto L13
            r0 = r7
            p76$a r0 = (p000.p76.C10812a) r0
            int r1 = r0.f69871c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69871c = r1
            goto L18
        L13:
            p76$a r0 = new p76$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f69870b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f69871c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f69869a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            p000.y7e.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            p000.y7e.throwOnFailure(r7)
            r0.f69869a = r6     // Catch: java.lang.Throwable -> L2e
            r0.f69871c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            bth r4 = p000.bth.f14751a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            p000.a85.addSuppressed(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p76.invokeSafely$FlowKt__EmittersKt(t66, kz6, java.lang.Throwable, zy2):java.lang.Object");
    }

    @yfb
    public static final <T> y56<T> onCompletion(@yfb y56<? extends T> y56Var, @yfb kz6<? super t66<? super T>, ? super Throwable, ? super zy2<? super bth>, ? extends Object> kz6Var) {
        return new C10813b(y56Var, kz6Var);
    }

    @yfb
    public static final <T> y56<T> onEmpty(@yfb y56<? extends T> y56Var, @yfb gz6<? super t66<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return new C10814c(y56Var, gz6Var);
    }

    @yfb
    public static final <T> y56<T> onStart(@yfb y56<? extends T> y56Var, @yfb gz6<? super t66<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return new C10816e(gz6Var, y56Var);
    }

    @yfb
    public static final <T, R> y56<R> transform(@yfb y56<? extends T> y56Var, @yfb @cg1 kz6<? super t66<? super R>, ? super T, ? super zy2<? super bth>, ? extends Object> kz6Var) {
        return c76.flow(new C10817f(y56Var, kz6Var, null));
    }

    @yfb
    @yjd
    public static final <T, R> y56<R> unsafeTransform(@yfb y56<? extends T> y56Var, @yfb @cg1 kz6<? super t66<? super R>, ? super T, ? super zy2<? super bth>, ? extends Object> kz6Var) {
        return new C10818g(y56Var, kz6Var);
    }
}
