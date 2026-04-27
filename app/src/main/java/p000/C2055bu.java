package p000;

import java.util.List;
import p000.C9041lz;
import p000.do6;
import p000.xn6;

/* JADX INFO: renamed from: bu */
/* JADX INFO: loaded from: classes.dex */
@xn8(name = "AndroidParagraph_androidKt")
public final class C2055bu {
    @yfb
    @q64(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @i2e(expression = "ActualParagraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public static final bdc ActualParagraph(@yfb String str, @yfb yvg yvgVar, @yfb List<C9041lz.c<swf>> list, @yfb List<C9041lz.c<ewc>> list2, int i, boolean z, float f, @yfb c64 c64Var, @yfb xn6.InterfaceC15211b interfaceC15211b) {
        return new C15270xt(new C16248zt(str, yvgVar, list, list2, c44.createFontFamilyResolver(interfaceC15211b), c64Var), i, z, nu2.Constraints$default(0, hdc.ceilToInt(f), 0, 0, 13, null), null);
    }

    @yfb
    /* JADX INFO: renamed from: ActualParagraph--hBUhpc, reason: not valid java name */
    public static final bdc m28157ActualParagraphhBUhpc(@yfb fdc fdcVar, int i, boolean z, long j) {
        md8.checkNotNull(fdcVar, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new C15270xt((C16248zt) fdcVar, i, z, j, null);
    }

    @yfb
    /* JADX INFO: renamed from: ActualParagraph-O3s9Psw, reason: not valid java name */
    public static final bdc m28158ActualParagraphO3s9Psw(@yfb String str, @yfb yvg yvgVar, @yfb List<C9041lz.c<swf>> list, @yfb List<C9041lz.c<ewc>> list2, int i, boolean z, long j, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b) {
        return new C15270xt(new C16248zt(str, yvgVar, list, list2, interfaceC4891b, c64Var), i, z, j, null);
    }
}
