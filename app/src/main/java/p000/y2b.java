package p000;

import java.util.List;
import p000.C9041lz;
import p000.do6;
import p000.vva;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,358:1\n1#2:359\n*E\n"})
@e0g(parameters = 0)
public final class y2b {

    /* JADX INFO: renamed from: q */
    public static final int f100169q = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public C9041lz f100170a;

    /* JADX INFO: renamed from: b */
    @yfb
    public yvg f100171b;

    /* JADX INFO: renamed from: c */
    @yfb
    public do6.InterfaceC4891b f100172c;

    /* JADX INFO: renamed from: d */
    public int f100173d;

    /* JADX INFO: renamed from: e */
    public boolean f100174e;

    /* JADX INFO: renamed from: f */
    public int f100175f;

    /* JADX INFO: renamed from: g */
    public int f100176g;

    /* JADX INFO: renamed from: h */
    @gib
    public List<C9041lz.c<ewc>> f100177h;

    /* JADX INFO: renamed from: i */
    @gib
    public vva f100178i;

    /* JADX INFO: renamed from: j */
    public long f100179j;

    /* JADX INFO: renamed from: k */
    @gib
    public c64 f100180k;

    /* JADX INFO: renamed from: l */
    @gib
    public v2b f100181l;

    /* JADX INFO: renamed from: m */
    @gib
    public ov8 f100182m;

    /* JADX INFO: renamed from: n */
    @gib
    public hug f100183n;

    /* JADX INFO: renamed from: o */
    public int f100184o;

    /* JADX INFO: renamed from: p */
    public int f100185p;

    public /* synthetic */ y2b(C9041lz c9041lz, yvg yvgVar, do6.InterfaceC4891b interfaceC4891b, int i, boolean z, int i2, int i3, List list, jt3 jt3Var) {
        this(c9041lz, yvgVar, interfaceC4891b, i, z, i2, i3, list);
    }

    /* JADX INFO: renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final u2b m33353layoutTextK40F9xA(long j, ov8 ov8Var) {
        v2b layoutDirection = setLayoutDirection(ov8Var);
        return new u2b(layoutDirection, yw8.m33453finalConstraintstfFHcEY(j, this.f100174e, this.f100173d, layoutDirection.getMaxIntrinsicWidth()), yw8.m33454finalMaxLinesxdlQI24(this.f100174e, this.f100173d, this.f100175f), bvg.m28164equalsimpl0(this.f100173d, bvg.f14961b.m28172getEllipsisgIe3tQ8()), null);
    }

    private final void markDirty() {
        this.f100181l = null;
        this.f100183n = null;
        this.f100185p = -1;
        this.f100184o = -1;
    }

    /* JADX INFO: renamed from: maxWidth-BRTryo0, reason: not valid java name */
    private final int m33354maxWidthBRTryo0(long j) {
        boolean z = this.f100174e;
        int i = this.f100173d;
        v2b v2bVar = this.f100181l;
        md8.checkNotNull(v2bVar);
        return yw8.m33455finalMaxWidthtfFHcEY(j, z, i, v2bVar.getMaxIntrinsicWidth());
    }

