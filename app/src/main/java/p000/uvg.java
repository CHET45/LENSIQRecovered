package p000;

/* JADX INFO: loaded from: classes.dex */
public final class uvg {
    public static final float getHorizontalPosition(@yfb hug hugVar, int i, boolean z, boolean z2) {
        return hugVar.getHorizontalPosition(i, hugVar.getBidiRunDirection(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == hugVar.getParagraphDirection(i));
    }

    public static final long getSelectionHandleCoordinates(@yfb hug hugVar, int i, boolean z, boolean z2) {
        int lineForOffset = hugVar.getLineForOffset(i);
        return lineForOffset >= hugVar.getLineCount() ? izb.f49009b.m30444getUnspecifiedF1C5BW0() : mzb.Offset(kpd.coerceIn(getHorizontalPosition(hugVar, i, z, z2), 0.0f, r78.m32087getWidthimpl(hugVar.m30130getSizeYbymL2g())), kpd.coerceIn(hugVar.getLineBottom(lineForOffset), 0.0f, r78.m32086getHeightimpl(hugVar.m30130getSizeYbymL2g())));
    }
}
