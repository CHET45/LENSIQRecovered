package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFontResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,77:1\n77#2:78\n361#3,7:79\n*S KotlinDebug\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n*L\n55#1:78\n69#1:79,7\n*E\n"})
public final class zo6 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final Object f105586a = new Object();

    /* JADX INFO: renamed from: b */
    @xc7("cacheLock")
    @yfb
    public static final Map<do6, zmh> f105587b = new LinkedHashMap();

    @q64(level = u64.f86865a, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @i2e(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @wqd
    @yfb
    @hk2
    public static final zmh fontResource(@yfb do6 do6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-190831095, i, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        zmh zmhVarFontResourceFromContext = fontResourceFromContext((Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext()), do6Var);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return zmhVarFontResourceFromContext;
    }

    @q64(level = u64.f86865a, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @i2e(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    private static final zmh fontResourceFromContext(Context context, do6 do6Var) {
        zmh zmhVar;
        if (!(do6Var instanceof djg) && !(do6Var instanceof rc9)) {
            return C15309xv.Typeface$default(context, do6Var, null, 4, null);
        }
        synchronized (f105586a) {
            try {
                Map<do6, zmh> map = f105587b;
                zmh zmhVarTypeface$default = map.get(do6Var);
                if (zmhVarTypeface$default == null) {
                    zmhVarTypeface$default = C15309xv.Typeface$default(context, do6Var, null, 4, null);
                    map.put(do6Var, zmhVarTypeface$default);
                }
                zmhVar = zmhVarTypeface$default;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zmhVar;
    }
}
