package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.C0384b;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,110:1\n76#2:111\n76#2:112\n76#2:113\n23#3,8:114\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n*L\n51#1:111\n52#1:112\n53#1:113\n53#1:114,8\n*E\n"})
@e0g(parameters = 0)
public final class pd9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final pd9 f70491a = new pd9();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final zhd<z1c> f70492b = pn2.compositionLocalOf$default(null, C10921a.f70494a, 1, null);

    /* JADX INFO: renamed from: c */
    public static final int f70493c = 0;

    /* JADX INFO: renamed from: pd9$a */
    public static final class C10921a extends tt8 implements ny6<z1c> {

        /* JADX INFO: renamed from: a */
        public static final C10921a f70494a = new C10921a();

        public C10921a() {
            super(0);
        }

        @Override // p000.ny6
        @gib
        public final z1c invoke() {
            return null;
        }
    }

    private pd9() {
    }

    @gib
    @xn8(name = "getCurrent")
    @hk2
    public final z1c getCurrent(@gib zl2 zl2Var, int i) {
        zl2Var.startReplaceableGroup(-2068013981);
        z1c z1cVar = (z1c) zl2Var.consume(f70492b);
        zl2Var.startReplaceableGroup(1680121597);
        if (z1cVar == null) {
            z1cVar = C0384b.get((View) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        }
        zl2Var.endReplaceableGroup();
        if (z1cVar == null) {
            Object baseContext = (Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof z1c) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            z1cVar = (z1c) baseContext;
        }
        zl2Var.endReplaceableGroup();
        return z1cVar;
    }

    @yfb
    public final did<z1c> provides(@yfb z1c z1cVar) {
        return f70492b.provides(z1cVar);
    }
}
