package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ts7 {
    @yfb
    /* JADX INFO: renamed from: ImageBitmap-x__-hDU, reason: not valid java name */
    public static final rs7 m32436ImageBitmapx__hDU(int i, int i2, int i3, boolean z, @yfb ia2 ia2Var) {
        return C5460et.m28855ActualImageBitmapx__hDU(i, i2, i3, z, ia2Var);
    }

    /* JADX INFO: renamed from: ImageBitmap-x__-hDU$default, reason: not valid java name */
    public static /* synthetic */ rs7 m32437ImageBitmapx__hDU$default(int i, int i2, int i3, boolean z, ia2 ia2Var, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = ss7.f82741b.m32327getArgb8888_sVssgQ();
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            ia2Var = ra2.f77522a.getSrgb();
        }
        return m32436ImageBitmapx__hDU(i, i2, i3, z, ia2Var);
    }

    @yfb
    public static final awc toPixelMap(@yfb rs7 rs7Var, int i, int i2, int i3, int i4, @yfb int[] iArr, int i5, int i6) {
        rs7Var.readPixels(iArr, i, i2, i3, i4, i5, i6);
        return new awc(iArr, i3, i4, i5, i6);
    }

    public static /* synthetic */ awc toPixelMap$default(rs7 rs7Var, int i, int i2, int i3, int i4, int[] iArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = 0;
        }
        if ((i7 & 2) != 0) {
            i2 = 0;
        }
        if ((i7 & 4) != 0) {
            i3 = rs7Var.getWidth();
        }
        if ((i7 & 8) != 0) {
            i4 = rs7Var.getHeight();
        }
        if ((i7 & 16) != 0) {
            iArr = new int[i3 * i4];
        }
        if ((i7 & 32) != 0) {
            i5 = 0;
        }
        if ((i7 & 64) != 0) {
            i6 = i3;
        }
        return toPixelMap(rs7Var, i, i2, i3, i4, iArr, i5, i6);
    }
}
