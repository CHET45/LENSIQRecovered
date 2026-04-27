package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class kke {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final kz6<t66<Object>, Object, zy2<? super bth>, Object> f54557a;

    /* JADX INFO: renamed from: kke$a */
    public /* synthetic */ class C8437a extends n07 implements kz6<t66<? super Object>, Object, zy2<? super bth>, Object>, sgg {

        /* JADX INFO: renamed from: a */
        public static final C8437a f54558a = new C8437a();

        public C8437a() {
            super(3, t66.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t66<Object> t66Var, Object obj, zy2<? super bth> zy2Var) {
            return t66Var.emit(obj, zy2Var);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Object invoke(t66<? super Object> t66Var, Object obj, zy2<? super bth> zy2Var) {
            return invoke2((t66<Object>) t66Var, obj, zy2Var);
        }
    }

    static {
        C8437a c8437a = C8437a.f54558a;
        md8.checkNotNull(c8437a, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f54557a = (kz6) qlh.beforeCheckcastToFunctionOfArity(c8437a, 3);
    }

    private static /* synthetic */ void getEmitFun$annotations() {
    }
}
