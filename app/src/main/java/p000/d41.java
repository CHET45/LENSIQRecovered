package p000;

/* JADX INFO: loaded from: classes.dex */
public final class d41 {
    @yfb
    /* JADX INFO: renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final c41 m28568BitmapPainterQZhYCtY(@yfb rs7 rs7Var, long j, long j2, int i) {
        c41 c41Var = new c41(rs7Var, j, j2, null);
        c41Var.m28197setFilterQualityvDHp3xo$ui_graphics_release(i);
        return c41Var;
    }

    /* JADX INFO: renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ c41 m28569BitmapPainterQZhYCtY$default(rs7 rs7Var, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = a78.f545b.m27211getZeronOccac();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = s78.IntSize(rs7Var.getWidth(), rs7Var.getHeight());
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            i = xu5.f99348b.m33296getLowfv9h1I();
        }
        return m28568BitmapPainterQZhYCtY(rs7Var, j3, j4, i);
    }
}
