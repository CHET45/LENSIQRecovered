package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wk2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final wk2 f94475a = new wk2();

    /* JADX INFO: renamed from: b */
    @yfb
    public static gz6<zl2, Integer, bth> f94476b = mk2.composableLambdaInstance(954879418, false, C14654a.f94478a);

    /* JADX INFO: renamed from: c */
    @yfb
    public static gz6<zl2, Integer, bth> f94477c = mk2.composableLambdaInstance(1918065384, false, C14655b.f94479a);

    /* JADX INFO: renamed from: wk2$a */
    public static final class C14654a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public static final C14654a f94478a = new C14654a();

        public C14654a() {
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
                gm2.traceEventStart(954879418, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:623)");
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: wk2$b */
    public static final class C14655b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public static final C14655b f94479a = new C14655b();

        public C14655b() {
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
                gm2.traceEventStart(1918065384, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:757)");
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    @yfb
    /* JADX INFO: renamed from: getLambda-1$runtime_release, reason: not valid java name */
    public final gz6<zl2, Integer, bth> m32994getLambda1$runtime_release() {
        return f94476b;
    }

    @yfb
    /* JADX INFO: renamed from: getLambda-2$runtime_release, reason: not valid java name */
    public final gz6<zl2, Integer, bth> m32995getLambda2$runtime_release() {
        return f94477c;
    }
}
