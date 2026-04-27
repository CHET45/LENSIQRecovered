package p000;

import androidx.compose.p002ui.graphics.C0737d;
import androidx.compose.p002ui.graphics.InterfaceC0736c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nGraphicsLayerScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerScope.kt\nandroidx/compose/ui/graphics/GraphicsLayerScopeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,464:1\n77#2:465\n1223#3,6:466\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerScope.kt\nandroidx/compose/ui/graphics/GraphicsLayerScopeKt\n*L\n258#1:465\n259#1:466,6\n*E\n"})
public final class y97 {

    /* JADX INFO: renamed from: a */
    public static final float f100876a = 8.0f;

    /* JADX INFO: renamed from: b */
    public static final long f100877b = w82.f93556b.m32977getBlack0d7_KjU();

    @yfb
    public static final InterfaceC0736c GraphicsLayerScope() {
        return new C0737d();
    }

    public static final long getDefaultShadowColor() {
        return f100877b;
    }

    @sk2(index = -1)
    @yfb
    @hk2
    public static final u97 rememberGraphicsLayer(@gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(158092365, i, -1, "androidx.compose.ui.graphics.rememberGraphicsLayer (GraphicsLayerScope.kt:256)");
        }
        s97 s97Var = (s97) zl2Var.consume(sn2.getLocalGraphicsContext());
        Object objRememberedValue = zl2Var.rememberedValue();
        if (objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new t97(s97Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        u97 graphicsLayer = ((t97) objRememberedValue).getGraphicsLayer();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return graphicsLayer;
    }
}
