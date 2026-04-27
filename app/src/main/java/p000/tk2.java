package p000;

/* JADX INFO: loaded from: classes.dex */
public final class tk2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final tk2 f85095a = new tk2();

    /* JADX INFO: renamed from: b */
    @yfb
    public static gz6<zl2, Integer, bth> f85096b = mk2.composableLambdaInstance(210148896, false, C13080a.f85097a);

    /* JADX INFO: renamed from: tk2$a */
    public static final class C13080a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public static final C13080a f85097a = new C13080a();

        public C13080a() {
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
                gm2.traceEventStart(210148896, i, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt.lambda-1.<anonymous> (AndroidDialog.android.kt:227)");
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    @yfb
    /* JADX INFO: renamed from: getLambda-1$ui_release, reason: not valid java name */
    public final gz6<zl2, Integer, bth> m32412getLambda1$ui_release() {
        return f85096b;
    }
}
