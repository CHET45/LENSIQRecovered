package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class xz2 {
    @s21
    public static ColorStateList convertColorToColorStateList(int i) {
        return ColorStateList.valueOf(i);
    }

    @s21
    public static ColorDrawable convertColorToDrawable(int i) {
        return new ColorDrawable(i);
    }
}