    /* JADX INFO: renamed from: newLayoutWillBeDifferent-VKLhPVY, reason: not valid java name */
    private final boolean m33355newLayoutWillBeDifferentVKLhPVY(hug hugVar, long j, ov8 ov8Var) {
        if (hugVar == null || hugVar.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || ov8Var != hugVar.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (ku2.m30756equalsimpl0(j, hugVar.getLayoutInput().m29857getConstraintsmsEJaDk())) {
            return false;
        }
        return ku2.m30763getMaxWidthimpl(j) != ku2.m30763getMaxWidthimpl(hugVar.getLayoutInput().m29857getConstraintsmsEJaDk()) || ((float) ku2.m30762getMaxHeightimpl(j)) < hugVar.getMultiParagraph().getHeight() || hugVar.getMultiParagraph().getDidExceedMaxLines();
    }

    private final v2b setLayoutDirection(ov8 ov8Var) {
        v2b v2bVar = this.f100181l;
        if (v2bVar == null || ov8Var != this.f100182m || v2bVar.getHasStaleResolvedFonts()) {
            this.f100182m = ov8Var;
            C9041lz c9041lz = this.f100170a;
            yvg yvgVarResolveDefaults = zvg.resolveDefaults(this.f100171b, ov8Var);
            c64 c64Var = this.f100180k;
            md8.checkNotNull(c64Var);
            do6.InterfaceC4891b interfaceC4891b = this.f100172c;
            List<C9041lz.c<ewc>> listEmptyList = this.f100177h;
            if (listEmptyList == null) {
                listEmptyList = l82.emptyList();
            }
            v2bVar = new v2b(c9041lz, yvgVarResolveDefaults, listEmptyList, c64Var, interfaceC4891b);
        }
        this.f100181l = v2bVar;
        return v2bVar;
    }

    /* JADX INFO: renamed from: textLayoutResult-VKLhPVY, reason: not valid java name */
    private final hug m33356textLayoutResultVKLhPVY(ov8 ov8Var, long j, u2b u2bVar) {
        float fMin = Math.min(u2bVar.getIntrinsics().getMaxIntrinsicWidth(), u2bVar.getWidth());
        C9041lz c9041lz = this.f100170a;
        yvg yvgVar = this.f100171b;
        List<C9041lz.c<ewc>> listEmptyList = this.f100177h;
        if (listEmptyList == null) {
            listEmptyList = l82.emptyList();
        }
        List<C9041lz.c<ewc>> list = listEmptyList;
        int i = this.f100175f;
        boolean z = this.f100174e;
        int i2 = this.f100173d;
        c64 c64Var = this.f100180k;
        md8.checkNotNull(c64Var);
        return new hug(new gug(c9041lz, yvgVar, list, i, z, i2, c64Var, ov8Var, this.f100172c, j, (jt3) null), u2bVar, nu2.m31224constrain4WqzIAM(j, s78.IntSize(uqg.ceilToIntPx(fMin), uqg.ceilToIntPx(u2bVar.getHeight()))), null);
    }

    @gib
    public final c64 getDensity$foundation_release() {
        return this.f100180k;
    }

    @gib
    public final hug getLayoutOrNull() {
        return this.f100183n;
    }

    @yfb
    public final hug getTextLayoutResult() {
        hug hugVar = this.f100183n;
        if (hugVar != null) {
            return hugVar;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int intrinsicHeight(int i, @yfb ov8 ov8Var) {
        int i2 = this.f100184o;
        int i3 = this.f100185p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int iCeilToIntPx = uqg.ceilToIntPx(m33353layoutTextK40F9xA(nu2.Constraints(0, i, 0, Integer.MAX_VALUE), ov8Var).getHeight());
        this.f100184o = i;
        this.f100185p = iCeilToIntPx;
        return iCeilToIntPx;
    }

    /* JADX INFO: renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m33357layoutWithConstraintsK40F9xA(long j, @yfb ov8 ov8Var) {
        if (this.f100176g > 1) {
            vva.C14275a c14275a = vva.f92375h;
            vva vvaVar = this.f100178i;
            yvg yvgVar = this.f100171b;
            c64 c64Var = this.f100180k;
            md8.checkNotNull(c64Var);
            vva vvaVarFrom = c14275a.from(vvaVar, ov8Var, yvgVar, c64Var, this.f100172c);
            this.f100178i = vvaVarFrom;
            j = vvaVarFrom.m32816coerceMinLinesOh53vG4$foundation_release(j, this.f100176g);
        }
        if (m33355newLayoutWillBeDifferentVKLhPVY(this.f100183n, j, ov8Var)) {
            this.f100183n = m33356textLayoutResultVKLhPVY(ov8Var, j, m33353layoutTextK40F9xA(j, ov8Var));
            return true;
        }
        hug hugVar = this.f100183n;
        md8.checkNotNull(hugVar);
        if (ku2.m30756equalsimpl0(j, hugVar.getLayoutInput().m29857getConstraintsmsEJaDk())) {
            return false;
        }
        hug hugVar2 = this.f100183n;
        md8.checkNotNull(hugVar2);
        this.f100183n = m33356textLayoutResultVKLhPVY(ov8Var, j, hugVar2.getMultiParagraph());
        return true;
    }

    public final int maxIntrinsicWidth(@yfb ov8 ov8Var) {
        return uqg.ceilToIntPx(setLayoutDirection(ov8Var).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(@yfb ov8 ov8Var) {
        return uqg.ceilToIntPx(setLayoutDirection(ov8Var).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation_release(@gib c64 c64Var) {
        c64 c64Var2 = this.f100180k;
        long jM30933constructorimpl = c64Var != null ? m28.m30933constructorimpl(c64Var) : m28.f59731b.m30941getUnspecifiedL26CHvs();
        if (c64Var2 == null) {
            this.f100180k = c64Var;
            this.f100179j = jM30933constructorimpl;
        } else if (c64Var == null || !m28.m30935equalsimpl0(this.f100179j, jM30933constructorimpl)) {
            this.f100180k = c64Var;
            this.f100179j = jM30933constructorimpl;
            markDirty();
        }
    }

    /* JADX INFO: renamed from: update-ZNqEYIc, reason: not valid java name */
    public final void m33358updateZNqEYIc(@yfb C9041lz c9041lz, @yfb yvg yvgVar, @yfb do6.InterfaceC4891b interfaceC4891b, int i, boolean z, int i2, int i3, @gib List<C9041lz.c<ewc>> list) {
        this.f100170a = c9041lz;
        this.f100171b = yvgVar;
        this.f100172c = interfaceC4891b;
        this.f100173d = i;
        this.f100174e = z;
        this.f100175f = i2;
        this.f100176g = i3;
        this.f100177h = list;
        markDirty();
    }

    private y2b(C9041lz c9041lz, yvg yvgVar, do6.InterfaceC4891b interfaceC4891b, int i, boolean z, int i2, int i3, List<C9041lz.c<ewc>> list) {
        this.f100170a = c9041lz;
        this.f100171b = yvgVar;
        this.f100172c = interfaceC4891b;
        this.f100173d = i;
        this.f100174e = z;
        this.f100175f = i2;
        this.f100176g = i3;
        this.f100177h = list;
        this.f100179j = m28.f59731b.m30941getUnspecifiedL26CHvs();
        this.f100184o = -1;
        this.f100185p = -1;
    }

    public /* synthetic */ y2b(C9041lz c9041lz, yvg yvgVar, do6.InterfaceC4891b interfaceC4891b, int i, boolean z, int i2, int i3, List list, int i4, jt3 jt3Var) {
        this(c9041lz, yvgVar, interfaceC4891b, (i4 & 8) != 0 ? bvg.f14961b.m28171getClipgIe3tQ8() : i, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? Integer.MAX_VALUE : i2, (i4 & 64) != 0 ? 1 : i3, (i4 & 128) != 0 ? null : list, null);
    }
}
