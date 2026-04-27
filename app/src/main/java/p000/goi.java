package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,748:1\n77#2:749\n148#3:750\n148#3:751\n148#3:752\n148#3:753\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n*L\n245#1:749\n278#1:750\n279#1:751\n280#1:752\n281#1:753\n*E\n"})
public final class goi {
    @yfb
    public static final vli WindowInsets(int i, int i2, int i3, int i4) {
        return new z16(i, i2, i3, i4);
    }

    public static /* synthetic */ vli WindowInsets$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return WindowInsets(i, i2, i3, i4);
    }

    @yfb
    /* JADX INFO: renamed from: WindowInsets-a9UjIt4, reason: not valid java name */
    public static final vli m29837WindowInsetsa9UjIt4(float f, float f2, float f3, float f4) {
        return new w16(f, f2, f3, f4, null);
    }

    /* JADX INFO: renamed from: WindowInsets-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ vli m29838WindowInsetsa9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = kn4.m30705constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = kn4.m30705constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = kn4.m30705constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = kn4.m30705constructorimpl(0);
        }
        return m29837WindowInsetsa9UjIt4(f, f2, f3, f4);
    }

    @yfb
    public static final vli add(@yfb vli vliVar, @yfb vli vliVar2) {
        return new C12086rh(vliVar, vliVar2);
    }

    @yfb
    public static final vli asInsets(@yfb vac vacVar) {
        return new yac(vacVar);
    }

    @yfb
    @hk2
    @wqd
    public static final vac asPaddingValues(@yfb vli vliVar, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1485016250, i, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:244)");
        }
        w48 w48Var = new w48(vliVar, (c64) zl2Var.consume(sn2.getLocalDensity()));
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return w48Var;
    }

    @yfb
    public static final vli exclude(@yfb vli vliVar, @yfb vli vliVar2) {
        return new h85(vliVar, vliVar2);
    }

    @yfb
    /* JADX INFO: renamed from: only-bOOhFvg, reason: not valid java name */
    public static final vli m29839onlybOOhFvg(@yfb vli vliVar, int i) {
        return new u59(vliVar, i, null);
    }

    @yfb
    public static final vli union(@yfb vli vliVar, @yfb vli vliVar2) {
        return new wsh(vliVar, vliVar2);
    }

    @yfb
    public static final vac asPaddingValues(@yfb vli vliVar, @yfb c64 c64Var) {
        return new w48(vliVar, c64Var);
    }
}
