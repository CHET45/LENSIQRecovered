package p000;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;

/* JADX INFO: renamed from: tt */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidMultiParagraphDraw.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMultiParagraphDraw.android.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDraw_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n33#2,6:96\n33#2,6:102\n33#2,6:108\n*S KotlinDebug\n*F\n+ 1 AndroidMultiParagraphDraw.android.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDraw_androidKt\n*L\n53#1:96,6\n60#1:102,6\n90#1:108,6\n*E\n"})
public final class C13186tt {
    /* JADX INFO: renamed from: drawMultiParagraph-7AXcY_I, reason: not valid java name */
    public static final void m32438drawMultiParagraph7AXcY_I(@yfb u2b u2bVar, @yfb vq1 vq1Var, @yfb he1 he1Var, float f, @gib e8f e8fVar, @gib qqg qqgVar, @gib rp4 rp4Var, int i) {
        vq1Var.save();
        if (u2bVar.getParagraphInfoList$ui_text_release().size() <= 1 || (he1Var instanceof bvf)) {
            m32440drawParagraphs7AXcY_I(u2bVar, vq1Var, he1Var, f, e8fVar, qqgVar, rp4Var, i);
        } else if (he1Var instanceof a8f) {
            List<ddc> paragraphInfoList$ui_text_release = u2bVar.getParagraphInfoList$ui_text_release();
            int size = paragraphInfoList$ui_text_release.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                ddc ddcVar = paragraphInfoList$ui_text_release.get(i2);
                height += ddcVar.getParagraph().getHeight();
                fMax = Math.max(fMax, ddcVar.getParagraph().getWidth());
            }
            Shader shaderMo27218createShaderuvyYCjk = ((a8f) he1Var).mo27218createShaderuvyYCjk(eqf.Size(fMax, height));
            Matrix matrix = new Matrix();
            shaderMo27218createShaderuvyYCjk.getLocalMatrix(matrix);
            List<ddc> paragraphInfoList$ui_text_release2 = u2bVar.getParagraphInfoList$ui_text_release();
            int size2 = paragraphInfoList$ui_text_release2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ddc ddcVar2 = paragraphInfoList$ui_text_release2.get(i3);
                ddcVar2.getParagraph().mo27988painthn5TExg(vq1Var, ie1.ShaderBrush(shaderMo27218createShaderuvyYCjk), f, e8fVar, qqgVar, rp4Var, i);
                vq1Var.translate(0.0f, ddcVar2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -ddcVar2.getParagraph().getHeight());
                shaderMo27218createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        vq1Var.restore();
    }

    /* JADX INFO: renamed from: drawParagraphs-7AXcY_I, reason: not valid java name */
    private static final void m32440drawParagraphs7AXcY_I(u2b u2bVar, vq1 vq1Var, he1 he1Var, float f, e8f e8fVar, qqg qqgVar, rp4 rp4Var, int i) {
        List<ddc> paragraphInfoList$ui_text_release = u2bVar.getParagraphInfoList$ui_text_release();
        int size = paragraphInfoList$ui_text_release.size();
        for (int i2 = 0; i2 < size; i2++) {
            ddc ddcVar = paragraphInfoList$ui_text_release.get(i2);
            ddcVar.getParagraph().mo27988painthn5TExg(vq1Var, he1Var, f, e8fVar, qqgVar, rp4Var, i);
            vq1Var.translate(0.0f, ddcVar.getParagraph().getHeight());
        }
    }
}
