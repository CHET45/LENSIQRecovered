package p000;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class f41 implements e41 {
    @Override // p000.e41
    public void clearMemory() {
    }

    @Override // p000.e41
    @efb
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.e41
    @efb
    public Bitmap getDirty(int i, int i2, Bitmap.Config config) {
        return get(i, i2, config);
    }

    @Override // p000.e41
    public long getMaxSize() {
        return 0L;
    }

    @Override // p000.e41
    public void put(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p000.e41
    public void setSizeMultiplier(float f) {
    }

    @Override // p000.e41
    public void trimMemory(int i) {
    }
}
