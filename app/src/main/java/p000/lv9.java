package p000;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes5.dex */
public interface lv9 {
    @efb
    RectF getMaskRectF();

    @y46(from = 0.0d, m25645to = 1.0d)
    float getMaskXPercentage();

    void setMaskXPercentage(@y46(from = 0.0d, m25645to = 1.0d) float f);

    void setOnMaskChangedListener(@hib t3c t3cVar);
}
