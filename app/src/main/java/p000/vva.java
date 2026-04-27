package p000;

import p000.do6;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMinLinesConstrainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinLinesConstrainer.kt\nandroidx/compose/foundation/text/modifiers/MinLinesConstrainer\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,140:1\n26#2:141\n*S KotlinDebug\n*F\n+ 1 MinLinesConstrainer.kt\nandroidx/compose/foundation/text/modifiers/MinLinesConstrainer\n*L\n122#1:141\n*E\n"})
@e0g(parameters = 0)
public final class vva {

    /* JADX INFO: renamed from: h */
    @yfb
    public static final C14275a f92375h = new C14275a(null);

    /* JADX INFO: renamed from: i */
    public static final int f92376i = 8;

    /* JADX INFO: renamed from: j */
    @gib
    public static vva f92377j;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ov8 f92378a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final yvg f92379b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final c64 f92380c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final do6.InterfaceC4891b f92381d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final yvg f92382e;

    /* JADX INFO: renamed from: f */
    public float f92383f;

    /* JADX INFO: renamed from: g */
    public float f92384g;

    /* JADX INFO: renamed from: vva$a */
    public static final class C14275a {
        public /* synthetic */ C14275a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final vva from(@gib vva vvaVar, @yfb ov8 ov8Var, @yfb yvg yvgVar, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b) {
            if (vvaVar != null && ov8Var == vvaVar.getLayoutDirection() && md8.areEqual(yvgVar, vvaVar.getInputTextStyle()) && c64Var.getDensity() == vvaVar.getDensity().getDensity() && interfaceC4891b == vvaVar.getFontFamilyResolver()) {
                return vvaVar;
            }
            vva vvaVar2 = vva.f92377j;
            if (vvaVar2 != null && ov8Var == vvaVar2.getLayoutDirection() && md8.areEqual(yvgVar, vvaVar2.getInputTextStyle()) && c64Var.getDensity() == vvaVar2.getDensity().getDensity() && interfaceC4891b == vvaVar2.getFontFamilyResolver()) {
                return vvaVar2;
            }
            vva vvaVar3 = new vva(ov8Var, zvg.resolveDefaults(yvgVar, ov8Var), c64Var, interfaceC4891b, null);
            C14275a c14275a = vva.f92375h;
            vva.f92377j = vvaVar3;
            return vvaVar3;
        }

        private C14275a() {
        }
    }

    public /* synthetic */ vva(ov8 ov8Var, yvg yvgVar, c64 c64Var, do6.InterfaceC4891b interfaceC4891b, jt3 jt3Var) {
        this(ov8Var, yvgVar, c64Var, interfaceC4891b);
    }

    /* JADX INFO: renamed from: coerceMinLines-Oh53vG4$foundation_release, reason: not valid java name */
    public final long m32816coerceMinLinesOh53vG4$foundation_release(long j, int i) {
        float height = this.f92384g;
        float height2 = this.f92383f;
        if (Float.isNaN(height) || Float.isNaN(height2)) {
            height = hdc.m29987ParagraphUdtVg6A(wva.f95557b, this.f92382e, nu2.Constraints$default(0, 0, 0, 0, 15, null), this.f92380c, this.f92381d, (64 & 32) != 0 ? l82.emptyList() : null, (64 & 64) != 0 ? l82.emptyList() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 1, (64 & 256) != 0 ? false : false).getHeight();
            height2 = hdc.m29987ParagraphUdtVg6A(wva.f95558c, this.f92382e, nu2.Constraints$default(0, 0, 0, 0, 15, null), this.f92380c, this.f92381d, (64 & 32) != 0 ? l82.emptyList() : null, (64 & 64) != 0 ? l82.emptyList() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 2, (64 & 256) != 0 ? false : false).getHeight() - height;
            this.f92384g = height;
            this.f92383f = height2;
        }
        return nu2.Constraints(ku2.m30765getMinWidthimpl(j), ku2.m30763getMaxWidthimpl(j), i != 1 ? kpd.coerceAtMost(kpd.coerceAtLeast(Math.round(height + (height2 * (i - 1))), 0), ku2.m30762getMaxHeightimpl(j)) : ku2.m30764getMinHeightimpl(j), ku2.m30762getMaxHeightimpl(j));
    }

    @yfb
    public final c64 getDensity() {
        return this.f92380c;
    }

    @yfb
    public final do6.InterfaceC4891b getFontFamilyResolver() {
        return this.f92381d;
    }

    @yfb
    public final yvg getInputTextStyle() {
        return this.f92379b;
    }

    @yfb
    public final ov8 getLayoutDirection() {
        return this.f92378a;
    }

    private vva(ov8 ov8Var, yvg yvgVar, c64 c64Var, do6.InterfaceC4891b interfaceC4891b) {
        this.f92378a = ov8Var;
        this.f92379b = yvgVar;
        this.f92380c = c64Var;
        this.f92381d = interfaceC4891b;
        this.f92382e = zvg.resolveDefaults(yvgVar, ov8Var);
        this.f92383f = Float.NaN;
        this.f92384g = Float.NaN;
    }
}
