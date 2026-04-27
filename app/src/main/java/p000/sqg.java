package p000;

import java.util.List;
import p000.C9041lz;
import p000.do6;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nTextDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1#2:350\n*E\n"})
public final class sqg {

    /* JADX INFO: renamed from: l */
    @yfb
    public static final C12751a f82639l = new C12751a(null);

    /* JADX INFO: renamed from: m */
    public static final int f82640m = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C9041lz f82641a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final yvg f82642b;

    /* JADX INFO: renamed from: c */
    public final int f82643c;

    /* JADX INFO: renamed from: d */
    public final int f82644d;

    /* JADX INFO: renamed from: e */
    public final boolean f82645e;

    /* JADX INFO: renamed from: f */
    public final int f82646f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final c64 f82647g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final do6.InterfaceC4891b f82648h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final List<C9041lz.c<ewc>> f82649i;

    /* JADX INFO: renamed from: j */
    @gib
    public v2b f82650j;

    /* JADX INFO: renamed from: k */
    @gib
    public ov8 f82651k;

    /* JADX INFO: renamed from: sqg$a */
    public static final class C12751a {
        public /* synthetic */ C12751a(jt3 jt3Var) {
            this();
        }

        public final void paint(@yfb vq1 vq1Var, @yfb hug hugVar) {
            dvg.f31086a.paint(vq1Var, hugVar);
        }

        private C12751a() {
        }
    }

    public /* synthetic */ sqg(C9041lz c9041lz, yvg yvgVar, int i, int i2, boolean z, int i3, c64 c64Var, do6.InterfaceC4891b interfaceC4891b, List list, jt3 jt3Var) {
        this(c9041lz, yvgVar, i, i2, z, i3, c64Var, interfaceC4891b, list);
    }

