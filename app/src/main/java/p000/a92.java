package p000;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes7.dex */
public class a92 extends wq4 {
    public a92(int i, int i2, int i3) {
        super(new ColorDrawable(opaqueColor(i)), i2, i3);
    }

    @g92
    public static int opaqueColor(@g92 int i) {
        return Color.alpha(i) == 0 ? i : Color.argb(255, Color.red(i), Color.green(i), Color.blue(i));
    }
}
