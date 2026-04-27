package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xk2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final xk2 f98253a = new xk2();

    /* JADX INFO: renamed from: b */
    @yfb
    public static kz6<gz6<? super zl2, ? super Integer, bth>, zl2, Integer, bth> f98254b = mk2.composableLambdaInstance(671295101, false, C15165a.f98255a);

    /* JADX INFO: renamed from: xk2$a */
    public static final class C15165a extends tt8 implements kz6<gz6<? super zl2, ? super Integer, ? extends bth>, zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public static final C15165a f98255a = new C15165a();

        public C15165a() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(gz6<? super zl2, ? super Integer, ? extends bth> gz6Var, zl2 zl2Var, Integer num) {
            invoke((gz6<? super zl2, ? super Integer, bth>) gz6Var, zl2Var, num.intValue());
            return bth.f14751a;
        }

        @hk2
        @ik2(scheme = "[0[0]]")
        public final void invoke(@yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i) {
            if ((i & 6) == 0) {
                i |= zl2Var.changedInstance(gz6Var) ? 4 : 2;
            }
            if ((i & 19) == 18 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(671295101, i, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:219)");
            }
            gz6Var.invoke(zl2Var, Integer.valueOf(i & 14));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    @yfb
    /* JADX INFO: renamed from: getLambda-1$foundation_release, reason: not valid java name */
    public final kz6<gz6<? super zl2, ? super Integer, bth>, zl2, Integer, bth> m33233getLambda1$foundation_release() {
        return f98254b;
    }
}
