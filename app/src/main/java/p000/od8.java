package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n204#1,4:270\n225#1:274\n204#1,4:275\n225#1:279\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n130#1:270,4\n130#1:274\n165#1:275,4\n165#1:279\n*E\n"})
public class od8 {

    /* JADX INFO: renamed from: od8$a */
    public static final class C10319a extends s7e {

        /* JADX INFO: renamed from: a */
        public int f67324a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<zy2<? super T>, Object> f67325b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10319a(zy2<? super T> zy2Var, qy6<? super zy2<? super T>, ? extends Object> qy6Var) {
            super(zy2Var);
            this.f67325b = qy6Var;
            md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to od8$a for r2v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        public java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                int r0 = r2.f67324a
                r1 = 1
                if (r0 == 0) goto L16
                if (r0 != r1) goto Le
                r0 = 2
                r2.f67324a = r0
                p000.y7e.throwOnFailure(r3)
                goto L21
            Le:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "This coroutine had already completed"
                r3.<init>(r0)
                throw r3
            L16:
                r2.f67324a = r1
                p000.y7e.throwOnFailure(r3)
                qy6<zy2<? super T>, java.lang.Object> r3 = r2.f67325b
                java.lang.Object r3 = r3.invoke(r2)
            L21:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.od8.C10319a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: od8$b */
    public static final class C10320b extends cz2 {

        /* JADX INFO: renamed from: a */
        public int f67326a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<zy2<? super T>, Object> f67327b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10320b(zy2<? super T> zy2Var, e13 e13Var, qy6<? super zy2<? super T>, ? extends Object> qy6Var) {
            super(zy2Var, e13Var);
            this.f67327b = qy6Var;
            md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to od8$b for r2v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        public java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                int r0 = r2.f67326a
                r1 = 1
                if (r0 == 0) goto L16
                if (r0 != r1) goto Le
                r0 = 2
                r2.f67326a = r0
                p000.y7e.throwOnFailure(r3)
                goto L21
            Le:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "This coroutine had already completed"
                r3.<init>(r0)
                throw r3
            L16:
                r2.f67326a = r1
                p000.y7e.throwOnFailure(r3)
                qy6<zy2<? super T>, java.lang.Object> r3 = r2.f67327b
                java.lang.Object r3 = r3.invoke(r2)
            L21:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.od8.C10320b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: od8$c */
    @dwf({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,222:1\n131#2:223\n*E\n"})
    public static final class C10321c extends s7e {

        /* JADX INFO: renamed from: a */
        public int f67328a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6 f67329b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10321c(zy2 zy2Var, qy6 qy6Var) {
            super(zy2Var);
            this.f67329b = qy6Var;
            md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p000.tq0
        public Object invokeSuspend(Object obj) {
            int i = this.f67328a;
            if (i == 0) {
                this.f67328a = 1;
                y7e.throwOnFailure(obj);
                md8.checkNotNull(this.f67329b, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((qy6) qlh.beforeCheckcastToFunctionOfArity(this.f67329b, 1)).invoke(this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f67328a = 2;
            y7e.throwOnFailure(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: od8$d */
    @dwf({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,240:1\n131#2:241\n*E\n"})
    public static final class C10322d extends cz2 {

        /* JADX INFO: renamed from: a */
        public int f67330a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6 f67331b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10322d(zy2 zy2Var, e13 e13Var, qy6 qy6Var) {
            super(zy2Var, e13Var);
            this.f67331b = qy6Var;
            md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p000.tq0
        public Object invokeSuspend(Object obj) {
            int i = this.f67330a;
            if (i == 0) {
                this.f67330a = 1;
                y7e.throwOnFailure(obj);
                md8.checkNotNull(this.f67331b, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((qy6) qlh.beforeCheckcastToFunctionOfArity(this.f67331b, 1)).invoke(this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f67330a = 2;
            y7e.throwOnFailure(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: od8$e */
    @dwf({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,222:1\n166#2:223\n*E\n"})
    public static final class C10323e extends s7e {

        /* JADX INFO: renamed from: a */
        public int f67332a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f67333b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f67334c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10323e(zy2 zy2Var, gz6 gz6Var, Object obj) {
            super(zy2Var);
            this.f67333b = gz6Var;
            this.f67334c = obj;
            md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p000.tq0
        public Object invokeSuspend(Object obj) {
            int i = this.f67332a;
            if (i == 0) {
                this.f67332a = 1;
                y7e.throwOnFailure(obj);
                md8.checkNotNull(this.f67333b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((gz6) qlh.beforeCheckcastToFunctionOfArity(this.f67333b, 2)).invoke(this.f67334c, this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f67332a = 2;
            y7e.throwOnFailure(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: od8$f */
    @dwf({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,240:1\n166#2:241\n*E\n"})
    public static final class C10324f extends cz2 {

        /* JADX INFO: renamed from: a */
        public int f67335a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6 f67336b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f67337c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10324f(zy2 zy2Var, e13 e13Var, gz6 gz6Var, Object obj) {
            super(zy2Var, e13Var);
            this.f67336b = gz6Var;
            this.f67337c = obj;
            md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p000.tq0
        public Object invokeSuspend(Object obj) {
            int i = this.f67335a;
            if (i == 0) {
                this.f67335a = 1;
                y7e.throwOnFailure(obj);
                md8.checkNotNull(this.f67336b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((gz6) qlh.beforeCheckcastToFunctionOfArity(this.f67336b, 2)).invoke(this.f67337c, this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f67335a = 2;
            y7e.throwOnFailure(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: od8$g */
    public static final class C10325g extends s7e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10325g(zy2<? super T> zy2Var) {
            super(zy2Var);
            md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p000.tq0
        public Object invokeSuspend(Object obj) {
            y7e.throwOnFailure(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: od8$h */
    public static final class C10326h extends cz2 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10326h(zy2<? super T> zy2Var, e13 e13Var) {
            super(zy2Var, e13Var);
            md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p000.tq0
        public Object invokeSuspend(Object obj) {
            y7e.throwOnFailure(obj);
            return obj;
        }
    }

    @jjf(version = "1.3")
    private static final <T> zy2<bth> createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(zy2<? super T> zy2Var, qy6<? super zy2<? super T>, ? extends Object> qy6Var) {
        e13 context = zy2Var.getContext();
        return context == a05.f2a ? new C10319a(zy2Var, qy6Var) : new C10320b(zy2Var, context, qy6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @yfb
    public static <T> zy2<bth> createCoroutineUnintercepted(@yfb qy6<? super zy2<? super T>, ? extends Object> qy6Var, @yfb zy2<? super T> zy2Var) {
        md8.checkNotNullParameter(qy6Var, "<this>");
        md8.checkNotNullParameter(zy2Var, "completion");
        zy2<?> zy2VarProbeCoroutineCreated = jk3.probeCoroutineCreated(zy2Var);
        if (qy6Var instanceof tq0) {
            return ((tq0) qy6Var).create(zy2VarProbeCoroutineCreated);
        }
        e13 context = zy2VarProbeCoroutineCreated.getContext();
        return context == a05.f2a ? new C10321c(zy2VarProbeCoroutineCreated, qy6Var) : new C10322d(zy2VarProbeCoroutineCreated, context, qy6Var);
    }

    /* JADX INFO: renamed from: createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt */
    private static final <T> zy2<T> m18583xca667f36(zy2<? super T> zy2Var) {
        e13 context = zy2Var.getContext();
        return context == a05.f2a ? new C10325g(zy2Var) : new C10326h(zy2Var, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @yfb
    public static <T> zy2<T> intercepted(@yfb zy2<? super T> zy2Var) {
        zy2<T> zy2Var2;
        md8.checkNotNullParameter(zy2Var, "<this>");
        cz2 cz2Var = zy2Var instanceof cz2 ? (cz2) zy2Var : null;
        return (cz2Var == null || (zy2Var2 = (zy2<T>) cz2Var.intercepted()) == null) ? zy2Var : zy2Var2;
    }

    @jjf(version = "1.3")
    @t28
    private static final <T> Object startCoroutineUninterceptedOrReturn(qy6<? super zy2<? super T>, ? extends Object> qy6Var, zy2<? super T> zy2Var) {
        md8.checkNotNullParameter(qy6Var, "<this>");
        md8.checkNotNullParameter(zy2Var, "completion");
        return !(qy6Var instanceof tq0) ? wrapWithContinuationImpl(qy6Var, zy2Var) : ((qy6) qlh.beforeCheckcastToFunctionOfArity(qy6Var, 1)).invoke(zy2Var);
    }

    @gib
    @yjd
    public static final <T> Object wrapWithContinuationImpl(@yfb qy6<? super zy2<? super T>, ? extends Object> qy6Var, @yfb zy2<? super T> zy2Var) {
        md8.checkNotNullParameter(qy6Var, "<this>");
        md8.checkNotNullParameter(zy2Var, "completion");
        return ((qy6) qlh.beforeCheckcastToFunctionOfArity(qy6Var, 1)).invoke(m18583xca667f36(jk3.probeCoroutineCreated(zy2Var)));
    }

    @jjf(version = "1.3")
    @t28
    private static final <R, T> Object startCoroutineUninterceptedOrReturn(gz6<? super R, ? super zy2<? super T>, ? extends Object> gz6Var, R r, zy2<? super T> zy2Var) {
        md8.checkNotNullParameter(gz6Var, "<this>");
        md8.checkNotNullParameter(zy2Var, "completion");
        return !(gz6Var instanceof tq0) ? wrapWithContinuationImpl(gz6Var, r, zy2Var) : ((gz6) qlh.beforeCheckcastToFunctionOfArity(gz6Var, 2)).invoke(r, zy2Var);
    }

    @gib
    @yjd
    public static <R, T> Object wrapWithContinuationImpl(@yfb gz6<? super R, ? super zy2<? super T>, ? extends Object> gz6Var, R r, @yfb zy2<? super T> zy2Var) {
        md8.checkNotNullParameter(gz6Var, "<this>");
        md8.checkNotNullParameter(zy2Var, "completion");
        return ((gz6) qlh.beforeCheckcastToFunctionOfArity(gz6Var, 2)).invoke(r, m18583xca667f36(jk3.probeCoroutineCreated(zy2Var)));
    }

    @t28
    private static final <R, P, T> Object startCoroutineUninterceptedOrReturn(kz6<? super R, ? super P, ? super zy2<? super T>, ? extends Object> kz6Var, R r, P p, zy2<? super T> zy2Var) {
        md8.checkNotNullParameter(kz6Var, "<this>");
        md8.checkNotNullParameter(zy2Var, "completion");
        return !(kz6Var instanceof tq0) ? wrapWithContinuationImpl(kz6Var, r, p, zy2Var) : ((kz6) qlh.beforeCheckcastToFunctionOfArity(kz6Var, 3)).invoke(r, p, zy2Var);
    }

    @gib
    @yjd
    public static <R, P, T> Object wrapWithContinuationImpl(@yfb kz6<? super R, ? super P, ? super zy2<? super T>, ? extends Object> kz6Var, R r, P p, @yfb zy2<? super T> zy2Var) {
        md8.checkNotNullParameter(kz6Var, "<this>");
        md8.checkNotNullParameter(zy2Var, "completion");
        return ((kz6) qlh.beforeCheckcastToFunctionOfArity(kz6Var, 3)).invoke(r, p, m18583xca667f36(jk3.probeCoroutineCreated(zy2Var)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @yfb
    public static <R, T> zy2<bth> createCoroutineUnintercepted(@yfb gz6<? super R, ? super zy2<? super T>, ? extends Object> gz6Var, R r, @yfb zy2<? super T> zy2Var) {
        md8.checkNotNullParameter(gz6Var, "<this>");
        md8.checkNotNullParameter(zy2Var, "completion");
        zy2<?> zy2VarProbeCoroutineCreated = jk3.probeCoroutineCreated(zy2Var);
        if (gz6Var instanceof tq0) {
            return ((tq0) gz6Var).create(r, zy2VarProbeCoroutineCreated);
        }
        e13 context = zy2VarProbeCoroutineCreated.getContext();
        if (context == a05.f2a) {
            return new C10323e(zy2VarProbeCoroutineCreated, gz6Var, r);
        }
        return new C10324f(zy2VarProbeCoroutineCreated, context, gz6Var, r);
    }
}
