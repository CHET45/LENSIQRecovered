package p000;

import java.util.ArrayList;
import java.util.List;
import p000.C9041lz;
import p000.do6;
import p000.xn6;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n915#2:155\n916#2,5:164\n151#3,3:156\n33#3,4:159\n154#3:163\n155#3:169\n38#3:170\n156#3:171\n101#3,2:172\n33#3,6:174\n103#3:180\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n*L\n96#1:155\n96#1:164,5\n96#1:156,3\n96#1:159,4\n96#1:163\n96#1:169\n96#1:170\n96#1:171\n121#1:172,2\n121#1:174,6\n121#1:180\n*E\n"})
@e0g(parameters = 0)
public final class v2b implements fdc {

    /* JADX INFO: renamed from: f */
    public static final int f89789f = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C9041lz f89790a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<C9041lz.c<ewc>> f89791b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final fx8 f89792c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final fx8 f89793d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final List<edc> f89794e;

    /* JADX INFO: renamed from: v2b$a */
    @dwf({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$maxIntrinsicWidth$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n171#2,13:155\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$maxIntrinsicWidth$2\n*L\n82#1:155,13\n*E\n"})
    public static final class C13833a extends tt8 implements ny6<Float> {
        public C13833a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Float invoke() {
            edc edcVar;
            fdc intrinsics;
            List<edc> infoList$ui_text_release = v2b.this.getInfoList$ui_text_release();
            if (infoList$ui_text_release.isEmpty()) {
                edcVar = null;
            } else {
                edc edcVar2 = infoList$ui_text_release.get(0);
                float maxIntrinsicWidth = edcVar2.getIntrinsics().getMaxIntrinsicWidth();
                int lastIndex = l82.getLastIndex(infoList$ui_text_release);
                int i = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        edc edcVar3 = infoList$ui_text_release.get(i);
                        float maxIntrinsicWidth2 = edcVar3.getIntrinsics().getMaxIntrinsicWidth();
                        if (Float.compare(maxIntrinsicWidth, maxIntrinsicWidth2) < 0) {
                            edcVar2 = edcVar3;
                            maxIntrinsicWidth = maxIntrinsicWidth2;
                        }
                        if (i == lastIndex) {
                            break;
                        }
                        i++;
                    }
                }
                edcVar = edcVar2;
            }
            edc edcVar4 = edcVar;
            return Float.valueOf((edcVar4 == null || (intrinsics = edcVar4.getIntrinsics()) == null) ? 0.0f : intrinsics.getMaxIntrinsicWidth());
        }
    }

    /* JADX INFO: renamed from: v2b$b */
    @dwf({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n171#2,13:155\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2\n*L\n76#1:155,13\n*E\n"})
    public static final class C13834b extends tt8 implements ny6<Float> {
        public C13834b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Float invoke() {
            edc edcVar;
            fdc intrinsics;
            List<edc> infoList$ui_text_release = v2b.this.getInfoList$ui_text_release();
            if (infoList$ui_text_release.isEmpty()) {
                edcVar = null;
            } else {
                edc edcVar2 = infoList$ui_text_release.get(0);
                float minIntrinsicWidth = edcVar2.getIntrinsics().getMinIntrinsicWidth();
                int lastIndex = l82.getLastIndex(infoList$ui_text_release);
                int i = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        edc edcVar3 = infoList$ui_text_release.get(i);
                        float minIntrinsicWidth2 = edcVar3.getIntrinsics().getMinIntrinsicWidth();
                        if (Float.compare(minIntrinsicWidth, minIntrinsicWidth2) < 0) {
                            edcVar2 = edcVar3;
                            minIntrinsicWidth = minIntrinsicWidth2;
                        }
                        if (i == lastIndex) {
                            break;
                        }
                        i++;
                    }
                }
                edcVar = edcVar2;
            }
            edc edcVar4 = edcVar;
            return Float.valueOf((edcVar4 == null || (intrinsics = edcVar4.getIntrinsics()) == null) ? 0.0f : intrinsics.getMinIntrinsicWidth());
        }
    }

