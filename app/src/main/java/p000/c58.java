package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class c58 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final qy6<f58, bth> f15800a = C2204a.f15802a;

    /* JADX INFO: renamed from: b */
    public static boolean f15801b;

    /* JADX INFO: renamed from: c58$a */
    public static final class C2204a extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public static final C2204a f15802a = new C2204a();

        public C2204a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
        }
    }

    /* JADX INFO: renamed from: c58$b */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n*L\n1#1,178:1\n*E\n"})
    public static final class C2205b extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<f58, bth> f15803a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2205b(qy6<? super f58, bth> qy6Var) {
            super(1);
            this.f15803a = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            this.f15803a.invoke(f58Var);
        }
    }

    @yfb
    public static final qy6<f58, bth> debugInspectorInfo(@yfb qy6<? super f58, bth> qy6Var) {
        return isDebugInspectorInfoEnabled() ? new C2205b(qy6Var) : getNoInspectorInfo();
    }

    @yfb
    public static final qy6<f58, bth> getNoInspectorInfo() {
        return f15800a;
    }

    @yfb
    @q64(level = u64.f86865a, message = "This API will create more invalidations of your modifier than necessary, so it's use is discouraged. Implementing the inspectableProperties method on ModifierNodeElement is the recommended zero-cost alternative to exposing properties on a Modifier to tooling.")
    public static final InterfaceC0701e inspectable(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super f58, bth> qy6Var, @yfb qy6<? super InterfaceC0701e, ? extends InterfaceC0701e> qy6Var2) {
        return inspectableWrapper(interfaceC0701e, qy6Var, qy6Var2.invoke(InterfaceC0701e.f5158d1));
    }

    @yfb
    @yjd
    public static final InterfaceC0701e inspectableWrapper(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super f58, bth> qy6Var, @yfb InterfaceC0701e interfaceC0701e2) {
        z48 z48Var = new z48(qy6Var);
        return interfaceC0701e.then(z48Var).then(interfaceC0701e2).then(z48Var.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return f15801b;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z) {
        f15801b = z;
    }
}
