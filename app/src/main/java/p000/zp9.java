package p000;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public interface zp9 {
    @hib
    Bitmap get(int i, int i2, Bitmap.Config config);

    int getSize(Bitmap bitmap);

    String logBitmap(int i, int i2, Bitmap.Config config);

    String logBitmap(Bitmap bitmap);

    void put(Bitmap bitmap);

    @hib
    Bitmap removeLast();
}
