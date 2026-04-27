package p000;

import java.util.List;
import p000.C9041lz;
import p000.do6;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class uug {

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C13723a f89180f = new C13723a(null);

    /* JADX INFO: renamed from: g */
    public static final int f89181g = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final do6.InterfaceC4891b f89182a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final c64 f89183b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final ov8 f89184c;

    /* JADX INFO: renamed from: d */
    public final int f89185d;

    /* JADX INFO: renamed from: e */
    @gib
    public final dug f89186e;

    /* JADX INFO: renamed from: uug$a */
    public static final class C13723a {
        public /* synthetic */ C13723a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final hug layout(gug gugVar) {
            v2b v2bVar = new v2b(gugVar.getText(), zvg.resolveDefaults(gugVar.getStyle(), gugVar.getLayoutDirection()), gugVar.getPlaceholders(), gugVar.getDensity(), gugVar.getFontFamilyResolver());
            int iM30765getMinWidthimpl = ku2.m30765getMinWidthimpl(gugVar.m29857getConstraintsmsEJaDk());
            int iM30763getMaxWidthimpl = ((gugVar.getSoftWrap() || bvg.m28164equalsimpl0(gugVar.m29858getOverflowgIe3tQ8(), bvg.f14961b.m28172getEllipsisgIe3tQ8())) && ku2.m30759getHasBoundedWidthimpl(gugVar.m29857getConstraintsmsEJaDk())) ? ku2.m30763getMaxWidthimpl(gugVar.m29857getConstraintsmsEJaDk()) : Integer.MAX_VALUE;
            int maxLines = (gugVar.getSoftWrap() || !bvg.m28164equalsimpl0(gugVar.m29858getOverflowgIe3tQ8(), bvg.f14961b.m28172getEllipsisgIe3tQ8())) ? gugVar.getMaxLines() : 1;
            if (iM30765getMinWidthimpl != iM30763getMaxWidthimpl) {
                iM30763getMaxWidthimpl = kpd.coerceIn(hdc.ceilToInt(v2bVar.getMaxIntrinsicWidth()), iM30765getMinWidthimpl, iM30763getMaxWidthimpl);
            }
            return new hug(gugVar, new u2b(v2bVar, ku2.f55323b.m30772fitPrioritizingWidthZbe2FdA(0, iM30763getMaxWidthimpl, 0, ku2.m30762getMaxHeightimpl(gugVar.m29857getConstraintsmsEJaDk())), maxLines, bvg.m28164equalsimpl0(gugVar.m29858getOverflowgIe3tQ8(), bvg.f14961b.m28172getEllipsisgIe3tQ8()), null), nu2.m31224constrain4WqzIAM(gugVar.m29857getConstraintsmsEJaDk(), s78.IntSize((int) Math.ceil(r13.getWidth()), (int) Math.ceil(r13.getHeight()))), null);
        }

        private C13723a() {
        }
    }

    public uug(@yfb do6.InterfaceC4891b interfaceC4891b, @yfb c64 c64Var, @yfb ov8 ov8Var, int i) {
        this.f89182a = interfaceC4891b;
        this.f89183b = c64Var;
        this.f89184c = ov8Var;
        this.f89185d = i;
        this.f89186e = i > 0 ? new dug(i) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ hug m32662measurexDpz5zY$default(uug uugVar, C9041lz c9041lz, yvg yvgVar, int i, boolean z, int i2, List list, long j, ov8 ov8Var, c64 c64Var, do6.InterfaceC4891b interfaceC4891b, boolean z2, int i3, Object obj) {
        return uugVar.m32664measurexDpz5zY(c9041lz, (i3 & 2) != 0 ? yvg.f103160d.getDefault() : yvgVar, (i3 & 4) != 0 ? bvg.f14961b.m28171getClipgIe3tQ8() : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? l82.emptyList() : list, (i3 & 64) != 0 ? nu2.Constraints$default(0, 0, 0, 0, 15, null) : j, (i3 & 128) != 0 ? uugVar.f89184c : ov8Var, (i3 & 256) != 0 ? uugVar.f89183b : c64Var, (i3 & 512) != 0 ? uugVar.f89182a : interfaceC4891b, (i3 & 1024) != 0 ? false : z2);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: measure-wNUYSr0, reason: not valid java name */
    public final hug m32663measurewNUYSr0(@yfb String str, @yfb yvg yvgVar, int i, boolean z, int i2, long j, @yfb ov8 ov8Var, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b, boolean z2) {
        return m32662measurexDpz5zY$default(this, new C9041lz(str, null, null, 6, null), yvgVar, i, z, i2, null, j, ov8Var, c64Var, interfaceC4891b, z2, 32, null);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: measure-xDpz5zY, reason: not valid java name */
    public final hug m32664measurexDpz5zY(@yfb C9041lz c9041lz, @yfb yvg yvgVar, int i, boolean z, int i2, @yfb List<C9041lz.c<ewc>> list, long j, @yfb ov8 ov8Var, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b, boolean z2) {
        dug dugVar;
        gug gugVar = new gug(c9041lz, yvgVar, list, i2, z, i, c64Var, ov8Var, interfaceC4891b, j, (jt3) null);
        hug hugVar = (z2 || (dugVar = this.f89186e) == null) ? null : dugVar.get(gugVar);
        if (hugVar != null) {
            return hugVar.m30128copyO0kMr_c(gugVar, nu2.m31224constrain4WqzIAM(j, s78.IntSize(hdc.ceilToInt(hugVar.getMultiParagraph().getWidth()), hdc.ceilToInt(hugVar.getMultiParagraph().getHeight()))));
        }
        hug hugVarLayout = f89180f.layout(gugVar);
        dug dugVar2 = this.f89186e;
        if (dugVar2 == null) {
            return hugVarLayout;
        }
        dugVar2.put(gugVar, hugVarLayout);
        return hugVarLayout;
    }

    public /* synthetic */ uug(do6.InterfaceC4891b interfaceC4891b, c64 c64Var, ov8 ov8Var, int i, int i2, jt3 jt3Var) {
        this(interfaceC4891b, c64Var, ov8Var, (i2 & 8) != 0 ? wug.f95544a : i);
    }
}
