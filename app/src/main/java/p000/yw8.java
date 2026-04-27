package p000;

/* JADX INFO: loaded from: classes.dex */
public final class yw8 {
    /* JADX INFO: renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m33453finalConstraintstfFHcEY(long j, boolean z, int i, float f) {
        return ku2.f55323b.m30772fitPrioritizingWidthZbe2FdA(0, m33455finalMaxWidthtfFHcEY(j, z, i, f), 0, ku2.m30762getMaxHeightimpl(j));
    }

    /* JADX INFO: renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m33454finalMaxLinesxdlQI24(boolean z, int i, int i2) {
        if (z || !bvg.m28164equalsimpl0(i, bvg.f14961b.m28172getEllipsisgIe3tQ8())) {
            return kpd.coerceAtLeast(i2, 1);
        }
        return 1;
    }

    /* JADX INFO: renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m33455finalMaxWidthtfFHcEY(long j, boolean z, int i, float f) {
        int iM30763getMaxWidthimpl = ((z || bvg.m28164equalsimpl0(i, bvg.f14961b.m28172getEllipsisgIe3tQ8())) && ku2.m30759getHasBoundedWidthimpl(j)) ? ku2.m30763getMaxWidthimpl(j) : Integer.MAX_VALUE;
        return ku2.m30765getMinWidthimpl(j) == iM30763getMaxWidthimpl ? iM30763getMaxWidthimpl : kpd.coerceIn(uqg.ceilToIntPx(f), ku2.m30765getMinWidthimpl(j), iM30763getMaxWidthimpl);
    }
}
