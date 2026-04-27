package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import p000.rs7;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nImageResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n77#2:61\n1223#3,6:62\n1223#3,6:68\n*S KotlinDebug\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n*L\n54#1:61\n55#1:62,6\n58#1:68,6\n*E\n"})
public final class uv7 {
    @yfb
    public static final rs7 imageResource(@yfb rs7.C12230a c12230a, @yfb Resources resources, @gq4 int i) {
        Drawable drawable = resources.getDrawable(i, null);
        md8.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return C5460et.asImageBitmap(((BitmapDrawable) drawable).getBitmap());
    }

    @yfb
    @hk2
    public static final rs7 imageResource(@yfb rs7.C12230a c12230a, @gq4 int i, @gib zl2 zl2Var, int i2) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-304919470, i2, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context context = (Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object objRememberedValue = zl2Var.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue == c16170a.getEmpty()) {
            objRememberedValue = new TypedValue();
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        TypedValue typedValue = (TypedValue) objRememberedValue;
        context.getResources().getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        md8.checkNotNull(charSequence);
        boolean zChanged = zl2Var.changed(charSequence.toString());
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = imageResource(c12230a, context.getResources(), i);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        rs7 rs7Var = (rs7) objRememberedValue2;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return rs7Var;
    }
}
