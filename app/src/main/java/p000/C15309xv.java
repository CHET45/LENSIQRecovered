package p000;

import android.content.Context;
import android.graphics.Typeface;
import java.util.List;

/* JADX INFO: renamed from: xv */
/* JADX INFO: loaded from: classes.dex */
public final class C15309xv {
    @yfb
    public static final do6 FontFamily(@yfb Typeface typeface) {
        return eo6.FontFamily(Typeface(typeface));
    }

    @yfb
    @q64(level = u64.f86865a, message = "This API is deprecated with the introduction of async fonts which cannot resolve in this context. To preload fonts, use FontFamily.Resolver.", replaceWith = @i2e(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    public static final zmh Typeface(@yfb Context context, @yfb do6 do6Var, @gib List<scc<jp6, fp6>> list) {
        if (do6Var instanceof lo6) {
            return new C12229rs((lo6) do6Var, context, list, null, 8, null);
        }
        if (do6Var instanceof z27) {
            return new C16236zs((z27) do6Var);
        }
        if (do6Var instanceof gv3) {
            return new C1582as();
        }
        if (do6Var instanceof rc9) {
            return ((rc9) do6Var).getTypeface();
        }
        throw new ceb();
    }

    public static /* synthetic */ zmh Typeface$default(Context context, do6 do6Var, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        return Typeface(context, do6Var, list);
    }

    @yfb
    public static final zmh Typeface(@yfb Typeface typeface) {
        return new C14804wv(typeface);
    }
}
