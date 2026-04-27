package p000;

import java.util.List;
import p000.C9041lz;
import p000.do6;
import p000.xn6;

/* JADX INFO: loaded from: classes.dex */
public final class gdc {
    @yfb
    @q64(message = "Font.ResourceLoader is deprecated, instead use FontFamily.Resolver", replaceWith = @i2e(expression = "ParagraphIntrinsics(text, style, spanStyles, placeholders, density, fontFamilyResolver", imports = {}))
    public static final fdc ParagraphIntrinsics(@yfb String str, @yfb yvg yvgVar, @yfb List<C9041lz.c<swf>> list, @yfb List<C9041lz.c<ewc>> list2, @yfb c64 c64Var, @yfb xn6.InterfaceC15211b interfaceC15211b) {
        return C1608au.ActualParagraphIntrinsics(str, yvgVar, list, list2, c64Var, c44.createFontFamilyResolver(interfaceC15211b));
    }

    public static /* synthetic */ fdc ParagraphIntrinsics$default(String str, yvg yvgVar, List list, List list2, c64 c64Var, xn6.InterfaceC15211b interfaceC15211b, int i, Object obj) {
        if ((i & 4) != 0) {
            list = l82.emptyList();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = l82.emptyList();
        }
        return ParagraphIntrinsics(str, yvgVar, (List<C9041lz.c<swf>>) list3, (List<C9041lz.c<ewc>>) list2, c64Var, interfaceC15211b);
    }

    @yfb
    public static final fdc ParagraphIntrinsics(@yfb String str, @yfb yvg yvgVar, @yfb List<C9041lz.c<swf>> list, @yfb List<C9041lz.c<ewc>> list2, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b) {
        return C1608au.ActualParagraphIntrinsics(str, yvgVar, list, list2, c64Var, interfaceC4891b);
    }

    public static /* synthetic */ fdc ParagraphIntrinsics$default(String str, yvg yvgVar, List list, List list2, c64 c64Var, do6.InterfaceC4891b interfaceC4891b, int i, Object obj) {
        if ((i & 4) != 0) {
            list = l82.emptyList();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = l82.emptyList();
        }
        return ParagraphIntrinsics(str, yvgVar, (List<C9041lz.c<swf>>) list3, (List<C9041lz.c<ewc>>) list2, c64Var, interfaceC4891b);
    }
}
