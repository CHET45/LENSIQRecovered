package p000;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public interface e41 {
    void clearMemory();

    @efb
    Bitmap get(int i, int i2, Bitmap.Config config);

    @efb
    Bitmap getDirty(int i, int i2, Bitmap.Config config);

    long getMaxSize();

    void put(Bitmap bitmap);

    void setSizeMultiplier(float f);

    void trimMemory(int i);
}
