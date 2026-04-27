package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,143:1\n77#2:144\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n*L\n66#1:144\n*E\n"})
public final class rle {

    /* JADX INFO: renamed from: rle$a */
    public static final class C12148a extends tt8 implements ny6<qle> {

        /* JADX INFO: renamed from: a */
        public static final C12148a f78649a = new C12148a();

        public C12148a() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final qle invoke() {
            return new qle(null, 1, null);
        }
    }

    @yfb
    @hk2
    public static final ple rememberSaveableStateHolder(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(15454635, i, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:60)");
        }
        zl2Var.startReplaceGroup(-796080049);
        qle qleVar = (qle) gyd.rememberSaveable(new Object[0], (dme) qle.f74860d.getSaver(), (String) null, (ny6) C12148a.f78649a, zl2Var, kw1.f55470l, 4);
        qleVar.setParentSaveableStateRegistry((sle) zl2Var.consume(ule.getLocalSaveableStateRegistry()));
        zl2Var.endReplaceGroup();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return qleVar;
    }
}
