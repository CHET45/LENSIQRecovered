package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,138:1\n1#2:139\n105#3:140\n105#3:141\n105#3:142\n105#3:143\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n18#1:140\n29#1:141\n48#1:142\n80#1:143\n*E\n"})
public final /* synthetic */ class r76 {

    /* JADX INFO: renamed from: r76$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m4010f = "Limit.kt", m4011i = {0}, m4012l = {133}, m4013m = "collectWhile", m4014n = {"collector"}, m4015s = {"L$0"})
    public static final class C11917a<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f77254a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f77255b;

        /* JADX INFO: renamed from: c */
        public int f77256c;

        public C11917a(zy2<? super C11917a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f77255b = obj;
            this.f77256c |= Integer.MIN_VALUE;
            return r76.collectWhile(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: r76$b */
    public static final class C11918b<T> implements t66<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<T, zy2<? super Boolean>, Object> f77257a;

        /* JADX INFO: renamed from: r76$b$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", m4010f = "Limit.kt", m4011i = {0}, m4012l = {127}, m4013m = "emit", m4014n = {"this"}, m4015s = {"L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f77258a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f77259b;

            /* JADX INFO: renamed from: d */
            public int f77261d;

            public a(zy2<? super a> zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f77259b = obj;
                this.f77261d |= Integer.MIN_VALUE;
                return C11918b.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C11918b(gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
            this.f77257a = gz6Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r5, p000.zy2<? super p000.bth> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof p000.r76.C11918b.a
                if (r0 == 0) goto L13
                r0 = r6
                r76$b$a r0 = (p000.r76.C11918b.a) r0
                int r1 = r0.f77261d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f77261d = r1
                goto L18
            L13:
                r76$b$a r0 = new r76$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f77259b
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f77261d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f77258a
                r76$b r5 = (p000.r76.C11918b) r5
                p000.y7e.throwOnFailure(r6)
                goto L46
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                p000.y7e.throwOnFailure(r6)
                gz6<T, zy2<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f77257a
                r0.f77258a = r4
                r0.f77261d = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L51
                bth r5 = p000.bth.f14751a
                return r5
            L51:
                l r6 = new l
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.r76.C11918b.emit(java.lang.Object, zy2):java.lang.Object");
        }

        public Object emit$$forInline(T t, zy2<? super bth> zy2Var) {
            o28.mark(4);
            new a(zy2Var);
            o28.mark(5);
            if (((Boolean) this.f77257a.invoke(t, zy2Var)).booleanValue()) {
                return bth.f14751a;
            }
            throw new C8562l(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: r76$c */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n19#2,5:109\n*E\n"})
    public static final class C11919c<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f77262a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f77263b;

        public C11919c(y56 y56Var, int i) {
            this.f77262a = y56Var;
            this.f77263b = i;
        }

        @Override // p000.y56
        public Object collect(t66<? super T> t66Var, zy2<? super bth> zy2Var) {
            Object objCollect = this.f77262a.collect(new C11920d(new jvd.C8119f(), this.f77263b, t66Var), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: r76$d */
    public static final class C11920d<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8119f f77264a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f77265b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ t66<T> f77266c;

        /* JADX INFO: renamed from: r76$d$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", m4010f = "Limit.kt", m4011i = {}, m4012l = {21}, m4013m = "emit", m4014n = {}, m4015s = {})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f77267a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C11920d<T> f77268b;

            /* JADX INFO: renamed from: c */
            public int f77269c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C11920d<? super T> c11920d, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f77268b = c11920d;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f77267a = obj;
                this.f77269c |= Integer.MIN_VALUE;
                return this.f77268b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C11920d(jvd.C8119f c8119f, int i, t66<? super T> t66Var) {
            this.f77264a = c8119f;
            this.f77265b = i;
            this.f77266c = t66Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, p000.zy2<? super p000.bth> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p000.r76.C11920d.a
                if (r0 == 0) goto L13
                r0 = r7
                r76$d$a r0 = (p000.r76.C11920d.a) r0
                int r1 = r0.f77269c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f77269c = r1
                goto L18
            L13:
                r76$d$a r0 = new r76$d$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f77267a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f77269c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                p000.y7e.throwOnFailure(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                p000.y7e.throwOnFailure(r7)
                jvd$f r7 = r5.f77264a
                int r2 = r7.f52108a
                int r4 = r5.f77265b
                if (r2 < r4) goto L4a
                t66<T> r7 = r5.f77266c
                r0.f77269c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                bth r6 = p000.bth.f14751a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.f52108a = r2
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.r76.C11920d.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: r76$e */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n30#2,10:109\n*E\n"})
    public static final class C11921e<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f77270a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f77271b;

        public C11921e(y56 y56Var, gz6 gz6Var) {
            this.f77270a = y56Var;
            this.f77271b = gz6Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super T> t66Var, zy2<? super bth> zy2Var) {
            Object objCollect = this.f77270a.collect(new C11922f(new jvd.C8114a(), t66Var, this.f77271b), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: r76$f */
    public static final class C11922f<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8114a f77272a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ t66<T> f77273b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<T, zy2<? super Boolean>, Object> f77274c;

        /* JADX INFO: renamed from: r76$f$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m4010f = "Limit.kt", m4011i = {1, 1}, m4012l = {33, 34, 36}, m4013m = "emit", m4014n = {"this", "value"}, m4015s = {"L$0", "L$1"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f77275a;

            /* JADX INFO: renamed from: b */
            public Object f77276b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f77277c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C11922f<T> f77278d;

            /* JADX INFO: renamed from: e */
            public int f77279e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C11922f<? super T> c11922f, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f77278d = c11922f;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f77277c = obj;
                this.f77279e |= Integer.MIN_VALUE;
                return this.f77278d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C11922f(jvd.C8114a c8114a, t66<? super T> t66Var, gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
            this.f77272a = c8114a;
            this.f77273b = t66Var;
            this.f77274c = gz6Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
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
        public final java.lang.Object emit(T r7, p000.zy2<? super p000.bth> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p000.r76.C11922f.a
                if (r0 == 0) goto L13
                r0 = r8
                r76$f$a r0 = (p000.r76.C11922f.a) r0
                int r1 = r0.f77279e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f77279e = r1
                goto L18
            L13:
                r76$f$a r0 = new r76$f$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f77277c
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f77279e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                p000.y7e.throwOnFailure(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f77276b
                java.lang.Object r2 = r0.f77275a
                r76$f r2 = (p000.r76.C11922f) r2
                p000.y7e.throwOnFailure(r8)
                goto L6c
            L41:
                p000.y7e.throwOnFailure(r8)
                goto L59
            L45:
                p000.y7e.throwOnFailure(r8)
                jvd$a r8 = r6.f77272a
                boolean r8 = r8.f52103a
                if (r8 == 0) goto L5c
                t66<T> r8 = r6.f77273b
                r0.f77279e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                bth r7 = p000.bth.f14751a
                return r7
            L5c:
                gz6<T, zy2<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f77274c
                r0.f77275a = r6
                r0.f77276b = r7
                r0.f77279e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                jvd$a r8 = r2.f77272a
                r8.f52103a = r5
                t66<T> r8 = r2.f77273b
                r2 = 0
                r0.f77275a = r2
                r0.f77276b = r2
                r0.f77279e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                bth r7 = p000.bth.f14751a
                return r7
            L8b:
                bth r7 = p000.bth.f14751a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.r76.C11922f.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: r76$g */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m4010f = "Limit.kt", m4011i = {0}, m4012l = {70}, m4013m = "emitAbort$FlowKt__LimitKt", m4014n = {"ownershipMarker"}, m4015s = {"L$0"})
    public static final class C11923g<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f77280a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f77281b;

        /* JADX INFO: renamed from: c */
        public int f77282c;

        public C11923g(zy2<? super C11923g> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f77281b = obj;
            this.f77282c |= Integer.MIN_VALUE;
            return r76.emitAbort$FlowKt__LimitKt(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: r76$h */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n49#2,4:109\n63#2,4:113\n*E\n"})
    public static final class C11924h<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f77283a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f77284b;

        /* JADX INFO: renamed from: r76$h$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", m4010f = "Limit.kt", m4011i = {0}, m4012l = {112}, m4013m = "collect", m4014n = {"ownershipMarker"}, m4015s = {"L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f77285a;

            /* JADX INFO: renamed from: b */
            public int f77286b;

            /* JADX INFO: renamed from: d */
            public Object f77288d;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f77285a = obj;
                this.f77286b |= Integer.MIN_VALUE;
                return C11924h.this.collect(null, this);
            }
        }

        public C11924h(y56 y56Var, int i) {
            this.f77283a = y56Var;
            this.f77284b = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super T> r9, p000.zy2<? super p000.bth> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof p000.r76.C11924h.a
                if (r0 == 0) goto L13
                r0 = r10
                r76$h$a r0 = (p000.r76.C11924h.a) r0
                int r1 = r0.f77286b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f77286b = r1
                goto L18
            L13:
                r76$h$a r0 = new r76$h$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f77285a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f77286b
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r9 = r0.f77288d
                p000.y7e.throwOnFailure(r10)     // Catch: p000.C8562l -> L2b
                goto L5d
            L2b:
                r10 = move-exception
                goto L5a
            L2d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L35:
                p000.y7e.throwOnFailure(r10)
                java.lang.Object r10 = new java.lang.Object
                r10.<init>()
                jvd$f r2 = new jvd$f
                r2.<init>()
                y56 r4 = r8.f77283a     // Catch: p000.C8562l -> L56
                r76$i r5 = new r76$i     // Catch: p000.C8562l -> L56
                int r6 = r8.f77284b     // Catch: p000.C8562l -> L56
                r5.<init>(r2, r6, r9, r10)     // Catch: p000.C8562l -> L56
                r0.f77288d = r10     // Catch: p000.C8562l -> L56
                r0.f77286b = r3     // Catch: p000.C8562l -> L56
                java.lang.Object r9 = r4.collect(r5, r0)     // Catch: p000.C8562l -> L56
                if (r9 != r1) goto L5d
                return r1
            L56:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L5a:
                p000.a76.checkOwnership(r10, r9)
            L5d:
                bth r9 = p000.bth.f14751a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.r76.C11924h.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: r76$i */
    public static final class C11925i<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8119f f77289a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f77290b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ t66<T> f77291c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Object f77292d;

        /* JADX INFO: renamed from: r76$i$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", m4010f = "Limit.kt", m4011i = {}, m4012l = {58, 60}, m4013m = "emit", m4014n = {}, m4015s = {})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f77293a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C11925i<T> f77294b;

            /* JADX INFO: renamed from: c */
            public int f77295c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C11925i<? super T> c11925i, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f77294b = c11925i;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f77293a = obj;
                this.f77295c |= Integer.MIN_VALUE;
                return this.f77294b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C11925i(jvd.C8119f c8119f, int i, t66<? super T> t66Var, Object obj) {
            this.f77289a = c8119f;
            this.f77290b = i;
            this.f77291c = t66Var;
            this.f77292d = obj;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, p000.zy2<? super p000.bth> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p000.r76.C11925i.a
                if (r0 == 0) goto L13
                r0 = r7
                r76$i$a r0 = (p000.r76.C11925i.a) r0
                int r1 = r0.f77295c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f77295c = r1
                goto L18
            L13:
                r76$i$a r0 = new r76$i$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f77293a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f77295c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                p000.y7e.throwOnFailure(r7)
                goto L61
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                p000.y7e.throwOnFailure(r7)
                goto L51
            L38:
                p000.y7e.throwOnFailure(r7)
                jvd$f r7 = r5.f77289a
                int r2 = r7.f52108a
                int r2 = r2 + r4
                r7.f52108a = r2
                int r7 = r5.f77290b
                if (r2 >= r7) goto L54
                t66<T> r7 = r5.f77291c
                r0.f77295c = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                bth r6 = p000.bth.f14751a
                return r6
            L54:
                t66<T> r7 = r5.f77291c
                java.lang.Object r2 = r5.f77292d
                r0.f77295c = r3
                java.lang.Object r6 = p000.r76.access$emitAbort$FlowKt__LimitKt(r7, r6, r2, r0)
                if (r6 != r1) goto L61
                return r1
            L61:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.r76.C11925i.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: r76$j */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n82#2:109\n123#2,15:110\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n82#1:110,15\n*E\n"})
    public static final class C11926j<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f77296a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f77297b;

        /* JADX INFO: renamed from: r76$j$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", m4010f = "Limit.kt", m4011i = {0}, m4012l = {120}, m4013m = "collect", m4014n = {"collector$iv"}, m4015s = {"L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f77298a;

            /* JADX INFO: renamed from: b */
            public int f77299b;

            /* JADX INFO: renamed from: d */
            public Object f77301d;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f77298a = obj;
                this.f77299b |= Integer.MIN_VALUE;
                return C11926j.this.collect(null, this);
            }
        }

        public C11926j(y56 y56Var, gz6 gz6Var) {
            this.f77296a = y56Var;
            this.f77297b = gz6Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.y56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(p000.t66<? super T> r6, p000.zy2<? super p000.bth> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p000.r76.C11926j.a
                if (r0 == 0) goto L13
                r0 = r7
                r76$j$a r0 = (p000.r76.C11926j.a) r0
                int r1 = r0.f77299b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f77299b = r1
                goto L18
            L13:
                r76$j$a r0 = new r76$j$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f77298a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f77299b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f77301d
                r76$k r6 = (p000.r76.C11927k) r6
                p000.y7e.throwOnFailure(r7)     // Catch: p000.C8562l -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                p000.y7e.throwOnFailure(r7)
                y56 r7 = r5.f77296a
                r76$k r2 = new r76$k
                gz6 r4 = r5.f77297b
                r2.<init>(r4, r6)
                r0.f77301d = r2     // Catch: p000.C8562l -> L4e
                r0.f77299b = r3     // Catch: p000.C8562l -> L4e
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch: p000.C8562l -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                p000.a76.checkOwnership(r7, r6)
            L53:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.r76.C11926j.collect(t66, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: r76$k */
    @dwf({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,130:1\n83#2,6:131\n*E\n"})
    public static final class C11927k<T> implements t66<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6 f77302a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ t66 f77303b;

        /* JADX INFO: renamed from: r76$k$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", m4010f = "Limit.kt", m4011i = {0, 0, 1}, m4012l = {131, 132}, m4013m = "emit", m4014n = {"this", "value", "this"}, m4015s = {"L$0", "L$1", "L$0"})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f77304a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f77305b;

            /* JADX INFO: renamed from: c */
            public int f77306c;

            /* JADX INFO: renamed from: e */
            public Object f77308e;

            public a(zy2 zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f77305b = obj;
                this.f77306c |= Integer.MIN_VALUE;
                return C11927k.this.emit(null, this);
            }
        }

        public C11927k(gz6 gz6Var, t66 t66Var) {
            this.f77302a = gz6Var;
            this.f77303b = t66Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r8, p000.zy2<? super p000.bth> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p000.r76.C11927k.a
                if (r0 == 0) goto L13
                r0 = r9
                r76$k$a r0 = (p000.r76.C11927k.a) r0
                int r1 = r0.f77306c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f77306c = r1
                goto L18
            L13:
                r76$k$a r0 = new r76$k$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f77305b
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f77306c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f77304a
                r76$k r8 = (p000.r76.C11927k) r8
                p000.y7e.throwOnFailure(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f77308e
                java.lang.Object r2 = r0.f77304a
                r76$k r2 = (p000.r76.C11927k) r2
                p000.y7e.throwOnFailure(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                p000.y7e.throwOnFailure(r9)
                gz6 r9 = r7.f77302a
                r0.f77304a = r7
                r0.f77308e = r8
                r0.f77306c = r4
                r2 = 6
                p000.o28.mark(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                p000.o28.mark(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                t66 r2 = r8.f77303b
                r0.f77304a = r8
                r5 = 0
                r0.f77308e = r5
                r0.f77306c = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                bth r8 = p000.bth.f14751a
                return r8
            L81:
                l r9 = new l
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.r76.C11927k.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: r76$l */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", m4010f = "Limit.kt", m4011i = {0}, m4012l = {149}, m4013m = "invokeSuspend", m4014n = {"collector$iv"}, m4015s = {"L$0"})
    @dwf({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,138:1\n123#2,15:139\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n116#1:139,15\n*E\n"})
    public static final class C11928l<R> extends ugg implements gz6<t66<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f77309a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f77310b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y56<T> f77311c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kz6<t66<? super R>, T, zy2<? super Boolean>, Object> f77312d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: r76$l$a */
        @dwf({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n1#1,130:1\n117#2:131\n*E\n"})
        public static final class a<T> implements t66<T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ kz6 f77313a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ t66 f77314b;

            /* JADX INFO: renamed from: r76$l$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", m4010f = "Limit.kt", m4011i = {0}, m4012l = {131}, m4013m = "emit", m4014n = {"this"}, m4015s = {"L$0"})
            public static final class C16515a extends cz2 {

                /* JADX INFO: renamed from: a */
                public Object f77315a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f77316b;

                /* JADX INFO: renamed from: c */
                public int f77317c;

                public C16515a(zy2 zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    this.f77316b = obj;
                    this.f77317c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kz6 kz6Var, t66 t66Var) {
                this.f77313a = kz6Var;
                this.f77314b = t66Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p000.t66
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object emit(T r5, p000.zy2<? super p000.bth> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p000.r76.C11928l.a.C16515a
                    if (r0 == 0) goto L13
                    r0 = r6
                    r76$l$a$a r0 = (p000.r76.C11928l.a.C16515a) r0
                    int r1 = r0.f77317c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f77317c = r1
                    goto L18
                L13:
                    r76$l$a$a r0 = new r76$l$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f77316b
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f77317c
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r5 = r0.f77315a
                    r76$l$a r5 = (p000.r76.C11928l.a) r5
                    p000.y7e.throwOnFailure(r6)
                    goto L50
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    p000.y7e.throwOnFailure(r6)
                    kz6 r6 = r4.f77313a
                    t66 r2 = r4.f77314b
                    r0.f77315a = r4
                    r0.f77317c = r3
                    r3 = 6
                    p000.o28.mark(r3)
                    java.lang.Object r6 = r6.invoke(r2, r5, r0)
                    r5 = 7
                    p000.o28.mark(r5)
                    if (r6 != r1) goto L4f
                    return r1
                L4f:
                    r5 = r4
                L50:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L5b
                    bth r5 = p000.bth.f14751a
                    return r5
                L5b:
                    l r6 = new l
                    r6.<init>(r5)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.r76.C11928l.a.emit(java.lang.Object, zy2):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11928l(y56<? extends T> y56Var, kz6<? super t66<? super R>, ? super T, ? super zy2<? super Boolean>, ? extends Object> kz6Var, zy2<? super C11928l> zy2Var) {
            super(2, zy2Var);
            this.f77311c = y56Var;
            this.f77312d = kz6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C11928l c11928l = new C11928l(this.f77311c, this.f77312d, zy2Var);
            c11928l.f77310b = obj;
            return c11928l;
        }

        @Override // p000.gz6
        public final Object invoke(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            return ((C11928l) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to r76$l<R> for r5v1 'this'  zy2
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
                int r1 = r5.f77309a
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r5.f77310b
                r76$l$a r0 = (p000.r76.C11928l.a) r0
                p000.y7e.throwOnFailure(r6)     // Catch: p000.C8562l -> L13
                goto L3d
            L13:
                r6 = move-exception
                goto L3a
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                p000.y7e.throwOnFailure(r6)
                java.lang.Object r6 = r5.f77310b
                t66 r6 = (p000.t66) r6
                y56<T> r1 = r5.f77311c
                kz6<t66<? super R>, T, zy2<? super java.lang.Boolean>, java.lang.Object> r3 = r5.f77312d
                r76$l$a r4 = new r76$l$a
                r4.<init>(r3, r6)
                r5.f77310b = r4     // Catch: p000.C8562l -> L38
                r5.f77309a = r2     // Catch: p000.C8562l -> L38
                java.lang.Object r6 = r1.collect(r4, r5)     // Catch: p000.C8562l -> L38
                if (r6 != r0) goto L3d
                return r0
            L38:
                r6 = move-exception
                r0 = r4
            L3a:
                p000.a76.checkOwnership(r6, r0)
            L3d:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.r76.C11928l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object collectWhile(@p000.yfb p000.y56<? extends T> r4, @p000.yfb p000.gz6<? super T, ? super p000.zy2<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @p000.yfb p000.zy2<? super p000.bth> r6) {
        /*
            boolean r0 = r6 instanceof p000.r76.C11917a
            if (r0 == 0) goto L13
            r0 = r6
            r76$a r0 = (p000.r76.C11917a) r0
            int r1 = r0.f77256c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f77256c = r1
            goto L18
        L13:
            r76$a r0 = new r76$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f77255b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77256c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f77254a
            r76$b r4 = (p000.r76.C11918b) r4
            p000.y7e.throwOnFailure(r6)     // Catch: p000.C8562l -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L4c
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            p000.y7e.throwOnFailure(r6)
            r76$b r6 = new r76$b
            r6.<init>(r5)
            r0.f77254a = r6     // Catch: p000.C8562l -> L4a
            r0.f77256c = r3     // Catch: p000.C8562l -> L4a
            java.lang.Object r4 = r4.collect(r6, r0)     // Catch: p000.C8562l -> L4a
            if (r4 != r1) goto L4f
            return r1
        L4a:
            r5 = move-exception
            r4 = r6
        L4c:
            p000.a76.checkOwnership(r5, r4)
        L4f:
            bth r4 = p000.bth.f14751a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.r76.collectWhile(y56, gz6, zy2):java.lang.Object");
    }

    private static final <T> Object collectWhile$$forInline(y56<? extends T> y56Var, gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var, zy2<? super bth> zy2Var) {
        C11918b c11918b = new C11918b(gz6Var);
        try {
            o28.mark(0);
            y56Var.collect(c11918b, zy2Var);
            o28.mark(1);
        } catch (C8562l e) {
            a76.checkOwnership(e, c11918b);
        }
        return bth.f14751a;
    }

    @yfb
    public static final <T> y56<T> drop(@yfb y56<? extends T> y56Var, int i) {
        if (i >= 0) {
            return new C11919c(y56Var, i);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i).toString());
    }

    @yfb
    public static final <T> y56<T> dropWhile(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
        return new C11921e(y56Var, gz6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object emitAbort$FlowKt__LimitKt(p000.t66<? super T> r4, T r5, java.lang.Object r6, p000.zy2<? super p000.bth> r7) {
        /*
            boolean r0 = r7 instanceof p000.r76.C11923g
            if (r0 == 0) goto L13
            r0 = r7
            r76$g r0 = (p000.r76.C11923g) r0
            int r1 = r0.f77282c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f77282c = r1
            goto L18
        L13:
            r76$g r0 = new r76$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f77281b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77282c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r6 = r0.f77280a
            p000.y7e.throwOnFailure(r7)
            goto L41
        L33:
            p000.y7e.throwOnFailure(r7)
            r0.f77280a = r6
            r0.f77282c = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            l r4 = new l
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.r76.emitAbort$FlowKt__LimitKt(t66, java.lang.Object, java.lang.Object, zy2):java.lang.Object");
    }

    @yfb
    public static final <T> y56<T> take(@yfb y56<? extends T> y56Var, int i) {
        if (i > 0) {
            return new C11924h(y56Var, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " should be positive").toString());
    }

    @yfb
    public static final <T> y56<T> takeWhile(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super Boolean>, ? extends Object> gz6Var) {
        return new C11926j(y56Var, gz6Var);
    }

    @yfb
    public static final <T, R> y56<R> transformWhile(@yfb y56<? extends T> y56Var, @yfb @cg1 kz6<? super t66<? super R>, ? super T, ? super zy2<? super Boolean>, ? extends Object> kz6Var) {
        return c76.flow(new C11928l(y56Var, kz6Var, null));
    }
}
