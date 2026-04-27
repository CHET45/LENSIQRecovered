package p000;

import java.util.List;
import p000.C9041lz;
import p000.do6;
import p000.vva;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n1#2:399\n*E\n"})
@e0g(parameters = 0)
public final class idc {

    /* JADX INFO: renamed from: s */
    public static final int f46553s = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public String f46554a;

    /* JADX INFO: renamed from: b */
    @yfb
    public yvg f46555b;

    /* JADX INFO: renamed from: c */
    @yfb
    public do6.InterfaceC4891b f46556c;

    /* JADX INFO: renamed from: d */
    public int f46557d;

    /* JADX INFO: renamed from: e */
    public boolean f46558e;

    /* JADX INFO: renamed from: f */
    public int f46559f;

    /* JADX INFO: renamed from: g */
    public int f46560g;

    /* JADX INFO: renamed from: h */
    public long f46561h;

    /* JADX INFO: renamed from: i */
    @gib
    public c64 f46562i;

    /* JADX INFO: renamed from: j */
    @gib
    public bdc f46563j;

    /* JADX INFO: renamed from: k */
    public boolean f46564k;

    /* JADX INFO: renamed from: l */
    public long f46565l;

    /* JADX INFO: renamed from: m */
    @gib
    public vva f46566m;

    /* JADX INFO: renamed from: n */
    @gib
    public fdc f46567n;

    /* JADX INFO: renamed from: o */
    @gib
    public ov8 f46568o;

    /* JADX INFO: renamed from: p */
    public long f46569p;

    /* JADX INFO: renamed from: q */
    public int f46570q;

    /* JADX INFO: renamed from: r */
    public int f46571r;

    public /* synthetic */ idc(String str, yvg yvgVar, do6.InterfaceC4891b interfaceC4891b, int i, boolean z, int i2, int i3, jt3 jt3Var) {
        this(str, yvgVar, interfaceC4891b, i, z, i2, i3);
    }

    /* JADX INFO: renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final bdc m30204layoutTextK40F9xA(long j, ov8 ov8Var) {
        fdc layoutDirection = setLayoutDirection(ov8Var);
        return hdc.m29989Paragraph_EkL_Y(layoutDirection, yw8.m33453finalConstraintstfFHcEY(j, this.f46558e, this.f46557d, layoutDirection.getMaxIntrinsicWidth()), yw8.m33454finalMaxLinesxdlQI24(this.f46558e, this.f46557d, this.f46559f), bvg.m28164equalsimpl0(this.f46557d, bvg.f14961b.m28172getEllipsisgIe3tQ8()));
    }

    private final void markDirty() {
        this.f46563j = null;
        this.f46567n = null;
        this.f46568o = null;
        this.f46570q = -1;
        this.f46571r = -1;
        this.f46569p = ku2.f55323b.m30773fixedJhjzzOo(0, 0);
        this.f46565l = s78.IntSize(0, 0);
        this.f46564k = false;
    }

    /* JADX INFO: renamed from: newLayoutWillBeDifferent-K40F9xA, reason: not valid java name */
    private final boolean m30205newLayoutWillBeDifferentK40F9xA(long j, ov8 ov8Var) {
        fdc fdcVar;
        bdc bdcVar = this.f46563j;
        if (bdcVar == null || (fdcVar = this.f46567n) == null || fdcVar.getHasStaleResolvedFonts() || ov8Var != this.f46568o) {
            return true;
        }
        if (ku2.m30756equalsimpl0(j, this.f46569p)) {
            return false;
        }
        return ku2.m30763getMaxWidthimpl(j) != ku2.m30763getMaxWidthimpl(this.f46569p) || ((float) ku2.m30762getMaxHeightimpl(j)) < bdcVar.getHeight() || bdcVar.getDidExceedMaxLines();
    }

    private final fdc setLayoutDirection(ov8 ov8Var) {
        fdc fdcVarParagraphIntrinsics$default = this.f46567n;
        if (fdcVarParagraphIntrinsics$default == null || ov8Var != this.f46568o || fdcVarParagraphIntrinsics$default.getHasStaleResolvedFonts()) {
            this.f46568o = ov8Var;
            String str = this.f46554a;
            yvg yvgVarResolveDefaults = zvg.resolveDefaults(this.f46555b, ov8Var);
            c64 c64Var = this.f46562i;
            md8.checkNotNull(c64Var);
            fdcVarParagraphIntrinsics$default = gdc.ParagraphIntrinsics$default(str, yvgVarResolveDefaults, (List) null, (List) null, c64Var, this.f46556c, 12, (Object) null);
        }
        this.f46567n = fdcVarParagraphIntrinsics$default;
        return fdcVarParagraphIntrinsics$default;
    }

