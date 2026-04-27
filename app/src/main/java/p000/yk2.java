package p000;

/* JADX INFO: loaded from: classes.dex */
public final class yk2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final yk2 f101873a = new yk2();

    /* JADX INFO: renamed from: b */
    @yfb
    public static gz6<zl2, Integer, bth> f101874b = mk2.composableLambdaInstance(-1091980426, false, C15700a.f101875a);

    /* JADX INFO: renamed from: yk2$a */
    public static final class C15700a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public static final C15700a f101875a = new C15700a();

        public C15700a() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        @hk2
        public final void invoke(@gib zl2 zl2Var, int i) {
            if ((i & 3) == 2 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1091980426, i, -1, "androidx.compose.runtime.ComposableSingletons$RecomposerKt.lambda-1.<anonymous> (Recomposer.kt:406)");
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    @yfb
    /* JADX INFO: renamed from: getLambda-1$runtime_release, reason: not valid java name */
    public final gz6<zl2, Integer, bth> m33386getLambda1$runtime_release() {
        return f101874b;
    }
}
