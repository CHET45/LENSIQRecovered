package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p000.dw7;
import p000.ew7;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVectorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n77#2:154\n1223#3,6:155\n1#4:161\n*S KotlinDebug\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n*L\n49#1:154\n53#1:155,6\n*E\n"})
public final class r3i {
    @yfb
    public static final ew7.C5496a loadVectorResourceInner(@gib Resources.Theme theme, @yfb Resources resources, @yfb XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException, IOException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        C4538cw c4538cw = new C4538cw(xmlResourceParser, 0, 2, null);
        dw7.C4988a c4988aCreateVectorImageBuilder = dti.createVectorImageBuilder(c4538cw, resources, theme, attributeSetAsAttributeSet);
        int currentVectorNode = 0;
        while (!dti.isAtEnd(xmlResourceParser)) {
            currentVectorNode = dti.parseCurrentVectorNode(c4538cw, resources, attributeSetAsAttributeSet, theme, c4988aCreateVectorImageBuilder, currentVectorNode);
            xmlResourceParser.next();
        }
        return new ew7.C5496a(c4988aCreateVectorImageBuilder.build(), i);
    }

    public static /* synthetic */ ew7.C5496a loadVectorResourceInner$default(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i, int i2, Object obj) throws XmlPullParserException {
        if ((i2 & 1) != 0) {
            theme = null;
        }
        return loadVectorResourceInner(theme, resources, xmlResourceParser, i);
    }

    @yfb
    @hk2
    public static final dw7 vectorResource(@yfb dw7.C4989b c4989b, @gq4 int i, @gib zl2 zl2Var, int i2) throws XmlPullParserException, IOException {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(44534090, i2, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Context context = (Context) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = n7e.resources(zl2Var, 0);
        Resources.Theme theme = context.getTheme();
        boolean zChanged = zl2Var.changed(resources) | ((((i2 & 112) ^ 48) > 32 && zl2Var.changed(i)) || (i2 & 48) == 32) | zl2Var.changed(theme) | zl2Var.changed(resources.getConfiguration());
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = vectorResource(c4989b, theme, resources, i);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        dw7 dw7Var = (dw7) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return dw7Var;
    }

    public static /* synthetic */ dw7 vectorResource$default(dw7.C4989b c4989b, Resources.Theme theme, Resources resources, int i, int i2, Object obj) throws XmlPullParserException {
        if ((i2 & 1) != 0) {
            theme = null;
        }
        return vectorResource(c4989b, theme, resources, i);
    }

    @yfb
    public static final dw7 vectorResource(@yfb dw7.C4989b c4989b, @gib Resources.Theme theme, @yfb Resources resources, int i) throws XmlPullParserException, IOException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        XmlResourceParser xml = resources.getXml(i);
        dti.seekToStartTag(xml);
        bth bthVar = bth.f14751a;
        return loadVectorResourceInner(theme, resources, xml, typedValue.changingConfigurations).getImageVector();
    }
}