    @gib
    public final c64 getDensity$foundation_release() {
        return this.f46562i;
    }

    public final boolean getDidOverflow$foundation_release() {
        return this.f46564k;
    }

    /* JADX INFO: renamed from: getLayoutSize-YbymL2g$foundation_release, reason: not valid java name */
    public final long m30206getLayoutSizeYbymL2g$foundation_release() {
        return this.f46565l;
    }

    @yfb
    public final bth getObserveFontChanges$foundation_release() {
        fdc fdcVar = this.f46567n;
        if (fdcVar != null) {
            fdcVar.getHasStaleResolvedFonts();
        }
        return bth.f14751a;
    }

    @gib
    public final bdc getParagraph$foundation_release() {
        return this.f46563j;
    }

    public final int intrinsicHeight(int i, @yfb ov8 ov8Var) {
        int i2 = this.f46570q;
        int i3 = this.f46571r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int iCeilToIntPx = uqg.ceilToIntPx(m30204layoutTextK40F9xA(nu2.Constraints(0, i, 0, Integer.MAX_VALUE), ov8Var).getHeight());
        this.f46570q = i;
        this.f46571r = iCeilToIntPx;
        return iCeilToIntPx;
    }

    /* JADX INFO: renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m30207layoutWithConstraintsK40F9xA(long j, @yfb ov8 ov8Var) {
        boolean z = true;
        if (this.f46560g > 1) {
            vva.C14275a c14275a = vva.f92375h;
            vva vvaVar = this.f46566m;
            yvg yvgVar = this.f46555b;
            c64 c64Var = this.f46562i;
            md8.checkNotNull(c64Var);
            vva vvaVarFrom = c14275a.from(vvaVar, ov8Var, yvgVar, c64Var, this.f46556c);
            this.f46566m = vvaVarFrom;
            j = vvaVarFrom.m32816coerceMinLinesOh53vG4$foundation_release(j, this.f46560g);
        }
        boolean z2 = false;
        if (m30205newLayoutWillBeDifferentK40F9xA(j, ov8Var)) {
            bdc bdcVarM30204layoutTextK40F9xA = m30204layoutTextK40F9xA(j, ov8Var);
            this.f46569p = j;
            this.f46565l = nu2.m31224constrain4WqzIAM(j, s78.IntSize(uqg.ceilToIntPx(bdcVarM30204layoutTextK40F9xA.getWidth()), uqg.ceilToIntPx(bdcVarM30204layoutTextK40F9xA.getHeight())));
            if (!bvg.m28164equalsimpl0(this.f46557d, bvg.f14961b.m28173getVisiblegIe3tQ8()) && (r78.m32087getWidthimpl(r9) < bdcVarM30204layoutTextK40F9xA.getWidth() || r78.m32086getHeightimpl(r9) < bdcVarM30204layoutTextK40F9xA.getHeight())) {
                z2 = true;
            }
            this.f46564k = z2;
            this.f46563j = bdcVarM30204layoutTextK40F9xA;
            return true;
        }
        if (!ku2.m30756equalsimpl0(j, this.f46569p)) {
            bdc bdcVar = this.f46563j;
            md8.checkNotNull(bdcVar);
            this.f46565l = nu2.m31224constrain4WqzIAM(j, s78.IntSize(uqg.ceilToIntPx(Math.min(bdcVar.getMaxIntrinsicWidth(), bdcVar.getWidth())), uqg.ceilToIntPx(bdcVar.getHeight())));
            if (bvg.m28164equalsimpl0(this.f46557d, bvg.f14961b.m28173getVisiblegIe3tQ8()) || (r78.m32087getWidthimpl(r3) >= bdcVar.getWidth() && r78.m32086getHeightimpl(r3) >= bdcVar.getHeight())) {
                z = false;
            }
            this.f46564k = z;
            this.f46569p = j;
        }
        return false;
    }

    public final int maxIntrinsicWidth(@yfb ov8 ov8Var) {
        return uqg.ceilToIntPx(setLayoutDirection(ov8Var).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(@yfb ov8 ov8Var) {
        return uqg.ceilToIntPx(setLayoutDirection(ov8Var).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation_release(@gib c64 c64Var) {
        c64 c64Var2 = this.f46562i;
        long jM30933constructorimpl = c64Var != null ? m28.m30933constructorimpl(c64Var) : m28.f59731b.m30941getUnspecifiedL26CHvs();
        if (c64Var2 == null) {
            this.f46562i = c64Var;
            this.f46561h = jM30933constructorimpl;
        } else if (c64Var == null || !m28.m30935equalsimpl0(this.f46561h, jM30933constructorimpl)) {
            this.f46562i = c64Var;
            this.f46561h = jM30933constructorimpl;
            markDirty();
        }
    }

    public final void setDidOverflow$foundation_release(boolean z) {
        this.f46564k = z;
    }

    /* JADX INFO: renamed from: setLayoutSize-ozmzZPI$foundation_release, reason: not valid java name */
    public final void m30208setLayoutSizeozmzZPI$foundation_release(long j) {
        this.f46565l = j;
    }