    public v2b(@yfb C9041lz c9041lz, @yfb yvg yvgVar, @yfb List<C9041lz.c<ewc>> list, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b) {
        this.f89790a = c9041lz;
        this.f89791b = list;
        g39 g39Var = g39.f38327c;
        this.f89792c = hz8.lazy(g39Var, (ny6) new C13834b());
        this.f89793d = hz8.lazy(g39Var, (ny6) new C13833a());
        kdc paragraphStyle = yvgVar.toParagraphStyle();
        List<C9041lz.c<kdc>> listNormalizedParagraphStyles = C9611mz.normalizedParagraphStyles(c9041lz, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i = 0; i < size; i++) {
            C9041lz.c<kdc> cVar = listNormalizedParagraphStyles.get(i);
            C9041lz c9041lzSubstringWithoutParagraphStyles = C9611mz.substringWithoutParagraphStyles(c9041lz, cVar.getStart(), cVar.getEnd());
            arrayList.add(new edc(gdc.ParagraphIntrinsics(c9041lzSubstringWithoutParagraphStyles.getText(), yvgVar.merge(resolveTextDirection(cVar.getItem(), paragraphStyle)), c9041lzSubstringWithoutParagraphStyles.getSpanStyles(), (List<C9041lz.c<ewc>>) w2b.getLocalPlaceholders(getPlaceholders(), cVar.getStart(), cVar.getEnd()), c64Var, interfaceC4891b), cVar.getStart(), cVar.getEnd()));
        }
        this.f89794e = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kdc resolveTextDirection(kdc kdcVar, kdc kdcVar2) {
        return !wqg.m33087equalsimpl0(kdcVar.m30682getTextDirections_7Xco(), wqg.f95173b.m33096getUnspecifieds_7Xco()) ? kdcVar : kdcVar.m30673copyykzQM6k((509 & 1) != 0 ? kdcVar.f53662a : 0, (509 & 2) != 0 ? kdcVar.f53663b : kdcVar2.m30682getTextDirections_7Xco(), (509 & 4) != 0 ? kdcVar.f53664c : 0L, (509 & 8) != 0 ? kdcVar.f53665d : null, (509 & 16) != 0 ? kdcVar.f53666e : null, (509 & 32) != 0 ? kdcVar.f53667f : null, (509 & 64) != 0 ? kdcVar.f53668g : 0, (509 & 128) != 0 ? kdcVar.f53669h : 0, (509 & 256) != 0 ? kdcVar.f53670i : null);
    }

    @yfb
    public final C9041lz getAnnotatedString() {
        return this.f89790a;
    }

    @Override // p000.fdc
    public boolean getHasStaleResolvedFonts() {
        List<edc> list = this.f89794e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getIntrinsics().getHasStaleResolvedFonts()) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public final List<edc> getInfoList$ui_text_release() {
        return this.f89794e;
    }

    @Override // p000.fdc
    public float getMaxIntrinsicWidth() {
        return ((Number) this.f89793d.getValue()).floatValue();
    }

    @Override // p000.fdc
    public float getMinIntrinsicWidth() {
        return ((Number) this.f89792c.getValue()).floatValue();
    }

    @yfb
    public final List<C9041lz.c<ewc>> getPlaceholders() {
        return this.f89791b;
    }

    @q64(message = "Font.ResourceLoader is deprecated, call with fontFamilyResolver", replaceWith = @i2e(expression = "MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver)", imports = {}))
    public v2b(@yfb C9041lz c9041lz, @yfb yvg yvgVar, @yfb List<C9041lz.c<ewc>> list, @yfb c64 c64Var, @yfb xn6.InterfaceC15211b interfaceC15211b) {
        this(c9041lz, yvgVar, list, c64Var, c44.createFontFamilyResolver(interfaceC15211b));
    }
}
