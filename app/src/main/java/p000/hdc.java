package p000;

import java.util.List;
import p000.C9041lz;
import p000.do6;
import p000.xn6;

/* JADX INFO: loaded from: classes.dex */
public final class hdc {

    /* JADX INFO: renamed from: a */
    public static final int f43197a = Integer.MAX_VALUE;

    @yfb
    @q64(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @i2e(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public static final bdc Paragraph(@yfb String str, @yfb yvg yvgVar, @yfb List<C9041lz.c<swf>> list, @yfb List<C9041lz.c<ewc>> list2, int i, boolean z, float f, @yfb c64 c64Var, @yfb xn6.InterfaceC15211b interfaceC15211b) {
        return C2055bu.ActualParagraph(str, yvgVar, list, list2, i, z, f, c64Var, interfaceC15211b);
    }

    @yfb
    /* JADX INFO: renamed from: Paragraph-UdtVg6A, reason: not valid java name */
    public static final bdc m29987ParagraphUdtVg6A(@yfb String str, @yfb yvg yvgVar, long j, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b, @yfb List<C9041lz.c<swf>> list, @yfb List<C9041lz.c<ewc>> list2, int i, boolean z) {
        return C2055bu.m28158ActualParagraphO3s9Psw(str, yvgVar, list, list2, i, z, j, c64Var, interfaceC4891b);
    }

    @yfb
    /* JADX INFO: renamed from: Paragraph-_EkL_-Y, reason: not valid java name */
    public static final bdc m29989Paragraph_EkL_Y(@yfb fdc fdcVar, long j, int i, boolean z) {
        return C2055bu.m28157ActualParagraphhBUhpc(fdcVar, i, z, j);
    }

    /* JADX INFO: renamed from: Paragraph-_EkL_-Y$default, reason: not valid java name */
    public static /* synthetic */ bdc m29990Paragraph_EkL_Y$default(fdc fdcVar, long j, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        return m29989Paragraph_EkL_Y(fdcVar, j, i, z);
    }

    public static final int ceilToInt(float f) {
        return (int) Math.ceil(f);
    }

    @yfb
    @q64(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @i2e(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public static final bdc Paragraph(@yfb String str, @yfb yvg yvgVar, float f, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b, @yfb List<C9041lz.c<swf>> list, @yfb List<C9041lz.c<ewc>> list2, int i, boolean z) {
        return C2055bu.m28158ActualParagraphO3s9Psw(str, yvgVar, list, list2, i, z, nu2.Constraints$default(0, ceilToInt(f), 0, 0, 13, null), c64Var, interfaceC4891b);
    }

    @yfb
    @q64(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @i2e(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public static final bdc Paragraph(@yfb fdc fdcVar, int i, boolean z, float f) {
        return C2055bu.m28157ActualParagraphhBUhpc(fdcVar, i, z, nu2.Constraints$default(0, ceilToInt(f), 0, 0, 13, null));
    }

    public static /* synthetic */ bdc Paragraph$default(fdc fdcVar, int i, boolean z, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return Paragraph(fdcVar, i, z, f);
    }
}