    public final void setParagraph$foundation_release(@gib bdc bdcVar) {
        this.f46563j = bdcVar;
    }

    @gib
    public final hug slowCreateTextLayoutResultOrNull(@yfb yvg yvgVar) {
        c64 c64Var;
        ov8 ov8Var = this.f46568o;
        if (ov8Var == null || (c64Var = this.f46562i) == null) {
            return null;
        }
        C9041lz c9041lz = new C9041lz(this.f46554a, null, null, 6, null);
        if (this.f46563j == null || this.f46567n == null) {
            return null;
        }
        long jM30754copyZbe2FdA$default = ku2.m30754copyZbe2FdA$default(this.f46569p, 0, 0, 0, 0, 10, null);
        return new hug(new gug(c9041lz, yvgVar, l82.emptyList(), this.f46559f, this.f46558e, this.f46557d, c64Var, ov8Var, this.f46556c, jM30754copyZbe2FdA$default, (jt3) null), new u2b(new v2b(c9041lz, yvgVar, (List<C9041lz.c<ewc>>) l82.emptyList(), c64Var, this.f46556c), jM30754copyZbe2FdA$default, this.f46559f, bvg.m28164equalsimpl0(this.f46557d, bvg.f14961b.m28172getEllipsisgIe3tQ8()), null), this.f46565l, null);
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParagraphLayoutCache(paragraph=");
        sb.append(this.f46563j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) m28.m30939toStringimpl(this.f46561h));
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m30209updateL6sJoHM(@yfb String str, @yfb yvg yvgVar, @yfb do6.InterfaceC4891b interfaceC4891b, int i, boolean z, int i2, int i3) {
        this.f46554a = str;
        this.f46555b = yvgVar;
        this.f46556c = interfaceC4891b;
        this.f46557d = i;
        this.f46558e = z;
        this.f46559f = i2;
        this.f46560g = i3;
        markDirty();
    }

    private idc(String str, yvg yvgVar, do6.InterfaceC4891b interfaceC4891b, int i, boolean z, int i2, int i3) {
        this.f46554a = str;
        this.f46555b = yvgVar;
        this.f46556c = interfaceC4891b;
        this.f46557d = i;
        this.f46558e = z;
        this.f46559f = i2;
        this.f46560g = i3;
        this.f46561h = m28.f59731b.m30941getUnspecifiedL26CHvs();
        this.f46565l = s78.IntSize(0, 0);
        this.f46569p = ku2.f55323b.m30773fixedJhjzzOo(0, 0);
        this.f46570q = -1;
        this.f46571r = -1;
    }

    public /* synthetic */ idc(String str, yvg yvgVar, do6.InterfaceC4891b interfaceC4891b, int i, boolean z, int i2, int i3, int i4, jt3 jt3Var) {
        this(str, yvgVar, interfaceC4891b, (i4 & 8) != 0 ? bvg.f14961b.m28171getClipgIe3tQ8() : i, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? Integer.MAX_VALUE : i2, (i4 & 64) != 0 ? 1 : i3, null);
    }
}
