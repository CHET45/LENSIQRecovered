package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.appcompat.widget.C0546a;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.mediarouter.media.C1340j;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p000.ew7;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPainterResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,130:1\n77#2:131\n77#2:132\n77#2:133\n77#2:140\n1223#3,6:134\n*S KotlinDebug\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n*L\n59#1:131\n62#1:132\n64#1:133\n93#1:140\n74#1:134,6\n*E\n"})
public final class qcc {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f73972a = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP";

    private static final rs7 loadImageBitmapResource(CharSequence charSequence, Resources resources, int i) {
        try {
            return uv7.imageResource(rs7.f79192a, resources, i);
        } catch (Exception e) {
            throw new x6e("Error attempting to load resource: " + ((Object) charSequence), e);
        }
    }

    @hk2
    private static final dw7 loadVectorResource(Resources.Theme theme, Resources resources, int i, int i2, zl2 zl2Var, int i3) throws XmlPullParserException, IOException {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(21855625, i3, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:91)");
        }
        ew7 ew7Var = (ew7) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        ew7.C5497b c5497b = new ew7.C5497b(theme, i);
        ew7.C5496a c5496aLoadVectorResourceInner = ew7Var.get(c5497b);
        if (c5496aLoadVectorResourceInner == null) {
            XmlResourceParser xml = resources.getXml(i);
            if (!md8.areEqual(dti.seekToStartTag(xml).getName(), i3i.f45632Y)) {
                throw new IllegalArgumentException(f73972a);
            }
            c5496aLoadVectorResourceInner = r3i.loadVectorResourceInner(theme, resources, xml, i2);
            ew7Var.set(c5497b, c5496aLoadVectorResourceInner);
        }
        dw7 imageVector = c5496aLoadVectorResourceInner.getImageVector();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return imageVector;
    }

    @yfb
    @hk2
    public static final occ painterResource(@gq4 int i, @gib zl2 zl2Var, int i2) {
        occ c41Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(473971343, i2, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:57)");
        }
        Context context = (Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = context.getResources();
        TypedValue typedValueResolveResourcePath = ((j6e) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalResourceIdCache())).resolveResourcePath(resources, i);
        CharSequence charSequence = typedValueResolveResourcePath.string;
        boolean z = true;
        if (charSequence == null || !m9g.endsWith$default(charSequence, (CharSequence) C0546a.f3363y, false, 2, (Object) null)) {
            zl2Var.startReplaceGroup(-802884675);
            Object theme = context.getTheme();
            boolean zChanged = zl2Var.changed(charSequence);
            if ((((i2 & 14) ^ 6) <= 4 || !zl2Var.changed(i)) && (i2 & 6) != 4) {
                z = false;
            }
            boolean zChanged2 = zChanged | z | zl2Var.changed(theme);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged2 || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = loadImageBitmapResource(charSequence, resources, i);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            c41Var = new c41((rs7) objRememberedValue, 0L, 0L, 6, null);
            zl2Var.endReplaceGroup();
        } else {
            zl2Var.startReplaceGroup(-803040357);
            c41Var = o3i.rememberVectorPainter(loadVectorResource(context.getTheme(), resources, i, typedValueResolveResourcePath.changingConfigurations, zl2Var, (i2 << 6) & C1340j.f10444b), zl2Var, 0);
            zl2Var.endReplaceGroup();
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return c41Var;
    }
}
