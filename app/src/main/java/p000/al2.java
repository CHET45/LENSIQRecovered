package p000;

/* JADX INFO: loaded from: classes.dex */
public final class al2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final al2 f1955a = new al2();

    /* JADX INFO: renamed from: b */
    @yfb
    public static gz6<zl2, Integer, bth> f1956b = mk2.composableLambdaInstance(-1759434350, false, C0307a.f1957a);

    /* JADX INFO: renamed from: al2$a */
    public static final class C0307a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public static final C0307a f1957a = new C0307a();

        public C0307a() {
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
                gm2.traceEventStart(-1759434350, i, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda-1.<anonymous> (Wrapper.android.kt:120)");
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    @yfb
    /* JADX INFO: renamed from: getLambda-1$ui_release, reason: not valid java name */
    public final gz6<zl2, Integer, bth> m27225getLambda1$ui_release() {
        return f1956b;
    }
}
