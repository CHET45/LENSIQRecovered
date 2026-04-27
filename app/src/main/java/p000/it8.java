package p000;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes3.dex */
public class it8 extends Paint {
    public it8() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(awa.clamp(i, 0, 255));
        } else {
            setColor((awa.clamp(i, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@efb LocaleList localeList) {
    }

    public it8(int i) {
        super(i);
    }

    public it8(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public it8(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
