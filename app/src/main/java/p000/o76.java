package p000;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o76 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final qy6<Object, Object> f66596a = new qy6() { // from class: m76
        @Override // p000.qy6
        public final Object invoke(Object obj) {
            return o76.defaultKeySelector$lambda$0$FlowKt__DistinctKt(obj);
        }
    };

    /* JADX INFO: renamed from: b */
    @yfb
    public static final gz6<Object, Object, Boolean> f66597b = new gz6() { // from class: n76
        @Override // p000.gz6
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(md8.areEqual(obj, obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object defaultKeySelector$lambda$0$FlowKt__DistinctKt(Object obj) {
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T> y56<T> distinctUntilChanged(@yfb y56<? extends T> y56Var) {
        return y56Var instanceof l2g ? y56Var : distinctUntilChangedBy$FlowKt__DistinctKt(y56Var, f66596a, f66597b);
    }

    @yfb
    public static final <T, K> y56<T> distinctUntilChangedBy(@yfb y56<? extends T> y56Var, @yfb qy6<? super T, ? extends K> qy6Var) {
        return distinctUntilChangedBy$FlowKt__DistinctKt(y56Var, qy6Var, f66597b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> y56<T> distinctUntilChangedBy$FlowKt__DistinctKt(y56<? extends T> y56Var, qy6<? super T, ? extends Object> qy6Var, gz6<Object, Object, Boolean> gz6Var) {
        if (y56Var instanceof vg4) {
            vg4 vg4Var = (vg4) y56Var;
            if (vg4Var.f91051b == qy6Var && vg4Var.f91052c == gz6Var) {
                return y56Var;
            }
        }
        return new vg4(y56Var, qy6Var, gz6Var);
    }

    @yfb
    public static final <T> y56<T> distinctUntilChanged(@yfb y56<? extends T> y56Var, @yfb gz6<? super T, ? super T, Boolean> gz6Var) {
        qy6<Object, Object> qy6Var = f66596a;
        md8.checkNotNull(gz6Var, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return distinctUntilChangedBy$FlowKt__DistinctKt(y56Var, qy6Var, (gz6) qlh.beforeCheckcastToFunctionOfArity(gz6Var, 2));
    }
}
