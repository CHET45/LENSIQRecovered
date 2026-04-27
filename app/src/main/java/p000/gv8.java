package p000;

import android.graphics.Bitmap;
import android.media.Image;

/* JADX INFO: loaded from: classes.dex */
public final class gv8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap toBitmap(Image image) {
        Image.Plane[] planes = image.getPlanes();
        md8.checkNotNull(planes);
        Image.Plane plane = planes[0];
        int width = image.getWidth() * image.getHeight();
        int[] iArr = new int[width];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i = 0; i < width; i++) {
            int i2 = iArr[i];
            iArr[i] = j92.m30490toArgb8_81llA(j92.Color(i2 & 255, (i2 >> 8) & 255, (i2 >> 16) & 255, (i2 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }
}
