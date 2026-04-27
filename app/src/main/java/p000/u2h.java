package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* JADX INFO: loaded from: classes3.dex */
public interface u2h {
    @hib
    ColorStateList getSupportBackgroundTintList();

    @hib
    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(@hib ColorStateList colorStateList);

    void setSupportBackgroundTintMode(@hib PorterDuff.Mode mode);
}
