package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nFlowCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,59:1\n105#2:60\n*S KotlinDebug\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n46#1:60\n*E\n"})
public final class z66 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: z66$a */
    @dwf({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n1#1,108:1\n47#2,2:109\n*E\n"})
    public static final class C16017a<R> implements y56<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kz6 f104281a;

        public C16017a(kz6 kz6Var) {
            this.f104281a = kz6Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super R> t66Var, zy2<? super bth> zy2Var) {
            Object objFlowScope = z66.flowScope(new C16018b(this.f104281a, t66Var, null), zy2Var);
            return objFlowScope == pd8.getCOROUTINE_SUSPENDED() ? objFlowScope : bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: z66$b */
    @ck3(m4009c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", m4010f = "FlowCoroutine.kt", m4011i = {}, m4012l = {47}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C16018b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f104282a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f104283b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ kz6<x13, t66<? super R>, zy2<? super bth>, Object> f104284c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ t66<R> f104285d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16018b(kz6<? super x13, ? super t66<? super R>, ? super zy2<? super bth>, ? extends Object> kz6Var, t66<? super R> t66Var, zy2<? super C16018b> zy2Var) {
            super(2, zy2Var);
            this.f104284c = kz6Var;
            this.f104285d = t66Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C16018b c16018b = new C16018b(this.f104284c, this.f104285d, zy2Var);
            c16018b.f104283b = obj;
            return c16018b;
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C16018b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
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
        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f104282a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x13 x13Var = (x13) this.f104283b;
                kz6<x13, t66<? super R>, zy2<? super bth>, Object> kz6Var = this.f104284c;
                Object obj2 = this.f104285d;
                this.f104282a = 1;
                if (kz6Var.invoke(x13Var, obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    @gib
    public static final <R> Object flowScope(@yfb @cg1 gz6<? super x13, ? super zy2<? super R>, ? extends Object> gz6Var, @yfb zy2<? super R> zy2Var) {
        y66 y66Var = new y66(zy2Var.getContext(), zy2Var);
        Object objStartUndispatchedOrReturn = fsh.startUndispatchedOrReturn(y66Var, y66Var, gz6Var);
        if (objStartUndispatchedOrReturn == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return objStartUndispatchedOrReturn;
    }

    @yfb
    public static final <R> y56<R> scopedFlow(@yfb @cg1 kz6<? super x13, ? super t66<? super R>, ? super zy2<? super bth>, ? extends Object> kz6Var) {
        return new C16017a(kz6Var);
    }
}
