package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n49#2:215\n51#2:219\n49#2:220\n51#2:224\n46#3:216\n51#3:218\n46#3:221\n51#3:223\n105#4:217\n105#4:222\n105#4:225\n1#5:226\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n43#1:215\n43#1:219\n70#1:220\n70#1:224\n43#1:216\n43#1:218\n70#1:221\n70#1:223\n43#1:217\n70#1:222\n78#1:225\n*E\n"})
public final /* synthetic */ class s76 {

    /* JADX INFO: renamed from: a */
    public static final int f80870a = zjg.systemProp(c76.f15901a, 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: s76$a */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class C12472a<R> implements y56<y56<? extends R>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f80871a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f80872b;

        /* JADX INFO: renamed from: s76$a$a */
        @dwf({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n50#2:50\n*E\n"})
        public static final class a<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ t66 f80873a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ gz6 f80874b;

            /* JADX INFO: renamed from: s76$a$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", m4010f = "Merge.kt", m4011i = {}, m4012l = {50, 50}, m4013m = "emit", m4014n = {}, m4015s = {})
            public static final class C16525a extends cz2 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f80875a;

                /* JADX INFO: renamed from: b */
                public int f80876b;

                /* JADX INFO: renamed from: c */
                public Object f80877c;

                public C16525a(zy2 zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    this.f80875a = obj;
                    this.f80876b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(t66 t66Var, gz6 gz6Var) {
                this.f80873a = t66Var;
                this.f80874b = gz6Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p000.t66
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, p000.zy2 r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof p000.s76.C12472a.a.C16525a
                    if (r0 == 0) goto L13
                    r0 = r8
                    s76$a$a$a r0 = (p000.s76.C12472a.a.C16525a) r0
                    int r1 = r0.f80876b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f80876b = r1
                    goto L18
                L13:
                    s76$a$a$a r0 = new s76$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f80875a
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f80876b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p000.y7e.throwOnFailure(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f80877c
                    t66 r7 = (p000.t66) r7
                    p000.y7e.throwOnFailure(r8)
                    goto L51
                L3c:
                    p000.y7e.throwOnFailure(r8)
                    t66 r8 = r6.f80873a
                    gz6 r2 = r6.f80874b
                    r0.f80877c = r8
                    r0.f80876b = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f80877c = r2
                    r0.f80876b = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    bth r7 = p000.bth.f14751a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.s76.C12472a.a.emit(java.lang.Object, zy2):java.lang.Object");
            }
        }

        public C12472a(y56 y56Var, gz6 gz6Var) {
            this.f80871a = y56Var;
            this.f80872b = gz6Var;
        }

        @Override // p000.y56
        public Object collect(t66 t66Var, zy2 zy2Var) {
            Object objCollect = this.f80871a.collect(new a(t66Var, this.f80872b), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: s76$b */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", m4010f = "Merge.kt", m4011i = {}, m4012l = {189, 189}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12473b<R, T> extends ugg implements kz6<t66<? super R>, T, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f80879a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f80880b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f80881c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<T, zy2<? super y56<? extends R>>, Object> f80882d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12473b(gz6<? super T, ? super zy2<? super y56<? extends R>>, ? extends Object> gz6Var, zy2<? super C12473b> zy2Var) {
            super(3, zy2Var);
            this.f80882d = gz6Var;
        }

        @Override // p000.kz6
        public final Object invoke(t66<? super R> t66Var, T t, zy2<? super bth> zy2Var) {
            C12473b c12473b = new C12473b(this.f80882d, zy2Var);
            c12473b.f80880b = t66Var;
            c12473b.f80881c = t;
            return c12473b.invokeSuspend(bth.f14751a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to s76$b<R, T> for r5v1 'this'  java.lang.Object
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
                int r1 = r5.f80879a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p000.y7e.throwOnFailure(r6)
                goto L47
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f80880b
                t66 r1 = (p000.t66) r1
                p000.y7e.throwOnFailure(r6)
                goto L39
            L22:
                p000.y7e.throwOnFailure(r6)
                java.lang.Object r6 = r5.f80880b
                r1 = r6
                t66 r1 = (p000.t66) r1
                java.lang.Object r6 = r5.f80881c
                gz6<T, zy2<? super y56<? extends R>>, java.lang.Object> r4 = r5.f80882d
                r5.f80880b = r1
                r5.f80879a = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                y56 r6 = (p000.y56) r6
                r3 = 0
                r5.f80880b = r3
                r5.f80879a = r2
                java.lang.Object r6 = p000.c76.emitAll(r1, r6, r5)
                if (r6 != r0) goto L47
                return r0
            L47:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.s76.C12473b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to s76$b<R, T> for r2v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object r3 = r2.f80880b
                t66 r3 = (p000.t66) r3
                java.lang.Object r0 = r2.f80881c
                gz6<T, zy2<? super y56<? extends R>>, java.lang.Object> r1 = r2.f80882d
                java.lang.Object r0 = r1.invoke(r0, r2)
                y56 r0 = (p000.y56) r0
                r1 = 0
                p000.o28.mark(r1)
                p000.c76.emitAll(r3, r0, r2)
                r3 = 1
                p000.o28.mark(r3)
                bth r3 = p000.bth.f14751a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.s76.C12473b.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: s76$c */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class C12474c<R> implements y56<y56<? extends R>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f80883a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f80884b;

        /* JADX INFO: renamed from: s76$c$a */
        @dwf({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n50#2:50\n*E\n"})
        public static final class a<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ t66 f80885a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ gz6 f80886b;

            /* JADX INFO: renamed from: s76$c$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", m4010f = "Merge.kt", m4011i = {}, m4012l = {50, 50}, m4013m = "emit", m4014n = {}, m4015s = {})
            public static final class C16526a extends cz2 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f80887a;

                /* JADX INFO: renamed from: b */
                public int f80888b;

                /* JADX INFO: renamed from: c */
                public Object f80889c;

                public C16526a(zy2 zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    this.f80887a = obj;
                    this.f80888b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(t66 t66Var, gz6 gz6Var) {
                this.f80885a = t66Var;
                this.f80886b = gz6Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p000.t66
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, p000.zy2 r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof p000.s76.C12474c.a.C16526a
                    if (r0 == 0) goto L13
                    r0 = r8
                    s76$c$a$a r0 = (p000.s76.C12474c.a.C16526a) r0
                    int r1 = r0.f80888b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f80888b = r1
                    goto L18
                L13:
                    s76$c$a$a r0 = new s76$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f80887a
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f80888b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p000.y7e.throwOnFailure(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f80889c
                    t66 r7 = (p000.t66) r7
                    p000.y7e.throwOnFailure(r8)
                    goto L51
                L3c:
                    p000.y7e.throwOnFailure(r8)
                    t66 r8 = r6.f80885a
                    gz6 r2 = r6.f80886b
                    r0.f80889c = r8
                    r0.f80888b = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f80889c = r2
                    r0.f80888b = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    bth r7 = p000.bth.f14751a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.s76.C12474c.a.emit(java.lang.Object, zy2):java.lang.Object");
            }
        }

        public C12474c(y56 y56Var, gz6 gz6Var) {
            this.f80883a = y56Var;
            this.f80884b = gz6Var;
        }

        @Override // p000.y56
        public Object collect(t66 t66Var, zy2 zy2Var) {
            Object objCollect = this.f80883a.collect(new a(t66Var, this.f80884b), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: s76$d */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,108:1\n79#2,2:109\n*E\n"})
    public static final class C12475d<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y56 f80891a;

        public C12475d(y56 y56Var) {
            this.f80891a = y56Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super T> t66Var, zy2<? super bth> zy2Var) {
            Object objCollect = this.f80891a.collect(new C12476e(t66Var), zy2Var);
            return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: s76$e */
    public static final class C12476e<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ t66<T> f80892a;

        /* JADX INFO: renamed from: s76$e$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", m4010f = "Merge.kt", m4011i = {}, m4012l = {79}, m4013m = "emit", m4014n = {}, m4015s = {})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f80893a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C12476e<T> f80894b;

            /* JADX INFO: renamed from: c */
            public int f80895c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C12476e<? super T> c12476e, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f80894b = c12476e;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f80893a = obj;
                this.f80895c |= Integer.MIN_VALUE;
                return this.f80894b.emit((y56) null, (zy2<? super bth>) this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C12476e(t66<? super T> t66Var) {
            this.f80892a = t66Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(p000.y56<? extends T> r5, p000.zy2<? super p000.bth> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof p000.s76.C12476e.a
                if (r0 == 0) goto L13
                r0 = r6
                s76$e$a r0 = (p000.s76.C12476e.a) r0
                int r1 = r0.f80895c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80895c = r1
                goto L18
            L13:
                s76$e$a r0 = new s76$e$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f80893a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f80895c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                p000.y7e.throwOnFailure(r6)
                goto L3f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                p000.y7e.throwOnFailure(r6)
                t66<T> r6 = r4.f80892a
                r0.f80895c = r3
                java.lang.Object r5 = p000.c76.emitAll(r6, r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                bth r5 = p000.bth.f14751a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.s76.C12476e.emit(y56, zy2):java.lang.Object");
        }

        @Override // p000.t66
        public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
            return emit((y56) obj, (zy2<? super bth>) zy2Var);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: s76$f */
    @ck3(m4009c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", m4010f = "Merge.kt", m4011i = {}, m4012l = {213, 213}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12477f<R, T> extends ugg implements kz6<t66<? super R>, T, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f80896a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f80897b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f80898c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<T, zy2<? super R>, Object> f80899d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12477f(gz6<? super T, ? super zy2<? super R>, ? extends Object> gz6Var, zy2<? super C12477f> zy2Var) {
            super(3, zy2Var);
            this.f80899d = gz6Var;
        }

        @Override // p000.kz6
        public final Object invoke(t66<? super R> t66Var, T t, zy2<? super bth> zy2Var) {
            C12477f c12477f = new C12477f(this.f80899d, zy2Var);
            c12477f.f80897b = t66Var;
            c12477f.f80898c = t;
            return c12477f.invokeSuspend(bth.f14751a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to s76$f<R, T> for r5v1 'this'  java.lang.Object
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
                int r1 = r5.f80896a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p000.y7e.throwOnFailure(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f80897b
                t66 r1 = (p000.t66) r1
                p000.y7e.throwOnFailure(r6)
                goto L39
            L22:
                p000.y7e.throwOnFailure(r6)
                java.lang.Object r6 = r5.f80897b
                r1 = r6
                t66 r1 = (p000.t66) r1
                java.lang.Object r6 = r5.f80898c
                gz6<T, zy2<? super R>, java.lang.Object> r4 = r5.f80899d
                r5.f80897b = r1
                r5.f80896a = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                r3 = 0
                r5.f80897b = r3
                r5.f80896a = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L45
                return r0
            L45:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.s76.C12477f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @wg5
    @yfb
    public static final <T, R> y56<R> flatMapConcat(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super zy2<? super y56<? extends R>>, ? extends Object> gz6Var) {
        return c76.flattenConcat(new C12472a(y56Var, gz6Var));
    }

    @wg5
    @yfb
    public static final <T, R> y56<R> flatMapLatest(@yfb y56<? extends T> y56Var, @yfb @cg1 gz6<? super T, ? super zy2<? super y56<? extends R>>, ? extends Object> gz6Var) {
        return c76.transformLatest(y56Var, new C12473b(gz6Var, null));
    }

    @wg5
    @yfb
    public static final <T, R> y56<R> flatMapMerge(@yfb y56<? extends T> y56Var, int i, @yfb gz6<? super T, ? super zy2<? super y56<? extends R>>, ? extends Object> gz6Var) {
        return c76.flattenMerge(new C12474c(y56Var, gz6Var), i);
    }

    public static /* synthetic */ y56 flatMapMerge$default(y56 y56Var, int i, gz6 gz6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = f80870a;
        }
        return c76.flatMapMerge(y56Var, i, gz6Var);
    }

    @wg5
    @yfb
    public static final <T> y56<T> flattenConcat(@yfb y56<? extends y56<? extends T>> y56Var) {
        return new C12475d(y56Var);
    }

    @wg5
    @yfb
    public static final <T> y56<T> flattenMerge(@yfb y56<? extends y56<? extends T>> y56Var, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i).toString());
        }
        if (i == 1) {
            return c76.flattenConcat(y56Var);
        }
        return new iu1(y56Var, i, null, 0, null, 28, null);
    }

    public static /* synthetic */ y56 flattenMerge$default(y56 y56Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = f80870a;
        }
        return c76.flattenMerge(y56Var, i);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return f80870a;
    }

    @d86
    public static /* synthetic */ void getDEFAULT_CONCURRENCY$annotations() {
    }

    @d86
    public static /* synthetic */ void getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations() {
    }

    @wg5
    @yfb
    public static final <T, R> y56<R> mapLatest(@yfb y56<? extends T> y56Var, @yfb @cg1 gz6<? super T, ? super zy2<? super R>, ? extends Object> gz6Var) {
        return c76.transformLatest(y56Var, new C12477f(gz6Var, null));
    }

    @yfb
    public static final <T> y56<T> merge(@yfb Iterable<? extends y56<? extends T>> iterable) {
        return new ou1(iterable, null, 0, null, 14, null);
    }

    @wg5
    @yfb
    public static final <T, R> y56<R> transformLatest(@yfb y56<? extends T> y56Var, @yfb @cg1 kz6<? super t66<? super R>, ? super T, ? super zy2<? super bth>, ? extends Object> kz6Var) {
        return new lu1(kz6Var, y56Var, null, 0, null, 28, null);
    }

    @yfb
    public static final <T> y56<T> merge(@yfb y56<? extends T>... y56VarArr) {
        return c76.merge(e80.asIterable(y56VarArr));
    }
}