    private final v2b getNonNullIntrinsics() {
        v2b v2bVar = this.f82650j;
        if (v2bVar != null) {
            return v2bVar;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* JADX INFO: renamed from: layout-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ hug m32315layoutNN6EwU$default(sqg sqgVar, long j, ov8 ov8Var, hug hugVar, int i, Object obj) {
        if ((i & 4) != 0) {
            hugVar = null;
        }
        return sqgVar.m32318layoutNN6EwU(j, ov8Var, hugVar);
    }

    /* JADX INFO: renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final u2b m32316layoutTextK40F9xA(long j, ov8 ov8Var) {
        layoutIntrinsics(ov8Var);
        int iM30765getMinWidthimpl = ku2.m30765getMinWidthimpl(j);
        int iM30763getMaxWidthimpl = ((this.f82645e || bvg.m28164equalsimpl0(this.f82646f, bvg.f14961b.m28172getEllipsisgIe3tQ8())) && ku2.m30759getHasBoundedWidthimpl(j)) ? ku2.m30763getMaxWidthimpl(j) : Integer.MAX_VALUE;
        int i = (this.f82645e || !bvg.m28164equalsimpl0(this.f82646f, bvg.f14961b.m28172getEllipsisgIe3tQ8())) ? this.f82643c : 1;
        if (iM30765getMinWidthimpl != iM30763getMaxWidthimpl) {
            iM30763getMaxWidthimpl = kpd.coerceIn(getMaxIntrinsicWidth(), iM30765getMinWidthimpl, iM30763getMaxWidthimpl);
        }
        return new u2b(getNonNullIntrinsics(), ku2.f55323b.m30772fitPrioritizingWidthZbe2FdA(0, iM30763getMaxWidthimpl, 0, ku2.m30762getMaxHeightimpl(j)), i, bvg.m28164equalsimpl0(this.f82646f, bvg.f14961b.m28172getEllipsisgIe3tQ8()), null);
    }

    @yfb
    public final c64 getDensity() {
        return this.f82647g;
    }

    @yfb
    public final do6.InterfaceC4891b getFontFamilyResolver() {
        return this.f82648h;
    }

    @gib
    public final ov8 getIntrinsicsLayoutDirection$foundation_release() {
        return this.f82651k;
    }

    public final int getMaxIntrinsicWidth() {
        return uqg.ceilToIntPx(getNonNullIntrinsics().getMaxIntrinsicWidth());
    }

    public final int getMaxLines() {
        return this.f82643c;
    }

    public final int getMinIntrinsicWidth() {
        return uqg.ceilToIntPx(getNonNullIntrinsics().getMinIntrinsicWidth());
    }

    public final int getMinLines() {
        return this.f82644d;
    }

    /* JADX INFO: renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m32317getOverflowgIe3tQ8() {
        return this.f82646f;
    }

    @gib
    public final v2b getParagraphIntrinsics$foundation_release() {
        return this.f82650j;
    }

    @yfb
    public final List<C9041lz.c<ewc>> getPlaceholders() {
        return this.f82649i;
    }

    public final boolean getSoftWrap() {
        return this.f82645e;
    }

    @yfb
    public final yvg getStyle() {
        return this.f82642b;
    }

    @yfb
    public final C9041lz getText() {
        return this.f82641a;
    }

    @yfb
    /* JADX INFO: renamed from: layout-NN6Ew-U, reason: not valid java name */
    public final hug m32318layoutNN6EwU(long j, @yfb ov8 ov8Var, @gib hug hugVar) {
        if (hugVar != null && fug.m29666canReuse7_7YC6M(hugVar, this.f82641a, this.f82642b, this.f82649i, this.f82643c, this.f82645e, this.f82646f, this.f82647g, ov8Var, this.f82648h, j)) {
            return hugVar.m30128copyO0kMr_c(new gug(hugVar.getLayoutInput().getText(), this.f82642b, hugVar.getLayoutInput().getPlaceholders(), hugVar.getLayoutInput().getMaxLines(), hugVar.getLayoutInput().getSoftWrap(), hugVar.getLayoutInput().m29858getOverflowgIe3tQ8(), hugVar.getLayoutInput().getDensity(), hugVar.getLayoutInput().getLayoutDirection(), hugVar.getLayoutInput().getFontFamilyResolver(), j, (jt3) null), nu2.m31224constrain4WqzIAM(j, s78.IntSize(uqg.ceilToIntPx(hugVar.getMultiParagraph().getWidth()), uqg.ceilToIntPx(hugVar.getMultiParagraph().getHeight()))));
        }
        u2b u2bVarM32316layoutTextK40F9xA = m32316layoutTextK40F9xA(j, ov8Var);
        return new hug(new gug(this.f82641a, this.f82642b, this.f82649i, this.f82643c, this.f82645e, this.f82646f, this.f82647g, ov8Var, this.f82648h, j, (jt3) null), u2bVarM32316layoutTextK40F9xA, nu2.m31224constrain4WqzIAM(j, s78.IntSize(uqg.ceilToIntPx(u2bVarM32316layoutTextK40F9xA.getWidth()), uqg.ceilToIntPx(u2bVarM32316layoutTextK40F9xA.getHeight()))), null);
    }

    public final void layoutIntrinsics(@yfb ov8 ov8Var) {
        v2b v2bVar = this.f82650j;
        if (v2bVar == null || ov8Var != this.f82651k || v2bVar.getHasStaleResolvedFonts()) {
            this.f82651k = ov8Var;
            v2bVar = new v2b(this.f82641a, zvg.resolveDefaults(this.f82642b, ov8Var), this.f82649i, this.f82647g, this.f82648h);
        }
        this.f82650j = v2bVar;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(@gib ov8 ov8Var) {
        this.f82651k = ov8Var;
    }

    public final void setParagraphIntrinsics$foundation_release(@gib v2b v2bVar) {
        this.f82650j = v2bVar;
    }

    private sqg(C9041lz c9041lz, yvg yvgVar, int i, int i2, boolean z, int i3, c64 c64Var, do6.InterfaceC4891b interfaceC4891b, List<C9041lz.c<ewc>> list) {
        this.f82641a = c9041lz;
        this.f82642b = yvgVar;
        this.f82643c = i;
        this.f82644d = i2;
        this.f82645e = z;
        this.f82646f = i3;
        this.f82647g = c64Var;
        this.f82648h = interfaceC4891b;
        this.f82649i = list;
        if (i <= 0) {
            throw new IllegalArgumentException("no maxLines");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("no minLines");
        }
        if (i2 > i) {
            throw new IllegalArgumentException("minLines greater than maxLines");
        }
    }

    public /* synthetic */ sqg(C9041lz c9041lz, yvg yvgVar, int i, int i2, boolean z, int i3, c64 c64Var, do6.InterfaceC4891b interfaceC4891b, List list, int i4, jt3 jt3Var) {
        this(c9041lz, yvgVar, (i4 & 4) != 0 ? Integer.MAX_VALUE : i, (i4 & 8) != 0 ? 1 : i2, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? bvg.f14961b.m28171getClipgIe3tQ8() : i3, c64Var, interfaceC4891b, (i4 & 256) != 0 ? l82.emptyList() : list, null);
    }
}
