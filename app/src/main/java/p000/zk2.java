package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zk2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final zk2 f105335a = new zk2();

    /* JADX INFO: renamed from: b */
    @yfb
    public static gz6<zl2, Integer, bth> f105336b = mk2.composableLambdaInstance(-1741544742, false, C16163a.f105337a);

    /* JADX INFO: renamed from: zk2$a */
    public static final class C16163a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public static final C16163a f105337a = new C16163a();

        public C16163a() {
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
                gm2.traceEventStart(-1741544742, i, -1, "androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.lambda-1.<anonymous> (SubcomposeLayout.kt:473)");
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    @yfb
    /* JADX INFO: renamed from: getLambda-1$ui_release, reason: not valid java name */
    public final gz6<zl2, Integer, bth> m33507getLambda1$ui_release() {
        return f105336b;
    }
}
