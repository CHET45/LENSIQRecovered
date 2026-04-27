package p000;

/* JADX INFO: loaded from: classes.dex */
public final class uk2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final uk2 f88194a = new uk2();

    /* JADX INFO: renamed from: b */
    @yfb
    public static gz6<zl2, Integer, bth> f88195b = mk2.composableLambdaInstance(-1131826196, false, C13563a.f88196a);

    /* JADX INFO: renamed from: uk2$a */
    public static final class C13563a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public static final C13563a f88196a = new C13563a();

        public C13563a() {
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
                gm2.traceEventStart(-1131826196, i, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt.lambda-1.<anonymous> (AndroidPopup.android.kt:555)");
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    @yfb
    /* JADX INFO: renamed from: getLambda-1$ui_release, reason: not valid java name */
    public final gz6<zl2, Integer, bth> m32611getLambda1$ui_release() {
        return f88195b;
    }
}
